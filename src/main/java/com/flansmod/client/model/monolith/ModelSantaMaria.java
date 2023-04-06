//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSantaMaria extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSantaMaria() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];
		bodyDoorCloseModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initbodyDoorCloseModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 777, 257, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 137, 353, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 417, 369, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 633, 369, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 497, 401, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 529, 401, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 529, 521, textureX, textureY); // Box 74
		bodyModel[68] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 75
		bodyModel[69] = new ModelRendererTurbo(this, 425, 665, textureX, textureY); // Box 76
		bodyModel[70] = new ModelRendererTurbo(this, 641, 681, textureX, textureY); // Box 77
		bodyModel[71] = new ModelRendererTurbo(this, 1, 705, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 225, 729, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 409, 785, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 593, 801, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 1, 825, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 673, 257, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 641, 401, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 257, 457, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 257, 561, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 849, 521, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 94
		bodyModel[87] = new ModelRendererTurbo(this, 865, 369, textureX, textureY); // Box 95
		bodyModel[88] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Box 97
		bodyModel[90] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 98
		bodyModel[91] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 99
		bodyModel[92] = new ModelRendererTurbo(this, 777, 801, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 185, 841, textureX, textureY); // Box 101
		bodyModel[94] = new ModelRendererTurbo(this, 921, 241, textureX, textureY); // Box 102
		bodyModel[95] = new ModelRendererTurbo(this, 369, 897, textureX, textureY); // Box 103
		bodyModel[96] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 104
		bodyModel[97] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 105
		bodyModel[98] = new ModelRendererTurbo(this, 801, 873, textureX, textureY); // Box 106
		bodyModel[99] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 107
		bodyModel[100] = new ModelRendererTurbo(this, 857, 625, textureX, textureY); // Box 108
		bodyModel[101] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 109
		bodyModel[102] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 111
		bodyModel[103] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 112
		bodyModel[104] = new ModelRendererTurbo(this, 985, 721, textureX, textureY); // Box 113
		bodyModel[105] = new ModelRendererTurbo(this, 281, 929, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 117
		bodyModel[107] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 118
		bodyModel[108] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 119
		bodyModel[109] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 124
		bodyModel[110] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 129
		bodyModel[111] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 138

		bodyModel[0].addShapeBox(0F, 0F, 0F, 57, 36, 100, 0F,0F, 0F, -5F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(13.01F, -40F, -50F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 35, 96, 0F,0F, 0F, -5F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(70F, -42F, -48F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 36, 86, 0F,0F, 3F, -10F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 3F, -10F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F); // Box 4
		bodyModel[2].setRotationPoint(-106F, -45F, -43F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 34, 60, 0F,0F, 0F, 0F, 0F, 4F, -16F, 0F, 4F, -16F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, 4F); // Box 5
		bodyModel[3].setRotationPoint(114F, -48F, -30F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 33, 28, 0F,0F, 0F, 0F, 3F, 4F, -12F, 3F, 4F, -12F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, -5F, -12F, 1F, -5F, -12F, 0F, 0F, 2F); // Box 6
		bodyModel[4].setRotationPoint(132.01F, -52F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 57, 16, 100, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -1F); // Box 8
		bodyModel[5].setRotationPoint(13.01F, -4.01F, -50F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 16, 96, 0F,0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Box 9
		bodyModel[6].setRotationPoint(70F, -7.01F, -48F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 18, 86, 0F,0F, 5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -6F, 0F, -2F, -14F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -14F); // Box 10
		bodyModel[7].setRotationPoint(-106F, -9.01F, -43F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 21, 60, 0F,0F, 0F, 4F, 0F, 5F, -14F, 0F, 5F, -14F, 0F, 0F, 4F, 0F, 0F, -1F, -5F, -1F, -16F, -5F, -1F, -16F, 0F, 0F, -1F); // Box 11
		bodyModel[8].setRotationPoint(114F, -14.01F, -30F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 24, 28, 0F,0F, 0F, 2F, 1F, 5F, -12F, 1F, 5F, -12F, 0F, 0F, 2F, 5F, 1F, 0F, -11F, 0F, -12F, -11F, 0F, -12F, 5F, 1F, 0F); // Box 12
		bodyModel[9].setRotationPoint(132.01F, -19.01F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 57, 12, 100, 0F,0F, 0F, -1F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -7F); // Box 13
		bodyModel[10].setRotationPoint(13.01F, 12F, -50F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 15, 96, 0F,0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -11F); // Box 14
		bodyModel[11].setRotationPoint(70F, 9F, -48F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 15, 86, 0F,0F, 2F, -14F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, -14F, -6F, 0F, -28F, 0F, 0F, -14F, 0F, 0F, -14F, -6F, 0F, -28F); // Box 15
		bodyModel[12].setRotationPoint(-106F, 9F, -43F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 17, 60, 0F,0F, 0F, -1F, 0F, 1F, -16F, 0F, 1F, -16F, 0F, 0F, -1F, 6F, 0F, -15F, -8F, 0F, -26F, -8F, 0F, -26F, 6F, 0F, -15F); // Box 16
		bodyModel[13].setRotationPoint(114F, 7F, -30F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 17, 28, 0F,5F, 1F, 0F, -11F, 2F, -12F, -11F, 2F, -12F, 5F, 1F, 0F, 13F, 0F, -10F, -24F, 0F, -12F, -24F, 0F, -12F, 13F, 0F, -10F); // Box 17
		bodyModel[14].setRotationPoint(132.01F, 7F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 57, 13, 100, 0F,0F, 0F, -7F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -7F, 0F, 0F, -22F, 0F, 0F, -38F, 0F, 0F, -38F, 0F, 0F, -22F); // Box 18
		bodyModel[15].setRotationPoint(13.01F, 24.01F, -50F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 13, 96, 0F,0F, 0F, -11F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -11F, 0F, 0F, -36F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, 0F, -36F); // Box 19
		bodyModel[16].setRotationPoint(70F, 24.01F, -48F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 13, 86, 0F,0F, 0F, -28F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -28F, -2F, -3F, -42F, 0F, 0F, -37F, 0F, 0F, -37F, -2F, -3F, -42F); // Box 20
		bodyModel[17].setRotationPoint(-100F, 24.01F, -43F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 10, 32, 0F,0F, 0F, -1F, -3F, 0F, -12F, -3F, 0F, -12F, 0F, 0F, -1F, 2F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, 2F, 0F, -15F); // Box 21
		bodyModel[18].setRotationPoint(108F, 24.01F, -16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 20, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 28F, 0F, 0F, -24F, -1F, 0F, -24F, -1F, 0F, 28F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(119.01F, 24F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 101, 25, 76, 0F,0F, 0F, -3F, 0F, 7F, -33F, 0F, 7F, -33F, 0F, 0F, -3F, 5F, 0F, 0F, 0F, -23F, -33F, 0F, -23F, -33F, 5F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(94.01F, -85F, -38F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 44, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(88.01F, -85F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 57, 18, 3, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(13.01F, -58.01F, -41F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, -2F, 0F, 7F, -13F, 0F, 7F, 13F, 0F, 4F, 2F, 0F, -2F, 2F, 0F, -5F, -8F, 0F, -5F, 10F, 0F, -2F, 0F); // Box 26
		bodyModel[23].setRotationPoint(92.01F, -61.01F, -38F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, -3F, 0F, 7F, -5F, 0F, 7F, 5F, 0F, 4F, 3F, 0F, -2F, 2F, 0F, -5F, -1F, 0F, -5F, 3F, 0F, -2F, 0F); // Box 27
		bodyModel[24].setRotationPoint(70F, -58.01F, -41F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 18, 17, 2, 0F,0F, 0F, -4F, 0F, 4F, -18F, 0F, 4F, 18F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -16F, 0F, -4F, 16F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(114F, -65F, -30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 57, 18, 3, 0F,0F, 0F, 0F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 4F); // Box 29
		bodyModel[26].setRotationPoint(13.01F, -58.01F, 38F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 7F, 13F, 0F, 4F, 2F, 0F, 4F, -2F, 0F, 7F, -13F, 0F, -5F, 10F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -5F, -8F); // Box 30
		bodyModel[27].setRotationPoint(-106F, -61.01F, 35F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, 3F, 0F, 7F, 5F, 0F, 7F, -5F, 0F, 4F, -3F, 0F, -2F, 0F, 0F, -5F, 3F, 0F, -5F, -1F, 0F, -2F, 2F); // Box 31
		bodyModel[28].setRotationPoint(70F, -58.01F, 38F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 18, 17, 2, 0F,0F, 0F, 4F, 0F, 4F, 18F, 0F, 4F, -18F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 16F, 0F, -4F, -16F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(114F, -65F, 28F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 21, 17, 2, 0F,0F, 0F, -2F, 6F, 7F, -12F, 6F, 7F, 14F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -12F, 0F, -4F, 14F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(132F, -69F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 17, 2, 0F,0F, 0F, 4F, 6F, 7F, 14F, 6F, 7F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 14F, 0F, -4F, -12F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(132F, -69F, 12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(89F, -60.01F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F, 0F, -8F); // Box 36
		bodyModel[33].setRotationPoint(89F, -60.01F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 101, 4, 5, 0F,0F, 0F, 0F, 0F, 7F, -28F, 0F, 7F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -28F, 0F, -7F, 28F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(95.01F, -102F, -35F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 101, 4, 5, 0F,0F, 0F, 0F, 0F, 7F, 28F, 0F, 7F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 28F, 0F, -7F, -28F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(95.01F, -102F, 30F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(95.5F, -103F, 6F);
		bodyModel[36].rotateAngleX = -0.05235988F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(95.5F, -102F, -31F);
		bodyModel[37].rotateAngleX = 0.05235988F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 41
		bodyModel[38].setRotationPoint(98.01F, -102F, 30F);
		bodyModel[38].rotateAngleZ = -0.29670597F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		bodyModel[39].setRotationPoint(98.01F, -102F, -33F);
		bodyModel[39].rotateAngleZ = -0.29670597F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 27, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 43
		bodyModel[40].setRotationPoint(92.01F, -81F, 32F);
		bodyModel[40].rotateAngleZ = -0.73303829F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 27, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 44
		bodyModel[41].setRotationPoint(92.01F, -81F, -35F);
		bodyModel[41].rotateAngleZ = -0.73303829F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(192F, -109F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 164, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[43].setRotationPoint(153F, -89F, -3F);
		bodyModel[43].rotateAngleZ = 0.60213859F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 4, 104, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(259F, -157F, -53F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 192, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(143F, -280F, -3F);
		bodyModel[45].rotateAngleZ = -0.03490659F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 140, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[46].setRotationPoint(147F, -252F, -73F);
		bodyModel[46].rotateAngleZ = -0.03490659F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 340, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 52
		bodyModel[47].setRotationPoint(-2F, -377F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 22, 20, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 53
		bodyModel[48].setRotationPoint(-11F, -268F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(2F, -325F, -52F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(192F, -106F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[51].setRotationPoint(192F, -106F, 2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[52].setRotationPoint(169F, -104F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[53].setRotationPoint(146F, -102F, 16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[54].setRotationPoint(122F, -100F, 23F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[55].setRotationPoint(100F, -99F, 28F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(169F, -104F, -12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[57].setRotationPoint(146F, -102F, -19F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[58].setRotationPoint(122F, -100F, -26F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[59].setRotationPoint(100F, -99F, -31F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[60].setRotationPoint(96F, -100F, 22F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[61].setRotationPoint(96F, -100F, 14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[62].setRotationPoint(96F, -100F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[63].setRotationPoint(96F, -100F, -25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[64].setRotationPoint(96F, -100F, -17F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[65].setRotationPoint(96F, -100F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 5, 240, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[66].setRotationPoint(4F, -232F, -123F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 57, 36, 100, 0F,0F, 2F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 2F, -7F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F); // Box 74
		bodyModel[67].setRotationPoint(-44F, -40F, -50F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 57, 18, 3, 0F,0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 2F); // Box 75
		bodyModel[68].setRotationPoint(-44F, -58.01F, 38F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 57, 13, 100, 0F,0F, 0F, -13F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -13F, 0F, 0F, -32F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -32F); // Box 76
		bodyModel[69].setRotationPoint(-44F, 24.01F, -50F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 57, 12, 100, 0F,0F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -13F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -13F); // Box 77
		bodyModel[70].setRotationPoint(-44F, 12F, -50F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 57, 16, 100, 0F,0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -4F); // Box 78
		bodyModel[71].setRotationPoint(-44F, -4.01F, -50F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 40, 13, 96, 0F,0F, 0F, -19F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -19F, 0F, 0F, -42F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -42F); // Box 79
		bodyModel[72].setRotationPoint(-84.01F, 24.01F, -48F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 40, 15, 96, 0F,0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -19F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -19F); // Box 80
		bodyModel[73].setRotationPoint(-84.01F, 9F, -48F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 40, 16, 96, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -10F); // Box 81
		bodyModel[74].setRotationPoint(-84.01F, -7.01F, -48F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 40, 18, 42, 0F,0F, 7F, 5F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 7F, -5F, 0F, -5F, 3F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -5F, -1F); // Box 82
		bodyModel[75].setRotationPoint(-84.01F, -58.01F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 40, 35, 96, 0F,0F, 3F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 3F, -8F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 83
		bodyModel[76].setRotationPoint(-84.01F, -42F, -48F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 7F, -13F, 0F, 4F, -2F, 0F, 4F, 2F, 0F, 7F, 13F, 0F, -5F, -8F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -5F, 10F); // Box 84
		bodyModel[77].setRotationPoint(-106F, -61.01F, -38F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 57, 18, 3, 0F,0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F, 0F, -2F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 85
		bodyModel[78].setRotationPoint(-44F, -58.01F, -41F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 40, 18, 42, 0F,0F, 7F, -5F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 7F, 5F, 0F, -5F, -1F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -5F, 3F); // Box 86
		bodyModel[79].setRotationPoint(-84.01F, -58.01F, -41F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 13, 86, 0F,0F, 0F, -14F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, -14F, 0F, 0F, -37F, -2F, -3F, -42F, -2F, -3F, -42F, 0F, 0F, -37F); // Box 87
		bodyModel[80].setRotationPoint(92.01F, 24.01F, -43F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 22, 15, 86, 0F,0F, 0F, -5F, 0F, 2F, -14F, 0F, 2F, -14F, 0F, 0F, -5F, 0F, 0F, -14F, -6F, 0F, -28F, -6F, 0F, -28F, 0F, 0F, -14F); // Box 88
		bodyModel[81].setRotationPoint(92.01F, 9F, -43F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 22, 18, 86, 0F,0F, 0F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -14F, 0F, -2F, -14F, 0F, 0F, -5F); // Box 89
		bodyModel[82].setRotationPoint(92.01F, -9.01F, -43F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 22, 36, 86, 0F,0F, 0F, -3F, 0F, 3F, -13F, 0F, 3F, -13F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, 0F); // Box 90
		bodyModel[83].setRotationPoint(92.01F, -45F, -43F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, 2F, 0F, 7F, 13F, 0F, 7F, -13F, 0F, 4F, -2F, 0F, -2F, 0F, 0F, -5F, 10F, 0F, -5F, -8F, 0F, -2F, 2F); // Box 91
		bodyModel[84].setRotationPoint(92.01F, -61.01F, 35F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 34, 66, 0F,0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -5F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -5F, -1F); // Box 92
		bodyModel[85].setRotationPoint(-124F, -48F, -33F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 14, 10, 32, 0F,-3F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -12F, -15F, 0F, -15F, 2F, 0F, -15F, 2F, 0F, -15F, -15F, 0F, -15F); // Box 94
		bodyModel[86].setRotationPoint(-114F, 24.01F, -16F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 17, 60, 0F,0F, 1F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -8F, -8F, 0F, -26F, 6F, 0F, -15F, 6F, 0F, -15F, -8F, 0F, -26F); // Box 95
		bodyModel[87].setRotationPoint(-119F, 7F, -30F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 18, 21, 60, 0F,0F, 5F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 5F, 2F, -5F, -1F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, -1F, -8F); // Box 96
		bodyModel[88].setRotationPoint(-124F, -14.01F, -30F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 30, 17, 28, 0F,-11F, 6F, -6F, 5F, 1F, 8F, 5F, 1F, 8F, -11F, 6F, -6F, -33F, -3F, -12F, 13F, 0F, -10F, 13F, 0F, -10F, -33F, -3F, -12F); // Box 97
		bodyModel[89].setRotationPoint(-154.01F, 7F, -14F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 30, 24, 32, 0F,-12F, 5F, 13F, 0F, 0F, 16F, 0F, 0F, 16F, -12F, 5F, 13F, -11F, -4F, -8F, 5F, 1F, 6F, 5F, 1F, 6F, -11F, -4F, -8F); // Box 98
		bodyModel[90].setRotationPoint(-154.01F, -19.01F, -16F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 9, 7, 4, 0F,0F, 0F, 0F, 228F, 2F, 0F, 228F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 219F, 0F, 0F, 219F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[91].setRotationPoint(-135.01F, 37F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 94, 57, 7, 0F,1F, 0F, 0F, 0F, -21F, -18F, 0F, -21F, 17F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, -20F, 2F, 22F, 22F, 0F, 0F, 2F); // Box 100
		bodyModel[92].setRotationPoint(-183F, -122.01F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 94, 57, 7, 0F,1F, 0F, 0F, 0F, -21F, 17F, 0F, -21F, -18F, 1F, 0F, 0F, 0F, 0F, 2F, 2F, 22F, 22F, 0F, 22F, -20F, 0F, 0F, 0F); // Box 101
		bodyModel[93].setRotationPoint(-183F, -122.01F, -17F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 57, 23, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[94].setRotationPoint(-183F, -122.01F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 100, 1, 23, 0F,0F, 5F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 22F, 22F, 0F, 22F, 22F, 0F, 0F, 0F); // Box 103
		bodyModel[95].setRotationPoint(-183F, -65.01F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 15, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[96].setRotationPoint(-184F, -100.01F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 73, 1, 23, 0F,-1F, 8F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, -1F, 8F, 0F, 0F, 0F, 0F, 0F, 35F, 18F, 0F, 35F, 18F, 0F, 0F, 0F); // Box 105
		bodyModel[97].setRotationPoint(-183F, -100.01F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 18, 34, 66, 0F,0F, 9F, -6F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 8F, -6F, 0F, -10F, -4F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -10F, -4F); // Box 106
		bodyModel[98].setRotationPoint(-142F, -48F, -33F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 18, 32, 32, 0F,7F, 10F, -7F, -8F, -3F, 13F, -8F, -3F, 13F, 7F, 10F, -7F, 1F, -20F, -12F, -9F, -4F, -8F, -9F, -4F, -8F, 1F, -20F, -12F); // Box 107
		bodyModel[99].setRotationPoint(-152.01F, -27.01F, -16F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 17, 36, 54, 0F,4F, 4F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, -12F, 0F, -17F, -18F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -17F, -18F); // Box 108
		bodyModel[100].setRotationPoint(-159.02F, -56.02F, -27F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 37, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 109
		bodyModel[101].setRotationPoint(-110F, -100.01F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 43, 15, 2, 0F,1F, 10F, 5F, 0F, 4F, 1F, 0F, 4F, -1F, 1F, 10F, -5F, 0F, -5F, 3F, 14F, 0F, 0F, 14F, 0F, 2F, 0F, -5F, -1F); // Box 111
		bodyModel[102].setRotationPoint(-88.01F, -75.01F, 35F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 43, 15, 2, 0F,1F, 10F, -5F, 0F, 4F, -1F, 0F, 4F, 1F, 1F, 10F, 5F, 0F, -5F, -1F, 14F, 0F, 2F, 14F, 0F, 0F, 0F, -5F, 3F); // Box 112
		bodyModel[103].setRotationPoint(-88.01F, -75.01F, -37F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 200, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[104].setRotationPoint(-150F, -297F, -3F);
		bodyModel[104].rotateAngleZ = 0.12217305F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 229, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[105].setRotationPoint(-226F, -322F, 3F);
		bodyModel[105].rotateAngleZ = -0.76794487F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -11F, 40F, 0F, 60F, 38F, 0F, 60F, 38F, 0F, -12F, 40F, 0F); // Box 117
		bodyModel[106].setRotationPoint(-147.01F, -9F, -2.5F);

		bodyModel[107].addShapeBox(-6F, -8F, -2.5F, 9, 30, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 60F, 0F, 2F, 65F, 0F, 2F, 65F, 0F, 6F, 60F, 0F); // Box 118
		bodyModel[107].setRotationPoint(-162.01F, -39F, -1F);
		bodyModel[107].rotateAngleZ = 0.2268928F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[108].setRotationPoint(101F, -108F, 29.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[109].setRotationPoint(101F, -108F, -31.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[110].setRotationPoint(-101F, -109F, -28.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[111].setRotationPoint(-101F, -109F, 26.5F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 48
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 51
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 55
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 73
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 281, 945, textureX, textureY); // Box 116

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 40F, 4F, 0F, 40F, 4F, 0F, 40F, 94F, 0F, 40F, 94F); // Box 48
		bodyDoorCloseModel[0].setRotationPoint(260F, -156F, -50F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.34906585F;

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 2, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 110F, 0F, 0F, 110F, 0F, 90F, 6F, 0F, 90F, 6F, 0F, 90F, 116F, 0F, 90F, 116F); // Box 51
		bodyDoorCloseModel[1].setRotationPoint(148F, -248F, -71F);
		bodyDoorCloseModel[1].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 20F, 2F, 0F, 20F, 2F, 0F, 20F, 92F, 0F, 20F, 92F); // Box 55
		bodyDoorCloseModel[2].setRotationPoint(3F, -322F, -50F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 2, 20, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 220F, 0F, 0F, 220F, 0F, 120F, 0F, 0F, 120F, 0F, 0F, 120F, 220F, 0F, 120F, 220F); // Box 73
		bodyDoorCloseModel[3].setRotationPoint(7F, -228F, -118F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 218, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -100F, 130F, 0F, 20F, 30F, 0F, 20F, 30F, 0F, -100F, 130F, 0F); // Box 116
		bodyDoorCloseModel[4].setRotationPoint(-226F, -317F, 4F);
		bodyDoorCloseModel[4].rotateAngleZ = -0.76794487F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[4];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 120
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 120
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 120

		gun_1_Model[0][0].addShapeBox(-5F, -3F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_1_Model[0][1].addShapeBox(1F, -3F, -1.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F); // Box 120

		gun_1_Model[0][2].addShapeBox(17F, -3F, -1.5F, 1, 3, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120

		gun_1_Model[0][3].addShapeBox(-7F, -3F, -1.5F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 120

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(101F, -107F, -31F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Culverin1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[4];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 120
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 120
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 120

		gun_2_Model[0][0].addShapeBox(-5F, -3F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_2_Model[0][1].addShapeBox(1F, -3F, -1.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F); // Box 120

		gun_2_Model[0][2].addShapeBox(17F, -3F, -1.5F, 1, 3, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120

		gun_2_Model[0][3].addShapeBox(-7F, -3F, -1.5F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 120

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(101F, -107F, 30F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Culverin2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[4];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 120
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 120
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 120

		gun_3_Model[0][0].addShapeBox(-5F, -3F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_3_Model[0][1].addShapeBox(1F, -3F, -1.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F); // Box 120

		gun_3_Model[0][2].addShapeBox(17F, -3F, -1.5F, 1, 3, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120

		gun_3_Model[0][3].addShapeBox(-7F, -3F, -1.5F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 120

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-100F, -108F, 27F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Culverin3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[4];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 120
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 120
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 120

		gun_4_Model[0][0].addShapeBox(-5F, -3F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_4_Model[0][1].addShapeBox(1F, -3F, -1.5F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, 0F, 0F); // Box 120

		gun_4_Model[0][2].addShapeBox(17F, -3F, -1.5F, 1, 3, 3, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 120

		gun_4_Model[0][3].addShapeBox(-7F, -3F, -1.5F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 120

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-100F, -108F, -28F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("Culverin4", gun_4_Model);
	}
}