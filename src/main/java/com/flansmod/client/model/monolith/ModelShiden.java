//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Shiden
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShiden extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelShiden() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[77];
		noseModel = new ModelRendererTurbo[46];
		tailModel = new ModelRendererTurbo[11];
		leftWingModel = new ModelRendererTurbo[12];
		rightWingModel = new ModelRendererTurbo[12];
		yawFlapModel = new ModelRendererTurbo[3];
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
		bodyModel[0] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 211
		bodyModel[1] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 212
		bodyModel[2] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 213
		bodyModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 214
		bodyModel[4] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 215
		bodyModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 216
		bodyModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 217
		bodyModel[7] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 218
		bodyModel[8] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 219
		bodyModel[9] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 220
		bodyModel[10] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 221
		bodyModel[11] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 222
		bodyModel[12] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 223
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 224
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 225
		bodyModel[15] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 226
		bodyModel[16] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 227
		bodyModel[17] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 228
		bodyModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 229
		bodyModel[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 230
		bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 231
		bodyModel[21] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 248
		bodyModel[22] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 249
		bodyModel[23] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 250
		bodyModel[24] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 251
		bodyModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 261
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 262
		bodyModel[27] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 263
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 264
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 265
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 266
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 267
		bodyModel[32] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 268
		bodyModel[33] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 269
		bodyModel[34] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 270
		bodyModel[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 271
		bodyModel[36] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 272
		bodyModel[37] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 273
		bodyModel[38] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 274
		bodyModel[39] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 275
		bodyModel[40] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 276
		bodyModel[41] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 277
		bodyModel[42] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 278
		bodyModel[43] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 279
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 280
		bodyModel[45] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 281
		bodyModel[46] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 282
		bodyModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 283
		bodyModel[48] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 284
		bodyModel[49] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 285
		bodyModel[50] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 286
		bodyModel[51] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 287
		bodyModel[52] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 288
		bodyModel[53] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 289
		bodyModel[54] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 290
		bodyModel[55] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 291
		bodyModel[56] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 292
		bodyModel[57] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 293
		bodyModel[58] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 294
		bodyModel[59] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 221
		bodyModel[60] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 222
		bodyModel[61] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 223
		bodyModel[62] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 224
		bodyModel[63] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 225
		bodyModel[64] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 226
		bodyModel[65] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 227
		bodyModel[66] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 228
		bodyModel[67] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 229
		bodyModel[68] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 89
		bodyModel[69] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 90
		bodyModel[70] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 91
		bodyModel[71] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 342
		bodyModel[72] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 343
		bodyModel[73] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 344
		bodyModel[74] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 345
		bodyModel[75] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 346
		bodyModel[76] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 363

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 13, 25, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 211
		bodyModel[0].setRotationPoint(-52.5F, -31F, -12.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 7, 25, 0F,0F, 1F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 212
		bodyModel[1].setRotationPoint(-52.5F, -38F, -12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 8, 25, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F); // Box 213
		bodyModel[2].setRotationPoint(-52.5F, -18F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0F, -8.5F); // Box 214
		bodyModel[3].setRotationPoint(-53.5F, -18F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 215
		bodyModel[4].setRotationPoint(-53.5F, -31F, -12.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 25, 0F,0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, -0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 216
		bodyModel[5].setRotationPoint(-53.5F, -38F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 41, 9, 25, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 217
		bodyModel[6].setRotationPoint(-36.5F, -18F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 9, 25, 0F,0F, 0F, 1F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, -3.5F, -9F, 0F, -3.5F, -9F, 0F, 0F, -8F); // Box 218
		bodyModel[7].setRotationPoint(4.5F, -18F, -12.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 48, 12, 25, 0F,0F, 0F, 1F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 1F); // Box 219
		bodyModel[8].setRotationPoint(4.5F, -30F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 48, 7, 25, 0F,0F, 0.5F, -8F, 0F, -4F, -9.5F, 0F, -4F, -9.5F, 0F, 0.5F, -8F, 0F, 0F, 1F, 0F, 3F, -3.5F, 0F, 3F, -3.5F, 0F, 0F, 1F); // Box 220
		bodyModel[9].setRotationPoint(4.5F, -37F, -12.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 41, 13, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[10].setRotationPoint(-36.5F, -31F, -13.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 41, 13, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[11].setRotationPoint(-36.5F, -31F, 12.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, -1F, -6F, 0F, -1F, -6.5F, 0F, -1F, 6.5F, 0F, -1F, 6F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F); // Box 223
		bodyModel[12].setRotationPoint(-23F, -38F, -13.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0.5F, -8.5F, 0F, -1F, -6F, 0F, -1F, 6F, 0.5F, 0.6F, 8.7F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F); // Box 224
		bodyModel[13].setRotationPoint(-32F, -38F, -13.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 1F, -9F, 0.5F, 0.5F, -8.5F, -1.5F, 1F, 12.5F, 0F, 1F, 12.5F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[14].setRotationPoint(-36.5F, -38F, -13.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 7, 1, 0F,0F, -1F, 6F, 0F, -1F, 6.5F, 0F, -1F, -6.5F, 0F, -1F, -6F, 0F, 0.3F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.3F, 0F); // Box 226
		bodyModel[15].setRotationPoint(-23F, -38F, 12.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0.5F, 0.6F, 8.7F, 0F, -1F, 6F, 0F, -1F, -6F, 0F, 0.5F, -8.5F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F); // Box 227
		bodyModel[16].setRotationPoint(-32F, -38F, 12.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 1F, 12.5F, -1.5F, 1F, 12.5F, 0.5F, 0.5F, -8.5F, 0F, 1F, -9F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[17].setRotationPoint(-36.5F, -38F, 12.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -1F, -6.5F, 0.5F, -0.5F, -9F, 0.5F, -0.5F, 9F, 0F, -1F, 6.5F, 0F, 0.9F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.9F, 0F); // Box 229
		bodyModel[18].setRotationPoint(-2F, -38F, -13.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -1F, 6.5F, 0.5F, -0.5F, 9F, 0.5F, -0.5F, -9F, 0F, -1F, -6.5F, 0F, 0.9F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.9F, 0F); // Box 230
		bodyModel[19].setRotationPoint(-2F, -38F, 12.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 231
		bodyModel[20].setRotationPoint(9F, -54F, -0.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 1.5F, 1F, 1.5F, 0.5F); // Box 248
		bodyModel[21].setRotationPoint(-52.5F, -24F, -19.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 31, 5, 7, 0F,0F, 1F, 0F, 0F, -1F, 0F, 1F, 2F, -1F, 0F, 3F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 3F, 2F, 0F, 3F, 1.5F); // Box 249
		bodyModel[22].setRotationPoint(-43.5F, -24F, -19.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 5, 7, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, -1F, 2F, -1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0.5F, -1F, 3F, 2F); // Box 250
		bodyModel[23].setRotationPoint(-12.5F, -24F, -19.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 5, 7, 0F,0F, -3F, 0F, 0F, -4.5F, -7F, 7F, -4.5F, 2F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 0.5F, -7F, 7F, 0.5F, 2F, 0F, 2F, 0.5F); // Box 251
		bodyModel[24].setRotationPoint(-1.5F, -24F, -19.5F);

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[25].setRotationPoint(-29F, -44F, 2F);
		bodyModel[25].rotateAngleX = 0.17453293F;
		bodyModel[25].rotateAngleZ = -0.59341195F;

		bodyModel[26].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[26].setRotationPoint(-29F, -44F, -2F);
		bodyModel[26].rotateAngleX = -0.17453293F;
		bodyModel[26].rotateAngleZ = -0.59341195F;

		bodyModel[27].addShapeBox(0F, -0.2F, -1F, 1, 1, 2, 0F,0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[27].setRotationPoint(-29F, -44F, 1.5F);
		bodyModel[27].rotateAngleZ = -0.59341195F;

		bodyModel[28].addShapeBox(0F, -0.2F, -2F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 264
		bodyModel[28].setRotationPoint(-29F, -44F, -0.5F);
		bodyModel[28].rotateAngleZ = -0.59341195F;

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[29].setRotationPoint(-23F, -44.2F, 3.4F);
		bodyModel[29].rotateAngleX = 0.40142573F;

		bodyModel[30].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[30].setRotationPoint(-23F, -44F, 3.5F);
		bodyModel[30].rotateAngleX = 0.71558499F;

		bodyModel[31].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[31].setRotationPoint(-23F, -44F, -3.5F);
		bodyModel[31].rotateAngleX = -0.71558499F;

		bodyModel[32].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[32].setRotationPoint(-23F, -44.2F, -3.4F);
		bodyModel[32].rotateAngleX = -0.40142573F;

		bodyModel[33].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 269
		bodyModel[33].setRotationPoint(-23F, -46.6F, -1.5F);

		bodyModel[34].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[34].setRotationPoint(-16.5F, -44.2F, -3.4F);
		bodyModel[34].rotateAngleX = -0.40142573F;

		bodyModel[35].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[35].setRotationPoint(-16.5F, -44F, -3.5F);
		bodyModel[35].rotateAngleX = -0.71558499F;

		bodyModel[36].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 272
		bodyModel[36].setRotationPoint(-16.5F, -46.6F, -1.5F);

		bodyModel[37].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[37].setRotationPoint(-16.5F, -44F, 3.5F);
		bodyModel[37].rotateAngleX = 0.71558499F;

		bodyModel[38].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[38].setRotationPoint(-16.5F, -44.2F, 3.4F);
		bodyModel[38].rotateAngleX = 0.40142573F;

		bodyModel[39].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[39].setRotationPoint(-9.5F, -43.2F, 3.4F);
		bodyModel[39].rotateAngleX = 0.40142573F;

		bodyModel[40].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[40].setRotationPoint(-9.5F, -43.2F, -3.4F);
		bodyModel[40].rotateAngleX = -0.40142573F;

		bodyModel[41].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[41].setRotationPoint(-9.5F, -43F, -3.5F);
		bodyModel[41].rotateAngleX = -1.01229097F;

		bodyModel[42].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 278
		bodyModel[42].setRotationPoint(-9.5F, -45F, -1.5F);

		bodyModel[43].addShapeBox(-0.5F, -3F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[43].setRotationPoint(-9.5F, -43F, 3.5F);
		bodyModel[43].rotateAngleX = 1.01229097F;

		bodyModel[44].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[44].setRotationPoint(-16.5F, -44.2F, 3.4F);
		bodyModel[44].rotateAngleY = -0.01745329F;
		bodyModel[44].rotateAngleZ = -0.15707963F;

		bodyModel[45].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[45].setRotationPoint(-23F, -44.2F, 3.4F);
		bodyModel[45].rotateAngleY = -0.01745329F;

		bodyModel[46].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[46].setRotationPoint(-23F, -44.2F, -3.4F);
		bodyModel[46].rotateAngleY = 0.01745329F;

		bodyModel[47].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[47].setRotationPoint(-16.5F, -44.2F, -3.4F);
		bodyModel[47].rotateAngleY = 0.01745329F;
		bodyModel[47].rotateAngleZ = -0.15707963F;

		bodyModel[48].addShapeBox(-0.5F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 284
		bodyModel[48].setRotationPoint(-23F, -46.6F, 0F);

		bodyModel[49].addShapeBox(-0.5F, 0F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 285
		bodyModel[49].setRotationPoint(-16.3F, -46.5F, 0F);
		bodyModel[49].rotateAngleZ = -0.20943951F;

		bodyModel[50].addShapeBox(-0.5F, -0.5F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[50].setRotationPoint(-23F, -37.2F, 6.5F);

		bodyModel[51].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[51].setRotationPoint(-9F, -37.2F, 6.5F);

		bodyModel[52].addShapeBox(0F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[52].setRotationPoint(-1.5F, -37.2F, 6.5F);
		bodyModel[52].rotateAngleY = -0.4712389F;

		bodyModel[53].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[53].setRotationPoint(-9F, -37.2F, -6.5F);

		bodyModel[54].addShapeBox(-0.5F, -0.5F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[54].setRotationPoint(-23F, -37.2F, -6.5F);

		bodyModel[55].addShapeBox(0F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[55].setRotationPoint(-1.5F, -37.2F, -6.5F);
		bodyModel[55].rotateAngleY = 0.4712389F;

		bodyModel[56].addShapeBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[56].setRotationPoint(4.5F, -37.2F, 3.5F);
		bodyModel[56].rotateAngleY = 0.45378561F;

		bodyModel[57].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[57].setRotationPoint(4.5F, -37.2F, -3.5F);
		bodyModel[57].rotateAngleY = -0.45378561F;

		bodyModel[58].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[58].setRotationPoint(5.5F, -37.2F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 6, 22, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[59].setRotationPoint(-39.8F, -35.5F, -11F);
		bodyModel[59].rotateAngleZ = 0.27925268F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[60].setRotationPoint(-27F, -38.7F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[61].setRotationPoint(-30.5F, -38.5F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[62].setRotationPoint(-28F, -41.55F, -1F);

		bodyModel[63].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[63].setRotationPoint(-31F, -37.5F, -9.5F);
		bodyModel[63].rotateAngleZ = 0.27925268F;

		bodyModel[64].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[64].setRotationPoint(-31F, -37.5F, -10.5F);
		bodyModel[64].rotateAngleZ = 0.27925268F;

		bodyModel[65].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[65].setRotationPoint(-31F, -37.5F, -9F);
		bodyModel[65].rotateAngleZ = 0.27925268F;

		bodyModel[66].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[66].setRotationPoint(-31F, -37.5F, -11F);
		bodyModel[66].rotateAngleZ = 0.27925268F;

		bodyModel[67].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[67].setRotationPoint(-31F, -37.5F, -10F);
		bodyModel[67].rotateAngleZ = 0.27925268F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[68].setRotationPoint(-10.5F, -43F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[69].setRotationPoint(-10.5F, -39F, -2F);
		bodyModel[69].rotateAngleZ = -0.12217305F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 9, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[70].setRotationPoint(-20.5F, -27F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[71].setRotationPoint(-52.5F, -12F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,1F, 0F, 0F, 0F, 3F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 1.5F, 0.5F, 0F, 3F, 1.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[72].setRotationPoint(-52.5F, -24F, 12.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 31, 5, 7, 0F,0F, 3F, 0.5F, 1F, 2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F, 1.5F, 1F, 3F, 2F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 344
		bodyModel[73].setRotationPoint(-43.5F, -24F, 12.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 5, 7, 0F,-1F, 2F, -1F, 0F, 0F, 0.5F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 3F, 2F, 0F, 2F, 0.5F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 345
		bodyModel[74].setRotationPoint(-12.5F, -24F, 12.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 22, 5, 7, 0F,0F, 0F, 0.5F, 7F, -4.5F, 2F, 0F, -4.5F, -7F, 0F, -3F, 0F, 0F, 2F, 0.5F, 7F, 0.5F, 2F, 0F, 0.5F, -7F, 0F, 1F, 0F); // Box 346
		bodyModel[75].setRotationPoint(-1.5F, -24F, 12.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[76].setRotationPoint(-52.5F, -12F, 7F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		noseModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 181
		noseModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 182
		noseModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 183
		noseModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 184
		noseModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 185
		noseModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 186
		noseModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 187
		noseModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 188
		noseModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 189
		noseModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 190
		noseModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 191
		noseModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 192
		noseModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 193
		noseModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 194
		noseModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 198
		noseModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 199
		noseModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 200
		noseModel[18] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 201
		noseModel[19] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 202
		noseModel[20] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 203
		noseModel[21] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 204
		noseModel[22] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 205
		noseModel[23] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 206
		noseModel[24] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 207
		noseModel[25] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 208
		noseModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 209
		noseModel[27] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 210
		noseModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 246
		noseModel[29] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 247
		noseModel[30] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 165
		noseModel[31] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 166
		noseModel[32] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 167
		noseModel[33] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 168
		noseModel[34] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 164
		noseModel[35] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 341
		noseModel[36] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 358
		noseModel[37] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 359
		noseModel[38] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 360
		noseModel[39] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 361
		noseModel[40] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 362
		noseModel[41] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 367
		noseModel[42] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 368
		noseModel[43] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 369
		noseModel[44] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 370
		noseModel[45] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 371

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 180
		noseModel[0].setRotationPoint(-64.5F, -31F, -12.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 7, 25, 0F,0F, 0F, -8F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 181
		noseModel[1].setRotationPoint(-64.5F, -38F, -12.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 11, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -8F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, -0.5F, -8F); // Box 182
		noseModel[2].setRotationPoint(-64.5F, -18F, -12.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 183
		noseModel[3].setRotationPoint(-69.5F, -31F, -11.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 7F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0.5F, -7F); // Box 184
		noseModel[4].setRotationPoint(-69.5F, -38F, -4.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F); // Box 185
		noseModel[5].setRotationPoint(-69.5F, -38F, -4.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0.5F, 7F); // Box 186
		noseModel[6].setRotationPoint(-69.5F, -38F, 2.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F); // Box 187
		noseModel[7].setRotationPoint(-69.5F, -31F, 9.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0.5F, 7F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F); // Box 188
		noseModel[8].setRotationPoint(-69.5F, -18F, 2.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 189
		noseModel[9].setRotationPoint(-69.5F, -12.5F, -4.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0.5F, 7F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0.5F, -7F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 190
		noseModel[10].setRotationPoint(-69.5F, -18F, -4.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F,0F, -1F, 3F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 191
		noseModel[11].setRotationPoint(-74.5F, -30.5F, 9.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, -3.5F, 7F, 0F, -6.5F, 11F, 0F, 0.5F, -7.5F, 0F, -2F, -8.5F, 0F, 1F, 3F, 0F, 6F, 6F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 192
		noseModel[12].setRotationPoint(-74.5F, -36.5F, 9.5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 1F, 3F, 0F, 6F, 6F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -3.5F, 7F, 0F, -7F, 12F, 0F, 1F, -7.5F, 0F, -2F, -8.5F); // Box 193
		noseModel[13].setRotationPoint(-74.5F, -18.5F, 9.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, 2F, -1.5F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, -1.5F); // Box 194
		noseModel[14].setRotationPoint(-74.5F, -37F, -4F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 198
		noseModel[15].setRotationPoint(-79.5F, -26F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, -3F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 199
		noseModel[16].setRotationPoint(-79.5F, -29F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -3F); // Box 200
		noseModel[17].setRotationPoint(-79.5F, -22F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 201
		noseModel[18].setRotationPoint(-83.5F, -26F, -4.5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 202
		noseModel[19].setRotationPoint(-83.5F, -29F, -4.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 203
		noseModel[20].setRotationPoint(-83.5F, -23F, -4.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F); // Box 204
		noseModel[21].setRotationPoint(-86.5F, -25.5F, -4F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F); // Box 205
		noseModel[22].setRotationPoint(-86.5F, -27.5F, -4F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F, -0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F); // Box 206
		noseModel[23].setRotationPoint(-86.5F, -22.5F, -4F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 2F, -1.5F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, -1.5F, 0F, -2.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -1F); // Box 207
		noseModel[24].setRotationPoint(-74.5F, -14F, -4F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, 3F); // Box 208
		noseModel[25].setRotationPoint(-74.5F, -30.5F, -11.5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, -2F, -8.5F, 0F, 0.5F, -7.5F, 0F, -6.5F, 11F, 0F, -3.5F, 7F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, 1F, 3F); // Box 209
		noseModel[26].setRotationPoint(-74.5F, -36.5F, -11.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, 1F, 3F, 0F, -2F, -8.5F, 0F, 1F, -7.5F, 0F, -7F, 12F, 0F, -3.5F, 7F); // Box 210
		noseModel[27].setRotationPoint(-74.5F, -18.5F, -11.5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F); // Box 246
		noseModel[28].setRotationPoint(-73.5F, -15F, -4F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 11, 6, 8, 0F,0F, 0F, 1F, 40F, -2F, 1F, 40F, -2F, 1F, 0F, 0F, 1F, 0F, 1F, 0.5F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.5F); // Box 247
		noseModel[29].setRotationPoint(-70.5F, -15F, -4F);

		noseModel[30].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		noseModel[30].setRotationPoint(-54.2F, -29F, -11.5F);
		noseModel[30].rotateAngleY = -0.68067841F;
		noseModel[30].rotateAngleZ = 0.15707963F;

		noseModel[31].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		noseModel[31].setRotationPoint(-54.2F, -27.5F, -11.5F);
		noseModel[31].rotateAngleY = -0.68067841F;
		noseModel[31].rotateAngleZ = 0.15707963F;

		noseModel[32].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		noseModel[32].setRotationPoint(-54.2F, -25F, -11.5F);
		noseModel[32].rotateAngleY = -0.68067841F;
		noseModel[32].rotateAngleZ = 0.15707963F;

		noseModel[33].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		noseModel[33].setRotationPoint(-54.2F, -26.2F, -11.5F);
		noseModel[33].rotateAngleY = -0.68067841F;
		noseModel[33].rotateAngleZ = 0.15707963F;

		noseModel[34].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		noseModel[34].setRotationPoint(-54.2F, -31.5F, -10.8F);
		noseModel[34].rotateAngleY = -0.68067841F;
		noseModel[34].rotateAngleZ = 0.15707963F;

		noseModel[35].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 341
		noseModel[35].setRotationPoint(-73.5F, -37.5F, -3.5F);

		noseModel[36].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		noseModel[36].setRotationPoint(-54.2F, -29F, 10.5F);
		noseModel[36].rotateAngleY = -0.68067841F;
		noseModel[36].rotateAngleZ = 0.15707963F;

		noseModel[37].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		noseModel[37].setRotationPoint(-54.2F, -27.5F, 10.5F);
		noseModel[37].rotateAngleY = -0.68067841F;
		noseModel[37].rotateAngleZ = 0.15707963F;

		noseModel[38].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		noseModel[38].setRotationPoint(-54.2F, -25F, 10.5F);
		noseModel[38].rotateAngleY = -0.68067841F;
		noseModel[38].rotateAngleZ = 0.15707963F;

		noseModel[39].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		noseModel[39].setRotationPoint(-54.2F, -26.2F, 10.5F);
		noseModel[39].rotateAngleY = -0.68067841F;
		noseModel[39].rotateAngleZ = 0.15707963F;

		noseModel[40].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		noseModel[40].setRotationPoint(-54.2F, -31.5F, 9.8F);
		noseModel[40].rotateAngleY = -0.68067841F;
		noseModel[40].rotateAngleZ = 0.15707963F;

		noseModel[41].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		noseModel[41].setRotationPoint(-54.2F, -29F, 11.5F);
		noseModel[41].rotateAngleY = 0.68067841F;
		noseModel[41].rotateAngleZ = 0.15707963F;

		noseModel[42].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		noseModel[42].setRotationPoint(-54.2F, -27.5F, 11.5F);
		noseModel[42].rotateAngleY = 0.68067841F;
		noseModel[42].rotateAngleZ = 0.15707963F;

		noseModel[43].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		noseModel[43].setRotationPoint(-54.2F, -25F, 11.5F);
		noseModel[43].rotateAngleY = 0.68067841F;
		noseModel[43].rotateAngleZ = 0.15707963F;

		noseModel[44].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		noseModel[44].setRotationPoint(-54.2F, -26.2F, 11.5F);
		noseModel[44].rotateAngleY = 0.68067841F;
		noseModel[44].rotateAngleZ = 0.15707963F;

		noseModel[45].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		noseModel[45].setRotationPoint(-54.2F, -31.5F, 10.8F);
		noseModel[45].rotateAngleY = 0.68067841F;
		noseModel[45].rotateAngleZ = 0.15707963F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 232
		tailModel[1] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 233
		tailModel[2] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 234
		tailModel[3] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 235
		tailModel[4] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 237
		tailModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 238
		tailModel[6] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 239
		tailModel[7] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 243
		tailModel[8] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 244
		tailModel[9] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 245
		tailModel[10] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 295

		tailModel[0].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F,0F, 0F, 0F, 1F, -3.5F, -7F, 1F, -3.5F, -7F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -7.5F, 0F, -1F, -7.5F, 0F, 0.5F, 0F); // Box 232
		tailModel[0].setRotationPoint(52.5F, -27F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 32, 5, 18, 0F,0F, 1F, -6F, 0F, -5F, -7.5F, 0F, -5F, -7.5F, 0F, 1F, -6F, 0F, 0F, 0F, 1F, 3.5F, -7F, 1F, 3.5F, -7F, 0F, 0F, 0F); // Box 233
		tailModel[1].setRotationPoint(52.5F, -32F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 32, 6, 14, 0F,0F, -0.5F, 2F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, -0.5F, 2F, 0F, 0.5F, -3.5F, -3F, -5.5F, -6.5F, -3F, -5.5F, -6.5F, 0F, 0.5F, -3.5F); // Box 234
		tailModel[2].setRotationPoint(52.5F, -19F, -7F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 40, 0F,-13F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, -4F, 0F, 2F, -1F, 0F, -13F, 0F, 0.5F, 0F, 0F, 0F, 1F, 4F, 0F, 2F, 1F, 0F); // Box 235
		tailModel[3].setRotationPoint(45.5F, -32F, -43F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 6, 31, 2, 0F,0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		tailModel[4].setRotationPoint(66F, -59.5F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 31, 2, 0F,0F, -2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 0F, 0F); // Box 238
		tailModel[5].setRotationPoint(62F, -59.5F, -1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 4, 31, 2, 0F,0F, 0.3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 8.5F, 2F, 0F, 8.5F, 2F, 0F, 0F, 0F, 0F); // Box 239
		tailModel[6].setRotationPoint(72F, -59.5F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,-3F, -0.3F, 1F, -1F, -0.3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -3F, -0.4F, 1F, -1F, -0.4F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 243
		tailModel[7].setRotationPoint(58.5F, -32F, -47F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 26, 2, 40, 0F,2F, -1F, 0F, 1F, -4F, 0F, 0F, -0.5F, 0F, -13F, -0.5F, 0.5F, 2F, 1F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, -13F, 0F, 0.5F); // Box 244
		tailModel[8].setRotationPoint(45.5F, -32F, 3F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, -0.3F, 0.5F, -3F, -0.3F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.4F, 0.5F, -3F, -0.4F, 1F); // Box 245
		tailModel[9].setRotationPoint(58.5F, -32F, 43F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F, 25F, -0.4F, -0.4F); // Box 295
		tailModel[10].setRotationPoint(34.5F, -54F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 240
		leftWingModel[1] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 242
		leftWingModel[2] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 332
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 333
		leftWingModel[4] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 334
		leftWingModel[5] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 335
		leftWingModel[6] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 336
		leftWingModel[7] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 337
		leftWingModel[8] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 338
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 339
		leftWingModel[10] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 340
		leftWingModel[11] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 366

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 2, 96, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 10F, -10F, 0F, 6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 14F, 0F, 6F, 14F, 0F); // Box 240
		leftWingModel[0].setRotationPoint(-37.5F, -33F, -115.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 96, 0F,0F, -0.5F, 0F, 1F, -2F, -10F, 15F, -12F, 0F, -10F, -10F, 0F, 0F, 0F, 0F, 1F, 1F, -10F, 15F, 13F, 0F, -10F, 14F, 0F); // Box 242
		leftWingModel[1].setRotationPoint(-22.5F, -33F, -115.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 56, 0F,2F, -0.8F, -11F, 0F, 0F, 0F, -3.5F, -4.7F, 0F, 5.7F, -5.7F, 0F, 2F, 0.3F, -11F, 0F, 0F, 0F, -3.5F, 8.15F, 0F, 5.7F, 6.3F, 0F); // Box 332
		leftWingModel[2].setRotationPoint(-43.5F, -33F, -115.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 40, 0F,5.7F, -5.7F, 0F, -3.5F, -4.7F, 0F, -6F, -8F, 0F, 9F, -10F, 0F, 5.7F, 6.3F, 0F, -3.5F, 8.15F, 0F, -6F, 14F, 0F, 9F, 12F, 0F); // Box 333
		leftWingModel[3].setRotationPoint(-43.5F, -33F, -59.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 23, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftWingModel[4].setRotationPoint(-39.5F, -23F, -54.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, 0F); // Box 335
		leftWingModel[5].setRotationPoint(-39.5F, -20F, -54.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftWingModel[6].setRotationPoint(-55.5F, -22F, -53.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F); // Box 337
		leftWingModel[7].setRotationPoint(-56.5F, -22F, -53.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F); // Box 338
		leftWingModel[8].setRotationPoint(-60.5F, -26.5F, -61F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftWingModel[9].setRotationPoint(-59.5F, -26.5F, -61F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		leftWingModel[10].setRotationPoint(-41F, -25.4F, -92.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 3F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftWingModel[11].setRotationPoint(-41F, -28.4F, -92.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 347
		rightWingModel[1] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 348
		rightWingModel[2] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 349
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 350
		rightWingModel[4] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 351
		rightWingModel[5] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 352
		rightWingModel[6] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 353
		rightWingModel[7] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 354
		rightWingModel[8] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 355
		rightWingModel[9] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 356
		rightWingModel[10] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 357
		rightWingModel[11] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 365

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 2, 96, 0F,6F, -8F, 0F, 10F, -10F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 6F, 14F, 0F, 10F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingModel[0].setRotationPoint(-37.5F, -33F, 19.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 96, 0F,-10F, -10F, 0F, 15F, -12F, 0F, 1F, -2F, -10F, 0F, -0.5F, 0F, -10F, 14F, 0F, 15F, 13F, 0F, 1F, 1F, -10F, 0F, 0F, 0F); // Box 348
		rightWingModel[1].setRotationPoint(-22.5F, -33F, 19.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 56, 0F,5.7F, -5.7F, 0F, -3.5F, -4.7F, 0F, 0F, 0F, 0F, 2F, -0.8F, -11F, 5.7F, 6.3F, 0F, -3.5F, 8.15F, 0F, 0F, 0F, 0F, 2F, 0.3F, -11F); // Box 349
		rightWingModel[2].setRotationPoint(-43.5F, -33F, 59.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 40, 0F,9F, -10F, 0F, -6F, -8F, 0F, -3.5F, -4.7F, 0F, 5.7F, -5.7F, 0F, 9F, 12F, 0F, -6F, 14F, 0F, -3.5F, 8.15F, 0F, 5.7F, 6.3F, 0F); // Box 350
		rightWingModel[3].setRotationPoint(-43.5F, -33F, 19.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 23, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		rightWingModel[4].setRotationPoint(-39.5F, -23F, 51.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, 0F); // Box 352
		rightWingModel[5].setRotationPoint(-39.5F, -20F, 51.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		rightWingModel[6].setRotationPoint(-55.5F, -22F, 52.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F); // Box 354
		rightWingModel[7].setRotationPoint(-56.5F, -22F, 52.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F); // Box 355
		rightWingModel[8].setRotationPoint(-60.5F, -26.5F, 60F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightWingModel[9].setRotationPoint(-59.5F, -26.5F, 60F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 357
		rightWingModel[10].setRotationPoint(-41F, -25.4F, 71.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 365
		rightWingModel[11].setRotationPoint(-41F, -28.4F, 71.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 106
		yawFlapModel[1] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 107
		yawFlapModel[2] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[0].setRotationPoint(-28F, -24.3F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.43633231F;

		yawFlapModel[1].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[1].setRotationPoint(-28F, -24.3F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[2].setRotationPoint(-28F, -24.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-22F, -23.5F, 0F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 296
		tailWheelModel[1] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 297
		tailWheelModel[2] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 298
		tailWheelModel[3] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 299
		tailWheelModel[4] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 300

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		tailWheelModel[0].setRotationPoint(59.5F, -19F, -1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 297
		tailWheelModel[1].setRotationPoint(60F, -13F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 298
		tailWheelModel[2].setRotationPoint(60F, -9.5F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 299
		tailWheelModel[3].setRotationPoint(60F, -11F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F); // Box 300
		tailWheelModel[4].setRotationPoint(60F, -8F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 323
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 324
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 325
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 326
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 327
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 328
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 329
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 330
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 331

		leftWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		leftWingWheelModel[0].setRotationPoint(-44F, -22F, -46F);
		leftWingWheelModel[0].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftWingWheelModel[1].setRotationPoint(-53F, 0.5F, -45F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftWingWheelModel[2].setRotationPoint(-53F, -3.5F, -45F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 326
		leftWingWheelModel[3].setRotationPoint(-53F, 5.5F, -45F);

		leftWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 327
		leftWingWheelModel[4].setRotationPoint(-44.5F, -22F, -47F);
		leftWingWheelModel[4].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 328
		leftWingWheelModel[5].setRotationPoint(-44.5F, -16F, -47F);
		leftWingWheelModel[5].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 329
		leftWingWheelModel[6].setRotationPoint(-44.5F, -16F, -47F);
		leftWingWheelModel[6].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 330
		leftWingWheelModel[7].setRotationPoint(-44F, -9F, -46F);
		leftWingWheelModel[7].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingWheelModel[8].setRotationPoint(-44F, -9F, -46F);
		leftWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 153
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 154
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 155
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 156
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 157
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 158
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 159
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 160
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 161

		rightWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingWheelModel[0].setRotationPoint(-44F, -22F, 45F);
		rightWingWheelModel[0].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingWheelModel[1].setRotationPoint(-53F, 0.5F, 42F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		rightWingWheelModel[2].setRotationPoint(-53F, -3.5F, 42F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightWingWheelModel[3].setRotationPoint(-53F, 5.5F, 42F);

		rightWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 157
		rightWingWheelModel[4].setRotationPoint(-44.5F, -22F, 46F);
		rightWingWheelModel[4].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 158
		rightWingWheelModel[5].setRotationPoint(-44.5F, -16F, 46F);
		rightWingWheelModel[5].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 159
		rightWingWheelModel[6].setRotationPoint(-44.5F, -16F, 46F);
		rightWingWheelModel[6].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 160
		rightWingWheelModel[7].setRotationPoint(-44F, -9F, 45F);
		rightWingWheelModel[7].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingWheelModel[8].setRotationPoint(-44F, -9F, 45F);
		rightWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-77F, -24F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 386, 208, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 386, 208, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 386, 208, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 386, 208, textureX, textureY);
		prop[0].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[1].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[2].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[3].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}