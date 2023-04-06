//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPutilovGarford extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelPutilovGarford() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[196];
		bodyDoorOpenModel = new ModelRendererTurbo[13];
		bodyDoorCloseModel = new ModelRendererTurbo[11];
		turretModel = new ModelRendererTurbo[29];
		barrelModel = new ModelRendererTurbo[27];
		leftFrontWheelModel = new ModelRendererTurbo[50];
		rightFrontWheelModel = new ModelRendererTurbo[50];
		leftBackWheelModel = new ModelRendererTurbo[50];
		rightBackWheelModel = new ModelRendererTurbo[50];
		steeringWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initsteeringWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		bodyModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 69
		bodyModel[2] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 70
		bodyModel[3] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 71
		bodyModel[4] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 73
		bodyModel[5] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 74
		bodyModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 75
		bodyModel[7] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 76
		bodyModel[8] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 77
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 80
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 81
		bodyModel[13] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 82
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 83
		bodyModel[15] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 84
		bodyModel[16] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 85
		bodyModel[17] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 86
		bodyModel[18] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 87
		bodyModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 88
		bodyModel[20] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 89
		bodyModel[21] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 91
		bodyModel[22] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 94
		bodyModel[24] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 98
		bodyModel[28] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 99
		bodyModel[29] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 100
		bodyModel[30] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 101
		bodyModel[31] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 102
		bodyModel[32] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 103
		bodyModel[33] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 104
		bodyModel[35] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 105
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 107
		bodyModel[38] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 108
		bodyModel[39] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 109
		bodyModel[40] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 111
		bodyModel[41] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 113
		bodyModel[42] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 119
		bodyModel[43] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 120
		bodyModel[44] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 121
		bodyModel[45] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 122
		bodyModel[46] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 123
		bodyModel[47] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 124
		bodyModel[48] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 125
		bodyModel[49] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 126
		bodyModel[50] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 127
		bodyModel[51] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 129
		bodyModel[53] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 130
		bodyModel[54] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 131
		bodyModel[55] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 134
		bodyModel[56] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 137
		bodyModel[57] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 153
		bodyModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 154
		bodyModel[59] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 157
		bodyModel[60] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 158
		bodyModel[61] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 227
		bodyModel[62] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 228
		bodyModel[63] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 229
		bodyModel[64] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 230
		bodyModel[65] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 231
		bodyModel[66] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 232
		bodyModel[67] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 283
		bodyModel[68] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 284
		bodyModel[69] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 285
		bodyModel[70] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 286
		bodyModel[71] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 287
		bodyModel[72] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 288
		bodyModel[73] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 289
		bodyModel[74] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 290
		bodyModel[75] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 307
		bodyModel[76] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 308
		bodyModel[77] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 324
		bodyModel[78] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 325
		bodyModel[79] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 326
		bodyModel[80] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 330
		bodyModel[81] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 331
		bodyModel[82] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 332
		bodyModel[83] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 333
		bodyModel[84] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 348
		bodyModel[85] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 348
		bodyModel[86] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 349
		bodyModel[87] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 350
		bodyModel[88] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 351
		bodyModel[89] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 352
		bodyModel[90] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 353
		bodyModel[91] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 354
		bodyModel[92] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 355
		bodyModel[93] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 356
		bodyModel[94] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 357
		bodyModel[95] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 358
		bodyModel[96] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 359
		bodyModel[97] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 360
		bodyModel[98] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 361
		bodyModel[99] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 372
		bodyModel[100] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 450
		bodyModel[101] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 451
		bodyModel[102] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 452
		bodyModel[103] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 448
		bodyModel[104] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 449
		bodyModel[105] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 450
		bodyModel[106] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 451
		bodyModel[107] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 453
		bodyModel[108] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 610
		bodyModel[109] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 611
		bodyModel[110] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 411
		bodyModel[111] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 412
		bodyModel[112] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 413
		bodyModel[113] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 420
		bodyModel[114] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 422
		bodyModel[115] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 423
		bodyModel[116] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 430
		bodyModel[117] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 431
		bodyModel[118] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 432
		bodyModel[119] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 433
		bodyModel[120] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 434
		bodyModel[121] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Box 435
		bodyModel[122] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 436
		bodyModel[123] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 437
		bodyModel[124] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 438
		bodyModel[125] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 439
		bodyModel[126] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 440
		bodyModel[127] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 441
		bodyModel[128] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 442
		bodyModel[129] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 443
		bodyModel[130] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 443
		bodyModel[131] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 444
		bodyModel[132] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 445
		bodyModel[133] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 446
		bodyModel[134] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 447
		bodyModel[135] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 448
		bodyModel[136] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 449
		bodyModel[137] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 450
		bodyModel[138] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 451
		bodyModel[139] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 460
		bodyModel[140] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 461
		bodyModel[141] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 462
		bodyModel[142] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 463
		bodyModel[143] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 464
		bodyModel[144] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 465
		bodyModel[145] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 466
		bodyModel[146] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 467
		bodyModel[147] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 469
		bodyModel[148] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 470
		bodyModel[149] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 472
		bodyModel[150] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 473
		bodyModel[151] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 475
		bodyModel[152] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 476
		bodyModel[153] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 478
		bodyModel[154] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 479
		bodyModel[155] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 480
		bodyModel[156] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 481
		bodyModel[157] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 482
		bodyModel[158] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 482
		bodyModel[159] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 483
		bodyModel[160] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 484
		bodyModel[161] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 485
		bodyModel[162] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 486
		bodyModel[163] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 487
		bodyModel[164] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 488
		bodyModel[165] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 489
		bodyModel[166] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 490
		bodyModel[167] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 491
		bodyModel[168] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 492
		bodyModel[169] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 493
		bodyModel[170] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 494
		bodyModel[171] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 495
		bodyModel[172] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 496
		bodyModel[173] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 497
		bodyModel[174] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 498
		bodyModel[175] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 499
		bodyModel[176] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 500
		bodyModel[177] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 501
		bodyModel[178] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 502
		bodyModel[179] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 503
		bodyModel[180] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 504
		bodyModel[181] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 505
		bodyModel[182] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 506
		bodyModel[183] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 507
		bodyModel[184] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 508
		bodyModel[185] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 509
		bodyModel[186] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 510
		bodyModel[187] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 511
		bodyModel[188] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 512
		bodyModel[189] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 513
		bodyModel[190] = new ModelRendererTurbo(this, 570, 272, textureX, textureY); // Box 476
		bodyModel[191] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 477
		bodyModel[192] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 478
		bodyModel[193] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 479
		bodyModel[194] = new ModelRendererTurbo(this, 482, 71, textureX, textureY); // Box 489
		bodyModel[195] = new ModelRendererTurbo(this, 482, 67, textureX, textureY); // Box 490

		bodyModel[0].addBox(31F, 1F, -24F, 4, 3, 47, 0F); // Box 34
		bodyModel[0].setRotationPoint(39F, -1F, 0F);

		bodyModel[1].addShapeBox(1F, -5F, -20F, 52, 4, 40, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F); // Box 69
		bodyModel[1].setRotationPoint(39F, -1F, 0F);

		bodyModel[2].addBox(36F, -9F, -17F, 18, 2, 34, 0F); // Box 70
		bodyModel[2].setRotationPoint(39F, -1F, 0F);

		bodyModel[3].addShapeBox(36F, -25F, -15F, 17, 16, 30, 0F,0F, 3F, 2F, 0F, -2F, -2.2F, 0F, -2F, -2.2F, 0F, 3F, 2F, 0F, 0F, 2F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 2F); // Box 71
		bodyModel[3].setRotationPoint(39F, -1F, 0F);

		bodyModel[4].addShapeBox(1F, -1F, -20F, 52, 3, 40, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -3F); // Box 73
		bodyModel[4].setRotationPoint(39F, -1F, 0F);

		bodyModel[5].addBox(3F, -28F, -17F, 33, 21, 3, 0F); // Box 74
		bodyModel[5].setRotationPoint(39F, -1F, 0F);

		bodyModel[6].addBox(3F, -28F, 14F, 33, 1, 3, 0F); // Box 75
		bodyModel[6].setRotationPoint(39F, -1F, 0F);

		bodyModel[7].addShapeBox(-18F, -7F, -17F, 42, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[7].setRotationPoint(39F, -1F, 0F);

		bodyModel[8].addShapeBox(-18F, -7F, 14F, 42, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[8].setRotationPoint(39F, -1F, 0F);

		bodyModel[9].addBox(-18F, -7F, -14F, 43, 3, 28, 0F); // Box 78
		bodyModel[9].setRotationPoint(39F, -1F, 0F);

		bodyModel[10].addBox(50.98F, -11F, -16F, 1, 3, 1, 0F); // Box 79
		bodyModel[10].setRotationPoint(39F, -1F, 0F);

		bodyModel[11].addShapeBox(51F, -14F, -18F, 1, 1, 5, 0F,0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 80
		bodyModel[11].setRotationPoint(39F, -1F, 0F);

		bodyModel[12].addShapeBox(51F, -12F, -18F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F); // Box 81
		bodyModel[12].setRotationPoint(39F, -1F, 0F);

		bodyModel[13].addShapeBox(51F, -13F, -18F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 82
		bodyModel[13].setRotationPoint(39F, -1F, 0F);

		bodyModel[14].addBox(50.98F, -12F, 15F, 1, 3, 1, 0F); // Box 83
		bodyModel[14].setRotationPoint(39F, -1F, 0F);

		bodyModel[15].addShapeBox(51F, -14F, 13F, 1, 1, 5, 0F,0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 84
		bodyModel[15].setRotationPoint(39F, -1F, 0F);

		bodyModel[16].addShapeBox(51F, -12F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F); // Box 85
		bodyModel[16].setRotationPoint(39F, -1F, 0F);

		bodyModel[17].addShapeBox(51F, -13F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 86
		bodyModel[17].setRotationPoint(39F, -1F, 0F);

		bodyModel[18].addBox(11F, -28F, -14F, 6, 21, 28, 0F); // Box 87
		bodyModel[18].setRotationPoint(39F, -1F, 0F);

		bodyModel[19].addBox(52F, -7F, -18F, 2, 3, 36, 0F); // Box 88
		bodyModel[19].setRotationPoint(39F, -1F, 0F);

		bodyModel[20].addShapeBox(-24F, -28F, -20F, 11, 21, 3, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 89
		bodyModel[20].setRotationPoint(39F, -1F, 0F);

		bodyModel[21].addShapeBox(0F, -28F, -20F, 7, 2, 3, 0F,0F, 0F, 5F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -6F); // Box 91
		bodyModel[21].setRotationPoint(39F, -1F, 0F);

		bodyModel[22].addShapeBox(24F, -8F, -20F, 29, 3, 40, 0F,0F, -1F, -3F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 1F, -3F); // Box 92
		bodyModel[22].setRotationPoint(39F, -1F, 0F);

		bodyModel[23].addShapeBox(-13F, -7F, -23F, 13, 3, 6, 0F,0F, 0F, 2F, -0.5F, 0F, 2F, 7F, 0F, 0F, 11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 11.5F, 0F, -2F); // Box 94
		bodyModel[23].setRotationPoint(39F, -1F, 0F);

		bodyModel[24].addBox(3F, -34F, -17F, 32, 6, 3, 0F); // Box 95
		bodyModel[24].setRotationPoint(39F, -1F, 0F);

		bodyModel[25].addBox(3F, -34F, 14F, 32, 6, 3, 0F); // Box 96
		bodyModel[25].setRotationPoint(39F, -1F, 0F);

		bodyModel[26].addBox(34F, -34F, -14F, 2, 3, 28, 0F); // Box 97
		bodyModel[26].setRotationPoint(39F, -1F, 0F);

		bodyModel[27].addShapeBox(6F, -35F, -17F, 32, 1, 34, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[27].setRotationPoint(37F, -1F, 0F);

		bodyModel[28].addBox(35F, -34F, -17F, 1, 6, 3, 0F); // Box 99
		bodyModel[28].setRotationPoint(39F, -1F, 0F);

		bodyModel[29].addBox(35F, -34F, 14F, 1, 6, 3, 0F); // Box 100
		bodyModel[29].setRotationPoint(39F, -1F, 0F);

		bodyModel[30].addShapeBox(-13F, -28F, 25F, 2, 21, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 101
		bodyModel[30].setRotationPoint(39F, -1F, 0F);

		bodyModel[31].addShapeBox(1F, -28F, 23F, 5, 2, 3, 0F,0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 0F, -2F); // Box 102
		bodyModel[31].setRotationPoint(39F, -1F, 0F);

		bodyModel[32].addShapeBox(-24F, -28F, 23F, 11, 21, 3, 0F,0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -7F); // Box 103
		bodyModel[32].setRotationPoint(39F, -1F, 0F);

		bodyModel[33].addShapeBox(-18F, -7F, 17F, 19, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 103
		bodyModel[33].setRotationPoint(39F, -1F, 0F);

		bodyModel[34].addShapeBox(-13F, -7F, 22F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[34].setRotationPoint(39F, -1F, 0F);

		bodyModel[35].addShapeBox(1F, -7F, 22F, 6, 3, 2, 0F,0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 12F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 105
		bodyModel[35].setRotationPoint(39F, -1F, 0F);

		bodyModel[36].addShapeBox(-24F, -7F, 22F, 11, 3, 2, 0F,0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 106
		bodyModel[36].setRotationPoint(39F, -1F, 0F);

		bodyModel[37].addShapeBox(-36F, -28F, -20F, 12, 18, 39, 0F,-1F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -11F, 1F, 3F, -7F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 3F, -7F); // Box 107
		bodyModel[37].setRotationPoint(39F, -1F, 0F);

		bodyModel[38].addBox(-25F, -7F, -17F, 7, 3, 34, 0F); // Box 108
		bodyModel[38].setRotationPoint(39F, -1F, 0F);

		bodyModel[39].addShapeBox(-1F, -28F, 25F, 2, 21, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 109
		bodyModel[39].setRotationPoint(39F, -1F, 0F);

		bodyModel[40].addShapeBox(-11F, -14F, 25F, 10, 7, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 111
		bodyModel[40].setRotationPoint(39F, -1F, 0F);

		bodyModel[41].addShapeBox(-13F, -12F, -22F, 13, 5, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 113
		bodyModel[41].setRotationPoint(39F, -1F, 0F);

		bodyModel[42].addShapeBox(-24F, -34F, -20F, 29, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[42].setRotationPoint(39F, 3F, 0F);

		bodyModel[43].addShapeBox(-20F, -34F, -23F, 22, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 120
		bodyModel[43].setRotationPoint(39F, 3F, 0F);

		bodyModel[44].addShapeBox(-14F, -34F, -25F, 14, 2, 5, 0F,-6F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 121
		bodyModel[44].setRotationPoint(39F, 3F, -3F);

		bodyModel[45].addShapeBox(-24F, -34F, 17F, 27, 2, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[45].setRotationPoint(39F, 3F, 0F);

		bodyModel[46].addShapeBox(-22F, -34F, 19F, 25, 2, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[46].setRotationPoint(39F, 3F, 0F);

		bodyModel[47].addShapeBox(-17F, -34F, 21F, 19, 2, 1, 0F,3F, 0F, 0F, 1.2F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[47].setRotationPoint(39F, 3F, 0F);

		bodyModel[48].addShapeBox(-13F, -34F, 22F, 14, 2, 5, 0F,4F, 0F, 0F, 1.6F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 1.4F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F); // Box 125
		bodyModel[48].setRotationPoint(39F, 3F, 0F);

		bodyModel[49].addShapeBox(-22F, -34F, -21F, 26, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 126
		bodyModel[49].setRotationPoint(39F, 3F, 0F);

		bodyModel[50].addShapeBox(-24F, -4F, -17F, 25, 6, 34, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 127
		bodyModel[50].setRotationPoint(39F, -1F, 0F);

		bodyModel[51].addShapeBox(-36F, -9F, -20F, 13, 10, 40, 0F,0F, -5F, -1F, -1F, -5F, -1F, -1F, -5F, -1F, 0F, -5F, -1F, 0F, -0.5F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, -0.5F, -1F); // Box 128
		bodyModel[51].setRotationPoint(39F, -1F, 0F);

		bodyModel[52].addShapeBox(-70F, -11F, -21F, 34, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[52].setRotationPoint(51F, 8F, 0F);

		bodyModel[53].addShapeBox(-69F, -14F, -25F, 33, 13, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[53].setRotationPoint(51F, -1F, 0F);

		bodyModel[54].addShapeBox(-70F, -14F, 20F, 33, 13, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 131
		bodyModel[54].setRotationPoint(51F, -1F, 0F);

		bodyModel[55].addShapeBox(-75F, -14F, -20F, 5, 13, 39, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 134
		bodyModel[55].setRotationPoint(51F, -1F, 0F);

		bodyModel[56].addShapeBox(-36F, -7F, -19F, 12, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[56].setRotationPoint(39F, -1F, 0F);

		bodyModel[57].addShapeBox(-74F, -14F, -26F, 3, 13, 13, 0F,-7F, 0F, -1F, 6F, 0F, -1F, -4F, 0F, 0F, 0.5F, 0F, -2F, -7F, 0F, -2F, 6F, 0F, -1F, -4F, 0F, 0F, 0.5F, 0F, -2F); // Box 153
		bodyModel[57].setRotationPoint(51F, -1F, 0F);

		bodyModel[58].addShapeBox(-74F, -14F, 15F, 3, 13, 9, 0F,1F, 0F, 2F, -4F, 0F, 3F, 5F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, 2F, -4F, 0F, 3F, 5F, 0F, 0F, -7F, 0F, 0F); // Box 154
		bodyModel[58].setRotationPoint(51F, -1F, 0F);

		bodyModel[59].addBox(-53F, 1F, -27F, 4, 3, 53, 0F); // Box 157
		bodyModel[59].setRotationPoint(51F, -1F, 0F);

		bodyModel[60].addBox(-58F, -1F, -20F, 13, 3, 40, 0F); // Box 158
		bodyModel[60].setRotationPoint(51F, -1F, 0F);

		bodyModel[61].addShapeBox(-24F, -35F, -17F, 30, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[61].setRotationPoint(39F, 3F, 0F);

		bodyModel[62].addShapeBox(-24F, -35F, -20F, 30, 1, 7, 0F,0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[62].setRotationPoint(39F, 3F, 0F);

		bodyModel[63].addShapeBox(-22F, -35F, -22F, 25, 1, 5, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, -3F, 2F, 0F, -3F); // Box 229
		bodyModel[63].setRotationPoint(39F, 3F, 0F);

		bodyModel[64].addShapeBox(-3F, -5F, -19F, 3, 5, 6, 0F,0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 230
		bodyModel[64].setRotationPoint(39F, -1F, 0F);

		bodyModel[65].addShapeBox(-13F, -5F, 20F, 3, 5, 6, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 231
		bodyModel[65].setRotationPoint(39F, -1F, 0F);

		bodyModel[66].addShapeBox(-38.01F, -14F, -21F, 2, 3, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[66].setRotationPoint(51F, -1F, 0F);

		bodyModel[67].addShapeBox(-49F, -1F, 23F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 283
		bodyModel[67].setRotationPoint(39F, -1F, 0F);

		bodyModel[68].addShapeBox(-49F, 3F, 23F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 4F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, 4F, 0F, -3.6F, -4F, 0F, 0F, 0F); // Box 284
		bodyModel[68].setRotationPoint(39F, -1F, 0F);

		bodyModel[69].addShapeBox(-49F, 0F, 23F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.6F, 0F, 0F, 0F); // Box 285
		bodyModel[69].setRotationPoint(39F, -1F, 0F);

		bodyModel[70].addShapeBox(-42F, 0F, 23F, 3, 3, 1, 0F,0.1F, 0F, 2.2F, 2.8F, 0F, 3F, 3F, 0F, -4F, 0F, 0F, -2.1F, 0F, -1.6F, 2.2F, 0F, -2.2F, 3F, 0F, -2.2F, -3F, 0F, -1.6F, -2.2F); // Box 286
		bodyModel[70].setRotationPoint(39F, -1F, 0F);

		bodyModel[71].addShapeBox(-49F, -1F, -23F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 287
		bodyModel[71].setRotationPoint(39F, -1F, 0F);

		bodyModel[72].addShapeBox(-49F, 3F, -24F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.6F, -5F, 0F, -3.6F, 5F, 0F, 0F, 0F); // Box 288
		bodyModel[72].setRotationPoint(39F, -1F, 0F);

		bodyModel[73].addShapeBox(-42F, 0F, -19F, 3, 3, 1, 0F,0.1F, 0F, 1.8F, 2.8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2.1F, 0F, -1.6F, 2.2F, 0F, -2.2F, 1F, 0F, -2.2F, -1.2F, 0F, -1.6F, -2.4F); // Box 289
		bodyModel[73].setRotationPoint(39F, -1F, 0F);

		bodyModel[74].addShapeBox(-49F, 0F, -23F, 5, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, -1.1F, 0F, 0F, 0.9F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0.9F, 0F, 0F, 0F); // Box 290
		bodyModel[74].setRotationPoint(39F, -1F, 0F);

		bodyModel[75].addShapeBox(-2F, -5F, 20F, 3, 5, 6, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 307
		bodyModel[75].setRotationPoint(39F, -1F, 0F);

		bodyModel[76].addShapeBox(-13F, -5F, -19F, 3, 5, 6, 0F,0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 308
		bodyModel[76].setRotationPoint(39F, -1F, 0F);

		bodyModel[77].addShapeBox(35F, -28F, 17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 324
		bodyModel[77].setRotationPoint(39F, -1F, 0F);

		bodyModel[78].addShapeBox(35F, -27.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 325
		bodyModel[78].setRotationPoint(39F, -1F, 0F);

		bodyModel[79].addShapeBox(35F, -27.2F, 17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 326
		bodyModel[79].setRotationPoint(39F, -1F, 0F);

		bodyModel[80].addShapeBox(35F, -22.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.6F); // Box 330
		bodyModel[80].setRotationPoint(39F, -1F, 0F);

		bodyModel[81].addShapeBox(36F, -22.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -1.2F, 0F, 0.5F, -0.8F); // Box 331
		bodyModel[81].setRotationPoint(39F, -1F, 0F);

		bodyModel[82].addShapeBox(36F, -11.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -1.2F, 0F, 0F, -0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -1.2F, 0F, 0.5F, -0.8F); // Box 332
		bodyModel[82].setRotationPoint(39F, -1F, 0F);

		bodyModel[83].addShapeBox(35F, -11.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.6F); // Box 333
		bodyModel[83].setRotationPoint(39F, -1F, 0F);

		bodyModel[84].addShapeBox(53F, -22.6F, 0F, 1, 14, 11, 0F,0F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, -0.9F, 0.5F, 0.2F, -0.9F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 348
		bodyModel[84].setRotationPoint(39F, -1F, 0F);

		bodyModel[85].addShapeBox(53F, -22.6F, -11F, 1, 14, 11, 0F,0F, 0F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, -0.9F, 0.5F, 0.2F, -0.9F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 348
		bodyModel[85].setRotationPoint(39F, -1F, 0F);

		bodyModel[86].addShapeBox(-24F, -35F, 17F, 27, 1, 2, 0F,0F, 0F, 0F, 3F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[86].setRotationPoint(39F, 3F, 0F);

		bodyModel[87].addShapeBox(-22F, -35F, 19F, 25, 1, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0F, 0F); // Box 350
		bodyModel[87].setRotationPoint(39F, 3F, 0F);

		bodyModel[88].addShapeBox(-17F, -35F, 21F, 19, 1, 1, 0F,3F, 0F, 0F, 1.2F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[88].setRotationPoint(39F, 3F, 0F);

		bodyModel[89].addShapeBox(-13F, -35F, 22F, 13, 1, 2, 0F,4F, 0F, 0F, 2.6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[89].setRotationPoint(39F, 3F, 0F);

		bodyModel[90].addShapeBox(-14F, -35F, -25F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, -1F, -0.5F, 6F, -1F, -1F); // Box 353
		bodyModel[90].setRotationPoint(39F, 3F, 0F);

		bodyModel[91].addShapeBox(50F, -14F, -18F, 1, 1, 5, 0F,-0.2F, -0.4F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.4F, -1.6F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 354
		bodyModel[91].setRotationPoint(39F, -1F, 0F);

		bodyModel[92].addShapeBox(50F, -13F, -18F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 355
		bodyModel[92].setRotationPoint(39F, -1F, 0F);

		bodyModel[93].addShapeBox(50F, -12F, -18F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, -0.4F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.4F, -1.6F); // Box 356
		bodyModel[93].setRotationPoint(39F, -1F, 0F);

		bodyModel[94].addShapeBox(50F, -14F, 13F, 1, 1, 5, 0F,-0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 357
		bodyModel[94].setRotationPoint(39F, -1F, 0F);

		bodyModel[95].addShapeBox(50F, -13F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 358
		bodyModel[95].setRotationPoint(39F, -1F, 0F);

		bodyModel[96].addShapeBox(50F, -12F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F); // Box 359
		bodyModel[96].setRotationPoint(39F, -1F, 0F);

		bodyModel[97].addShapeBox(-42F, -1F, 21F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[97].setRotationPoint(39F, -1F, 0F);

		bodyModel[98].addShapeBox(-42F, -1F, -21F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[98].setRotationPoint(39F, -1F, 0F);

		bodyModel[99].addShapeBox(-38F, -35F, -17F, 14, 1, 34, 0F,-3F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, 2F, -3F, 0F, -10F, -2F, 0F, -10F, 0F, 0F, 3F, 0F, 0F, 2F, -2F, 0F, -10F); // Box 372
		bodyModel[99].setRotationPoint(49F, -7F, 0F);
		bodyModel[99].rotateAngleZ = 0.33161256F;

		bodyModel[100].addShapeBox(18F, -23.6F, 18F, 1, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 450
		bodyModel[100].setRotationPoint(39F, -1F, 0F);

		bodyModel[101].addShapeBox(18F, -24.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F); // Box 451
		bodyModel[101].setRotationPoint(39F, -1F, 0F);

		bodyModel[102].addShapeBox(18F, -8.6F, 17F, 1, 1, 1, 0F,0F, 0.6F, -0.8F, 0F, 0.6F, -0.8F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 452
		bodyModel[102].setRotationPoint(39F, -1F, 0F);

		bodyModel[103].addShapeBox(18F, -12.6F, 18F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F); // Box 448
		bodyModel[103].setRotationPoint(39F, -1F, 0F);

		bodyModel[104].addShapeBox(18F, -15.6F, 18F, 1, 3, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.6F); // Box 449
		bodyModel[104].setRotationPoint(39F, -1F, 0F);

		bodyModel[105].addShapeBox(18F, -17.6F, 18F, 1, 2, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 450
		bodyModel[105].setRotationPoint(39F, -1F, 0F);

		bodyModel[106].addShapeBox(18F, -19.6F, 18F, 1, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 451
		bodyModel[106].setRotationPoint(39F, -1F, 0F);

		bodyModel[107].addShapeBox(53F, -22.6F, 0F, 0, 14, 11, 0F,0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 453
		bodyModel[107].setRotationPoint(38F, -1F, 0F);

		bodyModel[108].addShapeBox(-14F, -34F, -25F, 14, 3, 5, 0F,-6F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F); // Box 610
		bodyModel[108].setRotationPoint(39F, 18F, -3F);

		bodyModel[109].addShapeBox(-13F, -34F, 22F, 14, 3, 5, 0F,4F, 0F, 0F, 1.6F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 1.4F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F); // Box 611
		bodyModel[109].setRotationPoint(39F, 18F, 0F);

		bodyModel[110].addShapeBox(-24F, -35F, -17F, 30, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[110].setRotationPoint(39F, 3F, 24F);

		bodyModel[111].addBox(-24F, -35F, -17F, 12, 1, 16, 0F); // Box 412
		bodyModel[111].setRotationPoint(39F, 3F, 10F);

		bodyModel[112].addBox(-24F, -35F, -17F, 7, 1, 16, 0F); // Box 413
		bodyModel[112].setRotationPoint(62F, 3F, 10F);

		bodyModel[113].addShapeBox(0F, -28F, -20F, 7, 14, 3, 0F,0F, 0F, 5F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, -6F); // Box 420
		bodyModel[113].setRotationPoint(39F, 6F, 0F);

		bodyModel[114].addShapeBox(1F, -28F, 23F, 5, 14, 3, 0F,0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 0F, -2F); // Box 422
		bodyModel[114].setRotationPoint(39F, 6F, 0F);

		bodyModel[115].addShapeBox(-1F, -28F, 25F, 2, 21, 3, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 423
		bodyModel[115].setRotationPoint(39F, -1F, -46F);

		bodyModel[116].addShapeBox(51F, -13F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 430
		bodyModel[116].setRotationPoint(27F, -13F, 2F);

		bodyModel[117].addShapeBox(51F, -12F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F); // Box 431
		bodyModel[117].setRotationPoint(27F, -13F, 2F);

		bodyModel[118].addBox(50.98F, -12F, 15F, 1, 3, 1, 0F); // Box 432
		bodyModel[118].setRotationPoint(27F, -27.5F, -1.5F);
		bodyModel[118].rotateAngleX = -0.83775804F;

		bodyModel[119].addShapeBox(51F, -14F, 13F, 1, 1, 5, 0F,0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 433
		bodyModel[119].setRotationPoint(27F, -13F, 2F);

		bodyModel[120].addShapeBox(50F, -13F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 434
		bodyModel[120].setRotationPoint(27F, -13F, 2F);

		bodyModel[121].addShapeBox(50F, -12F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F); // Box 435
		bodyModel[121].setRotationPoint(27F, -13F, 2F);

		bodyModel[122].addShapeBox(50F, -14F, 13F, 1, 1, 5, 0F,-0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 436
		bodyModel[122].setRotationPoint(27F, -13F, 2F);

		bodyModel[123].addShapeBox(51F, -13F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 437
		bodyModel[123].setRotationPoint(27F, -13F, -33F);

		bodyModel[124].addShapeBox(51F, -12F, 13F, 1, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F); // Box 438
		bodyModel[124].setRotationPoint(27F, -13F, -33F);

		bodyModel[125].addBox(50.98F, -12F, 15F, 1, 3, 1, 0F); // Box 439
		bodyModel[125].setRotationPoint(27F, -4.5F, -19F);
		bodyModel[125].rotateAngleX = 0.83775804F;

		bodyModel[126].addShapeBox(51F, -14F, 13F, 1, 1, 5, 0F,0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 440
		bodyModel[126].setRotationPoint(27F, -13F, -33F);

		bodyModel[127].addShapeBox(50F, -13F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 441
		bodyModel[127].setRotationPoint(27F, -13F, -33F);

		bodyModel[128].addShapeBox(50F, -12F, 13F, 1, 1, 5, 0F,-0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F); // Box 442
		bodyModel[128].setRotationPoint(27F, -13F, -33F);

		bodyModel[129].addShapeBox(50F, -14F, 13F, 1, 1, 5, 0F,-0.2F, -0.2F, -1.6F, 0F, 0.2F, -1.2F, 0F, 0.2F, -1.2F, -0.2F, -0.2F, -1.6F, -0.2F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.8F); // Box 443
		bodyModel[129].setRotationPoint(27F, -13F, -33F);

		bodyModel[130].addBox(3F, -34F, -17F, 2, 3, 34, 0F); // Box 443
		bodyModel[130].setRotationPoint(39F, -1F, 0F);

		bodyModel[131].addBox(0F, 0F, 0F, 12, 2, 11, 0F); // Box 444
		bodyModel[131].setRotationPoint(63F, -10F, 2F);

		bodyModel[132].addBox(3F, -28F, 14F, 18, 21, 3, 0F); // Box 445
		bodyModel[132].setRotationPoint(39F, -1F, 0F);

		bodyModel[133].addShapeBox(3F, -28F, 14F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[133].setRotationPoint(57F, 0F, 0F);

		bodyModel[134].addBox(3F, -28F, 14F, 1, 21, 3, 0F); // Box 447
		bodyModel[134].setRotationPoint(71F, -1F, 0F);

		bodyModel[135].addBox(0F, 0F, 0F, 12, 2, 11, 0F); // Box 448
		bodyModel[135].setRotationPoint(63F, -10F, -13F);

		bodyModel[136].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // Box 449
		bodyModel[136].setRotationPoint(63F, -10F, -13F);
		bodyModel[136].rotateAngleZ = 2.04203522F;

		bodyModel[137].addBox(0F, 0F, 0F, 12, 1, 11, 0F); // Box 450
		bodyModel[137].setRotationPoint(63F, -10F, 2F);
		bodyModel[137].rotateAngleZ = 2.04203522F;

		bodyModel[138].addShapeBox(1F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[138].setRotationPoint(72F, -22F, 7F);

		bodyModel[139].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[139].setRotationPoint(91F, -14F, 4.5F);
		bodyModel[139].rotateAngleZ = -1.57079633F;

		bodyModel[140].addShapeBox(-6F, -1F, -1F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 461
		bodyModel[140].setRotationPoint(91F, -14F, 4.5F);
		bodyModel[140].rotateAngleZ = -1.57079633F;

		bodyModel[141].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[141].setRotationPoint(91F, -14F, 4.5F);
		bodyModel[141].rotateAngleZ = -1.57079633F;

		bodyModel[142].addShapeBox(0F, -1F, -2.5F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[142].setRotationPoint(91F, -14F, -1.5F);
		bodyModel[142].rotateAngleZ = -1.57079633F;

		bodyModel[143].addShapeBox(-6F, -1F, -2.5F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[143].setRotationPoint(91F, -14F, -1.5F);
		bodyModel[143].rotateAngleZ = -1.57079633F;

		bodyModel[144].addShapeBox(-6F, -1F, -2.5F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 465
		bodyModel[144].setRotationPoint(91F, -14F, -1.5F);
		bodyModel[144].rotateAngleZ = -1.57079633F;

		bodyModel[145].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[145].setRotationPoint(59F, -15F, -16.5F);
		bodyModel[145].rotateAngleX = 1.57079633F;

		bodyModel[146].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[146].setRotationPoint(59F, -15F, -16.5F);
		bodyModel[146].rotateAngleX = 1.57079633F;

		bodyModel[147].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[147].setRotationPoint(59F, -19F, -16.5F);
		bodyModel[147].rotateAngleX = 1.57079633F;

		bodyModel[148].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[148].setRotationPoint(59F, -19F, -16.5F);
		bodyModel[148].rotateAngleX = 1.57079633F;

		bodyModel[149].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[149].setRotationPoint(59F, -23F, -16.5F);
		bodyModel[149].rotateAngleX = 1.57079633F;

		bodyModel[150].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[150].setRotationPoint(59F, -23F, -16.5F);
		bodyModel[150].rotateAngleX = 1.57079633F;

		bodyModel[151].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		bodyModel[151].setRotationPoint(59F, -27F, -16.5F);
		bodyModel[151].rotateAngleX = 1.57079633F;

		bodyModel[152].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[152].setRotationPoint(59F, -27F, -16.5F);
		bodyModel[152].rotateAngleX = 1.57079633F;

		bodyModel[153].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		bodyModel[153].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[153].rotateAngleX = 1.57079633F;

		bodyModel[154].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[154].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[154].rotateAngleX = 1.57079633F;

		bodyModel[155].addShapeBox(-6F, -1F, -1F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 480
		bodyModel[155].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[155].rotateAngleX = 1.57079633F;

		bodyModel[156].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[156].setRotationPoint(59F, -11F, -16.5F);
		bodyModel[156].rotateAngleX = 1.57079633F;

		bodyModel[157].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[157].setRotationPoint(59F, -11F, -16.5F);
		bodyModel[157].rotateAngleX = 1.57079633F;

		bodyModel[158].addShapeBox(35F, -25F, 17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 482
		bodyModel[158].setRotationPoint(39F, -1F, 0F);

		bodyModel[159].addShapeBox(35F, -24.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 483
		bodyModel[159].setRotationPoint(39F, -1F, 0F);

		bodyModel[160].addShapeBox(35F, -24.2F, 17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 484
		bodyModel[160].setRotationPoint(39F, -1F, 0F);

		bodyModel[161].addShapeBox(35F, -18F, 17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 485
		bodyModel[161].setRotationPoint(39F, -1F, 0F);

		bodyModel[162].addShapeBox(35F, -17.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 486
		bodyModel[162].setRotationPoint(39F, -1F, 0F);

		bodyModel[163].addShapeBox(35F, -17.2F, 17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 487
		bodyModel[163].setRotationPoint(39F, -1F, 0F);

		bodyModel[164].addShapeBox(35F, -14F, 17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 488
		bodyModel[164].setRotationPoint(39F, -1F, 0F);

		bodyModel[165].addShapeBox(35F, -13.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 489
		bodyModel[165].setRotationPoint(39F, -1F, 0F);

		bodyModel[166].addShapeBox(35F, -13.2F, 17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 490
		bodyModel[166].setRotationPoint(39F, -1F, 0F);

		bodyModel[167].addShapeBox(35F, -10F, 17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 491
		bodyModel[167].setRotationPoint(39F, -1F, 0F);

		bodyModel[168].addShapeBox(35F, -9.6F, 17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 492
		bodyModel[168].setRotationPoint(39F, -1F, 0F);

		bodyModel[169].addShapeBox(35F, -9.2F, 17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 493
		bodyModel[169].setRotationPoint(39F, -1F, 0F);

		bodyModel[170].addShapeBox(35F, -28F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 494
		bodyModel[170].setRotationPoint(39F, -1F, 0F);

		bodyModel[171].addShapeBox(35F, -27.2F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 495
		bodyModel[171].setRotationPoint(39F, -1F, 0F);

		bodyModel[172].addShapeBox(35F, -27.6F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 496
		bodyModel[172].setRotationPoint(39F, -1F, 0F);

		bodyModel[173].addShapeBox(35F, -24.6F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 497
		bodyModel[173].setRotationPoint(39F, -1F, 0F);

		bodyModel[174].addShapeBox(35F, -24.2F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 498
		bodyModel[174].setRotationPoint(39F, -1F, 0F);

		bodyModel[175].addShapeBox(35F, -25F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 499
		bodyModel[175].setRotationPoint(39F, -1F, 0F);

		bodyModel[176].addShapeBox(35F, -17.2F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 500
		bodyModel[176].setRotationPoint(39F, -1F, 0F);

		bodyModel[177].addShapeBox(35F, -17.6F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 501
		bodyModel[177].setRotationPoint(39F, -1F, 0F);

		bodyModel[178].addShapeBox(35F, -18F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 502
		bodyModel[178].setRotationPoint(39F, -1F, 0F);

		bodyModel[179].addShapeBox(35F, -13.2F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 503
		bodyModel[179].setRotationPoint(39F, -1F, 0F);

		bodyModel[180].addShapeBox(35F, -14F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 504
		bodyModel[180].setRotationPoint(39F, -1F, 0F);

		bodyModel[181].addShapeBox(35F, -13.6F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 505
		bodyModel[181].setRotationPoint(39F, -1F, 0F);

		bodyModel[182].addShapeBox(35F, -9.6F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 506
		bodyModel[182].setRotationPoint(39F, -1F, 0F);

		bodyModel[183].addShapeBox(35F, -10F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 507
		bodyModel[183].setRotationPoint(39F, -1F, 0F);

		bodyModel[184].addShapeBox(35F, -9.2F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 508
		bodyModel[184].setRotationPoint(39F, -1F, 0F);

		bodyModel[185].addShapeBox(-6F, -1F, -5F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 509
		bodyModel[185].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[185].rotateAngleX = 1.57079633F;

		bodyModel[186].addShapeBox(-6F, -1F, -9F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 510
		bodyModel[186].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[186].rotateAngleX = 1.57079633F;

		bodyModel[187].addShapeBox(-6F, -1F, -13F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 511
		bodyModel[187].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[187].rotateAngleX = 1.57079633F;

		bodyModel[188].addShapeBox(-6F, -1F, -17F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 512
		bodyModel[188].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[188].rotateAngleX = 1.57079633F;

		bodyModel[189].addShapeBox(-6F, -1F, -21F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 513
		bodyModel[189].setRotationPoint(59F, -31F, -16.5F);
		bodyModel[189].rotateAngleX = 1.57079633F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 159, 183, 0F,0F, -146F, -169F, 0F, -146F, -169F, 0F, -146F, 0F, 0F, -146F, 0F, 0F, 0F, -169F, 0F, 0F, -169F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		bodyModel[190].setRotationPoint(91.16F, -169F, -176.25F);

		bodyModel[191].addShapeBox(35F, -21F, -17F, 1, 1, 1, 0F,0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F); // Box 477
		bodyModel[191].setRotationPoint(39F, -1F, 0F);

		bodyModel[192].addShapeBox(35F, -21.4F, -17F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 478
		bodyModel[192].setRotationPoint(39F, -1F, 0F);

		bodyModel[193].addShapeBox(35F, -21.8F, -17F, 1, 1, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 479
		bodyModel[193].setRotationPoint(39F, -1F, 0F);

		bodyModel[194].addShapeBox(0F, 0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[194].setRotationPoint(68F, -16F, 0F);

		bodyModel[195].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 490
		bodyModel[195].setRotationPoint(68F, -16F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 454
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 455
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 456
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 457
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 458
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 414
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 416
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 418
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 419
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 427
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 428
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 429
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 491

		bodyDoorOpenModel[0].addShapeBox(21F, -24.6F, 17F, 14, 17, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F); // Box 454
		bodyDoorOpenModel[0].setRotationPoint(50F, -1F, 48F);
		bodyDoorOpenModel[0].rotateAngleY = -1.36135682F;

		bodyDoorOpenModel[1].addShapeBox(29F, -19.2F, 17F, 2, 1, 1, 0F,0F, -0.1F, 0.6F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Box 455
		bodyDoorOpenModel[1].setRotationPoint(50F, -1F, 48F);
		bodyDoorOpenModel[1].rotateAngleY = -1.36135682F;

		bodyDoorOpenModel[2].addShapeBox(29F, -20.6F, 17F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 456
		bodyDoorOpenModel[2].setRotationPoint(50F, -1F, 48F);
		bodyDoorOpenModel[2].rotateAngleY = -1.36135682F;

		bodyDoorOpenModel[3].addShapeBox(29F, -21F, 17F, 2, 1, 1, 0F,-0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 457
		bodyDoorOpenModel[3].setRotationPoint(50F, -1F, 48F);
		bodyDoorOpenModel[3].rotateAngleY = -1.36135682F;

		bodyDoorOpenModel[4].addShapeBox(21F, -26.6F, 17F, 14, 2, 1, 0F,-4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, -0.6F, -4F, 0.2F, -0.6F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, -0.6F, 0F, 0F, -0.6F); // Box 458
		bodyDoorOpenModel[4].setRotationPoint(50F, -1F, 48F);
		bodyDoorOpenModel[4].rotateAngleY = -1.36135682F;

		bodyDoorOpenModel[5].addBox(-24F, -35F, -17F, 12, 1, 16, 0F); // Box 414
		bodyDoorOpenModel[5].setRotationPoint(50F, 2.5F, 10F);

		bodyDoorOpenModel[6].addBox(-24F, -35F, -17F, 1, 1, 5, 0F); // Box 416
		bodyDoorOpenModel[6].setRotationPoint(56F, 1.5F, 15.5F);

		bodyDoorOpenModel[7].addShapeBox(36F, -34F, -14F, 1, 4, 12, 0F,1F, 0F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, 1F, 0F, 1F, -1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, -1F, 0.4F, 0.4F); // Box 418
		bodyDoorOpenModel[7].setRotationPoint(109F, 2F, 15F);
		bodyDoorOpenModel[7].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[8].addShapeBox(36F, -34F, -14F, 1, 4, 12, 0F,1F, 0F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, 1F, 0F, 1F, -1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, -1F, 0.4F, 0.4F); // Box 419
		bodyDoorOpenModel[8].setRotationPoint(101F, 8F, 0F);
		bodyDoorOpenModel[8].rotateAngleZ = 1.36135682F;

		bodyDoorOpenModel[9].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyDoorOpenModel[9].setRotationPoint(71.5F, -21F, 27.5F);
		bodyDoorOpenModel[9].rotateAngleY = -2.87979327F;
		bodyDoorOpenModel[9].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[10].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyDoorOpenModel[10].setRotationPoint(71.5F, -21F, 27.5F);
		bodyDoorOpenModel[10].rotateAngleY = -2.87979327F;
		bodyDoorOpenModel[10].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[11].addShapeBox(-6F, -1F, -1F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 429
		bodyDoorOpenModel[11].setRotationPoint(71.5F, -21F, 27.5F);
		bodyDoorOpenModel[11].rotateAngleY = -2.87979327F;
		bodyDoorOpenModel[11].rotateAngleZ = 1.57079633F;

		bodyDoorOpenModel[12].addShapeBox(-6F, 0.7F, -1F, 7, 1, 1, 0F,0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F, -0.4F, -1.5F, 0F); // Box 491
		bodyDoorOpenModel[12].setRotationPoint(64F, -21F, 16.5F);
		bodyDoorOpenModel[12].rotateAngleY = -1.57079633F;
		bodyDoorOpenModel[12].rotateAngleZ = 1.57079633F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 334
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 335
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 345
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 346
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 347
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 378
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 415
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 417
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 424
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 425
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 426

		bodyDoorCloseModel[0].addShapeBox(21F, -24.6F, 17F, 14, 17, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F); // Box 334
		bodyDoorCloseModel[0].setRotationPoint(39F, -1F, 0F);

		bodyDoorCloseModel[1].addShapeBox(21F, -26.6F, 17F, 14, 2, 1, 0F,-4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, -0.6F, -4F, 0.2F, -0.6F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, -0.6F, 0F, 0F, -0.6F); // Box 335
		bodyDoorCloseModel[1].setRotationPoint(39F, -1F, 0F);

		bodyDoorCloseModel[2].addShapeBox(29F, -19.2F, 17F, 2, 1, 1, 0F,0F, -0.1F, 0.6F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F); // Box 345
		bodyDoorCloseModel[2].setRotationPoint(39F, -1F, 0F);

		bodyDoorCloseModel[3].addShapeBox(29F, -20.6F, 17F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 346
		bodyDoorCloseModel[3].setRotationPoint(39F, -1F, 0F);

		bodyDoorCloseModel[4].addShapeBox(29F, -21F, 17F, 2, 1, 1, 0F,-0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F); // Box 347
		bodyDoorCloseModel[4].setRotationPoint(39F, -1F, 0F);

		bodyDoorCloseModel[5].addShapeBox(36F, -34F, -14F, 1, 4, 27, 0F,1F, 0F, 1F, -1F, 1F, 1F, -1F, 1F, 1F, 1F, 0F, 1F, -1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, -1F, 0.4F, 0.4F); // Box 378
		bodyDoorCloseModel[5].setRotationPoint(39F, 1F, 0F);

		bodyDoorCloseModel[6].addBox(-24F, -35F, -17F, 12, 1, 16, 0F); // Box 415
		bodyDoorCloseModel[6].setRotationPoint(3F, -41.5F, 10F);
		bodyDoorCloseModel[6].rotateAngleZ = -2.16420827F;

		bodyDoorCloseModel[7].addBox(-24F, -35F, -17F, 1, 1, 5, 0F); // Box 417
		bodyDoorCloseModel[7].setRotationPoint(58F, -75.5F, 15.5F);
		bodyDoorCloseModel[7].rotateAngleZ = 2.16420827F;

		bodyDoorCloseModel[8].addShapeBox(-6F, -1F, -1F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 424
		bodyDoorCloseModel[8].setRotationPoint(64F, -21F, 16.5F);
		bodyDoorCloseModel[8].rotateAngleY = -1.57079633F;
		bodyDoorCloseModel[8].rotateAngleZ = 1.57079633F;

		bodyDoorCloseModel[9].addShapeBox(-6F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyDoorCloseModel[9].setRotationPoint(64F, -21F, 16.5F);
		bodyDoorCloseModel[9].rotateAngleY = -1.57079633F;
		bodyDoorCloseModel[9].rotateAngleZ = 1.57079633F;

		bodyDoorCloseModel[10].addShapeBox(0F, -1F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyDoorCloseModel[10].setRotationPoint(64F, -21F, 16.5F);
		bodyDoorCloseModel[10].rotateAngleY = -1.57079633F;
		bodyDoorCloseModel[10].rotateAngleZ = 1.57079633F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 132
		turretModel[1] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 133
		turretModel[2] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 135
		turretModel[3] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 136
		turretModel[4] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 138
		turretModel[5] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 139
		turretModel[6] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 140
		turretModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 141
		turretModel[8] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 147
		turretModel[9] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 148
		turretModel[10] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 149
		turretModel[11] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 155
		turretModel[12] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 156
		turretModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 304
		turretModel[14] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 305
		turretModel[15] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 362
		turretModel[16] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 363
		turretModel[17] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 364
		turretModel[18] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 365
		turretModel[19] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 366
		turretModel[20] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 367
		turretModel[21] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 368
		turretModel[22] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 369
		turretModel[23] = new ModelRendererTurbo(this, 697, 73, textureX, textureY); // Box 370
		turretModel[24] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 373
		turretModel[25] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 374
		turretModel[26] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 375
		turretModel[27] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 376
		turretModel[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 377

		turretModel[0].addShapeBox(-13F, 0F, -18F, 20, 27, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		turretModel[0].setRotationPoint(0F, -38F, -2F);

		turretModel[1].addShapeBox(-19F, 0F, -18F, 6, 29, 33, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 133
		turretModel[1].setRotationPoint(0F, -38F, -2F);

		turretModel[2].addShapeBox(-13F, 0F, 13F, 20, 29, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		turretModel[2].setRotationPoint(0F, -38F, -2F);

		turretModel[3].addShapeBox(-13F, 0F, -16F, 20, 7, 29, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		turretModel[3].setRotationPoint(0F, -38F, -2F);

		turretModel[4].addShapeBox(7F, 0F, -18F, 2, 14, 33, 0F,3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 138
		turretModel[4].setRotationPoint(0F, -38F, -2F);

		turretModel[5].addShapeBox(7F, 14F, -18F, 2, 15, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 139
		turretModel[5].setRotationPoint(0F, -38F, -2F);

		turretModel[6].addShapeBox(7F, 14F, -6F, 2, 7, 5, 0F,2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		turretModel[6].setRotationPoint(0F, -38F, -2F);

		turretModel[7].addShapeBox(6F, 22F, -15F, 2, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		turretModel[7].setRotationPoint(0F, -38F, -2F);

		turretModel[8].addShapeBox(6F, 19F, -7F, 3, 10, 22, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[8].setRotationPoint(0.299999999999997F, -38F, -2F);

		turretModel[9].addShapeBox(6F, 14F, 14F, 3, 7, 1, 0F,2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 148
		turretModel[9].setRotationPoint(0F, -38F, -2F);

		turretModel[10].addShapeBox(7F, 14F, -1F, 2, 7, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		turretModel[10].setRotationPoint(0F, -38F, -2F);

		turretModel[11].addShapeBox(-11F, -4F, -8F, 13, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 155
		turretModel[11].setRotationPoint(0F, -38F, -2F);
		turretModel[11].rotateAngleX = -1.90240888F;

		turretModel[12].addShapeBox(-11F, -9F, 2.5F, 13, 7, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 156
		turretModel[12].setRotationPoint(0F, -38F, -2F);
		turretModel[12].rotateAngleX = 1.90240888F;

		turretModel[13].addShapeBox(6F, 14F, 11F, 2, 7, 3, 0F,2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 304
		turretModel[13].setRotationPoint(0F, -38F, -2F);

		turretModel[14].addShapeBox(7F, 14F, 4F, 2, 7, 4, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		turretModel[14].setRotationPoint(0F, -38F, -2F);

		turretModel[15].addShapeBox(-8F, -10F, 7.5F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 362
		turretModel[15].setRotationPoint(0F, -38F, -2F);
		turretModel[15].rotateAngleX = 1.90240888F;

		turretModel[16].addShapeBox(-8F, -10F, 7.5F, 1, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F); // Box 363
		turretModel[16].setRotationPoint(0F, -38F, -2F);
		turretModel[16].rotateAngleX = 1.90240888F;

		turretModel[17].addShapeBox(-2F, -10F, 7.5F, 1, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F); // Box 364
		turretModel[17].setRotationPoint(0F, -38F, -2F);
		turretModel[17].rotateAngleX = 1.90240888F;

		turretModel[18].addShapeBox(-2F, -5F, -7F, 1, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F, 0F, -6.1F, 0F); // Box 365
		turretModel[18].setRotationPoint(0F, -38F, -2F);
		turretModel[18].rotateAngleX = -1.90240888F;

		turretModel[19].addShapeBox(-8F, -5F, -7F, 7, 1, 1, 0F,-0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 366
		turretModel[19].setRotationPoint(0F, -38F, -2F);
		turretModel[19].rotateAngleX = -1.90240888F;

		turretModel[20].addShapeBox(-8F, -5F, -7F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F); // Box 367
		turretModel[20].setRotationPoint(0F, -38F, -2F);
		turretModel[20].rotateAngleX = -1.90240888F;

		turretModel[21].addShapeBox(5F, -6F, -3F, 1, 1, 7, 0F,0F, 0.6F, -1.2F, 0F, 0.6F, -1.2F, 0F, 0.6F, -1.2F, 0F, 0.6F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 368
		turretModel[21].setRotationPoint(0F, -38F, -2F);

		turretModel[22].addShapeBox(5F, -5F, -3F, 1, 3, 7, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 369
		turretModel[22].setRotationPoint(0F, -38F, -2F);

		turretModel[23].addShapeBox(5F, -2F, -3F, 1, 1, 7, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0.2F, -1.2F); // Box 370
		turretModel[23].setRotationPoint(0F, -38F, -2F);

		turretModel[24].addShapeBox(6F, -2F, -2F, 1, 1, 5, 0F,0F, 0F, -0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.2F, -1.6F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, -1.6F); // Box 373
		turretModel[24].setRotationPoint(0F, -38F, -2F);

		turretModel[25].addShapeBox(6F, -5F, -2F, 1, 3, 5, 0F,0F, 0F, -0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.8F); // Box 374
		turretModel[25].setRotationPoint(0F, -38F, -2F);

		turretModel[26].addShapeBox(6F, -6F, -2F, 1, 1, 5, 0F,0F, -0.4F, -1.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, -1.2F, 0F, 0F, -0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.8F); // Box 375
		turretModel[26].setRotationPoint(0F, -38F, -2F);

		turretModel[27].addShapeBox(3F, -2F, -1F, 1, 2, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 376
		turretModel[27].setRotationPoint(0F, -38F, -2F);

		turretModel[28].addShapeBox(3F, -5F, -1F, 1, 3, 3, 0F,1.8F, 0F, -1.2F, -1.8F, 0F, -1.2F, -1.8F, 0F, -1.2F, 1.8F, 0F, -1.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 377
		turretModel[28].setRotationPoint(0F, -38F, -2F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 143
		barrelModel[1] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 144
		barrelModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 145
		barrelModel[3] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 146
		barrelModel[4] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 150
		barrelModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 151
		barrelModel[6] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 152
		barrelModel[7] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 276
		barrelModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 277
		barrelModel[9] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 278
		barrelModel[10] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 279
		barrelModel[11] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 280
		barrelModel[12] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 281
		barrelModel[13] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 282
		barrelModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 291
		barrelModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 292
		barrelModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 293
		barrelModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 294
		barrelModel[18] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 295
		barrelModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 296
		barrelModel[20] = new ModelRendererTurbo(this, 354, 1, textureX, textureY); // Box 297
		barrelModel[21] = new ModelRendererTurbo(this, 342, 20, textureX, textureY); // Box 298
		barrelModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 299
		barrelModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 300
		barrelModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 301
		barrelModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 303
		barrelModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 304

		barrelModel[0].addShapeBox(-5F, -3F, 5F, 10, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 143
		barrelModel[0].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[1].addShapeBox(-5F, 4F, 5F, 16, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 144
		barrelModel[1].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[2].addShapeBox(-5F, -2F, 5F, 18, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 145
		barrelModel[2].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[3].addShapeBox(-5F, -2F, 14F, 17, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 146
		barrelModel[3].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[4].addShapeBox(-1F, -1F, 7F, 10, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		barrelModel[4].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[5].addShapeBox(-4F, 3F, 7F, 13, 1, 6, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 151
		barrelModel[5].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[6].addShapeBox(-3F, 0F, 7F, 12, 3, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 152
		barrelModel[6].setRotationPoint(11F, -22F, -8.5F);

		barrelModel[7].addShapeBox(-3F, 0F, -14F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		barrelModel[7].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[8].addShapeBox(-3F, 0F, -15F, 10, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		barrelModel[8].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[9].addShapeBox(-3F, 0F, -13F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		barrelModel[9].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[10].addShapeBox(-3F, 1F, -15F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		barrelModel[10].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[11].addShapeBox(-2F, 2F, -15F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		barrelModel[11].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[12].addShapeBox(-2F, 2F, -14F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		barrelModel[12].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[13].addShapeBox(-2F, 2F, -13F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 282
		barrelModel[13].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[14].addShapeBox(6.2F, 0F, -14F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		barrelModel[14].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[15].addShapeBox(6.2F, 0F, -13F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 292
		barrelModel[15].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[16].addShapeBox(6.2F, 0F, -15F, 1, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		barrelModel[16].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[17].addShapeBox(6.2F, 1F, -15F, 1, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 294
		barrelModel[17].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[18].addShapeBox(6.2F, 2F, -13F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.2F, -1F); // Box 295
		barrelModel[18].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[19].addShapeBox(6.2F, 2F, -14F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 296
		barrelModel[19].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[20].addShapeBox(6.2F, 2F, -15F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 297
		barrelModel[20].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[21].addShapeBox(6.2F, 1F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.2F); // Box 298
		barrelModel[21].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[22].addShapeBox(6.2F, 0.799999999999997F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.2F); // Box 299
		barrelModel[22].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[23].addShapeBox(6.2F, 1.2F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.2F, 0.4F, -0.4F, -0.4F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, 0.4F, -0.4F, -0.4F, -1F, -0.4F, -0.4F); // Box 300
		barrelModel[23].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[24].addShapeBox(6.6F, 0.799999999999997F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.4F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.4F, -1F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, -1F, -0.4F, -0.2F); // Box 301
		barrelModel[24].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[25].addShapeBox(6.6F, 1F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, -1F, -0.4F, -0.2F); // Box 303
		barrelModel[25].setRotationPoint(9F, -26F, 3.5F);

		barrelModel[26].addShapeBox(6.6F, 1.2F, -14F, 1, 1, 1, 0F,-1F, -0.4F, -0.2F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, -1F, -0.4F, -0.2F, -1F, -0.4F, -0.4F, 0.4F, -0.4F, -0.2F, 0.4F, -0.4F, -0.2F, -1F, -0.4F, -0.4F); // Box 304
		barrelModel[26].setRotationPoint(9F, -26F, 3.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 16
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 17
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 20
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 21
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 22
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 25
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 26
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		leftFrontWheelModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		leftFrontWheelModel[29] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 29
		leftFrontWheelModel[30] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 30
		leftFrontWheelModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
		leftFrontWheelModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 32
		leftFrontWheelModel[33] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 33
		leftFrontWheelModel[34] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 379
		leftFrontWheelModel[35] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 381
		leftFrontWheelModel[36] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 382
		leftFrontWheelModel[37] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 384
		leftFrontWheelModel[38] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 385
		leftFrontWheelModel[39] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 385
		leftFrontWheelModel[40] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 386
		leftFrontWheelModel[41] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 389
		leftFrontWheelModel[42] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 390
		leftFrontWheelModel[43] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 391
		leftFrontWheelModel[44] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 392
		leftFrontWheelModel[45] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 393
		leftFrontWheelModel[46] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 394
		leftFrontWheelModel[47] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 396
		leftFrontWheelModel[48] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 427
		leftFrontWheelModel[49] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 459

		leftFrontWheelModel[0].addBox(7F, -2.5F, -3F, 1, 4, 5, 0F); // Box 0
		leftFrontWheelModel[0].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[1].addBox(-8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 1
		leftFrontWheelModel[1].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[2].addBox(3F, -1.5F, 0F, 4, 1, 1, 0F); // Box 2
		leftFrontWheelModel[2].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[3].addBox(-7F, -1.5F, 0F, 4, 1, 1, 0F); // Box 3
		leftFrontWheelModel[3].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[4].addShapeBox(-0.5F, -7F, 0F, 1, 3, 1, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 4
		leftFrontWheelModel[4].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[5].addShapeBox(-0.5F, 3F, 0F, 1, 3, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 5
		leftFrontWheelModel[5].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[6].addShapeBox(7F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftFrontWheelModel[6].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[7].addShapeBox(6F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 7
		leftFrontWheelModel[7].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[8].addShapeBox(-8F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftFrontWheelModel[8].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[9].addShapeBox(-7F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 9
		leftFrontWheelModel[9].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[10].addShapeBox(-5F, -7.5F, -3F, 1, 1, 5, 0F,-0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 10
		leftFrontWheelModel[10].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[11].addShapeBox(4F, -7.5F, -3F, 1, 1, 5, 0F,0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 11
		leftFrontWheelModel[11].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[12].addShapeBox(-3F, -3.5F, 0F, 6, 1, 1, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftFrontWheelModel[12].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[13].addShapeBox(-3F, 1.5F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 13
		leftFrontWheelModel[13].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[14].addBox(-3F, -2.5F, 0F, 6, 4, 1, 0F); // Box 14
		leftFrontWheelModel[14].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[15].addShapeBox(-2F, -4.5F, 0F, 4, 1, 1, 0F,-1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		leftFrontWheelModel[15].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[16].addShapeBox(-5.5F, -8.4F, -3F, 11, 1, 5, 0F,-2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F); // Box 17
		leftFrontWheelModel[16].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[17].addShapeBox(-5.5F, 6.6F, -3F, 11, 1, 5, 0F,-0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F); // Box 18
		leftFrontWheelModel[17].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[18].addShapeBox(-2F, 2.5F, 0F, 4, 1, 1, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F); // Box 19
		leftFrontWheelModel[18].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[19].addShapeBox(7F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 20
		leftFrontWheelModel[19].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[20].addShapeBox(6F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 21
		leftFrontWheelModel[20].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[21].addShapeBox(-8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 22
		leftFrontWheelModel[21].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[22].addShapeBox(-7F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		leftFrontWheelModel[22].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[23].addShapeBox(-4.5F, 7.6F, -3F, 9, 1, 5, 0F,0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F); // Box 24
		leftFrontWheelModel[23].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[24].addShapeBox(4F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 25
		leftFrontWheelModel[24].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[25].addShapeBox(-5F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Box 26
		leftFrontWheelModel[25].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[26].addShapeBox(1.5F, -7F, 0F, 1, 4, 1, 0F,-1.8F, 0.6F, 0F, 1.8F, 0.4F, 0F, 1.8F, 0.4F, 0F, -1.8F, 0.6F, 0F, 0F, -0.4F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.4F, 0F); // Box 26
		leftFrontWheelModel[26].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[27].addShapeBox(2.5F, -4F, 0F, 1, 2, 1, 0F,-3.9F, 1.2F, 0F, 3.4F, 0.4F, 0F, 3.4F, 0.4F, 0F, -3.9F, 1.2F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.6F, 0F); // Box 27
		leftFrontWheelModel[27].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[28].addShapeBox(-2.5F, -7F, 0F, 1, 4, 1, 0F,2F, 0.6F, 0F, -2F, 0.8F, 0F, -2F, 0.6F, 0F, 2F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0.2F, 0F); // Box 28
		leftFrontWheelModel[28].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[29].addShapeBox(-3.5F, -4F, 0F, 1, 2, 1, 0F,3.4F, -0.2F, 0F, -4.2F, 0.6F, 0F, -4.2F, 0.6F, 0F, 3.4F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F); // Box 29
		leftFrontWheelModel[29].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[30].addShapeBox(2.5F, 1F, 0F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, 0.2F, 0F, -4.2F, 0F, 0F, 3.6F, -0.8F, 0F, 3.6F, -0.8F, 0F, -4.2F, 0F, 0F); // Box 30
		leftFrontWheelModel[30].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[31].addShapeBox(1.5F, 2F, 0F, 1, 4, 1, 0F,0F, -0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -0.4F, 0F, -2F, 1F, 0F, 1.8F, 0.6F, 0F, 1.8F, 0.6F, 0F, -2F, 0.8F, 0F); // Box 31
		leftFrontWheelModel[31].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[32].addShapeBox(-2.5F, 2F, 0F, 1, 4, 1, 0F,-0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.2F, 0F, 2.4F, 0.2F, 0F, -2.6F, 0.6F, 0F, -2.6F, 0.4F, 0F, 2.4F, 0F, 0F); // Box 32
		leftFrontWheelModel[32].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[33].addShapeBox(-3.5F, 1F, 0F, 1, 2, 1, 0F,-0.4F, 0.9F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0F, 0F, -0.6F, 0.9F, 0F, 3.6F, -0.8F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 3.6F, -0.8F, 0F); // Box 33
		leftFrontWheelModel[33].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[34].addShapeBox(-3.5F, -9.4F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 379
		leftFrontWheelModel[34].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[35].addShapeBox(7F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 381
		leftFrontWheelModel[35].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[36].addShapeBox(8F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftFrontWheelModel[36].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[37].addBox(8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 384
		leftFrontWheelModel[37].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[38].addShapeBox(8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 385
		leftFrontWheelModel[38].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[39].addShapeBox(7F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 385
		leftFrontWheelModel[39].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[40].addShapeBox(5F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F); // Box 386
		leftFrontWheelModel[40].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[41].addShapeBox(-8F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 389
		leftFrontWheelModel[41].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[42].addShapeBox(-9F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 390
		leftFrontWheelModel[42].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[43].addBox(-9F, -2.5F, -3F, 1, 4, 5, 0F); // Box 391
		leftFrontWheelModel[43].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[44].addShapeBox(-9F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		leftFrontWheelModel[44].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[45].addShapeBox(-8F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 393
		leftFrontWheelModel[45].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[46].addShapeBox(-6F, -8.5F, -3F, 1, 2, 5, 0F,-1.2F, -0.3F, 0F, 1.4F, -0.3F, 0F, 1.4F, -0.3F, 0F, -1.2F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 394
		leftFrontWheelModel[46].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[47].addShapeBox(4F, -8.5F, -3F, 1, 1, 5, 0F,0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.6F, -0.3F, 0F, -1.6F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 396
		leftFrontWheelModel[47].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[48].addShapeBox(-6F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.6F, 0F); // Box 427
		leftFrontWheelModel[48].setRotationPoint(72F, 1.5F, 23F);

		leftFrontWheelModel[49].addShapeBox(-3.5F, -8.5F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 459
		leftFrontWheelModel[49].setRotationPoint(72F, 1.5F, 23F);
		leftFrontWheelModel[49].rotateAngleZ = 3.14159265F;
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 560
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 561
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 562
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 563
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 564
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 565
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 566
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 567
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 568
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 569
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 570
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 571
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 572
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 573
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 913, 121, textureX, textureY); // Box 574
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 575
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 576
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 577
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 578
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 579
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 580
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 581
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 582
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 583
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 584
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 585
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 586
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 587
		rightFrontWheelModel[28] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 588
		rightFrontWheelModel[29] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 589
		rightFrontWheelModel[30] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 590
		rightFrontWheelModel[31] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 591
		rightFrontWheelModel[32] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 592
		rightFrontWheelModel[33] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 593
		rightFrontWheelModel[34] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 594
		rightFrontWheelModel[35] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 595
		rightFrontWheelModel[36] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 596
		rightFrontWheelModel[37] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 597
		rightFrontWheelModel[38] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 598
		rightFrontWheelModel[39] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 599
		rightFrontWheelModel[40] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 600
		rightFrontWheelModel[41] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 601
		rightFrontWheelModel[42] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 602
		rightFrontWheelModel[43] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 603
		rightFrontWheelModel[44] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 604
		rightFrontWheelModel[45] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 605
		rightFrontWheelModel[46] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 606
		rightFrontWheelModel[47] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 607
		rightFrontWheelModel[48] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 608
		rightFrontWheelModel[49] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 609

		rightFrontWheelModel[0].addShapeBox(-3.5F, -9.4F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 560
		rightFrontWheelModel[0].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[1].addShapeBox(-6F, -8.5F, -3F, 1, 2, 5, 0F,-1.2F, -0.3F, 0F, 1.4F, -0.3F, 0F, 1.4F, -0.3F, 0F, -1.2F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 561
		rightFrontWheelModel[1].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[2].addShapeBox(-8F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 562
		rightFrontWheelModel[2].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[3].addShapeBox(-9F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		rightFrontWheelModel[3].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[4].addBox(-9F, -2.5F, -3F, 1, 4, 5, 0F); // Box 564
		rightFrontWheelModel[4].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[5].addShapeBox(-9F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 565
		rightFrontWheelModel[5].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[6].addShapeBox(-8F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 566
		rightFrontWheelModel[6].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[7].addShapeBox(-7F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 567
		rightFrontWheelModel[7].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[8].addShapeBox(-8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 568
		rightFrontWheelModel[8].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[9].addBox(-8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 569
		rightFrontWheelModel[9].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[10].addShapeBox(-8F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		rightFrontWheelModel[10].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[11].addShapeBox(-7F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 571
		rightFrontWheelModel[11].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[12].addShapeBox(-5F, -7.5F, -3F, 1, 1, 5, 0F,-0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 572
		rightFrontWheelModel[12].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[13].addShapeBox(-5.5F, -8.4F, -3F, 11, 1, 5, 0F,-2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F); // Box 573
		rightFrontWheelModel[13].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[14].addShapeBox(4F, -8.5F, -3F, 1, 1, 5, 0F,0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.6F, -0.3F, 0F, -1.6F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 574
		rightFrontWheelModel[14].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[15].addShapeBox(7F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 575
		rightFrontWheelModel[15].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[16].addShapeBox(8F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		rightFrontWheelModel[16].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[17].addBox(8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 577
		rightFrontWheelModel[17].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[18].addShapeBox(8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 578
		rightFrontWheelModel[18].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[19].addShapeBox(7F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 579
		rightFrontWheelModel[19].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[20].addShapeBox(6F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 580
		rightFrontWheelModel[20].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[21].addShapeBox(7F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 581
		rightFrontWheelModel[21].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[22].addBox(7F, -2.5F, -3F, 1, 4, 5, 0F); // Box 582
		rightFrontWheelModel[22].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[23].addShapeBox(7F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		rightFrontWheelModel[23].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[24].addShapeBox(6F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 584
		rightFrontWheelModel[24].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[25].addShapeBox(4F, -7.5F, -3F, 1, 1, 5, 0F,0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 585
		rightFrontWheelModel[25].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[26].addShapeBox(1.5F, -7F, -2F, 1, 4, 1, 0F,-1.8F, 0.6F, 0F, 1.8F, 0.4F, 0F, 1.8F, 0.4F, 0F, -1.8F, 0.6F, 0F, 0F, -0.4F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.4F, 0F); // Box 586
		rightFrontWheelModel[26].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[27].addShapeBox(2.5F, -4F, -2F, 1, 2, 1, 0F,-3.9F, 1.2F, 0F, 3.4F, 0.4F, 0F, 3.4F, 0.4F, 0F, -3.9F, 1.2F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.6F, 0F); // Box 587
		rightFrontWheelModel[27].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[28].addBox(3F, -1.5F, -2F, 4, 1, 1, 0F); // Box 588
		rightFrontWheelModel[28].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[29].addShapeBox(2.5F, 1F, -2F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, 0.2F, 0F, -4.2F, 0F, 0F, 3.6F, -0.8F, 0F, 3.6F, -0.8F, 0F, -4.2F, 0F, 0F); // Box 589
		rightFrontWheelModel[29].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[30].addShapeBox(1.5F, 2F, -2F, 1, 4, 1, 0F,0F, -0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -0.4F, 0F, -2F, 1F, 0F, 1.8F, 0.6F, 0F, 1.8F, 0.6F, 0F, -2F, 0.8F, 0F); // Box 590
		rightFrontWheelModel[30].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[31].addShapeBox(-0.5F, 3F, -2F, 1, 3, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 591
		rightFrontWheelModel[31].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[32].addShapeBox(-2.5F, 2F, -2F, 1, 4, 1, 0F,-0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.2F, 0F, 2.4F, 0.2F, 0F, -2.6F, 0.6F, 0F, -2.6F, 0.4F, 0F, 2.4F, 0F, 0F); // Box 592
		rightFrontWheelModel[32].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[33].addShapeBox(-2F, 2.5F, -2F, 4, 1, 1, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F); // Box 593
		rightFrontWheelModel[33].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[34].addShapeBox(-3F, 1.5F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 594
		rightFrontWheelModel[34].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[35].addBox(-3F, -2.5F, -2F, 6, 4, 1, 0F); // Box 595
		rightFrontWheelModel[35].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[36].addShapeBox(-2F, -4.5F, -2F, 4, 1, 1, 0F,-1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F); // Box 596
		rightFrontWheelModel[36].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[37].addShapeBox(-3F, -3.5F, -2F, 6, 1, 1, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		rightFrontWheelModel[37].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[38].addShapeBox(-0.5F, -7F, -2F, 1, 3, 1, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 598
		rightFrontWheelModel[38].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[39].addShapeBox(-2.5F, -7F, -2F, 1, 4, 1, 0F,2F, 0.6F, 0F, -2F, 0.8F, 0F, -2F, 0.6F, 0F, 2F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0.2F, 0F); // Box 599
		rightFrontWheelModel[39].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[40].addShapeBox(-3.5F, -4F, -2F, 1, 2, 1, 0F,3.4F, -0.2F, 0F, -4.2F, 0.6F, 0F, -4.2F, 0.6F, 0F, 3.4F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F); // Box 600
		rightFrontWheelModel[40].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[41].addBox(-7F, -1.5F, -2F, 4, 1, 1, 0F); // Box 601
		rightFrontWheelModel[41].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[42].addShapeBox(-3.5F, 1F, -2F, 1, 2, 1, 0F,-0.4F, 0.9F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0F, 0F, -0.6F, 0.9F, 0F, 3.6F, -0.8F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 3.6F, -0.8F, 0F); // Box 602
		rightFrontWheelModel[42].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[43].addShapeBox(-5F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Box 603
		rightFrontWheelModel[43].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[44].addShapeBox(-5.5F, 6.6F, -3F, 11, 1, 5, 0F,-0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F); // Box 604
		rightFrontWheelModel[44].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[45].addShapeBox(4F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 605
		rightFrontWheelModel[45].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[46].addShapeBox(5F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F); // Box 606
		rightFrontWheelModel[46].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[47].addShapeBox(-4.5F, 7.6F, -3F, 9, 1, 5, 0F,0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F); // Box 607
		rightFrontWheelModel[47].setRotationPoint(72F, 1.5F, -22.5F);

		rightFrontWheelModel[48].addShapeBox(-3.5F, -8.5F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 608
		rightFrontWheelModel[48].setRotationPoint(72F, 1.5F, -22.5F);
		rightFrontWheelModel[48].rotateAngleZ = 3.14159265F;

		rightFrontWheelModel[49].addShapeBox(-6F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.6F, 0F); // Box 609
		rightFrontWheelModel[49].setRotationPoint(72F, 1.5F, -22.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 460
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 461
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 462
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 463
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 464
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 465
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 466
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 467
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 468
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 469
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 470
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 471
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 472
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 473
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 474
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 475
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 476
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 477
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 478
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 479
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 480
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 481
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 482
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 483
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 484
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 485
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 486
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 487
		leftBackWheelModel[28] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 488
		leftBackWheelModel[29] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 489
		leftBackWheelModel[30] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 490
		leftBackWheelModel[31] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 491
		leftBackWheelModel[32] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 492
		leftBackWheelModel[33] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 493
		leftBackWheelModel[34] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 494
		leftBackWheelModel[35] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 495
		leftBackWheelModel[36] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 496
		leftBackWheelModel[37] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 497
		leftBackWheelModel[38] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 498
		leftBackWheelModel[39] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 499
		leftBackWheelModel[40] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 500
		leftBackWheelModel[41] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 501
		leftBackWheelModel[42] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 502
		leftBackWheelModel[43] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 503
		leftBackWheelModel[44] = new ModelRendererTurbo(this, 889, 105, textureX, textureY); // Box 504
		leftBackWheelModel[45] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 505
		leftBackWheelModel[46] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 506
		leftBackWheelModel[47] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 507
		leftBackWheelModel[48] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 508
		leftBackWheelModel[49] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 509

		leftBackWheelModel[0].addShapeBox(-3.5F, -9.4F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 460
		leftBackWheelModel[0].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[1].addShapeBox(4F, -8.5F, -3F, 1, 1, 5, 0F,0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.6F, -0.3F, 0F, -1.6F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 461
		leftBackWheelModel[1].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[2].addShapeBox(7F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 462
		leftBackWheelModel[2].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[3].addShapeBox(8F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		leftBackWheelModel[3].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[4].addBox(8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 464
		leftBackWheelModel[4].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[5].addBox(7F, -2.5F, -3F, 1, 4, 5, 0F); // Box 465
		leftBackWheelModel[5].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[6].addShapeBox(7F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		leftBackWheelModel[6].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[7].addShapeBox(6F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 467
		leftBackWheelModel[7].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[8].addShapeBox(4F, -7.5F, -3F, 1, 1, 5, 0F,0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 468
		leftBackWheelModel[8].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[9].addShapeBox(-5.5F, -8.4F, -3F, 11, 1, 5, 0F,-2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F); // Box 469
		leftBackWheelModel[9].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[10].addShapeBox(-0.5F, -7F, -1F, 1, 3, 1, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 470
		leftBackWheelModel[10].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[11].addShapeBox(-2.5F, -7F, -1F, 1, 4, 1, 0F,2F, 0.6F, 0F, -2F, 0.8F, 0F, -2F, 0.6F, 0F, 2F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0.2F, 0F); // Box 471
		leftBackWheelModel[11].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[12].addShapeBox(-5F, -7.5F, -3F, 1, 1, 5, 0F,-0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 472
		leftBackWheelModel[12].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[13].addShapeBox(-7F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 473
		leftBackWheelModel[13].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[14].addShapeBox(-8F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		leftBackWheelModel[14].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[15].addBox(-8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 475
		leftBackWheelModel[15].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[16].addShapeBox(-8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 476
		leftBackWheelModel[16].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[17].addShapeBox(-7F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 477
		leftBackWheelModel[17].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[18].addShapeBox(-5F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Box 478
		leftBackWheelModel[18].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[19].addShapeBox(-5.5F, 6.6F, -3F, 11, 1, 5, 0F,-0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F); // Box 479
		leftBackWheelModel[19].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[20].addShapeBox(4F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 480
		leftBackWheelModel[20].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[21].addShapeBox(6F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 481
		leftBackWheelModel[21].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[22].addShapeBox(7F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 482
		leftBackWheelModel[22].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[23].addShapeBox(8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 483
		leftBackWheelModel[23].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[24].addShapeBox(7F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 484
		leftBackWheelModel[24].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[25].addShapeBox(5F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F); // Box 485
		leftBackWheelModel[25].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[26].addShapeBox(-2F, 2.5F, -1F, 4, 1, 1, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F); // Box 486
		leftBackWheelModel[26].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[27].addShapeBox(-0.5F, 3F, -1F, 1, 3, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 487
		leftBackWheelModel[27].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[28].addBox(-3F, -2.5F, -1F, 6, 4, 1, 0F); // Box 488
		leftBackWheelModel[28].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[29].addShapeBox(-3F, 1.5F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 489
		leftBackWheelModel[29].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[30].addShapeBox(-3F, -3.5F, -1F, 6, 1, 1, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		leftBackWheelModel[30].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[31].addShapeBox(-2F, -4.5F, -1F, 4, 1, 1, 0F,-1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F); // Box 491
		leftBackWheelModel[31].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[32].addShapeBox(1.5F, -7F, -1F, 1, 4, 1, 0F,-1.8F, 0.6F, 0F, 1.8F, 0.4F, 0F, 1.8F, 0.4F, 0F, -1.8F, 0.6F, 0F, 0F, -0.4F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.4F, 0F); // Box 492
		leftBackWheelModel[32].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[33].addShapeBox(2.5F, -4F, -1F, 1, 2, 1, 0F,-3.9F, 1.2F, 0F, 3.4F, 0.4F, 0F, 3.4F, 0.4F, 0F, -3.9F, 1.2F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.6F, 0F); // Box 493
		leftBackWheelModel[33].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[34].addBox(3F, -1.5F, -1F, 4, 1, 1, 0F); // Box 494
		leftBackWheelModel[34].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[35].addShapeBox(2.5F, 1F, -1F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, 0.2F, 0F, -4.2F, 0F, 0F, 3.6F, -0.8F, 0F, 3.6F, -0.8F, 0F, -4.2F, 0F, 0F); // Box 495
		leftBackWheelModel[35].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[36].addShapeBox(1.5F, 2F, -1F, 1, 4, 1, 0F,0F, -0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -0.4F, 0F, -2F, 1F, 0F, 1.8F, 0.6F, 0F, 1.8F, 0.6F, 0F, -2F, 0.8F, 0F); // Box 496
		leftBackWheelModel[36].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[37].addShapeBox(-2.5F, 2F, -1F, 1, 4, 1, 0F,-0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.2F, 0F, 2.4F, 0.2F, 0F, -2.6F, 0.6F, 0F, -2.6F, 0.4F, 0F, 2.4F, 0F, 0F); // Box 497
		leftBackWheelModel[37].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[38].addShapeBox(-3.5F, 1F, -1F, 1, 2, 1, 0F,-0.4F, 0.9F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0F, 0F, -0.6F, 0.9F, 0F, 3.6F, -0.8F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 3.6F, -0.8F, 0F); // Box 498
		leftBackWheelModel[38].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[39].addBox(-7F, -1.5F, -1F, 4, 1, 1, 0F); // Box 499
		leftBackWheelModel[39].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[40].addShapeBox(-3.5F, -4F, -1F, 1, 2, 1, 0F,3.4F, -0.2F, 0F, -4.2F, 0.6F, 0F, -4.2F, 0.6F, 0F, 3.4F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F); // Box 500
		leftBackWheelModel[40].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[41].addShapeBox(-6F, -8.5F, -3F, 1, 2, 5, 0F,-1.2F, -0.3F, 0F, 1.4F, -0.3F, 0F, 1.4F, -0.3F, 0F, -1.2F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 501
		leftBackWheelModel[41].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[42].addShapeBox(-8F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 502
		leftBackWheelModel[42].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[43].addShapeBox(-9F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		leftBackWheelModel[43].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[44].addBox(-9F, -2.5F, -3F, 1, 4, 5, 0F); // Box 504
		leftBackWheelModel[44].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[45].addShapeBox(-9F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 505
		leftBackWheelModel[45].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[46].addShapeBox(-8F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 506
		leftBackWheelModel[46].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[47].addShapeBox(-6F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.6F, 0F); // Box 507
		leftBackWheelModel[47].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[48].addShapeBox(-4.5F, 7.6F, -3F, 9, 1, 5, 0F,0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F); // Box 508
		leftBackWheelModel[48].setRotationPoint(0F, 1.5F, 26F);

		leftBackWheelModel[49].addShapeBox(-3.5F, -8.5F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 509
		leftBackWheelModel[49].setRotationPoint(0F, 1.5F, 26F);
		leftBackWheelModel[49].rotateAngleZ = 3.14159265F;
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 510
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 511
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 512
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 513
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 514
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 515
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 516
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 517
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 518
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 519
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 520
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 521
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 522
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 523
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 524
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 525
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 526
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 527
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 528
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 529
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 530
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 531
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 532
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 533
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 534
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 535
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 536
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 537
		rightBackWheelModel[28] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 538
		rightBackWheelModel[29] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 539
		rightBackWheelModel[30] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 540
		rightBackWheelModel[31] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 541
		rightBackWheelModel[32] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 542
		rightBackWheelModel[33] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 543
		rightBackWheelModel[34] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 544
		rightBackWheelModel[35] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 545
		rightBackWheelModel[36] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 546
		rightBackWheelModel[37] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 547
		rightBackWheelModel[38] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 548
		rightBackWheelModel[39] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 549
		rightBackWheelModel[40] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 550
		rightBackWheelModel[41] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 551
		rightBackWheelModel[42] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 552
		rightBackWheelModel[43] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 553
		rightBackWheelModel[44] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 554
		rightBackWheelModel[45] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 555
		rightBackWheelModel[46] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 556
		rightBackWheelModel[47] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 557
		rightBackWheelModel[48] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 558
		rightBackWheelModel[49] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 559

		rightBackWheelModel[0].addShapeBox(-3.5F, -9.4F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 510
		rightBackWheelModel[0].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[1].addShapeBox(-6F, -8.5F, -3F, 1, 2, 5, 0F,-1.2F, -0.3F, 0F, 1.4F, -0.3F, 0F, 1.4F, -0.3F, 0F, -1.2F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 511
		rightBackWheelModel[1].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[2].addShapeBox(-8F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 512
		rightBackWheelModel[2].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[3].addShapeBox(-9F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		rightBackWheelModel[3].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[4].addBox(-9F, -2.5F, -3F, 1, 4, 5, 0F); // Box 514
		rightBackWheelModel[4].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[5].addShapeBox(-9F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 515
		rightBackWheelModel[5].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[6].addShapeBox(-8F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 516
		rightBackWheelModel[6].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[7].addShapeBox(-7F, 3.5F, -3F, 1, 2, 5, 0F,0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 517
		rightBackWheelModel[7].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[8].addShapeBox(-8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 518
		rightBackWheelModel[8].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[9].addBox(-8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 519
		rightBackWheelModel[9].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[10].addShapeBox(-8F, -4.5F, -3F, 1, 2, 5, 0F,-0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		rightBackWheelModel[10].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[11].addShapeBox(-7F, -6.5F, -3F, 1, 2, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 521
		rightBackWheelModel[11].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[12].addShapeBox(-5F, -7.5F, -3F, 1, 1, 5, 0F,-0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 522
		rightBackWheelModel[12].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[13].addShapeBox(-5.5F, -8.4F, -3F, 11, 1, 5, 0F,-2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F, -0.9F, -0.1F, 0F); // Box 523
		rightBackWheelModel[13].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[14].addShapeBox(4F, -8.5F, -3F, 1, 1, 5, 0F,0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.6F, -0.3F, 0F, -1.6F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 524
		rightBackWheelModel[14].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[15].addShapeBox(7F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 525
		rightBackWheelModel[15].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[16].addShapeBox(8F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		rightBackWheelModel[16].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[17].addBox(8F, -2.5F, -3F, 1, 4, 5, 0F); // Box 527
		rightBackWheelModel[17].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[18].addShapeBox(8F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 528
		rightBackWheelModel[18].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[19].addShapeBox(7F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 529
		rightBackWheelModel[19].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[20].addShapeBox(6F, 3.5F, -3F, 1, 2, 5, 0F,-0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 530
		rightBackWheelModel[20].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[21].addShapeBox(7F, 1.5F, -3F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 531
		rightBackWheelModel[21].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[22].addBox(7F, -2.5F, -3F, 1, 4, 5, 0F); // Box 532
		rightBackWheelModel[22].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[23].addShapeBox(7F, -4.5F, -3F, 1, 2, 5, 0F,0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightBackWheelModel[23].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[24].addShapeBox(6F, -6.5F, -3F, 1, 2, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 534
		rightBackWheelModel[24].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[25].addShapeBox(4F, -7.5F, -3F, 1, 1, 5, 0F,0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 535
		rightBackWheelModel[25].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[26].addShapeBox(1.5F, -7F, -1F, 1, 4, 1, 0F,-1.8F, 0.6F, 0F, 1.8F, 0.4F, 0F, 1.8F, 0.4F, 0F, -1.8F, 0.6F, 0F, 0F, -0.4F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.4F, 0F); // Box 536
		rightBackWheelModel[26].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[27].addShapeBox(2.5F, -4F, -1F, 1, 2, 1, 0F,-3.9F, 1.2F, 0F, 3.4F, 0.4F, 0F, 3.4F, 0.4F, 0F, -3.9F, 1.2F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.6F, 0F); // Box 537
		rightBackWheelModel[27].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[28].addBox(3F, -1.5F, -1F, 4, 1, 1, 0F); // Box 538
		rightBackWheelModel[28].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[29].addShapeBox(2.5F, 1F, -1F, 1, 2, 1, 0F,0F, 0.2F, 0F, -0.6F, 1F, 0F, -0.6F, 1F, 0F, 0F, 0.2F, 0F, -4.2F, 0F, 0F, 3.6F, -0.8F, 0F, 3.6F, -0.8F, 0F, -4.2F, 0F, 0F); // Box 539
		rightBackWheelModel[29].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[30].addShapeBox(1.5F, 2F, -1F, 1, 4, 1, 0F,0F, -0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, -0.4F, 0F, -2F, 1F, 0F, 1.8F, 0.6F, 0F, 1.8F, 0.6F, 0F, -2F, 0.8F, 0F); // Box 540
		rightBackWheelModel[30].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[31].addShapeBox(-0.5F, 3F, -1F, 1, 3, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 541
		rightBackWheelModel[31].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[32].addShapeBox(-2.5F, 2F, -1F, 1, 4, 1, 0F,-0.2F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.2F, 0F, 2.4F, 0.2F, 0F, -2.6F, 0.6F, 0F, -2.6F, 0.4F, 0F, 2.4F, 0F, 0F); // Box 542
		rightBackWheelModel[32].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[33].addShapeBox(-2F, 2.5F, -1F, 4, 1, 1, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F, -1.2F, -0.7F, 0F); // Box 543
		rightBackWheelModel[33].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[34].addShapeBox(-3F, 1.5F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F); // Box 544
		rightBackWheelModel[34].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[35].addBox(-3F, -2.5F, -1F, 6, 4, 1, 0F); // Box 545
		rightBackWheelModel[35].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[36].addShapeBox(-2F, -4.5F, -1F, 4, 1, 1, 0F,-1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -1.6F, -0.7F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, 0F); // Box 546
		rightBackWheelModel[36].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[37].addShapeBox(-3F, -3.5F, -1F, 6, 1, 1, 0F,-1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightBackWheelModel[37].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[38].addShapeBox(-0.5F, -7F, -1F, 1, 3, 1, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 548
		rightBackWheelModel[38].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[39].addShapeBox(-2.5F, -7F, -1F, 1, 4, 1, 0F,2F, 0.6F, 0F, -2F, 0.8F, 0F, -2F, 0.6F, 0F, 2F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, 0.2F, 0F); // Box 549
		rightBackWheelModel[39].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[40].addShapeBox(-3.5F, -4F, -1F, 1, 2, 1, 0F,3.4F, -0.2F, 0F, -4.2F, 0.6F, 0F, -4.2F, 0.6F, 0F, 3.4F, -0.2F, 0F, -0.5F, 0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.6F, 0F, -0.5F, 0.2F, 0F); // Box 550
		rightBackWheelModel[40].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[41].addBox(-7F, -1.5F, -1F, 4, 1, 1, 0F); // Box 551
		rightBackWheelModel[41].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[42].addShapeBox(-3.5F, 1F, -1F, 1, 2, 1, 0F,-0.4F, 0.9F, 0F, -0.2F, -0.2F, 0F, -0.4F, 0F, 0F, -0.6F, 0.9F, 0F, 3.6F, -0.8F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 3.6F, -0.8F, 0F); // Box 552
		rightBackWheelModel[42].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[43].addShapeBox(-5F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Box 553
		rightBackWheelModel[43].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[44].addShapeBox(-5.5F, 6.6F, -3F, 11, 1, 5, 0F,-0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F, -2.2F, -0.6F, 0F); // Box 554
		rightBackWheelModel[44].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[45].addShapeBox(4F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 555
		rightBackWheelModel[45].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[46].addShapeBox(5F, 5.5F, -3F, 1, 1, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F); // Box 556
		rightBackWheelModel[46].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[47].addShapeBox(-4.5F, 7.6F, -3F, 9, 1, 5, 0F,0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, 0.8F, 0.6F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F, -0.6F, -1.2F, 0F); // Box 557
		rightBackWheelModel[47].setRotationPoint(0F, 1.5F, -26F);

		rightBackWheelModel[48].addShapeBox(-3.5F, -8.5F, -3F, 7, 1, 5, 0F,-1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, -1.4F, -0.2F, 0F, 1.3F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.3F, 0.2F, 0F); // Box 558
		rightBackWheelModel[48].setRotationPoint(0F, 1.5F, -26F);
		rightBackWheelModel[48].rotateAngleZ = 3.14159265F;

		rightBackWheelModel[49].addShapeBox(-6F, 5.5F, -3F, 1, 1, 5, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.8F, 0.6F, 0F, 1.6F, 0.6F, 0F, 1.6F, 0.6F, 0F, -0.8F, 0.6F, 0F); // Box 559
		rightBackWheelModel[49].setRotationPoint(0F, 1.5F, -26F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 419, 34, textureX, textureY); // Box 480
		steeringWheelModel[1] = new ModelRendererTurbo(this, 423, 83, textureX, textureY); // Box 481
		steeringWheelModel[2] = new ModelRendererTurbo(this, 462, 65, textureX, textureY); // Box 482
		steeringWheelModel[3] = new ModelRendererTurbo(this, 448, 100, textureX, textureY); // Box 483
		steeringWheelModel[4] = new ModelRendererTurbo(this, 382, 35, textureX, textureY); // Box 484
		steeringWheelModel[5] = new ModelRendererTurbo(this, 467, 98, textureX, textureY); // Box 485
		steeringWheelModel[6] = new ModelRendererTurbo(this, 475, 98, textureX, textureY); // Box 486
		steeringWheelModel[7] = new ModelRendererTurbo(this, 461, 99, textureX, textureY); // Box 487
		steeringWheelModel[8] = new ModelRendererTurbo(this, 420, 83, textureX, textureY); // Box 488

		steeringWheelModel[0].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		steeringWheelModel[0].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[1].addShapeBox(0F, -0.5F, -4.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		steeringWheelModel[1].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[2].addShapeBox(0F, 0.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		steeringWheelModel[2].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[3].addShapeBox(0F, -4.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		steeringWheelModel[3].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[4].addShapeBox(0F, -4.5F, 3.5F, 1, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		steeringWheelModel[4].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[5].addShapeBox(0F, -4.5F, -4.5F, 1, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		steeringWheelModel[5].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[6].addShapeBox(0F, 0.5F, -4.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 486
		steeringWheelModel[6].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[7].addShapeBox(0F, 0.5F, 3.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 487
		steeringWheelModel[7].setRotationPoint(72F, -22F, 7F);

		steeringWheelModel[8].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		steeringWheelModel[8].setRotationPoint(72F, -22F, 7F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[13];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 7
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 80, 222, textureX, textureY); // Box 8
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 84, 201, textureX, textureY); // Box 10
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 26, 205, textureX, textureY); // Box 11
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 54, 205, textureX, textureY); // Box 12
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 14, 224, textureX, textureY); // Box 38
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 60, 213, textureX, textureY); // Box 39
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 41, 213, textureX, textureY); // Box 42
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 34, 229, textureX, textureY); // Box 0
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 71, 203, textureX, textureY); // Box 0
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 330, 213, textureX, textureY); // Box 107
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 379, 213, textureX, textureY); // Box 108
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 357, 226, textureX, textureY); // Box 109

		gun_2_Model[0][0].addShapeBox(5F, 0F, 2.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_2_Model[0][1].addShapeBox(5F, -7F, -7.5F, 1, 13, 4, 0F,4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_2_Model[0][2].addShapeBox(5F, -7F, -3.5F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_2_Model[0][3].addShapeBox(5F, -7F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11

		gun_2_Model[0][4].addShapeBox(5F, 4F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_2_Model[0][5].addShapeBox(-4F, -7F, 6.5F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38

		gun_2_Model[0][6].addShapeBox(5F, -7F, 3.5F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F); // Box 39

		gun_2_Model[0][7].addShapeBox(5F, -7F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_2_Model[0][8].addShapeBox(5F, -7F, 1.5F, 1, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][9].addShapeBox(-9F, -7F, 5.5F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F); // Box 0

		gun_2_Model[0][10].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 107

		gun_2_Model[0][11].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 108

		gun_2_Model[0][12].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 109

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(32F, -22F, -22F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[86];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 0
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 19, 187, textureX, textureY); // Box 0
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 11, 187, textureX, textureY); // Box 0
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 27, 187, textureX, textureY); // Box 0
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 35, 187, textureX, textureY); // Box 0
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 43, 187, textureX, textureY); // Box 0
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 51, 187, textureX, textureY); // Box 0
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 59, 187, textureX, textureY); // Box 0
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 67, 187, textureX, textureY); // Box 0
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 75, 187, textureX, textureY); // Box 0
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // Box 0
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 107, 187, textureX, textureY); // Box 0
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 115, 187, textureX, textureY); // Box 0
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 123, 187, textureX, textureY); // Box 0
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 131, 187, textureX, textureY); // Box 0
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 139, 187, textureX, textureY); // Box 0
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 147, 187, textureX, textureY); // Box 0
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 155, 187, textureX, textureY); // Box 0
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 171, 187, textureX, textureY); // Box 0
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 179, 187, textureX, textureY); // Box 0
		gun_2_Model[1][20] = new ModelRendererTurbo(this, 187, 187, textureX, textureY); // Box 0
		gun_2_Model[1][21] = new ModelRendererTurbo(this, 195, 187, textureX, textureY); // Box 0
		gun_2_Model[1][22] = new ModelRendererTurbo(this, 203, 187, textureX, textureY); // Box 0
		gun_2_Model[1][23] = new ModelRendererTurbo(this, 211, 187, textureX, textureY); // Box 0
		gun_2_Model[1][24] = new ModelRendererTurbo(this, 219, 187, textureX, textureY); // Box 0
		gun_2_Model[1][25] = new ModelRendererTurbo(this, 227, 187, textureX, textureY); // Box 0
		gun_2_Model[1][26] = new ModelRendererTurbo(this, 235, 187, textureX, textureY); // Box 0
		gun_2_Model[1][27] = new ModelRendererTurbo(this, 243, 187, textureX, textureY); // Box 1
		gun_2_Model[1][28] = new ModelRendererTurbo(this, 251, 187, textureX, textureY); // Box 2
		gun_2_Model[1][29] = new ModelRendererTurbo(this, 259, 187, textureX, textureY); // Box 3
		gun_2_Model[1][30] = new ModelRendererTurbo(this, 267, 187, textureX, textureY); // Box 4
		gun_2_Model[1][31] = new ModelRendererTurbo(this, 275, 187, textureX, textureY); // Box 5
		gun_2_Model[1][32] = new ModelRendererTurbo(this, 283, 187, textureX, textureY); // Box 6
		gun_2_Model[1][33] = new ModelRendererTurbo(this, 291, 187, textureX, textureY); // Box 7
		gun_2_Model[1][34] = new ModelRendererTurbo(this, 299, 187, textureX, textureY); // Box 8
		gun_2_Model[1][35] = new ModelRendererTurbo(this, 307, 187, textureX, textureY); // Box 9
		gun_2_Model[1][36] = new ModelRendererTurbo(this, 315, 187, textureX, textureY); // Box 10
		gun_2_Model[1][37] = new ModelRendererTurbo(this, 323, 187, textureX, textureY); // Box 11
		gun_2_Model[1][38] = new ModelRendererTurbo(this, 331, 187, textureX, textureY); // Box 12
		gun_2_Model[1][39] = new ModelRendererTurbo(this, 339, 187, textureX, textureY); // Box 13
		gun_2_Model[1][40] = new ModelRendererTurbo(this, 347, 187, textureX, textureY); // Box 14
		gun_2_Model[1][41] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 15
		gun_2_Model[1][42] = new ModelRendererTurbo(this, 379, 187, textureX, textureY); // Box 16
		gun_2_Model[1][43] = new ModelRendererTurbo(this, 355, 187, textureX, textureY); // Box 17
		gun_2_Model[1][44] = new ModelRendererTurbo(this, 371, 187, textureX, textureY); // Box 18
		gun_2_Model[1][45] = new ModelRendererTurbo(this, 387, 187, textureX, textureY); // Box 19
		gun_2_Model[1][46] = new ModelRendererTurbo(this, 395, 187, textureX, textureY); // Box 0
		gun_2_Model[1][47] = new ModelRendererTurbo(this, 411, 187, textureX, textureY); // Box 1
		gun_2_Model[1][48] = new ModelRendererTurbo(this, 427, 187, textureX, textureY); // Box 2
		gun_2_Model[1][49] = new ModelRendererTurbo(this, 443, 187, textureX, textureY); // Box 3
		gun_2_Model[1][50] = new ModelRendererTurbo(this, 459, 187, textureX, textureY); // Box 4
		gun_2_Model[1][51] = new ModelRendererTurbo(this, 3, 195, textureX, textureY); // Box 5
		gun_2_Model[1][52] = new ModelRendererTurbo(this, 35, 195, textureX, textureY); // Box 6
		gun_2_Model[1][53] = new ModelRendererTurbo(this, 491, 187, textureX, textureY); // Box 7
		gun_2_Model[1][54] = new ModelRendererTurbo(this, 67, 195, textureX, textureY); // Box 9
		gun_2_Model[1][55] = new ModelRendererTurbo(this, 91, 195, textureX, textureY); // Box 13
		gun_2_Model[1][56] = new ModelRendererTurbo(this, 123, 195, textureX, textureY); // Box 14
		gun_2_Model[1][57] = new ModelRendererTurbo(this, 155, 195, textureX, textureY); // Box 16
		gun_2_Model[1][58] = new ModelRendererTurbo(this, 179, 195, textureX, textureY); // Box 17
		gun_2_Model[1][59] = new ModelRendererTurbo(this, 203, 195, textureX, textureY); // Box 18
		gun_2_Model[1][60] = new ModelRendererTurbo(this, 403, 187, textureX, textureY); // Box 19
		gun_2_Model[1][61] = new ModelRendererTurbo(this, 419, 187, textureX, textureY); // Box 20
		gun_2_Model[1][62] = new ModelRendererTurbo(this, 227, 195, textureX, textureY); // Box 21
		gun_2_Model[1][63] = new ModelRendererTurbo(this, 37, 205, textureX, textureY); // Box 47
		gun_2_Model[1][64] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 72
		gun_2_Model[1][65] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 74
		gun_2_Model[1][66] = new ModelRendererTurbo(this, 46, 203, textureX, textureY); // Box 113
		gun_2_Model[1][67] = new ModelRendererTurbo(this, 33, 214, textureX, textureY); // Box 114
		gun_2_Model[1][68] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 115
		gun_2_Model[1][69] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 116
		gun_2_Model[1][70] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 117
		gun_2_Model[1][71] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 118
		gun_2_Model[1][72] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 119
		gun_2_Model[1][73] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 120
		gun_2_Model[1][74] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 121
		gun_2_Model[1][75] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 122
		gun_2_Model[1][76] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 123
		gun_2_Model[1][77] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 124
		gun_2_Model[1][78] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 125
		gun_2_Model[1][79] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 126
		gun_2_Model[1][80] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 127
		gun_2_Model[1][81] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 128
		gun_2_Model[1][82] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 129
		gun_2_Model[1][83] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 130
		gun_2_Model[1][84] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 131
		gun_2_Model[1][85] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 132

		gun_2_Model[1][0].addShapeBox(5.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 0

		gun_2_Model[1][1].addShapeBox(5.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 0

		gun_2_Model[1][2].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][3].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_2_Model[1][4].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_2_Model[1][5].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_2_Model[1][6].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][7].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_2_Model[1][8].addShapeBox(16.25F, 1.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_2_Model[1][9].addShapeBox(4F, -0.5F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][10].addShapeBox(-3.5F, -0.5F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][11].addShapeBox(3F, -0.5F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_2_Model[1][12].addShapeBox(3F, 1F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 0

		gun_2_Model[1][13].addShapeBox(-2.5F, -1.2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_2_Model[1][14].addShapeBox(-2.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_2_Model[1][15].addShapeBox(-2.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_2_Model[1][16].addShapeBox(-4.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_2_Model[1][17].addShapeBox(-1.5F, 1.55F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_2_Model[1][18].addShapeBox(-1.9F, 1.15F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_2_Model[1][19].addShapeBox(-1.9F, 1.15F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_2_Model[1][20].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 0

		gun_2_Model[1][21].addShapeBox(-5.5F, 0F, 1F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 0

		gun_2_Model[1][22].addShapeBox(-4.5F, 0F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][23].addShapeBox(-4.5F, 2F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][24].addShapeBox(-4.5F, 2F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[1][25].addShapeBox(-4.5F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_2_Model[1][26].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 0

		gun_2_Model[1][27].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 1

		gun_2_Model[1][28].addShapeBox(-5.5F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 2

		gun_2_Model[1][29].addShapeBox(-5.5F, 2F, 1F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 3

		gun_2_Model[1][30].addShapeBox(-5.5F, 2F, 1F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 4

		gun_2_Model[1][31].addShapeBox(-5.5F, 2F, -2F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 5

		gun_2_Model[1][32].addShapeBox(-5.5F, 2F, -2F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 6

		gun_2_Model[1][33].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 7

		gun_2_Model[1][34].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 8

		gun_2_Model[1][35].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 9

		gun_2_Model[1][36].addShapeBox(-5.5F, 0F, -2F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 10

		gun_2_Model[1][37].addShapeBox(-5.5F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 11

		gun_2_Model[1][38].addShapeBox(0F, 1.35F, -2F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 12

		gun_2_Model[1][39].addShapeBox(-1F, 1.35F, -2.1F, 1, 1, 1, 0F,0.1F, 0.9F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, 0.9F, -0.4F, 0.1F, -1.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -1.1F, -0.4F); // Box 13

		gun_2_Model[1][40].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 14

		gun_2_Model[1][41].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 15

		gun_2_Model[1][42].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 16

		gun_2_Model[1][43].addShapeBox(-2F, 0.35F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F); // Box 17

		gun_2_Model[1][44].addShapeBox(0F, 1.35F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F); // Box 18

		gun_2_Model[1][45].addShapeBox(-1.7F, 0.35F, -2.1F, 1, 1, 1, 0F,0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 19

		gun_2_Model[1][46].addShapeBox(5.5F, 1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 0

		gun_2_Model[1][47].addShapeBox(16.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 1

		gun_2_Model[1][48].addShapeBox(16.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 2

		gun_2_Model[1][49].addShapeBox(16.5F, 1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 3

		gun_2_Model[1][50].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 4

		gun_2_Model[1][51].addShapeBox(6.5F, -0.4F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 5

		gun_2_Model[1][52].addShapeBox(6.5F, 0.4F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 6

		gun_2_Model[1][53].addShapeBox(6.5F, -1F, -0.1F, 10, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 7

		gun_2_Model[1][54].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 9

		gun_2_Model[1][55].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F); // Box 13

		gun_2_Model[1][56].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 14

		gun_2_Model[1][57].addShapeBox(6.5F, -1F, -0.9F, 10, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 16

		gun_2_Model[1][58].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F); // Box 17

		gun_2_Model[1][59].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F); // Box 18

		gun_2_Model[1][60].addShapeBox(16.25F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 19

		gun_2_Model[1][61].addShapeBox(16.25F, -2.2F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 20

		gun_2_Model[1][62].addShapeBox(-3.5F, -1F, -0.5F, 6, 1, 1, 0F,-0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 21

		gun_2_Model[1][63].addShapeBox(2.3F, 0.3F, -2F, 2, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 47

		gun_2_Model[1][64].addShapeBox(3.35F, 0.35F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 72

		gun_2_Model[1][65].addShapeBox(2.35F, 0.35F, -1.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 74

		gun_2_Model[1][66].addShapeBox(2.3F, 0.3F, -2.8F, 2, 1, 1, 0F,-0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 113

		gun_2_Model[1][67].addShapeBox(2.3F, 1.3F, -3.6F, 2, 1, 1, 0F,-0.5F, -7.75F, -0.5F, -0.5F, -7.75F, -0.5F, -0.5F, -1.25F, -0.2F, -0.5F, -1.25F, -0.2F, -0.5F, 6.75F, -1F, -0.5F, 6.75F, -1F, -0.5F, -0.75F, 0.3F, -0.5F, -0.75F, 0.3F); // Box 114

		gun_2_Model[1][68].addShapeBox(2.35F, 0.7F, -2.2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 115

		gun_2_Model[1][69].addShapeBox(3.35F, 0.7F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 116

		gun_2_Model[1][70].addShapeBox(2.35F, 1.4F, -2.7F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 117

		gun_2_Model[1][71].addShapeBox(3.35F, 1.4F, -2.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 118

		gun_2_Model[1][72].addShapeBox(2.35F, 2.4F, -3.1F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 119

		gun_2_Model[1][73].addShapeBox(3.35F, 2.4F, -3.1F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 120

		gun_2_Model[1][74].addShapeBox(2.35F, 3.4F, -3.12F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 121

		gun_2_Model[1][75].addShapeBox(3.35F, 3.4F, -3.12F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 122

		gun_2_Model[1][76].addShapeBox(2.35F, 4.4F, -3.16F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 123

		gun_2_Model[1][77].addShapeBox(3.35F, 4.4F, -3.16F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 124

		gun_2_Model[1][78].addShapeBox(2.35F, 5.4F, -3.2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 125

		gun_2_Model[1][79].addShapeBox(3.35F, 5.4F, -3.2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 126

		gun_2_Model[1][80].addShapeBox(2.35F, 6.4F, -3.25F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 127

		gun_2_Model[1][81].addShapeBox(3.35F, 6.4F, -3.25F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 128

		gun_2_Model[1][82].addShapeBox(2.35F, 7.4F, -3.26F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 129

		gun_2_Model[1][83].addShapeBox(3.35F, 7.4F, -3.26F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 130

		gun_2_Model[1][84].addShapeBox(2.35F, 8.4F, -3.32F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 131

		gun_2_Model[1][85].addShapeBox(3.35F, 8.4F, -3.32F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 132

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(32F, -22F, -22F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[13];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 49, 220, textureX, textureY); // Box 7
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 80, 222, textureX, textureY); // Box 8
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 84, 201, textureX, textureY); // Box 10
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 26, 205, textureX, textureY); // Box 11
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 54, 205, textureX, textureY); // Box 12
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 45, 231, textureX, textureY); // Box 37
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 60, 213, textureX, textureY); // Box 39
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 41, 213, textureX, textureY); // Box 42
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 34, 229, textureX, textureY); // Box 0
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 14, 204, textureX, textureY); // Box 1
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 330, 213, textureX, textureY); // Box 107
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 379, 213, textureX, textureY); // Box 108
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 357, 226, textureX, textureY); // Box 109

		gun_3_Model[0][0].addShapeBox(5F, 0F, 2.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_3_Model[0][1].addShapeBox(5F, -7F, -7.5F, 1, 13, 4, 0F,4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_3_Model[0][2].addShapeBox(5F, -7F, -3.5F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 10

		gun_3_Model[0][3].addShapeBox(5F, -7F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11

		gun_3_Model[0][4].addShapeBox(5F, 4F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 12

		gun_3_Model[0][5].addShapeBox(-4F, -7F, -7.5F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_3_Model[0][6].addShapeBox(5F, -7F, 3.5F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F); // Box 39

		gun_3_Model[0][7].addShapeBox(5F, -7F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_3_Model[0][8].addShapeBox(5F, -7F, 1.5F, 1, 13, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[0][9].addShapeBox(-9F, -7F, -7.5F, 1, 13, 2, 0F,-5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		gun_3_Model[0][10].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 107

		gun_3_Model[0][11].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 108

		gun_3_Model[0][12].addShapeBox(-0.5F, 0.35F, -7F, 1, 1, 14, 0F,-0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 109

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(33F, -22F, 21F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[86];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 3, 187, textureX, textureY); // Box 0
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 19, 187, textureX, textureY); // Box 0
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 11, 187, textureX, textureY); // Box 0
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 27, 187, textureX, textureY); // Box 0
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 35, 187, textureX, textureY); // Box 0
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 43, 187, textureX, textureY); // Box 0
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 51, 187, textureX, textureY); // Box 0
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 59, 187, textureX, textureY); // Box 0
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 67, 187, textureX, textureY); // Box 0
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 75, 187, textureX, textureY); // Box 0
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 83, 187, textureX, textureY); // Box 0
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 107, 187, textureX, textureY); // Box 0
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 115, 187, textureX, textureY); // Box 0
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 123, 187, textureX, textureY); // Box 0
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 131, 187, textureX, textureY); // Box 0
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 139, 187, textureX, textureY); // Box 0
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 147, 187, textureX, textureY); // Box 0
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 155, 187, textureX, textureY); // Box 0
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 171, 187, textureX, textureY); // Box 0
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 179, 187, textureX, textureY); // Box 0
		gun_3_Model[1][20] = new ModelRendererTurbo(this, 187, 187, textureX, textureY); // Box 0
		gun_3_Model[1][21] = new ModelRendererTurbo(this, 195, 187, textureX, textureY); // Box 0
		gun_3_Model[1][22] = new ModelRendererTurbo(this, 203, 187, textureX, textureY); // Box 0
		gun_3_Model[1][23] = new ModelRendererTurbo(this, 211, 187, textureX, textureY); // Box 0
		gun_3_Model[1][24] = new ModelRendererTurbo(this, 219, 187, textureX, textureY); // Box 0
		gun_3_Model[1][25] = new ModelRendererTurbo(this, 227, 187, textureX, textureY); // Box 0
		gun_3_Model[1][26] = new ModelRendererTurbo(this, 235, 187, textureX, textureY); // Box 0
		gun_3_Model[1][27] = new ModelRendererTurbo(this, 243, 187, textureX, textureY); // Box 1
		gun_3_Model[1][28] = new ModelRendererTurbo(this, 251, 187, textureX, textureY); // Box 2
		gun_3_Model[1][29] = new ModelRendererTurbo(this, 259, 187, textureX, textureY); // Box 3
		gun_3_Model[1][30] = new ModelRendererTurbo(this, 267, 187, textureX, textureY); // Box 4
		gun_3_Model[1][31] = new ModelRendererTurbo(this, 275, 187, textureX, textureY); // Box 5
		gun_3_Model[1][32] = new ModelRendererTurbo(this, 283, 187, textureX, textureY); // Box 6
		gun_3_Model[1][33] = new ModelRendererTurbo(this, 291, 187, textureX, textureY); // Box 7
		gun_3_Model[1][34] = new ModelRendererTurbo(this, 299, 187, textureX, textureY); // Box 8
		gun_3_Model[1][35] = new ModelRendererTurbo(this, 307, 187, textureX, textureY); // Box 9
		gun_3_Model[1][36] = new ModelRendererTurbo(this, 315, 187, textureX, textureY); // Box 10
		gun_3_Model[1][37] = new ModelRendererTurbo(this, 323, 187, textureX, textureY); // Box 11
		gun_3_Model[1][38] = new ModelRendererTurbo(this, 331, 187, textureX, textureY); // Box 12
		gun_3_Model[1][39] = new ModelRendererTurbo(this, 339, 187, textureX, textureY); // Box 13
		gun_3_Model[1][40] = new ModelRendererTurbo(this, 347, 187, textureX, textureY); // Box 14
		gun_3_Model[1][41] = new ModelRendererTurbo(this, 363, 187, textureX, textureY); // Box 15
		gun_3_Model[1][42] = new ModelRendererTurbo(this, 379, 187, textureX, textureY); // Box 16
		gun_3_Model[1][43] = new ModelRendererTurbo(this, 355, 187, textureX, textureY); // Box 17
		gun_3_Model[1][44] = new ModelRendererTurbo(this, 371, 187, textureX, textureY); // Box 18
		gun_3_Model[1][45] = new ModelRendererTurbo(this, 387, 187, textureX, textureY); // Box 19
		gun_3_Model[1][46] = new ModelRendererTurbo(this, 395, 187, textureX, textureY); // Box 0
		gun_3_Model[1][47] = new ModelRendererTurbo(this, 411, 187, textureX, textureY); // Box 1
		gun_3_Model[1][48] = new ModelRendererTurbo(this, 427, 187, textureX, textureY); // Box 2
		gun_3_Model[1][49] = new ModelRendererTurbo(this, 443, 187, textureX, textureY); // Box 3
		gun_3_Model[1][50] = new ModelRendererTurbo(this, 459, 187, textureX, textureY); // Box 4
		gun_3_Model[1][51] = new ModelRendererTurbo(this, 3, 195, textureX, textureY); // Box 5
		gun_3_Model[1][52] = new ModelRendererTurbo(this, 35, 195, textureX, textureY); // Box 6
		gun_3_Model[1][53] = new ModelRendererTurbo(this, 491, 187, textureX, textureY); // Box 7
		gun_3_Model[1][54] = new ModelRendererTurbo(this, 67, 195, textureX, textureY); // Box 9
		gun_3_Model[1][55] = new ModelRendererTurbo(this, 91, 195, textureX, textureY); // Box 13
		gun_3_Model[1][56] = new ModelRendererTurbo(this, 123, 195, textureX, textureY); // Box 14
		gun_3_Model[1][57] = new ModelRendererTurbo(this, 155, 195, textureX, textureY); // Box 16
		gun_3_Model[1][58] = new ModelRendererTurbo(this, 179, 195, textureX, textureY); // Box 17
		gun_3_Model[1][59] = new ModelRendererTurbo(this, 203, 195, textureX, textureY); // Box 18
		gun_3_Model[1][60] = new ModelRendererTurbo(this, 403, 187, textureX, textureY); // Box 19
		gun_3_Model[1][61] = new ModelRendererTurbo(this, 419, 187, textureX, textureY); // Box 20
		gun_3_Model[1][62] = new ModelRendererTurbo(this, 227, 195, textureX, textureY); // Box 21
		gun_3_Model[1][63] = new ModelRendererTurbo(this, 37, 205, textureX, textureY); // Box 47
		gun_3_Model[1][64] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 72
		gun_3_Model[1][65] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 74
		gun_3_Model[1][66] = new ModelRendererTurbo(this, 46, 203, textureX, textureY); // Box 113
		gun_3_Model[1][67] = new ModelRendererTurbo(this, 33, 214, textureX, textureY); // Box 114
		gun_3_Model[1][68] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 115
		gun_3_Model[1][69] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 116
		gun_3_Model[1][70] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 117
		gun_3_Model[1][71] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 118
		gun_3_Model[1][72] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 119
		gun_3_Model[1][73] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 120
		gun_3_Model[1][74] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 121
		gun_3_Model[1][75] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 122
		gun_3_Model[1][76] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 123
		gun_3_Model[1][77] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 124
		gun_3_Model[1][78] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 125
		gun_3_Model[1][79] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 126
		gun_3_Model[1][80] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 127
		gun_3_Model[1][81] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 128
		gun_3_Model[1][82] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 129
		gun_3_Model[1][83] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 130
		gun_3_Model[1][84] = new ModelRendererTurbo(this, 49, 213, textureX, textureY); // Box 131
		gun_3_Model[1][85] = new ModelRendererTurbo(this, 47, 208, textureX, textureY); // Box 132

		gun_3_Model[1][0].addShapeBox(5.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 0

		gun_3_Model[1][1].addShapeBox(5.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 0

		gun_3_Model[1][2].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][3].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0

		gun_3_Model[1][4].addShapeBox(17.5F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0

		gun_3_Model[1][5].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0

		gun_3_Model[1][6].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][7].addShapeBox(16.5F, 0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0

		gun_3_Model[1][8].addShapeBox(16.25F, 1.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0

		gun_3_Model[1][9].addShapeBox(4F, -0.5F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][10].addShapeBox(-3.5F, -0.5F, -1F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][11].addShapeBox(3F, -0.5F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0

		gun_3_Model[1][12].addShapeBox(3F, 1F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 0

		gun_3_Model[1][13].addShapeBox(-2.5F, -1.2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_3_Model[1][14].addShapeBox(-2.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0

		gun_3_Model[1][15].addShapeBox(-2.5F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0

		gun_3_Model[1][16].addShapeBox(-4.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0

		gun_3_Model[1][17].addShapeBox(-1.5F, 1.55F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0

		gun_3_Model[1][18].addShapeBox(-1.9F, 1.15F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0

		gun_3_Model[1][19].addShapeBox(-1.9F, 1.15F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0

		gun_3_Model[1][20].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 0

		gun_3_Model[1][21].addShapeBox(-5.5F, 0F, 1F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 0

		gun_3_Model[1][22].addShapeBox(-4.5F, 0F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][23].addShapeBox(-4.5F, 2F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][24].addShapeBox(-4.5F, 2F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[1][25].addShapeBox(-4.5F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0

		gun_3_Model[1][26].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 0

		gun_3_Model[1][27].addShapeBox(-5.5F, 0F, 1F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 1

		gun_3_Model[1][28].addShapeBox(-5.5F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 2

		gun_3_Model[1][29].addShapeBox(-5.5F, 2F, 1F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 3

		gun_3_Model[1][30].addShapeBox(-5.5F, 2F, 1F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 4

		gun_3_Model[1][31].addShapeBox(-5.5F, 2F, -2F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 5

		gun_3_Model[1][32].addShapeBox(-5.5F, 2F, -2F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 6

		gun_3_Model[1][33].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 7

		gun_3_Model[1][34].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 8

		gun_3_Model[1][35].addShapeBox(-5.5F, 0F, -2F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 9

		gun_3_Model[1][36].addShapeBox(-5.5F, 0F, -2F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 10

		gun_3_Model[1][37].addShapeBox(-5.5F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 11

		gun_3_Model[1][38].addShapeBox(0F, 1.35F, -2F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 12

		gun_3_Model[1][39].addShapeBox(-1F, 1.35F, -2.1F, 1, 1, 1, 0F,0.1F, 0.9F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, 0.9F, -0.4F, 0.1F, -1.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -1.1F, -0.4F); // Box 13

		gun_3_Model[1][40].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 14

		gun_3_Model[1][41].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 15

		gun_3_Model[1][42].addShapeBox(-2F, 0.35F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 16

		gun_3_Model[1][43].addShapeBox(-2F, 0.35F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F); // Box 17

		gun_3_Model[1][44].addShapeBox(0F, 1.35F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F); // Box 18

		gun_3_Model[1][45].addShapeBox(-1.7F, 0.35F, -2.1F, 1, 1, 1, 0F,0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 19

		gun_3_Model[1][46].addShapeBox(5.5F, 1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 0

		gun_3_Model[1][47].addShapeBox(16.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 1

		gun_3_Model[1][48].addShapeBox(16.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 2

		gun_3_Model[1][49].addShapeBox(16.5F, 1F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 3

		gun_3_Model[1][50].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 4

		gun_3_Model[1][51].addShapeBox(6.5F, -0.4F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 5

		gun_3_Model[1][52].addShapeBox(6.5F, 0.4F, -1.5F, 10, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 6

		gun_3_Model[1][53].addShapeBox(6.5F, -1F, -0.1F, 10, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 7

		gun_3_Model[1][54].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 9

		gun_3_Model[1][55].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F); // Box 13

		gun_3_Model[1][56].addShapeBox(6.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 14

		gun_3_Model[1][57].addShapeBox(6.5F, -1F, -0.9F, 10, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 16

		gun_3_Model[1][58].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F); // Box 17

		gun_3_Model[1][59].addShapeBox(6.5F, -1F, -0.5F, 10, 3, 1, 0F,0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F); // Box 18

		gun_3_Model[1][60].addShapeBox(16.25F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 19

		gun_3_Model[1][61].addShapeBox(16.25F, -2.2F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 20

		gun_3_Model[1][62].addShapeBox(-3.5F, -1F, -0.5F, 6, 1, 1, 0F,-0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 21

		gun_3_Model[1][63].addShapeBox(2.3F, 0.3F, -2F, 2, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 47

		gun_3_Model[1][64].addShapeBox(3.35F, 0.35F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 72

		gun_3_Model[1][65].addShapeBox(2.35F, 0.35F, -1.5F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 74

		gun_3_Model[1][66].addShapeBox(2.3F, 0.3F, -2.8F, 2, 1, 1, 0F,-0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 113

		gun_3_Model[1][67].addShapeBox(2.3F, 1.3F, -3.6F, 2, 1, 1, 0F,-0.5F, -7.75F, -0.5F, -0.5F, -7.75F, -0.5F, -0.5F, -1.25F, -0.2F, -0.5F, -1.25F, -0.2F, -0.5F, 6.75F, -1F, -0.5F, 6.75F, -1F, -0.5F, -0.75F, 0.3F, -0.5F, -0.75F, 0.3F); // Box 114

		gun_3_Model[1][68].addShapeBox(2.35F, 0.7F, -2.2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 115

		gun_3_Model[1][69].addShapeBox(3.35F, 0.7F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 116

		gun_3_Model[1][70].addShapeBox(2.35F, 1.4F, -2.7F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 117

		gun_3_Model[1][71].addShapeBox(3.35F, 1.4F, -2.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 118

		gun_3_Model[1][72].addShapeBox(2.35F, 2.4F, -3.1F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 119

		gun_3_Model[1][73].addShapeBox(3.35F, 2.4F, -3.1F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 120

		gun_3_Model[1][74].addShapeBox(2.35F, 3.4F, -3.12F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 121

		gun_3_Model[1][75].addShapeBox(3.35F, 3.4F, -3.12F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 122

		gun_3_Model[1][76].addShapeBox(2.35F, 4.4F, -3.16F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 123

		gun_3_Model[1][77].addShapeBox(3.35F, 4.4F, -3.16F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 124

		gun_3_Model[1][78].addShapeBox(2.35F, 5.4F, -3.2F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 125

		gun_3_Model[1][79].addShapeBox(3.35F, 5.4F, -3.2F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 126

		gun_3_Model[1][80].addShapeBox(2.35F, 6.4F, -3.25F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 127

		gun_3_Model[1][81].addShapeBox(3.35F, 6.4F, -3.25F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 128

		gun_3_Model[1][82].addShapeBox(2.35F, 7.4F, -3.26F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 129

		gun_3_Model[1][83].addShapeBox(3.35F, 7.4F, -3.26F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 130

		gun_3_Model[1][84].addShapeBox(2.35F, 8.4F, -3.32F, 2, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.9F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 131

		gun_3_Model[1][85].addShapeBox(3.35F, 8.4F, -3.32F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.35F, -0.35F); // Box 132

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(33F, -22F, 21F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}