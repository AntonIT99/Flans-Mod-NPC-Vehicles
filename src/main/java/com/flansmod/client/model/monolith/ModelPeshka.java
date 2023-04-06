//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Peshka
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPeshka extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPeshka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];
		noseModel = new ModelRendererTurbo[8];
		tailModel = new ModelRendererTurbo[20];
		leftWingModel = new ModelRendererTurbo[45];
		rightWingModel = new ModelRendererTurbo[45];
		yawFlapModel = new ModelRendererTurbo[10];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[7];
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
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 185
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 186
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 193
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 194
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 195
		bodyModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 196
		bodyModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 197
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 198
		bodyModel[8] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 199
		bodyModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 200
		bodyModel[10] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 201
		bodyModel[11] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 202
		bodyModel[12] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 203
		bodyModel[13] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 204
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 205
		bodyModel[15] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 206
		bodyModel[16] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 207
		bodyModel[17] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 208
		bodyModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 209
		bodyModel[19] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 210
		bodyModel[20] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 211
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 212
		bodyModel[22] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 213
		bodyModel[23] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 214
		bodyModel[24] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 215
		bodyModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 216
		bodyModel[26] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 217
		bodyModel[27] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 218
		bodyModel[28] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 219
		bodyModel[29] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 220
		bodyModel[30] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 221
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 222
		bodyModel[32] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 223
		bodyModel[33] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 224
		bodyModel[34] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 225
		bodyModel[35] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 226
		bodyModel[36] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 227
		bodyModel[37] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 228
		bodyModel[38] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 229
		bodyModel[39] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 230
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 231
		bodyModel[41] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 232
		bodyModel[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 233
		bodyModel[43] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 234
		bodyModel[44] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 235
		bodyModel[45] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 236
		bodyModel[46] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 237
		bodyModel[47] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 238
		bodyModel[48] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 239
		bodyModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 240
		bodyModel[50] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 241
		bodyModel[51] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 242
		bodyModel[52] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 243
		bodyModel[53] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 244
		bodyModel[54] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 245
		bodyModel[55] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 246
		bodyModel[56] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 81
		bodyModel[61] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 82
		bodyModel[62] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 83
		bodyModel[63] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 84
		bodyModel[64] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 131
		bodyModel[65] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 132
		bodyModel[66] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 133
		bodyModel[67] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 134
		bodyModel[68] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 135
		bodyModel[69] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 136
		bodyModel[70] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 137
		bodyModel[71] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 138
		bodyModel[72] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 139
		bodyModel[73] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 140
		bodyModel[74] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 141
		bodyModel[75] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 142
		bodyModel[76] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 143
		bodyModel[77] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 144
		bodyModel[78] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 145
		bodyModel[79] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 146
		bodyModel[80] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 603
		bodyModel[81] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 604
		bodyModel[82] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 606
		bodyModel[83] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 911
		bodyModel[84] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 912
		bodyModel[85] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 913
		bodyModel[86] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 907
		bodyModel[87] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 908
		bodyModel[88] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 909
		bodyModel[89] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 910
		bodyModel[90] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 578
		bodyModel[91] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Import 
		bodyModel[92] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import 
		bodyModel[93] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import 
		bodyModel[94] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import 
		bodyModel[95] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import 
		bodyModel[96] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 271
		bodyModel[97] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 272
		bodyModel[98] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 244
		bodyModel[99] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 245
		bodyModel[100] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 246
		bodyModel[101] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 247
		bodyModel[102] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 248
		bodyModel[103] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 249
		bodyModel[104] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 251
		bodyModel[105] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 252
		bodyModel[106] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 253
		bodyModel[107] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 255
		bodyModel[108] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 256
		bodyModel[109] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 257
		bodyModel[110] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 258
		bodyModel[111] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 259
		bodyModel[112] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 260
		bodyModel[113] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 261
		bodyModel[114] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 262
		bodyModel[115] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 264

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F); // Box 185
		bodyModel[0].setRotationPoint(-105F, -33F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 6, 16, 0F,0F, -1F, -4.5F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, -1F, -4.5F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F); // Box 186
		bodyModel[1].setRotationPoint(-105F, -39F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 6, 18, 0F,0F, 0F, 0.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0.5F, 0F, -1F, -5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -5F); // Box 193
		bodyModel[2].setRotationPoint(-97F, -26F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F,0F, 0F, 0.5F, 0F, 1F, 2.5F, 0F, 1F, -2.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, -1F, -0.5F); // Box 194
		bodyModel[3].setRotationPoint(-97F, -34F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, -0.5F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 5.5F, 0F, 0F, 0.5F, 0F, -1F, 2.5F, 0F, -1F, -2.5F, 0F, 0F, -0.5F); // Box 195
		bodyModel[4].setRotationPoint(-97F, -40F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 9, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, 2.5F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1F, 0.5F); // Box 196
		bodyModel[5].setRotationPoint(-97F, -34F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, -0.5F, 5.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -5F, 0F, 0F, -0.5F, 0F, -1F, -2.5F, 0F, -1F, 2.5F, 0F, 0F, 0.5F); // Box 197
		bodyModel[6].setRotationPoint(-97F, -40F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-3F, 0.2F, -0.5F, 1.5F, -0.3F, 1.5F, -1.5F, 0F, 0F, -1.8F, 0.2F, 0F, 0F, 0F, 0F, 1F, 0.17F, 1.7F, -4F, 0.17F, 0F, 2F, 0.4F, 0F); // Box 198
		bodyModel[7].setRotationPoint(-97F, -40.5F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-1.8F, 0.2F, 0F, -1.5F, 0F, 0F, 1.5F, -0.3F, 1.5F, -3F, 0.2F, -0.5F, 2F, 0.4F, 0F, -4F, 0.17F, 0F, 1F, 0.17F, 1.7F, 0F, 0F, 0F); // Box 199
		bodyModel[8].setRotationPoint(-97F, -40.5F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.4F, 0F, -0.3F, 0F, -0.5F, 2.5F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 2.65F, 0F, 0.5F, -3F, 0F, 0F, 0F); // Box 200
		bodyModel[9].setRotationPoint(-92F, -40.2F, -5.7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 2.5F, -0.4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.2F, 2.65F, 0F, 0F, 0F); // Box 201
		bodyModel[10].setRotationPoint(-92F, -40.2F, 4.7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 37, 7, 22, 0F,0F, 0F, 0.5F, 0F, -1F, 2.5F, 0F, -1F, 2.5F, 0F, 0F, 0.5F, 0F, -1F, -7F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, -1F, -7F); // Box 202
		bodyModel[11].setRotationPoint(-82F, -25F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 37, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 203
		bodyModel[12].setRotationPoint(-82F, -35F, -11.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, -2.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F); // Box 204
		bodyModel[13].setRotationPoint(-82F, -39F, -11.5F);

		bodyModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[14].setRotationPoint(-84F, -47F, -4.5F);
		bodyModel[14].rotateAngleX = -0.38397244F;

		bodyModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[15].setRotationPoint(-75F, -47F, -5F);
		bodyModel[15].rotateAngleX = -0.43633231F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[16].setRotationPoint(-75F, -47F, 5F);
		bodyModel[16].rotateAngleX = 0.43633231F;

		bodyModel[17].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[17].setRotationPoint(-84F, -47F, 4.5F);
		bodyModel[17].rotateAngleX = 0.38397244F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, -1.5F, -0.5F, 5F, -6.5F, -0.5F, 5F, 6.5F, 0F, 0.5F, 1.5F, 0F, 0F, 1.2F, 0F, 0F, 1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.2F); // Box 209
		bodyModel[18].setRotationPoint(-60F, -39F, -11.5F);

		bodyModel[19].addShapeBox(-0.5F, -0.5F, -0.5F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[19].setRotationPoint(-66F, -47F, -5.5F);
		bodyModel[19].rotateAngleX = -0.43633231F;

		bodyModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[20].setRotationPoint(-66F, -47F, 5.5F);
		bodyModel[20].rotateAngleX = 0.43633231F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 37, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F); // Box 212
		bodyModel[21].setRotationPoint(-82F, -35F, 10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 2.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F); // Box 213
		bodyModel[22].setRotationPoint(-82F, -39F, 10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 1.5F, -0.5F, 5F, 6.5F, -0.5F, 5F, -6.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.6F, 0F, 0F, 1.6F, 0F, 0F, 1.2F); // Box 214
		bodyModel[23].setRotationPoint(-60F, -39F, 10.5F);

		bodyModel[24].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[24].setRotationPoint(-63F, -44F, -6.9F);
		bodyModel[24].rotateAngleX = -0.43633231F;

		bodyModel[25].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 6, 1, 0F,0F, 0.2F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, 4F, 0F, -0.2F, 0.25F, 0F, 0F, 2.6F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 216
		bodyModel[25].setRotationPoint(-59F, -44F, -6.9F);

		bodyModel[26].addShapeBox(-0.5F, -0.5F, 0.5F, 7, 6, 1, 0F,0F, -0.2F, 0.25F, 0F, 0F, 4F, 0F, 0F, -4.25F, 0F, 0.2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 2.6F); // Box 217
		bodyModel[26].setRotationPoint(-59F, -44F, 5.9F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[27].setRotationPoint(-63F, -44F, 6.9F);
		bodyModel[27].rotateAngleX = 0.43633231F;

		bodyModel[28].addShapeBox(-0.5F, -0.5F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[28].setRotationPoint(-53F, -44F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 9, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 8.1F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 8.1F); // Box 220
		bodyModel[29].setRotationPoint(-52F, -44F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 31, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 8.5F); // Box 221
		bodyModel[30].setRotationPoint(-45F, -44F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 31, 11, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[31].setRotationPoint(-45F, -35F, -13.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 31, 7, 10, 0F,0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[32].setRotationPoint(-45F, -24F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 81, 7, 10, 0F,0F, 0F, 8.5F, 0F, 3F, 4F, 0F, 3F, 4F, 0F, 0F, 8.5F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 224
		bodyModel[33].setRotationPoint(-14F, -24F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 81, 9, 10, 0F,0F, 0F, 0F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, 0F, 0F, 0F, 8.5F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, 8.5F); // Box 225
		bodyModel[34].setRotationPoint(-14F, -44F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 81, 11, 27, 0F,0F, 0F, 0F, 0F, -2F, -4.5F, 0F, -2F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4.5F, 0F, -3F, -4.5F, 0F, 0F, 0F); // Box 226
		bodyModel[35].setRotationPoint(-14F, -35F, -13.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 25F, 0F, -1F); // Box 227
		bodyModel[36].setRotationPoint(8F, -20F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -1F, -1F, -3F, -0.5F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[37].setRotationPoint(26F, -20F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -1F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[38].setRotationPoint(26F, -20F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 230
		bodyModel[39].setRotationPoint(26F, -19F, -0.5F);
		bodyModel[39].rotateAngleZ = -0.03490659F;

		bodyModel[40].addShapeBox(8F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 231
		bodyModel[40].setRotationPoint(26F, -19F, -0.5F);
		bodyModel[40].rotateAngleZ = -0.03490659F;

		bodyModel[41].addShapeBox(-0.5F, -0.5F, -0.5F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[41].setRotationPoint(-66F, -48.5F, -3.5F);

		bodyModel[42].addShapeBox(-0.5F, -0.5F, -2.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[42].setRotationPoint(-66F, -49F, -3.5F);
		bodyModel[42].rotateAngleX = 0.71558499F;

		bodyModel[43].addShapeBox(-0.5F, -0.5F, 0.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[43].setRotationPoint(-66F, -49F, 3.5F);
		bodyModel[43].rotateAngleX = -0.71558499F;

		bodyModel[44].addShapeBox(-0.5F, -0.5F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[44].setRotationPoint(-75F, -48.9F, 3F);
		bodyModel[44].rotateAngleX = -0.71558499F;

		bodyModel[45].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 236
		bodyModel[45].setRotationPoint(-75F, -48.5F, -3F);

		bodyModel[46].addShapeBox(-0.5F, -0.5F, -2.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[46].setRotationPoint(-75F, -48.9F, -3F);
		bodyModel[46].rotateAngleX = 0.71558499F;

		bodyModel[47].addShapeBox(-0.5F, -0.5F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[47].setRotationPoint(-84F, -48.9F, 2.5F);
		bodyModel[47].rotateAngleX = -0.71558499F;

		bodyModel[48].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 7, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 239
		bodyModel[48].setRotationPoint(-84F, -48.4F, -3F);

		bodyModel[49].addShapeBox(-0.5F, -0.5F, -2.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[49].setRotationPoint(-84F, -48.9F, -2.5F);
		bodyModel[49].rotateAngleX = 0.71558499F;

		bodyModel[50].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 241
		bodyModel[50].setRotationPoint(-60F, -49F, 0F);

		bodyModel[51].addShapeBox(-0.5F, 0F, 3.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 242
		bodyModel[51].setRotationPoint(-60F, -49F, 0F);

		bodyModel[52].addShapeBox(-0.5F, 2F, 6F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[52].setRotationPoint(-60F, -49F, 0F);

		bodyModel[53].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[53].setRotationPoint(-60F, -49F, 0F);

		bodyModel[54].addShapeBox(-0.5F, 0F, -6.5F, 1, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[54].setRotationPoint(-60F, -49F, 0F);

		bodyModel[55].addShapeBox(-0.5F, 2F, -7F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 246
		bodyModel[55].setRotationPoint(-60F, -49F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 25, 5, 4, 0F,-13F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -12F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(-60F, -30F, -15.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,0F, 0F, 0F, -32F, -1F, 0F, -32F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, 2F, 6F, 17F, 1F, 2F, 0F, 0F, 0F); // Box 70
		bodyModel[57].setRotationPoint(-35F, -30F, -15.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 25, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 4.5F, -1F, -2F, 2F); // Box 71
		bodyModel[58].setRotationPoint(-60F, -25F, -15.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,0F, 0F, 0F, 2F, -2F, 6F, 17F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, -1F, 2.5F, -17F, 2F, 6F, 0F, 1F, 4.5F); // Box 72
		bodyModel[59].setRotationPoint(-35F, -25F, -15.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 25, 5, 4, 0F,-12F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -13F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[60].setRotationPoint(-60F, -30F, 11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,0F, 3F, 0F, -32F, 2F, 0F, -32F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 1F, 2F, 2F, 2F, 6F, 0F, 0F, 0F); // Box 82
		bodyModel[61].setRotationPoint(-35F, -30F, 11.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 25, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 2F, 0F, 1F, 4.5F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 83
		bodyModel[62].setRotationPoint(-60F, -25F, 11.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,0F, 0F, 0F, 17F, -1F, 2F, 2F, -2F, 6F, 0F, 0F, 0F, 0F, 1F, 4.5F, -17F, 2F, 6F, -17F, -1F, 2.5F, 0F, 0F, 0F); // Box 84
		bodyModel[63].setRotationPoint(-35F, -25F, 11.5F);

		bodyModel[64].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[64].setRotationPoint(-85F, -46F, -4.5F);
		bodyModel[64].rotateAngleY = 0.13962634F;
		bodyModel[64].rotateAngleZ = -0.75049158F;

		bodyModel[65].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[65].setRotationPoint(-85F, -46F, 4.5F);
		bodyModel[65].rotateAngleY = -0.13962634F;
		bodyModel[65].rotateAngleZ = -0.75049158F;

		bodyModel[66].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[66].setRotationPoint(-86.5F, -47.5F, -2.5F);
		bodyModel[66].rotateAngleZ = -0.78539816F;

		bodyModel[67].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[67].setRotationPoint(-86.5F, -47.5F, -2.7F);
		bodyModel[67].rotateAngleX = 0.68067841F;
		bodyModel[67].rotateAngleY = 1.08210414F;
		bodyModel[67].rotateAngleZ = -0.64577182F;

		bodyModel[68].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[68].setRotationPoint(-86.5F, -47.5F, 2.7F);
		bodyModel[68].rotateAngleX = -0.68067841F;
		bodyModel[68].rotateAngleY = -1.08210414F;
		bodyModel[68].rotateAngleZ = -0.64577182F;

		bodyModel[69].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 136
		bodyModel[69].setRotationPoint(-87F, -47.5F, 0F);
		bodyModel[69].rotateAngleZ = -0.83775804F;

		bodyModel[70].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 10.5F, -0.3F, -0.3F, 10.5F, -0.3F, -0.3F, 10.5F, -0.3F, -0.3F, 10.5F, -0.3F); // Box 137
		bodyModel[70].setRotationPoint(-84F, -63.4F, 0F);

		bodyModel[71].addShapeBox(92F, -0.5F, -0.5F, 1, 1, 1, 0F,92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F); // Box 138
		bodyModel[71].setRotationPoint(-84F, -63F, 0F);
		bodyModel[71].rotateAngleY = -0.2687807F;
		bodyModel[71].rotateAngleZ = -0.03490659F;

		bodyModel[72].addShapeBox(-4.5F, -0.5F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[72].setRotationPoint(-53F, -46.5F, -0.5F);
		bodyModel[72].rotateAngleZ = 0.12217305F;

		bodyModel[73].addShapeBox(1.5F, -0.1F, 0F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 140
		bodyModel[73].setRotationPoint(-53F, -46.5F, -0.5F);
		bodyModel[73].rotateAngleZ = 0.12217305F;

		bodyModel[74].addShapeBox(1.5F, 0.1F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 141
		bodyModel[74].setRotationPoint(-53F, -46.5F, -0.5F);
		bodyModel[74].rotateAngleZ = 0.12217305F;

		bodyModel[75].addShapeBox(-0.5F, 0.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 142
		bodyModel[75].setRotationPoint(-53F, -46.5F, -0.5F);
		bodyModel[75].rotateAngleZ = 0.12217305F;

		bodyModel[76].addShapeBox(-4.5F, 1.5F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 143
		bodyModel[76].setRotationPoint(-53F, -46.5F, -0.5F);
		bodyModel[76].rotateAngleZ = 0.12217305F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 16, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[77].setRotationPoint(-73F, -42F, -3.5F);
		bodyModel[77].rotateAngleZ = -0.19198622F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[78].setRotationPoint(-73F, -47F, -2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[79].setRotationPoint(-81.5F, -31F, -3.5F);

		bodyModel[80].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[80].setRotationPoint(-83F, -38.5F, 2F);

		bodyModel[81].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[81].setRotationPoint(-83F, -38.5F, -2F);

		bodyModel[82].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[82].setRotationPoint(-85F, -36.5F, 0F);

		bodyModel[83].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 911
		bodyModel[83].setRotationPoint(-85F, -35.5F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 912
		bodyModel[84].setRotationPoint(-85.5F, -28F, -1F);

		bodyModel[85].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 913
		bodyModel[85].setRotationPoint(-83F, -36.5F, -2F);

		bodyModel[86].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 907
		bodyModel[86].setRotationPoint(-90F, -29F, -7F);
		bodyModel[86].rotateAngleZ = 0.41887903F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 908
		bodyModel[87].setRotationPoint(-90F, -29F, -7F);
		bodyModel[87].rotateAngleZ = 0.41887903F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 909
		bodyModel[88].setRotationPoint(-90F, -29F, 4F);
		bodyModel[88].rotateAngleZ = 0.41887903F;

		bodyModel[89].addShapeBox(0F, -1F, 0F, 1, 1, 4, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 910
		bodyModel[89].setRotationPoint(-90F, -29F, 4F);
		bodyModel[89].rotateAngleZ = 0.41887903F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[90].setRotationPoint(-91F, -39.5F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F); // Import 
		bodyModel[91].setRotationPoint(-90.2F, -40.28F, -3.45F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[92].setRotationPoint(-90.2F, -40.8F, -3.45F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[93].setRotationPoint(-89.7F, -40.8F, -3.45F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F); // Import 
		bodyModel[94].setRotationPoint(-91.2F, -40.8F, -3.45F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[95].setRotationPoint(-90.5F, -41.1F, -3.45F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[96].setRotationPoint(-90.7F, -38F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[97].setRotationPoint(-90.7F, -37.5F, 3.5F);

		bodyModel[98].addShapeBox(92F, -0.5F, -0.5F, 1, 1, 1, 0F,92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F, 92F, -0.4F, -0.4F); // Box 244
		bodyModel[98].setRotationPoint(-84F, -63F, 0F);
		bodyModel[98].rotateAngleY = 0.2687807F;
		bodyModel[98].rotateAngleZ = -0.03490659F;

		bodyModel[99].addShapeBox(-0.5F, 0F, 3.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 245
		bodyModel[99].setRotationPoint(-60F, -49F, 0F);
		bodyModel[99].rotateAngleY = -1.06465084F;

		bodyModel[100].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 246
		bodyModel[100].setRotationPoint(-60F, -49F, 0F);
		bodyModel[100].rotateAngleY = -1.06465084F;

		bodyModel[101].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[101].setRotationPoint(-60F, -49F, 0F);
		bodyModel[101].rotateAngleY = -1.06465084F;

		bodyModel[102].addShapeBox(-0.5F, 2F, 6F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[102].setRotationPoint(-60F, -49F, 0F);
		bodyModel[102].rotateAngleY = -1.06465084F;

		bodyModel[103].addShapeBox(-0.5F, 0F, -6.5F, 1, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[103].setRotationPoint(-60F, -49F, 0F);
		bodyModel[103].rotateAngleY = -1.06465084F;

		bodyModel[104].addShapeBox(-0.5F, 0F, 3.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 251
		bodyModel[104].setRotationPoint(-60F, -49F, 0F);
		bodyModel[104].rotateAngleY = 1.06465084F;

		bodyModel[105].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[105].setRotationPoint(-60F, -49F, 0F);
		bodyModel[105].rotateAngleY = 1.06465084F;

		bodyModel[106].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[106].setRotationPoint(-60F, -49F, 0F);
		bodyModel[106].rotateAngleY = 1.06465084F;

		bodyModel[107].addShapeBox(-0.5F, 0F, -6.5F, 1, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[107].setRotationPoint(-60F, -49F, 0F);
		bodyModel[107].rotateAngleY = 1.06465084F;

		bodyModel[108].addShapeBox(-0.5F, 2F, -7F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 256
		bodyModel[108].setRotationPoint(-60F, -49F, 0F);
		bodyModel[108].rotateAngleY = 1.06465084F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, -2F, -4.5F, 0F, 0F, -4F, 0F, 0F, 3.1F, 0F, -2F, 3.6F); // Box 257
		bodyModel[109].setRotationPoint(-105F, -27F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[110].setRotationPoint(-105F, -24F, -3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.8F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F); // Box 259
		bodyModel[111].setRotationPoint(-104F, -23.8F, -0.5F);
		bodyModel[111].rotateAngleZ = -0.20943951F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.8F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F); // Box 260
		bodyModel[112].setRotationPoint(-115.8F, -27.5F, -0.5F);
		bodyModel[112].rotateAngleZ = -0.27925268F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 261
		bodyModel[113].setRotationPoint(-91F, -39.5F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F); // Box 262
		bodyModel[114].setRotationPoint(-105F, -33F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, -2F, 3.6F, 0F, 0F, 3.1F, 0F, 0F, -4F, 0F, -2F, -4.5F); // Box 264
		bodyModel[115].setRotationPoint(-105F, -27F, 7F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 187
		noseModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 188
		noseModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		noseModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 191
		noseModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 192
		noseModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 256
		noseModel[6] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 263
		noseModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 265

		noseModel[0].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 187
		noseModel[0].setRotationPoint(-116F, -32F, -4F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, -2F, 0F, 4F, -0.5F, 0F, 4F, -0.5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -3F, 4F, 0F, -3F, 4F, 0F, -2F, 0F); // Box 188
		noseModel[1].setRotationPoint(-116F, -34F, -4F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.5F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, 3F, 0.5F, 0F, 0F); // Box 190
		noseModel[2].setRotationPoint(-121F, -31F, -1F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-2.5F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0.5F, 0F, 0F); // Box 191
		noseModel[3].setRotationPoint(-121F, -33F, -1F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0.5F, 0F, 0F, -2.5F, -0.2F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -2.5F, -0.2F, 0F); // Box 192
		noseModel[4].setRotationPoint(-121F, -29F, -1F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, -2.5F, 1.1F, 0F, 1F, -0.4F, 0F, 1F, -0.5F, 0F, -2.5F, -2F); // Box 256
		noseModel[5].setRotationPoint(-116F, -28F, 3F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F); // Box 263
		noseModel[6].setRotationPoint(-116F, -32F, 3F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -2.5F, -2F, 0F, 1F, -0.5F, 0F, 1F, -0.4F, 0F, -2.5F, 1.1F); // Box 265
		noseModel[7].setRotationPoint(-116F, -28F, -4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 247
		tailModel[1] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 248
		tailModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 249
		tailModel[3] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 250
		tailModel[4] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 251
		tailModel[5] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 252
		tailModel[6] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 118
		tailModel[7] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 120
		tailModel[8] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 121
		tailModel[9] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 122
		tailModel[10] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 126
		tailModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 127
		tailModel[12] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 130
		tailModel[13] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 231
		tailModel[14] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 232
		tailModel[15] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 234
		tailModel[16] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 235
		tailModel[17] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 236
		tailModel[18] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 240
		tailModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 241

		tailModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F); // Box 247
		tailModel[0].setRotationPoint(67F, -33F, -9F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 32, 6, 18, 0F,0F, 0.5F, -6F, 0F, -2.5F, -7.5F, 0F, -2.5F, -7.5F, 0F, 0.5F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 248
		tailModel[1].setRotationPoint(67F, -39F, -9F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 32, 5, 18, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -6.5F, 0F, -3F, -6.5F, 0F, 0F, -6F); // Box 249
		tailModel[2].setRotationPoint(67F, -27F, -9F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 22, 5, 12, 0F,0F, 0F, 0F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -5.5F, 0F, -3F, -5.5F, 0F, 0F, -0.5F); // Box 250
		tailModel[3].setRotationPoint(99F, -33F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0.5F, -4.5F, -9F, -1.5F, -5.5F, -9F, -1.5F, -5.5F, 0F, 0.5F, -4.5F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 1F, -5.5F, 0F, 0F, 0F); // Box 251
		tailModel[4].setRotationPoint(99F, -36F, -6F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0F, -0.5F, 0F, 3F, -5.5F, 0F, 3F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, -9F, -2.5F, -5.5F, -9F, -2.5F, -5.5F, 0F, 0F, -3.5F); // Box 252
		tailModel[5].setRotationPoint(99F, -28F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 12F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 12F, 7F, 0F); // Box 118
		tailModel[6].setRotationPoint(88F, -38.5F, -48F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 120
		tailModel[7].setRotationPoint(88F, -56.5F, -50F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		tailModel[8].setRotationPoint(86F, -44.5F, -50F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		tailModel[9].setRotationPoint(88F, -35.5F, -50F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,-5F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		tailModel[10].setRotationPoint(91F, -60.5F, -50F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -5F, -1F, 0F); // Box 127
		tailModel[11].setRotationPoint(89F, -30.5F, -50F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F,0F, 1.2F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2.6F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 4F, 0F); // Box 130
		tailModel[12].setRotationPoint(100F, -32.5F, -6F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 12, 2, 44, 0F,12F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 7F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		tailModel[13].setRotationPoint(88F, -38.5F, 4F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F,0F, 0.5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 4F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 2.6F, 0F); // Box 232
		tailModel[14].setRotationPoint(100F, -32.5F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 234
		tailModel[15].setRotationPoint(88F, -56.5F, 48F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		tailModel[16].setRotationPoint(86F, -44.5F, 48F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 236
		tailModel[17].setRotationPoint(88F, -35.5F, 48F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,-5F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		tailModel[18].setRotationPoint(91F, -60.5F, 48F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -5F, -1F, 0F); // Box 241
		tailModel[19].setRotationPoint(89F, -30.5F, 48F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 73
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 74
		leftWingModel[2] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 75
		leftWingModel[3] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 76
		leftWingModel[4] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 77
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 78
		leftWingModel[6] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 79
		leftWingModel[7] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 80
		leftWingModel[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 85
		leftWingModel[9] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 86
		leftWingModel[10] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 87
		leftWingModel[11] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 88
		leftWingModel[12] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 89
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 90
		leftWingModel[14] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 91
		leftWingModel[15] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 92
		leftWingModel[16] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 93
		leftWingModel[17] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 94
		leftWingModel[18] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 95
		leftWingModel[19] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 96
		leftWingModel[20] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 97
		leftWingModel[21] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 98
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 99
		leftWingModel[23] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 100
		leftWingModel[24] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 101
		leftWingModel[25] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 102
		leftWingModel[26] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 103
		leftWingModel[27] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 104
		leftWingModel[28] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 105
		leftWingModel[29] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 106
		leftWingModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 107
		leftWingModel[31] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 108
		leftWingModel[32] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 109
		leftWingModel[33] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 110
		leftWingModel[34] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 111
		leftWingModel[35] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 112
		leftWingModel[36] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 113
		leftWingModel[37] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 114
		leftWingModel[38] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 115
		leftWingModel[39] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 116
		leftWingModel[40] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 117
		leftWingModel[41] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 219
		leftWingModel[42] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 220
		leftWingModel[43] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 221
		leftWingModel[44] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 222

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 38, 5, 32, 0F,0F, -0.5F, 0F, -32F, -1F, 0F, -32F, -1F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -2F, 2.5F, 0F, 2F, 2F, 0F, 0F, 0F, 6F); // Box 73
		leftWingModel[0].setRotationPoint(-35F, -30F, -53.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 25, 5, 38, 0F,-13F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -13F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftWingModel[1].setRotationPoint(-60F, -30F, -53.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 38, 5, 32, 0F,0F, 0F, 0F, -2F, -2.5F, 0F, 2F, -2F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, -18F, -0.5F, 0F, -17F, -1F, 4F, 0F, 0F, 6F); // Box 75
		leftWingModel[2].setRotationPoint(-35F, -25F, -53.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 25, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 76
		leftWingModel[3].setRotationPoint(-60F, -25F, -53.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 25, 5, 103, 0F,-22F, 2F, 0F, 3F, 1.5F, 0F, 0F, -6.5F, 0F, -13F, -6.5F, 0F, -16F, -5.5F, 0F, 3F, -5F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 77
		leftWingModel[4].setRotationPoint(-60F, -36F, -156.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 25, 5, 103, 0F,-16F, 7.5F, 0F, 3F, 7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -16.5F, -11.5F, 0F, 3F, -10.5F, 0F, 0F, 4F, 0F, -1F, 2F, 0F); // Box 78
		leftWingModel[5].setRotationPoint(-60F, -29F, -156.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 38, 5, 97, 0F,-3F, 7.5F, 6F, -32F, 7F, 6F, -32F, -1F, 0F, 0F, -0.5F, 0F, -3F, -11F, 6F, -25F, -10.5F, 6F, -2F, 2.5F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[6].setRotationPoint(-35F, -30F, -150.5F);

		leftWingModel[7].addShapeBox(0F, 0F, -100F, 38, 5, 97, 0F,-3F, 18F, 6F, -25F, 17.5F, 6F, -2F, 4.5F, 0F, 0F, 6F, 0F, -3F, -21.5F, 6F, -32F, -21.5F, 6F, -18F, -7.5F, 0F, 0F, -7F, 0F); // Box 80
		leftWingModel[7].setRotationPoint(-35F, -18F, -50.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-2F, 0F, -1F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -1F, -1F, 1.5F, 0F, 0F, 0F, 6F, -0.5F, 0F); // Box 85
		leftWingModel[8].setRotationPoint(-38F, -38F, -164.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-1F, 0F, 0F, -3F, -0.3F, -1F, -1F, -1F, 0F, -2F, -0.5F, 0F, -1F, -1F, 1.5F, 1F, -0.5F, -1F, 6F, 0.5F, 0F, -2F, 0F, 0F); // Box 86
		leftWingModel[9].setRotationPoint(-34F, -38F, -164.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,2F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 0F, 6F, -0.5F, 0F, 1F, -1.2F, -1F, -1F, -1F, 0F, 0F, 0.5F, 0F, 5.5F, -0.5F, 0F); // Box 87
		leftWingModel[10].setRotationPoint(-38F, -37F, -164.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-1F, -1F, 1.5F, 1F, -1.5F, -1F, 6F, -2.5F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -3F, -0.3F, -1F, -1F, 1.5F, 0F, -2F, 1.5F, 0F); // Box 88
		leftWingModel[11].setRotationPoint(-34F, -38F, -164.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 26, 6, 16, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[12].setRotationPoint(-82F, -30F, -53.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 26, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftWingModel[13].setRotationPoint(-82F, -24F, -53.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 26, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -4F); // Box 91
		leftWingModel[14].setRotationPoint(-82F, -15F, -53.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 6, 9, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 92
		leftWingModel[15].setRotationPoint(-88F, -24F, -53.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 93
		leftWingModel[16].setRotationPoint(-91F, -24F, -52.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0.5F, -4F, 0F, 1.5F, -4F, 0F, 1.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
		leftWingModel[17].setRotationPoint(-88F, -28F, -53.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, -0.5F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 95
		leftWingModel[18].setRotationPoint(-91F, -28F, -52.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, -0.5F, -3F); // Box 96
		leftWingModel[19].setRotationPoint(-91F, -20F, -52.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -4F); // Box 97
		leftWingModel[20].setRotationPoint(-86F, -15F, -51.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 98
		leftWingModel[21].setRotationPoint(-88F, -13F, -47.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 99
		leftWingModel[22].setRotationPoint(-88F, -15F, -51.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -2F); // Box 100
		leftWingModel[23].setRotationPoint(-88F, -15F, -43.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F); // Box 101
		leftWingModel[24].setRotationPoint(-95F, -24F, -50F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F); // Box 102
		leftWingModel[25].setRotationPoint(-95F, -27F, -50F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -3F); // Box 103
		leftWingModel[26].setRotationPoint(-95F, -21F, -50F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 104
		leftWingModel[27].setRotationPoint(-99F, -23.5F, -50F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,-2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 105
		leftWingModel[28].setRotationPoint(-99F, -26.5F, -50F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -3F); // Box 106
		leftWingModel[29].setRotationPoint(-99F, -20.5F, -50F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.8F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.3F, -1.3F, -0.8F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.3F, -1.3F); // Box 107
		leftWingModel[30].setRotationPoint(-101F, -23.5F, -47F);

		leftWingModel[31].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[31].setRotationPoint(-82F, -24F, -52.5F);
		leftWingModel[31].rotateAngleY = -0.80285146F;
		leftWingModel[31].rotateAngleZ = 0.26179939F;

		leftWingModel[32].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftWingModel[32].setRotationPoint(-77F, -24F, -52.5F);
		leftWingModel[32].rotateAngleY = -0.80285146F;
		leftWingModel[32].rotateAngleZ = 0.26179939F;

		leftWingModel[33].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[33].setRotationPoint(-71F, -24F, -52.5F);
		leftWingModel[33].rotateAngleY = -0.80285146F;
		leftWingModel[33].rotateAngleZ = 0.26179939F;

		leftWingModel[34].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[34].setRotationPoint(-65F, -24F, -52.5F);
		leftWingModel[34].rotateAngleY = -0.80285146F;
		leftWingModel[34].rotateAngleZ = 0.26179939F;

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 18, 6, 16, 0F,0F, 0F, -4F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftWingModel[35].setRotationPoint(-56F, -30F, -53.5F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 37, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[36].setRotationPoint(-56F, -24F, -53.5F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 37, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 114
		leftWingModel[37].setRotationPoint(-56F, -15F, -53.5F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 26, 2, 12, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -11F, 1F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, -11F, 1F, -4F); // Box 115
		leftWingModel[38].setRotationPoint(-82F, -11F, -51.5F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 25, 9, 16, 0F,0F, 0F, 0F, 0F, -3F, -7.5F, 0F, -3F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7.5F, 0F, -1F, -7.5F, 0F, 0F, 0F); // Box 116
		leftWingModel[39].setRotationPoint(-19F, -24F, -53.5F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 25, 4, 16, 0F,0F, 0F, 0F, 0F, 1F, -7.5F, 0F, 1F, -7.5F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, -1F, -5.5F, -10F, -1F, -5.5F, 0F, 0F, -2F); // Box 117
		leftWingModel[40].setRotationPoint(-19F, -15F, -53.5F);

		leftWingModel[41].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[41].setRotationPoint(-65F, -24F, -38.5F);
		leftWingModel[41].rotateAngleY = 0.80285146F;
		leftWingModel[41].rotateAngleZ = 0.26179939F;

		leftWingModel[42].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		leftWingModel[42].setRotationPoint(-71F, -24F, -38.5F);
		leftWingModel[42].rotateAngleY = 0.80285146F;
		leftWingModel[42].rotateAngleZ = 0.26179939F;

		leftWingModel[43].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftWingModel[43].setRotationPoint(-77F, -24F, -38.5F);
		leftWingModel[43].rotateAngleY = 0.80285146F;
		leftWingModel[43].rotateAngleZ = 0.26179939F;

		leftWingModel[44].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftWingModel[44].setRotationPoint(-82F, -24F, -38.5F);
		leftWingModel[44].rotateAngleY = 0.80285146F;
		leftWingModel[44].rotateAngleZ = 0.26179939F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 177
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 178
		rightWingModel[2] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 179
		rightWingModel[3] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 180
		rightWingModel[4] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 181
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 182
		rightWingModel[6] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 183
		rightWingModel[7] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 184
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 185
		rightWingModel[9] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 186
		rightWingModel[10] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 187
		rightWingModel[11] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 188
		rightWingModel[12] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 189
		rightWingModel[13] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 190
		rightWingModel[14] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 191
		rightWingModel[15] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 192
		rightWingModel[16] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 193
		rightWingModel[17] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 194
		rightWingModel[18] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 195
		rightWingModel[19] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 196
		rightWingModel[20] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 197
		rightWingModel[21] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 198
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 199
		rightWingModel[23] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 200
		rightWingModel[24] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 201
		rightWingModel[25] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 202
		rightWingModel[26] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 203
		rightWingModel[27] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 204
		rightWingModel[28] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 205
		rightWingModel[29] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 206
		rightWingModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 207
		rightWingModel[31] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 208
		rightWingModel[32] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 209
		rightWingModel[33] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 210
		rightWingModel[34] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 211
		rightWingModel[35] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 212
		rightWingModel[36] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 213
		rightWingModel[37] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 223
		rightWingModel[38] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 224
		rightWingModel[39] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 225
		rightWingModel[40] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 226
		rightWingModel[41] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 227
		rightWingModel[42] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 228
		rightWingModel[43] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 229
		rightWingModel[44] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 230

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 38, 5, 32, 0F,0F, 0F, 6F, -32F, -1F, 6F, -32F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 6F, 2F, 2F, 0F, -2F, 2.5F, 0F, 0F, 0F, 0F); // Box 177
		rightWingModel[0].setRotationPoint(-35F, -30F, 21.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 25, 5, 38, 0F,-13F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -13F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightWingModel[1].setRotationPoint(-60F, -30F, 15.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 38, 5, 32, 0F,0F, 0F, 6F, 2F, -2F, 0F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -17F, -1F, 4F, -18F, -0.5F, 0F, 0F, 0F, 0F); // Box 179
		rightWingModel[2].setRotationPoint(-35F, -25F, 21.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 25, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 180
		rightWingModel[3].setRotationPoint(-60F, -25F, 15.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 25, 5, 103, 0F,-13F, -6.5F, 0F, 0F, -6.5F, 0F, 3F, 1.5F, 0F, -22F, 2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 3F, -5F, 0F, -16F, -5.5F, 0F); // Box 181
		rightWingModel[4].setRotationPoint(-60F, -36F, 53.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 25, 5, 103, 0F,0F, -4F, 0F, 0F, -4F, 0F, 3F, 7F, 0F, -16F, 7.5F, 0F, -1F, 2F, 0F, 0F, 4F, 0F, 3F, -10.5F, 0F, -16.5F, -11.5F, 0F); // Box 182
		rightWingModel[5].setRotationPoint(-60F, -29F, 53.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 38, 5, 97, 0F,0F, -0.5F, 0F, -32F, -1F, 0F, -32F, 7F, 6F, -3F, 7.5F, 6F, 0F, 0F, 0F, -2F, 2.5F, 0F, -25F, -10.5F, 6F, -3F, -11F, 6F); // Box 183
		rightWingModel[6].setRotationPoint(-35F, -30F, 53.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 100F, 38, 5, 97, 0F,0F, 6F, 0F, -2F, 4.5F, 0F, -25F, 17.5F, 6F, -3F, 18F, 6F, 0F, -7F, 0F, -18F, -7.5F, 0F, -32F, -21.5F, 6F, -3F, -21.5F, 6F); // Box 184
		rightWingModel[7].setRotationPoint(-35F, -18F, -46.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 6F, -0.5F, 0F, 0F, 0F, 0F, -1F, -1F, 1.5F, 2F, -1F, 0F); // Box 185
		rightWingModel[8].setRotationPoint(-38F, -38F, 156.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-2F, -0.5F, 0F, -1F, -1F, 0F, -3F, -0.3F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 6F, 0.5F, 0F, 1F, -0.5F, -1F, -1F, -1F, 1.5F); // Box 186
		rightWingModel[9].setRotationPoint(-34F, -38F, 156.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,6F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, 2F, 0F, 0F, 5.5F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 1F, -1.2F, -1F); // Box 187
		rightWingModel[10].setRotationPoint(-38F, -37F, 156.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-2F, -2F, 0F, 6F, -2.5F, 0F, 1F, -1.5F, -1F, -1F, -1F, 1.5F, -2F, 1.5F, 0F, -1F, 1.5F, 0F, -3F, -0.3F, -1F, -1F, 0F, 0F); // Box 188
		rightWingModel[11].setRotationPoint(-34F, -38F, 156.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 26, 6, 16, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		rightWingModel[12].setRotationPoint(-82F, -30F, 37.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 26, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightWingModel[13].setRotationPoint(-82F, -24F, 37.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 26, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -4F); // Box 191
		rightWingModel[14].setRotationPoint(-82F, -15F, 37.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 6, 9, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 192
		rightWingModel[15].setRotationPoint(-88F, -24F, 37.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 193
		rightWingModel[16].setRotationPoint(-91F, -24F, 38.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0.5F, -4F, 0F, 1.5F, -4F, 0F, 1.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 194
		rightWingModel[17].setRotationPoint(-88F, -28F, 37.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, -0.5F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 195
		rightWingModel[18].setRotationPoint(-91F, -28F, 38.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.5F, -3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, -0.5F, -3F); // Box 196
		rightWingModel[19].setRotationPoint(-91F, -20F, 38.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -4F); // Box 197
		rightWingModel[20].setRotationPoint(-86F, -15F, 39.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 198
		rightWingModel[21].setRotationPoint(-88F, -13F, 43.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -2F); // Box 199
		rightWingModel[22].setRotationPoint(-88F, -15F, 47.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 200
		rightWingModel[23].setRotationPoint(-88F, -15F, 39.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F); // Box 201
		rightWingModel[24].setRotationPoint(-95F, -24F, 41F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F); // Box 202
		rightWingModel[25].setRotationPoint(-95F, -27F, 41F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -3F); // Box 203
		rightWingModel[26].setRotationPoint(-95F, -21F, 41F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 204
		rightWingModel[27].setRotationPoint(-99F, -23.5F, 41F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,-2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 205
		rightWingModel[28].setRotationPoint(-99F, -26.5F, 41F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -3F); // Box 206
		rightWingModel[29].setRotationPoint(-99F, -20.5F, 41F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.8F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.3F, -1.3F, -0.8F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -1.3F, -1.3F); // Box 207
		rightWingModel[30].setRotationPoint(-101F, -23.5F, 44F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 18, 6, 16, 0F,0F, 0F, -4F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightWingModel[31].setRotationPoint(-56F, -30F, 37.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 37, 9, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightWingModel[32].setRotationPoint(-56F, -24F, 37.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 37, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 210
		rightWingModel[33].setRotationPoint(-56F, -15F, 37.5F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 26, 2, 12, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -11F, 1F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, -11F, 1F, -4F); // Box 211
		rightWingModel[34].setRotationPoint(-82F, -11F, 39.5F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 25, 9, 16, 0F,0F, 0F, 0F, 0F, -3F, -7.5F, 0F, -3F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7.5F, 0F, -1F, -7.5F, 0F, 0F, 0F); // Box 212
		rightWingModel[35].setRotationPoint(-19F, -24F, 37.5F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 25, 4, 16, 0F,0F, 0F, 0F, 0F, 1F, -7.5F, 0F, 1F, -7.5F, 0F, 0F, 0F, 0F, 0F, -2F, -10F, -1F, -5.5F, -10F, -1F, -5.5F, 0F, 0F, -2F); // Box 213
		rightWingModel[36].setRotationPoint(-19F, -15F, 37.5F);

		rightWingModel[37].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightWingModel[37].setRotationPoint(-65F, -24F, 52.5F);
		rightWingModel[37].rotateAngleY = 0.80285146F;
		rightWingModel[37].rotateAngleZ = 0.26179939F;

		rightWingModel[38].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightWingModel[38].setRotationPoint(-71F, -24F, 52.5F);
		rightWingModel[38].rotateAngleY = 0.80285146F;
		rightWingModel[38].rotateAngleZ = 0.26179939F;

		rightWingModel[39].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		rightWingModel[39].setRotationPoint(-77F, -24F, 52.5F);
		rightWingModel[39].rotateAngleY = 0.80285146F;
		rightWingModel[39].rotateAngleZ = 0.26179939F;

		rightWingModel[40].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightWingModel[40].setRotationPoint(-82F, -24F, 52.5F);
		rightWingModel[40].rotateAngleY = 0.80285146F;
		rightWingModel[40].rotateAngleZ = 0.26179939F;

		rightWingModel[41].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightWingModel[41].setRotationPoint(-82F, -24F, 38.5F);
		rightWingModel[41].rotateAngleY = -0.80285146F;
		rightWingModel[41].rotateAngleZ = 0.26179939F;

		rightWingModel[42].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightWingModel[42].setRotationPoint(-77F, -24F, 38.5F);
		rightWingModel[42].rotateAngleY = -0.80285146F;
		rightWingModel[42].rotateAngleZ = 0.26179939F;

		rightWingModel[43].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingModel[43].setRotationPoint(-71F, -24F, 38.5F);
		rightWingModel[43].rotateAngleY = -0.80285146F;
		rightWingModel[43].rotateAngleZ = 0.26179939F;

		rightWingModel[44].addShapeBox(0F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightWingModel[44].setRotationPoint(-65F, -24F, 38.5F);
		rightWingModel[44].rotateAngleY = -0.80285146F;
		rightWingModel[44].rotateAngleZ = 0.26179939F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 123
		yawFlapModel[1] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 124
		yawFlapModel[2] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 125
		yawFlapModel[3] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 128
		yawFlapModel[4] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 129
		yawFlapModel[5] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 237
		yawFlapModel[6] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 238
		yawFlapModel[7] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 239
		yawFlapModel[8] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 242
		yawFlapModel[9] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 243

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 12, 10, 2, 0F,0F, 0F, -0.2F, -4.5F, 0F, -0.2F, -4.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 123
		yawFlapModel[0].setRotationPoint(100F, -56.5F, -49F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 12, 10, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 124
		yawFlapModel[1].setRotationPoint(100F, -46.5F, -49F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 12, 6, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 125
		yawFlapModel[2].setRotationPoint(100F, -36.5F, -49F);

		yawFlapModel[3].addShapeBox(0F, 0F, -1F, 8, 3, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0.5F, -0.2F, -2F, -1F, -0.2F, -2F, -1F, -0.2F, -3F, 0.5F, -0.2F); // Box 128
		yawFlapModel[3].setRotationPoint(100F, -30.5F, -49F);

		yawFlapModel[4].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,-3F, 0F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 129
		yawFlapModel[4].setRotationPoint(100F, -60.5F, -49F);

		yawFlapModel[5].addShapeBox(0F, 0F, -1F, 12, 10, 2, 0F,0F, 0F, -0.2F, -4.5F, 0F, -0.2F, -4.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 237
		yawFlapModel[5].setRotationPoint(100F, -56.5F, 49F);

		yawFlapModel[6].addShapeBox(0F, 0F, -1F, 12, 10, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238
		yawFlapModel[6].setRotationPoint(100F, -46.5F, 49F);

		yawFlapModel[7].addShapeBox(0F, 0F, -1F, 12, 6, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -4F, 0F, -0.2F, -4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 239
		yawFlapModel[7].setRotationPoint(100F, -36.5F, 49F);

		yawFlapModel[8].addShapeBox(0F, 0F, -1F, 8, 3, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0.5F, -0.2F, -2F, -1F, -0.2F, -2F, -1F, -0.2F, -3F, 0.5F, -0.2F); // Box 242
		yawFlapModel[8].setRotationPoint(100F, -30.5F, 49F);

		yawFlapModel[9].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,-3F, 0F, -0.2F, -1.5F, -1.5F, -0.2F, -1.5F, -1.5F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 243
		yawFlapModel[9].setRotationPoint(100F, -60.5F, 49F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 119

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, -20F, 12, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 119
		pitchFlapLeftModel[0].setRotationPoint(100F, -34.5F, -26F);
		pitchFlapLeftModel[0].rotateAngleX = -0.13962634F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 233

		pitchFlapRightModel[0].addShapeBox(0F, -1F, -20F, 12, 2, 40, 0F,0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 233
		pitchFlapRightModel[0].setRotationPoint(100F, -34.5F, 26F);
		pitchFlapRightModel[0].rotateAngleX = 0.13962634F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 170
		tailWheelModel[1] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 171
		tailWheelModel[2] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 172
		tailWheelModel[3] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 173
		tailWheelModel[4] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 174
		tailWheelModel[5] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 175
		tailWheelModel[6] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 176

		tailWheelModel[0].addShapeBox(0F, 0F, -0.5F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		tailWheelModel[0].setRotationPoint(79F, -25F, -2F);
		tailWheelModel[0].rotateAngleX = -0.48869219F;
		tailWheelModel[0].rotateAngleZ = 0.08726646F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		tailWheelModel[1].setRotationPoint(87F, -22F, -1F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 172
		tailWheelModel[2].setRotationPoint(87F, -18F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		tailWheelModel[3].setRotationPoint(87F, -20F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		tailWheelModel[4].setRotationPoint(89F, -25F, -2F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		tailWheelModel[5].setRotationPoint(89F, -25F, 1F);

		tailWheelModel[6].addShapeBox(0F, 0F, -0.5F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		tailWheelModel[6].setRotationPoint(79F, -25F, 2F);
		tailWheelModel[6].rotateAngleX = 0.48869219F;
		tailWheelModel[6].rotateAngleZ = 0.08726646F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 165
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 166
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 167
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 168
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 169

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		leftWingWheelModel[0].setRotationPoint(-58F, -4F, -48.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftWingWheelModel[1].setRotationPoint(-58F, 0F, -48.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 167
		leftWingWheelModel[2].setRotationPoint(-58F, 6F, -48.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		leftWingWheelModel[3].setRotationPoint(-52.5F, -11F, -49.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		leftWingWheelModel[4].setRotationPoint(-52.5F, -11F, -42.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 214
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 215
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 216
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 217
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 218

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightWingWheelModel[0].setRotationPoint(-58F, -4F, 42.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightWingWheelModel[1].setRotationPoint(-58F, 0F, 42.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 216
		rightWingWheelModel[2].setRotationPoint(-58F, 6F, 42.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightWingWheelModel[3].setRotationPoint(-52.5F, -11F, 48.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingWheelModel[4].setRotationPoint(-52.5F, -11F, 41.5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-93F, -22F, -45.5F);
		propellerModels[1] = makeProp2(-93F, -22F, 45.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[0].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[1].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[2].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 6, 264, textureX, textureY);
		prop[0].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[1].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[2].addBox(-1F, -24F, -1.5F, 2, 24, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}