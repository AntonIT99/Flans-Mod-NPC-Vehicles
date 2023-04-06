//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Saetta
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSaetta extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSaetta() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[73];
		noseModel = new ModelRendererTurbo[52];
		tailModel = new ModelRendererTurbo[11];
		leftWingModel = new ModelRendererTurbo[10];
		rightWingModel = new ModelRendererTurbo[10];
		yawFlapModel = new ModelRendererTurbo[8];
		pitchFlapLeftModel = new ModelRendererTurbo[4];
		pitchFlapRightModel = new ModelRendererTurbo[3];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 21
		bodyModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 23
		bodyModel[5] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		bodyModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 31
		bodyModel[11] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 32
		bodyModel[12] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 33
		bodyModel[13] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 38
		bodyModel[18] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 46
		bodyModel[26] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 57
		bodyModel[27] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 58
		bodyModel[28] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 81
		bodyModel[30] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 82
		bodyModel[31] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 83
		bodyModel[32] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 87
		bodyModel[33] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 88
		bodyModel[34] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 89
		bodyModel[35] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 94
		bodyModel[36] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 115
		bodyModel[37] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 117
		bodyModel[39] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 118
		bodyModel[40] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 119
		bodyModel[41] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 120
		bodyModel[42] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 121
		bodyModel[43] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 122
		bodyModel[44] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 123
		bodyModel[45] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 124
		bodyModel[46] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 125
		bodyModel[47] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 126
		bodyModel[48] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 127
		bodyModel[49] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 128
		bodyModel[50] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 130
		bodyModel[52] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 131
		bodyModel[53] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 132
		bodyModel[54] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 133
		bodyModel[55] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 134
		bodyModel[56] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 135
		bodyModel[57] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 136
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		bodyModel[59] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 90
		bodyModel[60] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 91
		bodyModel[61] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 221
		bodyModel[62] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 222
		bodyModel[63] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 223
		bodyModel[64] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 224
		bodyModel[65] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 225
		bodyModel[66] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 226
		bodyModel[67] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 227
		bodyModel[68] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 228
		bodyModel[69] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 229
		bodyModel[70] = new ModelRendererTurbo(this, 428, 197, textureX, textureY); // Box 193
		bodyModel[71] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 93
		bodyModel[72] = new ModelRendererTurbo(this, 3, 9, textureX, textureY); // Box 195

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 17, 6, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[0].setRotationPoint(-54.5F, -34F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 21, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F); // Box 20
		bodyModel[1].setRotationPoint(-47.5F, -36.5F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 23, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[2].setRotationPoint(-40.5F, -38.5F, -3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 26, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[3].setRotationPoint(-30.5F, -40.5F, -3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 17, 5, 0F,0F, -4F, 0F, 0F, -3F, 1F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 1F, 0F, 1.2F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[4].setRotationPoint(-54.5F, -34F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 17, 5, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -3F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -4F, 1F, 0F, -5F, 0F); // Box 24
		bodyModel[5].setRotationPoint(-54.5F, -34F, 3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 21, 6, 0F,0F, -5.5F, 0F, 0F, -4.5F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.3F, 0F); // Box 25
		bodyModel[6].setRotationPoint(-47.5F, -36.5F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 21, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -4.5F, 0.5F, 0F, -5.5F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0.5F, 0F, -5.5F, 0F); // Box 26
		bodyModel[7].setRotationPoint(-47.5F, -36.5F, 3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 23, 7, 0F,0F, -6.5F, -0.5F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 27
		bodyModel[8].setRotationPoint(-40.5F, -38.5F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 26, 7, 0F,0F, -7.5F, 0F, 0F, -7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[9].setRotationPoint(-30.5F, -40.5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 6, 6, 0F,0F, 0F, 7F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[10].setRotationPoint(-22.5F, -20.5F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Box 32
		bodyModel[11].setRotationPoint(-22.5F, -33.5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, -7F, 0F, -2F, -4.5F, 0F, -2F, 4.5F, 0F, 0.5F, 7F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 33
		bodyModel[12].setRotationPoint(-22.5F, -40.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, -2F, -4.5F, 0F, -1.5F, -5F, 0F, -1.5F, 5F, 0F, -2F, 4.5F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.3F); // Box 34
		bodyModel[13].setRotationPoint(-15.5F, -40.5F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F); // Box 35
		bodyModel[14].setRotationPoint(-22.5F, -33.5F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0.5F, 7F, 0F, -2F, 4.5F, 0F, -2F, -4.5F, 0F, 0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 36
		bodyModel[15].setRotationPoint(-22.5F, -40.5F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, -2F, 4.5F, 0F, -1.5F, 5F, 0F, -1.5F, -5F, 0F, -2F, -4.5F, 0F, 0F, 0.3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.3F); // Box 37
		bodyModel[16].setRotationPoint(-15.5F, -40.5F, 9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 26, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 38
		bodyModel[17].setRotationPoint(-30.5F, -40.5F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 23, 7, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -5.5F, 0F, 0F, -6.5F, -0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, -0.5F); // Box 39
		bodyModel[18].setRotationPoint(-40.5F, -38.5F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 30, 5, 6, 0F,0F, 0F, 6F, 0F, 3F, 4F, 0F, 3F, 4F, 0F, 0F, 6F, 0F, 0.5F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0.5F, 0F); // Box 40
		bodyModel[19].setRotationPoint(-0.5F, -21F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 30, 12, 18, 0F,0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 41
		bodyModel[20].setRotationPoint(-0.5F, -33F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 6, 18, 0F,0F, 0F, -4F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.5F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-0.5F, -39F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, 1F, -5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 1F, -5F, 0F, -0.2F, -1.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.2F, -1.3F); // Box 43
		bodyModel[22].setRotationPoint(18.5F, -39F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 32, 5, 4, 0F,0F, -1F, 5F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 5F, 0F, 1F, 0F, 0F, -4.5F, -1F, 0F, -4.5F, -1F, 0F, 1F, 0F); // Box 44
		bodyModel[23].setRotationPoint(29.5F, -25F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 32, 7, 6, 0F,0F, 0F, 4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 4F, 0F, 2F, 4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 4F); // Box 45
		bodyModel[24].setRotationPoint(29.5F, -33F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 32, 7, 6, 0F,0F, 0.5F, 0.5F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0.5F, 0.5F, 0F, -1.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 4F); // Box 46
		bodyModel[25].setRotationPoint(29.5F, -38.5F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 13F, 1F, 1F, 9F, 1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 13F, 0F, 0F, 9F, 0F, 0F); // Box 57
		bodyModel[26].setRotationPoint(-48F, -22F, -17F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 13.5F, 0F, 0F, 9F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -7F, 1F, -2F, -7F, 0.5F, -2F); // Box 58
		bodyModel[27].setRotationPoint(-48F, -19F, -17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,9F, 0F, 0F, 13.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.5F, -2F, -7F, 1F, -2F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 68
		bodyModel[28].setRotationPoint(-48F, -19F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[29].setRotationPoint(43.5F, -31F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 82
		bodyModel[30].setRotationPoint(43.5F, -31F, 11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 0F, 0F); // Box 83
		bodyModel[31].setRotationPoint(48.5F, -31F, 23F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[32].setRotationPoint(43.5F, -31F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,-4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 88
		bodyModel[33].setRotationPoint(43.5F, -31F, -23F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,-3F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		bodyModel[34].setRotationPoint(48.5F, -31F, -28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 15, 10, 0F,0F, 1F, -4F, 6F, -2.5F, -4F, 6F, -2.5F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 6F, 0F, -2F, 6F, 0F, -2F, 0F, 0F, 0F); // Box 94
		bodyModel[35].setRotationPoint(-5F, -47F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,9F, 1F, 1F, 13F, 1F, 1F, -3F, 0F, 0F, -5F, 0F, 0F, 9F, 0F, 0F, 13F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[36].setRotationPoint(-48F, -22F, 1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[37].setRotationPoint(-17F, -48.5F, -3F);
		bodyModel[37].rotateAngleZ = -0.66322512F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[38].setRotationPoint(-16.5F, -48.5F, -3F);
		bodyModel[38].rotateAngleX = -0.2268928F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[39].setRotationPoint(-17F, -48.5F, -3F);

		bodyModel[40].addShapeBox(-0.5F, -0.5F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[40].setRotationPoint(-13F, -48F, -3F);
		bodyModel[40].rotateAngleZ = 0.54105207F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[41].setRotationPoint(-10.5F, -43.5F, -3F);
		bodyModel[41].rotateAngleX = -0.34906585F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[42].setRotationPoint(-10.5F, -43.5F, -3F);
		bodyModel[42].rotateAngleX = -0.43633231F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[43].setRotationPoint(-17F, -48.5F, 2F);
		bodyModel[43].rotateAngleZ = -0.66322512F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[44].setRotationPoint(-16.5F, -48.5F, 2F);
		bodyModel[44].rotateAngleX = 0.2268928F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[45].setRotationPoint(-17F, -48.5F, 2F);

		bodyModel[46].addShapeBox(-0.5F, -0.5F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[46].setRotationPoint(-13F, -48F, 2F);
		bodyModel[46].rotateAngleZ = 0.54105207F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[47].setRotationPoint(-10.5F, -43.5F, 2F);
		bodyModel[47].rotateAngleX = 0.34906585F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[48].setRotationPoint(-10.5F, -43.5F, 2F);
		bodyModel[48].rotateAngleX = 0.43633231F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[49].setRotationPoint(-16F, -48.5F, -2.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-13F, -48.5F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, -0.5F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[51].setRotationPoint(-15.5F, -40F, 4F);
		bodyModel[51].rotateAngleX = 0.38397244F;
		bodyModel[51].rotateAngleY = -0.05235988F;

		bodyModel[52].addShapeBox(0F, 0F, -0.5F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[52].setRotationPoint(-15.5F, -40F, -4F);
		bodyModel[52].rotateAngleX = -0.38397244F;
		bodyModel[52].rotateAngleY = 0.05235988F;

		bodyModel[53].addShapeBox(-8F, 0F, -0.5F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[53].setRotationPoint(-15.5F, -40F, -4F);
		bodyModel[53].rotateAngleX = -0.54105207F;
		bodyModel[53].rotateAngleY = -0.33161256F;
		bodyModel[53].rotateAngleZ = -0.15707963F;

		bodyModel[54].addShapeBox(-8F, 0F, -0.5F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[54].setRotationPoint(-15.5F, -40F, 4F);
		bodyModel[54].rotateAngleX = 0.54105207F;
		bodyModel[54].rotateAngleY = 0.33161256F;
		bodyModel[54].rotateAngleZ = -0.15707963F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[55].setRotationPoint(-23F, -41.7F, -2.5F);
		bodyModel[55].rotateAngleZ = -0.48869219F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 135
		bodyModel[56].setRotationPoint(-52.5F, -37F, -3.8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 136
		bodyModel[57].setRotationPoint(-52.5F, -37F, 2.8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 89
		bodyModel[58].setRotationPoint(-6F, -47F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 18, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[59].setRotationPoint(-6F, -43F, -1F);
		bodyModel[59].rotateAngleZ = -0.12217305F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 91
		bodyModel[60].setRotationPoint(-13F, -31F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, -7F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -7F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 221
		bodyModel[61].setRotationPoint(-22F, -40.7F, -9F);
		bodyModel[61].rotateAngleZ = 0.27925268F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 222
		bodyModel[62].setRotationPoint(-18F, -41.4F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[63].setRotationPoint(-21.5F, -41.2F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 224
		bodyModel[64].setRotationPoint(-19F, -44.25F, -1F);

		bodyModel[65].addShapeBox(0F, 1F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 225
		bodyModel[65].setRotationPoint(-22F, -40.7F, -9.5F);
		bodyModel[65].rotateAngleZ = 0.27925268F;

		bodyModel[66].addShapeBox(0F, 1F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 226
		bodyModel[66].setRotationPoint(-22F, -40.7F, -10.5F);
		bodyModel[66].rotateAngleZ = 0.27925268F;

		bodyModel[67].addShapeBox(0F, 4F, 11F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 227
		bodyModel[67].setRotationPoint(-22F, -40.7F, -10F);
		bodyModel[67].rotateAngleZ = 0.27925268F;

		bodyModel[68].addShapeBox(0F, 4F, 6F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 228
		bodyModel[68].setRotationPoint(-22F, -40.7F, -10F);
		bodyModel[68].rotateAngleZ = 0.27925268F;

		bodyModel[69].addShapeBox(0F, 3F, 8.5F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 229
		bodyModel[69].setRotationPoint(-22F, -40.7F, -10F);
		bodyModel[69].rotateAngleZ = 0.27925268F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 15, 10, 0F,-16F, -4F, -4F, 6F, -2.5F, -4F, 6F, -2.5F, -4F, -16F, -4F, -4F, -16F, 0F, 0F, 32F, 0F, -2F, 32F, 0F, -2F, -16F, 0F, 0F); // Box 193
		bodyModel[70].setRotationPoint(-5F, -47F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 32F, 0F, -2F, 32F, 0F, -2F, 0F, 0F, 0F); // Box 93
		bodyModel[71].setRotationPoint(-5F, -43F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 2.7F, 0.5F, -1.8F, 2.7F, 0.5F, -1.8F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, 3.3F, 0F, 0F, 2.7F, 0F, 0F, 2.7F, 0F, 0F, 3.7F); // Box 195
		bodyModel[72].setRotationPoint(11F, -41.5F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 34, 201, textureX, textureY); // Box 1
		noseModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		noseModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		noseModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		noseModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		noseModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		noseModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		noseModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		noseModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		noseModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 13
		noseModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		noseModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 17
		noseModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		noseModel[13] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 50
		noseModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51
		noseModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 52
		noseModel[16] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 53
		noseModel[17] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 54
		noseModel[18] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 55
		noseModel[19] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 56
		noseModel[20] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 153
		noseModel[21] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 154
		noseModel[22] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 159
		noseModel[23] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 160
		noseModel[24] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 165
		noseModel[25] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 166
		noseModel[26] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 167
		noseModel[27] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 168
		noseModel[28] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 169
		noseModel[29] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 170
		noseModel[30] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 171
		noseModel[31] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 172
		noseModel[32] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 173
		noseModel[33] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 174
		noseModel[34] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 175
		noseModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 176
		noseModel[36] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 177
		noseModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 178
		noseModel[38] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 179
		noseModel[39] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 180
		noseModel[40] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 181
		noseModel[41] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 182
		noseModel[42] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 183
		noseModel[43] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 184
		noseModel[44] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 185
		noseModel[45] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 186
		noseModel[46] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 187
		noseModel[47] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 188
		noseModel[48] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 189
		noseModel[49] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 190
		noseModel[50] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 191
		noseModel[51] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 192

		noseModel[0].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 1
		noseModel[0].setRotationPoint(-74.5F, -36F, -3.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, -7F, -1F, 0.5F, -7F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, -1F, 0.5F, -7F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F); // Box 2
		noseModel[1].setRotationPoint(-74.5F, -36F, -10.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 1, 21, 7, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -7F, 0F, 0F, -7F, -1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, -7F, 0F, 0F, -7F, -1F); // Box 3
		noseModel[2].setRotationPoint(-74.5F, -36F, 3.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -7F, 0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -7F, 0.5F, 0F, -7F, 0F); // Box 4
		noseModel[3].setRotationPoint(-73F, -36F, 3.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 5
		noseModel[4].setRotationPoint(-73F, -36F, -3.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 22, 7, 0F,0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 7
		noseModel[5].setRotationPoint(-69.5F, -36.5F, -3.5F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 22, 7, 0F,0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F); // Box 8
		noseModel[6].setRotationPoint(-65.5F, -36.5F, -3.5F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, -7F, 0F, 0.5F, -7F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0.5F, -7F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 9
		noseModel[7].setRotationPoint(-73F, -36F, -10.5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 4, 23, 7, 0F,0F, -8F, 0.5F, 0F, -8F, 0.8F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -8F, 0.5F, 0F, -8F, 0.8F, 0F, -0.2F, 0F, 0F, -0.5F, 0F); // Box 12
		noseModel[8].setRotationPoint(-69.5F, -37F, -10.5F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 7, 23, 7, 0F,0F, -8F, 0.8F, 0F, -8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -8F, 0.8F, 0F, -8F, 0.5F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 13
		noseModel[9].setRotationPoint(-65.5F, -37F, -10.5F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 4, 21, 7, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 16
		noseModel[10].setRotationPoint(-58.5F, -36F, -3.5F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 4, 21, 7, 0F,0F, -7F, 0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 17
		noseModel[11].setRotationPoint(-58.5F, -36F, -10.5F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 4, 21, 7, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0.5F); // Box 18
		noseModel[12].setRotationPoint(-58.5F, -36F, 3.5F);

		noseModel[13].addShapeBox(0F, -1.5F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		noseModel[13].setRotationPoint(-78.5F, -25.5F, -1.5F);

		noseModel[14].addShapeBox(0F, -0.5F, 0F, 5, 1, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 51
		noseModel[14].setRotationPoint(-80.5F, -25.5F, -0.5F);

		noseModel[15].addShapeBox(0F, -1.5F, 0F, 3, 3, 3, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 52
		noseModel[15].setRotationPoint(-79.5F, -25.5F, -1.5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		noseModel[16].setRotationPoint(-69.5F, -17F, -2.5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.2F); // Box 54
		noseModel[17].setRotationPoint(-59.5F, -17F, -2.5F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, 0F, 0.5F, 0.2F); // Box 55
		noseModel[18].setRotationPoint(-55.5F, -17.2F, -2.5F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		noseModel[19].setRotationPoint(-54.5F, -17.2F, -1.5F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 4, 23, 7, 0F,0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -8F, 0.8F, 0F, -8F, 0.5F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -8F, 0.8F, 0F, -8F, 0.5F); // Box 153
		noseModel[20].setRotationPoint(-69.5F, -37F, 3.5F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 7, 23, 7, 0F,0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -8F, 0.5F, 0F, -8F, 0.8F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -8F, 0.5F, 0F, -8F, 0.8F); // Box 154
		noseModel[21].setRotationPoint(-65.5F, -37F, 3.5F);

		noseModel[22].addShapeBox(-2.5F, -13.2F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 159
		noseModel[22].setRotationPoint(-67.5F, -24.5F, 0F);

		noseModel[23].addShapeBox(0.5F, -13.2F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 160
		noseModel[23].setRotationPoint(-67.5F, -24.5F, 0F);

		noseModel[24].addShapeBox(0.5F, -13F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 165
		noseModel[24].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[24].rotateAngleX = 0.39269908F;

		noseModel[25].addShapeBox(-2.5F, -13F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 166
		noseModel[25].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[25].rotateAngleX = 0.39269908F;

		noseModel[26].addShapeBox(0.5F, -12.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 167
		noseModel[26].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[26].rotateAngleX = 0.78539816F;

		noseModel[27].addShapeBox(-2.5F, -12.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 168
		noseModel[27].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[27].rotateAngleX = 0.78539816F;

		noseModel[28].addShapeBox(0.5F, -13F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 169
		noseModel[28].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[28].rotateAngleX = 1.17809725F;

		noseModel[29].addShapeBox(-2.5F, -13F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 170
		noseModel[29].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[29].rotateAngleX = 1.17809725F;

		noseModel[30].addShapeBox(0.5F, -12.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 171
		noseModel[30].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[30].rotateAngleX = 1.57079633F;

		noseModel[31].addShapeBox(-2.5F, -12.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 172
		noseModel[31].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[31].rotateAngleX = 1.57079633F;

		noseModel[32].addShapeBox(0.5F, -11.8F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 173
		noseModel[32].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[32].rotateAngleX = 1.96349541F;

		noseModel[33].addShapeBox(-2.5F, -11.8F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 174
		noseModel[33].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[33].rotateAngleX = 1.96349541F;

		noseModel[34].addShapeBox(0.5F, -11F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 175
		noseModel[34].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[34].rotateAngleX = 2.35619449F;

		noseModel[35].addShapeBox(-2.5F, -11F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 176
		noseModel[35].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[35].rotateAngleX = 2.35619449F;

		noseModel[36].addShapeBox(0.5F, -11F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 177
		noseModel[36].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[36].rotateAngleX = 3.92699082F;

		noseModel[37].addShapeBox(-2.5F, -11F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 178
		noseModel[37].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[37].rotateAngleX = 3.92699082F;

		noseModel[38].addShapeBox(0.5F, -11.8F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 179
		noseModel[38].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[38].rotateAngleX = 4.3196899F;

		noseModel[39].addShapeBox(-2.5F, -11.8F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 180
		noseModel[39].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[39].rotateAngleX = 4.3196899F;

		noseModel[40].addShapeBox(0.5F, -12.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 181
		noseModel[40].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[40].rotateAngleX = 4.71238898F;

		noseModel[41].addShapeBox(-2.5F, -12.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 182
		noseModel[41].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[41].rotateAngleX = 4.71238898F;

		noseModel[42].addShapeBox(0.5F, -13F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 183
		noseModel[42].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[42].rotateAngleX = 5.10508806F;

		noseModel[43].addShapeBox(-2.5F, -13F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 184
		noseModel[43].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[43].rotateAngleX = 5.10508806F;

		noseModel[44].addShapeBox(0.5F, -12.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 185
		noseModel[44].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[44].rotateAngleX = 5.49778714F;

		noseModel[45].addShapeBox(-2.5F, -12.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 186
		noseModel[45].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[45].rotateAngleX = 5.49778714F;

		noseModel[46].addShapeBox(0.5F, -13F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 187
		noseModel[46].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[46].rotateAngleX = 5.89048623F;

		noseModel[47].addShapeBox(-2.5F, -13F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 188
		noseModel[47].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[47].rotateAngleX = 5.89048623F;

		noseModel[48].addShapeBox(-2.5F, -11.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 189
		noseModel[48].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[48].rotateAngleX = 2.74889357F;

		noseModel[49].addShapeBox(0.5F, -11.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 190
		noseModel[49].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[49].rotateAngleX = 2.74889357F;

		noseModel[50].addShapeBox(-2.5F, -11.5F, -1.5F, 3, 2, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, -1F); // Box 191
		noseModel[50].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[50].rotateAngleX = 3.53429174F;

		noseModel[51].addShapeBox(0.5F, -11.5F, -1.5F, 6, 2, 3, 0F,0F, 0.5F, -0.5F, -2.5F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 6F, 1F, -1F, 6F, 1F, -1F, 0F, 1F, 0F); // Box 192
		noseModel[51].setRotationPoint(-67.5F, -24.5F, 0F);
		noseModel[51].rotateAngleX = 3.53429174F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 47
		tailModel[1] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 48
		tailModel[2] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 49
		tailModel[3] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 77
		tailModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 78
		tailModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 79
		tailModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 80
		tailModel[7] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 107
		tailModel[8] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 108
		tailModel[9] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 109
		tailModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 110

		tailModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, 0.5F, 0F, 0F, -1.8F, -2.8F, 0F, -1.8F, -2.8F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -2.8F, 0F, -1F, -2.8F, 0F, 0F, 0F); // Box 47
		tailModel[0].setRotationPoint(61.5F, -31F, -3F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, 1F, -2F, -9F, -1.4F, -2.8F, -9F, -1.4F, -2.8F, 0F, 1F, -2F, 0F, -1.5F, 0F, 0F, 0.8F, -2.8F, 0F, 0.8F, -2.8F, 0F, -1.5F, 0F); // Box 48
		tailModel[1].setRotationPoint(61.5F, -33F, -3F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, -0.2F, 0F, 0F, 0.8F, -2.8F, 0F, 0.8F, -2.8F, 0F, -0.2F, 0F, 0F, 0.7F, -2F, -9F, -1.4F, -2.8F, -9F, -1.4F, -2.8F, 0F, 0.7F, -2F); // Box 49
		tailModel[2].setRotationPoint(61.5F, -28.2F, -3F);

		tailModel[3].addShapeBox(-1F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailModel[3].setRotationPoint(62F, -25F, -1F);
		tailModel[3].rotateAngleZ = -0.6981317F;

		tailModel[4].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailModel[4].setRotationPoint(63.2F, -22.7F, -0.5F);

		tailModel[5].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		tailModel[5].setRotationPoint(63.2F, -20.7F, -0.5F);

		tailModel[6].addShapeBox(-1F, 0F, 0F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		tailModel[6].setRotationPoint(63.2F, -24.7F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 12, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 107
		tailModel[7].setRotationPoint(49.5F, -44F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 18F, 0F, 0F); // Box 108
		tailModel[8].setRotationPoint(48.5F, -41F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		tailModel[9].setRotationPoint(49.5F, -52F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		tailModel[10].setRotationPoint(54.5F, -55F, -1F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 59
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 60
		leftWingModel[2] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 61
		leftWingModel[3] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 62
		leftWingModel[4] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 63
		leftWingModel[5] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 64
		leftWingModel[6] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 65
		leftWingModel[7] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 66
		leftWingModel[8] = new ModelRendererTurbo(this, 334, 208, textureX, textureY); // Box 198
		leftWingModel[9] = new ModelRendererTurbo(this, 288, 208, textureX, textureY); // Box 199

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,-5F, 0.5F, 0F, -5F, 0.5F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[0].setRotationPoint(-48F, -22F, -33F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,0F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F); // Box 60
		leftWingModel[1].setRotationPoint(-48F, -19F, -33F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 61, 0F,-7F, 3F, 0F, -13F, 3F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, -3.5F, -5F, 0F, -9F, -5F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F); // Box 61
		leftWingModel[2].setRotationPoint(-48F, -22F, -94F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 36, 3, 61, 0F,-3.5F, 3F, 0F, -9F, 3F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, -7F, -4.5F, 0F, -13F, -4.5F, 0F, -5F, 1F, 0F, -3F, 1F, 0F); // Box 62
		leftWingModel[3].setRotationPoint(-48F, -21F, -94F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 63
		leftWingModel[4].setRotationPoint(-44F, -25F, -100F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,-6F, 0F, -2F, -6F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftWingModel[5].setRotationPoint(-41F, -25F, -104F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,-5.5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, -0.3F, -2F, -5F, -0.3F, -2F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 65
		leftWingModel[6].setRotationPoint(-41F, -24F, -104F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 66
		leftWingModel[7].setRotationPoint(-44F, -24F, -100F);

		leftWingModel[8].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-15F, -0.3F, -15F, -15F, -0.3F, -15F, -15F, -0.9F, -15F, -15F, -0.7F, -15F, -15F, 0F, -15F, -15F, 0.7F, -15F, -15F, 1F, -15F, -15F, 0.5F, -15F); // Box 198
		leftWingModel[8].setRotationPoint(-56F, -1F, -99F);

		leftWingModel[9].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-15F, -0.3F, -15F, -15F, -0.3F, -15F, -15F, -0.9F, -15F, -15F, -0.7F, -15F, -15F, -0.4F, -15F, -15F, -0.5F, -15F, -15F, 1F, -15F, -15F, 0.75F, -15F); // Box 199
		leftWingModel[9].setRotationPoint(-56F, 2F, -99F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 69
		rightWingModel[1] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 70
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 71
		rightWingModel[3] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 72
		rightWingModel[4] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 73
		rightWingModel[5] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 74
		rightWingModel[6] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 75
		rightWingModel[7] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 76
		rightWingModel[8] = new ModelRendererTurbo(this, 334, 208, textureX, textureY); // Box 135
		rightWingModel[9] = new ModelRendererTurbo(this, 288, 208, textureX, textureY); // Box 200

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,-5F, 0F, 0F, -3F, 0F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F); // Box 69
		rightWingModel[0].setRotationPoint(-48F, -22F, 17F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, -1F, 0F, -3F, -1F, 0F); // Box 70
		rightWingModel[1].setRotationPoint(-48F, -19F, 17F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 36, 3, 61, 0F,-5F, 0.5F, 0F, -5F, 0.5F, 0F, -13F, 3F, 0F, -7F, 3F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -9F, -5F, 0F, -3.5F, -5F, 0F); // Box 71
		rightWingModel[2].setRotationPoint(-48F, -22F, 33F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 36, 3, 61, 0F,0F, -1F, 0F, -1.5F, -1F, 0F, -9F, 3F, 0F, -3.5F, 3F, 0F, -3F, 1F, 0F, -5F, 1F, 0F, -13F, -4.5F, 0F, -7F, -4.5F, 0F); // Box 72
		rightWingModel[3].setRotationPoint(-48F, -21F, 33F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,-3F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 73
		rightWingModel[4].setRotationPoint(-44F, -25F, 94F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5.5F, 0F, 0F); // Box 74
		rightWingModel[5].setRotationPoint(-41F, -25F, 100F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, -0.3F, -2F, -5F, -0.3F, -2F); // Box 75
		rightWingModel[6].setRotationPoint(-41F, -24F, 100F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -4F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 76
		rightWingModel[7].setRotationPoint(-44F, -24F, 94F);

		rightWingModel[8].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-15F, -0.7F, -15F, -15F, -0.9F, -15F, -15F, -0.3F, -15F, -15F, -0.3F, -15F, -15F, 0.5F, -15F, -15F, 1F, -15F, -15F, 0.7F, -15F, -15F, 0F, -15F); // Box 135
		rightWingModel[8].setRotationPoint(-56F, -1F, 54F);

		rightWingModel[9].addShapeBox(0F, -24F, 0F, 45, 1, 45, 0F,-15F, -0.7F, -15F, -15F, -0.9F, -15F, -15F, -0.3F, -15F, -15F, -0.3F, -15F, -15F, 0.75F, -15F, -15F, 1F, -15F, -15F, -0.5F, -15F, -15F, -0.4F, -15F); // Box 200
		rightWingModel[9].setRotationPoint(-56F, 2F, 54F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 111
		yawFlapModel[1] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 112
		yawFlapModel[2] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 113
		yawFlapModel[3] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 114
		yawFlapModel[4] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 106
		yawFlapModel[5] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 107
		yawFlapModel[6] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 232
		yawFlapModel[7] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 196

		yawFlapModel[0].addShapeBox(0F, 0F, -1F, 6, 8, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 111
		yawFlapModel[0].setRotationPoint(61.5F, -52F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -1F, 8, 13, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 112
		yawFlapModel[1].setRotationPoint(61.5F, -44F, 0F);

		yawFlapModel[2].addShapeBox(0F, 0F, -1F, 4, 5, 2, 0F,0F, 0F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 113
		yawFlapModel[2].setRotationPoint(61.5F, -57F, 0F);

		yawFlapModel[3].addShapeBox(-3F, 0F, -1F, 3, 5, 2, 0F,0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 114
		yawFlapModel[3].setRotationPoint(61.5F, -57F, 0F);

		yawFlapModel[4].addShapeBox(-4F, 0F, 2.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[4].setRotationPoint(-17F, -28.3F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.43633231F;

		yawFlapModel[5].addShapeBox(-4F, 0F, -6.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[5].setRotationPoint(-17F, -28.3F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.43633231F;

		yawFlapModel[6].addShapeBox(-3F, -0.95F, -7F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		yawFlapModel[6].setRotationPoint(-17F, -28.3F, 0F);
		yawFlapModel[6].rotateAngleZ = -0.43633231F;

		yawFlapModel[7].addShapeBox(0F, 0F, -1F, 3, 6, 2, 0F,0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F, 0F, 7F, -0.15F); // Box 196
		yawFlapModel[7].setRotationPoint(61.5F, -48F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 90
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 91
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 92
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 5, 1, 5, 0F,0F, 0F, 1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		pitchFlapLeftModel[0].setRotationPoint(55.5F, -30.5F, -28F);

		pitchFlapLeftModel[1].addShapeBox(0F, -0.5F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		pitchFlapLeftModel[1].setRotationPoint(55.5F, -30.5F, -23F);

		pitchFlapLeftModel[2].addShapeBox(0F, -0.5F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 92
		pitchFlapLeftModel[2].setRotationPoint(55.5F, -30.5F, -11F);

		pitchFlapLeftModel[3].addShapeBox(-0.5F, -10F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[3].setRotationPoint(-15F, -28.5F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 84
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 85
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 86

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.5F); // Box 84
		pitchFlapRightModel[0].setRotationPoint(55.5F, -30.5F, 23F);

		pitchFlapRightModel[1].addShapeBox(0F, -0.5F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 85
		pitchFlapRightModel[1].setRotationPoint(55.5F, -30.5F, 11F);

		pitchFlapRightModel[2].addShapeBox(0F, -0.5F, 0F, 10, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		pitchFlapRightModel[2].setRotationPoint(55.5F, -30.5F, 0F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 95
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 96
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 97
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 98
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 99
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 100

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingWheelModel[0].setRotationPoint(-52F, 2.5F, -31F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftWingWheelModel[1].setRotationPoint(-52F, -1.5F, -31F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 97
		leftWingWheelModel[2].setRotationPoint(-52F, 6.5F, -31F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 98
		leftWingWheelModel[3].setRotationPoint(-52F, 1.5F, -32F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F,-10F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 99
		leftWingWheelModel[4].setRotationPoint(-52F, -7.5F, -32F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingWheelModel[5].setRotationPoint(-42F, -17.5F, -32F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 101
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 102
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 103
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 104
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 105
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 106

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		rightWingWheelModel[0].setRotationPoint(-52F, 2.5F, 28F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightWingWheelModel[1].setRotationPoint(-52F, -1.5F, 28F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 103
		rightWingWheelModel[2].setRotationPoint(-52F, 6.5F, 28F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F); // Box 104
		rightWingWheelModel[3].setRotationPoint(-52F, 1.5F, 31F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F,-10F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightWingWheelModel[4].setRotationPoint(-52F, -7.5F, 31F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rightWingWheelModel[5].setRotationPoint(-42F, -17.5F, 31F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-77.5F, -25.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 141, 207, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 141, 207, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 141, 207, textureX, textureY);
		prop[0].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[1].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[2].addBox(-1F, -28F, -1.5F, 2, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}