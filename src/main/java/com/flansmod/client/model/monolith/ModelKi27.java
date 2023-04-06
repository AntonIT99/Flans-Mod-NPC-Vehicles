//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki27
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi27 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelKi27() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];
		noseModel = new ModelRendererTurbo[14];
		tailModel = new ModelRendererTurbo[19];
		leftWingModel = new ModelRendererTurbo[14];
		rightWingModel = new ModelRendererTurbo[14];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 202
		bodyModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 203
		bodyModel[2] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 204
		bodyModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 205
		bodyModel[4] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 206
		bodyModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 207
		bodyModel[6] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 208
		bodyModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 209
		bodyModel[8] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 210
		bodyModel[9] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 211
		bodyModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 212
		bodyModel[11] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 213
		bodyModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 214
		bodyModel[13] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 215
		bodyModel[14] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 216
		bodyModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 217
		bodyModel[16] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 218
		bodyModel[17] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 219
		bodyModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 220
		bodyModel[19] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 247
		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 89
		bodyModel[21] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 90
		bodyModel[22] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 91
		bodyModel[23] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 221
		bodyModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 225
		bodyModel[25] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 226
		bodyModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 227
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 228
		bodyModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 229
		bodyModel[29] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 262
		bodyModel[30] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 263
		bodyModel[31] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 264
		bodyModel[32] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 265
		bodyModel[33] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 266
		bodyModel[34] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 267
		bodyModel[35] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 268
		bodyModel[36] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 269
		bodyModel[37] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 270
		bodyModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 271
		bodyModel[39] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 272
		bodyModel[40] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 273
		bodyModel[41] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 274
		bodyModel[42] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 275
		bodyModel[43] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 276
		bodyModel[44] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 277
		bodyModel[45] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 84
		bodyModel[46] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 85
		bodyModel[47] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 86
		bodyModel[48] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 87
		bodyModel[49] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(0F, 0F, 0F, 13, 8, 24, 0F,0F, 0F, 0F, 0F, 3F, -3.5F, 0F, 3F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3.5F, 0F, 3F, -3.5F, 0F, 0F, 0F); // Box 202
		bodyModel[0].setRotationPoint(-54F, -26F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 8, 24, 0F,0F, 1F, -8F, 0F, 1F, -8.5F, 0F, 1F, -8.5F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F); // Box 203
		bodyModel[1].setRotationPoint(-54F, -34F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 8, 24, 0F,0F, 0F, 0F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, 0F, -8F); // Box 204
		bodyModel[2].setRotationPoint(-54F, -18F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 205
		bodyModel[3].setRotationPoint(-41F, -15F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 5, 17, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -0.5F, -4F); // Box 206
		bodyModel[4].setRotationPoint(-17F, -15F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 24, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[5].setRotationPoint(-41F, -29F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[6].setRotationPoint(-41F, -29F, 7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[7].setRotationPoint(-31F, -33F, -8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-0.5F, 2F, -5.5F, 0F, 0F, -4F, 0F, 0F, 4F, -0.5F, 2F, 6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 210
		bodyModel[8].setRotationPoint(-39F, -33F, -8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,-0.5F, 2F, 6.5F, 0F, 0F, 4F, 0F, 0F, -4F, -0.5F, 2F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 211
		bodyModel[9].setRotationPoint(-39F, -33F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[10].setRotationPoint(-31F, -33F, 7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 2F, -5F, 0.5F, 2F, -5.5F, 0.5F, 2F, 7.5F, 0F, 2F, 7.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 213
		bodyModel[11].setRotationPoint(-41F, -33F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 2F, 7.5F, 0.5F, 2F, 7.5F, 0.5F, 2F, -5.5F, 0F, 2F, -5F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[12].setRotationPoint(-41F, -33F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 14, 17, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 215
		bodyModel[13].setRotationPoint(-17F, -29F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 24, 4, 17, 0F,0F, 0F, -4F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 216
		bodyModel[14].setRotationPoint(-17F, -33F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -0.8F, 0F, -2F, -1.4F, 0F, -2F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.1F, -1.4F, 0F, 0.1F, -1.4F, 0F, 0F, 0F); // Box 217
		bodyModel[15].setRotationPoint(3F, -35F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 30, 12, 13, 0F,0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 218
		bodyModel[16].setRotationPoint(7F, -29F, -6.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 4, 13, 0F,0F, 0F, -3.5F, 0F, -2.5F, -4.5F, 0F, -2.5F, -4.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F); // Box 219
		bodyModel[17].setRotationPoint(7F, -33F, -6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 4, 13, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 220
		bodyModel[18].setRotationPoint(7F, -17F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 247
		bodyModel[19].setRotationPoint(-48F, -53F, 4.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[20].setRotationPoint(-17.5F, -39F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[21].setRotationPoint(-17.5F, -35F, -2F);
		bodyModel[21].rotateAngleZ = -0.12217305F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 9, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[22].setRotationPoint(-27.5F, -23F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 6, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[23].setRotationPoint(-44.8F, -31F, -10F);
		bodyModel[23].rotateAngleZ = 0.27925268F;

		bodyModel[24].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[24].setRotationPoint(-36F, -33F, -9.5F);
		bodyModel[24].rotateAngleZ = 0.27925268F;

		bodyModel[25].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[25].setRotationPoint(-36F, -33F, -10.5F);
		bodyModel[25].rotateAngleZ = 0.27925268F;

		bodyModel[26].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[26].setRotationPoint(-36F, -33F, -9F);
		bodyModel[26].rotateAngleZ = 0.27925268F;

		bodyModel[27].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[27].setRotationPoint(-36F, -33F, -11F);
		bodyModel[27].rotateAngleZ = 0.27925268F;

		bodyModel[28].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[28].setRotationPoint(-36F, -33F, -10F);
		bodyModel[28].rotateAngleZ = 0.27925268F;

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[29].setRotationPoint(-33F, -40F, 2F);
		bodyModel[29].rotateAngleZ = -0.76794487F;

		bodyModel[30].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[30].setRotationPoint(-33F, -40F, -2F);
		bodyModel[30].rotateAngleZ = -0.76794487F;

		bodyModel[31].addShapeBox(-3.5F, 0F, -0.5F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[31].setRotationPoint(-30.5F, -41F, 2F);
		bodyModel[31].rotateAngleZ = 0.2268928F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[32].setRotationPoint(-30.5F, -40.5F, 2F);
		bodyModel[32].rotateAngleX = 0.26179939F;

		bodyModel[33].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[33].setRotationPoint(-30.5F, -41F, -2F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[34].setRotationPoint(-30.5F, -40.5F, -2F);
		bodyModel[34].rotateAngleX = -0.26179939F;

		bodyModel[35].addShapeBox(-3.5F, 0F, -0.5F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[35].setRotationPoint(-30.5F, -41F, -2F);
		bodyModel[35].rotateAngleZ = 0.2268928F;

		bodyModel[36].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[36].setRotationPoint(-18.5F, -40F, -2F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[37].setRotationPoint(-18.5F, -39.5F, 2F);
		bodyModel[37].rotateAngleX = 0.26179939F;

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[38].setRotationPoint(-18.5F, -39.5F, -2F);
		bodyModel[38].rotateAngleX = -0.26179939F;

		bodyModel[39].addShapeBox(-12F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[39].setRotationPoint(-18.5F, -39.5F, 2F);
		bodyModel[39].rotateAngleZ = -0.08726646F;

		bodyModel[40].addShapeBox(-12F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[40].setRotationPoint(-18.5F, -39.5F, -2F);
		bodyModel[40].rotateAngleZ = -0.08726646F;

		bodyModel[41].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[41].setRotationPoint(-9.5F, -38F, 2F);
		bodyModel[41].rotateAngleX = 0.26179939F;

		bodyModel[42].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[42].setRotationPoint(-9.5F, -38.5F, -2F);

		bodyModel[43].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[43].setRotationPoint(-9.5F, -38F, -2F);
		bodyModel[43].rotateAngleX = -0.26179939F;

		bodyModel[44].addShapeBox(-9.5F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[44].setRotationPoint(-9.5F, -38F, 0F);
		bodyModel[44].rotateAngleZ = -0.17453293F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[45].setRotationPoint(-41F, -36F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[46].setRotationPoint(-43F, -37.6F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[47].setRotationPoint(-43F, -37.1F, 0.05F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[48].setRotationPoint(-43F, -36.5F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[49].setRotationPoint(-43F, -37.1F, -1F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		noseModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 187
		noseModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 189
		noseModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 190
		noseModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 193
		noseModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 194
		noseModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 195
		noseModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 196
		noseModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 197
		noseModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 198
		noseModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 199
		noseModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 200
		noseModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 201

		noseModel[0].addBox(0F, 0F, 0F, 8, 8, 24, 0F); // Box 186
		noseModel[0].setRotationPoint(-62F, -26F, -12F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		noseModel[1].setRotationPoint(-62F, -34F, -12F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 188
		noseModel[2].setRotationPoint(-62F, -18F, -12F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-1.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.7F); // Box 189
		noseModel[3].setRotationPoint(-66F, -34F, -4F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-0.5F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.7F, -1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, 0F); // Box 190
		noseModel[4].setRotationPoint(-66F, -14.5F, -4F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 193
		noseModel[5].setRotationPoint(-66F, -26F, 8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0.5F, -8F, -1.5F, -1.5F, -8F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 194
		noseModel[6].setRotationPoint(-66F, -34F, 8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F); // Box 195
		noseModel[7].setRotationPoint(-66F, -26F, -12F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0F, -8F, -1.5F, -1.5F, -8F); // Box 196
		noseModel[8].setRotationPoint(-66F, -18F, 8F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-1.5F, -1.5F, -8F, 0F, 0.5F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F); // Box 197
		noseModel[9].setRotationPoint(-66F, -34F, -12F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -1.5F, -1.5F, -8F, 0F, 0F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F); // Box 198
		noseModel[10].setRotationPoint(-66F, -18F, -12F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 199
		noseModel[11].setRotationPoint(-65F, -26.5F, -4F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		noseModel[12].setRotationPoint(-70F, -23.5F, -1F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -0.3F, -0.3F); // Box 201
		noseModel[13].setRotationPoint(-71.7F, -23.5F, -1F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 221
		tailModel[1] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 222
		tailModel[2] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 223
		tailModel[3] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 224
		tailModel[4] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 225
		tailModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 226
		tailModel[6] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 230
		tailModel[7] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 231
		tailModel[8] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 232
		tailModel[9] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 233
		tailModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 248
		tailModel[11] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 109
		tailModel[12] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 110
		tailModel[13] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 111
		tailModel[14] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 112
		tailModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
		tailModel[16] = new ModelRendererTurbo(this, 157, 91, textureX, textureY); // Box 117
		tailModel[17] = new ModelRendererTurbo(this, 157, 91, textureX, textureY); // Box 118
		tailModel[18] = new ModelRendererTurbo(this, 157, 91, textureX, textureY); // Box 120

		tailModel[0].addShapeBox(0F, 0F, 0F, 24, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3.5F, 0F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 3.5F, 0F); // Box 221
		tailModel[0].setRotationPoint(37F, -28.5F, -4.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 24, 6, 9, 0F,0F, -3.5F, 0F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, -3.5F, 0F, 0F, 0.5F, -2F, 2F, -3F, -3F, 2F, -3F, -3F, 0F, 0.5F, -2F); // Box 222
		tailModel[1].setRotationPoint(37F, -22.5F, -4.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 24, 2, 4, 0F,0F, 0F, 0F, -12F, -0.5F, -1F, -12F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F); // Box 223
		tailModel[2].setRotationPoint(37F, -30.5F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 4, 23, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		tailModel[3].setRotationPoint(57F, -51F, -1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 14, 23, 2, 0F,0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		tailModel[4].setRotationPoint(43F, -51F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		tailModel[5].setRotationPoint(37F, -33F, -1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		tailModel[6].setRotationPoint(52F, -24.5F, -12.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 18, 2, 13, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		tailModel[7].setRotationPoint(52F, -24.5F, -25.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		tailModel[8].setRotationPoint(54F, -24.5F, -34.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		tailModel[9].setRotationPoint(58F, -24.5F, -36.5F);

		tailModel[10].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F, 52F, -0.4F, -0.4F); // Box 248
		tailModel[10].setRotationPoint(2.7F, -52F, 2F);
		tailModel[10].rotateAngleY = -0.05235988F;
		tailModel[10].rotateAngleZ = -0.01745329F;

		tailModel[11].addShapeBox(0F, 0F, 0F, 18, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		tailModel[11].setRotationPoint(52F, -24.5F, 0.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 18, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 110
		tailModel[12].setRotationPoint(52F, -24.5F, 12.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 111
		tailModel[13].setRotationPoint(54F, -24.5F, 25.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 112
		tailModel[14].setRotationPoint(58F, -24.5F, 34.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -0.8F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, -0.8F); // Box 116
		tailModel[15].setRotationPoint(67F, -22F, -1.5F);
		tailModel[15].rotateAngleZ = -0.43633231F;

		tailModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		tailModel[16].setRotationPoint(70F, -19F, -1.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[17].setRotationPoint(70F, -18F, -1.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		tailModel[18].setRotationPoint(70F, -17F, -1.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 2, 130, textureX, textureY); // Box 234
		leftWingModel[1] = new ModelRendererTurbo(this, 159, 108, textureX, textureY); // Box 235
		leftWingModel[2] = new ModelRendererTurbo(this, 277, 122, textureX, textureY); // Box 236
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 237
		leftWingModel[4] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 238
		leftWingModel[5] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 239
		leftWingModel[6] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 240
		leftWingModel[7] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 242
		leftWingModel[8] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 243
		leftWingModel[9] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 244
		leftWingModel[10] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 245
		leftWingModel[11] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 246
		leftWingModel[12] = new ModelRendererTurbo(this, 158, 108, textureX, textureY); // Box 283
		leftWingModel[13] = new ModelRendererTurbo(this, 158, 108, textureX, textureY); // Box 114

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 101, 0F,3F, 10F, 0F, -14F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -14F, 0F, -14F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[0].setRotationPoint(-41F, -17F, -105.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 101, 0F,0F, 8F, -12F, -3F, 10F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -12.5F, -12F, -3F, -14F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 235
		leftWingModel[1].setRotationPoint(-48F, -17F, -105.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 101, 0F,14F, 10F, 0F, -17F, 8F, -12F, 2F, -2F, 0F, 0F, 0F, 0F, 14F, -14F, 0F, -17F, -12F, -12F, 2F, -1F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[2].setRotationPoint(-21F, -17F, -105.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 25, 3, 10, 0F,0F, 0F, 0F, 0F, -1.5F, -9F, 0F, -1.5F, 0F, -2.5F, -1.2F, 0F, -0.2F, -0.1F, 0F, 0F, -1.2F, -9F, 0F, -1.2F, 0F, -2.5F, 1.1F, 0F); // Box 237
		leftWingModel[3].setRotationPoint(-7F, -16F, -13F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 15, 6, 5, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, -1F, 0F, -1F); // Box 238
		leftWingModel[4].setRotationPoint(-47F, -16F, -31F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 239
		leftWingModel[5].setRotationPoint(-46F, -10F, -30F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 240
		leftWingModel[6].setRotationPoint(-46F, -7F, -30F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 6F, 0F, 0.5F); // Box 242
		leftWingModel[7].setRotationPoint(-46F, -4F, -30F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 243
		leftWingModel[8].setRotationPoint(-52F, 0F, -30.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 244
		leftWingModel[9].setRotationPoint(-52F, 2F, -30.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftWingModel[10].setRotationPoint(-52F, 5F, -30.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 246
		leftWingModel[11].setRotationPoint(-52F, 6F, -30F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 1F, 0F, 0F, 0.7F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 283
		leftWingModel[12].setRotationPoint(-45F, -24F, -81.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 2F, 0F, 0F, 1.7F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 114
		leftWingModel[13].setRotationPoint(-45F, -20F, -81.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 2, 130, textureX, textureY); // Box 96
		rightWingModel[1] = new ModelRendererTurbo(this, 159, 108, textureX, textureY); // Box 97
		rightWingModel[2] = new ModelRendererTurbo(this, 277, 122, textureX, textureY); // Box 98
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 99
		rightWingModel[4] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 100
		rightWingModel[5] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 101
		rightWingModel[6] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 102
		rightWingModel[7] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 103
		rightWingModel[8] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 104
		rightWingModel[9] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 105
		rightWingModel[10] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 106
		rightWingModel[11] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 107
		rightWingModel[12] = new ModelRendererTurbo(this, 158, 108, textureX, textureY); // Box 108
		rightWingModel[13] = new ModelRendererTurbo(this, 158, 108, textureX, textureY); // Box 115

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 101, 0F,0F, 0F, 0F, 0F, 0F, 0F, -14F, 10F, 0F, 3F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -14F, 0F, 3F, -14F, 0F); // Box 96
		rightWingModel[0].setRotationPoint(-41F, -17F, 4.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 101, 0F,0F, -1F, 0F, 0F, 0F, 0F, -3F, 10F, 0F, 0F, 8F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, -14F, 0F, 0F, -12.5F, -12F); // Box 97
		rightWingModel[1].setRotationPoint(-48F, -17F, 4.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 101, 0F,0F, 0F, 0F, 2F, -2F, 0F, -17F, 8F, -12F, 14F, 10F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -17F, -12F, -12F, 14F, -14F, 0F); // Box 98
		rightWingModel[2].setRotationPoint(-21F, -17F, 4.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 25, 3, 10, 0F,-2.5F, -1.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -9F, 0F, 0F, 0F, -2.5F, 1.1F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -9F, -0.2F, -0.1F, 0F); // Box 99
		rightWingModel[3].setRotationPoint(-7F, -16F, 3F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 15, 6, 5, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, -1F, -1F, 0F, -1F); // Box 100
		rightWingModel[4].setRotationPoint(-47F, -16F, 26F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 101
		rightWingModel[5].setRotationPoint(-46F, -10F, 27F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 102
		rightWingModel[6].setRotationPoint(-46F, -7F, 27F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 6F, 0F, 0.5F); // Box 103
		rightWingModel[7].setRotationPoint(-46F, -4F, 27F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 104
		rightWingModel[8].setRotationPoint(-52F, 0F, 26.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 105
		rightWingModel[9].setRotationPoint(-52F, 2F, 26.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rightWingModel[10].setRotationPoint(-52F, 5F, 26.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 107
		rightWingModel[11].setRotationPoint(-52F, 6F, 27F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, -0.7F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		rightWingModel[12].setRotationPoint(-45F, -24F, 60.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, -0.7F, 0F, 0F, -1F, 0F, 0F, 1.7F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 115
		rightWingModel[13].setRotationPoint(-45F, -20F, 60.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 227
		yawFlapModel[1] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 228
		yawFlapModel[2] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 229
		yawFlapModel[3] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 106
		yawFlapModel[4] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 107
		yawFlapModel[5] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 4, 31, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 227
		yawFlapModel[0].setRotationPoint(61F, -51F, 0F);

		yawFlapModel[1].addShapeBox(4F, 0F, -1F, 4, 31, 2, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 228
		yawFlapModel[1].setRotationPoint(61F, -51F, 0F);

		yawFlapModel[2].addShapeBox(8F, 6F, -1F, 2, 24, 2, 0F,0F, 0F, 0F, 0.5F, -12F, 0F, 0.5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 229
		yawFlapModel[2].setRotationPoint(61F, -51F, 0F);

		yawFlapModel[3].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[3].setRotationPoint(-35F, -19.8F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[4].setRotationPoint(-35F, -19.8F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[5].setRotationPoint(-35F, -19.8F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-31F, -14.5F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][2];
		propellerModels[0] = makeProp1(-68F, -22.5F, 0F);
		propellerModels[1] = makeProp2(-68F, -22.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 3, 107, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 3, 107, textureX, textureY);
		prop[0].addBox(-1F, -4F, -2F, 2, 4, 4, 0.0F);
		prop[1].addBox(-1F, -4F, -2F, 2, 4, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 22, 107, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 22, 107, textureX, textureY);
		prop[0].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[1].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}