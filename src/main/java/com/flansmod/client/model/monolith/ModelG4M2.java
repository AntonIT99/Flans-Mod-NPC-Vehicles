//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G4M2
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG4M2 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelG4M2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[151];
		noseModel = new ModelRendererTurbo[59];
		tailModel = new ModelRendererTurbo[51];
		leftWingModel = new ModelRendererTurbo[25];
		rightWingModel = new ModelRendererTurbo[25];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[13];
		rightWingWheelModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 224
		bodyModel[1] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 225
		bodyModel[2] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 227
		bodyModel[3] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 229
		bodyModel[4] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 230
		bodyModel[5] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 231
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 232
		bodyModel[7] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 233
		bodyModel[8] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 234
		bodyModel[9] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 235
		bodyModel[10] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 237
		bodyModel[11] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 238
		bodyModel[12] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 239
		bodyModel[13] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 240
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 241
		bodyModel[15] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 242
		bodyModel[16] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 243
		bodyModel[17] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 244
		bodyModel[18] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 245
		bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 246
		bodyModel[20] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 247
		bodyModel[21] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 248
		bodyModel[22] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 249
		bodyModel[23] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 250
		bodyModel[24] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 251
		bodyModel[25] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 252
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 253
		bodyModel[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 255
		bodyModel[28] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 256
		bodyModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 258
		bodyModel[30] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 259
		bodyModel[31] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 260
		bodyModel[32] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 261
		bodyModel[33] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 262
		bodyModel[34] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 263
		bodyModel[35] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 264
		bodyModel[36] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 265
		bodyModel[37] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 266
		bodyModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 267
		bodyModel[39] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 268
		bodyModel[40] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 273
		bodyModel[41] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 274
		bodyModel[42] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 283
		bodyModel[43] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 284
		bodyModel[44] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 285
		bodyModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 286
		bodyModel[46] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 287
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 288
		bodyModel[48] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 289
		bodyModel[49] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 290
		bodyModel[50] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 291
		bodyModel[51] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 292
		bodyModel[52] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 293
		bodyModel[53] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 294
		bodyModel[54] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 295
		bodyModel[55] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 296
		bodyModel[56] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 297
		bodyModel[57] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 298
		bodyModel[58] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 299
		bodyModel[59] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 300
		bodyModel[60] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 301
		bodyModel[61] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 302
		bodyModel[62] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 303
		bodyModel[63] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 304
		bodyModel[64] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 603
		bodyModel[65] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 604
		bodyModel[66] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 606
		bodyModel[67] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 911
		bodyModel[68] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 912
		bodyModel[69] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 913
		bodyModel[70] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 311
		bodyModel[71] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 312
		bodyModel[72] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 389
		bodyModel[73] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 390
		bodyModel[74] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 391
		bodyModel[75] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 392
		bodyModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 393
		bodyModel[77] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 394
		bodyModel[78] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 395
		bodyModel[79] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 396
		bodyModel[80] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 397
		bodyModel[81] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 408
		bodyModel[82] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 409
		bodyModel[83] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 410
		bodyModel[84] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 411
		bodyModel[85] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 412
		bodyModel[86] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 413
		bodyModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 462
		bodyModel[88] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 463
		bodyModel[89] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 464
		bodyModel[90] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 465
		bodyModel[91] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 466
		bodyModel[92] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 467
		bodyModel[93] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 468
		bodyModel[94] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 469
		bodyModel[95] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 470
		bodyModel[96] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 471
		bodyModel[97] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 472
		bodyModel[98] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 473
		bodyModel[99] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 474
		bodyModel[100] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 475
		bodyModel[101] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 476
		bodyModel[102] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 477
		bodyModel[103] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 478
		bodyModel[104] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 479
		bodyModel[105] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 480
		bodyModel[106] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 481
		bodyModel[107] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 482
		bodyModel[108] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 483
		bodyModel[109] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 484
		bodyModel[110] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 485
		bodyModel[111] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 486
		bodyModel[112] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 487
		bodyModel[113] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 488
		bodyModel[114] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 489
		bodyModel[115] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 490
		bodyModel[116] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 491
		bodyModel[117] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 492
		bodyModel[118] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 305
		bodyModel[119] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 306
		bodyModel[120] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 307
		bodyModel[121] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 308
		bodyModel[122] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 309
		bodyModel[123] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 310
		bodyModel[124] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 311
		bodyModel[125] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 312
		bodyModel[126] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 332
		bodyModel[127] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 333
		bodyModel[128] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 334
		bodyModel[129] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 335
		bodyModel[130] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 336
		bodyModel[131] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 337
		bodyModel[132] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 338
		bodyModel[133] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 339
		bodyModel[134] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 340
		bodyModel[135] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 341
		bodyModel[136] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 342
		bodyModel[137] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 343
		bodyModel[138] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 344
		bodyModel[139] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 345
		bodyModel[140] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 346
		bodyModel[141] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 347
		bodyModel[142] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 348
		bodyModel[143] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 349
		bodyModel[144] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 350
		bodyModel[145] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 275
		bodyModel[146] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 276
		bodyModel[147] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 353
		bodyModel[148] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 354
		bodyModel[149] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 368
		bodyModel[150] = new ModelRendererTurbo(this, 311, 234, textureX, textureY); // Box 369

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 10, 8, 0F,0F, 0F, 0F, 5F, -0.5F, 1.5F, 1F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 9F, 5F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[0].setRotationPoint(-150F, -61.5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 10, 8, 0F,0F, 1F, 0F, 1F, 2F, 0F, 5F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 10F, 0F, 0F, 9F); // Box 225
		bodyModel[1].setRotationPoint(-150F, -61.5F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 18, 34, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 227
		bodyModel[2].setRotationPoint(-150F, -51.5F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 34, 0F,0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, -0.5F, -9F); // Box 229
		bodyModel[3].setRotationPoint(-150F, -33.5F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 23, 9, 34, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F); // Box 230
		bodyModel[4].setRotationPoint(-140F, -33.5F, -17F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 23, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[5].setRotationPoint(-140F, -51.5F, -18F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, -0.5F, -8.5F, 0F, -4F, -4.5F, 0F, -4F, 4.5F, 0.5F, -0.5F, 8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 232
		bodyModel[6].setRotationPoint(-140F, -61.5F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 8, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[7].setRotationPoint(-144F, -62F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 8, 5, 0F,0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[8].setRotationPoint(-144F, -62F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 235
		bodyModel[9].setRotationPoint(-141F, -60F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, -4F, -4.5F, 0F, -4F, -3F, 0F, -4F, 3F, 0.5F, -4F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 237
		bodyModel[10].setRotationPoint(-133F, -61.5F, -18F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[11].setRotationPoint(-127F, -48.5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 239
		bodyModel[12].setRotationPoint(-117F, -61.5F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 112, 18, 1, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 240
		bodyModel[13].setRotationPoint(-117F, -51.5F, -18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 44, 10, 1, 0F,0F, -4F, -3F, 0F, -4F, -3F, 0.5F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[14].setRotationPoint(-117F, -61.5F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 12, 30, 0F,0F, 0F, -4F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[15].setRotationPoint(-84F, -69.5F, -15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 18, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 2F); // Box 243
		bodyModel[16].setRotationPoint(-84F, -71.5F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[17].setRotationPoint(-117F, -71.5F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 245
		bodyModel[18].setRotationPoint(-133F, -70.5F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 246
		bodyModel[19].setRotationPoint(-137F, -69.5F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -3.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3.5F, 0F); // Box 247
		bodyModel[20].setRotationPoint(-144F, -66.5F, -0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[21].setRotationPoint(-95F, -71.5F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[22].setRotationPoint(-117F, -69.5F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 1F, 0F); // Box 250
		bodyModel[23].setRotationPoint(-130F, -68.5F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -6.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6.5F, 0F); // Box 251
		bodyModel[24].setRotationPoint(-141F, -65.5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,2F, 0.5F, 0F, -2F, 0.5F, 0F, -4F, 1F, -0.5F, 4F, 1F, -0.5F, 3F, -0.5F, 0F, -3F, -0.5F, 0F, -5F, -1F, -0.5F, 5F, -1F, -0.5F); // Box 252
		bodyModel[25].setRotationPoint(-133F, -67.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 253
		bodyModel[26].setRotationPoint(-131F, -67.5F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,2F, 0F, 0F, -2F, 0F, 0F, -6F, 0.5F, 0F, 6F, 0.5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -7F, -0.5F, 0F, 7F, -0.5F, 0F); // Box 255
		bodyModel[27].setRotationPoint(-129F, -67.5F, -9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -6.5F, 0F, 1.5F, 2.3F, 0F, 1F, 2.5F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 2.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 6.5F, 0F); // Box 256
		bodyModel[28].setRotationPoint(-145F, -65.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 258
		bodyModel[29].setRotationPoint(-120F, -69F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 259
		bodyModel[30].setRotationPoint(-107.5F, -69F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 260
		bodyModel[31].setRotationPoint(-95F, -69F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[32].setRotationPoint(-95F, -71.5F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[33].setRotationPoint(-131F, -69.5F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[34].setRotationPoint(-131F, -70F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 196, 9, 34, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F); // Box 264
		bodyModel[35].setRotationPoint(-117F, -33.5F, -17F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 47, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 265
		bodyModel[36].setRotationPoint(20F, -51.5F, -18F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 266
		bodyModel[37].setRotationPoint(67F, -51.5F, -18F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 14, 36, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[38].setRotationPoint(67F, -65.5F, -18F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 268
		bodyModel[39].setRotationPoint(0F, -38.5F, -18F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 118, 14, 1, 0F,0F, 1F, -10F, 0F, -0.5F, -11F, 0F, -0.5F, 11F, 0F, 1F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 273
		bodyModel[40].setRotationPoint(-51F, -65.5F, -18F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 79, 1, 14, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[41].setRotationPoint(-12F, -66.5F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, -4F, -3F, 0F, -4F, -3.9F, 0F, -4F, 3.8F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[42].setRotationPoint(-73F, -61.5F, -18F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 13, 3, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 9F, 2F, 3F, 9F, 2F, 3F, 0F, 0F, 5F); // Box 284
		bodyModel[43].setRotationPoint(-73F, -71.5F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 11, 20, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4.4F, 0F, 0F, 4.4F, 0F, 0F, 5F); // Box 285
		bodyModel[44].setRotationPoint(-73F, -68.5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 286
		bodyModel[45].setRotationPoint(-56F, -66.5F, -9F);

		bodyModel[46].addShapeBox(-1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[46].setRotationPoint(-22.5F, -71F, -7.5F);

		bodyModel[47].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 288
		bodyModel[47].setRotationPoint(-22.5F, -71F, -7.5F);

		bodyModel[48].addShapeBox(10F, 0F, 4F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 289
		bodyModel[48].setRotationPoint(-22.5F, -71F, -7.5F);

		bodyModel[49].addShapeBox(-1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[49].setRotationPoint(-22.5F, -71F, 6.5F);

		bodyModel[50].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 291
		bodyModel[50].setRotationPoint(-22.5F, -71F, 2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[51].setRotationPoint(-158F, -26.5F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[52].setRotationPoint(-159.5F, -17F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[53].setRotationPoint(-161.5F, -23.25F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[54].setRotationPoint(-153.5F, -23.25F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[55].setRotationPoint(-159.5F, -25.5F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[56].setRotationPoint(-161.5F, -25.25F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F); // Box 298
		bodyModel[57].setRotationPoint(-161.5F, -18.25F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F); // Box 299
		bodyModel[58].setRotationPoint(-153.5F, -18.25F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.7F, -0.75F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 300
		bodyModel[59].setRotationPoint(-153.5F, -25.25F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[60].setRotationPoint(-11.5F, -72F, 0.5F);
		bodyModel[60].rotateAngleZ = 0.50614548F;

		bodyModel[61].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[61].setRotationPoint(-11.5F, -72F, 0.5F);
		bodyModel[61].rotateAngleZ = 0.50614548F;

		bodyModel[62].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[62].setRotationPoint(11.5F, -45F, -20F);
		bodyModel[62].rotateAngleY = -1.04719755F;

		bodyModel[63].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[63].setRotationPoint(11.5F, -45F, -20F);
		bodyModel[63].rotateAngleY = -1.04719755F;

		bodyModel[64].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[64].setRotationPoint(-128F, -59F, -5F);

		bodyModel[65].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[65].setRotationPoint(-128F, -59F, -9F);

		bodyModel[66].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[66].setRotationPoint(-130F, -57F, -7F);

		bodyModel[67].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 911
		bodyModel[67].setRotationPoint(-130F, -56F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 912
		bodyModel[68].setRotationPoint(-130.5F, -47.5F, -8F);

		bodyModel[69].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 913
		bodyModel[69].setRotationPoint(-128F, -57F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 60, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[70].setRotationPoint(-140F, -45.5F, -17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 12, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[71].setRotationPoint(-81F, -45F, -17F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 23, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 389
		bodyModel[72].setRotationPoint(-140F, -51.5F, 17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0.5F, -0.5F, 8.5F, 0F, -4F, 4.5F, 0F, -4F, -4.5F, 0F, -0.5F, -8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[73].setRotationPoint(-140F, -61.5F, 17F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0.5F, -4F, 4.5F, 0F, -4F, 3F, 0F, -4F, -3F, 0F, -4F, -4.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[74].setRotationPoint(-133F, -61.5F, 17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 112, 18, 1, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 392
		bodyModel[75].setRotationPoint(-117F, -51.5F, 17F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 44, 10, 1, 0F,0F, -4F, 3F, 0.5F, -4F, 3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[76].setRotationPoint(-117F, -61.5F, 17F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 118, 14, 1, 0F,0F, 1F, 10F, 0F, -0.5F, 11F, 0F, -0.5F, -11F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[77].setRotationPoint(-51F, -65.5F, 17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, -4F, 3F, 0F, -4F, 3.8F, 0F, -4F, -3.9F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[78].setRotationPoint(-73F, -61.5F, 17F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 47, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 396
		bodyModel[79].setRotationPoint(20F, -51.5F, 17F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 397
		bodyModel[80].setRotationPoint(0F, -38.5F, 17F);

		bodyModel[81].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[81].setRotationPoint(11.5F, -45F, 20F);
		bodyModel[81].rotateAngleY = 1.04719755F;

		bodyModel[82].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[82].setRotationPoint(11.5F, -45F, 20F);
		bodyModel[82].rotateAngleY = 1.04719755F;

		bodyModel[83].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[83].setRotationPoint(-192F, -42F, 0F);
		bodyModel[83].rotateAngleY = -3.14159265F;

		bodyModel[84].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[84].setRotationPoint(-192F, -42F, 0F);
		bodyModel[84].rotateAngleY = -3.14159265F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[85].setRotationPoint(-178F, -33.5F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 413
		bodyModel[86].setRotationPoint(-168F, -46.5F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[87].setRotationPoint(-117F, -69.5F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 1F, 0F); // Box 463
		bodyModel[88].setRotationPoint(-130F, -68.5F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 464
		bodyModel[89].setRotationPoint(-131F, -67.5F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 465
		bodyModel[90].setRotationPoint(-120F, -69F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 466
		bodyModel[91].setRotationPoint(-107.5F, -69F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 467
		bodyModel[92].setRotationPoint(-95F, -69F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 468
		bodyModel[93].setRotationPoint(-95F, -71.5F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 469
		bodyModel[94].setRotationPoint(-131F, -69.5F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -6.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6.5F, 0F); // Box 470
		bodyModel[95].setRotationPoint(-141F, -65.5F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,4F, 1F, -0.5F, -4F, 1F, -0.5F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 5F, -1F, -0.5F, -5F, -1F, -0.5F, -3F, -0.5F, 0F, 3F, -0.5F, 0F); // Box 471
		bodyModel[96].setRotationPoint(-133F, -67.5F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,6F, 0.5F, 0F, -6F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 7F, -0.5F, 0F, -7F, -0.5F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 472
		bodyModel[97].setRotationPoint(-129F, -67.5F, 6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -6.5F, 0F, 1F, 2.5F, 0F, 1.5F, 2.3F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 1.5F, -3F, 0F, 2.5F, -3F, 0F, 0F, 6.5F, 0F); // Box 473
		bodyModel[98].setRotationPoint(-145F, -65.5F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 474
		bodyModel[99].setRotationPoint(-107.5F, -71.5F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[100].setRotationPoint(-107.5F, -71.5F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[101].setRotationPoint(-107.5F, -71.5F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 477
		bodyModel[102].setRotationPoint(-120F, -71F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[103].setRotationPoint(-120F, -71F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[104].setRotationPoint(-120F, -71F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[105].setRotationPoint(-127F, -48.5F, 2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 481
		bodyModel[106].setRotationPoint(-117F, -61.5F, 2F);

		bodyModel[107].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[107].setRotationPoint(-128F, -59F, 5F);

		bodyModel[108].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[108].setRotationPoint(-128F, -59F, 9F);

		bodyModel[109].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[109].setRotationPoint(-130F, -57F, 7F);

		bodyModel[110].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 485
		bodyModel[110].setRotationPoint(-130F, -56F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 486
		bodyModel[111].setRotationPoint(-130.5F, -47.5F, 6F);

		bodyModel[112].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 487
		bodyModel[112].setRotationPoint(-128F, -57F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 488
		bodyModel[113].setRotationPoint(-88F, -61.5F, -12F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[114].setRotationPoint(-98F, -48.5F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[115].setRotationPoint(-98F, -48.5F, 2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 491
		bodyModel[116].setRotationPoint(-88F, -61.5F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5.4F); // Box 492
		bodyModel[117].setRotationPoint(-56F, -66.5F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 8, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[118].setRotationPoint(-144F, -62F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[119].setRotationPoint(-141F, -60F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[120].setRotationPoint(-117F, -71F, 5.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 308
		bodyModel[121].setRotationPoint(-131F, -70F, 5.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 309
		bodyModel[122].setRotationPoint(-135F, -69F, 5.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[123].setRotationPoint(-117F, -71F, -6.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 311
		bodyModel[124].setRotationPoint(-131F, -70F, -6.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 312
		bodyModel[125].setRotationPoint(-135F, -69F, -6.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 23, 1, 14, 0F,0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[126].setRotationPoint(-51F, -66.5F, -7F);

		bodyModel[127].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 333
		bodyModel[127].setRotationPoint(-33.5F, -71F, -7.5F);

		bodyModel[128].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 334
		bodyModel[128].setRotationPoint(-33.5F, -71F, 2.5F);

		bodyModel[129].addShapeBox(10F, 0F, 4F, 1, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 335
		bodyModel[129].setRotationPoint(-38.5F, -71F, -7.5F);

		bodyModel[130].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[130].setRotationPoint(-19.5F, -70F, 6.5F);

		bodyModel[131].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[131].setRotationPoint(-19.5F, -74F, 6.5F);

		bodyModel[132].addShapeBox(-1F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[132].setRotationPoint(-19.5F, -75F, -4.5F);

		bodyModel[133].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[133].setRotationPoint(-19.5F, -74F, -7.5F);

		bodyModel[134].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[134].setRotationPoint(-12.5F, -74F, 2.5F);

		bodyModel[135].addShapeBox(-1F, 0F, 0F, 9, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[135].setRotationPoint(-23.5F, -75F, 2.5F);

		bodyModel[136].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[136].setRotationPoint(-26.5F, -74F, 2.5F);

		bodyModel[137].addShapeBox(-1F, 0F, 0F, 9, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[137].setRotationPoint(-23.5F, -75F, -3.5F);

		bodyModel[138].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[138].setRotationPoint(-26.5F, -74F, -3.5F);

		bodyModel[139].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[139].setRotationPoint(-12.5F, -74F, -3.5F);

		bodyModel[140].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[140].setRotationPoint(-19.5F, -70F, -7.5F);

		bodyModel[141].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[141].setRotationPoint(-26.5F, -70F, -3.5F);

		bodyModel[142].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[142].setRotationPoint(-26.5F, -70F, 2.5F);

		bodyModel[143].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[143].setRotationPoint(-12.5F, -70F, 2.5F);

		bodyModel[144].addShapeBox(-1F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[144].setRotationPoint(-12.5F, -70F, -3.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F); // Box 275
		bodyModel[145].setRotationPoint(-20F, -66F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[146].setRotationPoint(-20F, -66F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F); // Box 353
		bodyModel[147].setRotationPoint(-28F, -66F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[148].setRotationPoint(-28F, -66F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 368
		bodyModel[149].setRotationPoint(0F, -55.5F, -16F);
		bodyModel[149].rotateAngleX = -0.68067841F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 369
		bodyModel[150].setRotationPoint(0F, -55.5F, 15F);
		bodyModel[150].rotateAngleX = 0.68067841F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		noseModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 181
		noseModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 190
		noseModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 192
		noseModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 193
		noseModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 195
		noseModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 196
		noseModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 197
		noseModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 204
		noseModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 210
		noseModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 215
		noseModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 216
		noseModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 217
		noseModel[14] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 220
		noseModel[15] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 221
		noseModel[16] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 222
		noseModel[17] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 223
		noseModel[18] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 226
		noseModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 493
		noseModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 494
		noseModel[21] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 498
		noseModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 499
		noseModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 500
		noseModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 321
		noseModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 322
		noseModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 325
		noseModel[27] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 326
		noseModel[28] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 327
		noseModel[29] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 328
		noseModel[30] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 329
		noseModel[31] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 330
		noseModel[32] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 331
		noseModel[33] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 332
		noseModel[34] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 333
		noseModel[35] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 334
		noseModel[36] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 335
		noseModel[37] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 336
		noseModel[38] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 337
		noseModel[39] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 338
		noseModel[40] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 339
		noseModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 340
		noseModel[42] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 341
		noseModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 342
		noseModel[44] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 343
		noseModel[45] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 344
		noseModel[46] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 345
		noseModel[47] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 346
		noseModel[48] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 347
		noseModel[49] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 348
		noseModel[50] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 349
		noseModel[51] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 350
		noseModel[52] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 351
		noseModel[53] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 352
		noseModel[54] = new ModelRendererTurbo(this, 250, 155, textureX, textureY); // Box 353
		noseModel[55] = new ModelRendererTurbo(this, 194, 118, textureX, textureY); // Box 354
		noseModel[56] = new ModelRendererTurbo(this, 194, 118, textureX, textureY); // Box 355
		noseModel[57] = new ModelRendererTurbo(this, 194, 118, textureX, textureY); // Box 356
		noseModel[58] = new ModelRendererTurbo(this, 194, 118, textureX, textureY); // Box 357

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, 0F, -1F); // Box 180
		noseModel[0].setRotationPoint(-180F, -31F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0.5F, -1F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F); // Box 181
		noseModel[1].setRotationPoint(-180F, -54.5F, -6F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		noseModel[2].setRotationPoint(-195F, -44F, -2F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		noseModel[3].setRotationPoint(-195F, -44F, -1.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		noseModel[4].setRotationPoint(-195F, -41F, -1.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		noseModel[5].setRotationPoint(-195F, -44F, 1F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -5F, 1F, -3.5F, 5F, 1F, -3.5F, 5F, 0F, 3F, -5F, 0F, 3F); // Box 195
		noseModel[6].setRotationPoint(-195F, -40F, 0.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 196
		noseModel[7].setRotationPoint(-186.5F, -53F, -4.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		noseModel[8].setRotationPoint(-186.5F, -47F, 9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, -2F, 0.5F, 0.5F, -2F, -0.5F, 0F, 0F, 0.5F); // Box 204
		noseModel[9].setRotationPoint(-186.5F, -51F, -6.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,3F, 4F, 0F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0.5F, 3F, 4F, 0F, 3F, -4F, 0F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0.5F, 3F, -4F, 0F); // Box 210
		noseModel[10].setRotationPoint(-186.5F, -33F, 3.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 15, 8, 14, 0F,0F, -1F, 7.5F, 0F, -2F, 10F, 0F, -2F, 10F, 0F, -1F, 7.5F, 0F, 0.5F, -0.5F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0.5F, -0.5F); // Box 215
		noseModel[11].setRotationPoint(-165F, -35.5F, -7F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 14, 14, 0F,0F, 1F, 9F, 0F, 2F, 10F, 0F, 2F, 10F, 0F, 1F, 9F, 0F, 1.7F, 9F, 0F, 2F, 10F, 0F, 2F, 10F, 0F, 1.7F, 9F); // Box 216
		noseModel[12].setRotationPoint(-155F, -49.5F, -7F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F,0F, 2F, 0.5F, 0F, 3F, 1F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 9F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 217
		noseModel[13].setRotationPoint(-155F, -58.5F, -7F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, -6F, 0F, -2F, -9F, 0F, -2F, 9.5F, 0F, 0F, 6F, 0F, -0.5F, -1F, 0F, 2.5F, -2F, 0F, 3.5F, 1.5F, 0F, 0.5F, 0F); // Box 220
		noseModel[14].setRotationPoint(-180F, -36.5F, 4F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 1F, 0F, 0.8F, -0.5F, 0F, 0F, 0F); // Box 221
		noseModel[15].setRotationPoint(-180F, -48.5F, -11F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0.5F, 0F, 0F, 2F, 0.5F, 0F, 0F, -2F, 0F, -0.5F, -1F, 0F, 0F, 6F, 0F, -1F, 7F, 0F, -1F, -6.5F, 0F, 0F, -6F); // Box 222
		noseModel[16].setRotationPoint(-180F, -54.5F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 6F, 0F, -2F, 9.5F, 0F, -2F, -9F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 3.5F, 1.5F, 0F, 2.5F, -2F, 0F, -0.5F, -1F); // Box 223
		noseModel[17].setRotationPoint(-180F, -36.5F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 3F, 1F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 10F, 0F, 0F, 9F); // Box 226
		noseModel[18].setRotationPoint(-155F, -58.5F, 0F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 1F, -1F, 0F, 3F, 0.5F, 0F, 3F, -0.5F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, -1F, 1F); // Box 493
		noseModel[19].setRotationPoint(-190.5F, -48F, -5.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2.5F, -3F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 2.5F, -3F, 0F, 2F, 3F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 2F, 3F, 0F); // Box 494
		noseModel[20].setRotationPoint(-192.5F, -47F, -1.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F, 1F, -1F, 0F, 0F, 0F); // Box 498
		noseModel[21].setRotationPoint(-186.5F, -40F, -10F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F); // Box 499
		noseModel[22].setRotationPoint(-190.5F, -41F, -9F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2.5F, 0F, -5F, 0F, -1F, 1F, 0.5F, -1F, -1F, 2F, 0F, 5F, 2.5F, 0F, -5F, 0F, 1F, 1F, 0.5F, 1F, -1F, 2F, 0F, 5F); // Box 500
		noseModel[23].setRotationPoint(-192.5F, -42F, -7F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -1F, -0.5F, 1F, 1F, 0F, 0F, 0F); // Box 321
		noseModel[24].setRotationPoint(-186.5F, -40F, 9F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, -1F); // Box 322
		noseModel[25].setRotationPoint(-190.5F, -41F, 8F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2F, 0F, 5F, 0.5F, -1F, -1F, 0F, -1F, 1F, 2.5F, 0F, -5F, 2F, 0F, 5F, 0.5F, 1F, -1F, 0F, 1F, 1F, 2.5F, 0F, -5F); // Box 325
		noseModel[26].setRotationPoint(-192.5F, -42F, 6F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, 5F, 0F, 3F, 5F, 1F, -3.5F, -5F, 1F, -3.5F); // Box 326
		noseModel[27].setRotationPoint(-195F, -40F, -1.5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,3F, 4F, 0F, 0.5F, -2F, 0.5F, 0.5F, -2F, -0.5F, 3F, 4F, 0F, 3F, -4F, 0F, 0.5F, 2F, 0.5F, 0.5F, 2F, -0.5F, 3F, -4F, 0F); // Box 327
		noseModel[28].setRotationPoint(-186.5F, -33F, -4.5F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0.5F, 0F, 0F, -0.5F); // Box 328
		noseModel[29].setRotationPoint(-186.5F, -51F, 5.5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 1F, 1F, 0F, 3F, -0.5F, 0F, 3F, 0.5F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -3F, -0.5F, 0F, -3F, 0.5F, 0F, -1F, -1F); // Box 329
		noseModel[30].setRotationPoint(-190.5F, -48F, 4.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,2.5F, -3F, 0F, 0F, 2F, -3F, 0F, 2F, 3F, 2.5F, -3F, 0F, 2F, 3F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 2F, 3F, 0F); // Box 330
		noseModel[31].setRotationPoint(-192.5F, -47F, 0.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 5.5F, 0F, -1F, 5.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 331
		noseModel[32].setRotationPoint(-186.5F, -53F, 9F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		noseModel[33].setRotationPoint(-186.5F, -47F, -10F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 5.5F, 0F, -1F, 5.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 333
		noseModel[34].setRotationPoint(-186.5F, -53F, -10F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, 1F, 0F, 0F, 0F); // Box 334
		noseModel[35].setRotationPoint(-180F, -48.5F, 10F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -0.5F, -1F, 0F, 0F, -2F, 0F, 2F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, -1F, -6.5F, 0F, -1F, 7F, 0F, 0F, 6F); // Box 335
		noseModel[36].setRotationPoint(-180F, -54.5F, 4F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 4F, 0F, 0.3F, -4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 4F, 0F, 0.3F, -4F, 0F, 0.3F, 0F); // Box 336
		noseModel[37].setRotationPoint(-175F, -42F, -12F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.7F, 0F, 0F, 0.3F, 4F, 0F, 0.3F, -4F, 0F, -0.7F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, 4F, 0F, 0.3F, -4F, 0F, 1.3F, 0F); // Box 337
		noseModel[38].setRotationPoint(-175F, -50.5F, -12F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -5.7F, -1.7F, 0F, -1.7F, 0.3F, 0F, 0F, 0.3F, 0F, -4F, 2.3F, 0F, 5.7F, -1.7F, 0F, 1.7F, 0.3F, 0F, 0F, 0.3F, 0F, 4F, 2.3F); // Box 338
		noseModel[39].setRotationPoint(-175F, -60.5F, -8.7F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -5F, 0.3F, 0F, 5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 5F, 0.3F); // Box 339
		noseModel[40].setRotationPoint(-175F, -61.4F, -0.5F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		noseModel[41].setRotationPoint(-168.5F, -49.7F, -13.5F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		noseModel[42].setRotationPoint(-161F, -50F, -14.9F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 342
		noseModel[43].setRotationPoint(-168.5F, -55.7F, -7.5F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, 0F, 0.5F, -6F, 0F, 0.5F, -6F); // Box 343
		noseModel[44].setRotationPoint(-161F, -56.7F, -8.5F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		noseModel[45].setRotationPoint(-168.5F, -57.8F, -6.5F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		noseModel[46].setRotationPoint(-161F, -59.5F, -7F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, -4F, 0F, 0.3F, 4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -4F, 0F, 0.3F, 4F, 0F, 0.3F, 0F); // Box 346
		noseModel[47].setRotationPoint(-175F, -42F, 11F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.7F, 0F, 0F, 0.3F, -4F, 0F, 0.3F, 4F, 0F, -0.7F, 0F, 0F, 1.3F, 0F, 0F, 0.3F, -4F, 0F, 0.3F, 4F, 0F, 1.3F, 0F); // Box 347
		noseModel[48].setRotationPoint(-175F, -50.5F, 11F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		noseModel[49].setRotationPoint(-168.5F, -49.7F, 12.5F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		noseModel[50].setRotationPoint(-161F, -50F, 13.9F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 350
		noseModel[51].setRotationPoint(-168.5F, -55.7F, 6.5F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0.5F, 6F, 0F, 0.5F, 6F); // Box 351
		noseModel[52].setRotationPoint(-161F, -56.7F, 7.5F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -4F, 2.3F, 0F, 0F, 0.3F, 0F, -1.7F, 0.3F, 0F, -5.7F, -1.7F, 0F, 4F, 2.3F, 0F, 0F, 0.3F, 0F, 1.7F, 0.3F, 0F, 5.7F, -1.7F); // Box 352
		noseModel[53].setRotationPoint(-175F, -60.5F, 7.7F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		noseModel[54].setRotationPoint(-207F, -55F, -0.5F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 354
		noseModel[55].setRotationPoint(-205F, -55F, -5.5F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 355
		noseModel[56].setRotationPoint(-188F, -55F, -5.5F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 356
		noseModel[57].setRotationPoint(-192F, -55F, -5.5F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 357
		noseModel[58].setRotationPoint(-196F, -55F, -5.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Box 344
		tailModel[1] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 345
		tailModel[2] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 346
		tailModel[3] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 347
		tailModel[4] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 348
		tailModel[5] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 349
		tailModel[6] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 350
		tailModel[7] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 351
		tailModel[8] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 352
		tailModel[9] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 353
		tailModel[10] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 354
		tailModel[11] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 355
		tailModel[12] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 356
		tailModel[13] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 358
		tailModel[14] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 363
		tailModel[15] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 364
		tailModel[16] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 365
		tailModel[17] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 366
		tailModel[18] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 367
		tailModel[19] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 368
		tailModel[20] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 369
		tailModel[21] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 370
		tailModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 371
		tailModel[23] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 379
		tailModel[24] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 380
		tailModel[25] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 381
		tailModel[26] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 383
		tailModel[27] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 384
		tailModel[28] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 448
		tailModel[29] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 449
		tailModel[30] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 450
		tailModel[31] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 451
		tailModel[32] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 454
		tailModel[33] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 458
		tailModel[34] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 459
		tailModel[35] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 460
		tailModel[36] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 355
		tailModel[37] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 356
		tailModel[38] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 357
		tailModel[39] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 358
		tailModel[40] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 359
		tailModel[41] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 360
		tailModel[42] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 361
		tailModel[43] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 362
		tailModel[44] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 363
		tailModel[45] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 364
		tailModel[46] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 365
		tailModel[47] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 366
		tailModel[48] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 367
		tailModel[49] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 370
		tailModel[50] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 371

		tailModel[0].addShapeBox(0F, 0F, 0F, 36, 9, 34, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -9F, 0F, -0.5F, -10F, 0F, -0.5F, -10F, 0F, 0.5F, -9F); // Box 344
		tailModel[0].setRotationPoint(79F, -33.5F, -17F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 36, 14, 34, 0F,0F, 0.5F, -10F, 0F, -0.5F, -11F, 0F, -0.5F, -11F, 0F, 0.5F, -10F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F); // Box 345
		tailModel[1].setRotationPoint(79F, -65F, -17F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 36, 18, 34, 0F,0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Box 346
		tailModel[2].setRotationPoint(79F, -51F, -17F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 31, 8, 32, 0F,0F, 0F, 1F, 0F, 1.5F, -3F, 0F, 1.5F, -3F, 0F, 0F, 1F, 0F, 0.5F, -9F, 0F, -2.5F, -11F, 0F, -2.5F, -11F, 0F, 0.5F, -9F); // Box 347
		tailModel[3].setRotationPoint(115F, -33.5F, -16F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 31, 13, 32, 0F,0F, 0.5F, -9.5F, 0F, -2.5F, -11F, 0F, -2.5F, -11F, 0F, 0.5F, -9.5F, 0F, 0F, 1F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 1F); // Box 348
		tailModel[4].setRotationPoint(115F, -64F, -16F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 31, 17, 34, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0.5F, 0F); // Box 349
		tailModel[5].setRotationPoint(115F, -51F, -17F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 16, 14, 26, 0F,0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 350
		tailModel[6].setRotationPoint(146F, -49F, -13F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 16, 12, 26, 0F,0F, 0.5F, -8F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F); // Box 351
		tailModel[7].setRotationPoint(146F, -61F, -13F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 7, 26, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, -8F); // Box 352
		tailModel[8].setRotationPoint(146F, -35F, -13F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 353
		tailModel[9].setRotationPoint(162F, -58F, -3F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F); // Box 354
		tailModel[10].setRotationPoint(162F, -48.5F, -11F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 355
		tailModel[11].setRotationPoint(162F, -38.5F, -11F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 4, 18, 0F,0F, 0F, -0.3F, -0.2F, 1F, -5F, -0.2F, 1F, -5F, 0F, 0F, -0.3F, 0F, 0F, -5F, -0.2F, -2.5F, -8F, -0.2F, -2.5F, -8F, 0F, 0F, -5F); // Box 356
		tailModel[12].setRotationPoint(162F, -35F, -9F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		tailModel[13].setRotationPoint(181F, -46F, -6F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 2, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 363
		tailModel[14].setRotationPoint(161F, -49.5F, -4F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 364
		tailModel[15].setRotationPoint(163F, -36.5F, -4F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		tailModel[16].setRotationPoint(172F, -45F, -1F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		tailModel[17].setRotationPoint(188F, -44.5F, -0.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 367
		tailModel[18].setRotationPoint(183F, -44.5F, -0.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		tailModel[19].setRotationPoint(172F, -47.5F, -9F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6.5F, 0F, 0F, 6.5F); // Box 369
		tailModel[20].setRotationPoint(172F, -39.5F, -9F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 370
		tailModel[21].setRotationPoint(172F, -54.5F, -9F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		tailModel[22].setRotationPoint(172F, -54.5F, -3F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 379
		tailModel[23].setRotationPoint(144F, -63F, -96F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,-4F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 14F, -8F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 10F, 0F, 14F, 9F, 0F); // Box 380
		tailModel[24].setRotationPoint(134F, -63F, -96F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 8, 2, 86, 0F,0F, 0F, 0F, -3F, 0F, -5F, 4F, -8F, -6F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 4F, 9F, -6F, 0F, 10F, 0F); // Box 381
		tailModel[25].setRotationPoint(154F, -63F, -93F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 13, 52, 3, 0F,0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); // Box 383
		tailModel[26].setRotationPoint(147F, -110F, -1.5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 13, 52, 3, 0F,-7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 44F, 0F, 0F); // Box 384
		tailModel[27].setRotationPoint(134F, -110F, -1.5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 448
		tailModel[28].setRotationPoint(144F, -63F, 7F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,14F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 14F, 9F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -4F, 0F, -3F); // Box 449
		tailModel[29].setRotationPoint(134F, -63F, 7F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 86, 0F,0F, -7F, 0F, 4F, -8F, -6F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 10F, 0F, 4F, 9F, -6F, -3F, 0F, -5F, 0F, 0F, 0F); // Box 450
		tailModel[30].setRotationPoint(154F, -63F, 7F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 451
		tailModel[31].setRotationPoint(162F, -58F, 2F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		tailModel[32].setRotationPoint(181F, -46F, 5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		tailModel[33].setRotationPoint(172F, -47.5F, 8F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 459
		tailModel[34].setRotationPoint(172F, -39.5F, 8F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		tailModel[35].setRotationPoint(172F, -54.5F, 8F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, 7.5F, 0F, 1F, 7.5F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		tailModel[36].setRotationPoint(166.5F, -55F, 9F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		tailModel[37].setRotationPoint(166.5F, -47.5F, 9F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 357
		tailModel[38].setRotationPoint(166.5F, -38.5F, 9F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6.5F, 0F, 0F, 6.5F); // Box 358
		tailModel[39].setRotationPoint(166.5F, -38.5F, -10F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		tailModel[40].setRotationPoint(166.5F, -47.5F, -10F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, -7F, 0F, 1F, -7F, 0F, 1F, 7.5F, 0F, 1F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 360
		tailModel[41].setRotationPoint(166.5F, -55F, -10F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		tailModel[42].setRotationPoint(166.5F, -56.5F, -3F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 362
		tailModel[43].setRotationPoint(162F, -48.5F, 10F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 363
		tailModel[44].setRotationPoint(162F, -38.5F, 10F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -8.5F, 3F, 0F, -8.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 3F, 0F, 8.5F, -3F, 0F, 0F, 0F); // Box 364
		tailModel[45].setRotationPoint(173F, -54.5F, -3F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -8.5F, -3F, 0F, -8.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, -3F, 0F, 8.5F, 3F, 0F, 0F, 0F); // Box 365
		tailModel[46].setRotationPoint(173F, -54.5F, 2F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 7.5F, 3F, 0F, 7.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 3F, 0F, -7.5F, -3F, 0F, 0F, 0F); // Box 366
		tailModel[47].setRotationPoint(173F, -35.5F, -3F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 7.5F, -3F, 0F, 7.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -3F, 0F, -7.5F, 3F, 0F, 0F, 0F); // Box 367
		tailModel[48].setRotationPoint(173F, -35.5F, 2F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 3F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 3F, 0F, -0.2F, -3F, 0F, -0.2F, 0F); // Box 370
		tailModel[49].setRotationPoint(173F, -44F, 8F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, 3F, 0F, -0.2F, 0F); // Box 371
		tailModel[50].setRotationPoint(173F, -44F, -9F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 313
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 315
		leftWingModel[2] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 316
		leftWingModel[3] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 317
		leftWingModel[4] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 318
		leftWingModel[5] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 319
		leftWingModel[6] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 320
		leftWingModel[7] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 321
		leftWingModel[8] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 322
		leftWingModel[9] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 323
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 324
		leftWingModel[11] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 325
		leftWingModel[12] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 326
		leftWingModel[13] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 327
		leftWingModel[14] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 328
		leftWingModel[15] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 329
		leftWingModel[16] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 330
		leftWingModel[17] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 313
		leftWingModel[18] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 315
		leftWingModel[19] = new ModelRendererTurbo(this, 265, 328, textureX, textureY); // Box 360
		leftWingModel[20] = new ModelRendererTurbo(this, 10, 328, textureX, textureY); // Box 361
		leftWingModel[21] = new ModelRendererTurbo(this, 134, 251, textureX, textureY); // Box 372
		leftWingModel[22] = new ModelRendererTurbo(this, 134, 271, textureX, textureY); // Box 373
		leftWingModel[23] = new ModelRendererTurbo(this, 250, 255, textureX, textureY); // Box 374
		leftWingModel[24] = new ModelRendererTurbo(this, 250, 233, textureX, textureY); // Box 375

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,0F, 0F, 0F, 0F, 0F, 0F, 16F, -13F, 0F, 22F, -13F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 16F, 28F, 0F, 22F, 28F, 0F); // Box 313
		leftWingModel[0].setRotationPoint(-60F, -61.5F, -241F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,0F, 0F, 0F, 0F, -0.5F, -11F, 36F, -22F, 0F, -16F, -13F, 0F, 0F, 0.5F, 0F, 0F, 1F, -11F, 36F, 23F, 0F, -16F, 28F, 0F); // Box 315
		leftWingModel[1].setRotationPoint(-50F, -61.5F, -241F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		leftWingModel[2].setRotationPoint(-122F, -44.5F, -73F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		leftWingModel[3].setRotationPoint(-122F, -53.5F, -73F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		leftWingModel[4].setRotationPoint(-122F, -34.5F, -73F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		leftWingModel[5].setRotationPoint(-105F, -44.5F, -74F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		leftWingModel[6].setRotationPoint(-105F, -54.5F, -74F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		leftWingModel[7].setRotationPoint(-85F, -54.5F, -74F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		leftWingModel[8].setRotationPoint(-64F, -44.5F, -71F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		leftWingModel[9].setRotationPoint(-64F, -34.5F, -71F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		leftWingModel[10].setRotationPoint(-105F, -34.5F, -74F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		leftWingModel[11].setRotationPoint(-133F, -53.5F, -73F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		leftWingModel[12].setRotationPoint(-133F, -34.5F, -73F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		leftWingModel[13].setRotationPoint(-133F, -44.5F, -73F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		leftWingModel[14].setRotationPoint(-141F, -41.5F, -64F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		leftWingModel[15].setRotationPoint(-141F, -45.5F, -64F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		leftWingModel[16].setRotationPoint(-141F, -37.5F, -64F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,4F, 0.4F, 4F, 4F, 0.4F, 4F, 4F, -1.3F, 4F, 4F, -1.3F, 4F, 4F, -0.5F, 4F, 4F, -0.5F, 4F, 4F, 1F, 4F, 4F, 1F, 4F); // Box 313
		leftWingModel[17].setRotationPoint(-66F, -57.6F, -175F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,4F, 2F, 4F, 4F, 2F, 4F, 4F, -1.3F, 4F, 4F, -1.3F, 4F, 4F, -2.2F, 4F, 4F, -2.2F, 4F, 4F, 1.5F, 4F, 4F, 1.5F, 4F); // Box 315
		leftWingModel[18].setRotationPoint(-66F, -50.6F, -175F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 111, 0F,3F, -8.5F, 1F, 0F, -6.5F, 1F, -11F, -13F, 0F, 14F, -17F, 0F, 3F, 11.5F, 1F, 0F, 14F, 1F, -11F, 28F, 0F, 14F, 23F, 0F); // Box 360
		leftWingModel[19].setRotationPoint(-77F, -61.5F, -129F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 112, 0F,0F, -0.5F, -6F, 0F, 0F, -1F, -11F, -6.5F, 0F, 14F, -8.5F, 0F, 0F, 1F, -6F, 0F, 0.5F, -1F, -11F, 14F, 0F, 14F, 11.5F, 0F); // Box 361
		leftWingModel[20].setRotationPoint(-66F, -61.5F, -242F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 17, 9, 8, 0F,-1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftWingModel[21].setRotationPoint(-124F, -55.5F, -62F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftWingModel[22].setRotationPoint(-128F, -55.5F, -62F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, -1F); // Box 374
		leftWingModel[23].setRotationPoint(-128F, -32.5F, -62F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 17, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1F); // Box 375
		leftWingModel[24].setRotationPoint(-124F, -32.5F, -62F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 417
		rightWingModel[1] = new ModelRendererTurbo(this, 265, 328, textureX, textureY); // Box 418
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 419
		rightWingModel[3] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 420
		rightWingModel[4] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 421
		rightWingModel[5] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 422
		rightWingModel[6] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 423
		rightWingModel[7] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 424
		rightWingModel[8] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 425
		rightWingModel[9] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 426
		rightWingModel[10] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 427
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 428
		rightWingModel[12] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 429
		rightWingModel[13] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 430
		rightWingModel[14] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 431
		rightWingModel[15] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 432
		rightWingModel[16] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 433
		rightWingModel[17] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 434
		rightWingModel[18] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 316
		rightWingModel[19] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 317
		rightWingModel[20] = new ModelRendererTurbo(this, 134, 251, textureX, textureY); // Box 317
		rightWingModel[21] = new ModelRendererTurbo(this, 134, 271, textureX, textureY); // Box 318
		rightWingModel[22] = new ModelRendererTurbo(this, 250, 255, textureX, textureY); // Box 319
		rightWingModel[23] = new ModelRendererTurbo(this, 250, 233, textureX, textureY); // Box 320
		rightWingModel[24] = new ModelRendererTurbo(this, 10, 328, textureX, textureY); // Box 359

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,22F, -13F, 0F, 16F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 28F, 0F, 16F, 28F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 417
		rightWingModel[0].setRotationPoint(-60F, -61.5F, 18F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 111, 0F,14F, -17F, 0F, -11F, -13F, 0F, 0F, -6.5F, 1F, 3F, -8.5F, 1F, 14F, 23F, 0F, -11F, 28F, 0F, 0F, 14F, 1F, 3F, 11.5F, 1F); // Box 418
		rightWingModel[1].setRotationPoint(-77F, -61.5F, 18F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,-16F, -13F, 0F, 36F, -22F, 0F, 0F, -0.5F, -11F, 0F, 0F, 0F, -16F, 28F, 0F, 36F, 23F, 0F, 0F, 1F, -11F, 0F, 0.5F, 0F); // Box 419
		rightWingModel[2].setRotationPoint(-50F, -61.5F, 18F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 420
		rightWingModel[3].setRotationPoint(-122F, -44.5F, 43F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 421
		rightWingModel[4].setRotationPoint(-122F, -53.5F, 43F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 422
		rightWingModel[5].setRotationPoint(-122F, -34.5F, 43F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 423
		rightWingModel[6].setRotationPoint(-105F, -44.5F, 42F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 424
		rightWingModel[7].setRotationPoint(-105F, -54.5F, 42F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 425
		rightWingModel[8].setRotationPoint(-85F, -54.5F, 42F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 426
		rightWingModel[9].setRotationPoint(-64F, -44.5F, 45F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 427
		rightWingModel[10].setRotationPoint(-64F, -34.5F, 45F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 428
		rightWingModel[11].setRotationPoint(-105F, -34.5F, 42F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 429
		rightWingModel[12].setRotationPoint(-133F, -53.5F, 43F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 430
		rightWingModel[13].setRotationPoint(-133F, -34.5F, 43F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 431
		rightWingModel[14].setRotationPoint(-133F, -44.5F, 43F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 432
		rightWingModel[15].setRotationPoint(-141F, -41.5F, 52F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 433
		rightWingModel[16].setRotationPoint(-141F, -45.5F, 52F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 434
		rightWingModel[17].setRotationPoint(-141F, -37.5F, 52F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,4F, -1.3F, 4F, 4F, -1.3F, 4F, 4F, 0.4F, 4F, 4F, 0.4F, 4F, 4F, 1F, 4F, 4F, 1F, 4F, 4F, -0.5F, 4F, 4F, -0.5F, 4F); // Box 316
		rightWingModel[18].setRotationPoint(-66F, -57.6F, 150F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,4F, -1.3F, 4F, 4F, -1.3F, 4F, 4F, 2F, 4F, 4F, 2F, 4F, 4F, 1.5F, 4F, 4F, 1.5F, 4F, 4F, -2.2F, 4F, 4F, -2.2F, 4F); // Box 317
		rightWingModel[19].setRotationPoint(-66F, -50.6F, 150F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 17, 9, 8, 0F,-1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[20].setRotationPoint(-124F, -55.5F, 54F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightWingModel[21].setRotationPoint(-128F, -55.5F, 54F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.5F, -1F); // Box 319
		rightWingModel[22].setRotationPoint(-128F, -32.5F, 54F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 17, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -1F, 0F, -1F); // Box 320
		rightWingModel[23].setRotationPoint(-124F, -32.5F, 54F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 112, 0F,14F, -8.5F, 0F, -11F, -6.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, -6F, 14F, 11.5F, 0F, -11F, 14F, 0F, 0F, 0.5F, -1F, 0F, 1F, -6F); // Box 359
		rightWingModel[24].setRotationPoint(-66F, -61.5F, 130F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 372
		tailWheelModel[1] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 373
		tailWheelModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 374
		tailWheelModel[3] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 375
		tailWheelModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 376
		tailWheelModel[5] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 377
		tailWheelModel[6] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 378

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		tailWheelModel[0].setRotationPoint(129F, -27F, -1.5F);
		tailWheelModel[0].rotateAngleZ = 0.43633231F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		tailWheelModel[1].setRotationPoint(135F, -14F, -1.5F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		tailWheelModel[2].setRotationPoint(135F, -18F, -1.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 375
		tailWheelModel[3].setRotationPoint(135F, -10F, -1.5F);

		tailWheelModel[4].addShapeBox(0F, -0.5F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 376
		tailWheelModel[4].setRotationPoint(134F, -16F, -2.5F);
		tailWheelModel[4].rotateAngleZ = 0.73303829F;

		tailWheelModel[5].addShapeBox(0F, -0.5F, 0F, 6, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 377
		tailWheelModel[5].setRotationPoint(134F, -16F, 1.5F);
		tailWheelModel[5].rotateAngleZ = 0.73303829F;

		tailWheelModel[6].addShapeBox(0F, -0.5F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		tailWheelModel[6].setRotationPoint(140.5F, -12F, -4F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 331
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 332
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 333
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 334
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 335
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 336
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 337
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 338
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 339
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 340
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 341
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 342
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 343

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingWheelModel[0].setRotationPoint(-85F, -4.5F, -62F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F); // Box 332
		leftWingWheelModel[1].setRotationPoint(-85F, 3.5F, -62F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,-7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingWheelModel[2].setRotationPoint(-85F, -12.5F, -62F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftWingWheelModel[3].setRotationPoint(-75.5F, -2.5F, -64.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 40, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftWingWheelModel[4].setRotationPoint(-64.5F, -39.5F, -66F);
		leftWingWheelModel[4].rotateAngleZ = -0.26179939F;

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 24, 2, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 336
		leftWingWheelModel[5].setRotationPoint(-78.5F, -39.5F, -66F);
		leftWingWheelModel[5].rotateAngleZ = 0.34906585F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftWingWheelModel[6].setRotationPoint(-70.5F, -15.5F, -64.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 12F, 0F, -3.5F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -12F, 0F, -3.5F, -12F, 0F); // Box 338
		leftWingWheelModel[7].setRotationPoint(-70F, -18.5F, -64.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,-3F, 12F, 0F, 3F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, 3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftWingWheelModel[8].setRotationPoint(-70F, -18.5F, -64.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 40, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		leftWingWheelModel[9].setRotationPoint(-64.5F, -39.5F, -52F);
		leftWingWheelModel[9].rotateAngleZ = -0.26179939F;

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 24, 2, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 341
		leftWingWheelModel[10].setRotationPoint(-78.5F, -39.5F, -52F);
		leftWingWheelModel[10].rotateAngleZ = 0.34906585F;

		leftWingWheelModel[11].addShapeBox(0F, 0F, -0.5F, 41, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftWingWheelModel[11].setRotationPoint(-105F, -29.5F, -67.5F);
		leftWingWheelModel[11].rotateAngleX = -0.4712389F;

		leftWingWheelModel[12].addShapeBox(0F, 0F, -0.5F, 41, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftWingWheelModel[12].setRotationPoint(-105F, -29.5F, -49.5F);
		leftWingWheelModel[12].rotateAngleX = 0.4712389F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 435
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 436
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 437
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 438
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 439
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 440
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 441
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 442
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 443
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 444
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 445
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 446
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 447

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		rightWingWheelModel[0].setRotationPoint(-85F, -4.5F, 54F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F); // Box 436
		rightWingWheelModel[1].setRotationPoint(-85F, 3.5F, 54F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 23, 8, 8, 0F,-7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		rightWingWheelModel[2].setRotationPoint(-85F, -12.5F, 54F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightWingWheelModel[3].setRotationPoint(-75.5F, -2.5F, 50.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 40, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		rightWingWheelModel[4].setRotationPoint(-64.5F, -39.5F, 64F);
		rightWingWheelModel[4].rotateAngleZ = -0.26179939F;

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 24, 2, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 440
		rightWingWheelModel[5].setRotationPoint(-78.5F, -39.5F, 64F);
		rightWingWheelModel[5].rotateAngleZ = 0.34906585F;

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightWingWheelModel[6].setRotationPoint(-70.5F, -15.5F, 50.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,-3.5F, 12F, 0F, 3.5F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -12F, 0F, 3.5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		rightWingWheelModel[7].setRotationPoint(-70F, -18.5F, 50.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 12F, 0F, -3F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -12F, 0F, -3F, -12F, 0F); // Box 443
		rightWingWheelModel[8].setRotationPoint(-70F, -18.5F, 50.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 40, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		rightWingWheelModel[9].setRotationPoint(-64.5F, -39.5F, 50F);
		rightWingWheelModel[9].rotateAngleZ = -0.26179939F;

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 24, 2, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 445
		rightWingWheelModel[10].setRotationPoint(-78.5F, -39.5F, 50F);
		rightWingWheelModel[10].rotateAngleZ = 0.34906585F;

		rightWingWheelModel[11].addShapeBox(0F, 0F, -0.5F, 41, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		rightWingWheelModel[11].setRotationPoint(-105F, -29.5F, 66.5F);
		rightWingWheelModel[11].rotateAngleX = 0.4712389F;

		rightWingWheelModel[12].addShapeBox(0F, 0F, -0.5F, 41, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightWingWheelModel[12].setRotationPoint(-105F, -29.5F, 48.5F);
		rightWingWheelModel[12].rotateAngleX = -0.4712389F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][4];
		propellerModels[0] = makeProp1(-135F, -39.5F, -58F);
		propellerModels[1] = makeProp2(-135F, -39.5F, 58F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[3].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[3].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}