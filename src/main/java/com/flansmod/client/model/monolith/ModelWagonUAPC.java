//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WagonUAPC
// Model Creator: 
// Created on: 17.06.2022 - 15:26:23
// Last changed on: 17.06.2022 - 15:26:23

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWagonUAPC extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWagonUAPC() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[78];
		leftTrackWheelModels = new ModelRendererTurbo[129];
		rightTrackWheelModels = new ModelRendererTurbo[115];
		trailerModel = new ModelRendererTurbo[48];

		initbodyModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		inittrailerModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 196
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 197
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 198
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 199
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 200
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 201
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 223
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 224
		bodyModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 225
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 226
		bodyModel[10] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 182
		bodyModel[11] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 181
		bodyModel[12] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 182
		bodyModel[13] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 183
		bodyModel[14] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 184
		bodyModel[15] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 209
		bodyModel[16] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 210
		bodyModel[17] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 211
		bodyModel[18] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 212
		bodyModel[19] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 213
		bodyModel[20] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 214
		bodyModel[21] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 215
		bodyModel[22] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 314
		bodyModel[23] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 315
		bodyModel[24] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 316
		bodyModel[25] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 317
		bodyModel[26] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 318
		bodyModel[27] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 319
		bodyModel[28] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 320
		bodyModel[29] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 321
		bodyModel[30] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 322
		bodyModel[31] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 323
		bodyModel[32] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 324
		bodyModel[33] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 325
		bodyModel[34] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 326
		bodyModel[35] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 327
		bodyModel[36] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 328
		bodyModel[37] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 329
		bodyModel[38] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 330
		bodyModel[39] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 331
		bodyModel[40] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 332
		bodyModel[41] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 333
		bodyModel[42] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 334
		bodyModel[43] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 335
		bodyModel[44] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 336
		bodyModel[45] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 337
		bodyModel[46] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 338
		bodyModel[47] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 339
		bodyModel[48] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 340
		bodyModel[49] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 341
		bodyModel[50] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 342
		bodyModel[51] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 343
		bodyModel[52] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 344
		bodyModel[53] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 345
		bodyModel[54] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 346
		bodyModel[55] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 347
		bodyModel[56] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 348
		bodyModel[57] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 349
		bodyModel[58] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 350
		bodyModel[59] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 351
		bodyModel[60] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 352
		bodyModel[61] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 353
		bodyModel[62] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 354
		bodyModel[63] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 355
		bodyModel[64] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 356
		bodyModel[65] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 357
		bodyModel[66] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 358
		bodyModel[67] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 359
		bodyModel[68] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 360
		bodyModel[69] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 361
		bodyModel[70] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 435
		bodyModel[71] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 437
		bodyModel[72] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 438
		bodyModel[73] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 439
		bodyModel[74] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 440
		bodyModel[75] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 441
		bodyModel[76] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 442
		bodyModel[77] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 443

		bodyModel[0].addShapeBox(-2F, 10F, -14F, 3, 1, 2, 0F,0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[0].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[1].addShapeBox(-2F, 9F, -14F, 3, 1, 2, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[1].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[2].addShapeBox(-2F, 11F, -14F, 3, 1, 2, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 198
		bodyModel[2].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[3].addShapeBox(-2F, 9F, -17F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 199
		bodyModel[3].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[4].addShapeBox(-2F, 10F, -17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 200
		bodyModel[4].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[5].addShapeBox(-2F, 11F, -17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 201
		bodyModel[5].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[6].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F); // Box 223
		bodyModel[6].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[7].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 224
		bodyModel[7].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[8].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 225
		bodyModel[8].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[9].addShapeBox(-2F, 10F, -18F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 226
		bodyModel[9].setRotationPoint(-7F, -13.5F, -2F);

		bodyModel[10].addBox(-1F, -1F, -13.5F, 2, 2, 27, 0F); // Box 182
		bodyModel[10].setRotationPoint(-7.5F, -3F, -0.5F);

		bodyModel[11].addBox(-1F, -1F, -13.5F, 2, 2, 27, 0F); // Box 181
		bodyModel[11].setRotationPoint(-54.5F, -3F, -0.5F);

		bodyModel[12].addShapeBox(-2F, 9F, -14F, 3, 1, 2, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[12].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[13].addShapeBox(-2F, 10F, -14F, 3, 1, 2, 0F,0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[13].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[14].addShapeBox(-2F, 11F, -14F, 3, 1, 2, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 184
		bodyModel[14].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[15].addShapeBox(-2F, 11F, -17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 209
		bodyModel[15].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[16].addShapeBox(-2F, 10F, -17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 210
		bodyModel[16].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[17].addShapeBox(-2F, 9F, -17F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 211
		bodyModel[17].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[18].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F); // Box 212
		bodyModel[18].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[19].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 213
		bodyModel[19].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[20].addShapeBox(-1F, 10F, -18F, 1, 1, 1, 0F,0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 214
		bodyModel[20].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[21].addShapeBox(-2F, 10F, -18F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 215
		bodyModel[21].setRotationPoint(-54F, -13.5F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 3, 24, 0F); // Box 314
		bodyModel[22].setRotationPoint(-8.5F, -8F, -12F);

		bodyModel[23].addBox(0F, 0F, 0F, 50, 1, 4, 0F); // Box 315
		bodyModel[23].setRotationPoint(-56F, -5F, -2F);

		bodyModel[24].addBox(0F, 0F, 0F, 78, 3, 1, 0F); // Box 316
		bodyModel[24].setRotationPoint(-69.5F, -11F, -11.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 3, 24, 0F); // Box 317
		bodyModel[25].setRotationPoint(-55.5F, -8F, -12F);

		bodyModel[26].addBox(0F, 0F, 0F, 78, 3, 1, 0F); // Box 318
		bodyModel[26].setRotationPoint(-69.5F, -11F, 9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 319
		bodyModel[27].setRotationPoint(-68.5F, -11F, -10.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 320
		bodyModel[28].setRotationPoint(-54.5F, -11F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 321
		bodyModel[29].setRotationPoint(-38.5F, -11F, -10.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 322
		bodyModel[30].setRotationPoint(-22.5F, -11F, -10.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 323
		bodyModel[31].setRotationPoint(-8.5F, -11F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 324
		bodyModel[32].setRotationPoint(4.5F, -11F, -10.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 78, 1, 24, 0F); // Box 325
		bodyModel[33].setRotationPoint(-69.5F, -12F, -12.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 326
		bodyModel[34].setRotationPoint(-67.5F, -20F, -12.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 65, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 327
		bodyModel[35].setRotationPoint(-68.5F, -20F, -11.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 65, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 328
		bodyModel[36].setRotationPoint(-68.5F, -20F, 9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 329
		bodyModel[37].setRotationPoint(-54.5F, -20F, -12.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 330
		bodyModel[38].setRotationPoint(-30.5F, -20F, -12.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 331
		bodyModel[39].setRotationPoint(-5.5F, -26F, -12.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 332
		bodyModel[40].setRotationPoint(-42.5F, -20F, -12.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 333
		bodyModel[41].setRotationPoint(-19.5F, -20F, -12.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 334
		bodyModel[42].setRotationPoint(-67.5F, -20F, 10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		bodyModel[43].setRotationPoint(-54.5F, -20F, 10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 336
		bodyModel[44].setRotationPoint(-30.5F, -20F, 10.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[45].setRotationPoint(-5.5F, -26F, 10.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 338
		bodyModel[46].setRotationPoint(-42.5F, -20F, 10.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 339
		bodyModel[47].setRotationPoint(-19.5F, -20F, 10.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[48].setRotationPoint(-68.5F, -20F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[49].setRotationPoint(-5.5F, -20F, -10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[50].setRotationPoint(-5.5F, -25F, -11.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[51].setRotationPoint(-69.5F, -20F, -7.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[52].setRotationPoint(-69.5F, -20F, 5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 345
		bodyModel[53].setRotationPoint(-0.5F, -18F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 346
		bodyModel[54].setRotationPoint(-0.5F, -18F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[55].setRotationPoint(-3.5F, -19F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 55, 2, 2, 0F); // Box 348
		bodyModel[56].setRotationPoint(-7F, -4F, -1F);

		bodyModel[57].addBox(0F, -1F, 0F, 2, 2, 20, 0F); // Box 349
		bodyModel[57].setRotationPoint(48F, -3F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 350
		bodyModel[58].setRotationPoint(-10F, -18F, -6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 351
		bodyModel[59].setRotationPoint(-27F, -18F, -6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 352
		bodyModel[60].setRotationPoint(-41F, -18F, -6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 353
		bodyModel[61].setRotationPoint(-10F, -18F, 3.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 354
		bodyModel[62].setRotationPoint(-27F, -18F, 3.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 355
		bodyModel[63].setRotationPoint(-41F, -18F, 3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 63, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[64].setRotationPoint(-68F, -19F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 63, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[65].setRotationPoint(-68F, -19F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 358
		bodyModel[66].setRotationPoint(-53F, -18F, 3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 359
		bodyModel[67].setRotationPoint(-53F, -18F, -6.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 360
		bodyModel[68].setRotationPoint(-65F, -18F, 3.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 361
		bodyModel[69].setRotationPoint(-65F, -18F, -6.5F);

		bodyModel[70].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[70].setRotationPoint(44F, -14.5F, -12F);

		bodyModel[71].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[71].setRotationPoint(44F, -14.5F, 5F);

		bodyModel[72].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -11F, -2F, 0F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, -2F, -1F, 9F, 1F, 0F, 0F, 0F); // Box 438
		bodyModel[72].setRotationPoint(45F, -14.5F, 5F);

		bodyModel[73].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[73].setRotationPoint(49F, -4.5F, 7F);

		bodyModel[74].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -10F, 1F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 9F, 1F, -1F, 10F, -2F, 0F, 0F, 0F); // Box 440
		bodyModel[74].setRotationPoint(45F, -14.5F, -7F);

		bodyModel[75].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -11F, -2F, 0F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, -2F, -1F, 9F, 1F, 0F, 0F, 0F); // Box 441
		bodyModel[75].setRotationPoint(45F, -14.5F, -12F);

		bodyModel[76].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -10F, 1F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 9F, 1F, -1F, 10F, -2F, 0F, 0F, 0F); // Box 442
		bodyModel[76].setRotationPoint(45F, -14.5F, 10F);

		bodyModel[77].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[77].setRotationPoint(49F, -4.5F, -10F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 109
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 110
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 111
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 119
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 120
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 121
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 122
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 123
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 124
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 125
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 126
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 127
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 128
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 129
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 130
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 131
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 132
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 133
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 134
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 135
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 136
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 137
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 138
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 139
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 140
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 141
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 142
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 143
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 144
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 145
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 146
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 147
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 148
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 149
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 150
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 151
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 152
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 153
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 154
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 155
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 156
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 157
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 158
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 159
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 160
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 161
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 162
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 163
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 164
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 165
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 166
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 167
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 168
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 169
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 170
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 171
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 172
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 173
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 174
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 175
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 176
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 177
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 178
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 179
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 180
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 181
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 248
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 249
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 250
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 251
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 252
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 253
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 254
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 255
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 256
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 257
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 258
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 259
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 260
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 261
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 262
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 263
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 264
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 265
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 266
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 267
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 268
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 269
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 270
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 271
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 272
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 273
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 274
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 275
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 276
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 277
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 279
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 282
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 283
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 284
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 285
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 286
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 287
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 288
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 289
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 290
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 291
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 292
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 293
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 294
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 295
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 296
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 297
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 298
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 299
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 300
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 301
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 302
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 303
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 304
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 305
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 306
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 307
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 308
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 309
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 310
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 311
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 312
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 313

		leftTrackWheelModels[0].addShapeBox(-1.5F, -0.5F, -14F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 109
		leftTrackWheelModels[0].setRotationPoint(-7.5F, -3F, 27F);

		leftTrackWheelModels[1].addShapeBox(-1.5F, -1.5F, -14F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 110
		leftTrackWheelModels[1].setRotationPoint(-7.5F, -3F, 27F);

		leftTrackWheelModels[2].addShapeBox(-1.5F, 0.5F, -14F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 111
		leftTrackWheelModels[2].setRotationPoint(-7.5F, -3F, 27F);

		leftTrackWheelModels[3].addShapeBox(0F, -13F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 119
		leftTrackWheelModels[3].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[4].addShapeBox(-5F, -13F, -0.5F, 5, 1, 1, 0F,0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 120
		leftTrackWheelModels[4].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[5].addShapeBox(-5F, 12F, -0.5F, 5, 1, 1, 0F,0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F); // Box 121
		leftTrackWheelModels[5].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[6].addShapeBox(0F, 12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 122
		leftTrackWheelModels[6].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[7].addShapeBox(12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F); // Box 123
		leftTrackWheelModels[7].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[8].addShapeBox(12F, -5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 124
		leftTrackWheelModels[8].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[9].addShapeBox(11F, -10.5F, -0.5F, 1, 5, 1, 0F,2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 125
		leftTrackWheelModels[9].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[10].addShapeBox(5.5F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F); // Box 126
		leftTrackWheelModels[10].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[11].addShapeBox(5.5F, 11F, -0.5F, 5, 1, 1, 0F,0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 127
		leftTrackWheelModels[11].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[12].addShapeBox(11F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F); // Box 128
		leftTrackWheelModels[12].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[13].addShapeBox(-10.5F, 11F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F); // Box 129
		leftTrackWheelModels[13].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[14].addShapeBox(-12F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F); // Box 130
		leftTrackWheelModels[14].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[15].addShapeBox(-12F, -10.5F, -0.5F, 1, 5, 1, 0F,-3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 131
		leftTrackWheelModels[15].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[16].addShapeBox(-10.5F, -12F, -0.5F, 5, 1, 1, 0F,-1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F); // Box 132
		leftTrackWheelModels[16].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[17].addShapeBox(-13F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F); // Box 133
		leftTrackWheelModels[17].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[18].addShapeBox(-13F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 134
		leftTrackWheelModels[18].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[19].addShapeBox(0F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		leftTrackWheelModels[19].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[20].addShapeBox(-5F, -12F, -0.5F, 5, 1, 1, 0F,0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F); // Box 136
		leftTrackWheelModels[20].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[21].addShapeBox(5F, -11F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F); // Box 137
		leftTrackWheelModels[21].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[22].addShapeBox(10F, -10F, -0.5F, 1, 5, 1, 0F,2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F); // Box 138
		leftTrackWheelModels[22].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[23].addShapeBox(11F, -5F, -0.5F, 1, 5, 1, 0F,0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F); // Box 139
		leftTrackWheelModels[23].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[24].addShapeBox(11F, 0F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F); // Box 140
		leftTrackWheelModels[24].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[25].addShapeBox(5F, 10F, -0.5F, 5, 1, 1, 0F,0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F); // Box 141
		leftTrackWheelModels[25].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[26].addShapeBox(10F, 5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F); // Box 142
		leftTrackWheelModels[26].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[27].addShapeBox(0F, 11F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 143
		leftTrackWheelModels[27].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[28].addShapeBox(-5F, 11F, -0.5F, 5, 1, 1, 0F,-0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 144
		leftTrackWheelModels[28].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[29].addShapeBox(-10F, 10F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F); // Box 145
		leftTrackWheelModels[29].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[30].addShapeBox(-11F, 5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F); // Box 146
		leftTrackWheelModels[30].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[31].addShapeBox(-12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F); // Box 147
		leftTrackWheelModels[31].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[32].addShapeBox(-12F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 148
		leftTrackWheelModels[32].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[33].addShapeBox(-11F, -10F, -0.5F, 1, 5, 1, 0F,-2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F); // Box 149
		leftTrackWheelModels[33].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[34].addShapeBox(-10F, -11F, -0.5F, 5, 1, 1, 0F,-1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F); // Box 150
		leftTrackWheelModels[34].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[35].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 151
		leftTrackWheelModels[35].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[36].addShapeBox(-1F, -3F, -1F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 152
		leftTrackWheelModels[36].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[37].addShapeBox(-3F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackWheelModels[37].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[38].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F); // Box 154
		leftTrackWheelModels[38].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[39].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F); // Box 155
		leftTrackWheelModels[39].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[40].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,-2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackWheelModels[40].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[41].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F); // Box 157
		leftTrackWheelModels[41].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[42].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F); // Box 158
		leftTrackWheelModels[42].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[43].addShapeBox(-1F, -3F, 0F, 1, 3, 1, 0F,0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F); // Box 159
		leftTrackWheelModels[43].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[44].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F); // Box 160
		leftTrackWheelModels[44].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[45].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F,-2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftTrackWheelModels[45].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F); // Box 162
		leftTrackWheelModels[46].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F); // Box 163
		leftTrackWheelModels[47].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[48].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F); // Box 164
		leftTrackWheelModels[48].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[49].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 165
		leftTrackWheelModels[49].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[50].addShapeBox(-3F, -1F, 0F, 3, 1, 1, 0F,-0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 166
		leftTrackWheelModels[50].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[51].addShapeBox(-0.5F, -12F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 167
		leftTrackWheelModels[51].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[52].addShapeBox(-0.5F, 2F, -0.5F, 1, 10, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftTrackWheelModels[52].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[53].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 169
		leftTrackWheelModels[53].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[54].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F); // Box 170
		leftTrackWheelModels[54].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[55].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F); // Box 171
		leftTrackWheelModels[55].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[56].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F); // Box 172
		leftTrackWheelModels[56].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[57].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F); // Box 173
		leftTrackWheelModels[57].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[58].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 174
		leftTrackWheelModels[58].setRotationPoint(-7.5F, -3F, 16F);

		leftTrackWheelModels[59].addShapeBox(-1.5F, -1.5F, -17F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftTrackWheelModels[59].setRotationPoint(-7.5F, -3F, 34F);

		leftTrackWheelModels[60].addShapeBox(-1.5F, -0.5F, -17F, 3, 1, 1, 0F,0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftTrackWheelModels[60].setRotationPoint(-7.5F, -3F, 34F);

		leftTrackWheelModels[61].addShapeBox(-1.5F, 0.5F, -17F, 3, 1, 1, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 177
		leftTrackWheelModels[61].setRotationPoint(-7.5F, -3F, 34F);

		leftTrackWheelModels[62].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F); // Box 178
		leftTrackWheelModels[62].setRotationPoint(-7.5F, -3F, 36F);

		leftTrackWheelModels[63].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 179
		leftTrackWheelModels[63].setRotationPoint(-7.5F, -3F, 36F);

		leftTrackWheelModels[64].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 180
		leftTrackWheelModels[64].setRotationPoint(-7.5F, -3F, 36F);

		leftTrackWheelModels[65].addShapeBox(-1.5F, -0.5F, -18F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 181
		leftTrackWheelModels[65].setRotationPoint(-7.5F, -3F, 36F);

		leftTrackWheelModels[66].addShapeBox(-1F, -3F, 0F, 1, 3, 1, 0F,0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F); // Box 248
		leftTrackWheelModels[66].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[67].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F); // Box 249
		leftTrackWheelModels[67].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[68].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F,-2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackWheelModels[68].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F); // Box 251
		leftTrackWheelModels[69].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F); // Box 252
		leftTrackWheelModels[70].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[71].addShapeBox(-1.5F, 0.5F, -17F, 3, 1, 1, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 253
		leftTrackWheelModels[71].setRotationPoint(-54.5F, -3F, 34F);

		leftTrackWheelModels[72].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F); // Box 254
		leftTrackWheelModels[72].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[73].addShapeBox(-3F, -1F, 0F, 3, 1, 1, 0F,-0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 255
		leftTrackWheelModels[73].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[74].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 256
		leftTrackWheelModels[74].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[75].addShapeBox(-1.5F, -0.5F, -17F, 3, 1, 1, 0F,0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftTrackWheelModels[75].setRotationPoint(-54.5F, -3F, 34F);

		leftTrackWheelModels[76].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 258
		leftTrackWheelModels[76].setRotationPoint(-54.5F, -3F, 36F);

		leftTrackWheelModels[77].addShapeBox(-1.5F, -1.5F, -17F, 3, 1, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftTrackWheelModels[77].setRotationPoint(-54.5F, -3F, 34F);

		leftTrackWheelModels[78].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F); // Box 260
		leftTrackWheelModels[78].setRotationPoint(-54.5F, -3F, 36F);

		leftTrackWheelModels[79].addShapeBox(-1.5F, -0.5F, -18F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 261
		leftTrackWheelModels[79].setRotationPoint(-54.5F, -3F, 36F);

		leftTrackWheelModels[80].addShapeBox(-0.5F, -0.5F, -18F, 1, 1, 1, 0F,0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 262
		leftTrackWheelModels[80].setRotationPoint(-54.5F, -3F, 36F);

		leftTrackWheelModels[81].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 263
		leftTrackWheelModels[81].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[82].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F); // Box 264
		leftTrackWheelModels[82].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[83].addShapeBox(-0.5F, 2F, -0.5F, 1, 10, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		leftTrackWheelModels[83].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[84].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F); // Box 266
		leftTrackWheelModels[84].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[85].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 267
		leftTrackWheelModels[85].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[86].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F); // Box 268
		leftTrackWheelModels[86].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[87].addShapeBox(-0.5F, -12F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 269
		leftTrackWheelModels[87].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[88].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F); // Box 270
		leftTrackWheelModels[88].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[89].addShapeBox(0F, -13F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 271
		leftTrackWheelModels[89].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[90].addShapeBox(-5F, -12F, -0.5F, 5, 1, 1, 0F,0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F); // Box 272
		leftTrackWheelModels[90].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[91].addShapeBox(-5F, -13F, -0.5F, 5, 1, 1, 0F,0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 273
		leftTrackWheelModels[91].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[92].addShapeBox(0F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 274
		leftTrackWheelModels[92].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[93].addShapeBox(-5F, 12F, -0.5F, 5, 1, 1, 0F,0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F); // Box 275
		leftTrackWheelModels[93].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[94].addShapeBox(-5F, 11F, -0.5F, 5, 1, 1, 0F,-0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 276
		leftTrackWheelModels[94].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[95].addShapeBox(0F, 11F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 277
		leftTrackWheelModels[95].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[96].addShapeBox(10F, 5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F); // Box 279
		leftTrackWheelModels[96].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[97].addShapeBox(5F, 10F, -0.5F, 5, 1, 1, 0F,0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F); // Box 282
		leftTrackWheelModels[97].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[98].addShapeBox(11F, -5F, -0.5F, 1, 5, 1, 0F,0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F); // Box 283
		leftTrackWheelModels[98].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[99].addShapeBox(12F, -5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 284
		leftTrackWheelModels[99].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[100].addShapeBox(12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F); // Box 285
		leftTrackWheelModels[100].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[101].addShapeBox(10F, -10F, -0.5F, 1, 5, 1, 0F,2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F); // Box 286
		leftTrackWheelModels[101].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[102].addShapeBox(11F, -10.5F, -0.5F, 1, 5, 1, 0F,2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 287
		leftTrackWheelModels[102].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[103].addShapeBox(11F, 0F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F); // Box 288
		leftTrackWheelModels[103].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[104].addShapeBox(5F, -11F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F); // Box 289
		leftTrackWheelModels[104].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[105].addShapeBox(5.5F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F); // Box 290
		leftTrackWheelModels[105].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[106].addShapeBox(-10.5F, -12F, -0.5F, 5, 1, 1, 0F,-1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F); // Box 291
		leftTrackWheelModels[106].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[107].addShapeBox(-10F, -11F, -0.5F, 5, 1, 1, 0F,-1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F); // Box 292
		leftTrackWheelModels[107].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[108].addShapeBox(-12F, -10.5F, -0.5F, 1, 5, 1, 0F,-3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 293
		leftTrackWheelModels[108].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[109].addShapeBox(-11F, -10F, -0.5F, 1, 5, 1, 0F,-2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F); // Box 294
		leftTrackWheelModels[109].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[110].addShapeBox(-12F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 295
		leftTrackWheelModels[110].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[111].addShapeBox(-13F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 296
		leftTrackWheelModels[111].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[112].addShapeBox(-13F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F); // Box 297
		leftTrackWheelModels[112].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[113].addShapeBox(-12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F); // Box 298
		leftTrackWheelModels[113].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[114].addShapeBox(-12F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F); // Box 299
		leftTrackWheelModels[114].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[115].addShapeBox(-11F, 5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F); // Box 300
		leftTrackWheelModels[115].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[116].addShapeBox(-10.5F, 11F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F); // Box 301
		leftTrackWheelModels[116].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[117].addShapeBox(-10F, 10F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F); // Box 302
		leftTrackWheelModels[117].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[118].addShapeBox(-3F, -1F, -1F, 3, 1, 1, 0F,0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftTrackWheelModels[118].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[119].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F); // Box 304
		leftTrackWheelModels[119].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[120].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F); // Box 305
		leftTrackWheelModels[120].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[121].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F); // Box 306
		leftTrackWheelModels[121].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[122].addShapeBox(-1.5F, 0.5F, -14F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 307
		leftTrackWheelModels[122].setRotationPoint(-54.5F, -3F, 27F);

		leftTrackWheelModels[123].addShapeBox(-1.5F, -0.5F, -14F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 308
		leftTrackWheelModels[123].setRotationPoint(-54.5F, -3F, 27F);

		leftTrackWheelModels[124].addShapeBox(-1.5F, -1.5F, -14F, 3, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 309
		leftTrackWheelModels[124].setRotationPoint(-54.5F, -3F, 27F);

		leftTrackWheelModels[125].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 310
		leftTrackWheelModels[125].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[126].addShapeBox(-1F, -3F, -1F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 311
		leftTrackWheelModels[126].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[127].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,-2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		leftTrackWheelModels[127].setRotationPoint(-54.5F, -3F, 16F);

		leftTrackWheelModels[128].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F); // Box 313
		leftTrackWheelModels[128].setRotationPoint(-54.5F, -3F, 16F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 271
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 272
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 273
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 274
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 275
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 276
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 277
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 278
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 279
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 280
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 281
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 282
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 283
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 284
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 285
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 286
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 287
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 288
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 289
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 290
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 291
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 292
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 293
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 294
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 295
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 296
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 297
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 298
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 299
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 300
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 301
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 302
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 303
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 304
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 305
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 306
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 307
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 308
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 309
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 310
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 311
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 312
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 313
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 314
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 315
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 316
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 317
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 318
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 319
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 320
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 321
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 322
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 323
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 324
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 325
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 326
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 185
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 186
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 187
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 188
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 189
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 190
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 191
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 192
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 193
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 194
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 195
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 196
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 197
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 198
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 199
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 200
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 201
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 202
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 203
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 204
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 205
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 206
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 207
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 208
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 216
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 217
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 218
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 219
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 220
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 221
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 222
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 223
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 224
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 225
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 226
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 227
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 228
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 229
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 230
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 231
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 232
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 233
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 234
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 235
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 236
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 237
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 238
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 239
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 240
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 241
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 242
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 243
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 244
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 245
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 246
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 247
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 278
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 280
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 281

		rightTrackWheelModels[0].addShapeBox(0F, -13F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 271
		rightTrackWheelModels[0].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[1].addShapeBox(-5F, -13F, -0.5F, 5, 1, 1, 0F,0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 272
		rightTrackWheelModels[1].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[2].addShapeBox(-5F, 12F, -0.5F, 5, 1, 1, 0F,0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F); // Box 273
		rightTrackWheelModels[2].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[3].addShapeBox(0F, 12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 274
		rightTrackWheelModels[3].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[4].addShapeBox(12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F); // Box 275
		rightTrackWheelModels[4].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[5].addShapeBox(12F, -5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 276
		rightTrackWheelModels[5].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[6].addShapeBox(11F, -10.5F, -0.5F, 1, 5, 1, 0F,2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 277
		rightTrackWheelModels[6].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[7].addShapeBox(5.5F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F); // Box 278
		rightTrackWheelModels[7].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[8].addShapeBox(5.5F, 11F, -0.5F, 5, 1, 1, 0F,0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 279
		rightTrackWheelModels[8].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[9].addShapeBox(11F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F); // Box 280
		rightTrackWheelModels[9].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[10].addShapeBox(-10.5F, 11F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F); // Box 281
		rightTrackWheelModels[10].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[11].addShapeBox(-12F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F); // Box 282
		rightTrackWheelModels[11].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[12].addShapeBox(-12F, -10.5F, -0.5F, 1, 5, 1, 0F,-3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 283
		rightTrackWheelModels[12].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[13].addShapeBox(-10.5F, -12F, -0.5F, 5, 1, 1, 0F,-1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F); // Box 284
		rightTrackWheelModels[13].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[14].addShapeBox(-13F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F); // Box 285
		rightTrackWheelModels[14].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[15].addShapeBox(-13F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 286
		rightTrackWheelModels[15].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[16].addShapeBox(0F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 287
		rightTrackWheelModels[16].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[17].addShapeBox(-5F, -12F, -0.5F, 5, 1, 1, 0F,0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F); // Box 288
		rightTrackWheelModels[17].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[18].addShapeBox(5F, -11F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F); // Box 289
		rightTrackWheelModels[18].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[19].addShapeBox(10F, -10F, -0.5F, 1, 5, 1, 0F,2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F); // Box 290
		rightTrackWheelModels[19].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[20].addShapeBox(11F, -5F, -0.5F, 1, 5, 1, 0F,0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F); // Box 291
		rightTrackWheelModels[20].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[21].addShapeBox(11F, 0F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F); // Box 292
		rightTrackWheelModels[21].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[22].addShapeBox(5F, 10F, -0.5F, 5, 1, 1, 0F,0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F); // Box 293
		rightTrackWheelModels[22].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[23].addShapeBox(10F, 5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F); // Box 294
		rightTrackWheelModels[23].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[24].addShapeBox(0F, 11F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 295
		rightTrackWheelModels[24].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[25].addShapeBox(-5F, 11F, -0.5F, 5, 1, 1, 0F,-0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 296
		rightTrackWheelModels[25].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[26].addShapeBox(-10F, 10F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F); // Box 297
		rightTrackWheelModels[26].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[27].addShapeBox(-11F, 5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F); // Box 298
		rightTrackWheelModels[27].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[28].addShapeBox(-12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F); // Box 299
		rightTrackWheelModels[28].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[29].addShapeBox(-12F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 300
		rightTrackWheelModels[29].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[30].addShapeBox(-11F, -10F, -0.5F, 1, 5, 1, 0F,-2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F); // Box 301
		rightTrackWheelModels[30].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[31].addShapeBox(-10F, -11F, -0.5F, 5, 1, 1, 0F,-1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F); // Box 302
		rightTrackWheelModels[31].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[32].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F); // Box 303
		rightTrackWheelModels[32].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[33].addShapeBox(-1F, -3F, -1F, 1, 3, 1, 0F,0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F); // Box 304
		rightTrackWheelModels[33].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[34].addShapeBox(-3F, -1F, -1F, 3, 1, 1, 0F,-0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 305
		rightTrackWheelModels[34].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[35].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 306
		rightTrackWheelModels[35].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[36].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F); // Box 307
		rightTrackWheelModels[36].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[37].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,-2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackWheelModels[37].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[38].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F); // Box 309
		rightTrackWheelModels[38].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[39].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F); // Box 310
		rightTrackWheelModels[39].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[40].addShapeBox(-1F, -3F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 311
		rightTrackWheelModels[40].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[41].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 312
		rightTrackWheelModels[41].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[42].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F,-2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightTrackWheelModels[42].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F); // Box 314
		rightTrackWheelModels[43].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F); // Box 315
		rightTrackWheelModels[44].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[45].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F); // Box 316
		rightTrackWheelModels[45].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[46].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F); // Box 317
		rightTrackWheelModels[46].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[47].addShapeBox(-3F, -1F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		rightTrackWheelModels[47].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[48].addShapeBox(-0.5F, -12F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 319
		rightTrackWheelModels[48].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[49].addShapeBox(-0.5F, 2F, -0.5F, 1, 10, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightTrackWheelModels[49].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[50].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 321
		rightTrackWheelModels[50].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[51].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F); // Box 322
		rightTrackWheelModels[51].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[52].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F); // Box 323
		rightTrackWheelModels[52].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[53].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F); // Box 324
		rightTrackWheelModels[53].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[54].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F); // Box 325
		rightTrackWheelModels[54].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[55].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 326
		rightTrackWheelModels[55].setRotationPoint(-7.5F, -3F, -17F);

		rightTrackWheelModels[56].addShapeBox(-3F, -1F, 0F, 3, 1, 1, 0F,0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackWheelModels[56].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[57].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F); // Box 186
		rightTrackWheelModels[57].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[58].addShapeBox(-1F, -3F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F); // Box 187
		rightTrackWheelModels[58].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[59].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackWheelModels[59].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[60].addShapeBox(0F, -1F, 0F, 3, 1, 1, 0F,-2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightTrackWheelModels[60].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F); // Box 190
		rightTrackWheelModels[61].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1.25F, -2.25F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F); // Box 191
		rightTrackWheelModels[62].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[63].addShapeBox(-1F, 0F, 0F, 1, 3, 1, 0F,1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F); // Box 192
		rightTrackWheelModels[63].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[64].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F); // Box 193
		rightTrackWheelModels[64].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[65].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 194
		rightTrackWheelModels[65].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[66].addShapeBox(2F, -0.5F, -0.5F, 10, 1, 1, 0F,1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F); // Box 195
		rightTrackWheelModels[66].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[67].addShapeBox(-0.5F, -12F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 196
		rightTrackWheelModels[67].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[68].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F, -3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F); // Box 197
		rightTrackWheelModels[68].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[69].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 198
		rightTrackWheelModels[69].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[70].addShapeBox(-12F, -0.5F, -0.5F, 10, 1, 1, 0F,-3.2F, -8.7F, 0F, 0.1F, -1.4F, 0.2F, 0.1F, -1.4F, 0.2F, -3.2F, -8.7F, 0F, -3.8F, 8.3F, 0F, 1.1F, 1.4F, 0.2F, 1.1F, 1.4F, 0.2F, -3.8F, 8.3F, 0F); // Box 199
		rightTrackWheelModels[70].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[71].addShapeBox(-0.5F, 2F, -0.5F, 1, 10, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightTrackWheelModels[71].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[72].addShapeBox(-3F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F); // Box 201
		rightTrackWheelModels[72].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[73].addShapeBox(-3F, -1F, -1F, 3, 1, 1, 0F,-0.25F, 0.125F, 0F, -2F, 1F, 0F, -2.25F, 1.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 202
		rightTrackWheelModels[73].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[74].addShapeBox(-1F, -3F, -1F, 1, 3, 1, 0F,0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F); // Box 203
		rightTrackWheelModels[74].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[75].addShapeBox(0F, -3F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F); // Box 204
		rightTrackWheelModels[75].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[76].addShapeBox(0F, -1F, -1F, 3, 1, 1, 0F,-2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightTrackWheelModels[76].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[77].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -0.25F, 0.125F, 0F, 0F, 0.25F, 0F, -2.25F, 1.25F, 0F); // Box 206
		rightTrackWheelModels[77].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[78].addShapeBox(0F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, -2F, 0F, 1.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F); // Box 207
		rightTrackWheelModels[78].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[79].addShapeBox(-1F, 0F, -1F, 1, 3, 1, 0F,1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -2.25F, 0F, 0.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F); // Box 208
		rightTrackWheelModels[79].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[80].addShapeBox(-12F, -10.5F, -0.5F, 1, 5, 1, 0F,-3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F); // Box 216
		rightTrackWheelModels[80].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[81].addShapeBox(-11F, -10F, -0.5F, 1, 5, 1, 0F,-2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F); // Box 217
		rightTrackWheelModels[81].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[82].addShapeBox(-10.5F, -12F, -0.5F, 5, 1, 1, 0F,-1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F); // Box 218
		rightTrackWheelModels[82].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[83].addShapeBox(-10F, -11F, -0.5F, 5, 1, 1, 0F,-1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F); // Box 219
		rightTrackWheelModels[83].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[84].addShapeBox(-5F, -13F, -0.5F, 5, 1, 1, 0F,0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F); // Box 220
		rightTrackWheelModels[84].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[85].addShapeBox(-5F, -12F, -0.5F, 5, 1, 1, 0F,0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F); // Box 221
		rightTrackWheelModels[85].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[86].addShapeBox(0F, -13F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 222
		rightTrackWheelModels[86].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[87].addShapeBox(0F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		rightTrackWheelModels[87].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[88].addShapeBox(5.5F, -12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F); // Box 224
		rightTrackWheelModels[88].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[89].addShapeBox(5F, -11F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F); // Box 225
		rightTrackWheelModels[89].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[90].addShapeBox(11F, -10.5F, -0.5F, 1, 5, 1, 0F,2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F); // Box 226
		rightTrackWheelModels[90].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[91].addShapeBox(10F, -10F, -0.5F, 1, 5, 1, 0F,2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F); // Box 227
		rightTrackWheelModels[91].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[92].addShapeBox(12F, -5F, -0.5F, 1, 5, 1, 0F,1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 228
		rightTrackWheelModels[92].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[93].addShapeBox(11F, -5F, -0.5F, 1, 5, 1, 0F,0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F); // Box 229
		rightTrackWheelModels[93].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[94].addShapeBox(12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F); // Box 230
		rightTrackWheelModels[94].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[95].addShapeBox(11F, 0F, -0.5F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F); // Box 231
		rightTrackWheelModels[95].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[96].addShapeBox(11F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F); // Box 232
		rightTrackWheelModels[96].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[97].addShapeBox(10F, 5F, -0.5F, 1, 5, 1, 0F,-0.5F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F); // Box 233
		rightTrackWheelModels[97].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[98].addShapeBox(5.5F, 11F, -0.5F, 5, 1, 1, 0F,0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 234
		rightTrackWheelModels[98].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[99].addShapeBox(5F, 10F, -0.5F, 5, 1, 1, 0F,0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F); // Box 235
		rightTrackWheelModels[99].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[100].addShapeBox(0F, 12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 236
		rightTrackWheelModels[100].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[101].addShapeBox(0F, 11F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 237
		rightTrackWheelModels[101].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[102].addShapeBox(-5F, 11F, -0.5F, 5, 1, 1, 0F,-0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 238
		rightTrackWheelModels[102].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[103].addShapeBox(-5F, 12F, -0.5F, 5, 1, 1, 0F,0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F); // Box 239
		rightTrackWheelModels[103].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[104].addShapeBox(-10.5F, 11F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F); // Box 240
		rightTrackWheelModels[104].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[105].addShapeBox(-10F, 10F, -0.5F, 5, 1, 1, 0F,-2.25F, 2.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -2.25F, 2.25F, 0F, -1.75F, -2.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1.75F, -2.75F, 0.25F); // Box 241
		rightTrackWheelModels[105].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[106].addShapeBox(-11F, 5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.25F, -2.75F, -1.75F, 0.25F, 2.25F, -2.25F, 0F, 2.25F, -2.25F, 0F, -2.75F, -1.75F, 0.25F); // Box 242
		rightTrackWheelModels[106].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[107].addShapeBox(-12F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F); // Box 243
		rightTrackWheelModels[107].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[108].addShapeBox(-12F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F); // Box 244
		rightTrackWheelModels[108].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[109].addShapeBox(-13F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F); // Box 245
		rightTrackWheelModels[109].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[110].addShapeBox(-13F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0.5F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, -1F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 246
		rightTrackWheelModels[110].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[111].addShapeBox(-12F, -5F, -0.5F, 1, 5, 1, 0F,-1F, 0F, 0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F); // Box 247
		rightTrackWheelModels[111].setRotationPoint(-54.5F, -3F, -17F);

		rightTrackWheelModels[112].addShapeBox(0F, 12F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 278
		rightTrackWheelModels[112].setRotationPoint(-54.5F, -3F, 16F);

		rightTrackWheelModels[113].addShapeBox(11F, 5.5F, -0.5F, 1, 5, 1, 0F,0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 2.75F, -2.25F, 0.25F, -3F, -1.5F, 0.25F, -3F, -1.5F, 0.25F, 2.75F, -2.25F, 0.25F); // Box 280
		rightTrackWheelModels[113].setRotationPoint(-54.5F, -3F, 16F);

		rightTrackWheelModels[114].addShapeBox(5.5F, 11F, -0.5F, 5, 1, 1, 0F,0.5F, 0F, 0.25F, -2.25F, 2.75F, 0.25F, -2.25F, 2.75F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, -3F, 0.25F, -1.5F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 281
		rightTrackWheelModels[114].setRotationPoint(-54.5F, -3F, 16F);
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		trailerModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		trailerModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		trailerModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		trailerModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		trailerModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		trailerModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		trailerModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		trailerModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 8
		trailerModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		trailerModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		trailerModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 11
		trailerModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
		trailerModel[13] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 79
		trailerModel[14] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 80
		trailerModel[15] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 81
		trailerModel[16] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 82
		trailerModel[17] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 83
		trailerModel[18] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 84
		trailerModel[19] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 85
		trailerModel[20] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 87
		trailerModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 88
		trailerModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 89
		trailerModel[23] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 90
		trailerModel[24] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 91
		trailerModel[25] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 92
		trailerModel[26] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 93
		trailerModel[27] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 94
		trailerModel[28] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 95
		trailerModel[29] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 96
		trailerModel[30] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 97
		trailerModel[31] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 98
		trailerModel[32] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 99
		trailerModel[33] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 100
		trailerModel[34] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 101
		trailerModel[35] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 102
		trailerModel[36] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 103
		trailerModel[37] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 104
		trailerModel[38] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 105
		trailerModel[39] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 106
		trailerModel[40] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 107
		trailerModel[41] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 108
		trailerModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 364
		trailerModel[43] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 365
		trailerModel[44] = new ModelRendererTurbo(this, 99, 1, textureX, textureY); // Box 366
		trailerModel[45] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 367
		trailerModel[46] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 368
		trailerModel[47] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 369

		trailerModel[0].addBox(0F, 0F, 0F, 22, 10, 10, 0F); // Box 0
		trailerModel[0].setRotationPoint(15F, -13F, -14F);

		trailerModel[1].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 1
		trailerModel[1].setRotationPoint(15.75F, 7F, -14.25F);

		trailerModel[2].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 2
		trailerModel[2].setRotationPoint(17.75F, 2F, -12.25F);

		trailerModel[3].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 3
		trailerModel[3].setRotationPoint(15.75F, -8F, -14.25F);

		trailerModel[4].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 4
		trailerModel[4].setRotationPoint(15.75F, 7F, -7.75F);

		trailerModel[5].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 5
		trailerModel[5].setRotationPoint(17.75F, 2F, -5.75F);

		trailerModel[6].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 6
		trailerModel[6].setRotationPoint(15.75F, -8F, -7.75F);

		trailerModel[7].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 7
		trailerModel[7].setRotationPoint(35.25F, 2F, -5.75F);

		trailerModel[8].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 8
		trailerModel[8].setRotationPoint(33.25F, -8F, -14.25F);

		trailerModel[9].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 9
		trailerModel[9].setRotationPoint(35.25F, 2F, -12.25F);

		trailerModel[10].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 10
		trailerModel[10].setRotationPoint(33.25F, 7F, -14.25F);

		trailerModel[11].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 11
		trailerModel[11].setRotationPoint(33.25F, -8F, -7.75F);

		trailerModel[12].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 12
		trailerModel[12].setRotationPoint(33.25F, 7F, -7.75F);

		trailerModel[13].addBox(0F, -3F, -2F, 13, 8, 4, 0F); // Box 79
		trailerModel[13].setRotationPoint(32.5F, -10F, -9F);
		trailerModel[13].rotateAngleX = -0.01745329F;
		trailerModel[13].rotateAngleZ = 0.95993109F;

		trailerModel[14].addBox(8.5F, -3F, -2.5F, 5, 8, 5, 0F); // Box 80
		trailerModel[14].setRotationPoint(32.5F, -10F, -9F);
		trailerModel[14].rotateAngleX = -0.01745329F;
		trailerModel[14].rotateAngleZ = 0.95993109F;

		trailerModel[15].addBox(9.5F, 5F, -2F, 3, 5, 4, 0F); // Box 81
		trailerModel[15].setRotationPoint(32.5F, -11F, -9F);
		trailerModel[15].rotateAngleX = -0.01745329F;
		trailerModel[15].rotateAngleZ = 0.95993109F;

		trailerModel[16].addBox(7.5F, 4.5F, -2F, 2, 5, 4, 0F); // Box 82
		trailerModel[16].setRotationPoint(32.5F, -11F, -9F);
		trailerModel[16].rotateAngleX = -0.01745329F;
		trailerModel[16].rotateAngleZ = 0.95993109F;

		trailerModel[17].addBox(-0.5F, -6F, -1F, 15, 3, 2, 0F); // Box 83
		trailerModel[17].setRotationPoint(32.5F, -10F, -9F);
		trailerModel[17].rotateAngleX = -0.01745329F;
		trailerModel[17].rotateAngleZ = 0.95993109F;

		trailerModel[18].addBox(13.5F, -3F, -2.5F, 2, 1, 2, 0F); // Box 84
		trailerModel[18].setRotationPoint(32.5F, -10F, -9F);
		trailerModel[18].rotateAngleX = -0.01745329F;
		trailerModel[18].rotateAngleZ = 0.95993109F;

		trailerModel[19].addBox(13.5F, -3F, 0.5F, 2, 1, 2, 0F); // Box 85
		trailerModel[19].setRotationPoint(32.5F, -10F, -9F);
		trailerModel[19].rotateAngleX = -0.01745329F;
		trailerModel[19].rotateAngleZ = 0.95993109F;

		trailerModel[20].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 87
		trailerModel[20].setRotationPoint(13F, -13F, -10F);

		trailerModel[21].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 88
		trailerModel[21].setRotationPoint(33.25F, -8F, 9.25F);

		trailerModel[22].addBox(0F, 0F, 0F, 22, 10, 10, 0F); // Box 89
		trailerModel[22].setRotationPoint(15F, -13F, 3F);

		trailerModel[23].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 90
		trailerModel[23].setRotationPoint(33.25F, -8F, 2.75F);

		trailerModel[24].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 91
		trailerModel[24].setRotationPoint(35.25F, 2F, 11.25F);

		trailerModel[25].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 92
		trailerModel[25].setRotationPoint(33.25F, 7F, 9.25F);

		trailerModel[26].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 93
		trailerModel[26].setRotationPoint(35.25F, 2F, 4.75F);

		trailerModel[27].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 94
		trailerModel[27].setRotationPoint(33.25F, 7F, 2.75F);

		trailerModel[28].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 95
		trailerModel[28].setRotationPoint(15.75F, 7F, 9.25F);

		trailerModel[29].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 96
		trailerModel[29].setRotationPoint(15.75F, -8F, 2.75F);

		trailerModel[30].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 97
		trailerModel[30].setRotationPoint(17.75F, 2F, 4.75F);

		trailerModel[31].addBox(0F, 0F, 0F, 4, 3, 4, 0F); // Box 98
		trailerModel[31].setRotationPoint(15.75F, 7F, 2.75F);

		trailerModel[32].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 99
		trailerModel[32].setRotationPoint(13F, -13F, 7F);

		trailerModel[33].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Box 100
		trailerModel[33].setRotationPoint(15.75F, -8F, 9.25F);

		trailerModel[34].addBox(-1.5F, 0F, -1.5F, 3, 5, 3, 0F); // Box 101
		trailerModel[34].setRotationPoint(17.75F, 2F, 11.25F);

		trailerModel[35].addBox(0F, -3F, -2F, 13, 8, 4, 0F); // Box 102
		trailerModel[35].setRotationPoint(32.5F, -10F, 8F);
		trailerModel[35].rotateAngleX = -0.01745329F;
		trailerModel[35].rotateAngleZ = 0.95993109F;

		trailerModel[36].addBox(-0.5F, -6F, -1F, 15, 3, 2, 0F); // Box 103
		trailerModel[36].setRotationPoint(32.5F, -10F, 8F);
		trailerModel[36].rotateAngleX = -0.01745329F;
		trailerModel[36].rotateAngleZ = 0.95993109F;

		trailerModel[37].addBox(8.5F, -3F, -2.5F, 5, 8, 5, 0F); // Box 104
		trailerModel[37].setRotationPoint(32.5F, -10F, 8F);
		trailerModel[37].rotateAngleX = -0.01745329F;
		trailerModel[37].rotateAngleZ = 0.95993109F;

		trailerModel[38].addBox(9.5F, 5F, -2F, 3, 5, 4, 0F); // Box 105
		trailerModel[38].setRotationPoint(32.5F, -11F, 8F);
		trailerModel[38].rotateAngleX = -0.01745329F;
		trailerModel[38].rotateAngleZ = 0.95993109F;

		trailerModel[39].addBox(7.5F, 4.5F, -2F, 2, 5, 4, 0F); // Box 106
		trailerModel[39].setRotationPoint(32.5F, -11F, 8F);
		trailerModel[39].rotateAngleX = -0.01745329F;
		trailerModel[39].rotateAngleZ = 0.95993109F;

		trailerModel[40].addBox(13.5F, -3F, 0.5F, 2, 1, 2, 0F); // Box 107
		trailerModel[40].setRotationPoint(32.5F, -10F, 8F);
		trailerModel[40].rotateAngleX = -0.01745329F;
		trailerModel[40].rotateAngleZ = 0.95993109F;

		trailerModel[41].addBox(13.5F, -3F, -2.5F, 2, 1, 2, 0F); // Box 108
		trailerModel[41].setRotationPoint(32.5F, -10F, 8F);
		trailerModel[41].rotateAngleX = -0.01745329F;
		trailerModel[41].rotateAngleZ = 0.95993109F;

		trailerModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F); // Box 364
		trailerModel[42].setRotationPoint(17.75F, -4F, -11F);

		trailerModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, -1F); // Box 365
		trailerModel[43].setRotationPoint(16.75F, -1F, -11F);

		trailerModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.2F, 1.5F, 0F, -0.2F, 1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0.5F, -0.2F, 1F, 0.5F, -0.2F, 0F, 0F, -0.2F); // Box 366
		trailerModel[44].setRotationPoint(19.75F, -4F, -10F);

		trailerModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F); // Box 367
		trailerModel[45].setRotationPoint(17.75F, -4F, 6F);

		trailerModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, -1F); // Box 368
		trailerModel[46].setRotationPoint(16.75F, -1F, 6F);

		trailerModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F); // Box 369
		trailerModel[47].setRotationPoint(19.75F, -4F, 7F);
	}
}