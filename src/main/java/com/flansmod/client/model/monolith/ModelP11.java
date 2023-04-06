//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P11
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP11 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 128;

	public ModelP11() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[81];
		noseModel = new ModelRendererTurbo[7];
		tailModel = new ModelRendererTurbo[4];
		leftWingModel = new ModelRendererTurbo[4];
		rightWingModel = new ModelRendererTurbo[4];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];

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

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[2] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 45
		bodyModel[29] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 46
		bodyModel[30] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 60
		bodyModel[36] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 61
		bodyModel[37] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 62
		bodyModel[38] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 63
		bodyModel[39] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 64
		bodyModel[40] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 65
		bodyModel[41] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 66
		bodyModel[42] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 67
		bodyModel[43] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 68
		bodyModel[44] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 69
		bodyModel[45] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 70
		bodyModel[46] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 71
		bodyModel[47] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 72
		bodyModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[49] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 74
		bodyModel[50] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 75
		bodyModel[51] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 76
		bodyModel[52] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 77
		bodyModel[53] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 80
		bodyModel[56] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 81
		bodyModel[57] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 82
		bodyModel[58] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 83
		bodyModel[59] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 84
		bodyModel[60] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 85
		bodyModel[61] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 86
		bodyModel[62] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 89
		bodyModel[65] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 91
		bodyModel[67] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 92
		bodyModel[68] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 93
		bodyModel[69] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 96
		bodyModel[72] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 97
		bodyModel[73] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 98
		bodyModel[74] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 99
		bodyModel[75] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 100
		bodyModel[76] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 101
		bodyModel[77] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 102
		bodyModel[78] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 103
		bodyModel[79] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 104
		bodyModel[80] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 105

		bodyModel[0].addShapeBox(0F, 0F, 0F, 18, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[0].setRotationPoint(-44F, -31F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 6, 10, 0F,0F, 0.5F, 0F, 2F, 1.5F, -1F, 2F, 1.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 10
		bodyModel[1].setRotationPoint(-44F, -37F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 5, 10, 0F,0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-44F, -19F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, 0F, 4.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(-51F, -19F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 4.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 4.5F); // Box 14
		bodyModel[4].setRotationPoint(-51F, -37F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 12, 20, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 15
		bodyModel[5].setRotationPoint(-51F, -31F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-26F, -31F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 5, 10, 0F,0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(-26F, -19F, -5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, -1.5F, -5.5F, 0F, -5F, -3F, 0F, -5F, 3F, 0F, -1.5F, 5.5F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F); // Box 19
		bodyModel[8].setRotationPoint(-15F, -40F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, -0.15F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.15F); // Box 20
		bodyModel[9].setRotationPoint(-10F, -35F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -3.5F, 0F, 2F, -6F, 0F, 2F, 6F, 0F, 0F, 3.5F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 21
		bodyModel[10].setRotationPoint(-6F, -35F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 12, 18, 0F,0F, 0F, 0F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4.5F, 0F, -5F, -4.5F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-2F, -31F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(-26F, -31F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, -1.5F, 5.5F, 0F, -5F, 3F, 0F, -5F, -3F, 0F, -1.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(-15F, -40F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0.15F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.15F); // Box 25
		bodyModel[14].setRotationPoint(-10F, -35F, 8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 3.5F, 0F, 2F, 6F, 0F, 2F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F); // Box 26
		bodyModel[15].setRotationPoint(-6F, -35F, 8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 42, 4, 18, 0F,0F, 0F, 0F, 0F, 5F, -4.5F, 0F, 5F, -4.5F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -5F, -7.5F, 0F, -5F, -7.5F, 0F, -0.5F, -6F); // Box 27
		bodyModel[16].setRotationPoint(-2F, -19F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 42, 6, 18, 0F,0F, 0F, -5.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-2F, -37F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 42, 3, 5, 0F,0F, 0F, -0.5F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(-2F, -40F, -2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 42, 2, 4, 0F,0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(-2F, -42F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 6, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.5F, 0.5F, 0F, -5.5F, -2F, 0F, -5.5F, -2F, 0F, -1.5F, 0.5F); // Box 33
		bodyModel[20].setRotationPoint(40F, -37F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, -1F, 16, 19, 2, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(45F, -56F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, -1F, 15, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(52F, -59F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, -1F, 11, 2, 2, 0F,-4F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(54F, -61F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,0F, -3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[24].setRotationPoint(40F, -40F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F); // Box 40
		bodyModel[25].setRotationPoint(45F, -35.5F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 2, 32, 0F,-10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(45F, -35.5F, -32F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 2, 32, 0F,-10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(45F, -35.5F, -32F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 23, 1, 10, 0F,0F, 2F, 0F, 2F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 2.5F, 0F, 0F, 3F, 0F); // Box 45
		bodyModel[28].setRotationPoint(-49F, -40F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 23, 2, 15, 0F,0F, 4F, 0F, 15F, 4F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 15F, -2F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 46
		bodyModel[29].setRotationPoint(-49F, -43F, -25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 4, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-49F, -48F, -43F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 1, 10, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 2F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[31].setRotationPoint(-49F, -40F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 2, 15, 0F,0F, -1F, 0F, 2F, -1F, 0F, 15F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 15F, -2F, 0F, 0F, -2F, 0F); // Box 53
		bodyModel[32].setRotationPoint(-49F, -43F, 10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 36, 4, 18, 0F,0F, -1F, 0F, 2F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[33].setRotationPoint(-49F, -48F, 25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[34].setRotationPoint(-45F, -46F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[35].setRotationPoint(-30F, -46F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F); // Box 61
		bodyModel[36].setRotationPoint(-46F, -46F, -41F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F); // Box 62
		bodyModel[37].setRotationPoint(-31F, -46F, -41F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[38].setRotationPoint(-50F, 2F, 24F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 64
		bodyModel[39].setRotationPoint(-50F, 6F, 24F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[40].setRotationPoint(-50F, -2F, 24F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -1F, 15F, 0F, -1F, 15F); // Box 66
		bodyModel[41].setRotationPoint(-45F, -20F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, -16F, -14F, 0F, -16F, -14F, -1F, 15F, 15F, -1F, 15F); // Box 67
		bodyModel[42].setRotationPoint(-30F, -20F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[43].setRotationPoint(-50F, 2F, -26F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 69
		bodyModel[44].setRotationPoint(-50F, 6F, -26F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[45].setRotationPoint(-50F, -2F, -26F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 15F, 0F, -1F, 15F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 71
		bodyModel[46].setRotationPoint(-45F, -20F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, -1F, 15F, -14F, -1F, 15F, -14F, 0F, -16F, 15F, 0F, -16F); // Box 72
		bodyModel[47].setRotationPoint(-30F, -20F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[48].setRotationPoint(-53F, -47F, 35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[49].setRotationPoint(-53F, -47F, -36F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[50].setRotationPoint(-16F, -43.5F, 3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1F, 4F, 0F, -1F); // Box 76
		bodyModel[51].setRotationPoint(-20F, -43.5F, 2.4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 77
		bodyModel[52].setRotationPoint(-20F, -43.5F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[53].setRotationPoint(-16F, -43.5F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 4F, 0F, 1F); // Box 79
		bodyModel[54].setRotationPoint(-20F, -43.5F, -3.4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 80
		bodyModel[55].setRotationPoint(-20F, -43.5F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[56].setRotationPoint(-16F, -43.5F, -2.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[57].setRotationPoint(-20F, -43.5F, -1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 83
		bodyModel[58].setRotationPoint(-31F, -42.5F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[59].setRotationPoint(-46F, -42F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[60].setRotationPoint(-46F, -43.6F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[61].setRotationPoint(-46F, -43.1F, 0.05F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[62].setRotationPoint(-46F, -42.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[63].setRotationPoint(-46F, -43.1F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[64].setRotationPoint(-3F, -41F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[65].setRotationPoint(-3F, -37F, -2.5F);
		bodyModel[65].rotateAngleZ = -0.12217305F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[66].setRotationPoint(-12F, -25F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,-2F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, -2F, -0.5F, 3F, 0F, 0F, 5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -5F); // Box 92
		bodyModel[67].setRotationPoint(-26F, -39F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,-2F, -0.5F, 3F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, 0F, 0F, -5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 5F); // Box 93
		bodyModel[68].setRotationPoint(-26F, -39F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 94
		bodyModel[69].setRotationPoint(-18F, -38F, -4.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 95
		bodyModel[70].setRotationPoint(-18F, -38F, 1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[71].setRotationPoint(-18F, -36F, -1.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[72].setRotationPoint(-25F, -37.3F, -1.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 98
		bodyModel[73].setRotationPoint(-17.8F, -36.1F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[74].setRotationPoint(-17.8F, -36.7F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[75].setRotationPoint(-17.8F, -34.1F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[76].setRotationPoint(-17.8F, -34.1F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 102
		bodyModel[77].setRotationPoint(-17.8F, -36.1F, 1.8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 103
		bodyModel[78].setRotationPoint(-17.8F, -36.1F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 104
		bodyModel[79].setRotationPoint(-18F, -37F, -1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[80].setRotationPoint(-18F, -37F, -0.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		noseModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		noseModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		noseModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		noseModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 6
		noseModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		noseModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8

		noseModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 1
		noseModel[0].setRotationPoint(-59F, -30.5F, -13F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 26, 0F,0F, 0F, -8F, 0F, -0.5F, -8.5F, 0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		noseModel[1].setRotationPoint(-59F, -38.5F, -13F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -8F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0.5F, -8F); // Box 4
		noseModel[2].setRotationPoint(-59F, -21.5F, -13F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 8, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -8.5F, 0F, 0.5F, -8F, 0F, 0.5F, -8F, 0F, 0F, -8.5F); // Box 5
		noseModel[3].setRotationPoint(-64F, -21.5F, -13F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 8, 26, 0F,0F, -0.5F, -8.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -0.5F, -8.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 6
		noseModel[4].setRotationPoint(-64F, -38.5F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 9, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 7
		noseModel[5].setRotationPoint(-64F, -30.5F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 10, 10, 10, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 8
		noseModel[6].setRotationPoint(-74F, -31F, -5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 31
		tailModel[1] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 32
		tailModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 34
		tailModel[3] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 113

		tailModel[0].addShapeBox(0F, 0F, 0F, 21, 8, 9, 0F,0F, 0.5F, 0F, 0F, 4.5F, -2.5F, 0F, 4.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 31
		tailModel[0].setRotationPoint(40F, -32F, -4.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 21, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, -11F, -1.5F, -4F, -11F, -1.5F, -4F, 0F, 0F, -3F); // Box 32
		tailModel[1].setRotationPoint(40F, -24F, -4.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 13, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, -1.5F, 1F, -4.5F, -1.5F, 0F, 0F, 0F); // Box 34
		tailModel[2].setRotationPoint(61F, -37F, -2F);

		tailModel[3].addShapeBox(0F, 0F, -1F, 7, 4, 2, 0F,0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -3F, 0F); // Box 113
		tailModel[3].setRotationPoint(50F, -23F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 48
		leftWingModel[1] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 49
		leftWingModel[2] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 50
		leftWingModel[3] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 109

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 51, 0F,-2F, 0F, 0F, -8F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Box 48
		leftWingModel[0].setRotationPoint(-49F, -49F, -94F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 26, 3, 8, 0F,-2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[1].setRotationPoint(-47F, -49F, -102F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,-5F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0.5F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftWingModel[2].setRotationPoint(-45F, -49F, -106F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-11F, 0F, -11F, -11F, 0F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F); // Box 109
		leftWingModel[3].setRotationPoint(-54F, -49F, -97F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 55
		rightWingModel[1] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 56
		rightWingModel[2] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 57
		rightWingModel[3] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 112

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 36, 3, 51, 0F,0F, -1F, 0F, -4F, -1F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -8F, 0F, 0F, -2F, 0F, 0F); // Box 55
		rightWingModel[0].setRotationPoint(-49F, -49F, 43F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 26, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F); // Box 56
		rightWingModel[1].setRotationPoint(-47F, -49F, 94F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0.5F); // Box 57
		rightWingModel[2].setRotationPoint(-45F, -49F, 102F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 40, 1, 40, 0F,-11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, 0F, -11F); // Box 112
		rightWingModel[3].setRotationPoint(-54F, -48.7F, 36F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 35
		yawFlapModel[1] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 106
		yawFlapModel[2] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 107
		yawFlapModel[3] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 110
		yawFlapModel[4] = new ModelRendererTurbo(this, 912, 57, textureX, textureY); // Box 111

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 13, 19, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		yawFlapModel[0].setRotationPoint(61F, -56F, 0F);

		yawFlapModel[1].addShapeBox(-4F, 0F, 3.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		yawFlapModel[1].setRotationPoint(-19F, -23.3F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.6981317F;

		yawFlapModel[2].addShapeBox(-4F, 0F, -7.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		yawFlapModel[2].setRotationPoint(-19F, -23.3F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.6981317F;

		yawFlapModel[3].addShapeBox(-5F, 1F, -0.8F, 20, 20, 1, 0F,-6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F); // Box 110
		yawFlapModel[3].setRotationPoint(61F, -56F, 0F);

		yawFlapModel[4].addShapeBox(-5F, 1F, -0.2F, 20, 20, 1, 0F,-6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F, -6F, -6F, -0.2F); // Box 111
		yawFlapModel[4].setRotationPoint(61F, -56F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 44
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 108

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, 0F, 9, 2, 30, 0F,0F, -0.2F, 0F, -5F, -0.2F, -3F, 1F, -0.2F, -5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -5F, -0.2F, -3F, 1F, -0.2F, -5F, 0F, -0.2F, 0F); // Box 44
		pitchFlapLeftModel[0].setRotationPoint(60F, -35F, -32F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -12F, -0.5F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		pitchFlapLeftModel[1].setRotationPoint(-13F, -22.3F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 42

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 9, 2, 30, 0F,0F, -0.2F, 0F, 1F, -0.2F, -5F, -5F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, -5F, -5F, -0.2F, -3F, 0F, -0.2F, 0F); // Box 42
		pitchFlapRightModel[0].setRotationPoint(60F, -35F, 2F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 51

		pitchFlapLeftWingModel[0].addShapeBox(0F, -1F, 0F, 4, 2, 51, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		pitchFlapLeftWingModel[0].setRotationPoint(-21F, -47.5F, -94F);
		pitchFlapLeftWingModel[0].rotateAngleX = -0.0296706F;
		pitchFlapLeftWingModel[0].rotateAngleY = -0.07853982F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 58

		pitchFlapRightWingModel[0].addShapeBox(0F, -1F, 0F, 4, 2, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 58
		pitchFlapRightWingModel[0].setRotationPoint(-17F, -46F, 43F);
		pitchFlapRightWingModel[0].rotateAngleX = 0.0296706F;
		pitchFlapRightWingModel[0].rotateAngleY = 0.07853982F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-68F, -26F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 2, 97, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 2, 97, textureX, textureY);
		prop[0].addBox(-0.5F, -22F, -1.5F, 1, 22, 3, 0.0F);
		prop[1].addBox(-0.5F, -22F, -1.5F, 1, 22, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}