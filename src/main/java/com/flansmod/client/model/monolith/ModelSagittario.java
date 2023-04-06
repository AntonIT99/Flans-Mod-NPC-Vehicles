//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sagittario
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSagittario extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSagittario() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[57];
		noseModel = new ModelRendererTurbo[18];
		tailModel = new ModelRendererTurbo[6];
		leftWingModel = new ModelRendererTurbo[12];
		rightWingModel = new ModelRendererTurbo[12];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		tailWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 111
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 112
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 113
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 114
		bodyModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 115
		bodyModel[5] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 116
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 117
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 118
		bodyModel[8] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 119
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 120
		bodyModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 121
		bodyModel[11] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 122
		bodyModel[12] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 123
		bodyModel[13] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 124
		bodyModel[14] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 125
		bodyModel[15] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 133
		bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 134
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 135
		bodyModel[18] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 136
		bodyModel[19] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 150
		bodyModel[20] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 151
		bodyModel[21] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 155
		bodyModel[22] = new ModelRendererTurbo(this, 1, 74, textureX, textureY); // Box 156
		bodyModel[23] = new ModelRendererTurbo(this, 97, 150, textureX, textureY); // Box 157
		bodyModel[24] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 158
		bodyModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 159
		bodyModel[26] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 160
		bodyModel[27] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 164
		bodyModel[28] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 165
		bodyModel[29] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 178
		bodyModel[30] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 179
		bodyModel[31] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 199
		bodyModel[32] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 200
		bodyModel[33] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 201
		bodyModel[34] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 202
		bodyModel[35] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 203
		bodyModel[36] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 204
		bodyModel[37] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 205
		bodyModel[38] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 206
		bodyModel[39] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 207
		bodyModel[40] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 208
		bodyModel[41] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 209
		bodyModel[42] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 212
		bodyModel[43] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 213
		bodyModel[44] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 214
		bodyModel[45] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 89
		bodyModel[46] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 90
		bodyModel[47] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 91
		bodyModel[48] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 221
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 222
		bodyModel[50] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 223
		bodyModel[51] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 224
		bodyModel[52] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 225
		bodyModel[53] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 226
		bodyModel[54] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 227
		bodyModel[55] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 228
		bodyModel[56] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 229

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 111
		bodyModel[0].setRotationPoint(-56F, -32F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, -7F); // Box 112
		bodyModel[1].setRotationPoint(-56F, -18F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 113
		bodyModel[2].setRotationPoint(-56F, -25F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 8, 20, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, -7F); // Box 114
		bodyModel[3].setRotationPoint(-21F, -18F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 115
		bodyModel[4].setRotationPoint(-21F, -25F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, -7.5F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0.5F, 7.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 116
		bodyModel[5].setRotationPoint(-21F, -32F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -0.3F, 0F, 0F, -1.1F, 0F, 0F, 1.1F, 0F, 0F, 0.3F); // Box 117
		bodyModel[6].setRotationPoint(-14F, -29F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, -4F, 0F, 0.5F, -5F, 0F, 0.5F, 5F, 0F, 0F, 4F, 0F, 0F, -1.1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.1F); // Box 118
		bodyModel[7].setRotationPoint(-1F, -29F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 119
		bodyModel[8].setRotationPoint(-1F, -34.5F, -5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0.7F, -1.5F, 0F, -0.7F, -2F, 0F, -0.7F, -2F, 0F, 0.7F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 1.5F); // Box 120
		bodyModel[9].setRotationPoint(-1F, -36.5F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 7, 18, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F); // Box 121
		bodyModel[10].setRotationPoint(10F, -25F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 4, 18, 0F,0F, 0.5F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 122
		bodyModel[11].setRotationPoint(10F, -29F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 30, 6, 18, 0F,0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, -6F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0.5F, -6F); // Box 123
		bodyModel[12].setRotationPoint(10F, -18F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 4, 11, 0F,0F, 0F, -1.5F, 0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 3.5F, -2F, 0F, 3.5F, -2F, 0F, 0F, 0F); // Box 124
		bodyModel[13].setRotationPoint(10F, -33.5F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 2, 7, 0F,0F, -0.7F, -2F, 3F, -8F, -3.2F, 3F, -8F, -3.2F, 0F, -0.7F, -2F, 0F, 1F, 0.5F, 0F, 6F, -2.5F, 0F, 6F, -2.5F, 0F, 1F, 0.5F); // Box 125
		bodyModel[14].setRotationPoint(10F, -36.5F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 133
		bodyModel[15].setRotationPoint(-21F, -25F, 9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, 7.5F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0.5F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 134
		bodyModel[16].setRotationPoint(-21F, -32F, 9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.3F); // Box 135
		bodyModel[17].setRotationPoint(-14F, -29F, 9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 4F, 0F, 0.5F, 5F, 0F, 0.5F, -5F, 0F, 0F, -4F, 0F, 0F, 1.1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.1F); // Box 136
		bodyModel[18].setRotationPoint(-1F, -29F, 9.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[19].setRotationPoint(-29F, -11.5F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,0F, 1.5F, 1.5F, -1F, 1.5F, 1.5F, -1F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[20].setRotationPoint(-21F, -11.5F, -4F);

		bodyModel[21].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 155
		bodyModel[21].setRotationPoint(-54F, -18F, -10F);
		bodyModel[21].rotateAngleX = 0.36651914F;
		bodyModel[21].rotateAngleY = -0.20943951F;
		bodyModel[21].rotateAngleZ = -0.05235988F;

		bodyModel[22].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 156
		bodyModel[22].setRotationPoint(-50.5F, -17.9F, -10.25F);
		bodyModel[22].rotateAngleX = 0.36651914F;
		bodyModel[22].rotateAngleY = -0.20943951F;
		bodyModel[22].rotateAngleZ = -0.05235988F;

		bodyModel[23].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 157
		bodyModel[23].setRotationPoint(-47F, -17.8F, -10.5F);
		bodyModel[23].rotateAngleX = 0.36651914F;
		bodyModel[23].rotateAngleY = -0.20943951F;
		bodyModel[23].rotateAngleZ = -0.05235988F;

		bodyModel[24].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 158
		bodyModel[24].setRotationPoint(-47F, -17.8F, 10.5F);
		bodyModel[24].rotateAngleX = -0.36651914F;
		bodyModel[24].rotateAngleY = 0.20943951F;
		bodyModel[24].rotateAngleZ = -0.05235988F;

		bodyModel[25].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 159
		bodyModel[25].setRotationPoint(-50.5F, -17.9F, 10.25F);
		bodyModel[25].rotateAngleX = -0.36651914F;
		bodyModel[25].rotateAngleY = 0.20943951F;
		bodyModel[25].rotateAngleZ = -0.05235988F;

		bodyModel[26].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 160
		bodyModel[26].setRotationPoint(-54F, -18F, 10F);
		bodyModel[26].rotateAngleX = -0.36651914F;
		bodyModel[26].rotateAngleY = 0.20943951F;
		bodyModel[26].rotateAngleZ = -0.05235988F;

		bodyModel[27].addShapeBox(-2.5F, -1F, -0.5F, 19, 4, 3, 0F,0F, -1F, -0.2F, -7F, -1F, -0.5F, 5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -7F, -1F, -0.3F, 5F, 0F, 0F, 0F, 1F, 0F); // Box 164
		bodyModel[27].setRotationPoint(-53.5F, -23.9F, -12F);

		bodyModel[28].addShapeBox(-2.5F, -1F, -0.5F, 19, 4, 3, 0F,0F, 0.5F, 0F, 5F, -0.5F, 0F, -7F, -1F, -0.5F, 0F, -1F, -0.2F, 0F, 1F, 0F, 5F, 0F, 0F, -7F, -1F, -0.3F, 0F, -1F, 0F); // Box 165
		bodyModel[28].setRotationPoint(-53.5F, -23.9F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 178
		bodyModel[29].setRotationPoint(5.5F, -48.5F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,32F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 32F, -0.3F, -0.3F, 32F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 32F, -0.3F, -0.3F); // Box 179
		bodyModel[30].setRotationPoint(38F, -50F, -0.5F);
		bodyModel[30].rotateAngleZ = 0.05235988F;

		bodyModel[31].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[31].setRotationPoint(-13.5F, -29.5F, 7F);
		bodyModel[31].rotateAngleY = -0.06981317F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[32].setRotationPoint(-13.5F, -35.5F, 4F);
		bodyModel[32].rotateAngleY = -0.03490659F;
		bodyModel[32].rotateAngleZ = -0.05235988F;

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[33].setRotationPoint(-14F, -35.5F, 4F);
		bodyModel[33].rotateAngleX = 0.41887902F;
		bodyModel[33].rotateAngleZ = -0.06981317F;

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[34].setRotationPoint(-13.5F, -35.5F, -4F);
		bodyModel[34].rotateAngleY = 0.03490659F;
		bodyModel[34].rotateAngleZ = -0.05235988F;

		bodyModel[35].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[35].setRotationPoint(-14F, -35.5F, -4F);
		bodyModel[35].rotateAngleX = -0.41887902F;
		bodyModel[35].rotateAngleZ = -0.06981317F;

		bodyModel[36].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[36].setRotationPoint(-13.5F, -29.5F, -7F);
		bodyModel[36].rotateAngleY = 0.06981317F;

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[37].setRotationPoint(-14.5F, -36.2F, 2.5F);
		bodyModel[37].rotateAngleZ = -0.9424778F;

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[38].setRotationPoint(-14.5F, -36.2F, -2.5F);
		bodyModel[38].rotateAngleZ = -0.9424778F;

		bodyModel[39].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 207
		bodyModel[39].setRotationPoint(-7F, -35.5F, -4F);
		bodyModel[39].rotateAngleX = 0.4712389F;

		bodyModel[40].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[40].setRotationPoint(-14F, -37.3F, 0.2F);
		bodyModel[40].rotateAngleX = -0.43633231F;

		bodyModel[41].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 209
		bodyModel[41].setRotationPoint(-7F, -37.3F, 0.2F);
		bodyModel[41].rotateAngleX = -0.43633231F;

		bodyModel[42].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[42].setRotationPoint(-14F, -35.5F, -4F);
		bodyModel[42].rotateAngleX = 0.4712389F;

		bodyModel[43].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 213
		bodyModel[43].setRotationPoint(-7F, -35F, 4.2F);
		bodyModel[43].rotateAngleX = 0.41887902F;
		bodyModel[43].rotateAngleZ = -0.06981317F;

		bodyModel[44].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 214
		bodyModel[44].setRotationPoint(-7F, -35F, -4.2F);
		bodyModel[44].rotateAngleX = -0.41887902F;
		bodyModel[44].rotateAngleZ = -0.06981317F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[45].setRotationPoint(-2F, -36F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 18, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[46].setRotationPoint(-2F, -32F, -2.5F);
		bodyModel[46].rotateAngleZ = -0.12217305F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[47].setRotationPoint(-11F, -22F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 221
		bodyModel[48].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[49].setRotationPoint(-17F, -32.2F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[50].setRotationPoint(-20.5F, -32F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[51].setRotationPoint(-18F, -35.05F, -1F);

		bodyModel[52].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[52].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[52].rotateAngleZ = 0.27925268F;

		bodyModel[53].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[53].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[53].rotateAngleZ = 0.27925268F;

		bodyModel[54].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[54].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[54].rotateAngleZ = 0.27925268F;

		bodyModel[55].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[55].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[55].rotateAngleZ = 0.27925268F;

		bodyModel[56].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[56].setRotationPoint(-21F, -31.5F, -10F);
		bodyModel[56].rotateAngleZ = 0.27925268F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 126
		noseModel[1] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 127
		noseModel[2] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 128
		noseModel[3] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 130
		noseModel[4] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 131
		noseModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 132
		noseModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 137
		noseModel[7] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 138
		noseModel[8] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 139
		noseModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 152
		noseModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 153
		noseModel[11] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 154
		noseModel[12] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 161
		noseModel[13] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 162
		noseModel[14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 163
		noseModel[15] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 176
		noseModel[16] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 177
		noseModel[17] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 253

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 126
		noseModel[0].setRotationPoint(-70F, -25F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F,0F, -2.5F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2.5F, -7.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 127
		noseModel[1].setRotationPoint(-70F, -32F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -7.5F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, -2F, -7.5F); // Box 128
		noseModel[2].setRotationPoint(-70F, -18F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 130
		noseModel[3].setRotationPoint(-76F, -24.5F, -8F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, -2.5F, -6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2.5F, -6F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F); // Box 131
		noseModel[4].setRotationPoint(-76F, -29.5F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, -1.5F, -6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -1.5F, -6F); // Box 132
		noseModel[5].setRotationPoint(-76F, -19F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -4F, 0F, 0F, -5F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -4F); // Box 137
		noseModel[6].setRotationPoint(-85F, -22.75F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, -4.9F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4.9F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 138
		noseModel[7].setRotationPoint(-85F, -26.75F, -6F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -4.9F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4.9F, -5F); // Box 139
		noseModel[8].setRotationPoint(-85F, -18.75F, -6F);

		noseModel[9].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 152
		noseModel[9].setRotationPoint(-64.75F, -18.2F, -8.5F);
		noseModel[9].rotateAngleX = 0.36651914F;
		noseModel[9].rotateAngleY = -0.20943951F;
		noseModel[9].rotateAngleZ = -0.05235988F;

		noseModel[10].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 153
		noseModel[10].setRotationPoint(-60.75F, -18.2F, -9.5F);
		noseModel[10].rotateAngleX = 0.36651914F;
		noseModel[10].rotateAngleY = -0.20943951F;
		noseModel[10].rotateAngleZ = -0.05235988F;

		noseModel[11].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 154
		noseModel[11].setRotationPoint(-57F, -18.1F, -9.7F);
		noseModel[11].rotateAngleX = 0.36651914F;
		noseModel[11].rotateAngleY = -0.20943951F;
		noseModel[11].rotateAngleZ = -0.05235988F;

		noseModel[12].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 161
		noseModel[12].setRotationPoint(-57F, -18.1F, 9.7F);
		noseModel[12].rotateAngleX = -0.36651914F;
		noseModel[12].rotateAngleY = 0.20943951F;
		noseModel[12].rotateAngleZ = -0.05235988F;

		noseModel[13].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 162
		noseModel[13].setRotationPoint(-60.75F, -18.2F, 9.5F);
		noseModel[13].rotateAngleX = -0.36651914F;
		noseModel[13].rotateAngleY = 0.20943951F;
		noseModel[13].rotateAngleZ = -0.05235988F;

		noseModel[14].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 163
		noseModel[14].setRotationPoint(-64.75F, -18.2F, 8.5F);
		noseModel[14].rotateAngleX = -0.36651914F;
		noseModel[14].rotateAngleY = 0.20943951F;
		noseModel[14].rotateAngleZ = -0.05235988F;

		noseModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		noseModel[15].setRotationPoint(-66F, -30F, -4F);
		noseModel[15].rotateAngleZ = 0.10471976F;

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		noseModel[16].setRotationPoint(-66F, -30F, 3F);
		noseModel[16].rotateAngleZ = 0.10471976F;

		noseModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 253
		noseModel[17].setRotationPoint(-86.5F, -21.25F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 166
		tailModel[1] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 167
		tailModel[2] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 168
		tailModel[3] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 169
		tailModel[4] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 170
		tailModel[5] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 173

		tailModel[0].addShapeBox(0F, 0F, 0F, 43, 5, 13, 0F,0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0.5F, 0F); // Box 166
		tailModel[0].setRotationPoint(40F, -24.5F, -6.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 43, 4, 13, 0F,0F, 0F, -4F, 0F, -5.9F, -6F, 0F, -5.9F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, 2F, -6F, 0F, 0F, 0F); // Box 167
		tailModel[1].setRotationPoint(40F, -28.5F, -6.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 43, 4, 13, 0F,0F, 0F, 0F, 0F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -6.45F, -6F, 0F, -6.45F, -6F, 0F, 0F, -4.5F); // Box 168
		tailModel[2].setRotationPoint(40F, -19F, -6.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 27, 0F,-24F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 4F, 0F, 0F, -24F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 169
		tailModel[3].setRotationPoint(42F, -23.5F, -29.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 26, 2, 27, 0F,4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -24F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -24F, 0F, 0F); // Box 170
		tailModel[4].setRotationPoint(42F, -23.5F, 2.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 17, 28, 1, 0F,-14F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -14F, -1F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F); // Box 173
		tailModel[5].setRotationPoint(52F, -51.5F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 140
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 141
		leftWingModel[2] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 142
		leftWingModel[3] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 143
		leftWingModel[4] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 145
		leftWingModel[5] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 146
		leftWingModel[6] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 147
		leftWingModel[7] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 148
		leftWingModel[8] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 230
		leftWingModel[9] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 231
		leftWingModel[10] = new ModelRendererTurbo(this, 223, 232, textureX, textureY); // Box 137
		leftWingModel[11] = new ModelRendererTurbo(this, 223, 232, textureX, textureY); // Box 138

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,-2F, 0F, 0F, -2F, -1F, 0F, 6F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftWingModel[0].setRotationPoint(-45F, -18F, -15F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 38, 2, 33, 0F,-2F, 0F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftWingModel[1].setRotationPoint(-45F, -17F, -48F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 31, 0F,-2F, 0F, 0F, -11F, -0.5F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[2].setRotationPoint(-45F, -17F, -79F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,-6F, -0.5F, -2.5F, -3.2F, -0.5F, -2F, 0F, -0.5F, 0F, -2F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[3].setRotationPoint(-45F, -17F, -89F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 6F, -1F, 0F, -2F, -1F, 0F); // Box 145
		leftWingModel[4].setRotationPoint(-45F, -15F, -15F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 38, 2, 33, 0F,0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -0.5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F); // Box 146
		leftWingModel[5].setRotationPoint(-45F, -15F, -48F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 2, 31, 0F,0F, 0F, 0F, -11F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, -0.5F, 0F, 1F, -0.5F, 0F, -2F, 0F, 0F); // Box 147
		leftWingModel[6].setRotationPoint(-45F, -15F, -79F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,-5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, -2.5F, -3.2F, -0.5F, -2F, 0F, -0.5F, 0F, -2F, 0F, 0F); // Box 148
		leftWingModel[7].setRotationPoint(-45F, -15F, -89F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 230
		leftWingModel[8].setRotationPoint(-54F, -15.7F, -48.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 231
		leftWingModel[9].setRotationPoint(-56F, -15.7F, -48.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 45, 1, 45, 0F,-15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F); // Box 137
		leftWingModel[10].setRotationPoint(-57F, -16.7F, -88F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 45, 1, 45, 0F,-15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F, -15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F); // Box 138
		leftWingModel[11].setRotationPoint(-57F, -14.2F, -88F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 233
		rightWingModel[1] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 234
		rightWingModel[2] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 235
		rightWingModel[3] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 236
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 237
		rightWingModel[5] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 238
		rightWingModel[6] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 239
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 240
		rightWingModel[8] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 243
		rightWingModel[9] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 244
		rightWingModel[10] = new ModelRendererTurbo(this, 223, 232, textureX, textureY); // Box 135
		rightWingModel[11] = new ModelRendererTurbo(this, 223, 232, textureX, textureY); // Box 136

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,-2F, -0.2F, 0F, 6F, -0.2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		rightWingModel[0].setRotationPoint(-45F, -18F, 4F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 38, 2, 33, 0F,-2F, 1F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightWingModel[1].setRotationPoint(-45F, -17F, 15F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 31, 0F,-2F, 0F, 0F, 1F, -0.5F, 0F, -11F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightWingModel[2].setRotationPoint(-45F, -17F, 48F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,-2F, 0F, 0F, 0F, -0.5F, 0F, -3.2F, -0.5F, -2F, -6F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -5F, 0F, -1F); // Box 236
		rightWingModel[3].setRotationPoint(-45F, -17F, 79F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 40, 3, 11, 0F,0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 6F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F); // Box 237
		rightWingModel[4].setRotationPoint(-45F, -15F, 4F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 38, 2, 33, 0F,0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F, -2F, 0F, 0F); // Box 238
		rightWingModel[5].setRotationPoint(-45F, -15F, 15F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 26, 2, 31, 0F,0F, 0F, 0F, 1F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -0.5F, 0F, -11F, -0.5F, 0F, -2F, 0F, 0F); // Box 239
		rightWingModel[6].setRotationPoint(-45F, -15F, 48F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -5F, 0F, -1F, -2F, 0F, 0F, 0F, -0.5F, 0F, -3.2F, -0.5F, -2F, -6F, -0.5F, -2.5F); // Box 240
		rightWingModel[7].setRotationPoint(-45F, -15F, 79F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 243
		rightWingModel[8].setRotationPoint(-54F, -15.7F, 47.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 244
		rightWingModel[9].setRotationPoint(-56F, -15.7F, 47.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 45, 1, 45, 0F,-15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F); // Box 135
		rightWingModel[10].setRotationPoint(-57F, -16.7F, 43F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 45, 1, 45, 0F,-15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F, -15F, 0.3F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, -15F, 0.3F, -15F); // Box 136
		rightWingModel[11].setRotationPoint(-57F, -14.2F, 43F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 174
		yawFlapModel[1] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 175
		yawFlapModel[2] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 106
		yawFlapModel[3] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 107
		yawFlapModel[4] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 232
		yawFlapModel[5] = new ModelRendererTurbo(this, 395, 196, textureX, textureY); // Box 134

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 17, 22, 1, 0F,0F, 0.5F, 0F, -11F, -1.5F, 0F, -11F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 174
		yawFlapModel[0].setRotationPoint(69F, -51.5F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 17, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 175
		yawFlapModel[1].setRotationPoint(69F, -29.5F, 0F);

		yawFlapModel[2].addShapeBox(-4F, 0F, 3.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[2].setRotationPoint(-16F, -21.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;

		yawFlapModel[3].addShapeBox(-4F, 0F, -7.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[3].setRotationPoint(-16F, -21.3F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[4].setRotationPoint(-16F, -21.3F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(0F, 0F, -0.5F, 4, 22, 1, 0F,-0.5F, 1.6F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -0.5F, 1.6F, 0.1F, -0.5F, 4F, 0.1F, 0F, 4F, 0.1F, 0F, 4F, 0.1F, 0F, 4F, 0.1F); // Box 134
		yawFlapModel[5].setRotationPoint(71F, -49.5F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 171
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 172
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-1F, -0.5F, 0F, 16, 1, 23, 0F,-1F, 0F, 0.5F, -10F, 0F, -1F, 0.51F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -10F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		pitchFlapLeftModel[0].setRotationPoint(69F, -22.5F, -29.5F);

		pitchFlapLeftModel[1].addShapeBox(-1F, -0.5F, 0F, 16, 1, 7, 0F,0F, 0F, 0F, 0.51F, 0F, 0F, -3F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -2.5F, 0F, 0F, 0.5F); // Box 172
		pitchFlapLeftModel[1].setRotationPoint(69F, -22.5F, -6.5F);

		pitchFlapLeftModel[2].addShapeBox(-0.5F, -10F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[2].setRotationPoint(-14F, -19.3F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 251
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 252

		pitchFlapRightModel[0].addShapeBox(-1F, -0.5F, 0F, 16, 1, 23, 0F,0F, 0F, 0F, 0.51F, 0F, 0F, -10F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -10F, 0F, -1F, -1F, 0F, 0.5F); // Box 251
		pitchFlapRightModel[0].setRotationPoint(69F, -22.5F, 6.5F);

		pitchFlapRightModel[1].addShapeBox(-1F, -0.5F, 0F, 16, 1, 7, 0F,0F, 0F, 0.5F, -3F, 0F, -2.5F, 0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		pitchFlapRightModel[1].setRotationPoint(69F, -22.5F, -0.5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 144
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 149

		pitchFlapLeftWingModel[0].addShapeBox(0F, -2F, -18F, 8, 2, 40, 0F,0.5F, -0.5F, 2.3F, -6F, -0.5F, -5F, -3.5F, -0.5F, 1.1F, 0F, -0.5F, 0F, 0F, 0F, 4.5F, -3F, 0F, -6F, -0.7F, 0F, 2.5F, 0F, 0F, 0F); // Box 144
		pitchFlapLeftWingModel[0].setRotationPoint(-25.5F, -15F, -68F);
		pitchFlapLeftWingModel[0].rotateAngleY = -0.36651914F;

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, -18F, 8, 2, 40, 0F,0F, 0F, 4.5F, -3F, 0F, -6F, -0.7F, 0F, 2.5F, 0F, 0F, 0F, 0.5F, -0.5F, 2.3F, -6F, -0.5F, -5F, -3.5F, -0.5F, 1.1F, 0F, -0.5F, 0F); // Box 149
		pitchFlapLeftWingModel[1].setRotationPoint(-25.5F, -15F, -68F);
		pitchFlapLeftWingModel[1].rotateAngleY = -0.36651914F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 241
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 242

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, -18F, 8, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, -3F, 0F, -6F, 0F, 0F, 4.5F, 0F, -0.5F, 0F, -3F, -0.5F, 1.4F, -6F, -0.5F, -5F, 0.5F, -0.5F, 2.3F); // Box 241
		pitchFlapRightWingModel[0].setRotationPoint(-24.5F, -15F, 64.5F);
		pitchFlapRightWingModel[0].rotateAngleY = 0.34906585F;

		pitchFlapRightWingModel[1].addShapeBox(0F, -2F, -18F, 8, 2, 40, 0F,0F, -0.5F, 0F, -3F, -0.5F, 1.3F, -6F, -0.5F, -5F, 0.5F, -0.5F, 2.3F, 0F, 0F, 0F, 0F, 0F, 2.5F, -3F, 0F, -6F, 0F, 0F, 4.5F); // Box 242
		pitchFlapRightWingModel[1].setRotationPoint(-24.5F, -15F, 64.5F);
		pitchFlapRightWingModel[1].rotateAngleY = 0.34906585F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 180
		tailWheelModel[1] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 181
		tailWheelModel[2] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 182
		tailWheelModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 183
		tailWheelModel[4] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 184
		tailWheelModel[5] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 185
		tailWheelModel[6] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 186

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		tailWheelModel[0].setRotationPoint(60F, -16F, -1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 181
		tailWheelModel[1].setRotationPoint(58F, -16F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 182
		tailWheelModel[2].setRotationPoint(62F, -16F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 183
		tailWheelModel[3].setRotationPoint(57F, -15.5F, -1F);
		tailWheelModel[3].rotateAngleZ = 0.75049158F;

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		tailWheelModel[4].setRotationPoint(57.5F, -18.5F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 185
		tailWheelModel[5].setRotationPoint(54.5F, -18.5F, -2.5F);
		tailWheelModel[5].rotateAngleZ = 0.15707963F;

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 186
		tailWheelModel[6].setRotationPoint(54.5F, -18.5F, 1.5F);
		tailWheelModel[6].rotateAngleZ = 0.15707963F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 187
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 188
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 189
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 190
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 191
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 192

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftWingWheelModel[0].setRotationPoint(-42F, 3F, -15F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftWingWheelModel[1].setRotationPoint(-42F, -1F, -15F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 189
		leftWingWheelModel[2].setRotationPoint(-42F, 7F, -15F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftWingWheelModel[3].setRotationPoint(-33F, -13F, -15F);
		leftWingWheelModel[3].rotateAngleZ = -0.20943951F;

		leftWingWheelModel[4].addShapeBox(0F, 8F, 0F, 2, 8, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 191
		leftWingWheelModel[4].setRotationPoint(-33F, -13F, -15F);
		leftWingWheelModel[4].rotateAngleZ = -0.20943951F;

		leftWingWheelModel[5].addShapeBox(0F, 12F, 0F, 2, 8, 2, 0F,0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 192
		leftWingWheelModel[5].setRotationPoint(-33F, -13F, -15F);
		leftWingWheelModel[5].rotateAngleZ = -0.20943951F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 245
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 246
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 247
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 248
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 249
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 250

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightWingWheelModel[0].setRotationPoint(-42F, 3F, 13F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightWingWheelModel[1].setRotationPoint(-42F, -1F, 13F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 247
		rightWingWheelModel[2].setRotationPoint(-42F, 7F, 13F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingWheelModel[3].setRotationPoint(-33F, -13F, 13F);
		rightWingWheelModel[3].rotateAngleZ = -0.20943951F;

		rightWingWheelModel[4].addShapeBox(0F, 8F, 0F, 2, 8, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 249
		rightWingWheelModel[4].setRotationPoint(-33F, -13F, 13F);
		rightWingWheelModel[4].rotateAngleZ = -0.20943951F;

		rightWingWheelModel[5].addShapeBox(0F, 12F, 0F, 2, 8, 2, 0F,0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 250
		rightWingWheelModel[5].setRotationPoint(-33F, -13F, 13F);
		rightWingWheelModel[5].rotateAngleZ = -0.20943951F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-79F, -21F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 39, 94, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 39, 94, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 39, 94, textureX, textureY);
		prop[0].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[1].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[2].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}