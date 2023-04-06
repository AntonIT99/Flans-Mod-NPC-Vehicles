//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ToseiGusoku
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelToseiGusoku extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelToseiGusoku() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];
		leftArmModel = new ModelRendererTurbo[30];
		rightArmModel = new ModelRendererTurbo[30];
		leftLegModel = new ModelRendererTurbo[36];
		rightLegModel = new ModelRendererTurbo[36];
		skirtFrontModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
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
		bodyModel[23] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 171
		bodyModel[24] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 172
		bodyModel[25] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 173
		bodyModel[26] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 174
		bodyModel[27] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 175
		bodyModel[28] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 176
		bodyModel[29] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 177
		bodyModel[30] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 216
		bodyModel[31] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 218
		bodyModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 221
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 222
		bodyModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 223
		bodyModel[35] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 224
		bodyModel[36] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 225
		bodyModel[37] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 226
		bodyModel[38] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 227
		bodyModel[39] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 228
		bodyModel[40] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 229
		bodyModel[41] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 233
		bodyModel[42] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 234
		bodyModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 235
		bodyModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 236
		bodyModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 237
		bodyModel[46] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 238
		bodyModel[47] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 239
		bodyModel[48] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 240
		bodyModel[49] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 241
		bodyModel[50] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 242
		bodyModel[51] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 243
		bodyModel[52] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 244
		bodyModel[53] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 245
		bodyModel[54] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 246
		bodyModel[55] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 247
		bodyModel[56] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 248
		bodyModel[57] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 249
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 250
		bodyModel[59] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 251
		bodyModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 252
		bodyModel[61] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 253
		bodyModel[62] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 254
		bodyModel[63] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 255
		bodyModel[64] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 256
		bodyModel[65] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 257
		bodyModel[66] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 258
		bodyModel[67] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 259
		bodyModel[68] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 260
		bodyModel[69] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 268
		bodyModel[70] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 269
		bodyModel[71] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 270
		bodyModel[72] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 271
		bodyModel[73] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 272
		bodyModel[74] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 273
		bodyModel[75] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 274

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

		bodyModel[23].addShapeBox(-7F, 14.5F, -4.5F, 1, 1, 9, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 171
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-6.6F, 13.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 172
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-5.6F, 10.6F, 0.6F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 1.3F, -0.4F, -1.1F, -2F, -0.4F, -1.1F, -2F, -0.4F, 0.5F, 1.3F, -0.4F, 0.5F); // Box 173
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-5.6F, 10.6F, -1.6F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 1.3F, -0.4F, 0.5F, -2F, -0.4F, 0.5F, -2F, -0.4F, -1.1F, 1.3F, -0.4F, -1.1F); // Box 174
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.5F, 6.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 175
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5.5F, 6.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 176
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-9.5F, 9.5F, -6F, 19, 1, 12, 0F,-4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.6F, -0.2F, -3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F, -4.8F, 0.2F, -3.3F); // Box 177
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.5F, 3.5F, -2.5F, 1, 2, 2, 0F,-0.3F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 216
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4.5F, 3.5F, 0.5F, 1, 2, 2, 0F,0.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, -0.3F, 1F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 218
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-5.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 221
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-5.5F, 7.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 222
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-5.45F, 8.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F); // Box 223
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.5F, 5.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 224
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.5F, 7.5F, -3.2F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 225
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.5F, 8.5F, -3.1F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 226
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.5F, 4.5F, -3.25F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 227
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.5F, 3.5F, -3.2F, 9, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 228
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 2.5F, -3.1F, 9, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 229
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, 2F, 1.9F, 8, 1, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F); // Box 233
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 3F, 2F, 8, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F); // Box 234
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 4F, 2.1F, 8, 1, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 235
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.5F, 5F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.5F, 6F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.5F, 7F, 2.2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 238
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4.5F, 8F, 2.1F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 239
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4.5F, 9F, 2F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 1F, 1.9F, 8, 1, 1, 0F,-0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.2F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 241
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(3.5F, 3.5F, 0.5F, 1, 2, 2, 0F,0F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, -0.3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(3.5F, 3.5F, -2.5F, 1, 2, 2, 0F,0F, 1F, 0F, -0.3F, 1F, 0F, 0.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 243
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.5F, 5F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F); // Box 244
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(4.5F, 6F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.2F); // Box 245
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(4.5F, 7F, -3F, 1, 1, 6, 0F,0F, 0F, 0.2F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0F, 0F, 0.1F); // Box 246
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(4.5F, 8F, -3F, 1, 1, 6, 0F,0F, 0F, 0.1F, -0.55F, 0F, -0.1F, -0.55F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, 0F); // Box 247
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.5F, 9F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.7F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, 0F, 0F, -0.2F); // Box 248
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(4.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 249
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(4.5F, 6.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 250
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4.5F, 7.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F, -0.48F, -0.4F, 0F); // Box 251
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(4.45F, 8.5F, -3F, 1, 1, 6, 0F,-0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F, -0.48F, -0.4F, -0.2F); // Box 252
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4.5F, 2.5F, 2.1F, 9, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 253
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4.5F, 3.5F, 2.2F, 9, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 254
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4.5F, 4.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 255
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-4.5F, 5.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 256
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4.5F, 6.5F, 2.3F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 257
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4.5F, 7.5F, 2.15F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 258
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.5F, 8.5F, 2.05F, 9, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 259
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4.5F, 1.5F, 2F, 9, 1, 1, 0F,-0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 260
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(4.4F, 10.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 268
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(4.8F, 11.5F, -2.5F, 1, 1, 5, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 269
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(5.2F, 12.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 270
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(5.6F, 13.5F, -3.5F, 1, 1, 7, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F); // Box 271
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(6F, 14.5F, -4.5F, 1, 1, 9, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 272
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(4.6F, 10.6F, -1.6F, 1, 5, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -2F, -0.4F, 0.5F, 1.3F, -0.4F, 0.5F, 1.3F, -0.4F, -1.1F, -2F, -0.4F, -1.1F); // Box 273
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(4.6F, 10.6F, 0.6F, 1, 5, 1, 0F,0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -2F, -0.4F, -1.1F, 1.3F, -0.4F, -1.1F, 1.3F, -0.4F, 0.5F, -2F, -0.4F, 0.5F); // Box 274
		bodyModel[75].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 297
		leftArmModel[1] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 298
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 299
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 300
		leftArmModel[4] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 301
		leftArmModel[5] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 302
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 303
		leftArmModel[7] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 304
		leftArmModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 305
		leftArmModel[9] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 306
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 307
		leftArmModel[11] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 308
		leftArmModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 309
		leftArmModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 310
		leftArmModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 311
		leftArmModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 312
		leftArmModel[16] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 313
		leftArmModel[17] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 314
		leftArmModel[18] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 315
		leftArmModel[19] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 316
		leftArmModel[20] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 317
		leftArmModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 318
		leftArmModel[22] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 319
		leftArmModel[23] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 320
		leftArmModel[24] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 321
		leftArmModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 322
		leftArmModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 323
		leftArmModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 324
		leftArmModel[28] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 325
		leftArmModel[29] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 326

		leftArmModel[0].addShapeBox(-1F, -3.5F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 297
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(1.5F, -1F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1.5F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1.5F, -1F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1.5F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0F, -1F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0F, -1F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2.4F, -1F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(2.4F, -1F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.4F, -1F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.4F, 3.5F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.4F, 3.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.4F, 3.5F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(3F, -2.3F, -2.5F, 1, 1, 5, 0F,0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 312
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(3.2F, -1.6F, -2.5F, 1, 1, 5, 0F,0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F); // Box 313
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(3.2F, -0.6F, -2.5F, 1, 1, 5, 0F,0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F); // Box 314
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(3.2F, 0.4F, -2.5F, 1, 1, 5, 0F,0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F); // Box 315
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(3.1F, -2.3F, -1.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 316
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(3.1F, -2.3F, 0.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 317
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2.5F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.5F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.1F, -0.2F); // Box 318
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(1.5F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.5F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.4F, -0.2F, 0F, -0.1F, -0.2F); // Box 319
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(0.5F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.5F, -0.2F, 0.3F, -0.1F, -0.2F, 0.3F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, -0.1F, -0.2F); // Box 320
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-0.3F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F); // Box 321
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(2.2F, -3.1F, -1.5F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, 0.3F, -0.6F, -0.3F, 0.3F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.4F, -0.3F); // Box 322
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(2.2F, -3.1F, 0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, 0.3F, -0.6F, -0.3F, 0.3F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.4F, -0.3F); // Box 323
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(-0.0999999999999996F, -2.1F, -1.5F, 2, 1, 1, 0F,0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F); // Box 324
		leftArmModel[27].setRotationPoint(0F, -1F, 0F);

		leftArmModel[28].addShapeBox(-0.0999999999999996F, -2.1F, 0.5F, 2, 1, 1, 0F,0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F); // Box 325
		leftArmModel[28].setRotationPoint(0F, -1F, 0F);

		leftArmModel[29].addShapeBox(2.2F, 7F, -2F, 1, 3, 4, 0F,0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Box 326
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 68
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 74
		rightArmModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 99
		rightArmModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 100
		rightArmModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 101
		rightArmModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 103
		rightArmModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 105
		rightArmModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 168
		rightArmModel[8] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 193
		rightArmModel[9] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 194
		rightArmModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 199
		rightArmModel[11] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 200
		rightArmModel[12] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 201
		rightArmModel[13] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 202
		rightArmModel[14] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 203
		rightArmModel[15] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 204
		rightArmModel[16] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 205
		rightArmModel[17] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 206
		rightArmModel[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 207
		rightArmModel[19] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 208
		rightArmModel[20] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 209
		rightArmModel[21] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 210
		rightArmModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 211
		rightArmModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 213
		rightArmModel[24] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 214
		rightArmModel[25] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 219
		rightArmModel[26] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 220
		rightArmModel[27] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 230
		rightArmModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 231
		rightArmModel[29] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 232

		rightArmModel[0].addShapeBox(-1.5F, -3F, -2.5F, 1, 1, 5, 0F,0.3F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.3F, -0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.5F, -0.2F); // Box 68
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(0F, -3.5F, -3F, 1, 1, 6, 0F,0F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, -0.4F, 0.2F, -0.15F, 0F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F, -0.2F, 0.2F, -0.15F); // Box 74
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.4F, 3.5F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.4F, 3.5F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.4F, 3.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.2F, 7F, -2F, 1, 3, 4, 0F,0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Box 103
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-2.5F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-1F, 3.5F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-2.5F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1F, 3.5F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-2.5F, -3F, -2.5F, 1, 1, 5, 0F,0.3F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.4F, -0.2F); // Box 199
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-4F, -2.3F, -2.5F, 1, 1, 5, 0F,-0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 200
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-0.7F, -3F, -2.5F, 1, 1, 5, 0F,0F, -0.1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.5F, 0.1F); // Box 201
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.5F, -3F, -2.5F, 1, 1, 5, 0F,0.3F, -0.4F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.3F, -0.4F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 202
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-4.2F, -1.6F, -2.5F, 1, 1, 5, 0F,-0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 203
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-1F, -1F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-2.5F, -1F, -2.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.4F, -1F, -1.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.4F, -1F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3.4F, -1F, 0.9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-2.5F, -1F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-1F, -1F, 1.4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-2.1F, -3.1F, -1.5F, 2, 1, 1, 0F,0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F); // Box 211
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-3.2F, -3.1F, -1.5F, 1, 1, 1, 0F,0.3F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.6F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F); // Box 213
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-4.1F, -2.3F, -1.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 214
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-4.2F, -0.6F, -2.5F, 1, 1, 5, 0F,-0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 219
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-4.2F, 0.4F, -2.5F, 1, 1, 5, 0F,-0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.4F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 220
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-4.1F, -2.3F, 0.5F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 230
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-3.2F, -3.1F, 0.5F, 1, 1, 1, 0F,0.3F, -0.6F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.6F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.2F, -0.3F); // Box 231
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-2.1F, -3.1F, 0.5F, 2, 1, 1, 0F,0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F); // Box 232
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 51
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 53
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 115
		leftLegModel[3] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 178
		leftLegModel[4] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 179
		leftLegModel[5] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 180
		leftLegModel[6] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 181
		leftLegModel[7] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 182
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 183
		leftLegModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 184
		leftLegModel[10] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 186
		leftLegModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 187
		leftLegModel[12] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 188
		leftLegModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 189
		leftLegModel[14] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 190
		leftLegModel[15] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 191
		leftLegModel[16] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 192
		leftLegModel[17] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 193
		leftLegModel[18] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 194
		leftLegModel[19] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 195
		leftLegModel[20] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 196
		leftLegModel[21] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 197
		leftLegModel[22] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 198
		leftLegModel[23] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 275
		leftLegModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 276
		leftLegModel[25] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 277
		leftLegModel[26] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 278
		leftLegModel[27] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 279
		leftLegModel[28] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 280
		leftLegModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 328
		leftLegModel[30] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 329
		leftLegModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 331
		leftLegModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 333
		leftLegModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 335
		leftLegModel[34] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 337
		leftLegModel[35] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 340

		leftLegModel[0].addShapeBox(-2F, 7.5F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 53
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 115
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2.2F, 0.5F, -3.3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 178
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2.1F, 1.5F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 179
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 2.5F, -3.5F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 180
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.9F, 3.5F, -3.6F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 181
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.8F, 4.5F, -3.7F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 182
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(1.3F, 1.2F, -3.55F, 1, 4, 1, 0F,-0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.8F, -0.3F, 0.3F, -0.8F); // Box 183
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-1.2F, 1.2F, -3.55F, 1, 4, 1, 0F,-0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.8F, -0.3F, 0.3F, -0.8F); // Box 184
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 186
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-1.7F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 187
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-0.5F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 188
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(0.7F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 189
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-1.7F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 190
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(-0.5F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 191
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(0.7F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 192
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(1.2F, 7.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 193
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(1.2F, 7.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 194
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(1.2F, 7.5F, -1.8F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 195
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(-2.2F, 7.5F, -0.5F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 196
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);

		leftLegModel[21].addShapeBox(-2.2F, 7.5F, 0.8F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 197
		leftLegModel[21].setRotationPoint(0F, 0F, 0F);

		leftLegModel[22].addShapeBox(-2.2F, 7.5F, -1.8F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 198
		leftLegModel[22].setRotationPoint(0F, 0F, 0F);

		leftLegModel[23].addShapeBox(-2F, -1.4F, -3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 275
		leftLegModel[23].setRotationPoint(0F, 0F, 0F);

		leftLegModel[24].addShapeBox(-1.7F, -0.4F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 276
		leftLegModel[24].setRotationPoint(0F, 0F, 0F);

		leftLegModel[25].addShapeBox(-1.35F, 0.6F, -3.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 277
		leftLegModel[25].setRotationPoint(0F, 0F, 0F);

		leftLegModel[26].addShapeBox(-1F, 1.6F, -4.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 278
		leftLegModel[26].setRotationPoint(0F, 0F, 0F);

		leftLegModel[27].addShapeBox(-0.7F, 2.6F, -4.6F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 279
		leftLegModel[27].setRotationPoint(0F, 0F, 0F);

		leftLegModel[28].addShapeBox(1F, -1.4F, -3F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.1F, -0.4F, 1.5F, 0.5F, -0.4F, 1.5F, 0.5F, -0.4F, -2F, -1.1F, -0.4F, -2F); // Box 280
		leftLegModel[28].setRotationPoint(0F, 0F, 0F);

		leftLegModel[29].addShapeBox(-0.7F, 2.6F, 3.6F, 5, 1, 1, 0F,1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 0.8F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F); // Box 328
		leftLegModel[29].setRotationPoint(0F, 0F, 0F);

		leftLegModel[30].addShapeBox(-1F, 1.6F, 3.2F, 5, 1, 1, 0F,0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.7F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F); // Box 329
		leftLegModel[30].setRotationPoint(0F, 0F, 0F);

		leftLegModel[31].addShapeBox(-1.35F, 0.6F, 2.8F, 5, 1, 1, 0F,0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.6F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F); // Box 331
		leftLegModel[31].setRotationPoint(0F, 0F, 0F);

		leftLegModel[32].addShapeBox(-1.7F, -0.4F, 2.4F, 5, 1, 1, 0F,0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.3F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F); // Box 333
		leftLegModel[32].setRotationPoint(0F, 0F, 0F);

		leftLegModel[33].addShapeBox(-2F, -1.4F, 2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 335
		leftLegModel[33].setRotationPoint(0F, 0F, 0F);

		leftLegModel[34].addShapeBox(1F, -1.4F, 2F, 1, 5, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.1F, -0.4F, -2F, 0.5F, -0.4F, -2F, 0.5F, -0.4F, 1.5F, -1.1F, -0.4F, 1.5F); // Box 337
		leftLegModel[34].setRotationPoint(0F, 0F, 0F);

		leftLegModel[35].addShapeBox(-1F, -1.4F, 2F, 1, 5, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.1F, -0.4F, -2F, 0.5F, -0.4F, -2F, 0.5F, -0.4F, 1.5F, -1.1F, -0.4F, 1.5F); // Box 340
		leftLegModel[35].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 161
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 162
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 163
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 165
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 166
		rightLegModel[5] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 167
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 261
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 262
		rightLegModel[8] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 263
		rightLegModel[9] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 264
		rightLegModel[10] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 265
		rightLegModel[11] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 266
		rightLegModel[12] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 267
		rightLegModel[13] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 281
		rightLegModel[14] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 282
		rightLegModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 283
		rightLegModel[16] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 284
		rightLegModel[17] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 285
		rightLegModel[18] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 286
		rightLegModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 287
		rightLegModel[20] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 288
		rightLegModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 289
		rightLegModel[22] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 290
		rightLegModel[23] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 291
		rightLegModel[24] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 292
		rightLegModel[25] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 293
		rightLegModel[26] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 294
		rightLegModel[27] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 295
		rightLegModel[28] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 296
		rightLegModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 327
		rightLegModel[30] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 330
		rightLegModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 332
		rightLegModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 334
		rightLegModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 336
		rightLegModel[34] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 338
		rightLegModel[35] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 339

		rightLegModel[0].addShapeBox(-3.65F, 0.6F, -3.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 161
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.3F, -0.4F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 162
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3F, -1.4F, -3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 163
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-4F, 1.6F, -4.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 165
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-4.3F, 2.6F, -4.6F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 166
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -1.4F, -3F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.5F, -0.4F, 1.5F, -1.1F, -0.4F, 1.5F, -1.1F, -0.4F, -2F, 0.5F, -0.4F, -2F); // Box 167
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(0.5F, 1.2F, -3.55F, 1, 4, 1, 0F,-0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.8F, -0.3F, 0.3F, -0.8F); // Box 261
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 1.2F, -3.55F, 1, 4, 1, 0F,-0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.8F, -0.3F, 0.3F, -0.8F); // Box 262
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.6F, 0.5F, -3.3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 263
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.7F, 1.5F, -3.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 264
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.8F, 2.5F, -3.5F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 265
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.9F, 3.5F, -3.6F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 266
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-3F, 4.5F, -3.7F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 267
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2F, 6F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 281
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2F, 7.5F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 283
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(1.2F, 7.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 284
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(1.2F, 7.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 285
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(1.2F, 7.5F, -1.8F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 286
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(0.7F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 287
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);

		rightLegModel[20].addShapeBox(-0.5F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 288
		rightLegModel[20].setRotationPoint(0F, 0F, 0F);

		rightLegModel[21].addShapeBox(-1.7F, 7.5F, -2.2F, 1, 4, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 289
		rightLegModel[21].setRotationPoint(0F, 0F, 0F);

		rightLegModel[22].addShapeBox(-2.2F, 7.5F, -1.8F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 290
		rightLegModel[22].setRotationPoint(0F, 0F, 0F);

		rightLegModel[23].addShapeBox(-2.2F, 7.5F, -0.5F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 291
		rightLegModel[23].setRotationPoint(0F, 0F, 0F);

		rightLegModel[24].addShapeBox(-2.2F, 7.5F, 0.8F, 1, 4, 1, 0F,0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 292
		rightLegModel[24].setRotationPoint(0F, 0F, 0F);

		rightLegModel[25].addShapeBox(-1.7F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 293
		rightLegModel[25].setRotationPoint(0F, 0F, 0F);

		rightLegModel[26].addShapeBox(-0.5F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 294
		rightLegModel[26].setRotationPoint(0F, 0F, 0F);

		rightLegModel[27].addShapeBox(0.7F, 7.5F, 1.2F, 1, 4, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 295
		rightLegModel[27].setRotationPoint(0F, 0F, 0F);

		rightLegModel[28].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 296
		rightLegModel[28].setRotationPoint(0F, 0F, 0F);

		rightLegModel[29].addShapeBox(-4.3F, 2.6F, 3.6F, 5, 1, 1, 0F,0F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 327
		rightLegModel[29].setRotationPoint(0F, 0F, 0F);

		rightLegModel[30].addShapeBox(-4F, 1.6F, 3.2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0.9F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F, 0.7F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 330
		rightLegModel[30].setRotationPoint(0F, 0F, 0F);

		rightLegModel[31].addShapeBox(-3.65F, 0.6F, 2.8F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F, 0.6F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 332
		rightLegModel[31].setRotationPoint(0F, 0F, 0F);

		rightLegModel[32].addShapeBox(-3.3F, -0.4F, 2.4F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 334
		rightLegModel[32].setRotationPoint(0F, 0F, 0F);

		rightLegModel[33].addShapeBox(-3F, -1.4F, 2F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 336
		rightLegModel[33].setRotationPoint(0F, 0F, 0F);

		rightLegModel[34].addShapeBox(-2F, -1.4F, 2F, 1, 5, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.5F, -0.4F, -2F, -1.1F, -0.4F, -2F, -1.1F, -0.4F, 1.5F, 0.5F, -0.4F, 1.5F); // Box 338
		rightLegModel[34].setRotationPoint(0F, 0F, 0F);

		rightLegModel[35].addShapeBox(0F, -1.4F, 2F, 1, 5, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.5F, -0.4F, -2F, -1.1F, -0.4F, -2F, -1.1F, -0.4F, 1.5F, 0.5F, -0.4F, 1.5F); // Box 339
		rightLegModel[35].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 154
		skirtFrontModel[1] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 155
		skirtFrontModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 156
		skirtFrontModel[3] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 157
		skirtFrontModel[4] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 158
		skirtFrontModel[5] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 159
		skirtFrontModel[6] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 160

		skirtFrontModel[0].addShapeBox(-2.5F, -1.2F, -3.5F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 154
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-2.5F, -0.199999999999999F, -3.9F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 155
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-2.5F, 0.800000000000001F, -4.3F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 156
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-2.5F, 1.8F, -4.7F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 157
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-2.5F, 2.8F, -5.1F, 5, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F); // Box 158
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[5].addShapeBox(-1.5F, -1.2F, -3.5F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 1.5F, -0.3F, -0.4F, 1.5F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, -2F); // Box 159
		skirtFrontModel[5].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[6].addShapeBox(0.5F, -1.2F, -3.5F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 1.5F, -0.3F, -0.4F, 1.5F, -0.3F, -0.4F, -2F, -0.3F, -0.4F, -2F); // Box 160
		skirtFrontModel[6].setRotationPoint(0F, 0F, 0F);
	}
}