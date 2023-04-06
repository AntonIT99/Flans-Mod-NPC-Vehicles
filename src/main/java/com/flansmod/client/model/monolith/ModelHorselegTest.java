//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bireme
// Model Creator: 
// Created on: 29.03.2019 - 14:53:14
// Last changed on: 29.03.2019 - 14:53:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelHorselegTest extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHorselegTest() //Same as Filename
	//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
	// Copyright (C) 2016 Minecraft-SMP.de
	// This file is for Flan's Flying Mod Version 4.0.x+

	// Model: 
	// Model Creator: 
	// Created on: 06.11.2016 - 20:45:55
	// Last changed on: 06.11.2016 - 20:45:55


		{
			bodyModel = new ModelRendererTurbo[151];
			bodyModel[0] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 0
			bodyModel[1] = new ModelRendererTurbo(this, 0, 71, textureX, textureY); // Box 1
			bodyModel[2] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 2
			bodyModel[3] = new ModelRendererTurbo(this, 0, 124, textureX, textureY); // Box 4
			bodyModel[4] = new ModelRendererTurbo(this, 0, 182, textureX, textureY); // Box 6
			bodyModel[5] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 7
			bodyModel[6] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Box 8
			bodyModel[7] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 9
			bodyModel[8] = new ModelRendererTurbo(this, 0, 373, textureX, textureY); // Box 10
			bodyModel[9] = new ModelRendererTurbo(this, 0, 362, textureX, textureY); // Box 11
			bodyModel[10] = new ModelRendererTurbo(this, 0, 373, textureX, textureY); // Box 12
			bodyModel[11] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 18
			bodyModel[12] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 19
			bodyModel[13] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 20
			bodyModel[14] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Box 21
			bodyModel[15] = new ModelRendererTurbo(this, 0, 394, textureX, textureY); // Box 22
			bodyModel[16] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Box 23
			bodyModel[17] = new ModelRendererTurbo(this, 0, 431, textureX, textureY); // Box 24
			bodyModel[18] = new ModelRendererTurbo(this, 0, 431, textureX, textureY); // Box 25
			bodyModel[19] = new ModelRendererTurbo(this, 0, 431, textureX, textureY); // Box 26
			bodyModel[20] = new ModelRendererTurbo(this, 0, 431, textureX, textureY); // Box 27
			bodyModel[21] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 28
			bodyModel[22] = new ModelRendererTurbo(this, 0, 439, textureX, textureY); // Box 29
			bodyModel[23] = new ModelRendererTurbo(this, 0, 444, textureX, textureY); // Box 30
			bodyModel[24] = new ModelRendererTurbo(this, 0, 447, textureX, textureY); // Box 31
			bodyModel[25] = new ModelRendererTurbo(this, 0, 451, textureX, textureY); // Box 32
			bodyModel[26] = new ModelRendererTurbo(this, 0, 451, textureX, textureY); // Box 33
			bodyModel[27] = new ModelRendererTurbo(this, 0, 454, textureX, textureY); // Box 34
			bodyModel[28] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 35
			bodyModel[29] = new ModelRendererTurbo(this, 0, 469, textureX, textureY); // Box 36
			bodyModel[30] = new ModelRendererTurbo(this, 25, 469, textureX, textureY); // Box 37
			bodyModel[31] = new ModelRendererTurbo(this, 0, 473, textureX, textureY); // Box 39
			bodyModel[32] = new ModelRendererTurbo(this, 0, 479, textureX, textureY); // Box 40
			bodyModel[33] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 41
			bodyModel[34] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 42
			bodyModel[35] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 43
			bodyModel[36] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 44
			bodyModel[37] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 45
			bodyModel[38] = new ModelRendererTurbo(this, 0, 479, textureX, textureY); // Box 46
			bodyModel[39] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 47
			bodyModel[40] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 48
			bodyModel[41] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 49
			bodyModel[42] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 50
			bodyModel[43] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Box 51
			bodyModel[44] = new ModelRendererTurbo(this, 0, 473, textureX, textureY); // Box 52
			bodyModel[45] = new ModelRendererTurbo(this, 0, 491, textureX, textureY); // Box 53
			bodyModel[46] = new ModelRendererTurbo(this, 0, 491, textureX, textureY); // Box 54
			bodyModel[47] = new ModelRendererTurbo(this, 0, 498, textureX, textureY); // Box 55
			bodyModel[48] = new ModelRendererTurbo(this, 0, 501, textureX, textureY); // Box 56
			bodyModel[49] = new ModelRendererTurbo(this, 0, 504, textureX, textureY); // Box 57
			bodyModel[50] = new ModelRendererTurbo(this, 0, 498, textureX, textureY); // Box 58
			bodyModel[51] = new ModelRendererTurbo(this, 0, 501, textureX, textureY); // Box 59
			bodyModel[52] = new ModelRendererTurbo(this, 0, 504, textureX, textureY); // Box 60
			bodyModel[53] = new ModelRendererTurbo(this, 0, 513, textureX, textureY); // Box 61
			bodyModel[54] = new ModelRendererTurbo(this, 0, 513, textureX, textureY); // Box 62
			bodyModel[55] = new ModelRendererTurbo(this, 0, 519, textureX, textureY); // Box 63
			bodyModel[56] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 64
			bodyModel[57] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 65
			bodyModel[58] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 66
			bodyModel[59] = new ModelRendererTurbo(this, 0, 524, textureX, textureY); // Box 67
			bodyModel[60] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 68
			bodyModel[61] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 69
			bodyModel[62] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 70
			bodyModel[63] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Box 71
			bodyModel[64] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 72
			bodyModel[65] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 73
			bodyModel[66] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 74
			bodyModel[67] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 75
			bodyModel[68] = new ModelRendererTurbo(this, 0, 556, textureX, textureY); // Box 79
			bodyModel[69] = new ModelRendererTurbo(this, 28, 556, textureX, textureY); // Box 80
			bodyModel[70] = new ModelRendererTurbo(this, 0, 564, textureX, textureY); // Box 81
			bodyModel[71] = new ModelRendererTurbo(this, 28, 564, textureX, textureY); // Box 82
			bodyModel[72] = new ModelRendererTurbo(this, 0, 572, textureX, textureY); // Box 83
			bodyModel[73] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 84
			bodyModel[74] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Box 85
			bodyModel[75] = new ModelRendererTurbo(this, 0, 588, textureX, textureY); // Box 86
			bodyModel[76] = new ModelRendererTurbo(this, 0, 591, textureX, textureY); // Box 87
			bodyModel[77] = new ModelRendererTurbo(this, 0, 598, textureX, textureY); // Box 88
			bodyModel[78] = new ModelRendererTurbo(this, 0, 605, textureX, textureY); // Box 89
			bodyModel[79] = new ModelRendererTurbo(this, 0, 612, textureX, textureY); // Box 90
			bodyModel[80] = new ModelRendererTurbo(this, 0, 621, textureX, textureY); // Box 91
			bodyModel[81] = new ModelRendererTurbo(this, 0, 626, textureX, textureY); // Box 92
			bodyModel[82] = new ModelRendererTurbo(this, 0, 632, textureX, textureY); // Box 93
			bodyModel[83] = new ModelRendererTurbo(this, 29, 632, textureX, textureY); // Box 94
			bodyModel[84] = new ModelRendererTurbo(this, 0, 641, textureX, textureY); // Box 95
			bodyModel[85] = new ModelRendererTurbo(this, 29, 641, textureX, textureY); // Box 96
			bodyModel[86] = new ModelRendererTurbo(this, 0, 649, textureX, textureY); // Box 105
			bodyModel[87] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 106
			bodyModel[88] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 107
			bodyModel[89] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Box 108
			bodyModel[90] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 109
			bodyModel[91] = new ModelRendererTurbo(this, 0, 677, textureX, textureY); // Box 110
			bodyModel[92] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 111
			bodyModel[93] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 112
			bodyModel[94] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 113
			bodyModel[95] = new ModelRendererTurbo(this, 0, 689, textureX, textureY); // Box 114
			bodyModel[96] = new ModelRendererTurbo(this, 0, 741, textureX, textureY); // Box 115
			bodyModel[97] = new ModelRendererTurbo(this, 0, 689, textureX, textureY); // Box 116
			bodyModel[98] = new ModelRendererTurbo(this, 0, 784, textureX, textureY); // Box 117
			bodyModel[99] = new ModelRendererTurbo(this, 0, 793, textureX, textureY); // Box 118
			bodyModel[100] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Box 119
			bodyModel[101] = new ModelRendererTurbo(this, 0, 784, textureX, textureY); // Box 120
			bodyModel[102] = new ModelRendererTurbo(this, 0, 793, textureX, textureY); // Box 121
			bodyModel[103] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Box 122
			bodyModel[104] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Box 123
			bodyModel[105] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 124
			bodyModel[106] = new ModelRendererTurbo(this, 0, 890, textureX, textureY); // Box 125
			bodyModel[107] = new ModelRendererTurbo(this, 0, 929, textureX, textureY); // Box 126
			bodyModel[108] = new ModelRendererTurbo(this, 0, 929, textureX, textureY); // Box 127
			bodyModel[109] = new ModelRendererTurbo(this, 0, 929, textureX, textureY); // Box 128
			bodyModel[110] = new ModelRendererTurbo(this, 0, 933, textureX, textureY); // Box 129
			bodyModel[111] = new ModelRendererTurbo(this, 0, 964, textureX, textureY); // Box 130
			bodyModel[112] = new ModelRendererTurbo(this, 33, 964, textureX, textureY); // Box 131
			bodyModel[113] = new ModelRendererTurbo(this, 0, 964, textureX, textureY); // Box 132
			bodyModel[114] = new ModelRendererTurbo(this, 0, 964, textureX, textureY); // Box 133
			bodyModel[115] = new ModelRendererTurbo(this, 0, 982, textureX, textureY); // Box 134
			bodyModel[116] = new ModelRendererTurbo(this, 0, 1001, textureX, textureY); // Box 135
			bodyModel[117] = new ModelRendererTurbo(this, 29, 982, textureX, textureY); // Box 136
			bodyModel[118] = new ModelRendererTurbo(this, 29, 995, textureX, textureY); // Box 137
			bodyModel[119] = new ModelRendererTurbo(this, 29, 1003, textureX, textureY); // Box 138
			bodyModel[120] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 139
			bodyModel[121] = new ModelRendererTurbo(this, 200, 11, textureX, textureY); // Box 140
			bodyModel[122] = new ModelRendererTurbo(this, 200, 19, textureX, textureY); // Box 141
			bodyModel[123] = new ModelRendererTurbo(this, 200, 27, textureX, textureY); // Box 142
			bodyModel[124] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 143
			bodyModel[125] = new ModelRendererTurbo(this, 200, 11, textureX, textureY); // Box 144
			bodyModel[126] = new ModelRendererTurbo(this, 200, 19, textureX, textureY); // Box 145
			bodyModel[127] = new ModelRendererTurbo(this, 200, 27, textureX, textureY); // Box 146
			bodyModel[128] = new ModelRendererTurbo(this, 200, 48, textureX, textureY); // Box 147
			bodyModel[129] = new ModelRendererTurbo(this, 200, 54, textureX, textureY); // Box 148
			bodyModel[130] = new ModelRendererTurbo(this, 200, 57, textureX, textureY); // Box 149
			bodyModel[131] = new ModelRendererTurbo(this, 200, 48, textureX, textureY); // Box 150
			bodyModel[132] = new ModelRendererTurbo(this, 200, 54, textureX, textureY); // Box 151
			bodyModel[133] = new ModelRendererTurbo(this, 200, 57, textureX, textureY); // Box 152
			bodyModel[134] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Box 153
			bodyModel[135] = new ModelRendererTurbo(this, 200, 65, textureX, textureY); // Box 154
			bodyModel[136] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Box 155
			bodyModel[137] = new ModelRendererTurbo(this, 200, 90, textureX, textureY); // Box 156
			bodyModel[138] = new ModelRendererTurbo(this, 200, 107, textureX, textureY); // Box 157
			bodyModel[139] = new ModelRendererTurbo(this, 200, 65, textureX, textureY); // Box 158
			bodyModel[140] = new ModelRendererTurbo(this, 200, 72, textureX, textureY); // Box 159
			bodyModel[141] = new ModelRendererTurbo(this, 200, 90, textureX, textureY); // Box 160
			bodyModel[142] = new ModelRendererTurbo(this, 200, 107, textureX, textureY); // Box 161
			bodyModel[143] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 295
			bodyModel[144] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 296
			bodyModel[145] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 297
			bodyModel[146] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 298
			bodyModel[147] = new ModelRendererTurbo(this, 200, 124, textureX, textureY); // Box 299
			bodyModel[148] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 300
			bodyModel[149] = new ModelRendererTurbo(this, 0, 936, textureX, textureY); // Box 301
			bodyModel[150] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Box 302

			bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
			bodyModel[0].setRotationPoint(-44F, -20F, -25.5F);

			bodyModel[1].addShapeBox(0F, 0F, 0F, 37, 1, 51, 0F, 0F, 0F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, -0.5F, 0F); // Box 1
			bodyModel[1].setRotationPoint(8F, -20F, -25.5F);

			bodyModel[2].addShapeBox(0F, 0F, 0F, 52, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
			bodyModel[2].setRotationPoint(-44F, -20F, 23.5F);

			bodyModel[3].addShapeBox(0F, 0F, 0F, 23, 6, 51, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
			bodyModel[3].setRotationPoint(-15F, -24.5F, -25.5F);

			bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 6, 51, 0F, 0F, 0F, -7.5F, -2F, -11.5F, -5F, -2F, -11.5F, -5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 8.5F, -2F, 0F, 8.5F, -2F, 0F, 0F, 0F); // Box 6
			bodyModel[4].setRotationPoint(8F, -24.5F, -25.5F);

			bodyModel[5].addShapeBox(0F, 0F, 0F, 23, 9, 51, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
			bodyModel[5].setRotationPoint(-15F, -18.5F, -25.5F);

			bodyModel[6].addShapeBox(0F, 0F, 0F, 35, 9, 51, 0F, 0F, 0F, 0F, 0F, -8.5F, -2F, 0F, -8.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
			bodyModel[6].setRotationPoint(8F, -18.5F, -25.5F);

			bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
			bodyModel[7].setRotationPoint(23.5F, -9.5F, -25.5F);

			bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
			bodyModel[8].setRotationPoint(44.5F, -8.5F, -25.5F);

			bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
			bodyModel[9].setRotationPoint(23.5F, -9.5F, 16.5F);

			bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
			bodyModel[10].setRotationPoint(44.5F, -8.5F, 16.5F);

			bodyModel[11].addShapeBox(4F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
			bodyModel[11].setRotationPoint(8F, -24.5F, -9F);
			bodyModel[11].rotateAngleZ = -0.33510322F;

			bodyModel[12].addShapeBox(11F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
			bodyModel[12].setRotationPoint(8F, -24.5F, -9F);
			bodyModel[12].rotateAngleZ = -0.33510322F;

			bodyModel[13].addShapeBox(13F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
			bodyModel[13].setRotationPoint(8F, -24.5F, -9F);
			bodyModel[13].rotateAngleZ = -0.33510322F;

			bodyModel[14].addShapeBox(19F, -1F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
			bodyModel[14].setRotationPoint(8F, -24.5F, -9F);
			bodyModel[14].rotateAngleZ = -0.33510322F;

			bodyModel[15].addShapeBox(3F, -0.5F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
			bodyModel[15].setRotationPoint(8F, -24.5F, -17F);
			bodyModel[15].rotateAngleZ = -0.33510322F;

			bodyModel[16].addShapeBox(24F, -0.5F, 0F, 9, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
			bodyModel[16].setRotationPoint(8F, -24.5F, -12F);
			bodyModel[16].rotateAngleZ = -0.33510322F;

			bodyModel[17].addShapeBox(23F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
			bodyModel[17].setRotationPoint(8F, -24.5F, -11F);
			bodyModel[17].rotateAngleZ = -0.33510322F;

			bodyModel[18].addShapeBox(23F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
			bodyModel[18].setRotationPoint(8F, -24.5F, -2F);
			bodyModel[18].rotateAngleZ = -0.33510322F;

			bodyModel[19].addShapeBox(23F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
			bodyModel[19].setRotationPoint(8F, -24.5F, 0F);
			bodyModel[19].rotateAngleZ = -0.33510322F;

			bodyModel[20].addShapeBox(23F, -1F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
			bodyModel[20].setRotationPoint(8F, -24.5F, 10F);
			bodyModel[20].rotateAngleZ = -0.33510322F;

			bodyModel[21].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
			bodyModel[21].setRotationPoint(8F, -24.5F, -3F);
			bodyModel[21].rotateAngleZ = -0.33510322F;

			bodyModel[22].addShapeBox(17F, -0.5F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 29
			bodyModel[22].setRotationPoint(8F, -24.5F, -3F);
			bodyModel[22].rotateAngleZ = -0.33510322F;

			bodyModel[23].addShapeBox(3F, -0.5F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
			bodyModel[23].setRotationPoint(8F, -24.5F, -2F);
			bodyModel[23].rotateAngleZ = -0.33510322F;

			bodyModel[24].addShapeBox(2F, -0.5F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
			bodyModel[24].setRotationPoint(8F, -24.5F, -2.5F);
			bodyModel[24].rotateAngleZ = -0.33510322F;

			bodyModel[25].addShapeBox(12F, -0.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
			bodyModel[25].setRotationPoint(8F, -24.5F, 6F);
			bodyModel[25].rotateAngleZ = -0.33510322F;

			bodyModel[26].addShapeBox(12F, -0.5F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
			bodyModel[26].setRotationPoint(8F, -24.5F, 11.5F);
			bodyModel[26].rotateAngleZ = -0.33510322F;

			bodyModel[27].addShapeBox(12F, -1F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
			bodyModel[27].setRotationPoint(8F, -24.5F, 7.25F);
			bodyModel[27].rotateAngleZ = -0.33510322F;

			bodyModel[28].addShapeBox(4F, -0.5F, 0F, 8, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
			bodyModel[28].setRotationPoint(8F, -24.5F, 5.75F);
			bodyModel[28].rotateAngleZ = -0.33510322F;

			bodyModel[29].addShapeBox(4F, -0.5F, 0F, 8, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
			bodyModel[29].setRotationPoint(8F, -24.5F, 3.75F);
			bodyModel[29].rotateAngleZ = -0.33510322F;

			bodyModel[30].addShapeBox(4F, -0.5F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 37
			bodyModel[30].setRotationPoint(8F, -24.5F, 12.75F);
			bodyModel[30].rotateAngleZ = -0.33510322F;

			bodyModel[31].addShapeBox(23F, -0.5F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
			bodyModel[31].setRotationPoint(7F, -24.5F, -18F);
			bodyModel[31].rotateAngleZ = -0.33510322F;

			bodyModel[32].addShapeBox(0F, 0F, -1.5F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 40
			bodyModel[32].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[32].rotateAngleY = -0.50614548F;

			bodyModel[33].addShapeBox(1F, 0.6F, -0.9F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 41
			bodyModel[33].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[33].rotateAngleY = -1.08210414F;
			bodyModel[33].rotateAngleZ = 0.20943951F;

			bodyModel[34].addShapeBox(1F, 0.6F, -0.2F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 42
			bodyModel[34].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[34].rotateAngleY = 0.06981317F;
			bodyModel[34].rotateAngleZ = 0.20943951F;

			bodyModel[35].addShapeBox(1F, 2.6F, -0.9F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 43
			bodyModel[35].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[35].rotateAngleY = -1.25663706F;
			bodyModel[35].rotateAngleZ = 0.20943951F;

			bodyModel[36].addShapeBox(1F, 2.6F, -0.2F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 44
			bodyModel[36].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[36].rotateAngleY = 0.2443461F;
			bodyModel[36].rotateAngleZ = 0.20943951F;

			bodyModel[37].addShapeBox(0.5F, 2.6F, -0.65F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 45
			bodyModel[37].setRotationPoint(30F, -20.5F, -15F);
			bodyModel[37].rotateAngleY = -0.50614548F;
			bodyModel[37].rotateAngleZ = 0.20943951F;

			bodyModel[38].addShapeBox(0F, 0F, -1.5F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 46
			bodyModel[38].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[38].rotateAngleY = 0.87266463F;

			bodyModel[39].addShapeBox(1F, 0.6F, -0.9F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 47
			bodyModel[39].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[39].rotateAngleY = 0.29670597F;
			bodyModel[39].rotateAngleZ = 0.20943951F;

			bodyModel[40].addShapeBox(1F, 0.6F, -0.2F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 48
			bodyModel[40].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[40].rotateAngleY = 1.44862328F;
			bodyModel[40].rotateAngleZ = 0.20943951F;

			bodyModel[41].addShapeBox(1F, 2.6F, -0.2F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 49
			bodyModel[41].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[41].rotateAngleY = 1.6231562F;
			bodyModel[41].rotateAngleZ = 0.20943951F;

			bodyModel[42].addShapeBox(0.5F, 2.6F, -0.65F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 50
			bodyModel[42].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[42].rotateAngleY = 0.87266463F;
			bodyModel[42].rotateAngleZ = 0.20943951F;

			bodyModel[43].addShapeBox(1F, 2.6F, -0.9F, 3, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 51
			bodyModel[43].setRotationPoint(25F, -22.5F, 14F);
			bodyModel[43].rotateAngleY = 0.12217305F;
			bodyModel[43].rotateAngleZ = 0.20943951F;

			bodyModel[44].addShapeBox(18F, -0.5F, 0F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
			bodyModel[44].setRotationPoint(7F, -24.5F, 13F);
			bodyModel[44].rotateAngleZ = -0.33510322F;

			bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
			bodyModel[45].setRotationPoint(30F, -17.5F, -21F);
			bodyModel[45].rotateAngleX = -0.9424778F;

			bodyModel[46].addShapeBox(0F, 0F, -3F, 1, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
			bodyModel[46].setRotationPoint(30F, -17.5F, 21F);
			bodyModel[46].rotateAngleX = 0.9424778F;

			bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
			bodyModel[47].setRotationPoint(19F, -18.5F, 21F);

			bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
			bodyModel[48].setRotationPoint(12.5F, -25.5F, 22F);

			bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 6F, -1F, -1F, -7F, 0F, -1F, -7F, 0F, 1F, 6F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
			bodyModel[49].setRotationPoint(19.5F, -25.5F, 21F);

			bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
			bodyModel[50].setRotationPoint(19F, -18.5F, -22F);

			bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
			bodyModel[51].setRotationPoint(12.5F, -25.5F, -23F);

			bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, 6F, -1F, 1F, -7F, 0F, 1F, -7F, 0F, -1F, 6F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
			bodyModel[52].setRotationPoint(19.5F, -25.5F, -22F);

			bodyModel[53].addShapeBox(-1F, 0F, -0.5F, 1, 3, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
			bodyModel[53].setRotationPoint(13F, -27F, 22F);
			bodyModel[53].rotateAngleY = 0.52359878F;

			bodyModel[54].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
			bodyModel[54].setRotationPoint(13F, -27F, -22F);
			bodyModel[54].rotateAngleY = -0.52359878F;

			bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 63
			bodyModel[55].setRotationPoint(-7F, -24.5F, 18F);

			bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
			bodyModel[56].setRotationPoint(-9F, -26.5F, 3.5F);

			bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 65
			bodyModel[57].setRotationPoint(-9F, -26.5F, 11.5F);

			bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 66
			bodyModel[58].setRotationPoint(-1F, -26.5F, 11.5F);

			bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
			bodyModel[59].setRotationPoint(-1F, -26.5F, 3.5F);

			bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, -2.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 68
			bodyModel[60].setRotationPoint(-9F, -28.5F, 3.5F);

			bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2.5F); // Box 69
			bodyModel[61].setRotationPoint(-9F, -28.5F, 11.5F);

			bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 70
			bodyModel[62].setRotationPoint(-1F, -28.5F, 11.5F);

			bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
			bodyModel[63].setRotationPoint(-1F, -28.5F, 3.5F);

			bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
			bodyModel[64].setRotationPoint(-9F, -29.5F, 3.5F);

			bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 73
			bodyModel[65].setRotationPoint(-9F, -29.5F, 11.5F);

			bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 74
			bodyModel[66].setRotationPoint(-1F, -29.5F, 11.5F);

			bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
			bodyModel[67].setRotationPoint(-1F, -29.5F, 3.5F);

			bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
			bodyModel[68].setRotationPoint(-7F, -30F, 5.5F);

			bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 80
			bodyModel[69].setRotationPoint(-7F, -30F, 11.5F);

			bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
			bodyModel[70].setRotationPoint(-1F, -30F, 5.5F);

			bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 82
			bodyModel[71].setRotationPoint(-1F, -30F, 11.5F);

			bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
			bodyModel[72].setRotationPoint(6F, -26.6F, 9.5F);

			bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
			bodyModel[73].setRotationPoint(-5F, -30.5F, 11.5F);

			bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
			bodyModel[74].setRotationPoint(1F, -30.5F, 11.5F);

			bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
			bodyModel[75].setRotationPoint(-5F, -30.5F, 17.5F);

			bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
			bodyModel[76].setRotationPoint(5F, -24F, -23.5F);

			bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 3F, 0F, 0F, 0F); // Box 88
			bodyModel[77].setRotationPoint(9F, -24F, -23.5F);

			bodyModel[78].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, 0.50F, ModelRendererTurbo.MR_RIGHT); // Box 89
			bodyModel[78].setRotationPoint(3F, -24F, -23.5F);

			bodyModel[79].addBox(0F, 0F, 0F, 15, 4, 4, 0F); // Box 90
			bodyModel[79].setRotationPoint(-12F, -24.5F, -24F);

			bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 91
			bodyModel[80].setRotationPoint(-15F, -23.5F, -23F);

			bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
			bodyModel[81].setRotationPoint(-15F, -26.5F, -23F);

			bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
			bodyModel[82].setRotationPoint(-5.5F, -25F, -17F);

			bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 94
			bodyModel[83].setRotationPoint(-5.5F, -25F, -11F);

			bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 95
			bodyModel[84].setRotationPoint(0.5F, -25F, -11F);

			bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
			bodyModel[85].setRotationPoint(0.5F, -25F, -17F);

			bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
			bodyModel[86].setRotationPoint(3F, -32.6F, 8.5F);

			bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
			bodyModel[87].setRotationPoint(5.5F, -32.6F, 6.5F);
			bodyModel[87].glow = true;

			bodyModel[88].addShapeBox(0F, 0F, 0F, 26, 9, 2, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0.16F, -0.2F, 0F, 0.16F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 107
			bodyModel[88].setRotationPoint(-41F, -18.5F, 23.5F);

			bodyModel[89].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[89].setRotationPoint(-41F, -15.5F, 24.5F);

			bodyModel[90].addShapeBox(0F, 0F, 0F, 26, 9, 2, 0F, 0F, 0.16F, -0.2F, 0F, 0.16F, -0.2F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
			bodyModel[90].setRotationPoint(-41F, -18.5F, -25.5F);

			bodyModel[91].addShapeBox(0F, 0F, 0F, 26, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 110
			bodyModel[91].setRotationPoint(-41F, -15.5F, -25.5F);

			bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
			bodyModel[92].setRotationPoint(-40F, -17.5F, 24.5F);

			bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
			bodyModel[93].setRotationPoint(-40F, -17.5F, -26.5F);

			bodyModel[94].addShapeBox(0F, 0F, 0F, 26, 8, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
			bodyModel[94].setRotationPoint(-41F, -17.5F, -23.5F);

			bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 114
			bodyModel[95].setRotationPoint(-44F, -20F, -23.5F);

			bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 115
			bodyModel[96].setRotationPoint(-44F, -16.5F, -20.5F);

			bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
			bodyModel[97].setRotationPoint(-44F, -20F, 20.5F);

			bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
			bodyModel[98].setRotationPoint(-35F, -24F, 18F);

			bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 118
			bodyModel[99].setRotationPoint(-35F, -22F, 18F);

			bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
			bodyModel[100].setRotationPoint(-37F, -22F, 19F);

			bodyModel[101].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
			bodyModel[101].setRotationPoint(-35F, -24F, -24F);

			bodyModel[102].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 121
			bodyModel[102].setRotationPoint(-35F, -22F, -24F);

			bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
			bodyModel[103].setRotationPoint(-37F, -22F, -23F);

			bodyModel[104].addShapeBox(0F, 0F, 0F, 78, 11, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
			bodyModel[104].setRotationPoint(-41F, -9.5F, -16.5F);

			bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 6, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 124
			bodyModel[105].setRotationPoint(37F, -4.5F, -16.5F);

			bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 5, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
			bodyModel[106].setRotationPoint(37F, -9.5F, -16.5F);

			bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 33, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
			bodyModel[107].setRotationPoint(45F, -9.5F, -16.5F);

			bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 127
			bodyModel[108].setRotationPoint(45F, -7.5F, -12.5F);

			bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 128
			bodyModel[109].setRotationPoint(45F, -7.5F, 9.5F);

			bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 11, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
			bodyModel[110].setRotationPoint(-42F, -13F, -7.5F);

			bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
			bodyModel[111].setRotationPoint(-42F, -15F, -7.5F);

			bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 131
			bodyModel[112].setRotationPoint(-42F, -2F, -7.5F);

			bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
			bodyModel[113].setRotationPoint(-42.5F, -13F, -8.5F);

			bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
			bodyModel[114].setRotationPoint(-42.5F, -4F, -8.5F);

			bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
			bodyModel[115].setRotationPoint(-45F, -13F, -5.5F);

			bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
			bodyModel[116].setRotationPoint(-47F, -13F, -5.5F);

			bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
			bodyModel[117].setRotationPoint(-47F, -10F, -5.5F);

			bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
			bodyModel[118].setRotationPoint(-47F, -8F, -1.5F);

			bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
			bodyModel[119].setRotationPoint(-47F, -7F, -1.5F);

			bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 139
			bodyModel[120].setRotationPoint(-46F, -10F, 16.7F);

			bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.1F, 0F, -0.1F, 0F, 4F, 0F, 0F, 4F, 0F, -0.1F, 0F, 0F); // Box 140
			bodyModel[121].setRotationPoint(-46F, -9F, 16.7F);

			bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, -2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -2F, 0F, -0.1F, 0F, -0.8F, 0F, -2F, -0.8F, 0F, -2F, 0F, -0.1F, 0F, -0.1F); // Box 141
			bodyModel[122].setRotationPoint(-46F, -9F, 24.7F);

			bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
			bodyModel[123].setRotationPoint(-46F, -7F, 16.7F);

			bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 143
			bodyModel[124].setRotationPoint(-46F, -10F, -25.7F);

			bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.1F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -0.1F, 0F, -0.1F); // Box 144
			bodyModel[125].setRotationPoint(-46F, -9F, -17.7F);

			bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -2F, -0.8F, -0.1F, 0F, -0.1F, 0F, -2F, 0F, 0F, -2F, -0.8F, -0.1F, 0F, -0.8F); // Box 145
			bodyModel[126].setRotationPoint(-46F, -9F, -25.7F);

			bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
			bodyModel[127].setRotationPoint(-46F, -7F, -25.7F);

			bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
			bodyModel[128].setRotationPoint(-43F, -12.5F, 23F);

			bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 148
			bodyModel[129].setRotationPoint(-43.2F, -12.5F, 23.5F);
			bodyModel[129].glow = true;

			bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 149
			bodyModel[130].setRotationPoint(-43.2F, -10.5F, 23.5F);
			bodyModel[130].glow = true;

			bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
			bodyModel[131].setRotationPoint(-43F, -12.5F, -25F);

			bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 151
			bodyModel[132].setRotationPoint(-43.2F, -12.5F, -24.5F);
			bodyModel[132].glow = true;

			bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 152
			bodyModel[133].setRotationPoint(-43.2F, -10.5F, -24.5F);
			bodyModel[133].glow = true;

			bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
			bodyModel[134].setRotationPoint(-41F, -18.5F, 19.5F);

			bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 154
			bodyModel[135].setRotationPoint(-41F, -21.5F, 19.5F);

			bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 155
			bodyModel[136].setRotationPoint(-40F, -37.5F, 20.5F);

			bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 156
			bodyModel[137].setRotationPoint(-40F, -52.5F, 20.5F);

			bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 157
			bodyModel[138].setRotationPoint(-40.5F, -67.5F, 20.5F);

			bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 158
			bodyModel[139].setRotationPoint(-41F, -21.5F, -22.5F);

			bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 159
			bodyModel[140].setRotationPoint(-40F, -37.5F, -21.5F);

			bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0.3F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 160
			bodyModel[141].setRotationPoint(-40F, -52.5F, -21.5F);

			bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, 0.8F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 161
			bodyModel[142].setRotationPoint(-40.5F, -67.5F, -21.5F);

			bodyModel[143].addShapeBox(-1F, -1F, -4F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
			bodyModel[143].setRotationPoint(-39F, -17.5F, 17F);

			bodyModel[144].addShapeBox(-1F, -1F, -11F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
			bodyModel[144].setRotationPoint(-39F, -17.5F, 17F);

			bodyModel[145].addShapeBox(-1F, -1F, -18F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
			bodyModel[145].setRotationPoint(-39F, -17.5F, 17F);

			bodyModel[146].addShapeBox(-1F, -1F, -25F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
			bodyModel[146].setRotationPoint(-39F, -17.5F, 17F);

			bodyModel[147].addShapeBox(-1F, -1F, -32F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
			bodyModel[147].setRotationPoint(-39F, -17.5F, 17F);

			bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 300
			bodyModel[148].setRotationPoint(45F, -7.5F, 9.5F);
			bodyModel[148].glow = true;

			bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 301
			bodyModel[149].setRotationPoint(45F, -7.5F, -12.5F);
			bodyModel[149].glow = true;

			bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
			bodyModel[150].setRotationPoint(-41F, -18.5F, -22.5F);



			turretModel = new ModelRendererTurbo[7];
			turretModel[0] = new ModelRendererTurbo(this, 200, 255, textureX, textureY); // Box 97
			turretModel[1] = new ModelRendererTurbo(this, 200, 266, textureX, textureY); // Box 98
			turretModel[2] = new ModelRendererTurbo(this, 200, 278, textureX, textureY); // Box 99
			turretModel[3] = new ModelRendererTurbo(this, 200, 287, textureX, textureY); // Box 100
			turretModel[4] = new ModelRendererTurbo(this, 200, 299, textureX, textureY); // Box 101
			turretModel[5] = new ModelRendererTurbo(this, 200, 308, textureX, textureY); // Box 102
			turretModel[6] = new ModelRendererTurbo(this, 200, 308, textureX, textureY); // Box 103

			turretModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 97
			turretModel[0].setRotationPoint(1.5F, -28F, -15F);

			turretModel[1].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
			turretModel[1].setRotationPoint(-2.5F, -28F, -15F);

			turretModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 99
			turretModel[2].setRotationPoint(1.5F, -30F, -15F);

			turretModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
			turretModel[3].setRotationPoint(-2.5F, -30F, -15F);

			turretModel[4].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
			turretModel[4].setRotationPoint(0F, -30F, -16F);

			turretModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
			turretModel[5].setRotationPoint(-2F, -29F, -16F);

			turretModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
			turretModel[6].setRotationPoint(-2F, -27F, -16F);


			leftTrackWheelModels = new ModelRendererTurbo[21];
			leftTrackWheelModels[0] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 184
			leftTrackWheelModels[1] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 185
			leftTrackWheelModels[2] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 186
			leftTrackWheelModels[3] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 187
			leftTrackWheelModels[4] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 188
			leftTrackWheelModels[5] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 189
			leftTrackWheelModels[6] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 190
			leftTrackWheelModels[7] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 191
			leftTrackWheelModels[8] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 192
			leftTrackWheelModels[9] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 193
			leftTrackWheelModels[10] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 194
			leftTrackWheelModels[11] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 195
			leftTrackWheelModels[12] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 196
			leftTrackWheelModels[13] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 197
			leftTrackWheelModels[14] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 198
			leftTrackWheelModels[15] = new ModelRendererTurbo(this, 200, 337, textureX, textureY); // Box 199
			leftTrackWheelModels[16] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 200
			leftTrackWheelModels[17] = new ModelRendererTurbo(this, 200, 353, textureX, textureY); // Box 201
			leftTrackWheelModels[18] = new ModelRendererTurbo(this, 200, 353, textureX, textureY); // Box 202
			leftTrackWheelModels[19] = new ModelRendererTurbo(this, 200, 337, textureX, textureY); // Box 203
			leftTrackWheelModels[20] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 204

			leftTrackWheelModels[0].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
			leftTrackWheelModels[0].setRotationPoint(-26F, 3F, 20.5F);

			leftTrackWheelModels[1].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 185
			leftTrackWheelModels[1].setRotationPoint(-26F, 3F, 20.5F);

			leftTrackWheelModels[2].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 186
			leftTrackWheelModels[2].setRotationPoint(-26F, 3F, 20.5F);

			leftTrackWheelModels[3].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
			leftTrackWheelModels[3].setRotationPoint(-14F, 3F, 20.5F);

			leftTrackWheelModels[4].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 188
			leftTrackWheelModels[4].setRotationPoint(-14F, 3F, 20.5F);

			leftTrackWheelModels[5].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 189
			leftTrackWheelModels[5].setRotationPoint(-14F, 3F, 20.5F);

			leftTrackWheelModels[6].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
			leftTrackWheelModels[6].setRotationPoint(0F, 3F, 20.5F);

			leftTrackWheelModels[7].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 191
			leftTrackWheelModels[7].setRotationPoint(0F, 3F, 20.5F);

			leftTrackWheelModels[8].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 192
			leftTrackWheelModels[8].setRotationPoint(0F, 3F, 20.5F);

			leftTrackWheelModels[9].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
			leftTrackWheelModels[9].setRotationPoint(14.5F, 3F, 20.5F);

			leftTrackWheelModels[10].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 194
			leftTrackWheelModels[10].setRotationPoint(14.5F, 3F, 20.5F);

			leftTrackWheelModels[11].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 195
			leftTrackWheelModels[11].setRotationPoint(14.5F, 3F, 20.5F);

			leftTrackWheelModels[12].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
			leftTrackWheelModels[12].setRotationPoint(26.5F, 3F, 20.5F);

			leftTrackWheelModels[13].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 197
			leftTrackWheelModels[13].setRotationPoint(26.5F, 3F, 20.5F);

			leftTrackWheelModels[14].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 198
			leftTrackWheelModels[14].setRotationPoint(26.5F, 3F, 20.5F);

			leftTrackWheelModels[15].addShapeBox(-3.5F, -1.5F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
			leftTrackWheelModels[15].setRotationPoint(-40F, -2.5F, 20.5F);

			leftTrackWheelModels[16].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
			leftTrackWheelModels[16].setRotationPoint(-40F, -2.5F, 20.5F);

			leftTrackWheelModels[17].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 201
			leftTrackWheelModels[17].setRotationPoint(-40F, -2.5F, 20.5F);

			leftTrackWheelModels[18].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 202
			leftTrackWheelModels[18].setRotationPoint(39F, -2.5F, 20.5F);

			leftTrackWheelModels[19].addShapeBox(-3.5F, -1.5F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
			leftTrackWheelModels[19].setRotationPoint(39F, -2.5F, 20.5F);

			leftTrackWheelModels[20].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
			leftTrackWheelModels[20].setRotationPoint(39F, -2.5F, 20.5F);


			rightTrackWheelModels = new ModelRendererTurbo[21];
			rightTrackWheelModels[0] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 162
			rightTrackWheelModels[1] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 164
			rightTrackWheelModels[2] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 165
			rightTrackWheelModels[3] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 166
			rightTrackWheelModels[4] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 167
			rightTrackWheelModels[5] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 168
			rightTrackWheelModels[6] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 169
			rightTrackWheelModels[7] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 170
			rightTrackWheelModels[8] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 171
			rightTrackWheelModels[9] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 172
			rightTrackWheelModels[10] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 173
			rightTrackWheelModels[11] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 174
			rightTrackWheelModels[12] = new ModelRendererTurbo(this, 200, 311, textureX, textureY); // Box 175
			rightTrackWheelModels[13] = new ModelRendererTurbo(this, 200, 321, textureX, textureY); // Box 176
			rightTrackWheelModels[14] = new ModelRendererTurbo(this, 200, 329, textureX, textureY); // Box 177
			rightTrackWheelModels[15] = new ModelRendererTurbo(this, 200, 337, textureX, textureY); // Box 178
			rightTrackWheelModels[16] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 179
			rightTrackWheelModels[17] = new ModelRendererTurbo(this, 200, 353, textureX, textureY); // Box 180
			rightTrackWheelModels[18] = new ModelRendererTurbo(this, 200, 353, textureX, textureY); // Box 181
			rightTrackWheelModels[19] = new ModelRendererTurbo(this, 200, 337, textureX, textureY); // Box 182
			rightTrackWheelModels[20] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 183

			rightTrackWheelModels[0].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
			rightTrackWheelModels[0].setRotationPoint(-26F, 3F, -24.5F);

			rightTrackWheelModels[1].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 164
			rightTrackWheelModels[1].setRotationPoint(-26F, 3F, -24.5F);

			rightTrackWheelModels[2].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 165
			rightTrackWheelModels[2].setRotationPoint(-26F, 3F, -24.5F);

			rightTrackWheelModels[3].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
			rightTrackWheelModels[3].setRotationPoint(-14F, 3F, -24.5F);

			rightTrackWheelModels[4].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 167
			rightTrackWheelModels[4].setRotationPoint(-14F, 3F, -24.5F);

			rightTrackWheelModels[5].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 168
			rightTrackWheelModels[5].setRotationPoint(-14F, 3F, -24.5F);

			rightTrackWheelModels[6].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
			rightTrackWheelModels[6].setRotationPoint(0F, 3F, -24.5F);

			rightTrackWheelModels[7].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
			rightTrackWheelModels[7].setRotationPoint(0F, 3F, -24.5F);

			rightTrackWheelModels[8].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 171
			rightTrackWheelModels[8].setRotationPoint(0F, 3F, -24.5F);

			rightTrackWheelModels[9].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
			rightTrackWheelModels[9].setRotationPoint(14.5F, 3F, -24.5F);

			rightTrackWheelModels[10].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 173
			rightTrackWheelModels[10].setRotationPoint(14.5F, 3F, -24.5F);

			rightTrackWheelModels[11].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 174
			rightTrackWheelModels[11].setRotationPoint(14.5F, 3F, -24.5F);

			rightTrackWheelModels[12].addShapeBox(-5.5F, -2F, 0F, 11, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
			rightTrackWheelModels[12].setRotationPoint(26.5F, 3F, -24.5F);

			rightTrackWheelModels[13].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 4, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 176
			rightTrackWheelModels[13].setRotationPoint(26.5F, 3F, -24.5F);

			rightTrackWheelModels[14].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 4, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 177
			rightTrackWheelModels[14].setRotationPoint(26.5F, 3F, -24.5F);

			rightTrackWheelModels[15].addShapeBox(-3.5F, -1.5F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
			rightTrackWheelModels[15].setRotationPoint(-40F, -2.5F, -24.5F);

			rightTrackWheelModels[16].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
			rightTrackWheelModels[16].setRotationPoint(-40F, -2.5F, -24.5F);

			rightTrackWheelModels[17].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 180
			rightTrackWheelModels[17].setRotationPoint(-40F, -2.5F, -24.5F);

			rightTrackWheelModels[18].addShapeBox(-3.5F, 1.5F, 0F, 7, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 181
			rightTrackWheelModels[18].setRotationPoint(39F, -2.5F, -24.5F);

			rightTrackWheelModels[19].addShapeBox(-3.5F, -1.5F, 0F, 7, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
			rightTrackWheelModels[19].setRotationPoint(39F, -2.5F, -24.5F);

			rightTrackWheelModels[20].addShapeBox(-3.5F, -3.5F, 0F, 7, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
			rightTrackWheelModels[20].setRotationPoint(39F, -2.5F, -24.5F);


			leftAnimTrackModel = new ModelRendererTurbo[3][];
			rightAnimTrackModel = new ModelRendererTurbo[3][];

			leftAnimTrackModel[0] = new ModelRendererTurbo[14];
			leftAnimTrackModel[0][0] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Box 303
			leftAnimTrackModel[0][1] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 304
			leftAnimTrackModel[0][2] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 305
			leftAnimTrackModel[0][3] = new ModelRendererTurbo(this, 200, 432, textureX, textureY); // Box 306
			leftAnimTrackModel[0][4] = new ModelRendererTurbo(this, 200, 497, textureX, textureY); // Box 307
			leftAnimTrackModel[0][5] = new ModelRendererTurbo(this, 200, 512, textureX, textureY); // Box 308
			leftAnimTrackModel[0][6] = new ModelRendererTurbo(this, 200, 531, textureX, textureY); // Box 309
			leftAnimTrackModel[0][7] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Box 310
			leftAnimTrackModel[0][8] = new ModelRendererTurbo(this, 200, 554, textureX, textureY); // Box 311
			leftAnimTrackModel[0][9] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 312
			leftAnimTrackModel[0][10] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Box 313
			leftAnimTrackModel[0][11] = new ModelRendererTurbo(this, 200, 644, textureX, textureY); // Box 314
			leftAnimTrackModel[0][12] = new ModelRendererTurbo(this, 200, 661, textureX, textureY); // Box 315
			leftAnimTrackModel[0][13] = new ModelRendererTurbo(this, 200, 673, textureX, textureY); // Box 316

			leftAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
			leftAnimTrackModel[0][0].setRotationPoint(42.5F, -4F, 19.5F);

			leftAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
			leftAnimTrackModel[0][1].setRotationPoint(43.5F, -1F, 19.5F);
			leftAnimTrackModel[0][1].rotateAngleZ = -0.54105207F;

			leftAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 305
			leftAnimTrackModel[0][2].setRotationPoint(41.95F, 1.58F, 19.5F);
			leftAnimTrackModel[0][2].rotateAngleZ = -1.02101761F;

			leftAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
			leftAnimTrackModel[0][3].setRotationPoint(29F, 9.5F, 19.5F);
			leftAnimTrackModel[0][3].rotateAngleZ = -1.57079633F;

			leftAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
			leftAnimTrackModel[0][4].setRotationPoint(-29F, 9.5F, 19.5F);
			leftAnimTrackModel[0][4].rotateAngleZ = -1.95476876F;

			leftAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 308
			leftAnimTrackModel[0][5].setRotationPoint(-36.4F, 6.5F, 19.5F);
			leftAnimTrackModel[0][5].rotateAngleZ = -2.28638132F;

			leftAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
			leftAnimTrackModel[0][6].setRotationPoint(-44.5F, -0.5F, 19.5F);
			leftAnimTrackModel[0][6].rotateAngleZ = -3.14159265F;

			leftAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
			leftAnimTrackModel[0][7].setRotationPoint(-44.5F, -5.5F, 19.5F);
			leftAnimTrackModel[0][7].rotateAngleZ = -4.32841654F;

			leftAnimTrackModel[0][8].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
			leftAnimTrackModel[0][8].setRotationPoint(-41F, -7F, 19.5F);
			leftAnimTrackModel[0][8].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[0][9].addShapeBox(-1F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 312
			leftAnimTrackModel[0][9].setRotationPoint(-37F, -7F, 19.5F);
			leftAnimTrackModel[0][9].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[0][10].addShapeBox(-1F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
			leftAnimTrackModel[0][10].setRotationPoint(-25F, -5F, 19.5F);
			leftAnimTrackModel[0][10].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[0][11].addShapeBox(-1F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 314
			leftAnimTrackModel[0][11].setRotationPoint(28F, -5F, 19.5F);
			leftAnimTrackModel[0][11].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[0][12].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
			leftAnimTrackModel[0][12].setRotationPoint(37F, -7F, 19.5F);
			leftAnimTrackModel[0][12].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[0][13].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 316
			leftAnimTrackModel[0][13].setRotationPoint(41F, -7F, 19.5F);
			leftAnimTrackModel[0][13].rotateAngleZ = -5.58505361F;


			rightAnimTrackModel[0] = new ModelRendererTurbo[14];
			rightAnimTrackModel[0][0] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Box 205
			rightAnimTrackModel[0][1] = new ModelRendererTurbo(this, 200, 400, textureX, textureY); // Box 206
			rightAnimTrackModel[0][2] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Box 207
			rightAnimTrackModel[0][3] = new ModelRendererTurbo(this, 200, 432, textureX, textureY); // Box 208
			rightAnimTrackModel[0][4] = new ModelRendererTurbo(this, 200, 497, textureX, textureY); // Box 209
			rightAnimTrackModel[0][5] = new ModelRendererTurbo(this, 200, 512, textureX, textureY); // Box 210
			rightAnimTrackModel[0][6] = new ModelRendererTurbo(this, 200, 531, textureX, textureY); // Box 211
			rightAnimTrackModel[0][7] = new ModelRendererTurbo(this, 200, 543, textureX, textureY); // Box 212
			rightAnimTrackModel[0][8] = new ModelRendererTurbo(this, 200, 554, textureX, textureY); // Box 213
			rightAnimTrackModel[0][9] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 214
			rightAnimTrackModel[0][10] = new ModelRendererTurbo(this, 200, 584, textureX, textureY); // Box 215
			rightAnimTrackModel[0][11] = new ModelRendererTurbo(this, 200, 644, textureX, textureY); // Box 216
			rightAnimTrackModel[0][12] = new ModelRendererTurbo(this, 200, 661, textureX, textureY); // Box 217
			rightAnimTrackModel[0][13] = new ModelRendererTurbo(this, 200, 673, textureX, textureY); // Box 218

			rightAnimTrackModel[0][0].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
			rightAnimTrackModel[0][0].setRotationPoint(42.5F, -4F, -25.5F);

			rightAnimTrackModel[0][1].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
			rightAnimTrackModel[0][1].setRotationPoint(43.5F, -1F, -25.5F);
			rightAnimTrackModel[0][1].rotateAngleZ = -0.54105207F;

			rightAnimTrackModel[0][2].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 207
			rightAnimTrackModel[0][2].setRotationPoint(41.95F, 1.58F, -25.5F);
			rightAnimTrackModel[0][2].rotateAngleZ = -1.02101761F;

			rightAnimTrackModel[0][3].addShapeBox(-1F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
			rightAnimTrackModel[0][3].setRotationPoint(29F, 9.5F, -25.5F);
			rightAnimTrackModel[0][3].rotateAngleZ = -1.57079633F;

			rightAnimTrackModel[0][4].addShapeBox(-1F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
			rightAnimTrackModel[0][4].setRotationPoint(-29F, 9.5F, -25.5F);
			rightAnimTrackModel[0][4].rotateAngleZ = -1.95476876F;

			rightAnimTrackModel[0][5].addShapeBox(-1F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 210
			rightAnimTrackModel[0][5].setRotationPoint(-36.4F, 6.5F, -25.5F);
			rightAnimTrackModel[0][5].rotateAngleZ = -2.28638132F;

			rightAnimTrackModel[0][6].addShapeBox(-1F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
			rightAnimTrackModel[0][6].setRotationPoint(-44.5F, -0.5F, -25.5F);
			rightAnimTrackModel[0][6].rotateAngleZ = -3.14159265F;

			rightAnimTrackModel[0][7].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
			rightAnimTrackModel[0][7].setRotationPoint(-44.5F, -5.5F, -25.5F);
			rightAnimTrackModel[0][7].rotateAngleZ = -4.32841654F;

			rightAnimTrackModel[0][8].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
			rightAnimTrackModel[0][8].setRotationPoint(-41F, -7F, -25.5F);
			rightAnimTrackModel[0][8].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[0][9].addShapeBox(-1F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 214
			rightAnimTrackModel[0][9].setRotationPoint(-37F, -7F, -25.5F);
			rightAnimTrackModel[0][9].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[0][10].addShapeBox(-1F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
			rightAnimTrackModel[0][10].setRotationPoint(-25F, -5F, -25.5F);
			rightAnimTrackModel[0][10].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[0][11].addShapeBox(-1F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 216
			rightAnimTrackModel[0][11].setRotationPoint(28F, -5F, -25.5F);
			rightAnimTrackModel[0][11].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[0][12].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
			rightAnimTrackModel[0][12].setRotationPoint(37F, -7F, -25.5F);
			rightAnimTrackModel[0][12].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[0][13].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 218
			rightAnimTrackModel[0][13].setRotationPoint(41F, -7F, -25.5F);
			rightAnimTrackModel[0][13].rotateAngleZ = -5.58505361F;
			
			leftAnimTrackModel[1] = new ModelRendererTurbo[14];
			leftAnimTrackModel[1][0] = new ModelRendererTurbo(this, 300, 390, textureX, textureY); // Box 14
			leftAnimTrackModel[1][1] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Box 15
			leftAnimTrackModel[1][2] = new ModelRendererTurbo(this, 300, 410, textureX, textureY); // Box 16
			leftAnimTrackModel[1][3] = new ModelRendererTurbo(this, 300, 432, textureX, textureY); // Box 17
			leftAnimTrackModel[1][4] = new ModelRendererTurbo(this, 300, 497, textureX, textureY); // Box 18
			leftAnimTrackModel[1][5] = new ModelRendererTurbo(this, 300, 512, textureX, textureY); // Box 19
			leftAnimTrackModel[1][6] = new ModelRendererTurbo(this, 300, 531, textureX, textureY); // Box 20
			leftAnimTrackModel[1][7] = new ModelRendererTurbo(this, 300, 543, textureX, textureY); // Box 21
			leftAnimTrackModel[1][8] = new ModelRendererTurbo(this, 300, 554, textureX, textureY); // Box 22
			leftAnimTrackModel[1][9] = new ModelRendererTurbo(this, 300, 565, textureX, textureY); // Box 23
			leftAnimTrackModel[1][10] = new ModelRendererTurbo(this, 300, 584, textureX, textureY); // Box 24
			leftAnimTrackModel[1][11] = new ModelRendererTurbo(this, 300, 644, textureX, textureY); // Box 25
			leftAnimTrackModel[1][12] = new ModelRendererTurbo(this, 300, 661, textureX, textureY); // Box 26
			leftAnimTrackModel[1][13] = new ModelRendererTurbo(this, 300, 673, textureX, textureY); // Box 27

			leftAnimTrackModel[1][0].addShapeBox(10F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
			leftAnimTrackModel[1][0].setRotationPoint(42.5F, -4F, 19.5F);

			leftAnimTrackModel[1][1].addShapeBox(-10F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
			leftAnimTrackModel[1][1].setRotationPoint(43.5F, -1F, 19.5F);
			leftAnimTrackModel[1][1].rotateAngleZ = -0.54105207F;

			leftAnimTrackModel[1][2].addShapeBox(-10F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 16
			leftAnimTrackModel[1][2].setRotationPoint(41.95F, 1.58F, 19.5F);
			leftAnimTrackModel[1][2].rotateAngleZ = -1.02101761F;

			leftAnimTrackModel[1][3].addShapeBox(-10F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
			leftAnimTrackModel[1][3].setRotationPoint(29F, 9.5F, 19.5F);
			leftAnimTrackModel[1][3].rotateAngleZ = -1.57079633F;

			leftAnimTrackModel[1][4].addShapeBox(-10F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
			leftAnimTrackModel[1][4].setRotationPoint(-29F, 9.5F, 19.5F);
			leftAnimTrackModel[1][4].rotateAngleZ = -1.95476876F;

			leftAnimTrackModel[1][5].addShapeBox(-10F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 19
			leftAnimTrackModel[1][5].setRotationPoint(-36.4F, 6.5F, 19.5F);
			leftAnimTrackModel[1][5].rotateAngleZ = -2.28638132F;

			leftAnimTrackModel[1][6].addShapeBox(-10F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
			leftAnimTrackModel[1][6].setRotationPoint(-44.5F, -0.5F, 19.5F);
			leftAnimTrackModel[1][6].rotateAngleZ = -3.14159265F;

			leftAnimTrackModel[1][7].addShapeBox(-10F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
			leftAnimTrackModel[1][7].setRotationPoint(-44.5F, -5.5F, 19.5F);
			leftAnimTrackModel[1][7].rotateAngleZ = -4.32841654F;

			leftAnimTrackModel[1][8].addShapeBox(-10F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
			leftAnimTrackModel[1][8].setRotationPoint(-41F, -7F, 19.5F);
			leftAnimTrackModel[1][8].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[1][9].addShapeBox(-10F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 23
			leftAnimTrackModel[1][9].setRotationPoint(-37F, -7F, 19.5F);
			leftAnimTrackModel[1][9].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[1][10].addShapeBox(-10F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
			leftAnimTrackModel[1][10].setRotationPoint(-25F, -5F, 19.5F);
			leftAnimTrackModel[1][10].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[1][11].addShapeBox(-10F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 25
			leftAnimTrackModel[1][11].setRotationPoint(28F, -5F, 19.5F);
			leftAnimTrackModel[1][11].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[1][12].addShapeBox(-10F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
			leftAnimTrackModel[1][12].setRotationPoint(37F, -7F, 19.5F);
			leftAnimTrackModel[1][12].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[1][13].addShapeBox(-10F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 27
			leftAnimTrackModel[1][13].setRotationPoint(41F, -7F, 19.5F);
			leftAnimTrackModel[1][13].rotateAngleZ = -5.58505361F;


			rightAnimTrackModel[1] = new ModelRendererTurbo[14];
			rightAnimTrackModel[1][0] = new ModelRendererTurbo(this, 300, 390, textureX, textureY); // Box 205
			rightAnimTrackModel[1][1] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Box 206
			rightAnimTrackModel[1][2] = new ModelRendererTurbo(this, 300, 410, textureX, textureY); // Box 207
			rightAnimTrackModel[1][3] = new ModelRendererTurbo(this, 300, 432, textureX, textureY); // Box 208
			rightAnimTrackModel[1][4] = new ModelRendererTurbo(this, 300, 497, textureX, textureY); // Box 209
			rightAnimTrackModel[1][5] = new ModelRendererTurbo(this, 300, 512, textureX, textureY); // Box 210
			rightAnimTrackModel[1][6] = new ModelRendererTurbo(this, 300, 531, textureX, textureY); // Box 211
			rightAnimTrackModel[1][7] = new ModelRendererTurbo(this, 300, 543, textureX, textureY); // Box 212
			rightAnimTrackModel[1][8] = new ModelRendererTurbo(this, 300, 554, textureX, textureY); // Box 213
			rightAnimTrackModel[1][9] = new ModelRendererTurbo(this, 300, 565, textureX, textureY); // Box 214
			rightAnimTrackModel[1][10] = new ModelRendererTurbo(this, 300, 584, textureX, textureY); // Box 215
			rightAnimTrackModel[1][11] = new ModelRendererTurbo(this, 300, 644, textureX, textureY); // Box 216
			rightAnimTrackModel[1][12] = new ModelRendererTurbo(this, 300, 661, textureX, textureY); // Box 217
			rightAnimTrackModel[1][13] = new ModelRendererTurbo(this, 300, 673, textureX, textureY); // Box 218

			rightAnimTrackModel[1][0].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
			rightAnimTrackModel[1][0].setRotationPoint(42.5F, -4F, -25.5F);

			rightAnimTrackModel[1][1].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
			rightAnimTrackModel[1][1].setRotationPoint(43.5F, -1F, -25.5F);
			rightAnimTrackModel[1][1].rotateAngleZ = -0.54105207F;

			rightAnimTrackModel[1][2].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 207
			rightAnimTrackModel[1][2].setRotationPoint(41.95F, 1.58F, -25.5F);
			rightAnimTrackModel[1][2].rotateAngleZ = -1.02101761F;

			rightAnimTrackModel[1][3].addShapeBox(-1F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
			rightAnimTrackModel[1][3].setRotationPoint(29F, 9.5F, -25.5F);
			rightAnimTrackModel[1][3].rotateAngleZ = -1.57079633F;

			rightAnimTrackModel[1][4].addShapeBox(-1F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
			rightAnimTrackModel[1][4].setRotationPoint(-29F, 9.5F, -25.5F);
			rightAnimTrackModel[1][4].rotateAngleZ = -1.95476876F;

			rightAnimTrackModel[1][5].addShapeBox(-1F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 210
			rightAnimTrackModel[1][5].setRotationPoint(-36.4F, 6.5F, -25.5F);
			rightAnimTrackModel[1][5].rotateAngleZ = -2.28638132F;

			rightAnimTrackModel[1][6].addShapeBox(-1F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
			rightAnimTrackModel[1][6].setRotationPoint(-44.5F, -0.5F, -25.5F);
			rightAnimTrackModel[1][6].rotateAngleZ = -3.14159265F;

			rightAnimTrackModel[1][7].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
			rightAnimTrackModel[1][7].setRotationPoint(-44.5F, -5.5F, -25.5F);
			rightAnimTrackModel[1][7].rotateAngleZ = -4.32841654F;

			rightAnimTrackModel[1][8].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
			rightAnimTrackModel[1][8].setRotationPoint(-41F, -7F, -25.5F);
			rightAnimTrackModel[1][8].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[1][9].addShapeBox(-1F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 214
			rightAnimTrackModel[1][9].setRotationPoint(-37F, -7F, -25.5F);
			rightAnimTrackModel[1][9].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[1][10].addShapeBox(-1F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
			rightAnimTrackModel[1][10].setRotationPoint(-25F, -5F, -25.5F);
			rightAnimTrackModel[1][10].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[1][11].addShapeBox(-1F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 216
			rightAnimTrackModel[1][11].setRotationPoint(28F, -5F, -25.5F);
			rightAnimTrackModel[1][11].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[1][12].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
			rightAnimTrackModel[1][12].setRotationPoint(37F, -7F, -25.5F);
			rightAnimTrackModel[1][12].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[1][13].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 218
			rightAnimTrackModel[1][13].setRotationPoint(41F, -7F, -25.5F);
			rightAnimTrackModel[1][13].rotateAngleZ = -5.58505361F;
			
			leftAnimTrackModel[2] = new ModelRendererTurbo[14];
			leftAnimTrackModel[2][0] = new ModelRendererTurbo(this, 400, 390, textureX, textureY); // Box 14
			leftAnimTrackModel[2][1] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 15
			leftAnimTrackModel[2][2] = new ModelRendererTurbo(this, 400, 410, textureX, textureY); // Box 16
			leftAnimTrackModel[2][3] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Box 17
			leftAnimTrackModel[2][4] = new ModelRendererTurbo(this, 400, 497, textureX, textureY); // Box 18
			leftAnimTrackModel[2][5] = new ModelRendererTurbo(this, 400, 512, textureX, textureY); // Box 19
			leftAnimTrackModel[2][6] = new ModelRendererTurbo(this, 400, 531, textureX, textureY); // Box 20
			leftAnimTrackModel[2][7] = new ModelRendererTurbo(this, 400, 543, textureX, textureY); // Box 21
			leftAnimTrackModel[2][8] = new ModelRendererTurbo(this, 400, 554, textureX, textureY); // Box 22
			leftAnimTrackModel[2][9] = new ModelRendererTurbo(this, 400, 565, textureX, textureY); // Box 23
			leftAnimTrackModel[2][10] = new ModelRendererTurbo(this, 400, 584, textureX, textureY); // Box 24
			leftAnimTrackModel[2][11] = new ModelRendererTurbo(this, 400, 644, textureX, textureY); // Box 25
			leftAnimTrackModel[2][12] = new ModelRendererTurbo(this, 400, 661, textureX, textureY); // Box 26
			leftAnimTrackModel[2][13] = new ModelRendererTurbo(this, 400, 673, textureX, textureY); // Box 27

			leftAnimTrackModel[2][0].addShapeBox(5F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
			leftAnimTrackModel[2][0].setRotationPoint(42.5F, -4F, 19.5F);

			leftAnimTrackModel[2][1].addShapeBox(-15F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
			leftAnimTrackModel[2][1].setRotationPoint(43.5F, -1F, 19.5F);
			leftAnimTrackModel[2][1].rotateAngleZ = -0.54105207F;

			leftAnimTrackModel[2][2].addShapeBox(-15F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 16
			leftAnimTrackModel[2][2].setRotationPoint(41.95F, 1.58F, 19.5F);
			leftAnimTrackModel[2][2].rotateAngleZ = -1.02101761F;

			leftAnimTrackModel[2][3].addShapeBox(-15F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
			leftAnimTrackModel[2][3].setRotationPoint(29F, 9.5F, 19.5F);
			leftAnimTrackModel[2][3].rotateAngleZ = -1.57079633F;

			leftAnimTrackModel[2][4].addShapeBox(-15F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
			leftAnimTrackModel[2][4].setRotationPoint(-29F, 9.5F, 19.5F);
			leftAnimTrackModel[2][4].rotateAngleZ = -1.95476876F;

			leftAnimTrackModel[2][5].addShapeBox(-15F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 19
			leftAnimTrackModel[2][5].setRotationPoint(-36.4F, 6.5F, 19.5F);
			leftAnimTrackModel[2][5].rotateAngleZ = -2.28638132F;

			leftAnimTrackModel[2][6].addShapeBox(-15F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
			leftAnimTrackModel[2][6].setRotationPoint(-44.5F, -0.5F, 19.5F);
			leftAnimTrackModel[2][6].rotateAngleZ = -3.14159265F;

			leftAnimTrackModel[2][7].addShapeBox(-15F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
			leftAnimTrackModel[2][7].setRotationPoint(-44.5F, -5.5F, 19.5F);
			leftAnimTrackModel[2][7].rotateAngleZ = -4.32841654F;

			leftAnimTrackModel[2][8].addShapeBox(-15F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
			leftAnimTrackModel[2][8].setRotationPoint(-41F, -7F, 19.5F);
			leftAnimTrackModel[2][8].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[2][9].addShapeBox(-15F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 23
			leftAnimTrackModel[2][9].setRotationPoint(-37F, -7F, 19.5F);
			leftAnimTrackModel[2][9].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[2][10].addShapeBox(-15F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
			leftAnimTrackModel[2][10].setRotationPoint(-25F, -5F, 19.5F);
			leftAnimTrackModel[2][10].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[2][11].addShapeBox(-15F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 25
			leftAnimTrackModel[2][11].setRotationPoint(28F, -5F, 19.5F);
			leftAnimTrackModel[2][11].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[2][12].addShapeBox(-15F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
			leftAnimTrackModel[2][12].setRotationPoint(37F, -7F, 19.5F);
			leftAnimTrackModel[2][12].rotateAngleZ = -4.71238898F;

			leftAnimTrackModel[2][13].addShapeBox(-15F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 27
			leftAnimTrackModel[2][13].setRotationPoint(41F, -7F, 19.5F);
			leftAnimTrackModel[2][13].rotateAngleZ = -5.58505361F;


			rightAnimTrackModel[2] = new ModelRendererTurbo[14];
			rightAnimTrackModel[2][0] = new ModelRendererTurbo(this, 400, 390, textureX, textureY); // Box 205
			rightAnimTrackModel[2][1] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Box 206
			rightAnimTrackModel[2][2] = new ModelRendererTurbo(this, 400, 410, textureX, textureY); // Box 207
			rightAnimTrackModel[2][3] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Box 208
			rightAnimTrackModel[2][4] = new ModelRendererTurbo(this, 400, 497, textureX, textureY); // Box 209
			rightAnimTrackModel[2][5] = new ModelRendererTurbo(this, 400, 512, textureX, textureY); // Box 210
			rightAnimTrackModel[2][6] = new ModelRendererTurbo(this, 400, 531, textureX, textureY); // Box 211
			rightAnimTrackModel[2][7] = new ModelRendererTurbo(this, 400, 543, textureX, textureY); // Box 212
			rightAnimTrackModel[2][8] = new ModelRendererTurbo(this, 400, 554, textureX, textureY); // Box 213
			rightAnimTrackModel[2][9] = new ModelRendererTurbo(this, 400, 565, textureX, textureY); // Box 214
			rightAnimTrackModel[2][10] = new ModelRendererTurbo(this, 400, 584, textureX, textureY); // Box 215
			rightAnimTrackModel[2][11] = new ModelRendererTurbo(this, 400, 644, textureX, textureY); // Box 216
			rightAnimTrackModel[2][12] = new ModelRendererTurbo(this, 400, 661, textureX, textureY); // Box 217
			rightAnimTrackModel[2][13] = new ModelRendererTurbo(this, 400, 673, textureX, textureY); // Box 218

			rightAnimTrackModel[2][0].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
			rightAnimTrackModel[2][0].setRotationPoint(42.5F, -4F, -25.5F);

			rightAnimTrackModel[2][1].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
			rightAnimTrackModel[2][1].setRotationPoint(43.5F, -1F, -25.5F);
			rightAnimTrackModel[2][1].rotateAngleZ = -0.54105207F;

			rightAnimTrackModel[2][2].addShapeBox(-1F, 0F, 0F, 1, 15, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 0.18F, 0F, -0.01F, 0.18F, 0F, 0F, 0F, 0F); // Box 207
			rightAnimTrackModel[2][2].setRotationPoint(41.95F, 1.58F, -25.5F);
			rightAnimTrackModel[2][2].rotateAngleZ = -1.02101761F;

			rightAnimTrackModel[2][3].addShapeBox(-1F, 0F, 0F, 1, 58, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
			rightAnimTrackModel[2][3].setRotationPoint(29F, 9.5F, -25.5F);
			rightAnimTrackModel[2][3].rotateAngleZ = -1.57079633F;

			rightAnimTrackModel[2][4].addShapeBox(-1F, 0F, 0F, 1, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
			rightAnimTrackModel[2][4].setRotationPoint(-29F, 9.5F, -25.5F);
			rightAnimTrackModel[2][4].rotateAngleZ = -1.95476876F;

			rightAnimTrackModel[2][5].addShapeBox(-1F, 0F, 0F, 1, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 210
			rightAnimTrackModel[2][5].setRotationPoint(-36.4F, 6.5F, -25.5F);
			rightAnimTrackModel[2][5].rotateAngleZ = -2.28638132F;

			rightAnimTrackModel[2][6].addShapeBox(-1F, 0F, 0F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
			rightAnimTrackModel[2][6].setRotationPoint(-44.5F, -0.5F, -25.5F);
			rightAnimTrackModel[2][6].rotateAngleZ = -3.14159265F;

			rightAnimTrackModel[2][7].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
			rightAnimTrackModel[2][7].setRotationPoint(-44.5F, -5.5F, -25.5F);
			rightAnimTrackModel[2][7].rotateAngleZ = -4.32841654F;

			rightAnimTrackModel[2][8].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
			rightAnimTrackModel[2][8].setRotationPoint(-41F, -7F, -25.5F);
			rightAnimTrackModel[2][8].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[2][9].addShapeBox(-1F, 0F, 0F, 1, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 214
			rightAnimTrackModel[2][9].setRotationPoint(-37F, -7F, -25.5F);
			rightAnimTrackModel[2][9].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[2][10].addShapeBox(-1F, 0F, 0F, 1, 53, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
			rightAnimTrackModel[2][10].setRotationPoint(-25F, -5F, -25.5F);
			rightAnimTrackModel[2][10].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[2][11].addShapeBox(-1F, 0F, 0F, 1, 9, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 216
			rightAnimTrackModel[2][11].setRotationPoint(28F, -5F, -25.5F);
			rightAnimTrackModel[2][11].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[2][12].addShapeBox(-1F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
			rightAnimTrackModel[2][12].setRotationPoint(37F, -7F, -25.5F);
			rightAnimTrackModel[2][12].rotateAngleZ = -4.71238898F;

			rightAnimTrackModel[2][13].addShapeBox(-1F, 0F, 0F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 1F, 0F); // Box 218
			rightAnimTrackModel[2][13].setRotationPoint(41F, -7F, -25.5F);
			rightAnimTrackModel[2][13].rotateAngleZ = -5.58505361F;
			
			
			/**
			fancyTrackModel = new ModelRendererTurbo[3];
			fancyTrackModel[0] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 0
			fancyTrackModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
			fancyTrackModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 2

			fancyTrackModel[0].addShapeBox(-1.5F, -1F, -3F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

			fancyTrackModel[1].addShapeBox(-0.5F, -1F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1

			fancyTrackModel[2].addShapeBox(-1.5F, -1F, 2F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
			 */


			doorAnimModel = new ModelRendererTurbo[53];
			doorAnimModel[0] = new ModelRendererTurbo(this, 200, 132, textureX, textureY); // Box 233
			doorAnimModel[1] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 234
			doorAnimModel[2] = new ModelRendererTurbo(this, 200, 132, textureX, textureY); // Box 235
			doorAnimModel[3] = new ModelRendererTurbo(this, 200, 178, textureX, textureY); // Box 236
			doorAnimModel[4] = new ModelRendererTurbo(this, 200, 214, textureX, textureY); // Box 237
			doorAnimModel[5] = new ModelRendererTurbo(this, 200, 214, textureX, textureY); // Box 238
			doorAnimModel[6] = new ModelRendererTurbo(this, 200, 214, textureX, textureY); // Box 239
			doorAnimModel[7] = new ModelRendererTurbo(this, 200, 214, textureX, textureY); // Box 240
			doorAnimModel[8] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 241
			doorAnimModel[9] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 242
			doorAnimModel[10] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 243
			doorAnimModel[11] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 244
			doorAnimModel[12] = new ModelRendererTurbo(this, 200, 221, textureX, textureY); // Box 245
			doorAnimModel[13] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 247
			doorAnimModel[14] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 248
			doorAnimModel[15] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 249
			doorAnimModel[16] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 250
			doorAnimModel[17] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 251
			doorAnimModel[18] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 255
			doorAnimModel[19] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 256
			doorAnimModel[20] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 257
			doorAnimModel[21] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 258
			doorAnimModel[22] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 259
			doorAnimModel[23] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 260
			doorAnimModel[24] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 261
			doorAnimModel[25] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 262
			doorAnimModel[26] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 263
			doorAnimModel[27] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 264
			doorAnimModel[28] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 265
			doorAnimModel[29] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 266
			doorAnimModel[30] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 267
			doorAnimModel[31] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 268
			doorAnimModel[32] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 269
			doorAnimModel[33] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 270
			doorAnimModel[34] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 271
			doorAnimModel[35] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 272
			doorAnimModel[36] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 273
			doorAnimModel[37] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 274
			doorAnimModel[38] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 275
			doorAnimModel[39] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 276
			doorAnimModel[40] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 277
			doorAnimModel[41] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 278
			doorAnimModel[42] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 279
			doorAnimModel[43] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 280
			doorAnimModel[44] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 281
			doorAnimModel[45] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 282
			doorAnimModel[46] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 283
			doorAnimModel[47] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 284
			doorAnimModel[48] = new ModelRendererTurbo(this, 200, 238, textureX, textureY); // Box 285
			doorAnimModel[49] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 286
			doorAnimModel[50] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 287
			doorAnimModel[51] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 288
			doorAnimModel[52] = new ModelRendererTurbo(this, 200, 233, textureX, textureY); // Box 289

			doorAnimModel[0].addShapeBox(0F, -5.5F, 0F, 24, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233

			doorAnimModel[1].addShapeBox(0F, -6.5F, -35F, 24, 1, 36, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234

			doorAnimModel[2].addShapeBox(0F, -5.5F, -35F, 24, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235

			doorAnimModel[3].addShapeBox(0F, -1F, -34F, 22, 1, 34, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236

			doorAnimModel[4].addShapeBox(0F, -5.5F, -28F, 22, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237

			doorAnimModel[5].addShapeBox(0F, -5.5F, -21F, 22, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238

			doorAnimModel[6].addShapeBox(0F, -5.5F, -14F, 22, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239

			doorAnimModel[7].addShapeBox(0F, -5.5F, -7F, 22, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240

			doorAnimModel[8].addShapeBox(1F, -5.5F, -34F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241

			doorAnimModel[9].addShapeBox(1F, -5.5F, -27F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242

			doorAnimModel[10].addShapeBox(1F, -5.5F, -20F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243

			doorAnimModel[11].addShapeBox(1F, -5.5F, -13F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244

			doorAnimModel[12].addShapeBox(1F, -5.5F, -6F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245

			doorAnimModel[13].addShapeBox(2F, -5F, -5F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247

			doorAnimModel[14].addShapeBox(2F, -5F, -3F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248

			doorAnimModel[15].addShapeBox(2F, -3F, -3F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 249

			doorAnimModel[16].addShapeBox(2F, -3F, -5F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250

			doorAnimModel[17].addShapeBox(16F, -5F, -5F, 5, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 251

			doorAnimModel[18].addShapeBox(16F, -5F, -3F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 255

			doorAnimModel[19].addShapeBox(16F, -3F, -3F, 5, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 256

			doorAnimModel[20].addShapeBox(16F, -3F, -5F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 257

			doorAnimModel[21].addShapeBox(16F, -3F, -10F, 5, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 258

			doorAnimModel[22].addShapeBox(16F, -3F, -12F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 259

			doorAnimModel[23].addShapeBox(16F, -5F, -10F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 260

			doorAnimModel[24].addShapeBox(16F, -5F, -12F, 5, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 261

			doorAnimModel[25].addShapeBox(2F, -5F, -10F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262

			doorAnimModel[26].addShapeBox(2F, -5F, -12F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263

			doorAnimModel[27].addShapeBox(2F, -3F, -12F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264

			doorAnimModel[28].addShapeBox(2F, -3F, -10F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 265

			doorAnimModel[29].addShapeBox(16F, -3F, -17F, 5, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 266

			doorAnimModel[30].addShapeBox(16F, -3F, -19F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 267

			doorAnimModel[31].addShapeBox(16F, -5F, -17F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 268

			doorAnimModel[32].addShapeBox(16F, -5F, -19F, 5, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 269

			doorAnimModel[33].addShapeBox(2F, -5F, -17F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270

			doorAnimModel[34].addShapeBox(2F, -5F, -19F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271

			doorAnimModel[35].addShapeBox(2F, -3F, -19F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272

			doorAnimModel[36].addShapeBox(2F, -3F, -17F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 273

			doorAnimModel[37].addShapeBox(16F, -3F, -24F, 5, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 274

			doorAnimModel[38].addShapeBox(16F, -3F, -26F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 275

			doorAnimModel[39].addShapeBox(16F, -5F, -24F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 276

			doorAnimModel[40].addShapeBox(16F, -5F, -26F, 5, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 277

			doorAnimModel[41].addShapeBox(2F, -5F, -24F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278

			doorAnimModel[42].addShapeBox(2F, -5F, -26F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279

			doorAnimModel[43].addShapeBox(2F, -3F, -26F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280

			doorAnimModel[44].addShapeBox(2F, -3F, -24F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 281

			doorAnimModel[45].addShapeBox(16F, -3F, -31F, 5, 2, 2, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F); // Box 282

			doorAnimModel[46].addShapeBox(16F, -3F, -33F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 283

			doorAnimModel[47].addShapeBox(16F, -5F, -31F, 5, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.625F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 284

			doorAnimModel[48].addShapeBox(16F, -5F, -33F, 5, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.625F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 285

			doorAnimModel[49].addShapeBox(2F, -5F, -31F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286

			doorAnimModel[50].addShapeBox(2F, -5F, -33F, 14, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287

			doorAnimModel[51].addShapeBox(2F, -3F, -33F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288

			doorAnimModel[52].addShapeBox(2F, -3F, -31F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 289

			
			
			door2AnimModel = new ModelRendererTurbo[5];
			door2AnimModel[0] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 290
			door2AnimModel[1] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 291
			door2AnimModel[2] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 292
			door2AnimModel[3] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 293
			door2AnimModel[4] = new ModelRendererTurbo(this, 200, 244, textureX, textureY); // Box 294

			door2AnimModel[0].addShapeBox(0F, -5.5F, -5F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290

			door2AnimModel[1].addShapeBox(0F, -5.5F, -12F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291

			door2AnimModel[2].addShapeBox(0F, -5.5F, -19F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292

			door2AnimModel[3].addShapeBox(0F, -5.5F, -26F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293

			door2AnimModel[4].addShapeBox(0F, -5.5F, -33F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294		
			doorAttach = new Vector3f(-39F/16F, 17.5F/16F, 17F/16F);
			door2Attach = new Vector3f(-39F/16F, 17.5F/16F, 17F/16F);

			translateAll(0F, 0F, 0F);


			flipAll();
		}
	}