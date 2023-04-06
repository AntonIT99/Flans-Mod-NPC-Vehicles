//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HMSTrump
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHMSTrump extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelHMSTrump() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 65
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 66
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
		bodyModel[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 68
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 69
		bodyModel[6] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 70
		bodyModel[7] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 71
		bodyModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 72
		bodyModel[9] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 73
		bodyModel[10] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 74
		bodyModel[11] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 75
		bodyModel[12] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 76
		bodyModel[13] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 77
		bodyModel[14] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 78
		bodyModel[15] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 79
		bodyModel[16] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 80
		bodyModel[17] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 81
		bodyModel[18] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 83
		bodyModel[20] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 84
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[22] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 87
		bodyModel[24] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 88
		bodyModel[25] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 90
		bodyModel[27] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 91
		bodyModel[28] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 92
		bodyModel[29] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 93
		bodyModel[30] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 94
		bodyModel[31] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 95
		bodyModel[32] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 96
		bodyModel[33] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 97
		bodyModel[34] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 98
		bodyModel[35] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 99
		bodyModel[36] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 100
		bodyModel[37] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 101
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 102
		bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 103
		bodyModel[40] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 104
		bodyModel[41] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 105
		bodyModel[42] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 106
		bodyModel[43] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 107
		bodyModel[44] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 109
		bodyModel[46] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 110
		bodyModel[47] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 111
		bodyModel[48] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 112
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 113
		bodyModel[50] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 114
		bodyModel[51] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 116
		bodyModel[53] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 117
		bodyModel[54] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 118
		bodyModel[55] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 119
		bodyModel[56] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 120
		bodyModel[57] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 121
		bodyModel[58] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 122
		bodyModel[59] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 124
		bodyModel[61] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 125
		bodyModel[62] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 18
		bodyModel[65] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 21
		bodyModel[66] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 22
		bodyModel[67] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[68] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 27
		bodyModel[69] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[70] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 29
		bodyModel[71] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 30
		bodyModel[72] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 51
		bodyModel[73] = new ModelRendererTurbo(this, 4, 176, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[0].setRotationPoint(-13F, -2F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 3, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[1].setRotationPoint(-13F, -5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F); // Box 66
		bodyModel[2].setRotationPoint(-13F, 2F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 4, 16, 0F,0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 67
		bodyModel[3].setRotationPoint(-48F, -2F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 3, 16, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F); // Box 68
		bodyModel[4].setRotationPoint(-48F, -5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 35, 4, 16, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -1F, -6F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -1F, -6F); // Box 69
		bodyModel[5].setRotationPoint(-48F, 2F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 70
		bodyModel[6].setRotationPoint(9F, -2F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 71
		bodyModel[7].setRotationPoint(9F, -5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0.5F, -5F); // Box 72
		bodyModel[8].setRotationPoint(9F, 2F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 73
		bodyModel[9].setRotationPoint(26F, -2F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 14, 0F,0F, 0F, -3.5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 74
		bodyModel[10].setRotationPoint(26F, -5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 10, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F); // Box 75
		bodyModel[11].setRotationPoint(26F, 2F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 23, 4, 10, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 76
		bodyModel[12].setRotationPoint(44F, -2F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 23, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0.5F, -3F); // Box 77
		bodyModel[13].setRotationPoint(44F, 2F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 23, 3, 10, 0F,0F, -0.5F, -2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 78
		bodyModel[14].setRotationPoint(44F, -5F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 20, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[15].setRotationPoint(24F, -8.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 80
		bodyModel[16].setRotationPoint(11F, -8.5F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 5, 7, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[17].setRotationPoint(-5F, -9.5F, -3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 82
		bodyModel[18].setRotationPoint(-11F, -9.5F, -3.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[19].setRotationPoint(-40F, -9.5F, -3.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 5, 7, 0F,0F, -1.8F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.8F, -2.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 84
		bodyModel[20].setRotationPoint(-71F, -9.5F, -3.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -2.5F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, -2.5F, 0F, -0.5F, 0.8F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0.8F, 0F); // Box 85
		bodyModel[21].setRotationPoint(-74F, -7.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 22, 4, 12, 0F,0F, 1F, -3F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1F, -3F, 0F, -2F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, -3.5F); // Box 86
		bodyModel[22].setRotationPoint(-70F, -2F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -1F); // Box 87
		bodyModel[23].setRotationPoint(-70F, -5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F,0F, 2F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, -1.5F, 0F, -3.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3.5F, -3F); // Box 88
		bodyModel[24].setRotationPoint(-70F, 2F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0.5F, 0.3F, -1.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0.3F, -1.7F, 0.5F, -0.7F, -1.7F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0.5F, -0.7F, -1.7F); // Box 89
		bodyModel[25].setRotationPoint(-83F, -3F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0.5F, -0.3F, -1.7F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0.5F, -0.3F, -1.7F, -0.5F, -0.2F, -1.7F, 0F, 3.5F, -1F, 0F, 3.5F, -1F, -0.5F, -0.2F, -1.7F); // Box 90
		bodyModel[26].setRotationPoint(-83F, -3F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,-4.5F, 0F, -1.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4.5F, 0F, -1.3F, 0.5F, -0.3F, -1.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, -0.3F, -1.7F); // Box 91
		bodyModel[27].setRotationPoint(-83F, -4F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,45F, 3F, 0.5F, 50F, 0.5F, 0.5F, 50F, 0.5F, 0.5F, 45F, 3F, 0.5F, 40F, -1F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, -1F, 0F); // Box 92
		bodyModel[28].setRotationPoint(-11F, 6F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, -0.5F, 2.5F, 0F, -2.5F, 2.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2.5F, -2F, -1F, -2.5F, -2F, -1F, -2.5F, 0F, -0.5F, -2.5F); // Box 93
		bodyModel[29].setRotationPoint(67F, 2F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0F, 2.5F, 0F, -2.5F, 2.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[30].setRotationPoint(67F, -2F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0.3F, 3F, 0F, -2.5F, 3F, 0F, -2.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 2.5F, 0F, -2.5F, 2.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 95
		bodyModel[31].setRotationPoint(67F, -5F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 4, 6, 0F,0F, 0F, 0F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[32].setRotationPoint(44F, -8.5F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 9F, 0.5F, 0F); // Box 97
		bodyModel[33].setRotationPoint(57F, -11F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, -2F, -1.5F, -2F, -2F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, 0F, 0F, 0.2F); // Box 98
		bodyModel[34].setRotationPoint(67F, -11F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 5, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[35].setRotationPoint(-5F, -13.8F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 100
		bodyModel[36].setRotationPoint(9F, -13.3F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F); // Box 101
		bodyModel[37].setRotationPoint(-10F, -13.8F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[38].setRotationPoint(-3.5F, -18F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 103
		bodyModel[39].setRotationPoint(-0.5F, -18F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, -1F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F); // Box 104
		bodyModel[40].setRotationPoint(-4.5F, -18F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -1F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -1F); // Box 105
		bodyModel[41].setRotationPoint(-7.5F, -17F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, -1F, -1.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, -1F, -1.8F, 0.5F, 0F, -1.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1.8F); // Box 106
		bodyModel[42].setRotationPoint(-8.5F, -17F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[43].setRotationPoint(-3F, -26F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[44].setRotationPoint(-7F, -26F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[45].setRotationPoint(-1F, -15.8F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.7F); // Box 110
		bodyModel[46].setRotationPoint(-1F, -15.8F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, 0.5F, 0F, 0.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, -1.5F); // Box 111
		bodyModel[47].setRotationPoint(-5F, -8F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0F, 0.5F, -1.5F, -1.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, -1.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[48].setRotationPoint(-5F, -8F, -6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[49].setRotationPoint(-11F, -16.8F, -2.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F); // Box 114
		bodyModel[50].setRotationPoint(-10F, -16.8F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Box 115
		bodyModel[51].setRotationPoint(-13F, -16.8F, -2.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 116
		bodyModel[52].setRotationPoint(-11F, -12.8F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[53].setRotationPoint(-75F, -1F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[54].setRotationPoint(-80F, 1F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[55].setRotationPoint(-72.5F, -2F, 1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F); // Box 120
		bodyModel[56].setRotationPoint(-72.5F, -2F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 121
		bodyModel[57].setRotationPoint(67F, -7.8F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 1.5F, 1F, 0F, 0F, 1F, 0F); // Box 122
		bodyModel[58].setRotationPoint(67F, -7.8F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[59].setRotationPoint(7F, -13.5F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[60].setRotationPoint(5.5F, -15.2F, -0.5F);
		bodyModel[60].rotateAngleZ = 0.10471976F;

		bodyModel[61].addShapeBox(5F, 0.5F, 0F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F); // Box 125
		bodyModel[61].setRotationPoint(4.5F, -15.2F, -0.5F);
		bodyModel[61].rotateAngleZ = 0.10471976F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, -1.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[62].setRotationPoint(-78F, 3F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -1.5F); // Box 127
		bodyModel[63].setRotationPoint(-78F, 3F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 18
		bodyModel[64].setRotationPoint(-67.2F, 2.8F, -2.5F);

		bodyModel[65].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[65].setRotationPoint(-67F, 3.3F, -2F);

		bodyModel[66].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[66].setRotationPoint(-67F, 3.3F, -2F);
		bodyModel[66].rotateAngleX = 2.0943951F;

		bodyModel[67].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[67].setRotationPoint(-67F, 3.3F, -2F);
		bodyModel[67].rotateAngleX = 4.1887902F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 27
		bodyModel[68].setRotationPoint(-67.2F, 2.8F, 1.5F);

		bodyModel[69].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[69].setRotationPoint(-67F, 3.3F, 2F);

		bodyModel[70].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[70].setRotationPoint(-67F, 3.3F, 2F);
		bodyModel[70].rotateAngleX = 2.0943951F;

		bodyModel[71].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[71].setRotationPoint(-67F, 3.3F, 2F);
		bodyModel[71].rotateAngleX = 4.1887902F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[72].setRotationPoint(-9F, -25F, -0.5F);
		bodyModel[72].rotateAngleZ = 0.08726646F;

		bodyModel[73].addShapeBox(-10F, -3F, 0F, 27, 17, 1, 0F,-4.5F, -3.5F, -0.4F, -16.5F, -3.5F, -0.4F, -16.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -9.5F, -0.4F, -16.5F, -9.5F, -0.4F, -16.5F, -9.5F, -0.4F, -4.5F, -9.5F, -0.4F); // Box 52
		bodyModel[73].setRotationPoint(-9F, -25F, -0.5F);
		bodyModel[73].rotateAngleZ = 0.08726646F;
	}
}