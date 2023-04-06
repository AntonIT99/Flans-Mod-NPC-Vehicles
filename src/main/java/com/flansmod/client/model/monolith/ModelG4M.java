//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: G4M
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG4M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelG4M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];
		noseModel = new ModelRendererTurbo[48];
		tailModel = new ModelRendererTurbo[47];
		leftWingModel = new ModelRendererTurbo[20];
		rightWingModel = new ModelRendererTurbo[20];
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
		bodyModel[40] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 269
		bodyModel[41] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 270
		bodyModel[42] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 271
		bodyModel[43] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 272
		bodyModel[44] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 273
		bodyModel[45] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 274
		bodyModel[46] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 275
		bodyModel[47] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 276
		bodyModel[48] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 277
		bodyModel[49] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 278
		bodyModel[50] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 279
		bodyModel[51] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 280
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 281
		bodyModel[53] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 282
		bodyModel[54] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 283
		bodyModel[55] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 284
		bodyModel[56] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 285
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 286
		bodyModel[58] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 287
		bodyModel[59] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 288
		bodyModel[60] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 289
		bodyModel[61] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 290
		bodyModel[62] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 291
		bodyModel[63] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 292
		bodyModel[64] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 293
		bodyModel[65] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 294
		bodyModel[66] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 295
		bodyModel[67] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 296
		bodyModel[68] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 297
		bodyModel[69] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 298
		bodyModel[70] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 299
		bodyModel[71] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 300
		bodyModel[72] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 301
		bodyModel[73] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 302
		bodyModel[74] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 303
		bodyModel[75] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 304
		bodyModel[76] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 603
		bodyModel[77] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 604
		bodyModel[78] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 606
		bodyModel[79] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 911
		bodyModel[80] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 912
		bodyModel[81] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 913
		bodyModel[82] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 311
		bodyModel[83] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 312
		bodyModel[84] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 386
		bodyModel[85] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 389
		bodyModel[86] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 390
		bodyModel[87] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 391
		bodyModel[88] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 392
		bodyModel[89] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 393
		bodyModel[90] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 394
		bodyModel[91] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 395
		bodyModel[92] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 396
		bodyModel[93] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 397
		bodyModel[94] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 398
		bodyModel[95] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 399
		bodyModel[96] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 400
		bodyModel[97] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 401
		bodyModel[98] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 402
		bodyModel[99] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 403
		bodyModel[100] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 404
		bodyModel[101] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 405
		bodyModel[102] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 406
		bodyModel[103] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 407
		bodyModel[104] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 408
		bodyModel[105] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 409
		bodyModel[106] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 410
		bodyModel[107] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 411
		bodyModel[108] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 412
		bodyModel[109] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 413
		bodyModel[110] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 462
		bodyModel[111] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 463
		bodyModel[112] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 464
		bodyModel[113] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 465
		bodyModel[114] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 466
		bodyModel[115] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 467
		bodyModel[116] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 468
		bodyModel[117] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 469
		bodyModel[118] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 470
		bodyModel[119] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 471
		bodyModel[120] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 472
		bodyModel[121] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 473
		bodyModel[122] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 474
		bodyModel[123] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 475
		bodyModel[124] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 476
		bodyModel[125] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 477
		bodyModel[126] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 478
		bodyModel[127] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 479
		bodyModel[128] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 480
		bodyModel[129] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 481
		bodyModel[130] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 482
		bodyModel[131] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 483
		bodyModel[132] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 484
		bodyModel[133] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 485
		bodyModel[134] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 486
		bodyModel[135] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 487
		bodyModel[136] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 488
		bodyModel[137] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 489
		bodyModel[138] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 490
		bodyModel[139] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 491
		bodyModel[140] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 492
		bodyModel[141] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 305
		bodyModel[142] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 306
		bodyModel[143] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 307
		bodyModel[144] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 308
		bodyModel[145] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 309
		bodyModel[146] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 310
		bodyModel[147] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 311
		bodyModel[148] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 312

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

		bodyModel[13].addShapeBox(0F, 0F, 0F, 112, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 240
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

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 268
		bodyModel[39].setRotationPoint(-5F, -38.5F, -18F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[40].setRotationPoint(-5F, -42.5F, -18F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[41].setRotationPoint(12F, -42.5F, -18F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F); // Box 271
		bodyModel[42].setRotationPoint(12F, -51.5F, -18F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[43].setRotationPoint(-5F, -51.5F, -18F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 118, 14, 1, 0F,0F, 1F, -10F, 0F, -0.5F, -11F, 0F, -0.5F, 11F, 0F, 1F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 273
		bodyModel[44].setRotationPoint(-51F, -65.5F, -18F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 109, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[45].setRotationPoint(-42F, -66.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F); // Box 275
		bodyModel[46].setRotationPoint(-51F, -66.5F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[47].setRotationPoint(-51F, -66.5F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 277
		bodyModel[48].setRotationPoint(6F, -41F, -22F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 278
		bodyModel[49].setRotationPoint(6F, -52F, -22F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[50].setRotationPoint(6F, -49F, -22.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,-1F, -0.5F, 1F, 0F, 0.5F, 2F, 0F, 2F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 1F, 0F, 0.5F, 2F, 0F, 2F, 0F, 0.5F, 0F, 0F); // Box 280
		bodyModel[51].setRotationPoint(-5F, -47.5F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Box 281
		bodyModel[52].setRotationPoint(-2F, -48F, -21F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F); // Box 282
		bodyModel[53].setRotationPoint(-2F, -43F, -21F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, -4F, -3F, 0F, -4F, -3.9F, 0F, -4F, 3.8F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[54].setRotationPoint(-73F, -61.5F, -18F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 3, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 9F, 2F, 4F, 9F, 2F, 4F, 0F, 0F, 5F); // Box 284
		bodyModel[55].setRotationPoint(-73F, -71.5F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 17, 11, 20, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4.4F, 0F, 0F, 4.4F, 0F, 0F, 5F); // Box 285
		bodyModel[56].setRotationPoint(-73F, -68.5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.4F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 286
		bodyModel[57].setRotationPoint(-56F, -66.5F, -9F);

		bodyModel[58].addShapeBox(-1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[58].setRotationPoint(-60.5F, -68F, -8F);
		bodyModel[58].rotateAngleZ = 0.61086524F;

		bodyModel[59].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 288
		bodyModel[59].setRotationPoint(-60.5F, -68F, -8F);
		bodyModel[59].rotateAngleZ = 0.61086524F;

		bodyModel[60].addShapeBox(10F, 0F, 4F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 289
		bodyModel[60].setRotationPoint(-60.5F, -68F, -8F);
		bodyModel[60].rotateAngleZ = 0.61086524F;

		bodyModel[61].addShapeBox(-1F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[61].setRotationPoint(-60.5F, -68F, 6F);
		bodyModel[61].rotateAngleZ = 0.61086524F;

		bodyModel[62].addShapeBox(6F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 291
		bodyModel[62].setRotationPoint(-60.5F, -68F, 2F);
		bodyModel[62].rotateAngleZ = 0.61086524F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[63].setRotationPoint(-79F, -73.5F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[64].setRotationPoint(-80.5F, -73F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[65].setRotationPoint(-82.5F, -79.25F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[66].setRotationPoint(-74.5F, -79.25F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[67].setRotationPoint(-80.5F, -81.5F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[68].setRotationPoint(-82.5F, -81.25F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F); // Box 298
		bodyModel[69].setRotationPoint(-82.5F, -74.25F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.7F, -0.75F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F); // Box 299
		bodyModel[70].setRotationPoint(-74.5F, -74.25F, -0.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.7F, -0.75F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, 1.7F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 300
		bodyModel[71].setRotationPoint(-74.5F, -81.25F, -0.5F);

		bodyModel[72].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[72].setRotationPoint(-51.5F, -70F, 0F);
		bodyModel[72].rotateAngleZ = 0.50614548F;

		bodyModel[73].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[73].setRotationPoint(-51.5F, -70F, 0F);
		bodyModel[73].rotateAngleZ = 0.50614548F;

		bodyModel[74].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[74].setRotationPoint(8.5F, -45F, -20F);
		bodyModel[74].rotateAngleY = -1.04719755F;

		bodyModel[75].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[75].setRotationPoint(8.5F, -45F, -20F);
		bodyModel[75].rotateAngleY = -1.04719755F;

		bodyModel[76].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[76].setRotationPoint(-128F, -59F, -5F);

		bodyModel[77].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[77].setRotationPoint(-128F, -59F, -9F);

		bodyModel[78].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[78].setRotationPoint(-130F, -57F, -7F);

		bodyModel[79].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 911
		bodyModel[79].setRotationPoint(-130F, -56F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 912
		bodyModel[80].setRotationPoint(-130.5F, -47.5F, -8F);

		bodyModel[81].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 913
		bodyModel[81].setRotationPoint(-128F, -57F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 60, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[82].setRotationPoint(-140F, -45.5F, -17F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[83].setRotationPoint(-81F, -45F, -17F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[84].setRotationPoint(-55F, -82.5F, -9F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 23, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 389
		bodyModel[85].setRotationPoint(-140F, -51.5F, 17F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0.5F, -0.5F, 8.5F, 0F, -4F, 4.5F, 0F, -4F, -4.5F, 0F, -0.5F, -8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[86].setRotationPoint(-140F, -61.5F, 17F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0.5F, -4F, 4.5F, 0F, -4F, 3F, 0F, -4F, -3F, 0F, -4F, -4.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[87].setRotationPoint(-133F, -61.5F, 17F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 112, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 392
		bodyModel[88].setRotationPoint(-117F, -51.5F, 17F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 44, 10, 1, 0F,0F, -4F, 3F, 0.5F, -4F, 3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[89].setRotationPoint(-117F, -61.5F, 17F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 118, 14, 1, 0F,0F, 1F, 10F, 0F, -0.5F, 11F, 0F, -0.5F, -11F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[90].setRotationPoint(-51F, -65.5F, 17F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 22, 10, 1, 0F,0F, -4F, 3F, 0F, -4F, 3.8F, 0F, -4F, -3.9F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[91].setRotationPoint(-73F, -61.5F, 17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 47, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 396
		bodyModel[92].setRotationPoint(20F, -51.5F, 17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 397
		bodyModel[93].setRotationPoint(-5F, -38.5F, 17F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[94].setRotationPoint(-5F, -42.5F, 17F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[95].setRotationPoint(12F, -42.5F, 17F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F); // Box 400
		bodyModel[96].setRotationPoint(12F, -51.5F, 17F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[97].setRotationPoint(-5F, -51.5F, 17F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 2F, -1F, -0.5F, 1F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 2F, -1F, -0.5F, 1F); // Box 402
		bodyModel[98].setRotationPoint(-5F, -47.5F, 18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.5F, -4F, 0F, 0.5F, -4F); // Box 403
		bodyModel[99].setRotationPoint(6F, -41F, 21F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 404
		bodyModel[100].setRotationPoint(6F, -52F, 21F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[101].setRotationPoint(6F, -49F, 21.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F); // Box 406
		bodyModel[102].setRotationPoint(-2F, -48F, 20F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 407
		bodyModel[103].setRotationPoint(-2F, -43F, 20F);

		bodyModel[104].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[104].setRotationPoint(8.5F, -45F, 20F);
		bodyModel[104].rotateAngleY = 1.04719755F;

		bodyModel[105].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[105].setRotationPoint(8.5F, -45F, 20F);
		bodyModel[105].rotateAngleY = 1.04719755F;

		bodyModel[106].addShapeBox(-8F, -0.1F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[106].setRotationPoint(-192F, -42F, 0F);
		bodyModel[106].rotateAngleY = -3.14159265F;

		bodyModel[107].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[107].setRotationPoint(-192F, -42F, 0F);
		bodyModel[107].rotateAngleY = -3.14159265F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[108].setRotationPoint(-178F, -33.5F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 413
		bodyModel[109].setRotationPoint(-168F, -46.5F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[110].setRotationPoint(-117F, -69.5F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 1F, 0F); // Box 463
		bodyModel[111].setRotationPoint(-130F, -68.5F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 464
		bodyModel[112].setRotationPoint(-131F, -67.5F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 465
		bodyModel[113].setRotationPoint(-120F, -69F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 466
		bodyModel[114].setRotationPoint(-107.5F, -69F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 467
		bodyModel[115].setRotationPoint(-95F, -69F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 468
		bodyModel[116].setRotationPoint(-95F, -71.5F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 469
		bodyModel[117].setRotationPoint(-131F, -69.5F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -6.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6.5F, 0F); // Box 470
		bodyModel[118].setRotationPoint(-141F, -65.5F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,4F, 1F, -0.5F, -4F, 1F, -0.5F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 5F, -1F, -0.5F, -5F, -1F, -0.5F, -3F, -0.5F, 0F, 3F, -0.5F, 0F); // Box 471
		bodyModel[119].setRotationPoint(-133F, -67.5F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,6F, 0.5F, 0F, -6F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 7F, -0.5F, 0F, -7F, -0.5F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 472
		bodyModel[120].setRotationPoint(-129F, -67.5F, 6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -6.5F, 0F, 1F, 2.5F, 0F, 1.5F, 2.3F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 1.5F, -3F, 0F, 2.5F, -3F, 0F, 0F, 6.5F, 0F); // Box 473
		bodyModel[121].setRotationPoint(-145F, -65.5F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 474
		bodyModel[122].setRotationPoint(-107.5F, -71.5F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[123].setRotationPoint(-107.5F, -71.5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[124].setRotationPoint(-107.5F, -71.5F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 477
		bodyModel[125].setRotationPoint(-120F, -71F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[126].setRotationPoint(-120F, -71F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[127].setRotationPoint(-120F, -71F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[128].setRotationPoint(-127F, -48.5F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 481
		bodyModel[129].setRotationPoint(-117F, -61.5F, 2F);

		bodyModel[130].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[130].setRotationPoint(-128F, -59F, 5F);

		bodyModel[131].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[131].setRotationPoint(-128F, -59F, 9F);

		bodyModel[132].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[132].setRotationPoint(-130F, -57F, 7F);

		bodyModel[133].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 485
		bodyModel[133].setRotationPoint(-130F, -56F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 486
		bodyModel[134].setRotationPoint(-130.5F, -47.5F, 6F);

		bodyModel[135].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 487
		bodyModel[135].setRotationPoint(-128F, -57F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 488
		bodyModel[136].setRotationPoint(-88F, -61.5F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[137].setRotationPoint(-98F, -48.5F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[138].setRotationPoint(-98F, -48.5F, 2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 491
		bodyModel[139].setRotationPoint(-88F, -61.5F, 2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5.4F); // Box 492
		bodyModel[140].setRotationPoint(-56F, -66.5F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 8, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[141].setRotationPoint(-144F, -62F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F,0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[142].setRotationPoint(-141F, -60F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[143].setRotationPoint(-117F, -71F, 5.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 308
		bodyModel[144].setRotationPoint(-131F, -70F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 309
		bodyModel[145].setRotationPoint(-135F, -69F, 5.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[146].setRotationPoint(-117F, -71F, -6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 311
		bodyModel[147].setRotationPoint(-131F, -70F, -6.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 312
		bodyModel[148].setRotationPoint(-135F, -69F, -6.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		noseModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 181
		noseModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 189
		noseModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 190
		noseModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 191
		noseModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 192
		noseModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 193
		noseModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 194
		noseModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 195
		noseModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 196
		noseModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 197
		noseModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 198
		noseModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 199
		noseModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 200
		noseModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 201
		noseModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 202
		noseModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 203
		noseModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 204
		noseModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 205
		noseModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 206
		noseModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 207
		noseModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 208
		noseModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 209
		noseModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 210
		noseModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 212
		noseModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 213
		noseModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 214
		noseModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 215
		noseModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 216
		noseModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 217
		noseModel[31] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 218
		noseModel[32] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 219
		noseModel[33] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 220
		noseModel[34] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 221
		noseModel[35] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 222
		noseModel[36] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 223
		noseModel[37] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 226
		noseModel[38] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 385
		noseModel[39] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 387
		noseModel[40] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 493
		noseModel[41] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 494
		noseModel[42] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 495
		noseModel[43] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 496
		noseModel[44] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 497
		noseModel[45] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 498
		noseModel[46] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 499
		noseModel[47] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 500

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0.5F, 0F, 3F, 0.5F, 0F, 0F, -1F); // Box 180
		noseModel[0].setRotationPoint(-180F, -31F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0.5F, -1F, 0F, 4.5F, 0.5F, 0F, 4.5F, 0.5F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, -1F); // Box 181
		noseModel[1].setRotationPoint(-180F, -54.5F, -6F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		noseModel[2].setRotationPoint(-193F, -44F, -4F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 189
		noseModel[3].setRotationPoint(-193F, -47F, -4F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		noseModel[4].setRotationPoint(-193F, -47F, -1.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 191
		noseModel[5].setRotationPoint(-193F, -41F, -4F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		noseModel[6].setRotationPoint(-193F, -39F, -1.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		noseModel[7].setRotationPoint(-193F, -44F, 3F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		noseModel[8].setRotationPoint(-193F, -47F, 3F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 195
		noseModel[9].setRotationPoint(-193F, -41F, 3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		noseModel[10].setRotationPoint(-186.5F, -53F, -4.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		noseModel[11].setRotationPoint(-186.5F, -47F, 9F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		noseModel[12].setRotationPoint(-186.5F, -53F, 9F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 199
		noseModel[13].setRotationPoint(-186.5F, -38F, 9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		noseModel[14].setRotationPoint(-186.5F, -33F, -4.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		noseModel[15].setRotationPoint(-186.5F, -47F, -10F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 202
		noseModel[16].setRotationPoint(-186.5F, -53F, -10F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1F, 5F, 0F, -1F, 5F); // Box 203
		noseModel[17].setRotationPoint(-186.5F, -38F, -10F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 2F, 0.5F, 0.5F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0.5F, 0.5F, -2F, -0.5F, 0F, 0F, 0F); // Box 204
		noseModel[18].setRotationPoint(-186.5F, -53F, -4.5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0.5F, 0F, 0F, 0F); // Box 205
		noseModel[19].setRotationPoint(-186.5F, -53F, 3.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, 0F, 0F, 3F, -1F, 0F, 3F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -0.5F, 0F); // Box 206
		noseModel[20].setRotationPoint(-190.5F, -50F, 2.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 3.5F, -2F, 0F, 3.5F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -2F, 0F, -3.5F, 2F, 0F, 0F, 0F); // Box 207
		noseModel[21].setRotationPoint(-192.5F, -47F, 0.5F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, -2F, 0F, -3.5F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3.5F, -2F, 0F, 3.5F, 2F, 0.5F, 0F, 0F); // Box 208
		noseModel[22].setRotationPoint(-192.5F, -39F, 0.5F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, -1F, 0F, 3F, 1F, 0F, 0.5F, 0F); // Box 209
		noseModel[23].setRotationPoint(-190.5F, -36F, 2.5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 2F, 0.5F, 0F, 0F, 0F); // Box 210
		noseModel[24].setRotationPoint(-186.5F, -33F, 3.5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 212
		noseModel[25].setRotationPoint(-186.5F, -43F, 9F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 213
		noseModel[26].setRotationPoint(-190.5F, -43F, 8F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 3F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, -3F, 0F, 0F, 3F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, -3F); // Box 214
		noseModel[27].setRotationPoint(-192.5F, -43F, 6F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 15, 8, 14, 0F,0F, -1F, 7.5F, 0F, -2F, 10F, 0F, -2F, 10F, 0F, -1F, 7.5F, 0F, 0.5F, -0.5F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0.5F, -0.5F); // Box 215
		noseModel[28].setRotationPoint(-165F, -35.5F, -7F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 15, 14, 14, 0F,0F, 1F, 7.5F, 0F, 2F, 10F, 0F, 2F, 10F, 0F, 1F, 7.5F, 0F, 1F, 7.5F, 0F, 2F, 10F, 0F, 2F, 10F, 0F, 1F, 7.5F); // Box 216
		noseModel[29].setRotationPoint(-165F, -49.5F, -7F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 15, 8, 7, 0F,0F, 0.5F, -0.5F, 0F, 3F, 1F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 7.5F, 0F, -1F, 10F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 217
		noseModel[30].setRotationPoint(-165F, -58.5F, -7F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 3.5F, 0F, 0F, 0F); // Box 218
		noseModel[31].setRotationPoint(-180F, -48.5F, 10F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, -0.5F, -1F, 0F, 3.5F, -2F, 0F, 4.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, -2F, -9F, 0F, -2F, 9.5F, 0F, 0F, 6F); // Box 219
		noseModel[32].setRotationPoint(-180F, -54.5F, 4F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, -6F, 0F, -2F, -9F, 0F, -2F, 9.5F, 0F, 0F, 6F, 0F, -0.5F, -1F, 0F, 2.5F, -2F, 0F, 3.5F, 1.5F, 0F, 0.5F, 0F); // Box 220
		noseModel[33].setRotationPoint(-180F, -36.5F, 4F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 15, 12, 1, 0F,0F, 0F, 0F, 0F, 2F, 3.5F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3.5F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 221
		noseModel[34].setRotationPoint(-180F, -48.5F, -11F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0.5F, 0F, 0F, 4.5F, 1.5F, 0F, 3.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 6F, 0F, -2F, 9.5F, 0F, -2F, -9F, 0F, 0F, -6F); // Box 222
		noseModel[35].setRotationPoint(-180F, -54.5F, -5F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 6F, 0F, -2F, 9.5F, 0F, -2F, -9F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 3.5F, 1.5F, 0F, 2.5F, -2F, 0F, -0.5F, -1F); // Box 223
		noseModel[36].setRotationPoint(-180F, -36.5F, -5F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 15, 8, 7, 0F,0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 3F, 1F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 10F, 0F, 0F, 7.5F); // Box 226
		noseModel[37].setRotationPoint(-165F, -58.5F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 1, 24, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		noseModel[38].setRotationPoint(-153F, -82.5F, -9F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,49F, -0.4F, -0.4F, 48F, -0.4F, -0.4F, 48F, -0.4F, -0.4F, 49F, -0.4F, -0.4F, 49F, -0.4F, -0.4F, 48F, -0.4F, -0.4F, 48F, -0.4F, -0.4F, 49F, -0.4F, -0.4F); // Box 387
		noseModel[39].setRotationPoint(-103.5F, -82.5F, -9F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, 0F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -0.5F, 0F); // Box 493
		noseModel[40].setRotationPoint(-190.5F, -50F, -3.5F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 3.5F, 2F, 0F, 3.5F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 2F, 0F, -3.5F, -2F, 0F, 0F, 0F); // Box 494
		noseModel[41].setRotationPoint(-192.5F, -47F, -1.5F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 2F, 0F, -3.5F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3.5F, 2F, 0F, 3.5F, -2F, 0.5F, 0F, 0F); // Box 495
		noseModel[42].setRotationPoint(-192.5F, -39F, -1.5F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, 0.5F, 0F); // Box 496
		noseModel[43].setRotationPoint(-190.5F, -36F, -3.5F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0.5F, -2F, 0.5F, 0.5F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0.5F, 0.5F, 2F, -0.5F, 0F, 0F, 0F); // Box 497
		noseModel[44].setRotationPoint(-186.5F, -33F, -4.5F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 498
		noseModel[45].setRotationPoint(-186.5F, -43F, -10F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 499
		noseModel[46].setRotationPoint(-190.5F, -43F, -9F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 3F, 0.5F, 0F, -3F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, 3F); // Box 500
		noseModel[47].setRotationPoint(-192.5F, -43F, -7F);
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
		tailModel[14] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 359
		tailModel[15] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 360
		tailModel[16] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 361
		tailModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 362
		tailModel[18] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 363
		tailModel[19] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 364
		tailModel[20] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 365
		tailModel[21] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 366
		tailModel[22] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 367
		tailModel[23] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 368
		tailModel[24] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 369
		tailModel[25] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 370
		tailModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 371
		tailModel[27] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 379
		tailModel[28] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 380
		tailModel[29] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 381
		tailModel[30] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 383
		tailModel[31] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 384
		tailModel[32] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 388
		tailModel[33] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 448
		tailModel[34] = new ModelRendererTurbo(this, 825, 217, textureX, textureY); // Box 449
		tailModel[35] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 450
		tailModel[36] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 451
		tailModel[37] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 452
		tailModel[38] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 453
		tailModel[39] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 454
		tailModel[40] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 455
		tailModel[41] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 456
		tailModel[42] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 457
		tailModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 458
		tailModel[44] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 459
		tailModel[45] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 460
		tailModel[46] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 461

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

		tailModel[9].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, 1F, 0F, 0F, 0F); // Box 353
		tailModel[9].setRotationPoint(162F, -58F, -3F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F); // Box 354
		tailModel[10].setRotationPoint(162F, -48.5F, -11F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, 0F); // Box 355
		tailModel[11].setRotationPoint(162F, -38.5F, -11F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 4, 18, 0F,0F, 0F, -0.3F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, -0.3F, 0F, 0F, -5F, 0F, -2.5F, -8F, 0F, -2.5F, -8F, 0F, 0F, -5F); // Box 356
		tailModel[12].setRotationPoint(162F, -35F, -9F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		tailModel[13].setRotationPoint(181F, -46.5F, -7F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 359
		tailModel[14].setRotationPoint(181F, -52.5F, -6F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, -1F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 1F, 0F, 0F, 0F); // Box 360
		tailModel[15].setRotationPoint(162F, -32F, -3F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -1F, 4F, 0F, -1F, 4F); // Box 361
		tailModel[16].setRotationPoint(181F, -40.5F, -6F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		tailModel[17].setRotationPoint(181F, -52F, -1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 2, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 363
		tailModel[18].setRotationPoint(161F, -49.5F, -4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		tailModel[19].setRotationPoint(163F, -36.5F, -4F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		tailModel[20].setRotationPoint(172F, -45F, -1F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		tailModel[21].setRotationPoint(188F, -44.5F, -0.5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.3F); // Box 367
		tailModel[22].setRotationPoint(183F, -44.5F, -0.5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		tailModel[23].setRotationPoint(172F, -47.5F, -9F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6.5F, 0F, 0F, 6.5F); // Box 369
		tailModel[24].setRotationPoint(172F, -39.5F, -9F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 370
		tailModel[25].setRotationPoint(172F, -54.5F, -9F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		tailModel[26].setRotationPoint(172F, -54.5F, -3F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 379
		tailModel[27].setRotationPoint(144F, -63F, -96F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,-4F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 14F, -8F, 0F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 10F, 0F, 14F, 9F, 0F); // Box 380
		tailModel[28].setRotationPoint(134F, -63F, -96F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 86, 0F,0F, 0F, 0F, -3F, 0F, -5F, 4F, -8F, -6F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 4F, 9F, -6F, 0F, 10F, 0F); // Box 381
		tailModel[29].setRotationPoint(154F, -63F, -93F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 13, 52, 3, 0F,0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F); // Box 383
		tailModel[30].setRotationPoint(147F, -110F, -1.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 13, 52, 3, 0F,-7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 44F, 0F, 0F); // Box 384
		tailModel[31].setRotationPoint(134F, -110F, -1.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,95F, -0.4F, -0.4F, 99F, 26F, -9F, 99F, 26F, 8.2F, 95F, -0.4F, -0.4F, 95F, -0.4F, -0.4F, 99F, -26.8F, -9F, 99F, -26.8F, 8.2F, 95F, -0.4F, -0.4F); // Box 388
		tailModel[32].setRotationPoint(40.5F, -82.5F, -9F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 448
		tailModel[33].setRotationPoint(144F, -63F, 7F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 10, 2, 89, 0F,14F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, 14F, 9F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, -4F, 0F, -3F); // Box 449
		tailModel[34].setRotationPoint(134F, -63F, 7F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 86, 0F,0F, -7F, 0F, 4F, -8F, -6F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 10F, 0F, 4F, 9F, -6F, -3F, 0F, -5F, 0F, 0F, 0F); // Box 450
		tailModel[35].setRotationPoint(154F, -63F, 7F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 6F, -1F, 0F, 0F, 0F); // Box 451
		tailModel[36].setRotationPoint(162F, -58F, 2F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 452
		tailModel[37].setRotationPoint(162F, -48.5F, 10F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 4F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 453
		tailModel[38].setRotationPoint(162F, -38.5F, 10F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		tailModel[39].setRotationPoint(181F, -46.5F, 6F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 4F, 0F, -1F, 4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 455
		tailModel[40].setRotationPoint(181F, -52.5F, 5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 1F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 456
		tailModel[41].setRotationPoint(162F, -32F, 2F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 457
		tailModel[42].setRotationPoint(181F, -40.5F, 5F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		tailModel[43].setRotationPoint(172F, -47.5F, 8F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 459
		tailModel[44].setRotationPoint(172F, -39.5F, 8F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		tailModel[45].setRotationPoint(172F, -54.5F, 8F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		tailModel[46].setRotationPoint(181F, -38F, -1F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 313
		leftWingModel[1] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 314
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 315
		leftWingModel[3] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 316
		leftWingModel[4] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 317
		leftWingModel[5] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 318
		leftWingModel[6] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 319
		leftWingModel[7] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 320
		leftWingModel[8] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 321
		leftWingModel[9] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 322
		leftWingModel[10] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 323
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 324
		leftWingModel[12] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 325
		leftWingModel[13] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 326
		leftWingModel[14] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 327
		leftWingModel[15] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 328
		leftWingModel[16] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 329
		leftWingModel[17] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 330
		leftWingModel[18] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 313
		leftWingModel[19] = new ModelRendererTurbo(this, 26, 242, textureX, textureY); // Box 315

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,0F, 0F, 0F, 0F, 0F, 0F, 16F, -13F, 0F, 22F, -13F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 16F, 28F, 0F, 22F, 28F, 0F); // Box 313
		leftWingModel[0].setRotationPoint(-60F, -61.5F, -241F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 223, 0F,0F, -0.5F, -5F, 0F, 0F, 0F, -22F, -13F, 0F, 28F, -17F, 0F, 0F, 1F, -5F, 0F, 0.5F, 0F, -22F, 28F, 0F, 28F, 23F, 0F); // Box 314
		leftWingModel[1].setRotationPoint(-66F, -61.5F, -241F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,0F, 0F, 0F, 0F, -0.5F, -11F, 36F, -22F, 0F, -16F, -13F, 0F, 0F, 0.5F, 0F, 0F, 1F, -11F, 36F, 23F, 0F, -16F, 28F, 0F); // Box 315
		leftWingModel[2].setRotationPoint(-50F, -61.5F, -241F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 316
		leftWingModel[3].setRotationPoint(-122F, -44.5F, -73F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 317
		leftWingModel[4].setRotationPoint(-122F, -53.5F, -73F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 9, 30, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 0F, -10F); // Box 318
		leftWingModel[5].setRotationPoint(-122F, -34.5F, -73F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 319
		leftWingModel[6].setRotationPoint(-105F, -44.5F, -74F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 20, 10, 32, 0F,0F, 0F, -10F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 320
		leftWingModel[7].setRotationPoint(-105F, -54.5F, -74F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 21, 10, 32, 0F,0F, -0.5F, -12F, 0F, -4F, -14F, 0F, -4F, -14F, 0F, -0.5F, -12F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 321
		leftWingModel[8].setRotationPoint(-85F, -54.5F, -74F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 8F, 0F, -7F, 8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 322
		leftWingModel[9].setRotationPoint(-64F, -44.5F, -71F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 26, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -8F, -12F, -5F, -7F, -12F, -5F, -7F, 0F, -2F, -8F); // Box 323
		leftWingModel[10].setRotationPoint(-64F, -34.5F, -71F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 41, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, -10F); // Box 324
		leftWingModel[11].setRotationPoint(-105F, -34.5F, -74F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		leftWingModel[12].setRotationPoint(-133F, -53.5F, -73F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 9, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -4.5F, -10F); // Box 326
		leftWingModel[13].setRotationPoint(-133F, -34.5F, -73F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 11, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 327
		leftWingModel[14].setRotationPoint(-133F, -44.5F, -73F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F); // Box 328
		leftWingModel[15].setRotationPoint(-141F, -41.5F, -64F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,-3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 329
		leftWingModel[16].setRotationPoint(-141F, -45.5F, -64F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -3F, -2.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -2.5F, -5F); // Box 330
		leftWingModel[17].setRotationPoint(-141F, -37.5F, -64F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,2F, 0.2F, 2F, 2F, 0.4F, 2F, 2F, -1.3F, 2F, 2F, -1.3F, 2F, 2F, -0.5F, 2F, 2F, -0.5F, 2F, 2F, 1F, 2F, 2F, 1F, 2F); // Box 313
		leftWingModel[18].setRotationPoint(-66F, -57.6F, -175F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,2F, 2F, 2F, 2F, 2F, 2F, 2F, -1.3F, 2F, 2F, -1.3F, 2F, 2F, -2.2F, 2F, 2F, -2.2F, 2F, 2F, 1.2F, 2F, 2F, 1.2F, 2F); // Box 315
		leftWingModel[19].setRotationPoint(-66F, -50.6F, -175F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 417
		rightWingModel[1] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 418
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

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 223, 0F,22F, -13F, 0F, 16F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 28F, 0F, 16F, 28F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 417
		rightWingModel[0].setRotationPoint(-60F, -61.5F, 18F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 223, 0F,28F, -17F, 0F, -22F, -13F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 28F, 23F, 0F, -22F, 28F, 0F, 0F, 0.5F, 0F, 0F, 1F, -5F); // Box 418
		rightWingModel[1].setRotationPoint(-66F, -61.5F, 18F);

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

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,2F, -1.3F, 2F, 2F, -1.3F, 2F, 2F, 0.4F, 2F, 2F, 0.2F, 2F, 2F, 1F, 2F, 2F, 1F, 2F, 2F, -0.5F, 2F, 2F, -0.5F, 2F); // Box 316
		rightWingModel[18].setRotationPoint(-66F, -57.6F, 150F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,2F, -1.3F, 2F, 2F, -1.3F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 2F, 1.2F, 2F, 2F, 1.2F, 2F, 2F, -2.2F, 2F, 2F, -2.2F, 2F); // Box 317
		rightWingModel[19].setRotationPoint(-66F, -50.6F, 150F);
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
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-135F, -39.5F, -58F);
		propellerModels[1] = makeProp2(-135F, -39.5F, 58F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 5, 239, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}