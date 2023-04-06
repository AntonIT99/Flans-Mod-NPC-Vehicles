//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sverdlov
// Model Creator: 
// Created on: 03.08.2020 - 16:38:59
// Last changed on: 03.08.2020 - 16:38:59

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSverdlov extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSverdlov() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[615];

		initbodyModel_1();
		initbodyModel_2();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 149
		bodyModel[149] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 150
		bodyModel[150] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 215
		bodyModel[215] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 216
		bodyModel[216] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 217
		bodyModel[217] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 218
		bodyModel[218] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 219
		bodyModel[219] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 220
		bodyModel[220] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 221
		bodyModel[221] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 222
		bodyModel[222] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 223
		bodyModel[223] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 224
		bodyModel[224] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 225
		bodyModel[225] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 226
		bodyModel[226] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 227
		bodyModel[227] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 228
		bodyModel[228] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 229
		bodyModel[229] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 231
		bodyModel[230] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 232
		bodyModel[231] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 233
		bodyModel[232] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 234
		bodyModel[233] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 235
		bodyModel[234] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 236
		bodyModel[235] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 237
		bodyModel[236] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 238
		bodyModel[237] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 239
		bodyModel[238] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 240
		bodyModel[239] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 241
		bodyModel[240] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 242
		bodyModel[241] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 243
		bodyModel[242] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 244
		bodyModel[243] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 245
		bodyModel[244] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 246
		bodyModel[245] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 247
		bodyModel[246] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 248
		bodyModel[247] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 249
		bodyModel[248] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 250
		bodyModel[249] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 251
		bodyModel[250] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 252
		bodyModel[251] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 253
		bodyModel[252] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 254
		bodyModel[253] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 255
		bodyModel[254] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 256
		bodyModel[255] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 257
		bodyModel[256] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 258
		bodyModel[257] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 259
		bodyModel[258] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 260
		bodyModel[259] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 261
		bodyModel[260] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 262
		bodyModel[261] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 263
		bodyModel[262] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 264
		bodyModel[263] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 265
		bodyModel[264] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 264
		bodyModel[265] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 265
		bodyModel[266] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 266
		bodyModel[267] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Box 267
		bodyModel[268] = new ModelRendererTurbo(this, 337, 337, textureX, textureY); // Box 268
		bodyModel[269] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 269
		bodyModel[270] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 270
		bodyModel[271] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 271
		bodyModel[272] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Box 272
		bodyModel[273] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Box 273
		bodyModel[274] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Box 274
		bodyModel[275] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 275
		bodyModel[276] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 276
		bodyModel[277] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 277
		bodyModel[278] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 278
		bodyModel[279] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 279
		bodyModel[280] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 280
		bodyModel[281] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 281
		bodyModel[282] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 282
		bodyModel[283] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 283
		bodyModel[284] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 284
		bodyModel[285] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 285
		bodyModel[286] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 286
		bodyModel[287] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 287
		bodyModel[288] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 288
		bodyModel[289] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 289
		bodyModel[290] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 290
		bodyModel[291] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 291
		bodyModel[292] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Box 292
		bodyModel[293] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 293
		bodyModel[294] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 294
		bodyModel[295] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 295
		bodyModel[296] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 296
		bodyModel[297] = new ModelRendererTurbo(this, 321, 353, textureX, textureY); // Box 297
		bodyModel[298] = new ModelRendererTurbo(this, 409, 353, textureX, textureY); // Box 298
		bodyModel[299] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 299
		bodyModel[300] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 300
		bodyModel[301] = new ModelRendererTurbo(this, 17, 361, textureX, textureY); // Box 301
		bodyModel[302] = new ModelRendererTurbo(this, 89, 361, textureX, textureY); // Box 302
		bodyModel[303] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 303
		bodyModel[304] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 304
		bodyModel[305] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 305
		bodyModel[306] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 306
		bodyModel[307] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 307
		bodyModel[308] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 308
		bodyModel[309] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 309
		bodyModel[310] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Box 310
		bodyModel[311] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 311
		bodyModel[312] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 312
		bodyModel[313] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 313
		bodyModel[314] = new ModelRendererTurbo(this, 33, 305, textureX, textureY); // Box 314
		bodyModel[315] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Box 315
		bodyModel[316] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 316
		bodyModel[317] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 317
		bodyModel[318] = new ModelRendererTurbo(this, 153, 361, textureX, textureY); // Box 318
		bodyModel[319] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 319
		bodyModel[320] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 320
		bodyModel[321] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 321
		bodyModel[322] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 322
		bodyModel[323] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 323
		bodyModel[324] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 324
		bodyModel[325] = new ModelRendererTurbo(this, 305, 305, textureX, textureY); // Box 326
		bodyModel[326] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 327
		bodyModel[327] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 328
		bodyModel[328] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 329
		bodyModel[329] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 330
		bodyModel[330] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 331
		bodyModel[331] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 332
		bodyModel[332] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 333
		bodyModel[333] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 334
		bodyModel[334] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 335
		bodyModel[335] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 336
		bodyModel[336] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 337
		bodyModel[337] = new ModelRendererTurbo(this, 329, 353, textureX, textureY); // Box 338
		bodyModel[338] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 339
		bodyModel[339] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 340
		bodyModel[340] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 341
		bodyModel[341] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 342
		bodyModel[342] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 343
		bodyModel[343] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 344
		bodyModel[344] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 345
		bodyModel[345] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 346
		bodyModel[346] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 347
		bodyModel[347] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 348
		bodyModel[348] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 349
		bodyModel[349] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 350
		bodyModel[350] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 351
		bodyModel[351] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 353
		bodyModel[352] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 24
		bodyModel[353] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Box 25
		bodyModel[354] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Box 35
		bodyModel[355] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 36
		bodyModel[356] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Box 360
		bodyModel[357] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Box 361
		bodyModel[358] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 369
		bodyModel[359] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 370
		bodyModel[360] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 371
		bodyModel[361] = new ModelRendererTurbo(this, 489, 337, textureX, textureY); // Box 372
		bodyModel[362] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); // Box 373
		bodyModel[363] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 374
		bodyModel[364] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 375
		bodyModel[365] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 376
		bodyModel[366] = new ModelRendererTurbo(this, 177, 361, textureX, textureY); // Box 377
		bodyModel[367] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 378
		bodyModel[368] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 383
		bodyModel[369] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 384
		bodyModel[370] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Box 385
		bodyModel[371] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Box 386
		bodyModel[372] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 387
		bodyModel[373] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 388
		bodyModel[374] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 389
		bodyModel[375] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 390
		bodyModel[376] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 391
		bodyModel[377] = new ModelRendererTurbo(this, 49, 329, textureX, textureY); // Box 392
		bodyModel[378] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 393
		bodyModel[379] = new ModelRendererTurbo(this, 273, 361, textureX, textureY); // Box 394
		bodyModel[380] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 395
		bodyModel[381] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Box 396
		bodyModel[382] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 397
		bodyModel[383] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 398
		bodyModel[384] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 399
		bodyModel[385] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 400
		bodyModel[386] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 401
		bodyModel[387] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 402
		bodyModel[388] = new ModelRendererTurbo(this, 73, 329, textureX, textureY); // Box 403
		bodyModel[389] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Box 404
		bodyModel[390] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 405
		bodyModel[391] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 406
		bodyModel[392] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 407
		bodyModel[393] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 408
		bodyModel[394] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 409
		bodyModel[395] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 410
		bodyModel[396] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 411
		bodyModel[397] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Box 412
		bodyModel[398] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 413
		bodyModel[399] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 414
		bodyModel[400] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 415
		bodyModel[401] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 416
		bodyModel[402] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 417
		bodyModel[403] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 418
		bodyModel[404] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 419
		bodyModel[405] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Box 420
		bodyModel[406] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 421
		bodyModel[407] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 422
		bodyModel[408] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Box 423
		bodyModel[409] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 424
		bodyModel[410] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 425
		bodyModel[411] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Box 426
		bodyModel[412] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 427
		bodyModel[413] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Box 428
		bodyModel[414] = new ModelRendererTurbo(this, 273, 361, textureX, textureY); // Box 429
		bodyModel[415] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Box 430
		bodyModel[416] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 431
		bodyModel[417] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 432
		bodyModel[418] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 433
		bodyModel[419] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 434
		bodyModel[420] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Box 435
		bodyModel[421] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Box 436
		bodyModel[422] = new ModelRendererTurbo(this, 249, 345, textureX, textureY); // Box 437
		bodyModel[423] = new ModelRendererTurbo(this, 385, 329, textureX, textureY); // Box 438
		bodyModel[424] = new ModelRendererTurbo(this, 185, 345, textureX, textureY); // Box 439
		bodyModel[425] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 440
		bodyModel[426] = new ModelRendererTurbo(this, 201, 345, textureX, textureY); // Box 441
		bodyModel[427] = new ModelRendererTurbo(this, 369, 345, textureX, textureY); // Box 442
		bodyModel[428] = new ModelRendererTurbo(this, 25, 353, textureX, textureY); // Box 443
		bodyModel[429] = new ModelRendererTurbo(this, 41, 353, textureX, textureY); // Box 444
		bodyModel[430] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 445
		bodyModel[431] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Box 446
		bodyModel[432] = new ModelRendererTurbo(this, 473, 361, textureX, textureY); // Box 447
		bodyModel[433] = new ModelRendererTurbo(this, 361, 353, textureX, textureY); // Box 448
		bodyModel[434] = new ModelRendererTurbo(this, 489, 361, textureX, textureY); // Box 449
		bodyModel[435] = new ModelRendererTurbo(this, 313, 361, textureX, textureY); // Box 450
		bodyModel[436] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 451
		bodyModel[437] = new ModelRendererTurbo(this, 65, 369, textureX, textureY); // Box 452
		bodyModel[438] = new ModelRendererTurbo(this, 17, 369, textureX, textureY); // Box 453
		bodyModel[439] = new ModelRendererTurbo(this, 49, 369, textureX, textureY); // Box 454
		bodyModel[440] = new ModelRendererTurbo(this, 313, 369, textureX, textureY); // Box 455
		bodyModel[441] = new ModelRendererTurbo(this, 81, 369, textureX, textureY); // Box 456
		bodyModel[442] = new ModelRendererTurbo(this, 329, 369, textureX, textureY); // Box 457
		bodyModel[443] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Box 458
		bodyModel[444] = new ModelRendererTurbo(this, 377, 369, textureX, textureY); // Box 459
		bodyModel[445] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 460
		bodyModel[446] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Box 461
		bodyModel[447] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Box 462
		bodyModel[448] = new ModelRendererTurbo(this, 9, 265, textureX, textureY); // Box 463
		bodyModel[449] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 464
		bodyModel[450] = new ModelRendererTurbo(this, 369, 353, textureX, textureY); // Box 465
		bodyModel[451] = new ModelRendererTurbo(this, 337, 369, textureX, textureY); // Box 466
		bodyModel[452] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 467
		bodyModel[453] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 468
		bodyModel[454] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 469
		bodyModel[455] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 470
		bodyModel[456] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 471
		bodyModel[457] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 472
		bodyModel[458] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 473
		bodyModel[459] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 474
		bodyModel[460] = new ModelRendererTurbo(this, 481, 369, textureX, textureY); // Box 475
		bodyModel[461] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 477
		bodyModel[462] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 478
		bodyModel[463] = new ModelRendererTurbo(this, 89, 377, textureX, textureY); // Box 479
		bodyModel[464] = new ModelRendererTurbo(this, 409, 377, textureX, textureY); // Box 484
		bodyModel[465] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Box 485
		bodyModel[466] = new ModelRendererTurbo(this, 113, 385, textureX, textureY); // Box 486
		bodyModel[467] = new ModelRendererTurbo(this, 209, 385, textureX, textureY); // Box 507
		bodyModel[468] = new ModelRendererTurbo(this, 241, 385, textureX, textureY); // Box 508
		bodyModel[469] = new ModelRendererTurbo(this, 273, 385, textureX, textureY); // Box 510
		bodyModel[470] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 512
		bodyModel[471] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Box 513
		bodyModel[472] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Box 514
		bodyModel[473] = new ModelRendererTurbo(this, 233, 385, textureX, textureY); // Box 515
		bodyModel[474] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Box 541
		bodyModel[475] = new ModelRendererTurbo(this, 49, 393, textureX, textureY); // Box 542
		bodyModel[476] = new ModelRendererTurbo(this, 297, 393, textureX, textureY); // Box 543
		bodyModel[477] = new ModelRendererTurbo(this, 57, 401, textureX, textureY); // Box 544
		bodyModel[478] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Box 545
		bodyModel[479] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Box 546
		bodyModel[480] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Box 547
		bodyModel[481] = new ModelRendererTurbo(this, 113, 385, textureX, textureY); // Box 548
		bodyModel[482] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Box 549
		bodyModel[483] = new ModelRendererTurbo(this, 361, 305, textureX, textureY); // Box 550
		bodyModel[484] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Box 551
		bodyModel[485] = new ModelRendererTurbo(this, 169, 385, textureX, textureY); // Box 552
		bodyModel[486] = new ModelRendererTurbo(this, 209, 385, textureX, textureY); // Box 553
		bodyModel[487] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 554
		bodyModel[488] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Box 555
		bodyModel[489] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Box 556
		bodyModel[490] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Box 557
		bodyModel[491] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 558
		bodyModel[492] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 559
		bodyModel[493] = new ModelRendererTurbo(this, 401, 385, textureX, textureY); // Box 560
		bodyModel[494] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 561
		bodyModel[495] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 562
		bodyModel[496] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 563
		bodyModel[497] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Box 564
		bodyModel[498] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 565
		bodyModel[499] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 566

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, -0.25F, -3F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F); // Box 0
		bodyModel[0].setRotationPoint(-168F, -4.25F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, -0.25F, -2F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0F, -0.25F, -2F, -1F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-167F, -4.25F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 14, 0F,0.75F, -0.5F, 5F, 0F, -0.5F, 8.5F, 0F, -0.5F, 8.5F, 0.75F, -0.5F, 5F, 0.75F, 0F, 5F, 0F, 0F, 8.25F, 0F, 0F, 8.25F, 0.75F, 0F, 5F); // Box 2
		bodyModel[2].setRotationPoint(-130F, -4.25F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 27, 4, 14, 0F,0F, -0.5F, 8.5F, 0.5F, -0.5F, 9.5F, 0.5F, -0.5F, 9.5F, 0F, -0.5F, 8.5F, 0F, 0F, 8.25F, 0.5F, 0F, 9.25F, 0.5F, 0F, 9.25F, 0F, 0F, 8.25F); // Box 3
		bodyModel[3].setRotationPoint(-95F, -4.25F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 90, 7, 32, 0F,0F, -0.25F, 0.75F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F); // Box 4
		bodyModel[4].setRotationPoint(-67.5F, -7.25F, -16F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 32, 0F,0.5F, -0.25F, -11F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0.5F, -0.25F, -11F, 0.5F, 0.5F, -11F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, -11F); // Box 5
		bodyModel[5].setRotationPoint(-85.5F, -7.25F, -16F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 65, 7, 32, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, 0.75F); // Box 6
		bodyModel[6].setRotationPoint(22.5F, -7.25F, -16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 35, 7, 32, 0F,0F, -0.25F, -2F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, -0.25F, -2F, 0F, 0F, -4.25F, 0F, -1.25F, -8.25F, 0F, -1.25F, -8.25F, 0F, 0F, -4.25F); // Box 7
		bodyModel[7].setRotationPoint(87.5F, -7.25F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0.5F, -0.25F, 0.25F, 0.25F, -0.5F, 5F, 0.25F, -0.5F, 5F, 0.5F, -0.25F, 0.25F, 0.5F, 0F, 0F, 0.25F, 0F, 5F, 0.25F, 0F, 5F, 0.5F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-163F, -4.25F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 35, 7, 22, 0F,0F, -0.5F, 0F, 0F, 0.75F, -5.5F, 0F, 0.75F, -5.5F, 0F, -0.5F, 0F, 0F, -0.25F, -3.25F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, -0.25F, -3.25F); // Box 9
		bodyModel[9].setRotationPoint(122.5F, -8.25F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F,0F, -0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0.5F, -3F, -1.5F, 0.25F, -3.75F, -1.5F, 0.25F, -3.75F, 0F, 0.5F, -3F); // Box 10
		bodyModel[10].setRotationPoint(157.5F, -9.25F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F,0F, 0F, -0.5F, 0.75F, 0.0499999999999998F, -2.75F, 0.75F, 0.0499999999999998F, -2.75F, 0F, 0F, -0.5F, 1.5F, 0.25F, -3.75F, -1.5F, 0.25F, -4F, -1.5F, 0.25F, -4F, 1.5F, 0.25F, -3.75F); // Box 11
		bodyModel[11].setRotationPoint(162.5F, -9.25F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-0.75F, 0.0499999999999996F, 0.25F, 0F, 0.0999999999999998F, -1.75F, 0F, 0.0999999999999998F, -1.75F, -0.75F, 0.0499999999999996F, 0.25F, 1.5F, 0.25F, -1F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, 1.5F, 0.25F, -1F); // Box 12
		bodyModel[12].setRotationPoint(165.5F, -9.25F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 35, 4, 14, 0F,0.75F, -0.5F, 5F, 0F, -0.5F, 8.25F, 0F, -0.5F, 8.25F, 0.75F, -0.5F, 5F, 0.75F, 0F, 4.75F, 0F, 0F, 8F, 0F, 0F, 8F, 0.75F, 0F, 4.75F); // Box 13
		bodyModel[13].setRotationPoint(-130F, -0.75F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 27, 4, 14, 0F,0F, -0.5F, 8.25F, 0.5F, -0.5F, 9.25F, 0.5F, -0.5F, 9.25F, 0F, -0.5F, 8.25F, 0F, 0F, 8F, 0.5F, 0F, 8.75F, 0.5F, 0F, 8.75F, 0F, 0F, 8F); // Box 14
		bodyModel[14].setRotationPoint(-95F, -0.75F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 90, 4, 32, 0F,0F, -0.25F, 0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 15
		bodyModel[15].setRotationPoint(-67.5F, -0.75F, -16F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 65, 4, 32, 0F,0F, -0.25F, 0.75F, 0F, -0.25F, -4.25F, 0F, -0.25F, -4.25F, 0F, -0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, 0.25F); // Box 16
		bodyModel[16].setRotationPoint(22.5F, -0.75F, -16F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 35, 4, 32, 0F,0F, -0.25F, -4.25F, 0F, 0.75F, -8.25F, 0F, 0.75F, -8.25F, 0F, -0.25F, -4.25F, 0F, 0F, -4.75F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, -4.75F); // Box 17
		bodyModel[17].setRotationPoint(87.5F, -0.75F, -16F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 35, 4, 20, 0F,0F, 0.75F, -2.25F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, 0.75F, -2.25F, 0F, 0F, -3.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3.5F); // Box 18
		bodyModel[18].setRotationPoint(122.5F, -0.75F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,0F, 0F, 0F, 0.45F, 0.25F, -0.75F, 0.45F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 0F, 0F, -1F); // Box 19
		bodyModel[19].setRotationPoint(157.5F, -2.75F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 6, 4, 0F,-0.45F, 0.25F, -0.75F, 0.5F, 0.25F, -1F, 0.5F, 0.25F, -1F, -0.45F, 0.25F, -0.75F, 1F, 0F, -1.25F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 1F, 0F, -1.25F); // Box 20
		bodyModel[20].setRotationPoint(160.5F, -2.75F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 32, 4, 14, 0F,0.5F, -0.5F, 0F, 0.25F, -0.5F, 5F, 0.25F, -0.5F, 5F, 0.5F, -0.5F, 0F, 0.5F, 0F, -2.25F, 0.25F, 0F, 4.75F, 0.25F, 0F, 4.75F, 0.5F, 0F, -2.25F); // Box 21
		bodyModel[21].setRotationPoint(-163F, -0.75F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,-1F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, -2F, -2.5F, 0F, -4.25F, 0.5F, 0F, -2.25F, 0.5F, 0F, -2.25F, -2.5F, 0F, -4.25F); // Box 22
		bodyModel[22].setRotationPoint(-167F, -0.75F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2.5F, -1.5F, -3F, 1.5F, -0.5F, -2.25F, 1.5F, -0.5F, -2.25F, -2.5F, -1.5F, -3F); // Box 23
		bodyModel[23].setRotationPoint(-168F, -0.25F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,1.5F, 0.25F, -1F, -2.75F, 0.25F, -1.75F, -2.75F, 0.25F, -1.75F, 1.5F, 0.25F, -1F, 4F, 0F, -1.5F, -5F, 0F, -1.75F, -5F, 0F, -1.75F, 4F, 0F, -1.5F); // Box 24
		bodyModel[24].setRotationPoint(165.5F, -2.75F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 25
		bodyModel[25].setRotationPoint(166.3F, -20.25F, -0.5F);

		bodyModel[26].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F); // Box 26
		bodyModel[26].setRotationPoint(166.8F, -12.25F, 0F);
		bodyModel[26].rotateAngleY = -0.19198622F;
		bodyModel[26].rotateAngleZ = -0.80285146F;

		bodyModel[27].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,-0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F); // Box 27
		bodyModel[27].setRotationPoint(166.8F, -12.25F, 0F);
		bodyModel[27].rotateAngleY = 0.19198622F;
		bodyModel[27].rotateAngleZ = -0.80285146F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 8, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 1F, -0.5F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-87.5F, -9.25F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-0.25F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, -1.75F, 0F, 0F, 2F, 0F, 0F, 2F, -0.25F, 0F, -1.75F); // Box 29
		bodyModel[29].setRotationPoint(-89.5F, -9.25F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.25F, 2F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, 0F, -0.25F, 2F, 0F, 0F, 2F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, 0F, 0F, 2F); // Box 30
		bodyModel[30].setRotationPoint(-80.5F, -9.25F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F); // Box 31
		bodyModel[31].setRotationPoint(-83.5F, -9.25F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -0.25F, 1F, 0.5F, -0.25F, 1.25F, 0.5F, -0.25F, 1.25F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0F, 0F, 1F); // Box 32
		bodyModel[32].setRotationPoint(-86F, -9.25F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 90, 7, 32, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1.85F, 0F, -0.95F, -1.65F, 0F, -0.95F, -1.65F, 0F, -0.25F, -1.85F); // Box 33
		bodyModel[33].setRotationPoint(-67.5F, 3.25F, -16F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 65, 6, 32, 0F,0F, 0F, 0.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, 0.25F, 0F, 0.0500000000000003F, -1.65F, 0F, 0.35F, -6.9F, 0F, 0.35F, -6.9F, 0F, 0.0500000000000003F, -1.65F); // Box 34
		bodyModel[34].setRotationPoint(22.5F, 3.25F, -16F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 35, 6, 32, 0F,0F, 0F, -4.75F, 0F, 0F, -9.5F, 0F, 0F, -9.5F, 0F, 0F, -4.75F, 0F, 0.35F, -6.9F, 0F, 2.45F, -11.55F, 0F, 2.45F, -11.55F, 0F, 0.35F, -6.9F); // Box 35
		bodyModel[35].setRotationPoint(87.5F, 3.25F, -16F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 35, 7, 20, 0F,0F, 0F, -3.5F, 2F, 0F, -9.25F, 2F, 0F, -9.25F, 0F, 0F, -3.5F, 0F, 1.45F, -5.55F, -1.3F, 3.1F, -8.6F, -1.3F, 3.1F, -8.6F, 0F, 1.45F, -5.55F); // Box 36
		bodyModel[36].setRotationPoint(122.5F, 3.25F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 10, 4, 0F,1F, 0F, -1.25F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 1F, 0F, -1.25F, 4.3F, 0.1F, -0.6F, -5.75F, 0.2F, -0.9F, -5.75F, 0.2F, -0.9F, 4.3F, 0.1F, -0.6F); // Box 37
		bodyModel[37].setRotationPoint(160.5F, 3.25F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,4F, 0F, -1.5F, -5F, 0F, -1.75F, -5F, 0F, -1.75F, 4F, 0F, -1.5F, 7.75F, 0.2F, -0.9F, -9.15F, 1.05F, -1.95F, -9.15F, 1.05F, -1.95F, 7.75F, 0.2F, -0.9F); // Box 38
		bodyModel[38].setRotationPoint(165.5F, 3.25F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 27, 7, 14, 0F,0F, 0F, 8F, 0.5F, 0F, 8.75F, 0.5F, 0F, 8.75F, 0F, 0F, 8F, 0F, -0.5F, 6.15F, 0.5F, -0.250000000000001F, 7.15F, 0.5F, -0.250000000000001F, 7.15F, 0F, -0.5F, 6.15F); // Box 39
		bodyModel[39].setRotationPoint(-95F, 3.25F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 35, 5, 14, 0F,0.75F, 0F, 4.75F, 0F, 0F, 8F, 0F, 0F, 8F, 0.75F, 0F, 4.75F, 0.75F, -2.5F, 2F, 0F, 1.5F, 6.1F, 0F, 1.5F, 6.1F, 0.75F, -2.5F, 2F); // Box 40
		bodyModel[40].setRotationPoint(-130F, 3.25F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 32, 3, 14, 0F,0.5F, 0F, -2.25F, 0.25F, 0F, 4.75F, 0.25F, 0F, 4.75F, 0.5F, 0F, -2.25F, 0.5F, -2.3F, -6.9F, 0.25F, -0.5F, 2F, 0.25F, -0.5F, 2F, 0.5F, -2.3F, -6.9F); // Box 41
		bodyModel[41].setRotationPoint(-163F, 3.25F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, -0.3F, -0.7F, -2F, 0F, -0.3F, -3.8F, 0F, -0.3F, -3.8F, -0.3F, -0.7F, -2F); // Box 42
		bodyModel[42].setRotationPoint(-164.5F, 3.25F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 65, 4, 32, 0F,0F, -0.0499999999999997F, -1.65F, 0F, -0.35F, -6.9F, 0F, -0.35F, -6.9F, 0F, -0.0499999999999997F, -1.65F, 0F, 0F, -8.85F, 0F, 0F, -11.3F, 0F, 0F, -11.3F, 0F, 0F, -8.85F); // Box 43
		bodyModel[43].setRotationPoint(22.5F, 9.25F, -16F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 35, 2, 18, 0F,0F, 1.65F, 0.1F, 0F, -0.45F, -4.55F, 0F, -0.45F, -4.55F, 0F, 1.65F, 0.1F, 0F, 0F, -4.3F, 0F, 0F, -6.6F, 0F, 0F, -6.6F, 0F, 0F, -4.3F); // Box 44
		bodyModel[44].setRotationPoint(87.5F, 11.25F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 34, 2, 6, 0F,0F, 1.55F, 1.45F, -0.3F, -0.1F, -1.6F, -0.3F, -0.1F, -1.6F, 0F, 1.55F, 1.45F, 0F, -2F, -0.6F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -2F, -0.6F); // Box 45
		bodyModel[45].setRotationPoint(122.5F, 13.25F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.3F, -0.1F, 0.4F, -1.7F, -0.2F, 0.1F, -1.7F, -0.2F, 0.1F, 0.3F, -0.1F, 0.4F, 0F, -0.4F, -1F, -1.1F, -0.95F, -0.95F, -1.1F, -0.95F, -0.95F, 0F, -0.4F, -1F); // Box 46
		bodyModel[46].setRotationPoint(156.5F, 13.25F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 90, 4, 32, 0F,0F, 0.25F, -1.85F, 0F, 0.95F, -1.65F, 0F, 0.95F, -1.65F, 0F, 0.25F, -1.85F, 0F, -0.6F, -8.65F, 0F, -1F, -8.85F, 0F, -1F, -8.85F, 0F, -0.6F, -8.65F); // Box 47
		bodyModel[47].setRotationPoint(-67.5F, 10.25F, -16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 27, 4, 14, 0F,0F, 0F, 6.15F, 0.5F, -0.3F, 7.15F, 0.5F, -0.3F, 7.15F, 0F, 0F, 6.15F, 0F, -0.6F, -0.100000000000001F, 0.5F, -0.0999999999999999F, 0.350000000000001F, 0.5F, -0.0999999999999999F, 0.350000000000001F, 0F, -0.6F, -0.100000000000001F); // Box 48
		bodyModel[48].setRotationPoint(-95F, 9.75F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 35, 3, 14, 0F,0.8F, 4.5F, 2F, 0F, 0.5F, 6.1F, 0F, 0.5F, 6.1F, 0.8F, 4.5F, 2F, 0F, -4.7F, -2.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.7F, -2.1F); // Box 49
		bodyModel[49].setRotationPoint(-130F, 10.25F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 32, 3, 14, 0F,0.5F, 2.3F, -6.9F, 0.2F, 0.5F, 2F, 0.2F, 0.5F, 2F, 0.5F, 2.3F, -6.9F, -13.9F, -2.9F, -4.8F, 1.1F, -0.7F, -2.1F, 1.1F, -0.7F, -2.1F, -13.9F, -2.9F, -4.8F); // Box 50
		bodyModel[50].setRotationPoint(-163F, 6.25F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-152F, 4.75F, -0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -1.9F, 0.4F, 0F, -1.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-152F, 8.75F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F); // Box 53
		bodyModel[53].setRotationPoint(-146F, 4.75F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 29.9F, -1.1F, 0F, 29.9F, -1.1F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(-133F, 5.25F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, 0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0.6F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0F, -0.3F, 0F); // Box 55
		bodyModel[55].setRotationPoint(-159F, 7.25F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0.4F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.4F, 0.3F, 0F, 0.4F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -0.4F, 0F); // Box 56
		bodyModel[56].setRotationPoint(-152F, 11.25F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -0.4F, 0F); // Box 57
		bodyModel[57].setRotationPoint(-148F, 11.25F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, -0.8F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -1.6F, 0F, -1.11022302462516E-16F, -0.3F, 0F, -1.11022302462516E-16F, -0.3F, 0F, 0F, -1.6F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-160F, 7.25F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, -0.25F, 1.05F, 0F, -0.25F, 1.1F, 0F, -0.25F, 1.1F, 0F, -0.25F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, 1.05F); // Box 59
		bodyModel[59].setRotationPoint(-72F, -10.75F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 19, 4, 3, 0F,0F, -0.25F, 1.05F, 0F, -0.25F, 8.95F, 0F, -0.25F, 8.85F, 0F, -0.25F, 1.05F, 0F, 0F, 1.05F, 0F, 0F, 8.85F, 0F, 0F, 8.85F, 0F, 0F, 1.05F); // Box 60
		bodyModel[60].setRotationPoint(-66F, -11.05F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 20, 0F,0F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 61
		bodyModel[61].setRotationPoint(-47F, -11.05F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, -0.25F, 0.25F, 0.5F, -0.25F, -1.5F, 0.5F, -0.25F, -1.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0.25F); // Box 62
		bodyModel[62].setRotationPoint(-44.8F, -11.05F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-43.3F, -10.8F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 17, 0F,0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-40.3F, -10.8F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 14, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-39.8F, -10.8F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[66].setRotationPoint(-26F, -10.8F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-18F, -10.8F, -7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 30, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-15F, -10.8F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(15F, -10.8F, -15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(17F, -10.95F, -17.45F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(19F, -10.95F, -17.45F);
		bodyModel[71].rotateAngleY = 0.04363323F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(39F, -10.95F, -16.5F);
		bodyModel[72].rotateAngleY = 0.05235988F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(17F, -10.95F, 16.45F);

		bodyModel[74].addShapeBox(0F, 0F, -1F, 20, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(19F, -10.95F, 17.45F);
		bodyModel[74].rotateAngleY = -0.04363323F;

		bodyModel[75].addShapeBox(0F, 0F, -1F, 2, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(39F, -10.95F, 16.6F);
		bodyModel[75].rotateAngleY = -0.05235988F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 24, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(17F, -10.8F, -16.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.75F, 0F, 0F, -8.75F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(41F, -10.8F, -16F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 5, 16, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 78
		bodyModel[78].setRotationPoint(46F, -10.8F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 5, 16, 0F,0F, 0F, -0.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.75F); // Box 79
		bodyModel[79].setRotationPoint(58F, -10.8F, -8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 5, 21, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 80
		bodyModel[80].setRotationPoint(62F, -10.8F, -10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 5, 21, 0F,0F, 0F, 0.25F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0.25F); // Box 81
		bodyModel[81].setRotationPoint(67F, -10.8F, -10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 82
		bodyModel[82].setRotationPoint(73F, -10.8F, -5.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 83
		bodyModel[83].setRotationPoint(-47.2F, -16.15F, -5.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, -0.25F, -2F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F); // Box 84
		bodyModel[84].setRotationPoint(-49.2F, -16.15F, -5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, -0.25F, 0.25F, 0.25F, -0.25F, -4F, 0.25F, -0.25F, -4F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -4F, 0.25F, 0F, -4F, 0F, 0F, 0.25F); // Box 85
		bodyModel[85].setRotationPoint(-39F, -16.15F, -5.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0.2F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 86
		bodyModel[86].setRotationPoint(-47.2F, -14.55F, -4.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 4, 9, 0F,0F, -0.25F, 0.25F, 0.2F, -0.25F, -3.25F, 0.2F, -0.25F, -3.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0.2F, 0F, -3.25F, 0.2F, 0F, -3.25F, 0F, 0F, 0.25F); // Box 87
		bodyModel[87].setRotationPoint(-40F, -14.55F, -4.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 88
		bodyModel[88].setRotationPoint(-43F, -18.15F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.2F, 0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.25F, 0.2F, 0.7F, 0.25F, 0.2F, 0.7F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F); // Box 89
		bodyModel[89].setRotationPoint(-43.5F, -21.45F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F); // Box 90
		bodyModel[90].setRotationPoint(-44.7F, -21.45F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 91
		bodyModel[91].setRotationPoint(-44.7F, -19.95F, -3.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[92].setRotationPoint(-44.5F, -19.25F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
		bodyModel[93].setRotationPoint(-41F, -21.75F, -3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 94
		bodyModel[94].setRotationPoint(-40F, -20.95F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[95].setRotationPoint(-24.5F, -24.75F, -2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 14, 5, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 96
		bodyModel[96].setRotationPoint(-19.5F, -24.75F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F); // Box 97
		bodyModel[97].setRotationPoint(-26F, -24.75F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(-14F, -24.75F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(-14F, -25.75F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[100].setRotationPoint(-19.5F, -25.75F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[101].setRotationPoint(-24.5F, -25.75F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F); // Box 102
		bodyModel[102].setRotationPoint(-26F, -25.75F, -2.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0.75F, -1F, -1.25F, -1.5F, 2F, 0F, -1.5F, 2F, 0F, 0.75F, -1F, -1.25F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.25F); // Box 103
		bodyModel[103].setRotationPoint(-23.5F, -27.75F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,1.5F, 2F, 0F, -0.75F, 1.25F, -1F, -0.75F, 1.25F, -1F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-19.5F, -27.75F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-2.25F, 0.25F, -1.5F, 1.25F, -1.5F, -2.25F, 1.25F, -1.5F, -2.25F, -2.25F, 0.25F, -1.5F, 0.5F, 0F, 0F, 1.25F, 0.75F, -1F, 1.25F, 0.75F, -1F, 0.5F, 0F, 0F); // Box 105
		bodyModel[105].setRotationPoint(-20.5F, -31.75F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0.25F, 0.5F, -1.25F, -0.75F, -4F, -1.75F, -0.75F, -4F, -1.75F, 0.25F, 0.5F, -1.25F, 0.25F, -1.25F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0.25F, -1.25F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-16F, -29.75F, -2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.75F, -1.5F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.5F, -0.75F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -1.5F); // Box 107
		bodyModel[107].setRotationPoint(-25.5F, -26.75F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 1, 19, 0F,0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[108].setRotationPoint(4F, -10.8F, -9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 11, 1, 19, 0F,0F, 0F, -3.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3.5F); // Box 109
		bodyModel[109].setRotationPoint(-7F, -10.8F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[110].setRotationPoint(-13F, -22.75F, -2.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 111
		bodyModel[111].setRotationPoint(-10F, -22.75F, -2.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 112
		bodyModel[112].setRotationPoint(-14F, -22.75F, -2.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.75F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F); // Box 113
		bodyModel[113].setRotationPoint(-12F, -27.25F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.75F, 0F, 0.25F, 0.5F, 0F, -3.25F, 0.5F, 0F, -3.25F, 0.75F, 0F, 0.25F, 0.75F, 0.5F, 0.25F, 0.5F, 0.5F, -3.25F, 0.5F, 0.5F, -3.25F, 0.75F, 0.5F, 0.25F); // Box 114
		bodyModel[114].setRotationPoint(-10F, -27.25F, -4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.5F, 0F, -3.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.5F, 0F, -3.25F, 0.5F, 0.5F, -3.25F, 0.75F, 0.5F, 0.25F, 0.75F, 0.5F, 0.25F, 0.5F, 0.5F, -3.25F); // Box 115
		bodyModel[115].setRotationPoint(-14.5F, -27.25F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[116].setRotationPoint(-16.5F, -30.85F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[117].setRotationPoint(-16.5F, -30.85F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[118].setRotationPoint(-16.5F, -30.85F, 3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 119
		bodyModel[119].setRotationPoint(-16.5F, -30.85F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[120].setRotationPoint(-13.75F, -31.85F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 122
		bodyModel[121].setRotationPoint(-13.75F, -32.85F, 4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F); // Box 123
		bodyModel[122].setRotationPoint(-13.75F, -33.85F, 4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 124
		bodyModel[123].setRotationPoint(-13.75F, -34.85F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.75F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[124].setRotationPoint(-13.75F, -35.85F, 4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[125].setRotationPoint(-13.75F, -31.85F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 127
		bodyModel[126].setRotationPoint(-13.75F, -32.85F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, 0F, 0.75F); // Box 128
		bodyModel[127].setRotationPoint(-13.75F, -33.85F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 129
		bodyModel[128].setRotationPoint(-13.75F, -34.85F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.75F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[129].setRotationPoint(-13.75F, -35.85F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F); // Box 131
		bodyModel[130].setRotationPoint(-9.25F, -46.5F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 23, 0F,-0.25F, 0F, 3.25F, -0.25F, 0F, 3.25F, -0.25F, 0F, 3.25F, -0.25F, 0F, 3.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 132
		bodyModel[131].setRotationPoint(-9.25F, -39.5F, -11.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 17, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 133
		bodyModel[132].setRotationPoint(14F, -16.85F, -7.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 11, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 134
		bodyModel[133].setRotationPoint(14F, -19.75F, -7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 135
		bodyModel[134].setRotationPoint(14F, -22.45F, -4.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 136
		bodyModel[135].setRotationPoint(-10.25F, -45.05F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F); // Box 137
		bodyModel[136].setRotationPoint(-7.25F, -45.05F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.5F); // Box 138
		bodyModel[137].setRotationPoint(-12.25F, -45.05F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 139
		bodyModel[138].setRotationPoint(-17.25F, -45.05F, -1.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.3F, -1.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.25F, 0F, -0.3F, -1.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.25F); // Box 140
		bodyModel[139].setRotationPoint(-18.25F, -45.05F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -0.3F, 0.25F, 0.5F, -0.3F, -2F, 0.5F, -0.3F, -2F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 0.5F, -0.3F, -2F, 0.5F, -0.3F, -2F, 0F, -0.3F, 0.25F); // Box 141
		bodyModel[140].setRotationPoint(-10.5F, -40.25F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,1F, -0.3F, -1.5F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 1F, -0.3F, -1.5F, 1F, -0.3F, -1.5F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, 1F, -0.3F, -1.5F); // Box 142
		bodyModel[141].setRotationPoint(-17.5F, -40.25F, -3.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[142].setRotationPoint(-17.25F, -44.5F, -0.5F);

		bodyModel[143].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 144
		bodyModel[143].setRotationPoint(-10F, -39.75F, 1F);
		bodyModel[143].rotateAngleX = 0.10471976F;
		bodyModel[143].rotateAngleZ = -0.33161256F;

		bodyModel[144].addShapeBox(-0.5F, 0F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F); // Box 145
		bodyModel[144].setRotationPoint(-10F, -39.75F, -1F);
		bodyModel[144].rotateAngleX = -0.10471976F;
		bodyModel[144].rotateAngleZ = -0.33161256F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[145].setRotationPoint(-17.25F, -51.5F, -0.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 147
		bodyModel[146].setRotationPoint(-17.25F, -55.5F, -0.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 148
		bodyModel[147].setRotationPoint(-20.25F, -51.75F, -0.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 149
		bodyModel[148].setRotationPoint(-171F, -16.25F, -0.5F);
		bodyModel[148].rotateAngleZ = 0.2443461F;

		bodyModel[149].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F); // Box 150
		bodyModel[149].setRotationPoint(-168.5F, -8.25F, 0F);
		bodyModel[149].rotateAngleY = -0.19198622F;
		bodyModel[149].rotateAngleZ = 0.59341195F;

		bodyModel[150].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F, -0.3F, 0F, -0.35F); // Box 151
		bodyModel[150].setRotationPoint(-168.5F, -8.25F, 0F);
		bodyModel[150].rotateAngleY = 0.19198622F;
		bodyModel[150].rotateAngleZ = 0.59341195F;

		bodyModel[151].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 155F, -0.4F, -0.4F, 155F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 157F, -0.4F, -0.4F, 157F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 152
		bodyModel[151].setRotationPoint(-168.5F, -8.25F, 0F);
		bodyModel[151].rotateAngleY = -0.00698132F;
		bodyModel[151].rotateAngleZ = 0.23387412F;

		bodyModel[152].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 155F, -0.4F, -0.4F, 155F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 157F, -0.4F, -0.4F, 157F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 153
		bodyModel[152].setRotationPoint(-168.5F, -8.25F, 0F);
		bodyModel[152].rotateAngleY = 0.00698132F;
		bodyModel[152].rotateAngleZ = 0.23387412F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 154
		bodyModel[153].setRotationPoint(19F, -22.45F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 155
		bodyModel[154].setRotationPoint(25F, -23.75F, -3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0.3F, 0.75F, 0F, 3.3F, 0.75F, 0F, 3.3F, 0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0.75F, -0.7F, 3.3F, 0.75F, -0.7F, 3.3F, 0F, -0.7F, 0.3F); // Box 156
		bodyModel[155].setRotationPoint(25F, -23.85F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 8, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 157
		bodyModel[156].setRotationPoint(31F, -23.75F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, 0.25F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 158
		bodyModel[157].setRotationPoint(36F, -19.75F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 16, 8, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 159
		bodyModel[158].setRotationPoint(39F, -23.75F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 8, 15, 0F,0.25F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.25F, 0F, 0.8F, 0.25F, -0.3F, 0.8F, 0.5F, -0.3F, 0.8F, 0.5F, -0.3F, 0.8F, 0.25F, -0.3F, 0.8F); // Box 160
		bodyModel[159].setRotationPoint(55F, -23.75F, -7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 8, 15, 0F,0F, 0F, 0.8F, -2F, 0F, -1.7F, -2F, 0F, -1.7F, 0F, 0F, 0.8F, 0F, -0.3F, 0.8F, -2F, -0.3F, -1.7F, -2F, -0.3F, -1.7F, 0F, -0.3F, 0.8F); // Box 161
		bodyModel[160].setRotationPoint(64.5F, -23.75F, -7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 10, 3, 21, 0F,0.25F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.25F, 0F, 0.55F); // Box 162
		bodyModel[161].setRotationPoint(55F, -26.75F, -10.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.25F, 0F, 0.55F, 1F, 0F, 0.55F, 1F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 1F, 0F, 0.55F, 1F, 0F, 0.55F, 0.25F, 0F, 0.55F); // Box 163
		bodyModel[162].setRotationPoint(55F, -28.75F, -10.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.25F, 0F, 0.55F, 1F, 0F, 0.55F, 1F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 1F, 0F, 0.55F, 1F, 0F, 0.55F, 0.25F, 0F, 0.55F); // Box 164
		bodyModel[163].setRotationPoint(55F, -28.75F, 8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 30, 6, 9, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 165
		bodyModel[164].setRotationPoint(31F, -15.95F, -4.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F,0F, 0F, 0.3F, 0.25F, 0F, 4.05F, 0.25F, 0F, 4.05F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0.25F, -0.3F, 4.05F, 0.25F, -0.3F, 4.05F, 0F, -0.3F, 0.3F); // Box 166
		bodyModel[165].setRotationPoint(61F, -15.95F, -4.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 6, 17, 0F,0F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 167
		bodyModel[166].setRotationPoint(62.25F, -15.85F, -8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 7, 6, 17, 0F,0F, 0F, 0.05F, 0.5F, 0F, -6.45F, 0.5F, 0F, -6.45F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.5F, 0F, -6.45F, 0.5F, 0F, -6.45F, 0F, 0F, 0.05F); // Box 168
		bodyModel[167].setRotationPoint(65.5F, -15.85F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 31, 1, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 169
		bodyModel[168].setRotationPoint(31F, -16.05F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F); // Box 170
		bodyModel[169].setRotationPoint(34.4F, -28.95F, -2F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F); // Box 171
		bodyModel[170].setRotationPoint(34.4F, -29.95F, -2.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 172
		bodyModel[171].setRotationPoint(28.9F, -29.95F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 173
		bodyModel[172].setRotationPoint(23.9F, -29.95F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, -1.75F); // Box 174
		bodyModel[173].setRotationPoint(22.4F, -29.95F, -2.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F); // Box 175
		bodyModel[174].setRotationPoint(22.4F, -28.95F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 7, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[175].setRotationPoint(23.9F, -28.95F, -2.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 177
		bodyModel[176].setRotationPoint(28.9F, -28.95F, -2.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0.5F, -0.25F, -0.75F, -0.25F, 1.25F, 0.25F, -0.25F, 1.25F, 0.25F, 0.5F, -0.25F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.75F); // Box 178
		bodyModel[177].setRotationPoint(24.9F, -30.95F, -2.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0.25F, 0.25F, 0.25F, 0F, 1.75F, -0.75F, 0F, 1.75F, -0.75F, 0.25F, 0.25F, 0.25F, 0F, 0F, 0.5F, 1F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, 0.5F); // Box 179
		bodyModel[178].setRotationPoint(28.9F, -31.95F, -2.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.75F, -0.25F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, 0.75F, -0.25F, -1F, 0F, -0.25F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, -1F, 0F, -0.25F); // Box 180
		bodyModel[179].setRotationPoint(32.9F, -32.95F, -2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, -0.5F, -1.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.5F, -0.5F, -1.75F, 0.5F, 0F, -1.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -1.75F); // Box 181
		bodyModel[180].setRotationPoint(23.9F, -30.95F, -2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0.25F, 0F, 0.3F, 1.25F, 0F, 0.3F, 1.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 0.25F, -0.7F, 0.3F); // Box 182
		bodyModel[181].setRotationPoint(32F, -23.85F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0.3F, 1.25F, 0F, 5.3F, 1.25F, 0F, 5.3F, 0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 1.25F, -0.7F, 5.3F, 1.25F, -0.7F, 5.3F, 0F, -0.7F, 0.3F); // Box 183
		bodyModel[182].setRotationPoint(39.2F, -23.85F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 24, 0F,0F, 0F, 0.3F, 0.75F, 0F, 0.3F, 0.75F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.7F, 0.3F, 0.75F, -0.7F, 0.3F, 0.75F, -0.7F, 0.3F, 0F, -0.7F, 0.3F); // Box 184
		bodyModel[183].setRotationPoint(41.45F, -23.85F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0.25F, 0F, 0.1F, 1.25F, 0F, 0.1F, 1.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, -0.7F, 0.1F, 1.25F, -0.7F, 0.1F, 1.25F, -0.7F, 0.1F, 0.25F, -0.7F, 0.1F); // Box 185
		bodyModel[184].setRotationPoint(46.45F, -23.85F, -8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.4F, 0.3F); // Box 186
		bodyModel[185].setRotationPoint(-28.3F, -10.25F, -6.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 187
		bodyModel[186].setRotationPoint(-28.2F, -9.25F, -6.8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 188
		bodyModel[187].setRotationPoint(-27.8F, -9.25F, -6.8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.4F, 0.3F); // Box 189
		bodyModel[188].setRotationPoint(31.5F, -14.25F, 4.2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 190
		bodyModel[189].setRotationPoint(31.6F, -13.25F, 4.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 191
		bodyModel[190].setRotationPoint(32F, -13.25F, 4.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, 0.25F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 192
		bodyModel[191].setRotationPoint(41.5F, -16.05F, -8.5F);

		bodyModel[192].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 193
		bodyModel[192].setRotationPoint(41.7F, -18.05F, -7.5F);
		bodyModel[192].rotateAngleY = -1.08210414F;

		bodyModel[193].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 194
		bodyModel[193].setRotationPoint(44.9F, -18.05F, -8.7F);
		bodyModel[193].rotateAngleY = 1.11701072F;

		bodyModel[194].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 195
		bodyModel[194].setRotationPoint(42.5F, -18.05F, -8.8F);

		bodyModel[195].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 196
		bodyModel[195].setRotationPoint(35.1F, -18.05F, -7.3F);

		bodyModel[196].addShapeBox(0F, 0F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 197
		bodyModel[196].setRotationPoint(45.5F, -18.05F, -7.3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 198
		bodyModel[197].setRotationPoint(53F, -16.05F, -9.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 199
		bodyModel[198].setRotationPoint(59F, -16.05F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0.5F); // Box 200
		bodyModel[199].setRotationPoint(63.6F, -16.05F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.25F, 0F, -0.3F, -2.25F, 0F, -0.3F, 0.5F); // Box 201
		bodyModel[200].setRotationPoint(71.1F, -16.05F, -7.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 202
		bodyModel[201].setRotationPoint(53F, -16.05F, 7.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 203
		bodyModel[202].setRotationPoint(59F, -16.05F, 8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, -0.5F, -0.3F, 0.5F, -0.75F, -0.3F, 0.5F); // Box 204
		bodyModel[203].setRotationPoint(41.5F, -16.05F, 7.5F);

		bodyModel[204].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 205
		bodyModel[204].setRotationPoint(41.7F, -18.05F, 7.5F);
		bodyModel[204].rotateAngleY = 1.08210414F;

		bodyModel[205].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.75F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 206
		bodyModel[205].setRotationPoint(44.9F, -18.05F, 8.7F);
		bodyModel[205].rotateAngleY = -1.11701072F;

		bodyModel[206].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 207
		bodyModel[206].setRotationPoint(42.5F, -18.05F, 8.8F);

		bodyModel[207].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 208
		bodyModel[207].setRotationPoint(35.1F, -18.05F, 7.3F);

		bodyModel[208].addShapeBox(0F, 0F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 209
		bodyModel[208].setRotationPoint(45.5F, -18.05F, 7.3F);

		bodyModel[209].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 210
		bodyModel[209].setRotationPoint(30F, -18.05F, -7.3F);

		bodyModel[210].addShapeBox(0F, 0F, -0.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 211
		bodyModel[210].setRotationPoint(30F, -18.05F, 7.3F);

		bodyModel[211].addShapeBox(-0.5F, 0F, 0F, 1, 2, 10, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 212
		bodyModel[211].setRotationPoint(73F, -18.25F, -5F);

		bodyModel[212].addShapeBox(-0.5F, 0F, 0F, 1, 2, 3, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 213
		bodyModel[212].setRotationPoint(71.1F, -18.25F, -7.8F);
		bodyModel[212].rotateAngleY = -0.62831853F;

		bodyModel[213].addShapeBox(-0.5F, 0F, 0F, 1, 2, 3, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 214
		bodyModel[213].setRotationPoint(72.85F, -18.25F, 5.4F);
		bodyModel[213].rotateAngleY = 0.62831853F;

		bodyModel[214].addShapeBox(0F, 0F, -0.5F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.5F, 0.2F, -0.4F, 0.5F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 215
		bodyModel[214].setRotationPoint(65.5F, -18.25F, -8.3F);
		bodyModel[214].rotateAngleY = 0.06981317F;

		bodyModel[215].addShapeBox(0F, 0F, -0.5F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.5F, 0.2F, -0.4F, 0.5F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 216
		bodyModel[215].setRotationPoint(65.5F, -18.25F, 8.3F);
		bodyModel[215].rotateAngleY = -0.06981317F;

		bodyModel[216].addShapeBox(-0.5F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 1F, -0.4F, 0.25F, 1F); // Box 217
		bodyModel[216].setRotationPoint(65.35F, -18.25F, -11.3F);

		bodyModel[217].addShapeBox(-0.5F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 1F, -0.4F, 0.25F, 1F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 218
		bodyModel[217].setRotationPoint(65.35F, -18.25F, 9.3F);

		bodyModel[218].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 219
		bodyModel[218].setRotationPoint(59F, -18.25F, -11.4F);

		bodyModel[219].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 220
		bodyModel[219].setRotationPoint(59F, -18.25F, 11.4F);

		bodyModel[220].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F); // Box 221
		bodyModel[220].setRotationPoint(59.1F, -18.25F, -11.3F);

		bodyModel[221].addShapeBox(-0.5F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 222
		bodyModel[221].setRotationPoint(59.1F, -18.25F, 10.3F);

		bodyModel[222].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 223
		bodyModel[222].setRotationPoint(53F, -18.25F, -9.9F);

		bodyModel[223].addShapeBox(0F, 0F, -0.5F, 6, 2, 1, 0F,0F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0.25F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 224
		bodyModel[223].setRotationPoint(53F, -18.25F, 9.9F);

		bodyModel[224].addShapeBox(-0.5F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F); // Box 225
		bodyModel[224].setRotationPoint(53.1F, -18.25F, -9.7F);

		bodyModel[225].addShapeBox(-0.5F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.25F, -0.4F, 0F, 0.25F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F); // Box 226
		bodyModel[225].setRotationPoint(53.1F, -18.25F, 7.7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.25F, 0.25F, 1.05F, 0F, 0.25F, 1.05F, 0F, 0.25F, 1.05F, 0.25F, 0.25F, 1.05F, 0.25F, -0.3F, 1.05F, 0F, -0.3F, 1.05F, 0F, -0.3F, 1.05F, 0.25F, -0.3F, 1.05F); // Box 227
		bodyModel[226].setRotationPoint(57.8F, -22.75F, -14F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0.25F, 0.25F, 1.05F, 0F, 0.25F, 1.05F, 0F, 0.25F, 1.05F, 0.25F, 0.25F, 1.05F, 0.25F, -0.3F, 1.05F, 0F, -0.3F, 1.05F, 0F, -0.3F, 1.05F, 0.25F, -0.3F, 1.05F); // Box 228
		bodyModel[227].setRotationPoint(57.8F, -22.75F, 9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.3F, 0.5F, -0.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 229
		bodyModel[228].setRotationPoint(32.5F, -16.05F, -8.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 231
		bodyModel[229].setRotationPoint(35.2F, -16.05F, -8.7F);
		bodyModel[229].rotateAngleZ = -1.04719755F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0.5F, -0.75F, -0.3F, 0.5F); // Box 232
		bodyModel[230].setRotationPoint(32.5F, -16.05F, 7.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 233
		bodyModel[231].setRotationPoint(35.2F, -16.05F, 7.7F);
		bodyModel[231].rotateAngleZ = -1.04719755F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F); // Box 234
		bodyModel[232].setRotationPoint(60.25F, -26.85F, -12F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.25F, 0F, 0.55F, 0F, 0F, -0.95F, 0F, 0F, -1.45F, 0.25F, 0F, 2.55F, 0.25F, -0.8F, 0.55F, 0F, -0.8F, -0.95F, 0F, -0.8F, -1.45F, 0.25F, -0.8F, 2.55F); // Box 235
		bodyModel[233].setRotationPoint(65.75F, -26.85F, -12F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0.25F, 0F, 2.55F, 0F, 0F, -1.45F, 0F, 0F, -0.95F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 2.55F, 0F, -0.8F, -1.45F, 0F, -0.8F, -0.95F, 0.25F, -0.8F, 0.55F); // Box 236
		bodyModel[234].setRotationPoint(65.75F, -26.85F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0.25F, 0F, -2.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.25F, 0F, -2.2F, 0.25F, -0.8F, -2.2F, 0F, -0.8F, 0.05F, 0F, -0.8F, 0.05F, 0.25F, -0.8F, -2.2F); // Box 237
		bodyModel[235].setRotationPoint(65.75F, -26.85F, -7F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 0.25F, 0.75F, 0.3F, 0.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 0.25F, -0.7F, 0.3F); // Box 238
		bodyModel[236].setRotationPoint(32F, -26.05F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 0.25F, 0.75F, 0.3F, 0.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 1.25F, -0.7F, 0.3F, 0.25F, -0.7F, 0.3F); // Box 239
		bodyModel[237].setRotationPoint(32F, -26.05F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 1.25F, 0.75F, 0.3F, 0.25F, 0.75F, 0.3F, 0.25F, -1.45F, 0.3F, 1.25F, -1.45F, 0.3F, 1.25F, -1.45F, 0.3F, 0.25F, -1.45F, 0.3F); // Box 240
		bodyModel[238].setRotationPoint(32.05F, -26F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, -0.5F, 7, 2, 1, 0F,0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 241
		bodyModel[239].setRotationPoint(46.45F, -25.85F, -8F);

		bodyModel[240].addShapeBox(0F, 0F, -0.5F, 7, 2, 1, 0F,0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 242
		bodyModel[240].setRotationPoint(46.45F, -25.85F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, -0.5F, 3, 2, 1, 0F,0.25F, 0F, -0.4F, 1.75F, 0F, -0.4F, 1.75F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.75F, 0F, -0.4F, 1.75F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 243
		bodyModel[241].setRotationPoint(41.45F, -25.85F, 12.2F);

		bodyModel[242].addShapeBox(0F, 0F, -0.5F, 3, 2, 1, 0F,0.25F, 0F, -0.4F, 1.75F, 0F, -0.4F, 1.75F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.75F, 0F, -0.4F, 1.75F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 244
		bodyModel[242].setRotationPoint(41.45F, -25.85F, -12.2F);

		bodyModel[243].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0.25F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 245
		bodyModel[243].setRotationPoint(37.45F, -25.85F, -7.15F);

		bodyModel[244].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,0.25F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.75F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 246
		bodyModel[244].setRotationPoint(37.45F, -25.85F, 7.15F);

		bodyModel[245].addShapeBox(0F, 0F, -0.5F, 4, 2, 1, 0F,0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 247
		bodyModel[245].setRotationPoint(39.3F, -25.85F, 7.4F);
		bodyModel[245].rotateAngleY = 1.18682389F;

		bodyModel[246].addShapeBox(0F, 0F, -0.5F, 4, 2, 1, 0F,0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 1.25F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 248
		bodyModel[246].setRotationPoint(39.3F, -25.85F, -7.4F);
		bodyModel[246].rotateAngleY = -1.18682389F;

		bodyModel[247].addShapeBox(-0.5F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 249
		bodyModel[247].setRotationPoint(46.25F, -25.85F, -12.2F);

		bodyModel[248].addShapeBox(-0.5F, 0F, 0F, 1, 2, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 250
		bodyModel[248].setRotationPoint(46.25F, -25.85F, 8.2F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 251
		bodyModel[249].setRotationPoint(65F, -24.05F, -5.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[250].setRotationPoint(65.5F, -25.05F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 253
		bodyModel[251].setRotationPoint(67.5F, -25.05F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 254
		bodyModel[252].setRotationPoint(67.2F, -26.25F, -0.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 255
		bodyModel[253].setRotationPoint(-32F, -10.85F, -7.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.7F, -1.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -1.5F); // Box 256
		bodyModel[254].setRotationPoint(-36F, -10.85F, -7.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.4F, 0.3F); // Box 257
		bodyModel[255].setRotationPoint(-28.3F, -10.25F, 5.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 258
		bodyModel[256].setRotationPoint(-28.2F, -9.25F, 5.8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 259
		bodyModel[257].setRotationPoint(-27.8F, -9.25F, 5.8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.4F, 0.3F); // Box 260
		bodyModel[258].setRotationPoint(-30.5F, -10.25F, 5.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 261
		bodyModel[259].setRotationPoint(-30.4F, -9.25F, 5.8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 262
		bodyModel[260].setRotationPoint(-30F, -9.25F, 5.8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.4F, 0.3F); // Box 263
		bodyModel[261].setRotationPoint(-30.5F, -10.25F, -6.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 264
		bodyModel[262].setRotationPoint(-30.4F, -9.25F, -6.8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 265
		bodyModel[263].setRotationPoint(-30F, -9.25F, -6.8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 11, 1, 17, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 264
		bodyModel[264].setRotationPoint(14F, -19.95F, -8.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.25F, 1.5F, 0F, 0.25F, 0.25F, -0.7F, 0.5F, 0.25F, -0.7F, 0.5F, 0.5F, -0.7F, 0.25F, 1.5F, -0.7F, 0.25F); // Box 265
		bodyModel[265].setRotationPoint(22.5F, -19.95F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 1.5F, -0.7F, 0.25F, 0.5F, -0.7F, 0.25F, 0.25F, -0.7F, 0.5F, 0.25F, -0.7F, 0.5F); // Box 266
		bodyModel[266].setRotationPoint(22.5F, -19.95F, 9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.7F, 0.5F, 0.25F, -0.7F, 0.5F, 0.25F, -0.7F, 0.5F, 0.25F, -0.7F, 0.5F); // Box 267
		bodyModel[267].setRotationPoint(25.2F, -19.95F, -4.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 268
		bodyModel[268].setRotationPoint(34.2F, -19.95F, -7F);

		bodyModel[269].addShapeBox(-5F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269
		bodyModel[269].setRotationPoint(33.7F, -20.05F, -6.5F);
		bodyModel[269].rotateAngleZ = 1.04719755F;

		bodyModel[270].addShapeBox(-5F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 270
		bodyModel[270].setRotationPoint(33.7F, -20.05F, 5.5F);
		bodyModel[270].rotateAngleZ = 1.04719755F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0.25F, 0F, 0.25F, -0.25F, 0F, 4.75F, -0.25F, 0F, 4.75F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, -0.25F, -0.7F, 4.75F, -0.25F, -0.7F, 4.75F, 0.25F, -0.7F, 0.25F); // Box 271
		bodyModel[271].setRotationPoint(41.7F, -19.95F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, -0.25F, -0.7F, 0.25F, -0.25F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 272
		bodyModel[272].setRotationPoint(43.7F, -19.95F, -11.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 273
		bodyModel[273].setRotationPoint(46.7F, -19.95F, -10.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 274
		bodyModel[274].setRotationPoint(48F, -19.95F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 275
		bodyModel[275].setRotationPoint(48F, -22.25F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 276
		bodyModel[276].setRotationPoint(48F, -22.25F, 7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 277
		bodyModel[277].setRotationPoint(34.3F, -22.25F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.25F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 278
		bodyModel[278].setRotationPoint(25.3F, -22.25F, -4.7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 279
		bodyModel[279].setRotationPoint(34.3F, -22.25F, 6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0.25F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 280
		bodyModel[280].setRotationPoint(25.3F, -22.25F, 3.7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 281
		bodyModel[281].setRotationPoint(41.5F, -22.25F, -7F);
		bodyModel[281].rotateAngleY = -1.13446401F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.7F, 0.25F, -0.25F, -0.7F, 0.25F, -0.25F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 282
		bodyModel[282].setRotationPoint(43.7F, -22.25F, -11.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1F, 0.25F, -0.7F, -1F); // Box 283
		bodyModel[283].setRotationPoint(46.7F, -22.25F, -10.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -0.75F, -0.75F, -0.7F, -0.75F); // Box 284
		bodyModel[284].setRotationPoint(46.7F, -22.25F, -10.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, -1F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 285
		bodyModel[285].setRotationPoint(43.7F, -22.25F, 10.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 286
		bodyModel[286].setRotationPoint(46.7F, -22.25F, 9.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.7F, -0.75F, 0F, -0.7F, -0.75F, 0F, -0.7F, 0.25F, -0.75F, -0.7F, 0.25F); // Box 287
		bodyModel[287].setRotationPoint(46.7F, -22.25F, 7.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, 0.25F, 0.25F, -0.7F, 0.25F); // Box 288
		bodyModel[288].setRotationPoint(42.5F, -22.25F, 6.7F);
		bodyModel[288].rotateAngleY = 1.13446401F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, -1.25F, -0.75F, -0.7F, -1.25F); // Box 289
		bodyModel[289].setRotationPoint(45.5F, -22.25F, -11.4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.75F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.7F, -1.25F, 0F, -0.7F, -1.25F, 0F, -0.7F, 0.25F, -0.75F, -0.7F, 0.25F); // Box 290
		bodyModel[290].setRotationPoint(45.5F, -22.25F, 9.4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0.25F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0.3F, 0.25F, 0F, 0.3F); // Box 291
		bodyModel[291].setRotationPoint(55F, -30.45F, -5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0.25F, 0F, 0.3F, 0.25F, 0F, -1.45F, 0.25F, 0F, -1.45F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, 0F, -1.45F, 0.25F, 0F, -1.45F, 0.25F, 0F, 0.3F); // Box 292
		bodyModel[292].setRotationPoint(62.25F, -30.45F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[293].setRotationPoint(61.25F, -31.45F, -0.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,-0.75F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.25F); // Box 294
		bodyModel[294].setRotationPoint(48.5F, -30.45F, -4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, 0F); // Box 295
		bodyModel[295].setRotationPoint(52.5F, -30.45F, -4F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0.75F, 0.5F, 0F, -1.75F); // Box 296
		bodyModel[296].setRotationPoint(48.25F, -30.45F, -2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -2.25F); // Box 297
		bodyModel[297].setRotationPoint(47.5F, -33.45F, -5.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2.25F, 0F, 0F, -0.5F); // Box 298
		bodyModel[298].setRotationPoint(52.5F, -33.45F, -5.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0.25F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -3.25F, -0.5F, 0F, -3.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -3.25F); // Box 299
		bodyModel[299].setRotationPoint(46.5F, -33.45F, -3.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0F, 0F, 0.25F, 0.25F, 0F, -3.25F, 0.25F, 0F, -3.25F, 0F, 0F, 0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -3.25F, -0.5F, 0F, -3.25F, 0.5F, 0F, -0.25F); // Box 300
		bodyModel[300].setRotationPoint(57.5F, -33.45F, -3.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, 0F, 2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 2F, 0F, -0.2F, 2F, -0.25F, -0.2F, -1F, -0.25F, -0.2F, -1F, 0F, -0.2F, 2F); // Box 301
		bodyModel[301].setRotationPoint(52.5F, -34.15F, -5.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,-0.25F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, -0.25F, 0F, 1F, -0.25F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, -0.25F, -0.2F, 1F); // Box 302
		bodyModel[302].setRotationPoint(44.5F, -34.15F, -5.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 303
		bodyModel[303].setRotationPoint(43.2F, -37.15F, -4.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.45F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F); // Box 304
		bodyModel[304].setRotationPoint(60.5F, -35.75F, -5.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, -2.25F, 0.5F, 0F, 2.25F, 0F, 0F, -0.5F, 0F, 0.2F, 0.25F, 0.25F, 0.2F, -2.5F, 0.25F, 0.2F, 2.5F, 0F, 0.2F, -0.25F); // Box 305
		bodyModel[305].setRotationPoint(52.5F, -35.75F, -7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0.2F, -0.25F, 0.25F, 0.2F, 2.5F, 0.25F, 0.2F, -2.5F, 0F, 0.2F, 0.25F); // Box 306
		bodyModel[306].setRotationPoint(52.5F, -35.75F, 6.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-0.25F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0.2F, -0.75F, -1F, 0.2F, 0.25F, -1F, 0.2F, -0.25F, -0.25F, 0.2F, 0.75F); // Box 307
		bodyModel[307].setRotationPoint(44.5F, -35.75F, -7.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[308].setRotationPoint(44F, -36.75F, -6.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,-0.25F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.2F, 0.75F, -1F, 0.2F, -0.25F, -1F, 0.2F, 0.25F, -0.25F, 0.2F, -0.75F); // Box 309
		bodyModel[309].setRotationPoint(44.5F, -35.75F, 6.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.3F, -0.65F, -0.2F, -0.3F, -0.65F, -0.2F, -0.3F, -0.65F, -0.2F, -0.3F, -0.65F, -0.45F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 310
		bodyModel[310].setRotationPoint(60.5F, -36.75F, -5.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, 0.25F, 0.25F, -0.3F, -2.5F, 0.25F, -0.3F, 2.5F, 0F, -0.3F, -0.25F, 0F, 0F, 0.5F, 0.5F, 0F, -2.25F, 0.5F, 0F, 2.25F, 0F, 0F, -0.5F); // Box 311
		bodyModel[311].setRotationPoint(52.5F, -36.75F, -7.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.25F, -0.3F, -0.75F, -1F, -0.3F, 0.25F, -1F, -0.3F, -0.25F, -0.25F, -0.3F, 0.75F, -0.25F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -0.25F, 0F, 0.5F); // Box 312
		bodyModel[312].setRotationPoint(44.5F, -36.75F, -7.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.25F, -0.3F, 0.75F, -1F, -0.3F, -0.25F, -1F, -0.3F, 0.25F, -0.25F, -0.3F, -0.75F, -0.25F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -0.25F, 0F, -0.5F); // Box 313
		bodyModel[313].setRotationPoint(44.5F, -36.75F, 6.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, -0.25F, 0.25F, -0.3F, 2.5F, 0.25F, -0.3F, -2.5F, 0F, -0.3F, 0.25F, 0F, 0F, -0.5F, 0.5F, 0F, 2.25F, 0.5F, 0F, -2.25F, 0F, 0F, 0.5F); // Box 314
		bodyModel[314].setRotationPoint(52.5F, -36.75F, 6.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.7F, 0F, 0.2F, 0.7F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F, 0.25F, 0.2F, 0.7F, 0.25F, 0.2F); // Box 315
		bodyModel[315].setRotationPoint(50F, -42.95F, -3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F); // Box 316
		bodyModel[316].setRotationPoint(54.2F, -42.95F, -3F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 317
		bodyModel[317].setRotationPoint(54.3F, -41.45F, -3.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 318
		bodyModel[318].setRotationPoint(54.5F, -40.75F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 319
		bodyModel[319].setRotationPoint(50F, -42.45F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 320
		bodyModel[320].setRotationPoint(50F, -43.25F, -3.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F); // Box 321
		bodyModel[321].setRotationPoint(43.3F, -62.15F, -0.5F);

		bodyModel[322].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F); // Box 322
		bodyModel[322].setRotationPoint(43.5F, -44.15F, -1F);
		bodyModel[322].rotateAngleX = -0.13962634F;
		bodyModel[322].rotateAngleZ = -0.19198622F;

		bodyModel[323].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F); // Box 323
		bodyModel[323].setRotationPoint(43.5F, -44.15F, 1F);
		bodyModel[323].rotateAngleX = 0.13962634F;
		bodyModel[323].rotateAngleZ = -0.19198622F;

		bodyModel[324].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F,-0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F, -0.4F, 10F, -0.3F); // Box 324
		bodyModel[324].setRotationPoint(43.5F, -44.15F, 1F);
		bodyModel[324].rotateAngleX = 0.13962634F;
		bodyModel[324].rotateAngleZ = -0.19198622F;

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 326
		bodyModel[325].setRotationPoint(43F, -45.05F, -2F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F, 0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F); // Box 327
		bodyModel[326].setRotationPoint(42F, -45.05F, -2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 328
		bodyModel[327].setRotationPoint(48F, -45.05F, -2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 329
		bodyModel[328].setRotationPoint(42F, -48.25F, -2.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.3F, 0F, 0.25F, -0.3F, -1F, 0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F, 0.25F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 330
		bodyModel[329].setRotationPoint(46F, -48.25F, -2.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F, 0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F); // Box 331
		bodyModel[330].setRotationPoint(41F, -48.25F, -2.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 332
		bodyModel[331].setRotationPoint(43F, -52.05F, -1.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F, 0.25F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, -1F); // Box 333
		bodyModel[332].setRotationPoint(42F, -52.05F, -1.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 334
		bodyModel[333].setRotationPoint(48F, -52.05F, -1.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 335
		bodyModel[334].setRotationPoint(43.5F, -56.55F, -2.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, -1.75F, 0F, -0.3F, -1.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.75F, 0F, -0.3F, -1.75F, 0F, -0.3F, 0F); // Box 336
		bodyModel[335].setRotationPoint(44.5F, -56.55F, -2.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.3F, -2.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.25F, 0F, -0.3F, -2.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.25F); // Box 337
		bodyModel[336].setRotationPoint(42.5F, -56.55F, -2.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F,-0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 338
		bodyModel[337].setRotationPoint(43.2F, -51.55F, -12.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0.7F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.7F, 0F, 0.2F, 1.45F, 0.25F, 1.2F, 0.7F, 0.25F, 1.2F, 0.7F, 0.25F, 1.2F, 1.45F, 0.25F, 1.2F); // Box 339
		bodyModel[338].setRotationPoint(51.5F, -38.95F, -1.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, -0.25F); // Box 340
		bodyModel[339].setRotationPoint(39F, -61.15F, -0.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 341
		bodyModel[340].setRotationPoint(39F, -64.15F, -0.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 342
		bodyModel[341].setRotationPoint(38F, -64.15F, -1F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[342].setRotationPoint(46F, -48.75F, -0.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[343].setRotationPoint(47.5F, -45.75F, -0.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 345
		bodyModel[344].setRotationPoint(43.3F, -61.25F, -5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F); // Box 346
		bodyModel[345].setRotationPoint(43.3F, -61.25F, 0F);

		bodyModel[346].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 347
		bodyModel[346].setRotationPoint(-8.8F, -39.55F, -12.5F);
		bodyModel[346].rotateAngleZ = 0.21816616F;

		bodyModel[347].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 348
		bodyModel[347].setRotationPoint(-8.8F, -39.55F, -9.5F);
		bodyModel[347].rotateAngleZ = 0.21816616F;

		bodyModel[348].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 349
		bodyModel[348].setRotationPoint(-8.8F, -39.45F, 12.5F);
		bodyModel[348].rotateAngleZ = 0.21816616F;

		bodyModel[349].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 49.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 350
		bodyModel[349].setRotationPoint(-8.8F, -39.45F, 9.5F);
		bodyModel[349].rotateAngleZ = 0.21816616F;

		bodyModel[350].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 351
		bodyModel[350].setRotationPoint(43F, -50.75F, 6.25F);
		bodyModel[350].rotateAngleY = -0.01745329F;
		bodyModel[350].rotateAngleZ = -0.34208453F;

		bodyModel[351].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 120F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 353
		bodyModel[351].setRotationPoint(43F, -50.75F, -6.25F);
		bodyModel[351].rotateAngleY = 0.01745329F;
		bodyModel[351].rotateAngleZ = -0.34208453F;

		bodyModel[352].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, 0F, 0.75F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[352].setRotationPoint(3.5F, -17.05F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 1.3F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 25
		bodyModel[353].setRotationPoint(3.5F, -17.05F, 7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 35
		bodyModel[354].setRotationPoint(-28.5F, -9.25F, 10.1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 36
		bodyModel[355].setRotationPoint(-21.5F, -9.25F, 10.1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 360
		bodyModel[356].setRotationPoint(-28.5F, -9.25F, -13.1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 361
		bodyModel[357].setRotationPoint(-21.5F, -9.25F, -13.1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 369
		bodyModel[358].setRotationPoint(-1.5F, -14.75F, -2F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0.25F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 370
		bodyModel[359].setRotationPoint(2.5F, -14.75F, -2F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.4F, 0.5F, 0.25F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.5F, -0.4F, -2.05F, -0.5F, -0.4F, -2.05F, 0F, -0.15F, -0.75F); // Box 371
		bodyModel[360].setRotationPoint(8.5F, -14.75F, -2F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 372
		bodyModel[361].setRotationPoint(-6.5F, -15.75F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 373
		bodyModel[362].setRotationPoint(-0.5F, -15.75F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 374
		bodyModel[363].setRotationPoint(7.5F, -15.75F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 375
		bodyModel[364].setRotationPoint(-6.5F, -15.75F, 4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 376
		bodyModel[365].setRotationPoint(-0.5F, -15.75F, 4F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 377
		bodyModel[366].setRotationPoint(7.5F, -15.75F, 4F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[367].setRotationPoint(-1.5F, -17.05F, 5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 383
		bodyModel[368].setRotationPoint(0.5F, -13.25F, -8.1F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 384
		bodyModel[369].setRotationPoint(8.5F, -13.25F, -8.1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 385
		bodyModel[370].setRotationPoint(0.5F, -13.25F, 5.1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
		bodyModel[371].setRotationPoint(8.5F, -13.25F, 5.1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 387
		bodyModel[372].setRotationPoint(0.5F, -13.25F, -1.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 388
		bodyModel[373].setRotationPoint(8.5F, -13.25F, -1.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.25F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.5F, -0.8F, 0.55F, 0.5F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F); // Box 389
		bodyModel[374].setRotationPoint(54F, -28.85F, 8.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, -1.45F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, -1.45F, 0.25F, -0.8F, 0.55F); // Box 390
		bodyModel[375].setRotationPoint(57.75F, -28.85F, 8.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.25F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.5F, -0.8F, 0.55F, 0.5F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F); // Box 391
		bodyModel[376].setRotationPoint(54F, -28.85F, -12.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.25F, 0F, 0.55F, 0.25F, 0F, -1.45F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, -1.45F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F); // Box 392
		bodyModel[377].setRotationPoint(57.75F, -28.85F, -12.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F); // Box 393
		bodyModel[378].setRotationPoint(49.25F, -26.85F, -7.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0.25F, 0F, -0.2F, 0.25F, 0F, 0.55F, 0.25F, 0F, 0.55F, 0.25F, 0F, -0.2F, 0.25F, -0.8F, -0.2F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, 0.55F, 0.25F, -0.8F, -0.2F); // Box 394
		bodyModel[379].setRotationPoint(47.75F, -26.85F, -7.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[380].setRotationPoint(62.5F, -27.85F, -10.3F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 396
		bodyModel[381].setRotationPoint(62.5F, -28.85F, -10.3F);

		bodyModel[382].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 397
		bodyModel[382].setRotationPoint(63.5F, -27.75F, -10F);
		bodyModel[382].rotateAngleZ = 0.54105207F;

		bodyModel[383].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 398
		bodyModel[383].setRotationPoint(63.5F, -27.75F, -9.6F);
		bodyModel[383].rotateAngleZ = 0.54105207F;

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[384].setRotationPoint(62.5F, -27.85F, 8.3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 400
		bodyModel[385].setRotationPoint(62.5F, -28.85F, 8.3F);

		bodyModel[386].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 401
		bodyModel[386].setRotationPoint(63.5F, -27.75F, 9F);
		bodyModel[386].rotateAngleZ = 0.54105207F;

		bodyModel[387].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 402
		bodyModel[387].setRotationPoint(63.5F, -27.75F, 8.6F);
		bodyModel[387].rotateAngleZ = 0.54105207F;

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[388].setRotationPoint(55.8F, -29.75F, 8.9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 404
		bodyModel[389].setRotationPoint(55.8F, -30.75F, 8.9F);

		bodyModel[390].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 405
		bodyModel[390].setRotationPoint(56.8F, -29.65F, 9.6F);
		bodyModel[390].rotateAngleZ = 0.54105207F;

		bodyModel[391].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 406
		bodyModel[391].setRotationPoint(56.8F, -29.65F, 9.2F);
		bodyModel[391].rotateAngleZ = 0.54105207F;

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[392].setRotationPoint(55.8F, -29.75F, -10.9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 408
		bodyModel[393].setRotationPoint(55.8F, -30.75F, -10.9F);

		bodyModel[394].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 409
		bodyModel[394].setRotationPoint(56.8F, -29.65F, -10.6F);
		bodyModel[394].rotateAngleZ = 0.54105207F;

		bodyModel[395].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 410
		bodyModel[395].setRotationPoint(56.8F, -29.65F, -10.2F);
		bodyModel[395].rotateAngleZ = 0.54105207F;

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[396].setRotationPoint(22.3F, -20.85F, -7.7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 412
		bodyModel[397].setRotationPoint(22.3F, -21.85F, -7.7F);

		bodyModel[398].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 413
		bodyModel[398].setRotationPoint(23.3F, -20.75F, -7.4F);
		bodyModel[398].rotateAngleZ = 0.54105207F;

		bodyModel[399].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 414
		bodyModel[399].setRotationPoint(23.3F, -20.75F, -7F);
		bodyModel[399].rotateAngleZ = 0.54105207F;

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[400].setRotationPoint(22.3F, -20.85F, 5.7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 416
		bodyModel[401].setRotationPoint(22.3F, -21.85F, 5.7F);

		bodyModel[402].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 417
		bodyModel[402].setRotationPoint(23.3F, -20.75F, 6.4F);
		bodyModel[402].rotateAngleZ = 0.54105207F;

		bodyModel[403].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[403].setRotationPoint(23.3F, -20.75F, 6F);
		bodyModel[403].rotateAngleZ = 0.54105207F;

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[404].setRotationPoint(15F, -23.25F, 2.3F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 420
		bodyModel[405].setRotationPoint(15F, -24.25F, 2.3F);

		bodyModel[406].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 421
		bodyModel[406].setRotationPoint(16F, -23.15F, 3F);
		bodyModel[406].rotateAngleZ = 0.54105207F;

		bodyModel[407].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 422
		bodyModel[407].setRotationPoint(16F, -23.15F, 2.6F);
		bodyModel[407].rotateAngleZ = 0.54105207F;

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[408].setRotationPoint(15F, -23.25F, -4.3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 424
		bodyModel[409].setRotationPoint(15F, -24.25F, -4.3F);

		bodyModel[410].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 425
		bodyModel[410].setRotationPoint(16F, -23.15F, -4F);
		bodyModel[410].rotateAngleZ = 0.54105207F;

		bodyModel[411].addShapeBox(0F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 426
		bodyModel[411].setRotationPoint(16F, -23.15F, -3.6F);
		bodyModel[411].rotateAngleZ = 0.54105207F;

		bodyModel[412].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[412].setRotationPoint(14.9F, -13.8F, -15.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[413].setRotationPoint(14.9F, -13.8F, -16.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 429
		bodyModel[414].setRotationPoint(14.9F, -13.8F, -13.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 430
		bodyModel[415].setRotationPoint(14.9F, -14.25F, -13.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[416].setRotationPoint(14.9F, -14.25F, -15.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[417].setRotationPoint(14.9F, -14.25F, -16.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, -1F, -0.5F, 0.6F, -1F, -0.5F, 0.6F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 433
		bodyModel[418].setRotationPoint(14.9F, -15.25F, -13.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 434
		bodyModel[419].setRotationPoint(14.9F, -15.25F, -15.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, -0.5F, 0.6F, -1F, -0.5F, 0.6F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 435
		bodyModel[420].setRotationPoint(14.9F, -15.25F, -16.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0.6F, -1F, 0F, 0.6F); // Box 436
		bodyModel[421].setRotationPoint(14.9F, -15.75F, -13.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 437
		bodyModel[422].setRotationPoint(14.9F, -15.75F, -15.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.6F, -1F, 0F, 0.6F, 0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 438
		bodyModel[423].setRotationPoint(14.9F, -15.75F, -16.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 439
		bodyModel[424].setRotationPoint(14.9F, -16.75F, -16.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 440
		bodyModel[425].setRotationPoint(14.9F, -16.75F, -15.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 441
		bodyModel[426].setRotationPoint(14.9F, -16.75F, -13.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[427].setRotationPoint(14.9F, -17.75F, -15.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1.9F, -1F, -0.25F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 443
		bodyModel[428].setRotationPoint(14.9F, -17.75F, -13.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, -1.9F, -1F, -0.25F, -1.9F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[429].setRotationPoint(14.9F, -17.75F, -17.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[430].setRotationPoint(14.9F, -13.8F, 13.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 446
		bodyModel[431].setRotationPoint(14.9F, -13.8F, 15.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[432].setRotationPoint(14.9F, -13.8F, 12.5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[433].setRotationPoint(14.9F, -14.25F, 12.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[434].setRotationPoint(14.9F, -14.25F, 13.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 450
		bodyModel[435].setRotationPoint(14.9F, -14.25F, 15.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, -0.5F, 0.6F, -1F, -0.5F, 0.6F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 451
		bodyModel[436].setRotationPoint(14.9F, -15.25F, 12.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 452
		bodyModel[437].setRotationPoint(14.9F, -15.25F, 13.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.6F, -0.5F, 0F, 0.6F, -0.5F, 0F, -1F, -0.5F, 0.6F, -1F, -0.5F, 0.6F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 453
		bodyModel[438].setRotationPoint(14.9F, -15.25F, 15.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.6F, -1F, 0F, 0.6F, 0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 454
		bodyModel[439].setRotationPoint(14.9F, -15.75F, 12.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F); // Box 455
		bodyModel[440].setRotationPoint(14.9F, -15.75F, 13.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0.6F, -1F, 0F, 0.6F); // Box 456
		bodyModel[441].setRotationPoint(14.9F, -15.75F, 15.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 457
		bodyModel[442].setRotationPoint(14.9F, -16.75F, 15.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 458
		bodyModel[443].setRotationPoint(14.9F, -16.75F, 13.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 459
		bodyModel[444].setRotationPoint(14.9F, -16.75F, 12.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[445].setRotationPoint(14.9F, -17.75F, 13.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, -1.9F, -1F, -0.25F, -1.9F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[446].setRotationPoint(14.9F, -17.75F, 11.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1.9F, -1F, -0.25F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 462
		bodyModel[447].setRotationPoint(14.9F, -17.75F, 15.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[448].setRotationPoint(43.5F, -41.75F, -5.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[449].setRotationPoint(43.5F, -41.75F, 4.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[450].setRotationPoint(42.5F, -42.25F, 3.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[451].setRotationPoint(42.5F, -42.25F, -6.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 467
		bodyModel[452].setRotationPoint(43.5F, -42.25F, -10.5F);

		bodyModel[453].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 468
		bodyModel[453].setRotationPoint(44F, -41.25F, -10.5F);
		bodyModel[453].rotateAngleZ = 0.17453293F;

		bodyModel[454].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 469
		bodyModel[454].setRotationPoint(44F, -41.25F, -9.5F);
		bodyModel[454].rotateAngleZ = 0.17453293F;

		bodyModel[455].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 470
		bodyModel[455].setRotationPoint(44F, -41.25F, 10.5F);
		bodyModel[455].rotateAngleZ = 0.17453293F;

		bodyModel[456].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 471
		bodyModel[456].setRotationPoint(44F, -41.25F, 9.5F);
		bodyModel[456].rotateAngleZ = 0.17453293F;

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 472
		bodyModel[457].setRotationPoint(43.5F, -42.25F, 6.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 473
		bodyModel[458].setRotationPoint(43.2F, -37.25F, -4.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, -1F, 0.5F, -0.75F, -1F, 0F, -0.75F, 0F); // Box 474
		bodyModel[459].setRotationPoint(51.7F, -37.25F, -4.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -1F, -0.25F, 0F, -2.75F, -0.25F, 0F, -2.75F, 0F, 0F, -1F, 0F, -0.75F, -1F, -0.25F, -0.75F, -2.75F, -0.25F, -0.75F, -2.75F, 0F, -0.75F, -1F); // Box 475
		bodyModel[460].setRotationPoint(54.2F, -37.25F, -4.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[461].setRotationPoint(84F, -10.8F, -5.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 478
		bodyModel[462].setRotationPoint(87F, -10.8F, -5.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 5, 11, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 479
		bodyModel[463].setRotationPoint(80F, -10.8F, -5.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F); // Box 484
		bodyModel[464].setRotationPoint(87F, -11.8F, -5.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,-0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F); // Box 485
		bodyModel[465].setRotationPoint(80F, -11.8F, -5.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 486
		bodyModel[466].setRotationPoint(84F, -11.8F, -5.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F); // Box 507
		bodyModel[467].setRotationPoint(100.5F, -8.8F, -5.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 508
		bodyModel[468].setRotationPoint(104.5F, -8.8F, -5.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F); // Box 510
		bodyModel[469].setRotationPoint(107.5F, -8.8F, -5.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F); // Box 512
		bodyModel[470].setRotationPoint(-103.5F, -5.55F, -5.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,-0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F, -0.25F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -4F); // Box 513
		bodyModel[471].setRotationPoint(-110.5F, -5.55F, -5.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 514
		bodyModel[472].setRotationPoint(-106.5F, -5.55F, -5.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[473].setRotationPoint(50.8F, -8.75F, -14F);

		bodyModel[474].addShapeBox(-1F, 0F, 0F, 1, 3, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[474].setRotationPoint(117.5F, -8.8F, 0F);
		bodyModel[474].rotateAngleY = 0.26179939F;
		bodyModel[474].rotateAngleZ = -0.19198622F;

		bodyModel[475].addShapeBox(-1F, 0F, -5F, 1, 3, 5, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[475].setRotationPoint(117.5F, -8.8F, 0F);
		bodyModel[475].rotateAngleY = -0.26179939F;
		bodyModel[475].rotateAngleZ = -0.19198622F;

		bodyModel[476].addShapeBox(-1F, 0F, -7F, 1, 3, 7, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[476].setRotationPoint(115.5F, -8.8F, -6.5F);
		bodyModel[476].rotateAngleY = -0.73303829F;
		bodyModel[476].rotateAngleZ = -0.19198622F;

		bodyModel[477].addShapeBox(-1F, 0F, 0F, 1, 3, 7, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[477].setRotationPoint(115.5F, -8.8F, 6.5F);
		bodyModel[477].rotateAngleY = 0.73303829F;
		bodyModel[477].rotateAngleZ = -0.19198622F;

		bodyModel[478].addShapeBox(-18.5F, 0.1F, 0F, 30, 17, 1, 0F,-11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F); // Box 545
		bodyModel[478].setRotationPoint(-171F, -16.25F, -0.5F);
		bodyModel[478].rotateAngleZ = 0.2443461F;

		bodyModel[479].addShapeBox(-18.5F, 0.1F, 0F, 30, 17, 1, 0F,-11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, 0F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F, -11F, -12F, -0.4F); // Box 546
		bodyModel[479].setRotationPoint(166.2F, -19.95F, -0.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 547
		bodyModel[480].setRotationPoint(23.5F, -12.65F, -14F);
		bodyModel[480].rotateAngleZ = 0.29670597F;

		bodyModel[481].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 548
		bodyModel[481].setRotationPoint(23.5F, -12.8F, -14.1F);
		bodyModel[481].rotateAngleZ = 0.29670597F;

		bodyModel[482].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 549
		bodyModel[482].setRotationPoint(23.5F, -12.8F, -13.8F);
		bodyModel[482].rotateAngleZ = 0.29670597F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 550
		bodyModel[483].setRotationPoint(25.5F, -12.95F, -14F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 551
		bodyModel[484].setRotationPoint(30.5F, -12.65F, -14F);
		bodyModel[484].rotateAngleZ = 0.29670597F;

		bodyModel[485].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 552
		bodyModel[485].setRotationPoint(30.5F, -12.8F, -13.8F);
		bodyModel[485].rotateAngleZ = 0.29670597F;

		bodyModel[486].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 553
		bodyModel[486].setRotationPoint(30.5F, -12.8F, -14.1F);
		bodyModel[486].rotateAngleZ = 0.29670597F;

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 554
		bodyModel[487].setRotationPoint(32.5F, -12.95F, -14F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 555
		bodyModel[488].setRotationPoint(23.5F, -12.65F, 13F);
		bodyModel[488].rotateAngleZ = 0.29670597F;

		bodyModel[489].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 556
		bodyModel[489].setRotationPoint(23.5F, -12.8F, 13.1F);
		bodyModel[489].rotateAngleZ = 0.29670597F;

		bodyModel[490].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 557
		bodyModel[490].setRotationPoint(23.5F, -12.8F, 12.8F);
		bodyModel[490].rotateAngleZ = 0.29670597F;

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 558
		bodyModel[491].setRotationPoint(25.5F, -12.95F, 13F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 559
		bodyModel[492].setRotationPoint(30.5F, -12.65F, 13F);
		bodyModel[492].rotateAngleZ = 0.29670597F;

		bodyModel[493].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 560
		bodyModel[493].setRotationPoint(30.5F, -12.8F, 12.8F);
		bodyModel[493].rotateAngleZ = 0.29670597F;

		bodyModel[494].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 561
		bodyModel[494].setRotationPoint(30.5F, -12.8F, 13.1F);
		bodyModel[494].rotateAngleZ = 0.29670597F;

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 562
		bodyModel[495].setRotationPoint(32.5F, -12.95F, 13F);

		bodyModel[496].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 563
		bodyModel[496].setRotationPoint(67F, -17.8F, 2.2F);
		bodyModel[496].rotateAngleZ = 0.29670597F;

		bodyModel[497].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 564
		bodyModel[497].setRotationPoint(67F, -17.8F, 2.5F);
		bodyModel[497].rotateAngleZ = 0.29670597F;

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 565
		bodyModel[498].setRotationPoint(67F, -17.65F, 2.4F);
		bodyModel[498].rotateAngleZ = 0.29670597F;

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 566
		bodyModel[499].setRotationPoint(69F, -17.95F, 2.4F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 233, 393, textureX, textureY); // Box 567
		bodyModel[501] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Box 568
		bodyModel[502] = new ModelRendererTurbo(this, 409, 337, textureX, textureY); // Box 569
		bodyModel[503] = new ModelRendererTurbo(this, 505, 337, textureX, textureY); // Box 570
		bodyModel[504] = new ModelRendererTurbo(this, 313, 393, textureX, textureY); // Box 571
		bodyModel[505] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Box 572
		bodyModel[506] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 573
		bodyModel[507] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Box 574
		bodyModel[508] = new ModelRendererTurbo(this, 433, 393, textureX, textureY); // Box 575
		bodyModel[509] = new ModelRendererTurbo(this, 473, 393, textureX, textureY); // Box 576
		bodyModel[510] = new ModelRendererTurbo(this, 233, 361, textureX, textureY); // Box 577
		bodyModel[511] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Box 578
		bodyModel[512] = new ModelRendererTurbo(this, 497, 393, textureX, textureY); // Box 579
		bodyModel[513] = new ModelRendererTurbo(this, 17, 401, textureX, textureY); // Box 580
		bodyModel[514] = new ModelRendererTurbo(this, 345, 361, textureX, textureY); // Box 581
		bodyModel[515] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Box 582
		bodyModel[516] = new ModelRendererTurbo(this, 209, 401, textureX, textureY); // Box 583
		bodyModel[517] = new ModelRendererTurbo(this, 225, 401, textureX, textureY); // Box 584
		bodyModel[518] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Box 585
		bodyModel[519] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Box 586
		bodyModel[520] = new ModelRendererTurbo(this, 241, 401, textureX, textureY); // Box 587
		bodyModel[521] = new ModelRendererTurbo(this, 257, 401, textureX, textureY); // Box 588
		bodyModel[522] = new ModelRendererTurbo(this, 297, 393, textureX, textureY); // Box 589
		bodyModel[523] = new ModelRendererTurbo(this, 273, 401, textureX, textureY); // Box 590
		bodyModel[524] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Box 591
		bodyModel[525] = new ModelRendererTurbo(this, 321, 401, textureX, textureY); // Box 592
		bodyModel[526] = new ModelRendererTurbo(this, 337, 401, textureX, textureY); // Box 593
		bodyModel[527] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Box 594
		bodyModel[528] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Box 595
		bodyModel[529] = new ModelRendererTurbo(this, 369, 401, textureX, textureY); // Box 596
		bodyModel[530] = new ModelRendererTurbo(this, 385, 401, textureX, textureY); // Box 597
		bodyModel[531] = new ModelRendererTurbo(this, 393, 401, textureX, textureY); // Box 598
		bodyModel[532] = new ModelRendererTurbo(this, 481, 401, textureX, textureY); // Box 599
		bodyModel[533] = new ModelRendererTurbo(this, 497, 401, textureX, textureY); // Box 600
		bodyModel[534] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Box 601
		bodyModel[535] = new ModelRendererTurbo(this, 9, 409, textureX, textureY); // Box 602
		bodyModel[536] = new ModelRendererTurbo(this, 17, 409, textureX, textureY); // Box 603
		bodyModel[537] = new ModelRendererTurbo(this, 33, 409, textureX, textureY); // Box 604
		bodyModel[538] = new ModelRendererTurbo(this, 49, 409, textureX, textureY); // Box 605
		bodyModel[539] = new ModelRendererTurbo(this, 209, 409, textureX, textureY); // Box 606
		bodyModel[540] = new ModelRendererTurbo(this, 217, 409, textureX, textureY); // Box 607
		bodyModel[541] = new ModelRendererTurbo(this, 233, 409, textureX, textureY); // Box 608
		bodyModel[542] = new ModelRendererTurbo(this, 249, 409, textureX, textureY); // Box 609
		bodyModel[543] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Box 610
		bodyModel[544] = new ModelRendererTurbo(this, 265, 409, textureX, textureY); // Box 611
		bodyModel[545] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); // Box 612
		bodyModel[546] = new ModelRendererTurbo(this, 281, 409, textureX, textureY); // Box 613
		bodyModel[547] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 614
		bodyModel[548] = new ModelRendererTurbo(this, 33, 401, textureX, textureY); // Box 615
		bodyModel[549] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 616
		bodyModel[550] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 617
		bodyModel[551] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 618
		bodyModel[552] = new ModelRendererTurbo(this, 305, 401, textureX, textureY); // Box 619
		bodyModel[553] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 620
		bodyModel[554] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Box 621
		bodyModel[555] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 622
		bodyModel[556] = new ModelRendererTurbo(this, 465, 345, textureX, textureY); // Box 623
		bodyModel[557] = new ModelRendererTurbo(this, 433, 401, textureX, textureY); // Box 624
		bodyModel[558] = new ModelRendererTurbo(this, 385, 409, textureX, textureY); // Box 625
		bodyModel[559] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 626
		bodyModel[560] = new ModelRendererTurbo(this, 337, 409, textureX, textureY); // Box 627
		bodyModel[561] = new ModelRendererTurbo(this, 305, 409, textureX, textureY); // Box 628
		bodyModel[562] = new ModelRendererTurbo(this, 409, 409, textureX, textureY); // Box 629
		bodyModel[563] = new ModelRendererTurbo(this, 321, 409, textureX, textureY); // Box 630
		bodyModel[564] = new ModelRendererTurbo(this, 433, 409, textureX, textureY); // Box 631
		bodyModel[565] = new ModelRendererTurbo(this, 449, 409, textureX, textureY); // Box 632
		bodyModel[566] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 633
		bodyModel[567] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 634
		bodyModel[568] = new ModelRendererTurbo(this, 353, 409, textureX, textureY); // Box 635
		bodyModel[569] = new ModelRendererTurbo(this, 329, 409, textureX, textureY); // Box 636
		bodyModel[570] = new ModelRendererTurbo(this, 225, 409, textureX, textureY); // Box 637
		bodyModel[571] = new ModelRendererTurbo(this, 369, 409, textureX, textureY); // Box 638
		bodyModel[572] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 639
		bodyModel[573] = new ModelRendererTurbo(this, 241, 409, textureX, textureY); // Box 640
		bodyModel[574] = new ModelRendererTurbo(this, 33, 417, textureX, textureY); // Box 641
		bodyModel[575] = new ModelRendererTurbo(this, 49, 417, textureX, textureY); // Box 642
		bodyModel[576] = new ModelRendererTurbo(this, 65, 417, textureX, textureY); // Box 643
		bodyModel[577] = new ModelRendererTurbo(this, 209, 417, textureX, textureY); // Box 644
		bodyModel[578] = new ModelRendererTurbo(this, 281, 417, textureX, textureY); // Box 645
		bodyModel[579] = new ModelRendererTurbo(this, 305, 417, textureX, textureY); // Box 646
		bodyModel[580] = new ModelRendererTurbo(this, 329, 417, textureX, textureY); // Box 647
		bodyModel[581] = new ModelRendererTurbo(this, 9, 417, textureX, textureY); // Box 648
		bodyModel[582] = new ModelRendererTurbo(this, 249, 417, textureX, textureY); // Box 649
		bodyModel[583] = new ModelRendererTurbo(this, 289, 417, textureX, textureY); // Box 650
		bodyModel[584] = new ModelRendererTurbo(this, 313, 417, textureX, textureY); // Box 651
		bodyModel[585] = new ModelRendererTurbo(this, 337, 417, textureX, textureY); // Box 652
		bodyModel[586] = new ModelRendererTurbo(this, 361, 417, textureX, textureY); // Box 653
		bodyModel[587] = new ModelRendererTurbo(this, 385, 417, textureX, textureY); // Box 654
		bodyModel[588] = new ModelRendererTurbo(this, 409, 417, textureX, textureY); // Box 655
		bodyModel[589] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Box 656
		bodyModel[590] = new ModelRendererTurbo(this, 457, 417, textureX, textureY); // Box 657
		bodyModel[591] = new ModelRendererTurbo(this, 481, 417, textureX, textureY); // Box 658
		bodyModel[592] = new ModelRendererTurbo(this, 49, 425, textureX, textureY); // Box 659
		bodyModel[593] = new ModelRendererTurbo(this, 73, 425, textureX, textureY); // Box 660
		bodyModel[594] = new ModelRendererTurbo(this, 97, 425, textureX, textureY); // Box 661
		bodyModel[595] = new ModelRendererTurbo(this, 121, 425, textureX, textureY); // Box 662
		bodyModel[596] = new ModelRendererTurbo(this, 145, 425, textureX, textureY); // Box 663
		bodyModel[597] = new ModelRendererTurbo(this, 353, 417, textureX, textureY); // Box 664
		bodyModel[598] = new ModelRendererTurbo(this, 169, 425, textureX, textureY); // Box 665
		bodyModel[599] = new ModelRendererTurbo(this, 193, 425, textureX, textureY); // Box 666
		bodyModel[600] = new ModelRendererTurbo(this, 217, 425, textureX, textureY); // Box 667
		bodyModel[601] = new ModelRendererTurbo(this, 265, 425, textureX, textureY); // Box 668
		bodyModel[602] = new ModelRendererTurbo(this, 233, 433, textureX, textureY); // Box 669
		bodyModel[603] = new ModelRendererTurbo(this, 281, 433, textureX, textureY); // Box 670
		bodyModel[604] = new ModelRendererTurbo(this, 305, 433, textureX, textureY); // Box 671
		bodyModel[605] = new ModelRendererTurbo(this, 329, 433, textureX, textureY); // Box 672
		bodyModel[606] = new ModelRendererTurbo(this, 353, 433, textureX, textureY); // Box 673
		bodyModel[607] = new ModelRendererTurbo(this, 377, 433, textureX, textureY); // Box 674
		bodyModel[608] = new ModelRendererTurbo(this, 401, 433, textureX, textureY); // Box 675
		bodyModel[609] = new ModelRendererTurbo(this, 425, 433, textureX, textureY); // Box 676
		bodyModel[610] = new ModelRendererTurbo(this, 449, 433, textureX, textureY); // Box 677
		bodyModel[611] = new ModelRendererTurbo(this, 473, 433, textureX, textureY); // Box 678
		bodyModel[612] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 679
		bodyModel[613] = new ModelRendererTurbo(this, 217, 401, textureX, textureY); // Box 680
		bodyModel[614] = new ModelRendererTurbo(this, 233, 401, textureX, textureY); // Box 681

		bodyModel[500].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 567
		bodyModel[500].setRotationPoint(67F, -17.8F, -3.2F);
		bodyModel[500].rotateAngleZ = 0.29670597F;

		bodyModel[501].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 568
		bodyModel[501].setRotationPoint(67F, -17.8F, -3.5F);
		bodyModel[501].rotateAngleZ = 0.29670597F;

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 569
		bodyModel[502].setRotationPoint(67F, -17.65F, -3.4F);
		bodyModel[502].rotateAngleZ = 0.29670597F;

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 570
		bodyModel[503].setRotationPoint(69F, -17.95F, -3.4F);

		bodyModel[504].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 571
		bodyModel[504].setRotationPoint(26F, -18.8F, -7.2F);
		bodyModel[504].rotateAngleZ = 0.29670597F;

		bodyModel[505].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 572
		bodyModel[505].setRotationPoint(26F, -18.8F, -7.5F);
		bodyModel[505].rotateAngleZ = 0.29670597F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 573
		bodyModel[506].setRotationPoint(26F, -18.65F, -7.4F);
		bodyModel[506].rotateAngleZ = 0.29670597F;

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 574
		bodyModel[507].setRotationPoint(28F, -18.95F, -7.4F);

		bodyModel[508].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 575
		bodyModel[508].setRotationPoint(26F, -18.8F, 6.2F);
		bodyModel[508].rotateAngleZ = 0.29670597F;

		bodyModel[509].addShapeBox(2F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 576
		bodyModel[509].setRotationPoint(26F, -18.8F, 6.5F);
		bodyModel[509].rotateAngleZ = 0.29670597F;

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 577
		bodyModel[510].setRotationPoint(26F, -18.65F, 6.4F);
		bodyModel[510].rotateAngleZ = 0.29670597F;

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F); // Box 578
		bodyModel[511].setRotationPoint(28F, -18.95F, 6.4F);

		bodyModel[512].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 579
		bodyModel[512].setRotationPoint(-30F, -12.8F, 3.8F);
		bodyModel[512].rotateAngleZ = -0.29670597F;

		bodyModel[513].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 580
		bodyModel[513].setRotationPoint(-30F, -12.8F, 4.1F);
		bodyModel[513].rotateAngleZ = -0.29670597F;

		bodyModel[514].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 581
		bodyModel[514].setRotationPoint(-30F, -12.65F, 4F);
		bodyModel[514].rotateAngleZ = -0.29670597F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 582
		bodyModel[515].setRotationPoint(-34F, -12.95F, 4F);

		bodyModel[516].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 583
		bodyModel[516].setRotationPoint(-30F, -12.8F, -4.8F);
		bodyModel[516].rotateAngleZ = -0.29670597F;

		bodyModel[517].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 584
		bodyModel[517].setRotationPoint(-30F, -12.8F, -5.1F);
		bodyModel[517].rotateAngleZ = -0.29670597F;

		bodyModel[518].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 585
		bodyModel[518].setRotationPoint(-30F, -12.65F, -5F);
		bodyModel[518].rotateAngleZ = -0.29670597F;

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 586
		bodyModel[519].setRotationPoint(-34F, -12.95F, -5F);

		bodyModel[520].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 587
		bodyModel[520].setRotationPoint(-45F, -12.8F, -8.5F);
		bodyModel[520].rotateAngleZ = -0.29670597F;

		bodyModel[521].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 588
		bodyModel[521].setRotationPoint(-45F, -12.8F, -8.8F);
		bodyModel[521].rotateAngleZ = -0.29670597F;

		bodyModel[522].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 589
		bodyModel[522].setRotationPoint(-45F, -12.65F, -8.7F);
		bodyModel[522].rotateAngleZ = -0.29670597F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 590
		bodyModel[523].setRotationPoint(-49F, -12.95F, -8.7F);

		bodyModel[524].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 591
		bodyModel[524].setRotationPoint(-45F, -12.8F, 7.5F);
		bodyModel[524].rotateAngleZ = -0.29670597F;

		bodyModel[525].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 592
		bodyModel[525].setRotationPoint(-45F, -12.8F, 7.8F);
		bodyModel[525].rotateAngleZ = -0.29670597F;

		bodyModel[526].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 593
		bodyModel[526].setRotationPoint(-45F, -12.65F, 7.7F);
		bodyModel[526].rotateAngleZ = -0.29670597F;

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 594
		bodyModel[527].setRotationPoint(-49F, -12.95F, 7.7F);

		bodyModel[528].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 595
		bodyModel[528].setRotationPoint(-51F, -12.8F, 4.5F);
		bodyModel[528].rotateAngleZ = -0.29670597F;

		bodyModel[529].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 596
		bodyModel[529].setRotationPoint(-51F, -12.8F, 4.8F);
		bodyModel[529].rotateAngleZ = -0.29670597F;

		bodyModel[530].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 597
		bodyModel[530].setRotationPoint(-51F, -12.65F, 4.7F);
		bodyModel[530].rotateAngleZ = -0.29670597F;

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 598
		bodyModel[531].setRotationPoint(-55F, -12.95F, 4.7F);

		bodyModel[532].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 599
		bodyModel[532].setRotationPoint(-51F, -12.8F, -5.5F);
		bodyModel[532].rotateAngleZ = -0.29670597F;

		bodyModel[533].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 600
		bodyModel[533].setRotationPoint(-51F, -12.8F, -5.8F);
		bodyModel[533].rotateAngleZ = -0.29670597F;

		bodyModel[534].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 601
		bodyModel[534].setRotationPoint(-51F, -12.65F, -5.7F);
		bodyModel[534].rotateAngleZ = -0.29670597F;

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 602
		bodyModel[535].setRotationPoint(-55F, -12.95F, -5.7F);

		bodyModel[536].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 603
		bodyModel[536].setRotationPoint(-57F, -12.8F, -3F);
		bodyModel[536].rotateAngleZ = -0.29670597F;

		bodyModel[537].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 604
		bodyModel[537].setRotationPoint(-57F, -12.8F, -3.3F);
		bodyModel[537].rotateAngleZ = -0.29670597F;

		bodyModel[538].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 605
		bodyModel[538].setRotationPoint(-57F, -12.65F, -3.2F);
		bodyModel[538].rotateAngleZ = -0.29670597F;

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 606
		bodyModel[539].setRotationPoint(-61F, -12.95F, -3.2F);

		bodyModel[540].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 607
		bodyModel[540].setRotationPoint(-57F, -12.8F, 2F);
		bodyModel[540].rotateAngleZ = -0.29670597F;

		bodyModel[541].addShapeBox(-6F, 0F, 0F, 4, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 608
		bodyModel[541].setRotationPoint(-57F, -12.8F, 2.3F);
		bodyModel[541].rotateAngleZ = -0.29670597F;

		bodyModel[542].addShapeBox(-2F, 0F, 0F, 2, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.25F, -0.2F, 0F); // Box 609
		bodyModel[542].setRotationPoint(-57F, -12.65F, 2.2F);
		bodyModel[542].rotateAngleZ = -0.29670597F;

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 610
		bodyModel[543].setRotationPoint(-61F, -12.95F, 2.2F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F); // Box 611
		bodyModel[544].setRotationPoint(-71F, -18.75F, -1.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 612
		bodyModel[545].setRotationPoint(-70F, -26.25F, -0.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 613
		bodyModel[546].setRotationPoint(-73F, -26.65F, -0.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 614
		bodyModel[547].setRotationPoint(-73F, -28.65F, -6.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 615
		bodyModel[548].setRotationPoint(-73F, -24.65F, -6.5F);

		bodyModel[549].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 616
		bodyModel[549].setRotationPoint(-73F, -28.15F, -1.5F);
		bodyModel[549].rotateAngleX = -0.9250245F;

		bodyModel[550].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 617
		bodyModel[550].setRotationPoint(-73F, -28.15F, 1.5F);
		bodyModel[550].rotateAngleX = 0.9250245F;

		bodyModel[551].addShapeBox(0F, -0.5F, -5F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 618
		bodyModel[551].setRotationPoint(-67F, -28.15F, 1.5F);
		bodyModel[551].rotateAngleX = 0.9250245F;

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 619
		bodyModel[552].setRotationPoint(-67F, -28.65F, -6.5F);

		bodyModel[553].addShapeBox(0F, -0.5F, 0F, 1, 1, 5, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F); // Box 620
		bodyModel[553].setRotationPoint(-67F, -28.15F, -1.5F);
		bodyModel[553].rotateAngleX = -0.9250245F;

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 621
		bodyModel[554].setRotationPoint(-67F, -24.65F, -6.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 622
		bodyModel[555].setRotationPoint(-22F, -8.25F, 10.6F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 623
		bodyModel[556].setRotationPoint(-27F, -8.25F, 10.6F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 624
		bodyModel[557].setRotationPoint(-128.5F, -5.25F, 9.6F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 625
		bodyModel[558].setRotationPoint(-130.5F, -6.25F, 9.1F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 626
		bodyModel[559].setRotationPoint(-124F, -5.25F, 9.6F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 627
		bodyModel[560].setRotationPoint(-123.5F, -6.25F, 9.1F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 628
		bodyModel[561].setRotationPoint(-128.5F, -5.25F, -11.6F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 629
		bodyModel[562].setRotationPoint(-130.5F, -6.25F, -12.1F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 630
		bodyModel[563].setRotationPoint(-124F, -5.25F, -11.6F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 631
		bodyModel[564].setRotationPoint(-123.5F, -6.25F, -12.1F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 632
		bodyModel[565].setRotationPoint(-9.25F, -14.5F, -0.5F);
		bodyModel[565].rotateAngleZ = 0.48869219F;

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 633
		bodyModel[566].setRotationPoint(13.75F, -26.5F, -0.5F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 634
		bodyModel[567].setRotationPoint(21F, -19.75F, -9F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 635
		bodyModel[568].setRotationPoint(25F, -18.75F, -9F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 636
		bodyModel[569].setRotationPoint(29F, -18.75F, -9F);
		bodyModel[569].rotateAngleY = 0.6981317F;

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 637
		bodyModel[570].setRotationPoint(30.2F, -18.75F, -7.5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 638
		bodyModel[571].setRotationPoint(25F, -18.75F, 8F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.8F, 0.25F, 0F, -0.8F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.2F, -0.8F, 0.25F, 0.2F, -0.8F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F); // Box 639
		bodyModel[572].setRotationPoint(28.5F, -18.75F, 8.2F);
		bodyModel[572].rotateAngleY = -0.6981317F;

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 640
		bodyModel[573].setRotationPoint(30.2F, -18.75F, 2.5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.4F, -0.8F, 2.5F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 2.5F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 641
		bodyModel[574].setRotationPoint(25F, -16.15F, 6F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 2.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 2.5F, -0.4F, -0.8F, 0F, -0.4F, -0.8F); // Box 642
		bodyModel[575].setRotationPoint(25F, -16.15F, -9F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[576].setRotationPoint(50.8F, -8.75F, 10F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[577].setRotationPoint(-39.3F, -8.75F, 10F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[578].setRotationPoint(-39.3F, -8.75F, -14F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[579].setRotationPoint(-12.2F, -8.75F, -14F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[580].setRotationPoint(-12.2F, -8.75F, 10F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[581].setRotationPoint(3.8F, -7.75F, 13.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 649
		bodyModel[582].setRotationPoint(4.3F, -8.75F, 10.5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 650
		bodyModel[583].setRotationPoint(4.3F, -9.1F, 10.5F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 651
		bodyModel[584].setRotationPoint(4.3F, -8.4F, 10.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 652
		bodyModel[585].setRotationPoint(5.3F, -8.4F, 10.5F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 653
		bodyModel[586].setRotationPoint(5.3F, -9.1F, 10.5F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 654
		bodyModel[587].setRotationPoint(5.3F, -8.75F, 10.5F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 655
		bodyModel[588].setRotationPoint(6.3F, -8.4F, 10.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 656
		bodyModel[589].setRotationPoint(6.3F, -9.1F, 10.5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 657
		bodyModel[590].setRotationPoint(6.3F, -8.75F, 10.5F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 658
		bodyModel[591].setRotationPoint(3.3F, -8.4F, 10.5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 659
		bodyModel[592].setRotationPoint(3.3F, -9.1F, 10.5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 660
		bodyModel[593].setRotationPoint(3.3F, -8.75F, 10.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 661
		bodyModel[594].setRotationPoint(2.3F, -8.4F, 10.5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 662
		bodyModel[595].setRotationPoint(2.3F, -9.1F, 10.5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 663
		bodyModel[596].setRotationPoint(2.3F, -8.75F, 10.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[597].setRotationPoint(3.8F, -7.75F, -15.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 665
		bodyModel[598].setRotationPoint(4.3F, -8.75F, -20.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 666
		bodyModel[599].setRotationPoint(4.3F, -9.1F, -20.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 667
		bodyModel[600].setRotationPoint(4.3F, -8.4F, -20.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 668
		bodyModel[601].setRotationPoint(5.3F, -8.4F, -20.5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 669
		bodyModel[602].setRotationPoint(5.3F, -9.1F, -20.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 670
		bodyModel[603].setRotationPoint(5.3F, -8.75F, -20.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 671
		bodyModel[604].setRotationPoint(6.3F, -8.4F, -20.5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 672
		bodyModel[605].setRotationPoint(6.3F, -9.1F, -20.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 673
		bodyModel[606].setRotationPoint(6.3F, -8.75F, -20.5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 674
		bodyModel[607].setRotationPoint(3.3F, -8.4F, -20.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 675
		bodyModel[608].setRotationPoint(3.3F, -9.1F, -20.5F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 676
		bodyModel[609].setRotationPoint(3.3F, -8.75F, -20.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 677
		bodyModel[610].setRotationPoint(2.3F, -8.4F, -20.5F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 678
		bodyModel[611].setRotationPoint(2.3F, -9.1F, -20.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 679
		bodyModel[612].setRotationPoint(2.3F, -8.75F, -20.5F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F); // Box 680
		bodyModel[613].setRotationPoint(3.8F, -9.75F, 15F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.2F, -0.3F, -0.8F, 0.2F, -0.3F, -0.8F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.6F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 681
		bodyModel[614].setRotationPoint(3.8F, -9.75F, -18F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[17];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 480
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 481
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 482
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 483
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 487
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 488
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 489
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 490
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 491
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 492
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 493
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 494
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 495
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 496
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 497
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 498
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 499

		gun_2_Model[0][0].addShapeBox(-1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Box 480

		gun_2_Model[0][1].addShapeBox(-7.5F, -1.5F, -6F, 6, 5, 12, 0F,0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F); // Box 481

		gun_2_Model[0][2].addShapeBox(-6.4F, -1.5F, -7F, 2, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 482

		gun_2_Model[0][3].addShapeBox(1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 2F, -0.5F, -2.25F, 2F, -0.5F, -2.25F, 0F, -0.5F, -0.25F); // Box 483

		gun_2_Model[0][4].addShapeBox(4.5F, -1.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 487

		gun_2_Model[0][5].addShapeBox(4.5F, -0.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 488

		gun_2_Model[0][6].addShapeBox(4.5F, 0.6F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 489

		gun_2_Model[0][7].addShapeBox(4.5F, 0.6F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 490

		gun_2_Model[0][8].addShapeBox(4.5F, -0.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 491

		gun_2_Model[0][9].addShapeBox(4.5F, -1.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 492

		gun_2_Model[0][10].addShapeBox(4.5F, 0.6F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 493

		gun_2_Model[0][11].addShapeBox(4.5F, -0.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 494

		gun_2_Model[0][12].addShapeBox(4.5F, -1.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 495

		gun_2_Model[0][13].addShapeBox(4.5F, -1.4F, -4F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 496

		gun_2_Model[0][14].addShapeBox(4.5F, -1.4F, 2.5F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 497

		gun_2_Model[0][15].addShapeBox(4.5F, -1.4F, 0.25F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 498

		gun_2_Model[0][16].addShapeBox(4.5F, -1.4F, -1.82F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 499

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(85.5F, -14.3F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 500
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 501
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 502
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 503
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 504
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 505

		gun_2_Model[1][0].addShapeBox(0F, 0F, -2.85F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 500

		gun_2_Model[1][1].addShapeBox(6F, 0F, -2.85F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 501

		gun_2_Model[1][2].addShapeBox(6F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 502

		gun_2_Model[1][3].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 503

		gun_2_Model[1][4].addShapeBox(6F, 0F, 1.62F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 504

		gun_2_Model[1][5].addShapeBox(0F, 0F, 1.62F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 505

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(85.5F, -14.3F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B38_one", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[17];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 480
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 481
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 482
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 483
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 487
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 488
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 489
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 490
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 491
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 492
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 493
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 494
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 495
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 496
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 497
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 498
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 499

		gun_3_Model[0][0].addShapeBox(-1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Box 480

		gun_3_Model[0][1].addShapeBox(-7.5F, -1.5F, -6F, 6, 5, 12, 0F,0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F); // Box 481

		gun_3_Model[0][2].addShapeBox(-6.4F, -1.5F, -7F, 2, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 482

		gun_3_Model[0][3].addShapeBox(1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 2F, -0.5F, -2.25F, 2F, -0.5F, -2.25F, 0F, -0.5F, -0.25F); // Box 483

		gun_3_Model[0][4].addShapeBox(4.5F, -1.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 487

		gun_3_Model[0][5].addShapeBox(4.5F, -0.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 488

		gun_3_Model[0][6].addShapeBox(4.5F, 0.6F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 489

		gun_3_Model[0][7].addShapeBox(4.5F, 0.6F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 490

		gun_3_Model[0][8].addShapeBox(4.5F, -0.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 491

		gun_3_Model[0][9].addShapeBox(4.5F, -1.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 492

		gun_3_Model[0][10].addShapeBox(4.5F, 0.6F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 493

		gun_3_Model[0][11].addShapeBox(4.5F, -0.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 494

		gun_3_Model[0][12].addShapeBox(4.5F, -1.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 495

		gun_3_Model[0][13].addShapeBox(4.5F, -1.4F, -4F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 496

		gun_3_Model[0][14].addShapeBox(4.5F, -1.4F, 2.5F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 497

		gun_3_Model[0][15].addShapeBox(4.5F, -1.4F, 0.25F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 498

		gun_3_Model[0][16].addShapeBox(4.5F, -1.4F, -1.82F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 499

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(106F, -11.8F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 500
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 501
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 502
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 503
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 504
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 505

		gun_3_Model[1][0].addShapeBox(0F, 0F, -2.85F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 500

		gun_3_Model[1][1].addShapeBox(6F, 0F, -2.85F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 501

		gun_3_Model[1][2].addShapeBox(6F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 502

		gun_3_Model[1][3].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 503

		gun_3_Model[1][4].addShapeBox(6F, 0F, 1.62F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 504

		gun_3_Model[1][5].addShapeBox(0F, 0F, 1.62F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 505

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(106F, -11.8F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B38_two", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[17];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 480
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 481
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 482
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 483
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 487
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 488
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 489
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 490
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 491
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 492
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 493
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 494
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 495
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 496
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 497
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 498
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 499

		gun_4_Model[0][0].addShapeBox(-1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Box 480

		gun_4_Model[0][1].addShapeBox(-7.5F, -1.5F, -6F, 6, 5, 12, 0F,0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F); // Box 481

		gun_4_Model[0][2].addShapeBox(-6.4F, -1.5F, -7F, 2, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 482

		gun_4_Model[0][3].addShapeBox(1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 2F, -0.5F, -2.25F, 2F, -0.5F, -2.25F, 0F, -0.5F, -0.25F); // Box 483

		gun_4_Model[0][4].addShapeBox(4.5F, -1.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 487

		gun_4_Model[0][5].addShapeBox(4.5F, -0.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 488

		gun_4_Model[0][6].addShapeBox(4.5F, 0.6F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 489

		gun_4_Model[0][7].addShapeBox(4.5F, 0.6F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 490

		gun_4_Model[0][8].addShapeBox(4.5F, -0.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 491

		gun_4_Model[0][9].addShapeBox(4.5F, -1.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 492

		gun_4_Model[0][10].addShapeBox(4.5F, 0.6F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 493

		gun_4_Model[0][11].addShapeBox(4.5F, -0.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 494

		gun_4_Model[0][12].addShapeBox(4.5F, -1.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 495

		gun_4_Model[0][13].addShapeBox(4.5F, -1.4F, -4F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 496

		gun_4_Model[0][14].addShapeBox(4.5F, -1.4F, 2.5F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 497

		gun_4_Model[0][15].addShapeBox(4.5F, -1.4F, 0.25F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 498

		gun_4_Model[0][16].addShapeBox(4.5F, -1.4F, -1.82F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 499

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-83.5F, -12F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[6];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 500
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 501
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 502
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 503
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 504
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 505

		gun_4_Model[1][0].addShapeBox(0F, 0F, -2.85F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 500

		gun_4_Model[1][1].addShapeBox(6F, 0F, -2.85F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 501

		gun_4_Model[1][2].addShapeBox(6F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 502

		gun_4_Model[1][3].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 503

		gun_4_Model[1][4].addShapeBox(6F, 0F, 1.62F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 504

		gun_4_Model[1][5].addShapeBox(0F, 0F, 1.62F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 505

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-83.5F, -12F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B38_three", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[17];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 480
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 481
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 482
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 483
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 487
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 488
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Box 489
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 490
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 491
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 492
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Box 493
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 494
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 495
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 496
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 497
		gun_5_Model[0][15] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 498
		gun_5_Model[0][16] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 499

		gun_5_Model[0][0].addShapeBox(-1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F); // Box 480

		gun_5_Model[0][1].addShapeBox(-7.5F, -1.5F, -6F, 6, 5, 12, 0F,0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F); // Box 481

		gun_5_Model[0][2].addShapeBox(-6.4F, -1.5F, -7F, 2, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 482

		gun_5_Model[0][3].addShapeBox(1.5F, -1.5F, -6F, 3, 5, 12, 0F,0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 2F, -0.5F, -2.25F, 2F, -0.5F, -2.25F, 0F, -0.5F, -0.25F); // Box 483

		gun_5_Model[0][4].addShapeBox(4.5F, -1.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 487

		gun_5_Model[0][5].addShapeBox(4.5F, -0.4F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 488

		gun_5_Model[0][6].addShapeBox(4.5F, 0.6F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 489

		gun_5_Model[0][7].addShapeBox(4.5F, 0.6F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 490

		gun_5_Model[0][8].addShapeBox(4.5F, -0.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 491

		gun_5_Model[0][9].addShapeBox(4.5F, -1.4F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 492

		gun_5_Model[0][10].addShapeBox(4.5F, 0.6F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 493

		gun_5_Model[0][11].addShapeBox(4.5F, -0.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 494

		gun_5_Model[0][12].addShapeBox(4.5F, -1.4F, -0.63F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 495

		gun_5_Model[0][13].addShapeBox(4.5F, -1.4F, -4F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 496

		gun_5_Model[0][14].addShapeBox(4.5F, -1.4F, 2.5F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 497

		gun_5_Model[0][15].addShapeBox(4.5F, -1.4F, 0.25F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 498

		gun_5_Model[0][16].addShapeBox(4.5F, -1.4F, -1.82F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 499

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-105F, -8.5F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[6];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 500
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 501
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 502
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 503
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 504
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 505

		gun_5_Model[1][0].addShapeBox(0F, 0F, -2.85F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 500

		gun_5_Model[1][1].addShapeBox(6F, 0F, -2.85F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 501

		gun_5_Model[1][2].addShapeBox(6F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 502

		gun_5_Model[1][3].addShapeBox(0F, 0F, -0.5F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 503

		gun_5_Model[1][4].addShapeBox(6F, 0F, 1.62F, 8, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 504

		gun_5_Model[1][5].addShapeBox(0F, 0F, 1.62F, 6, 1, 1, 0F,0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 505

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-105F, -8.5F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B38_four", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[20];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_6_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_6_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_6_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_6_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_6_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_6_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_6_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_6_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_6_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_6_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_6_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_6_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_6_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_6_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_6_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_6_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_6_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_6_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_6_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_6_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_6_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_6_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_6_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_6_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_6_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_6_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_6_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_6_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_6_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_6_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_6_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_6_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_6_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_6_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(52.8F, -10.3F, -12F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[4];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_6_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_6_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_6_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_6_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(52.8F, -10.3F, -12F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_one", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[20];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_7_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_7_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_7_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_7_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_7_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_7_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_7_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_7_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_7_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_7_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_7_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_7_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_7_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_7_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_7_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_7_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_7_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_7_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_7_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_7_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_7_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_7_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_7_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_7_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_7_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_7_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_7_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_7_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_7_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_7_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_7_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_7_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_7_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_7_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_7_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_7_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_7_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(52.8F, -10.3F, 12F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[4];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_7_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_7_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_7_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_7_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_7_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(52.8F, -10.3F, 12F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_two", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[20];
		gun_8_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_8_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_8_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_8_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_8_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_8_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_8_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_8_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_8_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_8_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_8_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_8_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_8_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_8_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_8_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_8_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_8_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_8_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_8_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_8_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_8_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_8_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_8_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_8_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_8_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_8_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_8_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_8_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_8_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_8_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_8_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_8_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_8_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_8_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_8_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_8_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_8_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_8_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_8_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_8_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[0])
		{
			gunPart.setRotationPoint(-10.3F, -10.3F, 12F);
		}


		gun_8_Model[1] = new ModelRendererTurbo[4];
		gun_8_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_8_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_8_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_8_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_8_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_8_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_8_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_8_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[1])
		{
			gunPart.setRotationPoint(-10.3F, -10.3F, 12F);
		}


		gun_8_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_three", gun_8_Model);

		// Passenger 10
		ModelRendererTurbo[][] gun_9_Model = new ModelRendererTurbo[3][];

		gun_9_Model[0] = new ModelRendererTurbo[20];
		gun_9_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_9_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_9_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_9_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_9_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_9_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_9_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_9_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_9_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_9_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_9_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_9_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_9_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_9_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_9_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_9_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_9_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_9_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_9_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_9_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_9_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_9_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_9_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_9_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_9_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_9_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_9_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_9_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_9_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_9_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_9_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_9_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_9_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_9_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_9_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_9_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_9_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_9_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_9_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_9_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[0])
		{
			gunPart.setRotationPoint(-10.3F, -10.3F, -12F);
		}


		gun_9_Model[1] = new ModelRendererTurbo[4];
		gun_9_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_9_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_9_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_9_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_9_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_9_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_9_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_9_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_9_Model[1])
		{
			gunPart.setRotationPoint(-10.3F, -10.3F, -12F);
		}


		gun_9_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_four", gun_9_Model);

		// Passenger 11
		ModelRendererTurbo[][] gun_10_Model = new ModelRendererTurbo[3][];

		gun_10_Model[0] = new ModelRendererTurbo[20];
		gun_10_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_10_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_10_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_10_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_10_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_10_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_10_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_10_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_10_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_10_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_10_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_10_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_10_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_10_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_10_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_10_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_10_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_10_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_10_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_10_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_10_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_10_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_10_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_10_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_10_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_10_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_10_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_10_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_10_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_10_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_10_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_10_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_10_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_10_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_10_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_10_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_10_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_10_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_10_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_10_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[0])
		{
			gunPart.setRotationPoint(-37.5F, -10.3F, -12F);
		}


		gun_10_Model[1] = new ModelRendererTurbo[4];
		gun_10_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_10_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_10_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_10_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_10_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_10_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_10_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_10_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_10_Model[1])
		{
			gunPart.setRotationPoint(-37.5F, -10.3F, -12F);
		}


		gun_10_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_five", gun_10_Model);

		// Passenger 12
		ModelRendererTurbo[][] gun_11_Model = new ModelRendererTurbo[3][];

		gun_11_Model[0] = new ModelRendererTurbo[20];
		gun_11_Model[0][0] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 516
		gun_11_Model[0][1] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 517
		gun_11_Model[0][2] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 518
		gun_11_Model[0][3] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 519
		gun_11_Model[0][4] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 520
		gun_11_Model[0][5] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 521
		gun_11_Model[0][6] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 522
		gun_11_Model[0][7] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 524
		gun_11_Model[0][8] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Box 525
		gun_11_Model[0][9] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 526
		gun_11_Model[0][10] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 527
		gun_11_Model[0][11] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Box 528
		gun_11_Model[0][12] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 529
		gun_11_Model[0][13] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 530
		gun_11_Model[0][14] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 531
		gun_11_Model[0][15] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 532
		gun_11_Model[0][16] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 533
		gun_11_Model[0][17] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 534
		gun_11_Model[0][18] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 535
		gun_11_Model[0][19] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Box 536

		gun_11_Model[0][0].addShapeBox(-4F, -1.5F, -3.5F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0.25F, 1.5F, 0.25F, 0.25F, 1.5F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Box 516

		gun_11_Model[0][1].addShapeBox(-4F, -3F, -3.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0.25F, 1F, -0.5F, 0.25F, 1F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 517

		gun_11_Model[0][2].addShapeBox(-4F, -3F, -1.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 518

		gun_11_Model[0][3].addShapeBox(-6F, -3F, -1.5F, 2, 2, 3, 0F,0F, -1.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F); // Box 519

		gun_11_Model[0][4].addShapeBox(-6F, -3F, -3.5F, 2, 2, 3, 0F,0F, -1.25F, -2.9F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 520

		gun_11_Model[0][5].addShapeBox(-6F, -2F, -3.5F, 2, 3, 3, 0F,0F, -0.5F, -2.9F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0.75F, -2.9F, 0F, 0.75F, 0.25F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0F); // Box 521

		gun_11_Model[0][6].addShapeBox(-6F, -2F, -1.5F, 2, 4, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0.75F, -1F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -1F); // Box 522

		gun_11_Model[0][7].addShapeBox(-4F, 0.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 524

		gun_11_Model[0][8].addShapeBox(-4F, 1.75F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0.5F, 0F, -2.75F, 0F, 0F, -2.75F); // Box 525

		gun_11_Model[0][9].addShapeBox(-6F, 1.75F, -3.5F, 2, 1, 3, 0F,0F, 0F, -2.9F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 526

		gun_11_Model[0][10].addShapeBox(-6F, 1.75F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.9F); // Box 527

		gun_11_Model[0][11].addShapeBox(-6F, -2F, 0.5F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F, 0F, 0.75F, 0F, 0F, 0.75F, -0.75F, 0F, 0.75F, 0.25F, 0F, 0.75F, -2.9F); // Box 528

		gun_11_Model[0][12].addShapeBox(-6F, -3F, 0.5F, 2, 2, 3, 0F,0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -2.9F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.9F); // Box 529

		gun_11_Model[0][13].addShapeBox(-4F, -3F, 0.5F, 6, 2, 3, 0F,0F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, -2.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 1F, -0.5F, -0.75F, 1F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 530

		gun_11_Model[0][14].addShapeBox(-4F, -1.5F, 0.5F, 7, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 1.5F, 0.25F, -0.75F, 1.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 531

		gun_11_Model[0][15].addShapeBox(2.2F, -3.5F, -3.5F, 2, 4, 2, 0F,-0.9F, -0.1F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, -0.9F, -0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 532

		gun_11_Model[0][16].addShapeBox(1.5F, -2.2F, 1.25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533

		gun_11_Model[0][17].addShapeBox(1.5F, -2.7F, 1.25F, 2, 1, 2, 0F,-0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 534

		gun_11_Model[0][18].addShapeBox(-1.5F, -1.9F, -1F, 2, 2, 2, 0F,0F, 0F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0F, 0.3F, 2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F); // Box 535

		gun_11_Model[0][19].addShapeBox(-1.5F, -0.9F, -1F, 2, 2, 2, 0F,2F, -1F, 0.3F, 0.75F, -0.5F, 0.3F, 0.75F, -0.5F, 0.3F, 2F, -1F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 536

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[0])
		{
			gunPart.setRotationPoint(-37.5F, -10.3F, 12F);
		}


		gun_11_Model[1] = new ModelRendererTurbo[4];
		gun_11_Model[1][0] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 537
		gun_11_Model[1][1] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 538
		gun_11_Model[1][2] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 539
		gun_11_Model[1][3] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 540

		gun_11_Model[1][0].addShapeBox(-0.5F, -0.65F, -1.2F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 537

		gun_11_Model[1][1].addShapeBox(7.3F, -0.65F, -1.2F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 538

		gun_11_Model[1][2].addShapeBox(7.3F, -0.65F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.25F, -0.25F, -0.15F, -0.25F, -0.25F, 0F, -0.35F, -0.35F); // Box 539

		gun_11_Model[1][3].addShapeBox(-0.5F, -0.65F, 0F, 8, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 540

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_11_Model[1])
		{
			gunPart.setRotationPoint(-37.5F, -10.3F, 12F);
		}


		gun_11_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("CM5_six", gun_11_Model);
	}
}