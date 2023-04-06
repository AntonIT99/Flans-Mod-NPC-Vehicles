//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PiaggioA
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPiaggioA extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelPiaggioA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];
		noseModel = new ModelRendererTurbo[8];
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
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 136
		bodyModel[11] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 137
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 138
		bodyModel[13] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 139
		bodyModel[14] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 140
		bodyModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 141
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 142
		bodyModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 143
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 144
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 145
		bodyModel[20] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 146
		bodyModel[21] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 147
		bodyModel[22] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 150
		bodyModel[23] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 151
		bodyModel[24] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 152
		bodyModel[25] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 190
		bodyModel[26] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 191
		bodyModel[27] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 216
		bodyModel[28] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 217
		bodyModel[29] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 218
		bodyModel[30] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 219
		bodyModel[31] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 220
		bodyModel[32] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 221
		bodyModel[33] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 222
		bodyModel[34] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 223
		bodyModel[35] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 224
		bodyModel[36] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 225
		bodyModel[37] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 226
		bodyModel[38] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 227
		bodyModel[39] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 228
		bodyModel[40] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 229
		bodyModel[41] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 231
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 232
		bodyModel[43] = new ModelRendererTurbo(this, 609, 289, textureX, textureY); // Box 233
		bodyModel[44] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 235
		bodyModel[45] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 239
		bodyModel[46] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 240
		bodyModel[47] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 241
		bodyModel[48] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 242
		bodyModel[49] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 243
		bodyModel[50] = new ModelRendererTurbo(this, 625, 225, textureX, textureY); // Box 244
		bodyModel[51] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 306
		bodyModel[52] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 308
		bodyModel[53] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 267
		bodyModel[54] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 268
		bodyModel[55] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 271
		bodyModel[56] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 272
		bodyModel[57] = new ModelRendererTurbo(this, 609, 289, textureX, textureY); // Box 309
		bodyModel[58] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 310

		bodyModel[0].addShapeBox(0F, 0F, 0F, 98, 30, 34, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F); // Box 124
		bodyModel[0].setRotationPoint(-175F, -43F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 10, 24, 0F,0F, -2F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, -2F, 0F, 0F, -4F, 2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, -4F, 2F); // Box 125
		bodyModel[1].setRotationPoint(-183F, -48F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 6, 16, 0F,1F, -6F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 1F, -6F, 2F, 4F, 4F, 3F, 0F, 0F, 7F, 0F, 0F, 7F, 4F, 4F, 3F); // Box 126
		bodyModel[2].setRotationPoint(-193F, -46F, -8F);

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

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[10].setRotationPoint(-155F, -59F, -10F);
		bodyModel[10].rotateAngleY = -0.10471976F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[11].setRotationPoint(-155F, -59F, 9F);
		bodyModel[11].rotateAngleY = 0.10471976F;

		bodyModel[12].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[12].setRotationPoint(-154.5F, -58.5F, -9.5F);
		bodyModel[12].rotateAngleX = -0.31415927F;
		bodyModel[12].rotateAngleZ = -0.76794487F;

		bodyModel[13].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[13].setRotationPoint(-153F, -58.5F, -9.5F);
		bodyModel[13].rotateAngleX = -0.59341195F;

		bodyModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[14].setRotationPoint(-145.5F, -58.5F, -10.5F);
		bodyModel[14].rotateAngleX = -0.59341195F;

		bodyModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[15].setRotationPoint(-137.5F, -58.5F, -11.5F);
		bodyModel[15].rotateAngleX = -0.59341195F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[16].setRotationPoint(-137.5F, -58.5F, 11.5F);
		bodyModel[16].rotateAngleX = 0.59341195F;

		bodyModel[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[17].setRotationPoint(-145.5F, -58.5F, 10.5F);
		bodyModel[17].rotateAngleX = 0.59341195F;

		bodyModel[18].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[18].setRotationPoint(-153F, -58.5F, 9.5F);
		bodyModel[18].rotateAngleX = 0.59341195F;

		bodyModel[19].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[19].setRotationPoint(-154.5F, -58.5F, 9.5F);
		bodyModel[19].rotateAngleX = 0.31415927F;
		bodyModel[19].rotateAngleZ = -0.76794487F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 113, 35, 40, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -10F, 0F, -18F, -10F, 0F, 0F, 0F); // Box 146
		bodyModel[20].setRotationPoint(40F, -59F, -20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 113, 5, 40, 0F,0F, 0F, -12F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 147
		bodyModel[21].setRotationPoint(40F, -64F, -20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 73, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 8.5F, 0F, 0F); // Box 150
		bodyModel[22].setRotationPoint(137F, -72F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 33, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F); // Box 151
		bodyModel[23].setRotationPoint(149F, -92F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 34, 2, 0F,-4F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 5F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F); // Box 152
		bodyModel[24].setRotationPoint(171F, -126F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 82, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 190
		bodyModel[25].setRotationPoint(-107F, -41F, -29F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 26, 19, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 16F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 16F, -4F, 1F, 0F, 0F, 0F); // Box 191
		bodyModel[26].setRotationPoint(-25F, -41F, -29F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[27].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[27].rotateAngleZ = -0.62831853F;

		bodyModel[28].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[28].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[28].rotateAngleX = -0.17453293F;
		bodyModel[28].rotateAngleY = -0.48869219F;

		bodyModel[29].addShapeBox(-0.5F, -0.5F, -11.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[29].setRotationPoint(-159.5F, -60.5F, 0F);
		bodyModel[29].rotateAngleX = 0.17453293F;
		bodyModel[29].rotateAngleY = 0.48869219F;

		bodyModel[30].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[30].setRotationPoint(-155.5F, -63.5F, 0F);
		bodyModel[30].rotateAngleZ = -0.95993109F;

		bodyModel[31].addShapeBox(-0.5F, -0.5F, -0.5F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[31].setRotationPoint(-155.5F, -63.5F, 0F);

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[32].setRotationPoint(-153F, -63.5F, -5F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[33].setRotationPoint(-153F, -63.5F, -5F);
		bodyModel[33].rotateAngleX = -0.76794487F;

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[34].setRotationPoint(-153F, -63.5F, 5F);
		bodyModel[34].rotateAngleX = 0.76794487F;

		bodyModel[35].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[35].setRotationPoint(-145.5F, -63.5F, 5F);
		bodyModel[35].rotateAngleX = 0.85521133F;

		bodyModel[36].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[36].setRotationPoint(-145.5F, -63.5F, -5F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[37].setRotationPoint(-145.5F, -63.5F, -5F);
		bodyModel[37].rotateAngleX = -0.85521133F;

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[38].setRotationPoint(-137.5F, -63.5F, 5F);
		bodyModel[38].rotateAngleX = 0.90757121F;

		bodyModel[39].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[39].setRotationPoint(-137.5F, -63.5F, -5F);

		bodyModel[40].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[40].setRotationPoint(-137.5F, -63.5F, -5F);
		bodyModel[40].rotateAngleX = -0.90757121F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F, 0.5F, 20F, 0.5F); // Box 231
		bodyModel[41].setRotationPoint(-128F, -89F, -0.5F);

		bodyModel[42].addShapeBox(155F, 0F, 0F, 1, 1, 1, 0F,155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F, 155F, -0.2F, -0.2F); // Box 232
		bodyModel[42].setRotationPoint(-128F, -89F, -0.5F);
		bodyModel[42].rotateAngleZ = 0.12217305F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 35, 2, 76, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[43].setRotationPoint(147F, -63.5F, -79F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F,-8F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[44].setRotationPoint(169F, -63.5F, -89F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[45].setRotationPoint(40F, -29F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[46].setRotationPoint(-1F, -69F, 3.5F);
		bodyModel[46].rotateAngleZ = 0.50614548F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[47].setRotationPoint(-25F, -70F, -9F);

		bodyModel[48].addShapeBox(-11F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[48].setRotationPoint(-20F, -69F, -4.5F);
		bodyModel[48].rotateAngleZ = -0.50614548F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[49].setRotationPoint(60F, -29F, -0.5F);
		bodyModel[49].rotateAngleZ = -0.45378561F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[50].setRotationPoint(-6F, -70F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[51].setRotationPoint(-156F, -47F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[52].setRotationPoint(-148F, -59F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[53].setRotationPoint(-156F, -47F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[54].setRotationPoint(-148F, -59F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 82, 19, 7, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[55].setRotationPoint(-107F, -41F, 22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 26, 19, 7, 0F,0F, 0F, 0F, 16F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[56].setRotationPoint(-25F, -41F, 22F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 35, 2, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 309
		bodyModel[57].setRotationPoint(147F, -63.5F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -1F); // Box 310
		bodyModel[58].setRotationPoint(169F, -63.5F, 79F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 123
		noseModel[1] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 158
		noseModel[2] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 159
		noseModel[3] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 181
		noseModel[4] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 182
		noseModel[5] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 183
		noseModel[6] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 184
		noseModel[7] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 185

		noseModel[0].addShapeBox(0F, 0F, 0F, 18, 28, 28, 0F,0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F); // Box 123
		noseModel[0].setRotationPoint(-193F, -41F, -14F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 13, 11, 28, 0F,0F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 158
		noseModel[1].setRotationPoint(-206F, -41F, -14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,-1F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5.5F); // Box 159
		noseModel[2].setRotationPoint(-213F, -37F, -6F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5.5F, -1F, -4F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, -5.5F); // Box 181
		noseModel[3].setRotationPoint(-213F, -25F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 13, 10, 28, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F); // Box 182
		noseModel[4].setRotationPoint(-206F, -25F, -14F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 13, 5, 28, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 183
		noseModel[5].setRotationPoint(-206F, -30F, -14F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5.5F); // Box 184
		noseModel[6].setRotationPoint(-213F, -30F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		noseModel[7].setRotationPoint(-211F, -18.5F, -1F);
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