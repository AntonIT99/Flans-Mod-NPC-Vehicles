//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SongHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSongHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelSongHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[87];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 50
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 136
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 202
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 203
		headModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 204
		headModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 205
		headModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 206
		headModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 207
		headModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 208
		headModel[12] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 209
		headModel[13] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 210
		headModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 212
		headModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 213
		headModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 214
		headModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 215
		headModel[18] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 216
		headModel[19] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 217
		headModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 218
		headModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 219
		headModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 536
		headModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 224
		headModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 225
		headModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 226
		headModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 227
		headModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 228
		headModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 229
		headModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 230
		headModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 231
		headModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 232
		headModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 233
		headModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 234
		headModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 235
		headModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 236
		headModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 237
		headModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 238
		headModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 239
		headModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 240
		headModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 241
		headModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 242
		headModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 243
		headModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 244
		headModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 245
		headModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 246
		headModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 247
		headModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 248
		headModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 249
		headModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 250
		headModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 251
		headModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 252
		headModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 253
		headModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 254
		headModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 255
		headModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 256
		headModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 257
		headModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 258
		headModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 369
		headModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 271
		headModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 275
		headModel[61] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 282
		headModel[62] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 286
		headModel[63] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 287
		headModel[64] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 87
		headModel[65] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 88
		headModel[66] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 89
		headModel[67] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 90
		headModel[68] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 91
		headModel[69] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 92
		headModel[70] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 93
		headModel[71] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 94
		headModel[72] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 95
		headModel[73] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 96
		headModel[74] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 97
		headModel[75] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 98
		headModel[76] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 99
		headModel[77] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 100
		headModel[78] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 101
		headModel[79] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 102
		headModel[80] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 103
		headModel[81] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 104
		headModel[82] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 105
		headModel[83] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 106
		headModel[84] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 107
		headModel[85] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 108
		headModel[86] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 109

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -10.8F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, 0.3F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.3F, -0.2F, 0.3F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 50
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -5.4F, -7.8F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 202
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -5F, 4.8F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.9F, -5.4F, -4.8F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 204
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-7.9F, -5.4F, -4.8F, 3, 1, 10, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-8.01F, -5.4F, -7.8F, 3, 1, 3, 0F,-1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(5.01F, -5.4F, -7.8F, 3, 1, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 207
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -5F, -4F, 1, 5, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 208
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -5F, 2.8F, 1, 5, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 209
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.8F, -0.8F, -3.5F, 1, 1, 7, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 210
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3F, -5F, 2.5F, 1, 7, 2, 0F,-0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F); // Box 212
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -5F, 2.5F, 1, 7, 2, 0F,-0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F); // Box 213
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-3.5F, 1.2F, 5.2F, 7, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F); // Box 214
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5F, -5F, -4F, 1, 5, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 215
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5.8F, -0.8F, -3.5F, 1, 1, 7, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 216
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5F, -5F, 3F, 1, 5, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 217
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(5.01F, -5F, 4.91F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 218
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-8.01F, -5F, 4.91F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(4.1F, -2.4F, -3.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 536
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(4.1F, -2.4F, -2.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 224
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(4.1F, -2.4F, -1.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 225
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(4.1F, -2.4F, -0.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 226
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(4.1F, -2.4F, 0.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 227
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(4.1F, -2.4F, 1.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 228
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.9F, -3.8F, 1.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 229
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.9F, -3.8F, 0.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 230
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(3.9F, -3.8F, -0.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 231
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(3.9F, -3.8F, -1.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 232
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.9F, -3.8F, -2.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 233
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(3.9F, -3.8F, -3.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 234
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(3.8F, -4.9F, 1.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 235
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.8F, -4.9F, 0.9F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 236
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(3.8F, -4.9F, -0.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 237
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(3.8F, -4.9F, -1.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 238
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(3.8F, -4.9F, -2.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 239
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(3.8F, -4.9F, -3.1F, 1, 2, 1, 0F,-0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F); // Box 240
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.2F, -2.4F, -3.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 241
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-4.9F, -4.9F, -3.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 242
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.1F, -3.8F, -3.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 243
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-4.9F, -4.9F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 244
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-4.9F, -4.9F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 245
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-4.9F, -4.9F, -0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 246
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-4.9F, -4.9F, 0.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 247
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-4.9F, -4.9F, 1.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 248
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-5.1F, -3.8F, 1.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 249
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-5.1F, -3.8F, 0.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 250
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-5.1F, -3.8F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 251
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-5.1F, -3.8F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 252
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-5.1F, -3.8F, -0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 253
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-5.2F, -2.4F, -0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 254
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-5.2F, -2.4F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 255
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-5.2F, -2.4F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 256
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-5.2F, -2.4F, 0.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 257
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-5.2F, -2.4F, 1.9F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, -0.8F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 258
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(2F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 369
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(-0.5F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F); // Box 271
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(-0.5F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F); // Box 275
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-0.5F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F); // Box 282
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(-0.5F, -13.3F, -0.5F, 1, 2, 1, 0F,0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 286
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-0.5F, -14.3F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F); // Box 287
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(1F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 87
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(0F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 88
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(0.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 89
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(1.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 90
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(2.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 91
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(0.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 92
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(1.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 93
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(2.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 94
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(0.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 95
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(1.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 96
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(2.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 97
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(-3F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 98
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(-2F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 99
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(-1F, -4.9F, 3.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 100
		headModel[77].setRotationPoint(0F, 0F, 0F);

		headModel[78].addShapeBox(-3.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 101
		headModel[78].setRotationPoint(0F, 0F, 0F);

		headModel[79].addShapeBox(-2.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 102
		headModel[79].setRotationPoint(0F, 0F, 0F);

		headModel[80].addShapeBox(-1.2F, -3.4F, 3.6F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 103
		headModel[80].setRotationPoint(0F, 0F, 0F);

		headModel[81].addShapeBox(-3.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 104
		headModel[81].setRotationPoint(0F, 0F, 0F);

		headModel[82].addShapeBox(-2.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 105
		headModel[82].setRotationPoint(0F, 0F, 0F);

		headModel[83].addShapeBox(-1.2F, -1.9F, 3.9F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 106
		headModel[83].setRotationPoint(0F, 0F, 0F);

		headModel[84].addShapeBox(-3.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 107
		headModel[84].setRotationPoint(0F, 0F, 0F);

		headModel[85].addShapeBox(-2.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 108
		headModel[85].setRotationPoint(0F, 0F, 0F);

		headModel[86].addShapeBox(-1.2F, -0.4F, 4.4F, 1, 2, 1, 0F,0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, -0.8F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 109
		headModel[86].setRotationPoint(0F, 0F, 0F);
	}
}