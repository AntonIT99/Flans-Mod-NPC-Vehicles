//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Piaggio
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPiaggio extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelPiaggio() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];
		noseModel = new ModelRendererTurbo[32];
		tailModel = new ModelRendererTurbo[2];
		leftWingModel = new ModelRendererTurbo[30];
		rightWingModel = new ModelRendererTurbo[30];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 124
		bodyModel[1] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 125
		bodyModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 126
		bodyModel[3] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 127
		bodyModel[4] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 128
		bodyModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 129
		bodyModel[6] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 130
		bodyModel[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 131
		bodyModel[8] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 132
		bodyModel[9] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 133
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 136
		bodyModel[12] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 137
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 138
		bodyModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 139
		bodyModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 140
		bodyModel[16] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 141
		bodyModel[17] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 142
		bodyModel[18] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 143
		bodyModel[19] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 144
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 145
		bodyModel[21] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 146
		bodyModel[22] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 147
		bodyModel[23] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 150
		bodyModel[24] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 151
		bodyModel[25] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 152
		bodyModel[26] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 190
		bodyModel[27] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 191
		bodyModel[28] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 216
		bodyModel[29] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 217
		bodyModel[30] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 218
		bodyModel[31] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 219
		bodyModel[32] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 220
		bodyModel[33] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 221
		bodyModel[34] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 222
		bodyModel[35] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 223
		bodyModel[36] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 224
		bodyModel[37] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 225
		bodyModel[38] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 226
		bodyModel[39] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 227
		bodyModel[40] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 228
		bodyModel[41] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 229
		bodyModel[42] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 231
		bodyModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 232
		bodyModel[44] = new ModelRendererTurbo(this, 609, 289, textureX, textureY); // Box 233
		bodyModel[45] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 235
		bodyModel[46] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 239
		bodyModel[47] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 240
		bodyModel[48] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 241
		bodyModel[49] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 242
		bodyModel[50] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 243
		bodyModel[51] = new ModelRendererTurbo(this, 625, 225, textureX, textureY); // Box 244
		bodyModel[52] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 261
		bodyModel[53] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 262
		bodyModel[54] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 263
		bodyModel[55] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 306
		bodyModel[56] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 308
		bodyModel[57] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 267
		bodyModel[58] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 268
		bodyModel[59] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 271
		bodyModel[60] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 272
		bodyModel[61] = new ModelRendererTurbo(this, 609, 289, textureX, textureY); // Box 309
		bodyModel[62] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 310

		bodyModel[0].addShapeBox(0F, 0F, 0F, 98, 30, 34, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F); // Box 124
		bodyModel[0].setRotationPoint(-175F, -43F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 28, 24, 0F,0F, -2F, -4F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, -2F, -4F, 0F, -4F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -4F, -4F); // Box 125
		bodyModel[1].setRotationPoint(-183F, -53F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 22, 16, 0F,0F, -10F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -7F, 0F, -10F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -7F); // Box 126
		bodyModel[2].setRotationPoint(-191F, -51F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 117, 30, 34, 0F,0F, 0F, 8F, 0F, 12F, 3F, 0F, 12F, 3F, 0F, 0F, 8F, 0F, -2F, 8F, 0F, -11F, 3F, 0F, -11F, 3F, 0F, -2F, 8F); // Box 127
		bodyModel[3].setRotationPoint(-77F, -43F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 53, 12, 38, 0F,0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 128
		bodyModel[4].setRotationPoint(-130F, -55F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 170, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 129
		bodyModel[5].setRotationPoint(-130F, -59F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 170, 5, 26, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 130
		bodyModel[6].setRotationPoint(-130F, -64F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 117, 12, 38, 0F,0F, 0F, 2F, 0F, 0.15F, 1F, 0F, 0.15F, 1F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, -12.1F, 1F, 0F, -12.1F, 1F, 0F, 0F, 6F); // Box 131
		bodyModel[7].setRotationPoint(-77F, -55F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[8].setRotationPoint(-165F, -50F, -15F);
		bodyModel[8].rotateAngleY = -0.10471976F;

		bodyModel[9].addShapeBox(0F, 0F, -1F, 36, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 133
		bodyModel[9].setRotationPoint(-165F, -50F, 15F);
		bodyModel[9].rotateAngleY = 0.10471976F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, -2.3F, 0F, -3F, -2.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[10].setRotationPoint(-165F, -55F, -15F);
		bodyModel[10].rotateAngleY = -0.10471976F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[11].setRotationPoint(-155F, -59F, -10F);
		bodyModel[11].rotateAngleY = -0.10471976F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[12].setRotationPoint(-155F, -59F, 9F);
		bodyModel[12].rotateAngleY = 0.10471976F;

		bodyModel[13].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[13].setRotationPoint(-154.5F, -58.5F, -9.5F);
		bodyModel[13].rotateAngleX = -0.50614548F;
		bodyModel[13].rotateAngleZ = -0.4712389F;

		bodyModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[14].setRotationPoint(-153F, -58.5F, -9.5F);
		bodyModel[14].rotateAngleX = -0.59341195F;

		bodyModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[15].setRotationPoint(-145.5F, -58.5F, -10.5F);
		bodyModel[15].rotateAngleX = -0.59341195F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[16].setRotationPoint(-137.5F, -58.5F, -11.5F);
		bodyModel[16].rotateAngleX = -0.59341195F;

		bodyModel[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[17].setRotationPoint(-137.5F, -58.5F, 11.5F);
		bodyModel[17].rotateAngleX = 0.59341195F;

		bodyModel[18].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[18].setRotationPoint(-145.5F, -58.5F, 10.5F);
		bodyModel[18].rotateAngleX = 0.59341195F;

		bodyModel[19].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[19].setRotationPoint(-153F, -58.5F, 9.5F);
		bodyModel[19].rotateAngleX = 0.59341195F;

		bodyModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[20].setRotationPoint(-154.5F, -58.5F, 9.5F);
		bodyModel[20].rotateAngleX = 0.50614548F;
		bodyModel[20].rotateAngleZ = -0.4712389F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 113, 35, 40, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -10F, 0F, -18F, -10F, 0F, 0F, 0F); // Box 146
		bodyModel[21].setRotationPoint(40F, -59F, -20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 113, 5, 40, 0F,0F, 0F, -12F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 147
		bodyModel[22].setRotationPoint(40F, -64F, -20F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 73, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 8.5F, 0F, 0F); // Box 150
		bodyModel[23].setRotationPoint(137F, -72F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 151
		bodyModel[24].setRotationPoint(149F, -92F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 34, 2, 0F,-4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F); // Box 152
		bodyModel[25].setRotationPoint(171F, -126F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 82, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 190
		bodyModel[26].setRotationPoint(-107F, -41F, -29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 26, 19, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 16F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 16F, -4F, 1F, 0F, 0F, 0F); // Box 191
		bodyModel[27].setRotationPoint(-25F, -41F, -29F);

		bodyModel[28].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[28].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[28].rotateAngleZ = -0.64577182F;

		bodyModel[29].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[29].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[29].rotateAngleX = -0.17453293F;
		bodyModel[29].rotateAngleY = -0.48869219F;

		bodyModel[30].addShapeBox(-0.5F, -0.5F, -11.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[30].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[30].rotateAngleX = 0.17453293F;
		bodyModel[30].rotateAngleY = 0.48869219F;

		bodyModel[31].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[31].setRotationPoint(-155.5F, -63.5F, 0F);
		bodyModel[31].rotateAngleZ = -0.95993109F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[32].setRotationPoint(-155.5F, -63.5F, 0F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[33].setRotationPoint(-153F, -63.5F, -5F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[34].setRotationPoint(-153F, -63.5F, -5F);
		bodyModel[34].rotateAngleX = -0.76794487F;

		bodyModel[35].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[35].setRotationPoint(-153F, -63.5F, 5F);
		bodyModel[35].rotateAngleX = 0.76794487F;

		bodyModel[36].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[36].setRotationPoint(-145.5F, -63.5F, 5F);
		bodyModel[36].rotateAngleX = 0.85521133F;

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[37].setRotationPoint(-145.5F, -63.5F, -5F);

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[38].setRotationPoint(-145.5F, -63.5F, -5F);
		bodyModel[38].rotateAngleX = -0.85521133F;

		bodyModel[39].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[39].setRotationPoint(-137.5F, -63.5F, 5F);
		bodyModel[39].rotateAngleX = 0.90757121F;

		bodyModel[40].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[40].setRotationPoint(-137.5F, -63.5F, -5F);

		bodyModel[41].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[41].setRotationPoint(-137.5F, -63.5F, -5F);
		bodyModel[41].rotateAngleX = -0.90757121F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F); // Box 231
		bodyModel[42].setRotationPoint(-128F, -89F, -0.5F);

		bodyModel[43].addShapeBox(155F, 0F, 0F, 1, 1, 1, 0F,155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F); // Box 232
		bodyModel[43].setRotationPoint(-128F, -89F, -0.5F);
		bodyModel[43].rotateAngleZ = 0.12217305F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 35, 2, 76, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[44].setRotationPoint(147F, -63.5F, -79F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F,-8F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[45].setRotationPoint(169F, -63.5F, -89F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 22, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[46].setRotationPoint(40F, -29F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[47].setRotationPoint(-1F, -69F, 3.5F);
		bodyModel[47].rotateAngleZ = 0.50614548F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[48].setRotationPoint(-25F, -70F, -9F);

		bodyModel[49].addShapeBox(-11F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[49].setRotationPoint(-20F, -69F, -4.5F);
		bodyModel[49].rotateAngleZ = -0.50614548F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[50].setRotationPoint(60F, -29F, -0.5F);
		bodyModel[50].rotateAngleZ = -0.45378561F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[51].setRotationPoint(-6F, -70F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 261
		bodyModel[52].setRotationPoint(-117F, -69F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 262
		bodyModel[53].setRotationPoint(-113F, -69F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[54].setRotationPoint(-114.5F, -67F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[55].setRotationPoint(-156F, -47F, 1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[56].setRotationPoint(-148F, -59F, 1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[57].setRotationPoint(-156F, -47F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[58].setRotationPoint(-148F, -59F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 82, 19, 7, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[59].setRotationPoint(-107F, -41F, 22F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 26, 19, 7, 0F,0F, 0F, 0F, 16F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[60].setRotationPoint(-25F, -41F, 22F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 2, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 309
		bodyModel[61].setRotationPoint(147F, -63.5F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -1F); // Box 310
		bodyModel[62].setRotationPoint(169F, -63.5F, 79F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 123
		noseModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 135
		noseModel[2] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 158
		noseModel[3] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 159
		noseModel[4] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 160
		noseModel[5] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 161
		noseModel[6] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 162
		noseModel[7] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 163
		noseModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 164
		noseModel[9] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 165
		noseModel[10] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 166
		noseModel[11] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 167
		noseModel[12] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 169
		noseModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 170
		noseModel[14] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 171
		noseModel[15] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 172
		noseModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 173
		noseModel[17] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 174
		noseModel[18] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 175
		noseModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 176
		noseModel[20] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 177
		noseModel[21] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 178
		noseModel[22] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 179
		noseModel[23] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 180
		noseModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 181
		noseModel[25] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 182
		noseModel[26] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 183
		noseModel[27] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 184
		noseModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 185
		noseModel[29] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 230
		noseModel[30] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 269
		noseModel[31] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 270

		noseModel[0].addShapeBox(0F, 0F, 0F, 18, 28, 28, 0F,0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F); // Box 123
		noseModel[0].setRotationPoint(-193F, -41F, -14F);

		noseModel[1].addShapeBox(0F, 0F, -1F, 6, 5, 1, 0F,0F, 0F, 0F, -3F, -2.3F, 0F, -3F, -2.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		noseModel[1].setRotationPoint(-165F, -55F, 15F);
		noseModel[1].rotateAngleY = 0.10471976F;

		noseModel[2].addShapeBox(0F, 0F, 0F, 13, 9, 28, 0F,0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 158
		noseModel[2].setRotationPoint(-206F, -41F, -14F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Box 159
		noseModel[3].setRotationPoint(-211F, -37F, -6F);

		noseModel[4].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		noseModel[4].setRotationPoint(-211F, -33F, 0F);
		noseModel[4].rotateAngleZ = -0.62831853F;

		noseModel[5].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		noseModel[5].setRotationPoint(-213.5F, -29F, 0F);
		noseModel[5].rotateAngleZ = -0.19198622F;

		noseModel[6].addShapeBox(-0.5F, -4F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		noseModel[6].setRotationPoint(-213F, -21.5F, 0F);
		noseModel[6].rotateAngleZ = 0.29670597F;

		noseModel[7].addShapeBox(-0.5F, -8F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		noseModel[7].setRotationPoint(-207F, -17F, 0F);
		noseModel[7].rotateAngleZ = 0.89011792F;

		noseModel[8].addShapeBox(-0.5F, -0.5F, -0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		noseModel[8].setRotationPoint(-207F, -17F, 0F);
		noseModel[8].rotateAngleZ = -0.10471976F;

		noseModel[9].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		noseModel[9].setRotationPoint(-202F, -32F, -8F);
		noseModel[9].rotateAngleX = -0.33161256F;

		noseModel[10].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		noseModel[10].setRotationPoint(-202F, -19.5F, -8.2F);
		noseModel[10].rotateAngleX = 0.78539816F;

		noseModel[11].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		noseModel[11].setRotationPoint(-202F, -17.2F, -5F);
		noseModel[11].rotateAngleX = -0.10471976F;

		noseModel[12].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		noseModel[12].setRotationPoint(-202F, -19.5F, 8.2F);
		noseModel[12].rotateAngleX = -0.78539816F;

		noseModel[13].addShapeBox(-0.5F, 0F, -5.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		noseModel[13].setRotationPoint(-202F, -17.2F, 5F);
		noseModel[13].rotateAngleX = 0.10471976F;

		noseModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		noseModel[14].setRotationPoint(-202F, -25F, -10.5F);
		noseModel[14].rotateAngleY = -0.31415927F;

		noseModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		noseModel[15].setRotationPoint(-212F, -25F, -4F);
		noseModel[15].rotateAngleY = -0.57595865F;

		noseModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		noseModel[16].setRotationPoint(-212F, -25F, -4F);
		noseModel[16].rotateAngleY = 0.4712389F;

		noseModel[17].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		noseModel[17].setRotationPoint(-202F, -25.5F, -10.5F);
		noseModel[17].rotateAngleX = 0.36651914F;

		noseModel[18].addShapeBox(-0.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		noseModel[18].setRotationPoint(-212F, -25F, 4F);
		noseModel[18].rotateAngleY = 0.57595865F;

		noseModel[19].addShapeBox(-0.5F, -0.5F, -4.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		noseModel[19].setRotationPoint(-212F, -25F, 4F);
		noseModel[19].rotateAngleY = -0.4712389F;

		noseModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		noseModel[20].setRotationPoint(-202F, -25F, 10.5F);
		noseModel[20].rotateAngleY = 0.31415927F;

		noseModel[21].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		noseModel[21].setRotationPoint(-202F, -32F, 8F);
		noseModel[21].rotateAngleX = 0.33161256F;

		noseModel[22].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		noseModel[22].setRotationPoint(-202F, -25.5F, 10.5F);
		noseModel[22].rotateAngleX = -0.36651914F;

		noseModel[23].addShapeBox(-0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		noseModel[23].setRotationPoint(-202F, -19F, -8F);
		noseModel[23].rotateAngleY = -0.31415927F;

		noseModel[24].addShapeBox(-0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		noseModel[24].setRotationPoint(-202F, -19F, 8F);
		noseModel[24].rotateAngleY = 0.31415927F;

		noseModel[25].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		noseModel[25].setRotationPoint(-208F, -19F, -4F);
		noseModel[25].rotateAngleY = -0.57595865F;

		noseModel[26].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		noseModel[26].setRotationPoint(-208.5F, -19F, -3.5F);
		noseModel[26].rotateAngleY = 0.38397244F;

		noseModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		noseModel[27].setRotationPoint(-208F, -19F, 4F);
		noseModel[27].rotateAngleY = 0.57595865F;

		noseModel[28].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		noseModel[28].setRotationPoint(-208.5F, -19F, 3.5F);
		noseModel[28].rotateAngleY = -0.38397244F;

		noseModel[29].addShapeBox(-0.5F, -0.5F, 0F, 29, 4, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 230
		noseModel[29].setRotationPoint(-203F, -16F, -4F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		noseModel[30].setRotationPoint(-203F, -20F, -3.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		noseModel[31].setRotationPoint(-195F, -30F, -3.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 148
		tailModel[1] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 149

		tailModel[0].addShapeBox(0F, 0F, 0F, 61, 5, 20, 0F,0F, 0F, -7F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 0F, 0F); // Box 148
		tailModel[0].setRotationPoint(153F, -64F, -10F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 61, 17, 20, 0F,0F, 0F, 0F, 0F, 4F, -9F, 0F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, -7F, -6F, -31F, -7F, -6F, 0F, 0F, 0F); // Box 149
		tailModel[1].setRotationPoint(153F, -59F, -10F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 186
		leftWingModel[1] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 187
		leftWingModel[2] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 188
		leftWingModel[3] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 192
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 193
		leftWingModel[5] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 194
		leftWingModel[6] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 195
		leftWingModel[7] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 196
		leftWingModel[8] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 197
		leftWingModel[9] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 198
		leftWingModel[10] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 199
		leftWingModel[11] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 200
		leftWingModel[12] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 201
		leftWingModel[13] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 202
		leftWingModel[14] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 203
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 204
		leftWingModel[16] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 205
		leftWingModel[17] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 206
		leftWingModel[18] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 207
		leftWingModel[19] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Box 208
		leftWingModel[20] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Box 209
		leftWingModel[21] = new ModelRendererTurbo(this, 625, 273, textureX, textureY); // Box 210
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 211
		leftWingModel[23] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 212
		leftWingModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 213
		leftWingModel[25] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 214
		leftWingModel[26] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 215
		leftWingModel[27] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 236
		leftWingModel[28] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 237
		leftWingModel[29] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 238

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 53, 10, 148, 0F,0F, 0F, 0F, 0F, 0F, 0F, 18F, -8F, 0F, 11F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 17F, 0F, 11F, 17F, 0F); // Box 186
		leftWingModel[0].setRotationPoint(-96F, -49F, -177F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 39, 5, 109, 0F,0F, 0F, 0F, 0F, 0F, 0F, 21F, -8F, 0F, 10F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, 13F, 0F, 10F, 13F, 0F); // Box 187
		leftWingModel[1].setRotationPoint(-86F, -57F, -286F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 39, 5, 15, 0F,-7F, 1F, 0F, -10F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -10F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftWingModel[2].setRotationPoint(-86F, -57F, -301F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 65, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 192
		leftWingModel[3].setRotationPoint(-137F, -42.5F, -75F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 40, 25, 26, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 193
		leftWingModel[4].setRotationPoint(-71F, -42.5F, -75F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 4, 26, 26, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 194
		leftWingModel[5].setRotationPoint(-141F, -42.5F, -75F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftWingModel[6].setRotationPoint(-161F, -39.5F, -75F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftWingModel[7].setRotationPoint(-161F, -42.5F, -75F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 197
		leftWingModel[8].setRotationPoint(-161F, -19.5F, -75F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 3, 20, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 198
		leftWingModel[9].setRotationPoint(-164F, -39.5F, -75F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 199
		leftWingModel[10].setRotationPoint(-164F, -42.5F, -75F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F); // Box 200
		leftWingModel[11].setRotationPoint(-164F, -19.5F, -75F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[12].setRotationPoint(-168F, -30.5F, -63.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 202
		leftWingModel[13].setRotationPoint(-171F, -30.5F, -63.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 203
		leftWingModel[14].setRotationPoint(-169F, -30.5F, -63.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 42, 26, 26, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 204
		leftWingModel[15].setRotationPoint(-114F, -46.5F, -143F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 32, 25, 26, 0F,0F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 205
		leftWingModel[16].setRotationPoint(-72F, -46.5F, -143F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 26, 26, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 206
		leftWingModel[17].setRotationPoint(-118F, -46.5F, -143F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 20, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingModel[18].setRotationPoint(-138F, -43.5F, -143F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 208
		leftWingModel[19].setRotationPoint(-138F, -23.5F, -143F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F); // Box 209
		leftWingModel[20].setRotationPoint(-141F, -23.5F, -143F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 20, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 210
		leftWingModel[21].setRotationPoint(-141F, -43.5F, -143F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[22].setRotationPoint(-138F, -46.5F, -143F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 212
		leftWingModel[23].setRotationPoint(-141F, -46.5F, -143F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftWingModel[24].setRotationPoint(-145F, -34.5F, -131.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 214
		leftWingModel[25].setRotationPoint(-146F, -34.5F, -131.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 215
		leftWingModel[26].setRotationPoint(-148F, -34.5F, -131.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[27].setRotationPoint(-105F, -49.5F, -137F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		leftWingModel[28].setRotationPoint(-96F, -49.5F, -134F);
		leftWingModel[28].rotateAngleZ = 0.40142573F;

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftWingModel[29].setRotationPoint(-96F, -49.5F, -127F);
		leftWingModel[29].rotateAngleZ = 0.40142573F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 273
		rightWingModel[1] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 274
		rightWingModel[2] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 275
		rightWingModel[3] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 277
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 278
		rightWingModel[5] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 279
		rightWingModel[6] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 280
		rightWingModel[7] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 281
		rightWingModel[8] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 282
		rightWingModel[9] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 283
		rightWingModel[10] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 284
		rightWingModel[11] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 285
		rightWingModel[12] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 286
		rightWingModel[13] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 287
		rightWingModel[14] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 288
		rightWingModel[15] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 289
		rightWingModel[16] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 290
		rightWingModel[17] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 291
		rightWingModel[18] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 292
		rightWingModel[19] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Box 293
		rightWingModel[20] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Box 294
		rightWingModel[21] = new ModelRendererTurbo(this, 625, 273, textureX, textureY); // Box 295
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 296
		rightWingModel[23] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 297
		rightWingModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 298
		rightWingModel[25] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 299
		rightWingModel[26] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 300
		rightWingModel[27] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 301
		rightWingModel[28] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 302
		rightWingModel[29] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 303

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 53, 10, 148, 0F,11F, -8F, 0F, 18F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 17F, 0F, 18F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		rightWingModel[0].setRotationPoint(-96F, -49F, 29F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 39, 5, 109, 0F,10F, -8F, 0F, 21F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 13F, 0F, 21F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightWingModel[1].setRotationPoint(-86F, -57F, 177F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 39, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 1F, -2F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, -2F, -7F, -2F, 0F); // Box 275
		rightWingModel[2].setRotationPoint(-86F, -57F, 286F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 65, 26, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 277
		rightWingModel[3].setRotationPoint(-137F, -42.5F, 49F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 40, 25, 26, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 278
		rightWingModel[4].setRotationPoint(-71F, -42.5F, 49F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 26, 26, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 279
		rightWingModel[5].setRotationPoint(-141F, -42.5F, 49F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 20, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[6].setRotationPoint(-161F, -39.5F, 49F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[7].setRotationPoint(-161F, -42.5F, 49F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 282
		rightWingModel[8].setRotationPoint(-161F, -19.5F, 49F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 3, 20, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 283
		rightWingModel[9].setRotationPoint(-164F, -39.5F, 49F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 284
		rightWingModel[10].setRotationPoint(-164F, -42.5F, 49F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F); // Box 285
		rightWingModel[11].setRotationPoint(-164F, -19.5F, 49F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightWingModel[12].setRotationPoint(-168F, -30.5F, 60.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 287
		rightWingModel[13].setRotationPoint(-171F, -30.5F, 60.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 288
		rightWingModel[14].setRotationPoint(-169F, -30.5F, 60.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 42, 26, 26, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 289
		rightWingModel[15].setRotationPoint(-114F, -46.5F, 117F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 32, 25, 26, 0F,0F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 290
		rightWingModel[16].setRotationPoint(-72F, -46.5F, 117F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 4, 26, 26, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 291
		rightWingModel[17].setRotationPoint(-118F, -46.5F, 117F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 20, 20, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightWingModel[18].setRotationPoint(-138F, -43.5F, 117F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 293
		rightWingModel[19].setRotationPoint(-138F, -23.5F, 117F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F); // Box 294
		rightWingModel[20].setRotationPoint(-141F, -23.5F, 117F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 20, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 295
		rightWingModel[21].setRotationPoint(-141F, -43.5F, 117F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 20, 3, 26, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightWingModel[22].setRotationPoint(-138F, -46.5F, 117F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 26, 0F,0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.9F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 297
		rightWingModel[23].setRotationPoint(-141F, -46.5F, 117F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		rightWingModel[24].setRotationPoint(-145F, -34.5F, 128.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 299
		rightWingModel[25].setRotationPoint(-146F, -34.5F, 128.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 300
		rightWingModel[26].setRotationPoint(-148F, -34.5F, 128.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightWingModel[27].setRotationPoint(-105F, -49.5F, 123F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightWingModel[28].setRotationPoint(-96F, -49.5F, 133F);
		rightWingModel[28].rotateAngleZ = 0.40142573F;

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		rightWingModel[29].setRotationPoint(-96F, -49.5F, 126F);
		rightWingModel[29].rotateAngleZ = 0.40142573F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 153
		yawFlapModel[1] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 154
		yawFlapModel[2] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 155
		yawFlapModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 156
		yawFlapModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 157

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 18, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		yawFlapModel[0].setRotationPoint(182F, -126F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 24, 16, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 154
		yawFlapModel[1].setRotationPoint(182F, -108F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 27, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 155
		yawFlapModel[2].setRotationPoint(182F, -92F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, -1F, 11, 10, 2, 0F,0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 156
		yawFlapModel[3].setRotationPoint(182F, -136F, 0F);

		yawFlapModel[4].addShapeBox(-7F, 0F, -1F, 7, 10, 2, 0F,-3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 157
		yawFlapModel[4].setRotationPoint(182F, -136F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Box 234

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 27, 2, 76, 0F,0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		pitchFlapLeftModel[0].setRotationPoint(182F, -62.5F, -79F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Box 311

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 27, 2, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 311
		pitchFlapRightModel[0].setRotationPoint(182F, -62.5F, 3F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 189

		pitchFlapLeftWingModel[0].addShapeBox(0F, -4F, -74F, 26, 8, 148, 0F,0F, 0F, 0.5F, -9F, -2F, -1.5F, 0F, -11F, 4F, 0F, -8F, 0F, 0F, 0F, 0.5F, -9F, -2F, -1.5F, 0F, 13F, 4F, 0F, 17F, 0F); // Box 189
		pitchFlapLeftWingModel[0].setRotationPoint(-34F, -44F, -103F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.12217305F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 276

		pitchFlapRightWingModel[0].addShapeBox(0F, -4F, -74F, 26, 8, 148, 0F,0F, -8F, 0F, 0F, -11F, 4F, -9F, -2F, -1.5F, 0F, 0F, 0.5F, 0F, 17F, 0F, 0F, 13F, 4F, -9F, -2F, -1.5F, 0F, 0F, 0.5F); // Box 276
		pitchFlapRightWingModel[0].setRotationPoint(-34F, -44F, 103F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.12217305F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 256
		tailWheelModel[1] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 257
		tailWheelModel[2] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 258
		tailWheelModel[3] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 259
		tailWheelModel[4] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 260

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		tailWheelModel[0].setRotationPoint(175F, -41.5F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		tailWheelModel[1].setRotationPoint(175F, -44.5F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		tailWheelModel[2].setRotationPoint(175F, -37.5F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		tailWheelModel[3].setRotationPoint(172F, -48.5F, -3F);
		tailWheelModel[3].rotateAngleZ = 0.57595865F;

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		tailWheelModel[4].setRotationPoint(172F, -48.5F, 2F);
		tailWheelModel[4].rotateAngleZ = 0.57595865F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 246
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 247
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 248
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 249
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 250

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		leftWingWheelModel[0].setRotationPoint(-102F, -5F, -66F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingWheelModel[1].setRotationPoint(-102F, -13F, -66F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 248
		leftWingWheelModel[2].setRotationPoint(-102F, 3F, -66F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingWheelModel[3].setRotationPoint(-93F, -18F, -68F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[4].setRotationPoint(-93F, -18F, -58F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 304
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 305
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 306
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 307
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 308

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightWingWheelModel[0].setRotationPoint(-102F, -5F, 58F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightWingWheelModel[1].setRotationPoint(-102F, -13F, 58F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 306
		rightWingWheelModel[2].setRotationPoint(-102F, 3F, 58F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightWingWheelModel[3].setRotationPoint(-93F, -18F, 66F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightWingWheelModel[4].setRotationPoint(-93F, -18F, 56F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-167.5F, -29F, -62F);
		propellerModels[1] = makeProp2(-144.5F, -33F, -130F);
		propellerModels[2] = makeProp3(-167.5F, -29F, 62F);
		propellerModels[3] = makeProp4(-144.5F, -33F, 130F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[1].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[2].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[1].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[2].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[1].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[2].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[1].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[2].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}