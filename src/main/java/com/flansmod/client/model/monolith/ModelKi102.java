//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki102
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi102 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKi102() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];
		noseModel = new ModelRendererTurbo[13];
		tailModel = new ModelRendererTurbo[21];
		leftWingModel = new ModelRendererTurbo[52];
		rightWingModel = new ModelRendererTurbo[49];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[6];
		leftWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel = new ModelRendererTurbo[8];

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
		bodyModel[0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 198
		bodyModel[1] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 199
		bodyModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 201
		bodyModel[3] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 202
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 203
		bodyModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 204
		bodyModel[6] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 205
		bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 206
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 207
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 208
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 209
		bodyModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 210
		bodyModel[12] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 211
		bodyModel[13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 227
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 228
		bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 229
		bodyModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 230
		bodyModel[17] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 231
		bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 232
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 233
		bodyModel[20] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 234
		bodyModel[21] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 235
		bodyModel[22] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 236
		bodyModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 237
		bodyModel[24] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 238
		bodyModel[25] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 239
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 240
		bodyModel[27] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 241
		bodyModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 242
		bodyModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 243
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 244
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 245
		bodyModel[32] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 246
		bodyModel[33] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 247
		bodyModel[34] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 248
		bodyModel[35] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 249
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 250
		bodyModel[37] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 251
		bodyModel[38] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 252
		bodyModel[39] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 253
		bodyModel[40] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 254
		bodyModel[41] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 255
		bodyModel[42] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 256
		bodyModel[43] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 257
		bodyModel[44] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 258
		bodyModel[45] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 259
		bodyModel[46] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 260
		bodyModel[47] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 261
		bodyModel[48] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 262
		bodyModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 263
		bodyModel[50] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 264
		bodyModel[51] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 265
		bodyModel[52] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 266
		bodyModel[53] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 267
		bodyModel[54] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 268
		bodyModel[55] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 269
		bodyModel[56] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 270
		bodyModel[57] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 271
		bodyModel[58] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 272
		bodyModel[59] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 273
		bodyModel[60] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 274
		bodyModel[61] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 275
		bodyModel[62] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 277
		bodyModel[63] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 278
		bodyModel[64] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 279
		bodyModel[65] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 280
		bodyModel[66] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 281
		bodyModel[67] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 282
		bodyModel[68] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 283
		bodyModel[69] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 284
		bodyModel[70] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 285
		bodyModel[71] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 286
		bodyModel[72] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 183
		bodyModel[79] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 184
		bodyModel[80] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 185
		bodyModel[81] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 221
		bodyModel[82] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 222
		bodyModel[83] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 223
		bodyModel[84] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 224
		bodyModel[85] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 225
		bodyModel[86] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 226
		bodyModel[87] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 227
		bodyModel[88] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 228
		bodyModel[89] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 229
		bodyModel[90] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 301
		bodyModel[91] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 302
		bodyModel[92] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 212
		bodyModel[93] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 214
		bodyModel[94] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 215
		bodyModel[95] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 216
		bodyModel[96] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 222
		bodyModel[97] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 223
		bodyModel[98] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 224

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 12, 14, 0F,0F, 0.5F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F); // Box 198
		bodyModel[0].setRotationPoint(-67F, -28F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,0F, 0.2F, -4F, 0F, 0.7F, -3.5F, 0F, 1.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F); // Box 199
		bodyModel[1].setRotationPoint(-67F, -33.5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0.7F, -3.5F, 0F, 0.2F, -4F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F); // Box 201
		bodyModel[2].setRotationPoint(-67F, -33.5F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 5, 15, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -4.5F); // Box 202
		bodyModel[3].setRotationPoint(-67F, -16F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 91, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		bodyModel[4].setRotationPoint(-58F, -29F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 94, 5, 8, 0F,0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 204
		bodyModel[5].setRotationPoint(-58F, -15F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 70, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[6].setRotationPoint(-49F, -32F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 1F, -4F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 1.1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[7].setRotationPoint(-56F, -33F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.2F, -4.5F, 0F, 0F, -4F, 0F, 0.1F, 4F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[8].setRotationPoint(-58F, -34F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -2F, 0F, 0.5F, -3.5F, 0F, 0.5F, 3.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[9].setRotationPoint(21F, -32F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0.5F, -3.5F, 0F, 1.4F, -4.5F, 0F, 1.4F, 4.5F, 0F, 0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[10].setRotationPoint(25F, -32F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0.4F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.4F, -0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 210
		bodyModel[11].setRotationPoint(33F, -33F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 14, 4, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F); // Box 211
		bodyModel[12].setRotationPoint(33F, -29F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, -0.5F, 18, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 227
		bodyModel[13].setRotationPoint(-23F, -39F, -3.5F);
		bodyModel[13].rotateAngleX = -0.27925268F;

		bodyModel[14].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[14].setRotationPoint(-34F, -39F, -3.5F);
		bodyModel[14].rotateAngleX = -0.27925268F;

		bodyModel[15].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[15].setRotationPoint(-46.5F, -39F, -3.5F);
		bodyModel[15].rotateAngleX = -0.27925268F;

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 230
		bodyModel[16].setRotationPoint(-34F, -41F, -2F);
		bodyModel[16].rotateAngleX = -0.62831853F;

		bodyModel[17].addShapeBox(0F, 0F, -0.5F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 231
		bodyModel[17].setRotationPoint(-23F, -41F, -2F);
		bodyModel[17].rotateAngleX = -0.62831853F;

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 232
		bodyModel[18].setRotationPoint(-46.5F, -41F, -2F);
		bodyModel[18].rotateAngleX = -0.62831853F;

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 233
		bodyModel[19].setRotationPoint(-46.5F, -41.3F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 29, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 234
		bodyModel[20].setRotationPoint(-34F, -41.3F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[21].setRotationPoint(-40.25F, -39F, -3.5F);
		bodyModel[21].rotateAngleX = -0.27925268F;

		bodyModel[22].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 236
		bodyModel[22].setRotationPoint(-40.25F, -41F, -2F);
		bodyModel[22].rotateAngleX = -0.62831853F;

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 237
		bodyModel[23].setRotationPoint(-40.25F, -41.3F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 238
		bodyModel[24].setRotationPoint(-46.5F, -40F, -2.7F);
		bodyModel[24].rotateAngleX = -0.62831853F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 239
		bodyModel[25].setRotationPoint(-52F, -39.5F, -2.5F);
		bodyModel[25].rotateAngleZ = 0.15707963F;

		bodyModel[26].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 240
		bodyModel[26].setRotationPoint(-52F, -39.5F, -2.5F);
		bodyModel[26].rotateAngleZ = 0.59341195F;

		bodyModel[27].addShapeBox(0F, 0F, -0.5F, 1, 1, 6, 0F,0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 241
		bodyModel[27].setRotationPoint(-52F, -40.2F, -2.5F);

		bodyModel[28].addShapeBox(-7F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 242
		bodyModel[28].setRotationPoint(-53.5F, -38.5F, -2.5F);
		bodyModel[28].rotateAngleZ = 0.76794487F;

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 243
		bodyModel[29].setRotationPoint(-40.25F, -41F, 2F);
		bodyModel[29].rotateAngleX = 0.62831853F;

		bodyModel[30].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 244
		bodyModel[30].setRotationPoint(-34F, -41F, 2F);
		bodyModel[30].rotateAngleX = 0.62831853F;

		bodyModel[31].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 245
		bodyModel[31].setRotationPoint(-46.5F, -41F, 2F);
		bodyModel[31].rotateAngleX = 0.62831853F;

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[32].setRotationPoint(-34F, -39F, 3.5F);
		bodyModel[32].rotateAngleX = 0.27925268F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[33].setRotationPoint(-40.25F, -39F, 3.5F);
		bodyModel[33].rotateAngleX = 0.27925268F;

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[34].setRotationPoint(-46.5F, -39F, 3.5F);
		bodyModel[34].rotateAngleX = 0.27925268F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 249
		bodyModel[35].setRotationPoint(7.25F, -40F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 250
		bodyModel[36].setRotationPoint(7.25F, -39.7F, 2F);
		bodyModel[36].rotateAngleX = 0.62831853F;

		bodyModel[37].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[37].setRotationPoint(7.25F, -37.7F, -3.5F);
		bodyModel[37].rotateAngleX = -0.33161256F;

		bodyModel[38].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 252
		bodyModel[38].setRotationPoint(7.25F, -39.7F, -2F);
		bodyModel[38].rotateAngleX = -0.62831853F;

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[39].setRotationPoint(7.25F, -37.7F, 3.5F);
		bodyModel[39].rotateAngleX = 0.33161256F;

		bodyModel[40].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[40].setRotationPoint(23F, -35F, 3.5F);
		bodyModel[40].rotateAngleX = 0.33161256F;

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[41].setRotationPoint(23F, -35F, -3.5F);
		bodyModel[41].rotateAngleX = -0.33161256F;

		bodyModel[42].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 256
		bodyModel[42].setRotationPoint(23F, -37F, -2F);
		bodyModel[42].rotateAngleX = -0.62831853F;

		bodyModel[43].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 257
		bodyModel[43].setRotationPoint(23F, -37.3F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 258
		bodyModel[44].setRotationPoint(23F, -37F, 2F);
		bodyModel[44].rotateAngleX = 0.62831853F;

		bodyModel[45].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 259
		bodyModel[45].setRotationPoint(-5F, -40F, -2.7F);
		bodyModel[45].rotateAngleX = -0.62831853F;
		bodyModel[45].rotateAngleZ = -0.10471976F;

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 260
		bodyModel[46].setRotationPoint(-5F, -40F, 2.7F);
		bodyModel[46].rotateAngleX = 0.62831853F;
		bodyModel[46].rotateAngleZ = -0.10471976F;

		bodyModel[47].addShapeBox(0F, 0F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 261
		bodyModel[47].setRotationPoint(8F, -38.5F, 3.2F);
		bodyModel[47].rotateAngleX = -0.62831853F;
		bodyModel[47].rotateAngleY = -0.05235988F;
		bodyModel[47].rotateAngleZ = -0.10471976F;

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 262
		bodyModel[48].setRotationPoint(8F, -38.5F, -2.7F);
		bodyModel[48].rotateAngleX = -0.62831853F;
		bodyModel[48].rotateAngleY = 0.05235988F;
		bodyModel[48].rotateAngleZ = -0.10471976F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 91, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[49].setRotationPoint(-58F, -29F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 70, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[50].setRotationPoint(-49F, -32F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 2F, 0F, 0.5F, 3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[51].setRotationPoint(21F, -32F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0.5F, 3.5F, 0F, 1.4F, 4.5F, 0F, 1.4F, -4.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[52].setRotationPoint(25F, -32F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 1.1F, 4F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[53].setRotationPoint(-56F, -33F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 1F, 7F, 0F, 0.1F, 4F, 0F, 0F, -4F, 0F, 0.2F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[54].setRotationPoint(-58F, -34F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 269
		bodyModel[55].setRotationPoint(-52F, -39.5F, 2.5F);
		bodyModel[55].rotateAngleZ = 0.15707963F;

		bodyModel[56].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 270
		bodyModel[56].setRotationPoint(-52F, -39.5F, 2.5F);
		bodyModel[56].rotateAngleZ = 0.59341195F;

		bodyModel[57].addShapeBox(-7F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 271
		bodyModel[57].setRotationPoint(-53.5F, -38.5F, 2.5F);
		bodyModel[57].rotateAngleZ = 0.76794487F;

		bodyModel[58].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 272
		bodyModel[58].setRotationPoint(-46.5F, -40F, 2.7F);
		bodyModel[58].rotateAngleX = 0.62831853F;

		bodyModel[59].addShapeBox(0F, 0F, -0.5F, 18, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F); // Box 273
		bodyModel[59].setRotationPoint(-23F, -39F, 3.5F);
		bodyModel[59].rotateAngleX = 0.27925268F;

		bodyModel[60].addShapeBox(0F, 0F, -0.5F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 274
		bodyModel[60].setRotationPoint(-23F, -41F, 2F);
		bodyModel[60].rotateAngleX = 0.62831853F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 275
		bodyModel[61].setRotationPoint(-7.5F, -56.5F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 277
		bodyModel[62].setRotationPoint(-18.5F, -44.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[63].setRotationPoint(-18.5F, -47.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[64].setRotationPoint(-18.5F, -48.5F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -1F); // Box 280
		bodyModel[65].setRotationPoint(-18.5F, -45.5F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F, -0.5F, 0F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, -0.5F, 0F, -1F); // Box 281
		bodyModel[66].setRotationPoint(-20.5F, -45.5F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F); // Box 282
		bodyModel[67].setRotationPoint(-20.5F, -47.5F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F); // Box 283
		bodyModel[68].setRotationPoint(-20.5F, -48.5F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F, -0.2F, -1F, -3.5F, -0.2F, -1F, 0F, 0F, -1F); // Box 284
		bodyModel[69].setRotationPoint(-15.5F, -45.5F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 285
		bodyModel[70].setRotationPoint(-15.5F, -47.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, -3.5F, -0.2F, -1F, -3.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0F, 0F, 0F); // Box 286
		bodyModel[71].setRotationPoint(-15.5F, -48.5F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 11, 8, 3, 0F,-1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -3F, 0F, 6F, -0.5F, 0F, 6F, 0.5F, 1F, 0F, -1.5F, 0F); // Box 100
		bodyModel[72].setRotationPoint(-46F, -23F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 41, 8, 3, 0F,0F, 0F, 0F, -19F, -1F, 0F, -19F, 0F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -6F, 0.5F, 1F); // Box 101
		bodyModel[73].setRotationPoint(-35F, -23F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 33, 8, 3, 0F,0F, -1F, 0F, -7.5F, -4.5F, 3.5F, 0F, -5F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -7.5F, -1.5F, 3.5F, 0F, -0.5F, 0.5F, -19F, 1F, 2F); // Box 102
		bodyModel[74].setRotationPoint(-13F, -23F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[75].setRotationPoint(-37.5F, -38F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[76].setRotationPoint(-37.5F, -34F, -2F);
		bodyModel[76].rotateAngleZ = -0.12217305F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[77].setRotationPoint(-46.5F, -25F, -2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 183
		bodyModel[78].setRotationPoint(8.5F, -34F, -2F);
		bodyModel[78].rotateAngleZ = 0.12217305F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 184
		bodyModel[79].setRotationPoint(8.5F, -38F, -1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 185
		bodyModel[80].setRotationPoint(11.5F, -25F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 6, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F); // Box 221
		bodyModel[81].setRotationPoint(-63.8F, -31F, -10F);
		bodyModel[81].rotateAngleZ = 0.27925268F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[82].setRotationPoint(-52F, -34.2F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[83].setRotationPoint(-54.5F, -34F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[84].setRotationPoint(-53F, -37.05F, -1F);

		bodyModel[85].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[85].setRotationPoint(-55F, -33F, -9.5F);
		bodyModel[85].rotateAngleZ = 0.27925268F;

		bodyModel[86].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[86].setRotationPoint(-55F, -33F, -10.5F);
		bodyModel[86].rotateAngleZ = 0.27925268F;

		bodyModel[87].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[87].setRotationPoint(-55F, -33F, -9F);
		bodyModel[87].rotateAngleZ = 0.27925268F;

		bodyModel[88].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[88].setRotationPoint(-55F, -33F, -11F);
		bodyModel[88].rotateAngleZ = 0.27925268F;

		bodyModel[89].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[89].setRotationPoint(-55F, -33F, -10F);
		bodyModel[89].rotateAngleZ = 0.27925268F;

		bodyModel[90].addShapeBox(10F, 0F, 0F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 301
		bodyModel[90].setRotationPoint(27F, -33F, -0.5F);
		bodyModel[90].rotateAngleZ = 0.36651914F;

		bodyModel[91].addShapeBox(-3F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[91].setRotationPoint(27F, -33.5F, -1F);
		bodyModel[91].rotateAngleZ = 0.36651914F;

		bodyModel[92].addShapeBox(5F, 0F, 0F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 212
		bodyModel[92].setRotationPoint(27F, -33F, -0.5F);
		bodyModel[92].rotateAngleZ = 0.36651914F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 214
		bodyModel[93].setRotationPoint(-22.5F, -38F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 215
		bodyModel[94].setRotationPoint(-22.5F, -34F, -2F);
		bodyModel[94].rotateAngleZ = -0.12217305F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 216
		bodyModel[95].setRotationPoint(-31.5F, -25F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 8, 3, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1.5F, 0F, 6F, 0.5F, 1F, 6F, -0.5F, 0F, -1.5F, -3F, 0F); // Box 222
		bodyModel[96].setRotationPoint(-46F, -23F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 41, 8, 3, 0F,0F, 0.5F, 0F, -19F, 0F, 0F, -19F, -1F, 0F, 0F, 0F, 0F, -6F, 0.5F, 1F, 0F, 1F, 2F, 0F, 0F, 0F, -6F, -0.5F, 0F); // Box 223
		bodyModel[97].setRotationPoint(-35F, -23F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 33, 8, 3, 0F,0F, 0F, 0F, 0F, -5F, 0F, -7.5F, -4.5F, 3.5F, 0F, -1F, 0F, -19F, 1F, 2F, 0F, -0.5F, 0.5F, -7.5F, -1.5F, 3.5F, -19F, 0F, 0F); // Box 224
		bodyModel[98].setRotationPoint(-13F, -23F, 8F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		noseModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 187
		noseModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 189
		noseModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 190
		noseModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 191
		noseModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 192
		noseModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 193
		noseModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 194
		noseModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 195
		noseModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 196
		noseModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 197
		noseModel[12] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 296

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 10, 12, 0F,0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 186
		noseModel[0].setRotationPoint(-79F, -27F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, -4F, 0F, 1.7F, -3F, 0F, 1.7F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0F); // Box 187
		noseModel[1].setRotationPoint(-79F, -32F, -6F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0.5F, -4F); // Box 188
		noseModel[2].setRotationPoint(-79F, -17F, -6F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 12, 7, 12, 0F,0F, 0F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -2.5F); // Box 189
		noseModel[3].setRotationPoint(-91F, -25.5F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, -2F, -4.5F, 0F, 1.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2.5F); // Box 190
		noseModel[4].setRotationPoint(-91F, -30.5F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, -2.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, -4.5F); // Box 191
		noseModel[5].setRotationPoint(-91F, -18.5F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F); // Box 192
		noseModel[6].setRotationPoint(-97F, -25.5F, -3.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-2.5F, -1.7F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, -1.7F, -2.5F, 0F, 2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F); // Box 193
		noseModel[7].setRotationPoint(-97F, -28.5F, -3.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, -2.5F, -1.7F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, -1.7F, -2.5F); // Box 194
		noseModel[8].setRotationPoint(-97F, -18.5F, -3.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 195
		noseModel[9].setRotationPoint(-101F, -22.5F, -0.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.6F, 0.6F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.6F, 0.6F); // Box 196
		noseModel[10].setRotationPoint(-103F, -22.5F, -0.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 197
		noseModel[11].setRotationPoint(-81F, -17F, 5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 296
		noseModel[12].setRotationPoint(-81F, -17F, -6F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 212
		tailModel[1] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 213
		tailModel[2] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 214
		tailModel[3] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 215
		tailModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 216
		tailModel[5] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 217
		tailModel[6] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 218
		tailModel[7] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 219
		tailModel[8] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 220
		tailModel[9] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 221
		tailModel[10] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 222
		tailModel[11] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 223
		tailModel[12] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 224
		tailModel[13] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 225
		tailModel[14] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 226
		tailModel[15] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 276
		tailModel[16] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 217
		tailModel[17] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 218
		tailModel[18] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 219
		tailModel[19] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 220
		tailModel[20] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 221

		tailModel[0].addShapeBox(0F, 0F, 0F, 30, 5, 8, 0F,0F, 0.5F, 4F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0.5F, 4F, 0F, -0.5F, -0.5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -0.5F, -0.5F); // Box 212
		tailModel[0].setRotationPoint(36F, -15F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 30, 13, 8, 0F,0F, 0F, 4F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, 4F); // Box 213
		tailModel[1].setRotationPoint(36F, -29F, -4F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 30, 4, 8, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 4F); // Box 214
		tailModel[2].setRotationPoint(36F, -33F, -4F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 51, 11, 8, 0F,0F, 0F, 2F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, -3F, -3F, 0.5F, -3F, -3F, 0F, 0F, 2F); // Box 215
		tailModel[3].setRotationPoint(66F, -27.5F, -4F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 51, 3, 8, 0F,0F, 0.5F, -1F, 0.5F, -2F, -3.5F, 0.5F, -2F, -3.5F, 0F, 0.5F, -1F, 0F, 0F, 2F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, 2F); // Box 216
		tailModel[4].setRotationPoint(66F, -30.5F, -4F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 51, 3, 8, 0F,0F, 0F, 2F, 0.5F, 3F, -3F, 0.5F, 3F, -3F, 0F, 0F, 2F, 0F, 1F, -1F, -2.5F, -4F, -3.5F, -2.5F, -4F, -3.5F, 0F, 1F, -1F); // Box 217
		tailModel[5].setRotationPoint(66F, -16.5F, -4F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F); // Box 218
		tailModel[6].setRotationPoint(87F, -28.5F, -6F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 26, 2, 21, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		tailModel[7].setRotationPoint(87F, -28.5F, -27F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 21, 2, 9, 0F,-3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		tailModel[8].setRotationPoint(92F, -28.5F, -36F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,-4F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 221
		tailModel[9].setRotationPoint(95F, -28.5F, -43F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		tailModel[10].setRotationPoint(99F, -28.5F, -46F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 12, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		tailModel[11].setRotationPoint(96F, -60F, -0.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 5, 31, 1, 0F,0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		tailModel[12].setRotationPoint(108F, -60F, -0.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,-9F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F); // Box 225
		tailModel[13].setRotationPoint(85F, -60F, -0.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, -2.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 226
		tailModel[14].setRotationPoint(64F, -33F, -0.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,55F, -0.4F, -0.4F, 55F, 1.6F, -0.4F, 55F, 1.6F, -0.4F, 55F, -0.4F, -0.4F, 55F, -0.4F, -0.4F, 55F, -2.4F, -0.4F, 55F, -2.4F, -0.4F, 55F, -0.4F, -0.4F); // Box 276
		tailModel[15].setRotationPoint(48F, -56.5F, -0.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		tailModel[16].setRotationPoint(87F, -28.5F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 26, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 218
		tailModel[17].setRotationPoint(87F, -28.5F, 6F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 21, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F); // Box 219
		tailModel[18].setRotationPoint(92F, -28.5F, 27F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // Box 220
		tailModel[19].setRotationPoint(95F, -28.5F, 36F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 221
		tailModel[20].setRotationPoint(99F, -28.5F, 43F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 103
		leftWingModel[1] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 104
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 105
		leftWingModel[3] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 107
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 201
		leftWingModel[5] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 202
		leftWingModel[6] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 203
		leftWingModel[7] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 204
		leftWingModel[8] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 205
		leftWingModel[9] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 206
		leftWingModel[10] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 140
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 141
		leftWingModel[12] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 142
		leftWingModel[13] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 143
		leftWingModel[14] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 144
		leftWingModel[15] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 145
		leftWingModel[16] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 146
		leftWingModel[17] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 147
		leftWingModel[18] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 148
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 149
		leftWingModel[20] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 150
		leftWingModel[21] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 151
		leftWingModel[22] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 152
		leftWingModel[23] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 153
		leftWingModel[24] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 154
		leftWingModel[25] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 155
		leftWingModel[26] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 156
		leftWingModel[27] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 157
		leftWingModel[28] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 158
		leftWingModel[29] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 159
		leftWingModel[30] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 160
		leftWingModel[31] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 174
		leftWingModel[32] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 175
		leftWingModel[33] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 176
		leftWingModel[34] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 177
		leftWingModel[35] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 178
		leftWingModel[36] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 179
		leftWingModel[37] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 205
		leftWingModel[38] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 206
		leftWingModel[39] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 207
		leftWingModel[40] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 208
		leftWingModel[41] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 274
		leftWingModel[42] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 275
		leftWingModel[43] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 276
		leftWingModel[44] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 277
		leftWingModel[45] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 278
		leftWingModel[46] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 279
		leftWingModel[47] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 280
		leftWingModel[48] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 281
		leftWingModel[49] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 282
		leftWingModel[50] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 283
		leftWingModel[51] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 299

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 11, 8, 76, 0F,-5.5F, 5.5F, 0F, 2.8F, 6.3F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -5.5F, -12F, 0F, 5.5F, -10.2F, 0F, 6F, -0.5F, 0F, -1.5F, -3F, 0F); // Box 103
		leftWingModel[0].setRotationPoint(-46F, -23F, -87F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 41, 8, 132, 0F,-5F, 11F, 0F, -27F, 11F, -1F, -19F, -1F, 0F, 0F, 0F, 0F, -5F, -17.5F, 0F, -27F, -17.5F, -1F, 0F, 0F, 0F, -6F, -0.5F, 0F); // Box 104
		leftWingModel[1].setRotationPoint(-35F, -23F, -143F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 33, 8, 132, 0F,8F, 11F, -1F, -33F, 9F, -13F, -7.5F, -4.5F, -3.5F, 0F, -1F, 0F, 8F, -17.5F, -1F, -33F, -15.5F, -13F, -7.5F, -1.5F, -3.5F, -19F, 0F, 0F); // Box 105
		leftWingModel[2].setRotationPoint(-13F, -23F, -143F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 11, 8, 56, 0F,-9.5F, 10F, -13F, 5F, 11F, 0F, 2.8F, 6.3F, 0F, -5.5F, 5.5F, 0F, -9.5F, -16.5F, -13F, 5F, -17.5F, 0F, 5.5F, -10.2F, 0F, -5.5F, -12F, 0F); // Box 107
		leftWingModel[3].setRotationPoint(-46F, -23F, -143F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 201
		leftWingModel[4].setRotationPoint(-72.5F, -20F, -42F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 202
		leftWingModel[5].setRotationPoint(-72.5F, -23F, -42F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 203
		leftWingModel[6].setRotationPoint(-72.5F, -17F, -42F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F); // Box 204
		leftWingModel[7].setRotationPoint(-77.5F, -19.5F, -41.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,-0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F); // Box 205
		leftWingModel[8].setRotationPoint(-77.5F, -21.5F, -41.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F, -0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F); // Box 206
		leftWingModel[9].setRotationPoint(-77.5F, -16.5F, -41.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 140
		leftWingModel[10].setRotationPoint(-63.5F, -21F, -48F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 141
		leftWingModel[11].setRotationPoint(-63.5F, -28F, -48F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F); // Box 142
		leftWingModel[12].setRotationPoint(-63.5F, -14F, -48F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 143
		leftWingModel[13].setRotationPoint(-65.5F, -28F, -41F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 144
		leftWingModel[14].setRotationPoint(-65.5F, -21F, -48F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 145
		leftWingModel[15].setRotationPoint(-65.5F, -21F, -31F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		leftWingModel[16].setRotationPoint(-65.5F, -11F, -41F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 147
		leftWingModel[17].setRotationPoint(-65.5F, -11F, -48F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F); // Box 148
		leftWingModel[18].setRotationPoint(-65.5F, -28F, -48F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F); // Box 149
		leftWingModel[19].setRotationPoint(-65.5F, -28F, -34F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F); // Box 150
		leftWingModel[20].setRotationPoint(-65.5F, -11F, -34F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftWingModel[21].setRotationPoint(-53.5F, -27.75F, -42F);
		leftWingModel[21].rotateAngleX = -0.78539816F;
		leftWingModel[21].rotateAngleY = -0.27925268F;
		leftWingModel[21].rotateAngleZ = 0.20943951F;

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F); // Box 152
		leftWingModel[22].setRotationPoint(-48.5F, -14F, -48F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		leftWingModel[23].setRotationPoint(-48.5F, -21F, -48F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		leftWingModel[24].setRotationPoint(-48.5F, -28F, -48F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 17, 7, 21, 0F,0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -3.5F, -8.5F, 0F, -3.5F, -8.5F, 0F, -0.5F, -7.5F); // Box 155
		leftWingModel[25].setRotationPoint(-26.5F, -14F, -48F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 156
		leftWingModel[26].setRotationPoint(-26.5F, -21F, -47.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, -7F, 0F, -2.5F, -8F, 0F, -2.5F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 157
		leftWingModel[27].setRotationPoint(-26.5F, -28F, -47.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 21, 7, 16, 0F,0F, 0F, 0F, 0F, -4F, -7.5F, 0F, -4F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, 0F, 0F); // Box 158
		leftWingModel[28].setRotationPoint(-9.5F, -22F, -45.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 21, 7, 20, 0F,0F, -2.5F, -8F, -7F, -7.5F, -9.5F, -7F, -7.5F, -9.5F, 0F, -2.5F, -8F, 0F, -1F, -2F, 0F, 3F, -9.5F, 0F, 3F, -9.5F, 0F, -1F, -2F); // Box 159
		leftWingModel[29].setRotationPoint(-9.5F, -28F, -47.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 21, 7, 20, 0F,0F, -1F, -2F, 0F, 1F, -9.5F, 0F, 1F, -9.5F, 0F, -1F, -2F, 0F, -1.5F, -8F, -7F, -5F, -9.5F, -7F, -5F, -9.5F, 0F, -1.5F, -8F); // Box 160
		leftWingModel[30].setRotationPoint(-9.5F, -16F, -47.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftWingModel[31].setRotationPoint(-51.5F, -6F, -40F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingModel[32].setRotationPoint(-47.5F, -8F, -40F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 176
		leftWingModel[33].setRotationPoint(-51.5F, -3F, -40F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftWingModel[34].setRotationPoint(-51.5F, -5F, -40F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[35].setRotationPoint(-51.5F, -5F, -36F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftWingModel[36].setRotationPoint(-53.5F, -17.75F, -48.5F);
		leftWingModel[36].rotateAngleY = -0.27925268F;
		leftWingModel[36].rotateAngleZ = -0.08726646F;

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		leftWingModel[37].setRotationPoint(-53F, -29F, -92F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 206
		leftWingModel[38].setRotationPoint(-62F, -29F, -92F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 207
		leftWingModel[39].setRotationPoint(-41F, -29F, -92F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 208
		leftWingModel[40].setRotationPoint(-36.5F, -32.4F, -120F);

		leftWingModel[41].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		leftWingModel[41].setRotationPoint(-53.5F, -27.75F, -42F);
		leftWingModel[41].rotateAngleX = -0.78539816F;
		leftWingModel[41].rotateAngleY = -0.27925268F;
		leftWingModel[41].rotateAngleZ = 0.20943951F;

		leftWingModel[42].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftWingModel[42].setRotationPoint(-53.5F, -27.75F, -42F);
		leftWingModel[42].rotateAngleX = -0.78539816F;
		leftWingModel[42].rotateAngleY = -0.27925268F;
		leftWingModel[42].rotateAngleZ = 0.20943951F;

		leftWingModel[43].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftWingModel[43].setRotationPoint(-53.5F, -17.75F, -48.5F);
		leftWingModel[43].rotateAngleY = -0.27925268F;
		leftWingModel[43].rotateAngleZ = -0.08726646F;

		leftWingModel[44].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		leftWingModel[44].setRotationPoint(-53.5F, -17.75F, -48.5F);
		leftWingModel[44].rotateAngleY = -0.27925268F;
		leftWingModel[44].rotateAngleZ = -0.08726646F;

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		leftWingModel[45].setRotationPoint(-53.5F, -17.75F, -27.5F);
		leftWingModel[45].rotateAngleY = 0.27925268F;
		leftWingModel[45].rotateAngleZ = -0.08726646F;

		leftWingModel[46].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		leftWingModel[46].setRotationPoint(-53.5F, -17.75F, -27.5F);
		leftWingModel[46].rotateAngleY = 0.27925268F;
		leftWingModel[46].rotateAngleZ = -0.08726646F;

		leftWingModel[47].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftWingModel[47].setRotationPoint(-53.5F, -17.75F, -27.5F);
		leftWingModel[47].rotateAngleY = 0.27925268F;
		leftWingModel[47].rotateAngleZ = -0.08726646F;

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		leftWingModel[48].setRotationPoint(-53.5F, -27.25F, -33.5F);
		leftWingModel[48].rotateAngleX = 0.78539816F;
		leftWingModel[48].rotateAngleY = 0.27925268F;
		leftWingModel[48].rotateAngleZ = 0.20943951F;

		leftWingModel[49].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftWingModel[49].setRotationPoint(-53.5F, -27.25F, -33.5F);
		leftWingModel[49].rotateAngleX = 0.78539816F;
		leftWingModel[49].rotateAngleY = 0.27925268F;
		leftWingModel[49].rotateAngleZ = 0.20943951F;

		leftWingModel[50].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		leftWingModel[50].setRotationPoint(-53.5F, -27.25F, -33.5F);
		leftWingModel[50].rotateAngleX = 0.78539816F;
		leftWingModel[50].rotateAngleY = 0.27925268F;
		leftWingModel[50].rotateAngleZ = 0.20943951F;

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 2F, 0F, 0F, 0.8F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 299
		leftWingModel[51].setRotationPoint(-36.5F, -29.2F, -120F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 233
		rightWingModel[1] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 234
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 235
		rightWingModel[3] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 236
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 237
		rightWingModel[5] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 238
		rightWingModel[6] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 239
		rightWingModel[7] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 240
		rightWingModel[8] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 241
		rightWingModel[9] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 242
		rightWingModel[10] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 243
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 244
		rightWingModel[12] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 245
		rightWingModel[13] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 246
		rightWingModel[14] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 247
		rightWingModel[15] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 248
		rightWingModel[16] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 249
		rightWingModel[17] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 250
		rightWingModel[18] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 251
		rightWingModel[19] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 252
		rightWingModel[20] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 253
		rightWingModel[21] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 255
		rightWingModel[22] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 256
		rightWingModel[23] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 257
		rightWingModel[24] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 258
		rightWingModel[25] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 259
		rightWingModel[26] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 260
		rightWingModel[27] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 261
		rightWingModel[28] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 262
		rightWingModel[29] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 263
		rightWingModel[30] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 264
		rightWingModel[31] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 265
		rightWingModel[32] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 266
		rightWingModel[33] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 267
		rightWingModel[34] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 268
		rightWingModel[35] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 273
		rightWingModel[36] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 284
		rightWingModel[37] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 285
		rightWingModel[38] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 286
		rightWingModel[39] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 287
		rightWingModel[40] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 288
		rightWingModel[41] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 289
		rightWingModel[42] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 290
		rightWingModel[43] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 291
		rightWingModel[44] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 292
		rightWingModel[45] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 293
		rightWingModel[46] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 294
		rightWingModel[47] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 295
		rightWingModel[48] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 297

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 11, 8, 76, 0F,-1.5F, -2F, 0F, 0F, 0F, 0F, 2.8F, 6.3F, 0F, -5.5F, 5.5F, 0F, -1.5F, -3F, 0F, 6F, -0.5F, 0F, 5.5F, -10.2F, 0F, -5.5F, -12F, 0F); // Box 233
		rightWingModel[0].setRotationPoint(-46F, -23F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 41, 8, 132, 0F,0F, 0F, 0F, -19F, -1F, 0F, -27F, 11F, -1F, -5F, 11F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, -27F, -17.5F, -1F, -5F, -17.5F, 0F); // Box 234
		rightWingModel[1].setRotationPoint(-35F, -23F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 33, 8, 132, 0F,0F, -1F, 0F, -7.5F, -4.5F, -3.5F, -33F, 9F, -13F, 8F, 11F, -1F, -19F, 0F, 0F, -7.5F, -1.5F, -3.5F, -33F, -15.5F, -13F, 8F, -17.5F, -1F); // Box 235
		rightWingModel[2].setRotationPoint(-13F, -23F, 11F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 11, 8, 56, 0F,-5.5F, 5.5F, 0F, 2.8F, 6.3F, 0F, 5F, 11F, 0F, -9.5F, 10F, -13F, -5.5F, -12F, 0F, 5.5F, -10.2F, 0F, 5F, -17.5F, 0F, -9.5F, -16.5F, -13F); // Box 236
		rightWingModel[3].setRotationPoint(-46F, -23F, 87F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 237
		rightWingModel[4].setRotationPoint(-72.5F, -20F, 33F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 238
		rightWingModel[5].setRotationPoint(-72.5F, -23F, 33F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 13, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 239
		rightWingModel[6].setRotationPoint(-72.5F, -17F, 33F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F); // Box 240
		rightWingModel[7].setRotationPoint(-77.5F, -19.5F, 33.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,-0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F); // Box 241
		rightWingModel[8].setRotationPoint(-77.5F, -21.5F, 33.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F, -0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F); // Box 242
		rightWingModel[9].setRotationPoint(-77.5F, -16.5F, 33.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 243
		rightWingModel[10].setRotationPoint(-63.5F, -21F, 27F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 244
		rightWingModel[11].setRotationPoint(-63.5F, -28F, 27F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F); // Box 245
		rightWingModel[12].setRotationPoint(-63.5F, -14F, 27F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		rightWingModel[13].setRotationPoint(-65.5F, -28F, 34F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 247
		rightWingModel[14].setRotationPoint(-65.5F, -21F, 44F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		rightWingModel[15].setRotationPoint(-65.5F, -21F, 27F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 249
		rightWingModel[16].setRotationPoint(-65.5F, -11F, 34F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F); // Box 250
		rightWingModel[17].setRotationPoint(-65.5F, -11F, 41F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F); // Box 251
		rightWingModel[18].setRotationPoint(-65.5F, -28F, 41F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F); // Box 252
		rightWingModel[19].setRotationPoint(-65.5F, -28F, 27F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 253
		rightWingModel[20].setRotationPoint(-65.5F, -11F, 27F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F); // Box 255
		rightWingModel[21].setRotationPoint(-48.5F, -14F, 27F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 256
		rightWingModel[22].setRotationPoint(-48.5F, -21F, 27F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 22, 7, 21, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		rightWingModel[23].setRotationPoint(-48.5F, -28F, 27F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 17, 7, 21, 0F,0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -3.5F, -8.5F, 0F, -3.5F, -8.5F, 0F, -0.5F, -7.5F); // Box 258
		rightWingModel[24].setRotationPoint(-26.5F, -14F, 27F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 259
		rightWingModel[25].setRotationPoint(-26.5F, -21F, 27.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, 0F, -7F, 0F, -2.5F, -8F, 0F, -2.5F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 260
		rightWingModel[26].setRotationPoint(-26.5F, -28F, 27.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 21, 7, 16, 0F,0F, 0F, 0F, 0F, -4F, -7.5F, 0F, -4F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, 0F, 0F); // Box 261
		rightWingModel[27].setRotationPoint(-9.5F, -22F, 29.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 21, 7, 20, 0F,0F, -2.5F, -8F, -7F, -7.5F, -9.5F, -7F, -7.5F, -9.5F, 0F, -2.5F, -8F, 0F, -1F, -2F, 0F, 3F, -9.5F, 0F, 3F, -9.5F, 0F, -1F, -2F); // Box 262
		rightWingModel[28].setRotationPoint(-9.5F, -28F, 27.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 21, 7, 20, 0F,0F, -1F, -2F, 0F, 1F, -9.5F, 0F, 1F, -9.5F, 0F, -1F, -2F, 0F, -1.5F, -8F, -7F, -5F, -9.5F, -7F, -5F, -9.5F, 0F, -1.5F, -8F); // Box 263
		rightWingModel[29].setRotationPoint(-9.5F, -16F, 27.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightWingModel[30].setRotationPoint(-51.5F, -6F, 35F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightWingModel[31].setRotationPoint(-47.5F, -8F, 35F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		rightWingModel[32].setRotationPoint(-51.5F, -3F, 35F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightWingModel[33].setRotationPoint(-51.5F, -5F, 39F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightWingModel[34].setRotationPoint(-51.5F, -5F, 35F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[35].setRotationPoint(-36.5F, -32.2F, 95F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightWingModel[36].setRotationPoint(-53.5F, -17.75F, 47.5F);
		rightWingModel[36].rotateAngleY = 0.27925268F;
		rightWingModel[36].rotateAngleZ = -0.08726646F;

		rightWingModel[37].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[37].setRotationPoint(-53.5F, -17.75F, 47.5F);
		rightWingModel[37].rotateAngleY = 0.27925268F;
		rightWingModel[37].rotateAngleZ = -0.08726646F;

		rightWingModel[38].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightWingModel[38].setRotationPoint(-53.5F, -17.75F, 47.5F);
		rightWingModel[38].rotateAngleY = 0.27925268F;
		rightWingModel[38].rotateAngleZ = -0.08726646F;

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightWingModel[39].setRotationPoint(-53.5F, -17.75F, 26.5F);
		rightWingModel[39].rotateAngleY = -0.27925268F;
		rightWingModel[39].rotateAngleZ = -0.08726646F;

		rightWingModel[40].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightWingModel[40].setRotationPoint(-53.5F, -17.75F, 26.5F);
		rightWingModel[40].rotateAngleY = -0.27925268F;
		rightWingModel[40].rotateAngleZ = -0.08726646F;

		rightWingModel[41].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		rightWingModel[41].setRotationPoint(-53.5F, -17.75F, 26.5F);
		rightWingModel[41].rotateAngleY = -0.27925268F;
		rightWingModel[41].rotateAngleZ = -0.08726646F;

		rightWingModel[42].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightWingModel[42].setRotationPoint(-53.5F, -27.75F, 33F);
		rightWingModel[42].rotateAngleX = -0.78539816F;
		rightWingModel[42].rotateAngleY = -0.27925268F;
		rightWingModel[42].rotateAngleZ = 0.20943951F;

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightWingModel[43].setRotationPoint(-53.5F, -27.75F, 33F);
		rightWingModel[43].rotateAngleX = -0.78539816F;
		rightWingModel[43].rotateAngleY = -0.27925268F;
		rightWingModel[43].rotateAngleZ = 0.20943951F;

		rightWingModel[44].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightWingModel[44].setRotationPoint(-53.5F, -27.75F, 33F);
		rightWingModel[44].rotateAngleX = -0.78539816F;
		rightWingModel[44].rotateAngleY = -0.27925268F;
		rightWingModel[44].rotateAngleZ = 0.20943951F;

		rightWingModel[45].addShapeBox(0F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightWingModel[45].setRotationPoint(-53.5F, -27.25F, 41.5F);
		rightWingModel[45].rotateAngleX = 0.78539816F;
		rightWingModel[45].rotateAngleY = 0.27925268F;
		rightWingModel[45].rotateAngleZ = 0.20943951F;

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightWingModel[46].setRotationPoint(-53.5F, -27.25F, 41.5F);
		rightWingModel[46].rotateAngleX = 0.78539816F;
		rightWingModel[46].rotateAngleY = 0.27925268F;
		rightWingModel[46].rotateAngleZ = 0.20943951F;

		rightWingModel[47].addShapeBox(0F, 1.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		rightWingModel[47].setRotationPoint(-53.5F, -27.25F, 41.5F);
		rightWingModel[47].rotateAngleX = 0.78539816F;
		rightWingModel[47].rotateAngleY = 0.27925268F;
		rightWingModel[47].rotateAngleZ = 0.20943951F;

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 297
		rightWingModel[48].setRotationPoint(-36.5F, -29.2F, 95F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 106
		yawFlapModel[1] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 107
		yawFlapModel[2] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[0].setRotationPoint(-52F, -19.8F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.43633231F;

		yawFlapModel[1].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[1].setRotationPoint(-52F, -19.8F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[2].setRotationPoint(-52F, -19.8F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -15F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-48F, -18.5F, 0F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 296
		tailWheelModel[1] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 297
		tailWheelModel[2] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 298
		tailWheelModel[3] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 299
		tailWheelModel[4] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 300
		tailWheelModel[5] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 191

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		tailWheelModel[0].setRotationPoint(85F, -18F, -2F);
		tailWheelModel[0].rotateAngleX = -0.17453293F;
		tailWheelModel[0].rotateAngleZ = 0.15707963F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 297
		tailWheelModel[1].setRotationPoint(89F, -17F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 298
		tailWheelModel[2].setRotationPoint(89.5F, -8.5F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 299
		tailWheelModel[3].setRotationPoint(89.5F, -10F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F); // Box 300
		tailWheelModel[4].setRotationPoint(89.5F, -7F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		tailWheelModel[5].setRotationPoint(85F, -18F, 1F);
		tailWheelModel[5].rotateAngleX = 0.17453293F;
		tailWheelModel[5].rotateAngleZ = 0.15707963F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 166
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 167
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 168
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 169
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 170
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 171
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 172
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 173

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 166
		leftWingWheelModel[0].setRotationPoint(-43.5F, 4F, -40F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingWheelModel[1].setRotationPoint(-43.5F, 0.5F, -40F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 168
		leftWingWheelModel[2].setRotationPoint(-43.5F, 7.5F, -40F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 169
		leftWingWheelModel[3].setRotationPoint(-39F, 5F, -41F);

		leftWingWheelModel[4].addShapeBox(-0.5F, -13F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		leftWingWheelModel[4].setRotationPoint(-38.5F, 5F, -35F);
		leftWingWheelModel[4].rotateAngleZ = -0.15707963F;

		leftWingWheelModel[5].addShapeBox(-0.5F, -13F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 171
		leftWingWheelModel[5].setRotationPoint(-37.5F, 0F, -35F);
		leftWingWheelModel[5].rotateAngleZ = -0.73303829F;

		leftWingWheelModel[6].addShapeBox(-0.5F, -5F, 0F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 172
		leftWingWheelModel[6].setRotationPoint(-38.5F, 5.5F, -35F);
		leftWingWheelModel[6].rotateAngleZ = 0.99483767F;

		leftWingWheelModel[7].addShapeBox(-0.5F, -5F, 0F, 1, 5, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 173
		leftWingWheelModel[7].setRotationPoint(-37.5F, 1F, -35F);
		leftWingWheelModel[7].rotateAngleZ = 2.00712864F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 225
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 226
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 227
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 228
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 229
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 230
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 231
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 232

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 225
		rightWingWheelModel[0].setRotationPoint(-43.5F, 4F, 36F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightWingWheelModel[1].setRotationPoint(-43.5F, 0.5F, 36F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 227
		rightWingWheelModel[2].setRotationPoint(-43.5F, 7.5F, 36F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 228
		rightWingWheelModel[3].setRotationPoint(-39F, 5F, 34F);

		rightWingWheelModel[4].addShapeBox(-0.5F, -13F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingWheelModel[4].setRotationPoint(-38.5F, 5F, 34F);
		rightWingWheelModel[4].rotateAngleZ = -0.15707963F;

		rightWingWheelModel[5].addShapeBox(-0.5F, -13F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 230
		rightWingWheelModel[5].setRotationPoint(-37.5F, 0F, 34F);
		rightWingWheelModel[5].rotateAngleZ = -0.73303829F;

		rightWingWheelModel[6].addShapeBox(-0.5F, -5F, 0F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 231
		rightWingWheelModel[6].setRotationPoint(-38.5F, 5.5F, 34F);
		rightWingWheelModel[6].rotateAngleZ = 0.99483767F;

		rightWingWheelModel[7].addShapeBox(-0.5F, -5F, 0F, 1, 5, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 232
		rightWingWheelModel[7].setRotationPoint(-37.5F, 1F, 34F);
		rightWingWheelModel[7].rotateAngleZ = 2.00712864F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-68F, -18F, -37.5F);
		propellerModels[1] = makeProp2(-68F, -18F, 37.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[0].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[1].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[2].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 7, 260, textureX, textureY);
		prop[0].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[1].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[2].addBox(-1F, -26F, -2F, 2, 26, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}