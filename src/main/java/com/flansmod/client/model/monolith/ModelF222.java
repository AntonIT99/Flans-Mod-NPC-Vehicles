//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F222
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF222 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelF222() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[77];
		noseModel = new ModelRendererTurbo[13];
		tailModel = new ModelRendererTurbo[14];
		leftWingModel = new ModelRendererTurbo[41];
		rightWingModel = new ModelRendererTurbo[41];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		leftWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 170
		bodyModel[1] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 171
		bodyModel[2] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 172
		bodyModel[3] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 177
		bodyModel[4] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 178
		bodyModel[5] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 179
		bodyModel[6] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 182
		bodyModel[7] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 183
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 184
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 185
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 186
		bodyModel[11] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 187
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 188
		bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 189
		bodyModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 190
		bodyModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 191
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 192
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 193
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 194
		bodyModel[19] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 195
		bodyModel[20] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 196
		bodyModel[21] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 197
		bodyModel[22] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 198
		bodyModel[23] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 199
		bodyModel[24] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 200
		bodyModel[25] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 203
		bodyModel[26] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 204
		bodyModel[27] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 205
		bodyModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 206
		bodyModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 207
		bodyModel[30] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 208
		bodyModel[31] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 209
		bodyModel[32] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 210
		bodyModel[33] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 223
		bodyModel[34] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 224
		bodyModel[35] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 225
		bodyModel[36] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 226
		bodyModel[37] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 227
		bodyModel[38] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 228
		bodyModel[39] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 229
		bodyModel[40] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 230
		bodyModel[41] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 231
		bodyModel[42] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 232
		bodyModel[43] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 233
		bodyModel[44] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 285
		bodyModel[45] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 286
		bodyModel[46] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 287
		bodyModel[47] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 288
		bodyModel[48] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 289
		bodyModel[49] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 603
		bodyModel[50] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 604
		bodyModel[51] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 606
		bodyModel[52] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 911
		bodyModel[53] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 912
		bodyModel[54] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 913
		bodyModel[55] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 238
		bodyModel[56] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 239
		bodyModel[57] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 298
		bodyModel[58] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 299
		bodyModel[59] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 300
		bodyModel[60] = new ModelRendererTurbo(this, 528, 534, textureX, textureY); // Box 312
		bodyModel[61] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 355
		bodyModel[62] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 356
		bodyModel[63] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 357
		bodyModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 358
		bodyModel[65] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 359
		bodyModel[66] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 360
		bodyModel[67] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 361
		bodyModel[68] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 362
		bodyModel[69] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 363
		bodyModel[70] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 364
		bodyModel[71] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 365
		bodyModel[72] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 366
		bodyModel[73] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 367
		bodyModel[74] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 368
		bodyModel[75] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 369
		bodyModel[76] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 370

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, -4F); // Box 170
		bodyModel[0].setRotationPoint(-187F, -58.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 171
		bodyModel[1].setRotationPoint(-195F, -58.5F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 3, 20, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F); // Box 172
		bodyModel[2].setRotationPoint(-201F, -58.5F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 173, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[3].setRotationPoint(-141F, -72.5F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 173, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[4].setRotationPoint(-141F, -33.5F, -16F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 4, 20, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 1F, 0F); // Box 179
		bodyModel[5].setRotationPoint(-141F, -77.5F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 5, 7, 0F,0F, 0F, 0F, -8F, 4F, 3F, 0F, 3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -2F, 3F, -3F, 0F, 0F, 0F, 0.1F, 0F); // Box 182
		bodyModel[6].setRotationPoint(-141F, -77.5F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 5, 7, 0F,0F, -5F, 0F, 0F, 3F, 0F, -8F, 4F, 3F, 0F, 0F, 0F, 0F, 0.1F, 0F, -3F, 0F, 0F, -8F, -2F, 3F, 0F, 0F, 0F); // Box 183
		bodyModel[7].setRotationPoint(-141F, -77.5F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 184
		bodyModel[8].setRotationPoint(-119F, -80.5F, -17F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[9].setRotationPoint(-119F, -87.5F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[10].setRotationPoint(-116F, -75.5F, -17F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 52, 5, 34, 0F,-7F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[11].setRotationPoint(-114F, -92.5F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 188
		bodyModel[12].setRotationPoint(-119F, -80.5F, 16F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-6F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[13].setRotationPoint(-119F, -87.5F, 16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[14].setRotationPoint(-116F, -75.5F, 16F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 5, 34, 0F,-3F, -2F, -8F, 7F, 0F, 0F, 7F, 0F, 0F, -3F, -2F, -8F, 0.5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -10F); // Box 191
		bodyModel[15].setRotationPoint(-122F, -92.5F, -17F);

		bodyModel[16].addShapeBox(0F, -1F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[16].setRotationPoint(-122.5F, -87.5F, -7F);
		bodyModel[16].rotateAngleZ = -0.66322512F;

		bodyModel[17].addShapeBox(0F, -1F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[17].setRotationPoint(-122.5F, -87.5F, 6F);
		bodyModel[17].rotateAngleZ = -0.66322512F;

		bodyModel[18].addShapeBox(0F, -1F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[18].setRotationPoint(-122.5F, -87.5F, -0.5F);
		bodyModel[18].rotateAngleZ = -0.66322512F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 33, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 195
		bodyModel[19].setRotationPoint(-95F, -87.5F, -17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 22, 34, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[20].setRotationPoint(-62F, -94.5F, -17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 47, 21, 34, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[21].setRotationPoint(-26F, -93.5F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 13, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[22].setRotationPoint(21F, -85.5F, -17F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 53, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[23].setRotationPoint(32F, -85.5F, -17F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 51, 34, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[24].setRotationPoint(48F, -85.5F, -17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 11, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 203
		bodyModel[25].setRotationPoint(26F, -32.5F, -10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 11, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, -3F); // Box 204
		bodyModel[26].setRotationPoint(33F, -32.5F, -10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 11, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -7F); // Box 205
		bodyModel[27].setRotationPoint(19F, -32.5F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[28].setRotationPoint(37F, -27.5F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 207
		bodyModel[29].setRotationPoint(40F, -27.5F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 30, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[30].setRotationPoint(-95F, -87.5F, -16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 46, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[31].setRotationPoint(-141F, -58.5F, -16F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[32].setRotationPoint(-126F, -80.5F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 6, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[33].setRotationPoint(29F, -91.5F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F,-1F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 224
		bodyModel[34].setRotationPoint(22F, -91.5F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 6, 22, 0F,0F, 0F, -1F, -1F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 225
		bodyModel[35].setRotationPoint(37F, -91.5F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[36].setRotationPoint(42F, -89.5F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 227
		bodyModel[37].setRotationPoint(47F, -89.5F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F,-1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[38].setRotationPoint(29F, -95.5F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,-4F, 0F, -8F, 1F, 0F, -4F, 1F, 0F, -4F, -4F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 229
		bodyModel[39].setRotationPoint(23F, -95.5F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,1F, 0F, -4F, -4F, 0F, -8F, -4F, 0F, -8F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 230
		bodyModel[40].setRotationPoint(37F, -95.5F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,-1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[41].setRotationPoint(30F, -96.5F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-3.95F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, -3.95F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 232
		bodyModel[42].setRotationPoint(27F, -96.5F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,1F, 0F, -4F, -3.95F, 0F, -4F, -3.95F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 233
		bodyModel[43].setRotationPoint(36F, -96.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[44].setRotationPoint(-78F, -96.5F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[45].setRotationPoint(-79F, -99.5F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 287
		bodyModel[46].setRotationPoint(-78F, -100.5F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[47].setRotationPoint(-75F, -99.5F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[48].setRotationPoint(-77F, -95.5F, -0.5F);

		bodyModel[49].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[49].setRotationPoint(-114F, -77.5F, -6F);

		bodyModel[50].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[50].setRotationPoint(-114F, -77.5F, -10F);

		bodyModel[51].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[51].setRotationPoint(-116F, -75.5F, -8F);

		bodyModel[52].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 911
		bodyModel[52].setRotationPoint(-116F, -74.5F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 912
		bodyModel[53].setRotationPoint(-116.5F, -61F, -9F);

		bodyModel[54].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 913
		bodyModel[54].setRotationPoint(-114F, -75.5F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[55].setRotationPoint(-110F, -68F, -13F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 239
		bodyModel[56].setRotationPoint(-100F, -79F, -13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[57].setRotationPoint(-109F, -62F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[58].setRotationPoint(-109F, -64F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[59].setRotationPoint(-109F, -64F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 173, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[60].setRotationPoint(-141F, -72.5F, 16F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 33, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 355
		bodyModel[61].setRotationPoint(-95F, -87.5F, 16F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[62].setRotationPoint(-110F, -68F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F); // Box 357
		bodyModel[63].setRotationPoint(-100F, -79F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[64].setRotationPoint(-109F, -62F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[65].setRotationPoint(-109F, -64F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[66].setRotationPoint(-109F, -64F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[67].setRotationPoint(-102F, -64F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[68].setRotationPoint(-102F, -64F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[69].setRotationPoint(-102F, -64F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[70].setRotationPoint(-102F, -64F, -12F);

		bodyModel[71].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[71].setRotationPoint(-114F, -77.5F, 5F);

		bodyModel[72].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[72].setRotationPoint(-114F, -77.5F, 9F);

		bodyModel[73].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[73].setRotationPoint(-116F, -75.5F, 7F);

		bodyModel[74].addShapeBox(-0.5F, 0F, -0.5F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 368
		bodyModel[74].setRotationPoint(-116F, -74.5F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 369
		bodyModel[75].setRotationPoint(-116.5F, -61F, 6F);

		bodyModel[76].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 370
		bodyModel[76].setRotationPoint(-114F, -75.5F, 5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 162
		noseModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 163
		noseModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 164
		noseModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 165
		noseModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 167
		noseModel[5] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 168
		noseModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 169
		noseModel[7] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 173
		noseModel[8] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 174
		noseModel[9] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 175
		noseModel[10] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 176
		noseModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 211
		noseModel[12] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 212

		noseModel[0].addShapeBox(0F, 0F, 0F, 46, 28, 20, 0F,0F, 0F, 0F, 0F, 12F, 7F, 0F, 12F, 7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, -1F, 0F); // Box 162
		noseModel[0].setRotationPoint(-187F, -60.5F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 8, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		noseModel[1].setRotationPoint(-195F, -67.5F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 6, 9, 20, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 164
		noseModel[2].setRotationPoint(-201F, -67.5F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 165
		noseModel[3].setRotationPoint(-187F, -67.5F, -10F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		noseModel[4].setRotationPoint(-195F, -71.5F, -10F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,-4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 168
		noseModel[5].setRotationPoint(-201F, -71.5F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 20, 0F,0F, 0F, -4F, -4F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 169
		noseModel[6].setRotationPoint(-187F, -71.5F, -10F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 4, 25, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		noseModel[7].setRotationPoint(-191F, -58.5F, -10F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 25, 20, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 174
		noseModel[8].setRotationPoint(-196F, -58.5F, -10F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 3, 25, 14, 0F,0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 175
		noseModel[9].setRotationPoint(-199F, -58.5F, -7F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 46, 4, 20, 0F,0F, 0F, -4F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -12F, 7F, 0F, -12F, 7F, 0F, 0F, 0F); // Box 176
		noseModel[10].setRotationPoint(-187F, -64.5F, -10F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F); // Box 211
		noseModel[11].setRotationPoint(-205F, -63.5F, -1F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		noseModel[12].setRotationPoint(-214F, -63.2F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 201
		tailModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 202
		tailModel[2] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 213
		tailModel[3] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 216
		tailModel[4] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 220
		tailModel[5] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 222
		tailModel[6] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 274
		tailModel[7] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 275
		tailModel[8] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 276
		tailModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 277
		tailModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 278
		tailModel[11] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 350
		tailModel[12] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 351
		tailModel[13] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 352

		tailModel[0].addShapeBox(0F, 0F, 0F, 48, 51, 34, 0F,0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -11F, -3F, 0F, -11F, -3F, 0F, -2F, 0F); // Box 201
		tailModel[0].setRotationPoint(62F, -85.5F, -17F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 101, 26, 20, 0F,0F, 0F, 4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 4F, 0F, 11F, 4F, 0F, -9.5F, -9F, 0F, -9.5F, -9F, 0F, 11F, 4F); // Box 202
		tailModel[1].setRotationPoint(110F, -82.5F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 18, 44, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F); // Box 213
		tailModel[2].setRotationPoint(193.5F, -126.5F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 22, 2, 86, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 216
		tailModel[3].setRotationPoint(186.5F, -84.5F, -87F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 60, 0F,0F, 1F, -3F, 0F, 1F, -3F, -6F, -18F, 0F, 6F, -18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 18F, 0F, 6F, 18F, 0F); // Box 220
		tailModel[4].setRotationPoint(193.5F, -82.5F, -61F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 61, 0F,0F, 1F, -3F, 0F, 1F, -3F, 3F, -14.5F, 0F, -3F, -14.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 14.5F, 0F, -3F, 14.5F, 0F); // Box 222
		tailModel[5].setRotationPoint(206F, -82.5F, -61F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		tailModel[6].setRotationPoint(195F, -57.5F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		tailModel[7].setRotationPoint(195F, -60.5F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 276
		tailModel[8].setRotationPoint(195F, -54.5F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 3, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		tailModel[9].setRotationPoint(195F, -60.5F, -2.5F);
		tailModel[9].rotateAngleZ = 0.52359878F;

		tailModel[10].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		tailModel[10].setRotationPoint(195F, -63.5F, -1.5F);
		tailModel[10].rotateAngleZ = 0.34906585F;

		tailModel[11].addShapeBox(0F, 0F, 0F, 22, 2, 86, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		tailModel[11].setRotationPoint(186.5F, -84.5F, 1F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 60, 0F,6F, -18F, 0F, -6F, -18F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 6F, 18F, 0F, -6F, 18F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 351
		tailModel[12].setRotationPoint(193.5F, -82.5F, 1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 61, 0F,-3F, -14.5F, 0F, 3F, -14.5F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, -3F, 14.5F, 0F, 3F, 14.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 352
		tailModel[13].setRotationPoint(206F, -82.5F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 234
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 235
		leftWingModel[2] = new ModelRendererTurbo(this, 553, 217, textureX, textureY); // Box 236
		leftWingModel[3] = new ModelRendererTurbo(this, 753, 225, textureX, textureY); // Box 237
		leftWingModel[4] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 238
		leftWingModel[5] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 239
		leftWingModel[6] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 240
		leftWingModel[7] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 241
		leftWingModel[8] = new ModelRendererTurbo(this, 241, 521, textureX, textureY); // Box 242
		leftWingModel[9] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Box 243
		leftWingModel[10] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 244
		leftWingModel[11] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 245
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 246
		leftWingModel[13] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 247
		leftWingModel[14] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 248
		leftWingModel[15] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 249
		leftWingModel[16] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 250
		leftWingModel[17] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 251
		leftWingModel[18] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 252
		leftWingModel[19] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 253
		leftWingModel[20] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 254
		leftWingModel[21] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 255
		leftWingModel[22] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 256
		leftWingModel[23] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 257
		leftWingModel[24] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 258
		leftWingModel[25] = new ModelRendererTurbo(this, 857, 305, textureX, textureY); // Box 259
		leftWingModel[26] = new ModelRendererTurbo(this, 625, 337, textureX, textureY); // Box 260
		leftWingModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 261
		leftWingModel[28] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 262
		leftWingModel[29] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 263
		leftWingModel[30] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 264
		leftWingModel[31] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 265
		leftWingModel[32] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 273
		leftWingModel[33] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 279
		leftWingModel[34] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 280
		leftWingModel[35] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 281
		leftWingModel[36] = new ModelRendererTurbo(this, 769, 345, textureX, textureY); // Box 282
		leftWingModel[37] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 283
		leftWingModel[38] = new ModelRendererTurbo(this, 625, 377, textureX, textureY); // Box 284
		leftWingModel[39] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 203
		leftWingModel[40] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 205

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 102, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[0].setRotationPoint(-62F, -94.5F, -119F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 31, 13, 102, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 235
		leftWingModel[1].setRotationPoint(-93F, -94.5F, -119F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 47, 12, 102, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[2].setRotationPoint(-26F, -93.5F, -119F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 36, 13, 61, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 237
		leftWingModel[3].setRotationPoint(-62F, -100.5F, -180F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 31, 13, 61, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 4F, 0F); // Box 238
		leftWingModel[4].setRotationPoint(-93F, -100.5F, -180F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 47, 12, 61, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -16F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 239
		leftWingModel[5].setRotationPoint(-26F, -99.5F, -180F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 31, 13, 165, 0F,-32F, 7F, -6F, 12F, 7F, 2F, 0F, -6F, 0F, 0F, -12F, 0F, -32F, -16F, -6F, 12F, -16F, 2F, 0F, 6F, 0F, 0F, 4F, 0F); // Box 240
		leftWingModel[6].setRotationPoint(-93F, -106.5F, -345F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 36, 13, 165, 0F,-12F, 7F, 2F, -4F, 7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, -12F, -16F, 2F, -4F, -16F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 241
		leftWingModel[7].setRotationPoint(-62F, -106.5F, -345F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 47, 12, 165, 0F,4F, 8F, 0F, -25F, 5F, -8F, 0F, -16F, 0F, 0F, -6F, 0F, 4F, -16F, 0F, -25F, -15F, -8F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 242
		leftWingModel[8].setRotationPoint(-26F, -105.5F, -345F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingModel[9].setRotationPoint(-93F, -49F, -66F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftWingModel[10].setRotationPoint(-93F, -56F, -66F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -7F); // Box 245
		leftWingModel[11].setRotationPoint(-93F, -42F, -66F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftWingModel[12].setRotationPoint(-108F, -49F, -66F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[13].setRotationPoint(-108F, -56F, -66F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 248
		leftWingModel[14].setRotationPoint(-108F, -42F, -66F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -10F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, -10F); // Box 249
		leftWingModel[15].setRotationPoint(-115F, -42F, -66F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 250
		leftWingModel[16].setRotationPoint(-115F, -49F, -66F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, -2F, -10F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 251
		leftWingModel[17].setRotationPoint(-115F, -56F, -66F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftWingModel[18].setRotationPoint(-131F, -49.5F, -68F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftWingModel[19].setRotationPoint(-131F, -57.5F, -68F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 254
		leftWingModel[20].setRotationPoint(-131F, -41.5F, -68F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Box 255
		leftWingModel[21].setRotationPoint(-134F, -41.5F, -68F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 256
		leftWingModel[22].setRotationPoint(-134F, -49.5F, -68F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 257
		leftWingModel[23].setRotationPoint(-134F, -57.5F, -68F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		leftWingModel[24].setRotationPoint(-59F, -57.5F, -68F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 259
		leftWingModel[25].setRotationPoint(-59F, -41.5F, -68F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		leftWingModel[26].setRotationPoint(-59F, -49.5F, -68F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftWingModel[27].setRotationPoint(-137F, -46.5F, -57F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[28].setRotationPoint(-31F, -47F, -59F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftWingModel[29].setRotationPoint(-31F, -49F, -59F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 264
		leftWingModel[30].setRotationPoint(-31F, -44F, -59F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		leftWingModel[31].setRotationPoint(-25F, -47F, -57F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 56, 2, 36, 0F,0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftWingModel[32].setRotationPoint(-108F, -36F, -52F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 2, 34, 3, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 11F, 0F, 32F, -7F, 0F, 32F, -7F, 0F, -32F, 11F, 0F, -32F); // Box 279
		leftWingModel[33].setRotationPoint(-92F, -84F, -19F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 2, 34, 3, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 11F, 0F, 32F, -7F, 0F, 32F, -7F, 0F, -32F, 11F, 0F, -32F); // Box 280
		leftWingModel[34].setRotationPoint(-56F, -84F, -19F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -28F, 7F, 0F, -28F, 7F, 0F, 28F, -7F, 0F, 28F); // Box 281
		leftWingModel[35].setRotationPoint(-101F, -49F, -49F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,0F, 4F, -4F, 0F, 4F, -4F, 10F, -47F, 0F, -10F, -47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 10F, 47F, 0F, -10F, 47F, 0F); // Box 282
		leftWingModel[36].setRotationPoint(-75F, -88F, -175F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,0F, 4F, -4F, 0F, 4F, -4F, -29F, -47F, 0F, 29F, -47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -29F, 47F, 0F, 29F, 47F, 0F); // Box 283
		leftWingModel[37].setRotationPoint(-75F, -88F, -175F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,0F, 4F, -4F, 0F, 4F, -4F, -29F, -47F, 0F, 29F, -47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -29F, 47F, 0F, 29F, 47F, 0F); // Box 284
		leftWingModel[38].setRotationPoint(-32F, -88F, -175F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 55, 1, 55, 0F,0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, 7F, 0F); // Box 203
		leftWingModel[39].setRotationPoint(-65F, -110.5F, -308F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 55, 1, 55, 0F,0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -3.5F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 205
		leftWingModel[40].setRotationPoint(-65F, -106.5F, -308F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 303
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 304
		rightWingModel[2] = new ModelRendererTurbo(this, 553, 217, textureX, textureY); // Box 305
		rightWingModel[3] = new ModelRendererTurbo(this, 753, 225, textureX, textureY); // Box 306
		rightWingModel[4] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 307
		rightWingModel[5] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 308
		rightWingModel[6] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 309
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 310
		rightWingModel[8] = new ModelRendererTurbo(this, 241, 521, textureX, textureY); // Box 311
		rightWingModel[9] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Box 313
		rightWingModel[10] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 314
		rightWingModel[11] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 315
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 316
		rightWingModel[13] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 317
		rightWingModel[14] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 318
		rightWingModel[15] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 319
		rightWingModel[16] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 320
		rightWingModel[17] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 321
		rightWingModel[18] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 322
		rightWingModel[19] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 323
		rightWingModel[20] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 324
		rightWingModel[21] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 325
		rightWingModel[22] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 326
		rightWingModel[23] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 327
		rightWingModel[24] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 328
		rightWingModel[25] = new ModelRendererTurbo(this, 857, 305, textureX, textureY); // Box 329
		rightWingModel[26] = new ModelRendererTurbo(this, 625, 337, textureX, textureY); // Box 330
		rightWingModel[27] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 331
		rightWingModel[28] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 332
		rightWingModel[29] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 333
		rightWingModel[30] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 334
		rightWingModel[31] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 335
		rightWingModel[32] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 336
		rightWingModel[33] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 337
		rightWingModel[34] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 338
		rightWingModel[35] = new ModelRendererTurbo(this, 769, 345, textureX, textureY); // Box 339
		rightWingModel[36] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 340
		rightWingModel[37] = new ModelRendererTurbo(this, 625, 377, textureX, textureY); // Box 341
		rightWingModel[38] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 342
		rightWingModel[39] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 202
		rightWingModel[40] = new ModelRendererTurbo(this, 1, 544, textureX, textureY); // Box 204

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 102, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[0].setRotationPoint(-62F, -94.5F, 17F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 31, 13, 102, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 304
		rightWingModel[1].setRotationPoint(-93F, -94.5F, 17F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 47, 12, 102, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingModel[2].setRotationPoint(-26F, -93.5F, 17F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 36, 13, 61, 0F,0F, -6F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightWingModel[3].setRotationPoint(-62F, -100.5F, 119F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 31, 13, 61, 0F,0F, -12F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 307
		rightWingModel[4].setRotationPoint(-93F, -100.5F, 119F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 47, 12, 61, 0F,0F, -6F, 0F, 0F, -16F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingModel[5].setRotationPoint(-26F, -99.5F, 119F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 31, 13, 165, 0F,0F, -12F, 0F, 0F, -6F, 0F, 12F, 7F, 2F, -32F, 7F, -6F, 0F, 4F, 0F, 0F, 6F, 0F, 12F, -16F, 2F, -32F, -16F, -6F); // Box 309
		rightWingModel[6].setRotationPoint(-93F, -106.5F, 180F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 36, 13, 165, 0F,0F, -6F, 0F, 0F, -7F, 0F, -4F, 7F, 0F, -12F, 7F, 2F, 0F, 6F, 0F, 0F, 6F, 0F, -4F, -16F, 0F, -12F, -16F, 2F); // Box 310
		rightWingModel[7].setRotationPoint(-62F, -106.5F, 180F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 47, 12, 165, 0F,0F, -6F, 0F, 0F, -16F, 0F, -25F, 5F, -8F, 4F, 8F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -25F, -15F, -8F, 4F, -16F, 0F); // Box 311
		rightWingModel[8].setRotationPoint(-26F, -105.5F, 180F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		rightWingModel[9].setRotationPoint(-93F, -49F, 45F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		rightWingModel[10].setRotationPoint(-93F, -56F, 45F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -7F); // Box 315
		rightWingModel[11].setRotationPoint(-93F, -42F, 45F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightWingModel[12].setRotationPoint(-108F, -49F, 45F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[13].setRotationPoint(-108F, -56F, 45F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 318
		rightWingModel[14].setRotationPoint(-108F, -42F, 45F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -10F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, -10F); // Box 319
		rightWingModel[15].setRotationPoint(-115F, -42F, 45F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 320
		rightWingModel[16].setRotationPoint(-115F, -49F, 45F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 7, 7, 21, 0F,0F, -2F, -10F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -2F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 321
		rightWingModel[17].setRotationPoint(-115F, -56F, 45F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		rightWingModel[18].setRotationPoint(-131F, -49.5F, 43F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		rightWingModel[19].setRotationPoint(-131F, -57.5F, 43F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 18, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 324
		rightWingModel[20].setRotationPoint(-131F, -41.5F, 43F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F); // Box 325
		rightWingModel[21].setRotationPoint(-134F, -41.5F, 43F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 326
		rightWingModel[22].setRotationPoint(-134F, -49.5F, 43F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, -3F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 327
		rightWingModel[23].setRotationPoint(-134F, -57.5F, 43F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		rightWingModel[24].setRotationPoint(-59F, -57.5F, 43F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 329
		rightWingModel[25].setRotationPoint(-59F, -41.5F, 43F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 28, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[26].setRotationPoint(-59F, -49.5F, 43F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		rightWingModel[27].setRotationPoint(-31F, -47F, 52F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		rightWingModel[28].setRotationPoint(-31F, -49F, 52F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 333
		rightWingModel[29].setRotationPoint(-31F, -44F, 52F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[30].setRotationPoint(-25F, -47F, 54F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 56, 2, 36, 0F,0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightWingModel[31].setRotationPoint(-108F, -36F, 16F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 2, 34, 3, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 11F, 0F, -32F, -7F, 0F, -32F, -7F, 0F, 32F, 11F, 0F, 32F); // Box 336
		rightWingModel[32].setRotationPoint(-92F, -84F, 16F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 34, 3, 0F,1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 11F, 0F, -32F, -7F, 0F, -32F, -7F, 0F, 32F, 11F, 0F, 32F); // Box 337
		rightWingModel[33].setRotationPoint(-56F, -84F, 16F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 6, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 28F, 7F, 0F, 28F, 7F, 0F, -28F, -7F, 0F, -28F); // Box 338
		rightWingModel[34].setRotationPoint(-101F, -49F, 45F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,-10F, -47F, 0F, 10F, -47F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, -10F, 47F, 0F, 10F, 47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 339
		rightWingModel[35].setRotationPoint(-75F, -88F, 60F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,29F, -47F, 0F, -29F, -47F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, 29F, 47F, 0F, -29F, 47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 340
		rightWingModel[36].setRotationPoint(-75F, -88F, 60F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 6, 6, 115, 0F,29F, -47F, 0F, -29F, -47F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, 29F, 47F, 0F, -29F, 47F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 341
		rightWingModel[37].setRotationPoint(-32F, -88F, 60F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		rightWingModel[38].setRotationPoint(-137F, -46.5F, 55F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 55, 1, 55, 0F,0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 4F, 0F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 202
		rightWingModel[39].setRotationPoint(-65F, -110.5F, 253F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 55, 1, 55, 0F,0F, -3.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 204
		rightWingModel[40].setRotationPoint(-65F, -106.5F, 253F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 214
		yawFlapModel[1] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 215

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 18, 56, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F); // Box 214
		yawFlapModel[0].setRotationPoint(211.5F, -126.5F, 0F);

		yawFlapModel[1].addShapeBox(-13F, -8F, -1F, 31, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 215
		yawFlapModel[1].setRotationPoint(211.5F, -126.5F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 218
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 219

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 13, 1, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 218
		pitchFlapLeftModel[0].setRotationPoint(208.5F, -83.5F, -87F);

		pitchFlapLeftModel[1].addShapeBox(-9F, -0.5F, -14F, 22, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		pitchFlapLeftModel[1].setRotationPoint(208.5F, -83.5F, -87F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 353
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 354

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 13, 1, 84, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		pitchFlapRightModel[0].setRotationPoint(208.5F, -83.5F, 3F);

		pitchFlapRightModel[1].addShapeBox(-9F, -0.5F, 14F, 22, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		pitchFlapRightModel[1].setRotationPoint(208.5F, -83.5F, 73F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 266
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 267
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Box 268
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 269
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 270
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 271
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 272

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 266
		leftWingWheelModel[0].setRotationPoint(-82F, 2F, -59F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftWingWheelModel[1].setRotationPoint(-82F, -6F, -59F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftWingWheelModel[2].setRotationPoint(-82F, -14F, -59F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingWheelModel[3].setRotationPoint(-65F, -37F, -60F);
		leftWingWheelModel[3].rotateAngleZ = -0.19198622F;

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftWingWheelModel[4].setRotationPoint(-65F, -37F, -52F);
		leftWingWheelModel[4].rotateAngleZ = -0.19198622F;

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 48, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingWheelModel[5].setRotationPoint(-103F, -37F, -60F);
		leftWingWheelModel[5].rotateAngleZ = 0.73303829F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 48, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		leftWingWheelModel[6].setRotationPoint(-103F, -37F, -52F);
		leftWingWheelModel[6].rotateAngleZ = 0.73303829F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 343
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 344
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 953, 225, textureX, textureY); // Box 345
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 346
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 347
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 348
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 349

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 343
		rightWingWheelModel[0].setRotationPoint(-82F, 2F, 52F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		rightWingWheelModel[1].setRotationPoint(-82F, -6F, 52F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 7, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		rightWingWheelModel[2].setRotationPoint(-82F, -14F, 52F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		rightWingWheelModel[3].setRotationPoint(-65F, -37F, 59F);
		rightWingWheelModel[3].rotateAngleZ = -0.19198622F;

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingWheelModel[4].setRotationPoint(-65F, -37F, 51F);
		rightWingWheelModel[4].rotateAngleZ = -0.19198622F;

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 48, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightWingWheelModel[5].setRotationPoint(-103F, -37F, 59F);
		rightWingWheelModel[5].rotateAngleZ = 0.73303829F;

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 48, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightWingWheelModel[6].setRotationPoint(-103F, -37F, 51F);
		rightWingWheelModel[6].rotateAngleZ = 0.73303829F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-135.5F, -45.5F, -56F);
		propellerModels[1] = makeProp2(-23F, -45.5F, -56F);
		propellerModels[2] = makeProp3(-135.5F, -45.5F, 56F);
		propellerModels[3] = makeProp4(-23F, -45.5F, 56F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
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
		prop[0] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
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

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
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