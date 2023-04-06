//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Yankee
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYankee extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelYankee() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 63
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64
		bodyModel[4] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 65
		bodyModel[5] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 66
		bodyModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 67
		bodyModel[7] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 68
		bodyModel[8] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 69
		bodyModel[9] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 70
		bodyModel[10] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 71
		bodyModel[11] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 72
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 74
		bodyModel[14] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 75
		bodyModel[15] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 76
		bodyModel[16] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 77
		bodyModel[17] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 78
		bodyModel[18] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 79
		bodyModel[19] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 80
		bodyModel[20] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 81
		bodyModel[21] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 82
		bodyModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 83
		bodyModel[23] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 84
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 86
		bodyModel[26] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 87
		bodyModel[27] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 88
		bodyModel[28] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 89
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 90
		bodyModel[30] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 91
		bodyModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
		bodyModel[32] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 93
		bodyModel[33] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 94
		bodyModel[34] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 95
		bodyModel[35] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 96
		bodyModel[36] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 97
		bodyModel[37] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 98
		bodyModel[38] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 99
		bodyModel[39] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 100
		bodyModel[40] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 101
		bodyModel[41] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 102
		bodyModel[42] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 103
		bodyModel[43] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 104
		bodyModel[44] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 105
		bodyModel[45] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 106
		bodyModel[46] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 107
		bodyModel[47] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 19
		bodyModel[48] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 20
		bodyModel[49] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 23
		bodyModel[50] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		bodyModel[51] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[52] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 26
		bodyModel[53] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 27
		bodyModel[54] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 115
		bodyModel[55] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 116
		bodyModel[56] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 117
		bodyModel[57] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 118
		bodyModel[58] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 119
		bodyModel[59] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 120
		bodyModel[60] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 121

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 7, 18, 0F,0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 61
		bodyModel[0].setRotationPoint(-35F, -6F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 6, 18, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 62
		bodyModel[1].setRotationPoint(-35F, 1F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 6, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F); // Box 63
		bodyModel[2].setRotationPoint(-35F, 7F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 60, 6, 18, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 64
		bodyModel[3].setRotationPoint(20F, 1F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 60, 7, 18, 0F,0F, -0.5F, -4.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 65
		bodyModel[4].setRotationPoint(20F, -6F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 60, 6, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -0.5F, -4.5F); // Box 66
		bodyModel[5].setRotationPoint(20F, 7F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 6, 18, 0F,0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F); // Box 67
		bodyModel[6].setRotationPoint(-63F, 1F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 28, 6, 18, 0F,0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -1F, -5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -1F, -5F); // Box 68
		bodyModel[7].setRotationPoint(-63F, 7F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 28, 7, 18, 0F,0F, -0.5F, -5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 69
		bodyModel[8].setRotationPoint(-63F, -6F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 6, 18, 0F,0F, 0.5F, -4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -4.5F, 0F, -3.5F, -6.5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -3.5F, -6.5F); // Box 70
		bodyModel[9].setRotationPoint(-85F, 7F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 6, 18, 0F,0F, 0F, -4.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -4.5F); // Box 71
		bodyModel[10].setRotationPoint(-85F, 1F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 7, 18, 0F,0F, -3F, -6.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -3F, -6.5F, 0F, 0F, -4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -4.5F); // Box 72
		bodyModel[11].setRotationPoint(-85F, -6F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, -1F, -1F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1.5F, 3F, 0F, 1.5F, 3F, 0F, -1F, -1F); // Box 73
		bodyModel[12].setRotationPoint(-104F, 2F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,-6.5F, -1.5F, -0.5F, 0F, 2F, 1F, 0F, 2F, 1F, -6.5F, -1.5F, -0.5F, 0F, 3F, -1F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 3F, -1F); // Box 74
		bodyModel[13].setRotationPoint(-104F, -1F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 3F, -1F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 3F, -1F, -6.5F, -1.5F, -0.5F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, -6.5F, -1.5F, -0.5F); // Box 75
		bodyModel[14].setRotationPoint(-104F, 7F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 6, 18, 0F,0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -1F, -5F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, -1F, -5F); // Box 76
		bodyModel[15].setRotationPoint(80F, 7F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 6, 18, 0F,0F, 0.5F, -1F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -1F); // Box 77
		bodyModel[16].setRotationPoint(80F, 1F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 7, 18, 0F,0F, -1F, -4.5F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, -1F, -4.5F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F); // Box 78
		bodyModel[17].setRotationPoint(80F, -6F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -0.5F, -2F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -2F, 0F, -1F, -5.5F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -1F, -5.5F); // Box 79
		bodyModel[18].setRotationPoint(94F, 7F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, 0.5F, -2F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 0.5F, -2F); // Box 80
		bodyModel[19].setRotationPoint(94F, 1F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 7, 18, 0F,0F, -1F, -5.5F, 0F, -2F, -6.5F, 0F, -2F, -6.5F, 0F, -1F, -5.5F, 0F, -0.5F, -2F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -2F); // Box 81
		bodyModel[20].setRotationPoint(94F, -6F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 6, 8, 0F,0F, 0.5F, 0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, -1.5F, -2F, 0.5F, -1.5F, -2F, 0F, 0.5F, 0.5F); // Box 82
		bodyModel[21].setRotationPoint(105F, 1F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, -1.5F, -1.5F, -1.25F, -2.5F, -1.5F, -1.25F, -2.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0.5F, 0.5F, 1F, -2F, 0.5F, 1F, -2F, 0F, 0.5F, 0.5F); // Box 83
		bodyModel[22].setRotationPoint(105F, -4F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, -0.5F, 0.5F, 0.5F, 1.5F, -2F, 0.5F, 1.5F, -2F, 0F, -0.5F, 0.5F, 0F, 0F, -2F, -1.5F, -1.75F, -3F, -1.5F, -1.75F, -3F, 0F, 0F, -2F); // Box 84
		bodyModel[23].setRotationPoint(105F, 7F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.25F, 0F, 0F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1.5F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.25F, 0.5F, 0F); // Box 85
		bodyModel[24].setRotationPoint(109.25F, 1F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 45, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F); // Box 86
		bodyModel[25].setRotationPoint(-3F, -6.75F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, -1.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -2F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F, 0F, 2.5F, 1.5F); // Box 87
		bodyModel[26].setRotationPoint(-18F, -6.75F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, -0.75F, -1.5F, -2F, -0.75F, -1.5F, -2F, 0F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 3F, 1.5F, 0F, 3F, 1.5F, 0F, 2.5F, 1.5F); // Box 88
		bodyModel[27].setRotationPoint(42F, -6.75F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[28].setRotationPoint(51F, -13.75F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 9, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 90
		bodyModel[29].setRotationPoint(45F, -13.75F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F,0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F); // Box 91
		bodyModel[30].setRotationPoint(42F, -13.75F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 92
		bodyModel[31].setRotationPoint(66F, -13.75F, -2.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 93
		bodyModel[32].setRotationPoint(69F, -13.75F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, -0.75F, -0.75F, -0.5F, -1.25F, -0.75F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 94
		bodyModel[33].setRotationPoint(69F, -14.75F, -1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -1.75F, 0F, -0.5F, -1.75F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F); // Box 95
		bodyModel[34].setRotationPoint(66F, -14.75F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[35].setRotationPoint(51F, -14.75F, -2.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.75F, -0.5F, -1.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.75F, -0.5F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F); // Box 97
		bodyModel[36].setRotationPoint(42F, -14.75F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		bodyModel[37].setRotationPoint(45F, -14.75F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 99
		bodyModel[38].setRotationPoint(61F, -9.75F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 100
		bodyModel[39].setRotationPoint(61F, -9.75F, 1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.3F, 0F, 4.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 4.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 101
		bodyModel[40].setRotationPoint(-99F, 3.25F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 102
		bodyModel[41].setRotationPoint(-92F, 3.25F, -13.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0.75F, 0F, -0.25F); // Box 103
		bodyModel[42].setRotationPoint(-98F, -6.5F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0.75F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		bodyModel[43].setRotationPoint(-98F, 5F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[44].setRotationPoint(-100F, 3.2F, -4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[45].setRotationPoint(-100F, 3.2F, 3.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, -0.25F, 0F, 4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 107
		bodyModel[46].setRotationPoint(-92F, 3.25F, 2.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[47].setRotationPoint(-102F, 3.25F, -4.5F);

		bodyModel[48].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 20
		bodyModel[48].setRotationPoint(-101F, 3.75F, -4F);

		bodyModel[49].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 23
		bodyModel[49].setRotationPoint(-101F, 3.75F, -4F);
		bodyModel[49].rotateAngleX = 1.04719755F;

		bodyModel[50].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 24
		bodyModel[50].setRotationPoint(-101F, 3.75F, -4F);
		bodyModel[50].rotateAngleX = 2.0943951F;

		bodyModel[51].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 25
		bodyModel[51].setRotationPoint(-101F, 3.75F, -4F);
		bodyModel[51].rotateAngleX = 3.14159265F;

		bodyModel[52].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 26
		bodyModel[52].setRotationPoint(-101F, 3.75F, -4F);
		bodyModel[52].rotateAngleX = 4.1887902F;

		bodyModel[53].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 27
		bodyModel[53].setRotationPoint(-101F, 3.75F, -4F);
		bodyModel[53].rotateAngleX = 5.23598776F;

		bodyModel[54].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[54].setRotationPoint(-101F, 3.75F, 4F);
		bodyModel[54].rotateAngleX = 2.0943951F;

		bodyModel[55].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[55].setRotationPoint(-101F, 3.75F, 4F);
		bodyModel[55].rotateAngleX = 3.14159265F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[56].setRotationPoint(-102F, 3.25F, 3.5F);

		bodyModel[57].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[57].setRotationPoint(-101F, 3.75F, 4F);

		bodyModel[58].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[58].setRotationPoint(-101F, 3.75F, 4F);
		bodyModel[58].rotateAngleX = 1.04719755F;

		bodyModel[59].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[59].setRotationPoint(-101F, 3.75F, 4F);
		bodyModel[59].rotateAngleX = 4.1887902F;

		bodyModel[60].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[60].setRotationPoint(-101F, 3.75F, 4F);
		bodyModel[60].rotateAngleX = 5.23598776F;
	}
}