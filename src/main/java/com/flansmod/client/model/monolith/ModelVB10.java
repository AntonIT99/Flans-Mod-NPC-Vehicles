//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: VB10
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelVB10 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 256;

	public ModelVB10() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[90];
		noseModel = new ModelRendererTurbo[17];
		tailModel = new ModelRendererTurbo[13];
		leftWingModel = new ModelRendererTurbo[10];
		rightWingModel = new ModelRendererTurbo[10];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 221
		bodyModel[1] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 222
		bodyModel[2] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 223
		bodyModel[3] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 224
		bodyModel[4] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 225
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 226
		bodyModel[6] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 227
		bodyModel[7] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 228
		bodyModel[8] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 229
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 230
		bodyModel[10] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 231
		bodyModel[11] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 233
		bodyModel[12] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 234
		bodyModel[13] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 235
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 236
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 237
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 238
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 239
		bodyModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 240
		bodyModel[19] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 241
		bodyModel[20] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 242
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 243
		bodyModel[22] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 244
		bodyModel[23] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 245
		bodyModel[24] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 246
		bodyModel[25] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 247
		bodyModel[26] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 248
		bodyModel[27] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 262
		bodyModel[28] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 263
		bodyModel[29] = new ModelRendererTurbo(this, 206, 118, textureX, textureY); // Box 264
		bodyModel[30] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 284
		bodyModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 285
		bodyModel[32] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 286
		bodyModel[33] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 287
		bodyModel[34] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 288
		bodyModel[35] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 289
		bodyModel[36] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 290
		bodyModel[37] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 291
		bodyModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 89
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		bodyModel[40] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 91
		bodyModel[41] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 298
		bodyModel[42] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 299
		bodyModel[43] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 300
		bodyModel[44] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 301
		bodyModel[45] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 302
		bodyModel[46] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 303
		bodyModel[47] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 304
		bodyModel[48] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 305
		bodyModel[49] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 306
		bodyModel[50] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 307
		bodyModel[51] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 222
		bodyModel[52] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 223
		bodyModel[53] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 224
		bodyModel[54] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 311
		bodyModel[55] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 331
		bodyModel[56] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 332
		bodyModel[57] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 333
		bodyModel[58] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 334
		bodyModel[59] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 335
		bodyModel[60] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 336
		bodyModel[61] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 337
		bodyModel[62] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 338
		bodyModel[63] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 339
		bodyModel[64] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 340
		bodyModel[65] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 341
		bodyModel[66] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 342
		bodyModel[67] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 347
		bodyModel[68] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 348
		bodyModel[69] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 350
		bodyModel[70] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 351
		bodyModel[71] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 352
		bodyModel[72] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 353
		bodyModel[73] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 354
		bodyModel[74] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 355
		bodyModel[75] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 356
		bodyModel[76] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 357
		bodyModel[77] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 358
		bodyModel[78] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 359
		bodyModel[79] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 360
		bodyModel[80] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 361
		bodyModel[81] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 362
		bodyModel[82] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 363
		bodyModel[83] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 364
		bodyModel[84] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 366
		bodyModel[85] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 367
		bodyModel[86] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 368
		bodyModel[87] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 369
		bodyModel[88] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 370
		bodyModel[89] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 371

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 9, 23, 0F,0F, 0.5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 0F); // Box 221
		bodyModel[0].setRotationPoint(-79F, -40.5F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 9, 23, 0F,0F, 0F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, -7F, 0F, -1.5F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -1.5F, 0F); // Box 222
		bodyModel[1].setRotationPoint(-79F, -48.5F, -11.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 8, 23, 0F,0F, -0.5F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, 2.5F, -5.5F, 0F, 2.5F, -5.5F, 0F, -0.5F, -6F); // Box 223
		bodyModel[2].setRotationPoint(-79F, -32F, -11.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 13, 25, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 224
		bodyModel[3].setRotationPoint(-59F, -42.5F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 8, 25, 0F,0F, 0F, -8F, 0F, 0.5F, -7.5F, 0F, 0.5F, -7.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 225
		bodyModel[4].setRotationPoint(-59F, -50.5F, -12.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 8, 25, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 2.5F, -6.5F, 0F, 2.5F, -6.5F, 0F, 0F, -6.5F); // Box 226
		bodyModel[5].setRotationPoint(-59F, -29.5F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 50, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 4F, -5.5F, 0F, 4F, -5.5F, 0F, 1F, -7F); // Box 227
		bodyModel[6].setRotationPoint(-42F, -29F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 50, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[7].setRotationPoint(-42F, -43F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 50, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[8].setRotationPoint(-42F, -43F, 12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[9].setRotationPoint(-78F, -38.5F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 231
		bodyModel[10].setRotationPoint(-78F, -38.5F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 9, 26, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 4F, -5.5F, 0F, 3.5F, -5.5F, 0F, 3.5F, -5.5F, 0F, 4F, -5.5F); // Box 233
		bodyModel[11].setRotationPoint(8F, -29F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 14, 26, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 234
		bodyModel[12].setRotationPoint(8F, -43F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 7, 26, 0F,0F, 0F, -8F, 0F, -0.5F, -8.5F, 0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F); // Box 235
		bodyModel[13].setRotationPoint(8F, -50F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 2F, -8F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 2F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[14].setRotationPoint(-42F, -49F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 2F, 8F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[15].setRotationPoint(-42F, -49F, 12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[16].setRotationPoint(-32F, -49F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[17].setRotationPoint(-32F, -49F, 12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, -5F, 0F, 1F, -7F, 0F, 1F, 7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[18].setRotationPoint(-18F, -49F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 5F, 0F, 1F, 7F, 0F, 1F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[19].setRotationPoint(-18F, -49F, 12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 1F, -7F, 0F, 1.5F, -8F, 0F, 1.5F, 12F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[20].setRotationPoint(-9F, -49F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 1.5F, -8F, 0F, 1F, -8F, 0F, 1F, 12F, 0F, 1.5F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[21].setRotationPoint(0F, -49F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 1F, 7F, 0F, 1.5F, 12F, 0F, 1.5F, -8F, 0F, 1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[22].setRotationPoint(-9F, -49F, 12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 1.5F, 12F, 0F, 1F, 12F, 0F, 1F, -8F, 0F, 1.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[23].setRotationPoint(0F, -49F, 12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 42, 14, 24, 0F,0F, 0.5F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, 0F); // Box 246
		bodyModel[24].setRotationPoint(28F, -42F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 42, 7, 24, 0F,0F, 0.5F, -7.5F, 0F, -1.5F, -8.5F, 0F, -1.5F, -8.5F, 0F, 0.5F, -7.5F, 0F, -0.5F, 0F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -0.5F, 0F); // Box 247
		bodyModel[25].setRotationPoint(28F, -49F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 42, 11, 24, 0F,0F, 0.5F, 0F, 0F, 2F, -3.5F, 0F, 2F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, -4.5F, 0F, -5F, -5.5F, 0F, -5F, -5.5F, 0F, 0F, -4.5F); // Box 248
		bodyModel[26].setRotationPoint(28F, -27.5F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 51, 11, 1, 0F,2F, 1.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1.5F, 0F, 0F, 0F, -1F, -8F, 0F, -1F, -8F, 0F, 4F, 0F, 0F, 4F); // Box 262
		bodyModel[27].setRotationPoint(-50F, -23F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 51, 11, 1, 0F,2F, 1.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1.5F, 0F, 0F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, -1F, 0F, 0F, -1F); // Box 263
		bodyModel[28].setRotationPoint(-50F, -23F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 43, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, -4F, -18F, 0.5F, -4F, -18F, 0.5F, -4F, -7F, 1F, -4F); // Box 264
		bodyModel[29].setRotationPoint(-50F, -12F, -8F);

		bodyModel[30].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[30].setRotationPoint(-34F, -58.5F, 2.5F);
		bodyModel[30].rotateAngleY = -0.10471976F;
		bodyModel[30].rotateAngleZ = -0.82030475F;

		bodyModel[31].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[31].setRotationPoint(-34F, -58.5F, 2.5F);
		bodyModel[31].rotateAngleX = 0.48869219F;
		bodyModel[31].rotateAngleY = -0.10471976F;
		bodyModel[31].rotateAngleZ = 0.13962634F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[32].setRotationPoint(-34F, -58.3F, 2.5F);
		bodyModel[32].rotateAngleX = -0.27925268F;

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 287
		bodyModel[33].setRotationPoint(-34F, -58.8F, 0.5F);

		bodyModel[34].addShapeBox(-0.5F, -5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 288
		bodyModel[34].setRotationPoint(-18F, -53.5F, 0F);

		bodyModel[35].addShapeBox(-0.5F, -5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 289
		bodyModel[35].setRotationPoint(-18F, -53.5F, 0F);
		bodyModel[35].rotateAngleX = 0.61086524F;

		bodyModel[36].addShapeBox(-0.5F, -5.5F, -5F, 1, 1, 5, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 290
		bodyModel[36].setRotationPoint(-18F, -53.5F, 0F);
		bodyModel[36].rotateAngleX = 0.99483767F;

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[37].setRotationPoint(-18F, -51.5F, -7F);
		bodyModel[37].rotateAngleX = -0.15707963F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[38].setRotationPoint(-20.5F, -56F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[39].setRotationPoint(-20.5F, -52F, -2F);
		bodyModel[39].rotateAngleZ = -0.12217305F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[40].setRotationPoint(-30.5F, -42F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 7, 5, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[41].setRotationPoint(-42F, -50.5F, -8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[42].setRotationPoint(-42F, -50.5F, -3.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[43].setRotationPoint(-42F, -50.5F, 3.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[44].setRotationPoint(-36.5F, -50F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 302
		bodyModel[45].setRotationPoint(-36.5F, -46F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[46].setRotationPoint(-36.5F, -50F, -7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[47].setRotationPoint(-36.5F, -50F, 3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[48].setRotationPoint(-42F, -51.5F, -3.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[49].setRotationPoint(-42F, -51.5F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 307
		bodyModel[50].setRotationPoint(-42F, -51.5F, 3.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[51].setRotationPoint(-32.7F, -52.2F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[52].setRotationPoint(-36.2F, -52F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[53].setRotationPoint(-33.7F, -55.05F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 18, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 311
		bodyModel[54].setRotationPoint(44F, -44F, -11.5F);

		bodyModel[55].addShapeBox(-0.5F, -5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 331
		bodyModel[55].setRotationPoint(-18F, -53.5F, 0F);
		bodyModel[55].rotateAngleX = -0.61086524F;

		bodyModel[56].addShapeBox(-0.5F, -5.5F, 0F, 1, 1, 5, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 332
		bodyModel[56].setRotationPoint(-18F, -53.5F, 0F);
		bodyModel[56].rotateAngleX = -0.99483767F;

		bodyModel[57].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[57].setRotationPoint(-18F, -51.5F, 7F);
		bodyModel[57].rotateAngleX = 0.15707963F;

		bodyModel[58].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[58].setRotationPoint(-34F, -58.3F, -2.5F);
		bodyModel[58].rotateAngleX = 0.27925268F;

		bodyModel[59].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[59].setRotationPoint(-34F, -58.5F, -2.5F);
		bodyModel[59].rotateAngleY = 0.10471976F;
		bodyModel[59].rotateAngleZ = -0.82030475F;

		bodyModel[60].addShapeBox(-0.5F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[60].setRotationPoint(-34F, -58.5F, -2.5F);
		bodyModel[60].rotateAngleX = -0.48869219F;
		bodyModel[60].rotateAngleY = 0.10471976F;
		bodyModel[60].rotateAngleZ = 0.13962634F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 337
		bodyModel[61].setRotationPoint(44F, -44F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[62].setRotationPoint(-75F, -38.5F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[63].setRotationPoint(-72F, -38.5F, -12.3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[64].setRotationPoint(-69F, -38.5F, -12.3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[65].setRotationPoint(-66F, -38.5F, -12.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[66].setRotationPoint(-63F, -38.5F, -12.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 347
		bodyModel[67].setRotationPoint(-78F, -38.5F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 348
		bodyModel[68].setRotationPoint(-78F, -38.5F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 350
		bodyModel[69].setRotationPoint(-75F, -38.5F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 351
		bodyModel[70].setRotationPoint(-72F, -38.5F, 11.3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 352
		bodyModel[71].setRotationPoint(-69F, -38.5F, 11.3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 353
		bodyModel[72].setRotationPoint(-66F, -38.5F, 11.6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 354
		bodyModel[73].setRotationPoint(-63F, -38.5F, 11.6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 355
		bodyModel[74].setRotationPoint(-2F, -38.5F, -13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[75].setRotationPoint(4F, -38.5F, -14F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F); // Box 357
		bodyModel[76].setRotationPoint(4F, -38.5F, -14F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[77].setRotationPoint(7F, -38.5F, -14F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[78].setRotationPoint(10F, -38.5F, -14.2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[79].setRotationPoint(13F, -38.5F, -14.3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[80].setRotationPoint(16F, -38.5F, -14F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 1F, -0.5F, 0.1F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[81].setRotationPoint(19F, -38.5F, -13.6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 363
		bodyModel[82].setRotationPoint(-2F, -38.5F, 12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 364
		bodyModel[83].setRotationPoint(4F, -38.5F, 13F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 366
		bodyModel[84].setRotationPoint(7F, -38.5F, 13F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 367
		bodyModel[85].setRotationPoint(10F, -38.5F, 13.3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 368
		bodyModel[86].setRotationPoint(13F, -38.5F, 13.2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 369
		bodyModel[87].setRotationPoint(16F, -38.5F, 13F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 1F, 0F, 0F, 0F); // Box 370
		bodyModel[88].setRotationPoint(19F, -38.5F, 12.6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F); // Box 371
		bodyModel[89].setRotationPoint(4F, -38.5F, 13F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 206
		noseModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 207
		noseModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 208
		noseModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 209
		noseModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 210
		noseModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 211
		noseModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 212
		noseModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 213
		noseModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 214
		noseModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 215
		noseModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 216
		noseModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 217
		noseModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 218
		noseModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 219
		noseModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 220
		noseModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 232
		noseModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 349

		noseModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F); // Box 206
		noseModel[0].setRotationPoint(-110F, -38F, -3F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, -2.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -2.5F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F); // Box 207
		noseModel[1].setRotationPoint(-110F, -40F, -3F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, -1F, -2.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, -2.5F); // Box 208
		noseModel[2].setRotationPoint(-110F, -36F, -3F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1.5F); // Box 209
		noseModel[3].setRotationPoint(-111F, -37.5F, -2F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.2F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -0.2F, -1.5F, -0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1.5F); // Box 210
		noseModel[4].setRotationPoint(-111F, -38.5F, -2F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1.5F, -0.5F, -0.2F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, -0.5F, -0.2F, -1.5F); // Box 211
		noseModel[5].setRotationPoint(-111F, -36.5F, -2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 0F); // Box 212
		noseModel[6].setRotationPoint(-108F, -38F, -4F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, -0.5F, -2F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -0.5F, -2F, 0F, 1F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1F, 0F); // Box 213
		noseModel[7].setRotationPoint(-108F, -41F, -4F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 1F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 1F, 0F, 0F, -0.5F, -2F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -0.5F, -2F); // Box 214
		noseModel[8].setRotationPoint(-108F, -35F, -4F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, 0F, -5F, 0F, 1.5F, -4F, 0F, 1.5F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F); // Box 215
		noseModel[9].setRotationPoint(-99F, -45F, -8F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1.5F, -4F, 0F, 1.5F, -4F, 0F, 0F, -5F); // Box 216
		noseModel[10].setRotationPoint(-99F, -35F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 217
		noseModel[11].setRotationPoint(-99F, -39F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0.5F, 0F); // Box 218
		noseModel[12].setRotationPoint(-93F, -39.5F, -9.5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, -5.5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 0F); // Box 219
		noseModel[13].setRotationPoint(-93F, -46.5F, -9.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, -0.5F, -5.5F, 0F, 2.5F, -4F, 0F, 2.5F, -4F, 0F, -0.5F, -5.5F); // Box 220
		noseModel[14].setRotationPoint(-93F, -34F, -9.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 232
		noseModel[15].setRotationPoint(-84F, -38.5F, -11F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0F); // Box 349
		noseModel[16].setRotationPoint(-84F, -38.5F, 10F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 249
		tailModel[1] = new ModelRendererTurbo(this, 206, 151, textureX, textureY); // Box 250
		tailModel[2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 251
		tailModel[3] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 252
		tailModel[4] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 253
		tailModel[5] = new ModelRendererTurbo(this, 2, 122, textureX, textureY); // Box 254
		tailModel[6] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 255
		tailModel[7] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 256
		tailModel[8] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 257
		tailModel[9] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 258
		tailModel[10] = new ModelRendererTurbo(this, 364, 156, textureX, textureY); // Box 259
		tailModel[11] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 260
		tailModel[12] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 261

		tailModel[0].addShapeBox(0F, 0F, 0F, 49, 12, 17, 0F,0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -6.5F, 0F, -9F, -6.5F, 0F, 0F, 0F); // Box 249
		tailModel[0].setRotationPoint(70F, -41.5F, -8.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 49, 6, 17, 0F,0F, 0F, -5F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F); // Box 250
		tailModel[1].setRotationPoint(70F, -47.5F, -8.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 9, 47, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 251
		tailModel[2].setRotationPoint(114F, -86F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 17, 47, 4, 0F,-9F, -9F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -9F, -9F, -1F, 3.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F); // Box 252
		tailModel[3].setRotationPoint(97F, -86F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 17, 47, 4, 0F,0F, 0F, -0.9F, -13.5F, -3F, -0.9F, -13.5F, -3F, -0.9F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 253
		tailModel[4].setRotationPoint(123F, -86F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 49, 8, 17, 0F,0F, 0F, 0F, 0F, 9F, -6.5F, 0F, 9F, -6.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -10F, -6.5F, 0F, -10F, -6.5F, 0F, 0F, -2F); // Box 254
		tailModel[5].setRotationPoint(70F, -29.5F, -8.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 20, 7, 4, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -1F, -5F, -1F, 0F, 0F, 0F); // Box 255
		tailModel[6].setRotationPoint(119F, -38.5F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 7, 2, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		tailModel[7].setRotationPoint(111F, -45F, -58.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 55, 0F,0F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 257
		tailModel[8].setRotationPoint(118F, -45F, -58.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 14, 2, 57, 0F,-8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 258
		tailModel[9].setRotationPoint(97F, -45F, -58.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 7, 2, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		tailModel[10].setRotationPoint(111F, -45F, 1.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 11, 2, 55, 0F,0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -7F, 0F, 0F, 0F); // Box 260
		tailModel[11].setRotationPoint(118F, -45F, 3.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 57, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -7F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -7F); // Box 261
		tailModel[12].setRotationPoint(97F, -45F, 1.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 7, 102, textureX, textureY); // Box 265
		leftWingModel[1] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 266
		leftWingModel[2] = new ModelRendererTurbo(this, 682, 84, textureX, textureY); // Box 267
		leftWingModel[3] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 268
		leftWingModel[4] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 269
		leftWingModel[5] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 270
		leftWingModel[6] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 271
		leftWingModel[7] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 281
		leftWingModel[8] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 312
		leftWingModel[9] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 373

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 24, 9, 137, 0F,-14F, 7.5F, 0F, 2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -15F, 0F, 2F, -15F, 0F, 0F, 0F, 3F, 0F, 0F, 4F); // Box 265
		leftWingModel[0].setRotationPoint(-33F, -31F, -149F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 9, 137, 0F,-14F, 6F, -10F, 14F, 7.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -14F, -14F, -10F, 14F, -15F, 0F, 0F, 0F, 4F, 0F, -2F, 3F); // Box 266
		leftWingModel[1].setRotationPoint(-41F, -31F, -149F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 28, 9, 137, 0F,-2F, 7F, 0F, -16F, 6F, -21F, 2F, -7F, 0F, 0F, 0F, 0F, -2F, -15F, 0F, -16F, -14F, -21F, 2F, 0F, 3F, 0F, 0F, 4F); // Box 267
		leftWingModel[2].setRotationPoint(-9F, -31F, -149F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftWingModel[3].setRotationPoint(-55F, -31F, -65.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[4].setRotationPoint(-51F, -31F, -70F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F); // Box 270
		leftWingModel[5].setRotationPoint(-38F, -31.5F, -66F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F); // Box 271
		leftWingModel[6].setRotationPoint(-37F, -31.5F, -70.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 281
		leftWingModel[7].setRotationPoint(-63F, -32F, -75F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 312
		leftWingModel[8].setRotationPoint(-24F, -37F, -119F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 373
		leftWingModel[9].setRotationPoint(-24F, -34F, -119F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 283
		rightWingModel[1] = new ModelRendererTurbo(this, 7, 102, textureX, textureY); // Box 322
		rightWingModel[2] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 323
		rightWingModel[3] = new ModelRendererTurbo(this, 682, 84, textureX, textureY); // Box 324
		rightWingModel[4] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 325
		rightWingModel[5] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 326
		rightWingModel[6] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 327
		rightWingModel[7] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 328
		rightWingModel[8] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 330
		rightWingModel[9] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 372

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 283
		rightWingModel[0].setRotationPoint(-47F, -35F, 108.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 24, 9, 137, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 7F, 0F, -14F, 7.5F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 2F, -15F, 0F, -14F, -15F, 0F); // Box 322
		rightWingModel[1].setRotationPoint(-33F, -31F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 8, 9, 137, 0F,0F, -4F, 0F, 0F, 0F, 0F, 14F, 7.5F, 0F, -14F, 6F, -10F, 0F, -2F, 3F, 0F, 0F, 4F, 14F, -15F, 0F, -14F, -14F, -10F); // Box 323
		rightWingModel[2].setRotationPoint(-41F, -31F, 12F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 28, 9, 137, 0F,0F, 0F, 0F, 2F, -7F, 0F, -16F, 6F, -21F, -2F, 7F, 0F, 0F, 0F, 4F, 2F, 0F, 3F, -16F, -14F, -21F, -2F, -15F, 0F); // Box 324
		rightWingModel[3].setRotationPoint(-9F, -31F, 12F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		rightWingModel[4].setRotationPoint(-55F, -31F, 64.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[5].setRotationPoint(-51F, -31F, 69F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F); // Box 327
		rightWingModel[6].setRotationPoint(-38F, -31.5F, 64F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 0F, 0F, 0F); // Box 328
		rightWingModel[7].setRotationPoint(-37F, -31.5F, 68.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[8].setRotationPoint(-24F, -37F, 98F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 372
		rightWingModel[9].setRotationPoint(-24F, -34F, 98F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 106
		yawFlapModel[1] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 107

		yawFlapModel[0].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[0].setRotationPoint(-38F, -34F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.43633231F;

		yawFlapModel[1].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[1].setRotationPoint(-38F, -34F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-31F, -31.5F, 0F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 116
		tailWheelModel[1] = new ModelRendererTurbo(this, 31, 151, textureX, textureY); // Box 118
		tailWheelModel[2] = new ModelRendererTurbo(this, 31, 151, textureX, textureY); // Box 146
		tailWheelModel[3] = new ModelRendererTurbo(this, 31, 151, textureX, textureY); // Box 147
		tailWheelModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 148

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -0.8F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, -0.8F); // Box 116
		tailWheelModel[0].setRotationPoint(100.5F, -25F, -2F);
		tailWheelModel[0].rotateAngleZ = -0.71558499F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		tailWheelModel[1].setRotationPoint(100F, -21F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		tailWheelModel[2].setRotationPoint(100F, -23F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 147
		tailWheelModel[3].setRotationPoint(100F, -19F, -1F);

		tailWheelModel[4].addShapeBox(0F, -0.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailWheelModel[4].setRotationPoint(98.5F, -27F, -1F);
		tailWheelModel[4].rotateAngleZ = 0.20943951F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 313
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 314
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 315
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 316
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 317
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 318
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 319
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 320
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 321

		leftWingWheelModel[0].addShapeBox(0F, -6F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		leftWingWheelModel[0].setRotationPoint(-28F, -22F, -60F);
		leftWingWheelModel[0].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		leftWingWheelModel[1].setRotationPoint(-37F, 1.5F, -59F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftWingWheelModel[2].setRotationPoint(-37F, -2.5F, -59F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 316
		leftWingWheelModel[3].setRotationPoint(-37F, 6.5F, -59F);

		leftWingWheelModel[4].addShapeBox(0F, -6F, 0F, 3, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 317
		leftWingWheelModel[4].setRotationPoint(-28.5F, -22F, -61F);
		leftWingWheelModel[4].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[5].addShapeBox(0F, 12F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 318
		leftWingWheelModel[5].setRotationPoint(-28.5F, -16F, -61F);
		leftWingWheelModel[5].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[6].addShapeBox(-6F, 17F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 319
		leftWingWheelModel[6].setRotationPoint(-28.5F, -16F, -61F);
		leftWingWheelModel[6].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[7].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 320
		leftWingWheelModel[7].setRotationPoint(-28F, -9F, -60F);
		leftWingWheelModel[7].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[8].addShapeBox(-0.5F, 3F, 0F, 1, 3, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		leftWingWheelModel[8].setRotationPoint(-28F, -9F, -60F);
		leftWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 153
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 154
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 155
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 156
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 157
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 158
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 159
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 160
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 161

		rightWingWheelModel[0].addShapeBox(0F, -6F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingWheelModel[0].setRotationPoint(-28F, -22F, 59F);
		rightWingWheelModel[0].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingWheelModel[1].setRotationPoint(-37F, 1.5F, 56F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		rightWingWheelModel[2].setRotationPoint(-37F, -2.5F, 56F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightWingWheelModel[3].setRotationPoint(-37F, 6.5F, 56F);

		rightWingWheelModel[4].addShapeBox(0F, -6F, 0F, 3, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 157
		rightWingWheelModel[4].setRotationPoint(-28.5F, -22F, 60F);
		rightWingWheelModel[4].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[5].addShapeBox(0F, 12F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 158
		rightWingWheelModel[5].setRotationPoint(-28.5F, -16F, 60F);
		rightWingWheelModel[5].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[6].addShapeBox(-6F, 17F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 159
		rightWingWheelModel[6].setRotationPoint(-28.5F, -16F, 60F);
		rightWingWheelModel[6].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[7].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 160
		rightWingWheelModel[7].setRotationPoint(-28F, -9F, 59F);
		rightWingWheelModel[7].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[8].addShapeBox(-0.5F, 3F, 0F, 1, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingWheelModel[8].setRotationPoint(-28F, -9F, 59F);
		rightWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-96F, -37F, 0F);
		propellerModels[1] = makeProp2(-103F, -37F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
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
		prop[0] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 10, 154, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -3.14159265F;
		prop[1].rotateAngleY = -3.14159265F;
		prop[2].rotateAngleY = -3.14159265F;
		return prop;
	}
}