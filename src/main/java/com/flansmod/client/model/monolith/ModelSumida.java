//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sumida
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSumida extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSumida() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[132];
		bodyDoorOpenModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel = new ModelRendererTurbo[6];
		turretModel = new ModelRendererTurbo[17];
		barrelModel = new ModelRendererTurbo[6];
		leftFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel = new ModelRendererTurbo[6];
		leftBackWheelModel = new ModelRendererTurbo[12];
		rightBackWheelModel = new ModelRendererTurbo[12];
		steeringWheelModel = new ModelRendererTurbo[4];

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

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 261
		bodyModel[1] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 262
		bodyModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 263
		bodyModel[3] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 264
		bodyModel[4] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 265
		bodyModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 267
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 268
		bodyModel[7] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 269
		bodyModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 270
		bodyModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 271
		bodyModel[10] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 272
		bodyModel[11] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 273
		bodyModel[12] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 275
		bodyModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 276
		bodyModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 277
		bodyModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 278
		bodyModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 279
		bodyModel[17] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 280
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 281
		bodyModel[19] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 282
		bodyModel[20] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 283
		bodyModel[21] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 284
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 285
		bodyModel[23] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 286
		bodyModel[24] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 287
		bodyModel[25] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 288
		bodyModel[26] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 289
		bodyModel[27] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 290
		bodyModel[28] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 292
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 293
		bodyModel[30] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 294
		bodyModel[31] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 295
		bodyModel[32] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 296
		bodyModel[33] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 297
		bodyModel[34] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 298
		bodyModel[35] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 300
		bodyModel[36] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 301
		bodyModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 302
		bodyModel[38] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 305
		bodyModel[39] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 306
		bodyModel[40] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 307
		bodyModel[41] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 308
		bodyModel[42] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 309
		bodyModel[43] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 310
		bodyModel[44] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 311
		bodyModel[45] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 312
		bodyModel[46] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 313
		bodyModel[47] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 314
		bodyModel[48] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 315
		bodyModel[49] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 316
		bodyModel[50] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 317
		bodyModel[51] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 318
		bodyModel[52] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 319
		bodyModel[53] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 320
		bodyModel[54] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // draw flag
		bodyModel[55] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 322
		bodyModel[56] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 323
		bodyModel[57] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 324
		bodyModel[58] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 325
		bodyModel[59] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 326
		bodyModel[60] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 327
		bodyModel[61] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 328
		bodyModel[62] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 329
		bodyModel[63] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 330
		bodyModel[64] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 331
		bodyModel[65] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 334
		bodyModel[66] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 335
		bodyModel[67] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 336
		bodyModel[68] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 337
		bodyModel[69] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 338
		bodyModel[70] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 358
		bodyModel[71] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 359
		bodyModel[72] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 360
		bodyModel[73] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 361
		bodyModel[74] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 371
		bodyModel[75] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 385
		bodyModel[76] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 392
		bodyModel[77] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 393
		bodyModel[78] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 395
		bodyModel[79] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 396
		bodyModel[80] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 397
		bodyModel[81] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 398
		bodyModel[82] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 399
		bodyModel[83] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 400
		bodyModel[84] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 401
		bodyModel[85] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 402
		bodyModel[86] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 403
		bodyModel[87] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 404
		bodyModel[88] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 407
		bodyModel[89] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 408
		bodyModel[90] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 409
		bodyModel[91] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 410
		bodyModel[92] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 411
		bodyModel[93] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 413
		bodyModel[94] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 414
		bodyModel[95] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 415
		bodyModel[96] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 416
		bodyModel[97] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 417
		bodyModel[98] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 418
		bodyModel[99] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 419
		bodyModel[100] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 420
		bodyModel[101] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 421
		bodyModel[102] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 422
		bodyModel[103] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 423
		bodyModel[104] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 424
		bodyModel[105] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 425
		bodyModel[106] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 426
		bodyModel[107] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 427
		bodyModel[108] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 179
		bodyModel[109] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 180
		bodyModel[110] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 181
		bodyModel[111] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 182
		bodyModel[112] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 183
		bodyModel[113] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 184
		bodyModel[114] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 185
		bodyModel[115] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 186
		bodyModel[116] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 187
		bodyModel[117] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 188
		bodyModel[118] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 189
		bodyModel[119] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 190
		bodyModel[120] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 191
		bodyModel[121] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 192
		bodyModel[122] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 193
		bodyModel[123] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 195
		bodyModel[124] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 196
		bodyModel[125] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 197
		bodyModel[126] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 198
		bodyModel[127] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 199
		bodyModel[128] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 200
		bodyModel[129] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 202
		bodyModel[130] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 207
		bodyModel[131] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 208

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 26, 0F); // Box 261
		bodyModel[0].setRotationPoint(52F, 0.5F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 14, 14, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 262
		bodyModel[1].setRotationPoint(38F, -20.5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[2].setRotationPoint(61F, -20.5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 23, 4, 6, 0F,0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 9F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 9F); // Box 264
		bodyModel[3].setRotationPoint(38F, -24.5F, -3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 265
		bodyModel[4].setRotationPoint(28F, -20.5F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 267
		bodyModel[5].setRotationPoint(28F, -20.5F, 11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F); // Box 268
		bodyModel[6].setRotationPoint(61F, -20.5F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 269
		bodyModel[7].setRotationPoint(60F, -16.25F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[8].setRotationPoint(60F, -17.5F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 271
		bodyModel[9].setRotationPoint(60F, -15F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1F); // Box 272
		bodyModel[10].setRotationPoint(58F, -16.25F, 7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.4F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.4F, -1.2F, 0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F); // Box 273
		bodyModel[11].setRotationPoint(58F, -17.5F, 7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1F, -1F, -0.4F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.4F, -1.2F); // Box 275
		bodyModel[12].setRotationPoint(58F, -15F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[13].setRotationPoint(50F, -12.5F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[14].setRotationPoint(56F, -12.5F, 10F);
		bodyModel[14].rotateAngleZ = -0.4712389F;

		bodyModel[15].addShapeBox(-6F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[15].setRotationPoint(50F, -12.5F, 10F);
		bodyModel[15].rotateAngleZ = 0.48869219F;

		bodyModel[16].addShapeBox(-3F, 0F, 0F, 3, 1, 11, 0F,0.4F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 279
		bodyModel[16].setRotationPoint(45F, -9.8F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 2.5F, 0F, 0F); // Box 280
		bodyModel[17].setRotationPoint(41.6F, -5.8F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,4F, 0F, 13F, 4F, 0F, 11F, 4F, 0F, 11F, 4F, 0F, 13F, 4F, 0F, 13F, 4F, 0F, 11F, 4F, 0F, 11F, 4F, 0F, 13F); // Box 281
		bodyModel[18].setRotationPoint(32F, -7.5F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 20, 0F,0F, 0F, 3.9F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, 3.9F, 0F, 0F, 3.9F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, 0F, 3.9F); // Box 282
		bodyModel[19].setRotationPoint(28F, -28.5F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, -7.9F, -2F, 0F, -3.1F, 3F, 0F, 0F, -7.9F, 0F, 0F, -0.3F, 0F, 8.1F, -2.3F, 0F, 3.1F, 3F, 0F, 0F, -7.9F); // Box 283
		bodyModel[20].setRotationPoint(28F, -28.5F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, -7.9F, 0F, -3.1F, 3F, 0F, -7.9F, -2F, 0F, 0F, 0F, 0F, 0F, -7.9F, 0F, 3.1F, 3F, 0F, 8.1F, -2.3F, 0F, 0F, -0.3F); // Box 284
		bodyModel[21].setRotationPoint(28F, -28.5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 13F); // Box 285
		bodyModel[22].setRotationPoint(20F, -7.5F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[23].setRotationPoint(14F, -34.5F, -14F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0F, 0F); // Box 287
		bodyModel[24].setRotationPoint(26F, -34.5F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0F, 0F); // Box 288
		bodyModel[25].setRotationPoint(26F, -28.5F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[26].setRotationPoint(16F, -34.5F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[27].setRotationPoint(16F, -11.5F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 292
		bodyModel[28].setRotationPoint(15.5F, -29.5F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 293
		bodyModel[29].setRotationPoint(15.5F, -16.5F, -14F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[30].setRotationPoint(14F, -34.5F, 13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0F, 0F); // Box 295
		bodyModel[31].setRotationPoint(26F, -34.5F, 13F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0F, 0F); // Box 296
		bodyModel[32].setRotationPoint(26F, -28.5F, 13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[33].setRotationPoint(16F, -34.5F, 13F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[34].setRotationPoint(16F, -11.5F, 13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 300
		bodyModel[35].setRotationPoint(15.5F, -29.5F, 13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 301
		bodyModel[36].setRotationPoint(15.5F, -16.5F, 13F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 28, 0F,0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 302
		bodyModel[37].setRotationPoint(14F, -34.5F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 305
		bodyModel[38].setRotationPoint(59.5F, -15.25F, 8.5F);

		bodyModel[39].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, -0.5F, 0F, 6F, 0F, 0F, 3F, 0F); // Box 306
		bodyModel[39].setRotationPoint(50F, -12.5F, 9F);
		bodyModel[39].rotateAngleZ = 0.48869219F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 307
		bodyModel[40].setRotationPoint(50F, -12.5F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 3F, -1F, -0.5F, 3F, -1F, 0F, 0F, 3F, 0F); // Box 308
		bodyModel[41].setRotationPoint(56F, -12.5F, 9F);
		bodyModel[41].rotateAngleZ = -0.4712389F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 27, 1, 14, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 309
		bodyModel[42].setRotationPoint(38F, -6.5F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, -4.5F, 0F, -3.9F, -6.5F, 0F, -3.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[43].setRotationPoint(61F, -24.5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 7, 0F,0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, -6.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F); // Box 311
		bodyModel[44].setRotationPoint(61F, -24.5F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 312
		bodyModel[45].setRotationPoint(62F, -19.5F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 313
		bodyModel[46].setRotationPoint(62F, -17F, 1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 314
		bodyModel[47].setRotationPoint(62F, -14.5F, 1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 315
		bodyModel[48].setRotationPoint(62F, -12F, 1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 316
		bodyModel[49].setRotationPoint(62F, -9.5F, 1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[50].setRotationPoint(26F, -34.5F, -12F);
		bodyModel[50].rotateAngleZ = -0.17453293F;

		bodyModel[51].addShapeBox(-1F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[51].setRotationPoint(26F, -34.5F, -13F);
		bodyModel[51].rotateAngleZ = 0.29670597F;

		bodyModel[52].addShapeBox(-1F, 0F, 0F, 1, 7, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[52].setRotationPoint(26F, -34.5F, -2F);
		bodyModel[52].rotateAngleZ = 0.29670597F;

		bodyModel[53].addShapeBox(-1F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[53].setRotationPoint(26F, -34.5F, -12F);
		bodyModel[53].rotateAngleZ = 0.29670597F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 25, 15, 1, 0F,-9F, -5.5F, -2F, -9F, -5.5F, 0F, -9F, -5.5F, 0F, -9F, -5.5F, 2F, -9F, -5.5F, -2F, -9F, -5.5F, 0F, -9F, -5.5F, 0F, -9F, -5.5F, 2F); // draw flag
		bodyModel[54].setRotationPoint(21F, -25F, 10.5F);
		bodyModel[54].rotateAngleY = 0.05235988F;

		bodyModel[55].addShapeBox(-15F, 0F, 0F, 15, 28, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 322
		bodyModel[55].setRotationPoint(14F, -34.5F, 13F);

		bodyModel[56].addShapeBox(-15F, 0F, 0F, 15, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[56].setRotationPoint(-1F, -34.5F, 15.5F);

		bodyModel[57].addShapeBox(-15F, 0F, 0F, 23, 28, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -1F); // Box 324
		bodyModel[57].setRotationPoint(-24F, -34.5F, 15.5F);

		bodyModel[58].addShapeBox(-15F, 0F, 0F, 15, 28, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 325
		bodyModel[58].setRotationPoint(14F, -34.5F, -14F);

		bodyModel[59].addShapeBox(-15F, 0F, 0F, 15, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[59].setRotationPoint(-1F, -34.5F, -16.5F);

		bodyModel[60].addShapeBox(-15F, 0F, 0F, 23, 28, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 1F); // Box 327
		bodyModel[60].setRotationPoint(-24F, -34.5F, -16.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 28, 0F,0F, 0.1F, 0.9F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0.9F); // Box 328
		bodyModel[61].setRotationPoint(8F, -34.5F, -14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 32, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 329
		bodyModel[62].setRotationPoint(-16F, -34.5F, -16F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 23, 1, 32, 0F,0F, -1.9F, -0.6F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.9F, -0.6F, 0F, 1.5F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -0.6F); // Box 330
		bodyModel[63].setRotationPoint(-39F, -34.5F, -16F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 27, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 331
		bodyModel[64].setRotationPoint(-39F, -32.5F, 8.5F);
		bodyModel[64].rotateAngleZ = -0.2268928F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 27, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 334
		bodyModel[65].setRotationPoint(-39F, -32.5F, -14.5F);
		bodyModel[65].rotateAngleZ = -0.2268928F;

		bodyModel[66].addShapeBox(0F, 2F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 335
		bodyModel[66].setRotationPoint(-39.2F, -32.5F, 8.5F);
		bodyModel[66].rotateAngleZ = -0.2268928F;

		bodyModel[67].addShapeBox(0F, 18F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 336
		bodyModel[67].setRotationPoint(-39.2F, -32.5F, 8.5F);
		bodyModel[67].rotateAngleZ = -0.2268928F;

		bodyModel[68].addShapeBox(0F, 18F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 337
		bodyModel[68].setRotationPoint(-39.2F, -32.5F, -9.5F);
		bodyModel[68].rotateAngleZ = -0.2268928F;

		bodyModel[69].addShapeBox(0F, 2F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 338
		bodyModel[69].setRotationPoint(-39.2F, -32.5F, -9.5F);
		bodyModel[69].rotateAngleZ = -0.2268928F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 358
		bodyModel[70].setRotationPoint(-8F, -34.5F, -16F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 359
		bodyModel[71].setRotationPoint(-8F, -34.5F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0.1F, -2F, 0F, 0.1F, 2F, 0F, 0.1F, -1.1F, 0F, 0.1F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0F); // Box 360
		bodyModel[72].setRotationPoint(-1F, -34.5F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0.1F, 0F, 0F, 0.1F, -1.1F, 0F, 0.1F, 2F, 0F, 0.1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -1.1F, 0F, -0.5F, 2F, 0F, -0.5F, -2F); // Box 361
		bodyModel[73].setRotationPoint(-1F, -34.5F, -16F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 26, 0F); // Box 371
		bodyModel[74].setRotationPoint(-31F, 0.5F, -13F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 26, 0F); // Box 385
		bodyModel[75].setRotationPoint(-5F, 0.5F, -13F);

		bodyModel[76].addShapeBox(-15F, 0F, 0F, 34, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 392
		bodyModel[76].setRotationPoint(-20F, -10.5F, 15.5F);

		bodyModel[77].addShapeBox(-15F, 0F, 0F, 10, 5, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -1F); // Box 393
		bodyModel[77].setRotationPoint(-30F, -10.5F, 15.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -4F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -1.5F, 0F, 2F, 0F); // Box 395
		bodyModel[78].setRotationPoint(-1F, -10.5F, 15.5F);

		bodyModel[79].addShapeBox(0F, 26F, 0F, 1, 1, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 0.5F); // Box 396
		bodyModel[79].setRotationPoint(-39F, -32.5F, -8F);
		bodyModel[79].rotateAngleZ = -0.2268928F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[80].setRotationPoint(50F, -12.5F, -18F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[81].setRotationPoint(56F, -12.5F, -18F);
		bodyModel[81].rotateAngleZ = -0.4712389F;

		bodyModel[82].addShapeBox(-6F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[82].setRotationPoint(50F, -12.5F, -18F);
		bodyModel[82].rotateAngleZ = 0.48869219F;

		bodyModel[83].addShapeBox(-3F, 0F, 0F, 3, 1, 11, 0F,0.4F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 400
		bodyModel[83].setRotationPoint(45F, -9.8F, -18F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 2.5F, 0F, 0F); // Box 401
		bodyModel[84].setRotationPoint(41.6F, -5.8F, -18F);

		bodyModel[85].addShapeBox(-6F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, -0.5F, 0F, 3F, 0F); // Box 402
		bodyModel[85].setRotationPoint(50F, -12.5F, -10F);
		bodyModel[85].rotateAngleZ = 0.48869219F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, -0.5F, 0F, 6F, -0.5F); // Box 403
		bodyModel[86].setRotationPoint(50F, -12.5F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, 0F, 3F, -1F, 0F, 3F, -1F, -0.5F, 0F, 3F, -0.5F); // Box 404
		bodyModel[87].setRotationPoint(56F, -12.5F, -10F);
		bodyModel[87].rotateAngleZ = -0.4712389F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,21F, 0.1F, 14.5F, 21F, 0.1F, 15F, 21F, 0.1F, 15F, 21F, 0.1F, 14.5F, 21F, 0F, 14.5F, 21F, 0F, 15F, 21F, 0F, 15F, 21F, 0F, 14.5F); // Box 407
		bodyModel[88].setRotationPoint(-23F, -7.5F, -0.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,6F, 0.1F, 15F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0.1F, 15F, 6F, 0F, 15F, 6F, 0F, 13F, 6F, 0F, 13F, 6F, 0F, 15F); // Box 408
		bodyModel[89].setRotationPoint(6F, -7.5F, -0.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,22F, 0F, 6F, 22F, 0F, 6F, 22F, 0F, 6F, 22F, 0F, 6F, 22F, 0F, 6F, 20F, 0F, 6F, 20F, 0F, 6F, 22F, 0F, 6F); // Box 409
		bodyModel[90].setRotationPoint(21.5F, -6.5F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F, 11F, 0F, 4F); // Box 410
		bodyModel[91].setRotationPoint(51.5F, -6.5F, -0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[92].setRotationPoint(50.5F, -2.5F, -2.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 9, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[93].setRotationPoint(-31.5F, -5.5F, -2.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 9, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[94].setRotationPoint(-6.5F, -5.5F, -2.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F, 22F, 0F, 3F); // Box 415
		bodyModel[95].setRotationPoint(-24.5F, -6.5F, -0.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[96].setRotationPoint(-48F, -4.5F, 8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[97].setRotationPoint(-53.5F, -7.5F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[98].setRotationPoint(-48.5F, -4.5F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[99].setRotationPoint(-48F, -4.5F, -9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[100].setRotationPoint(-48.5F, -4.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[101].setRotationPoint(64.5F, -7F, -1.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[102].setRotationPoint(68.5F, -5F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[103].setRotationPoint(72.5F, -6F, -1F);

		bodyModel[104].addShapeBox(0F, -6.5F, 0F, 1, 15, 15, 0F,0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F, 0F, -6.3F, -6.3F); // Box 424
		bodyModel[104].setRotationPoint(60.6F, -23.5F, -7.5F);
		bodyModel[104].rotateAngleZ = 0.66322512F;

		bodyModel[105].addShapeBox(-15F, 0F, 0F, 34, 5, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[105].setRotationPoint(-20F, -10.5F, -18.5F);

		bodyModel[106].addShapeBox(-15F, 0F, 0F, 10, 5, 3, 0F,0F, -4F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[106].setRotationPoint(-30F, -10.5F, -18.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, -1F, -1F, 0F, -4F, -2F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 427
		bodyModel[107].setRotationPoint(-1F, -10.5F, -18.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 25, 15, 1, 0F,-9F, -5.5F, 2F, -9F, -5.5F, 0F, -9F, -5.5F, 0F, -9F, -5.5F, -2F, -9F, -5.5F, 2F, -9F, -5.5F, 0F, -9F, -5.5F, 0F, -9F, -5.5F, -2F); // Box 179
		bodyModel[108].setRotationPoint(21F, -25F, -11.5F);
		bodyModel[108].rotateAngleY = -0.05235988F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 180
		bodyModel[109].setRotationPoint(60F, -16.25F, -10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[110].setRotationPoint(60F, -17.5F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 182
		bodyModel[111].setRotationPoint(60F, -15F, -10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 183
		bodyModel[112].setRotationPoint(59.5F, -15.25F, -9.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F); // Box 184
		bodyModel[113].setRotationPoint(62F, -19.5F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F); // Box 185
		bodyModel[114].setRotationPoint(62F, -17F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F); // Box 186
		bodyModel[115].setRotationPoint(62F, -14.5F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F); // Box 187
		bodyModel[116].setRotationPoint(62F, -12F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, 0F, 7F, 0F, 0F); // Box 188
		bodyModel[117].setRotationPoint(62F, -9.5F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[118].setRotationPoint(17F, -11F, -10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[119].setRotationPoint(14F, -21F, -10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[120].setRotationPoint(14F, -23F, -10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 36, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[121].setRotationPoint(-38F, -10F, -11.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 36, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 193
		bodyModel[122].setRotationPoint(-38F, -21F, -15F);

		bodyModel[123].addShapeBox(-15F, 0F, 0F, 60, 90, 1, 0F,-26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F, -26F, -40F, -0.3F); // Box 195
		bodyModel[123].setRotationPoint(26.5F, -71.8F, -10F);
		bodyModel[123].rotateAngleY = 1.57079633F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 36, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[124].setRotationPoint(-38F, -10F, 3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 36, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[125].setRotationPoint(-38F, -21F, 12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 11, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[126].setRotationPoint(17F, -11F, 1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[127].setRotationPoint(14F, -21F, 1.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[128].setRotationPoint(14F, -23F, 1.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 6, 24, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 202
		bodyModel[129].setRotationPoint(27F, -21F, -12F);

		bodyModel[130].addShapeBox(-15F, 0F, 0F, 120, 60, 1, 0F,-42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F, -42F, -22F, 0F); // Box 207
		bodyModel[130].setRotationPoint(-61F, -50.5F, -15.9F);
		bodyModel[130].rotateAngleY = -0.01745329F;

		bodyModel[131].addShapeBox(-15F, 0F, 0F, 120, 60, 1, 0F,-40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F, -40F, -22F, 0F); // Box 208
		bodyModel[131].setRotationPoint(-64F, -50.5F, 15F);
		bodyModel[131].rotateAngleY = 0.01745329F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 428
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 429
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 430
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 431
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 432
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 433

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 9, 19, 1, 0F,0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 428
		bodyDoorOpenModel[0].setRotationPoint(16F, -30.5F, -14F);
		bodyDoorOpenModel[0].rotateAngleY = -2.05948852F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, -1F, 9, 19, 1, 0F,0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 429
		bodyDoorOpenModel[1].setRotationPoint(16F, -30.5F, 14F);
		bodyDoorOpenModel[1].rotateAngleY = 1.88495559F;

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, -9F, 1, 26, 9, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.2F, 0F); // Box 430
		bodyDoorOpenModel[2].setRotationPoint(-39F, -32.5F, 9F);
		bodyDoorOpenModel[2].rotateAngleX = -0.17453293F;
		bodyDoorOpenModel[2].rotateAngleY = -2.30383461F;
		bodyDoorOpenModel[2].rotateAngleZ = 0.12217305F;

		bodyDoorOpenModel[3].addShapeBox(-1F, 9F, -8F, 1, 4, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 431
		bodyDoorOpenModel[3].setRotationPoint(-39.5F, -32.5F, 9F);
		bodyDoorOpenModel[3].rotateAngleX = -0.17453293F;
		bodyDoorOpenModel[3].rotateAngleY = -2.30383461F;
		bodyDoorOpenModel[3].rotateAngleZ = 0.12217305F;

		bodyDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 1, 26, 9, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.2F, 0F); // Box 432
		bodyDoorOpenModel[4].setRotationPoint(-39F, -32.5F, -9F);
		bodyDoorOpenModel[4].rotateAngleX = 0.17453293F;
		bodyDoorOpenModel[4].rotateAngleY = 2.30383461F;
		bodyDoorOpenModel[4].rotateAngleZ = 0.12217305F;

		bodyDoorOpenModel[5].addShapeBox(-1F, 9F, 7F, 1, 4, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 433
		bodyDoorOpenModel[5].setRotationPoint(-39.5F, -32.5F, -9F);
		bodyDoorOpenModel[5].rotateAngleX = 0.17453293F;
		bodyDoorOpenModel[5].rotateAngleY = 2.30383461F;
		bodyDoorOpenModel[5].rotateAngleZ = 0.12217305F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 291
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 299
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 332
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 333
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 339
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 340

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 9, 19, 1, 0F,0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 291
		bodyDoorCloseModel[0].setRotationPoint(16F, -30.5F, -14F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 9, 19, 1, 0F,0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 299
		bodyDoorCloseModel[1].setRotationPoint(16F, -30.5F, 13F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 1, 26, 9, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.2F, 0F); // Box 332
		bodyDoorCloseModel[2].setRotationPoint(-39F, -32.5F, 0F);
		bodyDoorCloseModel[2].rotateAngleZ = -0.2268928F;

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 1, 26, 9, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.2F, 0F); // Box 333
		bodyDoorCloseModel[3].setRotationPoint(-39F, -32.5F, -9F);
		bodyDoorCloseModel[3].rotateAngleZ = -0.2268928F;

		bodyDoorCloseModel[4].addShapeBox(0F, 9F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 339
		bodyDoorCloseModel[4].setRotationPoint(-39.5F, -32.5F, 1F);
		bodyDoorCloseModel[4].rotateAngleZ = -0.2268928F;

		bodyDoorCloseModel[5].addShapeBox(0F, 9F, 0F, 1, 4, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 340
		bodyDoorCloseModel[5].setRotationPoint(-39.5F, -32.5F, -2F);
		bodyDoorCloseModel[5].rotateAngleZ = -0.2268928F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 303
		turretModel[1] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 342
		turretModel[2] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 343
		turretModel[3] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 344
		turretModel[4] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 345
		turretModel[5] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 346
		turretModel[6] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 347
		turretModel[7] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 348
		turretModel[8] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 349
		turretModel[9] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 350
		turretModel[10] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 351
		turretModel[11] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 352
		turretModel[12] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 353
		turretModel[13] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 362
		turretModel[14] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 363
		turretModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 364
		turretModel[16] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 365

		turretModel[0].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -3F, 2F, 0F, -3F); // Box 303
		turretModel[0].setRotationPoint(-3F, -46.5F, -9F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 2F); // Box 342
		turretModel[1].setRotationPoint(8F, -46.5F, -3F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,5F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -4F, 0F, 3F, 3F, 0F, -2F, -3F, 0F, -2F); // Box 343
		turretModel[2].setRotationPoint(8F, -46.5F, -9F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 5F, 0F, 0F, -3F, 0F, -2F, 3F, 0F, -2F, -4F, 0F, 3F, 3F, 0F, 2F); // Box 344
		turretModel[3].setRotationPoint(8F, -46.5F, 3F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 3F, 2F, 0F, 3F); // Box 345
		turretModel[4].setRotationPoint(-3F, -46.5F, 8F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 0F, 1F, 3F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 2F, -4F, 0F, 3F); // Box 346
		turretModel[5].setRotationPoint(-9F, -46.5F, 3F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-6F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, 3F, 0F, 2F, -3F, 0F, -2F, 3F, 0F, -2F); // Box 347
		turretModel[6].setRotationPoint(-9F, -46.5F, -9F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 2F); // Box 348
		turretModel[7].setRotationPoint(-9F, -46.5F, -3F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 349
		turretModel[8].setRotationPoint(-3F, -48.5F, -9F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,-2F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F); // Box 350
		turretModel[9].setRotationPoint(-9F, -48.5F, -9F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 351
		turretModel[10].setRotationPoint(-1F, -48.5F, -9F);
		turretModel[10].rotateAngleZ = 1.30899694F;

		turretModel[11].addShapeBox(4F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, -1F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F); // Box 352
		turretModel[11].setRotationPoint(-1F, -48.5F, -9F);
		turretModel[11].rotateAngleZ = 1.30899694F;

		turretModel[12].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, 0F, 0F); // Box 353
		turretModel[12].setRotationPoint(9F, -42.5F, -2.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 362
		turretModel[13].setRotationPoint(1F, -52F, -8F);
		turretModel[13].rotateAngleZ = -0.66322512F;

		turretModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 363
		turretModel[14].setRotationPoint(4.2F, -49.5F, -8F);
		turretModel[14].rotateAngleZ = -1.32645023F;

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 364
		turretModel[15].setRotationPoint(1F, -52F, 7F);
		turretModel[15].rotateAngleZ = -0.66322512F;

		turretModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 365
		turretModel[16].setRotationPoint(4.2F, -49.5F, 7F);
		turretModel[16].rotateAngleZ = -1.32645023F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 354
		barrelModel[1] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 355
		barrelModel[2] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 356
		barrelModel[3] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 357
		barrelModel[4] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 405
		barrelModel[5] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 406

		barrelModel[0].addShapeBox(0F, -0.5F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 354
		barrelModel[0].setRotationPoint(8.5F, -40F, -0.5F);

		barrelModel[1].addShapeBox(0F, 0.3F, 0F, 11, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 355
		barrelModel[1].setRotationPoint(8.5F, -40F, -0.5F);

		barrelModel[2].addShapeBox(5F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 356
		barrelModel[2].setRotationPoint(8.5F, -40F, -0.5F);

		barrelModel[3].addShapeBox(8F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 357
		barrelModel[3].setRotationPoint(8.5F, -40F, -0.5F);

		barrelModel[4].addShapeBox(-6F, -0.5F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 405
		barrelModel[4].setRotationPoint(8.5F, -40F, -0.5F);

		barrelModel[5].addShapeBox(-6.5F, 1F, 0F, 1, 3, 1, 0F,0F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 1F, -0.3F, 0.4F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F, 0.4F, 1F, -0.3F, 0.4F); // Box 406
		barrelModel[5].setRotationPoint(8.5F, -40F, -0.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 249
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 250
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 251
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 252
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 253
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 254

		leftFrontWheelModel[0].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 249
		leftFrontWheelModel[0].setRotationPoint(53F, 1.5F, 13F);

		leftFrontWheelModel[1].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftFrontWheelModel[1].setRotationPoint(53F, 1.5F, 13F);

		leftFrontWheelModel[2].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 251
		leftFrontWheelModel[2].setRotationPoint(53F, 1.5F, 13F);

		leftFrontWheelModel[3].addBox(-5.5F, -2F, 1F, 11, 4, 1, 0F); // Box 252
		leftFrontWheelModel[3].setRotationPoint(53F, 1.5F, 13F);

		leftFrontWheelModel[4].addShapeBox(-5.5F, -6F, 1F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftFrontWheelModel[4].setRotationPoint(53F, 1.5F, 13F);

		leftFrontWheelModel[5].addShapeBox(-5.5F, 2F, 1F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 254
		leftFrontWheelModel[5].setRotationPoint(53F, 1.5F, 13F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 255
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 256
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 257
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 258
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 259
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 260

		rightFrontWheelModel[0].addShapeBox(-5.5F, 2F, -2F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 255
		rightFrontWheelModel[0].setRotationPoint(53F, 1.5F, -14F);

		rightFrontWheelModel[1].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 256
		rightFrontWheelModel[1].setRotationPoint(53F, 1.5F, -14F);

		rightFrontWheelModel[2].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 257
		rightFrontWheelModel[2].setRotationPoint(53F, 1.5F, -14F);

		rightFrontWheelModel[3].addBox(-5.5F, -2F, -2F, 11, 4, 1, 0F); // Box 258
		rightFrontWheelModel[3].setRotationPoint(53F, 1.5F, -14F);

		rightFrontWheelModel[4].addShapeBox(-5.5F, -6F, -2F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightFrontWheelModel[4].setRotationPoint(53F, 1.5F, -14F);

		rightFrontWheelModel[5].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightFrontWheelModel[5].setRotationPoint(53F, 1.5F, -14F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 366
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 367
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 368
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 369
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 370
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 378
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 386
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 387
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 388
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 389
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 390
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 391

		leftBackWheelModel[0].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftBackWheelModel[0].setRotationPoint(-30F, 1.5F, 13F);

		leftBackWheelModel[1].addBox(-5.5F, -2F, 1F, 11, 4, 1, 0F); // Box 367
		leftBackWheelModel[1].setRotationPoint(-30F, 1.5F, 13F);

		leftBackWheelModel[2].addShapeBox(-5.5F, 2F, 1F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 368
		leftBackWheelModel[2].setRotationPoint(-30F, 1.5F, 13F);

		leftBackWheelModel[3].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 369
		leftBackWheelModel[3].setRotationPoint(-30F, 1.5F, 13F);

		leftBackWheelModel[4].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 370
		leftBackWheelModel[4].setRotationPoint(-30F, 1.5F, 13F);

		leftBackWheelModel[5].addShapeBox(-5.5F, -6F, -2F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftBackWheelModel[5].setRotationPoint(-30F, 1.5F, 16F);

		leftBackWheelModel[6].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 386
		leftBackWheelModel[6].setRotationPoint(-4F, 1.5F, 13F);

		leftBackWheelModel[7].addBox(-5.5F, -2F, 1F, 11, 4, 1, 0F); // Box 387
		leftBackWheelModel[7].setRotationPoint(-4F, 1.5F, 13F);

		leftBackWheelModel[8].addShapeBox(-5.5F, 2F, 1F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 388
		leftBackWheelModel[8].setRotationPoint(-4F, 1.5F, 13F);

		leftBackWheelModel[9].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 389
		leftBackWheelModel[9].setRotationPoint(-4F, 1.5F, 13F);

		leftBackWheelModel[10].addShapeBox(-5.5F, -6F, -2F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftBackWheelModel[10].setRotationPoint(-4F, 1.5F, 16F);

		leftBackWheelModel[11].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		leftBackWheelModel[11].setRotationPoint(-4F, 1.5F, 13F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 372
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 373
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 374
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 375
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 376
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 377
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 379
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 380
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 381
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 382
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 383
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 384

		rightBackWheelModel[0].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		rightBackWheelModel[0].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[1].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 373
		rightBackWheelModel[1].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[2].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 374
		rightBackWheelModel[2].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[3].addShapeBox(-5.5F, 2F, -2F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 375
		rightBackWheelModel[3].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[4].addBox(-5.5F, -2F, -2F, 11, 4, 1, 0F); // Box 376
		rightBackWheelModel[4].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[5].addShapeBox(-5.5F, -6F, -2F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		rightBackWheelModel[5].setRotationPoint(-30F, 1.5F, -14F);

		rightBackWheelModel[6].addShapeBox(-9.5F, -9F, -1F, 19, 6, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		rightBackWheelModel[6].setRotationPoint(-4F, 1.5F, -14F);

		rightBackWheelModel[7].addShapeBox(-5.5F, -6F, -2F, 11, 4, 1, 0F,-3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		rightBackWheelModel[7].setRotationPoint(-4F, 1.5F, -14F);

		rightBackWheelModel[8].addBox(-5.5F, -2F, -2F, 11, 4, 1, 0F); // Box 381
		rightBackWheelModel[8].setRotationPoint(-4F, 1.5F, -14F);

		rightBackWheelModel[9].addBox(-9.5F, -3F, -1F, 19, 6, 2, 0F); // Box 382
		rightBackWheelModel[9].setRotationPoint(-4F, 1.5F, -14F);

		rightBackWheelModel[10].addShapeBox(-9.5F, 3F, -1F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 383
		rightBackWheelModel[10].setRotationPoint(-4F, 1.5F, -14F);

		rightBackWheelModel[11].addShapeBox(-5.5F, 2F, -2F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, -0.5F, 0F); // Box 384
		rightBackWheelModel[11].setRotationPoint(-4F, 1.5F, -14F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 203
		steeringWheelModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 204
		steeringWheelModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 205
		steeringWheelModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 206

		steeringWheelModel[0].addShapeBox(-4F, -1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		steeringWheelModel[0].setRotationPoint(28.5F, -20F, -6F);
		steeringWheelModel[0].rotateAngleZ = -0.43633231F;

		steeringWheelModel[1].addShapeBox(-4F, -3F, -3F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		steeringWheelModel[1].setRotationPoint(28.5F, -20F, -6F);
		steeringWheelModel[1].rotateAngleZ = -0.43633231F;

		steeringWheelModel[2].addShapeBox(-4F, 1F, -3F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 205
		steeringWheelModel[2].setRotationPoint(28.5F, -20F, -6F);
		steeringWheelModel[2].rotateAngleZ = -0.43633231F;

		steeringWheelModel[3].addShapeBox(-3F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		steeringWheelModel[3].setRotationPoint(28.5F, -20F, -6F);
		steeringWheelModel[3].rotateAngleZ = -0.43633231F;
	}
}