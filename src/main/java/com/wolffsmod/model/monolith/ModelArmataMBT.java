//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.wolffsmod.model.monolith; //Path where the model is located

import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelArmataMBT extends ModelFlanVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelArmataMBT() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[153];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 162, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 115, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 0, 77, textureX, textureY); // Box 31
		bodyModel[4] = new ModelRendererTurbo(this, 105, 164, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 107, 118, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 0, 207, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 0, 219, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 198, 223, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 309, 77, textureX, textureY); // Box 1
		bodyModel[26] = new ModelRendererTurbo(this, 309, 77, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 309, 6, textureX, textureY); // Box 3
		bodyModel[28] = new ModelRendererTurbo(this, 309, 6, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 309, 42, textureX, textureY); // Box 5
		bodyModel[30] = new ModelRendererTurbo(this, 383, 43, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 309, 42, textureX, textureY); // Box 7
		bodyModel[32] = new ModelRendererTurbo(this, 383, 43, textureX, textureY); // Box 8
		bodyModel[33] = new ModelRendererTurbo(this, 191, 4, textureX, textureY); // Box 10
		bodyModel[34] = new ModelRendererTurbo(this, 191, 23, textureX, textureY); // Box 11
		bodyModel[35] = new ModelRendererTurbo(this, 243, 23, textureX, textureY); // Box 12
		bodyModel[36] = new ModelRendererTurbo(this, 191, 4, textureX, textureY); // Box 14
		bodyModel[37] = new ModelRendererTurbo(this, 191, 23, textureX, textureY); // Box 15
		bodyModel[38] = new ModelRendererTurbo(this, 243, 23, textureX, textureY); // Box 16
		bodyModel[39] = new ModelRendererTurbo(this, 170, 0, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 170, 0, textureX, textureY); // Box 18
		bodyModel[41] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 19
		bodyModel[42] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 20
		bodyModel[43] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 21
		bodyModel[44] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 22
		bodyModel[45] = new ModelRendererTurbo(this, 6, 50, textureX, textureY); // Box 23
		bodyModel[46] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 24
		bodyModel[47] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 25
		bodyModel[48] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 26
		bodyModel[49] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 27
		bodyModel[50] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 28
		bodyModel[51] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 29
		bodyModel[52] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 30
		bodyModel[53] = new ModelRendererTurbo(this, 6, 50, textureX, textureY); // Box 31
		bodyModel[54] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 34
		bodyModel[55] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 36
		bodyModel[56] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 37
		bodyModel[57] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 38
		bodyModel[58] = new ModelRendererTurbo(this, 68, 0, textureX, textureY); // Box 39
		bodyModel[59] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 40
		bodyModel[60] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 41
		bodyModel[61] = new ModelRendererTurbo(this, 68, 0, textureX, textureY); // Box 43
		bodyModel[62] = new ModelRendererTurbo(this, 79, 66, textureX, textureY); // Box 45
		bodyModel[63] = new ModelRendererTurbo(this, 133, 59, textureX, textureY); // Box 46
		bodyModel[64] = new ModelRendererTurbo(this, 122, 5, textureX, textureY); // Box 47
		bodyModel[65] = new ModelRendererTurbo(this, 122, 5, textureX, textureY); // Box 48
		bodyModel[66] = new ModelRendererTurbo(this, 122, 5, textureX, textureY); // Box 49
		bodyModel[67] = new ModelRendererTurbo(this, 103, 0, textureX, textureY); // Box 50
		bodyModel[68] = new ModelRendererTurbo(this, 103, 0, textureX, textureY); // Box 51
		bodyModel[69] = new ModelRendererTurbo(this, 118, 35, textureX, textureY); // Box 52
		bodyModel[70] = new ModelRendererTurbo(this, 118, 35, textureX, textureY); // Box 53
		bodyModel[71] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 54
		bodyModel[72] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 55
		bodyModel[73] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 56
		bodyModel[74] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 57
		bodyModel[75] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 58
		bodyModel[76] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 59
		bodyModel[77] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 60
		bodyModel[78] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 61
		bodyModel[79] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 62
		bodyModel[80] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 63
		bodyModel[81] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 64
		bodyModel[82] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 65
		bodyModel[83] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 66
		bodyModel[84] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 67
		bodyModel[85] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 68
		bodyModel[86] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 69
		bodyModel[87] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 70
		bodyModel[88] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 71
		bodyModel[89] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 72
		bodyModel[90] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 73
		bodyModel[91] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 74
		bodyModel[92] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 75
		bodyModel[93] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 76
		bodyModel[94] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 77
		bodyModel[95] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 78
		bodyModel[96] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 79
		bodyModel[97] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 80
		bodyModel[98] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 81
		bodyModel[99] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 82
		bodyModel[100] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 83
		bodyModel[101] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 84
		bodyModel[102] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 85
		bodyModel[103] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 86
		bodyModel[104] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 87
		bodyModel[105] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 88
		bodyModel[106] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 89
		bodyModel[107] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 90
		bodyModel[108] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 91
		bodyModel[109] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 92
		bodyModel[110] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 93
		bodyModel[111] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 94
		bodyModel[112] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 95
		bodyModel[113] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 96
		bodyModel[114] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 97
		bodyModel[115] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 98
		bodyModel[116] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 99
		bodyModel[117] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 100
		bodyModel[118] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 101
		bodyModel[119] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 102
		bodyModel[120] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 103
		bodyModel[121] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 104
		bodyModel[122] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 105
		bodyModel[123] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 106
		bodyModel[124] = new ModelRendererTurbo(this, 5, 53, textureX, textureY); // Box 107
		bodyModel[125] = new ModelRendererTurbo(this, 122, 5, textureX, textureY); // Box 108
		bodyModel[126] = new ModelRendererTurbo(this, 33, 54, textureX, textureY); // Shape 110
		bodyModel[127] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 111
		bodyModel[128] = new ModelRendererTurbo(this, 83, 2, textureX, textureY); // Box 112
		bodyModel[129] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // Shape 113
		bodyModel[130] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		bodyModel[131] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[132] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		bodyModel[133] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 22
		bodyModel[134] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 23
		bodyModel[135] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 24
		bodyModel[136] = new ModelRendererTurbo(this, 168, 41, textureX, textureY); // Box 25
		bodyModel[137] = new ModelRendererTurbo(this, 116, 24, textureX, textureY); // Box 26
		bodyModel[138] = new ModelRendererTurbo(this, 116, 24, textureX, textureY); // Box 27
		bodyModel[139] = new ModelRendererTurbo(this, 108, 0, textureX, textureY); // Box 29
		bodyModel[140] = new ModelRendererTurbo(this, 108, 0, textureX, textureY); // Box 30
		bodyModel[141] = new ModelRendererTurbo(this, 60, 52, textureX, textureY); // Box 31
		bodyModel[142] = new ModelRendererTurbo(this, 60, 52, textureX, textureY); // Box 32
		bodyModel[143] = new ModelRendererTurbo(this, 60, 57, textureX, textureY); // Box 33
		bodyModel[144] = new ModelRendererTurbo(this, 60, 20, textureX, textureY); // Box 34
		bodyModel[145] = new ModelRendererTurbo(this, 180, 15, textureX, textureY); // Box 38
		bodyModel[146] = new ModelRendererTurbo(this, 180, 15, textureX, textureY); // Box 39
		bodyModel[147] = new ModelRendererTurbo(this, 118, 35, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 118, 35, textureX, textureY); // Box 1
		bodyModel[149] = new ModelRendererTurbo(this, 180, 15, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 180, 15, textureX, textureY); // Box 3
		bodyModel[151] = new ModelRendererTurbo(this, 242, 421, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 242, 382, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(0F, 0F, 0F, 81, 12, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, -10F, -16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 10, 32, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -8F, -16F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 12, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[2].setRotationPoint(47F, -10F, -16F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 1F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[3].setRotationPoint(57F, -15F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 25, 10, 30, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(32F, -20F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 66, 10, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-34F, -20F, -16F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 19
		bodyModel[6].setRotationPoint(16F, -5F, -17F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 20
		bodyModel[7].setRotationPoint(30F, -5F, -17F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 21
		bodyModel[8].setRotationPoint(44F, -5F, -17F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 22
		bodyModel[9].setRotationPoint(2F, -5F, -17F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 23
		bodyModel[10].setRotationPoint(-12F, -5F, -17F);

		bodyModel[11].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 24
		bodyModel[11].setRotationPoint(-25F, -5F, -17F);

		bodyModel[12].addBox(0F, 0F, 0F, 6, 9, 2, 0F); // Box 25
		bodyModel[12].setRotationPoint(-38F, -5F, -17F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Box 26
		bodyModel[13].setRotationPoint(-52F, -9F, -17F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 6, 2, 0F); // Box 27
		bodyModel[14].setRotationPoint(57F, -9F, -17.25F);

		bodyModel[15].addBox(0F, 0F, -2F, 6, 6, 2, 0F); // Box 28
		bodyModel[15].setRotationPoint(57F, -9F, 17.25F);

		bodyModel[16].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 29
		bodyModel[16].setRotationPoint(44F, -5F, 17F);

		bodyModel[17].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 30
		bodyModel[17].setRotationPoint(30F, -5F, 17F);

		bodyModel[18].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 31
		bodyModel[18].setRotationPoint(16F, -5F, 17F);

		bodyModel[19].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 32
		bodyModel[19].setRotationPoint(2F, -5F, 17F);

		bodyModel[20].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 33
		bodyModel[20].setRotationPoint(-12F, -5F, 17F);

		bodyModel[21].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 34
		bodyModel[21].setRotationPoint(-25F, -5F, 17F);

		bodyModel[22].addBox(0F, 0F, -2F, 6, 9, 2, 0F); // Box 35
		bodyModel[22].setRotationPoint(-38F, -5F, 17F);

		bodyModel[23].addBox(0F, 0F, -2F, 6, 6, 2, 0F); // Box 36
		bodyModel[23].setRotationPoint(-52F, -9F, 17F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 27, 12, 32, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-61F, -20F, -16F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -3F, 0F); // Box 1
		bodyModel[25].setRotationPoint(-60F, -20F, -28F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[26].setRotationPoint(-60F, -20F, 16F);

		bodyModel[27].addBox(0F, 0F, 0F, 76, 20, 12, 0F); // Box 3
		bodyModel[27].setRotationPoint(-44F, -20F, -28F);

		bodyModel[28].addBox(0F, 0F, 0F, 76, 20, 12, 0F); // Box 4
		bodyModel[28].setRotationPoint(-44F, -20F, 16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 18, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 5
		bodyModel[29].setRotationPoint(32F, -20F, 15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 13, 13, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 6
		bodyModel[30].setRotationPoint(54F, -18F, 15F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 22, 18, 13, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 7
		bodyModel[31].setRotationPoint(32F, -20F, -28F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 13, 13, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[32].setRotationPoint(54F, -18F, -28F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 56, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[33].setRotationPoint(-24F, -20F, 28F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 22, 13, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[34].setRotationPoint(32F, -20F, 28F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 11, 2, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[35].setRotationPoint(54F, -18F, 28F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 56, 13, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[36].setRotationPoint(-24F, -20F, -30F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 22, 13, 2, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[37].setRotationPoint(32F, -20F, -30F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 11, 2, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[38].setRotationPoint(54F, -18F, -30F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[39].setRotationPoint(-44F, -20F, 28F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[40].setRotationPoint(-44F, -20F, -31F);

		bodyModel[41].addBox(0F, 0F, 0F, 35, 1, 1, 0F); // Box 19
		bodyModel[41].setRotationPoint(-59F, -19F, 30.5F);

		bodyModel[42].addShapeBox(0F, 1F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 20
		bodyModel[42].setRotationPoint(-59F, -19F, 30.5F);

		bodyModel[43].addBox(10F, 15F, 0F, 25, 1, 1, 0F); // Box 21
		bodyModel[43].setRotationPoint(-59F, -19F, 30.5F);

		bodyModel[44].addBox(34F, 1F, 0F, 1, 14, 1, 0F); // Box 22
		bodyModel[44].setRotationPoint(-59F, -19F, 30.5F);

		bodyModel[45].addShapeBox(0F, 15F, 0F, 10, 1, 1, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F); // Box 23
		bodyModel[45].setRotationPoint(-59F, -19F, 30.5F);

		bodyModel[46].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 24
		bodyModel[46].setRotationPoint(-53F, -19.5F, -27.5F);
		bodyModel[46].rotateAngleX = 0.12217305F;

		bodyModel[47].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 25
		bodyModel[47].setRotationPoint(-26F, -19.5F, -27.5F);
		bodyModel[47].rotateAngleX = 0.12217305F;

		bodyModel[48].addBox(0F, 0F, -4F, 1, 1, 4, 0F); // Box 26
		bodyModel[48].setRotationPoint(-37F, -19.5F, -27.5F);
		bodyModel[48].rotateAngleX = 0.12217305F;

		bodyModel[49].addBox(0F, 0F, 0F, 35, 1, 1, 0F); // Box 27
		bodyModel[49].setRotationPoint(-59F, -19F, -31.5F);

		bodyModel[50].addShapeBox(0F, 1F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 28
		bodyModel[50].setRotationPoint(-59F, -19F, -31.5F);

		bodyModel[51].addBox(10F, 15F, 0F, 25, 1, 1, 0F); // Box 29
		bodyModel[51].setRotationPoint(-59F, -19F, -31.5F);

		bodyModel[52].addBox(34F, 1F, 0F, 1, 14, 1, 0F); // Box 30
		bodyModel[52].setRotationPoint(-59F, -19F, -31.5F);

		bodyModel[53].addShapeBox(0F, 15F, 0F, 10, 1, 1, 0F, -1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F); // Box 31
		bodyModel[53].setRotationPoint(-59F, -19F, -31.5F);

		bodyModel[54].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 34
		bodyModel[54].setRotationPoint(-59F, -19.5F, 30.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 36
		bodyModel[55].setRotationPoint(-53F, -19.5F, 27.5F);
		bodyModel[55].rotateAngleX = -0.12217305F;

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 37
		bodyModel[56].setRotationPoint(-37F, -19.5F, 27.5F);
		bodyModel[56].rotateAngleX = -0.12217305F;

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 38
		bodyModel[57].setRotationPoint(-26F, -19.5F, 27.5F);
		bodyModel[57].rotateAngleX = -0.12217305F;

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 39
		bodyModel[58].setRotationPoint(28F, -21.5F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 40
		bodyModel[59].setRotationPoint(27F, -21.5F, 12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 41
		bodyModel[60].setRotationPoint(25F, -21.5F, 4F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 43
		bodyModel[61].setRotationPoint(32F, -21.5F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 45
		bodyModel[62].setRotationPoint(-34F, -21F, -15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 46
		bodyModel[63].setRotationPoint(-37F, -21.5F, -16F);

		bodyModel[64].addBox(0F, 0F, 0F, 19, 1, 9, 0F); // Box 47
		bodyModel[64].setRotationPoint(-59F, -20.25F, -19.5F);

		bodyModel[65].addBox(0F, 0F, -9F, 19, 1, 9, 0F); // Box 48
		bodyModel[65].setRotationPoint(-59F, -20.25F, 19.5F);

		bodyModel[66].addBox(0F, 0F, -9F, 19, 1, 9, 0F); // Box 49
		bodyModel[66].setRotationPoint(-59F, -20.25F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 50
		bodyModel[67].setRotationPoint(66.75F, -15F, 15.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 51
		bodyModel[68].setRotationPoint(66.75F, -15F, -20.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Box 52
		bodyModel[69].setRotationPoint(36F, -20F, -27F);
		bodyModel[69].rotateAngleZ = -0.08726646F;

		bodyModel[70].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Box 53
		bodyModel[70].setRotationPoint(36F, -20F, 17F);
		bodyModel[70].rotateAngleZ = -0.08726646F;

		bodyModel[71].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 54
		bodyModel[71].setRotationPoint(-59F, -18.5F, 30.5F);

		bodyModel[72].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 55
		bodyModel[72].setRotationPoint(-59F, -17.5F, 30.5F);

		bodyModel[73].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 56
		bodyModel[73].setRotationPoint(-59F, -16.5F, 30.5F);

		bodyModel[74].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 57
		bodyModel[74].setRotationPoint(-59F, -15.5F, 30.5F);

		bodyModel[75].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 58
		bodyModel[75].setRotationPoint(-59F, -14.5F, 30.5F);

		bodyModel[76].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 59
		bodyModel[76].setRotationPoint(-59F, -13.5F, 30.5F);

		bodyModel[77].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 60
		bodyModel[77].setRotationPoint(-59F, -12.5F, 30.5F);

		bodyModel[78].addShapeBox(2F, 2F, 0F, 32, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 61
		bodyModel[78].setRotationPoint(-59F, -11.5F, 30.5F);

		bodyModel[79].addShapeBox(3F, 2F, 0F, 31, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 62
		bodyModel[79].setRotationPoint(-59F, -10.5F, 30.5F);

		bodyModel[80].addShapeBox(5F, 2F, 0F, 29, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 63
		bodyModel[80].setRotationPoint(-59F, -9.5F, 30.5F);

		bodyModel[81].addShapeBox(6F, 2F, 0F, 28, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 64
		bodyModel[81].setRotationPoint(-59F, -8.5F, 30.5F);

		bodyModel[82].addShapeBox(8F, 2F, 0F, 26, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 65
		bodyModel[82].setRotationPoint(-59F, -7.5F, 30.5F);

		bodyModel[83].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 66
		bodyModel[83].setRotationPoint(-28.75F, -20F, 30.5F);

		bodyModel[84].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 67
		bodyModel[84].setRotationPoint(-37.75F, -20F, 30.5F);

		bodyModel[85].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 68
		bodyModel[85].setRotationPoint(-31.75F, -20F, 30.5F);

		bodyModel[86].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 69
		bodyModel[86].setRotationPoint(-34.75F, -20F, 30.5F);

		bodyModel[87].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 70
		bodyModel[87].setRotationPoint(-31.75F, -20F, 30.5F);

		bodyModel[88].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 71
		bodyModel[88].setRotationPoint(-40.75F, -20F, 30.5F);

		bodyModel[89].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 72
		bodyModel[89].setRotationPoint(-43.75F, -20F, 30.5F);

		bodyModel[90].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 73
		bodyModel[90].setRotationPoint(-46.75F, -20F, 30.5F);

		bodyModel[91].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 74
		bodyModel[91].setRotationPoint(-49.75F, -20F, 30.5F);

		bodyModel[92].addShapeBox(1F, 2F, 0F, 1, 13, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 75
		bodyModel[92].setRotationPoint(-52.75F, -20F, 30.5F);

		bodyModel[93].addShapeBox(1F, 2F, 0F, 1, 11, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 76
		bodyModel[93].setRotationPoint(-55.75F, -20F, 30.5F);

		bodyModel[94].addShapeBox(1F, 2F, 0F, 1, 9, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 77
		bodyModel[94].setRotationPoint(-58.75F, -20F, 30.5F);

		bodyModel[95].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 78
		bodyModel[95].setRotationPoint(-28.75F, -20F, -31.5F);

		bodyModel[96].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 79
		bodyModel[96].setRotationPoint(-37.75F, -20F, -31.5F);

		bodyModel[97].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 80
		bodyModel[97].setRotationPoint(-31.75F, -20F, -31.5F);

		bodyModel[98].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 81
		bodyModel[98].setRotationPoint(-34.75F, -20F, -31.5F);

		bodyModel[99].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 82
		bodyModel[99].setRotationPoint(-40.75F, -20F, -31.5F);

		bodyModel[100].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 83
		bodyModel[100].setRotationPoint(-43.75F, -20F, -31.5F);

		bodyModel[101].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 84
		bodyModel[101].setRotationPoint(-46.75F, -20F, -31.5F);

		bodyModel[102].addShapeBox(1F, 2F, 0F, 1, 14, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 85
		bodyModel[102].setRotationPoint(-49.75F, -20F, -31.5F);

		bodyModel[103].addShapeBox(1F, 2F, 0F, 1, 13, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 86
		bodyModel[103].setRotationPoint(-52.75F, -20F, -31.5F);

		bodyModel[104].addShapeBox(1F, 2F, 0F, 1, 11, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 87
		bodyModel[104].setRotationPoint(-55.75F, -20F, -31.5F);

		bodyModel[105].addShapeBox(1F, 2F, 0F, 1, 9, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 88
		bodyModel[105].setRotationPoint(-58.75F, -20F, -31.5F);

		bodyModel[106].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 89
		bodyModel[106].setRotationPoint(-59F, -19.5F, -31.5F);

		bodyModel[107].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 90
		bodyModel[107].setRotationPoint(-59F, -18.5F, -31.5F);

		bodyModel[108].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 91
		bodyModel[108].setRotationPoint(-59F, -17.5F, -31.5F);

		bodyModel[109].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 92
		bodyModel[109].setRotationPoint(-59F, -16.5F, -31.5F);

		bodyModel[110].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 93
		bodyModel[110].setRotationPoint(-59F, -15.5F, -31.5F);

		bodyModel[111].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 94
		bodyModel[111].setRotationPoint(-59F, -14.5F, -31.5F);

		bodyModel[112].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[112].setRotationPoint(-59F, -13.5F, -31.5F);

		bodyModel[113].addShapeBox(1F, 2F, 0F, 33, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 96
		bodyModel[113].setRotationPoint(-59F, -12.5F, -31.5F);

		bodyModel[114].addShapeBox(1F, 2F, 0F, 32, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 97
		bodyModel[114].setRotationPoint(-58F, -11.5F, -31.5F);

		bodyModel[115].addShapeBox(2F, 2F, 0F, 31, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 98
		bodyModel[115].setRotationPoint(-58F, -10.5F, -31.5F);

		bodyModel[116].addShapeBox(4F, 2F, 0F, 29, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 99
		bodyModel[116].setRotationPoint(-58F, -9.5F, -31.5F);

		bodyModel[117].addShapeBox(5F, 2F, 0F, 28, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 100
		bodyModel[117].setRotationPoint(-58F, -8.5F, -31.5F);

		bodyModel[118].addShapeBox(7F, 2F, 0F, 26, 1, 1, 0F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 101
		bodyModel[118].setRotationPoint(-58F, -7.5F, -31.5F);

		bodyModel[119].addBox(0F, -1F, 0F, 1, 1, 4, 0F); // Box 102
		bodyModel[119].setRotationPoint(-26F, -2.5F, 27.5F);
		bodyModel[119].rotateAngleX = 0.12217305F;

		bodyModel[120].addBox(0F, -1F, 0F, 1, 1, 4, 0F); // Box 103
		bodyModel[120].setRotationPoint(-37F, -2.5F, 27.5F);
		bodyModel[120].rotateAngleX = 0.12217305F;

		bodyModel[121].addBox(0F, -1F, 0F, 1, 1, 4, 0F); // Box 104
		bodyModel[121].setRotationPoint(-45F, -2.5F, 27.5F);
		bodyModel[121].rotateAngleX = 0.12217305F;

		bodyModel[122].addBox(0F, -1F, -4F, 1, 1, 4, 0F); // Box 105
		bodyModel[122].setRotationPoint(-45F, -2.5F, -27.5F);
		bodyModel[122].rotateAngleX = -0.12217305F;

		bodyModel[123].addBox(0F, -1F, -4F, 1, 1, 4, 0F); // Box 106
		bodyModel[123].setRotationPoint(-37F, -2.5F, -27.5F);
		bodyModel[123].rotateAngleX = -0.12217305F;

		bodyModel[124].addBox(0F, -1F, -4F, 1, 1, 4, 0F); // Box 107
		bodyModel[124].setRotationPoint(-26F, -2.5F, -27.5F);
		bodyModel[124].rotateAngleX = -0.12217305F;

		bodyModel[125].addBox(0F, 0F, 0F, 19, 1, 9, 0F); // Box 108
		bodyModel[125].setRotationPoint(-59F, -20.25F, -9.5F);

		bodyModel[126].addShape3D(6F, 0F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 110
		bodyModel[126].setRotationPoint(25.75F, -20.5F, -15.5F);
		bodyModel[126].rotateAngleX = -1.57079633F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 111
		bodyModel[127].setRotationPoint(29F, -21.5F, -15F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 112
		bodyModel[128].setRotationPoint(31F, -21.5F, -7F);

		bodyModel[129].addShape3D(6F, -12F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(10, 2, 10, 2), new Coord2D(10, 9, 10, 9), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(2, 9, 2, 9), new Coord2D(2, 2, 2, 2) }), 1, 10, 11, 34, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,7 ,3 ,4 ,3 ,7 ,3 ,4}); // Shape 113
		bodyModel[129].setRotationPoint(35F, -20F, 16F);
		bodyModel[129].rotateAngleX = -1.57079633F;
		bodyModel[129].rotateAngleZ = -0.12217305F;

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 1
		bodyModel[130].setRotationPoint(27.25F, -20.8F, -16F);
		bodyModel[130].rotateAngleX = -0.06981317F;
		bodyModel[130].rotateAngleY = 0.19198622F;

		bodyModel[131].addBox(-3F, 0F, 0F, 1, 1, 4, 0F); // Box 2
		bodyModel[131].setRotationPoint(27.25F, -20.8F, -16F);
		bodyModel[131].rotateAngleX = -0.06981317F;
		bodyModel[131].rotateAngleY = 0.19198622F;

		bodyModel[132].addBox(0F, 0F, 0F, 15, 1, 29, 0F); // Box 21
		bodyModel[132].setRotationPoint(40F, -19.25F, -14.5F);
		bodyModel[132].rotateAngleZ = -0.12217305F;

		bodyModel[133].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 22
		bodyModel[133].setRotationPoint(57F, -16.5F, -13.5F);
		bodyModel[133].rotateAngleZ = -0.55850536F;

		bodyModel[134].addBox(0F, 0F, -6F, 11, 1, 6, 0F); // Box 23
		bodyModel[134].setRotationPoint(57F, -16.5F, 13.5F);
		bodyModel[134].rotateAngleZ = -0.55850536F;

		bodyModel[135].addBox(0F, 0F, -6F, 11, 1, 6, 0F); // Box 24
		bodyModel[135].setRotationPoint(57F, -16.5F, 6.5F);
		bodyModel[135].rotateAngleZ = -0.55850536F;

		bodyModel[136].addBox(0F, 0F, 0F, 11, 1, 6, 0F); // Box 25
		bodyModel[136].setRotationPoint(57F, -16.5F, -6.5F);
		bodyModel[136].rotateAngleZ = -0.55850536F;

		bodyModel[137].addBox(0F, 0F, 0F, 27, 1, 8, 0F); // Box 26
		bodyModel[137].setRotationPoint(-38F, -20.25F, 19F);

		bodyModel[138].addBox(0F, 0F, 0F, 27, 1, 8, 0F); // Box 27
		bodyModel[138].setRotationPoint(-38F, -20.25F, -27F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[139].setRotationPoint(-60.5F, -19F, -27F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[140].setRotationPoint(-60.5F, -19F, 17F);

		bodyModel[141].addShapeBox(-2F, 1F, 0F, 12, 1, 3, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[141].setRotationPoint(54F, -3.5F, -14.5F);
		bodyModel[141].rotateAngleZ = 0.54105207F;

		bodyModel[142].addShapeBox(-2F, 1F, 0F, 12, 1, 3, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[142].setRotationPoint(54F, -3.5F, 11.5F);
		bodyModel[142].rotateAngleZ = 0.54105207F;

		bodyModel[143].addShapeBox(-2F, 1F, -2.5F, 12, 1, 5, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[143].setRotationPoint(54F, -3.5F, 0F);
		bodyModel[143].rotateAngleZ = 0.54105207F;

		bodyModel[144].addBox(-5F, 1F, -14.5F, 3, 1, 29, 0F); // Box 34
		bodyModel[144].setRotationPoint(54F, -3.5F, 0F);
		bodyModel[144].rotateAngleZ = 0.54105207F;

		bodyModel[145].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 38
		bodyModel[145].setRotationPoint(-60F, -19F, -7F);
		bodyModel[145].rotateAngleZ = 0.2443461F;

		bodyModel[146].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 39
		bodyModel[146].setRotationPoint(-60F, -19F, 4F);
		bodyModel[146].rotateAngleZ = 0.2443461F;

		bodyModel[147].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Box 0
		bodyModel[147].setRotationPoint(21F, -20.5F, -27F);
		bodyModel[147].rotateAngleZ = -0.03490659F;

		bodyModel[148].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Box 1
		bodyModel[148].setRotationPoint(21F, -20.5F, 17F);
		bodyModel[148].rotateAngleZ = -0.03490659F;

		bodyModel[149].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 2
		bodyModel[149].setRotationPoint(-60F, -19F, 12F);
		bodyModel[149].rotateAngleZ = 0.2443461F;

		bodyModel[150].addBox(0F, 0F, 0F, 1, 11, 3, 0F); // Box 3
		bodyModel[150].setRotationPoint(-60F, -19F, -15F);
		bodyModel[150].rotateAngleZ = 0.2443461F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 100, 25, 1, 0F, 0F, -15F, 0F, -60F, -15F, 0F, -60F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[151].setRotationPoint(17F, -32F, 29.05F);

		bodyModel[152].addShapeBox(-40F, 0F, 0F, 100, 25, 1, 0F, 0F, -15F, 0F, -60F, -15F, 0F, -60F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[152].setRotationPoint(17F, -32F, -29.05F);
		bodyModel[152].rotateAngleY = 3.14159265F;


		turretModel = new ModelRendererTurbo[89];
		turretModel[0] = new ModelRendererTurbo(this, 0, 351, textureX, textureY); // Box 5
		turretModel[1] = new ModelRendererTurbo(this, 0, 351, textureX, textureY); // Box 5
		turretModel[2] = new ModelRendererTurbo(this, 0, 351, textureX, textureY); // Box 7
		turretModel[3] = new ModelRendererTurbo(this, 0, 333, textureX, textureY); // Box 8
		turretModel[4] = new ModelRendererTurbo(this, 66, 364, textureX, textureY); // Box 10
		turretModel[5] = new ModelRendererTurbo(this, 0, 302, textureX, textureY); // Box 11
		turretModel[6] = new ModelRendererTurbo(this, 67, 337, textureX, textureY); // Box 12
		turretModel[7] = new ModelRendererTurbo(this, 55, 316, textureX, textureY); // Box 13
		turretModel[8] = new ModelRendererTurbo(this, 112, 311, textureX, textureY); // Box 14
		turretModel[9] = new ModelRendererTurbo(this, 0, 323, textureX, textureY); // Box 15
		turretModel[10] = new ModelRendererTurbo(this, 0, 377, textureX, textureY); // Box 19
		turretModel[11] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 20
		turretModel[12] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 21
		turretModel[13] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 22
		turretModel[14] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 23
		turretModel[15] = new ModelRendererTurbo(this, 0, 377, textureX, textureY); // Box 24
		turretModel[16] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 25
		turretModel[17] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 26
		turretModel[18] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 27
		turretModel[19] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 28
		turretModel[20] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Box 30
		turretModel[21] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 31
		turretModel[22] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 32
		turretModel[23] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 33
		turretModel[24] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 34
		turretModel[25] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Box 35
		turretModel[26] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 36
		turretModel[27] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 37
		turretModel[28] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 38
		turretModel[29] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // Box 39
		turretModel[30] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 50
		turretModel[31] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 51
		turretModel[32] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 52
		turretModel[33] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 53
		turretModel[34] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Box 54
		turretModel[35] = new ModelRendererTurbo(this, 0, 367, textureX, textureY); // Box 55
		turretModel[36] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 56
		turretModel[37] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 57
		turretModel[38] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 58
		turretModel[39] = new ModelRendererTurbo(this, 0, 352, textureX, textureY); // Box 59
		turretModel[40] = new ModelRendererTurbo(this, 54, 299, textureX, textureY); // Box 60
		turretModel[41] = new ModelRendererTurbo(this, 54, 299, textureX, textureY); // Box 61
		turretModel[42] = new ModelRendererTurbo(this, 0, 323, textureX, textureY); // Box 62
		turretModel[43] = new ModelRendererTurbo(this, 120, 365, textureX, textureY); // Box 63
		turretModel[44] = new ModelRendererTurbo(this, 134, 377, textureX, textureY); // Box 64
		turretModel[45] = new ModelRendererTurbo(this, 183, 372, textureX, textureY); // Box 65
		turretModel[46] = new ModelRendererTurbo(this, 0, 285, textureX, textureY); // Box 66
		turretModel[47] = new ModelRendererTurbo(this, 32, 289, textureX, textureY); // Box 67
		turretModel[48] = new ModelRendererTurbo(this, 32, 289, textureX, textureY); // Box 68
		turretModel[49] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 70
		turretModel[50] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 71
		turretModel[51] = new ModelRendererTurbo(this, 171, 351, textureX, textureY); // Box 72
		turretModel[52] = new ModelRendererTurbo(this, 171, 351, textureX, textureY); // Box 73
		turretModel[53] = new ModelRendererTurbo(this, 213, 344, textureX, textureY); // Box 74
		turretModel[54] = new ModelRendererTurbo(this, 138, 302, textureX, textureY); // Box 75
		turretModel[55] = new ModelRendererTurbo(this, 138, 302, textureX, textureY); // Box 76
		turretModel[56] = new ModelRendererTurbo(this, 213, 324, textureX, textureY); // Box 77
		turretModel[57] = new ModelRendererTurbo(this, 171, 317, textureX, textureY); // Box 78
		turretModel[58] = new ModelRendererTurbo(this, 175, 290, textureX, textureY); // Box 79
		turretModel[59] = new ModelRendererTurbo(this, 175, 290, textureX, textureY); // Box 81
		turretModel[60] = new ModelRendererTurbo(this, 171, 317, textureX, textureY); // Box 82
		turretModel[61] = new ModelRendererTurbo(this, 175, 300, textureX, textureY); // Box 83
		turretModel[62] = new ModelRendererTurbo(this, 175, 300, textureX, textureY); // Box 84
		turretModel[63] = new ModelRendererTurbo(this, 107, 271, textureX, textureY); // Box 85
		turretModel[64] = new ModelRendererTurbo(this, 66, 273, textureX, textureY); // Box 1
		turretModel[65] = new ModelRendererTurbo(this, 66, 273, textureX, textureY); // Box 2
		turretModel[66] = new ModelRendererTurbo(this, 73, 288, textureX, textureY); // Box 11
		turretModel[67] = new ModelRendererTurbo(this, 73, 288, textureX, textureY); // Box 12
		turretModel[68] = new ModelRendererTurbo(this, 125, 415, textureX, textureY); // Box 13
		turretModel[69] = new ModelRendererTurbo(this, 125, 424, textureX, textureY); // Box 14
		turretModel[70] = new ModelRendererTurbo(this, 138, 424, textureX, textureY); // Box 15
		turretModel[71] = new ModelRendererTurbo(this, 190, 337, textureX, textureY); // Box 17
		turretModel[72] = new ModelRendererTurbo(this, 190, 337, textureX, textureY); // Box 18
		turretModel[73] = new ModelRendererTurbo(this, 163, 337, textureX, textureY); // Box 19
		turretModel[74] = new ModelRendererTurbo(this, 163, 337, textureX, textureY); // Box 20
		turretModel[75] = new ModelRendererTurbo(this, 11, 272, textureX, textureY); // Box 2
		turretModel[76] = new ModelRendererTurbo(this, 11, 272, textureX, textureY); // Box 3
		turretModel[77] = new ModelRendererTurbo(this, 11, 272, textureX, textureY); // Box 4
		turretModel[78] = new ModelRendererTurbo(this, 71, 261, textureX, textureY); // Box 5
		turretModel[79] = new ModelRendererTurbo(this, 32, 266, textureX, textureY); // Box 6
		turretModel[80] = new ModelRendererTurbo(this, 32, 266, textureX, textureY); // Box 8
		turretModel[81] = new ModelRendererTurbo(this, 0, 255, textureX, textureY); // Box 9
		turretModel[82] = new ModelRendererTurbo(this, 0, 272, textureX, textureY); // Box 10
		turretModel[83] = new ModelRendererTurbo(this, 18, 256, textureX, textureY); // Box 11
		turretModel[84] = new ModelRendererTurbo(this, 125, 415, textureX, textureY); // Box 16
		turretModel[85] = new ModelRendererTurbo(this, 125, 432, textureX, textureY); // Box 17
		turretModel[86] = new ModelRendererTurbo(this, 138, 433, textureX, textureY); // Box 18
		turretModel[87] = new ModelRendererTurbo(this, 71, 261, textureX, textureY); // Box 19
		turretModel[88] = new ModelRendererTurbo(this, 48, 262, textureX, textureY); // Box 20

		turretModel[0].addBox(-6.5F, -1F, -19.5F, 13, 1, 39, 0F); // Box 5
		turretModel[0].setRotationPoint(0F, -19.5F, 0F);

		turretModel[1].addShapeBox(6.5F, -1F, -19.5F, 13, 1, 39, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 5
		turretModel[1].setRotationPoint(0F, -19.5F, 0F);

		turretModel[2].addShapeBox(-19.5F, -1F, -19.5F, 13, 1, 39, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 7
		turretModel[2].setRotationPoint(0F, -19.5F, 0F);

		turretModel[3].addShapeBox(0F, -4F, -6.5F, 20, 3, 13, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 8
		turretModel[3].setRotationPoint(0F, -19.5F, 0F);

		turretModel[4].addShapeBox(0F, -15F, -6.5F, 20, 11, 13, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 10
		turretModel[4].setRotationPoint(0F, -19.5F, 0F);

		turretModel[5].addShapeBox(-20F, -7F, -6.5F, 20, 6, 13, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		turretModel[5].setRotationPoint(0F, -19.5F, 0F);

		turretModel[6].addShapeBox(-39F, -14F, -8.5F, 39, 8, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 12
		turretModel[6].setRotationPoint(0F, -18.5F, 0F);

		turretModel[7].addShapeBox(-39F, -16F, -8.5F, 19, 2, 17, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[7].setRotationPoint(0F, -18.5F, 0F);

		turretModel[8].addShapeBox(0F, -15F, -15.5F, 20, 11, 9, 0F, 0F, 0F, -2F, -12.5F, -1F, -2F, -3.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[8].setRotationPoint(0F, -19.5F, 0F);

		turretModel[9].addShapeBox(0F, -4F, -12.5F, 22, 3, 6, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[9].setRotationPoint(0F, -19.5F, 0F);

		turretModel[10].addBox(11.75F, -2.5F, 7F, 7, 1, 3, 0F); // Box 19
		turretModel[10].setRotationPoint(0F, -20F, 0F);
		turretModel[10].rotateAngleY = 0.34906585F;

		turretModel[11].addBox(14.5F, -2.5F, 7F, 5, 1, 3, 0F); // Box 20
		turretModel[11].setRotationPoint(0F, -20F, 0F);
		turretModel[11].rotateAngleY = 0.61086524F;

		turretModel[12].addBox(15.5F, -2.5F, 7F, 5, 1, 3, 0F); // Box 21
		turretModel[12].setRotationPoint(0F, -20F, 0F);
		turretModel[12].rotateAngleY = 0.87266463F;

		turretModel[13].addBox(16.5F, -2.5F, 7F, 5, 1, 3, 0F); // Box 22
		turretModel[13].setRotationPoint(0F, -20F, 0F);
		turretModel[13].rotateAngleY = 1.13446401F;

		turretModel[14].addBox(17.5F, -2.5F, 5F, 5, 1, 3, 0F); // Box 23
		turretModel[14].setRotationPoint(0F, -20F, 0F);
		turretModel[14].rotateAngleY = 1.48352986F;

		turretModel[15].addBox(11.75F, -2.5F, -10F, 7, 1, 3, 0F); // Box 24
		turretModel[15].setRotationPoint(0F, -20F, 0F);
		turretModel[15].rotateAngleY = -0.34906585F;

		turretModel[16].addBox(14.5F, -2.5F, -10F, 5, 1, 3, 0F); // Box 25
		turretModel[16].setRotationPoint(0F, -20F, 0F);
		turretModel[16].rotateAngleY = -0.61086524F;

		turretModel[17].addBox(15.5F, -2.5F, -10F, 5, 1, 3, 0F); // Box 26
		turretModel[17].setRotationPoint(0F, -20F, 0F);
		turretModel[17].rotateAngleY = -0.87266463F;

		turretModel[18].addBox(16.5F, -2.5F, -10F, 5, 1, 3, 0F); // Box 27
		turretModel[18].setRotationPoint(0F, -20F, 0F);
		turretModel[18].rotateAngleY = -1.13446401F;

		turretModel[19].addBox(17.5F, -2.5F, -8F, 5, 1, 3, 0F); // Box 28
		turretModel[19].setRotationPoint(0F, -20F, 0F);
		turretModel[19].rotateAngleY = -1.48352986F;

		turretModel[20].addShapeBox(11.75F, -3.5F, 7F, 7, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		turretModel[20].setRotationPoint(0F, -20F, 0F);
		turretModel[20].rotateAngleY = 0.34906585F;

		turretModel[21].addShapeBox(14.5F, -3.5F, 7F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[21].setRotationPoint(0F, -20F, 0F);
		turretModel[21].rotateAngleY = 0.61086524F;

		turretModel[22].addShapeBox(15.5F, -3.5F, 7F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[22].setRotationPoint(0F, -20F, 0F);
		turretModel[22].rotateAngleY = 0.87266463F;

		turretModel[23].addShapeBox(16.5F, -3.5F, 7F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[23].setRotationPoint(0F, -20F, 0F);
		turretModel[23].rotateAngleY = 1.13446401F;

		turretModel[24].addShapeBox(17.5F, -3.5F, 5F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[24].setRotationPoint(0F, -20F, 0F);
		turretModel[24].rotateAngleY = 1.48352986F;

		turretModel[25].addShapeBox(11.75F, -3.5F, -10F, 7, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[25].setRotationPoint(0F, -20F, 0F);
		turretModel[25].rotateAngleY = -0.34906585F;

		turretModel[26].addShapeBox(14.5F, -3.5F, -10F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		turretModel[26].setRotationPoint(0F, -20F, 0F);
		turretModel[26].rotateAngleY = -0.61086524F;

		turretModel[27].addShapeBox(15.5F, -3.5F, -10F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[27].setRotationPoint(0F, -20F, 0F);
		turretModel[27].rotateAngleY = -0.87266463F;

		turretModel[28].addShapeBox(16.5F, -3.5F, -10F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[28].setRotationPoint(0F, -20F, 0F);
		turretModel[28].rotateAngleY = -1.13446401F;

		turretModel[29].addShapeBox(17.5F, -3.5F, -8F, 5, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		turretModel[29].setRotationPoint(0F, -20F, 0F);
		turretModel[29].rotateAngleY = -1.48352986F;

		turretModel[30].addShapeBox(17.5F, -1.5F, -8F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		turretModel[30].setRotationPoint(0F, -20F, 0F);
		turretModel[30].rotateAngleY = -1.48352986F;

		turretModel[31].addShapeBox(16.5F, -1.5F, -10F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 51
		turretModel[31].setRotationPoint(0F, -20F, 0F);
		turretModel[31].rotateAngleY = -1.13446401F;

		turretModel[32].addShapeBox(15.5F, -1.5F, -10F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 52
		turretModel[32].setRotationPoint(0F, -20F, 0F);
		turretModel[32].rotateAngleY = -0.87266463F;

		turretModel[33].addShapeBox(14.5F, -1.5F, -10F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		turretModel[33].setRotationPoint(0F, -20F, 0F);
		turretModel[33].rotateAngleY = -0.61086524F;

		turretModel[34].addShapeBox(11.75F, -1.5F, -10F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		turretModel[34].setRotationPoint(0F, -20F, 0F);
		turretModel[34].rotateAngleY = -0.34906585F;

		turretModel[35].addShapeBox(11.75F, -1.5F, 7F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		turretModel[35].setRotationPoint(0F, -20F, 0F);
		turretModel[35].rotateAngleY = 0.34906585F;

		turretModel[36].addShapeBox(14.5F, -1.5F, 7F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 56
		turretModel[36].setRotationPoint(0F, -20F, 0F);
		turretModel[36].rotateAngleY = 0.61086524F;

		turretModel[37].addShapeBox(15.5F, -1.5F, 7F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 57
		turretModel[37].setRotationPoint(0F, -20F, 0F);
		turretModel[37].rotateAngleY = 0.87266463F;

		turretModel[38].addShapeBox(16.5F, -1.5F, 7F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 58
		turretModel[38].setRotationPoint(0F, -20F, 0F);
		turretModel[38].rotateAngleY = 1.13446401F;

		turretModel[39].addShapeBox(17.5F, -1.5F, 5F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 59
		turretModel[39].setRotationPoint(0F, -20F, 0F);
		turretModel[39].rotateAngleY = 1.48352986F;

		turretModel[40].addShapeBox(-6.5F, -4F, 6.5F, 21, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 1F); // Box 60
		turretModel[40].setRotationPoint(0F, -19.5F, 0F);

		turretModel[41].addShapeBox(-6.5F, -4F, -18.5F, 21, 3, 12, 0F, 0F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		turretModel[41].setRotationPoint(0F, -19.5F, 0F);

		turretModel[42].addShapeBox(0F, -4F, 6.5F, 22, 3, 6, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		turretModel[42].setRotationPoint(0F, -19.5F, 0F);

		turretModel[43].addShapeBox(0F, -5F, 6.5F, 20, 1, 9, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 63
		turretModel[43].setRotationPoint(0F, -19.5F, 0F);

		turretModel[44].addShapeBox(0F, -4F, 6.5F, 20, 1, 7, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -10.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -10F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 64
		turretModel[44].setRotationPoint(0F, -30.5F, 0F);

		turretModel[45].addShapeBox(0F, -3F, 12.5F, 16, 9, 1, 0F, 0F, -1F, 0F, -4.75F, -1F, 0F, -6F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0.35F, 0F, 0F, -2.5F, 0F, 2F, 0F, 0F, 2F); // Box 65
		turretModel[45].setRotationPoint(0F, -30.5F, 0F);

		turretModel[46].addShapeBox(7F, -3F, 6.5F, 2, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		turretModel[46].setRotationPoint(0F, -30.5F, 0F);

		turretModel[47].addShapeBox(9F, 3F, 6.5F, 6, 3, 6, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		turretModel[47].setRotationPoint(0F, -30.5F, 0F);

		turretModel[48].addShapeBox(9F, -3F, 6.5F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, -1F); // Box 68
		turretModel[48].setRotationPoint(0F, -30.5F, 0F);

		turretModel[49].addShapeBox(9F, -3F, 6.5F, 6, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 70
		turretModel[49].setRotationPoint(0F, -30.5F, 0F);

		turretModel[50].addShapeBox(9F, -3F, 11.5F, 6, 9, 1, 0F, 0F, -3F, 0F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		turretModel[50].setRotationPoint(0F, -30.5F, 0F);

		turretModel[51].addShapeBox(-20F, -7F, 6.5F, 14, 6, 13, 0F, 2.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 1F, -9.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -13.5F, 0F, 0F); // Box 72
		turretModel[51].setRotationPoint(0F, -19.5F, 0F);

		turretModel[52].addShapeBox(-20F, -7F, -19.5F, 14, 6, 13, 0F, -9.5F, -3F, 0F, -0.5F, -3F, 1F, -0.5F, -3F, 0F, 2.5F, 0F, 0F, -13.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 73
		turretModel[52].setRotationPoint(0F, -19.5F, 0F);

		turretModel[53].addShapeBox(0F, -15F, 13.5F, 4, 10, 9, 0F, 0F, 0F, 0F, 2F, -0.64F, 0F, -4F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		turretModel[53].setRotationPoint(0F, -19.5F, 0F);

		turretModel[54].addShapeBox(0F, -5F, 15.5F, 11, 1, 7, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6.63F, 0F, 0F, 0F, 0F, 0F); // Box 75
		turretModel[54].setRotationPoint(0F, -19.5F, 0F);

		turretModel[55].addShapeBox(0F, -5F, -22.5F, 11, 1, 7, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 1.95F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0F, -6.63F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 76
		turretModel[55].setRotationPoint(0F, -19.5F, 0F);

		turretModel[56].addShapeBox(0F, -15F, -22.5F, 4, 10, 9, 0F, 0F, -2F, -1F, -4F, -2F, -1F, 2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, 0F); // Box 77
		turretModel[56].setRotationPoint(0F, -19.5F, 0F);

		turretModel[57].addShapeBox(-11F, -15F, -21.5F, 11, 11, 8, 0F, 0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 5.5F, -3F, 0F, -0.5F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 78
		turretModel[57].setRotationPoint(0F, -19.5F, 0F);

		turretModel[58].addShapeBox(-11F, -5F, -22.5F, 11, 1, 8, 0F, -0.5F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		turretModel[58].setRotationPoint(0F, -19.5F, 0F);

		turretModel[59].addShapeBox(-11F, -5F, 14.5F, 11, 1, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F); // Box 81
		turretModel[59].setRotationPoint(0F, -19.5F, 0F);

		turretModel[60].addShapeBox(-11F, -15F, 13.5F, 11, 11, 8, 0F, 5.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -0.5F, 0F, -2F); // Box 82
		turretModel[60].setRotationPoint(0F, -19.5F, 0F);

		turretModel[61].addShapeBox(-17F, -15F, -13.5F, 17, 10, 5, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F, -1.5F, 0F); // Box 83
		turretModel[61].setRotationPoint(0F, -19.5F, 0F);

		turretModel[62].addShapeBox(-17F, -15F, 8.5F, 17, 10, 5, 0F, 3.25F, -2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, -3F, 0F, 4.25F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		turretModel[62].setRotationPoint(0F, -19.5F, 0F);

		turretModel[63].addShapeBox(-20.25F, -15F, -8.5F, 20, 9, 17, 0F, 0F, 0.25F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, -0.5F, 0F); // Box 85
		turretModel[63].setRotationPoint(0F, -19.5F, 0F);

		turretModel[64].addShapeBox(-39F, -14F, -13.5F, 23, 8, 5, 0F, -1F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		turretModel[64].setRotationPoint(0F, -18.5F, 0F);

		turretModel[65].addShapeBox(-39F, -14F, 8.5F, 23, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F); // Box 2
		turretModel[65].setRotationPoint(0F, -18.5F, 0F);

		turretModel[66].addShapeBox(-39F, -16F, -11.5F, 13, 2, 3, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 1F, 0F, -0.25F, 1F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[66].setRotationPoint(0F, -18.5F, 0F);

		turretModel[67].addShapeBox(-39F, -16F, 8.5F, 13, 2, 3, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 1F, -1F, 1F, 0F); // Box 12
		turretModel[67].setRotationPoint(0F, -18.5F, 0F);

		turretModel[68].addBox(-36F, -16F, -10F, 4, 4, 4, 0F); // Box 13
		turretModel[68].setRotationPoint(0F, -20F, 0F);

		turretModel[69].addBox(-35.5F, -19F, -9.5F, 3, 4, 3, 0F); // Box 14
		turretModel[69].setRotationPoint(0F, -20F, 0F);

		turretModel[70].addBox(-35F, -25F, -9F, 2, 6, 2, 0F); // Box 15
		turretModel[70].setRotationPoint(0F, -20F, 0F);

		turretModel[71].addShapeBox(-7F, -18F, -18F, 5, 6, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[71].setRotationPoint(0F, -20F, 0F);
		turretModel[71].rotateAngleY = -0.08726646F;
		turretModel[71].rotateAngleZ = 0.08726646F;

		turretModel[72].addShapeBox(-7F, -18F, 12F, 5, 6, 6, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[72].setRotationPoint(0F, -20F, 0F);
		turretModel[72].rotateAngleY = 0.08726646F;
		turretModel[72].rotateAngleZ = 0.08726646F;

		turretModel[73].addShapeBox(-18F, -10.5F, -19.5F, 7, 7, 6, 0F, -3F, -2F, -1.5F, 0F, 0F, 0F, -5.5F, 1F, 0F, -1.5F, 1F, 0F, -3F, -2.5F, -1.5F, 0.5F, 0F, 0F, -5.5F, -1.5F, 0F, -1F, -1.5F, 0.5F); // Box 19
		turretModel[73].setRotationPoint(0F, -20F, 0F);

		turretModel[74].addShapeBox(-18F, -10.5F, 13.5F, 7, 7, 6, 0F, -1.5F, 1F, 0F, -5.5F, 1F, 0F, 0F, 0F, 0F, -3F, -2F, -1.5F, -1F, -1.5F, 0.5F, -5.5F, -1.5F, 0F, 0.5F, 0F, 0F, -3F, -2.5F, -1.5F); // Box 20
		turretModel[74].setRotationPoint(0F, -20F, 0F);

		turretModel[75].addBox(-20F, -55.25F, -13F, 4, 4, 12, 0F); // Box 2
		turretModel[75].setRotationPoint(0F, 20F, 0F);

		turretModel[76].addShapeBox(-16F, -55.25F, -13F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 3
		turretModel[76].setRotationPoint(0F, 20F, 0F);

		turretModel[77].addShapeBox(-24F, -55.25F, -13F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		turretModel[77].setRotationPoint(0F, 20F, 0F);

		turretModel[78].addShapeBox(-16.5F, -63.25F, -11.5F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 5
		turretModel[78].setRotationPoint(0F, 20F, 0F);

		turretModel[79].addBox(-19.5F, -63.25F, -11.5F, 3, 8, 9, 0F); // Box 6
		turretModel[79].setRotationPoint(0F, 20F, 0F);

		turretModel[80].addShapeBox(-22.5F, -63.25F, -11.5F, 3, 8, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 8
		turretModel[80].setRotationPoint(0F, 20F, 0F);

		turretModel[81].addBox(-25F, -22.5F, -11F, 4, 7, 9, 0F); // Box 9
		turretModel[81].setRotationPoint(0F, -20F, 0F);

		turretModel[82].addShapeBox(-25F, -18.5F, -2F, 4, 3, 7, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 10
		turretModel[82].setRotationPoint(0F, -20F, 0F);

		turretModel[83].addShapeBox(-25F, -22.5F, 2F, 4, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		turretModel[83].setRotationPoint(0F, -20F, 0F);

		turretModel[84].addBox(1F, -16F, 6F, 4, 4, 4, 0F); // Box 16
		turretModel[84].setRotationPoint(0F, -20F, 0F);

		turretModel[85].addBox(1.5F, -26F, 6.5F, 3, 10, 3, 0F); // Box 17
		turretModel[85].setRotationPoint(0F, -20F, 0F);

		turretModel[86].addBox(2F, -28F, 7F, 2, 2, 2, 0F); // Box 18
		turretModel[86].setRotationPoint(0F, -20F, 0F);

		turretModel[87].addShapeBox(-16.5F, -57.25F, -11.5F, 3, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 19
		turretModel[87].setRotationPoint(0F, 20F, 0F);

		turretModel[88].addShapeBox(-16.5F, -61.25F, -11F, 2, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 20
		turretModel[88].setRotationPoint(0F, 20F, 0F);


		barrelModel = new ModelRendererTurbo[11];
		barrelModel[0] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 4
		barrelModel[1] = new ModelRendererTurbo(this, 0, 393, textureX, textureY); // Box 5
		barrelModel[2] = new ModelRendererTurbo(this, 0, 408, textureX, textureY); // Box 6
		barrelModel[3] = new ModelRendererTurbo(this, 26, 414, textureX, textureY); // Box 7
		barrelModel[4] = new ModelRendererTurbo(this, 57, 422, textureX, textureY); // Box 8
		barrelModel[5] = new ModelRendererTurbo(this, 66, 414, textureX, textureY); // Box 9
		barrelModel[6] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Box 10
		barrelModel[7] = new ModelRendererTurbo(this, 98, 423, textureX, textureY); // Box 12
		barrelModel[8] = new ModelRendererTurbo(this, 98, 414, textureX, textureY); // Box 13
		barrelModel[9] = new ModelRendererTurbo(this, 98, 432, textureX, textureY); // Box 14
		barrelModel[10] = new ModelRendererTurbo(this, 98, 441, textureX, textureY); // Box 15

		barrelModel[0].addShapeBox(0F, -1F, -2F, 90, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 4
		barrelModel[0].setRotationPoint(15F, -26F, 0F);

		barrelModel[1].addShapeBox(0F, -2F, -2F, 90, 1, 4, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F); // Box 5
		barrelModel[1].setRotationPoint(15F, -26F, 0F);

		barrelModel[2].addShapeBox(0F, 1F, -2F, 90, 1, 4, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[2].setRotationPoint(15F, -26F, 0F);

		barrelModel[3].addShapeBox(3F, -5F, -4F, 10, 5, 8, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 7
		barrelModel[3].setRotationPoint(15F, -26F, 0F);

		barrelModel[4].addShapeBox(3F, 0F, -4F, 10, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 8
		barrelModel[4].setRotationPoint(15F, -26F, 0F);

		barrelModel[5].addShapeBox(3F, -5F, -2F, 10, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		barrelModel[5].setRotationPoint(15F, -26F, 0F);

		barrelModel[6].addBox(87.6F, -3F, -0.5F, 2, 2, 1, 0F); // Box 10
		barrelModel[6].setRotationPoint(15F, -26F, 0F);

		barrelModel[7].addBox(-2.75F, -2F, -2F, 8, 4, 4, 0F); // Box 12
		barrelModel[7].setRotationPoint(-23F, -41F, 0F);

		barrelModel[8].addShapeBox(-4.75F, -2F, -2F, 2, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 13
		barrelModel[8].setRotationPoint(-23F, -41F, 0F);

		barrelModel[9].addShapeBox(5.25F, -2F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 14
		barrelModel[9].setRotationPoint(-23F, -41F, 0F);

		barrelModel[10].addShapeBox(9.25F, -1F, -1F, 7, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 15
		barrelModel[10].setRotationPoint(-23F, -41F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[7];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 14
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 15
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 16
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 17
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 18
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 19

		leftTrackWheelModels[0].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 13
		leftTrackWheelModels[0].setRotationPoint(47F, 3.5F, 16.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 14
		leftTrackWheelModels[1].setRotationPoint(33F, 3.5F, 16.5F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 15
		leftTrackWheelModels[2].setRotationPoint(19F, 3.5F, 16.5F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 16
		leftTrackWheelModels[3].setRotationPoint(5F, 3.5F, 16.5F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 17
		leftTrackWheelModels[4].setRotationPoint(-9F, 3.5F, 16.5F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 18
		leftTrackWheelModels[5].setRotationPoint(-22F, 3.5F, 16.5F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 19
		leftTrackWheelModels[6].setRotationPoint(-35F, 3.5F, 16.5F);


		rightTrackWheelModels = new ModelRendererTurbo[7];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 6
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 7
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 8
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 9
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 10
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 11
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 5, 480, textureX, textureY); // Shape 12

		rightTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 6
		rightTrackWheelModels[0].setRotationPoint(47F, 3.5F, -16.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 7
		rightTrackWheelModels[1].setRotationPoint(-22F, 3.5F, -16.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 8
		rightTrackWheelModels[2].setRotationPoint(-9F, 3.5F, -16.5F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 9
		rightTrackWheelModels[3].setRotationPoint(5F, 3.5F, -16.5F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 10
		rightTrackWheelModels[4].setRotationPoint(19F, 3.5F, -16.5F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 11
		rightTrackWheelModels[5].setRotationPoint(33F, 3.5F, -16.5F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 10, 12, 12, 40, 10, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 12
		rightTrackWheelModels[6].setRotationPoint(-35F, 3.5F, -16.5F);


		leftTrackModel = new ModelRendererTurbo[11];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Shape 21
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Shape 23
		leftTrackModel[2] = new ModelRendererTurbo(this, 4, 466, textureX, textureY); // Box 28
		leftTrackModel[3] = new ModelRendererTurbo(this, 74, 453, textureX, textureY); // Box 3
		leftTrackModel[4] = new ModelRendererTurbo(this, 47, 480, textureX, textureY); // Box 4
		leftTrackModel[5] = new ModelRendererTurbo(this, 36, 446, textureX, textureY); // Box 5
		leftTrackModel[6] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 10
		leftTrackModel[7] = new ModelRendererTurbo(this, 22, 448, textureX, textureY); // Box 11
		leftTrackModel[8] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 12
		leftTrackModel[9] = new ModelRendererTurbo(this, 74, 440, textureX, textureY); // Box 13
		leftTrackModel[10] = new ModelRendererTurbo(this, 35, 493, textureX, textureY); // Box 14

		leftTrackModel[0].addShape3D(6F, -6F, -9F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 9, 12, 12, 40, 9, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 21
		leftTrackModel[0].setRotationPoint(60F, -6.5F, 16.5F);

		leftTrackModel[1].addShape3D(6F, -6F, -9F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 9, 12, 12, 40, 9, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 23
		leftTrackModel[1].setRotationPoint(-49F, -6.5F, 16.5F);

		leftTrackModel[2].addBox(0F, 0F, -11F, 113, 1, 11, 0F); // Box 28
		leftTrackModel[2].setRotationPoint(-51F, -13F, 27F);

		leftTrackModel[3].addShapeBox(0F, 0F, -11F, 14, 1, 11, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 3
		leftTrackModel[3].setRotationPoint(-51F, -1F, 27F);

		leftTrackModel[4].addBox(0F, 0F, -11F, 86, 1, 11, 0F); // Box 4
		leftTrackModel[4].setRotationPoint(-37F, 9F, 27F);

		leftTrackModel[5].addShapeBox(0F, 0F, -11F, 13, 1, 11, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 5
		leftTrackModel[5].setRotationPoint(49F, -1F, 27F);

		leftTrackModel[6].addShapeBox(0F, 0F, -11F, 5, 1, 11, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F); // Box 10
		leftTrackModel[6].setRotationPoint(62F, -1F, 27F);

		leftTrackModel[7].addShapeBox(0F, 0F, -11F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftTrackModel[7].setRotationPoint(65.5F, -8.5F, 27F);

		leftTrackModel[8].addShapeBox(0F, 0F, -11F, 5, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[8].setRotationPoint(62F, -13F, 27F);

		leftTrackModel[9].addShapeBox(0F, 0F, -11F, 5, 1, 11, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F); // Box 13
		leftTrackModel[9].setRotationPoint(-56F, -1F, 27F);

		leftTrackModel[10].addShapeBox(0F, 0F, -11F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackModel[10].setRotationPoint(-55.5F, -8.5F, 27F);


		rightTrackModel = new ModelRendererTurbo[13];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Shape 20
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 426, textureX, textureY); // Shape 22
		rightTrackModel[2] = new ModelRendererTurbo(this, 4, 466, textureX, textureY); // Box 26
		rightTrackModel[3] = new ModelRendererTurbo(this, 47, 480, textureX, textureY); // Box 1
		rightTrackModel[4] = new ModelRendererTurbo(this, 74, 453, textureX, textureY); // Box 2
		rightTrackModel[5] = new ModelRendererTurbo(this, 36, 446, textureX, textureY); // Box 6
		rightTrackModel[6] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 7
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 453, textureX, textureY); // Box 8
		rightTrackModel[8] = new ModelRendererTurbo(this, 22, 448, textureX, textureY); // Box 9
		rightTrackModel[9] = new ModelRendererTurbo(this, 74, 440, textureX, textureY); // Box 15
		rightTrackModel[10] = new ModelRendererTurbo(this, 74, 440, textureX, textureY); // Box 16
		rightTrackModel[11] = new ModelRendererTurbo(this, 35, 493, textureX, textureY); // Box 17
		rightTrackModel[12] = new ModelRendererTurbo(this, 74, 440, textureX, textureY); // Box 18

		rightTrackModel[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 9, 12, 12, 40, 9, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 20
		rightTrackModel[0].setRotationPoint(60F, -6.5F, -16.5F);

		rightTrackModel[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 9, 12, 12, 40, 9, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Shape 22
		rightTrackModel[1].setRotationPoint(-49F, -6.5F, -16.5F);

		rightTrackModel[2].addBox(0F, 0F, 0F, 113, 1, 11, 0F); // Box 26
		rightTrackModel[2].setRotationPoint(-51F, -13F, -27F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 86, 1, 11, 0F); // Box 1
		rightTrackModel[3].setRotationPoint(-37F, 9F, -27F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F); // Box 2
		rightTrackModel[4].setRotationPoint(-51F, -1F, -27F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 6
		rightTrackModel[5].setRotationPoint(49F, -1F, -27F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F); // Box 7
		rightTrackModel[6].setRotationPoint(62F, -13F, -27F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F); // Box 8
		rightTrackModel[7].setRotationPoint(62F, -1F, -27F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		rightTrackModel[8].setRotationPoint(65.5F, -8.5F, -27F);

		rightTrackModel[9].addShapeBox(0F, 0F, -11F, 5, 1, 11, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F); // Box 15
		rightTrackModel[9].setRotationPoint(-56F, -13F, 27F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F); // Box 16
		rightTrackModel[10].setRotationPoint(-56F, -1F, -27F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightTrackModel[11].setRotationPoint(-55.5F, -8.5F, -27F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4.5F, 0F, -1.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 3.5F, 0F); // Box 18
		rightTrackModel[12].setRotationPoint(-56F, -13F, -27F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}