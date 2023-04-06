//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ki84
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKi84 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKi84() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];
		noseModel = new ModelRendererTurbo[36];
		tailModel = new ModelRendererTurbo[13];
		leftWingModel = new ModelRendererTurbo[8];
		rightWingModel = new ModelRendererTurbo[8];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[4];
		tailWheelModel = new ModelRendererTurbo[6];
		leftWingWheelModel = new ModelRendererTurbo[9];
		rightWingWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initbodyWheelModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 55
		bodyModel[23] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 56
		bodyModel[24] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 57
		bodyModel[25] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 58
		bodyModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 59
		bodyModel[27] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 60
		bodyModel[28] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 61
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 68
		bodyModel[31] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 69
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 104
		bodyModel[35] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 105
		bodyModel[36] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 106
		bodyModel[37] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 107
		bodyModel[38] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 108
		bodyModel[39] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 109
		bodyModel[40] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 110
		bodyModel[41] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 111
		bodyModel[42] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 112
		bodyModel[43] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 114
		bodyModel[45] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 115
		bodyModel[46] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 116
		bodyModel[47] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 118
		bodyModel[49] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 119
		bodyModel[50] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 120
		bodyModel[51] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 121
		bodyModel[52] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 124
		bodyModel[55] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 125
		bodyModel[56] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 126
		bodyModel[57] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 127
		bodyModel[58] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 129
		bodyModel[60] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 130
		bodyModel[61] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 134
		bodyModel[65] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 135
		bodyModel[66] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 91
		bodyModel[69] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 221
		bodyModel[70] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 222
		bodyModel[71] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 223
		bodyModel[72] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 224
		bodyModel[73] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 225
		bodyModel[74] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 226
		bodyModel[75] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 227
		bodyModel[76] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 228
		bodyModel[77] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 229
		bodyModel[78] = new ModelRendererTurbo(this, 134, 232, textureX, textureY); // Box 178

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 9, 25, 0F,0F, -0.6F, -7F, 0F, 0.4F, -7F, 0F, 0.4F, -7F, 0F, -0.6F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		bodyModel[0].setRotationPoint(-63F, -42F, -12.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 9, 25, 0F,0F, 0.4F, -7F, 0F, 1.3F, -8.5F, 0F, 1.3F, -8.5F, 0F, 0.4F, -7F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 24
		bodyModel[1].setRotationPoint(-61F, -42F, -12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 9, 25, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -1F); // Box 25
		bodyModel[2].setRotationPoint(-61F, -33F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[3].setRotationPoint(-63F, -33F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 9, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -6F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0.5F, -6F); // Box 27
		bodyModel[4].setRotationPoint(-63F, -24F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 9, 23, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 1F, -6F); // Box 28
		bodyModel[5].setRotationPoint(-61F, -24F, -11.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -0.5F, -6F); // Box 29
		bodyModel[6].setRotationPoint(-35F, -23F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 30
		bodyModel[7].setRotationPoint(-35F, -33F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 31
		bodyModel[8].setRotationPoint(-35F, -33F, 9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 0.3F, 7F, 0F, -2F, 4.5F, 0F, -2F, -4.5F, 0F, 0.3F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F); // Box 32
		bodyModel[9].setRotationPoint(-35F, -43F, 9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 1F, 4.6F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 1F, -4.6F, 0F, 0F, 0.6F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.6F); // Box 33
		bodyModel[10].setRotationPoint(-23F, -40F, 9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 0.3F, -6.5F, 0F, -2F, -4.5F, 0F, -2F, 4.5F, 0F, 0.3F, 7F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F); // Box 34
		bodyModel[11].setRotationPoint(-35F, -43F, -10.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 1F, -4.6F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 1F, 4.6F, 0F, 0F, -0.6F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.6F); // Box 35
		bodyModel[12].setRotationPoint(-23F, -40F, -10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 7, 18, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -5.5F); // Box 36
		bodyModel[13].setRotationPoint(-3F, -23F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 10, 18, 0F,0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Box 37
		bodyModel[14].setRotationPoint(-3F, -33F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 7, 18, 0F,0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 38
		bodyModel[15].setRotationPoint(-3F, -40F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 2, 12, 0F,-11F, 0F, -3.5F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, -11F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(-3F, -42F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(9.5F, -59F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 43, 9, 18, 0F,0F, 0.5F, -1.5F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -1.5F); // Box 41
		bodyModel[18].setRotationPoint(16F, -33F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 43, 5, 15, 0F,0F, 1F, -3.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -3.5F, 0F, 0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, 0F); // Box 42
		bodyModel[19].setRotationPoint(16F, -39F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 43, 2, 8, 0F,0F, 0.5F, -2.5F, -8F, -1.8F, -3.5F, -8F, -1.8F, -3.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F); // Box 43
		bodyModel[20].setRotationPoint(16F, -42F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 43, 6, 15, 0F,0F, 0F, 0F, 0F, 4F, -3.5F, 0F, 4F, -3.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -6F, -6.5F, 0F, -6F, -6.5F, 0F, 0F, -5.5F); // Box 44
		bodyModel[21].setRotationPoint(16F, -24F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 7, 11, 0F,-3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 4F, 1F, 0F); // Box 55
		bodyModel[22].setRotationPoint(-58F, -20F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 27, 7, 11, 0F,0F, 0F, 0F, -5F, -2F, 0F, 10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 10F, -4F, 0F, 0F, 1F, 0F); // Box 56
		bodyModel[23].setRotationPoint(-31F, -20F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[24].setRotationPoint(-68F, -15F, -3.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F); // Box 58
		bodyModel[25].setRotationPoint(-68F, -10F, -3.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 59
		bodyModel[26].setRotationPoint(-60F, -15F, -3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.2F, -3F, -1F, -0.2F, -3F, 0F, 0F, -2F); // Box 60
		bodyModel[27].setRotationPoint(-60F, -10F, -3.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[28].setRotationPoint(-70F, -14.5F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1.5F); // Box 63
		bodyModel[29].setRotationPoint(-70F, -10.5F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 27, 7, 11, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 4F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 68
		bodyModel[30].setRotationPoint(-58F, -20F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 27, 7, 11, 0F,0F, 0F, 0F, 10F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 10F, -4F, 0F, -5F, -3F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[31].setRotationPoint(-31F, -20F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, 70F, -0.4F, -0.4F, 70F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 70F, -0.4F, -0.4F, 70F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 102
		bodyModel[32].setRotationPoint(9.5F, -57.5F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[33].setRotationPoint(-33.5F, -44F, -4F);
		bodyModel[33].rotateAngleZ = -0.89011792F;

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[34].setRotationPoint(-33.5F, -44F, -3.6F);
		bodyModel[34].rotateAngleY = -0.15707963F;
		bodyModel[34].rotateAngleZ = -0.19198622F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[35].setRotationPoint(-27.5F, -48.5F, -2.5F);
		bodyModel[35].rotateAngleX = -0.13962634F;
		bodyModel[35].rotateAngleZ = -0.90757121F;

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[36].setRotationPoint(-27.5F, -48.5F, 2.5F);
		bodyModel[36].rotateAngleX = 0.13962634F;
		bodyModel[36].rotateAngleZ = -0.90757121F;

		bodyModel[37].addShapeBox(0F, 0F, -0.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[37].setRotationPoint(-33.5F, -44F, 3.6F);
		bodyModel[37].rotateAngleY = 0.15707963F;
		bodyModel[37].rotateAngleZ = -0.19198622F;

		bodyModel[38].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[38].setRotationPoint(-27.5F, -48.2F, -2.5F);
		bodyModel[38].rotateAngleX = 0.59341195F;

		bodyModel[39].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[39].setRotationPoint(-27.5F, -48.2F, 2.5F);
		bodyModel[39].rotateAngleX = -0.59341195F;

		bodyModel[40].addShapeBox(0F, -0.5F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[40].setRotationPoint(-27.5F, -49F, 1F);

		bodyModel[41].addShapeBox(0F, 0F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[41].setRotationPoint(-22.5F, -49.5F, 1F);

		bodyModel[42].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[42].setRotationPoint(-22.5F, -48.7F, 2.7F);
		bodyModel[42].rotateAngleX = -0.59341195F;

		bodyModel[43].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[43].setRotationPoint(-22.5F, -48.7F, -2.7F);
		bodyModel[43].rotateAngleX = 0.59341195F;

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[44].setRotationPoint(-22.5F, -47.8F, -3.6F);
		bodyModel[44].rotateAngleX = -0.2443461F;
		bodyModel[44].rotateAngleZ = -0.08726646F;

		bodyModel[45].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[45].setRotationPoint(-22.5F, -47.8F, 3.6F);
		bodyModel[45].rotateAngleX = 0.2443461F;
		bodyModel[45].rotateAngleZ = -0.08726646F;

		bodyModel[46].addShapeBox(-0.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[46].setRotationPoint(-27.5F, -47.8F, 2.6F);
		bodyModel[46].rotateAngleY = 0.06981317F;
		bodyModel[46].rotateAngleZ = 0.03490659F;

		bodyModel[47].addShapeBox(-0.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[47].setRotationPoint(-27.5F, -47.8F, -2.6F);
		bodyModel[47].rotateAngleY = -0.06981317F;
		bodyModel[47].rotateAngleZ = 0.03490659F;

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[48].setRotationPoint(-4.5F, -44.5F, 3.6F);
		bodyModel[48].rotateAngleX = 0.38397244F;

		bodyModel[49].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[49].setRotationPoint(-4.5F, -45.4F, 2.5F);
		bodyModel[49].rotateAngleX = -0.59341195F;

		bodyModel[50].addShapeBox(0F, 0F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[50].setRotationPoint(-4.5F, -46.2F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[51].setRotationPoint(-4.5F, -45.4F, -2.5F);
		bodyModel[51].rotateAngleX = 0.59341195F;

		bodyModel[52].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[52].setRotationPoint(-4.5F, -44.5F, -3.6F);
		bodyModel[52].rotateAngleX = -0.38397244F;

		bodyModel[53].addShapeBox(0F, 0F, -0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[53].setRotationPoint(-23F, -41.9F, -5.2F);
		bodyModel[53].rotateAngleX = -0.2443461F;
		bodyModel[53].rotateAngleY = -0.00872665F;
		bodyModel[53].rotateAngleZ = -0.06108652F;

		bodyModel[54].addShapeBox(0F, 0F, -0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[54].setRotationPoint(-23F, -41.9F, 5.2F);
		bodyModel[54].rotateAngleX = 0.2443461F;
		bodyModel[54].rotateAngleY = 0.00872665F;
		bodyModel[54].rotateAngleZ = -0.06108652F;

		bodyModel[55].addShapeBox(-0.5F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[55].setRotationPoint(-3F, -40.9F, -5.2F);
		bodyModel[55].rotateAngleY = 0.38397244F;
		bodyModel[55].rotateAngleZ = 0.13962634F;

		bodyModel[56].addShapeBox(-0.5F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 126
		bodyModel[56].setRotationPoint(-3F, -40.9F, 5.2F);
		bodyModel[56].rotateAngleY = -0.38397244F;
		bodyModel[56].rotateAngleZ = 0.13962634F;

		bodyModel[57].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[57].setRotationPoint(-13.5F, -47.5F, -3.6F);
		bodyModel[57].rotateAngleX = -0.2443461F;
		bodyModel[57].rotateAngleZ = -0.08726646F;

		bodyModel[58].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-13.5F, -48.4F, -2.5F);
		bodyModel[58].rotateAngleX = 0.59341195F;

		bodyModel[59].addShapeBox(0F, 0F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[59].setRotationPoint(-13.5F, -49.2F, 1F);

		bodyModel[60].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[60].setRotationPoint(-13.5F, -48.4F, 2.5F);
		bodyModel[60].rotateAngleX = -0.59341195F;

		bodyModel[61].addShapeBox(0F, 0F, -0.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[61].setRotationPoint(-13.5F, -47.5F, 3.6F);
		bodyModel[61].rotateAngleX = 0.2443461F;
		bodyModel[61].rotateAngleZ = -0.08726646F;

		bodyModel[62].addShapeBox(0F, 0F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[62].setRotationPoint(-22.5F, -49.5F, 0F);
		bodyModel[62].rotateAngleZ = 0.03490659F;

		bodyModel[63].addShapeBox(0F, 0F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[63].setRotationPoint(-12.5F, -49F, 0F);
		bodyModel[63].rotateAngleZ = -0.27925268F;

		bodyModel[64].addShapeBox(0F, -0.5F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[64].setRotationPoint(-4F, -46.5F, 0F);
		bodyModel[64].rotateAngleZ = -0.34906585F;

		bodyModel[65].addShapeBox(0F, 0F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[65].setRotationPoint(-17.5F, -49.7F, 0F);
		bodyModel[65].rotateAngleZ = -0.10471976F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[66].setRotationPoint(-10F, -46F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 18, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[67].setRotationPoint(-10F, -42F, -2F);
		bodyModel[67].rotateAngleZ = -0.12217305F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 9, 4, 0F,0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[68].setRotationPoint(-19F, -30F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 6, 20, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F, 0F, 0.8F, -2F); // Box 221
		bodyModel[69].setRotationPoint(-34.8F, -40F, -10F);
		bodyModel[69].rotateAngleZ = 0.27925268F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[70].setRotationPoint(-22F, -43.2F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[71].setRotationPoint(-25.5F, -43F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[72].setRotationPoint(-23F, -46.05F, -1F);

		bodyModel[73].addShapeBox(0F, 0.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[73].setRotationPoint(-26F, -42F, -9.5F);
		bodyModel[73].rotateAngleZ = 0.27925268F;

		bodyModel[74].addShapeBox(0F, 0.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[74].setRotationPoint(-26F, -42F, -10.5F);
		bodyModel[74].rotateAngleZ = 0.27925268F;

		bodyModel[75].addShapeBox(0F, 3.5F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[75].setRotationPoint(-26F, -42F, -10F);
		bodyModel[75].rotateAngleZ = 0.27925268F;

		bodyModel[76].addShapeBox(0F, 3.5F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[76].setRotationPoint(-26F, -42F, -10F);
		bodyModel[76].rotateAngleZ = 0.27925268F;

		bodyModel[77].addShapeBox(0F, 2.5F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[77].setRotationPoint(-26F, -42F, -10F);
		bodyModel[77].rotateAngleZ = 0.27925268F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -0.4F, -2.7F, 0F, -1.1F, -3F, 0F, -1.1F, -3F, 0F, -0.4F, -2.7F, 0F, 0.35F, -1F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0.35F, -1F); // Box 178
		bodyModel[78].setRotationPoint(30F, -42F, -4F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		noseModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		noseModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		noseModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 5
		noseModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 6
		noseModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		noseModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		noseModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		noseModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		noseModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 11
		noseModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		noseModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 13
		noseModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 14
		noseModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 15
		noseModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
		noseModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		noseModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		noseModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		noseModel[19] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 20
		noseModel[20] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 21
		noseModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		noseModel[22] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 82
		noseModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 84
		noseModel[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 164
		noseModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 165
		noseModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 166
		noseModel[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 167
		noseModel[28] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 168
		noseModel[29] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 169
		noseModel[30] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 170
		noseModel[31] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 171
		noseModel[32] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 172
		noseModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 173
		noseModel[34] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 174
		noseModel[35] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 178

		noseModel[0].addShapeBox(0F, 0F, 0F, 15, 9, 25, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		noseModel[0].setRotationPoint(-78F, -33F, -12.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 25, 0F,0F, 0F, -8F, 0F, 1.5F, -7F, 0F, 1.5F, -7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		noseModel[1].setRotationPoint(-78F, -41F, -12.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 9, 25, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 0F, -8F); // Box 3
		noseModel[2].setRotationPoint(-78F, -24F, -12.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 8, 23, 0F,0F, -1F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 4
		noseModel[3].setRotationPoint(-83F, -41F, -11.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 9, 23, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 5
		noseModel[4].setRotationPoint(-83F, -33F, -11.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 9, 23, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7.5F); // Box 6
		noseModel[5].setRotationPoint(-83F, -24F, -11.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, 0F, -1F); // Box 7
		noseModel[6].setRotationPoint(-86F, -38F, -4F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0.5F, 0F, 1F, 0F, -2F, 1F, 0F, 3F, -3F, 0.5F, 3F, -4.5F); // Box 8
		noseModel[7].setRotationPoint(-86F, -38F, 4F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 9
		noseModel[8].setRotationPoint(-86F, -33F, 6F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, 0F, 1F, 0F, -2F, 1F, 0F, 3F, -3F, 0.5F, 3F, -4.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, -6F, -2F); // Box 10
		noseModel[9].setRotationPoint(-86F, -21F, 4F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0.5F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 11
		noseModel[10].setRotationPoint(-86F, -21F, -4F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, -5F, -2F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 3F, -4.5F, 0F, 3F, -3F, 0F, -2F, 1F, 0.5F, 0F, 1F); // Box 12
		noseModel[11].setRotationPoint(-86F, -38F, -10F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 3, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0.5F); // Box 13
		noseModel[12].setRotationPoint(-86F, -33F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0.5F, 3F, -4.5F, 0F, 3F, -3F, 0F, -2F, 1F, 0.5F, 0F, 1F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 14
		noseModel[13].setRotationPoint(-86F, -21F, -10F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		noseModel[14].setRotationPoint(-88F, -30.5F, -2F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F); // Box 16
		noseModel[15].setRotationPoint(-94F, -29.5F, -3F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, -2F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F); // Box 17
		noseModel[16].setRotationPoint(-94F, -31.5F, -3F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, -2F); // Box 18
		noseModel[17].setRotationPoint(-94F, -27.5F, -3F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		noseModel[18].setRotationPoint(-97F, -29.5F, -3F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		noseModel[19].setRotationPoint(-97F, -31.5F, -3F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, -1F, -2F); // Box 21
		noseModel[20].setRotationPoint(-97F, -27.5F, -3F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 22
		noseModel[21].setRotationPoint(-98F, -29F, -0.5F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0.1F, -0.1F, 0F, -0.1F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, -0.1F, -0.1F); // Box 82
		noseModel[22].setRotationPoint(-74.5F, -42F, -5F);

		noseModel[23].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		noseModel[23].setRotationPoint(-63.2F, -37F, -8F);
		noseModel[23].rotateAngleY = -0.68067841F;
		noseModel[23].rotateAngleZ = 0.15707963F;

		noseModel[24].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		noseModel[24].setRotationPoint(-63.2F, -36F, -8.5F);
		noseModel[24].rotateAngleY = -0.68067841F;
		noseModel[24].rotateAngleZ = 0.15707963F;

		noseModel[25].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		noseModel[25].setRotationPoint(-63.2F, -28.5F, -11.5F);
		noseModel[25].rotateAngleY = -0.68067841F;
		noseModel[25].rotateAngleZ = 0.15707963F;

		noseModel[26].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		noseModel[26].setRotationPoint(-63.2F, -27F, -11.5F);
		noseModel[26].rotateAngleY = -0.68067841F;
		noseModel[26].rotateAngleZ = 0.15707963F;

		noseModel[27].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		noseModel[27].setRotationPoint(-63.2F, -24.5F, -11.5F);
		noseModel[27].rotateAngleY = -0.68067841F;
		noseModel[27].rotateAngleZ = 0.15707963F;

		noseModel[28].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		noseModel[28].setRotationPoint(-63.2F, -25.7F, -11.5F);
		noseModel[28].rotateAngleY = -0.68067841F;
		noseModel[28].rotateAngleZ = 0.15707963F;

		noseModel[29].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		noseModel[29].setRotationPoint(-63.2F, -28.5F, 11.5F);
		noseModel[29].rotateAngleY = 0.68067841F;
		noseModel[29].rotateAngleZ = 0.15707963F;

		noseModel[30].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		noseModel[30].setRotationPoint(-63.2F, -27F, 11.5F);
		noseModel[30].rotateAngleY = 0.68067841F;
		noseModel[30].rotateAngleZ = 0.15707963F;

		noseModel[31].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		noseModel[31].setRotationPoint(-63.2F, -24.5F, 11.5F);
		noseModel[31].rotateAngleY = 0.68067841F;
		noseModel[31].rotateAngleZ = 0.15707963F;

		noseModel[32].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		noseModel[32].setRotationPoint(-63.2F, -25.7F, 11.5F);
		noseModel[32].rotateAngleY = 0.68067841F;
		noseModel[32].rotateAngleZ = 0.15707963F;

		noseModel[33].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		noseModel[33].setRotationPoint(-63.2F, -37F, 8.2F);
		noseModel[33].rotateAngleY = 0.68067841F;
		noseModel[33].rotateAngleZ = 0.15707963F;

		noseModel[34].addShapeBox(0F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		noseModel[34].setRotationPoint(-63.2F, -36F, 8.7F);
		noseModel[34].rotateAngleY = 0.68067841F;
		noseModel[34].rotateAngleZ = 0.15707963F;

		noseModel[35].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0.1F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0.1F); // Box 178
		noseModel[35].setRotationPoint(-74.5F, -42F, 4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 45
		tailModel[1] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 46
		tailModel[2] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 47
		tailModel[3] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 48
		tailModel[4] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 49
		tailModel[5] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 50
		tailModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 54
		tailModel[7] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 74
		tailModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 75
		tailModel[9] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 76
		tailModel[10] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 77
		tailModel[11] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 78
		tailModel[12] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 79

		tailModel[0].addShapeBox(0F, 0F, 0F, 26, 6, 8, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F); // Box 45
		tailModel[0].setRotationPoint(59F, -34F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, -3F); // Box 46
		tailModel[1].setRotationPoint(59F, -28F, -4F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 26, 4, 8, 0F,0F, 1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F); // Box 47
		tailModel[2].setRotationPoint(59F, -38F, -4F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 26, 4, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 48
		tailModel[3].setRotationPoint(59F, -41F, -0.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 49
		tailModel[4].setRotationPoint(73F, -54F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		tailModel[5].setRotationPoint(73F, -58F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-3F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[6].setRotationPoint(77F, -59F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 74
		tailModel[7].setRotationPoint(52F, -36F, -7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 26, 2, 35, 0F,-9.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		tailModel[8].setRotationPoint(52F, -36F, -42F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		tailModel[9].setRotationPoint(61.5F, -36F, -44F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailModel[10].setRotationPoint(52F, -36F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 26, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -9.5F, 0F, 0F); // Box 78
		tailModel[11].setRotationPoint(52F, -36F, 7F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 79
		tailModel[12].setRotationPoint(61.5F, -36F, 42F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 64
		leftWingModel[1] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 65
		leftWingModel[2] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 66
		leftWingModel[3] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 67
		leftWingModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 78
		leftWingModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 79
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 175
		leftWingModel[7] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 177

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 17, 2, 93, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 8F, -5F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 10F, 0F, -1F, 10F, 0F); // Box 64
		leftWingModel[0].setRotationPoint(-56F, -25F, -104F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 17, 2, 93, 0F,0F, 0.5F, 0F, -8F, 1F, 0F, 13F, -7F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 13F, 7F, 0F, -8F, 10F, 0F); // Box 65
		leftWingModel[1].setRotationPoint(-39F, -25F, -104F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,-4F, 0F, -1F, -2F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, -0.5F, -1F, -2F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[2].setRotationPoint(-56F, -25F, -109F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,2F, 0.5F, 1F, -4F, 0.5F, -1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 2F, -1F, 1F, -4F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 67
		leftWingModel[3].setRotationPoint(-39F, -25F, -109F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[4].setRotationPoint(-58F, -17.5F, -34.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 79
		leftWingModel[5].setRotationPoint(-60F, -17.5F, -34.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftWingModel[6].setRotationPoint(-53F, -24F, -85F);
		leftWingModel[6].rotateAngleX = -0.06108652F;
		leftWingModel[6].rotateAngleZ = 0.03490659F;

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		leftWingModel[7].setRotationPoint(-53F, -21.2F, -85F);
		leftWingModel[7].rotateAngleX = -0.1134464F;
		leftWingModel[7].rotateAngleZ = 0.03490659F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 70
		rightWingModel[1] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 71
		rightWingModel[2] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 72
		rightWingModel[3] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 73
		rightWingModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 80
		rightWingModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 81
		rightWingModel[6] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 152
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 176

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 17, 2, 93, 0F,-1F, -7F, 0F, 8F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 10F, 0F, 8F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightWingModel[0].setRotationPoint(-56F, -25F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 17, 2, 93, 0F,-8F, -5F, 0F, 13F, -7F, 0F, -8F, 1F, 0F, 0F, 0.5F, 0F, -8F, 10F, 0F, 13F, 7F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Box 71
		rightWingModel[1].setRotationPoint(-39F, -25F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 1F, -4F, -0.5F, -1F); // Box 72
		rightWingModel[2].setRotationPoint(-56F, -25F, 104F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 5, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, -4F, 0.5F, -1F, 2F, 0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, -1F, 2F, -1F, 1F); // Box 73
		rightWingModel[3].setRotationPoint(-39F, -25F, 104F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		rightWingModel[4].setRotationPoint(-58F, -17.5F, 33.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 81
		rightWingModel[5].setRotationPoint(-60F, -17.5F, 33.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightWingModel[6].setRotationPoint(-53F, -23F, 60F);
		rightWingModel[6].rotateAngleX = 0.06108652F;

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightWingModel[7].setRotationPoint(-53F, -19F, 60F);
		rightWingModel[7].rotateAngleX = 0.1134464F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		yawFlapModel[1] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 52
		yawFlapModel[2] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 53
		yawFlapModel[3] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 106
		yawFlapModel[4] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 107
		yawFlapModel[5] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 232

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 6, 7, 1, 0F,0F, -1F, 0F, -2F, -3.5F, 0F, -2F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		yawFlapModel[0].setRotationPoint(85F, -58F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 6, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 52
		yawFlapModel[1].setRotationPoint(85F, -51F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -0.5F, 8, 10, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 53
		yawFlapModel[2].setRotationPoint(85F, -37F, 0F);

		yawFlapModel[3].addShapeBox(-4F, 0F, 2.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[3].setRotationPoint(-27F, -24.3F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.43633231F;

		yawFlapModel[4].addShapeBox(-4F, 0F, -5.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[4].setRotationPoint(-27F, -24.3F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[5].setRotationPoint(-27F, -24.3F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.43633231F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(-0.5F, -16F, -0.5F, 1, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[0].setRotationPoint(-21F, -23.5F, 0F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 92
		bodyWheelModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 93
		bodyWheelModel[2] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 162
		bodyWheelModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 163

		bodyWheelModel[0].addShapeBox(-6F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 92
		bodyWheelModel[0].setRotationPoint(-49.5F, -12F, -2F);
		bodyWheelModel[0].rotateAngleZ = -0.17453293F;

		bodyWheelModel[1].addShapeBox(0F, -5F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 93
		bodyWheelModel[1].setRotationPoint(-49.5F, -12F, -2F);
		bodyWheelModel[1].rotateAngleZ = -0.17453293F;

		bodyWheelModel[2].addShapeBox(-6F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 162
		bodyWheelModel[2].setRotationPoint(-49.5F, -12F, 1F);
		bodyWheelModel[2].rotateAngleZ = -0.17453293F;

		bodyWheelModel[3].addShapeBox(0F, -5F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 163
		bodyWheelModel[3].setRotationPoint(-49.5F, -12F, 1F);
		bodyWheelModel[3].rotateAngleZ = -0.17453293F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 96
		tailWheelModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 97
		tailWheelModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 98
		tailWheelModel[3] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 99
		tailWheelModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 100
		tailWheelModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 101

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 96
		tailWheelModel[0].setRotationPoint(68F, -27F, -0.5F);
		tailWheelModel[0].rotateAngleZ = 0.27925268F;

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 97
		tailWheelModel[1].setRotationPoint(69F, -23F, -0.5F);
		tailWheelModel[1].rotateAngleZ = 0.9250245F;

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 98
		tailWheelModel[2].setRotationPoint(71F, -21.2F, -0.5F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 99
		tailWheelModel[3].setRotationPoint(71F, -22.6F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F); // Box 100
		tailWheelModel[4].setRotationPoint(71F, -19.8F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, 0.5F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 101
		tailWheelModel[5].setRotationPoint(72F, -27F, -0.5F);
		tailWheelModel[5].rotateAngleZ = -0.62831853F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 85
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 86
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 87
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 88
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 89
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 90
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 91
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 94
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 95

		leftWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingWheelModel[0].setRotationPoint(-53F, -15F, -28F);
		leftWingWheelModel[0].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		leftWingWheelModel[1].setRotationPoint(-62F, 1.5F, -27F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftWingWheelModel[2].setRotationPoint(-62F, -2.5F, -27F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 88
		leftWingWheelModel[3].setRotationPoint(-62F, 6.5F, -27F);

		leftWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 89
		leftWingWheelModel[4].setRotationPoint(-53.5F, -15F, -29F);
		leftWingWheelModel[4].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 90
		leftWingWheelModel[5].setRotationPoint(-53.5F, -15F, -29F);
		leftWingWheelModel[5].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 91
		leftWingWheelModel[6].setRotationPoint(-53.5F, -15F, -29F);
		leftWingWheelModel[6].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 94
		leftWingWheelModel[7].setRotationPoint(-53F, -8F, -28F);
		leftWingWheelModel[7].rotateAngleZ = -0.17453293F;

		leftWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingWheelModel[8].setRotationPoint(-53F, -8F, -28F);
		leftWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 153
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 154
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 155
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 156
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 157
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 158
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 159
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 160
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 161

		rightWingWheelModel[0].addShapeBox(0F, -1F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingWheelModel[0].setRotationPoint(-53F, -15F, 27F);
		rightWingWheelModel[0].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingWheelModel[1].setRotationPoint(-62F, 1.5F, 24F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		rightWingWheelModel[2].setRotationPoint(-62F, -2.5F, 24F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 156
		rightWingWheelModel[3].setRotationPoint(-62F, 6.5F, 24F);

		rightWingWheelModel[4].addShapeBox(0F, -1F, 0F, 3, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 157
		rightWingWheelModel[4].setRotationPoint(-53.5F, -15F, 28F);
		rightWingWheelModel[4].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[5].addShapeBox(0F, 11F, 0F, 3, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 158
		rightWingWheelModel[5].setRotationPoint(-53.5F, -15F, 28F);
		rightWingWheelModel[5].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[6].addShapeBox(-6F, 16F, 0F, 15, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 159
		rightWingWheelModel[6].setRotationPoint(-53.5F, -15F, 28F);
		rightWingWheelModel[6].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[7].addShapeBox(-0.5F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 160
		rightWingWheelModel[7].setRotationPoint(-53F, -8F, 27F);
		rightWingWheelModel[7].rotateAngleZ = -0.17453293F;

		rightWingWheelModel[8].addShapeBox(-0.5F, 2F, 0F, 1, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		rightWingWheelModel[8].setRotationPoint(-53F, -8F, 27F);
		rightWingWheelModel[8].rotateAngleZ = -0.17453293F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-90F, -28.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 426, 170, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 426, 170, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 426, 170, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 426, 170, textureX, textureY);
		prop[0].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[1].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[2].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[3].addBox(-1F, -29F, -1.5F, 2, 29, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}