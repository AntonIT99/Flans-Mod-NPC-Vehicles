//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Juliett
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJuliett extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelJuliett() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];
		bodyDoorOpenModel = new ModelRendererTurbo[16];
		bodyDoorCloseModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 46
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 50
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 51
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 54
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 55
		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 56
		bodyModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 57
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 58
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 60
		bodyModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 65
		bodyModel[16] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 67
		bodyModel[18] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 68
		bodyModel[19] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 71
		bodyModel[22] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 72
		bodyModel[23] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 73
		bodyModel[24] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 74
		bodyModel[25] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 75
		bodyModel[26] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 76
		bodyModel[27] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 77
		bodyModel[28] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 78
		bodyModel[29] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 79
		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 85
		bodyModel[32] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		bodyModel[34] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 88
		bodyModel[35] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 89
		bodyModel[36] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 90
		bodyModel[37] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 91
		bodyModel[38] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 92
		bodyModel[39] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 93
		bodyModel[40] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 94
		bodyModel[41] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 95
		bodyModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 96
		bodyModel[43] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 97
		bodyModel[44] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 98
		bodyModel[45] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 99
		bodyModel[46] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 100
		bodyModel[47] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 101
		bodyModel[48] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 102
		bodyModel[49] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 103
		bodyModel[50] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 104
		bodyModel[51] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 105
		bodyModel[52] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 106
		bodyModel[53] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 107
		bodyModel[54] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 108
		bodyModel[55] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 109
		bodyModel[56] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 110
		bodyModel[57] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 111
		bodyModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 112
		bodyModel[59] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 113
		bodyModel[60] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 114
		bodyModel[61] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 115
		bodyModel[62] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 116
		bodyModel[63] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 117
		bodyModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 118
		bodyModel[65] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 119
		bodyModel[66] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 120
		bodyModel[67] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 121
		bodyModel[68] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 122
		bodyModel[69] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 123
		bodyModel[70] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 130

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[0].setRotationPoint(-30.5F, -3.25F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0.25F, 2.15F, 0F, 0.25F, 2.12F); // Box 48
		bodyModel[1].setRotationPoint(-30.5F, -3.25F, 3.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 50
		bodyModel[2].setRotationPoint(-38.5F, -3.25F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,-0.1F, -1.25F, -1.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.25F, -1.5F, -0.1F, 0.25F, 0.25F, 2.4F, 0.25F, 3F, 2.4F, 0.25F, 3F, -0.1F, 0.25F, 0.25F); // Box 51
		bodyModel[3].setRotationPoint(-54.5F, -3.25F, -3.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0.5F); // Box 52
		bodyModel[4].setRotationPoint(-36.5F, 0F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 2.12F, 0F, 0.25F, 2.15F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F); // Box 54
		bodyModel[5].setRotationPoint(-30.5F, -3.25F, -4.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,-0.1F, 0.25F, 0.25F, 2.4F, 0.25F, 3F, 2.4F, 0.25F, 3F, -0.1F, 0.25F, 0.25F, -0.1F, -0.25F, 1.25F, 2.65F, -0.25F, 3.5F, 2.65F, -0.25F, 3.5F, -0.1F, -0.25F, 1.25F); // Box 55
		bodyModel[6].setRotationPoint(-54.5F, 0.25F, -3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 27, 7, 13, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, -0.25F); // Box 56
		bodyModel[7].setRotationPoint(-36.5F, 3F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 7, 7, 0F,-0.1F, 0F, 1.25F, 2.65F, 0F, 3.5F, 2.65F, 0F, 3.5F, -0.1F, 0F, 1.25F, -0.1F, 0F, 0.25F, 2.4F, 0F, 2.75F, 2.4F, 0F, 2.75F, -0.1F, 0F, 0.25F); // Box 57
		bodyModel[8].setRotationPoint(-54.5F, 3F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,-0.1F, 0F, 0.25F, 2.4F, 0F, 2.75F, 2.4F, 0F, 2.75F, -0.1F, 0F, 0.25F, -0.1F, -0.25F, -2F, 2.65F, 0F, -0.75F, 2.65F, 0F, -0.75F, -0.1F, -0.25F, -2F); // Box 58
		bodyModel[9].setRotationPoint(-54.5F, 10F, -3.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 27, 5, 13, 0F,-0.5F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -3.75F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, -0.5F, 0F, -3.75F); // Box 59
		bodyModel[10].setRotationPoint(-36.5F, 10F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 51, 3, 13, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F); // Box 60
		bodyModel[11].setRotationPoint(-9.5F, 0F, -6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 51, 7, 13, 0F,0F, 0F, 1.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.75F); // Box 61
		bodyModel[12].setRotationPoint(-9.5F, 3F, -6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 51, 5, 13, 0F,0F, 0F, 0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -3.25F, -0.5F, 0F, -3.75F, -0.5F, 0F, -3.75F, 0F, 0F, -3.25F); // Box 62
		bodyModel[13].setRotationPoint(-9.5F, 10F, -6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,-0.1F, 0F, 0F, -1.85F, 0F, 0F, -1.85F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F, 0.5F, 0.25F, 2.5F, -0.1F, 0.25F, 2.5F); // Box 63
		bodyModel[14].setRotationPoint(-9.5F, -3.25F, -4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 2.5F, -0.25F, 0.25F, 2.5F, -0.25F, 0.25F, -3F, 0F, 0.25F, -3F); // Box 65
		bodyModel[15].setRotationPoint(22.5F, -3.25F, -4.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 66
		bodyModel[16].setRotationPoint(13.5F, -3.25F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, -0.25F, 0.25F, -3F, -0.25F, 0.25F, 2.5F, 0F, 0.25F, 2.5F); // Box 67
		bodyModel[17].setRotationPoint(22.5F, -3.25F, 3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F); // Box 68
		bodyModel[18].setRotationPoint(22.5F, -3.25F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 3, 13, 0F,-0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 1.25F); // Box 69
		bodyModel[19].setRotationPoint(40.5F, 0F, -6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 7, 13, 0F,-0.5F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.5F); // Box 70
		bodyModel[20].setRotationPoint(40.5F, 3F, -6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 5, 13, 0F,-0.5F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -3.75F, 0F, -0.25F, -4.75F, 0F, -0.25F, -4.75F, -0.5F, 0F, -3.75F); // Box 71
		bodyModel[21].setRotationPoint(40.5F, 10F, -6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 3, 13, 0F,-0.5F, 0.25F, -2F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, -0.5F, 0.25F, -2F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0.5F); // Box 72
		bodyModel[22].setRotationPoint(40.5F, -3F, -6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-0.5F, 0.25F, -1.75F, 0.25F, 0.25F, -3F, 0.25F, 0.25F, -3F, -0.5F, 0.25F, -1.75F, -0.5F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.5F, 0F, 0.25F); // Box 73
		bodyModel[23].setRotationPoint(54F, -3F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,-0.5F, 0F, 0.25F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.75F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0.75F); // Box 74
		bodyModel[24].setRotationPoint(54F, 0F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 7, 11, 0F,-0.5F, 0F, 0.75F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.5F, 0F, 0F); // Box 75
		bodyModel[25].setRotationPoint(54F, 3F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,-0.5F, 0F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, -0.25F, -3.75F, 0.25F, -0.25F, -4.25F, 0.25F, -0.25F, -4.25F, -0.5F, -0.25F, -3.75F); // Box 76
		bodyModel[26].setRotationPoint(54F, 10F, -5.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0.25F, 0F, -1F, -1F, 0F, -3.75F, -1F, 0F, -3.75F, 0.25F, 0F, -1F, 0.25F, 0F, -0.5F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0.25F, 0F, -0.5F); // Box 77
		bodyModel[27].setRotationPoint(63.5F, 0F, -5.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0.25F, 0.25F, -3F, -1F, 0.25F, -4.75F, -1F, 0.25F, -4.75F, 0.25F, 0.25F, -3F, 0.25F, 0F, -1F, -1F, 0F, -3.75F, -1F, 0F, -3.75F, 0.25F, 0F, -1F); // Box 78
		bodyModel[28].setRotationPoint(63.5F, -3F, -5.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 9, 7, 11, 0F,0.25F, 0F, -0.5F, -1F, 0F, -3.5F, -1F, 0F, -3.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1.5F, -1F, 0F, -4F, -1F, 0F, -4F, 0.25F, 0F, -1.5F); // Box 79
		bodyModel[29].setRotationPoint(63.5F, 3F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0.25F, 0F, -1.5F, -1F, 0F, -4F, -1F, 0F, -4F, 0.25F, 0F, -1.5F, 0.25F, -0.25F, -4.25F, -1F, -0.25F, -5F, -1F, -0.25F, -5F, 0.25F, -0.25F, -4.25F); // Box 80
		bodyModel[30].setRotationPoint(63.5F, 10F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.25F, -1.25F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 85
		bodyModel[31].setRotationPoint(71.5F, -3F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 86
		bodyModel[32].setRotationPoint(71.5F, 0F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.5F); // Box 87
		bodyModel[33].setRotationPoint(71.5F, 3F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.5F); // Box 88
		bodyModel[34].setRotationPoint(71.5F, 10F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,2.5F, 0.25F, -2.75F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 2.5F, 0.25F, -2.75F, 2.5F, -0.25F, -1F, 0.1F, -0.25F, 1.25F, 0.1F, -0.25F, 1.25F, 2.5F, -0.25F, -1F); // Box 89
		bodyModel[35].setRotationPoint(-62.5F, 0.25F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0.25F, -1.5F, -2.75F, 0.1F, -0.25F, -1.5F, 0.1F, -0.25F, -1.5F, 0.25F, -1.5F, -2.75F, 2.5F, 0.25F, -2.75F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 2.5F, 0.25F, -2.75F); // Box 90
		bodyModel[36].setRotationPoint(-62.5F, -2.25F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0.5F, 0F, -1F, 0.1F, 0F, 1.25F, 0.1F, 0F, 1.25F, 0.5F, 0F, -1F, 0.5F, -3.25F, -1.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.5F, -3.25F, -1.5F); // Box 91
		bodyModel[37].setRotationPoint(-64.5F, 3F, -3.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 4, 7, 0F,0.5F, 3.25F, -2.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.5F, 3.25F, -2.5F, 0.5F, 1F, -3F, 0.1F, 0.75F, -2F, 0.1F, 0.75F, -2F, 0.5F, 1F, -3F); // Box 92
		bodyModel[38].setRotationPoint(-64.5F, 10F, -3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0.1F, 0F, -0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.1F, 0F, -0.25F, 0.1F, -0.5F, -0.25F, 0.5F, -0.25F, 0.5F, 0.5F, -0.25F, 0.5F, 0.1F, -0.5F, -0.25F); // Box 93
		bodyModel[39].setRotationPoint(-69.5F, 3F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0.1F, -1.5F, -1.25F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.1F, -1.5F, -1.25F, 0.1F, 0F, -0.25F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.1F, 0F, -0.25F); // Box 94
		bodyModel[40].setRotationPoint(-69.5F, 0F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[41].setRotationPoint(64.5F, -7F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, -0.9F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 96
		bodyModel[42].setRotationPoint(61.5F, -7F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, -0.9F, 0.25F, 0F, -0.9F, 0F, 0F, 0F); // Box 97
		bodyModel[43].setRotationPoint(66.5F, -7F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 98
		bodyModel[44].setRotationPoint(55F, 0F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 99
		bodyModel[45].setRotationPoint(55F, 0F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F,0.1F, 3.6F, -3.35F, 0.5F, 3.25F, -2.5F, 0.5F, 3.25F, -2.5F, 0.1F, 3.6F, -3.35F, 0.1F, 0.75F, -3.35F, 0.5F, 1F, -3F, 0.5F, 1F, -3F, 0.1F, 0.75F, -3.35F); // Box 100
		bodyModel[46].setRotationPoint(-72.5F, 10F, -3.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0.5F, -0.5F, -1.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.5F, -0.5F, -1.25F); // Box 101
		bodyModel[47].setRotationPoint(-71.6F, 3F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.75F, -1.25F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.75F, -1.25F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 102
		bodyModel[48].setRotationPoint(-71.6F, 1F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, -5.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[49].setRotationPoint(-63.5F, 9F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 2F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[50].setRotationPoint(-63.5F, 9F, 0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 105
		bodyModel[51].setRotationPoint(17.5F, -8.75F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 6, 6, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 106
		bodyModel[52].setRotationPoint(4.5F, -8.75F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 6, 6, 0F,0F, -1.75F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F); // Box 107
		bodyModel[53].setRotationPoint(-2.5F, -8.75F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, -5.75F, -2.75F, 0F, -1.75F, -1.25F, 0F, -1.75F, -1.25F, 0F, -5.75F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -2.75F); // Box 108
		bodyModel[54].setRotationPoint(-8.5F, -8.75F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, -1F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.25F); // Box 109
		bodyModel[55].setRotationPoint(17.5F, -9.75F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F); // Box 110
		bodyModel[56].setRotationPoint(4.5F, -9.75F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -1.75F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.75F, -2F, 0F, 1.75F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1.75F, -1.25F); // Box 111
		bodyModel[57].setRotationPoint(-2.5F, -9.75F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-0.75F, -5.25F, -2.75F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, -0.75F, -5.25F, -2.75F, 0F, 5.75F, -2.75F, 0F, 1.75F, -1.25F, 0F, 1.75F, -1.25F, 0F, 5.75F, -2.75F); // Box 112
		bodyModel[58].setRotationPoint(-8.5F, -9.75F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[59].setRotationPoint(-2.5F, -11.25F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F); // Box 114
		bodyModel[60].setRotationPoint(-7.5F, -11.25F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0F); // Box 115
		bodyModel[61].setRotationPoint(-0.5F, -11.25F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0F); // Box 116
		bodyModel[62].setRotationPoint(-65.5F, 9F, 1.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F); // Box 117
		bodyModel[63].setRotationPoint(-65.5F, 7.75F, 1.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0F, 0.25F, -0.75F); // Box 118
		bodyModel[64].setRotationPoint(-65.5F, 10.25F, 1.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, 0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, 0.25F, 0F); // Box 119
		bodyModel[65].setRotationPoint(-65.5F, 9F, -5.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F); // Box 120
		bodyModel[66].setRotationPoint(-65.5F, 7.75F, -5.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0F, 0.25F, -0.75F); // Box 121
		bodyModel[67].setRotationPoint(-65.5F, 10.25F, -5.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 122
		bodyModel[68].setRotationPoint(-69.5F, 9.5F, 0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 123
		bodyModel[69].setRotationPoint(-69.5F, 9.5F, -6.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, -2.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 130
		bodyModel[70].setRotationPoint(-2.5F, -9.75F, -3F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 137
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 138
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 139
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 140
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 141
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 142
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 143
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 144
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 145
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 146
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 147
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 148
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 149
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 150
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 151
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 152

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 2.15F, -0.1F, 0.25F, 2.5F, -0.1F, 0.25F, 2.5F, -0.1F, 0.25F, 2.15F); // Box 137
		bodyDoorOpenModel[0].setRotationPoint(-29.5F, -3.25F, -4.5F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2.5F, 0.25F, 0.25F, 2.5F, 0.25F, 0.25F, 2.5F, 0F, 0.25F, 2.5F); // Box 138
		bodyDoorOpenModel[1].setRotationPoint(24.5F, -3.25F, -4.5F);
		bodyDoorOpenModel[1].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[2].addShapeBox(-0.5F, 1.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 139
		bodyDoorOpenModel[2].setRotationPoint(-29.5F, -3.25F, -4.5F);
		bodyDoorOpenModel[2].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[3].addShapeBox(-0.5F, 0.25F, -0.3F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 140
		bodyDoorOpenModel[3].setRotationPoint(-29.5F, -3.25F, -4.5F);
		bodyDoorOpenModel[3].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[4].addShapeBox(-0.5F, 2.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 141
		bodyDoorOpenModel[4].setRotationPoint(-29.5F, -3.25F, -4.5F);
		bodyDoorOpenModel[4].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[5].addShapeBox(-2.2F, 2.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 142
		bodyDoorOpenModel[5].setRotationPoint(24.5F, -3.25F, -5.5F);
		bodyDoorOpenModel[5].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[6].addShapeBox(-2.2F, 0.5F, -0.1F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 143
		bodyDoorOpenModel[6].setRotationPoint(24.5F, -3.25F, -5.5F);
		bodyDoorOpenModel[6].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[7].addShapeBox(-2.2F, 1.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 144
		bodyDoorOpenModel[7].setRotationPoint(24.5F, -3.25F, -5.5F);
		bodyDoorOpenModel[7].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[8].addShapeBox(-0.5F, 1.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 145
		bodyDoorOpenModel[8].setRotationPoint(-29.5F, -3.25F, 1.5F);
		bodyDoorOpenModel[8].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[9].addShapeBox(-0.5F, 0.25F, -0.3F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 146
		bodyDoorOpenModel[9].setRotationPoint(-29.5F, -3.25F, 1.5F);
		bodyDoorOpenModel[9].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[10].addShapeBox(-0.5F, 2.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 147
		bodyDoorOpenModel[10].setRotationPoint(-29.5F, -3.25F, 1.5F);
		bodyDoorOpenModel[10].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[11].addShapeBox(-2.2F, 2.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 148
		bodyDoorOpenModel[11].setRotationPoint(24.5F, -3.25F, 2.5F);
		bodyDoorOpenModel[11].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[12].addShapeBox(-2.2F, 0.5F, -0.1F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 149
		bodyDoorOpenModel[12].setRotationPoint(24.5F, -3.25F, 2.5F);
		bodyDoorOpenModel[12].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[13].addShapeBox(-2.2F, 1.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 150
		bodyDoorOpenModel[13].setRotationPoint(24.5F, -3.25F, 2.5F);
		bodyDoorOpenModel[13].rotateAngleZ = 0.19198622F;

		bodyDoorOpenModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F); // Box 151
		bodyDoorOpenModel[14].setRotationPoint(33.5F, -3F, -1F);
		bodyDoorOpenModel[14].rotateAngleZ = 0.29670597F;

		bodyDoorOpenModel[15].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F); // Box 152
		bodyDoorOpenModel[15].setRotationPoint(-16.5F, -3F, -1F);
		bodyDoorOpenModel[15].rotateAngleZ = 0.29670597F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 64
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 124
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 125
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 126
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 127
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 128
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 129
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 131
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 132
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 133
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 134
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 135
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 136

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 20, 3, 9, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 2.15F, -0.1F, 0.25F, 2.5F, -0.1F, 0.25F, 2.5F, -0.1F, 0.25F, 2.15F); // Box 45
		bodyDoorCloseModel[0].setRotationPoint(-29.5F, -3.25F, -4.5F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2.5F, 0.25F, 0.25F, 2.5F, 0.25F, 0.25F, 2.5F, 0F, 0.25F, 2.5F); // Box 64
		bodyDoorCloseModel[1].setRotationPoint(24.5F, -3.25F, -4.5F);

		bodyDoorCloseModel[2].addShapeBox(-0.5F, 1.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 124
		bodyDoorCloseModel[2].setRotationPoint(-29.5F, -3.25F, -4.5F);

		bodyDoorCloseModel[3].addShapeBox(-0.5F, 0.25F, -0.3F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 125
		bodyDoorCloseModel[3].setRotationPoint(-29.5F, -3.25F, -4.5F);

		bodyDoorCloseModel[4].addShapeBox(-0.5F, 2.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 126
		bodyDoorCloseModel[4].setRotationPoint(-29.5F, -3.25F, -4.5F);

		bodyDoorCloseModel[5].addShapeBox(-2.2F, 2.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 127
		bodyDoorCloseModel[5].setRotationPoint(24.5F, -3.25F, -5.5F);

		bodyDoorCloseModel[6].addShapeBox(-2.2F, 0.5F, -0.1F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 128
		bodyDoorCloseModel[6].setRotationPoint(24.5F, -3.25F, -5.5F);

		bodyDoorCloseModel[7].addShapeBox(-2.2F, 1.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 129
		bodyDoorCloseModel[7].setRotationPoint(24.5F, -3.25F, -5.5F);

		bodyDoorCloseModel[8].addShapeBox(-0.5F, 1.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 131
		bodyDoorCloseModel[8].setRotationPoint(-29.5F, -3.25F, 1.5F);

		bodyDoorCloseModel[9].addShapeBox(-0.5F, 0.25F, -0.3F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 132
		bodyDoorCloseModel[9].setRotationPoint(-29.5F, -3.25F, 1.5F);

		bodyDoorCloseModel[10].addShapeBox(-0.5F, 2.25F, -0.3F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 133
		bodyDoorCloseModel[10].setRotationPoint(-29.5F, -3.25F, 1.5F);

		bodyDoorCloseModel[11].addShapeBox(-2.2F, 2.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F); // Box 134
		bodyDoorCloseModel[11].setRotationPoint(24.5F, -3.25F, 2.5F);

		bodyDoorCloseModel[12].addShapeBox(-2.2F, 0.5F, -0.1F, 5, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 135
		bodyDoorCloseModel[12].setRotationPoint(24.5F, -3.25F, 2.5F);

		bodyDoorCloseModel[13].addShapeBox(-2.2F, 1.5F, -0.1F, 5, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 136
		bodyDoorCloseModel[13].setRotationPoint(24.5F, -3.25F, 2.5F);
	}
}