//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ostrich
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOstrich extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelOstrich() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		hipsModel = new ModelRendererTurbo[183];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[46];
		rightLegModel = new ModelRendererTurbo[46];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 21

		bodyModel[0].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[0].setRotationPoint(0F, -28F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Box 1
		hipsModel[1] = new ModelRendererTurbo(this, 49, 64, textureX, textureY); // Box 2
		hipsModel[2] = new ModelRendererTurbo(this, 34, 64, textureX, textureY); // Box 3
		hipsModel[3] = new ModelRendererTurbo(this, 21, 64, textureX, textureY); // Box 4
		hipsModel[4] = new ModelRendererTurbo(this, 10, 64, textureX, textureY); // Box 5
		hipsModel[5] = new ModelRendererTurbo(this, 2, 64, textureX, textureY); // Box 6
		hipsModel[6] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 7
		hipsModel[7] = new ModelRendererTurbo(this, 94, 64, textureX, textureY); // Box 8
		hipsModel[8] = new ModelRendererTurbo(this, 106, 64, textureX, textureY); // Box 9
		hipsModel[9] = new ModelRendererTurbo(this, 115, 64, textureX, textureY); // Box 10
		hipsModel[10] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 11
		hipsModel[11] = new ModelRendererTurbo(this, 10, 50, textureX, textureY); // Box 12
		hipsModel[12] = new ModelRendererTurbo(this, 21, 50, textureX, textureY); // Box 13
		hipsModel[13] = new ModelRendererTurbo(this, 34, 50, textureX, textureY); // Box 14
		hipsModel[14] = new ModelRendererTurbo(this, 49, 50, textureX, textureY); // Box 15
		hipsModel[15] = new ModelRendererTurbo(this, 65, 50, textureX, textureY); // Box 16
		hipsModel[16] = new ModelRendererTurbo(this, 81, 50, textureX, textureY); // Box 17
		hipsModel[17] = new ModelRendererTurbo(this, 94, 50, textureX, textureY); // Box 18
		hipsModel[18] = new ModelRendererTurbo(this, 106, 50, textureX, textureY); // Box 19
		hipsModel[19] = new ModelRendererTurbo(this, 115, 50, textureX, textureY); // Box 20
		hipsModel[20] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 21
		hipsModel[21] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 23
		hipsModel[22] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 24
		hipsModel[23] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 25
		hipsModel[24] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 26
		hipsModel[25] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 27
		hipsModel[26] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 28
		hipsModel[27] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 29
		hipsModel[28] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 30
		hipsModel[29] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 31
		hipsModel[30] = new ModelRendererTurbo(this, 13, 36, textureX, textureY); // Box 32
		hipsModel[31] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 34
		hipsModel[32] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 35
		hipsModel[33] = new ModelRendererTurbo(this, 7, 31, textureX, textureY); // Box 36
		hipsModel[34] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 37
		hipsModel[35] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 38
		hipsModel[36] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 40
		hipsModel[37] = new ModelRendererTurbo(this, 17, 29, textureX, textureY); // Box 41
		hipsModel[38] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 42
		hipsModel[39] = new ModelRendererTurbo(this, 18, 26, textureX, textureY); // Box 43
		hipsModel[40] = new ModelRendererTurbo(this, 25, 26, textureX, textureY); // Box 44
		hipsModel[41] = new ModelRendererTurbo(this, 18, 23, textureX, textureY); // Box 46
		hipsModel[42] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 47
		hipsModel[43] = new ModelRendererTurbo(this, 12, 29, textureX, textureY); // Box 48
		hipsModel[44] = new ModelRendererTurbo(this, 2, 27, textureX, textureY); // Box 49
		hipsModel[45] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 50
		hipsModel[46] = new ModelRendererTurbo(this, 12, 32, textureX, textureY); // Box 0
		hipsModel[47] = new ModelRendererTurbo(this, 25, 35, textureX, textureY); // Box 1
		hipsModel[48] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 2
		hipsModel[49] = new ModelRendererTurbo(this, 25, 23, textureX, textureY); // Box 3
		hipsModel[50] = new ModelRendererTurbo(this, 18, 23, textureX, textureY); // Box 4
		hipsModel[51] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 5
		hipsModel[52] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 6
		hipsModel[53] = new ModelRendererTurbo(this, 2, 64, textureX, textureY); // Box 100
		hipsModel[54] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 101
		hipsModel[55] = new ModelRendererTurbo(this, 10, 64, textureX, textureY); // Box 102
		hipsModel[56] = new ModelRendererTurbo(this, 10, 50, textureX, textureY); // Box 103
		hipsModel[57] = new ModelRendererTurbo(this, 34, 64, textureX, textureY); // Box 104
		hipsModel[58] = new ModelRendererTurbo(this, 21, 50, textureX, textureY); // Box 105
		hipsModel[59] = new ModelRendererTurbo(this, 21, 64, textureX, textureY); // Box 106
		hipsModel[60] = new ModelRendererTurbo(this, 34, 50, textureX, textureY); // Box 107
		hipsModel[61] = new ModelRendererTurbo(this, 49, 64, textureX, textureY); // Box 108
		hipsModel[62] = new ModelRendererTurbo(this, 65, 50, textureX, textureY); // Box 109
		hipsModel[63] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 110
		hipsModel[64] = new ModelRendererTurbo(this, 81, 50, textureX, textureY); // Box 111
		hipsModel[65] = new ModelRendererTurbo(this, 94, 50, textureX, textureY); // Box 112
		hipsModel[66] = new ModelRendererTurbo(this, 94, 64, textureX, textureY); // Box 113
		hipsModel[67] = new ModelRendererTurbo(this, 106, 64, textureX, textureY); // Box 114
		hipsModel[68] = new ModelRendererTurbo(this, 106, 50, textureX, textureY); // Box 115
		hipsModel[69] = new ModelRendererTurbo(this, 115, 64, textureX, textureY); // Box 116
		hipsModel[70] = new ModelRendererTurbo(this, 115, 50, textureX, textureY); // Box 117
		hipsModel[71] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Box 118
		hipsModel[72] = new ModelRendererTurbo(this, 49, 50, textureX, textureY); // Box 119
		hipsModel[73] = new ModelRendererTurbo(this, 44, 93, textureX, textureY); // Box 137
		hipsModel[74] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Box 138
		hipsModel[75] = new ModelRendererTurbo(this, 66, 93, textureX, textureY); // Box 139
		hipsModel[76] = new ModelRendererTurbo(this, 76, 93, textureX, textureY); // Box 140
		hipsModel[77] = new ModelRendererTurbo(this, 85, 93, textureX, textureY); // Box 142
		hipsModel[78] = new ModelRendererTurbo(this, 93, 93, textureX, textureY); // Box 143
		hipsModel[79] = new ModelRendererTurbo(this, 44, 83, textureX, textureY); // Box 145
		hipsModel[80] = new ModelRendererTurbo(this, 54, 83, textureX, textureY); // Box 146
		hipsModel[81] = new ModelRendererTurbo(this, 66, 83, textureX, textureY); // Box 147
		hipsModel[82] = new ModelRendererTurbo(this, 76, 83, textureX, textureY); // Box 148
		hipsModel[83] = new ModelRendererTurbo(this, 102, 83, textureX, textureY); // Box 149
		hipsModel[84] = new ModelRendererTurbo(this, 85, 83, textureX, textureY); // Box 150
		hipsModel[85] = new ModelRendererTurbo(this, 93, 83, textureX, textureY); // Box 151
		hipsModel[86] = new ModelRendererTurbo(this, 102, 93, textureX, textureY); // Box 152
		hipsModel[87] = new ModelRendererTurbo(this, 32, 83, textureX, textureY); // Box 0
		hipsModel[88] = new ModelRendererTurbo(this, 32, 93, textureX, textureY); // Box 1
		hipsModel[89] = new ModelRendererTurbo(this, 34, 77, textureX, textureY); // Box 2
		hipsModel[90] = new ModelRendererTurbo(this, 13, 36, textureX, textureY); // Box 3
		hipsModel[91] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 4
		hipsModel[92] = new ModelRendererTurbo(this, 7, 43, textureX, textureY); // Box 5
		hipsModel[93] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 6
		hipsModel[94] = new ModelRendererTurbo(this, 7, 31, textureX, textureY); // Box 7
		hipsModel[95] = new ModelRendererTurbo(this, 2, 31, textureX, textureY); // Box 8
		hipsModel[96] = new ModelRendererTurbo(this, 25, 38, textureX, textureY); // Box 19
		hipsModel[97] = new ModelRendererTurbo(this, 18, 23, textureX, textureY); // Box 20
		hipsModel[98] = new ModelRendererTurbo(this, 25, 32, textureX, textureY); // Box 21
		hipsModel[99] = new ModelRendererTurbo(this, 25, 26, textureX, textureY); // Box 22
		hipsModel[100] = new ModelRendererTurbo(this, 18, 26, textureX, textureY); // Box 23
		hipsModel[101] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 24
		hipsModel[102] = new ModelRendererTurbo(this, 12, 29, textureX, textureY); // Box 25
		hipsModel[103] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Box 26
		hipsModel[104] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 27
		hipsModel[105] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 28
		hipsModel[106] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 29
		hipsModel[107] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 30
		hipsModel[108] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 31
		hipsModel[109] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 32
		hipsModel[110] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 33
		hipsModel[111] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 34
		hipsModel[112] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 35
		hipsModel[113] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 36
		hipsModel[114] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 70
		hipsModel[115] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 71
		hipsModel[116] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 72
		hipsModel[117] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 73
		hipsModel[118] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 74
		hipsModel[119] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 75
		hipsModel[120] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 76
		hipsModel[121] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 77
		hipsModel[122] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 78
		hipsModel[123] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 79
		hipsModel[124] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 100
		hipsModel[125] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 101
		hipsModel[126] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 102
		hipsModel[127] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 103
		hipsModel[128] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 104
		hipsModel[129] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 105
		hipsModel[130] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 106
		hipsModel[131] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 107
		hipsModel[132] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 108
		hipsModel[133] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 109
		hipsModel[134] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 110
		hipsModel[135] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 111
		hipsModel[136] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 112
		hipsModel[137] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 113
		hipsModel[138] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 114
		hipsModel[139] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 115
		hipsModel[140] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 116
		hipsModel[141] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 117
		hipsModel[142] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 118
		hipsModel[143] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 119
		hipsModel[144] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 120
		hipsModel[145] = new ModelRendererTurbo(this, 37, 21, textureX, textureY); // Box 121
		hipsModel[146] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 122
		hipsModel[147] = new ModelRendererTurbo(this, 45, 21, textureX, textureY); // Box 123
		hipsModel[148] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 124
		hipsModel[149] = new ModelRendererTurbo(this, 53, 21, textureX, textureY); // Box 125
		hipsModel[150] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 126
		hipsModel[151] = new ModelRendererTurbo(this, 39, 27, textureX, textureY); // Box 127
		hipsModel[152] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 128
		hipsModel[153] = new ModelRendererTurbo(this, 53, 27, textureX, textureY); // Box 129
		hipsModel[154] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 130
		hipsModel[155] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 131
		hipsModel[156] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 132
		hipsModel[157] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 133
		hipsModel[158] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 134
		hipsModel[159] = new ModelRendererTurbo(this, 45, 27, textureX, textureY); // Box 135
		hipsModel[160] = new ModelRendererTurbo(this, 45, 33, textureX, textureY); // Box 136
		hipsModel[161] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 137
		hipsModel[162] = new ModelRendererTurbo(this, 53, 37, textureX, textureY); // Box 138
		hipsModel[163] = new ModelRendererTurbo(this, 45, 37, textureX, textureY); // Box 139
		hipsModel[164] = new ModelRendererTurbo(this, 32, 83, textureX, textureY); // Box 143
		hipsModel[165] = new ModelRendererTurbo(this, 32, 93, textureX, textureY); // Box 144
		hipsModel[166] = new ModelRendererTurbo(this, 44, 93, textureX, textureY); // Box 145
		hipsModel[167] = new ModelRendererTurbo(this, 44, 83, textureX, textureY); // Box 146
		hipsModel[168] = new ModelRendererTurbo(this, 54, 83, textureX, textureY); // Box 147
		hipsModel[169] = new ModelRendererTurbo(this, 54, 93, textureX, textureY); // Box 148
		hipsModel[170] = new ModelRendererTurbo(this, 66, 83, textureX, textureY); // Box 149
		hipsModel[171] = new ModelRendererTurbo(this, 66, 93, textureX, textureY); // Box 150
		hipsModel[172] = new ModelRendererTurbo(this, 76, 83, textureX, textureY); // Box 151
		hipsModel[173] = new ModelRendererTurbo(this, 76, 93, textureX, textureY); // Box 152
		hipsModel[174] = new ModelRendererTurbo(this, 85, 83, textureX, textureY); // Box 153
		hipsModel[175] = new ModelRendererTurbo(this, 85, 93, textureX, textureY); // Box 154
		hipsModel[176] = new ModelRendererTurbo(this, 93, 83, textureX, textureY); // Box 155
		hipsModel[177] = new ModelRendererTurbo(this, 93, 93, textureX, textureY); // Box 156
		hipsModel[178] = new ModelRendererTurbo(this, 102, 83, textureX, textureY); // Box 157
		hipsModel[179] = new ModelRendererTurbo(this, 102, 93, textureX, textureY); // Box 158
		hipsModel[180] = new ModelRendererTurbo(this, 34, 77, textureX, textureY); // Box 159
		hipsModel[181] = new ModelRendererTurbo(this, 45, 77, textureX, textureY); // Box 160
		hipsModel[182] = new ModelRendererTurbo(this, 70, 18, textureX, textureY); // Box 161

		hipsModel[0].addShapeBox(-1F, 8F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 1
		hipsModel[0].setRotationPoint(0F, -28F, 0F);

		hipsModel[1].addShapeBox(1F, 8F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 2
		hipsModel[1].setRotationPoint(0F, -28F, 0F);

		hipsModel[2].addShapeBox(3F, 8F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 3
		hipsModel[2].setRotationPoint(0F, -28F, 0F);

		hipsModel[3].addShapeBox(5F, 8F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -1F, 0F); // Box 4
		hipsModel[3].setRotationPoint(0F, -28F, 0F);

		hipsModel[4].addShapeBox(7F, 8F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, .5F, 0F); // Box 5
		hipsModel[4].setRotationPoint(0F, -28F, 0F);

		hipsModel[5].addShapeBox(9F, 8F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F, 1F, .5F); // Box 6
		hipsModel[5].setRotationPoint(0F, -28F, 0F);

		hipsModel[6].addShapeBox(-3F, 8F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -2F, 0F); // Box 7
		hipsModel[6].setRotationPoint(0F, -28F, 0F);

		hipsModel[7].addShapeBox(-5F, 8F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F); // Box 8
		hipsModel[7].setRotationPoint(0F, -28F, 0F);

		hipsModel[8].addShapeBox(-7F, 8F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 1F, 0F, -1F, -1F); // Box 9
		hipsModel[8].setRotationPoint(0F, -28F, 0F);

		hipsModel[9].addShapeBox(-8F, 8F, 0F, 1, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		hipsModel[9].setRotationPoint(0F, -28F, 0F);

		hipsModel[10].addShapeBox(9F, 5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, .5F, -1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 1.5F); // Box 11
		hipsModel[10].setRotationPoint(0F, -28F, 0F);

		hipsModel[11].addShapeBox(7F, 4F, 0F, 2, 4, 3, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F); // Box 12
		hipsModel[11].setRotationPoint(0F, -28F, 0F);

		hipsModel[12].addShapeBox(5F, 3F, 0F, 2, 5, 4, 0F,0F, .7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 13
		hipsModel[12].setRotationPoint(0F, -28F, 0F);

		hipsModel[13].addShapeBox(3F, 2F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, -.3F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 14
		hipsModel[13].setRotationPoint(0F, -28F, 0F);

		hipsModel[14].addShapeBox(1F, 2F, 0F, 2, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 15
		hipsModel[14].setRotationPoint(0F, -28F, 0F);

		hipsModel[15].addShapeBox(-1F, 3F, 0F, 2, 5, 5, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 16
		hipsModel[15].setRotationPoint(0F, -28F, 0F);

		hipsModel[16].addShapeBox(-3F, 3F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 17
		hipsModel[16].setRotationPoint(0F, -28F, 0F);

		hipsModel[17].addShapeBox(-5F, 3F, 0F, 2, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, .5F); // Box 18
		hipsModel[17].setRotationPoint(0F, -28F, 0F);

		hipsModel[18].addShapeBox(-7F, 6F, 0F, 2, 2, 2, 0F,0F, .5F, 0F, 0F, 2F, 0F, 0F, 1F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 19
		hipsModel[18].setRotationPoint(0F, -28F, 0F);

		hipsModel[19].addShapeBox(-8F, 6F, 0F, 1, 2, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F); // Box 20
		hipsModel[19].setRotationPoint(0F, -28F, 0F);

		hipsModel[20].addShapeBox(-8F, 5F, 0.5F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[20].setRotationPoint(0F, -28F, 0F);

		hipsModel[21].addShapeBox(-10F, 9F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F); // Box 23
		hipsModel[21].setRotationPoint(0F, -28F, 0F);

		hipsModel[22].addShapeBox(-10F, 5F, 0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 24
		hipsModel[22].setRotationPoint(0F, -28F, 0F);

		hipsModel[23].addShapeBox(-11F, 9F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .15F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, .5F, 0F, 0F); // Box 25
		hipsModel[23].setRotationPoint(0F, -28F, 0F);

		hipsModel[24].addShapeBox(-12F, 6F, 0.5F, 2, 3, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 26
		hipsModel[24].setRotationPoint(0F, -28F, 0F);

		hipsModel[25].addShapeBox(-12F, 9F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .15F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, .5F, 0F, -1F); // Box 27
		hipsModel[25].setRotationPoint(0F, -28F, 0F);

		hipsModel[26].addShapeBox(-10F, 12F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F); // Box 28
		hipsModel[26].setRotationPoint(0F, -28F, 0F);

		hipsModel[27].addShapeBox(-12F, 12F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 29
		hipsModel[27].setRotationPoint(0F, -28F, 0F);

		hipsModel[28].addShapeBox(-10F, 14F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 30
		hipsModel[28].setRotationPoint(0F, -28F, 0F);

		hipsModel[29].addShapeBox(-12F, 14F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F); // Box 31
		hipsModel[29].setRotationPoint(0F, -28F, 0F);

		hipsModel[30].addShapeBox(2F, 9F, 0F, 4, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 32
		hipsModel[30].setRotationPoint(0F, -28F, 0F);
		hipsModel[30].rotateAngleZ = 0.75049158F;

		hipsModel[31].addShapeBox(2F, 10F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 1F, 0F); // Box 34
		hipsModel[31].setRotationPoint(0F, -28F, 0F);
		hipsModel[31].rotateAngleZ = 0.75049158F;

		hipsModel[32].addShapeBox(10.5F, 1F, 0F, 1, 2, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.05F, -.54F, 0F, -.27F, .19F, 0F, -.27F, .19F, 0F, -.05F, -.54F, -.5F); // Box 35
		hipsModel[32].setRotationPoint(0F, -28F, 0F);

		hipsModel[33].addShapeBox(10.5F, -9F, 0F, 1, 10, 1, 0F,-1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -.2F, -1.2F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		hipsModel[33].setRotationPoint(0F, -28F, 0F);

		hipsModel[34].addShapeBox(11.5F, 1F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, .275F, .2F, 0F, -.6F, .9F, 0F, -.6F, .9F, -.5F, .275F, .2F, 0F); // Box 37
		hipsModel[34].setRotationPoint(0F, -28F, 0F);

		hipsModel[35].addShapeBox(11.5F, -9F, 0F, 1, 10, 1, 0F,-1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, -1F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 38
		hipsModel[35].setRotationPoint(0F, -28F, 0F);

		hipsModel[36].addShapeBox(11.5F, -9F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F); // Box 40
		hipsModel[36].setRotationPoint(0F, -28F, 0F);

		hipsModel[37].addShapeBox(12.5F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[37].setRotationPoint(0F, -28F, 0F);

		hipsModel[38].addShapeBox(11.5F, -10F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F); // Box 42
		hipsModel[38].setRotationPoint(0F, -28F, 0F);

		hipsModel[39].addShapeBox(12.5F, -11F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 43
		hipsModel[39].setRotationPoint(0F, -28F, 0F);

		hipsModel[40].addShapeBox(11.5F, -11F, 0.5F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F); // Box 44
		hipsModel[40].setRotationPoint(0F, -28F, 0F);

		hipsModel[41].addShapeBox(12.5F, -9F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, -.5F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -.5F); // Box 46
		hipsModel[41].setRotationPoint(0F, -28F, 0F);

		hipsModel[42].addShapeBox(13.5F, -11F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, -1F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F); // Box 47
		hipsModel[42].setRotationPoint(0F, -28F, 0F);

		hipsModel[43].addShapeBox(13.5F, -10F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F); // Box 48
		hipsModel[43].setRotationPoint(0F, -28F, 0F);

		hipsModel[44].addShapeBox(14.3F, -10.2F, -0.5F, 3, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F); // Box 49
		hipsModel[44].setRotationPoint(0F, -28F, 0F);
		hipsModel[44].rotateAngleZ = -0.01745329F;

		hipsModel[45].addShapeBox(14.5F, -10F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -.3F, 0F, -0.5F, -.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -.3F, 0F, -0.5F, -.3F, 0F, -0.5F, 0F); // Box 50
		hipsModel[45].setRotationPoint(0F, -28F, 0F);

		hipsModel[46].addShapeBox(12.5F, -9F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -1F, 0F); // Box 0
		hipsModel[46].setRotationPoint(0F, -28F, 0F);

		hipsModel[47].addShapeBox(11.5F, -9F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -1F, 0F); // Box 1
		hipsModel[47].setRotationPoint(0F, -28F, 0F);

		hipsModel[48].addShapeBox(11.5F, -10F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[48].setRotationPoint(0F, -28F, 0F);

		hipsModel[49].addShapeBox(11.5F, -11F, -0.5F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[49].setRotationPoint(0F, -28F, 0F);

		hipsModel[50].addShapeBox(12.5F, -11F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[50].setRotationPoint(0F, -28F, 0F);

		hipsModel[51].addShapeBox(13.5F, -11F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[51].setRotationPoint(0F, -28F, 0F);

		hipsModel[52].addShapeBox(13.5F, -10F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 6
		hipsModel[52].setRotationPoint(0F, -28F, 0F);

		hipsModel[53].addShapeBox(9F, 8F, -2F, 1, 3, 2, 0F,0F, 0F, 1.5F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 100
		hipsModel[53].setRotationPoint(0F, -28F, 0F);

		hipsModel[54].addShapeBox(9F, 5F, -2F, 1, 3, 2, 0F,0F, -1F, 1F, 0F, -2F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		hipsModel[54].setRotationPoint(0F, -28F, 0F);

		hipsModel[55].addShapeBox(7F, 8F, -3F, 2, 4, 3, 0F,0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 102
		hipsModel[55].setRotationPoint(0F, -28F, 0F);

		hipsModel[56].addShapeBox(7F, 4F, -3F, 2, 4, 3, 0F,0F, -1F, 1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		hipsModel[56].setRotationPoint(0F, -28F, 0F);

		hipsModel[57].addShapeBox(3F, 8F, -5F, 2, 5, 5, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 104
		hipsModel[57].setRotationPoint(0F, -28F, 0F);

		hipsModel[58].addShapeBox(5F, 3F, -4F, 2, 5, 4, 0F,0F, -1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		hipsModel[58].setRotationPoint(0F, -28F, 0F);

		hipsModel[59].addShapeBox(5F, 8F, -4F, 2, 5, 4, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 106
		hipsModel[59].setRotationPoint(0F, -28F, 0F);

		hipsModel[60].addShapeBox(3F, 2F, -5F, 2, 6, 5, 0F,0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		hipsModel[60].setRotationPoint(0F, -28F, 0F);

		hipsModel[61].addShapeBox(1F, 8F, -5F, 2, 5, 5, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 108
		hipsModel[61].setRotationPoint(0F, -28F, 0F);

		hipsModel[62].addShapeBox(-1F, 3F, -5F, 2, 5, 5, 0F,0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		hipsModel[62].setRotationPoint(0F, -28F, 0F);

		hipsModel[63].addShapeBox(-3F, 8F, -4F, 2, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 110
		hipsModel[63].setRotationPoint(0F, -28F, 0F);

		hipsModel[64].addShapeBox(-3F, 3F, -4F, 2, 5, 4, 0F,0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		hipsModel[64].setRotationPoint(0F, -28F, 0F);

		hipsModel[65].addShapeBox(-5F, 3F, -3F, 2, 5, 3, 0F,0F, -2F, -0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		hipsModel[65].setRotationPoint(0F, -28F, 0F);

		hipsModel[66].addShapeBox(-5F, 8F, -3F, 2, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0.7F, 0F, 0F, 0F, 0F); // Box 113
		hipsModel[66].setRotationPoint(0F, -28F, 0F);

		hipsModel[67].addShapeBox(-7F, 8F, -2F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.5F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 114
		hipsModel[67].setRotationPoint(0F, -28F, 0F);

		hipsModel[68].addShapeBox(-7F, 6F, -2F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 1F, 0.5F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		hipsModel[68].setRotationPoint(0F, -28F, 0F);

		hipsModel[69].addShapeBox(-8F, 8F, -1F, 1, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 116
		hipsModel[69].setRotationPoint(0F, -28F, 0F);

		hipsModel[70].addShapeBox(-8F, 6F, -1F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 117
		hipsModel[70].setRotationPoint(0F, -28F, 0F);

		hipsModel[71].addShapeBox(-1F, 8F, -5F, 2, 5, 5, 0F,0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F); // Box 118
		hipsModel[71].setRotationPoint(0F, -28F, 0F);

		hipsModel[72].addShapeBox(1F, 2F, -5F, 2, 6, 5, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		hipsModel[72].setRotationPoint(0F, -28F, 0F);

		hipsModel[73].addShapeBox(6.5F, 7F, 4F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 137
		hipsModel[73].setRotationPoint(0F, -28F, 0F);

		hipsModel[74].addShapeBox(3.5F, 8F, 5F, 3, 3, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, .5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -.5F); // Box 138
		hipsModel[74].setRotationPoint(0F, -28F, 0F);

		hipsModel[75].addShapeBox(1.5F, 8F, 6F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -.5F, 0F, 0F, .2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1F, -1.5F); // Box 139
		hipsModel[75].setRotationPoint(0F, -28F, 0F);

		hipsModel[76].addShapeBox(-0.5F, 8F, 6F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 140
		hipsModel[76].setRotationPoint(0F, -28F, 0F);

		hipsModel[77].addShapeBox(-2.5F, 9F, 6.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, 1F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 142
		hipsModel[77].setRotationPoint(0F, -28F, 0F);

		hipsModel[78].addShapeBox(-4.5F, 11F, 6F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, -.5F); // Box 143
		hipsModel[78].setRotationPoint(0F, -28F, 0F);

		hipsModel[79].addShapeBox(6.5F, 4F, 4F, 2, 3, 2, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 145
		hipsModel[79].setRotationPoint(0F, -28F, 0F);

		hipsModel[80].addShapeBox(3.5F, 4F, 5F, 3, 4, 2, 0F,0F, .7F, 0F, 0F, .5F, 1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, .5F); // Box 146
		hipsModel[80].setRotationPoint(0F, -28F, 0F);

		hipsModel[81].addShapeBox(1.5F, 4F, 6F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, .5F, 1F, 0F, -.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, .2F); // Box 147
		hipsModel[81].setRotationPoint(0F, -28F, 0F);

		hipsModel[82].addShapeBox(-0.5F, 4F, 6F, 2, 5, 2, 0F,0F, -.5F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, .2F, 0F, 0F, 0F); // Box 148
		hipsModel[82].setRotationPoint(0F, -28F, 0F);

		hipsModel[83].addShapeBox(-6.5F, 8F, 6F, 2, 6, 1, 0F,0F, -2F, 1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -3F, -1F, 1.5F, 0F, 1.5F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, -1.5F); // Box 149
		hipsModel[83].setRotationPoint(0F, -28F, 0F);

		hipsModel[84].addShapeBox(-2.5F, 5F, 6.5F, 2, 4, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, .5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, 0F); // Box 150
		hipsModel[84].setRotationPoint(0F, -28F, 0F);

		hipsModel[85].addShapeBox(-4.5F, 7F, 6F, 2, 4, 1, 0F,0F, -.5F, 0F, 0F, 1.5F, -.5F, 0F, 0F, .5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, .5F, 0F, 0F, 0F); // Box 151
		hipsModel[85].setRotationPoint(0F, -28F, 0F);

		hipsModel[86].addShapeBox(-6.5F, 9F, 6F, 2, 6, 1, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 1.5F, -1F, 1.5F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 1F, -1F, -1.5F); // Box 152
		hipsModel[86].setRotationPoint(0F, -28F, 0F);

		hipsModel[87].addShapeBox(8.5F, 5F, 2F, 2, 2, 3, 0F,0F, 1F, -2F, -.8F, -1F, -1F, -.8F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 1F); // Box 0
		hipsModel[87].setRotationPoint(0F, -28F, 0F);

		hipsModel[88].addShapeBox(8.5F, 7F, 2F, 1, 2, 3, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 0F); // Box 1
		hipsModel[88].setRotationPoint(0F, -28F, 0F);

		hipsModel[89].addShapeBox(1.5F, 3.5F, 5F, 2, 1, 2, 0F,0F, .2F, -1F, 0F, .2F, 0F, 0F, -1F, 0F, 0F, -.3F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[89].setRotationPoint(0F, -28F, 0F);

		hipsModel[90].addShapeBox(2F, 9F, -1F, 4, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[90].setRotationPoint(0F, -28F, 0F);
		hipsModel[90].rotateAngleZ = 0.75049158F;

		hipsModel[91].addShapeBox(2F, 10F, -1F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 4
		hipsModel[91].setRotationPoint(0F, -28F, 0F);
		hipsModel[91].rotateAngleZ = 0.75049158F;

		hipsModel[92].addShapeBox(10.5F, 1F, -1F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, -0.54F, -0.5F, -0.27F, 0.19F, 0F, -0.27F, 0.19F, 0F, -0.05F, -0.54F, 0F); // Box 5
		hipsModel[92].setRotationPoint(0F, -28F, 0F);

		hipsModel[93].addShapeBox(11.5F, 1F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.275F, 0.2F, 0F, -0.6F, 0.9F, -0.5F, -0.6F, 0.9F, 0F, 0.275F, 0.2F, 0F); // Box 6
		hipsModel[93].setRotationPoint(0F, -28F, 0F);

		hipsModel[94].addShapeBox(10.5F, -9F, -1F, 1, 10, 1, 0F,-1.2F, 0F, -0.5F, 1F, 0F, -0.2F, 1F, 0F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		hipsModel[94].setRotationPoint(0F, -28F, 0F);

		hipsModel[95].addShapeBox(11.5F, -9F, -1F, 1, 10, 1, 0F,-1F, 0F, -0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[95].setRotationPoint(0F, -28F, 0F);

		hipsModel[96].addShapeBox(11.5F, -9F, -1.5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 19
		hipsModel[96].setRotationPoint(0F, -28F, 0F);

		hipsModel[97].addShapeBox(12.5F, -9F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 20
		hipsModel[97].setRotationPoint(0F, -28F, 0F);

		hipsModel[98].addShapeBox(11.5F, -10F, -1.5F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[98].setRotationPoint(0F, -28F, 0F);

		hipsModel[99].addShapeBox(11.5F, -11F, -1.5F, 1, 1, 1, 0F,-1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[99].setRotationPoint(0F, -28F, 0F);

		hipsModel[100].addShapeBox(12.5F, -11F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[100].setRotationPoint(0F, -28F, 0F);

		hipsModel[101].addShapeBox(13.5F, -11F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.1F, -0.3F, -1F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[101].setRotationPoint(0F, -28F, 0F);

		hipsModel[102].addShapeBox(13.5F, -10F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 25
		hipsModel[102].setRotationPoint(0F, -28F, 0F);

		hipsModel[103].addShapeBox(-1.5F, 3.5F, 6F, 3, 1, 1, 0F,0F, -.8F, 0F, 0F, .2F, 0F, 0F, -.3F, -.5F, 0F, -.8F, -1F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -1F); // Box 26
		hipsModel[103].setRotationPoint(0F, -28F, 0F);

		hipsModel[104].addShapeBox(-12F, 6F, -0.5F, 2, 3, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[104].setRotationPoint(0F, -28F, 0F);

		hipsModel[105].addShapeBox(-11F, 9F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 28
		hipsModel[105].setRotationPoint(0F, -28F, 0F);

		hipsModel[106].addShapeBox(-12F, 9F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F); // Box 29
		hipsModel[106].setRotationPoint(0F, -28F, 0F);

		hipsModel[107].addShapeBox(-10F, 9F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[107].setRotationPoint(0F, -28F, 0F);

		hipsModel[108].addShapeBox(-10F, 12F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[108].setRotationPoint(0F, -28F, 0F);

		hipsModel[109].addShapeBox(-12F, 12F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[109].setRotationPoint(0F, -28F, 0F);

		hipsModel[110].addShapeBox(-10F, 14F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[110].setRotationPoint(0F, -28F, 0F);

		hipsModel[111].addShapeBox(-12F, 14F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F); // Box 34
		hipsModel[111].setRotationPoint(0F, -28F, 0F);

		hipsModel[112].addShapeBox(-10F, 5F, -0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[112].setRotationPoint(0F, -28F, 0F);

		hipsModel[113].addShapeBox(-8F, 5F, -0.5F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[113].setRotationPoint(0F, -28F, 0F);

		hipsModel[114].addShapeBox(-8F, 5F, -1.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[114].setRotationPoint(0F, -28F, 0F);

		hipsModel[115].addShapeBox(-10F, 5F, -1.5F, 2, 4, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[115].setRotationPoint(0F, -28F, 0F);

		hipsModel[116].addShapeBox(-12F, 6F, -1.5F, 2, 3, 1, 0F,-1F, -1.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		hipsModel[116].setRotationPoint(0F, -28F, 0F);

		hipsModel[117].addShapeBox(-10F, 9F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[117].setRotationPoint(0F, -28F, 0F);

		hipsModel[118].addShapeBox(-11F, 9F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 74
		hipsModel[118].setRotationPoint(0F, -28F, 0F);

		hipsModel[119].addShapeBox(-10F, 12F, -1.5F, 2, 2, 1, 0F,0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[119].setRotationPoint(0F, -28F, 0F);

		hipsModel[120].addShapeBox(-12F, 12F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[120].setRotationPoint(0F, -28F, 0F);

		hipsModel[121].addShapeBox(-10F, 14F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[121].setRotationPoint(0F, -28F, 0F);

		hipsModel[122].addShapeBox(-12F, 14F, -1.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 78
		hipsModel[122].setRotationPoint(0F, -28F, 0F);

		hipsModel[123].addShapeBox(-12F, 9F, -1.5F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 79
		hipsModel[123].setRotationPoint(0F, -28F, 0F);

		hipsModel[124].addShapeBox(-10F, 14F, -1F, 2, 3, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 100
		hipsModel[124].setRotationPoint(0F, -28F, 0F);
		hipsModel[124].rotateAngleY = -0.20943951F;

		hipsModel[125].addShapeBox(-10F, 12F, -1F, 2, 2, 1, 0F,0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		hipsModel[125].setRotationPoint(0F, -28F, 0F);
		hipsModel[125].rotateAngleY = -0.20943951F;

		hipsModel[126].addShapeBox(-10F, 9F, -1F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		hipsModel[126].setRotationPoint(0F, -28F, 0F);
		hipsModel[126].rotateAngleY = -0.20943951F;

		hipsModel[127].addShapeBox(-10F, 9F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F); // Box 103
		hipsModel[127].setRotationPoint(0F, -28F, 0F);
		hipsModel[127].rotateAngleY = -0.20943951F;

		hipsModel[128].addShapeBox(-10F, 12F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F); // Box 104
		hipsModel[128].setRotationPoint(0F, -28F, 0F);
		hipsModel[128].rotateAngleY = -0.20943951F;

		hipsModel[129].addShapeBox(-10F, 14F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 105
		hipsModel[129].setRotationPoint(0F, -28F, 0F);
		hipsModel[129].rotateAngleY = -0.20943951F;

		hipsModel[130].addShapeBox(-8F, 5F, -1F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		hipsModel[130].setRotationPoint(0F, -28F, 0F);
		hipsModel[130].rotateAngleY = -0.20943951F;

		hipsModel[131].addShapeBox(-8F, 5F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 1F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		hipsModel[131].setRotationPoint(0F, -28F, 0F);
		hipsModel[131].rotateAngleY = -0.20943951F;

		hipsModel[132].addShapeBox(-10F, 5F, 0F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 108
		hipsModel[132].setRotationPoint(0F, -28F, 0F);
		hipsModel[132].rotateAngleY = -0.20943951F;

		hipsModel[133].addShapeBox(-10F, 5F, -1F, 2, 4, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		hipsModel[133].setRotationPoint(0F, -28F, 0F);
		hipsModel[133].rotateAngleY = -0.20943951F;

		hipsModel[134].addShapeBox(-12F, 6F, -1F, 2, 3, 1, 0F,-1F, -1.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		hipsModel[134].setRotationPoint(0F, -28F, 0F);
		hipsModel[134].rotateAngleY = -0.20943951F;

		hipsModel[135].addShapeBox(-12F, 6F, 0F, 2, 3, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 111
		hipsModel[135].setRotationPoint(0F, -28F, 0F);
		hipsModel[135].rotateAngleY = -0.20943951F;

		hipsModel[136].addShapeBox(-11F, 9F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .15F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, .5F, 0F, 0F); // Box 112
		hipsModel[136].setRotationPoint(0F, -28F, 0F);
		hipsModel[136].rotateAngleY = -0.20943951F;

		hipsModel[137].addShapeBox(-11F, 9F, -1F, 1, 3, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 113
		hipsModel[137].setRotationPoint(0F, -28F, 0F);
		hipsModel[137].rotateAngleY = -0.20943951F;

		hipsModel[138].addShapeBox(-12F, 12F, -1F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		hipsModel[138].setRotationPoint(0F, -28F, 0F);
		hipsModel[138].rotateAngleY = -0.20943951F;

		hipsModel[139].addShapeBox(-12F, 12F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 115
		hipsModel[139].setRotationPoint(0F, -28F, 0F);
		hipsModel[139].rotateAngleY = -0.20943951F;

		hipsModel[140].addShapeBox(-12F, 14F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F); // Box 116
		hipsModel[140].setRotationPoint(0F, -28F, 0F);
		hipsModel[140].rotateAngleY = -0.20943951F;

		hipsModel[141].addShapeBox(-12F, 14F, -1F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 117
		hipsModel[141].setRotationPoint(0F, -28F, 0F);
		hipsModel[141].rotateAngleY = -0.20943951F;

		hipsModel[142].addShapeBox(-12F, 9F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .15F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, .5F, 0F, -1F); // Box 118
		hipsModel[142].setRotationPoint(0F, -28F, 0F);
		hipsModel[142].rotateAngleY = -0.20943951F;

		hipsModel[143].addShapeBox(-12F, 9F, -1F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
		hipsModel[143].setRotationPoint(0F, -28F, 0F);
		hipsModel[143].rotateAngleY = -0.20943951F;

		hipsModel[144].addShapeBox(-8F, 5F, -1F, 2, 4, 1, 0F,0F, -1F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		hipsModel[144].setRotationPoint(0F, -28F, 0F);
		hipsModel[144].rotateAngleY = 0.20943951F;

		hipsModel[145].addShapeBox(-8F, 5F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		hipsModel[145].setRotationPoint(0F, -28F, 0F);
		hipsModel[145].rotateAngleY = 0.20943951F;

		hipsModel[146].addShapeBox(-10F, 5F, 0F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 122
		hipsModel[146].setRotationPoint(0F, -28F, 0F);
		hipsModel[146].rotateAngleY = 0.20943951F;

		hipsModel[147].addShapeBox(-10F, 5F, -1F, 2, 4, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		hipsModel[147].setRotationPoint(0F, -28F, 0F);
		hipsModel[147].rotateAngleY = 0.20943951F;

		hipsModel[148].addShapeBox(-12F, 6F, 0F, 2, 3, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 124
		hipsModel[148].setRotationPoint(0F, -28F, 0F);
		hipsModel[148].rotateAngleY = 0.20943951F;

		hipsModel[149].addShapeBox(-12F, 6F, -1F, 2, 3, 1, 0F,-1F, -1.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		hipsModel[149].setRotationPoint(0F, -28F, 0F);
		hipsModel[149].rotateAngleY = 0.20943951F;

		hipsModel[150].addShapeBox(-12F, 9F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .15F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, .5F, 0F, -1F); // Box 126
		hipsModel[150].setRotationPoint(0F, -28F, 0F);
		hipsModel[150].rotateAngleY = 0.20943951F;

		hipsModel[151].addShapeBox(-12F, 9F, -1F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		hipsModel[151].setRotationPoint(0F, -28F, 0F);
		hipsModel[151].rotateAngleY = 0.20943951F;

		hipsModel[152].addShapeBox(-11F, 9F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .15F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, .5F, 0F, 0F); // Box 128
		hipsModel[152].setRotationPoint(0F, -28F, 0F);
		hipsModel[152].rotateAngleY = 0.20943951F;

		hipsModel[153].addShapeBox(-11F, 9F, -1F, 1, 3, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 129
		hipsModel[153].setRotationPoint(0F, -28F, 0F);
		hipsModel[153].rotateAngleY = 0.20943951F;

		hipsModel[154].addShapeBox(-10F, 9F, -1F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		hipsModel[154].setRotationPoint(0F, -28F, 0F);
		hipsModel[154].rotateAngleY = 0.20943951F;

		hipsModel[155].addShapeBox(-12F, 12F, -1F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		hipsModel[155].setRotationPoint(0F, -28F, 0F);
		hipsModel[155].rotateAngleY = 0.20943951F;

		hipsModel[156].addShapeBox(-10F, 12F, -1F, 2, 2, 1, 0F,0F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		hipsModel[156].setRotationPoint(0F, -28F, 0F);
		hipsModel[156].rotateAngleY = 0.20943951F;

		hipsModel[157].addShapeBox(-12F, 14F, -1F, 2, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 133
		hipsModel[157].setRotationPoint(0F, -28F, 0F);
		hipsModel[157].rotateAngleY = 0.20943951F;

		hipsModel[158].addShapeBox(-10F, 14F, -1F, 2, 3, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 134
		hipsModel[158].setRotationPoint(0F, -28F, 0F);
		hipsModel[158].rotateAngleY = 0.20943951F;

		hipsModel[159].addShapeBox(-10F, 9F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F); // Box 135
		hipsModel[159].setRotationPoint(0F, -28F, 0F);
		hipsModel[159].rotateAngleY = 0.20943951F;

		hipsModel[160].addShapeBox(-10F, 12F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F); // Box 136
		hipsModel[160].setRotationPoint(0F, -28F, 0F);
		hipsModel[160].rotateAngleY = 0.20943951F;

		hipsModel[161].addShapeBox(-12F, 12F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 137
		hipsModel[161].setRotationPoint(0F, -28F, 0F);
		hipsModel[161].rotateAngleY = 0.20943951F;

		hipsModel[162].addShapeBox(-12F, 14F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F); // Box 138
		hipsModel[162].setRotationPoint(0F, -28F, 0F);
		hipsModel[162].rotateAngleY = 0.20943951F;

		hipsModel[163].addShapeBox(-10F, 14F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 139
		hipsModel[163].setRotationPoint(0F, -28F, 0F);
		hipsModel[163].rotateAngleY = 0.20943951F;

		hipsModel[164].addShapeBox(8.5F, 5F, -5F, 2, 2, 3, 0F,0F, 0F, 0F, -0.8F, -1F, -2F, -0.8F, -1F, -1F, 0F, 1F, -2F, 0F, 0F, 1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 143
		hipsModel[164].setRotationPoint(0F, -28F, 0F);

		hipsModel[165].addShapeBox(8.5F, 7F, -5F, 1, 2, 3, 0F,0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, -2F); // Box 144
		hipsModel[165].setRotationPoint(0F, -28F, 0F);

		hipsModel[166].addShapeBox(6.5F, 7F, -6F, 2, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 145
		hipsModel[166].setRotationPoint(0F, -28F, 0F);

		hipsModel[167].addShapeBox(6.5F, 4F, -6F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		hipsModel[167].setRotationPoint(0F, -28F, 0F);

		hipsModel[168].addShapeBox(3.5F, 4F, -7F, 3, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.7F, 0F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 147
		hipsModel[168].setRotationPoint(0F, -28F, 0F);

		hipsModel[169].addShapeBox(3.5F, 8F, -7F, 3, 3, 2, 0F,0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 148
		hipsModel[169].setRotationPoint(0F, -28F, 0F);

		hipsModel[170].addShapeBox(1.5F, 4F, -8F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 149
		hipsModel[170].setRotationPoint(0F, -28F, 0F);

		hipsModel[171].addShapeBox(1.5F, 8F, -8F, 2, 4, 2, 0F,0F, 0F, 0.2F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 150
		hipsModel[171].setRotationPoint(0F, -28F, 0F);

		hipsModel[172].addShapeBox(-0.5F, 4F, -8F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 151
		hipsModel[172].setRotationPoint(0F, -28F, 0F);

		hipsModel[173].addShapeBox(-0.5F, 8F, -8F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		hipsModel[173].setRotationPoint(0F, -28F, 0F);

		hipsModel[174].addShapeBox(-2.5F, 5F, -7.5F, 2, 4, 1, 0F,0F, -2F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 153
		hipsModel[174].setRotationPoint(0F, -28F, 0F);

		hipsModel[175].addShapeBox(-2.5F, 9F, -7.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 1F, 0.5F); // Box 154
		hipsModel[175].setRotationPoint(0F, -28F, 0F);

		hipsModel[176].addShapeBox(-4.5F, 7F, -7F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 155
		hipsModel[176].setRotationPoint(0F, -28F, 0F);

		hipsModel[177].addShapeBox(-4.5F, 11F, -7F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 156
		hipsModel[177].setRotationPoint(0F, -28F, 0F);

		hipsModel[178].addShapeBox(-6.5F, 8F, -7F, 2, 6, 1, 0F,0F, -3F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 1F, 1F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F, 0F, 1.5F, 0F, 1.5F); // Box 157
		hipsModel[178].setRotationPoint(0F, -28F, 0F);

		hipsModel[179].addShapeBox(-6.5F, 9F, -7F, 2, 6, 1, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 1F, -1F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 1.5F, -1F, 1.5F); // Box 158
		hipsModel[179].setRotationPoint(0F, -28F, 0F);

		hipsModel[180].addShapeBox(1.5F, 3.5F, -7F, 2, 1, 2, 0F,0F, -0.3F, -0.5F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 159
		hipsModel[180].setRotationPoint(0F, -28F, 0F);

		hipsModel[181].addShapeBox(-1.5F, 3.5F, -7F, 3, 1, 1, 0F,0F, -0.8F, -1F, 0F, -0.3F, -0.5F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 160
		hipsModel[181].setRotationPoint(0F, -28F, 0F);

		hipsModel[182].addShapeBox(7.6F, -17F, -1F, 12, 14, 2, 0F,-6.5F, -6.7F, -.22F, -6.5F, -6.5F, .25F, -6.5F, -6.5F, .25F, -6.5F, -6.7F, -.22F, -6.5F, -6.7F, -.22F, -6.5F, -6.5F, .25F, -6.5F, -6.5F, .25F, -6.5F, -6.7F, -.22F); // Box 161
		hipsModel[182].setRotationPoint(0F, -28F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 141

		leftArmModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		leftArmModel[0].setRotationPoint(7F, -28F, 6F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 2, 15, textureX, textureY); // Box 142

		rightArmModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		rightArmModel[0].setRotationPoint(7F, -28F, -6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 1
		leftLegModel[2] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 2
		leftLegModel[3] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 3
		leftLegModel[4] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 4
		leftLegModel[5] = new ModelRendererTurbo(this, 4, 87, textureX, textureY); // Box 5
		leftLegModel[6] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 6
		leftLegModel[7] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 8
		leftLegModel[8] = new ModelRendererTurbo(this, 10, 93, textureX, textureY); // Box 9
		leftLegModel[9] = new ModelRendererTurbo(this, 16, 93, textureX, textureY); // Box 11
		leftLegModel[10] = new ModelRendererTurbo(this, 10, 98, textureX, textureY); // Box 12
		leftLegModel[11] = new ModelRendererTurbo(this, 4, 98, textureX, textureY); // Box 13
		leftLegModel[12] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 14
		leftLegModel[13] = new ModelRendererTurbo(this, 4, 112, textureX, textureY); // Box 15
		leftLegModel[14] = new ModelRendererTurbo(this, 4, 116, textureX, textureY); // Box 16
		leftLegModel[15] = new ModelRendererTurbo(this, 10, 116, textureX, textureY); // Box 17
		leftLegModel[16] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 9
		leftLegModel[17] = new ModelRendererTurbo(this, 9, 87, textureX, textureY); // Box 10
		leftLegModel[18] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 11
		leftLegModel[19] = new ModelRendererTurbo(this, 14, 87, textureX, textureY); // Box 12
		leftLegModel[20] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 13
		leftLegModel[21] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 15
		leftLegModel[22] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 16
		leftLegModel[23] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 17
		leftLegModel[24] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 18
		leftLegModel[25] = new ModelRendererTurbo(this, 4, 93, textureX, textureY); // Box 29
		leftLegModel[26] = new ModelRendererTurbo(this, 22, 93, textureX, textureY); // Box 30
		leftLegModel[27] = new ModelRendererTurbo(this, 10, 116, textureX, textureY); // Box 33
		leftLegModel[28] = new ModelRendererTurbo(this, 15, 116, textureX, textureY); // Box 34
		leftLegModel[29] = new ModelRendererTurbo(this, 4, 120, textureX, textureY); // Box 35
		leftLegModel[30] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 36
		leftLegModel[31] = new ModelRendererTurbo(this, 9, 87, textureX, textureY); // Box 37
		leftLegModel[32] = new ModelRendererTurbo(this, 14, 87, textureX, textureY); // Box 38
		leftLegModel[33] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 39
		leftLegModel[34] = new ModelRendererTurbo(this, 16, 93, textureX, textureY); // Box 40
		leftLegModel[35] = new ModelRendererTurbo(this, 10, 93, textureX, textureY); // Box 41
		leftLegModel[36] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 42
		leftLegModel[37] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 44
		leftLegModel[38] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 45
		leftLegModel[39] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 46
		leftLegModel[40] = new ModelRendererTurbo(this, 4, 98, textureX, textureY); // Box 48
		leftLegModel[41] = new ModelRendererTurbo(this, 10, 98, textureX, textureY); // Box 49
		leftLegModel[42] = new ModelRendererTurbo(this, 4, 112, textureX, textureY); // Box 52
		leftLegModel[43] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 53
		leftLegModel[44] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 120
		leftLegModel[45] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 121

		leftLegModel[0].addShapeBox(-1F, -2F, -3F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftLegModel[0].setRotationPoint(0F, -19F, 7F);

		leftLegModel[1].addShapeBox(1F, -2F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftLegModel[1].setRotationPoint(0F, -19F, 7F);

		leftLegModel[2].addShapeBox(-2F, -2F, -3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 2
		leftLegModel[2].setRotationPoint(0F, -19F, 7F);

		leftLegModel[3].addShapeBox(-2F, 0F, -3F, 1, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 3
		leftLegModel[3].setRotationPoint(0F, -19F, 7F);

		leftLegModel[4].addShapeBox(1F, 0F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 4
		leftLegModel[4].setRotationPoint(0F, -19F, 7F);

		leftLegModel[5].addShapeBox(0F, 3F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 5
		leftLegModel[5].setRotationPoint(0F, -19F, 7F);

		leftLegModel[6].addShapeBox(-1F, 0F, -4.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 6
		leftLegModel[6].setRotationPoint(0F, -19F, 7F);

		leftLegModel[7].addShapeBox(-3F, 3F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 8
		leftLegModel[7].setRotationPoint(0F, -19F, 7F);

		leftLegModel[8].addShapeBox(-4F, 7F, -2.5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, -.5F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 9
		leftLegModel[8].setRotationPoint(0F, -19F, 7F);

		leftLegModel[9].addShapeBox(-5F, 7F, -2.5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -.5F, -1F, 0F, -.5F); // Box 11
		leftLegModel[9].setRotationPoint(0F, -19F, 7F);

		leftLegModel[10].addShapeBox(-4.5F, 9F, -2.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -.5F, -1.7F, 0F, -.5F); // Box 12
		leftLegModel[10].setRotationPoint(0F, -19F, 7F);

		leftLegModel[11].addShapeBox(-3.5F, 9F, -2.5F, 1, 6, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -.5F, -0.7F, 0F, -.5F); // Box 13
		leftLegModel[11].setRotationPoint(0F, -19F, 7F);

		leftLegModel[12].addShapeBox(-3F, 16F, -2.5F, 1, 1, 1, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -.5F, 0F, 0F); // Box 14
		leftLegModel[12].setRotationPoint(0F, -19F, 7F);

		leftLegModel[13].addShapeBox(-3F, 17F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F); // Box 15
		leftLegModel[13].setRotationPoint(0F, -19F, 7F);

		leftLegModel[14].addShapeBox(-2F, 18F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 16
		leftLegModel[14].setRotationPoint(0F, -19F, 7F);

		leftLegModel[15].addShapeBox(0F, 18F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 17
		leftLegModel[15].setRotationPoint(0F, -19F, 7F);

		leftLegModel[16].addShapeBox(-3F, 15F, -2.5F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftLegModel[16].setRotationPoint(0F, -19F, 7F);

		leftLegModel[17].addShapeBox(0F, 3F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, -.5F, 4F, 0F, -.5F); // Box 10
		leftLegModel[17].setRotationPoint(0F, -19F, 7F);

		leftLegModel[18].addShapeBox(-3F, 3F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, 1.5F, 0F, -.5F); // Box 11
		leftLegModel[18].setRotationPoint(0F, -19F, 7F);

		leftLegModel[19].addShapeBox(-2F, 3F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -.5F, 2F, 0F, -.5F); // Box 12
		leftLegModel[19].setRotationPoint(0F, -19F, 7F);

		leftLegModel[20].addShapeBox(1F, 0F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, .5F); // Box 13
		leftLegModel[20].setRotationPoint(0F, -19F, 7F);

		leftLegModel[21].addShapeBox(-2F, 0F, -2F, 1, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, .5F, .5F, 0F, 0F); // Box 15
		leftLegModel[21].setRotationPoint(0F, -19F, 7F);

		leftLegModel[22].addShapeBox(-2F, -2F, -2F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, -.3F, -1.5F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 16
		leftLegModel[22].setRotationPoint(0F, -19F, 7F);

		leftLegModel[23].addShapeBox(-1F, -2F, -2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 17
		leftLegModel[23].setRotationPoint(0F, -19F, 7F);

		leftLegModel[24].addShapeBox(1F, -2F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 18
		leftLegModel[24].setRotationPoint(0F, -19F, 7F);

		leftLegModel[25].addShapeBox(-4F, 7F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.5F, 0.2F, 0F, -.5F, 0.2F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 29
		leftLegModel[25].setRotationPoint(0F, -19F, 7F);

		leftLegModel[26].addShapeBox(-5F, 7F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 30
		leftLegModel[26].setRotationPoint(0F, -19F, 7F);

		leftLegModel[27].addShapeBox(1F, 18F, -3F, 1, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 33
		leftLegModel[27].setRotationPoint(0F, -19F, 7F);

		leftLegModel[28].addShapeBox(2F, 18F, -3F, 1, 1, 1, 0F,0F, -.1F, -.1F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.1F, -.1F); // Box 34
		leftLegModel[28].setRotationPoint(0F, -19F, 7F);

		leftLegModel[29].addShapeBox(-2F, 18F, -1F, 2, 1, 1, 0F,0F, 1F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -2F, -1F, 0F, -.2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F); // Box 35
		leftLegModel[29].setRotationPoint(0F, -19F, 7F);

		leftLegModel[30].addShapeBox(0F, 18F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 36
		leftLegModel[30].setRotationPoint(0F, -19F, 7F);

		leftLegModel[31].addShapeBox(0F, 3F, -4F, 1, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 37
		leftLegModel[31].setRotationPoint(0F, -19F, 7F);

		leftLegModel[32].addShapeBox(-2F, 3F, -4F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 38
		leftLegModel[32].setRotationPoint(0F, -19F, 7F);

		leftLegModel[33].addShapeBox(-3F, 3F, -4F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 39
		leftLegModel[33].setRotationPoint(0F, -19F, 7F);

		leftLegModel[34].addShapeBox(-5F, 7F, -3.5F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
		leftLegModel[34].setRotationPoint(0F, -19F, 7F);

		leftLegModel[35].addShapeBox(-4F, 7F, -3.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, 0.2F, 0F, 0F, -0.5F, 0F, 0F); // Box 41
		leftLegModel[35].setRotationPoint(0F, -19F, 7F);

		leftLegModel[36].addShapeBox(-2F, 0F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 42
		leftLegModel[36].setRotationPoint(0F, -19F, 7F);

		leftLegModel[37].addShapeBox(1F, 0F, -4F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 44
		leftLegModel[37].setRotationPoint(0F, -19F, 7F);

		leftLegModel[38].addShapeBox(1F, -2F, -4F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftLegModel[38].setRotationPoint(0F, -19F, 7F);

		leftLegModel[39].addShapeBox(-1F, -2F, -4F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftLegModel[39].setRotationPoint(0F, -19F, 7F);

		leftLegModel[40].addShapeBox(-3.5F, 9F, -3.5F, 1, 6, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, 0F, -0.7F, 0F, 0F); // Box 48
		leftLegModel[40].setRotationPoint(0F, -19F, 7F);

		leftLegModel[41].addShapeBox(-4.5F, 9F, -3.5F, 1, 6, 1, 0F,-0.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, -.5F, 0.7F, 0F, -.5F, 0.7F, 0F, 0F, -1F, 0F, 0F); // Box 49
		leftLegModel[41].setRotationPoint(0F, -19F, 7F);

		leftLegModel[42].addShapeBox(-3F, 17F, -3.5F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		leftLegModel[42].setRotationPoint(0F, -19F, 7F);

		leftLegModel[43].addShapeBox(-2F, -2F, -4F, 1, 2, 1, 0F,-0.3F, -1.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 53
		leftLegModel[43].setRotationPoint(0F, -19F, 7F);

		leftLegModel[44].addShapeBox(-3F, 16F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftLegModel[44].setRotationPoint(0F, -19F, 7F);

		leftLegModel[45].addShapeBox(-3F, 15F, -3.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F); // Box 121
		leftLegModel[45].setRotationPoint(0F, -19F, 7F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 4, 112, textureX, textureY); // Box 54
		rightLegModel[1] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 61
		rightLegModel[2] = new ModelRendererTurbo(this, 14, 87, textureX, textureY); // Box 62
		rightLegModel[3] = new ModelRendererTurbo(this, 9, 87, textureX, textureY); // Box 63
		rightLegModel[4] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 64
		rightLegModel[5] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 65
		rightLegModel[6] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 66
		rightLegModel[7] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 67
		rightLegModel[8] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 68
		rightLegModel[9] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 69
		rightLegModel[10] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 70
		rightLegModel[11] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 71
		rightLegModel[12] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 72
		rightLegModel[13] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 73
		rightLegModel[14] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 74
		rightLegModel[15] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 75
		rightLegModel[16] = new ModelRendererTurbo(this, 4, 87, textureX, textureY); // Box 76
		rightLegModel[17] = new ModelRendererTurbo(this, 22, 87, textureX, textureY); // Box 83
		rightLegModel[18] = new ModelRendererTurbo(this, 14, 87, textureX, textureY); // Box 84
		rightLegModel[19] = new ModelRendererTurbo(this, 9, 87, textureX, textureY); // Box 85
		rightLegModel[20] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 86
		rightLegModel[21] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 87
		rightLegModel[22] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 88
		rightLegModel[23] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 89
		rightLegModel[24] = new ModelRendererTurbo(this, 4, 78, textureX, textureY); // Box 90
		rightLegModel[25] = new ModelRendererTurbo(this, 4, 120, textureX, textureY); // Box 91
		rightLegModel[26] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 92
		rightLegModel[27] = new ModelRendererTurbo(this, 4, 112, textureX, textureY); // Box 95
		rightLegModel[28] = new ModelRendererTurbo(this, 4, 116, textureX, textureY); // Box 96
		rightLegModel[29] = new ModelRendererTurbo(this, 10, 116, textureX, textureY); // Box 97
		rightLegModel[30] = new ModelRendererTurbo(this, 10, 116, textureX, textureY); // Box 98
		rightLegModel[31] = new ModelRendererTurbo(this, 15, 116, textureX, textureY); // Box 99
		rightLegModel[32] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 122
		rightLegModel[33] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 123
		rightLegModel[34] = new ModelRendererTurbo(this, 4, 98, textureX, textureY); // Box 124
		rightLegModel[35] = new ModelRendererTurbo(this, 4, 98, textureX, textureY); // Box 125
		rightLegModel[36] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 126
		rightLegModel[37] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 127
		rightLegModel[38] = new ModelRendererTurbo(this, 4, 93, textureX, textureY); // Box 128
		rightLegModel[39] = new ModelRendererTurbo(this, 10, 93, textureX, textureY); // Box 129
		rightLegModel[40] = new ModelRendererTurbo(this, 10, 93, textureX, textureY); // Box 130
		rightLegModel[41] = new ModelRendererTurbo(this, 22, 93, textureX, textureY); // Box 131
		rightLegModel[42] = new ModelRendererTurbo(this, 16, 93, textureX, textureY); // Box 132
		rightLegModel[43] = new ModelRendererTurbo(this, 16, 93, textureX, textureY); // Box 133
		rightLegModel[44] = new ModelRendererTurbo(this, 10, 98, textureX, textureY); // Box 134
		rightLegModel[45] = new ModelRendererTurbo(this, 10, 98, textureX, textureY); // Box 135

		rightLegModel[0].addShapeBox(-3F, 17F, 1.5F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 54
		rightLegModel[0].setRotationPoint(0F, -19F, -7F);

		rightLegModel[1].addShapeBox(-3F, 3F, 1F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 61
		rightLegModel[1].setRotationPoint(0F, -19F, -7F);

		rightLegModel[2].addShapeBox(-2F, 3F, 1F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 2F, 0F, 0F); // Box 62
		rightLegModel[2].setRotationPoint(0F, -19F, -7F);

		rightLegModel[3].addShapeBox(0F, 3F, 1F, 1, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 63
		rightLegModel[3].setRotationPoint(0F, -19F, -7F);

		rightLegModel[4].addShapeBox(-2F, 0F, 1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 64
		rightLegModel[4].setRotationPoint(0F, -19F, -7F);

		rightLegModel[5].addShapeBox(1F, 0F, 1F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 65
		rightLegModel[5].setRotationPoint(0F, -19F, -7F);

		rightLegModel[6].addShapeBox(1F, -2F, 1F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightLegModel[6].setRotationPoint(0F, -19F, -7F);

		rightLegModel[7].addShapeBox(-2F, -2F, 1F, 1, 2, 1, 0F,-0.3F, -1.5F, -0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
		rightLegModel[7].setRotationPoint(0F, -19F, -7F);

		rightLegModel[8].addShapeBox(-1F, -2F, 1F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		rightLegModel[8].setRotationPoint(0F, -19F, -7F);

		rightLegModel[9].addShapeBox(-1F, 0F, 0.5F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 69
		rightLegModel[9].setRotationPoint(0F, -19F, -7F);

		rightLegModel[10].addShapeBox(-1F, -2F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightLegModel[10].setRotationPoint(0F, -19F, -7F);

		rightLegModel[11].addShapeBox(1F, -2F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightLegModel[11].setRotationPoint(0F, -19F, -7F);

		rightLegModel[12].addShapeBox(-2F, -2F, 2F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 72
		rightLegModel[12].setRotationPoint(0F, -19F, -7F);

		rightLegModel[13].addShapeBox(-2F, 0F, 2F, 1, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 73
		rightLegModel[13].setRotationPoint(0F, -19F, -7F);

		rightLegModel[14].addShapeBox(-3F, 3F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 74
		rightLegModel[14].setRotationPoint(0F, -19F, -7F);

		rightLegModel[15].addShapeBox(1F, 0F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 75
		rightLegModel[15].setRotationPoint(0F, -19F, -7F);

		rightLegModel[16].addShapeBox(0F, 3F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 76
		rightLegModel[16].setRotationPoint(0F, -19F, -7F);

		rightLegModel[17].addShapeBox(-3F, 3F, 3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, 1.5F, 0F, -.5F); // Box 83
		rightLegModel[17].setRotationPoint(0F, -19F, -7F);

		rightLegModel[18].addShapeBox(-2F, 3F, 3F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -.5F, 2F, 0F, -.5F); // Box 84
		rightLegModel[18].setRotationPoint(0F, -19F, -7F);

		rightLegModel[19].addShapeBox(0F, 3F, 3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, -.5F, 4F, 0F, -.5F); // Box 85
		rightLegModel[19].setRotationPoint(0F, -19F, -7F);

		rightLegModel[20].addShapeBox(1F, 0F, 3F, 1, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, .5F); // Box 86
		rightLegModel[20].setRotationPoint(0F, -19F, -7F);

		rightLegModel[21].addShapeBox(1F, -2F, 3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 87
		rightLegModel[21].setRotationPoint(0F, -19F, -7F);

		rightLegModel[22].addShapeBox(-1F, -2F, 3F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 88
		rightLegModel[22].setRotationPoint(0F, -19F, -7F);

		rightLegModel[23].addShapeBox(-2F, -2F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, -.3F, -1.5F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 89
		rightLegModel[23].setRotationPoint(0F, -19F, -7F);

		rightLegModel[24].addShapeBox(-2F, 0F, 3F, 1, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, .5F, .5F, 0F, 0F); // Box 90
		rightLegModel[24].setRotationPoint(0F, -19F, -7F);

		rightLegModel[25].addShapeBox(-2F, 18F, 0F, 2, 1, 1, 0F,0F, 1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F); // Box 91
		rightLegModel[25].setRotationPoint(0F, -19F, -7F);

		rightLegModel[26].addShapeBox(0F, 18F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 92
		rightLegModel[26].setRotationPoint(0F, -19F, -7F);

		rightLegModel[27].addShapeBox(-3F, 17F, 2.5F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F); // Box 95
		rightLegModel[27].setRotationPoint(0F, -19F, -7F);

		rightLegModel[28].addShapeBox(-2F, 18F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 96
		rightLegModel[28].setRotationPoint(0F, -19F, -7F);

		rightLegModel[29].addShapeBox(0F, 18F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 97
		rightLegModel[29].setRotationPoint(0F, -19F, -7F);

		rightLegModel[30].addShapeBox(1F, 18F, 2F, 1, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 98
		rightLegModel[30].setRotationPoint(0F, -19F, -7F);

		rightLegModel[31].addShapeBox(2F, 18F, 2F, 1, 1, 1, 0F,0F, -.1F, -.1F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.1F, -.1F); // Box 99
		rightLegModel[31].setRotationPoint(0F, -19F, -7F);

		rightLegModel[32].addShapeBox(-3F, 15F, 2.5F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightLegModel[32].setRotationPoint(0F, -19F, -7F);

		rightLegModel[33].addShapeBox(-3F, 15F, 1.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F); // Box 123
		rightLegModel[33].setRotationPoint(0F, -19F, -7F);

		rightLegModel[34].addShapeBox(-3.5F, 9F, 1.5F, 1, 6, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, 0F, -0.7F, 0F, 0F); // Box 124
		rightLegModel[34].setRotationPoint(0F, -19F, -7F);

		rightLegModel[35].addShapeBox(-3.5F, 9F, 2.5F, 1, 6, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -.5F, -0.7F, 0F, -.5F); // Box 125
		rightLegModel[35].setRotationPoint(0F, -19F, -7F);

		rightLegModel[36].addShapeBox(-3F, 16F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightLegModel[36].setRotationPoint(0F, -19F, -7F);

		rightLegModel[37].addShapeBox(-3F, 16F, 2.5F, 1, 1, 1, 0F,0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -.5F, 0F, 0F); // Box 127
		rightLegModel[37].setRotationPoint(0F, -19F, -7F);

		rightLegModel[38].addShapeBox(-4F, 7F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.5F, 0.2F, 0F, -.5F, 0.2F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 128
		rightLegModel[38].setRotationPoint(0F, -19F, -7F);

		rightLegModel[39].addShapeBox(-4F, 7F, 2.5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, -.5F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 129
		rightLegModel[39].setRotationPoint(0F, -19F, -7F);

		rightLegModel[40].addShapeBox(-4F, 7F, 1.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, 0.2F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		rightLegModel[40].setRotationPoint(0F, -19F, -7F);

		rightLegModel[41].addShapeBox(-5F, 7F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, -.5F, -0.5F, 0F, -.5F); // Box 131
		rightLegModel[41].setRotationPoint(0F, -19F, -7F);

		rightLegModel[42].addShapeBox(-5F, 7F, 1.5F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -.5F, 0.5F, 0F, -.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 132
		rightLegModel[42].setRotationPoint(0F, -19F, -7F);

		rightLegModel[43].addShapeBox(-5F, 7F, 2.5F, 1, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -.5F, -1F, 0F, -.5F); // Box 133
		rightLegModel[43].setRotationPoint(0F, -19F, -7F);

		rightLegModel[44].addShapeBox(-4.5F, 9F, 1.5F, 1, 6, 1, 0F,-0.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, -.5F, 0.7F, 0F, -.5F, 0.7F, 0F, 0F, -1F, 0F, 0F); // Box 134
		rightLegModel[44].setRotationPoint(0F, -19F, -7F);

		rightLegModel[45].addShapeBox(-4.5F, 9F, 2.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -.5F, -1.7F, 0F, -.5F); // Box 135
		rightLegModel[45].setRotationPoint(0F, -19F, -7F);
	}
}