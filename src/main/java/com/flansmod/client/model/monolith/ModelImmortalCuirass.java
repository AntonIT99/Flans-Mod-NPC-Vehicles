//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ImmortalCuirass
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelImmortalCuirass extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelImmortalCuirass() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[141];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 55
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 58
		bodyModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 59
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		bodyModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 72
		bodyModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 74
		bodyModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		bodyModel[16] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 77
		bodyModel[17] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 78
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 81
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 89
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 90
		bodyModel[26] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 91
		bodyModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 92
		bodyModel[28] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[29] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 96
		bodyModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 101
		bodyModel[32] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 102
		bodyModel[33] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 104
		bodyModel[35] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 105
		bodyModel[36] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 106
		bodyModel[37] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 107
		bodyModel[38] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 108
		bodyModel[39] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 109
		bodyModel[40] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 110
		bodyModel[41] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 111
		bodyModel[42] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 112
		bodyModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 114
		bodyModel[45] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 115
		bodyModel[46] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
		bodyModel[47] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 117
		bodyModel[48] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 118
		bodyModel[49] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 119
		bodyModel[50] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 120
		bodyModel[51] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 121
		bodyModel[52] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 124
		bodyModel[55] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 125
		bodyModel[56] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 126
		bodyModel[57] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 127
		bodyModel[58] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 129
		bodyModel[60] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 130
		bodyModel[61] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 81
		bodyModel[63] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 82
		bodyModel[64] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 83
		bodyModel[65] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 84
		bodyModel[66] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 85
		bodyModel[67] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 86
		bodyModel[68] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 87
		bodyModel[69] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 88
		bodyModel[70] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 89
		bodyModel[71] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 91
		bodyModel[73] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 92
		bodyModel[74] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 93
		bodyModel[75] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 108
		bodyModel[77] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 109
		bodyModel[78] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 110
		bodyModel[79] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 111
		bodyModel[80] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 112
		bodyModel[81] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 113
		bodyModel[82] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 114
		bodyModel[83] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		bodyModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[85] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 103
		bodyModel[89] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 104
		bodyModel[90] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 105
		bodyModel[91] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 107
		bodyModel[93] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 108
		bodyModel[94] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 109
		bodyModel[95] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 110
		bodyModel[96] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 111
		bodyModel[97] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 112
		bodyModel[98] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 113
		bodyModel[99] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 109, 15, textureX, textureY); // Box 115
		bodyModel[101] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 116
		bodyModel[102] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 117
		bodyModel[103] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 122
		bodyModel[104] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 123
		bodyModel[105] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 124
		bodyModel[106] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 125
		bodyModel[107] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 126
		bodyModel[108] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 127
		bodyModel[109] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 128
		bodyModel[110] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 129
		bodyModel[111] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 130
		bodyModel[112] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 131
		bodyModel[113] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 132
		bodyModel[114] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 133
		bodyModel[115] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 134
		bodyModel[116] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 135
		bodyModel[117] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 136
		bodyModel[118] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 137
		bodyModel[119] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 138
		bodyModel[120] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 139
		bodyModel[121] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 140
		bodyModel[122] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 141
		bodyModel[123] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 142
		bodyModel[124] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 143
		bodyModel[125] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 144
		bodyModel[126] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 145
		bodyModel[127] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 146
		bodyModel[128] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 147
		bodyModel[129] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 148
		bodyModel[130] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 149
		bodyModel[131] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 150
		bodyModel[132] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 151
		bodyModel[133] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 152
		bodyModel[134] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 153
		bodyModel[135] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 154
		bodyModel[136] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 155
		bodyModel[137] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 156
		bodyModel[138] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 157
		bodyModel[139] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 158
		bodyModel[140] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 159

		bodyModel[0].addShapeBox(0F, 4F, -4F, 4, 2, 4, 0F,-0.1F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 6F, -4F, 4, 2, 4, 0F,-0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -4F, 4, 1, 4, 0F,-0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0.8F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 1F, -4F, 1, 4, 4, 0F,1F, 1.5F, -1F, 0.5F, 1F, -1.5F, 0.4F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 2.9F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, -1F, -2F, 3F, -1F, -2F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0.5F, -3F, 2, 1, 3, 0F,0.5F, 0.5F, -0.5F, 0F, 1F, 0F, -0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.2F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F); // Box 54
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, 0.7F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F); // Box 55
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1F, 1F, 3, 3, 2, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1F, 0.5F, 0.5F, 1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1.2F, 0F, 0F, 0.7F); // Box 56
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 0.5F, 1F, 2, 1, 2, 0F,0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 57
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 6F, 1F, 4, 3, 2, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.6F, 0.5F, -0.5F); // Box 58
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 10F, -4F, 4, 1, 4, 0F,0F, 0.2F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.8F, -0.3F, -0.8F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 59
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10F, 1F, 4, 1, 3, 0F,0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0.6F, 0.5F, -1.5F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.8F, -0.2F, -1F); // Box 60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 4F, -4F, 1, 2, 1, 0F,-0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 71
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 6F, -4F, 1, 2, 4, 0F,-0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 72
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 8F, -4F, 1, 1, 4, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.8F, -1.5F, -0.4F, 0.5F, -1.5F, -0.4F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F); // Box 73
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, 0F, -0.8F, -1F, 0.4F, -0.5F, -1F, 0.2F, -1.3F, 1F, -0.7F, -1F, 1F, 0F, 0F, -1F, 0.5F, -0.3F, -1F); // Box 74
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 1.5F, -5.2F, 2, 3, 1, 0F,-0.5F, 0.2F, -1.3F, 0.05F, 0.7F, -1.65F, 0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 1.2F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 77
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(4.1F, 6.3F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 78
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 1F, -4F, 1, 4, 4, 0F,0.5F, 1F, -1.5F, 1F, 1.5F, -1F, 0.5F, 0.5F, -1.5F, 0.4F, 0F, -1.5F, 0F, -0.5F, 0.2F, 2.9F, -0.5F, 1.2F, 3F, -1F, -2F, 0F, -1F, -2F); // Box 81
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 4F, -4F, 4, 2, 4, 0F,0F, -0.5F, 0.2F, -0.1F, -0.5F, 1.2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 82
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 6F, -4F, 4, 2, 4, 0F,1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Box 83
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 8F, -4F, 4, 1, 4, 0F,0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.6F, 0.5F, -2F, -0.1F, 0.8F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F); // Box 84
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 10F, -4F, 4, 1, 4, 0F,0.6F, 0.5F, -2F, 0F, 0.2F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.8F, -0.3F, -0.8F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F); // Box 85
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 6F, 1F, 4, 3, 2, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 88
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F); // Box 89
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1F, 1F, 1F, 3, 3, 2, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 1F, 0F, 1.2F); // Box 90
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 0.5F, 1F, 2, 1, 2, 0F,-0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 91
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 10F, 1F, 4, 1, 3, 0F,0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F, 0.8F, -0.2F, -1F, 0F, 0F, 0F); // Box 92
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2F, 0.5F, -3F, 2, 1, 3, 0F,0F, 1F, 0F, 0.5F, 0.5F, -0.5F, 0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, -0.5F, 0F, 0.2F, 0F, -1.5F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F); // Box 93
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.5F, 1.5F, -5.2F, 2, 3, 1, 0F,0.05F, 0.7F, -1.65F, -0.5F, 0.2F, -1.3F, -0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Box 96
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-0.5F, 1F, 3.2F, 2, 3, 1, 0F,-0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -0.1F, 0.7F, -0.65F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1.5F, 1F, 3.2F, 2, 3, 1, 0F,0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0.2F, -0.5F, -0.1F, 0.7F, -0.65F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Box 101
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 102
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 103
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(3.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 104
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(3.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 105
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(3.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 106
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(3.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 107
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(3.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 108
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 109
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 110
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 111
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 112
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 113
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 114
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 116
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 117
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(3.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 118
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 120
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-1.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 121
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 122
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 123
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(3.9F, 7.8F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 124
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3.9F, 7.8F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 125
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.1F, 6.3F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 126
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4.9F, 7.8F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 127
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-5.1F, 6.3F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 128
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-5.1F, 6.3F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 129
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4.9F, 7.8F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 130
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.4F, -0.5F, -1F, 0F, -0.8F, -1F, -0.7F, -1F, 1F, 0.2F, -1.3F, 1F, 0.5F, -0.3F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-4.7F, 9.9F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 81
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-3F, 10F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 82
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-1.4F, 10F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 83
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0.4F, 10F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 84
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(2F, 10F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 85
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(3.7F, 9.9F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 86
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(3.7F, 8.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 87
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(3.7F, 7.1F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 88
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(3.9F, 5.6F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 89
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(3.1F, 4F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 90
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(3.3F, 2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 91
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(3.5F, 0F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 92
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(1.3F, 0.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 93
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-0.5F, 0.7F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 94
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-4.7F, 8.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 108
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-4.7F, 7.1F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 109
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-4.9F, 5.6F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 110
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-4.1F, 4F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 111
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-4.3F, 2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 112
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-4.5F, 0F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 113
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-2.3F, 0.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 114
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(3F, -1.5F, -3.5F, 1, 4, 4, 0F,0.4F, -0.9F, -0.7F, 0F, -1.2F, -0.7F, 0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 1F, -2.3F, -1.2F, -0.7F, -2F, -1.2F, -0.7F, -2F, -3F, 0.2F, -2.3F, -3F); // Box 68
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-4F, -1.5F, -3.5F, 1, 4, 4, 0F,0F, -1.2F, -0.7F, 0.4F, -0.9F, -0.7F, 0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, -0.7F, -2F, -1.2F, 1F, -2.3F, -1.2F, 0.2F, -2.3F, -3F, -0.7F, -2F, -3F); // Box 97
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-0.5F, 4F, -5.4F, 1, 1, 1, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 99
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-0.5F, 5F, -5.4F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 100
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-0.5F, 6.5F, -5.3F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.6F, 0.2F, -0.3F, 0.6F, 0.2F, -0.3F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F); // Box 102
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-1.7F, 4.3F, -5.2F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0F, 0.2F, 0F); // Box 103
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-2.7F, 4.3F, -5.2F, 1, 1, 1, 0F,0.5F, 0.5F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -0.1F, -0.2F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, 0F, -0.1F, 0F); // Box 104
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-0.5F, 3F, -5.4F, 1, 1, 1, 0F,-0.5F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, -0.4F, 0.1F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-1.2F, 2.8F, -5F, 1, 1, 1, 0F,-0.1F, -0.5F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.1F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.2F, 0F); // Box 106
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-1F, 5.5F, -5.2F, 1, 1, 1, 0F,0.3F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.3F, -0.5F, 0F, 0F, 0.4F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.4F, 0F); // Box 107
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-2F, 6.5F, -5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.3F, -0.5F, 0F, 0F, -0.3F, -0.7F, 0F, -0.9F, -0.1F, 0F, -0.9F, 0F, 0F, -0.3F, 0F); // Box 108
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-3F, 6.5F, -4.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.1F, -0.5F, 0F, -0.8F, 0.5F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.8F, 0.5F, 0F); // Box 109
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(0.7F, 4.3F, -5.2F, 1, 1, 1, 0F,0.4F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.1F, 0F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, 0.4F, 0.1F, 0F); // Box 110
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(1.7F, 4.3F, -5.2F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, 0.2F, 0F); // Box 111
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(0F, 5.5F, -5.2F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, -0.1F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0F, 0F, -0.2F, 0F); // Box 112
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(1F, 6.5F, -5F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0.3F, -0.5F, -0.7F, 0.3F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, -0.9F, -0.1F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.9F, 0F); // Box 113
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(2F, 6.5F, -4.5F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.1F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, 0F, 0F, -0.3F, 0F); // Box 114
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-1.1F, 3F, -5.4F, 1, 1, 1, 0F,-0.5F, -0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, -0.5F, 0F); // Box 115
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-1F, 11F, -3.7F, 2, 3, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-1F, 14F, -3.7F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 117
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-1F, 11F, -3.9F, 2, 3, 1, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 122
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-1F, 14F, -3.9F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 123
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-2.75F, 10.8F, -3.7F, 2, 3, 1, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 124
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-2.75F, 10.8F, -3.5F, 2, 3, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-2.75F, 13.8F, -3.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 126
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-2.75F, 13.8F, -3.7F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 127
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-4.5F, 10.6F, -3.5F, 2, 3, 1, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 128
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-4.5F, 10.6F, -3.3F, 2, 3, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-4.5F, 13.6F, -3.3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 130
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-4.5F, 13.6F, -3.5F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 131
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(0.75F, 10.8F, -3.7F, 2, 3, 1, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 132
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(0.75F, 10.8F, -3.5F, 2, 3, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(0.75F, 13.8F, -3.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 134
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(0.75F, 13.8F, -3.7F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 135
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(2.5F, 10.6F, -3.5F, 2, 3, 1, 0F,-0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 136
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(2.5F, 13.6F, -3.5F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F); // Box 137
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(2.5F, 10.6F, -3.3F, 2, 3, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(2.5F, 13.6F, -3.3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 139
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-1F, 11F, 3.2F, 2, 3, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 140
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-1F, 14F, 3.2F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F); // Box 141
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-1F, 11F, 3.1F, 2, 3, 1, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-1F, 14F, 3.1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 143
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-2.75F, 13.8F, 2.7F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 144
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-2.75F, 10.8F, 2.7F, 2, 3, 1, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(0.75F, 10.8F, 2.7F, 2, 3, 1, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(0.75F, 13.8F, 2.7F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 147
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(0.75F, 10.8F, 2.9F, 2, 3, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 148
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(0.75F, 13.8F, 2.9F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F); // Box 149
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-2.75F, 13.8F, 2.9F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F); // Box 150
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-2.75F, 10.8F, 2.9F, 2, 3, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 151
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-4.5F, 10.6F, 2.5F, 2, 3, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 152
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-4.5F, 10.6F, 2.3F, 2, 3, 1, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-4.5F, 13.6F, 2.5F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F); // Box 154
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-4.5F, 13.6F, 2.3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 155
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(2.5F, 10.6F, 2.5F, 2, 3, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 156
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(2.5F, 13.6F, 2.5F, 2, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, 0.2F, -0.7F, -0.2F, 0.2F); // Box 157
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(2.5F, 10.6F, 2.3F, 2, 3, 1, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(2.5F, 13.6F, 2.3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F); // Box 159
		bodyModel[140].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 109, 19, textureX, textureY); // Box 162
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 163

		leftArmModel[0].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 162
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8.5F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 163
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 109, 19, textureX, textureY); // Box 40
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 161

		rightArmModel[0].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 40
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 8.5F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F, 0.1F, 0.6F, 0.1F); // Box 161
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}
}