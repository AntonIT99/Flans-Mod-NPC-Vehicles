//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bayern
// Model Creator: 
// Created on: 31.07.2020 - 16:53:34
// Last changed on: 31.07.2020 - 16:53:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBayern extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBayern() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 75
		bodyModel[72] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 76
		bodyModel[73] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 77
		bodyModel[74] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 85
		bodyModel[82] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 98
		bodyModel[94] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 100
		bodyModel[96] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 101
		bodyModel[97] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 102
		bodyModel[98] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 109
		bodyModel[103] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 110
		bodyModel[104] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 112
		bodyModel[106] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 113
		bodyModel[107] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 115
		bodyModel[109] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 116
		bodyModel[110] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 117
		bodyModel[111] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 118
		bodyModel[112] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 119
		bodyModel[113] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 121
		bodyModel[115] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 122
		bodyModel[116] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 369, 273, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Box 138
		bodyModel[132] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 139
		bodyModel[133] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 140
		bodyModel[134] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 141
		bodyModel[135] = new ModelRendererTurbo(this, 209, 313, textureX, textureY); // Box 142
		bodyModel[136] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 143
		bodyModel[137] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 144
		bodyModel[138] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 145
		bodyModel[139] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 146
		bodyModel[140] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 147
		bodyModel[141] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 148
		bodyModel[142] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Box 149
		bodyModel[143] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 150
		bodyModel[144] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Box 151
		bodyModel[145] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Box 152
		bodyModel[146] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 153
		bodyModel[147] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 154
		bodyModel[148] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 155
		bodyModel[149] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 156
		bodyModel[150] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 157
		bodyModel[151] = new ModelRendererTurbo(this, 73, 425, textureX, textureY); // Box 158
		bodyModel[152] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 159
		bodyModel[153] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 160
		bodyModel[154] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 161
		bodyModel[155] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 162
		bodyModel[156] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 163
		bodyModel[157] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 164
		bodyModel[158] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 165
		bodyModel[159] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 166
		bodyModel[160] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 168
		bodyModel[162] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 169
		bodyModel[163] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 170
		bodyModel[164] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 171
		bodyModel[165] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 172
		bodyModel[166] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 173
		bodyModel[167] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 174
		bodyModel[168] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 175
		bodyModel[169] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 176
		bodyModel[170] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 177
		bodyModel[171] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 178
		bodyModel[172] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 179
		bodyModel[173] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 180
		bodyModel[174] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 181
		bodyModel[175] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 182
		bodyModel[176] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 183
		bodyModel[177] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 184
		bodyModel[178] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 185
		bodyModel[179] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 186
		bodyModel[180] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 187
		bodyModel[181] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 188
		bodyModel[182] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 189
		bodyModel[183] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 190
		bodyModel[184] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 191
		bodyModel[185] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 192
		bodyModel[186] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 193
		bodyModel[187] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 194
		bodyModel[188] = new ModelRendererTurbo(this, 24, 0, textureX, textureY); // Box 195
		bodyModel[189] = new ModelRendererTurbo(this, 321, 433, textureX, textureY); // Box 196
		bodyModel[190] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 197
		bodyModel[191] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 53

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 8, 56, 0F,25F, 0F, -2F, 25F, 0F, -2F, 25F, 0F, -2F, 25F, 0F, -2F, 25F, 0F, 0F, 25F, 0.2F, 0F, 25F, 0.2F, 0F, 25F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-5F, -5F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 8, 56, 0F,15F, 0F, -2F, 15F, 0F, -5F, 15F, 0F, -5F, 15F, 0F, -2F, 15F, 0.2F, 0F, 15F, 0.4F, -3.5F, 15F, 0.4F, -3.5F, 15F, 0.2F, 0F); // Box 2
		bodyModel[1].setRotationPoint(45F, -5F, -28F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 8, 49, 0F,0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0.4F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.4F, 0F); // Box 3
		bodyModel[2].setRotationPoint(70F, -5F, -24.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 8, 46, 0F,15F, 0F, -1F, 15F, 0F, -7.5F, 15F, 0F, -7.5F, 15F, 0F, -1F, 15F, 0.5F, 0F, 15F, 0.8F, -7F, 15F, 0.8F, -7F, 15F, 0.5F, 0F); // Box 4
		bodyModel[3].setRotationPoint(99F, -5F, -23F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 12, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0.8F, 0F); // Box 5
		bodyModel[4].setRotationPoint(121F, -9F, -16F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 13, 17, 0F,0F, 0F, 0F, 3F, 0.2F, -4.5F, 3F, 0.2F, 4.5F, 0F, 0F, 9F, 0F, 0F, 0F, 3F, 0F, -4.5F, 3F, 0F, 4.5F, 0F, 0F, 9F); // Box 6
		bodyModel[5].setRotationPoint(137F, -9F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 13, 17, 0F,0F, 0.2F, 0F, 0F, 0.4F, -5.5F, 0F, 0.4F, -5.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(153F, -9F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 5F, 0F, 2F, 5F, -2.5F, 2F, 5F, -2.5F, 0F, 5F, 0F); // Box 8
		bodyModel[7].setRotationPoint(166F, -5F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 8, 53, 0F,15F, 0F, -1.5F, 15F, 0F, -0.5F, 15F, 0F, -0.5F, 15F, 0F, -1.5F, 15F, 0F, 0F, 15F, 0F, 1.5F, 15F, 0F, 1.5F, 15F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-55F, -5F, -26.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 8, 43, 0F,15F, 0F, -1F, 15F, 0F, 3.5F, 15F, 0F, 3.5F, 15F, 0F, -1F, 15F, 0F, 0F, 15F, 0F, 5F, 15F, 0F, 5F, 15F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-95F, -5F, -21.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 26, 8, 26, 0F,0F, 0.2F, 1F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 1F); // Box 11
		bodyModel[10].setRotationPoint(-136F, -5F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 23, 8, 10, 0F,0F, 0.7F, 1F, 0F, 0.2F, 9F, 0F, 0.2F, 9F, 0F, 0.7F, 1F, 0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 1F); // Box 12
		bodyModel[11].setRotationPoint(-159F, -5F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 8, 2, 0F,0F, 0.9F, 0F, 0F, 0.7F, 5F, 0F, 0.7F, 5F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-169F, -5F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 37, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(84F, -9F, -16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0.4F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(166F, -9F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(82F, -9F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[16].setRotationPoint(80F, -9F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 34, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 21
		bodyModel[17].setRotationPoint(75F, -9F, -17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 4, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(69F, -9F, -19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 4, 38, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 23
		bodyModel[19].setRotationPoint(61F, -9F, -19F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(56F, -9F, -22F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(50F, -9F, -21F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 4, 42, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 26
		bodyModel[22].setRotationPoint(43F, -9F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 4, 48, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(35F, -9F, -24F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 46, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(32F, -9F, -23F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 46, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 29
		bodyModel[25].setRotationPoint(24F, -9F, -23F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F); // Box 30
		bodyModel[26].setRotationPoint(13F, -9F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 4, 46, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(9F, -9F, -23F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 4, 46, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 32
		bodyModel[28].setRotationPoint(1F, -9F, -23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 4, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-4F, -9F, -24F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 46, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-7F, -9F, -23F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 4, 46, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 35
		bodyModel[31].setRotationPoint(-16F, -9F, -23F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F); // Box 36
		bodyModel[32].setRotationPoint(-30F, -9F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 4, 44, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-37F, -9F, -22F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 4, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-39F, -9F, -22F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 4, 38, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-46F, -9F, -19F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 36, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-47F, -9F, -18F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-51F, -9F, -16F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-55F, -9F, -16F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(-63F, -9F, -10F);

		bodyModel[40].addShapeBox(-10.5F, 2.5F, -3.5F, 21, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[40].setRotationPoint(-62.5F, -15F, 0F);

		bodyModel[41].addShapeBox(-10.5F, 2.5F, -10.5F, 21, 8, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(-62.5F, -15F, 0F);

		bodyModel[42].addShapeBox(-10.5F, 2.5F, 3.5F, 21, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(-62.5F, -15F, 0F);

		bodyModel[43].addShapeBox(-10.5F, 2.5F, 3.5F, 21, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(-90.5F, -9F, 0F);

		bodyModel[44].addShapeBox(-10.5F, 2.5F, -3.5F, 21, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(-90.5F, -9F, 0F);

		bodyModel[45].addShapeBox(-10.5F, 2.5F, -10.5F, 21, 2, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(-90.5F, -9F, 0F);

		bodyModel[46].addShapeBox(-10.5F, 2.5F, 3.5F, 21, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 50
		bodyModel[46].setRotationPoint(91.5F, -13F, 0F);

		bodyModel[47].addShapeBox(-10.5F, 2.5F, -3.5F, 21, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(91.5F, -13F, 0F);

		bodyModel[48].addShapeBox(-10.5F, 2.5F, -10.5F, 21, 2, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(91.5F, -13F, 0F);

		bodyModel[49].addShapeBox(-10.5F, 2.5F, 3.5F, 21, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(63.5F, -19F, 0F);

		bodyModel[50].addShapeBox(-10.5F, 2.5F, -3.5F, 21, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(63.5F, -19F, 0F);

		bodyModel[51].addShapeBox(-10.5F, 2.5F, -10.5F, 21, 8, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(63.5F, -19F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 37, 5, 9, 0F,0F, 0F, 12.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12.5F, 0F, 0F, 12.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12.5F); // Box 56
		bodyModel[52].setRotationPoint(22.5F, -13.5F, -4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 5, 39, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(20.5F, -13.5F, -19.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 5, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[54].setRotationPoint(18.5F, -13.5F, -19.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 5, 37, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(15.5F, -13.5F, -18.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 5, 37, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(0F, -13.5F, -18.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 35, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(-12F, -13.5F, -17.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 5, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(-16F, -13.5F, -17.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 5, 29, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(-19F, -13.5F, -14.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(-26F, -13.5F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 5, 21, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-30F, -13.5F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(-32F, -13.5F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 67
		bodyModel[63].setRotationPoint(-35F, -13.5F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(-46F, -13.5F, -3.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 69
		bodyModel[65].setRotationPoint(168F, -25F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 70
		bodyModel[66].setRotationPoint(168F, -14F, -0.5F);
		bodyModel[66].rotateAngleZ = -0.45378561F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 71
		bodyModel[67].setRotationPoint(168F, -16F, -0.5F);
		bodyModel[67].rotateAngleZ = 0.2268928F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 33, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(-23F, -45.5F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 33, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 73
		bodyModel[69].setRotationPoint(-25F, -45.5F, -2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 33, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[70].setRotationPoint(-19F, -45.5F, -2.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 33, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 75
		bodyModel[71].setRotationPoint(3F, -45.5F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 33, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 76
		bodyModel[72].setRotationPoint(13F, -45.5F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 33, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[73].setRotationPoint(5F, -45.5F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 60, 2, 0F,-0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[74].setRotationPoint(-32F, -72.5F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[75].setRotationPoint(-31.5F, -69.5F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 58, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[76].setRotationPoint(27F, -109.5F, -1F);
		bodyModel[76].rotateAngleZ = 0.00523599F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[77].setRotationPoint(27.5F, -100.5F, -8F);
		bodyModel[77].rotateAngleZ = 0.00523599F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(27.5F, -85.5F, -18F);
		bodyModel[78].rotateAngleZ = 0.00523599F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 83
		bodyModel[79].setRotationPoint(26F, -52.5F, -4F);
		bodyModel[79].rotateAngleZ = 0.00523599F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[80].setRotationPoint(28F, -50.5F, -1F);
		bodyModel[80].rotateAngleZ = 0.00523599F;

		bodyModel[81].addShapeBox(-1F, 0F, -1F, 2, 40, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 85
		bodyModel[81].setRotationPoint(29F, -61.5F, 0F);
		bodyModel[81].rotateAngleX = -0.13962634F;
		bodyModel[81].rotateAngleZ = -0.16929694F;

		bodyModel[82].addShapeBox(-1F, 0F, -1F, 2, 40, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 86
		bodyModel[82].setRotationPoint(29F, -61.5F, 0F);
		bodyModel[82].rotateAngleX = 0.13962634F;
		bodyModel[82].rotateAngleZ = -0.16929694F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 3, 7, 0F,0F, 0F, 7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F); // Box 87
		bodyModel[83].setRotationPoint(33.5F, -22.5F, -3.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 15, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 88
		bodyModel[84].setRotationPoint(18.5F, -22.5F, -7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 89
		bodyModel[85].setRotationPoint(11.5F, -22.5F, -4.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[86].setRotationPoint(4.5F, -22.5F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 9, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 91
		bodyModel[87].setRotationPoint(1.5F, -22.5F, -4.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, -0.5F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -4F, -0.5F, 0F); // Box 92
		bodyModel[88].setRotationPoint(27F, -36.5F, -3F);
		bodyModel[88].rotateAngleZ = 0.00523599F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 1F, -0.5F, 0F, 2.95F, -0.5F, 0F, 2.95F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 93
		bodyModel[89].setRotationPoint(27F, -36.5F, -3F);
		bodyModel[89].rotateAngleZ = 0.00523599F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -1F, 0F, -2F); // Box 94
		bodyModel[90].setRotationPoint(26.5F, -50F, -2.5F);
		bodyModel[90].rotateAngleZ = 0.00523599F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 95
		bodyModel[91].setRotationPoint(44F, -25F, -5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(46F, -25F, -4.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 98
		bodyModel[93].setRotationPoint(41F, -25F, -5.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 4, 11, 0F,0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 99
		bodyModel[94].setRotationPoint(38F, -24.5F, -5.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[95].setRotationPoint(36F, -24.5F, -5.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 101
		bodyModel[96].setRotationPoint(34F, -24.5F, -5.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[97].setRotationPoint(34F, -25.7F, -3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(37F, -25.7F, -3.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 105
		bodyModel[99].setRotationPoint(35.3F, -27.5F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 106
		bodyModel[100].setRotationPoint(35.3F, -27.2F, -4.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[101].setRotationPoint(16.5F, -31F, -7.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 109
		bodyModel[102].setRotationPoint(25.5F, -31F, -7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F); // Box 110
		bodyModel[103].setRotationPoint(28.5F, -33F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(4.5F, -31F, -4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 112
		bodyModel[105].setRotationPoint(1.5F, -31F, -4.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[106].setRotationPoint(22F, -42F, -3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 114
		bodyModel[107].setRotationPoint(26F, -42F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 115
		bodyModel[108].setRotationPoint(20F, -42F, -3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 116
		bodyModel[109].setRotationPoint(18F, -36.5F, -4.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 117
		bodyModel[110].setRotationPoint(25F, -36.5F, -4.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[111].setRotationPoint(20F, -36.5F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[112].setRotationPoint(18.5F, -27F, -7.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 120
		bodyModel[113].setRotationPoint(11.5F, -27F, -4.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[114].setRotationPoint(4.5F, -27F, -4.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 122
		bodyModel[115].setRotationPoint(1.5F, -27F, -4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 123
		bodyModel[116].setRotationPoint(25.5F, -27F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0.2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.2F); // Box 124
		bodyModel[117].setRotationPoint(27.5F, -28.4F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 5, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[118].setRotationPoint(17.5F, -27F, -11.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[119].setRotationPoint(-27F, -20.5F, -4.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 127
		bodyModel[120].setRotationPoint(-19F, -20.5F, -4.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 128
		bodyModel[121].setRotationPoint(-29F, -20.5F, -4.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[122].setRotationPoint(-37F, -20F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 130
		bodyModel[123].setRotationPoint(-39F, -20F, -3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(-35F, -20F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[125].setRotationPoint(-27F, -22.5F, -4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 133
		bodyModel[126].setRotationPoint(-19F, -22.5F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 134
		bodyModel[127].setRotationPoint(-29F, -22.5F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 15, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 135
		bodyModel[128].setRotationPoint(18.5F, -19.5F, -6.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 136
		bodyModel[129].setRotationPoint(11.5F, -19.5F, -4.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 6, 5, 0F,0F, 0F, 7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F); // Box 137
		bodyModel[130].setRotationPoint(33.5F, -19.5F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 49, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 138
		bodyModel[131].setRotationPoint(32.5F, -22.5F, -24.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[132].setRotationPoint(-24F, -18F, -11.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 140
		bodyModel[133].setRotationPoint(-23F, -18.5F, -11F);
		bodyModel[133].rotateAngleZ = 0.55850536F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 141
		bodyModel[134].setRotationPoint(-2.5F, -31F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[135].setRotationPoint(27.5F, -56.5F, -16F);
		bodyModel[135].rotateAngleZ = 0.00523599F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[136].setRotationPoint(-24F, -18F, 9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F); // Box 144
		bodyModel[137].setRotationPoint(-23F, -18.5F, 10F);
		bodyModel[137].rotateAngleZ = 0.55850536F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 145
		bodyModel[138].setRotationPoint(-2.5F, -31F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 16, 56, 0F,25F, 0F, 0F, 25F, -0.2F, 0F, 25F, -0.2F, 0F, 25F, 0F, 0F, 25F, 0F, -7F, 25F, 0F, -7F, 25F, 0F, -7F, 25F, 0F, -7F); // Box 146
		bodyModel[139].setRotationPoint(-5F, 3F, -28F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 16, 53, 0F,15F, 0F, 0F, 15F, 0F, 1.5F, 15F, 0F, 1.5F, 15F, 0F, 0F, 15F, 0F, -6.5F, 15F, 0F, -5.5F, 15F, 0F, -5.5F, 15F, 0F, -6.5F); // Box 147
		bodyModel[140].setRotationPoint(-55F, 3F, -26.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 16, 43, 0F,15F, 0F, 0F, 15F, 0F, 5F, 15F, 0F, 5F, 15F, 0F, 0F, 15F, -7F, -9F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, -7F, -9F); // Box 148
		bodyModel[141].setRotationPoint(-95F, 3F, -21.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 23, 7, 10, 0F,0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 1F, 0F, -1.3F, -3F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, -1.3F, -3F); // Box 149
		bodyModel[142].setRotationPoint(-159F, 3F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, -3F, -0.5F, -0.5F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -3F, -0.5F, -0.5F); // Box 150
		bodyModel[143].setRotationPoint(-169F, 3F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 16, 56, 0F,15F, -0.2F, 0F, 15F, -0.4F, -3.5F, 15F, -0.4F, -3.5F, 15F, -0.2F, 0F, 15F, 0F, -7F, 15F, 0F, -10F, 15F, 0F, -10F, 15F, 0F, -7F); // Box 151
		bodyModel[144].setRotationPoint(45F, 3F, -28F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 16, 49, 0F,0F, -0.4F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.4F, 0F, 0F, 0F, -6.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -6.5F); // Box 152
		bodyModel[145].setRotationPoint(70F, 3F, -24.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 7, 16, 46, 0F,15F, -0.5F, 0F, 15F, -0.8F, -7F, 15F, -0.8F, -7F, 15F, -0.5F, 0F, 15F, 0F, -6F, 15F, 0F, -12F, 15F, 0F, -12F, 15F, 0F, -6F); // Box 153
		bodyModel[146].setRotationPoint(99F, 3F, -23F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 16, 16, 32, 0F,0F, -0.8F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -0.8F, 0F, 0F, 0F, -5F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -5F); // Box 154
		bodyModel[147].setRotationPoint(121F, 3F, -16F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 16, 11, 26, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 0.2F, -9.5F, 0F, 0.2F, -9.5F, 0F, 3F, -6F); // Box 155
		bodyModel[148].setRotationPoint(137F, 4F, -13F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 11, 17, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0.2F, -5F, 0F, -3.6F, -7.5F, 0F, -3.6F, -7.5F, 0F, 0.2F, -5F); // Box 156
		bodyModel[149].setRotationPoint(153F, 4F, -8.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 7, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.6F, -2F, 0.5F, -6.5F, -2.5F, 0.5F, -6.5F, -2.5F, 0F, -0.6F, -2F); // Box 157
		bodyModel[150].setRotationPoint(166F, 4F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 26, 8, 26, 0F,0F, 0F, 1F, 0F, 0F, 8.5F, 0F, 0F, 8.5F, 0F, 0F, 1F, 0F, -0.8F, -7F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.8F, -7F); // Box 158
		bodyModel[151].setRotationPoint(-136F, 3F, -13F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[152].setRotationPoint(-173F, -20F, -0.5F);
		bodyModel[152].rotateAngleZ = 0.29670597F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 160
		bodyModel[153].setRotationPoint(-170.5F, -11.5F, -0.5F);
		bodyModel[153].rotateAngleZ = 0.61086524F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 1F, 0F); // Box 161
		bodyModel[154].setRotationPoint(28F, -65.5F, -3F);
		bodyModel[154].rotateAngleZ = 0.00523599F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 162
		bodyModel[155].setRotationPoint(27.8F, -66.5F, -3F);
		bodyModel[155].rotateAngleZ = 0.00523599F;

		bodyModel[156].addShapeBox(0F, 0F, -0.5F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[156].setRotationPoint(16.5F, -56.5F, 0F);
		bodyModel[156].rotateAngleZ = 0.00523599F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[157].setRotationPoint(-53F, -8.5F, -18F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 165
		bodyModel[158].setRotationPoint(-51.5F, -7.5F, -22F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 166
		bodyModel[159].setRotationPoint(-36.5F, -7.5F, -28F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[160].setRotationPoint(-38F, -8.5F, -24F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[161].setRotationPoint(-10F, -8.5F, -25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 169
		bodyModel[162].setRotationPoint(-8.5F, -7.5F, -29F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[163].setRotationPoint(7F, -8.5F, -25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 171
		bodyModel[164].setRotationPoint(8.5F, -7.5F, -29F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[165].setRotationPoint(30F, -8.5F, -25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 173
		bodyModel[166].setRotationPoint(31.5F, -7.5F, -29F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[167].setRotationPoint(48F, -8.5F, -23F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 175
		bodyModel[168].setRotationPoint(49.5F, -7.5F, -27F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[169].setRotationPoint(67F, -8.5F, -21F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 177
		bodyModel[170].setRotationPoint(68.5F, -7.5F, -25F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[171].setRotationPoint(77F, -8.5F, -20F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 179
		bodyModel[172].setRotationPoint(78.5F, -7.5F, -24F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[173].setRotationPoint(-53F, -8.5F, 14F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 181
		bodyModel[174].setRotationPoint(-51.5F, -7.5F, 17F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 182
		bodyModel[175].setRotationPoint(-36.5F, -7.5F, 23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[176].setRotationPoint(-38F, -8.5F, 20F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[177].setRotationPoint(-10F, -8.5F, 21F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 185
		bodyModel[178].setRotationPoint(-8.5F, -7.5F, 24F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[179].setRotationPoint(7F, -8.5F, 21F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 187
		bodyModel[180].setRotationPoint(8.5F, -7.5F, 24F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[181].setRotationPoint(30F, -8.5F, 21F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 189
		bodyModel[182].setRotationPoint(31.5F, -7.5F, 24F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[183].setRotationPoint(48F, -8.5F, 19F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 191
		bodyModel[184].setRotationPoint(49.5F, -7.5F, 22F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[185].setRotationPoint(67F, -8.5F, 17F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 193
		bodyModel[186].setRotationPoint(68.5F, -7.5F, 20F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[187].setRotationPoint(77F, -8.5F, 16F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 195
		bodyModel[188].setRotationPoint(78.5F, -7.5F, 19F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 74, 16, 20, 0F,6F, 0F, -9F, 0F, 0F, 2F, 0F, 0F, 2F, 6F, 0F, -9F, 0F, -2F, -9F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -9F); // Box 196
		bodyModel[189].setRotationPoint(-143F, 3F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 7, 2, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[190].setRotationPoint(-159F, 8.5F, -1F);

		bodyModel[191].addShapeBox(-16.5F, -3.5F, 0F, 20, 17, 1, 0F,-3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F); // Box 53
		bodyModel[191].setRotationPoint(27.5F, -109F, -0.5F);
		bodyModel[191].rotateAngleZ = 0.08726646F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[15];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 198
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 199
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 200
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 201
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 202
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 203
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 204
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 205
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 206
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 207
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 208
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 209
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 210
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 212
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 213

		gun_1_Model[0][0].addShapeBox(-15.5F, -2.5F, -3.5F, 21, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198

		gun_1_Model[0][1].addShapeBox(-15.5F, -2.5F, -8.5F, 17, 5, 5, 0F,-2F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199

		gun_1_Model[0][2].addShapeBox(1.5F, -2.5F, -8.5F, 4, 5, 5, 0F,-1.5F, -1.5F, 0F, -2.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200

		gun_1_Model[0][3].addShapeBox(5.5F, -2.5F, -8.5F, 2, 5, 5, 0F,2.5F, -1.5F, 0F, -0.4F, -1F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.4F, 0F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F); // Box 201

		gun_1_Model[0][4].addShapeBox(5.5F, -2.5F, 3.5F, 2, 5, 5, 0F,0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, -1F, -2F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, 0F, -2F, 2.5F, 0F, 0F); // Box 202

		gun_1_Model[0][5].addShapeBox(1.5F, -2.5F, 3.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -1.5F, 0F, 0F); // Box 203

		gun_1_Model[0][6].addShapeBox(-15.5F, -2.5F, 3.5F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 204

		gun_1_Model[0][7].addShapeBox(5.5F, -2.5F, -3.5F, 2, 5, 7, 0F,0F, 0F, 0F, -0.35F, -1F, 3F, -0.35F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 3F, -0.35F, 0F, 3F, 0F, 0F, 0F); // Box 205

		gun_1_Model[0][8].addShapeBox(7.1F, -1.5F, -6.5F, 2, 4, 13, 0F,0F, 0F, 0F, 0.4F, -1F, -3F, 0.4F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -3F, 0.4F, 0F, -3F, 0F, 0F, 0F); // Box 206

		gun_1_Model[0][9].addShapeBox(0.1F, -0.8F, -4.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 207

		gun_1_Model[0][10].addShapeBox(16.1F, -0.8F, -4.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 208

		gun_1_Model[0][11].addShapeBox(16.1F, -0.8F, 2.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 209

		gun_1_Model[0][12].addShapeBox(0.1F, -0.8F, 2.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 210

		gun_1_Model[0][13].addShapeBox(8.1F, -0.8F, -4.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 212

		gun_1_Model[0][14].addShapeBox(8.1F, -0.8F, 2.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 213

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(91.5F, -13F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[15];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 198
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 199
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 200
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 201
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 202
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 203
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 204
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 205
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 206
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 207
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 208
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 209
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 210
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 212
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 213

		gun_2_Model[0][0].addShapeBox(-15.5F, -2.5F, -3.5F, 21, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198

		gun_2_Model[0][1].addShapeBox(-15.5F, -2.5F, -8.5F, 17, 5, 5, 0F,-2F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199

		gun_2_Model[0][2].addShapeBox(1.5F, -2.5F, -8.5F, 4, 5, 5, 0F,-1.5F, -1.5F, 0F, -2.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200

		gun_2_Model[0][3].addShapeBox(5.5F, -2.5F, -8.5F, 2, 5, 5, 0F,2.5F, -1.5F, 0F, -0.4F, -1F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.4F, 0F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F); // Box 201

		gun_2_Model[0][4].addShapeBox(5.5F, -2.5F, 3.5F, 2, 5, 5, 0F,0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, -1F, -2F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, 0F, -2F, 2.5F, 0F, 0F); // Box 202

		gun_2_Model[0][5].addShapeBox(1.5F, -2.5F, 3.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -1.5F, 0F, 0F); // Box 203

		gun_2_Model[0][6].addShapeBox(-15.5F, -2.5F, 3.5F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 204

		gun_2_Model[0][7].addShapeBox(5.5F, -2.5F, -3.5F, 2, 5, 7, 0F,0F, 0F, 0F, -0.35F, -1F, 3F, -0.35F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 3F, -0.35F, 0F, 3F, 0F, 0F, 0F); // Box 205

		gun_2_Model[0][8].addShapeBox(7.1F, -1.5F, -6.5F, 2, 4, 13, 0F,0F, 0F, 0F, 0.4F, -1F, -3F, 0.4F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -3F, 0.4F, 0F, -3F, 0F, 0F, 0F); // Box 206

		gun_2_Model[0][9].addShapeBox(0.1F, -0.8F, -4.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 207

		gun_2_Model[0][10].addShapeBox(16.1F, -0.8F, -4.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 208

		gun_2_Model[0][11].addShapeBox(16.1F, -0.8F, 2.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 209

		gun_2_Model[0][12].addShapeBox(0.1F, -0.8F, 2.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 210

		gun_2_Model[0][13].addShapeBox(8.1F, -0.8F, -4.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 212

		gun_2_Model[0][14].addShapeBox(8.1F, -0.8F, 2.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 213

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(63.5F, -19F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[15];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 198
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 199
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 200
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 201
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 202
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 203
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 204
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 205
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 206
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 207
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 208
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 209
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 210
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 212
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 213

		gun_3_Model[0][0].addShapeBox(-15.5F, -2.5F, -3.5F, 21, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198

		gun_3_Model[0][1].addShapeBox(-15.5F, -2.5F, -8.5F, 17, 5, 5, 0F,-2F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199

		gun_3_Model[0][2].addShapeBox(1.5F, -2.5F, -8.5F, 4, 5, 5, 0F,-1.5F, -1.5F, 0F, -2.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200

		gun_3_Model[0][3].addShapeBox(5.5F, -2.5F, -8.5F, 2, 5, 5, 0F,2.5F, -1.5F, 0F, -0.4F, -1F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.4F, 0F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F); // Box 201

		gun_3_Model[0][4].addShapeBox(5.5F, -2.5F, 3.5F, 2, 5, 5, 0F,0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, -1F, -2F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, 0F, -2F, 2.5F, 0F, 0F); // Box 202

		gun_3_Model[0][5].addShapeBox(1.5F, -2.5F, 3.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -1.5F, 0F, 0F); // Box 203

		gun_3_Model[0][6].addShapeBox(-15.5F, -2.5F, 3.5F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 204

		gun_3_Model[0][7].addShapeBox(5.5F, -2.5F, -3.5F, 2, 5, 7, 0F,0F, 0F, 0F, -0.35F, -1F, 3F, -0.35F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 3F, -0.35F, 0F, 3F, 0F, 0F, 0F); // Box 205

		gun_3_Model[0][8].addShapeBox(7.1F, -1.5F, -6.5F, 2, 4, 13, 0F,0F, 0F, 0F, 0.4F, -1F, -3F, 0.4F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -3F, 0.4F, 0F, -3F, 0F, 0F, 0F); // Box 206

		gun_3_Model[0][9].addShapeBox(0.1F, -0.8F, -4.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 207

		gun_3_Model[0][10].addShapeBox(16.1F, -0.8F, -4.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 208

		gun_3_Model[0][11].addShapeBox(16.1F, -0.8F, 2.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 209

		gun_3_Model[0][12].addShapeBox(0.1F, -0.8F, 2.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 210

		gun_3_Model[0][13].addShapeBox(8.1F, -0.8F, -4.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 212

		gun_3_Model[0][14].addShapeBox(8.1F, -0.8F, 2.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 213

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-62.5F, -15F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[15];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Box 198
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 199
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 200
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 201
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 202
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 203
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 204
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 205
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 206
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 207
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 208
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 209
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 210
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 212
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 213

		gun_4_Model[0][0].addShapeBox(-15.5F, -2.5F, -3.5F, 21, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198

		gun_4_Model[0][1].addShapeBox(-15.5F, -2.5F, -8.5F, 17, 5, 5, 0F,-2F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199

		gun_4_Model[0][2].addShapeBox(1.5F, -2.5F, -8.5F, 4, 5, 5, 0F,-1.5F, -1.5F, 0F, -2.4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200

		gun_4_Model[0][3].addShapeBox(5.5F, -2.5F, -8.5F, 2, 5, 5, 0F,2.5F, -1.5F, 0F, -0.4F, -1F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.4F, 0F, -2F, -1.9F, 0F, 0F, 0F, 0F, 0F); // Box 201

		gun_4_Model[0][4].addShapeBox(5.5F, -2.5F, 3.5F, 2, 5, 5, 0F,0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, -1F, -2F, 2.5F, -1.5F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.4F, 0F, -2F, 2.5F, 0F, 0F); // Box 202

		gun_4_Model[0][5].addShapeBox(1.5F, -2.5F, 3.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.4F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -1.5F, 0F, 0F); // Box 203

		gun_4_Model[0][6].addShapeBox(-15.5F, -2.5F, 3.5F, 17, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F); // Box 204

		gun_4_Model[0][7].addShapeBox(5.5F, -2.5F, -3.5F, 2, 5, 7, 0F,0F, 0F, 0F, -0.35F, -1F, 3F, -0.35F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 3F, -0.35F, 0F, 3F, 0F, 0F, 0F); // Box 205

		gun_4_Model[0][8].addShapeBox(7.1F, -1.5F, -6.5F, 2, 4, 13, 0F,0F, 0F, 0F, 0.4F, -1F, -3F, 0.4F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -3F, 0.4F, 0F, -3F, 0F, 0F, 0F); // Box 206

		gun_4_Model[0][9].addShapeBox(0.1F, -0.8F, -4.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 207

		gun_4_Model[0][10].addShapeBox(16.1F, -0.8F, -4.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 208

		gun_4_Model[0][11].addShapeBox(16.1F, -0.8F, 2.5F, 13, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F); // Box 209

		gun_4_Model[0][12].addShapeBox(0.1F, -0.8F, 2.5F, 16, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 210

		gun_4_Model[0][13].addShapeBox(8.1F, -0.8F, -4.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 212

		gun_4_Model[0][14].addShapeBox(8.1F, -0.8F, 2.5F, 3, 2, 2, 0F,0.5F, 0.4F, 0.4F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.5F, 0.4F, 0.4F, 0F, 1F, 0.3F, -0.5F, 0.2F, 0.2F, -0.5F, 0.23F, 0.2F, 0F, 1F, 0.3F); // Box 213

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-90.5F, -9F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);
	}
}