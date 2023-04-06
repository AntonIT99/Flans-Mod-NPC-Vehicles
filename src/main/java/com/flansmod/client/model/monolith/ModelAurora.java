//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aurora
// Model Creator: 
// Created on: 25.07.2020 - 13:27:24
// Last changed on: 25.07.2020 - 13:27:24

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAurora extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelAurora() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[193];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 31
		bodyModel[57] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 32
		bodyModel[58] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 9
		bodyModel[95] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 10
		bodyModel[96] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 11
		bodyModel[97] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 109
		bodyModel[103] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 110
		bodyModel[104] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 112
		bodyModel[106] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 113
		bodyModel[107] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 115
		bodyModel[109] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 116
		bodyModel[110] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 117
		bodyModel[111] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 118
		bodyModel[112] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 119
		bodyModel[113] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 121
		bodyModel[115] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 122
		bodyModel[116] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 138
		bodyModel[132] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 139
		bodyModel[133] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 140
		bodyModel[134] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 141
		bodyModel[135] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 142
		bodyModel[136] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 143
		bodyModel[137] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 144
		bodyModel[138] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 145
		bodyModel[139] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 146
		bodyModel[140] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 147
		bodyModel[141] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 148
		bodyModel[142] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 149
		bodyModel[143] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 150
		bodyModel[144] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 151
		bodyModel[145] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 152
		bodyModel[146] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 153
		bodyModel[147] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 154
		bodyModel[148] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 155
		bodyModel[149] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 156
		bodyModel[150] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 157
		bodyModel[151] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 158
		bodyModel[152] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 159
		bodyModel[153] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 160
		bodyModel[154] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 161
		bodyModel[155] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 162
		bodyModel[156] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 163
		bodyModel[157] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 164
		bodyModel[158] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 165
		bodyModel[159] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 166
		bodyModel[160] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 168
		bodyModel[162] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 169
		bodyModel[163] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 170
		bodyModel[164] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 171
		bodyModel[165] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 172
		bodyModel[166] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 173
		bodyModel[167] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 174
		bodyModel[168] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 175
		bodyModel[169] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 176
		bodyModel[170] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 177
		bodyModel[171] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 178
		bodyModel[172] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 179
		bodyModel[173] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 180
		bodyModel[174] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 181
		bodyModel[175] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 182
		bodyModel[176] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 183
		bodyModel[177] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 184
		bodyModel[178] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 185
		bodyModel[179] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 186
		bodyModel[180] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 187
		bodyModel[181] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 188
		bodyModel[182] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 189
		bodyModel[183] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 190
		bodyModel[184] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 191
		bodyModel[185] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 192
		bodyModel[186] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 193
		bodyModel[187] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 194
		bodyModel[188] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 195
		bodyModel[189] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 196
		bodyModel[190] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 197
		bodyModel[191] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 198
		bodyModel[192] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 199

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 13, 30, 0F,30F, 0F, -1.5F, 30F, 0F, -1.5F, 30F, 0F, -1.5F, 30F, 0F, -1.5F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-3F, -3F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 13, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[1].setRotationPoint(-56F, -3F, -13.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 29, 9, 21, 0F,0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-85F, 1F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 9, 15, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-102F, 1F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 9, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-113F, 1F, -4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0.5F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-122F, 1F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 13, 27, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 7
		bodyModel[6].setRotationPoint(33F, -3F, -13.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 13, 26, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 8
		bodyModel[7].setRotationPoint(57F, -3F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 13, 23, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 9
		bodyModel[8].setRotationPoint(75F, -3F, -11.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 13, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 10
		bodyModel[9].setRotationPoint(90F, -3F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 13, 15, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[10].setRotationPoint(100F, -3F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1.5F, 0F, -3F, 1.5F, 0F, -3F, 0F, 0F, 0.5F); // Box 12
		bodyModel[11].setRotationPoint(110F, -3F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 8, 9, 0F,0F, 0F, 0.5F, 1.5F, 0F, -3F, 1.5F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 5F, 0F, -3F, 5F, 0F, -3F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(110F, 10F, -4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, 0F, 5F, 0F, -3F, 5F, 0F, -3F, 0F, 0F, 0F, 10F, 1F, 1F, 1.5F, -2F, -3F, 1.5F, -2F, -3F, 10F, 1F, 1F); // Box 14
		bodyModel[13].setRotationPoint(110F, 18F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 8, 15, 0F,0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 6F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -2F); // Box 15
		bodyModel[14].setRotationPoint(100F, 10F, -7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 14, 19, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 16
		bodyModel[15].setRotationPoint(90F, 10F, -9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 14, 23, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 17
		bodyModel[16].setRotationPoint(75F, 10F, -11.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 14, 26, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -4F); // Box 18
		bodyModel[17].setRotationPoint(57F, 10F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 24, 14, 27, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4F); // Box 19
		bodyModel[18].setRotationPoint(33F, 10F, -13.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 14, 30, 0F,30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, -5.5F, 30F, 0F, -5.5F, 30F, 0F, -5.5F, 30F, 0F, -5.5F); // Box 20
		bodyModel[19].setRotationPoint(-3F, 10F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 14, 27, 0F,0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 21
		bodyModel[20].setRotationPoint(-56F, 10F, -13.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 29, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 2F, -4.5F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 2F, -4.5F); // Box 22
		bodyModel[21].setRotationPoint(-85F, 10F, -10.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 11, 15, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -4F, -5.5F); // Box 23
		bodyModel[22].setRotationPoint(-102F, 10F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -3F, -3.5F); // Box 24
		bodyModel[23].setRotationPoint(-113F, 10F, -4.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0.5F, 0F, 0F, -4F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, -1.5F, -0.5F); // Box 25
		bodyModel[24].setRotationPoint(-122F, 10F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 50, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-110F, 14F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-115F, 12F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-114F, 22F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, -1F, 7, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-122F, 13F, 0F);

		bodyModel[29].addShapeBox(-0.5F, -0.75F, -1.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 29
		bodyModel[29].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[29].rotateAngleX = 0.41887902F;
		bodyModel[29].rotateAngleY = -1.57079633F;

		bodyModel[30].addShapeBox(-0.5F, -0.35F, -1.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		bodyModel[30].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[30].rotateAngleX = 0.41887902F;
		bodyModel[30].rotateAngleY = -1.57079633F;

		bodyModel[31].addShapeBox(-0.5F, 0.25F, -1.7F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 31
		bodyModel[31].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[31].rotateAngleX = 0.41887902F;
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(-0.5F, 0.35F, -1.9F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[32].rotateAngleX = 0.41887902F;
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addShapeBox(-0.5F, -1F, -1.3F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 34
		bodyModel[33].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[33].rotateAngleX = 0.41887902F;
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.62F, -0.35F, -0.3F, -0.22F, -0.35F, -0.3F, -0.22F, -0.35F, 0F, -0.62F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 35
		bodyModel[34].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[34].rotateAngleX = 0.41887902F;
		bodyModel[34].rotateAngleY = -1.57079633F;

		bodyModel[35].addShapeBox(-0.8F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 36
		bodyModel[35].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[35].rotateAngleX = 0.41887902F;
		bodyModel[35].rotateAngleY = -1.57079633F;

		bodyModel[36].addShapeBox(-0.2F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 37
		bodyModel[36].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[36].rotateAngleX = 0.41887902F;
		bodyModel[36].rotateAngleY = -1.57079633F;

		bodyModel[37].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.22F, -0.35F, -0.3F, -0.62F, -0.35F, -0.3F, -0.62F, -0.35F, 0F, -0.22F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 38
		bodyModel[37].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[37].rotateAngleX = 0.41887902F;
		bodyModel[37].rotateAngleY = -1.57079633F;

		bodyModel[38].addShapeBox(-0.75F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 39
		bodyModel[38].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[38].rotateAngleX = 0.41887902F;
		bodyModel[38].rotateAngleY = -1.57079633F;

		bodyModel[39].addShapeBox(-0.25F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 40
		bodyModel[39].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[39].rotateAngleX = 0.41887902F;
		bodyModel[39].rotateAngleY = -1.57079633F;

		bodyModel[40].addShapeBox(-1F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F); // Box 41
		bodyModel[40].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[40].rotateAngleX = 0.41887902F;
		bodyModel[40].rotateAngleY = -1.57079633F;

		bodyModel[41].addShapeBox(0F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, 0F); // Box 42
		bodyModel[41].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[41].rotateAngleX = 0.41887902F;
		bodyModel[41].rotateAngleY = -1.57079633F;

		bodyModel[42].addShapeBox(-1.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.3F, -0.05F, -0.35F, -0.3F, -0.05F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F); // Box 43
		bodyModel[42].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[42].rotateAngleX = 0.41887902F;
		bodyModel[42].rotateAngleY = -1.57079633F;

		bodyModel[43].addShapeBox(-1.5F, -0.75F, -1.45F, 1, 1, 1, 0F,-0.3F, 0.25F, -0.5F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, -0.3F, 0.25F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 44
		bodyModel[43].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[43].rotateAngleX = 0.41887902F;
		bodyModel[43].rotateAngleY = -1.57079633F;

		bodyModel[44].addShapeBox(-0.5F, -1.8F, -0.9F, 1, 1, 1, 0F,-0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F); // Box 45
		bodyModel[44].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[44].rotateAngleX = 0.41887902F;
		bodyModel[44].rotateAngleY = -1.57079633F;

		bodyModel[45].addShapeBox(0.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.05F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F); // Box 46
		bodyModel[45].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[45].rotateAngleX = 0.41887902F;
		bodyModel[45].rotateAngleY = -1.57079633F;

		bodyModel[46].addShapeBox(0.5F, -0.75F, -1.45F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, 0F, 0F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 47
		bodyModel[46].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[46].rotateAngleX = 0.41887902F;
		bodyModel[46].rotateAngleY = -1.57079633F;

		bodyModel[47].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 48
		bodyModel[47].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[47].rotateAngleX = 0.41887902F;
		bodyModel[47].rotateAngleY = -1.57079633F;

		bodyModel[48].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F); // Box 49
		bodyModel[48].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[48].rotateAngleX = 0.41887902F;
		bodyModel[48].rotateAngleY = -1.57079633F;

		bodyModel[49].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F); // Box 50
		bodyModel[49].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[49].rotateAngleX = 0.41887902F;
		bodyModel[49].rotateAngleY = -1.57079633F;

		bodyModel[50].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F); // Box 51
		bodyModel[50].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[50].rotateAngleX = 0.41887902F;
		bodyModel[50].rotateAngleY = -1.57079633F;

		bodyModel[51].addShapeBox(0.45F, 0.3F, -1.7F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 52
		bodyModel[51].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[51].rotateAngleX = 0.41887902F;
		bodyModel[51].rotateAngleY = -1.57079633F;

		bodyModel[52].addShapeBox(-2.2F, 0.0999999999999996F, -1.7F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, -1F, -0.45F, 0F); // Box 53
		bodyModel[52].setRotationPoint(118F, -1.2F, 0F);
		bodyModel[52].rotateAngleX = 0.41887902F;
		bodyModel[52].rotateAngleY = -1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 54
		bodyModel[53].setRotationPoint(38.5F, -33F, -4.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(41.5F, -33F, -4.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(44.5F, -33F, -4.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[56].setRotationPoint(115.5F, -16F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,-1.4F, -1.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1.4F, -1.5F, -0.2F, -1F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -1F, 1F, -0.2F); // Box 32
		bodyModel[57].setRotationPoint(104F, -16F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 59
		bodyModel[58].setRotationPoint(53.7F, -39F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F); // Box 60
		bodyModel[59].setRotationPoint(53.7F, -35F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 61
		bodyModel[60].setRotationPoint(52.5F, -67F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 41, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 62
		bodyModel[61].setRotationPoint(-57.7F, -39F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F, 2.2F, 0F, 2.2F); // Box 63
		bodyModel[62].setRotationPoint(-57.7F, -33F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 64
		bodyModel[63].setRotationPoint(-55.9F, -67F, -0.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,1.8F, 0F, 1.8F, 1.8F, 0F, 1.8F, 1.8F, 0F, 1.8F, 1.8F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[64].setRotationPoint(-57.7F, -31F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(35.5F, -11F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[66].setRotationPoint(35.5F, -16F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(39.5F, -16F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(45.5F, -6.5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 70
		bodyModel[69].setRotationPoint(49.5F, -11.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(45.5F, -11.5F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[71].setRotationPoint(50.7F, -15F, -3.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(57F, -10F, -4.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(52F, -8F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 9, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 75
		bodyModel[74].setRotationPoint(51.7F, -11F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 76
		bodyModel[75].setRotationPoint(-96.7F, -2F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		bodyModel[76].setRotationPoint(-98.7F, -4F, -1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 78
		bodyModel[77].setRotationPoint(10.5F, -6F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 81
		bodyModel[78].setRotationPoint(-32.5F, -6F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F); // Box 82
		bodyModel[79].setRotationPoint(55F, -2.9F, -15.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[80].setRotationPoint(52.5F, -6F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[81].setRotationPoint(55F, -2.9F, 10.5F);

		bodyModel[82].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 85
		bodyModel[82].setRotationPoint(99F, -5.5F, 0F);

		bodyModel[83].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 89
		bodyModel[83].setRotationPoint(59F, -5.5F, -13F);

		bodyModel[84].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 90
		bodyModel[84].setRotationPoint(59F, -5.5F, 13F);

		bodyModel[85].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 91
		bodyModel[85].setRotationPoint(-90F, -1.5F, 6F);

		bodyModel[86].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 92
		bodyModel[86].setRotationPoint(-90F, -1.5F, -6F);

		bodyModel[87].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 93
		bodyModel[87].setRotationPoint(-104F, -1.5F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F); // Box 94
		bodyModel[88].setRotationPoint(36F, -2.9F, -15.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 4, 5, 0F,0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[89].setRotationPoint(36F, -2.9F, 10.5F);

		bodyModel[90].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 96
		bodyModel[90].setRotationPoint(40F, -5.5F, -13F);

		bodyModel[91].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 97
		bodyModel[91].setRotationPoint(40F, -5.5F, 13F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F); // Box 98
		bodyModel[92].setRotationPoint(-79F, 1.1F, -14.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[93].setRotationPoint(-79F, 1.1F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 9
		bodyModel[94].setRotationPoint(-77F, -1.8F, -14.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[95].setRotationPoint(-77F, -0.8F, -13.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 11
		bodyModel[96].setRotationPoint(-77F, -1.8F, -18.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 37, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 103
		bodyModel[97].setRotationPoint(52.7F, -48F, -18.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 37, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 104
		bodyModel[98].setRotationPoint(-55F, -48F, -18.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 105
		bodyModel[99].setRotationPoint(-55F, -58F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 106
		bodyModel[100].setRotationPoint(52F, -58F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 107
		bodyModel[101].setRotationPoint(10.5F, -6F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 16, 3, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 109
		bodyModel[102].setRotationPoint(-32.5F, -6F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[103].setRotationPoint(35.5F, -11F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(35.5F, -16F, 4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 112
		bodyModel[105].setRotationPoint(39.5F, -16F, 4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[106].setRotationPoint(45.5F, -6.5F, 3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 114
		bodyModel[107].setRotationPoint(49.5F, -11.5F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[108].setRotationPoint(45.5F, -11.5F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[109].setRotationPoint(13.5F, -11F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[110].setRotationPoint(13.5F, -16F, 4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 118
		bodyModel[111].setRotationPoint(17.5F, -16F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[112].setRotationPoint(23.5F, -6.5F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 120
		bodyModel[113].setRotationPoint(27.5F, -11.5F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[114].setRotationPoint(23.5F, -11.5F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 122
		bodyModel[115].setRotationPoint(27.5F, -11.5F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[116].setRotationPoint(23.5F, -11.5F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[117].setRotationPoint(23.5F, -6.5F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[118].setRotationPoint(13.5F, -11F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[119].setRotationPoint(13.5F, -16F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 127
		bodyModel[120].setRotationPoint(17.5F, -16F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(22.5F, -33F, -4.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[122].setRotationPoint(19.5F, -33F, -4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 130
		bodyModel[123].setRotationPoint(16.5F, -33F, -4.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(-10.5F, -11F, 4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[125].setRotationPoint(-10.5F, -16F, 4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 133
		bodyModel[126].setRotationPoint(-6.5F, -16F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[127].setRotationPoint(-0.5F, -6.5F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 135
		bodyModel[128].setRotationPoint(3.5F, -11.5F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[129].setRotationPoint(-0.5F, -11.5F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 137
		bodyModel[130].setRotationPoint(3.5F, -11.5F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[131].setRotationPoint(-0.5F, -11.5F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[132].setRotationPoint(-0.5F, -6.5F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[133].setRotationPoint(-10.5F, -11F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[134].setRotationPoint(-10.5F, -16F, -8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 142
		bodyModel[135].setRotationPoint(-6.5F, -16F, -8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 143
		bodyModel[136].setRotationPoint(-1.5F, -33F, -4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[137].setRotationPoint(-4.5F, -33F, -4.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 32, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 145
		bodyModel[138].setRotationPoint(-7.5F, -33F, -4.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 146
		bodyModel[139].setRotationPoint(-77F, -1.8F, 11.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[140].setRotationPoint(-77F, -0.8F, 12.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 148
		bodyModel[141].setRotationPoint(-77F, -1.8F, 14.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 149
		bodyModel[142].setRotationPoint(-47F, -5.8F, -18F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 150
		bodyModel[143].setRotationPoint(-47F, -5.8F, -14F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[144].setRotationPoint(-47F, -4.8F, -13F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 152
		bodyModel[145].setRotationPoint(-12F, -5.8F, -18F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 153
		bodyModel[146].setRotationPoint(-12F, -5.8F, -14F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[147].setRotationPoint(-12F, -4.8F, -13F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 155
		bodyModel[148].setRotationPoint(-29F, -5.8F, -18F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 156
		bodyModel[149].setRotationPoint(-29F, -5.8F, -14F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[150].setRotationPoint(-29F, -4.8F, -13F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 158
		bodyModel[151].setRotationPoint(4F, -5.8F, -14F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[152].setRotationPoint(4F, -4.8F, -13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 160
		bodyModel[153].setRotationPoint(4F, -5.8F, -18F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 161
		bodyModel[154].setRotationPoint(23F, -5.8F, -14F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[155].setRotationPoint(23F, -4.8F, -13F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 163
		bodyModel[156].setRotationPoint(23F, -5.8F, -18F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 164
		bodyModel[157].setRotationPoint(-47F, -5.8F, 14F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 165
		bodyModel[158].setRotationPoint(-47F, -5.8F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[159].setRotationPoint(-47F, -4.8F, 12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 167
		bodyModel[160].setRotationPoint(-12F, -5.8F, 14F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 168
		bodyModel[161].setRotationPoint(-12F, -5.8F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[162].setRotationPoint(-12F, -4.8F, 12F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 170
		bodyModel[163].setRotationPoint(-29F, -5.8F, 14F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 171
		bodyModel[164].setRotationPoint(-29F, -5.8F, 11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[165].setRotationPoint(-29F, -4.8F, 12F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 173
		bodyModel[166].setRotationPoint(4F, -5.8F, 11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[167].setRotationPoint(4F, -4.8F, 12F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 175
		bodyModel[168].setRotationPoint(4F, -5.8F, 14F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 176
		bodyModel[169].setRotationPoint(23F, -5.8F, 11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[170].setRotationPoint(23F, -4.8F, 12F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 178
		bodyModel[171].setRotationPoint(23F, -5.8F, 14F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 179
		bodyModel[172].setRotationPoint(-12F, 5.2F, -20F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 180
		bodyModel[173].setRotationPoint(-12F, 5.2F, -16F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 181
		bodyModel[174].setRotationPoint(-12F, 5.2F, 13F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 182
		bodyModel[175].setRotationPoint(-12F, 5.2F, 16F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 183
		bodyModel[176].setRotationPoint(18F, 5.2F, -16F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 184
		bodyModel[177].setRotationPoint(18F, 5.2F, -20F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 185
		bodyModel[178].setRotationPoint(18F, 5.2F, 16F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 186
		bodyModel[179].setRotationPoint(18F, 5.2F, 13F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 187
		bodyModel[180].setRotationPoint(47F, 5.2F, -16F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 188
		bodyModel[181].setRotationPoint(47F, 5.2F, -20F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 189
		bodyModel[182].setRotationPoint(47F, 5.2F, 13F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 190
		bodyModel[183].setRotationPoint(47F, 5.2F, 16F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 191
		bodyModel[184].setRotationPoint(79F, 5.2F, -13F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 192
		bodyModel[185].setRotationPoint(79F, 5.2F, -17F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 193
		bodyModel[186].setRotationPoint(79F, 5.2F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 194
		bodyModel[187].setRotationPoint(79F, 5.2F, 13F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 195
		bodyModel[188].setRotationPoint(-82F, 5.2F, -17F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 196
		bodyModel[189].setRotationPoint(-82F, 5.2F, -13F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 197
		bodyModel[190].setRotationPoint(-82F, 5.2F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 198
		bodyModel[191].setRotationPoint(-82F, 5.2F, 13F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[192].setRotationPoint(58.5F, -5F, -3.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[2];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_2_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_2_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(99F, -5.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[1];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_2_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(99F, -5.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[2];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_3_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_3_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(59F, -5.5F, -13F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[1];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_3_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(59F, -5.5F, -13F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[2];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_4_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_4_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(59F, -5.5F, 13F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[1];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_4_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(59F, -5.5F, 13F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[2];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_5_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_5_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(40F, -5.5F, -13F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[1];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_5_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(40F, -5.5F, -13F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[2];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_6_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_6_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(40F, -5.5F, 13F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[1];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_6_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(40F, -5.5F, 13F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[2];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_7_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_7_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-90F, -1.5F, -6F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[1];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_7_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-90F, -1.5F, -6F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[2];
		gun_8_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_8_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_8_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_8_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[0])
		{
			gunPart.setRotationPoint(-90F, -1.5F, 6F);
		}


		gun_8_Model[1] = new ModelRendererTurbo[1];
		gun_8_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_8_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[1])
		{
			gunPart.setRotationPoint(-90F, -1.5F, 6F);
		}


		gun_8_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun8", gun_8_Model);

		// Passenger 10
		ModelRendererTurbo[][] gun_9_Model = new ModelRendererTurbo[3][];

		gun_9_Model[0] = new ModelRendererTurbo[2];
		gun_9_Model[0][0] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 86
		gun_9_Model[0][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 87

		gun_9_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_9_Model[0][1].addShapeBox(-2F, 0.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 87

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[0])
		{
			gunPart.setRotationPoint(-104F, -1.5F, 0F);
		}


		gun_9_Model[1] = new ModelRendererTurbo[1];
		gun_9_Model[1][0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 88

		gun_9_Model[1][0].addShapeBox(-1.5F, -0.5F, -0.5F, 12, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 88

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[1])
		{
			gunPart.setRotationPoint(-104F, -1.5F, 0F);
		}


		gun_9_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun9", gun_9_Model);
	}
}