//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Caproni
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCaproni extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCaproni() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[93];
		noseModel = new ModelRendererTurbo[27];
		tailModel = new ModelRendererTurbo[11];
		leftWingModel = new ModelRendererTurbo[6];
		rightWingModel = new ModelRendererTurbo[6];
		yawFlapModel = new ModelRendererTurbo[7];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[4];
		rightWingWheelModel = new ModelRendererTurbo[4];

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
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 31
		bodyModel[4] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 36
		bodyModel[7] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 42
		bodyModel[12] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 58
		bodyModel[15] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 64
		bodyModel[16] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 65
		bodyModel[17] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 71
		bodyModel[18] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 76
		bodyModel[19] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 81
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 84
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 85
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 86
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 107
		bodyModel[48] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 109
		bodyModel[50] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 113
		bodyModel[54] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 114
		bodyModel[55] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 115
		bodyModel[56] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 116
		bodyModel[57] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 117
		bodyModel[58] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 118
		bodyModel[59] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 119
		bodyModel[60] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 120
		bodyModel[61] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 121
		bodyModel[62] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 122
		bodyModel[63] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 123
		bodyModel[64] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 124
		bodyModel[65] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 125
		bodyModel[66] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 126
		bodyModel[67] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 127
		bodyModel[68] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 89
		bodyModel[69] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 90
		bodyModel[70] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 91
		bodyModel[71] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 142
		bodyModel[72] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 143
		bodyModel[73] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 144
		bodyModel[74] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 221
		bodyModel[75] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 222
		bodyModel[76] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 223
		bodyModel[77] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 224
		bodyModel[78] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 225
		bodyModel[79] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 226
		bodyModel[80] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 227
		bodyModel[81] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 228
		bodyModel[82] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 229
		bodyModel[83] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Box 158
		bodyModel[84] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 159
		bodyModel[85] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 160
		bodyModel[86] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 161
		bodyModel[87] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 157
		bodyModel[88] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 158
		bodyModel[89] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 159
		bodyModel[90] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 160
		bodyModel[91] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 161
		bodyModel[92] = new ModelRendererTurbo(this, 136, 320, textureX, textureY); // Box 162

		bodyModel[0].addShapeBox(0F, 0F, 0F, 31, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 11F); // Box 3
		bodyModel[0].setRotationPoint(-71F, -52F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 31, 10, 12, 0F,0F, 0F, 11F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(-71F, -31F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 31, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-71F, -42F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 71, 10, 9, 0F,0F, 0F, 12F, 0F, 0F, 11F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		bodyModel[3].setRotationPoint(-40F, -31F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 71, 11, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(-40F, -42F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 71, 8, 1, 0F,0F, 0F, -7.8F, 0F, 1F, -8.8F, 0F, 1F, 8.8F, 0F, 0F, 8.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(-40F, -50F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 10, 8, 0F,0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[6].setRotationPoint(31F, -31F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 11, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[7].setRotationPoint(31F, -42F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F); // Box 39
		bodyModel[8].setRotationPoint(31F, -51F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 44, 10, 8, 0F,0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[9].setRotationPoint(51F, -31F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 44, 11, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[10].setRotationPoint(51F, -42F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 44, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F); // Box 42
		bodyModel[11].setRotationPoint(51F, -51F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 71, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 43
		bodyModel[12].setRotationPoint(-40F, -42F, 14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 71, 8, 1, 0F,0F, 0F, 8.8F, 0F, 1F, 8.8F, 0F, 1F, -8.8F, 0F, 0F, -7.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 44
		bodyModel[13].setRotationPoint(-40F, -50F, 14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 29, 8, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -6F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[14].setRotationPoint(-22F, -24F, -31F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 36, 8, 31, 0F,12F, 4F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 64
		bodyModel[15].setRotationPoint(-58F, -24F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 8, 31, 0F,0F, 6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[16].setRotationPoint(-22F, -24F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 36, 8, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 12F, 4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 71
		bodyModel[17].setRotationPoint(-58F, -24F, -31F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 44, 2, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F); // Box 76
		bodyModel[18].setRotationPoint(51F, -49F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -8F, 0F, 0F); // Box 78
		bodyModel[19].setRotationPoint(81F, -49F, 48F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 44, 2, 42, 0F,-30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[20].setRotationPoint(51F, -49F, -48F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 2, 7, 0F,-8F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[21].setRotationPoint(81F, -49F, -55F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 10F, -0.1F, -1F, 10F, -0.1F, 2.2F, 0F, 0F, 2.1F); // Box 82
		bodyModel[22].setRotationPoint(-40F, -52F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2.1F, 10F, -0.1F, 2.2F, 10F, -0.1F, -1F, 0F, 0F, -1F); // Box 83
		bodyModel[23].setRotationPoint(-40F, -52F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[24].setRotationPoint(-31F, -56F, 3F);
		bodyModel[24].rotateAngleZ = -1.04719755F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[25].setRotationPoint(-31F, -56F, -4F);
		bodyModel[25].rotateAngleZ = -1.04719755F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[26].setRotationPoint(-31F, -56F, 3F);
		bodyModel[26].rotateAngleX = 0.45378561F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[27].setRotationPoint(-31F, -56F, -4F);
		bodyModel[27].rotateAngleX = -0.45378561F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[28].setRotationPoint(-31F, -57.5F, 0F);
		bodyModel[28].rotateAngleX = -0.29670597F;

		bodyModel[29].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[29].setRotationPoint(-31F, -57.5F, 0F);
		bodyModel[29].rotateAngleX = 0.29670597F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 90
		bodyModel[30].setRotationPoint(16.5F, -55F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 91
		bodyModel[31].setRotationPoint(16.5F, -57F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 74, 5, 10, 0F,0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 0F, 1F); // Box 92
		bodyModel[32].setRotationPoint(21.5F, -55F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 74, 2, 6, 0F,0F, 0F, -1F, 2F, -6.2F, -1F, 2F, -6.2F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 0F, 1F); // Box 93
		bodyModel[33].setRotationPoint(21.5F, -57F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[34].setRotationPoint(-6F, -57F, -4F);
		bodyModel[34].rotateAngleX = -0.38397244F;

		bodyModel[35].addShapeBox(0F, 0F, -4F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[35].setRotationPoint(-6F, -58F, 0F);
		bodyModel[35].rotateAngleX = 0.29670597F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[36].setRotationPoint(-6F, -58F, 0F);
		bodyModel[36].rotateAngleX = -0.29670597F;

		bodyModel[37].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[37].setRotationPoint(-6F, -57F, 4F);
		bodyModel[37].rotateAngleX = 0.38397244F;

		bodyModel[38].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[38].setRotationPoint(5F, -57F, 4F);
		bodyModel[38].rotateAngleX = 0.38397244F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[39].setRotationPoint(5F, -57F, -4F);
		bodyModel[39].rotateAngleX = -0.38397244F;

		bodyModel[40].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(-0.5F, -57F, 4F);
		bodyModel[40].rotateAngleX = 0.38397244F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[41].setRotationPoint(-0.5F, -57F, -4F);
		bodyModel[41].rotateAngleX = -0.38397244F;

		bodyModel[42].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[42].setRotationPoint(-24.5F, -57F, 4F);
		bodyModel[42].rotateAngleX = 0.38397244F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[43].setRotationPoint(-24.5F, -57F, -4F);
		bodyModel[43].rotateAngleX = -0.38397244F;

		bodyModel[44].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[44].setRotationPoint(-19F, -57F, 4F);
		bodyModel[44].rotateAngleX = 0.38397244F;

		bodyModel[45].addShapeBox(0F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[45].setRotationPoint(-30F, -57F, 4F);
		bodyModel[45].rotateAngleX = 0.38397244F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[46].setRotationPoint(-19F, -57F, -4F);
		bodyModel[46].rotateAngleX = -0.38397244F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[47].setRotationPoint(-30F, -57F, -4F);
		bodyModel[47].rotateAngleX = -0.38397244F;

		bodyModel[48].addShapeBox(0F, 0F, -4F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[48].setRotationPoint(-30F, -58F, 0F);
		bodyModel[48].rotateAngleX = 0.29670597F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[49].setRotationPoint(-30F, -58F, 0F);
		bodyModel[49].rotateAngleX = -0.29670597F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[50].setRotationPoint(-18F, -57.7F, 0F);
		bodyModel[50].rotateAngleX = -0.29670597F;

		bodyModel[51].addShapeBox(0F, 0F, -4F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[51].setRotationPoint(-18F, -57.7F, 0F);
		bodyModel[51].rotateAngleX = 0.29670597F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[52].setRotationPoint(-18F, -56.5F, -3.7F);
		bodyModel[52].rotateAngleX = -0.38397244F;

		bodyModel[53].addShapeBox(0F, 0F, -1F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[53].setRotationPoint(-18F, -56.5F, 3.7F);
		bodyModel[53].rotateAngleX = 0.38397244F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[54].setRotationPoint(6F, -56.5F, -3.7F);
		bodyModel[54].rotateAngleX = -0.38397244F;

		bodyModel[55].addShapeBox(0F, 0F, -1F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[55].setRotationPoint(6F, -56.5F, 3.7F);
		bodyModel[55].rotateAngleX = 0.38397244F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[56].setRotationPoint(6F, -57.7F, 0F);
		bodyModel[56].rotateAngleX = -0.29670597F;

		bodyModel[57].addShapeBox(0F, 0F, -4F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[57].setRotationPoint(6F, -57.7F, 0F);
		bodyModel[57].rotateAngleX = 0.29670597F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,11F, 2F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 11F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[58].setRotationPoint(56F, -21F, -2F);
		bodyModel[58].rotateAngleZ = 0.10471976F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[59].setRotationPoint(63F, -13.2F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[60].setRotationPoint(63F, -15.2F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 121
		bodyModel[61].setRotationPoint(63F, -11.2F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[62].setRotationPoint(62F, -16.2F, -1.5F);
		bodyModel[62].rotateAngleZ = 0.61086524F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 41, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -6F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 15F, -6F, 0F); // Box 123
		bodyModel[63].setRotationPoint(67.5F, -55F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 25, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 124
		bodyModel[64].setRotationPoint(71.5F, -61F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 21, 8, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 125
		bodyModel[65].setRotationPoint(75.5F, -69F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 17, 9, 2, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[66].setRotationPoint(79.5F, -78F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,-4F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[67].setRotationPoint(89.5F, -82F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[68].setRotationPoint(-18.5F, -55F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 18, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[69].setRotationPoint(-19F, -51F, -1F);
		bodyModel[69].rotateAngleZ = -0.12217305F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[70].setRotationPoint(-26F, -39F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 142
		bodyModel[71].setRotationPoint(6.5F, -55F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 18, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 143
		bodyModel[72].setRotationPoint(6F, -51F, -1F);
		bodyModel[72].rotateAngleZ = -0.12217305F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 144
		bodyModel[73].setRotationPoint(-1F, -39F, -1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 221
		bodyModel[74].setRotationPoint(-36F, -51.2F, -9F);
		bodyModel[74].rotateAngleZ = 0.27925268F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[75].setRotationPoint(-32F, -51.9F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[76].setRotationPoint(-35.5F, -51.7F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[77].setRotationPoint(-33F, -54.75F, -1F);

		bodyModel[78].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[78].setRotationPoint(-36F, -51.2F, -9.5F);
		bodyModel[78].rotateAngleZ = 0.27925268F;

		bodyModel[79].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[79].setRotationPoint(-36F, -51.2F, -10.5F);
		bodyModel[79].rotateAngleZ = 0.27925268F;

		bodyModel[80].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[80].setRotationPoint(-36F, -51.2F, -10F);
		bodyModel[80].rotateAngleZ = 0.27925268F;

		bodyModel[81].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[81].setRotationPoint(-36F, -51.2F, -10F);
		bodyModel[81].rotateAngleZ = 0.27925268F;

		bodyModel[82].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[82].setRotationPoint(-36F, -51.2F, -10F);
		bodyModel[82].rotateAngleZ = 0.27925268F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 5, 10, 0F,0F, -0.1F, -1F, 0F, -1.5F, -0.95F, 0F, -1.5F, -0.95F, 0F, -0.1F, -1F, 0F, 0F, 1F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 1F); // Box 158
		bodyModel[83].setRotationPoint(31F, -54.5F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 20, 4, 10, 0F,0F, -0.45F, -2.9F, 0F, -2F, -2.8F, 0F, -2F, -2.8F, 0F, -0.45F, -2.9F, 0F, -1.6F, -0.95F, 0F, -0.2F, -0.95F, 0F, -0.2F, -0.95F, 0F, -1.6F, -0.95F); // Box 159
		bodyModel[84].setRotationPoint(31F, -56.8F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 26, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 160
		bodyModel[85].setRotationPoint(91.5F, -79F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 161
		bodyModel[86].setRotationPoint(81.5F, -69F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[87].setRotationPoint(-71F, -22F, 26F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[88].setRotationPoint(-74F, -22F, 22F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[89].setRotationPoint(-74F, -22F, 22F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[90].setRotationPoint(-71F, -22F, -27F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[91].setRotationPoint(-74F, -22F, -23F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[92].setRotationPoint(-74F, -22F, -23F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		noseModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 6
		noseModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		noseModel[4] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 8
		noseModel[5] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 9
		noseModel[6] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 10
		noseModel[7] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 11
		noseModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		noseModel[9] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 13
		noseModel[10] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 14
		noseModel[11] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 15
		noseModel[12] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 16
		noseModel[13] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 17
		noseModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		noseModel[15] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 19
		noseModel[16] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 20
		noseModel[17] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 21
		noseModel[18] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 22
		noseModel[19] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 23
		noseModel[20] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 24
		noseModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 25
		noseModel[22] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 26
		noseModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
		noseModel[24] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 28
		noseModel[25] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 29
		noseModel[26] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 30

		noseModel[0].addShapeBox(0F, 0F, 0F, 31, 3, 12, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1
		noseModel[0].setRotationPoint(-102F, -52F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 31, 11, 3, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		noseModel[1].setRotationPoint(-102F, -42F, 14F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 31, 3, 12, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		noseModel[2].setRotationPoint(-102F, -24F, -6F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 21, 3, 12, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 7
		noseModel[3].setRotationPoint(-123F, -50F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 21, 11, 3, 0F,0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 8
		noseModel[4].setRotationPoint(-123F, -42F, 12F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 21, 3, 12, 0F,0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 9
		noseModel[5].setRotationPoint(-123F, -26F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 31, 11, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 10
		noseModel[6].setRotationPoint(-102F, -42F, -17F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 21, 11, 3, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F); // Box 11
		noseModel[7].setRotationPoint(-123F, -42F, -15F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 31, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, -10F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -2F); // Box 12
		noseModel[8].setRotationPoint(-102F, -52F, 6F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 31, 3, 8, 0F,0F, -10F, 1F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 7F, -2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 13
		noseModel[9].setRotationPoint(-102F, -52F, -14F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 31, 3, 8, 0F,0F, 7F, -2F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -10F, 1F, 0F, -10F, 3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 14
		noseModel[10].setRotationPoint(-102F, -24F, -14F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 31, 3, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 3F, 0F, -10F, 1F); // Box 15
		noseModel[11].setRotationPoint(-102F, -24F, 6F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,0F, -5F, 1F, 0F, -2F, 0F, 0F, -10F, 4F, 0F, -11F, 0F, 0F, 5F, 1F, 0F, 2F, 0F, 0F, 7F, 1F, 0F, 8F, -3F); // Box 16
		noseModel[12].setRotationPoint(-123F, -52F, 6F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,0F, -11F, 0F, 0F, -10F, 4F, 0F, -2F, 0F, 0F, -5F, 1F, 0F, 8F, -3F, 0F, 7F, 1F, 0F, 2F, 0F, 0F, 5F, 1F); // Box 17
		noseModel[13].setRotationPoint(-123F, -52F, -11F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,0F, 5F, 1F, 0F, 2F, 0F, 0F, 7F, 1F, 0F, 8F, -3F, 0F, -5F, 1F, 0F, -2F, 0F, 0F, -10F, 4F, 0F, -11F, 0F); // Box 18
		noseModel[14].setRotationPoint(-123F, -24F, 6F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,0F, 8F, -3F, 0F, 7F, 1F, 0F, 2F, 0F, 0F, 5F, 1F, 0F, -11F, 0F, 0F, -10F, 4F, 0F, -2F, 0F, 0F, -5F, 1F); // Box 19
		noseModel[15].setRotationPoint(-123F, -24F, -11F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, -4F, -4F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -4F, -4F); // Box 20
		noseModel[16].setRotationPoint(-123F, -41F, -4.5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 14, 9, 9, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 21
		noseModel[17].setRotationPoint(-116F, -41F, -4.5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 32, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		noseModel[18].setRotationPoint(-102F, -38F, -1.5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0.5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -2F, 0.5F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, -2F); // Box 23
		noseModel[19].setRotationPoint(-126F, -47F, -5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0.5F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, -2F, 0.5F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -2F); // Box 24
		noseModel[20].setRotationPoint(-126F, -29F, -5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0.5F, -2F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -2.5F, 0.5F, -2F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -2.5F); // Box 25
		noseModel[21].setRotationPoint(-126F, -41F, 8F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F,0.5F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 2.5F, 0.5F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 2.5F); // Box 26
		noseModel[22].setRotationPoint(-126F, -41F, -11F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, -2F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -8F, -2.5F, 0.5F, 2F, 2F, 0F, 0F, 0F, 0F, 3F, -3F, 0.5F, 5F, -5.5F); // Box 27
		noseModel[23].setRotationPoint(-126F, -47F, 5F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, -8F, -2.5F, 0F, -6F, 0F, 0F, 0F, 0F, 0.5F, -2F, 2F, 0.5F, 5F, -5.5F, 0F, 3F, -3F, 0F, 0F, 0F, 0.5F, 2F, 2F); // Box 28
		noseModel[24].setRotationPoint(-126F, -47F, -11F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, 5F, -5.5F, 0F, 3F, -3F, 0F, 0F, 0F, 0.5F, 2F, 2F, 0.5F, -8F, -2.5F, 0F, -6F, 0F, 0F, 0F, 0F, 0.5F, -2F, 2F); // Box 29
		noseModel[25].setRotationPoint(-126F, -29F, -11F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, 2F, 2F, 0F, 0F, 0F, 0F, 3F, -3F, 0.5F, 5F, -5.5F, 0.5F, -2F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -8F, -2.5F); // Box 30
		noseModel[26].setRotationPoint(-126F, -29F, 5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 45
		tailModel[1] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 46
		tailModel[2] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 47
		tailModel[3] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 48
		tailModel[4] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 49
		tailModel[5] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 50
		tailModel[6] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 51
		tailModel[7] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 52
		tailModel[8] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 53
		tailModel[9] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 54
		tailModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 55

		tailModel[0].addShapeBox(0F, 0F, 0F, 9, 9, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 9F); // Box 45
		tailModel[0].setRotationPoint(95F, -51F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 9, 10, 12, 0F,0F, 0F, 9F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 9F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 46
		tailModel[1].setRotationPoint(95F, -31F, -6F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 5, 9, 12, 0F,0F, -0.5F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -0.5F, 0F, 0F, 0F, 7.5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 7.5F); // Box 47
		tailModel[2].setRotationPoint(104F, -51F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 9, 11, 30, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 48
		tailModel[3].setRotationPoint(95F, -42F, -15F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 5, 11, 22, 0F,0F, 0F, 2.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2.5F); // Box 49
		tailModel[4].setRotationPoint(104F, -42F, -11F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 5, 8, 8, 0F,0F, 0F, 9.5F, 0F, 2F, 7F, 0F, 2F, 7F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[5].setRotationPoint(104F, -31F, -4F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 2, 7, 8, 0F,0F, 0F, 7F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0F); // Box 51
		tailModel[6].setRotationPoint(109F, -33F, -4F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 7F); // Box 52
		tailModel[7].setRotationPoint(109F, -48F, -4F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 22, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 53
		tailModel[8].setRotationPoint(109F, -40F, -11F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 6, 6, 0F,0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F); // Box 54
		tailModel[9].setRotationPoint(110F, -40F, -3F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); // Box 55
		tailModel[10].setRotationPoint(121F, -39F, -2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 72
		leftWingModel[1] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 73
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 74
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 75
		leftWingModel[4] = new ModelRendererTurbo(this, 5, 371, textureX, textureY); // Box 164
		leftWingModel[5] = new ModelRendererTurbo(this, 5, 371, textureX, textureY); // Box 165

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 34, 8, 59, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 72
		leftWingModel[0].setRotationPoint(-45F, -24F, -90F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 23, 5, 43, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 11F, 0F, 0F, 13F, 0F, 0F, -3F, -2F, 0F, 0.5F, -2F, 0F, 11F, 0F, 0F, 9F, 0F, 0F); // Box 73
		leftWingModel[1].setRotationPoint(-32F, -24F, -133F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 23, 3, 5, 0F,-2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F); // Box 74
		leftWingModel[2].setRotationPoint(-32F, -24F, -138F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,-8F, 0F, 0F, -6F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, -1F, -1F, -7F, -1F, -0.8F, -1F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 75
		leftWingModel[3].setRotationPoint(-30F, -24F, -143F);

		leftWingModel[4].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F); // Box 164
		leftWingModel[4].setRotationPoint(-48F, -0.5F, -103F);

		leftWingModel[5].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, -0.2F, -9F, -9F, -0.2F, -9F, -9F, 0.9F, -9F, -9F, 0.9F, -9F); // Box 165
		leftWingModel[5].setRotationPoint(-48F, 4.5F, -103F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 66
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 68
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 69
		rightWingModel[3] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 70
		rightWingModel[4] = new ModelRendererTurbo(this, 5, 371, textureX, textureY); // Box 135
		rightWingModel[5] = new ModelRendererTurbo(this, 5, 371, textureX, textureY); // Box 166

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 34, 8, 59, 0F,13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F); // Box 66
		rightWingModel[0].setRotationPoint(-45F, -24F, 31F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 23, 5, 43, 0F,13F, 0F, 0F, 11F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 11F, 0F, 0F, 0.5F, -2F, 0F, -3F, -2F, 0F); // Box 68
		rightWingModel[1].setRotationPoint(-32F, -24F, 90F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 23, 3, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -5.5F, -0.5F, 0F); // Box 69
		rightWingModel[2].setRotationPoint(-32F, -24F, 133F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 21, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0.2F, -8F, 0F, 0F, -3F, -0.5F, 0F, -1F, -0.5F, 0F, -7F, -1F, -0.8F, -9F, -1F, -1F); // Box 70
		rightWingModel[3].setRotationPoint(-30F, -24F, 138F);

		rightWingModel[4].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F); // Box 135
		rightWingModel[4].setRotationPoint(-48F, -0.5F, 58F);

		rightWingModel[5].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0.9F, -9F, -9F, 0.9F, -9F, -9F, -0.2F, -9F, -9F, -0.2F, -9F); // Box 166
		rightWingModel[5].setRotationPoint(-48F, 4.5F, 58F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 128
		yawFlapModel[1] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 129
		yawFlapModel[2] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 130
		yawFlapModel[3] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 106
		yawFlapModel[4] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 107
		yawFlapModel[5] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 232
		yawFlapModel[6] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 162

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 7, 14, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F); // Box 128
		yawFlapModel[0].setRotationPoint(96.5F, -76F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 6, 5, 2, 0F,0F, 0.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		yawFlapModel[1].setRotationPoint(96.5F, -81F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 11, 7, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 130
		yawFlapModel[2].setRotationPoint(96.5F, -62F, 0F);

		yawFlapModel[3].addShapeBox(-4F, 0F, 2.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[3].setRotationPoint(-32F, -35.8F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-4F, 0F, -6.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[4].setRotationPoint(-32F, -35.8F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[5].setRotationPoint(-32F, -35.8F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.43633231F;

		yawFlapModel[6].addShapeBox(0F, 0F, -1F, 11, 5, 2, 0F,0F, 0F, 0.1F, -1.4F, 0F, 0.1F, -1.4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 162
		yawFlapModel[6].setRotationPoint(96.5F, -69F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -18F, -0.5F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-29F, -31F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 77

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 5, 2, 40, 0F,0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		pitchFlapRightModel[0].setRotationPoint(95F, -48F, 8F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 60
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Box 80

		pitchFlapLeftWingModel[0].addShapeBox(0F, -3F, 0F, 13, 6, 59, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		pitchFlapLeftWingModel[0].setRotationPoint(-11F, -20F, -90F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, -1F, 0F, 5, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 80
		pitchFlapLeftWingModel[1].setRotationPoint(95F, -48F, -48F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 67

		pitchFlapRightWingModel[0].addShapeBox(0F, -3F, 0F, 13, 6, 59, 0F,0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 67
		pitchFlapRightWingModel[0].setRotationPoint(-11F, -20F, 31F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 131
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 132
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 133
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 134

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingWheelModel[0].setRotationPoint(-44F, -17F, -36F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftWingWheelModel[1].setRotationPoint(-51F, 1.5F, -40F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,-5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftWingWheelModel[2].setRotationPoint(-51F, -3.5F, -40F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F); // Box 134
		leftWingWheelModel[3].setRotationPoint(-51F, 6.5F, -40F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 135
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 136
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Box 137
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 138

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightWingWheelModel[0].setRotationPoint(-44F, -17F, 34F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingWheelModel[1].setRotationPoint(-51F, 1.5F, 36F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,-5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightWingWheelModel[2].setRotationPoint(-51F, -3.5F, 36F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F); // Box 138
		rightWingWheelModel[3].setRotationPoint(-51F, 6.5F, 36F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[3][8];
		propellerModels[0] = makeProp1(-97F, -37.5F, 0F);
		propellerModels[1] = makeProp2(-88F, -37.5F, 0F);
		propellerModels[2] = makeProp3(-79F, -37.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[8];
		prop[0] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[0].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[1].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[2].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[3].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[4].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[5].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[6].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[7].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[8];
		prop[0] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[0].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[1].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[2].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[3].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[4].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[5].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[6].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[7].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -3.14159265F;
		prop[1].rotateAngleY = -3.14159265F;
		prop[2].rotateAngleY = -3.14159265F;
		prop[3].rotateAngleY = -3.14159265F;
		prop[4].rotateAngleY = -3.14159265F;
		prop[5].rotateAngleY = -3.14159265F;
		prop[6].rotateAngleY = -3.14159265F;
		prop[7].rotateAngleY = -3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[7];
		prop[0] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 94, 307, textureX, textureY);
		prop[0].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[1].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[2].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[3].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[4].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[5].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[6].addBox(-1F, -10F, -1.5F, 2, 10, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		return prop;
	}
}