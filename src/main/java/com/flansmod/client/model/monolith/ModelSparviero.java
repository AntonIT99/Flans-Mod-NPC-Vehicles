//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sparviero
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSparviero extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSparviero() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];
		tailModel = new ModelRendererTurbo[13];
		leftWingModel = new ModelRendererTurbo[13];
		rightWingModel = new ModelRendererTurbo[13];
		yawFlapModel = new ModelRendererTurbo[2];
		leftWingWheelModel = new ModelRendererTurbo[5];
		rightWingWheelModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 184
		bodyModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 185
		bodyModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 186
		bodyModel[3] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 187
		bodyModel[4] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 189
		bodyModel[5] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 190
		bodyModel[6] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 191
		bodyModel[7] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 192
		bodyModel[8] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 193
		bodyModel[9] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 194
		bodyModel[10] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 195
		bodyModel[11] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 196
		bodyModel[12] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 198
		bodyModel[13] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 199
		bodyModel[14] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 200
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 201
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 202
		bodyModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 204
		bodyModel[19] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 205
		bodyModel[20] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 206
		bodyModel[21] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 207
		bodyModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 221
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 222
		bodyModel[24] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 223
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 224
		bodyModel[26] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 225
		bodyModel[27] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 226
		bodyModel[28] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 227
		bodyModel[29] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 228
		bodyModel[30] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 229
		bodyModel[31] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 230
		bodyModel[32] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 231
		bodyModel[33] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 232
		bodyModel[34] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 233
		bodyModel[35] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 234
		bodyModel[36] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 235
		bodyModel[37] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 236
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 237
		bodyModel[39] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 238
		bodyModel[40] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 239
		bodyModel[41] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 240
		bodyModel[42] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 241
		bodyModel[43] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 243
		bodyModel[44] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 244
		bodyModel[45] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 245
		bodyModel[46] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 246
		bodyModel[47] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 247
		bodyModel[48] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 248
		bodyModel[49] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 249
		bodyModel[50] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 250
		bodyModel[51] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 251
		bodyModel[52] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 252
		bodyModel[53] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 253
		bodyModel[54] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 254
		bodyModel[55] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 255
		bodyModel[56] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 256
		bodyModel[57] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 257
		bodyModel[58] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 258
		bodyModel[59] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 266
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 267
		bodyModel[61] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 299
		bodyModel[62] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 300
		bodyModel[63] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 301
		bodyModel[64] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 302
		bodyModel[65] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 303
		bodyModel[66] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 304
		bodyModel[67] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 305
		bodyModel[68] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 306
		bodyModel[69] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 307
		bodyModel[70] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 308

		bodyModel[0].addShapeBox(0F, 0F, 0F, 111, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[0].setRotationPoint(-118F, -47F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[1].setRotationPoint(-42F, -65F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 18, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[2].setRotationPoint(-42F, -65F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 5, 28, 0F,0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[3].setRotationPoint(-42F, -70F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 76, 8, 1, 0F,0F, -5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[4].setRotationPoint(-118F, -55F, 13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 76, 8, 1, 0F,0F, -5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[5].setRotationPoint(-118F, -55F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 9, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[6].setRotationPoint(-118F, -56F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, -6F, 1F, 0F, -1F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[7].setRotationPoint(-118F, -56F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 24, 9, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 1F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[8].setRotationPoint(-118F, -56F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 20, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[9].setRotationPoint(-141F, -52F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[10].setRotationPoint(-141F, -56F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 196
		bodyModel[11].setRotationPoint(-141F, -32F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 20, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 198
		bodyModel[12].setRotationPoint(-146F, -52F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 199
		bodyModel[13].setRotationPoint(-146F, -56F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F); // Box 200
		bodyModel[14].setRotationPoint(-146F, -32F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 201
		bodyModel[15].setRotationPoint(-152F, -46F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F); // Box 202
		bodyModel[16].setRotationPoint(-156F, -46F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 24, 24, 0F,0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F); // Box 203
		bodyModel[17].setRotationPoint(-123F, -54F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 66, 36, 28, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 204
		bodyModel[18].setRotationPoint(-7F, -65F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 70, 26, 26, 0F,0F, 0F, 0F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, 0F); // Box 205
		bodyModel[19].setRotationPoint(59F, -60F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 66, 4, 28, 0F,0F, 0F, -5F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 206
		bodyModel[20].setRotationPoint(-7F, -69F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 70, 6, 26, 0F,0F, 0F, -5F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 0F, 0F); // Box 207
		bodyModel[21].setRotationPoint(59F, -66F, -13F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[22].setRotationPoint(-90F, -65F, -6F);
		bodyModel[22].rotateAngleY = 0.15707963F;
		bodyModel[22].rotateAngleZ = -0.75049158F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[23].setRotationPoint(-90F, -65F, 5F);
		bodyModel[23].rotateAngleY = -0.17453293F;
		bodyModel[23].rotateAngleZ = -0.75049158F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[24].setRotationPoint(-90.2F, -64.7F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[25].setRotationPoint(-90F, -64.5F, -5.5F);
		bodyModel[25].rotateAngleY = -0.34906585F;
		bodyModel[25].rotateAngleZ = 0.20943951F;

		bodyModel[26].addShapeBox(0F, 0F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[26].setRotationPoint(-90F, -65F, 5.5F);
		bodyModel[26].rotateAngleY = 0.34906585F;
		bodyModel[26].rotateAngleZ = 0.20943951F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 14, 0F,1F, 0.5F, 0F, -1F, 3.5F, 2F, -1F, 3.5F, 2F, 1F, 0.5F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0F, 2F); // Box 226
		bodyModel[27].setRotationPoint(-83F, -69F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[28].setRotationPoint(-90F, -65F, -3F);
		bodyModel[28].rotateAngleZ = -0.75049158F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[29].setRotationPoint(-90F, -65F, 2F);
		bodyModel[29].rotateAngleZ = -0.75049158F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[30].setRotationPoint(-84F, -69.5F, -3F);
		bodyModel[30].rotateAngleZ = -0.9250245F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[31].setRotationPoint(-84F, -69.5F, 2F);
		bodyModel[31].rotateAngleZ = -0.9250245F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[32].setRotationPoint(-77F, -72.5F, -9F);
		bodyModel[32].rotateAngleZ = 0.33161256F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 232
		bodyModel[33].setRotationPoint(-68.5F, -75.5F, -9F);
		bodyModel[33].rotateAngleZ = 0.13962634F;

		bodyModel[34].addShapeBox(0F, 0F, -4F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[34].setRotationPoint(-68.5F, -75.5F, -9F);
		bodyModel[34].rotateAngleX = 0.78539816F;
		bodyModel[34].rotateAngleZ = 0.13962634F;

		bodyModel[35].addShapeBox(0F, 0F, -3F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[35].setRotationPoint(-77F, -72.5F, -9F);
		bodyModel[35].rotateAngleX = 0.78539816F;
		bodyModel[35].rotateAngleZ = 0.33161256F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 235
		bodyModel[36].setRotationPoint(-68.5F, -75.5F, 9F);
		bodyModel[36].rotateAngleX = -0.78539816F;
		bodyModel[36].rotateAngleZ = 0.13962634F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 236
		bodyModel[37].setRotationPoint(-77F, -72.5F, 9F);
		bodyModel[37].rotateAngleX = -0.78539816F;
		bodyModel[37].rotateAngleZ = 0.33161256F;

		bodyModel[38].addShapeBox(-9F, 0F, -2F, 9, 1, 2, 0F,-2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, -1.5F, 1.5F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 1.5F, 1.5F); // Box 237
		bodyModel[38].setRotationPoint(-77F, -72.5F, -9F);
		bodyModel[38].rotateAngleX = 0.78539816F;
		bodyModel[38].rotateAngleZ = 0.43633231F;

		bodyModel[39].addShapeBox(-9F, 0F, 0F, 9, 1, 1, 0F,-1.5F, -1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -1.5F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F); // Box 238
		bodyModel[39].setRotationPoint(-77F, -72.5F, 9F);
		bodyModel[39].rotateAngleX = -0.78539816F;
		bodyModel[39].rotateAngleZ = 0.43633231F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 34, 8, 2, 0F,0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 239
		bodyModel[40].setRotationPoint(-77F, -67F, -14F);
		bodyModel[40].rotateAngleZ = 0.17453293F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 4, 7, 0F,0F, -0.5F, -2F, 1.5F, -1F, -2F, 1.5F, -1F, 0F, 0F, -0.5F, -2F, 0.5F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, 0F, 0F); // Box 240
		bodyModel[41].setRotationPoint(-77F, -71F, -14F);
		bodyModel[41].rotateAngleZ = 0.17453293F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 4, 7, 0F,0F, -0.5F, -2F, 1.5F, -1F, 0F, 1.5F, -1F, -2F, 0F, -0.5F, -2F, 0.5F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, 0F, 0F); // Box 241
		bodyModel[42].setRotationPoint(-77F, -71F, 7F);
		bodyModel[42].rotateAngleZ = 0.17453293F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 6F); // Box 243
		bodyModel[43].setRotationPoint(-42F, -73F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 34, 8, 2, 0F,0F, 0F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 244
		bodyModel[44].setRotationPoint(-77F, -67F, 12F);
		bodyModel[44].rotateAngleZ = 0.17453293F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[45].setRotationPoint(-43F, -71F, -13F);

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[46].setRotationPoint(-90F, -64.5F, -5.5F);
		bodyModel[46].rotateAngleX = -0.71558499F;
		bodyModel[46].rotateAngleZ = 0.19198622F;

		bodyModel[47].addShapeBox(0F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[47].setRotationPoint(-84F, -65.5F, -8F);
		bodyModel[47].rotateAngleX = -0.50614548F;
		bodyModel[47].rotateAngleZ = 0.19198622F;

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[48].setRotationPoint(-90F, -64.5F, 5.5F);
		bodyModel[48].rotateAngleX = 0.71558499F;
		bodyModel[48].rotateAngleZ = 0.19198622F;

		bodyModel[49].addShapeBox(0F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[49].setRotationPoint(-84F, -65.5F, 8F);
		bodyModel[49].rotateAngleX = 0.50614548F;
		bodyModel[49].rotateAngleZ = 0.19198622F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[50].setRotationPoint(-77F, -72.5F, 2F);
		bodyModel[50].rotateAngleZ = 0.33161256F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[51].setRotationPoint(-68.5F, -75.5F, 0F);
		bodyModel[51].rotateAngleZ = 0.13962634F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 22, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[52].setRotationPoint(10F, -24F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[53].setRotationPoint(32F, -24F, -6F);
		bodyModel[53].rotateAngleZ = 0.19198622F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[54].setRotationPoint(6F, -31F, -6F);
		bodyModel[54].rotateAngleZ = 0.4712389F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[55].setRotationPoint(10F, -31F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[56].setRotationPoint(10F, -31F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 257
		bodyModel[57].setRotationPoint(32F, -32F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 258
		bodyModel[58].setRotationPoint(32F, -32F, 5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[59].setRotationPoint(-6F, -75F, -0.5F);

		bodyModel[60].addShapeBox(70F, 0F, 0F, 1, 1, 1, 0F,70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F, 70F, -0.2F, -0.2F); // Box 267
		bodyModel[60].setRotationPoint(-6F, -74F, -0.5F);
		bodyModel[60].rotateAngleZ = 0.1012291F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[61].setRotationPoint(49F, -29F, -1F);
		bodyModel[61].rotateAngleZ = -0.36651914F;

		bodyModel[62].addShapeBox(6F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[62].setRotationPoint(49F, -28.5F, -0.5F);
		bodyModel[62].rotateAngleZ = -0.36651914F;

		bodyModel[63].addShapeBox(6F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[63].setRotationPoint(-44F, -72F, -0.5F);
		bodyModel[63].rotateAngleZ = 0.36651914F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[64].setRotationPoint(-44F, -72.5F, -1F);
		bodyModel[64].rotateAngleZ = 0.36651914F;

		bodyModel[65].addShapeBox(-17F, -1F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[65].setRotationPoint(-73F, -71.5F, -0.5F);
		bodyModel[65].rotateAngleZ = -0.06981317F;

		bodyModel[66].addShapeBox(-6F, -1F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[66].setRotationPoint(-73F, -72F, -1F);
		bodyModel[66].rotateAngleZ = -0.06981317F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[67].setRotationPoint(-88F, -51F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[68].setRotationPoint(-88F, -51F, 1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[69].setRotationPoint(-80F, -63F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[70].setRotationPoint(-80F, -63F, 1F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 259
		tailModel[1] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 260
		tailModel[2] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 261
		tailModel[3] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 263
		tailModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 264
		tailModel[5] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 265
		tailModel[6] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 273
		tailModel[7] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 274
		tailModel[8] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 275
		tailModel[9] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Box 276
		tailModel[10] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 277
		tailModel[11] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 278
		tailModel[12] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 279

		tailModel[0].addShapeBox(0F, 0F, 0F, 15, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 259
		tailModel[0].setRotationPoint(129F, -62F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 16, 28, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		tailModel[1].setRotationPoint(126F, -89F, -1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 28, 28, 2, 0F,-14F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -6F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 261
		tailModel[2].setRotationPoint(98F, -87F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 116, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		tailModel[3].setRotationPoint(129F, -58F, -58F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 16, 2, 68, 0F,0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F); // Box 264
		tailModel[4].setRotationPoint(107F, -58F, -34F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 13, 2, 40, 0F,0F, 0F, -13F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -13F); // Box 265
		tailModel[5].setRotationPoint(94F, -58F, -20F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		tailModel[6].setRotationPoint(133F, -39.5F, -1.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 274
		tailModel[7].setRotationPoint(133F, -36.5F, -1.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		tailModel[8].setRotationPoint(133F, -42.5F, -1.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 116, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 276
		tailModel[9].setRotationPoint(137F, -58F, -58F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 68, 0F,0F, 0F, 20F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 24F, 0F, 0F, 24F, 0F, 0F, 20F); // Box 277
		tailModel[10].setRotationPoint(123F, -58F, -34F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F); // Box 278
		tailModel[11].setRotationPoint(126F, -57.5F, -38F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 34, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		tailModel[12].setRotationPoint(126F, -57.5F, 4F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 208
		leftWingModel[1] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 209
		leftWingModel[2] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 210
		leftWingModel[3] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 211
		leftWingModel[4] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 212
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 213
		leftWingModel[6] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 214
		leftWingModel[7] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 215
		leftWingModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 216
		leftWingModel[9] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 217
		leftWingModel[10] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 218
		leftWingModel[11] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 219
		leftWingModel[12] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 220

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 37, 5, 176, 0F,0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 9F, 0F, 13F, 9F, 0F); // Box 208
		leftWingModel[0].setRotationPoint(-81F, -43F, -190F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 37, 5, 20, 0F,-10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingModel[1].setRotationPoint(-81F, -43F, -210F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		leftWingModel[2].setRotationPoint(-108F, -45F, -67F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 18, 20, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingModel[3].setRotationPoint(-108F, -41F, -67F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 212
		leftWingModel[4].setRotationPoint(-108F, -21F, -67F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F); // Box 213
		leftWingModel[5].setRotationPoint(-113F, -21F, -67F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 5, 20, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 214
		leftWingModel[6].setRotationPoint(-113F, -41F, -67F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 215
		leftWingModel[7].setRotationPoint(-113F, -45F, -67F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 216
		leftWingModel[8].setRotationPoint(-119F, -35F, -57F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F); // Box 217
		leftWingModel[9].setRotationPoint(-123F, -35F, -57F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 218
		leftWingModel[10].setRotationPoint(-90F, -40F, -62F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 31, 22, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[11].setRotationPoint(-76F, -40F, -62F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 37, 22, 18, 0F,0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F); // Box 220
		leftWingModel[12].setRotationPoint(-45F, -40F, -62F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 280
		rightWingModel[1] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 281
		rightWingModel[2] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 282
		rightWingModel[3] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 283
		rightWingModel[4] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 284
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 285
		rightWingModel[6] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 286
		rightWingModel[7] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 287
		rightWingModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 288
		rightWingModel[9] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 289
		rightWingModel[10] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 290
		rightWingModel[11] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 291
		rightWingModel[12] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 292

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 37, 5, 176, 0F,13F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 9F, 0F, 30F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[0].setRotationPoint(-81F, -43F, 14F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 37, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F); // Box 281
		rightWingModel[1].setRotationPoint(-81F, -43F, 190F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightWingModel[2].setRotationPoint(-108F, -45F, 39F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 18, 20, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightWingModel[3].setRotationPoint(-108F, -41F, 39F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 18, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 284
		rightWingModel[4].setRotationPoint(-108F, -21F, 39F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F); // Box 285
		rightWingModel[5].setRotationPoint(-113F, -21F, 39F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 5, 20, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 286
		rightWingModel[6].setRotationPoint(-113F, -41F, 39F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3.9F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 287
		rightWingModel[7].setRotationPoint(-113F, -45F, 39F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 288
		rightWingModel[8].setRotationPoint(-119F, -35F, 49F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 4, 8, 8, 0F,0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2.5F); // Box 289
		rightWingModel[9].setRotationPoint(-123F, -35F, 49F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 14, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 290
		rightWingModel[10].setRotationPoint(-90F, -40F, 44F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 31, 22, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightWingModel[11].setRotationPoint(-76F, -40F, 44F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 37, 22, 18, 0F,0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F); // Box 292
		rightWingModel[12].setRotationPoint(-45F, -40F, 44F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 262
		yawFlapModel[1] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 298

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 10, 47, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		yawFlapModel[0].setRotationPoint(142F, -89F, 0F);

		yawFlapModel[1].addShapeBox(10F, 0F, -1F, 4, 47, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 298
		yawFlapModel[1].setRotationPoint(142F, -89F, 0F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 268
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 269
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 270
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 271
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 272

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftWingWheelModel[0].setRotationPoint(-91F, -3.5F, -55.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingWheelModel[1].setRotationPoint(-91F, -10.5F, -55.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 270
		leftWingWheelModel[2].setRotationPoint(-91F, 3.5F, -55.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingWheelModel[3].setRotationPoint(-83F, -21.5F, -56.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		leftWingWheelModel[4].setRotationPoint(-83F, -21.5F, -49.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 293
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 294
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 295
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 296
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 297

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightWingWheelModel[0].setRotationPoint(-91F, -3.5F, 49.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightWingWheelModel[1].setRotationPoint(-91F, -10.5F, 49.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 21, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 295
		rightWingWheelModel[2].setRotationPoint(-91F, 3.5F, 49.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightWingWheelModel[3].setRotationPoint(-83F, -21.5F, 55.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightWingWheelModel[4].setRotationPoint(-83F, -21.5F, 48.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[3][3];
		propellerModels[0] = makeProp1(-149.5F, -42F, 0F);
		propellerModels[1] = makeProp2(-117F, -31F, -53F);
		propellerModels[2] = makeProp3(-117F, -31F, 53F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[1].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[2].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
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
		prop[0].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[1].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[2].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
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
		prop[0].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[1].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[2].addBox(-1.5F, -30F, -1.5F, 3, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}