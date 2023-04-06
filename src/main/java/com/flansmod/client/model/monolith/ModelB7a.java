//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: B7a
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB7a extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelB7a() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[92];
		noseModel = new ModelRendererTurbo[46];
		tailModel = new ModelRendererTurbo[19];
		leftWingModel = new ModelRendererTurbo[9];
		rightWingModel = new ModelRendererTurbo[10];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
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
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 166
		bodyModel[1] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 167
		bodyModel[2] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 168
		bodyModel[3] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 169
		bodyModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 171
		bodyModel[5] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 173
		bodyModel[6] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 174
		bodyModel[7] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 175
		bodyModel[8] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 176
		bodyModel[9] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 177
		bodyModel[10] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 178
		bodyModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 179
		bodyModel[12] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 180
		bodyModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 181
		bodyModel[14] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 182
		bodyModel[15] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 183
		bodyModel[16] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 184
		bodyModel[17] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 185
		bodyModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 75
		bodyModel[19] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 76
		bodyModel[20] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 80
		bodyModel[24] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 85
		bodyModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 86
		bodyModel[30] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 87
		bodyModel[31] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 88
		bodyModel[32] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 89
		bodyModel[33] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 90
		bodyModel[34] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 91
		bodyModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 92
		bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 93
		bodyModel[37] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 101
		bodyModel[38] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 102
		bodyModel[39] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 103
		bodyModel[40] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 104
		bodyModel[41] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 105
		bodyModel[42] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 109
		bodyModel[46] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 110
		bodyModel[47] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 112
		bodyModel[49] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 116
		bodyModel[53] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 221
		bodyModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 222
		bodyModel[55] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 223
		bodyModel[56] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 224
		bodyModel[57] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 225
		bodyModel[58] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 226
		bodyModel[59] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 227
		bodyModel[60] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 228
		bodyModel[61] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 229
		bodyModel[62] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 89
		bodyModel[63] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 142
		bodyModel[66] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 143
		bodyModel[67] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 144
		bodyModel[68] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 167
		bodyModel[69] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 168
		bodyModel[70] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 169
		bodyModel[71] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 170
		bodyModel[72] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 171
		bodyModel[73] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 172
		bodyModel[74] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 173
		bodyModel[75] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 174
		bodyModel[76] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 175
		bodyModel[77] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 176
		bodyModel[78] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 177
		bodyModel[79] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 178
		bodyModel[80] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 179
		bodyModel[81] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 180
		bodyModel[82] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 181
		bodyModel[83] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 182
		bodyModel[84] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 183
		bodyModel[85] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 184
		bodyModel[86] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 185
		bodyModel[87] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 186
		bodyModel[88] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 187
		bodyModel[89] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 188
		bodyModel[90] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 189
		bodyModel[91] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 190

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 7, 23, 0F,0F, -0.5F, -7.5F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, -0.5F, -7.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 166
		bodyModel[0].setRotationPoint(-68.5F, -41F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 11, 23, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 167
		bodyModel[1].setRotationPoint(-68.5F, -34F, -11.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 7, 23, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -7.5F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, -0.5F, -7.5F); // Box 168
		bodyModel[2].setRotationPoint(-68.5F, -23F, -11.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 64, 7, 23, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 1F, -7F); // Box 169
		bodyModel[3].setRotationPoint(-50.5F, -23F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 7, 23, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, 1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -7F); // Box 171
		bodyModel[4].setRotationPoint(13.5F, -23F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 64, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[5].setRotationPoint(-50.5F, -34.5F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 64, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[6].setRotationPoint(-50.5F, -34.5F, 11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 55, 8, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[7].setRotationPoint(-41.5F, -42.5F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0.5F, -7.5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0.5F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[8].setRotationPoint(-50.5F, -42.5F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 55, 8, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[9].setRotationPoint(-41.5F, -42.5F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0.5F, 7.5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0.5F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[10].setRotationPoint(-50.5F, -42.5F, 11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F); // Box 179
		bodyModel[11].setRotationPoint(-23.5F, -44.5F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F); // Box 180
		bodyModel[12].setRotationPoint(-23.5F, -44.5F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 181
		bodyModel[13].setRotationPoint(13.5F, -34.5F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 24, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 182
		bodyModel[14].setRotationPoint(13.5F, -34.5F, 11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 183
		bodyModel[15].setRotationPoint(13.5F, -42.5F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 184
		bodyModel[16].setRotationPoint(13.5F, -42.5F, 11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0.5F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 7F, 0.5F, 0F, 1F, 0.1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0.1F, 0F, 0F); // Box 185
		bodyModel[17].setRotationPoint(12.5F, -44.5F, -7F);

		bodyModel[18].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[18].setRotationPoint(-43F, -49F, -2.5F);
		bodyModel[18].rotateAngleX = -0.10471976F;
		bodyModel[18].rotateAngleZ = -0.87266463F;

		bodyModel[19].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[19].setRotationPoint(-41F, -49F, -3.5F);
		bodyModel[19].rotateAngleX = -0.41887902F;

		bodyModel[20].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[20].setRotationPoint(-36.5F, -49F, -3.5F);
		bodyModel[20].rotateAngleX = -0.41887902F;

		bodyModel[21].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[21].setRotationPoint(-29.5F, -49F, -3.5F);
		bodyModel[21].rotateAngleX = -0.41887902F;

		bodyModel[22].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[22].setRotationPoint(-23F, -49F, -3.5F);
		bodyModel[22].rotateAngleX = -0.41887902F;

		bodyModel[23].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[23].setRotationPoint(-8F, -49F, -3.5F);
		bodyModel[23].rotateAngleX = -0.41887902F;

		bodyModel[24].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[24].setRotationPoint(-0.5F, -49F, -3.5F);
		bodyModel[24].rotateAngleX = -0.41887902F;

		bodyModel[25].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[25].setRotationPoint(11F, -49F, -3.5F);
		bodyModel[25].rotateAngleX = -0.41887902F;
		bodyModel[25].rotateAngleZ = 0.13962634F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0.5F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, -5F, 0.5F, 0F, -1F, 0.1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0.1F, 0F, 0F); // Box 83
		bodyModel[26].setRotationPoint(12.5F, -44.5F, 6F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[27].setRotationPoint(-41F, -49F, -3.5F);
		bodyModel[27].rotateAngleX = -0.41887902F;

		bodyModel[28].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[28].setRotationPoint(-41F, -49F, -3.5F);
		bodyModel[28].rotateAngleX = -0.41887902F;
		bodyModel[28].rotateAngleY = -0.40142573F;

		bodyModel[29].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[29].setRotationPoint(-43F, -49F, -2.5F);
		bodyModel[29].rotateAngleX = 0.31415927F;
		bodyModel[29].rotateAngleZ = -0.87266463F;

		bodyModel[30].addShapeBox(-0.5F, 0F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[30].setRotationPoint(-43F, -49F, 2.5F);
		bodyModel[30].rotateAngleX = -0.31415927F;
		bodyModel[30].rotateAngleZ = -0.87266463F;

		bodyModel[31].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		bodyModel[31].setRotationPoint(-36.5F, -49F, -3.5F);
		bodyModel[31].rotateAngleX = -0.95993109F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 89
		bodyModel[32].setRotationPoint(-36.5F, -50.4F, -1.5F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[33].setRotationPoint(-22.5F, -51F, 0F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 91
		bodyModel[34].setRotationPoint(-29.5F, -50.8F, -1.5F);

		bodyModel[35].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 92
		bodyModel[35].setRotationPoint(-29.5F, -49F, -3.5F);
		bodyModel[35].rotateAngleX = -0.78539816F;

		bodyModel[36].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 15, 1, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 93
		bodyModel[36].setRotationPoint(-9.25F, -66F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 2, 9, 0F,0F, -0.4F, -1F, -0.5F, -0.4F, -4F, -0.5F, -0.4F, -4F, 0F, -0.4F, -1F, 0F, 0F, 0.2F, 3.5F, 0.5F, -3F, 3.5F, 0.5F, -3F, 0F, 0F, 0.2F); // Box 101
		bodyModel[37].setRotationPoint(19.5F, -46.5F, -4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[38].setRotationPoint(19F, -47.5F, -0.5F);

		bodyModel[39].addShapeBox(-5F, -1.5F, -0.5F, 6, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 103
		bodyModel[39].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[39].rotateAngleZ = 0.61086524F;

		bodyModel[40].addShapeBox(-8F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[40].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[40].rotateAngleZ = 0.61086524F;

		bodyModel[41].addShapeBox(-7F, 0.5F, -0.5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 105
		bodyModel[41].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[41].rotateAngleZ = 0.61086524F;

		bodyModel[42].addShapeBox(-5F, 1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F); // Box 106
		bodyModel[42].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[42].rotateAngleZ = 0.61086524F;

		bodyModel[43].addShapeBox(0F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 107
		bodyModel[43].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[43].rotateAngleZ = 0.61086524F;

		bodyModel[44].addShapeBox(13F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F); // Box 108
		bodyModel[44].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[44].rotateAngleZ = 0.61086524F;

		bodyModel[45].addShapeBox(9.5F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F); // Box 109
		bodyModel[45].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[45].rotateAngleZ = 0.61086524F;

		bodyModel[46].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[46].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[46].rotateAngleZ = 0.61086524F;

		bodyModel[47].addShapeBox(0.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 111
		bodyModel[47].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[47].rotateAngleZ = 0.61086524F;

		bodyModel[48].addShapeBox(0.5F, -3.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F); // Box 112
		bodyModel[48].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[48].rotateAngleZ = 0.61086524F;

		bodyModel[49].addShapeBox(0.5F, -3F, 0.1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 113
		bodyModel[49].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[49].rotateAngleZ = 0.61086524F;

		bodyModel[50].addShapeBox(0.5F, -3F, -1.1F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 114
		bodyModel[50].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[50].rotateAngleZ = 0.61086524F;

		bodyModel[51].addShapeBox(0.5F, -2.1F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F); // Box 115
		bodyModel[51].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[51].rotateAngleZ = 0.61086524F;

		bodyModel[52].addShapeBox(-8.8F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 116
		bodyModel[52].setRotationPoint(19.5F, -47.5F, 0F);
		bodyModel[52].rotateAngleZ = 0.61086524F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 6, 22, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[53].setRotationPoint(-51.5F, -41F, -11F);
		bodyModel[53].rotateAngleZ = 0.27925268F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[54].setRotationPoint(-38.7F, -44.2F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[55].setRotationPoint(-42.2F, -44F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[56].setRotationPoint(-39.7F, -47.05F, -1F);

		bodyModel[57].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[57].setRotationPoint(-42.7F, -43F, -9.5F);
		bodyModel[57].rotateAngleZ = 0.27925268F;

		bodyModel[58].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[58].setRotationPoint(-42.7F, -43F, -10.5F);
		bodyModel[58].rotateAngleZ = 0.27925268F;

		bodyModel[59].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[59].setRotationPoint(-42.7F, -43F, -9F);
		bodyModel[59].rotateAngleZ = 0.27925268F;

		bodyModel[60].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[60].setRotationPoint(-42.7F, -43F, -11F);
		bodyModel[60].rotateAngleZ = 0.27925268F;

		bodyModel[61].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[61].setRotationPoint(-42.7F, -43F, -10F);
		bodyModel[61].rotateAngleZ = 0.27925268F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[62].setRotationPoint(-24.5F, -47F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[63].setRotationPoint(-24.5F, -43F, -2F);
		bodyModel[63].rotateAngleZ = -0.12217305F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[64].setRotationPoint(-34.5F, -33F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 142
		bodyModel[65].setRotationPoint(2.5F, -33F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 143
		bodyModel[66].setRotationPoint(1.5F, -47F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 144
		bodyModel[67].setRotationPoint(1.5F, -43F, -2F);
		bodyModel[67].rotateAngleZ = 0.12217305F;

		bodyModel[68].addShapeBox(-0.5F, -0.5F, -0.5F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[68].setRotationPoint(-41F, -49F, 3.5F);
		bodyModel[68].rotateAngleX = 0.41887902F;

		bodyModel[69].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[69].setRotationPoint(-41F, -49F, 3.5F);
		bodyModel[69].rotateAngleX = 0.41887902F;
		bodyModel[69].rotateAngleY = 0.40142573F;

		bodyModel[70].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 169
		bodyModel[70].setRotationPoint(-36.5F, -49F, 3.5F);
		bodyModel[70].rotateAngleX = 0.95993109F;

		bodyModel[71].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
		bodyModel[71].setRotationPoint(-29.5F, -49F, 3.5F);
		bodyModel[71].rotateAngleX = 1.13446401F;

		bodyModel[72].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[72].setRotationPoint(-41F, -49F, 3.5F);
		bodyModel[72].rotateAngleX = 0.41887902F;

		bodyModel[73].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[73].setRotationPoint(-36.5F, -49F, 3.5F);
		bodyModel[73].rotateAngleX = 0.41887902F;

		bodyModel[74].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[74].setRotationPoint(-29.5F, -49F, 3.5F);
		bodyModel[74].rotateAngleX = 0.41887902F;

		bodyModel[75].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[75].setRotationPoint(-23F, -49F, 3.5F);
		bodyModel[75].rotateAngleX = 0.41887902F;

		bodyModel[76].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 175
		bodyModel[76].setRotationPoint(-29.5F, -49F, 3.5F);
		bodyModel[76].rotateAngleX = 0.78539816F;

		bodyModel[77].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 176
		bodyModel[77].setRotationPoint(-23F, -49F, 3.5F);
		bodyModel[77].rotateAngleX = 0.78539816F;

		bodyModel[78].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 177
		bodyModel[78].setRotationPoint(-23F, -50.8F, -1.5F);

		bodyModel[79].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 178
		bodyModel[79].setRotationPoint(-23F, -49F, -3.5F);
		bodyModel[79].rotateAngleX = -0.78539816F;

		bodyModel[80].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 179
		bodyModel[80].setRotationPoint(-8F, -49F, 3.5F);
		bodyModel[80].rotateAngleX = 0.78539816F;

		bodyModel[81].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 180
		bodyModel[81].setRotationPoint(-8F, -50.8F, -1.5F);

		bodyModel[82].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 181
		bodyModel[82].setRotationPoint(-8F, -49F, -3.5F);
		bodyModel[82].rotateAngleX = -0.78539816F;

		bodyModel[83].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 182
		bodyModel[83].setRotationPoint(-0.5F, -49F, 3.5F);
		bodyModel[83].rotateAngleX = 0.78539816F;

		bodyModel[84].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 183
		bodyModel[84].setRotationPoint(-0.5F, -50.8F, -1.5F);

		bodyModel[85].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 184
		bodyModel[85].setRotationPoint(-0.5F, -49F, -3.5F);
		bodyModel[85].rotateAngleX = -0.78539816F;

		bodyModel[86].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 185
		bodyModel[86].setRotationPoint(11F, -50.4F, -1.5F);

		bodyModel[87].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 186
		bodyModel[87].setRotationPoint(11F, -49F, -3.5F);
		bodyModel[87].rotateAngleX = -0.95993109F;

		bodyModel[88].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 187
		bodyModel[88].setRotationPoint(11F, -49F, 3.5F);
		bodyModel[88].rotateAngleX = 0.95993109F;

		bodyModel[89].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[89].setRotationPoint(11F, -49F, 3.5F);
		bodyModel[89].rotateAngleX = 0.41887902F;
		bodyModel[89].rotateAngleZ = 0.13962634F;

		bodyModel[90].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[90].setRotationPoint(-0.5F, -49F, 3.5F);
		bodyModel[90].rotateAngleX = 0.41887902F;

		bodyModel[91].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[91].setRotationPoint(-8F, -49F, 3.5F);
		bodyModel[91].rotateAngleX = 0.41887902F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		noseModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 181
		noseModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 182
		noseModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 183
		noseModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 184
		noseModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 185
		noseModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 186
		noseModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 187
		noseModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 188
		noseModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 189
		noseModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 190
		noseModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 191
		noseModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 192
		noseModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 193
		noseModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 194
		noseModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 198
		noseModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 199
		noseModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 200
		noseModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 201
		noseModel[19] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 202
		noseModel[20] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 203
		noseModel[21] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 204
		noseModel[22] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 205
		noseModel[23] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 206
		noseModel[24] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 207
		noseModel[25] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 208
		noseModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 209
		noseModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 210
		noseModel[28] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 246
		noseModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 165
		noseModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 164
		noseModel[31] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 341
		noseModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 371
		noseModel[33] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 165
		noseModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 192
		noseModel[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 193
		noseModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 194
		noseModel[37] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 195
		noseModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 196
		noseModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 197
		noseModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 198
		noseModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 199
		noseModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 200
		noseModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 201
		noseModel[44] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 202
		noseModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 203

		noseModel[0].addShapeBox(0F, 0F, 0F, 9, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 180
		noseModel[0].setRotationPoint(-77.5F, -34F, -11.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 9, 7, 23, 0F,0F, -0.5F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 181
		noseModel[1].setRotationPoint(-77.5F, -41F, -11.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 9, 8, 23, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -0.5F, -8F); // Box 182
		noseModel[2].setRotationPoint(-77.5F, -23F, -11.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 183
		noseModel[3].setRotationPoint(-82.5F, -34F, -10.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, -1.5F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 7F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0.5F, -7F); // Box 184
		noseModel[4].setRotationPoint(-82.5F, -41F, -3.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F); // Box 185
		noseModel[5].setRotationPoint(-82.5F, -40.5F, -3.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0.5F, 7F); // Box 186
		noseModel[6].setRotationPoint(-82.5F, -41F, 1.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F); // Box 187
		noseModel[7].setRotationPoint(-82.5F, -34F, 8.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0.5F, 7F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F); // Box 188
		noseModel[8].setRotationPoint(-82.5F, -23F, 1.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 189
		noseModel[9].setRotationPoint(-82.5F, -17.5F, -3.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 5, 7, 2, 0F,0F, 0.5F, 7F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0.5F, -7F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F); // Box 190
		noseModel[10].setRotationPoint(-82.5F, -23F, -3.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F,0F, -1F, 3F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 191
		noseModel[11].setRotationPoint(-87.5F, -33.5F, 8.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, -3.5F, 7F, 0F, -6.5F, 11F, 0F, 0F, -7.5F, 0F, -2F, -8.5F, 0F, 1F, 3F, 0F, 6F, 6F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 192
		noseModel[12].setRotationPoint(-87.5F, -39.5F, 8.5F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 1F, 3F, 0F, 6F, 6F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -3.5F, 7F, 0F, -7F, 12F, 0F, 1F, -7.5F, 0F, -2F, -8.5F); // Box 193
		noseModel[13].setRotationPoint(-87.5F, -23.5F, 8.5F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -2.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -1F, 0F, 2F, -1.5F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, -1.5F); // Box 194
		noseModel[14].setRotationPoint(-87.5F, -40F, -3F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 198
		noseModel[15].setRotationPoint(-92.5F, -30F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, -3F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 199
		noseModel[16].setRotationPoint(-92.5F, -33F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, -3F); // Box 200
		noseModel[17].setRotationPoint(-92.5F, -26F, -5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 201
		noseModel[18].setRotationPoint(-96.5F, -30F, -4.5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F); // Box 202
		noseModel[19].setRotationPoint(-96.5F, -33F, -4.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 203
		noseModel[20].setRotationPoint(-96.5F, -27F, -4.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -3F); // Box 204
		noseModel[21].setRotationPoint(-99.5F, -29.5F, -4F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F, 0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F); // Box 205
		noseModel[22].setRotationPoint(-99.5F, -31.5F, -4F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0.5F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -3F, -0.5F, -1F, -3F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, -0.5F, -1F, -3F); // Box 206
		noseModel[23].setRotationPoint(-99.5F, -26.5F, -4F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 2F, -1.5F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, -1.5F, 0F, -2.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, -1F); // Box 207
		noseModel[24].setRotationPoint(-87.5F, -19F, -3F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, 3F); // Box 208
		noseModel[25].setRotationPoint(-87.5F, -33.5F, -10.5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, -2F, -8.5F, 0F, 0F, -7.5F, 0F, -6.5F, 11F, 0F, -3.5F, 7F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, 1F, 3F); // Box 209
		noseModel[26].setRotationPoint(-87.5F, -39.5F, -10.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, 1F, 3F, 0F, -2F, -8.5F, 0F, 1F, -7.5F, 0F, -7F, 12F, 0F, -3.5F, 7F); // Box 210
		noseModel[27].setRotationPoint(-87.5F, -23.5F, -10.5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, -0.5F); // Box 246
		noseModel[28].setRotationPoint(-71.5F, -17F, -4F);

		noseModel[29].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		noseModel[29].setRotationPoint(-68.2F, -30F, -11F);
		noseModel[29].rotateAngleY = -0.68067841F;
		noseModel[29].rotateAngleZ = 0.15707963F;

		noseModel[30].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		noseModel[30].setRotationPoint(-68.2F, -25F, -10.8F);
		noseModel[30].rotateAngleY = -0.68067841F;
		noseModel[30].rotateAngleZ = -0.15707963F;

		noseModel[31].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, -0.5F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1.5F, 0.4F, 2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 2.5F, -0.2F); // Box 341
		noseModel[31].setRotationPoint(-87F, -39.5F, -5F);

		noseModel[32].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		noseModel[32].setRotationPoint(-68.2F, -31F, 10.8F);
		noseModel[32].rotateAngleY = 0.68067841F;
		noseModel[32].rotateAngleZ = 0.15707963F;

		noseModel[33].addShapeBox(0F, 0F, 0F, 11, 6, 8, 0F,0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0.5F); // Box 165
		noseModel[33].setRotationPoint(-68.5F, -17F, -4F);

		noseModel[34].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		noseModel[34].setRotationPoint(-68.2F, -22F, -9.8F);
		noseModel[34].rotateAngleY = -0.68067841F;
		noseModel[34].rotateAngleZ = -0.15707963F;

		noseModel[35].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		noseModel[35].setRotationPoint(-68.2F, -18.5F, -6.5F);
		noseModel[35].rotateAngleY = -0.68067841F;
		noseModel[35].rotateAngleZ = -0.15707963F;

		noseModel[36].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		noseModel[36].setRotationPoint(-68.2F, -16.5F, -4.5F);
		noseModel[36].rotateAngleY = -0.68067841F;
		noseModel[36].rotateAngleZ = -0.15707963F;

		noseModel[37].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		noseModel[37].setRotationPoint(-68.2F, -32F, -11F);
		noseModel[37].rotateAngleY = -0.68067841F;
		noseModel[37].rotateAngleZ = 0.15707963F;

		noseModel[38].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		noseModel[38].setRotationPoint(-68.2F, -34.5F, -10F);
		noseModel[38].rotateAngleY = -0.68067841F;
		noseModel[38].rotateAngleZ = 0.15707963F;

		noseModel[39].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		noseModel[39].setRotationPoint(-68.2F, -29F, 10.8F);
		noseModel[39].rotateAngleY = 0.68067841F;
		noseModel[39].rotateAngleZ = 0.15707963F;

		noseModel[40].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		noseModel[40].setRotationPoint(-68.2F, -33F, 10.8F);
		noseModel[40].rotateAngleY = 0.68067841F;
		noseModel[40].rotateAngleZ = 0.15707963F;

		noseModel[41].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		noseModel[41].setRotationPoint(-68.2F, -35.5F, 9F);
		noseModel[41].rotateAngleY = 0.68067841F;
		noseModel[41].rotateAngleZ = 0.15707963F;

		noseModel[42].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		noseModel[42].setRotationPoint(-68.2F, -25F, 10.8F);
		noseModel[42].rotateAngleY = 0.68067841F;
		noseModel[42].rotateAngleZ = -0.15707963F;

		noseModel[43].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		noseModel[43].setRotationPoint(-68.2F, -20.5F, 7.8F);
		noseModel[43].rotateAngleY = 0.68067841F;
		noseModel[43].rotateAngleZ = -0.15707963F;

		noseModel[44].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		noseModel[44].setRotationPoint(-68.2F, -18F, 5.8F);
		noseModel[44].rotateAngleY = 0.68067841F;
		noseModel[44].rotateAngleZ = -0.15707963F;

		noseModel[45].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		noseModel[45].setRotationPoint(-68.2F, -16F, 3.8F);
		noseModel[45].rotateAngleY = 0.68067841F;
		noseModel[45].rotateAngleZ = -0.15707963F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 172
		tailModel[1] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 187
		tailModel[2] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 189
		tailModel[3] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 190
		tailModel[4] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 191
		tailModel[5] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 192
		tailModel[6] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 193
		tailModel[7] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 194
		tailModel[8] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 195
		tailModel[9] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 196
		tailModel[10] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 197
		tailModel[11] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 198
		tailModel[12] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 199
		tailModel[13] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 200
		tailModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 94
		tailModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 95
		tailModel[16] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 164
		tailModel[17] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 165
		tailModel[18] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 166

		tailModel[0].addShapeBox(0F, 0F, 0F, 70, 7, 19, 0F,0F, -0.5F, 0.5F, 0F, 4F, -7.5F, 0F, 4F, -7.5F, 0F, -0.5F, 0.5F, 0F, 0F, -5F, 0F, -8F, -8.5F, 0F, -8F, -8.5F, 0F, 0F, -5F); // Box 172
		tailModel[0].setRotationPoint(37.5F, -23F, -9.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 70, 12, 4, 0F,0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 8F); // Box 187
		tailModel[1].setRotationPoint(37.5F, -34.5F, -2F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 70, 8, 4, 0F,0F, 0F, 3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F); // Box 189
		tailModel[2].setRotationPoint(37.5F, -42.5F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 40, 2, 4, 0F,0F, 0F, 0F, 0F, -2.57F, 0.6F, 0F, -2.57F, 0.6F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0.6F, 0.65F, 0F, 0.6F, 0.65F, 0F, 0F, 3F); // Box 190
		tailModel[3].setRotationPoint(37.5F, -44.5F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 6, 32, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		tailModel[4].setRotationPoint(103F, -73F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 32, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, 0F, 0F); // Box 192
		tailModel[5].setRotationPoint(99F, -73F, -1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 193
		tailModel[6].setRotationPoint(107.5F, -34.5F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 194
		tailModel[7].setRotationPoint(107.5F, -41.5F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -1F); // Box 195
		tailModel[8].setRotationPoint(107.5F, -27.5F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 5, 42, 2, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F); // Box 196
		tailModel[9].setRotationPoint(109F, -73F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 1F, 0F); // Box 197
		tailModel[10].setRotationPoint(113.5F, -31F, -1F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		tailModel[11].setRotationPoint(96.5F, -44.5F, -56F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 55, 0F,-4.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -4.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F); // Box 199
		tailModel[12].setRotationPoint(88.5F, -44.5F, -56F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 44, 0F,0F, 0F, 0F, 0.5F, 0F, -13F, 3.5F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0.5F, 0F, -13F, 3.5F, 0F, 0F, 0F, 0F, 9F); // Box 200
		tailModel[13].setRotationPoint(104.5F, -44.5F, -56F);

		tailModel[14].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F, 55F, -0.35F, -0.35F); // Box 94
		tailModel[14].setRotationPoint(46F, -66F, 0F);

		tailModel[15].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F, 45F, -0.35F, -0.35F); // Box 95
		tailModel[15].setRotationPoint(61F, -53F, 0F);
		tailModel[15].rotateAngleZ = 0.40142573F;

		tailModel[16].addShapeBox(0F, 0F, 0F, 8, 2, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		tailModel[16].setRotationPoint(96.5F, -44.5F, 1F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 8, 2, 55, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -4F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -4F); // Box 165
		tailModel[17].setRotationPoint(88.5F, -44.5F, 1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 44, 0F,0F, 0F, 9F, 3.5F, 0F, 0F, 0.5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 9F, 3.5F, 0F, 0F, 0.5F, 0F, -13F, 0F, 0F, 0F); // Box 166
		tailModel[18].setRotationPoint(104.5F, -44.5F, 12F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 201
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 68
		leftWingModel[2] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 69
		leftWingModel[3] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 70
		leftWingModel[4] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 71
		leftWingModel[5] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 72
		leftWingModel[6] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 73
		leftWingModel[7] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 74
		leftWingModel[8] = new ModelRendererTurbo(this, 9, 214, textureX, textureY); // Box 145

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 28, 10, 40, 0F,0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingModel[0].setRotationPoint(-34.5F, -32.5F, -52F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 9, 10, 40, 0F,0F, -8.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 68
		leftWingModel[1].setRotationPoint(-43.5F, -32.5F, -52F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 10, 40, 0F,0F, -5.5F, 0F, 0F, -10.5F, 0F, 8F, -6.5F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 8F, -2.5F, 1F, 0F, 0F, 0F); // Box 69
		leftWingModel[2].setRotationPoint(-6.5F, -32.5F, -52F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 28, 10, 85, 0F,1F, 3.5F, 0F, -18F, 3.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 1F, -12F, 0F, -18F, -12F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 70
		leftWingModel[3].setRotationPoint(-34.5F, -32.5F, -137F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 9, 10, 85, 0F,-1.5F, 3.5F, -5F, -1F, 3.5F, 0F, 0F, -5.5F, 0F, 0F, -8.5F, 0F, -1.5F, -12F, -5F, -1F, -12F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 71
		leftWingModel[4].setRotationPoint(-43.5F, -32.5F, -137F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 9, 10, 85, 0F,6F, 3.5F, 0F, -0.5F, 1F, -13F, 20F, -10.5F, 0F, -12F, -5.5F, 0F, 6F, -12F, 0F, -0.5F, -10.5F, -13F, 20F, 1F, 0F, -12F, 3F, 0F); // Box 72
		leftWingModel[5].setRotationPoint(-18.5F, -32.5F, -137F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 73
		leftWingModel[6].setRotationPoint(-49.5F, -27F, -38.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 74
		leftWingModel[7].setRotationPoint(-42.5F, -27F, -38.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 145
		leftWingModel[8].setRotationPoint(-36.5F, -34.5F, -122F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 146
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 147
		rightWingModel[2] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 148
		rightWingModel[3] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 149
		rightWingModel[4] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 150
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 151
		rightWingModel[6] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 152
		rightWingModel[7] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 153
		rightWingModel[8] = new ModelRendererTurbo(this, 9, 214, textureX, textureY); // Box 154
		rightWingModel[9] = new ModelRendererTurbo(this, 177, 140, textureX, textureY); // Box 191

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 28, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 146
		rightWingModel[0].setRotationPoint(-34.5F, -32.5F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 9, 10, 40, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -8.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 147
		rightWingModel[1].setRotationPoint(-43.5F, -32.5F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 17, 10, 40, 0F,0F, 0F, 0F, 8F, -6.5F, 1F, 0F, -10.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 8F, -2.5F, 1F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 148
		rightWingModel[2].setRotationPoint(-6.5F, -32.5F, 12F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 28, 10, 85, 0F,0F, -5.5F, 0F, 0F, -5.5F, 0F, -18F, 3.5F, 0F, 1F, 3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -18F, -12F, 0F, 1F, -12F, 0F); // Box 149
		rightWingModel[3].setRotationPoint(-34.5F, -32.5F, 52F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 10, 85, 0F,0F, -8.5F, 0F, 0F, -5.5F, 0F, -1F, 3.5F, 0F, -1.5F, 3.5F, -5F, 0F, 1F, 0F, 0F, 3F, 0F, -1F, -12F, 0F, -1.5F, -12F, -5F); // Box 150
		rightWingModel[4].setRotationPoint(-43.5F, -32.5F, 52F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 9, 10, 85, 0F,-12F, -5.5F, 0F, 20F, -10.5F, 0F, -0.5F, 1F, -13F, 6F, 3.5F, 0F, -12F, 3F, 0F, 20F, 1F, 0F, -0.5F, -10.5F, -13F, 6F, -12F, 0F); // Box 151
		rightWingModel[5].setRotationPoint(-18.5F, -32.5F, 52F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 152
		rightWingModel[6].setRotationPoint(-49.5F, -27F, 37.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 153
		rightWingModel[7].setRotationPoint(-42.5F, -27F, 37.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 21, 1, 21, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingModel[8].setRotationPoint(-36.5F, -34.5F, 101F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F); // Box 191
		rightWingModel[9].setRotationPoint(-56.5F, -32F, 110F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 106
		yawFlapModel[1] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 107
		yawFlapModel[2] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[0].setRotationPoint(-44F, -30F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.43633231F;

		yawFlapModel[1].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[1].setRotationPoint(-44F, -30F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.43633231F;

		yawFlapModel[2].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[2].setRotationPoint(-44F, -30F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-37F, -24.5F, 0F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 96
		tailWheelModel[1] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 97
		tailWheelModel[2] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 98
		tailWheelModel[3] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 99
		tailWheelModel[4] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 100

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 96
		tailWheelModel[0].setRotationPoint(83.5F, -23F, -1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		tailWheelModel[1].setRotationPoint(88.5F, -19F, -1.5F);
		tailWheelModel[1].rotateAngleZ = 0.41887902F;

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		tailWheelModel[2].setRotationPoint(88.5F, -16F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		tailWheelModel[3].setRotationPoint(88.5F, -17F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F); // Box 100
		tailWheelModel[4].setRotationPoint(88.5F, -14F, -1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 155
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 156
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 157
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 158
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 159
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 160
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 161
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 162
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 163

		leftWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		leftWingWheelModel[0].setRotationPoint(-36F, -22F, -56F);
		leftWingWheelModel[0].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftWingWheelModel[1].setRotationPoint(-45F, 1.5F, -55F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftWingWheelModel[2].setRotationPoint(-45F, -2.5F, -55F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 158
		leftWingWheelModel[3].setRotationPoint(-45F, 6.5F, -55F);

		leftWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 159
		leftWingWheelModel[4].setRotationPoint(-36.5F, -22F, -57F);
		leftWingWheelModel[4].rotateAngleZ = -0.12217305F;

		leftWingWheelModel[5].addShapeBox(0F, 12F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 160
		leftWingWheelModel[5].setRotationPoint(-36.5F, -16F, -57F);
		leftWingWheelModel[5].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[6].addShapeBox(-6F, 17F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 161
		leftWingWheelModel[6].setRotationPoint(-36.5F, -16F, -57F);
		leftWingWheelModel[6].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[7].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 162
		leftWingWheelModel[7].setRotationPoint(-36F, -9F, -56F);
		leftWingWheelModel[7].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[8].addShapeBox(-0.5F, 3F, 0F, 1, 3, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingWheelModel[8].setRotationPoint(-36F, -9F, -56F);
		leftWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 153
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 154
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 155
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 156
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 157
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 158
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 159
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 160
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 161

		rightWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingWheelModel[0].setRotationPoint(-36F, -22F, 55F);
		rightWingWheelModel[0].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingWheelModel[1].setRotationPoint(-45F, 1.5F, 52F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		rightWingWheelModel[2].setRotationPoint(-45F, -2.5F, 52F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightWingWheelModel[3].setRotationPoint(-45F, 6.5F, 52F);

		rightWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 157
		rightWingWheelModel[4].setRotationPoint(-36.5F, -22F, 56F);
		rightWingWheelModel[4].rotateAngleZ = -0.12217305F;

		rightWingWheelModel[5].addShapeBox(0F, 12F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 158
		rightWingWheelModel[5].setRotationPoint(-36.5F, -16F, 56F);
		rightWingWheelModel[5].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[6].addShapeBox(-6F, 17F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 159
		rightWingWheelModel[6].setRotationPoint(-36.5F, -16F, 56F);
		rightWingWheelModel[6].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[7].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 160
		rightWingWheelModel[7].setRotationPoint(-36F, -9F, 55F);
		rightWingWheelModel[7].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[8].addShapeBox(-0.5F, 3F, 0F, 1, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingWheelModel[8].setRotationPoint(-36F, -9F, 55F);
		rightWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-92F, -28F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 332, 127, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 332, 127, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 332, 127, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 332, 127, textureX, textureY);
		prop[0].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[1].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[2].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[3].addBox(-1F, -32F, -1.5F, 2, 32, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}