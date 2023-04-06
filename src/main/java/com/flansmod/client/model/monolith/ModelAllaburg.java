//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Allaburg
// Model Creator: 
// Created on: 21.07.2020 - 19:03:05
// Last changed on: 21.07.2020 - 19:03:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAllaburg extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelAllaburg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[90];
		bodyDoorOpenModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyDoorOpenModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 14, 175, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 92
		bodyModel[74] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 96
		bodyModel[78] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 97
		bodyModel[79] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 98
		bodyModel[80] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 99
		bodyModel[81] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 100
		bodyModel[82] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 101
		bodyModel[83] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 102
		bodyModel[84] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 104
		bodyModel[86] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 105
		bodyModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 107
		bodyModel[89] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 108

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 6, 18, 0F,0F, 0F, -8.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -8.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 1
		bodyModel[0].setRotationPoint(-111F, -3F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 6, 18, 0F,0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-101F, -3F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 28, 6, 32, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-80F, -3F, -16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 57, 6, 38, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-52F, -3F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 6, 38, 0F,0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 5
		bodyModel[4].setRotationPoint(5F, -3F, -19F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 13, 29, 0F,16F, 0F, 0.5F, 16F, 0F, -2F, 16F, 0F, -2F, 16F, 0F, 0.5F, 16F, 0F, 0.5F, 16F, 0F, -2F, 16F, 0F, -2F, 16F, 0F, 0.5F); // Box 6
		bodyModel[5].setRotationPoint(56F, -10F, -14.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 13, 25, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(73F, -10F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 13, 19, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(88F, -10F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 7, 13, 0F,0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5.5F, 2F, 0F, -5.5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(96F, -10F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 6, 38, 0F,0F, 0F, -2F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(40F, -3F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 6, 13, 0F,0F, 0F, 0F, 2F, 0F, -5.5F, 2F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -6F, 7F, 0F, -6F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(96F, -3F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 35, 10, 38, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -1.5F); // Box 12
		bodyModel[11].setRotationPoint(5F, -13.5F, -19F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 30, 7, 38, 0F,0F, 0F, -3.35F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -3.35F, 0F, 0F, -2F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -2F); // Box 13
		bodyModel[12].setRotationPoint(40F, -10F, -19F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-54F, -14F, -14F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 5, 18, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 6F); // Box 15
		bodyModel[14].setRotationPoint(-40F, -14F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-63F, -14F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 3, 38, 0F,0F, 0F, -13F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -13F, -0.5F, 0.5F, -13F, 0F, 3.5F, -2.45F, 0F, 3.5F, -2.45F, -0.5F, 0.5F, -13F); // Box 17
		bodyModel[16].setRotationPoint(-9F, -13.5F, -19F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-29F, -13.5F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-31F, -13.5F, -3F);

		bodyModel[19].addShapeBox(-2F, 0F, 0F, 6, 9, 2, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-5F, -11.5F, -13F);
		bodyModel[19].rotateAngleY = 0.90757121F;

		bodyModel[20].addShapeBox(-2F, 0F, 0F, 6, 9, 2, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-6F, -11.5F, 12F);
		bodyModel[20].rotateAngleY = -0.90757121F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-1F, -30.5F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 23
		bodyModel[22].setRotationPoint(-2F, -30.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(4F, -30.5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(25F, -30.5F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 17, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 26
		bodyModel[25].setRotationPoint(19F, -30.5F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 17, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(20F, -30.5F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(27F, -18.5F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(30F, -22.5F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 28, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(37.2F, -40.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 31
		bodyModel[30].setRotationPoint(35.2F, -41F, -3F);

		bodyModel[31].addShapeBox(0F, -2F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(35.2F, -41F, -3F);

		bodyModel[32].addShapeBox(0F, -2F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(37.2F, -45F, -1F);

		bodyModel[33].addShapeBox(0F, -2F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(36.2F, -47F, -2F);

		bodyModel[34].addShapeBox(0F, -2F, 0F, 3, 2, 2, 0F,0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[34].setRotationPoint(39.2F, -44F, -1F);

		bodyModel[35].addShapeBox(0F, -2F, 0F, 3, 2, 2, 0F,2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 36
		bodyModel[35].setRotationPoint(34.2F, -44F, -1F);

		bodyModel[36].addShapeBox(0F, -2F, 0F, 2, 2, 3, 0F,0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 37
		bodyModel[36].setRotationPoint(37.2F, -44F, -4F);

		bodyModel[37].addShapeBox(0F, -2F, 0F, 2, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 38
		bodyModel[37].setRotationPoint(37.2F, -44F, 1F);

		bodyModel[38].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 39
		bodyModel[38].setRotationPoint(35.2F, -96F, -0.5F);
		bodyModel[38].rotateAngleZ = 0.01745329F;

		bodyModel[39].addShapeBox(0F, -2F, 0F, 1, 1, 24, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 40
		bodyModel[39].setRotationPoint(35.5F, -68.5F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 88F, -0.3F, -0.3F, 88F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 88F, -0.3F, -0.3F, 88F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[40].setRotationPoint(-54.8F, -95.5F, -0.5F);
		bodyModel[40].rotateAngleZ = 0.01745329F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 89F, -0.3F, -0.3F, 89F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 89F, -0.3F, -0.3F, 89F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 42
		bodyModel[41].setRotationPoint(-54.8F, -67.5F, -0.5F);
		bodyModel[41].rotateAngleZ = 0.01745329F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(42F, -18.5F, -4.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(46F, -18.5F, -3.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 6, 38, 0F,0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -3.4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3.4F); // Box 45
		bodyModel[44].setRotationPoint(40F, -16F, -19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 24, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(45F, -16F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 6, 24, 0F,0F, 0F, -1F, 1F, 0F, -9F, 1F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -6F, 2F, 0F, -6F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(46F, -16F, -12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(58F, -11.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(64F, -11.5F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 50
		bodyModel[49].setRotationPoint(52F, -11.5F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 51
		bodyModel[50].setRotationPoint(-27.5F, -4.5F, -9F);

		bodyModel[51].addShapeBox(-3F, 0F, -9F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(-18.5F, -4.5F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-15.5F, -4.5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 54
		bodyModel[53].setRotationPoint(-82F, -4.5F, -9F);

		bodyModel[54].addShapeBox(-3F, 0F, -9F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-73F, -4.5F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-70F, -4.5F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 6, 13, 0F,0F, 0F, 0F, 7F, 0F, -6F, 7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -5.5F, 10F, 0F, -5.5F, 0F, 0F, 0F); // Box 72
		bodyModel[56].setRotationPoint(96F, 3F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 6, 13, 0F,0F, 0F, 0F, 10F, 0F, -5.5F, 10F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -6F, 5F, 0F, -6F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(96F, 9F, -6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 12, 19, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(88F, 3F, -9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 12, 25, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(73F, 3F, -12.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 33, 12, 38, 0F,0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, 0F); // Box 77
		bodyModel[60].setRotationPoint(40F, 3F, -19F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 12, 38, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 78
		bodyModel[61].setRotationPoint(5F, 3F, -19F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 57, 12, 38, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 79
		bodyModel[62].setRotationPoint(-52F, 3F, -19F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 28, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, 0F); // Box 80
		bodyModel[63].setRotationPoint(-80F, 3F, -16F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 21, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 7F, 0F, -2F, 7F, 0F, -4F, 0F); // Box 81
		bodyModel[64].setRotationPoint(-101F, 3F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 8, 18, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, -4F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, -8F); // Box 82
		bodyModel[65].setRotationPoint(-111F, 3F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[66].setRotationPoint(-115F, -19F, -0.5F);
		bodyModel[66].rotateAngleZ = 0.31415927F;

		bodyModel[67].addShapeBox(-18F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 84
		bodyModel[67].setRotationPoint(-115F, -19F, -0.5F);
		bodyModel[67].rotateAngleZ = 0.31415927F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 85
		bodyModel[68].setRotationPoint(39F, -29F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, -1F, 0.5F, -0.5F, -2.2F, 0.5F, -0.5F, -2.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 86
		bodyModel[69].setRotationPoint(39F, -30F, -5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 17, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 2F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 2F, 8F, 0F, 0F); // Box 87
		bodyModel[70].setRotationPoint(52F, -9F, -19F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 17, 8, 5, 0F,8F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 8F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 88
		bodyModel[71].setRotationPoint(52F, -9F, 14F);

		bodyModel[72].addShapeBox(-1F, -1F, -7F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 91
		bodyModel[72].setRotationPoint(33F, -7F, -15F);
		bodyModel[72].rotateAngleX = -0.2268928F;

		bodyModel[73].addShapeBox(-1F, -1F, -7F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 92
		bodyModel[73].setRotationPoint(12F, -7F, -15F);
		bodyModel[73].rotateAngleX = -0.2268928F;

		bodyModel[74].addShapeBox(-1F, -1F, -7F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 93
		bodyModel[74].setRotationPoint(22F, -7F, -15F);
		bodyModel[74].rotateAngleX = -0.2268928F;

		bodyModel[75].addShapeBox(-1F, -1F, 0F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 94
		bodyModel[75].setRotationPoint(22F, -7F, 15F);
		bodyModel[75].rotateAngleX = 0.2268928F;

		bodyModel[76].addShapeBox(-1F, -1F, 0F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 95
		bodyModel[76].setRotationPoint(33F, -7F, 15F);
		bodyModel[76].rotateAngleX = 0.2268928F;

		bodyModel[77].addShapeBox(-1F, -1F, 0F, 2, 2, 7, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 96
		bodyModel[77].setRotationPoint(12F, -7F, 15F);
		bodyModel[77].rotateAngleX = 0.2268928F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 28, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[78].setRotationPoint(-53.8F, -40.5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 98
		bodyModel[79].setRotationPoint(-55.8F, -39F, -3F);

		bodyModel[80].addShapeBox(0F, -2F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[80].setRotationPoint(-55.8F, -39F, -3F);

		bodyModel[81].addShapeBox(0F, -2F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[81].setRotationPoint(-53.8F, -43F, -1F);

		bodyModel[82].addShapeBox(0F, -2F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[82].setRotationPoint(-54.8F, -45F, -2F);

		bodyModel[83].addShapeBox(0F, -2F, 0F, 2, 2, 3, 0F,0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 102
		bodyModel[83].setRotationPoint(-53.8F, -42F, -4F);

		bodyModel[84].addShapeBox(0F, -2F, 0F, 3, 2, 2, 0F,2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 103
		bodyModel[84].setRotationPoint(-56.8F, -42F, -1F);

		bodyModel[85].addShapeBox(0F, -2F, 0F, 3, 2, 2, 0F,0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 104
		bodyModel[85].setRotationPoint(-51.8F, -42F, -1F);

		bodyModel[86].addShapeBox(0F, -2F, 0F, 2, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 105
		bodyModel[86].setRotationPoint(-53.8F, -42F, 1F);

		bodyModel[87].addShapeBox(0F, -2F, 0F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 106
		bodyModel[87].setRotationPoint(-55.8F, -96F, -0.5F);
		bodyModel[87].rotateAngleZ = 0.01745329F;

		bodyModel[88].addShapeBox(0F, -2F, 0F, 1, 1, 24, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 107
		bodyModel[88].setRotationPoint(-55.5F, -66.5F, -12F);

		bodyModel[89].addShapeBox(-18F, 0F, 0F, 18, 12, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 108
		bodyModel[89].setRotationPoint(-1F, -67.5F, -0.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 89
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 90

		bodyDoorOpenModel[0].addShapeBox(0F, -1F, -1F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 89
		bodyDoorOpenModel[0].setRotationPoint(69F, -6F, -15F);
		bodyDoorOpenModel[0].rotateAngleY = -0.41887902F;

		bodyDoorOpenModel[1].addShapeBox(0F, -1F, -1F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 90
		bodyDoorOpenModel[1].setRotationPoint(69F, -6F, 14F);
		bodyDoorOpenModel[1].rotateAngleY = 0.41887902F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[11];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 57
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 58
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 59
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 60
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 61
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 62
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 63
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 64
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 65
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 66
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 67

		gun_1_Model[0][0].addShapeBox(-3F, 1F, -7F, 6, 3, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_1_Model[0][1].addShapeBox(-8F, -1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_1_Model[0][2].addShapeBox(-3F, -1F, -5F, 6, 2, 10, 0F,0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59

		gun_1_Model[0][3].addShapeBox(-8F, 1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60

		gun_1_Model[0][4].addShapeBox(-9F, -1F, -5F, 6, 2, 3, 0F,-1F, 0F, -2.95F, 0F, 0F, -2.95F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61

		gun_1_Model[0][5].addShapeBox(-7F, 1F, -7F, 4, 3, 14, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 62

		gun_1_Model[0][6].addShapeBox(3F, 1F, -7F, 5, 3, 14, 0F,0F, 0F, -2F, -1F, -1F, -5F, -1F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 63

		gun_1_Model[0][7].addShapeBox(3F, -1F, -5F, 4, 2, 10, 0F,0F, -0.5F, -3F, -2F, -1.5F, -4F, -2F, -1.5F, -4F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 64

		gun_1_Model[0][8].addShapeBox(-9F, 1F, -5F, 6, 3, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_1_Model[0][9].addShapeBox(-9F, -1F, 2F, 6, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, -1F, 0F, -2.95F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 66

		gun_1_Model[0][10].addShapeBox(-9F, 1F, 2F, 6, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 67

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(61F, -14.5F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[4];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 68
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 69
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 70
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 71

		gun_1_Model[1][0].addShapeBox(1F, 0F, -3F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 68

		gun_1_Model[1][1].addShapeBox(1F, 0F, 1F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 69

		gun_1_Model[1][2].addShapeBox(9.5F, 0F, -3F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 70

		gun_1_Model[1][3].addShapeBox(9.5F, 0F, 1F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 71

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(61F, -14.5F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[11];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 57
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 58
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 59
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 60
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 61
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 62
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 63
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 64
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 65
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 66
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 67

		gun_2_Model[0][0].addShapeBox(-3F, 1F, -7F, 6, 3, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_2_Model[0][1].addShapeBox(-8F, -1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][2].addShapeBox(-3F, -1F, -5F, 6, 2, 10, 0F,0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59

		gun_2_Model[0][3].addShapeBox(-8F, 1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60

		gun_2_Model[0][4].addShapeBox(-9F, -1F, -5F, 6, 2, 3, 0F,-1F, 0F, -2.95F, 0F, 0F, -2.95F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61

		gun_2_Model[0][5].addShapeBox(-7F, 1F, -7F, 4, 3, 14, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 62

		gun_2_Model[0][6].addShapeBox(3F, 1F, -7F, 5, 3, 14, 0F,0F, 0F, -2F, -1F, -1F, -5F, -1F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][7].addShapeBox(3F, -1F, -5F, 4, 2, 10, 0F,0F, -0.5F, -3F, -2F, -1.5F, -4F, -2F, -1.5F, -4F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 64

		gun_2_Model[0][8].addShapeBox(-9F, 1F, -5F, 6, 3, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_2_Model[0][9].addShapeBox(-9F, -1F, 2F, 6, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, -1F, 0F, -2.95F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 66

		gun_2_Model[0][10].addShapeBox(-9F, 1F, 2F, 6, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 67

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-18.5F, -8.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 68
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 69
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 70
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 71

		gun_2_Model[1][0].addShapeBox(1F, 0F, -3F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 68

		gun_2_Model[1][1].addShapeBox(1F, 0F, 1F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 69

		gun_2_Model[1][2].addShapeBox(9.5F, 0F, -3F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 70

		gun_2_Model[1][3].addShapeBox(9.5F, 0F, 1F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 71

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-18.5F, -8.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("MiddleGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[11];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 57
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 58
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 59
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 60
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 61
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 62
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 63
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 64
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 65
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 66
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 67

		gun_3_Model[0][0].addShapeBox(-3F, 1F, -7F, 6, 3, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_3_Model[0][1].addShapeBox(-8F, -1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_3_Model[0][2].addShapeBox(-3F, -1F, -5F, 6, 2, 10, 0F,0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59

		gun_3_Model[0][3].addShapeBox(-8F, 1F, -2F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60

		gun_3_Model[0][4].addShapeBox(-9F, -1F, -5F, 6, 2, 3, 0F,-1F, 0F, -2.95F, 0F, 0F, -2.95F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61

		gun_3_Model[0][5].addShapeBox(-7F, 1F, -7F, 4, 3, 14, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 62

		gun_3_Model[0][6].addShapeBox(3F, 1F, -7F, 5, 3, 14, 0F,0F, 0F, -2F, -1F, -1F, -5F, -1F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][7].addShapeBox(3F, -1F, -5F, 4, 2, 10, 0F,0F, -0.5F, -3F, -2F, -1.5F, -4F, -2F, -1.5F, -4F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 64

		gun_3_Model[0][8].addShapeBox(-9F, 1F, -5F, 6, 3, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_3_Model[0][9].addShapeBox(-9F, -1F, 2F, 6, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, -1F, 0F, -2.95F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 66

		gun_3_Model[0][10].addShapeBox(-9F, 1F, 2F, 6, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 67

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-73F, -8.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[4];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 68
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 69
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 70
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 71

		gun_3_Model[1][0].addShapeBox(1F, 0F, -3F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 68

		gun_3_Model[1][1].addShapeBox(1F, 0F, 1F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F); // Box 69

		gun_3_Model[1][2].addShapeBox(9.5F, 0F, -3F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 70

		gun_3_Model[1][3].addShapeBox(9.5F, 0F, 1F, 7, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 71

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-73F, -8.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearGun", gun_3_Model);
	}
}