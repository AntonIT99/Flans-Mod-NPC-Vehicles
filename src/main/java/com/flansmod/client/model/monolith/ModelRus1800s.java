//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.03.2020 - 19:10:49
// Last changed on: 10.03.2020 - 19:10:49

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRus1800s extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRus1800s() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box179
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box184
		headModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box185
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box186
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box187
		headModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box192
		headModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box193
		headModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box194
		headModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box195
		headModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box196
		headModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box205
		headModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box206
		headModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box207
		headModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box208
		headModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box209
		headModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box210
		headModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box211
		headModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box231
		headModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box232
		headModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box233
		headModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox11
		headModel[21] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box230

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F, 0.2F, 0.02F, 0.4F, 0.2F, 0.02F, 0.4F, 0.2F, 0.02F, 0F, 0.2F, 0.02F, 0F, 0.2F, -0.6F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F); // Import Box179
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -6F, 8, 1, 2, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box184
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 4F, 8, 1, 2, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -2.4F, 0.02F, -1.4F, -2.4F, 0.02F, -1.4F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -2.4F, -0.45F, -1.4F, -2.4F, -0.45F, -1.4F); // Import Box185
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-6F, -8F, -4F, 2, 1, 8, 0F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Import Box186
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4F, -8F, -4F, 2, 1, 8, 0F, 0F, 0.02F, 0F, -1.4F, 0.02F, -2.4F, -1.4F, 0.02F, -2.4F, 0F, 0.02F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Import Box187
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -7.25F, -6F, 8, 1, 2, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box192
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -6.5F, -6F, 8, 1, 2, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box193
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -5.75F, -6F, 8, 1, 2, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box194
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-6F, -7.25F, -4F, 2, 1, 8, 0F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Import Box195
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-6F, -6.5F, -4F, 2, 1, 8, 0F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Import Box196
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -7.25F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Import Box205
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -6.5F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Import Box206
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -5.75F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F); // Import Box207
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-6F, -5.75F, -4F, 2, 1, 8, 0F, -1.4F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -2.4F, -1.4F, -0.25F, -2.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.4F, -0.25F, -2.4F); // Import Box208
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -7.25F, 4F, 8, 1, 2, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.4F, 0.2F, -1.4F, -2.4F, 0.2F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Import Box209
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -6.5F, 4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Import Box210
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -5.75F, 4F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, -1.4F, -2.4F, 0F, -1.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2.4F, -0.25F, -1.4F, -2.4F, -0.25F, -1.4F); // Import Box211
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-7.2F, -8F, -4.2F, 3, 1, 8, 0F, -1.2F, 0.02F, -2.2F, 0F, 0.02F, 0.2F, 0F, 0.02F, 0.2F, -1.2F, 0.02F, -2.2F, -1.2F, -0.55F, -2.2F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.2F, -1.2F, -0.55F, -2.2F); // Import Box231
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -8F, 4F, 8, 1, 3, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2.2F, 0F, -1.2F, -2.2F, 0F, -1.2F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -2.2F, -0.55F, -1.2F, -2.2F, -0.55F, -1.2F); // Import Box232
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.2F, -8F, -4.2F, 3, 1, 8, 0F, 0F, 0F, 0.2F, -1.2F, 0F, -2.2F, -1.2F, 0F, -2.2F, 0F, 0F, 0.2F, 0F, -0.55F, 0.2F, -1.2F, -0.55F, -2.2F, -1.2F, -0.55F, -2.2F, 0F, -0.55F, 0.2F); // Import Box233
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-22.5F, -27.2F, -4.96F, 45, 43, 1, 0F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, -0.3F, -23.2F, -20.8F, 0F, -23.2F, -20.8F, 0F); // Import ImportBox11
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -8F, -7.4F, 8, 1, 3, 0F, -2.2F, 0.02F, -1.5F, -2.2F, 0.02F, -1.5F, 0.2F, 0.02F, 0F, 0.2F, 0.02F, 0F, -2.2F, -0.55F, -1.5F, -2.2F, -0.55F, -1.5F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Import Box230
		headModel[21].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[70];
		bodyModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box105
		bodyModel[1] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box116
		bodyModel[2] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box118
		bodyModel[3] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box120
		bodyModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box121
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box122
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box123
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box125
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box126
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box130
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box131
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box140
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box154
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box155
		bodyModel[14] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box156
		bodyModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box165
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box166
		bodyModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box167
		bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box168
		bodyModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box169
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box172
		bodyModel[21] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box176
		bodyModel[22] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box178
		bodyModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box71
		bodyModel[24] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box79
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box142
		bodyModel[26] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box143
		bodyModel[27] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box144
		bodyModel[28] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box148
		bodyModel[29] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box149
		bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box150
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box151
		bodyModel[32] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box152
		bodyModel[33] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box153
		bodyModel[34] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import Box154
		bodyModel[35] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box155
		bodyModel[36] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box156
		bodyModel[37] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box169
		bodyModel[38] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box170
		bodyModel[39] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box171
		bodyModel[40] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 199
		bodyModel[41] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 200
		bodyModel[42] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 201
		bodyModel[43] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 202
		bodyModel[44] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 203
		bodyModel[45] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 162
		bodyModel[46] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 163
		bodyModel[47] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 164
		bodyModel[48] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 172
		bodyModel[49] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box175
		bodyModel[50] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Import Box176
		bodyModel[51] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Import Box177
		bodyModel[52] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Import Box178
		bodyModel[53] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box179
		bodyModel[54] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box180
		bodyModel[55] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box181
		bodyModel[56] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box182
		bodyModel[57] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box183
		bodyModel[58] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box184
		bodyModel[59] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box185
		bodyModel[60] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import Box186
		bodyModel[61] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Import Box204
		bodyModel[62] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box205
		bodyModel[63] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import Box207
		bodyModel[64] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box208
		bodyModel[65] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Import Box209
		bodyModel[66] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box210
		bodyModel[67] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box211
		bodyModel[68] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import Box212
		bodyModel[69] = new ModelRendererTurbo(this, 201, 5, textureX, textureY); // Box 111

		bodyModel[0].addShapeBox(-3.2F, 1F, -3.15F, 2, 8, 1, 0F, -5.3F, 1.15F, -0.4F, 5.4F, 1.15F, -0.33F, 5.4F, 1.15F, 0F, -5.4F, 1.15F, 0F, 0.8F, 0F, -0.35F, -0.9F, 0F, -0.35F, -0.9F, 0F, 0F, 1F, 0F, 0F); // Import Box105
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 2F, -2.65F, 2, 9, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box116
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 2F, -2.65F, 2, 9, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box118
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 2F, -2.65F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box120
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, 2F, -2.65F, 2, 9, 1, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box121
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1F, -2.65F, 2, 1, 1, 0F, 0F, 1F, -0.45F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, 1F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box122
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2F, 1F, -2.65F, 2, 1, 1, 0F, 0F, 0.9F, -0.15F, 0F, 1F, -0.45F, 0F, 1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box123
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2F, 1F, -2.65F, 2, 1, 1, 0F, 0F, 0.9F, -0.15F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, 0.9F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box125
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 1F, -2.65F, 2, 1, 1, 0F, 0F, -0.1F, -0.05F, 0F, 0.9F, -0.15F, 0F, 0.9F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box126
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 8.8F, -3F, 2, 2, 1, 0F, 0F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box130
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 8.8F, -3.02F, 2, 2, 5, 0F, 0.05F, 0F, 0F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.1F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0.25F, 0F, -0.15F, 0.25F, 0F, -0.1F, 0F, 0F, -0.3F); // Import Box131
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2F, 1F, -2.75F, 2, 1, 1, 0F, -1F, 1F, -0.15F, 0F, 0.3F, 0F, 0F, -0.1F, -0.3F, -0.4F, 1F, 0F, 0.2F, -2F, -0.15F, 0F, -0.6F, 0F, 0F, 0F, -0.3F, 0.2F, -2F, -0.15F); // Import Box140
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addBox(-3F, -0.01F, -2F, 1, 1, 4, 0F); // Import Box154
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addBox(2F, -0.01F, -2F, 1, 1, 4, 0F); // Import Box155
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addBox(-2F, 0.99F, -1F, 4, 1, 3, 0F); // Import Box156
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 1F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 1F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.45F); // Import Box165
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.8F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.45F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F); // Import Box166
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.7F, -0.3F, 0F, 0.8F, 0F, 0F, 0.8F, -0.15F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Import Box167
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2F, 1F, 1.5F, 2, 1, 1, 0F, 0F, 0.8F, 0F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0F, 0F, 0.8F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Import Box168
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 2F, 1.5F, 2, 9, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, -0.25F); // Import Box169
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 2F, 1.5F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.45F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.15F); // Import Box172
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 8.8F, -3F, 2, 2, 1, 0F, 0.05F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0.05F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Import Box176
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.05F, 0F, 0F, 0.2F); // Import Box178
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addBox(-3.5F, 1.4F, -2F, 7, 1, 3, 0F); // Import Box71
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 8.8F, -3F, 2, 2, 5, 0F, 0.2F, 0F, -0.15F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0.25F, 0F, -0.15F, 0.05F, 0F, 0.05F, 0F, 0F, -0.3F, 0.25F, 0F, -0.1F); // Import Box79
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 2.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box142
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 2.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box143
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 1.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box144
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 5.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box148
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0F, 5.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box149
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 4.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box150
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 6.53F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box151
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0F, 6.7F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box152
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 8.03F, -2.65F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box153
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 8.2F, -2.65F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box154
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 7.55F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box155
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 6.05F, -2.65F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box156
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(3F, -0.01F, -2F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, 0F, 0.15F, 0F, 0F, 0.4F); // Import Box169
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, -0.01F, -2F, 1, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Import Box170
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 1F, -2.75F, 2, 1, 1, 0F, 0F, 0.3F, 0F, -1F, 1F, -0.15F, -0.4F, 1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.6F, 0F, 0.2F, -2F, -0.15F, 0.2F, -2F, -0.15F, 0F, 0F, -0.3F); // Import Box171
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0.05F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0.05F, 0F, 0.05F); // Box 199
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.05F); // Box 200
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 8.85F, 1.53F, 2, 2, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.05F, 0F, 0.05F, 0F, 0F, -0.1F); // Box 201
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0F, 2F, 1.5F, 2, 9, 1, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 202
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2F, 2F, 1.5F, 2, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.15F); // Box 203
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.2F, 1F, -3.15F, 2, 8, 1, 0F, 5.4F, 1.15F, -0.33F, -5.3F, 1.15F, -0.4F, -5.4F, 1.15F, 0F, 5.4F, 1.15F, 0F, -0.9F, 0F, -0.35F, 0.8F, 0F, -0.35F, 1F, 0F, 0F, -0.9F, 0F, 0F); // Box 162
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.2F, 1F, 1.75F, 2, 8, 1, 0F, 5.4F, 1.15F, 0F, -5.4F, 1.15F, 0F, -5.3F, 1.15F, -0.4F, 5.4F, 1.15F, -0.33F, -0.9F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, -0.35F, -0.9F, 0F, -0.35F); // Box 163
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.2F, 1F, 1.75F, 2, 8, 1, 0F, -5.4F, 1.15F, 0F, 5.4F, 1.15F, 0F, 5.4F, 1.15F, -0.33F, -5.3F, 1.15F, -0.4F, 1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.35F, 0.8F, 0F, -0.35F); // Box 164
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-0.5F, 2F, -3.1F, 1, 9, 1, 0F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 172
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3.5F, 0.99F, 2.6F, 7, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box175
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3.5F, -0.01F, 2.6F, 7, 1, 3, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box176
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 1F, 5.6F, 7, 3, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F); // Import Box177
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.5F, 3.99F, 2.6F, 7, 1, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F, -0.2F, -0.4F, -1.4F); // Import Box178
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.5F, 1F, 1.6F, 7, 3, 1, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1.4F, -0.4F, -0.2F, -1.4F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box179
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 4.3F, 2.1F, 7, 3, 3, 0F, -0.8F, 0.4F, -0.2F, -0.8F, 0.4F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.4F, -0.2F, -0.8F, -1.2F, 0F, -0.8F, -1.2F, 0F); // Import Box180
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-3.5F, 5.8F, 2F, 7, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box181
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-0.5F, 5.9F, 4.15F, 1, 1, 1, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box182
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-0.5F, 6.09F, 4.15F, 1, 1, 1, 0F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0.05F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F); // Import Box183
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-0.5F, 5.46F, 4.15F, 1, 1, 1, 0F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0.05F, -0.22F, -0.82F, 0F, -0.22F, -0.8F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F, -0.37F, 0F, 0F); // Import Box184
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3F, 6.01F, 2.2F, 3, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box185
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(0F, 6.01F, 2.2F, 3, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F, -1F, -1.2F, -0.2F); // Import Box186
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2.5F, 1F, 5.6F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Import Box204
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2.5F, 0.2F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box205
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-2.5F, 3.8F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Import Box207
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(1.5F, 0.2F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box208
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(1.5F, 1F, 5.6F, 1, 3, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1.4F, -0.2F, -0.2F, -1.4F, -0.2F); // Import Box209
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(1.5F, 3.8F, 2.8F, 1, 1, 3, 0F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1F, -0.2F, -0.15F, -1.4F, -0.2F, -0.15F, -1.4F); // Import Box210
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-2.5F, 0.99F, 2.6F, 1, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box211
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.5F, 0.99F, 2.6F, 1, 3, 3, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box212
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addBox(-1F, 8.8F, -3.3F, 2, 2, 1, 0F); // Box 111
		bodyModel[69].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[4];
		leftArmModel[0] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box69
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box95
		leftArmModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box198
		leftArmModel[3] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 195

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Import Box69
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box95
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addBox(-1.2F, -2.09F, -0.5F, 4, 1, 1, 0F); // Import Box198
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 5.61F, -2F, 4, 1, 4, 0F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 195
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[4];
		rightArmModel[0] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box151
		rightArmModel[1] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box152
		rightArmModel[2] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box199
		rightArmModel[3] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 197

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F, 0.02F); // Import Box151
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box152
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addBox(-2.8F, -2.09F, -0.5F, 4, 1, 1, 0F); // Import Box199
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5.61F, -2F, 4, 1, 4, 0F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, 0F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F, 0.07F, -0.5F, 0.15F); // Box 197
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[6];
		leftLegModel[0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box107
		leftLegModel[1] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box114
		leftLegModel[2] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box78
		leftLegModel[3] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box88
		leftLegModel[4] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 109
		leftLegModel[5] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 204

		leftLegModel[0].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6.05F, -2F, 4, 6, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box114
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F); // Import Box88
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, -1F, -2F, 4, 3, 4, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[6];
		rightLegModel[0] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box115
		rightLegModel[1] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Import Box76
		rightLegModel[2] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box79
		rightLegModel[3] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box87
		rightLegModel[4] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 202
		rightLegModel[5] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 203

		rightLegModel[0].addShapeBox(-2F, 6.05F, -2F, 4, 6, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box115
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2.75F, 4, 2, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box79
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F, 0.08F, 0.2F, 0.08F); // Import Box87
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, -1F, -2F, 4, 3, 4, 0F, 0F, 1F, 0.05F, 0F, 1F, 0.05F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 202
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);


	}
}