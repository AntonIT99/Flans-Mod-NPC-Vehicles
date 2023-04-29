//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.09.2016 - 20:09:40
// Last changed on: 13.09.2016 - 20:09:40

package com.wolffsmod.model.tankcraft; //Path where the model is located

import com.wolffsmod.model.ModelFlanVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelTCM60A1 extends ModelFlanVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;


	public ModelTCM60A1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[318];
		initBodyModel();


		turretModel = new ModelRendererTurbo[234];
		turretModel[0] = new ModelRendererTurbo(this, 250, 57, textureX, textureY); // Box 295
		turretModel[1] = new ModelRendererTurbo(this, 250, 71, textureX, textureY); // Box 296
		turretModel[2] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Box 297
		turretModel[3] = new ModelRendererTurbo(this, 250, 99, textureX, textureY); // Box 301
		turretModel[4] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 305
		turretModel[5] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 309
		turretModel[6] = new ModelRendererTurbo(this, 250, 150, textureX, textureY); // Box 310
		turretModel[7] = new ModelRendererTurbo(this, 250, 164, textureX, textureY); // Box 311
		turretModel[8] = new ModelRendererTurbo(this, 250, 57, textureX, textureY); // Box 312
		turretModel[9] = new ModelRendererTurbo(this, 250, 164, textureX, textureY); // Box 317
		turretModel[10] = new ModelRendererTurbo(this, 250, 181, textureX, textureY); // Box 318
		turretModel[11] = new ModelRendererTurbo(this, 250, 230, textureX, textureY); // Box 319
		turretModel[12] = new ModelRendererTurbo(this, 250, 274, textureX, textureY); // Box 320
		turretModel[13] = new ModelRendererTurbo(this, 250, 325, textureX, textureY); // Box 321
		turretModel[14] = new ModelRendererTurbo(this, 250, 380, textureX, textureY); // Box 322
		turretModel[15] = new ModelRendererTurbo(this, 250, 433, textureX, textureY); // Box 323
		turretModel[16] = new ModelRendererTurbo(this, 250, 485, textureX, textureY); // Box 324
		turretModel[17] = new ModelRendererTurbo(this, 250, 71, textureX, textureY); // Box 325
		turretModel[18] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Box 326
		turretModel[19] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 327
		turretModel[20] = new ModelRendererTurbo(this, 250, 150, textureX, textureY); // Box 328
		turretModel[21] = new ModelRendererTurbo(this, 250, 541, textureX, textureY); // Box 329
		turretModel[22] = new ModelRendererTurbo(this, 250, 598, textureX, textureY); // Box 330
		turretModel[23] = new ModelRendererTurbo(this, 250, 649, textureX, textureY); // Box 331
		turretModel[24] = new ModelRendererTurbo(this, 250, 704, textureX, textureY); // Box 332
		turretModel[25] = new ModelRendererTurbo(this, 250, 761, textureX, textureY); // Box 333
		turretModel[26] = new ModelRendererTurbo(this, 250, 761, textureX, textureY); // Box 334
		turretModel[27] = new ModelRendererTurbo(this, 250, 784, textureX, textureY); // Box 335
		turretModel[28] = new ModelRendererTurbo(this, 250, 784, textureX, textureY); // Box 336
		turretModel[29] = new ModelRendererTurbo(this, 250, 810, textureX, textureY); // Box 337
		turretModel[30] = new ModelRendererTurbo(this, 302, 810, textureX, textureY); // Box 338
		turretModel[31] = new ModelRendererTurbo(this, 250, 840, textureX, textureY); // Box 339
		turretModel[32] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 340
		turretModel[33] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 341
		turretModel[34] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 342
		turretModel[35] = new ModelRendererTurbo(this, 250, 934, textureX, textureY); // Box 343
		turretModel[36] = new ModelRendererTurbo(this, 250, 984, textureX, textureY); // Box 344
		turretModel[37] = new ModelRendererTurbo(this, 250, 1034, textureX, textureY); // Box 345
		turretModel[38] = new ModelRendererTurbo(this, 250, 1034, textureX, textureY); // Box 346
		turretModel[39] = new ModelRendererTurbo(this, 250, 1057, textureX, textureY); // Box 347
		turretModel[40] = new ModelRendererTurbo(this, 250, 1057, textureX, textureY); // Box 348
		turretModel[41] = new ModelRendererTurbo(this, 250, 1062, textureX, textureY); // Box 349
		turretModel[42] = new ModelRendererTurbo(this, 250, 1071, textureX, textureY); // Box 350
		turretModel[43] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 352
		turretModel[44] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 353
		turretModel[45] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 354
		turretModel[46] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 355
		turretModel[47] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 356
		turretModel[48] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 357
		turretModel[49] = new ModelRendererTurbo(this, 250, 1085, textureX, textureY); // Box 358
		turretModel[50] = new ModelRendererTurbo(this, 250, 1092, textureX, textureY); // Box 359
		turretModel[51] = new ModelRendererTurbo(this, 250, 1112, textureX, textureY); // Box 360
		turretModel[52] = new ModelRendererTurbo(this, 250, 1119, textureX, textureY); // Box 361
		turretModel[53] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 362
		turretModel[54] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 363
		turretModel[55] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 364
		turretModel[56] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 365
		turretModel[57] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 366
		turretModel[58] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 367
		turretModel[59] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 369
		turretModel[60] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 370
		turretModel[61] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 371
		turretModel[62] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 372
		turretModel[63] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 373
		turretModel[64] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 374
		turretModel[65] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 375
		turretModel[66] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 376
		turretModel[67] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 377
		turretModel[68] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 378
		turretModel[69] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 379
		turretModel[70] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 380
		turretModel[71] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 381
		turretModel[72] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 382
		turretModel[73] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 383
		turretModel[74] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 384
		turretModel[75] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 385
		turretModel[76] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 386
		turretModel[77] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 387
		turretModel[78] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 388
		turretModel[79] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 389
		turretModel[80] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 390
		turretModel[81] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 391
		turretModel[82] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 392
		turretModel[83] = new ModelRendererTurbo(this, 250, 1177, textureX, textureY); // Box 393
		turretModel[84] = new ModelRendererTurbo(this, 250, 1187, textureX, textureY); // Box 394
		turretModel[85] = new ModelRendererTurbo(this, 250, 1197, textureX, textureY); // Box 396
		turretModel[86] = new ModelRendererTurbo(this, 250, 1204, textureX, textureY); // Box 397
		turretModel[87] = new ModelRendererTurbo(this, 250, 1211, textureX, textureY); // Box 398
		turretModel[88] = new ModelRendererTurbo(this, 250, 1215, textureX, textureY); // Box 400
		turretModel[89] = new ModelRendererTurbo(this, 250, 1177, textureX, textureY); // Box 401
		turretModel[90] = new ModelRendererTurbo(this, 250, 1187, textureX, textureY); // Box 402
		turretModel[91] = new ModelRendererTurbo(this, 250, 1197, textureX, textureY); // Box 403
		turretModel[92] = new ModelRendererTurbo(this, 250, 1204, textureX, textureY); // Box 404
		turretModel[93] = new ModelRendererTurbo(this, 250, 1215, textureX, textureY); // Box 405
		turretModel[94] = new ModelRendererTurbo(this, 250, 1211, textureX, textureY); // Box 406
		turretModel[95] = new ModelRendererTurbo(this, 250, 1219, textureX, textureY); // Box 407
		turretModel[96] = new ModelRendererTurbo(this, 250, 1230, textureX, textureY); // Box 408
		turretModel[97] = new ModelRendererTurbo(this, 250, 1241, textureX, textureY); // Box 409
		turretModel[98] = new ModelRendererTurbo(this, 250, 1252, textureX, textureY); // Box 410
		turretModel[99] = new ModelRendererTurbo(this, 250, 1257, textureX, textureY); // Box 411
		turretModel[100] = new ModelRendererTurbo(this, 250, 1260, textureX, textureY); // Box 412
		turretModel[101] = new ModelRendererTurbo(this, 250, 1265, textureX, textureY); // Box 413
		turretModel[102] = new ModelRendererTurbo(this, 250, 1270, textureX, textureY); // Box 414
		turretModel[103] = new ModelRendererTurbo(this, 250, 1282, textureX, textureY); // Box 415
		turretModel[104] = new ModelRendererTurbo(this, 250, 1286, textureX, textureY); // Box 416
		turretModel[105] = new ModelRendererTurbo(this, 250, 1295, textureX, textureY); // Box 417
		turretModel[106] = new ModelRendererTurbo(this, 250, 1301, textureX, textureY); // Box 418
		turretModel[107] = new ModelRendererTurbo(this, 250, 1307, textureX, textureY); // Box 419
		turretModel[108] = new ModelRendererTurbo(this, 250, 1313, textureX, textureY); // Box 420
		turretModel[109] = new ModelRendererTurbo(this, 250, 1318, textureX, textureY); // Box 421
		turretModel[110] = new ModelRendererTurbo(this, 250, 1313, textureX, textureY); // Box 422
		turretModel[111] = new ModelRendererTurbo(this, 250, 1338, textureX, textureY); // Box 423
		turretModel[112] = new ModelRendererTurbo(this, 250, 1354, textureX, textureY); // Box 424
		turretModel[113] = new ModelRendererTurbo(this, 250, 1368, textureX, textureY); // Box 425
		turretModel[114] = new ModelRendererTurbo(this, 250, 1378, textureX, textureY); // Box 426
		turretModel[115] = new ModelRendererTurbo(this, 250, 1390, textureX, textureY); // Box 427
		turretModel[116] = new ModelRendererTurbo(this, 250, 1415, textureX, textureY); // Box 428
		turretModel[117] = new ModelRendererTurbo(this, 250, 1430, textureX, textureY); // Box 429
		turretModel[118] = new ModelRendererTurbo(this, 250, 1443, textureX, textureY); // Box 430
		turretModel[119] = new ModelRendererTurbo(this, 250, 1452, textureX, textureY); // Box 431
		turretModel[120] = new ModelRendererTurbo(this, 250, 1464, textureX, textureY); // Box 432
		turretModel[121] = new ModelRendererTurbo(this, 250, 1480, textureX, textureY); // Box 433
		turretModel[122] = new ModelRendererTurbo(this, 250, 1491, textureX, textureY); // Box 434
		turretModel[123] = new ModelRendererTurbo(this, 250, 1500, textureX, textureY); // Box 435
		turretModel[124] = new ModelRendererTurbo(this, 250, 1510, textureX, textureY); // Box 436
		turretModel[125] = new ModelRendererTurbo(this, 250, 1515, textureX, textureY); // Box 437
		turretModel[126] = new ModelRendererTurbo(this, 250, 1520, textureX, textureY); // Box 438
		turretModel[127] = new ModelRendererTurbo(this, 250, 1525, textureX, textureY); // Box 439
		turretModel[128] = new ModelRendererTurbo(this, 250, 1529, textureX, textureY); // Box 440
		turretModel[129] = new ModelRendererTurbo(this, 250, 1525, textureX, textureY); // Box 472
		turretModel[130] = new ModelRendererTurbo(this, 250, 1548, textureX, textureY); // Box 473
		turretModel[131] = new ModelRendererTurbo(this, 250, 1548, textureX, textureY); // Box 474
		turretModel[132] = new ModelRendererTurbo(this, 250, 1562, textureX, textureY); // Box 475
		turretModel[133] = new ModelRendererTurbo(this, 250, 1562, textureX, textureY); // Box 476
		turretModel[134] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 513
		turretModel[135] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 514
		turretModel[136] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 515
		turretModel[137] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 516
		turretModel[138] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 517
		turretModel[139] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 518
		turretModel[140] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 519
		turretModel[141] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 520
		turretModel[142] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 523
		turretModel[143] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 524
		turretModel[144] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 525
		turretModel[145] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 526
		turretModel[146] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 527
		turretModel[147] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 528
		turretModel[148] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 529
		turretModel[149] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 530
		turretModel[150] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 531
		turretModel[151] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 532
		turretModel[152] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 533
		turretModel[153] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 534
		turretModel[154] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 535
		turretModel[155] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 536
		turretModel[156] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 539
		turretModel[157] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 540
		turretModel[158] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 541
		turretModel[159] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 542
		turretModel[160] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 543
		turretModel[161] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 544
		turretModel[162] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 545
		turretModel[163] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 546
		turretModel[164] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 547
		turretModel[165] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 548
		turretModel[166] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 549
		turretModel[167] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 550
		turretModel[168] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 551
		turretModel[169] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 552
		turretModel[170] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 553
		turretModel[171] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 554
		turretModel[172] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 555
		turretModel[173] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 556
		turretModel[174] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 557
		turretModel[175] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 558
		turretModel[176] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 559
		turretModel[177] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 560
		turretModel[178] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 561
		turretModel[179] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 562
		turretModel[180] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 563
		turretModel[181] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 564
		turretModel[182] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 565
		turretModel[183] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 566
		turretModel[184] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 567
		turretModel[185] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 568
		turretModel[186] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 569
		turretModel[187] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 570
		turretModel[188] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 571
		turretModel[189] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 572
		turretModel[190] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 573
		turretModel[191] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 574
		turretModel[192] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 575
		turretModel[193] = new ModelRendererTurbo(this, 250, 1597, textureX, textureY); // Box 576
		turretModel[194] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 577
		turretModel[195] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 578
		turretModel[196] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 579
		turretModel[197] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 580
		turretModel[198] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 549
		turretModel[199] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 550
		turretModel[200] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 551
		turretModel[201] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 552
		turretModel[202] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 553
		turretModel[203] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 554
		turretModel[204] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 555
		turretModel[205] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 556
		turretModel[206] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 557
		turretModel[207] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 558
		turretModel[208] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 559
		turretModel[209] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 560
		turretModel[210] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 561
		turretModel[211] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 562
		turretModel[212] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 563
		turretModel[213] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 564
		turretModel[214] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 565
		turretModel[215] = new ModelRendererTurbo(this, 250, 1590, textureX, textureY); // Box 566
		turretModel[216] = new ModelRendererTurbo(this, 250, 1590, textureX, textureY); // Box 570
		turretModel[217] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 571
		turretModel[218] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 572
		turretModel[219] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 573
		turretModel[220] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 574
		turretModel[221] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 575
		turretModel[222] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 576
		turretModel[223] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 577
		turretModel[224] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 578
		turretModel[225] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 579
		turretModel[226] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 580
		turretModel[227] = new ModelRendererTurbo(this, 250, 1575, textureX, textureY); // Box 581
		turretModel[228] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 582
		turretModel[229] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 583
		turretModel[230] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 584
		turretModel[231] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 585
		turretModel[232] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 586
		turretModel[233] = new ModelRendererTurbo(this, 250, 1582, textureX, textureY); // Box 587

		turretModel[0].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 3F, -3F, 2.5F, -5F, -2F, -2F, -5F, -2F, 0F, 3F, -3F, 0F, 3F, 0F, 2F, -7F, 0F, -3F, -7F, 0F, 1F, 3F, 0F, 0F); // Box 295
		turretModel[0].setRotationPoint(17.5F, -26F, -19F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 8, 0F, 0F, -2F, 0F, -5F, -3F, -3.5F, -5F, -3F, 0F, 0F, -2F, 0F, 0F, 3F, 2.5F, -4F, 2F, -2F, -4F, 2F, 0F, 0F, 3F, 0F); // Box 296
		turretModel[1].setRotationPoint(14.5F, -31F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 7, 0F, 0F, 1F, -3F, -8F, -0.6667F, -5F, -8F, -0.6667F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -6F, 1F, -2.5F, -6F, 1F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[2].setRotationPoint(14.5F, -35F, -18F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 4, 15, 21, 0F, 0F, 0F, 0F, 0F, -1.115F, 0F, 0F, -1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		turretModel[3].setRotationPoint(14.5F, -36F, -11F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 42, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F); // Box 305
		turretModel[4].setRotationPoint(5.5F, -23F, -21.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, -4F, -0.6667F, -5F, -5F, -2F, -6.5F, -5F, -2F, 0F, -4F, -0.6667F, 0F, -6F, 1F, -2.5F, -1F, 1F, -6.5F, -1F, 1F, 0F, -6F, 1F, 0F); // Box 309
		turretModel[5].setRotationPoint(16.5F, -35F, -18F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F, -3F, -3F, -3.5F, -1F, -3F, -7.5F, -1F, -3F, 0F, -3F, -3F, 0F, -4F, 2F, -2F, -0.5F, 2F, -7.5F, -0.5F, 2F, 0F, -4F, 2F, 0F); // Box 310
		turretModel[6].setRotationPoint(19.5F, -31F, -19F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F, -5F, -2F, -2F, 3.5F, -2F, -7.5F, 3.5F, -2F, 0F, -5F, -2F, 0F, -3F, 0F, -3F, 0.5F, 0F, -8.5F, 0.5F, 0F, 1F, -3F, 0F, 1F); // Box 311
		turretModel[7].setRotationPoint(18.5F, -26F, -19F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 3F, -3F, 0F, -5F, -2F, 0F, -5F, -2F, -2F, 3F, -3F, 2.5F, 3F, 0F, 0F, -7F, 0F, 1F, -7F, 0F, -3F, 3F, 0F, 2F); // Box 312
		turretModel[8].setRotationPoint(17.5F, -26F, 10F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F, -5F, -2F, 0F, 3.5F, -2F, 0F, 3.5F, -2F, -7.5F, -5F, -2F, -2F, -3F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -8.5F, -3F, 0F, -3F); // Box 317
		turretModel[9].setRotationPoint(18.5F, -26F, 10F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 9, 6, 42, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 318
		turretModel[10].setRotationPoint(5.5F, -29F, -21.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 9, 7, 36, 0F, 1F, 2.5F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 1F, 2.5F, -2F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F); // Box 319
		turretModel[11].setRotationPoint(5.5F, -36F, -18.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 48, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 320
		turretModel[12].setRotationPoint(-3.5F, -23F, -24.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 9, 6, 48, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 321
		turretModel[13].setRotationPoint(-3.5F, -29F, -24.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 9, 9, 43, 0F, 0F, 1.5F, -2F, -1F, 0.5F, -3F, -1F, 0.5F, -5F, 0F, 1.5F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 322
		turretModel[14].setRotationPoint(-3.5F, -38F, -22.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 49, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 323
		turretModel[15].setRotationPoint(-15.5F, -23F, -25F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 12, 6, 49, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 324
		turretModel[16].setRotationPoint(-15.5F, -29F, -25F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 13, 5, 8, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, -3.5F, 0F, -2F, 0F, 0F, 3F, 0F, -4F, 2F, 0F, -4F, 2F, -2F, 0F, 3F, 2.5F); // Box 325
		turretModel[17].setRotationPoint(14.5F, -31F, 10F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 14, 6, 7, 0F, 0F, 1F, 0F, -8F, -0.6667F, 0F, -8F, -0.6667F, -5F, 0F, 1F, -3F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, 1F, -2.5F, 0F, 0F, 1F); // Box 326
		turretModel[18].setRotationPoint(14.5F, -35F, 10F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, -4F, -0.6667F, 0F, -5F, -2F, 0F, -5F, -2F, -6.5F, -4F, -0.6667F, -5F, -6F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, -6.5F, -6F, 1F, -2.5F); // Box 327
		turretModel[19].setRotationPoint(16.5F, -35F, 10F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F, -3F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, -7.5F, -3F, -3F, -3.5F, -4F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, -7.5F, -4F, 2F, -2F); // Box 328
		turretModel[20].setRotationPoint(19.5F, -31F, 10F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 12, 11, 45, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		turretModel[21].setRotationPoint(-15.5F, -40F, -23.5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 20, 2, 48, 0F, 0F, 0F, -4.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -5F); // Box 330
		turretModel[22].setRotationPoint(-35.5F, -26F, -24.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 20, 6, 48, 0F, 0F, 2F, -5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 2F, -5F, 0F, -3F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4.5F); // Box 331
		turretModel[23].setRotationPoint(-35.5F, -29F, -24.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 20, 11, 45, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -6F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 332
		turretModel[24].setRotationPoint(-35.5F, -40F, -23.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, -1F, 0.7F, -9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F, -1.5F, -0.7F, -9.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 333
		turretModel[25].setRotationPoint(-40.5F, -26F, -20.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.7F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -0.7F, -9.5F); // Box 334
		turretModel[26].setRotationPoint(-40.5F, -26F, -0.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F, -1.5F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, -9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 335
		turretModel[27].setRotationPoint(-40.5F, -31F, -20.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.7F, -9F); // Box 336
		turretModel[28].setRotationPoint(-40.5F, -31F, -0.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 5, 9, 20, 0F, -2.5F, -0.5F, -11F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -1.5F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		turretModel[29].setRotationPoint(-40.5F, -40F, -20.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 5, 9, 20, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, -2.5F, -0.5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -9F); // Box 338
		turretModel[30].setRotationPoint(-40.5F, -40F, -0.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 339
		turretModel[31].setRotationPoint(14.5F, -21F, -21F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 340
		turretModel[32].setRotationPoint(21.5F, -21F, -16F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 341
		turretModel[33].setRotationPoint(21.5F, -21F, 0F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 47, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 342
		turretModel[34].setRotationPoint(5.5F, -21F, -24F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 47, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 343
		turretModel[35].setRotationPoint(-3.5F, -21F, -24F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 47, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F); // Box 344
		turretModel[36].setRotationPoint(-15.5F, -21F, -24F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, -1F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345
		turretModel[37].setRotationPoint(-22.5F, -21F, -20F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -10F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -10F); // Box 346
		turretModel[38].setRotationPoint(-22.5F, -21F, -1F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		turretModel[39].setRotationPoint(5.5F, -40F, -15F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		turretModel[40].setRotationPoint(5.5F, -40F, -9F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		turretModel[41].setRotationPoint(5.5F, -40F, -14F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[42].setRotationPoint(5.5F, -41F, -15F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[43].setRotationPoint(-7.5F, -38F, -23F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 353
		turretModel[44].setRotationPoint(-7.5F, -36F, -23F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[45].setRotationPoint(-7.5F, -37F, -23F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[46].setRotationPoint(-7.5F, -38F, 17F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 356
		turretModel[47].setRotationPoint(-7.5F, -36F, 17F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		turretModel[48].setRotationPoint(-7.5F, -37F, 17F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[49].setRotationPoint(-45.5F, -32F, -23.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 359
		turretModel[50].setRotationPoint(-45.5F, -32F, -18.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 360
		turretModel[51].setRotationPoint(-45.5F, -32F, 17.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[52].setRotationPoint(-45.5F, -32F, -0.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 362
		turretModel[53].setRotationPoint(-48.5F, -31F, -8F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[54].setRotationPoint(-48.5F, -38F, -8F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 364
		turretModel[55].setRotationPoint(-48.5F, -31F, 6F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[56].setRotationPoint(-48.5F, -38F, 6F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[57].setRotationPoint(-48F, -37.5F, -7F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[58].setRotationPoint(-48F, -35F, -7F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 369
		turretModel[59].setRotationPoint(-46.5F, -31F, -19F);
		turretModel[59].rotateAngleY = 0.36651914F;

		turretModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		turretModel[60].setRotationPoint(-46.5F, -38F, -19F);
		turretModel[60].rotateAngleY = 0.36651914F;

		turretModel[61].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 371
		turretModel[61].setRotationPoint(-46.5F, -31F, 18F);
		turretModel[61].rotateAngleY = -0.36651914F;

		turretModel[62].addShapeBox(0F, 0F, -1F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[62].setRotationPoint(-46.5F, -38F, 18F);
		turretModel[62].rotateAngleY = -0.36651914F;

		turretModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 373
		turretModel[63].setRotationPoint(-42.5F, -35F, -23.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 374
		turretModel[64].setRotationPoint(-42.5F, -37.5F, -23.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F); // Box 375
		turretModel[65].setRotationPoint(-37.5F, -35F, -23.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F); // Box 376
		turretModel[66].setRotationPoint(-37.5F, -37.5F, -23.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F); // Box 377
		turretModel[67].setRotationPoint(-45.5F, -37.5F, -23.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F); // Box 378
		turretModel[68].setRotationPoint(-45.5F, -35F, -23.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 379
		turretModel[69].setRotationPoint(-45.5F, -37.5F, -18.5F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 380
		turretModel[70].setRotationPoint(-45.5F, -35F, -18.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[71].setRotationPoint(-42.5F, -35F, 21.5F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[72].setRotationPoint(-42.5F, -37.5F, 21.5F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 383
		turretModel[73].setRotationPoint(-37.5F, -35F, 21.5F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 384
		turretModel[74].setRotationPoint(-37.5F, -37.5F, 21.5F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 385
		turretModel[75].setRotationPoint(-45.5F, -37.5F, 21.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 386
		turretModel[76].setRotationPoint(-45.5F, -35F, 21.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		turretModel[77].setRotationPoint(-45.5F, -37.5F, 6.5F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[78].setRotationPoint(-45.5F, -35F, 6.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[79].setRotationPoint(-49F, -35F, -7F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		turretModel[80].setRotationPoint(-49F, -35F, -3F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		turretModel[81].setRotationPoint(-49F, -35F, 4F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		turretModel[82].setRotationPoint(-49F, -35F, 0F);

		turretModel[83].addShapeBox(-8F, 0F, -4F, 12, 1, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 393
		turretModel[83].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[83].rotateAngleY = -0.89011792F;
		turretModel[83].rotateAngleZ = 0.48869219F;

		turretModel[84].addShapeBox(-8F, 1F, -4F, 12, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F); // Box 394
		turretModel[84].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[84].rotateAngleY = -0.89011792F;
		turretModel[84].rotateAngleZ = 0.48869219F;

		turretModel[85].addShapeBox(-8F, 2F, -3F, 12, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 396
		turretModel[85].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[85].rotateAngleY = -0.89011792F;
		turretModel[85].rotateAngleZ = 0.48869219F;

		turretModel[86].addShapeBox(-8F, 3F, -3F, 12, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F); // Box 397
		turretModel[86].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[86].rotateAngleY = -0.89011792F;
		turretModel[86].rotateAngleZ = 0.48869219F;

		turretModel[87].addShapeBox(-4F, 5F, -2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		turretModel[87].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[87].rotateAngleY = -0.89011792F;
		turretModel[87].rotateAngleZ = 0.48869219F;

		turretModel[88].addShapeBox(-4F, 4F, -2F, 8, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		turretModel[88].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[88].rotateAngleY = -0.89011792F;
		turretModel[88].rotateAngleZ = 0.48869219F;

		turretModel[89].addShapeBox(-8F, 0F, -4F, 12, 1, 8, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 401
		turretModel[89].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[89].rotateAngleY = 0.89011792F;
		turretModel[89].rotateAngleZ = 0.48869219F;

		turretModel[90].addShapeBox(-8F, 1F, -4F, 12, 1, 8, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 402
		turretModel[90].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[90].rotateAngleY = 0.89011792F;
		turretModel[90].rotateAngleZ = 0.48869219F;

		turretModel[91].addShapeBox(-8F, 2F, -2F, 12, 1, 5, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 403
		turretModel[91].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[91].rotateAngleY = 0.89011792F;
		turretModel[91].rotateAngleZ = 0.48869219F;

		turretModel[92].addShapeBox(-8F, 3F, -2F, 12, 1, 5, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 404
		turretModel[92].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[92].rotateAngleY = 0.89011792F;
		turretModel[92].rotateAngleZ = 0.48869219F;

		turretModel[93].addShapeBox(-4F, 4F, 0F, 8, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		turretModel[93].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[93].rotateAngleY = 0.89011792F;
		turretModel[93].rotateAngleZ = 0.48869219F;

		turretModel[94].addShapeBox(-4F, 5F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		turretModel[94].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[94].rotateAngleY = 0.89011792F;
		turretModel[94].rotateAngleZ = 0.48869219F;

		turretModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 407
		turretModel[95].setRotationPoint(-36F, -40F, -17F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		turretModel[96].setRotationPoint(-33F, -40F, -17F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 409
		turretModel[97].setRotationPoint(-30F, -40F, -17F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		turretModel[98].setRotationPoint(-32F, -41F, -3F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		turretModel[99].setRotationPoint(-31.5F, -42F, -2.5F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 412
		turretModel[100].setRotationPoint(-31.5F, -45F, -2.5F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 413
		turretModel[101].setRotationPoint(-32.5F, -42F, 12F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 414
		turretModel[102].setRotationPoint(-32.5F, -52F, 12F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 415
		turretModel[103].setRotationPoint(-19.5F, -40F, 12F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		turretModel[104].setRotationPoint(-18.5F, -40.5F, 3F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		turretModel[105].setRotationPoint(-17.5F, -40.5F, 5F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		turretModel[106].setRotationPoint(-15.5F, -40F, 4.5F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 419
		turretModel[107].setRotationPoint(-15.5F, -40F, 8.5F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 420
		turretModel[108].setRotationPoint(0.5F, -40F, 9F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 421
		turretModel[109].setRotationPoint(0.5F, -41F, 3F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 9, 5, 19, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 422
		turretModel[110].setRotationPoint(-13.5F, -49F, -20F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F, -5F, -0.5F, -5F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		turretModel[111].setRotationPoint(-21.5F, -49F, -20F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, -5F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F); // Box 424
		turretModel[112].setRotationPoint(-21.5F, -49F, -10F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, -0.5F, -3F, -2F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		turretModel[113].setRotationPoint(-4.5F, -49F, -20F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1.5F); // Box 426
		turretModel[114].setRotationPoint(-4.5F, -49F, -8F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 427
		turretModel[115].setRotationPoint(-13.5F, -44F, -20.5F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 428
		turretModel[116].setRotationPoint(-21.5F, -44F, -20F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -4F); // Box 429
		turretModel[117].setRotationPoint(-21.5F, -44F, -10F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 430
		turretModel[118].setRotationPoint(-4.5F, -44F, -20F);

		turretModel[119].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 431
		turretModel[119].setRotationPoint(-4.5F, -44F, -8F);

		turretModel[120].addShapeBox(0F, -5F, 0F, 8, 7, 8, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		turretModel[120].setRotationPoint(-4.5F, -44F, -16F);

		turretModel[121].addShapeBox(0F, 2F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 433
		turretModel[121].setRotationPoint(-4.5F, -44F, -16F);

		turretModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		turretModel[122].setRotationPoint(-7.5F, -51F, -15F);

		turretModel[123].addShapeBox(6F, -5F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		turretModel[123].setRotationPoint(-4.5F, -43.25F, -12F);

		turretModel[124].addShapeBox(7F, -4F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		turretModel[124].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[125].addShapeBox(9F, -4F, 0F, 4, 2, 2, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 437
		turretModel[125].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[126].addShapeBox(13F, -4F, 0F, 9, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 438
		turretModel[126].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[127].addTrapezoid(22F, -3.5F, 0.5F, 1, 1, 1, 0F, 0.20F, ModelRendererTurbo.MR_LEFT); // Box 439
		turretModel[127].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[128].addTrapezoid(23F, -3.5F, 0.5F, 2, 1, 1, 0F, 0.20F, ModelRendererTurbo.MR_RIGHT); // Box 440
		turretModel[128].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		turretModel[129].setRotationPoint(-13.5F, -40F, -19.5F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		turretModel[130].setRotationPoint(-20.5F, -40F, -19F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F); // Box 474
		turretModel[131].setRotationPoint(-20.5F, -40F, -10F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		turretModel[132].setRotationPoint(-4.5F, -40F, -19F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F); // Box 476
		turretModel[133].setRotationPoint(-4.5F, -40F, -8F);

		turretModel[134].addShapeBox(0.5F, -2.5F, 0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		turretModel[134].setRotationPoint(23F, -25.5F, 15.5F);
		turretModel[134].rotateAngleX = -1.02974426F;
		turretModel[134].rotateAngleY = -0.54105207F;
		turretModel[134].rotateAngleZ = -0.06981317F;

		turretModel[135].addShapeBox(-2.5F, -3.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 514
		turretModel[135].setRotationPoint(23F, -25.5F, 15.5F);
		turretModel[135].rotateAngleX = -1.02974426F;
		turretModel[135].rotateAngleY = -0.54105207F;
		turretModel[135].rotateAngleZ = -0.06981317F;

		turretModel[136].addShapeBox(-11.5F, -4F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 515
		turretModel[136].setRotationPoint(24.5F, -25.5F, 15F);
		turretModel[136].rotateAngleX = -1.01229097F;
		turretModel[136].rotateAngleY = -0.36651914F;

		turretModel[137].addShapeBox(-8.5F, -3F, 0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		turretModel[137].setRotationPoint(24.5F, -25.5F, 15F);
		turretModel[137].rotateAngleX = -1.01229097F;
		turretModel[137].rotateAngleY = -0.36651914F;

		turretModel[138].addShapeBox(-13.5F, -4F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 517
		turretModel[138].setRotationPoint(24.5F, -25.5F, 15F);
		turretModel[138].rotateAngleX = -1.01229097F;
		turretModel[138].rotateAngleY = -0.36651914F;

		turretModel[139].addShapeBox(-10.5F, -3F, -4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		turretModel[139].setRotationPoint(24.5F, -25.5F, 15F);
		turretModel[139].rotateAngleX = -1.01229097F;
		turretModel[139].rotateAngleY = -0.36651914F;

		turretModel[140].addShapeBox(-4.5F, -3.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 519
		turretModel[140].setRotationPoint(23F, -25.5F, 15.5F);
		turretModel[140].rotateAngleX = -1.02974426F;
		turretModel[140].rotateAngleY = -0.54105207F;
		turretModel[140].rotateAngleZ = -0.06981317F;

		turretModel[141].addShapeBox(-1.5F, -2.5F, -4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		turretModel[141].setRotationPoint(23F, -25.5F, 15.5F);
		turretModel[141].rotateAngleX = -1.02974426F;
		turretModel[141].rotateAngleY = -0.54105207F;
		turretModel[141].rotateAngleZ = -0.06981317F;

		turretModel[142].addShapeBox(-3.5F, -2.5F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 523
		turretModel[142].setRotationPoint(12.5F, -33.5F, 15F);
		turretModel[142].rotateAngleX = -0.89011792F;
		turretModel[142].rotateAngleY = -0.31415927F;

		turretModel[143].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		turretModel[143].setRotationPoint(12.5F, -33.5F, 15F);
		turretModel[143].rotateAngleX = -0.89011792F;
		turretModel[143].rotateAngleY = -0.31415927F;

		turretModel[144].addShapeBox(-3.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 525
		turretModel[144].setRotationPoint(13.5F, -34.5F, -15F);
		turretModel[144].rotateAngleX = 0.89011792F;
		turretModel[144].rotateAngleY = 0.31415927F;

		turretModel[145].addShapeBox(-0.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		turretModel[145].setRotationPoint(13.5F, -34.5F, -15F);
		turretModel[145].rotateAngleX = 0.89011792F;
		turretModel[145].rotateAngleY = 0.31415927F;

		turretModel[146].addShapeBox(-2.5F, -2.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 527
		turretModel[146].setRotationPoint(23F, -25.5F, -18.5F);
		turretModel[146].rotateAngleX = 1.02974426F;
		turretModel[146].rotateAngleY = 0.54105207F;
		turretModel[146].rotateAngleZ = -0.06981317F;

		turretModel[147].addShapeBox(0.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		turretModel[147].setRotationPoint(23F, -25.5F, -18.5F);
		turretModel[147].rotateAngleX = 1.02974426F;
		turretModel[147].rotateAngleY = 0.54105207F;
		turretModel[147].rotateAngleZ = -0.06981317F;

		turretModel[148].addShapeBox(-4.5F, -2.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 529
		turretModel[148].setRotationPoint(23F, -25.5F, -18.5F);
		turretModel[148].rotateAngleX = 1.02974426F;
		turretModel[148].rotateAngleY = 0.54105207F;
		turretModel[148].rotateAngleZ = -0.06981317F;

		turretModel[149].addShapeBox(-1.5F, -1.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		turretModel[149].setRotationPoint(23F, -25.5F, -18.5F);
		turretModel[149].rotateAngleX = 1.02974426F;
		turretModel[149].rotateAngleY = 0.54105207F;
		turretModel[149].rotateAngleZ = -0.06981317F;

		turretModel[150].addShapeBox(-4.5F, -2.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 531
		turretModel[150].setRotationPoint(17F, -25.5F, -21.5F);
		turretModel[150].rotateAngleX = 1.01229097F;
		turretModel[150].rotateAngleY = 0.26179939F;
		turretModel[150].rotateAngleZ = 0.03490659F;

		turretModel[151].addShapeBox(-1.5F, -1.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		turretModel[151].setRotationPoint(17F, -25.5F, -21.5F);
		turretModel[151].rotateAngleX = 1.01229097F;
		turretModel[151].rotateAngleY = 0.26179939F;
		turretModel[151].rotateAngleZ = 0.03490659F;

		turretModel[152].addShapeBox(-2.5F, -2.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 533
		turretModel[152].setRotationPoint(17F, -25.5F, -21.5F);
		turretModel[152].rotateAngleX = 1.01229097F;
		turretModel[152].rotateAngleY = 0.26179939F;
		turretModel[152].rotateAngleZ = 0.03490659F;

		turretModel[153].addShapeBox(0.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		turretModel[153].setRotationPoint(17F, -25.5F, -21.5F);
		turretModel[153].rotateAngleX = 1.01229097F;
		turretModel[153].rotateAngleY = 0.26179939F;
		turretModel[153].rotateAngleZ = 0.03490659F;

		turretModel[154].addShapeBox(-0.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		turretModel[154].setRotationPoint(14.5F, -35.5F, -5F);
		turretModel[154].rotateAngleZ = -0.29670597F;

		turretModel[155].addShapeBox(-3.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 536
		turretModel[155].setRotationPoint(14.5F, -35.5F, -5F);
		turretModel[155].rotateAngleZ = -0.29670597F;

		turretModel[156].addShapeBox(-3.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 539
		turretModel[156].setRotationPoint(14.5F, -35.5F, 0F);
		turretModel[156].rotateAngleZ = -0.29670597F;

		turretModel[157].addShapeBox(-0.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		turretModel[157].setRotationPoint(14.5F, -35.5F, 0F);
		turretModel[157].rotateAngleZ = -0.29670597F;

		turretModel[158].addShapeBox(-3.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 541
		turretModel[158].setRotationPoint(14.5F, -35.5F, 5F);
		turretModel[158].rotateAngleZ = -0.29670597F;

		turretModel[159].addShapeBox(-0.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		turretModel[159].setRotationPoint(14.5F, -35.5F, 5F);
		turretModel[159].rotateAngleZ = -0.29670597F;

		turretModel[160].addShapeBox(-3.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 543
		turretModel[160].setRotationPoint(14.5F, -35.5F, 10F);
		turretModel[160].rotateAngleZ = -0.29670597F;

		turretModel[161].addShapeBox(-0.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		turretModel[161].setRotationPoint(14.5F, -35.5F, 10F);
		turretModel[161].rotateAngleZ = -0.29670597F;

		turretModel[162].addShapeBox(-10.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 545
		turretModel[162].setRotationPoint(14.5F, -35.5F, 10F);
		turretModel[162].rotateAngleZ = -0.29670597F;

		turretModel[163].addShapeBox(-7.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		turretModel[163].setRotationPoint(14.5F, -35.5F, 10F);
		turretModel[163].rotateAngleZ = -0.29670597F;

		turretModel[164].addShapeBox(-10.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 547
		turretModel[164].setRotationPoint(14.5F, -35.5F, 5F);
		turretModel[164].rotateAngleZ = -0.29670597F;

		turretModel[165].addShapeBox(-10.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 548
		turretModel[165].setRotationPoint(14.5F, -35.5F, 0F);
		turretModel[165].rotateAngleZ = -0.29670597F;

		turretModel[166].addShapeBox(-10.5F, -3F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 549
		turretModel[166].setRotationPoint(14.5F, -35.5F, -5F);
		turretModel[166].rotateAngleZ = -0.29670597F;

		turretModel[167].addShapeBox(-7.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		turretModel[167].setRotationPoint(14.5F, -35.5F, -5F);
		turretModel[167].rotateAngleZ = -0.29670597F;

		turretModel[168].addShapeBox(-7.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		turretModel[168].setRotationPoint(14.5F, -35.5F, 0F);
		turretModel[168].rotateAngleZ = -0.29670597F;

		turretModel[169].addShapeBox(-7.5F, -2F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[169].setRotationPoint(14.5F, -35.5F, 5F);
		turretModel[169].rotateAngleZ = -0.29670597F;

		turretModel[170].addShapeBox(-0.5F, -1.5F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		turretModel[170].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[170].rotateAngleX = 1.29154365F;
		turretModel[170].rotateAngleY = 0.15707963F;

		turretModel[171].addShapeBox(-2.5F, -2.5F, -4.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 554
		turretModel[171].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[171].rotateAngleX = 1.29154365F;
		turretModel[171].rotateAngleY = 0.15707963F;

		turretModel[172].addShapeBox(-0.5F, -1.5F, -8.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		turretModel[172].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[172].rotateAngleX = 1.29154365F;
		turretModel[172].rotateAngleY = 0.15707963F;

		turretModel[173].addShapeBox(-2.5F, -2.5F, -11.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 556
		turretModel[173].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[173].rotateAngleX = 1.29154365F;
		turretModel[173].rotateAngleY = 0.15707963F;

		turretModel[174].addShapeBox(-5.5F, -1.5F, -8.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		turretModel[174].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[174].rotateAngleX = 1.29154365F;
		turretModel[174].rotateAngleY = 0.15707963F;

		turretModel[175].addShapeBox(-7.5F, -2.5F, -11.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 558
		turretModel[175].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[175].rotateAngleX = 1.29154365F;
		turretModel[175].rotateAngleY = 0.15707963F;

		turretModel[176].addShapeBox(-5.5F, -1.5F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		turretModel[176].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[176].rotateAngleX = 1.29154365F;
		turretModel[176].rotateAngleY = 0.15707963F;

		turretModel[177].addShapeBox(-7.5F, -2.5F, -4.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 560
		turretModel[177].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[177].rotateAngleX = 1.29154365F;
		turretModel[177].rotateAngleY = 0.15707963F;

		turretModel[178].addShapeBox(-11.5F, -1.5F, -6.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		turretModel[178].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[178].rotateAngleX = 1.29154365F;
		turretModel[178].rotateAngleY = 0.15707963F;

		turretModel[179].addShapeBox(-14.5F, -2.5F, -8.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 562
		turretModel[179].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[179].rotateAngleX = 1.29154365F;
		turretModel[179].rotateAngleY = 0.15707963F;

		turretModel[180].addShapeBox(-14.5F, -2.5F, -3.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 563
		turretModel[180].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[180].rotateAngleX = 1.29154365F;
		turretModel[180].rotateAngleY = 0.15707963F;

		turretModel[181].addShapeBox(-11.5F, -1.5F, -1.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		turretModel[181].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[181].rotateAngleX = 1.29154365F;
		turretModel[181].rotateAngleY = 0.15707963F;

		turretModel[182].addShapeBox(-14.5F, -2.5F, 1.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 565
		turretModel[182].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[182].rotateAngleX = 1.29154365F;
		turretModel[182].rotateAngleY = 0.15707963F;

		turretModel[183].addShapeBox(-11.5F, -1.5F, 3.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		turretModel[183].setRotationPoint(2.5F, -34.5F, -21F);
		turretModel[183].rotateAngleX = 1.29154365F;
		turretModel[183].rotateAngleY = 0.15707963F;

		turretModel[184].addShapeBox(-14.5F, -1F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 567
		turretModel[184].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[184].rotateAngleX = -1.18682389F;
		turretModel[184].rotateAngleY = -0.08726646F;

		turretModel[185].addShapeBox(-11.5F, 0F, 5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		turretModel[185].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[185].rotateAngleX = -1.18682389F;
		turretModel[185].rotateAngleY = -0.08726646F;

		turretModel[186].addShapeBox(-11.5F, 0F, 0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		turretModel[186].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[186].rotateAngleX = -1.18682389F;
		turretModel[186].rotateAngleY = -0.08726646F;

		turretModel[187].addShapeBox(-14.5F, -1F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 570
		turretModel[187].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[187].rotateAngleX = -1.18682389F;
		turretModel[187].rotateAngleY = -0.08726646F;

		turretModel[188].addShapeBox(-14.5F, -1F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 571
		turretModel[188].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[188].rotateAngleX = -1.18682389F;
		turretModel[188].rotateAngleY = -0.08726646F;

		turretModel[189].addShapeBox(-11.5F, 0F, -4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		turretModel[189].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[189].rotateAngleX = -1.18682389F;
		turretModel[189].rotateAngleY = -0.08726646F;

		turretModel[190].addShapeBox(-7.5F, -1F, 3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 573
		turretModel[190].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[190].rotateAngleX = -1.18682389F;
		turretModel[190].rotateAngleY = -0.08726646F;

		turretModel[191].addShapeBox(-7.5F, -1F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 574
		turretModel[191].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[191].rotateAngleX = -1.18682389F;
		turretModel[191].rotateAngleY = -0.08726646F;

		turretModel[192].addShapeBox(-2.5F, -1F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 575
		turretModel[192].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[192].rotateAngleX = -1.18682389F;
		turretModel[192].rotateAngleY = -0.08726646F;

		turretModel[193].addShapeBox(-2.5F, -1F, 3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 576
		turretModel[193].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[193].rotateAngleX = -1.18682389F;
		turretModel[193].rotateAngleY = -0.08726646F;

		turretModel[194].addShapeBox(-5.5F, 0F, 7.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		turretModel[194].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[194].rotateAngleX = -1.18682389F;
		turretModel[194].rotateAngleY = -0.08726646F;

		turretModel[195].addShapeBox(-0.5F, -1.5F, 7.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[195].setRotationPoint(2.5F, -34.5F, 21F);
		turretModel[195].rotateAngleX = -1.29154365F;
		turretModel[195].rotateAngleY = -0.15707963F;

		turretModel[196].addShapeBox(-0.5F, 0F, 0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		turretModel[196].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[196].rotateAngleX = -1.18682389F;
		turretModel[196].rotateAngleY = -0.08726646F;

		turretModel[197].addShapeBox(-5.5F, 0F, 0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		turretModel[197].setRotationPoint(1.5F, -34.5F, 21F);
		turretModel[197].rotateAngleX = -1.18682389F;
		turretModel[197].rotateAngleY = -0.08726646F;

		turretModel[198].addShapeBox(-3.5F, -3.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 549
		turretModel[198].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[198].rotateAngleX = 1.43116999F;
		turretModel[198].rotateAngleY = -0.15707963F;
		turretModel[198].rotateAngleZ = -0.05235988F;

		turretModel[199].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		turretModel[199].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[199].rotateAngleX = 1.43116999F;
		turretModel[199].rotateAngleY = -0.15707963F;
		turretModel[199].rotateAngleZ = -0.05235988F;

		turretModel[200].addShapeBox(-3.5F, -3.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 551
		turretModel[200].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[200].rotateAngleX = 1.43116999F;
		turretModel[200].rotateAngleY = -0.15707963F;
		turretModel[200].rotateAngleZ = -0.05235988F;

		turretModel[201].addShapeBox(-0.5F, -2.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[201].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[201].rotateAngleX = 1.43116999F;
		turretModel[201].rotateAngleY = -0.15707963F;
		turretModel[201].rotateAngleZ = -0.05235988F;

		turretModel[202].addShapeBox(3.5F, -3.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 553
		turretModel[202].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[202].rotateAngleX = 1.43116999F;
		turretModel[202].rotateAngleY = -0.15707963F;
		turretModel[202].rotateAngleZ = -0.05235988F;

		turretModel[203].addShapeBox(6.5F, -2.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		turretModel[203].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[203].rotateAngleX = 1.43116999F;
		turretModel[203].rotateAngleY = -0.15707963F;
		turretModel[203].rotateAngleZ = -0.05235988F;

		turretModel[204].addShapeBox(3.5F, -3.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 555
		turretModel[204].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[204].rotateAngleX = 1.43116999F;
		turretModel[204].rotateAngleY = -0.15707963F;
		turretModel[204].rotateAngleZ = -0.05235988F;

		turretModel[205].addShapeBox(6.5F, -2.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		turretModel[205].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[205].rotateAngleX = 1.43116999F;
		turretModel[205].rotateAngleY = -0.15707963F;
		turretModel[205].rotateAngleZ = -0.05235988F;

		turretModel[206].addShapeBox(-10.5F, -3.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 557
		turretModel[206].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[206].rotateAngleX = 1.43116999F;
		turretModel[206].rotateAngleY = -0.15707963F;
		turretModel[206].rotateAngleZ = -0.05235988F;

		turretModel[207].addShapeBox(-7.5F, -2.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		turretModel[207].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[207].rotateAngleX = 1.43116999F;
		turretModel[207].rotateAngleY = -0.15707963F;
		turretModel[207].rotateAngleZ = -0.05235988F;

		turretModel[208].addShapeBox(-10.5F, -3.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 559
		turretModel[208].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[208].rotateAngleX = 1.43116999F;
		turretModel[208].rotateAngleY = -0.15707963F;
		turretModel[208].rotateAngleZ = -0.05235988F;

		turretModel[209].addShapeBox(-7.5F, -2.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		turretModel[209].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[209].rotateAngleX = 1.43116999F;
		turretModel[209].rotateAngleY = -0.15707963F;
		turretModel[209].rotateAngleZ = -0.05235988F;

		turretModel[210].addShapeBox(-0.5F, -2.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		turretModel[210].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[210].rotateAngleX = 1.43116999F;
		turretModel[210].rotateAngleY = -0.15707963F;
		turretModel[210].rotateAngleZ = -0.05235988F;

		turretModel[211].addShapeBox(-3.5F, -3.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 562
		turretModel[211].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[211].rotateAngleX = 1.43116999F;
		turretModel[211].rotateAngleY = -0.15707963F;
		turretModel[211].rotateAngleZ = -0.05235988F;

		turretModel[212].addShapeBox(-7.5F, -2.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		turretModel[212].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[212].rotateAngleX = 1.43116999F;
		turretModel[212].rotateAngleY = -0.15707963F;
		turretModel[212].rotateAngleZ = -0.05235988F;

		turretModel[213].addShapeBox(-10.5F, -3.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 564
		turretModel[213].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[213].rotateAngleX = 1.43116999F;
		turretModel[213].rotateAngleY = -0.15707963F;
		turretModel[213].rotateAngleZ = -0.05235988F;

		turretModel[214].addShapeBox(5.5F, -2.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		turretModel[214].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[214].rotateAngleX = 1.43116999F;
		turretModel[214].rotateAngleY = -0.15707963F;
		turretModel[214].rotateAngleZ = -0.05235988F;

		turretModel[215].addShapeBox(3.5F, -3.5F, 2.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 566
		turretModel[215].setRotationPoint(-23.5F, -32F, -21F);
		turretModel[215].rotateAngleX = 1.43116999F;
		turretModel[215].rotateAngleY = -0.15707963F;
		turretModel[215].rotateAngleZ = -0.05235988F;

		turretModel[216].addShapeBox(3.5F, -2.5F, -7.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 570
		turretModel[216].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[216].rotateAngleX = -1.43116999F;
		turretModel[216].rotateAngleY = 0.15707963F;
		turretModel[216].rotateAngleZ = -0.05235988F;

		turretModel[217].addShapeBox(-3.5F, -2.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 571
		turretModel[217].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[217].rotateAngleX = -1.43116999F;
		turretModel[217].rotateAngleY = 0.15707963F;
		turretModel[217].rotateAngleZ = -0.05235988F;

		turretModel[218].addShapeBox(-10.5F, -2.5F, -7.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 572
		turretModel[218].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[218].rotateAngleX = -1.43116999F;
		turretModel[218].rotateAngleY = 0.15707963F;
		turretModel[218].rotateAngleZ = -0.05235988F;

		turretModel[219].addShapeBox(-7.5F, -1.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		turretModel[219].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[219].rotateAngleX = -1.43116999F;
		turretModel[219].rotateAngleY = 0.15707963F;
		turretModel[219].rotateAngleZ = -0.05235988F;

		turretModel[220].addShapeBox(-0.5F, -1.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		turretModel[220].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[220].rotateAngleX = -1.43116999F;
		turretModel[220].rotateAngleY = 0.15707963F;
		turretModel[220].rotateAngleZ = -0.05235988F;

		turretModel[221].addShapeBox(5.5F, -1.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		turretModel[221].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[221].rotateAngleX = -1.43116999F;
		turretModel[221].rotateAngleY = 0.15707963F;
		turretModel[221].rotateAngleZ = -0.05235988F;

		turretModel[222].addShapeBox(6.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		turretModel[222].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[222].rotateAngleX = -1.43116999F;
		turretModel[222].rotateAngleY = 0.15707963F;
		turretModel[222].rotateAngleZ = -0.05235988F;

		turretModel[223].addShapeBox(-0.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		turretModel[223].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[223].rotateAngleX = -1.43116999F;
		turretModel[223].rotateAngleY = 0.15707963F;
		turretModel[223].rotateAngleZ = -0.05235988F;

		turretModel[224].addShapeBox(-7.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		turretModel[224].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[224].rotateAngleX = -1.43116999F;
		turretModel[224].rotateAngleY = 0.15707963F;
		turretModel[224].rotateAngleZ = -0.05235988F;

		turretModel[225].addShapeBox(6.5F, -1.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		turretModel[225].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[225].rotateAngleX = -1.43116999F;
		turretModel[225].rotateAngleY = 0.15707963F;
		turretModel[225].rotateAngleZ = -0.05235988F;

		turretModel[226].addShapeBox(-0.5F, -1.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		turretModel[226].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[226].rotateAngleX = -1.43116999F;
		turretModel[226].rotateAngleY = 0.15707963F;
		turretModel[226].rotateAngleZ = -0.05235988F;

		turretModel[227].addShapeBox(-7.5F, -1.5F, 4.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[227].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[227].rotateAngleX = -1.43116999F;
		turretModel[227].rotateAngleY = 0.15707963F;
		turretModel[227].rotateAngleZ = -0.05235988F;

		turretModel[228].addShapeBox(3.5F, -2.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 582
		turretModel[228].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[228].rotateAngleX = -1.43116999F;
		turretModel[228].rotateAngleY = 0.15707963F;
		turretModel[228].rotateAngleZ = -0.05235988F;

		turretModel[229].addShapeBox(-3.5F, -2.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 583
		turretModel[229].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[229].rotateAngleX = -1.43116999F;
		turretModel[229].rotateAngleY = 0.15707963F;
		turretModel[229].rotateAngleZ = -0.05235988F;

		turretModel[230].addShapeBox(-10.5F, -2.5F, -2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 584
		turretModel[230].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[230].rotateAngleX = -1.43116999F;
		turretModel[230].rotateAngleY = 0.15707963F;
		turretModel[230].rotateAngleZ = -0.05235988F;

		turretModel[231].addShapeBox(-10.5F, -2.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 585
		turretModel[231].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[231].rotateAngleX = -1.43116999F;
		turretModel[231].rotateAngleY = 0.15707963F;
		turretModel[231].rotateAngleZ = -0.05235988F;

		turretModel[232].addShapeBox(-3.5F, -2.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 586
		turretModel[232].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[232].rotateAngleX = -1.43116999F;
		turretModel[232].rotateAngleY = 0.15707963F;
		turretModel[232].rotateAngleZ = -0.05235988F;

		turretModel[233].addShapeBox(3.5F, -2.5F, 2.5F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 587
		turretModel[233].setRotationPoint(-23.5F, -32F, 20F);
		turretModel[233].rotateAngleX = -1.43116999F;
		turretModel[233].rotateAngleY = 0.15707963F;
		turretModel[233].rotateAngleZ = -0.05235988F;


		leftTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 317
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 318
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 319
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 320
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 321
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 322
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 323
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Shape 324
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 335
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 337
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 338
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 340
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 341
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 342
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 280
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 281
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 282

		leftTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 317
		leftTrackWheelModels[0].setRotationPoint(-2F, 3F, 31.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 318
		leftTrackWheelModels[1].setRotationPoint(14F, 3F, 31.5F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 319
		leftTrackWheelModels[2].setRotationPoint(31F, 3F, 31.5F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 320
		leftTrackWheelModels[3].setRotationPoint(45F, -7F, 31.5F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 321
		leftTrackWheelModels[4].setRotationPoint(-19F, 3F, 31.5F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 322
		leftTrackWheelModels[5].setRotationPoint(-36F, 3F, 31.5F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 323
		leftTrackWheelModels[6].setRotationPoint(-53F, 3F, 31.5F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 324
		leftTrackWheelModels[7].setRotationPoint(-67F, -8F, 33F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackWheelModels[8].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftTrackWheelModels[9].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 338
		leftTrackWheelModels[10].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 340
		leftTrackWheelModels[11].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		leftTrackWheelModels[12].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackWheelModels[13].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftTrackWheelModels[14].setRotationPoint(-38F, -11F, 24.5F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 281
		leftTrackWheelModels[15].setRotationPoint(-38F, -11F, 24.5F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackWheelModels[16].setRotationPoint(-38F, -11F, 24.5F);


		rightTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 325
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 326
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 327
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 328
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 329
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 330
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 331
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Shape 332
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 286
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 287
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 288
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 289
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 290
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 291
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 292
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 293
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 294

		rightTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 325
		rightTrackWheelModels[0].setRotationPoint(-2F, 3F, -24.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 326
		rightTrackWheelModels[1].setRotationPoint(14F, 3F, -24.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 327
		rightTrackWheelModels[2].setRotationPoint(31F, 3F, -24.5F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 328
		rightTrackWheelModels[3].setRotationPoint(45F, -7F, -24.5F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 329
		rightTrackWheelModels[4].setRotationPoint(-19F, 3F, -24.5F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 330
		rightTrackWheelModels[5].setRotationPoint(-36F, 3F, -24.5F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 331
		rightTrackWheelModels[6].setRotationPoint(-53F, 3F, -24.5F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 332
		rightTrackWheelModels[7].setRotationPoint(-67F, -8F, -20F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackWheelModels[8].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackWheelModels[9].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 288
		rightTrackWheelModels[10].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 289
		rightTrackWheelModels[11].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[12].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackWheelModels[13].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackWheelModels[14].setRotationPoint(-38F, -11F, -29.5F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 293
		rightTrackWheelModels[15].setRotationPoint(-38F, -11F, -29.5F);

		rightTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackWheelModels[16].setRotationPoint(-38F, -11F, -29.5F);


		fancyTrackModel = new ModelRendererTurbo[3];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 0
		fancyTrackModel[1] = new ModelRendererTurbo(this, 129, 70, textureX, textureY); // Box 1
		fancyTrackModel[2] = new ModelRendererTurbo(this, 129, 70, textureX, textureY); // Box 2

		fancyTrackModel[0].addShapeBox(-1.5F, -1F, -5.5F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		fancyTrackModel[1].addShapeBox(-2.5F, -1F, -6.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		fancyTrackModel[2].addShapeBox(-2.5F, -1F, 5.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2



		barrelSpecModel = new ModelRendererTurbo[43];
		barrelSpecModel[0] = new ModelRendererTurbo(this, 250, 1730, textureX, textureY); // Box 441
		barrelSpecModel[1] = new ModelRendererTurbo(this, 250, 1741, textureX, textureY); // Box 442
		barrelSpecModel[2] = new ModelRendererTurbo(this, 250, 1753, textureX, textureY); // Box 443
		barrelSpecModel[3] = new ModelRendererTurbo(this, 250, 1762, textureX, textureY); // Box 444
		barrelSpecModel[4] = new ModelRendererTurbo(this, 250, 1770, textureX, textureY); // Box 445
		barrelSpecModel[5] = new ModelRendererTurbo(this, 285, 1762, textureX, textureY); // Box 446
		barrelSpecModel[6] = new ModelRendererTurbo(this, 285, 1753, textureX, textureY); // Box 447
		barrelSpecModel[7] = new ModelRendererTurbo(this, 285, 1741, textureX, textureY); // Box 448
		barrelSpecModel[8] = new ModelRendererTurbo(this, 285, 1730, textureX, textureY); // Box 449
		barrelSpecModel[9] = new ModelRendererTurbo(this, 250, 1797, textureX, textureY); // Box 450
		barrelSpecModel[10] = new ModelRendererTurbo(this, 250, 1825, textureX, textureY); // Box 451
		barrelSpecModel[11] = new ModelRendererTurbo(this, 250, 1840, textureX, textureY); // Box 452
		barrelSpecModel[12] = new ModelRendererTurbo(this, 250, 1857, textureX, textureY); // Box 453
		barrelSpecModel[13] = new ModelRendererTurbo(this, 250, 1875, textureX, textureY); // Box 454
		barrelSpecModel[14] = new ModelRendererTurbo(this, 250, 1890, textureX, textureY); // Box 455
		barrelSpecModel[15] = new ModelRendererTurbo(this, 250, 1895, textureX, textureY); // Box 456
		barrelSpecModel[16] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 457
		barrelSpecModel[17] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 458
		barrelSpecModel[18] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 459
		barrelSpecModel[19] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 460
		barrelSpecModel[20] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 461
		barrelSpecModel[21] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 462
		barrelSpecModel[22] = new ModelRendererTurbo(this, 250, 1916, textureX, textureY); // Box 588
		barrelSpecModel[23] = new ModelRendererTurbo(this, 250, 1943, textureX, textureY); // Box 589
		barrelSpecModel[24] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 590
		barrelSpecModel[25] = new ModelRendererTurbo(this, 250, 1943, textureX, textureY); // Box 591
		barrelSpecModel[26] = new ModelRendererTurbo(this, 250, 1943, textureX, textureY); // Box 593
		barrelSpecModel[27] = new ModelRendererTurbo(this, 250, 1943, textureX, textureY); // Box 594
		barrelSpecModel[28] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 595
		barrelSpecModel[29] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 596
		barrelSpecModel[30] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 597
		barrelSpecModel[31] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 598
		barrelSpecModel[32] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 599
		barrelSpecModel[33] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 600
		barrelSpecModel[34] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 601
		barrelSpecModel[35] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 602
		barrelSpecModel[36] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 603
		barrelSpecModel[37] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 604
		barrelSpecModel[38] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 605
		barrelSpecModel[39] = new ModelRendererTurbo(this, 250, 1957, textureX, textureY); // Box 606
		barrelSpecModel[40] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 607
		barrelSpecModel[41] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 650
		barrelSpecModel[42] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 651

		barrelSpecModel[0].addShapeBox(-1F, 0F, -11F, 10, 4, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		barrelSpecModel[0].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[1].addShapeBox(-1F, -6F, -11F, 9, 6, 5, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 442
		barrelSpecModel[1].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[2].addShapeBox(-1F, -9F, -11F, 4, 3, 5, 0F, 2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 443
		barrelSpecModel[2].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[3].addShapeBox(0F, 4F, -10F, 9, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 444
		barrelSpecModel[3].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[4].addShapeBox(-4F, -7F, -11F, 3, 5, 21, 0F, 0F, -0.115F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		barrelSpecModel[4].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[5].addShapeBox(0F, 4F, 5F, 9, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 446
		barrelSpecModel[5].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[6].addShapeBox(-1F, -9F, 5F, 4, 3, 5, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		barrelSpecModel[6].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[7].addShapeBox(-1F, -6F, 5F, 9, 6, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		barrelSpecModel[7].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[8].addShapeBox(-1F, 0F, 5F, 10, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 449
		barrelSpecModel[8].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[9].addShapeBox(0F, 0F, -11F, 6, 6, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 450
		barrelSpecModel[9].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[10].addShapeBox(0F, 4F, -6F, 9, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 451
		barrelSpecModel[10].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[11].addShapeBox(-1F, 0F, -6F, 10, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		barrelSpecModel[11].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[12].addShapeBox(-1F, -6F, -6F, 9, 6, 11, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 453
		barrelSpecModel[12].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[13].addShapeBox(-1F, -9F, -6F, 4, 3, 11, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 454
		barrelSpecModel[13].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[14].addShapeBox(6F, -2.5F, -8F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		barrelSpecModel[14].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[15].addShapeBox(6F, -3.5F, -4F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		barrelSpecModel[15].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[16].addShapeBox(10F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 457
		barrelSpecModel[16].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[17].addShapeBox(11F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		barrelSpecModel[17].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[18].addShapeBox(13F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		barrelSpecModel[18].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[19].addShapeBox(12F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 460
		barrelSpecModel[19].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[20].addShapeBox(15F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		barrelSpecModel[20].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[21].addShapeBox(14F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 462
		barrelSpecModel[21].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[22].addShapeBox(-7F, -7F, -11F, 3, 5, 21, 0F, 0F, -2F, 0F, 0F, -0.115F, 0F, 0F, -0.115F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		barrelSpecModel[22].setRotationPoint(0F, 0F, 0F);

		barrelSpecModel[23].addShapeBox(-3.5F, -3.5F, -2.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 589
		barrelSpecModel[23].setRotationPoint(9.5F, 3.5F, 4.5F);
		barrelSpecModel[23].rotateAngleY = 0.41887902F;
		barrelSpecModel[23].rotateAngleZ = -0.78539816F;

		barrelSpecModel[24].addShapeBox(-1.5F, -2.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		barrelSpecModel[24].setRotationPoint(9.5F, 3.5F, 4.5F);
		barrelSpecModel[24].rotateAngleY = 0.41887902F;
		barrelSpecModel[24].rotateAngleZ = -0.78539816F;

		barrelSpecModel[25].addShapeBox(-3.5F, -3.5F, 2.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 591
		barrelSpecModel[25].setRotationPoint(9.5F, 3.5F, 4.5F);
		barrelSpecModel[25].rotateAngleY = 0.41887902F;
		barrelSpecModel[25].rotateAngleZ = -0.78539816F;

		barrelSpecModel[26].addShapeBox(-3.5F, -3.5F, -9.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 593
		barrelSpecModel[26].setRotationPoint(9.5F, 4.5F, -4.5F);
		barrelSpecModel[26].rotateAngleY = -0.2443461F;
		barrelSpecModel[26].rotateAngleZ = -0.85521133F;

		barrelSpecModel[27].addShapeBox(-3.5F, -3.5F, -4.5F, 5, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 594
		barrelSpecModel[27].setRotationPoint(9.5F, 4.5F, -4.5F);
		barrelSpecModel[27].rotateAngleY = -0.2443461F;
		barrelSpecModel[27].rotateAngleZ = -0.85521133F;

		barrelSpecModel[28].addShapeBox(-1.5F, -2.5F, -2.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		barrelSpecModel[28].setRotationPoint(9.5F, 4.5F, -4.5F);
		barrelSpecModel[28].rotateAngleY = -0.2443461F;
		barrelSpecModel[28].rotateAngleZ = -0.85521133F;

		barrelSpecModel[29].addShapeBox(-3.5F, -2.5F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 596
		barrelSpecModel[29].setRotationPoint(6.5F, -2F, 8.5F);
		barrelSpecModel[29].rotateAngleY = 0.15707963F;
		barrelSpecModel[29].rotateAngleZ = -1.08210414F;

		barrelSpecModel[30].addShapeBox(-1.5F, -1.5F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		barrelSpecModel[30].setRotationPoint(6.5F, -2F, 8.5F);
		barrelSpecModel[30].rotateAngleY = 0.15707963F;
		barrelSpecModel[30].rotateAngleZ = -1.08210414F;

		barrelSpecModel[31].addShapeBox(-3.5F, -2.5F, -6F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 598
		barrelSpecModel[31].setRotationPoint(6.5F, -2F, -8.5F);
		barrelSpecModel[31].rotateAngleY = -0.43633231F;
		barrelSpecModel[31].rotateAngleZ = -1.08210414F;

		barrelSpecModel[32].addShapeBox(-1.5F, -1.5F, -3F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		barrelSpecModel[32].setRotationPoint(6.5F, -2F, -8.5F);
		barrelSpecModel[32].rotateAngleY = -0.43633231F;
		barrelSpecModel[32].rotateAngleZ = -1.08210414F;

		barrelSpecModel[33].addShapeBox(-3.5F, -2F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 600
		barrelSpecModel[33].setRotationPoint(6.5F, -5F, 2.5F);
		barrelSpecModel[33].rotateAngleZ = -0.55850536F;

		barrelSpecModel[34].addShapeBox(-1.5F, -1F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		barrelSpecModel[34].setRotationPoint(6.5F, -5F, 2.5F);
		barrelSpecModel[34].rotateAngleZ = -0.55850536F;

		barrelSpecModel[35].addShapeBox(-3.5F, -2F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 602
		barrelSpecModel[35].setRotationPoint(6.5F, -5F, -4.5F);
		barrelSpecModel[35].rotateAngleZ = -0.55850536F;

		barrelSpecModel[36].addShapeBox(-1.5F, -1F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		barrelSpecModel[36].setRotationPoint(6.5F, -5F, -4.5F);
		barrelSpecModel[36].rotateAngleZ = -0.55850536F;

		barrelSpecModel[37].addShapeBox(-8.5F, -2F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 604
		barrelSpecModel[37].setRotationPoint(6.5F, -5F, -4.5F);
		barrelSpecModel[37].rotateAngleZ = -0.55850536F;

		barrelSpecModel[38].addShapeBox(-6.5F, -1F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		barrelSpecModel[38].setRotationPoint(6.5F, -5F, -4.5F);
		barrelSpecModel[38].rotateAngleZ = -0.55850536F;

		barrelSpecModel[39].addShapeBox(-8.5F, -2F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 606
		barrelSpecModel[39].setRotationPoint(6.5F, -5F, 2.5F);
		barrelSpecModel[39].rotateAngleZ = -0.55850536F;

		barrelSpecModel[40].addShapeBox(-6.5F, -1F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		barrelSpecModel[40].setRotationPoint(6.5F, -5F, 2.5F);
		barrelSpecModel[40].rotateAngleZ = -0.55850536F;

		barrelSpecModel[41].addShapeBox(-1.5F, -2.5F, 3.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		barrelSpecModel[41].setRotationPoint(9.5F, 3.5F, 4.5F);
		barrelSpecModel[41].rotateAngleY = 0.41887902F;
		barrelSpecModel[41].rotateAngleZ = -0.78539816F;

		barrelSpecModel[42].addShapeBox(-1.5F, -2.5F, -5.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		barrelSpecModel[42].setRotationPoint(9.5F, 4.5F, -4.5F);
		barrelSpecModel[42].rotateAngleY = -0.2443461F;
		barrelSpecModel[42].rotateAngleZ = -0.85521133F;
		
		
		animBarrelModel = new ModelRendererTurbo[8];
		animBarrelModel[0] = new ModelRendererTurbo(this, 250, 1606, textureX, textureY); // Box 463
		animBarrelModel[1] = new ModelRendererTurbo(this, 250, 1616, textureX, textureY); // Box 464
		animBarrelModel[2] = new ModelRendererTurbo(this, 250, 1627, textureX, textureY); // Box 465
		animBarrelModel[3] = new ModelRendererTurbo(this, 250, 1636, textureX, textureY); // Box 466
		animBarrelModel[4] = new ModelRendererTurbo(this, 250, 1641, textureX, textureY); // Box 467
		animBarrelModel[5] = new ModelRendererTurbo(this, 250, 1648, textureX, textureY); // Box 468
		animBarrelModel[6] = new ModelRendererTurbo(this, 250, 1655, textureX, textureY); // Box 469
		animBarrelModel[7] = new ModelRendererTurbo(this, 250, 1655, textureX, textureY); // Box 470

		animBarrelModel[0].addShapeBox(16F, -2.5F, -3F, 12, 4, 4, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 463

		animBarrelModel[1].addShapeBox(28F, -3F, -4F, 10, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464

		animBarrelModel[2].addShapeBox(38F, -2.5F, -3F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465

		animBarrelModel[3].addShapeBox(40F, -1.5F, -2F, 2, 2, 2, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 466

		animBarrelModel[4].addShapeBox(42F, -2F, -2.5F, 47, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467

		animBarrelModel[5].addShapeBox(82F, -2F, -2.5F, 1, 3, 3, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 468

		animBarrelModel[6].addShapeBox(28F, -4F, -4F, 10, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469

		animBarrelModel[7].addShapeBox(28F, 1F, -4F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 470


		
		barrelAttach = new Vector3f(22.5F/16F,28F/16F,0F);


		translateAll(22.5F/16F, -28F/16F, 0F);


		flipAll();
	}
	
	private void initBodyModel()
	{
		bodyModel = new ModelRendererTurbo[318];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 287, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Box 82
		bodyModel[71] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 0, 748, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 0, 763, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 0, 777, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 0, 798, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 0, 836, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 0, 879, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 0, 928, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 0, 977, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1026, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Shape 107
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Shape 108
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1114, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Box 125
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Box 126
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 134
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 137
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Box 138
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 139
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Box 141
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 142
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Box 143
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 144
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 145
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 146
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 147
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Box 148
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 149
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Box 150
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 151
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 152
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 153
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 154
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Box 155
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Box 156
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 157
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 20, 1246, textureX, textureY); // Box 159
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 160
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 161
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 165
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 166
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 169
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 170
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 171
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 173
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 174
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 175
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 177
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 178
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 179
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 180
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 181
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 182
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 183
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 184
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 185
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 186
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 187
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 188
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 189
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 190
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 191
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 192
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 193
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 194
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 195
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 196
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 197
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 198
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 199
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 200
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 201
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 202
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 203
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 204
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 205
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 206
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 207
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 208
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 209
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 210
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 211
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 212
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 213
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 214
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 215
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 216
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 217
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 218
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 219
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 220
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 221
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 222
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 223
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 224
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 225
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 226
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 227
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 228
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 229
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 230
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 231
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 232
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 233
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 234
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 235
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 236
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 237
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 238
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 239
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 240
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 241
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 333
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 339
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 343
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 279
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 283
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 284
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 285
		bodyModel[233] = new ModelRendererTurbo(this, 30, 763, textureX, textureY); // Box 471
		bodyModel[234] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 477
		bodyModel[235] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 478
		bodyModel[236] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 479
		bodyModel[237] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 480
		bodyModel[238] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 481
		bodyModel[239] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 482
		bodyModel[240] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 483
		bodyModel[241] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 484
		bodyModel[242] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 485
		bodyModel[243] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 486
		bodyModel[244] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 487
		bodyModel[245] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 488
		bodyModel[246] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 489
		bodyModel[247] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 490
		bodyModel[248] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 491
		bodyModel[249] = new ModelRendererTurbo(this, 0, 1341, textureX, textureY); // Box 492
		bodyModel[250] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 493
		bodyModel[251] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 494
		bodyModel[252] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 495
		bodyModel[253] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 496
		bodyModel[254] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 497
		bodyModel[255] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 498
		bodyModel[256] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 499
		bodyModel[257] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 500
		bodyModel[258] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 501
		bodyModel[259] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 502
		bodyModel[260] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 503
		bodyModel[261] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 504
		bodyModel[262] = new ModelRendererTurbo(this, 0, 1357, textureX, textureY); // Box 505
		bodyModel[263] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 506
		bodyModel[264] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 507
		bodyModel[265] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 508
		bodyModel[266] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 509
		bodyModel[267] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 510
		bodyModel[268] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 511
		bodyModel[269] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 512
		bodyModel[270] = new ModelRendererTurbo(this, 0, 1333, textureX, textureY); // Box 604
		bodyModel[271] = new ModelRendererTurbo(this, 0, 1367, textureX, textureY); // Box 605
		bodyModel[272] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Box 606
		bodyModel[273] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Box 607
		bodyModel[274] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 608
		bodyModel[275] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 609
		bodyModel[276] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 610
		bodyModel[277] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 611
		bodyModel[278] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 612
		bodyModel[279] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 613
		bodyModel[280] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 618
		bodyModel[281] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 619
		bodyModel[282] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 620
		bodyModel[283] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 621
		bodyModel[284] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 622
		bodyModel[285] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 623
		bodyModel[286] = new ModelRendererTurbo(this, 0, 1333, textureX, textureY); // Box 624
		bodyModel[287] = new ModelRendererTurbo(this, 0, 1395, textureX, textureY); // Box 625
		bodyModel[288] = new ModelRendererTurbo(this, 0, 1367, textureX, textureY); // Box 626
		bodyModel[289] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 627
		bodyModel[290] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 628
		bodyModel[291] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 629
		bodyModel[292] = new ModelRendererTurbo(this, 0, 1381, textureX, textureY); // Box 630
		bodyModel[293] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 631
		bodyModel[294] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 632
		bodyModel[295] = new ModelRendererTurbo(this, 0, 1405, textureX, textureY); // Box 633
		bodyModel[296] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 634
		bodyModel[297] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 635
		bodyModel[298] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 636
		bodyModel[299] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 637
		bodyModel[300] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 638
		bodyModel[301] = new ModelRendererTurbo(this, 0, 1410, textureX, textureY); // Box 639
		bodyModel[302] = new ModelRendererTurbo(this, 0, 1418, textureX, textureY); // Box 640
		bodyModel[303] = new ModelRendererTurbo(this, 0, 1426, textureX, textureY); // Box 641
		bodyModel[304] = new ModelRendererTurbo(this, 0, 1434, textureX, textureY); // Box 642
		bodyModel[305] = new ModelRendererTurbo(this, 0, 1441, textureX, textureY); // Box 643
		bodyModel[306] = new ModelRendererTurbo(this, 0, 1448, textureX, textureY); // Box 645
		bodyModel[307] = new ModelRendererTurbo(this, 0, 1454, textureX, textureY); // Box 646
		bodyModel[308] = new ModelRendererTurbo(this, 0, 1466, textureX, textureY); // Box 647
		bodyModel[309] = new ModelRendererTurbo(this, 0, 1418, textureX, textureY); // Box 648
		bodyModel[310] = new ModelRendererTurbo(this, 0, 1426, textureX, textureY); // Box 649
		bodyModel[311] = new ModelRendererTurbo(this, 0, 1434, textureX, textureY); // Box 650
		bodyModel[312] = new ModelRendererTurbo(this, 0, 1441, textureX, textureY); // Box 651
		bodyModel[313] = new ModelRendererTurbo(this, 0, 1448, textureX, textureY); // Box 652
		bodyModel[314] = new ModelRendererTurbo(this, 0, 1454, textureX, textureY); // Box 653
		bodyModel[315] = new ModelRendererTurbo(this, 0, 1466, textureX, textureY); // Box 654
		bodyModel[316] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Box 652
		bodyModel[317] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Box 653

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 14, 39, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 18F, -7F, 0F, 18F, -7F, 0F, 0F, -7F, 2F); // Box 0
		bodyModel[0].setRotationPoint(37.5F, -16.5F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -14F, -1F, -2F, -15F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(37.5F, -9.5F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -14F, -1F, -2F, 0F, -1F, -2F); // Box 2
		bodyModel[2].setRotationPoint(37.5F, -9.5F, 0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-58.5F, -9.5F, -19.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 6
		bodyModel[4].setRotationPoint(-58.5F, -9.5F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -9F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, -10F, 0F, 0.5F); // Box 7
		bodyModel[5].setRotationPoint(-71.5F, -9.5F, -19.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.5F, 0F, 0F, -10F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -9F, -1F, -2F); // Box 8
		bodyModel[6].setRotationPoint(-71.5F, -9.5F, 0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F, 0F, 0F, 0F, 93F, 0F, 0F, 93F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 93F, 0F, 2F, 93F, 0F, 2F, 0F, 0F, 2F); // Box 9
		bodyModel[7].setRotationPoint(-58.5F, -16.5F, -19.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 39, 0F, 0F, 0F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[8].setRotationPoint(37.5F, -19F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 2, 39, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		bodyModel[9].setRotationPoint(13.5F, -19F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 12
		bodyModel[10].setRotationPoint(-63.5F, -17.5F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 13
		bodyModel[11].setRotationPoint(20.5F, -17.5F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[12].setRotationPoint(37.5F, -17.5F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Box 15
		bodyModel[13].setRotationPoint(45.5F, -17F, -34F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F); // Box 16
		bodyModel[14].setRotationPoint(50.5F, -15.5F, -34F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[15].setRotationPoint(45.5F, -15.5F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, 2.5F, -0.5F, -1F, 2.5F, 0F, 0F, -0.5F, -0.5F); // Box 18
		bodyModel[16].setRotationPoint(50.5F, -14F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 19
		bodyModel[17].setRotationPoint(-66.5F, -17.5F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F); // Box 20
		bodyModel[18].setRotationPoint(-70.5F, -17.5F, -34F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, -1F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 3F, -0.5F); // Box 21
		bodyModel[19].setRotationPoint(-75.5F, -16F, -34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[20].setRotationPoint(-63.5F, -17F, -34F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[21].setRotationPoint(-44.5F, -17F, -34F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-60.5F, -20F, -34.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-60F, -21F, -32.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-60F, -21F, -34.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-58F, -21.5F, -25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-48.5F, -21.5F, -25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 30
		bodyModel[27].setRotationPoint(-39.5F, -22.8F, -30F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 31
		bodyModel[28].setRotationPoint(-23.5F, -22.8F, -30F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-41.5F, -22.3F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-15.5F, -19F, -34.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-15.5F, -20F, -32.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-15.5F, -20F, -34.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-14.5F, -20.5F, -26F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-4.5F, -20.5F, -26F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(6.5F, -20.5F, -26F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(16.5F, -20.5F, -26F);

		bodyModel[37].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(50.5F, -15.5F, -34F);
		bodyModel[37].rotateAngleZ = -0.34906585F;

		bodyModel[38].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(50.5F, -15.5F, -33F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(50.5F, -15.5F, -20F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(50.5F, -15.5F, -20F);
		bodyModel[40].rotateAngleZ = -0.34906585F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[41].setRotationPoint(-63.5F, -17.5F, 19F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[42].setRotationPoint(20.5F, -17.5F, 19F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[43].setRotationPoint(37.5F, -17.5F, 19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[44].setRotationPoint(45.5F, -17F, 19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[45].setRotationPoint(50.5F, -15.5F, 19F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyModel[46].setRotationPoint(-66.5F, -17.5F, 19F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 50
		bodyModel[47].setRotationPoint(-70.5F, -17.5F, 19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 3F, 0F); // Box 51
		bodyModel[48].setRotationPoint(-75.5F, -16F, 19F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[49].setRotationPoint(-63.5F, -17F, 33F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[50].setRotationPoint(-44.5F, -17F, 33F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-60.5F, -20F, 22.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-60F, -21F, 24.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 56
		bodyModel[53].setRotationPoint(-60F, -21F, 32.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[54].setRotationPoint(-58F, -21.5F, 24F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[55].setRotationPoint(-48.5F, -21.5F, 24F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 59
		bodyModel[56].setRotationPoint(-39.5F, -22.8F, 21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 60
		bodyModel[57].setRotationPoint(-23.5F, -22.8F, 21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F); // Box 61
		bodyModel[58].setRotationPoint(-41.5F, -22.3F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[59].setRotationPoint(-15.5F, -19F, 20.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(-15.5F, -20F, 25.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 64
		bodyModel[61].setRotationPoint(-15.5F, -20F, 32.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(-14.5F, -20.5F, 25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[63].setRotationPoint(-4.5F, -20.5F, 25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[64].setRotationPoint(6.5F, -20.5F, 25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[65].setRotationPoint(16.5F, -20.5F, 25F);

		bodyModel[66].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 69
		bodyModel[66].setRotationPoint(50.5F, -15.5F, 20F);
		bodyModel[66].rotateAngleZ = -0.34906585F;

		bodyModel[67].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[67].setRotationPoint(50.5F, -15.5F, 20F);
		bodyModel[67].rotateAngleZ = -0.34906585F;

		bodyModel[68].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[68].setRotationPoint(50.5F, -15.5F, 18F);
		bodyModel[68].rotateAngleZ = -0.34906585F;

		bodyModel[69].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(50.5F, -15.5F, 18F);
		bodyModel[69].rotateAngleZ = -0.34906585F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[70].setRotationPoint(-22F, -19.5F, -20F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[71].setRotationPoint(-22F, -19.5F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 4, 34, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[72].setRotationPoint(-30F, -21F, -17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[73].setRotationPoint(-30F, -21F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[74].setRotationPoint(-30F, -21F, 17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[75].setRotationPoint(-29.9F, -22F, -21F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[76].setRotationPoint(-29.9F, -22F, 17F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 6, 15, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[77].setRotationPoint(-45F, -25F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, -0.5F, -5F, -4F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[78].setRotationPoint(-45F, -25.5F, -13.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, 4F); // Box 91
		bodyModel[79].setRotationPoint(-45F, -25.5F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 19, 6, 14, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(-45F, -25.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 4F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 93
		bodyModel[81].setRotationPoint(-51F, -25.5F, -16F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -2F, 0F, 4F); // Box 94
		bodyModel[82].setRotationPoint(-51F, -25.5F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[83].setRotationPoint(-53F, -25F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(-52.5F, -25.5F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 3F, 2.5F, -1.5F, 3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 97
		bodyModel[85].setRotationPoint(-58F, -25.5F, -16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[86].setRotationPoint(-58F, -25.5F, -7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 6, 32, 0F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -2F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -2F, 2F); // Box 100
		bodyModel[87].setRotationPoint(-72F, -25.5F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 5, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[88].setRotationPoint(-72F, -21.5F, -19F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 102
		bodyModel[89].setRotationPoint(-62F, -21.5F, -22F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 5, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[90].setRotationPoint(-59F, -21.5F, -22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[91].setRotationPoint(-46F, -21.5F, -22F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 13, 5, 40, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[92].setRotationPoint(-43F, -21.5F, -20F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Shape 107
		bodyModel[93].setRotationPoint(-72F, -12.5F, 2F);
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Shape 108
		bodyModel[94].setRotationPoint(-73F, -12.5F, -2F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 109
		bodyModel[95].setRotationPoint(-64.5F, -20.5F, -33F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[96].setRotationPoint(-70.5F, -19.5F, -27F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[97].setRotationPoint(-64.5F, -20.5F, 19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[98].setRotationPoint(-70.5F, -19.5F, 21F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[99].setRotationPoint(-18.5F, -20.8F, -28F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[100].setRotationPoint(-18.5F, -20.8F, -24F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[101].setRotationPoint(-18.5F, -20.8F, 27F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[102].setRotationPoint(-18.5F, -20.8F, 23F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[103].setRotationPoint(-74.5F, -9.5F, -2F);

		bodyModel[104].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[104].setRotationPoint(-72.5F, -9.5F, -11F);
		bodyModel[104].rotateAngleZ = 0.36651914F;

		bodyModel[105].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[105].setRotationPoint(-72.5F, -9.5F, 6F);
		bodyModel[105].rotateAngleZ = 0.36651914F;

		bodyModel[106].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[106].setRotationPoint(-74.5F, -8.5F, -18F);

		bodyModel[107].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[107].setRotationPoint(-74.5F, -9.5F, -18F);

		bodyModel[108].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[108].setRotationPoint(-75F, -9F, -17F);

		bodyModel[109].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[109].setRotationPoint(-74.5F, -8.5F, 14F);

		bodyModel[110].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[110].setRotationPoint(-74.5F, -9.5F, 14F);

		bodyModel[111].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[111].setRotationPoint(-75F, -9F, 15F);

		bodyModel[112].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F, -1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Box 126
		bodyModel[112].setRotationPoint(-74.5F, -6.5F, -15.2F);

		bodyModel[113].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F, -1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(-74.5F, -6.5F, 12.2F);

		bodyModel[114].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 129
		bodyModel[114].setRotationPoint(50.5F, -15.5F, -24F);
		bodyModel[114].rotateAngleZ = -0.34906585F;

		bodyModel[115].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 130
		bodyModel[115].setRotationPoint(50.5F, -15.5F, -19F);
		bodyModel[115].rotateAngleZ = -0.34906585F;

		bodyModel[116].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[116].setRotationPoint(50.5F, -15.5F, -15F);
		bodyModel[116].rotateAngleZ = -0.34906585F;

		bodyModel[117].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[117].setRotationPoint(50.5F, -15.5F, -11F);
		bodyModel[117].rotateAngleZ = -0.34906585F;

		bodyModel[118].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[118].setRotationPoint(50.5F, -15.5F, 19F);
		bodyModel[118].rotateAngleZ = -0.34906585F;

		bodyModel[119].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[119].setRotationPoint(50.5F, -15.5F, 15F);
		bodyModel[119].rotateAngleZ = -0.34906585F;

		bodyModel[120].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[120].setRotationPoint(50.5F, -15.5F, 10F);
		bodyModel[120].rotateAngleZ = -0.34906585F;

		bodyModel[121].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[121].setRotationPoint(50.5F, -15.5F, 10F);
		bodyModel[121].rotateAngleZ = -0.34906585F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[122].setRotationPoint(48F, -15.5F, -17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[123].setRotationPoint(48F, -16.5F, -17.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[124].setRotationPoint(48F, -15.5F, 16.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[125].setRotationPoint(48F, -16.5F, 16.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[126].setRotationPoint(52F, -12.5F, -15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[127].setRotationPoint(52.5F, -13.5F, -14.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[128].setRotationPoint(51F, -16.5F, -15.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[129].setRotationPoint(51F, -16.5F, -16.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 145
		bodyModel[130].setRotationPoint(51F, -16.5F, -12.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146
		bodyModel[131].setRotationPoint(53.5F, -16F, -16F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 147
		bodyModel[132].setRotationPoint(53.5F, -16F, -14F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[133].setRotationPoint(52F, -12.5F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[134].setRotationPoint(52.5F, -13.5F, 13.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[135].setRotationPoint(51F, -16.5F, 12.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 151
		bodyModel[136].setRotationPoint(51F, -16.5F, 15.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[137].setRotationPoint(51F, -16.5F, 11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 153
		bodyModel[138].setRotationPoint(53.5F, -16F, 14F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154
		bodyModel[139].setRotationPoint(53.5F, -16F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 155
		bodyModel[140].setRotationPoint(26.5F, -19.5F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[141].setRotationPoint(27.5F, -19.5F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 157
		bodyModel[142].setRotationPoint(29.5F, -19.5F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[143].setRotationPoint(32.5F, -19.5F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 159
		bodyModel[144].setRotationPoint(32.5F, -19.5F, 0F);

		bodyModel[145].addShapeBox(3F, -1F, -2F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[145].setRotationPoint(32.5F, -19.5F, 0F);

		bodyModel[146].addShapeBox(4F, -1F, -5F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[146].setRotationPoint(32.5F, -19.5F, 0F);
		bodyModel[146].rotateAngleY = -0.76794487F;

		bodyModel[147].addShapeBox(4F, -1F, 1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[147].setRotationPoint(32.5F, -19.5F, 0F);
		bodyModel[147].rotateAngleY = 0.76794487F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 163
		bodyModel[148].setRotationPoint(-46F, -2F, -21.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 164
		bodyModel[149].setRotationPoint(-54F, -2F, -22.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[150].setRotationPoint(-55F, 1F, -24.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[151].setRotationPoint(-54F, -7F, -23.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 167
		bodyModel[152].setRotationPoint(-54F, -7F, -21.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[153].setRotationPoint(-53.5F, -2F, -23F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 169
		bodyModel[154].setRotationPoint(-54F, -2F, 21.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[155].setRotationPoint(-55F, 1F, 20.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[156].setRotationPoint(-54F, -7F, 21.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[157].setRotationPoint(-53.5F, -2F, 22F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 174
		bodyModel[158].setRotationPoint(-36F, -2F, 21.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[159].setRotationPoint(-37F, 1F, 20.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[160].setRotationPoint(-36F, -7F, 21.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[161].setRotationPoint(-36F, -7F, 20.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[162].setRotationPoint(-35.5F, -2F, 22F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 179
		bodyModel[163].setRotationPoint(-28F, -2F, -21.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[164].setRotationPoint(-36F, -7F, -23.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[165].setRotationPoint(-35.5F, -2F, -23F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[166].setRotationPoint(-37F, 1F, -24.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 183
		bodyModel[167].setRotationPoint(-36F, -2F, -22.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 184
		bodyModel[168].setRotationPoint(-20F, -2F, 21.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[169].setRotationPoint(-21F, 1F, 20.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[170].setRotationPoint(-20F, -7F, 21.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[171].setRotationPoint(-20F, -7F, 20.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[172].setRotationPoint(-19.5F, -2F, 22F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 189
		bodyModel[173].setRotationPoint(-12F, -2F, -21.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[174].setRotationPoint(-20F, -7F, -23.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[175].setRotationPoint(-19.5F, -2F, -23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[176].setRotationPoint(-21F, 1F, -24.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 193
		bodyModel[177].setRotationPoint(-20F, -2F, -22.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 194
		bodyModel[178].setRotationPoint(-3F, -2F, 21.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[179].setRotationPoint(-4F, 1F, 20.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[180].setRotationPoint(-3F, -7F, 21.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[181].setRotationPoint(-3F, -7F, 20.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[182].setRotationPoint(-2.5F, -2F, 22F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 199
		bodyModel[183].setRotationPoint(5F, -2F, -21.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[184].setRotationPoint(-3F, -7F, -23.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[185].setRotationPoint(-2.5F, -2F, -23F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[186].setRotationPoint(-4F, 1F, -24.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 203
		bodyModel[187].setRotationPoint(-3F, -2F, -22.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 204
		bodyModel[188].setRotationPoint(14F, -2F, 21.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[189].setRotationPoint(13F, 1F, 20.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[190].setRotationPoint(14F, -7F, 21.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[191].setRotationPoint(14F, -7F, 20.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[192].setRotationPoint(14.5F, -2F, 22F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 209
		bodyModel[193].setRotationPoint(22F, -2F, -21.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[194].setRotationPoint(14F, -7F, -23.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[195].setRotationPoint(14.5F, -2F, -23F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[196].setRotationPoint(13F, 1F, -24.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 213
		bodyModel[197].setRotationPoint(14F, -2F, -22.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 214
		bodyModel[198].setRotationPoint(30F, -2F, 21.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[199].setRotationPoint(29F, 1F, 20.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[200].setRotationPoint(30F, -7F, 21.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[201].setRotationPoint(30F, -7F, 20.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[202].setRotationPoint(30.5F, -2F, 22F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 219
		bodyModel[203].setRotationPoint(38F, -2F, -21.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[204].setRotationPoint(30F, -7F, -23.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[205].setRotationPoint(30.5F, -2F, -23F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[206].setRotationPoint(29F, 1F, -24.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 223
		bodyModel[207].setRotationPoint(30F, -2F, -22.5F);

		bodyModel[208].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[208].setRotationPoint(-52.5F, 1F, -24F);
		bodyModel[208].rotateAngleZ = -0.45378561F;

		bodyModel[209].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 225
		bodyModel[209].setRotationPoint(-52.5F, 1F, -24F);
		bodyModel[209].rotateAngleZ = -0.45378561F;

		bodyModel[210].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 226
		bodyModel[210].setRotationPoint(-52.5F, 1F, -22.4F);
		bodyModel[210].rotateAngleZ = -0.45378561F;

		bodyModel[211].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[211].setRotationPoint(-52.5F, 1F, 23F);
		bodyModel[211].rotateAngleZ = -0.45378561F;

		bodyModel[212].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 228
		bodyModel[212].setRotationPoint(-52.5F, 1F, 23F);
		bodyModel[212].rotateAngleZ = -0.45378561F;

		bodyModel[213].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 229
		bodyModel[213].setRotationPoint(-52.5F, 1F, 18.4F);
		bodyModel[213].rotateAngleZ = -0.45378561F;

		bodyModel[214].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[214].setRotationPoint(15.5F, 1F, 23F);
		bodyModel[214].rotateAngleZ = -0.45378561F;

		bodyModel[215].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 231
		bodyModel[215].setRotationPoint(15.5F, 1F, 23F);
		bodyModel[215].rotateAngleZ = -0.45378561F;

		bodyModel[216].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 232
		bodyModel[216].setRotationPoint(15.5F, 1F, 18.4F);
		bodyModel[216].rotateAngleZ = -0.45378561F;

		bodyModel[217].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[217].setRotationPoint(15.5F, 1F, -24F);
		bodyModel[217].rotateAngleZ = -0.45378561F;

		bodyModel[218].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 234
		bodyModel[218].setRotationPoint(15.5F, 1F, -24F);
		bodyModel[218].rotateAngleZ = -0.45378561F;

		bodyModel[219].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 235
		bodyModel[219].setRotationPoint(15.5F, 1F, -22.4F);
		bodyModel[219].rotateAngleZ = -0.45378561F;

		bodyModel[220].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[220].setRotationPoint(31.5F, 1F, 23F);
		bodyModel[220].rotateAngleZ = -0.45378561F;

		bodyModel[221].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 237
		bodyModel[221].setRotationPoint(31.5F, 1F, 23F);
		bodyModel[221].rotateAngleZ = -0.45378561F;

		bodyModel[222].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 238
		bodyModel[222].setRotationPoint(31.5F, 1F, 18.4F);
		bodyModel[222].rotateAngleZ = -0.45378561F;

		bodyModel[223].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[223].setRotationPoint(31.5F, 1F, -24F);
		bodyModel[223].rotateAngleZ = -0.45378561F;

		bodyModel[224].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 240
		bodyModel[224].setRotationPoint(31.5F, 1F, -24F);
		bodyModel[224].rotateAngleZ = -0.45378561F;

		bodyModel[225].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 241
		bodyModel[225].setRotationPoint(31.5F, 1F, -22.4F);
		bodyModel[225].rotateAngleZ = -0.45378561F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F, 0.5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 10F, 0F, 2F, 10F, 0F, 2F, 0.5F, 0F, 0F); // Box 333
		bodyModel[226].setRotationPoint(-71.5F, -16.5F, -19.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[227].setRotationPoint(-8.5F, -12.25F, 19.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[228].setRotationPoint(25.5F, -12F, 19.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[229].setRotationPoint(-39.5F, -12.5F, 19.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[230].setRotationPoint(-8.5F, -12.25F, -24.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[231].setRotationPoint(25.5F, -12F, -24.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[232].setRotationPoint(-39.5F, -12.5F, -24.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 2.5F, -1.5F, 3F, 0F, -1F, 3F); // Box 471
		bodyModel[233].setRotationPoint(-58F, -25.5F, 8F);

		bodyModel[234].addShapeBox(9F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 477
		bodyModel[234].setRotationPoint(43.5F, -16.5F, -10F);
		bodyModel[234].rotateAngleZ = -0.49741884F;

		bodyModel[235].addShapeBox(9F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 478
		bodyModel[235].setRotationPoint(43.5F, -16.5F, -5F);
		bodyModel[235].rotateAngleZ = -0.49741884F;

		bodyModel[236].addShapeBox(9F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 479
		bodyModel[236].setRotationPoint(43.5F, -16.5F, 0F);
		bodyModel[236].rotateAngleZ = -0.49741884F;

		bodyModel[237].addShapeBox(9F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 480
		bodyModel[237].setRotationPoint(43.5F, -16.5F, 5F);
		bodyModel[237].rotateAngleZ = -0.49741884F;

		bodyModel[238].addShapeBox(12F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[238].setRotationPoint(43.5F, -16.5F, -8F);
		bodyModel[238].rotateAngleZ = -0.49741884F;

		bodyModel[239].addShapeBox(12F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[239].setRotationPoint(43.5F, -16.5F, -3F);
		bodyModel[239].rotateAngleZ = -0.49741884F;

		bodyModel[240].addShapeBox(12F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[240].setRotationPoint(43.5F, -16.5F, 2F);
		bodyModel[240].rotateAngleZ = -0.49741884F;

		bodyModel[241].addShapeBox(12F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[241].setRotationPoint(43.5F, -16.5F, 7F);
		bodyModel[241].rotateAngleZ = -0.49741884F;

		bodyModel[242].addShapeBox(5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		bodyModel[242].setRotationPoint(43.5F, -16.5F, 7F);
		bodyModel[242].rotateAngleZ = -0.49741884F;

		bodyModel[243].addShapeBox(5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[243].setRotationPoint(43.5F, -16.5F, 2F);
		bodyModel[243].rotateAngleZ = -0.49741884F;

		bodyModel[244].addShapeBox(5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[244].setRotationPoint(43.5F, -16.5F, -3F);
		bodyModel[244].rotateAngleZ = -0.49741884F;

		bodyModel[245].addShapeBox(5F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[245].setRotationPoint(43.5F, -16.5F, -8F);
		bodyModel[245].rotateAngleZ = -0.49741884F;

		bodyModel[246].addShapeBox(2F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 489
		bodyModel[246].setRotationPoint(43.5F, -16.5F, -10F);
		bodyModel[246].rotateAngleZ = -0.49741884F;

		bodyModel[247].addShapeBox(2F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 490
		bodyModel[247].setRotationPoint(43.5F, -16.5F, -5F);
		bodyModel[247].rotateAngleZ = -0.49741884F;

		bodyModel[248].addShapeBox(2F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 491
		bodyModel[248].setRotationPoint(43.5F, -16.5F, 0F);
		bodyModel[248].rotateAngleZ = -0.49741884F;

		bodyModel[249].addShapeBox(2F, -3F, 0F, 7, 1, 5, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 492
		bodyModel[249].setRotationPoint(43.5F, -16.5F, 5F);
		bodyModel[249].rotateAngleZ = -0.49741884F;

		bodyModel[250].addShapeBox(2F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[250].setRotationPoint(43.5F, -16.5F, 13F);
		bodyModel[250].rotateAngleZ = -0.49741884F;

		bodyModel[251].addShapeBox(0F, -3F, 0F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 494
		bodyModel[251].setRotationPoint(43.5F, -16.5F, 10F);
		bodyModel[251].rotateAngleZ = -0.49741884F;

		bodyModel[252].addShapeBox(2F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[252].setRotationPoint(43.5F, -16.5F, -14F);
		bodyModel[252].rotateAngleZ = -0.49741884F;

		bodyModel[253].addShapeBox(0F, -3F, 0F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 496
		bodyModel[253].setRotationPoint(43.5F, -16.5F, -17F);
		bodyModel[253].rotateAngleZ = -0.49741884F;

		bodyModel[254].addShapeBox(-0.5F, -3F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[254].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[254].rotateAngleY = 0.66322512F;
		bodyModel[254].rotateAngleZ = -0.66322512F;

		bodyModel[255].addShapeBox(-2.5F, -4F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 498
		bodyModel[255].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[255].rotateAngleY = 0.66322512F;
		bodyModel[255].rotateAngleZ = -0.66322512F;

		bodyModel[256].addShapeBox(-2.5F, -4F, 3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 499
		bodyModel[256].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[256].rotateAngleY = 0.66322512F;
		bodyModel[256].rotateAngleZ = -0.66322512F;

		bodyModel[257].addShapeBox(-0.5F, -3F, 6.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[257].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[257].rotateAngleY = 0.66322512F;
		bodyModel[257].rotateAngleZ = -0.66322512F;

		bodyModel[258].addShapeBox(-2.5F, -4F, -10.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 501
		bodyModel[258].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[258].rotateAngleY = 0.66322512F;
		bodyModel[258].rotateAngleZ = -0.66322512F;

		bodyModel[259].addShapeBox(-0.5F, -3F, -7.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[259].setRotationPoint(30.5F, -18.5F, 16F);
		bodyModel[259].rotateAngleY = 0.66322512F;
		bodyModel[259].rotateAngleZ = -0.66322512F;

		bodyModel[260].addShapeBox(-0.5F, -3F, 6.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[260].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[260].rotateAngleY = -0.66322512F;
		bodyModel[260].rotateAngleZ = -0.66322512F;

		bodyModel[261].addShapeBox(-0.5F, -3F, -0.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[261].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[261].rotateAngleY = -0.66322512F;
		bodyModel[261].rotateAngleZ = -0.66322512F;

		bodyModel[262].addShapeBox(-0.5F, -3F, -7.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[262].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[262].rotateAngleY = -0.66322512F;
		bodyModel[262].rotateAngleZ = -0.66322512F;

		bodyModel[263].addShapeBox(-2.5F, -4F, -10.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 506
		bodyModel[263].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[263].rotateAngleY = -0.66322512F;
		bodyModel[263].rotateAngleZ = -0.66322512F;

		bodyModel[264].addShapeBox(-2.5F, -4F, -3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 507
		bodyModel[264].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[264].rotateAngleY = -0.66322512F;
		bodyModel[264].rotateAngleZ = -0.66322512F;

		bodyModel[265].addShapeBox(-2.5F, -4F, 3.5F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 508
		bodyModel[265].setRotationPoint(30.5F, -18.5F, -16F);
		bodyModel[265].rotateAngleY = -0.66322512F;
		bodyModel[265].rotateAngleZ = -0.66322512F;

		bodyModel[266].addShapeBox(12F, -3F, 0F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 509
		bodyModel[266].setRotationPoint(43.5F, -16.5F, -17F);
		bodyModel[266].rotateAngleZ = -0.49741884F;

		bodyModel[267].addShapeBox(14F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[267].setRotationPoint(43.5F, -16.5F, -14F);
		bodyModel[267].rotateAngleZ = -0.49741884F;

		bodyModel[268].addShapeBox(14F, -2F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[268].setRotationPoint(43.5F, -16.5F, 13F);
		bodyModel[268].rotateAngleZ = -0.49741884F;

		bodyModel[269].addShapeBox(12F, -3F, 0F, 5, 1, 7, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 512
		bodyModel[269].setRotationPoint(43.5F, -16.5F, 10F);
		bodyModel[269].rotateAngleZ = -0.49741884F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[270].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[270].rotateAngleX = -0.06981317F;
		bodyModel[270].rotateAngleY = 0.17453293F;
		bodyModel[270].rotateAngleZ = -0.13962634F;

		bodyModel[271].addShapeBox(0F, 2F, 20F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[271].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[271].rotateAngleX = -0.06981317F;
		bodyModel[271].rotateAngleY = 0.17453293F;
		bodyModel[271].rotateAngleZ = -0.13962634F;

		bodyModel[272].addShapeBox(0F, 2F, 8F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 5F, 2F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[272].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[272].rotateAngleX = -0.06981317F;
		bodyModel[272].rotateAngleY = 0.17453293F;
		bodyModel[272].rotateAngleZ = -0.13962634F;

		bodyModel[273].addShapeBox(0F, 2F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 1F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[273].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[273].rotateAngleX = -0.06981317F;
		bodyModel[273].rotateAngleY = 0.17453293F;
		bodyModel[273].rotateAngleZ = -0.13962634F;

		bodyModel[274].addShapeBox(0F, 4F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[274].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[274].rotateAngleX = -0.06981317F;
		bodyModel[274].rotateAngleY = 0.17453293F;
		bodyModel[274].rotateAngleZ = -0.13962634F;

		bodyModel[275].addShapeBox(0F, 6F, 0F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 609
		bodyModel[275].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[275].rotateAngleX = -0.06981317F;
		bodyModel[275].rotateAngleY = 0.17453293F;
		bodyModel[275].rotateAngleZ = -0.13962634F;

		bodyModel[276].addShapeBox(0F, 6F, 6F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 610
		bodyModel[276].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[276].rotateAngleX = -0.06981317F;
		bodyModel[276].rotateAngleY = 0.17453293F;
		bodyModel[276].rotateAngleZ = -0.13962634F;

		bodyModel[277].addShapeBox(0F, 4F, 29F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[277].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[277].rotateAngleX = -0.06981317F;
		bodyModel[277].rotateAngleY = 0.17453293F;
		bodyModel[277].rotateAngleZ = -0.13962634F;

		bodyModel[278].addShapeBox(0F, 4F, 6F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[278].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[278].rotateAngleX = -0.06981317F;
		bodyModel[278].rotateAngleY = 0.17453293F;
		bodyModel[278].rotateAngleZ = -0.13962634F;

		bodyModel[279].addShapeBox(0F, 6F, 29F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 613
		bodyModel[279].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[279].rotateAngleX = -0.06981317F;
		bodyModel[279].rotateAngleY = 0.17453293F;
		bodyModel[279].rotateAngleZ = -0.13962634F;

		bodyModel[280].addShapeBox(0F, 6F, 12F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 618
		bodyModel[280].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[280].rotateAngleX = -0.06981317F;
		bodyModel[280].rotateAngleY = 0.17453293F;
		bodyModel[280].rotateAngleZ = -0.13962634F;

		bodyModel[281].addShapeBox(0F, 4F, 12F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[281].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[281].rotateAngleX = -0.06981317F;
		bodyModel[281].rotateAngleY = 0.17453293F;
		bodyModel[281].rotateAngleZ = -0.13962634F;

		bodyModel[282].addShapeBox(0F, 6F, 18F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 620
		bodyModel[282].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[282].rotateAngleX = -0.06981317F;
		bodyModel[282].rotateAngleY = 0.17453293F;
		bodyModel[282].rotateAngleZ = -0.13962634F;

		bodyModel[283].addShapeBox(0F, 4F, 18F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[283].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[283].rotateAngleX = -0.06981317F;
		bodyModel[283].rotateAngleY = 0.17453293F;
		bodyModel[283].rotateAngleZ = -0.13962634F;

		bodyModel[284].addShapeBox(0F, 6F, 24F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 622
		bodyModel[284].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[284].rotateAngleX = -0.06981317F;
		bodyModel[284].rotateAngleY = 0.17453293F;
		bodyModel[284].rotateAngleZ = -0.13962634F;

		bodyModel[285].addShapeBox(0F, 4F, 24F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[285].setRotationPoint(61.5F, -13.5F, 10F);
		bodyModel[285].rotateAngleX = -0.06981317F;
		bodyModel[285].rotateAngleY = 0.17453293F;
		bodyModel[285].rotateAngleZ = -0.13962634F;

		bodyModel[286].addShapeBox(0F, 0F, -31F, 1, 2, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[286].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[286].rotateAngleX = 0.06981317F;
		bodyModel[286].rotateAngleY = -0.17453293F;
		bodyModel[286].rotateAngleZ = -0.13962634F;

		bodyModel[287].addShapeBox(0F, 2F, -8F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[287].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[287].rotateAngleX = 0.06981317F;
		bodyModel[287].rotateAngleY = -0.17453293F;
		bodyModel[287].rotateAngleZ = -0.13962634F;

		bodyModel[288].addShapeBox(0F, 2F, -31F, 1, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 2F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[288].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[288].rotateAngleX = 0.06981317F;
		bodyModel[288].rotateAngleY = -0.17453293F;
		bodyModel[288].rotateAngleZ = -0.13962634F;

		bodyModel[289].addShapeBox(0F, 4F, -2F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[289].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[289].rotateAngleX = 0.06981317F;
		bodyModel[289].rotateAngleY = -0.17453293F;
		bodyModel[289].rotateAngleZ = -0.13962634F;

		bodyModel[290].addShapeBox(0F, 4F, -7F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[290].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[290].rotateAngleX = 0.06981317F;
		bodyModel[290].rotateAngleY = -0.17453293F;
		bodyModel[290].rotateAngleZ = -0.13962634F;

		bodyModel[291].addShapeBox(0F, 4F, -13F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[291].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[291].rotateAngleX = 0.06981317F;
		bodyModel[291].rotateAngleY = -0.17453293F;
		bodyModel[291].rotateAngleZ = -0.13962634F;

		bodyModel[292].addShapeBox(0F, 2F, -20F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 2F, 0F, 4F, 1F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[292].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[292].rotateAngleX = 0.06981317F;
		bodyModel[292].rotateAngleY = -0.17453293F;
		bodyModel[292].rotateAngleZ = -0.13962634F;

		bodyModel[293].addShapeBox(0F, 4F, -19F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[293].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[293].rotateAngleX = 0.06981317F;
		bodyModel[293].rotateAngleY = -0.17453293F;
		bodyModel[293].rotateAngleZ = -0.13962634F;

		bodyModel[294].addShapeBox(0F, 4F, -25F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[294].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[294].rotateAngleX = 0.06981317F;
		bodyModel[294].rotateAngleY = -0.17453293F;
		bodyModel[294].rotateAngleZ = -0.13962634F;

		bodyModel[295].addShapeBox(0F, 4F, -31F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 633
		bodyModel[295].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[295].rotateAngleX = 0.06981317F;
		bodyModel[295].rotateAngleY = -0.17453293F;
		bodyModel[295].rotateAngleZ = -0.13962634F;

		bodyModel[296].addShapeBox(0F, 6F, -31F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 634
		bodyModel[296].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[296].rotateAngleX = 0.06981317F;
		bodyModel[296].rotateAngleY = -0.17453293F;
		bodyModel[296].rotateAngleZ = -0.13962634F;

		bodyModel[297].addShapeBox(0F, 6F, -25F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 635
		bodyModel[297].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[297].rotateAngleX = 0.06981317F;
		bodyModel[297].rotateAngleY = -0.17453293F;
		bodyModel[297].rotateAngleZ = -0.13962634F;

		bodyModel[298].addShapeBox(0F, 6F, -19F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 636
		bodyModel[298].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[298].rotateAngleX = 0.06981317F;
		bodyModel[298].rotateAngleY = -0.17453293F;
		bodyModel[298].rotateAngleZ = -0.13962634F;

		bodyModel[299].addShapeBox(0F, 6F, -13F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 637
		bodyModel[299].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[299].rotateAngleX = 0.06981317F;
		bodyModel[299].rotateAngleY = -0.17453293F;
		bodyModel[299].rotateAngleZ = -0.13962634F;

		bodyModel[300].addShapeBox(0F, 6F, -7F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 638
		bodyModel[300].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[300].rotateAngleX = 0.06981317F;
		bodyModel[300].rotateAngleY = -0.17453293F;
		bodyModel[300].rotateAngleZ = -0.13962634F;

		bodyModel[301].addShapeBox(0F, 6F, -2F, 14, 5, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 639
		bodyModel[301].setRotationPoint(61.5F, -13.5F, -10F);
		bodyModel[301].rotateAngleX = 0.06981317F;
		bodyModel[301].rotateAngleY = -0.17453293F;
		bodyModel[301].rotateAngleZ = -0.13962634F;

		bodyModel[302].addShapeBox(0F, 2F, 0F, 18, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[302].setRotationPoint(61.5F, -3.5F, 5F);

		bodyModel[303].addShapeBox(0F, 2F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[303].setRotationPoint(79.5F, -3.5F, 5F);

		bodyModel[304].addShapeBox(0F, 2F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[304].setRotationPoint(81.5F, -7.5F, 5F);

		bodyModel[305].addShapeBox(0F, 2F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[305].setRotationPoint(61.5F, -7.5F, 6F);

		bodyModel[306].addShapeBox(0F, 2F, 0F, 17, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[306].setRotationPoint(44.5F, -6.5F, 6F);

		bodyModel[307].addShapeBox(0F, 2F, 0F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[307].setRotationPoint(57.5F, -12.5F, 10F);

		bodyModel[308].addShapeBox(0F, 2F, 0F, 3, 6, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 647
		bodyModel[308].setRotationPoint(57.5F, -12.5F, 6F);

		bodyModel[309].addShapeBox(0F, 2F, 0F, 18, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[309].setRotationPoint(61.5F, -3.5F, -10F);

		bodyModel[310].addShapeBox(0F, 2F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Box 649
		bodyModel[310].setRotationPoint(79.5F, -3.5F, -10F);

		bodyModel[311].addShapeBox(0F, 2F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		bodyModel[311].setRotationPoint(81.5F, -7.5F, -10F);

		bodyModel[312].addShapeBox(0F, 2F, 0F, 8, 4, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		bodyModel[312].setRotationPoint(61.5F, -7.5F, -9F);

		bodyModel[313].addShapeBox(0F, 2F, 0F, 17, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		bodyModel[313].setRotationPoint(44.5F, -6.5F, -9F);

		bodyModel[314].addShapeBox(0F, 2F, 0F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[314].setRotationPoint(57.5F, -12.5F, -19F);

		bodyModel[315].addShapeBox(0F, 2F, 0F, 3, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[315].setRotationPoint(57.5F, -12.5F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 652
		bodyModel[316].setRotationPoint(45.5F, -15.5F, 19F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, 2.5F, 0F, -1F, 2.5F, -0.5F, 0F, -0.5F, 0F); // Box 653
		bodyModel[317].setRotationPoint(50.5F, -14F, 19F);
		
		bodyModel[108].glow = true;
		bodyModel[111].glow = true;
		bodyModel[131].glow = true;
		bodyModel[132].glow = true;
		bodyModel[138].glow = true;
		bodyModel[139].glow = true;



	 	leftAnimTrackModel = new ModelRendererTurbo[3][];
		rightAnimTrackModel = new ModelRendererTurbo[3][];

		leftAnimTrackModel[0] = new ModelRendererTurbo[8];
		leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 450, 131, textureX, textureY); // Import Box314
		leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 450, 151, textureX, textureY); // Import Box315
		leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 450, 186, textureX, textureY); // Import Box316
		leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 450, 291, textureX, textureY); // Import Box317
		leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 450, 328, textureX, textureY); // Import Box318
		leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 450, 349, textureX, textureY); // Import Box319
		leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 450, 369, textureX, textureY); // Import Box320
		leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 450, 501, textureX, textureY); // Import Box321

		leftAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		leftAnimTrackModel[0][0].setRotationPoint(51F, -9F, 20.5F);

		leftAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		leftAnimTrackModel[0][1].setRotationPoint(52F, -3F, 20.5F);
		leftAnimTrackModel[0][1].rotateAngleZ = -0.90408055F;

		leftAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		leftAnimTrackModel[0][2].setRotationPoint(35F, 10F, 20.5F);
		leftAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box317
		leftAnimTrackModel[0][3].setRotationPoint(-56F, 10F, 20.5F);
		leftAnimTrackModel[0][3].rotateAngleZ = -2.23227611F;

		leftAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		leftAnimTrackModel[0][4].setRotationPoint(-74F, -4F, 20.5F);
		leftAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box319
		leftAnimTrackModel[0][5].setRotationPoint(-74F, -10F, 20.5F);
		leftAnimTrackModel[0][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box320
		leftAnimTrackModel[0][6].setRotationPoint(-70F, -15F, 20.5F);
		leftAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box321
		leftAnimTrackModel[0][7].setRotationPoint(47F, -14F, 20.5F);
		leftAnimTrackModel[0][7].rotateAngleZ = -5.49778714F;


		rightAnimTrackModel[0] = new ModelRendererTurbo[8];
		rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 450, 131, textureX, textureY); // Import Box322
		rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 450, 151, textureX, textureY); // Import Box323
		rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 450, 186, textureX, textureY); // Import Box324
		rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 450, 291, textureX, textureY); // Import Box325
		rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 450, 328, textureX, textureY); // Import Box326
		rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 450, 349, textureX, textureY); // Import Box327
		rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 450, 369, textureX, textureY); // Import Box328
		rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 450, 501, textureX, textureY); // Import Box329

		rightAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightAnimTrackModel[0][0].setRotationPoint(51F, -9F, -33.5F);

		rightAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		rightAnimTrackModel[0][1].setRotationPoint(52F, -3F, -33.5F);
		rightAnimTrackModel[0][1].rotateAngleZ = -0.90408055F;

		rightAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		rightAnimTrackModel[0][2].setRotationPoint(35F, 10F, -33.5F);
		rightAnimTrackModel[0][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box325
		rightAnimTrackModel[0][3].setRotationPoint(-56F, 10F, -33.5F);
		rightAnimTrackModel[0][3].rotateAngleZ = -2.23227611F;

		rightAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		rightAnimTrackModel[0][4].setRotationPoint(-74F, -4F, -33.5F);
		rightAnimTrackModel[0][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box327
		rightAnimTrackModel[0][5].setRotationPoint(-74F, -10F, -33.5F);
		rightAnimTrackModel[0][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box328
		rightAnimTrackModel[0][6].setRotationPoint(-70F, -15F, -33.5F);
		rightAnimTrackModel[0][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box329
		rightAnimTrackModel[0][7].setRotationPoint(47F, -14F, -33.5F);
		rightAnimTrackModel[0][7].rotateAngleZ = -5.49778714F;
		
		
		leftAnimTrackModel[1] = new ModelRendererTurbo[8];
		leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 500, 131, textureX, textureY); // Import Box314
		leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 500, 151, textureX, textureY); // Import Box315
		leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 500, 186, textureX, textureY); // Import Box316
		leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 500, 291, textureX, textureY); // Import Box317
		leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 500, 328, textureX, textureY); // Import Box318
		leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 500, 349, textureX, textureY); // Import Box319
		leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 500, 369, textureX, textureY); // Import Box320
		leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 500, 501, textureX, textureY); // Import Box321

		leftAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		leftAnimTrackModel[1][0].setRotationPoint(51F, -9F, 20.5F);

		leftAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		leftAnimTrackModel[1][1].setRotationPoint(52F, -3F, 20.5F);
		leftAnimTrackModel[1][1].rotateAngleZ = -0.90408055F;

		leftAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		leftAnimTrackModel[1][2].setRotationPoint(35F, 10F, 20.5F);
		leftAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box317
		leftAnimTrackModel[1][3].setRotationPoint(-56F, 10F, 20.5F);
		leftAnimTrackModel[1][3].rotateAngleZ = -2.23227611F;

		leftAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		leftAnimTrackModel[1][4].setRotationPoint(-74F, -4F, 20.5F);
		leftAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box319
		leftAnimTrackModel[1][5].setRotationPoint(-74F, -10F, 20.5F);
		leftAnimTrackModel[1][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box320
		leftAnimTrackModel[1][6].setRotationPoint(-70F, -15F, 20.5F);
		leftAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box321
		leftAnimTrackModel[1][7].setRotationPoint(47F, -14F, 20.5F);
		leftAnimTrackModel[1][7].rotateAngleZ = -5.49778714F;


		rightAnimTrackModel[1] = new ModelRendererTurbo[8];
		rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 500, 131, textureX, textureY); // Import Box322
		rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 500, 151, textureX, textureY); // Import Box323
		rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 500, 186, textureX, textureY); // Import Box324
		rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 500, 291, textureX, textureY); // Import Box325
		rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 500, 328, textureX, textureY); // Import Box326
		rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 500, 349, textureX, textureY); // Import Box327
		rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 500, 369, textureX, textureY); // Import Box328
		rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 500, 501, textureX, textureY); // Import Box329

		rightAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightAnimTrackModel[1][0].setRotationPoint(51F, -9F, -33.5F);

		rightAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		rightAnimTrackModel[1][1].setRotationPoint(52F, -3F, -33.5F);
		rightAnimTrackModel[1][1].rotateAngleZ = -0.90408055F;

		rightAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		rightAnimTrackModel[1][2].setRotationPoint(35F, 10F, -33.5F);
		rightAnimTrackModel[1][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box325
		rightAnimTrackModel[1][3].setRotationPoint(-56F, 10F, -33.5F);
		rightAnimTrackModel[1][3].rotateAngleZ = -2.23227611F;

		rightAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		rightAnimTrackModel[1][4].setRotationPoint(-74F, -4F, -33.5F);
		rightAnimTrackModel[1][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box327
		rightAnimTrackModel[1][5].setRotationPoint(-74F, -10F, -33.5F);
		rightAnimTrackModel[1][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box328
		rightAnimTrackModel[1][6].setRotationPoint(-70F, -15F, -33.5F);
		rightAnimTrackModel[1][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box329
		rightAnimTrackModel[1][7].setRotationPoint(47F, -14F, -33.5F);
		rightAnimTrackModel[1][7].rotateAngleZ = -5.49778714F;
		
		
		leftAnimTrackModel[2] = new ModelRendererTurbo[8];
		leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 550, 131, textureX, textureY); // Import Box314
		leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 550, 151, textureX, textureY); // Import Box315
		leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 550, 186, textureX, textureY); // Import Box316
		leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 550, 291, textureX, textureY); // Import Box317
		leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 550, 328, textureX, textureY); // Import Box318
		leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 550, 349, textureX, textureY); // Import Box319
		leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 550, 369, textureX, textureY); // Import Box320
		leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 550, 501, textureX, textureY); // Import Box321

		leftAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		leftAnimTrackModel[2][0].setRotationPoint(51F, -9F, 20.5F);

		leftAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		leftAnimTrackModel[2][1].setRotationPoint(52F, -3F, 20.5F);
		leftAnimTrackModel[2][1].rotateAngleZ = -0.90408055F;

		leftAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		leftAnimTrackModel[2][2].setRotationPoint(35F, 10F, 20.5F);
		leftAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		leftAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box317
		leftAnimTrackModel[2][3].setRotationPoint(-56F, 10F, 20.5F);
		leftAnimTrackModel[2][3].rotateAngleZ = -2.23227611F;

		leftAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		leftAnimTrackModel[2][4].setRotationPoint(-74F, -4F, 20.5F);
		leftAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		leftAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box319
		leftAnimTrackModel[2][5].setRotationPoint(-74F, -10F, 20.5F);
		leftAnimTrackModel[2][5].rotateAngleZ = -3.83972435F;

		leftAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box320
		leftAnimTrackModel[2][6].setRotationPoint(-70F, -15F, 20.5F);
		leftAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;

		leftAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box321
		leftAnimTrackModel[2][7].setRotationPoint(47F, -14F, 20.5F);
		leftAnimTrackModel[2][7].rotateAngleZ = -5.49778714F;


		rightAnimTrackModel[2] = new ModelRendererTurbo[8];
		rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 550, 131, textureX, textureY); // Import Box322
		rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 550, 151, textureX, textureY); // Import Box323
		rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 550, 186, textureX, textureY); // Import Box324
		rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 550, 291, textureX, textureY); // Import Box325
		rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 550, 328, textureX, textureY); // Import Box326
		rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 550, 349, textureX, textureY); // Import Box327
		rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 550, 369, textureX, textureY); // Import Box328
		rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 550, 501, textureX, textureY); // Import Box329

		rightAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightAnimTrackModel[2][0].setRotationPoint(51F, -9F, -33.5F);

		rightAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		rightAnimTrackModel[2][1].setRotationPoint(52F, -3F, -33.5F);
		rightAnimTrackModel[2][1].rotateAngleZ = -0.90408055F;

		rightAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		rightAnimTrackModel[2][2].setRotationPoint(35F, 10F, -33.5F);
		rightAnimTrackModel[2][2].rotateAngleZ = -1.57079633F;

		rightAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box325
		rightAnimTrackModel[2][3].setRotationPoint(-56F, 10F, -33.5F);
		rightAnimTrackModel[2][3].rotateAngleZ = -2.23227611F;

		rightAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		rightAnimTrackModel[2][4].setRotationPoint(-74F, -4F, -33.5F);
		rightAnimTrackModel[2][4].rotateAngleZ = -3.14159265F;

		rightAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box327
		rightAnimTrackModel[2][5].setRotationPoint(-74F, -10F, -33.5F);
		rightAnimTrackModel[2][5].rotateAngleZ = -3.83972435F;

		rightAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box328
		rightAnimTrackModel[2][6].setRotationPoint(-70F, -15F, -33.5F);
		rightAnimTrackModel[2][6].rotateAngleZ = -4.71238898F;

		rightAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box329
		rightAnimTrackModel[2][7].setRotationPoint(47F, -14F, -33.5F);
		rightAnimTrackModel[2][7].rotateAngleZ = -5.49778714F;

	}
}