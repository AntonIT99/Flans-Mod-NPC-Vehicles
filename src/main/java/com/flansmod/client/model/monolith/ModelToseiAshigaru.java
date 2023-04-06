//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ToseiAshigaru
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelToseiAshigaru extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelToseiAshigaru() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];
		leftLegModel = new ModelRendererTurbo[11];
		rightLegModel = new ModelRendererTurbo[11];
		skirtFrontModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 54
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 55
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 56
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 86
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 87
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 108
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 141
		bodyModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 142
		bodyModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 143
		bodyModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 144
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 145
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 146
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 147
		bodyModel[14] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 148
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 149
		bodyModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 150
		bodyModel[17] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 151
		bodyModel[18] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 152
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 153
		bodyModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 168
		bodyModel[21] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 169
		bodyModel[22] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 170
		bodyModel[23] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 172
		bodyModel[24] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 173
		bodyModel[25] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 174
		bodyModel[26] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 175
		bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 176
		bodyModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 177
		bodyModel[29] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 216
		bodyModel[30] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 218
		bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 221
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 222
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 223
		bodyModel[34] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 224
		bodyModel[35] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 225
		bodyModel[36] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 226
		bodyModel[37] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 227
		bodyModel[38] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 228
		bodyModel[39] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 229
		bodyModel[40] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 233
		bodyModel[41] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 234
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 235
		bodyModel[43] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 236
		bodyModel[44] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 237
		bodyModel[45] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 238
		bodyModel[46] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 239
		bodyModel[47] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 240
		bodyModel[48] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 241
		bodyModel[49] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 242
		bodyModel[50] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 243
		bodyModel[51] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 244
		bodyModel[52] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 245
		bodyModel[53] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 246
		bodyModel[54] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 247
		bodyModel[55] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 248
		bodyModel[56] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 249
		bodyModel[57] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 250
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 251
		bodyModel[59] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 252
		bodyModel[60] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 253
		bodyModel[61] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 254
		bodyModel[62] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 255
		bodyModel[63] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 256
		bodyModel[64] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 257
		bodyModel[65] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 258
		bodyModel[66] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 259
		bodyModel[67] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 260
		bodyModel[68] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 268
		bodyModel[69] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 269
		bodyModel[70] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 270
		bodyModel[71] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 271
		bodyModel[72] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 273
		bodyModel[73] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 274

		bodyModel[0].addShapeBox(-3.5F, 0.5F, -2.5F, 2, 1, 5, 0F,0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.5F, 0.5F, 0.2F, -1F, 0.5F, 0.2F, -1F, 0.7F, 0.2F, -0.5F, 0.7F, 0.2F); // Box 47
		bodyModel[0].setRotationPoint(0F, -1F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.4F, -2.9F, 8, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 54
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0.9F, -2.8F, 8, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0.4F, -2.8F, 2, 1, 1, 0F,-0.7F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.3F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 56
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1.5F, 0.5F, -2.5F, 2, 1, 5, 0F,-2.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, -2.2F, 0.2F, 0F, -1F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.7F, 0.2F, -1F, 0.7F, 0.2F); // Box 86
		bodyModel[4].setRotationPoint(0F, -1F, 0F);

		bodyModel[5].addShapeBox(2F, 0.4F, -2.8F, 2, 1, 1, 0F,-0.5F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.5F, -0.3F, 0F); // Box 87
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 0.4F, 1.95F, 8, 1, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 108
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 4F, -3.1F, 8, 1, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 141
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 3F, -3F, 8, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 142
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 2F, -2.9F, 8, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 143
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 5F, -3.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4.5F, 6F, -3.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 7F, -3.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 8F, -3.1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 9F, -3F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-5.5F, 5F, -3F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F); // Box 149
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-5.5F, 6F, -3F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.55F, 0F, 0F); // Box 150
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-5.5F, 7F, -3F, 1, 1, 6, 0F,-0.55F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.55F, 0F, -0.1F); // Box 151
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5.5F, 8F, -3F, 1, 1, 6, 0F,-0.55F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.55F, 0F, -0.1F, -0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.2F); // Box 152
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5.5F, 9F, -3F, 1, 1, 6, 0F,-0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.2F, -0.7F, -0.3F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, -0.3F, -0.4F); // Box 153
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5.4F, 10.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 168
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-5.8F, 11.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 169
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-6.2F, 12.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 170
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-6.6F, 13.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 172
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-5.6F, 10.6F, 0.6F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.8F, -0.4F, -1.1F, -1F, -0.4F, -1.1F, -1F, -0.4F, 0.5F, 0.8F, -0.4F, 0.5F); // Box 173
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5.6F, 10.6F, -1.6F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.8F, -0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, -1.1F, 0.8F, -0.4F, -1.1F); // Box 174
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.5F, 6.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 175
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-5.5F, 6.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 176
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-9.5F, 9.5F, -6F, 19, 1, 12, 0F,-4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F); // Box 177
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.5F, 3.5F, -2.5F, 1, 2, 2, 0F,-0.3F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 216
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.5F, 3.5F, 0.5F, 1, 2, 2, 0F,0.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 218
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-5.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 221
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-5.5F, 7.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 222
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-5.45F, 8.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F); // Box 223
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4.5F, 5.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 224
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.5F, 7.5F, -3.2F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 225
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.5F, 8.5F, -3.1F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 226
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.5F, 4.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 227
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.5F, 3.5F, -3.2F, 9, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 228
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.5F, 2.5F, -3.1F, 9, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 229
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 2F, 1.9F, 8, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 233
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, 3F, 2F, 8, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F); // Box 234
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 4F, 2.1F, 8, 1, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 235
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.5F, 5F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.5F, 6F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.5F, 7F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 238
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.5F, 8F, 2.1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 239
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4.5F, 9F, 2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 1F, 1.9F, 8, 1, 1, 0F,-0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 241
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3.5F, 3.5F, 0.5F, 1, 2, 2, 0F,0F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, -0.3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(3.5F, 3.5F, -2.5F, 1, 2, 2, 0F,0F, 1F, 0F, -0.3F, 1F, 0F, 0.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(4.5F, 5F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F); // Box 244
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.5F, 6F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.2F); // Box 245
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(4.5F, 7F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0F, 0F, 0.1F); // Box 246
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(4.5F, 8F, -3F, 1, 1, 6, 0F,0F, 0F, 0.1F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, 0F); // Box 247
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(4.5F, 9F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, 0F, 0F, -0.2F); // Box 248
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 249
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(4.5F, 6.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 250
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(4.5F, 7.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 251
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4.45F, 8.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F); // Box 252
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4.5F, 2.5F, 2.1F, 9, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 253
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4.5F, 3.5F, 2.2F, 9, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 254
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4.5F, 4.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 255
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4.5F, 5.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 256
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-4.5F, 6.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 257
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4.5F, 7.5F, 2.15F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 258
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.5F, 8.5F, 2.05F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 259
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.5F, 1.5F, 2F, 9, 1, 1, 0F,-0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 260
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(4.4F, 10.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 268
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(4.8F, 11.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 269
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(5.2F, 12.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 270
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(5.6F, 13.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 271
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(4.6F, 10.6F, -1.6F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.5F, -0.4F, 0.5F, 0.8F, -0.4F, 0.5F, 0.8F, -0.4F, -1.1F, -1.5F, -0.4F, -1.1F); // Box 273
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(4.6F, 10.6F, 0.6F, 1, 4, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.5F, -0.4F, -1.1F, 0.8F, -0.4F, -1.1F, 0.8F, -0.4F, 0.5F, -1.5F, -0.4F, 0.5F); // Box 274
		bodyModel[73].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 275
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 276
		leftLegModel[2] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 277
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 278
		leftLegModel[4] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 280
		leftLegModel[5] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 329
		leftLegModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 331
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 333
		leftLegModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 335
		leftLegModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 337
		leftLegModel[10] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 340

		leftLegModel[0].addShapeBox(-2F, -1.4F, -3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 275
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.7F, -0.4F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 276
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.35F, 0.6F, -3.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 277
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1F, 1.6F, -4.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 278
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(1F, -1.4F, -3F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.1F, -0.4F, 1F, 0.5F, -0.4F, 1F, 0.5F, -0.4F, -2F, -1.1F, -0.4F, -2F); // Box 280
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1F, 1.6F, 3.2F, 5, 1, 1, 0F,0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.7F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F); // Box 329
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.35F, 0.6F, 2.8F, 5, 1, 1, 0F,0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.6F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F); // Box 331
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.7F, -0.4F, 2.4F, 5, 1, 1, 0F,0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.3F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F); // Box 333
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, -1.4F, 2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 335
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(1F, -1.4F, 2F, 1, 4, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.1F, -0.4F, -1F, 0.5F, -0.4F, -1F, 0.5F, -0.4F, 1F, -1.1F, -0.4F, 1F); // Box 337
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-1F, -1.4F, 2F, 1, 4, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.1F, -0.4F, -1F, 0.5F, -0.4F, -1F, 0.5F, -0.4F, 1F, -1.1F, -0.4F, 1F); // Box 340
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 161
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 162
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 163
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 165
		rightLegModel[4] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 167
		rightLegModel[5] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 330
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 332
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 334
		rightLegModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 336
		rightLegModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 338
		rightLegModel[10] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 339

		rightLegModel[0].addShapeBox(-3.65F, 0.6F, -3.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 161
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.3F, -0.4F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 162
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3F, -1.4F, -3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 163
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-4F, 1.6F, -4.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 165
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, -1.4F, -3F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.5F, -0.4F, 1F, -1.1F, -0.4F, 1F, -1.1F, -0.4F, -2F, 0.5F, -0.4F, -2F); // Box 167
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-4F, 1.6F, 3.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 330
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3.65F, 0.6F, 2.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 332
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3.3F, -0.4F, 2.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 334
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3F, -1.4F, 2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 336
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, -1.4F, 2F, 1, 4, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.5F, -0.4F, -1F, -1.1F, -0.4F, -1F, -1.1F, -0.4F, 1F, 0.5F, -0.4F, 1F); // Box 338
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(0F, -1.4F, 2F, 1, 4, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.5F, -0.4F, -1F, -1.1F, -0.4F, -1F, -1.1F, -0.4F, 1F, 0.5F, -0.4F, 1F); // Box 339
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 154
		skirtFrontModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 155
		skirtFrontModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 156
		skirtFrontModel[3] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 157
		skirtFrontModel[4] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 159
		skirtFrontModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 160

		skirtFrontModel[0].addShapeBox(-2.5F, -1.2F, -3.5F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 154
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-2.5F, -0.199999999999999F, -3.9F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 155
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-2.5F, 0.800000000000001F, -4.3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 156
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-2.5F, 1.8F, -4.7F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 157
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-1.5F, -1.2F, -3.5F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, -2F); // Box 159
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[5].addShapeBox(0.5F, -1.2F, -3.5F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, -2F); // Box 160
		skirtFrontModel[5].setRotationPoint(0F, 0F, 0F);
	}
}