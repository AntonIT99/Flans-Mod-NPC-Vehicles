//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki45
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi45 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKi45() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[89];
		noseModel = new ModelRendererTurbo[13];
		tailModel = new ModelRendererTurbo[21];
		leftWingModel = new ModelRendererTurbo[37];
		rightWingModel = new ModelRendererTurbo[37];
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
		bodyModel[5] = new ModelRendererTurbo(this, 209, 282, textureX, textureY); // Box 204
		bodyModel[6] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 205
		bodyModel[7] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 206
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 207
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 208
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 209
		bodyModel[11] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 227
		bodyModel[12] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 228
		bodyModel[13] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 229
		bodyModel[14] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 230
		bodyModel[15] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 231
		bodyModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 232
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 233
		bodyModel[18] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 234
		bodyModel[19] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 235
		bodyModel[20] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 236
		bodyModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 237
		bodyModel[22] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 238
		bodyModel[23] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 239
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 240
		bodyModel[25] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 241
		bodyModel[26] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 242
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 243
		bodyModel[28] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 244
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 245
		bodyModel[30] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 246
		bodyModel[31] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 247
		bodyModel[32] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 248
		bodyModel[33] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 249
		bodyModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 250
		bodyModel[35] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 251
		bodyModel[36] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 252
		bodyModel[37] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 253
		bodyModel[38] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 254
		bodyModel[39] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 255
		bodyModel[40] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 256
		bodyModel[41] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 257
		bodyModel[42] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 258
		bodyModel[43] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 259
		bodyModel[44] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 260
		bodyModel[45] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 261
		bodyModel[46] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 262
		bodyModel[47] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 263
		bodyModel[48] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 264
		bodyModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 265
		bodyModel[50] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 266
		bodyModel[51] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 267
		bodyModel[52] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 268
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 269
		bodyModel[54] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 270
		bodyModel[55] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 271
		bodyModel[56] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 272
		bodyModel[57] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 273
		bodyModel[58] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 274
		bodyModel[59] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 275
		bodyModel[60] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 101
		bodyModel[62] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 183
		bodyModel[67] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 184
		bodyModel[68] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 185
		bodyModel[69] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 221
		bodyModel[70] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 222
		bodyModel[71] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 223
		bodyModel[72] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 224
		bodyModel[73] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 225
		bodyModel[74] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 226
		bodyModel[75] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 227
		bodyModel[76] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 228
		bodyModel[77] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 229
		bodyModel[78] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 301
		bodyModel[79] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 302
		bodyModel[80] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 212
		bodyModel[81] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 214
		bodyModel[82] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 215
		bodyModel[83] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 216
		bodyModel[84] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 222
		bodyModel[85] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 223
		bodyModel[86] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 224
		bodyModel[87] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 210
		bodyModel[88] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 211

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 12, 14, 0F,0F, 0.5F, 0.5F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0.5F); // Box 198
		bodyModel[0].setRotationPoint(-62F, -28F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0.2F, -4F, 0F, 0.7F, -3.5F, 0F, 1.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F); // Box 199
		bodyModel[1].setRotationPoint(-62F, -33.5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 5, 7, 0F,0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0.7F, -3.5F, 0F, 0.2F, -4F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0.5F); // Box 201
		bodyModel[2].setRotationPoint(-62F, -33.5F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -4.5F); // Box 202
		bodyModel[3].setRotationPoint(-62F, -16F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 203
		bodyModel[4].setRotationPoint(-58F, -29F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 94, 5, 8, 0F,0F, 0.5F, 4F, -16F, 0.5F, 4F, -16F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, -0.5F, -0.5F, -16F, -0.5F, -0.5F, -16F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 204
		bodyModel[5].setRotationPoint(-58F, -15F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[6].setRotationPoint(-49F, -32F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 1F, -4F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 1.1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[7].setRotationPoint(-56F, -33F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0.2F, -4.5F, 0F, 0F, -4F, 0F, 0.1F, 4F, 0F, 1F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[8].setRotationPoint(-58F, -34F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -2F, 0F, 0.5F, -3.5F, 0F, 0.5F, 3.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[9].setRotationPoint(5F, -32F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0.5F, -3.5F, 0F, 1.4F, -4.5F, 0F, 1.4F, 4.5F, 0F, 0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[10].setRotationPoint(9F, -32F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, -0.5F, 18, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[11].setRotationPoint(-28F, -39F, -3.5F);
		bodyModel[11].rotateAngleX = -0.27925268F;

		bodyModel[12].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[12].setRotationPoint(-34F, -39F, -3.5F);
		bodyModel[12].rotateAngleX = -0.27925268F;

		bodyModel[13].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[13].setRotationPoint(-48.5F, -38F, -3.5F);
		bodyModel[13].rotateAngleX = -0.27925268F;

		bodyModel[14].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 230
		bodyModel[14].setRotationPoint(-34F, -41F, -2F);
		bodyModel[14].rotateAngleX = -0.62831853F;

		bodyModel[15].addShapeBox(0F, 0F, -0.5F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 231
		bodyModel[15].setRotationPoint(-28F, -41F, -2F);
		bodyModel[15].rotateAngleX = -0.62831853F;

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 232
		bodyModel[16].setRotationPoint(-48.5F, -40F, -2F);
		bodyModel[16].rotateAngleX = -0.62831853F;

		bodyModel[17].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 233
		bodyModel[17].setRotationPoint(-48.5F, -40.3F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 24, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 234
		bodyModel[18].setRotationPoint(-34F, -41.3F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[19].setRotationPoint(-40.25F, -39F, -3.5F);
		bodyModel[19].rotateAngleX = -0.27925268F;

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 236
		bodyModel[20].setRotationPoint(-40.25F, -41F, -2F);
		bodyModel[20].rotateAngleX = -0.62831853F;

		bodyModel[21].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 237
		bodyModel[21].setRotationPoint(-40.25F, -41.3F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 238
		bodyModel[22].setRotationPoint(-46.5F, -40F, -2.7F);
		bodyModel[22].rotateAngleX = -0.62831853F;

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 239
		bodyModel[23].setRotationPoint(-52F, -39.5F, -2.5F);
		bodyModel[23].rotateAngleZ = 0.15707963F;

		bodyModel[24].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 240
		bodyModel[24].setRotationPoint(-52F, -39.5F, -2.5F);
		bodyModel[24].rotateAngleZ = 0.59341195F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 1, 1, 6, 0F,0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 241
		bodyModel[25].setRotationPoint(-52F, -40.2F, -2.5F);

		bodyModel[26].addShapeBox(-7F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 242
		bodyModel[26].setRotationPoint(-53.5F, -38.5F, -2.5F);
		bodyModel[26].rotateAngleZ = 0.76794487F;

		bodyModel[27].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 243
		bodyModel[27].setRotationPoint(-40.25F, -41F, 2F);
		bodyModel[27].rotateAngleX = 0.62831853F;

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 244
		bodyModel[28].setRotationPoint(-34F, -41F, 2F);
		bodyModel[28].rotateAngleX = 0.62831853F;

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 245
		bodyModel[29].setRotationPoint(-48.5F, -40F, 2F);
		bodyModel[29].rotateAngleX = 0.62831853F;

		bodyModel[30].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[30].setRotationPoint(-34F, -39F, 3.5F);
		bodyModel[30].rotateAngleX = 0.27925268F;

		bodyModel[31].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[31].setRotationPoint(-40.25F, -39F, 3.5F);
		bodyModel[31].rotateAngleX = 0.27925268F;

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[32].setRotationPoint(-48.5F, -38F, 3.5F);
		bodyModel[32].rotateAngleX = 0.27925268F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 249
		bodyModel[33].setRotationPoint(-4.75F, -40F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 250
		bodyModel[34].setRotationPoint(-4.75F, -39.7F, 2F);
		bodyModel[34].rotateAngleX = 0.62831853F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[35].setRotationPoint(-4.75F, -37.7F, -3.5F);
		bodyModel[35].rotateAngleX = -0.33161256F;

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 252
		bodyModel[36].setRotationPoint(-4.75F, -39.7F, -2F);
		bodyModel[36].rotateAngleX = -0.62831853F;

		bodyModel[37].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[37].setRotationPoint(-4.75F, -37.7F, 3.5F);
		bodyModel[37].rotateAngleX = 0.33161256F;

		bodyModel[38].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[38].setRotationPoint(7F, -36F, 3.5F);
		bodyModel[38].rotateAngleX = 0.26179939F;

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[39].setRotationPoint(7F, -36F, -3.5F);
		bodyModel[39].rotateAngleX = -0.26179939F;

		bodyModel[40].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 256
		bodyModel[40].setRotationPoint(7F, -38F, -2F);
		bodyModel[40].rotateAngleX = -0.62831853F;

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 257
		bodyModel[41].setRotationPoint(7F, -38.3F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 258
		bodyModel[42].setRotationPoint(7F, -38F, 2F);
		bodyModel[42].rotateAngleX = 0.62831853F;

		bodyModel[43].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 259
		bodyModel[43].setRotationPoint(-11F, -40F, -2.7F);
		bodyModel[43].rotateAngleX = -0.62831853F;
		bodyModel[43].rotateAngleZ = -0.17453293F;

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 260
		bodyModel[44].setRotationPoint(-11F, -40F, 2.7F);
		bodyModel[44].rotateAngleX = 0.62831853F;
		bodyModel[44].rotateAngleZ = -0.17453293F;

		bodyModel[45].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 261
		bodyModel[45].setRotationPoint(-4F, -38.5F, 3.2F);
		bodyModel[45].rotateAngleX = -0.62831853F;
		bodyModel[45].rotateAngleY = -0.05235988F;
		bodyModel[45].rotateAngleZ = -0.03490659F;

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 262
		bodyModel[46].setRotationPoint(-4F, -38.5F, -2.7F);
		bodyModel[46].rotateAngleX = -0.62831853F;
		bodyModel[46].rotateAngleY = 0.05235988F;
		bodyModel[46].rotateAngleZ = -0.03490659F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 75, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 263
		bodyModel[47].setRotationPoint(-58F, -29F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 54, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[48].setRotationPoint(-49F, -32F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 2F, 0F, 0.5F, 3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[49].setRotationPoint(5F, -32F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0.5F, 3.5F, 0F, 1.4F, 4.5F, 0F, 1.4F, -4.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[50].setRotationPoint(9F, -32F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 1.1F, 4F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[51].setRotationPoint(-56F, -33F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 1F, 7F, 0F, 0.1F, 4F, 0F, 0F, -4F, 0F, 0.2F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[52].setRotationPoint(-58F, -34F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 269
		bodyModel[53].setRotationPoint(-52F, -39.5F, 2.5F);
		bodyModel[53].rotateAngleZ = 0.15707963F;

		bodyModel[54].addShapeBox(-2F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 270
		bodyModel[54].setRotationPoint(-52F, -39.5F, 2.5F);
		bodyModel[54].rotateAngleZ = 0.59341195F;

		bodyModel[55].addShapeBox(-7F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 271
		bodyModel[55].setRotationPoint(-53.5F, -38.5F, 2.5F);
		bodyModel[55].rotateAngleZ = 0.76794487F;

		bodyModel[56].addShapeBox(0F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 272
		bodyModel[56].setRotationPoint(-46.5F, -40F, 2.7F);
		bodyModel[56].rotateAngleX = 0.62831853F;

		bodyModel[57].addShapeBox(0F, 0F, -0.5F, 18, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[57].setRotationPoint(-28F, -39F, 3.5F);
		bodyModel[57].rotateAngleX = 0.27925268F;

		bodyModel[58].addShapeBox(0F, 0F, -0.5F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 274
		bodyModel[58].setRotationPoint(-28F, -41F, 2F);
		bodyModel[58].rotateAngleX = 0.62831853F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 275
		bodyModel[59].setRotationPoint(-25.5F, -56.5F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 8, 3, 0F,-1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1.5F, -3F, 0F, 6F, -0.5F, 0F, 6F, 0.5F, 1F, 0F, -1.5F, 0F); // Box 100
		bodyModel[60].setRotationPoint(-46F, -23F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 41, 8, 3, 0F,0F, 0F, 0F, -19F, -1F, 0F, -19F, 0F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -6F, 0.5F, 1F); // Box 101
		bodyModel[61].setRotationPoint(-35F, -23F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 33, 8, 3, 0F,0F, -1F, 0F, -7.5F, -4.5F, 3.5F, 0F, -5F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -7.5F, -1.5F, 3.5F, 0F, -0.5F, 0.5F, -19F, 1F, 2F); // Box 102
		bodyModel[62].setRotationPoint(-13F, -23F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[63].setRotationPoint(-37.5F, -38F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[64].setRotationPoint(-37.5F, -34F, -2F);
		bodyModel[64].rotateAngleZ = -0.12217305F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[65].setRotationPoint(-46.5F, -25F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 183
		bodyModel[66].setRotationPoint(-3.5F, -34F, -2F);
		bodyModel[66].rotateAngleZ = 0.12217305F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 184
		bodyModel[67].setRotationPoint(-3.5F, -38F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 185
		bodyModel[68].setRotationPoint(-0.5F, -25F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 6, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F, 0F, 0.8F, -2.5F); // Box 221
		bodyModel[69].setRotationPoint(-63.8F, -31F, -10F);
		bodyModel[69].rotateAngleZ = 0.27925268F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[70].setRotationPoint(-52F, -34.2F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[71].setRotationPoint(-54.5F, -34F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[72].setRotationPoint(-53F, -37.05F, -1F);

		bodyModel[73].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[73].setRotationPoint(-55F, -33F, -9.5F);
		bodyModel[73].rotateAngleZ = 0.27925268F;

		bodyModel[74].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[74].setRotationPoint(-55F, -33F, -10.5F);
		bodyModel[74].rotateAngleZ = 0.27925268F;

		bodyModel[75].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[75].setRotationPoint(-55F, -33F, -9F);
		bodyModel[75].rotateAngleZ = 0.27925268F;

		bodyModel[76].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[76].setRotationPoint(-55F, -33F, -11F);
		bodyModel[76].rotateAngleZ = 0.27925268F;

		bodyModel[77].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[77].setRotationPoint(-55F, -33F, -10F);
		bodyModel[77].rotateAngleZ = 0.27925268F;

		bodyModel[78].addShapeBox(10F, 0F, 0F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 301
		bodyModel[78].setRotationPoint(11F, -33F, -0.5F);
		bodyModel[78].rotateAngleZ = 0.36651914F;

		bodyModel[79].addShapeBox(-3F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[79].setRotationPoint(11F, -33.5F, -1F);
		bodyModel[79].rotateAngleZ = 0.36651914F;

		bodyModel[80].addShapeBox(5F, 0F, 0F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 212
		bodyModel[80].setRotationPoint(11F, -33F, -0.5F);
		bodyModel[80].rotateAngleZ = 0.36651914F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 214
		bodyModel[81].setRotationPoint(-22.5F, -38F, -1.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 215
		bodyModel[82].setRotationPoint(-22.5F, -34F, -2F);
		bodyModel[82].rotateAngleZ = -0.12217305F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 216
		bodyModel[83].setRotationPoint(-31.5F, -25F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 11, 8, 3, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1.5F, 0F, 6F, 0.5F, 1F, 6F, -0.5F, 0F, -1.5F, -3F, 0F); // Box 222
		bodyModel[84].setRotationPoint(-46F, -23F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 41, 8, 3, 0F,0F, 0.5F, 0F, -19F, 0F, 0F, -19F, -1F, 0F, 0F, 0F, 0F, -6F, 0.5F, 1F, 0F, 1F, 2F, 0F, 0F, 0F, -6F, -0.5F, 0F); // Box 223
		bodyModel[85].setRotationPoint(-35F, -23F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 33, 8, 3, 0F,0F, 0F, 0F, 0F, -5F, 0F, -7.5F, -4.5F, 3.5F, 0F, -1F, 0F, -19F, 1F, 2F, 0F, -0.5F, 0.5F, -7.5F, -1.5F, 3.5F, -19F, 0F, 0F); // Box 224
		bodyModel[86].setRotationPoint(-13F, -23F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0.4F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.4F, -0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 210
		bodyModel[87].setRotationPoint(17F, -33F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 14, 4, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F); // Box 211
		bodyModel[88].setRotationPoint(17F, -29F, -2F);
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
		noseModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 197
		noseModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 262
		noseModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 263
		noseModel[12] = new ModelRendererTurbo(this, 13, 228, textureX, textureY); // Box 264

		noseModel[0].addShapeBox(0F, 0F, 0F, 9, 10, 12, 0F,0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 186
		noseModel[0].setRotationPoint(-71F, -27F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, -0.5F, -4F, 0F, 1.7F, -3F, 0F, 1.7F, -3F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0F); // Box 187
		noseModel[1].setRotationPoint(-71F, -32F, -6F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0.5F, -4F); // Box 188
		noseModel[2].setRotationPoint(-71F, -17F, -6F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,0F, 0F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, -2.5F); // Box 189
		noseModel[3].setRotationPoint(-77F, -25.5F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 5, 12, 0F,0F, -2F, -4.5F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, -4.5F, 0F, 0F, -2.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2.5F); // Box 190
		noseModel[4].setRotationPoint(-77F, -30.5F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 5, 12, 0F,0F, 0F, -2.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2.5F, 0F, -2F, -4.5F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, -4.5F); // Box 191
		noseModel[5].setRotationPoint(-77F, -18.5F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.5F); // Box 192
		noseModel[6].setRotationPoint(-83F, -25.5F, -3.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,-2.5F, -1.7F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, -1.7F, -2.5F, 0F, 2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F); // Box 193
		noseModel[7].setRotationPoint(-83F, -28.5F, -3.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, -2.5F, -1.7F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2.5F, -1.7F, -2.5F); // Box 194
		noseModel[8].setRotationPoint(-83F, -18.5F, -3.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 197
		noseModel[9].setRotationPoint(-77F, -29F, 2F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 262
		noseModel[10].setRotationPoint(-77F, -29F, -3F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 263
		noseModel[11].setRotationPoint(-68F, -11.5F, 3F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.5F, 0.4F, 4F, 0.5F, 0.4F, 4F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 264
		noseModel[12].setRotationPoint(-58F, -11F, 3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 212
		tailModel[1] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 213
		tailModel[2] = new ModelRendererTurbo(this, 210, 260, textureX, textureY); // Box 214
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

		tailModel[0].addShapeBox(0F, 0F, 0F, 46, 5, 8, 0F,0F, 0.5F, 4F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0.5F, 4F, 0F, -0.5F, -0.5F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -0.5F, -0.5F); // Box 212
		tailModel[0].setRotationPoint(20F, -15F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 46, 13, 8, 0F,0F, 0F, 4F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, 4F); // Box 213
		tailModel[1].setRotationPoint(20F, -29F, -4F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 46, 4, 8, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0F, 4F); // Box 214
		tailModel[2].setRotationPoint(20F, -33F, -4F);

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

		tailModel[11].addShapeBox(0F, 0F, 0F, 12, 31, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		tailModel[11].setRotationPoint(96F, -60F, -0.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 5, 31, 1, 0F,2F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 224
		tailModel[12].setRotationPoint(108F, -60F, -0.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 31, 1, 0F,-6F, -6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -6F, -6F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F); // Box 225
		tailModel[13].setRotationPoint(85F, -60F, -0.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, -2.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 226
		tailModel[14].setRotationPoint(64F, -33F, -0.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,60F, -0.4F, -0.4F, 60F, 1.6F, -0.4F, 60F, 1.6F, -0.4F, 60F, -0.4F, -0.4F, 60F, -0.4F, -0.4F, 60F, -2.4F, -0.4F, 60F, -2.4F, -0.4F, 60F, -0.4F, -0.4F); // Box 276
		tailModel[15].setRotationPoint(36F, -56.5F, -0.5F);

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
		leftWingModel[0] = new ModelRendererTurbo(this, 5, 105, textureX, textureY); // Box 103
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
		leftWingModel[21] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 152
		leftWingModel[22] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 153
		leftWingModel[23] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 154
		leftWingModel[24] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 155
		leftWingModel[25] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 156
		leftWingModel[26] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 157
		leftWingModel[27] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 158
		leftWingModel[28] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 159
		leftWingModel[29] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 160
		leftWingModel[30] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 174
		leftWingModel[31] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 175
		leftWingModel[32] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 176
		leftWingModel[33] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 177
		leftWingModel[34] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 178
		leftWingModel[35] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 208
		leftWingModel[36] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 299

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 11, 8, 76, 0F,-5.5F, 5.5F, 0F, 2.8F, 6.3F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -5.5F, -12F, 0F, 5.5F, -10.2F, 0F, 6F, -0.5F, 0F, -1.5F, -3F, 0F); // Box 103
		leftWingModel[0].setRotationPoint(-46F, -23F, -87F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 41, 8, 132, 0F,-5F, 11F, 0F, -27F, 11F, -1F, -19F, -1F, 0F, 0F, 0F, 0F, -5F, -17.5F, 0F, -27F, -17.5F, -1F, 0F, 0F, 0F, -6F, -0.5F, 0F); // Box 104
		leftWingModel[1].setRotationPoint(-35F, -23F, -143F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 33, 8, 132, 0F,8F, 11F, -1F, -33F, 9F, -13F, -7.5F, -4.5F, -3.5F, 0F, -1F, 0F, 8F, -17.5F, -1F, -33F, -15.5F, -13F, -7.5F, -1.5F, -3.5F, -19F, 0F, 0F); // Box 105
		leftWingModel[2].setRotationPoint(-13F, -23F, -143F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 11, 8, 56, 0F,-9.5F, 10F, -13F, 5F, 11F, 0F, 2.8F, 6.3F, 0F, -5.5F, 5.5F, 0F, -9.5F, -16.5F, -13F, 5F, -17.5F, 0F, 5.5F, -10.2F, 0F, -5.5F, -12F, 0F); // Box 107
		leftWingModel[3].setRotationPoint(-46F, -23F, -143F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 201
		leftWingModel[4].setRotationPoint(-65.5F, -20F, -42F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 202
		leftWingModel[5].setRotationPoint(-65.5F, -23F, -42F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 203
		leftWingModel[6].setRotationPoint(-65.5F, -17F, -42F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,2.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, -3F, 2.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, -3F); // Box 204
		leftWingModel[7].setRotationPoint(-70.5F, -19.5F, -41.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0.5F, -1F, -3F, 2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, -3F); // Box 205
		leftWingModel[8].setRotationPoint(-70.5F, -21.5F, -41.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, -3F, 0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0.5F, -1F, -3F); // Box 206
		leftWingModel[9].setRotationPoint(-70.5F, -16.5F, -41.5F);

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

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F); // Box 152
		leftWingModel[21].setRotationPoint(-48.5F, -14F, -48F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 153
		leftWingModel[22].setRotationPoint(-48.5F, -21F, -48F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 154
		leftWingModel[23].setRotationPoint(-48.5F, -28F, -48F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 19, 7, 21, 0F,0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -3.5F, -8.5F, 0F, -3.5F, -8.5F, 0F, -0.5F, -7.5F); // Box 155
		leftWingModel[24].setRotationPoint(-30.5F, -14F, -48F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 19, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 156
		leftWingModel[25].setRotationPoint(-30.5F, -21F, -47.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 19, 7, 20, 0F,0F, 0F, -7F, 0F, -2.5F, -8F, 0F, -2.5F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 157
		leftWingModel[26].setRotationPoint(-30.5F, -28F, -47.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 17, 7, 16, 0F,0F, 0F, 0F, 0F, -4F, -7.5F, 0F, -4F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, 0F, 0F); // Box 158
		leftWingModel[27].setRotationPoint(-11.5F, -22F, -45.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, -2.5F, -8F, -7F, -7.5F, -9.5F, -7F, -7.5F, -9.5F, 0F, -2.5F, -8F, 0F, -1F, -2F, 0F, 3F, -9.5F, 0F, 3F, -9.5F, 0F, -1F, -2F); // Box 159
		leftWingModel[28].setRotationPoint(-11.5F, -28F, -47.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, -1F, -2F, 0F, 1F, -9.5F, 0F, 1F, -9.5F, 0F, -1F, -2F, 0F, -1.5F, -8F, -7F, -5F, -9.5F, -7F, -5F, -9.5F, 0F, -1.5F, -8F); // Box 160
		leftWingModel[29].setRotationPoint(-11.5F, -16F, -47.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftWingModel[30].setRotationPoint(-51.5F, -6F, -40F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingModel[31].setRotationPoint(-47.5F, -8F, -40F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 176
		leftWingModel[32].setRotationPoint(-51.5F, -3F, -40F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftWingModel[33].setRotationPoint(-51.5F, -5F, -40F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		leftWingModel[34].setRotationPoint(-51.5F, -5F, -36F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 208
		leftWingModel[35].setRotationPoint(-36.5F, -32.4F, -120F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 2F, 0F, 0F, 0.8F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 299
		leftWingModel[36].setRotationPoint(-36.5F, -29.2F, -120F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 5, 105, textureX, textureY); // Box 233
		rightWingModel[1] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 234
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 235
		rightWingModel[3] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 236
		rightWingModel[4] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 243
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 244
		rightWingModel[6] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 245
		rightWingModel[7] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 246
		rightWingModel[8] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 247
		rightWingModel[9] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 248
		rightWingModel[10] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 249
		rightWingModel[11] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 250
		rightWingModel[12] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 251
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 252
		rightWingModel[14] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 253
		rightWingModel[15] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 255
		rightWingModel[16] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 256
		rightWingModel[17] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 257
		rightWingModel[18] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 258
		rightWingModel[19] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 259
		rightWingModel[20] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 260
		rightWingModel[21] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 261
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 262
		rightWingModel[23] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 263
		rightWingModel[24] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 264
		rightWingModel[25] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 265
		rightWingModel[26] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 266
		rightWingModel[27] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 267
		rightWingModel[28] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 268
		rightWingModel[29] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 273
		rightWingModel[30] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 297
		rightWingModel[31] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 266
		rightWingModel[32] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 267
		rightWingModel[33] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 268
		rightWingModel[34] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 269
		rightWingModel[35] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 270
		rightWingModel[36] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 271

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 11, 8, 76, 0F,-1.5F, -2F, 0F, 0F, 0F, 0F, 2.8F, 6.3F, 0F, -5.5F, 5.5F, 0F, -1.5F, -3F, 0F, 6F, -0.5F, 0F, 5.5F, -10.2F, 0F, -5.5F, -12F, 0F); // Box 233
		rightWingModel[0].setRotationPoint(-46F, -23F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 41, 8, 132, 0F,0F, 0F, 0F, -19F, -1F, 0F, -27F, 11F, -1F, -5F, 11F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, -27F, -17.5F, -1F, -5F, -17.5F, 0F); // Box 234
		rightWingModel[1].setRotationPoint(-35F, -23F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 33, 8, 132, 0F,0F, -1F, 0F, -7.5F, -4.5F, -3.5F, -33F, 9F, -13F, 8F, 11F, -1F, -19F, 0F, 0F, -7.5F, -1.5F, -3.5F, -33F, -15.5F, -13F, 8F, -17.5F, -1F); // Box 235
		rightWingModel[2].setRotationPoint(-13F, -23F, 11F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 11, 8, 56, 0F,-5.5F, 5.5F, 0F, 2.8F, 6.3F, 0F, 5F, 11F, 0F, -9.5F, 10F, -13F, -5.5F, -12F, 0F, 5.5F, -10.2F, 0F, 5F, -17.5F, 0F, -9.5F, -16.5F, -13F); // Box 236
		rightWingModel[3].setRotationPoint(-46F, -23F, 87F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 243
		rightWingModel[4].setRotationPoint(-63.5F, -21F, 27F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 244
		rightWingModel[5].setRotationPoint(-63.5F, -28F, 27F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 15, 7, 21, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, -7F); // Box 245
		rightWingModel[6].setRotationPoint(-63.5F, -14F, 27F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 246
		rightWingModel[7].setRotationPoint(-65.5F, -28F, 34F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 247
		rightWingModel[8].setRotationPoint(-65.5F, -21F, 44F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 248
		rightWingModel[9].setRotationPoint(-65.5F, -21F, 27F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 249
		rightWingModel[10].setRotationPoint(-65.5F, -11F, 34F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F); // Box 250
		rightWingModel[11].setRotationPoint(-65.5F, -11F, 41F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -1F, 0.7F, 0F, 0F, 1F, 0F, 4F, -4F, 0F, 3.7F, -3F); // Box 251
		rightWingModel[12].setRotationPoint(-65.5F, -28F, 41F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F); // Box 252
		rightWingModel[13].setRotationPoint(-65.5F, -28F, 27F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 3.7F, -3F, 0F, 4F, -4F, 0F, 0F, 1F, 0F, -1F, 0.7F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 253
		rightWingModel[14].setRotationPoint(-65.5F, -11F, 27F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F); // Box 255
		rightWingModel[15].setRotationPoint(-48.5F, -14F, 27F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 256
		rightWingModel[16].setRotationPoint(-48.5F, -21F, 27F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 18, 7, 21, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		rightWingModel[17].setRotationPoint(-48.5F, -28F, 27F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 19, 7, 21, 0F,0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -7.5F, 0F, -3.5F, -8.5F, 0F, -3.5F, -8.5F, 0F, -0.5F, -7.5F); // Box 258
		rightWingModel[18].setRotationPoint(-30.5F, -14F, 27F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 19, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 259
		rightWingModel[19].setRotationPoint(-30.5F, -21F, 27.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 19, 7, 20, 0F,0F, 0F, -7F, 0F, -2.5F, -8F, 0F, -2.5F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 260
		rightWingModel[20].setRotationPoint(-30.5F, -28F, 27.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 17, 7, 16, 0F,0F, 0F, 0F, 0F, -4F, -7.5F, 0F, -4F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7.5F, 0F, -2F, -7.5F, 0F, 0F, 0F); // Box 261
		rightWingModel[21].setRotationPoint(-11.5F, -22F, 29.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, -2.5F, -8F, -7F, -7.5F, -9.5F, -7F, -7.5F, -9.5F, 0F, -2.5F, -8F, 0F, -1F, -2F, 0F, 3F, -9.5F, 0F, 3F, -9.5F, 0F, -1F, -2F); // Box 262
		rightWingModel[22].setRotationPoint(-11.5F, -28F, 27.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F,0F, -1F, -2F, 0F, 1F, -9.5F, 0F, 1F, -9.5F, 0F, -1F, -2F, 0F, -1.5F, -8F, -7F, -5F, -9.5F, -7F, -5F, -9.5F, 0F, -1.5F, -8F); // Box 263
		rightWingModel[23].setRotationPoint(-11.5F, -16F, 27.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightWingModel[24].setRotationPoint(-51.5F, -6F, 35F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 1F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightWingModel[25].setRotationPoint(-47.5F, -8F, 35F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 266
		rightWingModel[26].setRotationPoint(-51.5F, -3F, 35F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightWingModel[27].setRotationPoint(-51.5F, -5F, 39F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightWingModel[28].setRotationPoint(-51.5F, -5F, 35F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[29].setRotationPoint(-36.5F, -32.2F, 95F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 297
		rightWingModel[30].setRotationPoint(-36.5F, -29.2F, 95F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 266
		rightWingModel[31].setRotationPoint(-65.5F, -20F, 33F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 267
		rightWingModel[32].setRotationPoint(-65.5F, -23F, 33F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 9, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 268
		rightWingModel[33].setRotationPoint(-65.5F, -17F, 33F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,2.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, -3F, 2.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, -3F); // Box 269
		rightWingModel[34].setRotationPoint(-70.5F, -19.5F, 33.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0.5F, -1F, -3F, 2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, -3F); // Box 270
		rightWingModel[35].setRotationPoint(-70.5F, -21.5F, 33.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,2.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, -3F, 0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0.5F, -1F, -3F); // Box 271
		rightWingModel[36].setRotationPoint(-70.5F, -16.5F, 33.5F);
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
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Box 172
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Box 173

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
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Box 231
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Box 232

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