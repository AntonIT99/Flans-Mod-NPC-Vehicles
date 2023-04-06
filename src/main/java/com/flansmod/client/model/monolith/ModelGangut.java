//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gangut
// Model Creator: 
// Created on: 24.07.2020 - 08:26:22
// Last changed on: 24.07.2020 - 08:26:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGangut extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGangut() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 75
		bodyModel[57] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 78
		bodyModel[60] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 83
		bodyModel[65] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 84
		bodyModel[66] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 92
		bodyModel[74] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 305, 257, textureX, textureY); // Box 104
		bodyModel[81] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 105
		bodyModel[82] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 106
		bodyModel[83] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 107
		bodyModel[84] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 108
		bodyModel[85] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 109
		bodyModel[86] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 110
		bodyModel[87] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 111
		bodyModel[88] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Box 112
		bodyModel[89] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 113
		bodyModel[90] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 114
		bodyModel[91] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 115
		bodyModel[92] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 29
		bodyModel[93] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 30
		bodyModel[94] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 31
		bodyModel[95] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 32
		bodyModel[96] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 34
		bodyModel[97] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 35
		bodyModel[98] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 36
		bodyModel[99] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 37
		bodyModel[100] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 38
		bodyModel[101] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 39
		bodyModel[102] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 40
		bodyModel[103] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 41
		bodyModel[104] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 42
		bodyModel[105] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 43
		bodyModel[106] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 44
		bodyModel[107] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 45
		bodyModel[108] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 46
		bodyModel[109] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 47
		bodyModel[110] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 48
		bodyModel[111] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 49
		bodyModel[112] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 50
		bodyModel[113] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 51
		bodyModel[114] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 52
		bodyModel[115] = new ModelRendererTurbo(this, 9, 500, textureX, textureY); // Box 53
		bodyModel[116] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 140
		bodyModel[117] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 141
		bodyModel[118] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 142
		bodyModel[119] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 143
		bodyModel[120] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 144
		bodyModel[121] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 145
		bodyModel[122] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 146
		bodyModel[123] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 147
		bodyModel[124] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 148
		bodyModel[125] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 149
		bodyModel[126] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 150
		bodyModel[127] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 151
		bodyModel[128] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 152

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 15, 48, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-5F, -5F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 15, 44, 0F,10F, 0F, -8F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, -8F, 10F, 0F, -3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -3F); // Box 3
		bodyModel[1].setRotationPoint(-115F, -5F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 15, 38, 0F,0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 4
		bodyModel[2].setRotationPoint(-143F, -5F, -19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 15, 32, 0F,0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 5
		bodyModel[3].setRotationPoint(-157F, -5F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 15, 24, 0F,0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 6
		bodyModel[4].setRotationPoint(-166F, -5F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 15, 16, 0F,-2F, 0F, -7.5F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -7.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 7
		bodyModel[5].setRotationPoint(-172F, -5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 15, 48, 0F,30F, 0F, 0F, 30F, 0F, -3F, 30F, 0F, -3F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, -3F, 30F, 0F, -3F, 30F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(60F, -5F, -24F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 6, 42, 0F,10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(111F, 4F, -21F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 15, 32, 0F,10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(137F, -5F, -16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(149F, -5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 10, 12, 0F,0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, -5F, 2F, 2F, -5F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(163F, 0F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 5, 12, 0F,0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(163F, -5F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 9, 48, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[12].setRotationPoint(-101F, -4.8F, -24F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 9, 48, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-97F, -4.8F, -24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 9, 52, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 17
		bodyModel[14].setRotationPoint(-43F, -4.8F, -26F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 9, 52, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 20
		bodyModel[15].setRotationPoint(-39F, -4.8F, -26F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 9, 52, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 21
		bodyModel[16].setRotationPoint(-24F, -4.8F, -26F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 9, 52, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 22
		bodyModel[17].setRotationPoint(-28F, -4.8F, -26F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 9, 52, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 23
		bodyModel[18].setRotationPoint(9F, -4.8F, -26F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 9, 52, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 24
		bodyModel[19].setRotationPoint(13F, -4.8F, -26F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 9, 52, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 25
		bodyModel[20].setRotationPoint(19F, -4.8F, -26F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 9, 52, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 26
		bodyModel[21].setRotationPoint(36F, -4.8F, -26F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 9, 48, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 27
		bodyModel[22].setRotationPoint(70F, -4.8F, -24F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 9, 48, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(76F, -4.8F, -24F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 9, 32, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(111F, -5F, -16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 9, 42, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(101F, -4.8F, -21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[26].setRotationPoint(169.5F, -17F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,-1.4F, -1.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1.4F, -1.5F, -0.2F, -1F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -1F, 1F, -0.2F); // Box 32
		bodyModel[27].setRotationPoint(158F, -17F, -0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-46F, -2F, -29F);
		bodyModel[28].rotateAngleY = 0.66322512F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(-30F, -2F, -29F);
		bodyModel[29].rotateAngleY = 0.66322512F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(23F, -2F, -28F);
		bodyModel[30].rotateAngleY = 2.61799388F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(44F, -2F, -28F);
		bodyModel[31].rotateAngleY = 2.61799388F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(85F, -2F, -24F);
		bodyModel[32].rotateAngleY = 2.77507351F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(109F, -2F, -18F);
		bodyModel[33].rotateAngleY = 3.05432619F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(109F, -2F, 19F);
		bodyModel[34].rotateAngleY = 3.22885912F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(83F, -2F, 25F);
		bodyModel[35].rotateAngleY = 3.56047167F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(43F, -2F, 29F);
		bodyModel[36].rotateAngleY = 3.75245789F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(22F, -2F, 29F);
		bodyModel[37].rotateAngleY = 3.75245789F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-24F, -2F, 25F);
		bodyModel[38].rotateAngleY = 2.58308729F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-40F, -2F, 25F);
		bodyModel[39].rotateAngleY = 2.58308729F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 15, 15, 50, 0F,0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -7F); // Box 45
		bodyModel[40].setRotationPoint(-115F, -4.8F, -25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-106F, -2F, -24F);
		bodyModel[41].rotateAngleY = 0.2443461F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-119F, -2F, -19F);
		bodyModel[42].rotateAngleY = 0.2443461F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(-119F, -2F, 18F);
		bodyModel[43].rotateAngleY = -0.2443461F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[44].setRotationPoint(-106F, -2F, 23F);
		bodyModel[44].rotateAngleY = -0.2443461F;

		bodyModel[45].addShapeBox(-3.5F, 3.5F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(92.5F, -10.5F, 0F);

		bodyModel[46].addShapeBox(-10.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 53
		bodyModel[46].setRotationPoint(92.5F, -7F, 0F);

		bodyModel[47].addShapeBox(3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(92.5F, -7F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[48].setRotationPoint(42F, -7.5F, -2F);

		bodyModel[49].addShapeBox(3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 68
		bodyModel[49].setRotationPoint(16F, -7F, 0F);

		bodyModel[50].addShapeBox(-10.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 69
		bodyModel[50].setRotationPoint(16F, -7F, 0F);

		bodyModel[51].addShapeBox(-3.5F, 3.5F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[51].setRotationPoint(-35F, -10.5F, 0F);

		bodyModel[52].addShapeBox(3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 71
		bodyModel[52].setRotationPoint(-35F, -7F, 0F);

		bodyModel[53].addShapeBox(-10.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 72
		bodyModel[53].setRotationPoint(-35F, -7F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 3.5F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[54].setRotationPoint(-109F, -10.5F, 0F);

		bodyModel[55].addShapeBox(3.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 74
		bodyModel[55].setRotationPoint(-109F, -7F, 0F);

		bodyModel[56].addShapeBox(-10.5F, 0F, -10.5F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 75
		bodyModel[56].setRotationPoint(-109F, -7F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[57].setRotationPoint(42F, -7.5F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 77
		bodyModel[58].setRotationPoint(42F, -7.5F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 78
		bodyModel[59].setRotationPoint(43.5F, -9.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 79
		bodyModel[60].setRotationPoint(43.5F, -9.5F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F, 1F); // Box 80
		bodyModel[61].setRotationPoint(43.5F, -9.5F, 2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 12F, 0F, 0F, 12F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, -2.5F, 12F, 0F, -2.5F, 12F, 0F); // Box 81
		bodyModel[62].setRotationPoint(43.5F, -22F, 2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 82
		bodyModel[63].setRotationPoint(43.5F, -22F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 83
		bodyModel[64].setRotationPoint(43.5F, -22F, -5F);

		bodyModel[65].addShapeBox(-3.5F, 3.5F, -10.5F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[65].setRotationPoint(16F, -10.5F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 24, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[66].setRotationPoint(52.5F, -23F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[67].setRotationPoint(50.5F, -22F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[68].setRotationPoint(50.5F, -13F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[69].setRotationPoint(54.5F, -17.5F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[70].setRotationPoint(76.5F, -17.5F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(75.5F, -25.5F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[72].setRotationPoint(75.5F, -22.5F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F); // Box 92
		bodyModel[73].setRotationPoint(63.5F, -54F, -1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 93
		bodyModel[74].setRotationPoint(63.5F, -59F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[75].setRotationPoint(64F, -54F, -15F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[76].setRotationPoint(64F, -32F, -20F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 17, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[77].setRotationPoint(-94.5F, -22F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[78].setRotationPoint(-94.5F, -22F, -4.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 12, 44, 0F,10F, 0F, -3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -3F, 6F, 0F, -9F, 10F, 0F, -6F, 10F, 0F, -6F, 6F, 0F, -9F); // Box 102
		bodyModel[79].setRotationPoint(-115F, 10F, -22F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 12, 48, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, -5F, 25F, 0F, -5F, 25F, 0F, -5F, 25F, 0F, -5F); // Box 104
		bodyModel[80].setRotationPoint(-5F, 10F, -24F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 12, 48, 0F,30F, 0F, 0F, 30F, 0F, -3F, 30F, 0F, -3F, 30F, 0F, 0F, 30F, 0F, -5F, 30F, 0F, -9F, 30F, 0F, -9F, 30F, 0F, -5F); // Box 105
		bodyModel[81].setRotationPoint(60F, 10F, -24F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 12, 32, 0F,10F, 0F, 5F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 5F, 10F, 0F, -1F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, -1F); // Box 106
		bodyModel[82].setRotationPoint(111F, 10F, -16F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 12, 32, 0F,10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -5F, 10F, 0F, 0F, 10F, 0F, -5F, 10F, 0F, -9F, 10F, 0F, -9F, 10F, 0F, -5F); // Box 107
		bodyModel[83].setRotationPoint(137F, 10F, -16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 12, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 6F, -7F, -9F, 6F, -7F, -9F, 0F, 0F, -4F); // Box 108
		bodyModel[84].setRotationPoint(149F, 10F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 4, 12, 0F,0F, 0F, 0F, -1F, -2F, -5F, -1F, -2F, -5F, 0F, 0F, 0F, 0F, -3.9F, 0F, -5F, 1F, -4F, -5F, 1F, -4F, 0F, -3.9F, 0F); // Box 109
		bodyModel[85].setRotationPoint(163F, 10.01F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 5, 38, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -10F, 4F, 7F, -6F, 4F, 7F, -6F, 0F, 0F, -10F); // Box 110
		bodyModel[86].setRotationPoint(-143F, 10F, -19F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 5, 32, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -11F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -2F, -11F); // Box 111
		bodyModel[87].setRotationPoint(-157F, 10F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -9F); // Box 112
		bodyModel[88].setRotationPoint(-166F, 10F, -12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 6, 2, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -7.5F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -7.5F); // Box 113
		bodyModel[89].setRotationPoint(-172F, 10F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 15, 48, 0F,30F, 0F, -2F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, -2F, 30F, 0F, -2F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, -2F); // Box 114
		bodyModel[90].setRotationPoint(-70F, -5F, -24F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 12, 48, 0F,30F, 0F, -2F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, -2F, 30F, 0F, -8F, 30F, 0F, -5F, 30F, 0F, -5F, 30F, 0F, -8F); // Box 115
		bodyModel[91].setRotationPoint(-70F, 10F, -24F);

		bodyModel[92].addShapeBox(-0.5F, -0.75F, -1.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 29
		bodyModel[92].setRotationPoint(171F, -3F, 0F);
		bodyModel[92].rotateAngleX = 0.29670597F;
		bodyModel[92].rotateAngleY = -1.57079633F;

		bodyModel[93].addShapeBox(-0.5F, -0.35F, -1.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		bodyModel[93].setRotationPoint(171F, -3F, 0F);
		bodyModel[93].rotateAngleX = 0.29670597F;
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShapeBox(-0.5F, 0.25F, -1.7F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 31
		bodyModel[94].setRotationPoint(171F, -3F, 0F);
		bodyModel[94].rotateAngleX = 0.29670597F;
		bodyModel[94].rotateAngleY = -1.57079633F;

		bodyModel[95].addShapeBox(-0.5F, 0.35F, -1.9F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32
		bodyModel[95].setRotationPoint(171F, -3F, 0F);
		bodyModel[95].rotateAngleX = 0.29670597F;
		bodyModel[95].rotateAngleY = -1.57079633F;

		bodyModel[96].addShapeBox(-0.5F, -1F, -1.3F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 34
		bodyModel[96].setRotationPoint(171F, -3F, 0F);
		bodyModel[96].rotateAngleX = 0.29670597F;
		bodyModel[96].rotateAngleY = -1.57079633F;

		bodyModel[97].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.62F, -0.35F, -0.3F, -0.22F, -0.35F, -0.3F, -0.22F, -0.35F, 0F, -0.62F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 35
		bodyModel[97].setRotationPoint(171F, -3F, 0F);
		bodyModel[97].rotateAngleX = 0.29670597F;
		bodyModel[97].rotateAngleY = -1.57079633F;

		bodyModel[98].addShapeBox(-0.8F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 36
		bodyModel[98].setRotationPoint(171F, -3F, 0F);
		bodyModel[98].rotateAngleX = 0.29670597F;
		bodyModel[98].rotateAngleY = -1.57079633F;

		bodyModel[99].addShapeBox(-0.2F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 37
		bodyModel[99].setRotationPoint(171F, -3F, 0F);
		bodyModel[99].rotateAngleX = 0.29670597F;
		bodyModel[99].rotateAngleY = -1.57079633F;

		bodyModel[100].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.22F, -0.35F, -0.3F, -0.62F, -0.35F, -0.3F, -0.62F, -0.35F, 0F, -0.22F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 38
		bodyModel[100].setRotationPoint(171F, -3F, 0F);
		bodyModel[100].rotateAngleX = 0.29670597F;
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addShapeBox(-0.75F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 39
		bodyModel[101].setRotationPoint(171F, -3F, 0F);
		bodyModel[101].rotateAngleX = 0.29670597F;
		bodyModel[101].rotateAngleY = -1.57079633F;

		bodyModel[102].addShapeBox(-0.25F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 40
		bodyModel[102].setRotationPoint(171F, -3F, 0F);
		bodyModel[102].rotateAngleX = 0.29670597F;
		bodyModel[102].rotateAngleY = -1.57079633F;

		bodyModel[103].addShapeBox(-1F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F); // Box 41
		bodyModel[103].setRotationPoint(171F, -3F, 0F);
		bodyModel[103].rotateAngleX = 0.29670597F;
		bodyModel[103].rotateAngleY = -1.57079633F;

		bodyModel[104].addShapeBox(0F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, 0F); // Box 42
		bodyModel[104].setRotationPoint(171F, -3F, 0F);
		bodyModel[104].rotateAngleX = 0.29670597F;
		bodyModel[104].rotateAngleY = -1.57079633F;

		bodyModel[105].addShapeBox(-1.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.3F, -0.05F, -0.35F, -0.3F, -0.05F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F); // Box 43
		bodyModel[105].setRotationPoint(171F, -3F, 0F);
		bodyModel[105].rotateAngleX = 0.29670597F;
		bodyModel[105].rotateAngleY = -1.57079633F;

		bodyModel[106].addShapeBox(-1.5F, -0.75F, -1.45F, 1, 1, 1, 0F,-0.3F, 0.25F, -0.5F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, -0.3F, 0.25F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 44
		bodyModel[106].setRotationPoint(171F, -3F, 0F);
		bodyModel[106].rotateAngleX = 0.29670597F;
		bodyModel[106].rotateAngleY = -1.57079633F;

		bodyModel[107].addShapeBox(-0.5F, -1.8F, -0.9F, 1, 1, 1, 0F,-0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F); // Box 45
		bodyModel[107].setRotationPoint(171F, -3F, 0F);
		bodyModel[107].rotateAngleX = 0.29670597F;
		bodyModel[107].rotateAngleY = -1.57079633F;

		bodyModel[108].addShapeBox(0.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.05F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F); // Box 46
		bodyModel[108].setRotationPoint(171F, -3F, 0F);
		bodyModel[108].rotateAngleX = 0.29670597F;
		bodyModel[108].rotateAngleY = -1.57079633F;

		bodyModel[109].addShapeBox(0.5F, -0.75F, -1.45F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, 0F, 0F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 47
		bodyModel[109].setRotationPoint(171F, -3F, 0F);
		bodyModel[109].rotateAngleX = 0.29670597F;
		bodyModel[109].rotateAngleY = -1.57079633F;

		bodyModel[110].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 48
		bodyModel[110].setRotationPoint(171F, -3F, 0F);
		bodyModel[110].rotateAngleX = 0.29670597F;
		bodyModel[110].rotateAngleY = -1.57079633F;

		bodyModel[111].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F); // Box 49
		bodyModel[111].setRotationPoint(171F, -3F, 0F);
		bodyModel[111].rotateAngleX = 0.29670597F;
		bodyModel[111].rotateAngleY = -1.57079633F;

		bodyModel[112].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F); // Box 50
		bodyModel[112].setRotationPoint(171F, -3F, 0F);
		bodyModel[112].rotateAngleX = 0.29670597F;
		bodyModel[112].rotateAngleY = -1.57079633F;

		bodyModel[113].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F); // Box 51
		bodyModel[113].setRotationPoint(171F, -3F, 0F);
		bodyModel[113].rotateAngleX = 0.29670597F;
		bodyModel[113].rotateAngleY = -1.57079633F;

		bodyModel[114].addShapeBox(0.45F, 0.3F, -1.7F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 52
		bodyModel[114].setRotationPoint(171F, -3F, 0F);
		bodyModel[114].rotateAngleX = 0.29670597F;
		bodyModel[114].rotateAngleY = -1.57079633F;

		bodyModel[115].addShapeBox(-2.2F, 0.0999999999999996F, -1.7F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, -1F, -0.45F, 0F); // Box 53
		bodyModel[115].setRotationPoint(171F, -3F, 0F);
		bodyModel[115].rotateAngleX = 0.29670597F;
		bodyModel[115].rotateAngleY = -1.57079633F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 140
		bodyModel[116].setRotationPoint(-16F, -7.5F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F, 1F); // Box 141
		bodyModel[117].setRotationPoint(-14.5F, -9.5F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 12F, 0F, 0F, 12F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, -2.5F, 12F, 0F, -2.5F, 12F, 0F); // Box 142
		bodyModel[118].setRotationPoint(-14.5F, -22F, 2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 143
		bodyModel[119].setRotationPoint(-14.5F, -9.5F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[120].setRotationPoint(-16F, -7.5F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 1F, -2.5F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 145
		bodyModel[121].setRotationPoint(-14.5F, -9.5F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[122].setRotationPoint(-16F, -7.5F, -6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F,0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 147
		bodyModel[123].setRotationPoint(-14.5F, -22F, -2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, -3F, 12F, 0F, -3F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 148
		bodyModel[124].setRotationPoint(-14.5F, -22F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F); // Box 149
		bodyModel[125].setRotationPoint(-81.5F, -55F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[126].setRotationPoint(-81F, -33F, -20F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[127].setRotationPoint(-81F, -55F, -15F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 152
		bodyModel[128].setRotationPoint(-81.5F, -60F, -1F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 55
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 58
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 59
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 56

		gun_2_Model[0][0].addShapeBox(-13F, -3F, -5.5F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55

		gun_2_Model[0][1].addShapeBox(-13F, -3F, -9.5F, 15, 6, 4, 0F,0F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57

		gun_2_Model[0][2].addShapeBox(2F, -3F, -9.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58

		gun_2_Model[0][3].addShapeBox(2F, -3F, 5.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 59

		gun_2_Model[0][4].addShapeBox(-13F, -3F, 5.5F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.9F); // Box 60

		gun_2_Model[0][5].addShapeBox(7F, -2F, -5.5F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(92.5F, -10.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 61
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 62
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 63
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 64
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 65
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 66

		gun_2_Model[1][0].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 61

		gun_2_Model[1][1].addShapeBox(12F, -1F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 62

		gun_2_Model[1][2].addShapeBox(12F, -1F, 2.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 63

		gun_2_Model[1][3].addShapeBox(0F, -1F, 2.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 64

		gun_2_Model[1][4].addShapeBox(12F, -1F, -4.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 65

		gun_2_Model[1][5].addShapeBox(0F, -1F, -4.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 66

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(92.5F, -10.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 55
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 58
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 59
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 56

		gun_3_Model[0][0].addShapeBox(-13F, -3F, -5.5F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55

		gun_3_Model[0][1].addShapeBox(-13F, -3F, -9.5F, 15, 6, 4, 0F,0F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57

		gun_3_Model[0][2].addShapeBox(2F, -3F, -9.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58

		gun_3_Model[0][3].addShapeBox(2F, -3F, 5.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 59

		gun_3_Model[0][4].addShapeBox(-13F, -3F, 5.5F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.9F); // Box 60

		gun_3_Model[0][5].addShapeBox(7F, -2F, -5.5F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(16F, -10.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 61
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 62
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 63
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 64
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 65
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 66

		gun_3_Model[1][0].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 61

		gun_3_Model[1][1].addShapeBox(12F, -1F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 62

		gun_3_Model[1][2].addShapeBox(12F, -1F, 2.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 63

		gun_3_Model[1][3].addShapeBox(0F, -1F, 2.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 64

		gun_3_Model[1][4].addShapeBox(12F, -1F, -4.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 65

		gun_3_Model[1][5].addShapeBox(0F, -1F, -4.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 66

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(16F, -10.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 55
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 58
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 59
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 56

		gun_4_Model[0][0].addShapeBox(-13F, -3F, -5.5F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55

		gun_4_Model[0][1].addShapeBox(-13F, -3F, -9.5F, 15, 6, 4, 0F,0F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57

		gun_4_Model[0][2].addShapeBox(2F, -3F, -9.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58

		gun_4_Model[0][3].addShapeBox(2F, -3F, 5.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 59

		gun_4_Model[0][4].addShapeBox(-13F, -3F, 5.5F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.9F); // Box 60

		gun_4_Model[0][5].addShapeBox(7F, -2F, -5.5F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-35F, -10.5F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[6];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 61
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 62
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 63
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 64
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 65
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 66

		gun_4_Model[1][0].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 61

		gun_4_Model[1][1].addShapeBox(12F, -1F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 62

		gun_4_Model[1][2].addShapeBox(12F, -1F, 2.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 63

		gun_4_Model[1][3].addShapeBox(0F, -1F, 2.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 64

		gun_4_Model[1][4].addShapeBox(12F, -1F, -4.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 65

		gun_4_Model[1][5].addShapeBox(0F, -1F, -4.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 66

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-35F, -10.5F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 55
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 57
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 58
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 59
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 56

		gun_5_Model[0][0].addShapeBox(-13F, -3F, -5.5F, 20, 6, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55

		gun_5_Model[0][1].addShapeBox(-13F, -3F, -9.5F, 15, 6, 4, 0F,0F, 0F, -3.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 57

		gun_5_Model[0][2].addShapeBox(2F, -3F, -9.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, -0.5F, -1F, -3F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 2.5F, 0.5F, -3F, 3.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 58

		gun_5_Model[0][3].addShapeBox(2F, -3F, 5.5F, 5, 6, 4, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, -0.5F, -1F, -3F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 3.2F, 0.5F, 0F, 2.5F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 59

		gun_5_Model[0][4].addShapeBox(-13F, -3F, 5.5F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -3.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.9F); // Box 60

		gun_5_Model[0][5].addShapeBox(7F, -2F, -5.5F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-109F, -10.5F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[6];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 61
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 62
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 63
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 64
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 65
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 66

		gun_5_Model[1][0].addShapeBox(0F, -1F, -1F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 61

		gun_5_Model[1][1].addShapeBox(12F, -1F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 62

		gun_5_Model[1][2].addShapeBox(12F, -1F, 2.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 63

		gun_5_Model[1][3].addShapeBox(0F, -1F, 2.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 64

		gun_5_Model[1][4].addShapeBox(12F, -1F, -4.3F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 65

		gun_5_Model[1][5].addShapeBox(0F, -1F, -4.3F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 66

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-109F, -10.5F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);
	}
}