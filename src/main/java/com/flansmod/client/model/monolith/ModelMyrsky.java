//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Myrsky
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMyrsky extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelMyrsky() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];
		noseModel = new ModelRendererTurbo[35];
		tailModel = new ModelRendererTurbo[10];
		leftWingModel = new ModelRendererTurbo[6];
		rightWingModel = new ModelRendererTurbo[6];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[2];
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
		initpitchFlapRightModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 147
		bodyModel[1] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 148
		bodyModel[2] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 149
		bodyModel[3] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 150
		bodyModel[4] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 151
		bodyModel[5] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 152
		bodyModel[6] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 153
		bodyModel[7] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 154
		bodyModel[8] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 155
		bodyModel[9] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 156
		bodyModel[10] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 157
		bodyModel[11] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 158
		bodyModel[12] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 159
		bodyModel[13] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 160
		bodyModel[14] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 161
		bodyModel[15] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 162
		bodyModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 163
		bodyModel[17] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 164
		bodyModel[18] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 165
		bodyModel[19] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 178
		bodyModel[20] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 179
		bodyModel[21] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 180
		bodyModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 185
		bodyModel[23] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 186
		bodyModel[24] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 187
		bodyModel[25] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 188
		bodyModel[26] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 189
		bodyModel[27] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 190
		bodyModel[28] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 191
		bodyModel[29] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 192
		bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 193
		bodyModel[31] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 194
		bodyModel[32] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 195
		bodyModel[33] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 196
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 197
		bodyModel[35] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 198
		bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 199
		bodyModel[37] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 200
		bodyModel[38] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 201
		bodyModel[39] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 202
		bodyModel[40] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 203
		bodyModel[41] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 204
		bodyModel[42] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 205
		bodyModel[43] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 206
		bodyModel[44] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 207
		bodyModel[45] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 90
		bodyModel[46] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 91
		bodyModel[47] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 192
		bodyModel[48] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 193
		bodyModel[49] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 194
		bodyModel[50] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 195
		bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 237
		bodyModel[52] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 221
		bodyModel[53] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 225
		bodyModel[54] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 226
		bodyModel[55] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 227
		bodyModel[56] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 228
		bodyModel[57] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 229
		bodyModel[58] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 222
		bodyModel[59] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 223
		bodyModel[60] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 224
		bodyModel[61] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 250
		bodyModel[62] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 251
		bodyModel[63] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 282
		bodyModel[64] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 283

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 8, 24, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 147
		bodyModel[0].setRotationPoint(-50F, -21F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 9, 24, 0F,0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 148
		bodyModel[1].setRotationPoint(-50F, -30F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 8, 24, 0F,0F, 0F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0F, -8F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F); // Box 149
		bodyModel[2].setRotationPoint(-50F, -38F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 9, 25, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 150
		bodyModel[3].setRotationPoint(-53F, -30F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, -1.5F, -9F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -1.5F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 151
		bodyModel[4].setRotationPoint(-53F, -38F, -12.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 8, 25, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -9F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, -1.5F, -9F); // Box 152
		bodyModel[5].setRotationPoint(-53F, -21F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -8F); // Box 153
		bodyModel[6].setRotationPoint(-24F, -21F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 7, 21, 0F,0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -7.5F); // Box 154
		bodyModel[7].setRotationPoint(4F, -21F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 155
		bodyModel[8].setRotationPoint(-24F, -31F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 156
		bodyModel[9].setRotationPoint(-24F, -31F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 1F, -8F, 0F, -0.5F, -5.5F, 0F, -0.5F, 5.5F, 0F, 1F, 8F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F); // Box 157
		bodyModel[10].setRotationPoint(-24F, -38F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 1F, 8F, 0F, -0.5F, 5.5F, 0F, -0.5F, -5.5F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 158
		bodyModel[11].setRotationPoint(-24F, -38F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, 5.5F, 0F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0.8F); // Box 159
		bodyModel[12].setRotationPoint(-12F, -38F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, -0.5F, 5.5F, 0F, -0.5F, 5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.8F); // Box 160
		bodyModel[13].setRotationPoint(-12F, -38F, 11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 10, 5, 0F,0F, 0F, 7.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 7.5F, 0F, 0F, 8F, 0F, -1.5F, 6F, 0F, -1.5F, 6F, 0F, 0F, 8F); // Box 161
		bodyModel[14].setRotationPoint(4F, -31F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 7, 5, 0F,0F, -0.5F, 4F, 0F, -0.5F, 2.8F, 0F, -0.5F, 2.8F, 0F, -0.5F, 4F, 0F, 0F, 7.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 7.5F); // Box 162
		bodyModel[15].setRotationPoint(4F, -38F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 6, 5, 0F,0F, 0F, 6F, 0F, 1F, 4.5F, 0F, 1F, 4.5F, 0F, 0F, 6F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 163
		bodyModel[16].setRotationPoint(20F, -22.5F, -2.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 8, 5, 0F,0F, 0.5F, 5.5F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0.5F, 5.5F, 0F, 0F, 6F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 6F); // Box 164
		bodyModel[17].setRotationPoint(20F, -30.5F, -2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 9, 6, 0F,0F, 2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2.5F, 0F, 0F, 0.5F, 5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, 5F); // Box 165
		bodyModel[18].setRotationPoint(20F, -40.5F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 178
		bodyModel[19].setRotationPoint(-29F, -50F, 9F);

		bodyModel[20].addShapeBox(44F, 0F, -0.5F, 1, 1, 1, 0F,44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F, 44F, -0.35F, -0.35F); // Box 179
		bodyModel[20].setRotationPoint(-29F, -50F, 9.5F);
		bodyModel[20].rotateAngleY = -0.10471976F;
		bodyModel[20].rotateAngleZ = 0.10471976F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 180
		bodyModel[21].setRotationPoint(16F, -54.5F, 4.2F);
		bodyModel[21].rotateAngleX = -0.13962634F;

		bodyModel[22].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[22].setRotationPoint(11F, -43F, -3F);
		bodyModel[22].rotateAngleX = -0.40142573F;

		bodyModel[23].addShapeBox(0F, 0F, -0.5F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[23].setRotationPoint(1F, -43.5F, -3.5F);
		bodyModel[23].rotateAngleX = -0.38397244F;

		bodyModel[24].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[24].setRotationPoint(-12.75F, -43.5F, -3.5F);
		bodyModel[24].rotateAngleX = -0.38397244F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[25].setRotationPoint(-12.75F, -43.5F, -3.5F);
		bodyModel[25].rotateAngleX = -0.38397244F;

		bodyModel[26].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[26].setRotationPoint(-17.5F, -43.5F, -2.5F);
		bodyModel[26].rotateAngleX = -0.13962634F;
		bodyModel[26].rotateAngleZ = -0.89011792F;

		bodyModel[27].addShapeBox(-0.5F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[27].setRotationPoint(-17.5F, -43.75F, -2.5F);
		bodyModel[27].rotateAngleX = -0.29670597F;
		bodyModel[27].rotateAngleY = -0.19198622F;
		bodyModel[27].rotateAngleZ = -0.01745329F;

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[28].setRotationPoint(-12.75F, -45F, -1.5F);
		bodyModel[28].rotateAngleX = -0.87266463F;

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 192
		bodyModel[29].setRotationPoint(-12.75F, -45.4F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[30].setRotationPoint(-12.75F, -45F, 1.5F);
		bodyModel[30].rotateAngleX = 0.87266463F;

		bodyModel[31].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[31].setRotationPoint(1F, -45F, 1.5F);
		bodyModel[31].rotateAngleX = 0.87266463F;
		bodyModel[31].rotateAngleZ = -0.06981317F;

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 3, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 195
		bodyModel[32].setRotationPoint(1F, -45.4F, -1.5F);
		bodyModel[32].rotateAngleZ = -0.06981317F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[33].setRotationPoint(1F, -45F, -1.5F);
		bodyModel[33].rotateAngleX = -0.87266463F;
		bodyModel[33].rotateAngleZ = -0.06981317F;

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[34].setRotationPoint(11F, -44F, 1.5F);
		bodyModel[34].rotateAngleX = 0.9424778F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 198
		bodyModel[35].setRotationPoint(11F, -44.4F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[36].setRotationPoint(11F, -44F, -1.5F);
		bodyModel[36].rotateAngleX = -0.9424778F;

		bodyModel[37].addShapeBox(-0.5F, 0F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[37].setRotationPoint(-17.5F, -43.75F, 2.5F);
		bodyModel[37].rotateAngleX = 0.29670597F;
		bodyModel[37].rotateAngleY = 0.19198622F;
		bodyModel[37].rotateAngleZ = -0.01745329F;

		bodyModel[38].addShapeBox(-0.5F, 0F, -0.5F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[38].setRotationPoint(-17.5F, -43.5F, 2.5F);
		bodyModel[38].rotateAngleX = 0.13962634F;
		bodyModel[38].rotateAngleZ = -0.89011792F;

		bodyModel[39].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[39].setRotationPoint(-17.5F, -43.5F, -2.5F);
		bodyModel[39].rotateAngleZ = -0.89011792F;

		bodyModel[40].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[40].setRotationPoint(-12.75F, -43.5F, 3.5F);
		bodyModel[40].rotateAngleX = 0.38397244F;

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[41].setRotationPoint(-12.75F, -43.5F, 3.5F);
		bodyModel[41].rotateAngleX = 0.38397244F;

		bodyModel[42].addShapeBox(0F, 0F, -0.5F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[42].setRotationPoint(1F, -43.5F, 3.5F);
		bodyModel[42].rotateAngleX = 0.38397244F;

		bodyModel[43].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[43].setRotationPoint(11F, -43F, 3F);
		bodyModel[43].rotateAngleX = 0.40142573F;

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 9, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 207
		bodyModel[44].setRotationPoint(12F, -44.4F, 0F);
		bodyModel[44].rotateAngleZ = -0.19198622F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 12, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[45].setRotationPoint(-1F, -39F, -2.5F);
		bodyModel[45].rotateAngleZ = -0.12217305F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 9, 6, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[46].setRotationPoint(-12F, -33F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 192
		bodyModel[47].setRotationPoint(-1F, -39F, -5F);
		bodyModel[47].rotateAngleZ = -0.12217305F;

		bodyModel[48].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 193
		bodyModel[48].setRotationPoint(-7F, -33F, -5F);
		bodyModel[48].rotateAngleZ = -0.12217305F;

		bodyModel[49].addShapeBox(-4F, 0F, 0F, 6, 6, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.3F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.45F, 0F); // Box 194
		bodyModel[49].setRotationPoint(-7F, -33F, 4F);
		bodyModel[49].rotateAngleZ = -0.12217305F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 195
		bodyModel[50].setRotationPoint(-1F, -39F, 4F);
		bodyModel[50].rotateAngleZ = -0.12217305F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 237
		bodyModel[51].setRotationPoint(-1F, -43F, -1F);
		bodyModel[51].rotateAngleZ = -0.05235988F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 7, 22, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[52].setRotationPoint(-25.8F, -36F, -11F);
		bodyModel[52].rotateAngleZ = 0.27925268F;

		bodyModel[53].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[53].setRotationPoint(-17F, -38F, -9.5F);
		bodyModel[53].rotateAngleZ = 0.27925268F;

		bodyModel[54].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[54].setRotationPoint(-17F, -38F, -10.5F);
		bodyModel[54].rotateAngleZ = 0.27925268F;

		bodyModel[55].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[55].setRotationPoint(-17F, -38F, -9F);
		bodyModel[55].rotateAngleZ = 0.27925268F;

		bodyModel[56].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[56].setRotationPoint(-17F, -38F, -11F);
		bodyModel[56].rotateAngleZ = 0.27925268F;

		bodyModel[57].addShapeBox(0F, 3.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[57].setRotationPoint(-17F, -38F, -10F);
		bodyModel[57].rotateAngleZ = 0.27925268F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[58].setRotationPoint(-17.7F, -39.2F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[59].setRotationPoint(-21.2F, -39F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[60].setRotationPoint(-18.7F, -42.05F, -1F);

		bodyModel[61].addShapeBox(-6F, 0F, 0F, 23, 11, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 250
		bodyModel[61].setRotationPoint(16F, -31F, -8.7F);
		bodyModel[61].rotateAngleX = -0.05235988F;
		bodyModel[61].rotateAngleY = 0.10471976F;

		bodyModel[62].addShapeBox(-6F, -7F, 0F, 23, 12, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F); // Box 251
		bodyModel[62].setRotationPoint(16F, -31F, -8.7F);
		bodyModel[62].rotateAngleX = -0.38397244F;
		bodyModel[62].rotateAngleY = 0.10471976F;

		bodyModel[63].addShapeBox(-6F, 0F, 0F, 23, 11, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 282
		bodyModel[63].setRotationPoint(16F, -31F, 7.7F);
		bodyModel[63].rotateAngleX = 0.05235988F;
		bodyModel[63].rotateAngleY = -0.10471976F;

		bodyModel[64].addShapeBox(-6F, -7F, -1F, 23, 12, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F); // Box 283
		bodyModel[64].setRotationPoint(16F, -31F, 8.7F);
		bodyModel[64].rotateAngleX = 0.38397244F;
		bodyModel[64].rotateAngleY = -0.10471976F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		noseModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 187
		noseModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 188
		noseModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 189
		noseModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 190
		noseModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 193
		noseModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 194
		noseModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 195
		noseModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 196
		noseModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 197
		noseModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 198
		noseModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 199
		noseModel[12] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 120
		noseModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 201
		noseModel[14] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 202
		noseModel[15] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 203
		noseModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 204
		noseModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 205
		noseModel[18] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 206
		noseModel[19] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 145
		noseModel[20] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 146
		noseModel[21] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 175
		noseModel[22] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 176
		noseModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 177
		noseModel[24] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 271
		noseModel[25] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 272
		noseModel[26] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 273
		noseModel[27] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 274
		noseModel[28] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 275
		noseModel[29] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 276
		noseModel[30] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 277
		noseModel[31] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 278
		noseModel[32] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 279
		noseModel[33] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 280
		noseModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 281

		noseModel[0].addShapeBox(0F, 0F, 0F, 12, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 186
		noseModel[0].setRotationPoint(-65F, -29.5F, -12.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 12, 8, 25, 0F,0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 187
		noseModel[1].setRotationPoint(-65F, -37.5F, -12.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 12, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0.5F, -8F); // Box 188
		noseModel[2].setRotationPoint(-65F, -21.5F, -12.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-1.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.7F); // Box 189
		noseModel[3].setRotationPoint(-71F, -37.5F, -4.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-0.5F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.7F, -1.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F); // Box 190
		noseModel[4].setRotationPoint(-71F, -18F, -4.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 193
		noseModel[5].setRotationPoint(-71F, -29.5F, 8.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0.5F, -8F, -1.5F, -1.5F, -8F, -0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 194
		noseModel[6].setRotationPoint(-71F, -37.5F, 8.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F); // Box 195
		noseModel[7].setRotationPoint(-71F, -29.5F, -12.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-0.5F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, -2F, -0.5F, -4F, 4.7F, 0F, -4F, 4F, 0F, 0.5F, -8F, -1.5F, -1.5F, -8F); // Box 196
		noseModel[8].setRotationPoint(-71F, -21.5F, 8.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, -1.5F, -8F, 0F, 0.5F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F); // Box 197
		noseModel[9].setRotationPoint(-71F, -37.5F, -12.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -1.5F, -1.5F, -8F, 0F, 0.5F, -8F, 0F, -4F, 4F, -0.5F, -4F, 4.7F); // Box 198
		noseModel[10].setRotationPoint(-71F, -21.5F, -12.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 199
		noseModel[11].setRotationPoint(-71F, -29F, -4F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseModel[12].setRotationPoint(-69F, -29F, -4F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 201
		noseModel[13].setRotationPoint(-77F, -27F, -4.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 202
		noseModel[14].setRotationPoint(-77F, -30F, -4.5F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 203
		noseModel[15].setRotationPoint(-77F, -24F, -4.5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F); // Box 204
		noseModel[16].setRotationPoint(-80F, -26.5F, -4F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F); // Box 205
		noseModel[17].setRotationPoint(-80F, -28.5F, -4F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F, -0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F); // Box 206
		noseModel[18].setRotationPoint(-80F, -23.5F, -4F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-0.2F, 0.5F, -0.5F, 0F, 1.2F, -0.5F, 0F, 1.52F, -0.5F, -0.2F, 0.5F, -0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 145
		noseModel[19].setRotationPoint(-70.5F, -36.5F, -3.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 1.2F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.52F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		noseModel[20].setRotationPoint(-68.5F, -36.5F, -3.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, -0.7F, 0F, 0.7F, 0.7F, 0F, 0F, 0F); // Box 175
		noseModel[21].setRotationPoint(-68.5F, -35F, -8.5F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, -0.7F, 0F, 0.7F, 0.7F, 0F, 0F, 0F); // Box 176
		noseModel[22].setRotationPoint(-69.5F, -37F, -5.5F);

		noseModel[23].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 177
		noseModel[23].setRotationPoint(-52F, -29.5F, -11F);
		noseModel[23].rotateAngleY = -0.78539816F;
		noseModel[23].rotateAngleZ = 0.08726646F;

		noseModel[24].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.7F, 0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F, -0.7F, 0F, 0F, 0F); // Box 271
		noseModel[24].setRotationPoint(-68.5F, -35F, 7.5F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.7F, 0.7F, 0F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F, -0.7F, 0F, 0F, 0F); // Box 272
		noseModel[25].setRotationPoint(-69.5F, -37F, 4.5F);

		noseModel[26].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 273
		noseModel[26].setRotationPoint(-52F, -28F, -11F);
		noseModel[26].rotateAngleY = -0.78539816F;
		noseModel[26].rotateAngleZ = 0.08726646F;

		noseModel[27].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 274
		noseModel[27].setRotationPoint(-52F, -26.5F, -11F);
		noseModel[27].rotateAngleY = -0.78539816F;

		noseModel[28].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 275
		noseModel[28].setRotationPoint(-52F, -25F, -11F);
		noseModel[28].rotateAngleY = -0.78539816F;

		noseModel[29].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 276
		noseModel[29].setRotationPoint(-52F, -23.5F, -11F);
		noseModel[29].rotateAngleY = -0.78539816F;

		noseModel[30].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 277
		noseModel[30].setRotationPoint(-52F, -23.5F, 11F);
		noseModel[30].rotateAngleY = 0.78539816F;

		noseModel[31].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 278
		noseModel[31].setRotationPoint(-52F, -25F, 11F);
		noseModel[31].rotateAngleY = 0.78539816F;

		noseModel[32].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 279
		noseModel[32].setRotationPoint(-52F, -26.5F, 11F);
		noseModel[32].rotateAngleY = 0.78539816F;

		noseModel[33].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 280
		noseModel[33].setRotationPoint(-52F, -28F, 11F);
		noseModel[33].rotateAngleY = 0.78539816F;
		noseModel[33].rotateAngleZ = 0.08726646F;

		noseModel[34].addShapeBox(-2F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 281
		noseModel[34].setRotationPoint(-52F, -29.5F, 11F);
		noseModel[34].rotateAngleY = 0.78539816F;
		noseModel[34].rotateAngleZ = 0.08726646F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 166
		tailModel[1] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 167
		tailModel[2] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 168
		tailModel[3] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 172
		tailModel[4] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 173
		tailModel[5] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 174
		tailModel[6] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 181
		tailModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 182
		tailModel[8] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 267
		tailModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 268

		tailModel[0].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,0F, 0F, 4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, 4.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 4.5F); // Box 166
		tailModel[0].setRotationPoint(35F, -31.5F, -2.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,0F, 1F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 1F, 0F, 0F, 0F, 4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 4F); // Box 167
		tailModel[1].setRotationPoint(35F, -39.5F, -2.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 31, 5, 5, 0F,0F, 0F, 4.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, -6.5F, -1F, 0F, -6.5F, -1F, 0F, 0F, 0F); // Box 168
		tailModel[2].setRotationPoint(35F, -23.5F, -2.5F);

		tailModel[3].addShapeBox(0F, 0F, -1F, 6, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		tailModel[3].setRotationPoint(60F, -59.5F, 0F);

		tailModel[4].addShapeBox(0F, 0F, -1F, 6, 20, 2, 0F,0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		tailModel[4].setRotationPoint(54F, -55.5F, 0F);

		tailModel[5].addShapeBox(0F, 0F, -1F, 6, 18, 2, 0F,2F, -17.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, -17.9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 174
		tailModel[5].setRotationPoint(48F, -55.5F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 30, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F); // Box 181
		tailModel[6].setRotationPoint(57F, -43.5F, -31F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 182
		tailModel[7].setRotationPoint(58F, -43.5F, -35F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 7, 2, 30, 0F,7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 267
		tailModel[8].setRotationPoint(57F, -43.5F, 1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F); // Box 268
		tailModel[9].setRotationPoint(58F, -43.5F, 31F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 234
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 235
		leftWingModel[2] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 236
		leftWingModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 283
		leftWingModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 114
		leftWingModel[5] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 177

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 106, 0F,-1F, 4F, 0F, -7F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -8F, 0F, -7F, -8F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 234
		leftWingModel[0].setRotationPoint(-35F, -19F, -106F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 106, 0F,-3.5F, 3.5F, -4F, 1F, 4F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3.5F, -8F, -4F, 1F, -8F, 0F, 0F, 1F, 0F, 4F, 0F, 0F); // Box 235
		leftWingModel[1].setRotationPoint(-42F, -19F, -106F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 106, 0F,7F, 4F, -2F, -15F, 3F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, -8F, -2F, -15F, -7F, -9F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftWingModel[2].setRotationPoint(-15F, -19F, -106F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 283
		leftWingModel[3].setRotationPoint(-39F, -22F, -76F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F); // Box 114
		leftWingModel[4].setRotationPoint(-39F, -18F, -75.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 16, 6, 16, 0F,-1F, 0.5F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -1.15F, 0F, 0F, -3F, -12F, 0F, -2F, 0F, -3F, 0F, 0F); // Box 177
		leftWingModel[5].setRotationPoint(-7F, -19F, -16F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 261
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 262
		rightWingModel[2] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 263
		rightWingModel[3] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 264
		rightWingModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 265
		rightWingModel[5] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 266

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 6, 106, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 4F, -2F, -1F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, -8F, -2F, -1F, -8F, 0F); // Box 261
		rightWingModel[0].setRotationPoint(-35F, -19F, 0F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 6, 106, 0F,4F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -3.5F, 3.5F, -4F, 4F, 0F, 0F, 0F, 1F, 0F, 1F, -8F, 0F, -3.5F, -8F, -4F); // Box 262
		rightWingModel[1].setRotationPoint(-42F, -19F, 0F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 106, 0F,0F, 0F, 0F, -3F, 0F, 0F, -15F, 3F, -9F, 7F, 4F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -15F, -7F, -9F, 7F, -8F, -2F); // Box 263
		rightWingModel[2].setRotationPoint(-15F, -19F, 0F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		rightWingModel[3].setRotationPoint(-39F, -22F, 53F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F); // Box 265
		rightWingModel[4].setRotationPoint(-39F, -18F, 52.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 16, 6, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -1F, 0.5F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -12F, -1F, -1.15F, 0F); // Box 266
		rightWingModel[5].setRotationPoint(-7F, -19F, 0F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 169
		yawFlapModel[1] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 170
		yawFlapModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 171
		yawFlapModel[3] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 106
		yawFlapModel[4] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 107

		yawFlapModel[0].addShapeBox(0F, 0F, -2F, 6, 34, 4, 0F,0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, 0F); // Box 169
		yawFlapModel[0].setRotationPoint(66F, -59.5F, 0F);

		yawFlapModel[1].addShapeBox(6F, 0F, -1F, 6, 29, 2, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 170
		yawFlapModel[1].setRotationPoint(66F, -55.5F, 0F);

		yawFlapModel[2].addShapeBox(12F, 0F, -1F, 3, 18, 2, 0F,0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F); // Box 171
		yawFlapModel[2].setRotationPoint(66F, -45.5F, 0F);

		yawFlapModel[3].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[3].setRotationPoint(-19F, -24F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[4].setRotationPoint(-19F, -24F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 183
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 184
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 7, 2, 30, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, -5F, 0F, 0F, 0F); // Box 183
		pitchFlapLeftModel[0].setRotationPoint(64F, -42.5F, -31F);

		pitchFlapLeftModel[1].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, -1F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 184
		pitchFlapLeftModel[1].setRotationPoint(64F, -42.5F, -35F);

		pitchFlapLeftModel[2].addShapeBox(-0.5F, -16F, -0.5F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[2].setRotationPoint(-13F, -21.5F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 269
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 270

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 7, 2, 30, 0F,0F, 0F, 0F, 2.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		pitchFlapRightModel[0].setRotationPoint(64F, -42.5F, 1F);

		pitchFlapRightModel[1].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 270
		pitchFlapRightModel[1].setRotationPoint(64F, -42.5F, 31F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 296
		tailWheelModel[1] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 297
		tailWheelModel[2] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 298
		tailWheelModel[3] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 299
		tailWheelModel[4] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 300

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		tailWheelModel[0].setRotationPoint(46.5F, -25F, -1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 297
		tailWheelModel[1].setRotationPoint(47F, -19F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 298
		tailWheelModel[2].setRotationPoint(47F, -15.5F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 299
		tailWheelModel[3].setRotationPoint(47F, -17F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F); // Box 300
		tailWheelModel[4].setRotationPoint(47F, -14F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 323
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 324
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 325
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 326
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 327
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 328
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 329
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 330
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 331

		leftWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		leftWingWheelModel[0].setRotationPoint(-35F, -15F, -25F);
		leftWingWheelModel[0].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		leftWingWheelModel[1].setRotationPoint(-44F, 1.5F, -24F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		leftWingWheelModel[2].setRotationPoint(-44F, -2.5F, -24F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 326
		leftWingWheelModel[3].setRotationPoint(-44F, 6.5F, -24F);

		leftWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 327
		leftWingWheelModel[4].setRotationPoint(-35.5F, -15F, -26F);
		leftWingWheelModel[4].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 328
		leftWingWheelModel[5].setRotationPoint(-35.5F, -15F, -26F);
		leftWingWheelModel[5].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 329
		leftWingWheelModel[6].setRotationPoint(-35.5F, -15F, -26F);
		leftWingWheelModel[6].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 330
		leftWingWheelModel[7].setRotationPoint(-35F, -8F, -25F);
		leftWingWheelModel[7].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		leftWingWheelModel[8].setRotationPoint(-35F, -8F, -25F);
		leftWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 252
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 253
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 254
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 255
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 256
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 257
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 258
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 259
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 260

		rightWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightWingWheelModel[0].setRotationPoint(-35F, -15F, 24F);
		rightWingWheelModel[0].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightWingWheelModel[1].setRotationPoint(-44F, 1.5F, 21F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightWingWheelModel[2].setRotationPoint(-44F, -2.5F, 21F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 255
		rightWingWheelModel[3].setRotationPoint(-44F, 6.5F, 21F);

		rightWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 256
		rightWingWheelModel[4].setRotationPoint(-35.5F, -15F, 25F);
		rightWingWheelModel[4].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 257
		rightWingWheelModel[5].setRotationPoint(-35.5F, -15F, 25F);
		rightWingWheelModel[5].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 258
		rightWingWheelModel[6].setRotationPoint(-35.5F, -15F, 25F);
		rightWingWheelModel[6].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 259
		rightWingWheelModel[7].setRotationPoint(-35F, -8F, 24F);
		rightWingWheelModel[7].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightWingWheelModel[8].setRotationPoint(-35F, -8F, 24F);
		rightWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-73F, -24.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 148, 184, textureX, textureY);
		prop[0].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[1].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[2].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}