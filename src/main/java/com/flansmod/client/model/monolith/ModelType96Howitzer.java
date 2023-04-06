//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type96
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType96Howitzer extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelType96Howitzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[81];
		barrelModel = new ModelRendererTurbo[34];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 24
		bodyModel[1] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 31
		bodyModel[2] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 56
		bodyModel[3] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 81
		bodyModel[4] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 87
		bodyModel[5] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 88
		bodyModel[6] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 90
		bodyModel[7] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 94
		bodyModel[8] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 103
		bodyModel[9] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 104
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 108
		bodyModel[11] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 76
		bodyModel[12] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 77
		bodyModel[13] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 79
		bodyModel[15] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 82
		bodyModel[17] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 83
		bodyModel[18] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 84
		bodyModel[19] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 85
		bodyModel[20] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 86
		bodyModel[21] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 87
		bodyModel[22] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 88
		bodyModel[23] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 89
		bodyModel[24] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 90
		bodyModel[25] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 91
		bodyModel[26] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 92
		bodyModel[27] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 93
		bodyModel[28] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 94
		bodyModel[29] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 95
		bodyModel[30] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 96
		bodyModel[31] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 97
		bodyModel[32] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 98
		bodyModel[33] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 99
		bodyModel[34] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 100
		bodyModel[35] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 101
		bodyModel[36] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 102
		bodyModel[37] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 103
		bodyModel[38] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 104
		bodyModel[39] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 109
		bodyModel[41] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 110
		bodyModel[42] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 111
		bodyModel[43] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 112
		bodyModel[44] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 113
		bodyModel[45] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 114
		bodyModel[46] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 115
		bodyModel[47] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 116
		bodyModel[48] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 117
		bodyModel[49] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 118
		bodyModel[50] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 119
		bodyModel[51] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 120
		bodyModel[52] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 121
		bodyModel[53] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 122
		bodyModel[54] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 123
		bodyModel[55] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 124
		bodyModel[56] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 125
		bodyModel[57] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 126
		bodyModel[58] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 127
		bodyModel[59] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 128
		bodyModel[60] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 130
		bodyModel[62] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 131
		bodyModel[63] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 132
		bodyModel[64] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 141
		bodyModel[68] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 142
		bodyModel[69] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 143
		bodyModel[70] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 144
		bodyModel[71] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 145
		bodyModel[72] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 146
		bodyModel[73] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 148
		bodyModel[75] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 149
		bodyModel[76] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 150
		bodyModel[77] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 151
		bodyModel[78] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 152
		bodyModel[79] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 153
		bodyModel[80] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 154

		bodyModel[0].addShapeBox(-1.5F, -0.5F, -6.5F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[0].setRotationPoint(-14F, -22F, -4F);

		bodyModel[1].addShapeBox(6F, 0F, -3F, 104, 6, 6, 0F,0F, -1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F); // Box 31
		bodyModel[1].setRotationPoint(-118.5F, 1F, -60F);
		bodyModel[1].rotateAngleY = 0.4712389F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[2].setRotationPoint(-4F, -13F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[3].setRotationPoint(-4F, -13F, 14F);

		bodyModel[4].addShapeBox(-1.5F, -1.5F, -6.5F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[4].setRotationPoint(-14F, -22F, -4F);

		bodyModel[5].addShapeBox(-1.5F, -1.5F, -6.5F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		bodyModel[5].setRotationPoint(-14F, -20F, -4F);

		bodyModel[6].addShapeBox(-1.5F, 0F, 0F, 13, 17, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 90
		bodyModel[6].setRotationPoint(-24F, -23F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[7].setRotationPoint(-4F, -8F, -19F);
		bodyModel[7].rotateAngleZ = 0.17453293F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 103
		bodyModel[8].setRotationPoint(-28F, 0F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 9, 28, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[9].setRotationPoint(-14F, -6F, -14F);

		bodyModel[10].addShapeBox(6F, 0F, -3F, 104, 6, 6, 0F,0F, -1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F); // Box 108
		bodyModel[10].setRotationPoint(-118.5F, 1F, 60F);
		bodyModel[10].rotateAngleY = -0.4712389F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[11].setRotationPoint(-6.5F, -28F, -26F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[12].setRotationPoint(-19.5F, -14F, -26F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[13].setRotationPoint(-6.5F, 7F, -26F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[14].setRotationPoint(-6F, -10.5F, -25.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[15].setRotationPoint(-6F, -13.5F, -25.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 82
		bodyModel[16].setRotationPoint(-6F, -7.5F, -25.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F); // Box 83
		bodyModel[17].setRotationPoint(-15F, -23F, -26F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F); // Box 84
		bodyModel[18].setRotationPoint(-15F, -23F, -26F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[19].setRotationPoint(-15F, -4F, -26F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[20].setRotationPoint(-15F, 2F, -26F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F); // Box 87
		bodyModel[21].setRotationPoint(3F, -23F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-0.5F, -5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F); // Box 88
		bodyModel[22].setRotationPoint(3F, 2F, -26F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F); // Box 89
		bodyModel[23].setRotationPoint(9F, -23F, -26F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[24].setRotationPoint(9F, -4F, -26F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[25].setRotationPoint(13.5F, -14F, -26F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[26].setRotationPoint(-3.5F, -11F, -28.5F);

		bodyModel[27].addShapeBox(0F, -1F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[27].setRotationPoint(-1.5F, -9F, -24.5F);

		bodyModel[28].addShapeBox(0F, -1F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[28].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[28].rotateAngleZ = 0.54105207F;

		bodyModel[29].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[29].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[29].rotateAngleZ = 1.04719755F;

		bodyModel[30].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[30].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[30].rotateAngleZ = 1.57079633F;

		bodyModel[31].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[31].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[31].rotateAngleZ = 2.11184839F;

		bodyModel[32].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[32].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[32].rotateAngleZ = 2.60054059F;

		bodyModel[33].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[33].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[33].rotateAngleZ = 3.14159265F;

		bodyModel[34].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[34].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[34].rotateAngleZ = 3.71755131F;

		bodyModel[35].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[35].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[35].rotateAngleZ = 4.2062435F;

		bodyModel[36].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[36].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[36].rotateAngleZ = 4.71238898F;

		bodyModel[37].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[37].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[37].rotateAngleZ = 5.23598776F;

		bodyModel[38].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[38].setRotationPoint(-1.5F, -9F, -24.5F);
		bodyModel[38].rotateAngleZ = 5.74213324F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[39].setRotationPoint(-6.5F, -28F, 21F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[40].setRotationPoint(-19.5F, -14F, 21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[41].setRotationPoint(-6.5F, 7F, 21F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[42].setRotationPoint(-6F, -10.5F, 21.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[43].setRotationPoint(-6F, -13.5F, 21.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 113
		bodyModel[44].setRotationPoint(-6F, -7.5F, 21.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F); // Box 114
		bodyModel[45].setRotationPoint(-15F, -23F, 21F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F); // Box 115
		bodyModel[46].setRotationPoint(-15F, -23F, 21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[47].setRotationPoint(-15F, -4F, 21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[48].setRotationPoint(-15F, 2F, 21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F, -0.5F, -5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F); // Box 118
		bodyModel[49].setRotationPoint(3F, -23F, 21F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,-0.5F, -5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -5F, 0F, -0.5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 5F, 0F); // Box 119
		bodyModel[50].setRotationPoint(3F, 2F, 21F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F); // Box 120
		bodyModel[51].setRotationPoint(9F, -23F, 21F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[52].setRotationPoint(9F, -4F, 21F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[53].setRotationPoint(13.5F, -14F, 21F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[54].setRotationPoint(-3.5F, -11F, 24.5F);

		bodyModel[55].addShapeBox(0F, -1F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[55].setRotationPoint(-1.5F, -9F, 22.5F);

		bodyModel[56].addShapeBox(0F, -1F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[56].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[56].rotateAngleZ = 0.54105207F;

		bodyModel[57].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[57].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[57].rotateAngleZ = 1.04719755F;

		bodyModel[58].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[58].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[58].rotateAngleZ = 1.57079633F;

		bodyModel[59].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[59].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[59].rotateAngleZ = 2.11184839F;

		bodyModel[60].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[60].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[60].rotateAngleZ = 2.60054059F;

		bodyModel[61].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[61].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[61].rotateAngleZ = 3.14159265F;

		bodyModel[62].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[62].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[62].rotateAngleZ = 3.71755131F;

		bodyModel[63].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[63].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[63].rotateAngleZ = 4.2062435F;

		bodyModel[64].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[64].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[64].rotateAngleZ = 4.71238898F;

		bodyModel[65].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[65].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[65].rotateAngleZ = 5.23598776F;

		bodyModel[66].addShapeBox(0F, -1F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[66].setRotationPoint(-1.5F, -9F, 22.5F);
		bodyModel[66].rotateAngleZ = 5.74213324F;

		bodyModel[67].addShapeBox(-1.5F, 0F, 0F, 30, 15, 2, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[67].setRotationPoint(-11F, -23F, -9F);

		bodyModel[68].addShapeBox(-1.5F, 0F, 0F, 30, 15, 2, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[68].setRotationPoint(-11F, -23F, 7F);

		bodyModel[69].addShapeBox(-1.5F, 0F, 0F, 13, 17, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 143
		bodyModel[69].setRotationPoint(-24F, -23F, -9F);

		bodyModel[70].addShapeBox(-1.5F, 0F, 0F, 14, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 144
		bodyModel[70].setRotationPoint(3F, -8F, -8F);

		bodyModel[71].addShapeBox(0F, -4.5F, 0F, 1, 3, 56, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[71].setRotationPoint(-16F, -47F, -28F);
		bodyModel[71].rotateAngleZ = 0.15707963F;

		bodyModel[72].addShapeBox(0F, 9.5F, 0F, 1, 7, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 146
		bodyModel[72].setRotationPoint(-16F, -46F, -28F);
		bodyModel[72].rotateAngleZ = 0.15707963F;

		bodyModel[73].addShapeBox(0F, 16.5F, 6F, 1, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[73].setRotationPoint(-16F, -46F, -23F);
		bodyModel[73].rotateAngleZ = 0.15707963F;

		bodyModel[74].addShapeBox(0F, -2.5F, 0F, 1, 19, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[74].setRotationPoint(-16F, -46F, 5F);
		bodyModel[74].rotateAngleZ = 0.15707963F;

		bodyModel[75].addShapeBox(0F, 16.5F, 6F, 1, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[75].setRotationPoint(-16F, -46F, -1F);
		bodyModel[75].rotateAngleZ = 0.15707963F;

		bodyModel[76].addShapeBox(0F, -2.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 4F, -4F, 0F); // Box 150
		bodyModel[76].setRotationPoint(-16F, -46F, -5F);
		bodyModel[76].rotateAngleZ = 0.15707963F;

		bodyModel[77].addShapeBox(0F, -2.5F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[77].setRotationPoint(-16F, -46F, 0F);
		bodyModel[77].rotateAngleZ = 0.15707963F;

		bodyModel[78].addShapeBox(0F, -2.5F, 0F, 1, 6, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[78].setRotationPoint(-16F, -46F, -28F);
		bodyModel[78].rotateAngleZ = 0.15707963F;

		bodyModel[79].addShapeBox(0F, 3.5F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[79].setRotationPoint(-16F, -46F, -28F);
		bodyModel[79].rotateAngleZ = 0.15707963F;

		bodyModel[80].addShapeBox(0F, 3.5F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[80].setRotationPoint(-16F, -46F, -10F);
		bodyModel[80].rotateAngleZ = 0.15707963F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		barrelModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		barrelModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 4
		barrelModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 5
		barrelModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		barrelModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 10
		barrelModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 11
		barrelModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		barrelModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 14
		barrelModel[9] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 15
		barrelModel[10] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 16
		barrelModel[11] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 17
		barrelModel[12] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 21
		barrelModel[13] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 22
		barrelModel[14] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 23
		barrelModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 41
		barrelModel[16] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 48
		barrelModel[17] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 49
		barrelModel[18] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 50
		barrelModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 51
		barrelModel[20] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 78
		barrelModel[21] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 79
		barrelModel[22] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 80
		barrelModel[23] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 84
		barrelModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 85
		barrelModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
		barrelModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 97
		barrelModel[27] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 105
		barrelModel[28] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 106
		barrelModel[29] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 107
		barrelModel[30] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 136
		barrelModel[31] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 137
		barrelModel[32] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 138
		barrelModel[33] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 139

		barrelModel[0].addShapeBox(29F, -12F, 8.5F, 43, 7, 3, 0F,0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, -0.3F); // Box 2
		barrelModel[0].setRotationPoint(-16F, -22F, -10F);

		barrelModel[1].addShapeBox(29F, -12F, 6.8F, 43, 7, 2, 0F,0F, -2.3F, 0F, 0F, -2.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.3F, 0F, 0F, -2.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[1].setRotationPoint(-16F, -22F, -10F);

		barrelModel[2].addShapeBox(29F, -12F, 11.2F, 43, 7, 2, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, 0F, 0F, -2.3F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, 0F, 0F, -2.3F, 0F); // Box 4
		barrelModel[2].setRotationPoint(-16F, -22F, -10F);

		barrelModel[3].addShapeBox(-27F, -14F, 8.5F, 4, 11, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 5
		barrelModel[3].setRotationPoint(-7F, -22F, -10F);

		barrelModel[4].addShapeBox(-27F, -14F, 4.5F, 4, 11, 4, 0F,0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 6
		barrelModel[4].setRotationPoint(-7F, -22F, -10F);

		barrelModel[5].addShapeBox(-27F, -13.5F, 8.5F, 34, 10, 3, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 10
		barrelModel[5].setRotationPoint(-16F, -22F, -10F);

		barrelModel[6].addShapeBox(-27F, -14F, 4.5F, 34, 11, 4, 0F,0F, -3.8F, -0.8F, 0F, -3.8F, -0.8F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -3.8F, -0.8F, 0F, -3.8F, -0.8F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 11
		barrelModel[6].setRotationPoint(-16F, -22F, -10F);

		barrelModel[7].addShapeBox(-27F, -14F, 11.5F, 34, 11, 4, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -3.8F, -0.8F, 0F, -3.8F, -0.8F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -3.8F, -0.8F, 0F, -3.8F, -0.8F); // Box 12
		barrelModel[7].setRotationPoint(-16F, -22F, -10F);

		barrelModel[8].addShapeBox(-27F, -14F, 11.5F, 4, 11, 4, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -3.3F, -0.3F, 0F, -3.3F, -0.3F); // Box 14
		barrelModel[8].setRotationPoint(-7F, -22F, -10F);

		barrelModel[9].addShapeBox(-28.5F, -9.5F, 7F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[9].setRotationPoint(-16F, -22F, -10F);

		barrelModel[10].addShapeBox(-28.5F, -11.5F, 7F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[10].setRotationPoint(-16F, -22F, -10F);

		barrelModel[11].addShapeBox(-28.5F, -7.5F, 7F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 17
		barrelModel[11].setRotationPoint(-16F, -22F, -10F);

		barrelModel[12].addShapeBox(71.5F, -9.5F, 7F, 4, 2, 6, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 21
		barrelModel[12].setRotationPoint(-16F, -22F, -10F);

		barrelModel[13].addShapeBox(71.5F, -11.9F, 7F, 4, 2, 6, 0F,0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 22
		barrelModel[13].setRotationPoint(-16F, -22F, -10F);

		barrelModel[14].addShapeBox(71.5F, -7.1F, 7F, 4, 2, 6, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F); // Box 23
		barrelModel[14].setRotationPoint(-16F, -22F, -10F);

		barrelModel[15].addShapeBox(-25F, -4F, 7F, 60, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		barrelModel[15].setRotationPoint(-16F, -22F, -10F);

		barrelModel[16].addShapeBox(-13.5F, -5F, -7F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[16].setRotationPoint(-16F, -22F, 0F);

		barrelModel[17].addShapeBox(-13.5F, -8F, -7F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[17].setRotationPoint(-16F, -22F, 0F);

		barrelModel[18].addShapeBox(-13.5F, -2F, -7F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 50
		barrelModel[18].setRotationPoint(-16F, -22F, 0F);

		barrelModel[19].addShapeBox(-9.5F, -4F, -7.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		barrelModel[19].setRotationPoint(-16F, -22F, 0F);

		barrelModel[20].addShapeBox(26F, -11.9F, 7F, 3, 2, 6, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 78
		barrelModel[20].setRotationPoint(-16F, -22F, -10F);

		barrelModel[21].addShapeBox(26F, -9.5F, 7F, 3, 2, 6, 0F,0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F); // Box 79
		barrelModel[21].setRotationPoint(-16F, -22F, -10F);

		barrelModel[22].addShapeBox(26F, -7.1F, 7F, 3, 4, 6, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 80
		barrelModel[22].setRotationPoint(-16F, -22F, -10F);

		barrelModel[23].addShapeBox(-48F, 1F, 6F, 95, 2, 8, 0F,2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.9F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 84
		barrelModel[23].setRotationPoint(-16F, -22F, -10F);

		barrelModel[24].addShapeBox(-51F, -3F, 6F, 98, 4, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 85
		barrelModel[24].setRotationPoint(-16F, -22F, -10F);

		barrelModel[25].addShapeBox(-51F, -3F, 13F, 98, 4, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 86
		barrelModel[25].setRotationPoint(-16F, -22F, -10F);

		barrelModel[26].addShapeBox(-18F, 2F, 7.5F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[26].setRotationPoint(-16F, -22F, -10F);

		barrelModel[27].addShapeBox(7F, -14F, 11.5F, 19, 11, 4, 0F,0F, -0.5F, -0.3F, 0F, -2F, -0.3F, 0F, -3.8F, -2F, 0F, -3.8F, -0.8F, 0F, -0.5F, -0.3F, 0F, -2F, -0.3F, 0F, -3.8F, -2F, 0F, -3.8F, -0.8F); // Box 105
		barrelModel[27].setRotationPoint(-16F, -22F, -10F);

		barrelModel[28].addShapeBox(7F, -13.5F, 8.5F, 19, 10, 3, 0F,0F, 0F, 0.3F, 0F, -1.5F, 0.3F, 0F, -1.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.5F, 0.3F, 0F, -1.5F, 0.3F, 0F, 0F, 0.3F); // Box 106
		barrelModel[28].setRotationPoint(-16F, -22F, -10F);

		barrelModel[29].addShapeBox(7F, -14F, 4.5F, 19, 11, 4, 0F,0F, -3.8F, -0.8F, 0F, -3.8F, -2F, 0F, -2F, -0.3F, 0F, -0.5F, -0.3F, 0F, -3.8F, -0.8F, 0F, -3.8F, -2F, 0F, -2F, -0.3F, 0F, -0.5F, -0.3F); // Box 107
		barrelModel[29].setRotationPoint(-16F, -22F, -10F);

		barrelModel[30].addShapeBox(-18F, 4F, 7.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 136
		barrelModel[30].setRotationPoint(-16F, -22F, -10F);

		barrelModel[31].addShapeBox(-17F, 7F, 7.5F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 137
		barrelModel[31].setRotationPoint(-16F, -22F, -10F);

		barrelModel[32].addShapeBox(-15.5F, 9F, 7.5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F); // Box 138
		barrelModel[32].setRotationPoint(-16F, -22F, -10F);

		barrelModel[33].addShapeBox(-12.5F, 11F, 7.5F, 7, 2, 5, 0F,-2.5F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -2.5F, 0F, 0F, 0F, -2F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, 0F, -2F, 0F); // Box 139
		barrelModel[33].setRotationPoint(-16F, -21F, -10F);
	}
}