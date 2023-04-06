//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Centauro
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCentauro extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelCentauro() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];
		noseModel = new ModelRendererTurbo[25];
		tailModel = new ModelRendererTurbo[7];
		leftWingModel = new ModelRendererTurbo[12];
		rightWingModel = new ModelRendererTurbo[12];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
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
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 117
		bodyModel[7] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 118
		bodyModel[8] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 119
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 120
		bodyModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 121
		bodyModel[11] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 122
		bodyModel[12] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 123
		bodyModel[13] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 124
		bodyModel[14] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 125
		bodyModel[15] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 133
		bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 134
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 135
		bodyModel[18] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 136
		bodyModel[19] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 158
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 159
		bodyModel[21] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 160
		bodyModel[22] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 164
		bodyModel[23] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 178
		bodyModel[24] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 179
		bodyModel[25] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 199
		bodyModel[26] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 200
		bodyModel[27] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 201
		bodyModel[28] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 202
		bodyModel[29] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 203
		bodyModel[30] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 204
		bodyModel[31] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 205
		bodyModel[32] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 206
		bodyModel[33] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 207
		bodyModel[34] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 208
		bodyModel[35] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 209
		bodyModel[36] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 212
		bodyModel[37] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 213
		bodyModel[38] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 214
		bodyModel[39] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 89
		bodyModel[40] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 90
		bodyModel[41] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 91
		bodyModel[42] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 221
		bodyModel[43] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 222
		bodyModel[44] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 223
		bodyModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 224
		bodyModel[46] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 225
		bodyModel[47] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 226
		bodyModel[48] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 227
		bodyModel[49] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 228
		bodyModel[50] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 229
		bodyModel[51] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 128
		bodyModel[52] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 129
		bodyModel[53] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 130
		bodyModel[54] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 131
		bodyModel[55] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 132
		bodyModel[56] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 140
		bodyModel[57] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 141
		bodyModel[58] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 142

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 111
		bodyModel[0].setRotationPoint(-46F, -38F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, -7F); // Box 112
		bodyModel[1].setRotationPoint(-46F, -22F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 113
		bodyModel[2].setRotationPoint(-46F, -31F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 9, 20, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0F, -7F); // Box 114
		bodyModel[3].setRotationPoint(-11F, -22F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 115
		bodyModel[4].setRotationPoint(-11F, -31F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, -7.5F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0.5F, 7.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 116
		bodyModel[5].setRotationPoint(-11F, -38F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -0.3F, 0F, 0F, -1.1F, 0F, 0F, 1.1F, 0F, 0F, 0.3F); // Box 117
		bodyModel[6].setRotationPoint(-4F, -35F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, -4F, 0F, 0.5F, -5F, 0F, 0.5F, 5F, 0F, 0F, 4F, 0F, 0F, -1.1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.1F); // Box 118
		bodyModel[7].setRotationPoint(9F, -35F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 119
		bodyModel[8].setRotationPoint(9F, -40.5F, -5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0.7F, -1.5F, 0F, -0.7F, -2F, 0F, -0.7F, -2F, 0F, 0.7F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 1.5F); // Box 120
		bodyModel[9].setRotationPoint(9F, -42.5F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 9, 18, 0F,0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Box 121
		bodyModel[10].setRotationPoint(20F, -31F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 4, 18, 0F,0F, 0.5F, -3.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F); // Box 122
		bodyModel[11].setRotationPoint(20F, -35F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 30, 7, 18, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, -6F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0.5F, -6F); // Box 123
		bodyModel[12].setRotationPoint(20F, -22F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 43, 4, 11, 0F,0F, 0F, -1.5F, 0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 18F, 3.5F, -4F, 18F, 3.5F, -4F, 0F, 0F, 0F); // Box 124
		bodyModel[13].setRotationPoint(20F, -39.5F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 43, 2, 7, 0F,0F, -0.7F, -2F, 3F, -8F, -3.2F, 3F, -8F, -3.2F, 0F, -0.7F, -2F, 0F, 1F, 0.5F, 0F, 6F, -2.5F, 0F, 6F, -2.5F, 0F, 1F, 0.5F); // Box 125
		bodyModel[14].setRotationPoint(20F, -42.5F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 31, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 133
		bodyModel[15].setRotationPoint(-11F, -31F, 9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, 7.5F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0.5F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 134
		bodyModel[16].setRotationPoint(-11F, -38F, 9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0.3F, 0F, 0F, 1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.3F); // Box 135
		bodyModel[17].setRotationPoint(-4F, -35F, 9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 4F, 0F, 0.5F, 5F, 0F, 0.5F, -5F, 0F, 0F, -4F, 0F, 0F, 1.1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.1F); // Box 136
		bodyModel[18].setRotationPoint(9F, -35F, 9.5F);

		bodyModel[19].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 158
		bodyModel[19].setRotationPoint(-48F, -22.8F, 9.5F);
		bodyModel[19].rotateAngleX = -0.36651914F;
		bodyModel[19].rotateAngleY = 0.20943951F;
		bodyModel[19].rotateAngleZ = -0.05235988F;

		bodyModel[20].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 159
		bodyModel[20].setRotationPoint(-51.5F, -22.9F, 9.25F);
		bodyModel[20].rotateAngleX = -0.36651914F;
		bodyModel[20].rotateAngleY = 0.20943951F;
		bodyModel[20].rotateAngleZ = -0.05235988F;

		bodyModel[21].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 160
		bodyModel[21].setRotationPoint(-55F, -23F, 9F);
		bodyModel[21].rotateAngleX = -0.36651914F;
		bodyModel[21].rotateAngleY = 0.20943951F;
		bodyModel[21].rotateAngleZ = -0.05235988F;

		bodyModel[22].addShapeBox(-2.5F, -1F, -0.5F, 23, 4, 4, 0F,0F, -1F, -0.2F, -7F, -1F, -0.5F, 5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -7F, -1F, -0.3F, 5F, 0F, 0F, 0F, 1F, 0F); // Box 164
		bodyModel[22].setRotationPoint(-56.5F, -28.9F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 178
		bodyModel[23].setRotationPoint(15.5F, -54.5F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,32F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 32F, -0.3F, -0.3F, 32F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 30F, -0.3F, -0.3F, 32F, -0.3F, -0.3F); // Box 179
		bodyModel[24].setRotationPoint(48F, -56F, -0.5F);
		bodyModel[24].rotateAngleZ = 0.05235988F;

		bodyModel[25].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[25].setRotationPoint(-3.5F, -35.5F, 7F);
		bodyModel[25].rotateAngleY = -0.06981317F;

		bodyModel[26].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[26].setRotationPoint(-3.5F, -41.5F, 4F);
		bodyModel[26].rotateAngleY = -0.03490659F;
		bodyModel[26].rotateAngleZ = -0.05235988F;

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[27].setRotationPoint(-4F, -41.5F, 4F);
		bodyModel[27].rotateAngleX = 0.41887902F;
		bodyModel[27].rotateAngleZ = -0.06981317F;

		bodyModel[28].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[28].setRotationPoint(-3.5F, -41.5F, -4F);
		bodyModel[28].rotateAngleY = 0.03490659F;
		bodyModel[28].rotateAngleZ = -0.05235988F;

		bodyModel[29].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[29].setRotationPoint(-4F, -41.5F, -4F);
		bodyModel[29].rotateAngleX = -0.41887902F;
		bodyModel[29].rotateAngleZ = -0.06981317F;

		bodyModel[30].addShapeBox(-0.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[30].setRotationPoint(-3.5F, -35.5F, -7F);
		bodyModel[30].rotateAngleY = 0.06981317F;

		bodyModel[31].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[31].setRotationPoint(-4.5F, -42.2F, 2.5F);
		bodyModel[31].rotateAngleZ = -0.9424778F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[32].setRotationPoint(-4.5F, -42.2F, -2.5F);
		bodyModel[32].rotateAngleZ = -0.9424778F;

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 207
		bodyModel[33].setRotationPoint(3F, -41.5F, -4F);
		bodyModel[33].rotateAngleX = 0.4712389F;

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[34].setRotationPoint(-4F, -43.3F, 0.2F);
		bodyModel[34].rotateAngleX = -0.43633231F;

		bodyModel[35].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 209
		bodyModel[35].setRotationPoint(3F, -43.3F, 0.2F);
		bodyModel[35].rotateAngleX = -0.43633231F;

		bodyModel[36].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[36].setRotationPoint(-4F, -41.5F, -4F);
		bodyModel[36].rotateAngleX = 0.4712389F;

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 213
		bodyModel[37].setRotationPoint(3F, -41F, 4.2F);
		bodyModel[37].rotateAngleX = 0.41887902F;
		bodyModel[37].rotateAngleZ = -0.06981317F;

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 214
		bodyModel[38].setRotationPoint(3F, -41F, -4.2F);
		bodyModel[38].rotateAngleX = -0.41887902F;
		bodyModel[38].rotateAngleZ = -0.06981317F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[39].setRotationPoint(8F, -42F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 18, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[40].setRotationPoint(8F, -38F, -2.5F);
		bodyModel[40].rotateAngleZ = -0.12217305F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[41].setRotationPoint(-1F, -28F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 221
		bodyModel[42].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[42].rotateAngleZ = 0.27925268F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[43].setRotationPoint(-7F, -38.2F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[44].setRotationPoint(-10.5F, -38F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[45].setRotationPoint(-8F, -41.05F, -1F);

		bodyModel[46].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[46].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[46].rotateAngleZ = 0.27925268F;

		bodyModel[47].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[47].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[47].rotateAngleZ = 0.27925268F;

		bodyModel[48].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[48].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[49].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[50].setRotationPoint(-11F, -37.5F, -10F);
		bodyModel[50].rotateAngleZ = 0.27925268F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -1F, 0F); // Box 128
		bodyModel[51].setRotationPoint(-13F, -15F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[52].setRotationPoint(0F, -18.5F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 130
		bodyModel[53].setRotationPoint(4F, -18.5F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 6, 12, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0.5F, 0F); // Box 131
		bodyModel[54].setRotationPoint(11F, -18F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.5F, 0F, -2F, 2.5F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[55].setRotationPoint(5F, -11.5F, -5.5F);

		bodyModel[56].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 140
		bodyModel[56].setRotationPoint(-48F, -22.8F, -9.5F);
		bodyModel[56].rotateAngleX = 0.36651914F;
		bodyModel[56].rotateAngleY = -0.20943951F;
		bodyModel[56].rotateAngleZ = -0.05235988F;

		bodyModel[57].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 141
		bodyModel[57].setRotationPoint(-51.5F, -22.9F, -9.25F);
		bodyModel[57].rotateAngleX = 0.36651914F;
		bodyModel[57].rotateAngleY = -0.20943951F;
		bodyModel[57].rotateAngleZ = -0.05235988F;

		bodyModel[58].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 142
		bodyModel[58].setRotationPoint(-55F, -23F, -9F);
		bodyModel[58].rotateAngleX = 0.36651914F;
		bodyModel[58].rotateAngleY = -0.20943951F;
		bodyModel[58].rotateAngleZ = -0.05235988F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 126
		noseModel[1] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 127
		noseModel[2] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 128
		noseModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 130
		noseModel[4] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 131
		noseModel[5] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 132
		noseModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 137
		noseModel[7] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 139
		noseModel[8] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 161
		noseModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 162
		noseModel[10] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 163
		noseModel[11] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 176
		noseModel[12] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 177
		noseModel[13] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 253
		noseModel[14] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 133
		noseModel[15] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 134
		noseModel[16] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 135
		noseModel[17] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 136
		noseModel[18] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 137
		noseModel[19] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 138
		noseModel[20] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 139
		noseModel[21] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 143
		noseModel[22] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 144
		noseModel[23] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 145
		noseModel[24] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 146

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 9, 20, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 126
		noseModel[0].setRotationPoint(-60F, -31F, -10F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F,0F, -2.5F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2.5F, -7.5F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 127
		noseModel[1].setRotationPoint(-60F, -38F, -10F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 8, 20, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -7.5F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, -2F, -7.5F); // Box 128
		noseModel[2].setRotationPoint(-60F, -22F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 13, 7, 16, 0F,0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F, 0F, 0.5F, -1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -1.5F); // Box 130
		noseModel[3].setRotationPoint(-73F, -30.5F, -8F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 13, 6, 16, 0F,0F, -2.5F, -6F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2.5F, -6F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F); // Box 131
		noseModel[4].setRotationPoint(-73F, -35.5F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 13, 7, 16, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -2.5F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2.5F, -5F); // Box 132
		noseModel[5].setRotationPoint(-73F, -23F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, -1F, -7F, 0F, 0F, -8F, 0F, 0F, 1F, -2F, -1F, -1.5F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 1F, 1F, -2F, 0F, -1.5F); // Box 137
		noseModel[6].setRotationPoint(-82F, -27.75F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -0.5F, -4.8F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, -4.8F, -5F); // Box 139
		noseModel[7].setRotationPoint(-82F, -23.75F, -6F);

		noseModel[8].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 161
		noseModel[8].setRotationPoint(-58F, -23.1F, 8.7F);
		noseModel[8].rotateAngleX = -0.36651914F;
		noseModel[8].rotateAngleY = 0.20943951F;
		noseModel[8].rotateAngleZ = -0.05235988F;

		noseModel[9].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 162
		noseModel[9].setRotationPoint(-61.75F, -23.2F, 8.5F);
		noseModel[9].rotateAngleX = -0.36651914F;
		noseModel[9].rotateAngleY = 0.20943951F;
		noseModel[9].rotateAngleZ = -0.05235988F;

		noseModel[10].addShapeBox(-2.5F, -1F, -0.5F, 6, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 163
		noseModel[10].setRotationPoint(-65.75F, -23.2F, 7.5F);
		noseModel[10].rotateAngleX = -0.36651914F;
		noseModel[10].rotateAngleY = 0.20943951F;
		noseModel[10].rotateAngleZ = -0.05235988F;

		noseModel[11].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		noseModel[11].setRotationPoint(-56F, -36.5F, -4F);
		noseModel[11].rotateAngleY = 0.05235988F;
		noseModel[11].rotateAngleZ = 0.06981317F;

		noseModel[12].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		noseModel[12].setRotationPoint(-56F, -36.5F, 3F);
		noseModel[12].rotateAngleY = -0.05235988F;
		noseModel[12].rotateAngleZ = 0.06981317F;

		noseModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 253
		noseModel[13].setRotationPoint(-76.5F, -27.25F, -0.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 133
		noseModel[14].setRotationPoint(-82F, -27.75F, -1F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-2F, -1F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -7F, -2F, 0F, -1.5F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, -7F); // Box 134
		noseModel[15].setRotationPoint(-82F, -27.75F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, -1F, -7F, 0F, 0F, -8F, 0F, -2F, 1F, -2F, -1F, -1.5F, -0.5F, -0.8F, -7F, 0F, 4F, -8F, 0F, 2F, 0F, -2F, -1F, -2.5F); // Box 135
		noseModel[16].setRotationPoint(-82F, -25.75F, -6F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-2F, -1F, -1.5F, 0F, -2F, 1F, 0F, 0F, -8F, 0F, -1F, -7F, -2F, -1F, -2.5F, 0F, 2F, 0F, 0F, 4F, -8F, -0.5F, -0.8F, -7F); // Box 136
		noseModel[17].setRotationPoint(-82F, -25.75F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,-0.5F, -4.8F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, -4.8F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 137
		noseModel[18].setRotationPoint(-82F, -32.75F, -6F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-2F, -1F, -2.5F, 0F, 2F, 0F, 0F, 4F, -8F, -0.5F, -0.8F, -7F, -2F, -1F, -1.5F, 0F, -2F, 1F, 0F, 0F, -8F, 0F, -1F, -7F); // Box 138
		noseModel[19].setRotationPoint(-82F, -28.75F, -5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-0.5F, -0.8F, -7F, 0F, 4F, -8F, 0F, 2F, 0F, -2F, -1F, -2.5F, 0F, -1F, -7F, 0F, 0F, -8F, 0F, -2F, 1F, -2F, -1F, -1.5F); // Box 139
		noseModel[20].setRotationPoint(-82F, -28.75F, -6F);

		noseModel[21].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 143
		noseModel[21].setRotationPoint(-58F, -23.1F, -8.7F);
		noseModel[21].rotateAngleX = 0.36651914F;
		noseModel[21].rotateAngleY = -0.20943951F;
		noseModel[21].rotateAngleZ = -0.05235988F;

		noseModel[22].addShapeBox(-2.5F, -1F, -0.5F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 144
		noseModel[22].setRotationPoint(-61.75F, -23.2F, -8.5F);
		noseModel[22].rotateAngleX = 0.36651914F;
		noseModel[22].rotateAngleY = -0.20943951F;
		noseModel[22].rotateAngleZ = -0.05235988F;

		noseModel[23].addShapeBox(-2.5F, -1F, -0.5F, 6, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 145
		noseModel[23].setRotationPoint(-65.75F, -23.2F, -8.5F);
		noseModel[23].rotateAngleX = 0.36651914F;
		noseModel[23].rotateAngleY = -0.20943951F;
		noseModel[23].rotateAngleZ = -0.05235988F;

		noseModel[24].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 146
		noseModel[24].setRotationPoint(-61F, -17F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 166
		tailModel[1] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 167
		tailModel[2] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 168
		tailModel[3] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 169
		tailModel[4] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 173
		tailModel[5] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 175
		tailModel[6] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 124

		tailModel[0].addShapeBox(0F, 0F, 0F, 43, 5, 13, 0F,0F, 0F, 1F, 5F, -0.5F, -6F, 5F, -0.5F, -6F, 0F, 0F, 1F, 0F, 2.5F, 1F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 2.5F, 1F); // Box 166
		tailModel[0].setRotationPoint(50F, -30.5F, -6.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 43, 4, 13, 0F,0F, 0.5F, -3F, 0F, -2.9F, -6F, 0F, -2.9F, -6F, 0F, 0.5F, -3F, 0F, 0F, 1F, 5F, 0.5F, -6F, 5F, 0.5F, -6F, 0F, 0F, 1F); // Box 167
		tailModel[1].setRotationPoint(50F, -34.5F, -6.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 43, 7, 13, 0F,0F, -2F, 1F, 0F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2F, 1F, 0F, 0F, -4.5F, -12F, -6.45F, -6F, -12F, -6.45F, -6F, 0F, 0F, -4.5F); // Box 168
		tailModel[2].setRotationPoint(50F, -25F, -6.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 11, 2, 27, 0F,-4.5F, 0F, 0F, 1F, 0F, 3.5F, 0F, 0F, 0F, 5F, 0F, 0F, -4.5F, 0F, 0F, 1F, 0F, 3.5F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 169
		tailModel[3].setRotationPoint(71F, -31F, -29.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 17, 28, 1, 0F,-10F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -10F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 173
		tailModel[4].setRotationPoint(62F, -57.5F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, -0.5F, 17, 7, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F); // Box 175
		tailModel[5].setRotationPoint(79F, -35.5F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 27, 0F,5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3.5F, -4.5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3.5F, -4.5F, 0F, 0F); // Box 124
		tailModel[6].setRotationPoint(71F, -31F, 2.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 114
		leftWingModel[1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 115
		leftWingModel[2] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 116
		leftWingModel[3] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 117
		leftWingModel[4] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 118
		leftWingModel[5] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 119
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 120
		leftWingModel[7] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 121
		leftWingModel[8] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 122
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 123
		leftWingModel[10] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 132
		leftWingModel[11] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 133

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.2F, -0.2F); // Box 114
		leftWingModel[0].setRotationPoint(-48F, -17.7F, -40.25F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 115
		leftWingModel[1].setRotationPoint(-50.5F, -17.7F, -40.25F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 45, 3, 11, 0F,-2F, 0F, 0F, -2F, -1F, 0F, 11F, -0.2F, 0F, 2F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 4F, 0F, 0F); // Box 116
		leftWingModel[2].setRotationPoint(-42F, -20F, -15F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 45, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 10F, 1F, 1F, 1F, 0F, 1F); // Box 117
		leftWingModel[3].setRotationPoint(-42F, -17F, -15F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 45, 3, 21, 0F,-5F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -4F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 118
		leftWingModel[4].setRotationPoint(-42F, -17F, -36F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 45, 3, 21, 0F,-9F, -1.2F, 0F, -4F, -2.2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -5F, 1F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[5].setRotationPoint(-42F, -20F, -36F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 35, 3, 67, 0F,-6F, 4F, 0F, -9F, 2F, 0F, 1F, -2.2F, 0F, -4F, -1.2F, 0F, -3F, -6F, 0F, -6F, -4F, 0F, 3F, 2F, 0F, 0F, 1F, 0F); // Box 120
		leftWingModel[6].setRotationPoint(-37F, -20F, -103F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 35, 3, 67, 0F,-3F, 6F, 0F, -6F, 4F, 0F, 3F, -2F, 0F, 0F, -1F, 0F, -7F, -6F, 0F, -9F, -6F, 0F, 1F, 1F, 0F, -2F, 1F, 0F); // Box 121
		leftWingModel[7].setRotationPoint(-37F, -17F, -103F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 25, 3, 11, 0F,-6F, -0.2F, -2F, -11F, -2F, -3F, -4F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, -2F, -7F, 0F, -4F, -1F, 0F, 0F, 2F, -2F, 0F); // Box 122
		leftWingModel[8].setRotationPoint(-32F, -24F, -114F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 25, 3, 11, 0F,-1F, 0F, -2F, -7F, -2F, -4F, -1F, -2F, 0F, 2F, 0F, 0F, -3F, -1F, -3F, -9F, 0F, -5F, -4F, 0F, 0F, -2F, 0F, 0F); // Box 123
		leftWingModel[9].setRotationPoint(-32F, -23F, -114F);

		leftWingModel[10].addShapeBox(0F, -20F, 0F, 45, 1, 45, 0F,-15F, 0.7F, -15F, -15F, -0.5F, -15F, -15F, -1.2F, -15F, -15F, -0.4F, -15F, -15F, 0F, -15F, -15F, 0.7F, -15F, -15F, 1F, -15F, -15F, 0.5F, -15F); // Box 132
		leftWingModel[10].setRotationPoint(-43F, -2.7F, -110F);

		leftWingModel[11].addShapeBox(0F, -20F, 0F, 45, 1, 45, 0F,-15F, 1.7F, -15F, -15F, 1.5F, -15F, -15F, -0.2F, -15F, -15F, -0.4F, -15F, -15F, -1F, -15F, -15F, -1F, -15F, -15F, 0.5F, -15F, -15F, 0.5F, -15F); // Box 133
		leftWingModel[11].setRotationPoint(-43F, 1F, -110F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 243
		rightWingModel[1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 244
		rightWingModel[2] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 135
		rightWingModel[3] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 120
		rightWingModel[4] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 121
		rightWingModel[5] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 122
		rightWingModel[6] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 123
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 124
		rightWingModel[8] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 125
		rightWingModel[9] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 126
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 127
		rightWingModel[11] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 134

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.2F, -0.2F); // Box 243
		rightWingModel[0].setRotationPoint(-48F, -17.7F, 39.25F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.3F, -0.3F); // Box 244
		rightWingModel[1].setRotationPoint(-50.5F, -17.7F, 39.25F);

		rightWingModel[2].addShapeBox(0F, -20F, 0F, 45, 1, 45, 0F,-15F, -0.4F, -15F, -15F, -1.2F, -15F, -15F, -0.5F, -15F, -15F, 0.7F, -15F, -15F, 0.5F, -15F, -15F, 1F, -15F, -15F, 0.7F, -15F, -15F, 0F, -15F); // Box 135
		rightWingModel[2].setRotationPoint(-43F, -2.7F, 65F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 45, 3, 11, 0F,2F, 0.8F, 0F, 11F, -0.2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		rightWingModel[3].setRotationPoint(-42F, -20F, 4F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 45, 3, 11, 0F,4F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 10F, 1F, 1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 121
		rightWingModel[4].setRotationPoint(-42F, -17F, 4F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 45, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 1F, 0F, -7F, 1F, 0F); // Box 122
		rightWingModel[5].setRotationPoint(-42F, -17F, 15F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 45, 3, 21, 0F,-2F, 0F, 0F, -2F, -1F, 0F, -4F, -2.2F, 0F, -9F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -5F, 1F, 0F); // Box 123
		rightWingModel[6].setRotationPoint(-42F, -20F, 15F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 35, 3, 67, 0F,-4F, -1.2F, 0F, 1F, -2.2F, 0F, -9F, 2F, 0F, -6F, 4F, 0F, 0F, 1F, 0F, 3F, 2F, 0F, -6F, -4F, 0F, -3F, -6F, 0F); // Box 124
		rightWingModel[7].setRotationPoint(-37F, -20F, 36F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 35, 3, 67, 0F,0F, -1F, 0F, 3F, -2F, 0F, -6F, 4F, 0F, -3F, 6F, 0F, -2F, 1F, 0F, 1F, 1F, 0F, -9F, -6F, 0F, -7F, -6F, 0F); // Box 125
		rightWingModel[8].setRotationPoint(-37F, -17F, 36F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 25, 3, 11, 0F,-1F, 0F, 0F, -4F, -2F, 0F, -11F, -2F, -3F, -6F, -0.2F, -2F, 2F, -2F, 0F, -1F, 0F, 0F, -7F, 0F, -4F, -1F, -2F, -2F); // Box 126
		rightWingModel[9].setRotationPoint(-32F, -24F, 103F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 25, 3, 11, 0F,2F, 0F, 0F, -1F, -2F, 0F, -7F, -2F, -4F, -1F, 0F, -2F, -2F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, -5F, -3F, -1F, -3F); // Box 127
		rightWingModel[10].setRotationPoint(-32F, -23F, 103F);

		rightWingModel[11].addShapeBox(0F, -20F, 0F, 45, 1, 45, 0F,-15F, -0.4F, -15F, -15F, -0.2F, -15F, -15F, 1.5F, -15F, -15F, 1.7F, -15F, -15F, 0.5F, -15F, -15F, 0.5F, -15F, -15F, -1F, -15F, -15F, -1F, -15F); // Box 134
		rightWingModel[11].setRotationPoint(-43F, 1F, 65F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 174
		yawFlapModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 106
		yawFlapModel[2] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 107
		yawFlapModel[3] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 232
		yawFlapModel[4] = new ModelRendererTurbo(this, 5, 197, textureX, textureY); // Box 126

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 17, 22, 1, 0F,0F, 0.5F, 0F, -9.5F, -2.7F, 0F, -9.5F, -2.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		yawFlapModel[0].setRotationPoint(79F, -57.5F, 0F);

		yawFlapModel[1].addShapeBox(-4F, 0F, 3.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[1].setRotationPoint(-6F, -27.3F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-4F, 0F, -7.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[2].setRotationPoint(-6F, -27.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;

		yawFlapModel[3].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[3].setRotationPoint(-6F, -27.3F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(0F, 0F, -0.5F, 4, 26, 1, 0F,0F, -0.75F, 0.05F, 0F, -2.45F, 0.05F, 0F, -2.45F, 0.05F, 0F, -0.75F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 126
		yawFlapModel[4].setRotationPoint(82F, -57.5F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 171
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 108
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 125

		pitchFlapLeftModel[0].addShapeBox(-1F, -0.5F, 0F, 16, 1, 31, 0F,-1F, 0F, 0.5F, -8.5F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -8.5F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 171
		pitchFlapLeftModel[0].setRotationPoint(83F, -30F, -32.5F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -10F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[1].setRotationPoint(-4F, -25.3F, 0F);

		pitchFlapLeftModel[2].addShapeBox(-1F, -0.5F, 0F, 16, 1, 31, 0F,0F, 0F, 0F, -6F, 0F, 0F, -8.5F, 0F, -4F, -1F, 0F, 0.5F, 0F, 0F, 0F, -6F, 0F, 0F, -8.5F, 0F, -4F, -1F, 0F, 0.5F); // Box 125
		pitchFlapLeftModel[2].setRotationPoint(83F, -30F, 1.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 127
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 128
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 129
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 130
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 131
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 132

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftWingWheelModel[0].setRotationPoint(-39F, 1F, -34F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingWheelModel[1].setRotationPoint(-39F, -3F, -34F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 129
		leftWingWheelModel[2].setRotationPoint(-39F, 5F, -34F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftWingWheelModel[3].setRotationPoint(-30F, -15F, -34F);
		leftWingWheelModel[3].rotateAngleZ = -0.20943951F;

		leftWingWheelModel[4].addShapeBox(0F, 8F, 0F, 2, 8, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 131
		leftWingWheelModel[4].setRotationPoint(-30F, -15F, -34F);
		leftWingWheelModel[4].rotateAngleZ = -0.20943951F;

		leftWingWheelModel[5].addShapeBox(0F, 12F, 0F, 2, 8, 2, 0F,0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 132
		leftWingWheelModel[5].setRotationPoint(-30F, -15F, -34F);
		leftWingWheelModel[5].rotateAngleZ = -0.20943951F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 245
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 246
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 247
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 248
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 249
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 250

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightWingWheelModel[0].setRotationPoint(-39F, 1F, 32F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightWingWheelModel[1].setRotationPoint(-39F, -3F, 32F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 247
		rightWingWheelModel[2].setRotationPoint(-39F, 5F, 32F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightWingWheelModel[3].setRotationPoint(-30F, -15F, 32F);
		rightWingWheelModel[3].rotateAngleZ = -0.20943951F;

		rightWingWheelModel[4].addShapeBox(0F, 8F, 0F, 2, 8, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 249
		rightWingWheelModel[4].setRotationPoint(-30F, -15F, 32F);
		rightWingWheelModel[4].rotateAngleZ = -0.20943951F;

		rightWingWheelModel[5].addShapeBox(0F, 12F, 0F, 2, 8, 2, 0F,0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 250
		rightWingWheelModel[5].setRotationPoint(-30F, -15F, 32F);
		rightWingWheelModel[5].rotateAngleZ = -0.20943951F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-76F, -25F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 104, 163, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 104, 163, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 104, 163, textureX, textureY);
		prop[0].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[1].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[2].addBox(-0.5F, -29F, -1.5F, 1, 29, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}