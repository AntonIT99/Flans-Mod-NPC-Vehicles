//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Conte
// Model Creator: 
// Created on: 22.07.2020 - 16:37:26
// Last changed on: 22.07.2020 - 16:37:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelConte extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelConte() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[103];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 65
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 72
		bodyModel[46] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 73
		bodyModel[47] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 74
		bodyModel[48] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 76
		bodyModel[49] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 77
		bodyModel[50] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 78
		bodyModel[51] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 79
		bodyModel[52] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 80
		bodyModel[53] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 81
		bodyModel[54] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 82
		bodyModel[55] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 83
		bodyModel[56] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 105
		bodyModel[65] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 106
		bodyModel[66] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 107
		bodyModel[67] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 113
		bodyModel[73] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 114
		bodyModel[74] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 115
		bodyModel[75] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 117
		bodyModel[76] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 104
		bodyModel[77] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 39
		bodyModel[78] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 40
		bodyModel[79] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 41
		bodyModel[80] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 97
		bodyModel[94] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 98
		bodyModel[95] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 99
		bodyModel[96] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 100
		bodyModel[97] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 105
		bodyModel[102] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 106

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 11, 57, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-13F, -7F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 51, 0F,19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -7F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 11, 45, 0F,10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-91F, -7F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 11, 39, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-116F, -7F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 11, 29, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-138F, -7F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-157F, -7F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-173F, -7F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 11, 9, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F); // Box 8
		bodyModel[7].setRotationPoint(-181F, -7F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 11, 57, 0F,17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F, 17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(34.5F, -7F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 11, 49, 0F,15F, 0F, 0F, 15F, 0F, -5F, 15F, 0F, -5F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -4F, 15F, 0F, -4F, 15F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(72F, -7F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 11, 41, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(88F, -7F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 6, 25, 0F,10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, 0F); // Box 12
		bodyModel[11].setRotationPoint(113F, -6.5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 6F, 0F, 0F, 6.2F, -5F, 0F, 6.2F, -5F, 0F, 6F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, -5F, 0F, 4.5F, -5F, 0F, 4.5F, 0F); // Box 13
		bodyModel[12].setRotationPoint(153F, -5.5F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 6.2F, 0F, 0F, 6.4F, -2.5F, 0F, 6.4F, -2.5F, 0F, 6.2F, 0F, 0F, 4.5F, 0F, 1F, 4.5F, -2.5F, 1F, 4.5F, -2.5F, 0F, 4.5F, 0F); // Box 14
		bodyModel[13].setRotationPoint(173F, -5.5F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 8, 25, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[14].setRotationPoint(90F, -11.5F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(64F, -11F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 8, 44, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(61F, -11F, -21.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 8, 44, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 18
		bodyModel[17].setRotationPoint(53F, -11F, -21.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 8, 44, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(49F, -11F, -21.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 8, 48, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 20
		bodyModel[19].setRotationPoint(42F, -11F, -23.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 8, 52, 0F,15F, 0F, 0.5F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0.5F); // Box 21
		bodyModel[20].setRotationPoint(24F, -11F, -25.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 8, 54, 0F,20F, 0F, 0F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-17F, -11F, -27F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-42F, -11F, -22.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 46, 0F,9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-53F, -11F, -22.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-81F, -11F, -9.5F);

		bodyModel[25].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(96.5F, -10F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(88F, -10F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(88F, -10F, 2.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(18F, -10F, -12F);

		bodyModel[29].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(26.5F, -10F, -14.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(18F, -10F, -23F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-31F, -10F, 18F);

		bodyModel[32].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-22.5F, -10F, 15.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-31F, -10F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-89F, -16F, 3.5F);

		bodyModel[35].addShapeBox(-8.5F, 0F, -2.5F, 17, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-80.5F, -16F, 1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 12, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-89F, -16F, -7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-121.5F, -10F, 3.5F);

		bodyModel[38].addShapeBox(-9F, 0F, -2.5F, 18, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-112.5F, -10F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 18, 5, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-121.5F, -10F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 50
		bodyModel[40].setRotationPoint(30F, -43F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 32, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[41].setRotationPoint(22F, -43F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 32, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 52
		bodyModel[42].setRotationPoint(20F, -43F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[43].setRotationPoint(-181F, -24F, 0F);
		bodyModel[43].rotateAngleZ = 0.03490659F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 71
		bodyModel[44].setRotationPoint(17.5F, -65F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 72
		bodyModel[45].setRotationPoint(17.5F, -62F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 50F, -0.2F, -0.2F, 50F, -0.2F, -0.2F, 50F, -0.2F, -0.2F, 50F, -0.2F); // Box 73
		bodyModel[46].setRotationPoint(18F, -118F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 74
		bodyModel[47].setRotationPoint(18F, -64F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[48].setRotationPoint(62F, -7F, 20F);
		bodyModel[48].rotateAngleY = 0.73303829F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[49].setRotationPoint(44F, -7F, 23F);
		bodyModel[49].rotateAngleY = 0.73303829F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[50].setRotationPoint(-73F, -7F, 23F);
		bodyModel[50].rotateAngleY = -0.73303829F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[51].setRotationPoint(-45F, -7F, 29F);
		bodyModel[51].rotateAngleY = -0.73303829F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[52].setRotationPoint(62F, -7F, -19F);
		bodyModel[52].rotateAngleY = -0.73303829F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[53].setRotationPoint(44F, -7F, -22F);
		bodyModel[53].rotateAngleY = -0.73303829F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[54].setRotationPoint(-68F, -7F, -17F);
		bodyModel[54].rotateAngleY = -2.19911486F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[55].setRotationPoint(-40F, -7F, -23F);
		bodyModel[55].rotateAngleY = -2.19911486F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 15, 1, 41, 0F,0F, 7F, 0F, 0F, 7F, -3.5F, 0F, 7F, -3.5F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 7F, -8.5F, 0F, 7F, -8.5F, 0F, 7F, -6F); // Box 97
		bodyModel[56].setRotationPoint(88F, 11F, -20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,15F, 7F, 0F, 15F, 7F, -4F, 15F, 7F, -4F, 15F, 7F, 0F, 15F, 7F, -5F, 15F, 7F, -10F, 15F, 7F, -10F, 15F, 7F, -5F); // Box 98
		bodyModel[57].setRotationPoint(72F, 11F, -24F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 1, 57, 0F,17.5F, 7F, 0F, 17.5F, 7F, -4F, 17.5F, 7F, -4F, 17.5F, 7F, 0F, 17.5F, 7F, -5F, 17.5F, 7F, -9F, 17.5F, 7F, -9F, 17.5F, 7F, -5F); // Box 99
		bodyModel[58].setRotationPoint(34.5F, 11F, -28F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 1, 57, 0F,20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F); // Box 100
		bodyModel[59].setRotationPoint(-13F, 11F, -28F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,19F, 7F, 0F, 19F, 7F, 3F, 19F, 7F, 3F, 19F, 7F, 0F, 19F, 7F, -5F, 19F, 7F, -2F, 19F, 7F, -2F, 19F, 7F, -5F); // Box 101
		bodyModel[60].setRotationPoint(-53F, 11F, -25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 45, 0F,10F, 7F, 0F, 10F, 7F, 3F, 10F, 7F, 3F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -2F, 10F, 7F, -2F, 10F, 7F, -5F); // Box 102
		bodyModel[61].setRotationPoint(-91F, 11F, -22F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 1, 29, 0F,0F, 7F, 0F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 7F, 0F, -4F, 6F, -5F, 0F, 7F, 0F, 0F, 7F, 0F, -4F, 6F, -5F); // Box 103
		bodyModel[62].setRotationPoint(-138F, 11F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 39, 0F,0F, 7F, 0F, 0F, 7F, 3F, 0F, 7F, 3F, 0F, 7F, 0F, 0F, 7F, -5F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 7F, -5F); // Box 104
		bodyModel[63].setRotationPoint(-116F, 11F, -19F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -2F); // Box 105
		bodyModel[64].setRotationPoint(-173F, 4F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 19, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, -3F, 3F, 0F, 2F, 3F, 0F, 2F, 0F, -2F, -3F); // Box 106
		bodyModel[65].setRotationPoint(-157F, 4F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, -1.5F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, -1F, -4F); // Box 107
		bodyModel[66].setRotationPoint(-181F, 4F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 50, 5, 34, 0F,0F, 5F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 5F, 0F, 0F, 5F, -5F, -8F, 4F, -14F, -8F, 4F, -14F, 0F, 5F, -5F); // Box 108
		bodyModel[67].setRotationPoint(103F, 9F, -16.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8F, 0F, -5F, -2F, -6F, -7F, -2F, -6F, -7F, 8F, 0F, -5F); // Box 109
		bodyModel[68].setRotationPoint(153F, 4F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, -3F, -2.8F, 0F, -3F, -2.8F, 2F, 0F, -2F); // Box 110
		bodyModel[69].setRotationPoint(173F, 4F, -2.5F);

		bodyModel[70].addShapeBox(-18F, 0F, 0F, 18, 15, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 111
		bodyModel[70].setRotationPoint(-181F, -24F, 0F);
		bodyModel[70].rotateAngleZ = 0.03490659F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, 0F, 55F, 0F); // Box 112
		bodyModel[71].setRotationPoint(-39F, -61F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 113
		bodyModel[72].setRotationPoint(-39F, -64F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 52F, -0.2F, -0.2F, 52F, -0.2F, -0.2F, 52F, -0.2F, -0.2F, 52F, -0.2F); // Box 114
		bodyModel[73].setRotationPoint(-39.5F, -119F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[74].setRotationPoint(-39.5F, -66F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 117
		bodyModel[75].setRotationPoint(174F, -25F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[76].setRotationPoint(30F, -27F, -5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[77].setRotationPoint(51F, -19F, 3.5F);

		bodyModel[78].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[78].setRotationPoint(59.5F, -19F, 1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[79].setRotationPoint(51F, -19F, -7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(51F, -19F, 3.5F);

		bodyModel[81].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(59.5F, -19F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(51F, -19F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 84
		bodyModel[83].setRotationPoint(83F, -13F, 3.5F);

		bodyModel[84].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[84].setRotationPoint(91.5F, -13F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[85].setRotationPoint(83F, -13F, -7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F); // Box 88
		bodyModel[86].setRotationPoint(30F, -27F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(-52F, -41F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 16, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F); // Box 92
		bodyModel[88].setRotationPoint(-54F, -27F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 15, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 93
		bodyModel[89].setRotationPoint(-54F, -41F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 31, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 94
		bodyModel[90].setRotationPoint(-44F, -41F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 95
		bodyModel[91].setRotationPoint(-20F, -13F, 3.5F);

		bodyModel[92].addShapeBox(-8.5F, 0F, -2.5F, 17, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(-11.5F, -13F, 1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 17, 9, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[93].setRotationPoint(-20F, -13F, -7.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 18, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[94].setRotationPoint(38F, -28F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[95].setRotationPoint(37F, -32F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 100
		bodyModel[96].setRotationPoint(45F, -32F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[97].setRotationPoint(34F, -24F, -2.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[98].setRotationPoint(-67F, -24F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[99].setRotationPoint(-61F, -24F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[100].setRotationPoint(-69F, -25F, -4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 6, 25, 0F,10F, 4.5F, 0F, 10F, 5F, -4.5F, 10F, 5F, -4.5F, 10F, 4.5F, 0F, 10F, 4.5F, 0F, 10F, 4.5F, -4.5F, 10F, 4.5F, -4.5F, 10F, 4.5F, 0F); // Box 105
		bodyModel[101].setRotationPoint(136F, -6.5F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 23, 11, 34, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(103F, -7F, -16.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 123
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 124
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 125
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 126
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 127
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 128

		gun_2_Model[0][0].addShapeBox(7F, -1.5F, -4F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123

		gun_2_Model[0][1].addShapeBox(-10F, -2.5F, -4F, 17, 5, 8, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 124

		gun_2_Model[0][2].addShapeBox(2F, -2.5F, 4F, 5, 5, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 125

		gun_2_Model[0][3].addShapeBox(-10F, -2.5F, 4F, 12, 5, 4, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -3.9F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -3.9F); // Box 126

		gun_2_Model[0][4].addShapeBox(2F, -2.5F, -8F, 5, 5, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127

		gun_2_Model[0][5].addShapeBox(-10F, -2.5F, -8F, 12, 5, 4, 0F,0.5F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 128

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(59.5F, -22F, 1F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 120
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 121
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122

		gun_2_Model[1][0].addShapeBox(0F, 0F, -2.6F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 119

		gun_2_Model[1][1].addShapeBox(12F, 0F, -2.6F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 120

		gun_2_Model[1][2].addShapeBox(0F, 0F, 1.3F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 121

		gun_2_Model[1][3].addShapeBox(12F, 0F, 1.3F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 122

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(59.5F, -22F, 1F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 123
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 124
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 125
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 126
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 127
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 128

		gun_3_Model[0][0].addShapeBox(7F, -1.5F, -4.5F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123

		gun_3_Model[0][1].addShapeBox(-10F, -2.5F, -4.5F, 17, 5, 9, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 124

		gun_3_Model[0][2].addShapeBox(2F, -2.5F, 4.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 125

		gun_3_Model[0][3].addShapeBox(-10F, -2.5F, 4.5F, 12, 5, 4, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -3.9F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -3.9F); // Box 126

		gun_3_Model[0][4].addShapeBox(2F, -2.5F, -8.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127

		gun_3_Model[0][5].addShapeBox(-10F, -2.5F, -8.5F, 12, 5, 4, 0F,0.5F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 128

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(91.5F, -16F, 1F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 120
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 121
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 129
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 130

		gun_3_Model[1][0].addShapeBox(0F, 0F, -3.6F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 119

		gun_3_Model[1][1].addShapeBox(12F, 0F, -3.6F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 120

		gun_3_Model[1][2].addShapeBox(0F, 0F, 2.3F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 121

		gun_3_Model[1][3].addShapeBox(12F, 0F, 2.3F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 122

		gun_3_Model[1][4].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 129

		gun_3_Model[1][5].addShapeBox(12F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 130

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(91.5F, -16F, 1F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 123
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 124
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 125
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 126
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 127
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 128

		gun_4_Model[0][0].addShapeBox(7F, -1.5F, -4.5F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123

		gun_4_Model[0][1].addShapeBox(-10F, -2.5F, -4.5F, 17, 5, 9, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 124

		gun_4_Model[0][2].addShapeBox(2F, -2.5F, 4.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 125

		gun_4_Model[0][3].addShapeBox(-10F, -2.5F, 4.5F, 12, 5, 4, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -3.9F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -3.9F); // Box 126

		gun_4_Model[0][4].addShapeBox(2F, -2.5F, -8.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127

		gun_4_Model[0][5].addShapeBox(-10F, -2.5F, -8.5F, 12, 5, 4, 0F,0.5F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 128

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-11.5F, -16F, 1F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[6];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 120
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 121
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 129
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 130

		gun_4_Model[1][0].addShapeBox(0F, 0F, -3.6F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 119

		gun_4_Model[1][1].addShapeBox(12F, 0F, -3.6F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 120

		gun_4_Model[1][2].addShapeBox(0F, 0F, 2.3F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 121

		gun_4_Model[1][3].addShapeBox(12F, 0F, 2.3F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 122

		gun_4_Model[1][4].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 129

		gun_4_Model[1][5].addShapeBox(12F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 130

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-11.5F, -16F, 1F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 123
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 124
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 125
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 126
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 127
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 128

		gun_5_Model[0][0].addShapeBox(7F, -1.5F, -4F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123

		gun_5_Model[0][1].addShapeBox(-10F, -2.5F, -4F, 17, 5, 8, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 124

		gun_5_Model[0][2].addShapeBox(2F, -2.5F, 4F, 5, 5, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 125

		gun_5_Model[0][3].addShapeBox(-10F, -2.5F, 4F, 12, 5, 4, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -3.9F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -3.9F); // Box 126

		gun_5_Model[0][4].addShapeBox(2F, -2.5F, -8F, 5, 5, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127

		gun_5_Model[0][5].addShapeBox(-10F, -2.5F, -8F, 12, 5, 4, 0F,0.5F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 128

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-80.5F, -19F, 1F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[4];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 120
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 121
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122

		gun_5_Model[1][0].addShapeBox(0F, 0F, -2.6F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 119

		gun_5_Model[1][1].addShapeBox(12F, 0F, -2.6F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 120

		gun_5_Model[1][2].addShapeBox(0F, 0F, 1.3F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 121

		gun_5_Model[1][3].addShapeBox(12F, 0F, 1.3F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 122

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-80.5F, -19F, 1F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[6];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 123
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 124
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 125
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 126
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 127
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 128

		gun_6_Model[0][0].addShapeBox(7F, -1.5F, -4.5F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 123

		gun_6_Model[0][1].addShapeBox(-10F, -2.5F, -4.5F, 17, 5, 9, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 124

		gun_6_Model[0][2].addShapeBox(2F, -2.5F, 4.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 125

		gun_6_Model[0][3].addShapeBox(-10F, -2.5F, 4.5F, 12, 5, 4, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, -3.9F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -3.9F); // Box 126

		gun_6_Model[0][4].addShapeBox(2F, -2.5F, -8.5F, 5, 5, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127

		gun_6_Model[0][5].addShapeBox(-10F, -2.5F, -8.5F, 12, 5, 4, 0F,0.5F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 128

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-112.5F, -13F, 1F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[6];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 120
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 121
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 129
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 130

		gun_6_Model[1][0].addShapeBox(0F, 0F, -3.6F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 119

		gun_6_Model[1][1].addShapeBox(12F, 0F, -3.6F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 120

		gun_6_Model[1][2].addShapeBox(0F, 0F, 2.3F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 121

		gun_6_Model[1][3].addShapeBox(12F, 0F, 2.3F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 122

		gun_6_Model[1][4].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 129

		gun_6_Model[1][5].addShapeBox(12F, 0F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 130

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-112.5F, -13F, 1F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}