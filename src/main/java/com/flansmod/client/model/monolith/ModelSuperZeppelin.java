//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: P Class Zeppelin
// Model Creator: 
// Created on: 17.08.2015 - 20:17:18
// Last changed on: 17.08.2015 - 20:17:18

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSuperZeppelin extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSuperZeppelin() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[213];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[1];
		leftBackWheelModel = new ModelRendererTurbo[4];
		leftTrackModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initleftBackWheelModel_1();
		initleftTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Box 112
		bodyModel[93] = new ModelRendererTurbo(this, 465, 305, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 122
		bodyModel[97] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 123
		bodyModel[98] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 124
		bodyModel[99] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 125
		bodyModel[100] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 126
		bodyModel[101] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Box 127
		bodyModel[102] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Box 128
		bodyModel[103] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Box 129
		bodyModel[104] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Box 130
		bodyModel[105] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 138
		bodyModel[109] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 141
		bodyModel[110] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 142
		bodyModel[111] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 143
		bodyModel[112] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		bodyModel[113] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 145
		bodyModel[114] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 146
		bodyModel[115] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 147
		bodyModel[116] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 148
		bodyModel[117] = new ModelRendererTurbo(this, 353, 321, textureX, textureY); // Box 149
		bodyModel[118] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 145
		bodyModel[119] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 393, 321, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 249, 329, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 156
		bodyModel[137] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Box 157
		bodyModel[138] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 158
		bodyModel[139] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 159
		bodyModel[140] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 160
		bodyModel[141] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 161
		bodyModel[142] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Box 162
		bodyModel[143] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 163
		bodyModel[144] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Box 164
		bodyModel[145] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 165
		bodyModel[146] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 166
		bodyModel[147] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 167
		bodyModel[148] = new ModelRendererTurbo(this, 209, 337, textureX, textureY); // Box 168
		bodyModel[149] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 169
		bodyModel[150] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Box 170
		bodyModel[151] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 171
		bodyModel[152] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 172
		bodyModel[153] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 174
		bodyModel[154] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 175
		bodyModel[155] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 176
		bodyModel[156] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 177
		bodyModel[157] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 178
		bodyModel[158] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 179
		bodyModel[159] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 183
		bodyModel[160] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 184
		bodyModel[161] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 185
		bodyModel[162] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 186
		bodyModel[163] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 187
		bodyModel[164] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 188
		bodyModel[165] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 189
		bodyModel[166] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 190
		bodyModel[167] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 191
		bodyModel[168] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 192
		bodyModel[169] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Box 193
		bodyModel[170] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 194
		bodyModel[171] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 195
		bodyModel[172] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 196
		bodyModel[173] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 197
		bodyModel[174] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 198
		bodyModel[175] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 199
		bodyModel[176] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 200
		bodyModel[177] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 201
		bodyModel[178] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 202
		bodyModel[179] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 203
		bodyModel[180] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 205
		bodyModel[181] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 206
		bodyModel[182] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 207
		bodyModel[183] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 208
		bodyModel[184] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 209
		bodyModel[185] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 212
		bodyModel[186] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 213
		bodyModel[187] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 214
		bodyModel[188] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 215
		bodyModel[189] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 216
		bodyModel[190] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 217
		bodyModel[191] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 218
		bodyModel[192] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 219
		bodyModel[193] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 220
		bodyModel[194] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 221
		bodyModel[195] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 222
		bodyModel[196] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 223
		bodyModel[197] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 224
		bodyModel[198] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 225
		bodyModel[199] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 226
		bodyModel[200] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Box 227
		bodyModel[201] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 228
		bodyModel[202] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 229
		bodyModel[203] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 230
		bodyModel[204] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 231
		bodyModel[205] = new ModelRendererTurbo(this, 385, 337, textureX, textureY); // Box 232
		bodyModel[206] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Box 233
		bodyModel[207] = new ModelRendererTurbo(this, 127, 384, textureX, textureY); // Box 225
		bodyModel[208] = new ModelRendererTurbo(this, 122, 413, textureX, textureY); // Box 226
		bodyModel[209] = new ModelRendererTurbo(this, 135, 473, textureX, textureY); // Box 227
		bodyModel[210] = new ModelRendererTurbo(this, 123, 445, textureX, textureY); // Box 228

		bodyModel[0].addShapeBox(0F, 0F, 0F, 120, 2, 10, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-58F, -32F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 120, 2, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-58F, -32F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F); // Box 2
		bodyModel[2].setRotationPoint(-74F, -30F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 120, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-58F, -30F, -10.1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 4
		bodyModel[4].setRotationPoint(-58F, -23F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-58F, -23F, -18.1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
		bodyModel[6].setRotationPoint(-58F, -18F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-58F, -18F, -18.1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 120, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[8].setRotationPoint(-58F, -13F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 120, 5, 17, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-58F, -13F, -17.1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 120, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 10
		bodyModel[10].setRotationPoint(-58F, -8F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 120, 6, 14, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-58F, -8F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 2, 10, 0F,0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(62F, -32F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 8F); // Box 14
		bodyModel[13].setRotationPoint(62F, -30F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(62F, -30F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 16
		bodyModel[15].setRotationPoint(62F, -23F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(62F, -23F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 2, 10, 0F,0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(62F, -32F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F); // Box 19
		bodyModel[18].setRotationPoint(62F, -18F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(62F, -18F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F); // Box 21
		bodyModel[20].setRotationPoint(62F, -13F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 21, 5, 17, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(62F, -13F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 21, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4.5F, -7F, 0F, -1.5F, -4F); // Box 23
		bodyModel[22].setRotationPoint(62F, -8F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 21, 6, 14, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -4.5F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(62F, -8F, -14F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 7F); // Box 25
		bodyModel[24].setRotationPoint(83F, -30F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 27
		bodyModel[25].setRotationPoint(83F, -23F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 5, 14, 0F,0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(83F, -23F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F,0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(83F, -30F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 30
		bodyModel[28].setRotationPoint(83F, -18F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 5, 13, 0F,0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(83F, -18F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, 0F, -1F); // Box 32
		bodyModel[30].setRotationPoint(83F, -13F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(83F, -13F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -6F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6.5F, -7F, 0F, -1.5F, -2F); // Box 35
		bodyModel[32].setRotationPoint(83F, -8F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, 0F, 2F, 0F, 4F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -6.5F, -7F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[33].setRotationPoint(83F, -8F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(93F, -25F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -5F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(93F, -25F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(93F, -23F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F,0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(93F, -23F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 42
		bodyModel[38].setRotationPoint(93F, -18F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(93F, -18F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, -5F); // Box 44
		bodyModel[40].setRotationPoint(93F, -13F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(93F, -13F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -0.5F, -1F); // Box 46
		bodyModel[42].setRotationPoint(93F, -12F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(93F, -12F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F,0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 48
		bodyModel[44].setRotationPoint(-74F, -32F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F,0F, -2F, -2F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(-74F, -32F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 120, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 50
		bodyModel[46].setRotationPoint(-58F, -30F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 7, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(-74F, -30F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(-74F, -23F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(-74F, -23F, -18F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(-74F, -18F, -18F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 55
		bodyModel[51].setRotationPoint(-74F, -18F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 56
		bodyModel[52].setRotationPoint(-74F, -13F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(-74F, -13F, -17F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -7F); // Box 58
		bodyModel[54].setRotationPoint(-74F, -8F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[55].setRotationPoint(-74F, -8F, -14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 7, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F); // Box 61
		bodyModel[56].setRotationPoint(-92F, -30F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 7, 8, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[57].setRotationPoint(-92F, -30F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 63
		bodyModel[58].setRotationPoint(-92F, -32F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, -3F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-92F, -32F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 65
		bodyModel[60].setRotationPoint(-92F, -23F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[61].setRotationPoint(-92F, -23F, -16F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 67
		bodyModel[62].setRotationPoint(-92F, -18F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(-92F, -18F, -16F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 69
		bodyModel[64].setRotationPoint(-92F, -13F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[65].setRotationPoint(-92F, -13F, -15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, -5F, 0F, -3.5F, -7F); // Box 71
		bodyModel[66].setRotationPoint(-92F, -8F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -7F, 0F, -1.5F, -5F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-92F, -8F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 73
		bodyModel[68].setRotationPoint(-110F, -23F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-110F, -23F, -14F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F,0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 5.5F); // Box 75
		bodyModel[70].setRotationPoint(-110F, -30F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F,0F, -5F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 5.5F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-110F, -30F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F); // Box 78
		bodyModel[72].setRotationPoint(-110F, -18F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F,0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-110F, -18F, -14F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, -7F); // Box 80
		bodyModel[74].setRotationPoint(-110F, -13F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F,0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 81
		bodyModel[75].setRotationPoint(-110F, -13F, -13F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 6, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2.5F, -4F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3.5F, -5F, 0F, -8.5F, -4F); // Box 82
		bodyModel[76].setRotationPoint(-110F, -8F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 6, 10, 0F,0F, 2.5F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -8.5F, -4F, 0F, -3.5F, -5F, 0F, -3F, 0F, 0F, -8F, 0F); // Box 83
		bodyModel[77].setRotationPoint(-110F, -8F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 1F, 1.5F); // Box 84
		bodyModel[78].setRotationPoint(-120F, -28F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, -5F, -3F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 1F, 1.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[79].setRotationPoint(-120F, -28F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F); // Box 86
		bodyModel[80].setRotationPoint(-120F, -23F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, -1F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(-120F, -23F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -5.5F); // Box 88
		bodyModel[82].setRotationPoint(-120F, -18F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 89
		bodyModel[83].setRotationPoint(-120F, -18F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 1F, -3.5F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3F, 0F, -5F, -3.5F); // Box 90
		bodyModel[84].setRotationPoint(-120F, -13F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F,0F, 1F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -3.5F, 0F, -1.5F, -3F, 0F, -1F, 0F, 0F, -5F, 0F); // Box 91
		bodyModel[85].setRotationPoint(-120F, -13F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 92
		bodyModel[86].setRotationPoint(-133F, -22F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, -1F, -5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[87].setRotationPoint(-133F, -22F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, -3F); // Box 94
		bodyModel[88].setRotationPoint(-133F, -23F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, -2F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[89].setRotationPoint(-133F, -23F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, -3F); // Box 96
		bodyModel[90].setRotationPoint(-133F, -18F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F,0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 97
		bodyModel[91].setRotationPoint(-133F, -18F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[92].setRotationPoint(-119F, -33F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 20, 13, 2, 0F,0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[93].setRotationPoint(-119F, -19F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[94].setRotationPoint(-127F, -25F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 118
		bodyModel[95].setRotationPoint(29F, 7F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[96].setRotationPoint(34F, 12F, -7F);
		bodyModel[96].rotateAngleX = 0.73303829F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[97].setRotationPoint(34F, 11.5F, 6F);
		bodyModel[97].rotateAngleX = -0.73303829F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[98].setRotationPoint(34F, 7F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[99].setRotationPoint(34F, 5F, 4F);
		bodyModel[99].rotateAngleX = 0.73303829F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[100].setRotationPoint(34F, 4.5F, -5F);
		bodyModel[100].rotateAngleX = -0.73303829F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[101].setRotationPoint(34F, 13.3F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[102].setRotationPoint(34F, 4.5F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[103].setRotationPoint(34F, 4.5F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 130
		bodyModel[104].setRotationPoint(34F, 11F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[105].setRotationPoint(45F, 7F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[106].setRotationPoint(45F, 10F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[107].setRotationPoint(49F, 7F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 138
		bodyModel[108].setRotationPoint(46.5F, 9.5F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[109].setRotationPoint(57.6F, 7F, 6F);
		bodyModel[109].rotateAngleY = -0.40142573F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[110].setRotationPoint(57.6F, 10F, 6F);
		bodyModel[110].rotateAngleY = -0.40142573F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[111].setRotationPoint(57.6F, 8F, 6F);
		bodyModel[111].rotateAngleY = -0.40142573F;

		bodyModel[112].addShapeBox(6F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[112].setRotationPoint(57.6F, 8F, 6F);
		bodyModel[112].rotateAngleY = -0.40142573F;

		bodyModel[113].addShapeBox(6F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[113].setRotationPoint(58F, 8F, -7F);
		bodyModel[113].rotateAngleY = 0.40142573F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[114].setRotationPoint(58F, 7F, -7F);
		bodyModel[114].rotateAngleY = 0.40142573F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[115].setRotationPoint(58F, 8F, -7F);
		bodyModel[115].rotateAngleY = 0.40142573F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[116].setRotationPoint(58F, 10F, -7F);
		bodyModel[116].rotateAngleY = 0.40142573F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 149
		bodyModel[117].setRotationPoint(57.5F, 4.5F, -5F);
		bodyModel[117].rotateAngleZ = -0.27925268F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 145
		bodyModel[118].setRotationPoint(46.5F, 9.5F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 136
		bodyModel[119].setRotationPoint(57.5F, 5.3F, 4.5F);
		bodyModel[119].rotateAngleX = 0.61086524F;
		bodyModel[119].rotateAngleY = -0.40142573F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(58F, 4.5F, -5F);
		bodyModel[120].rotateAngleX = -0.73303829F;
		bodyModel[120].rotateAngleY = 0.41887902F;
		bodyModel[120].rotateAngleZ = -0.03490659F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[121].setRotationPoint(58F, 12F, -7F);
		bodyModel[121].rotateAngleX = 0.6981317F;
		bodyModel[121].rotateAngleY = 0.38397244F;
		bodyModel[121].rotateAngleZ = 0.01745329F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-60F, 4.5F, -5F);
		bodyModel[122].rotateAngleX = -0.73303829F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[123].setRotationPoint(-60F, 4.5F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(-60F, 5F, 4F);
		bodyModel[124].rotateAngleX = 0.73303829F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[125].setRotationPoint(-60F, 7F, 6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[126].setRotationPoint(-49F, 7F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[127].setRotationPoint(-49F, 10F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[128].setRotationPoint(-60F, 11.5F, 6F);
		bodyModel[128].rotateAngleX = -0.73303829F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[129].setRotationPoint(-60F, 13.3F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 24, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[130].setRotationPoint(-60F, 12F, -7F);
		bodyModel[130].rotateAngleX = 0.73303829F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 148
		bodyModel[131].setRotationPoint(-47.5F, 9.5F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 149
		bodyModel[132].setRotationPoint(-47.5F, 9.5F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[133].setRotationPoint(-60F, 4.5F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 5, 14, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 151
		bodyModel[134].setRotationPoint(-65F, 7F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 152
		bodyModel[135].setRotationPoint(-60F, 11F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[136].setRotationPoint(-36F, 4.5F, -5F);
		bodyModel[136].rotateAngleX = -0.73303829F;
		bodyModel[136].rotateAngleY = 0.41887902F;
		bodyModel[136].rotateAngleZ = -0.03490659F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 157
		bodyModel[137].setRotationPoint(-36.5F, 4.5F, -5F);
		bodyModel[137].rotateAngleZ = -0.27925268F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 158
		bodyModel[138].setRotationPoint(-36.5F, 5.3F, 4.5F);
		bodyModel[138].rotateAngleX = 0.61086524F;
		bodyModel[138].rotateAngleY = -0.40142573F;

		bodyModel[139].addShapeBox(6F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[139].setRotationPoint(-36.4F, 8F, 6F);
		bodyModel[139].rotateAngleY = -0.40142573F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[140].setRotationPoint(-45F, 7F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[141].setRotationPoint(-36.4F, 8F, 6F);
		bodyModel[141].rotateAngleY = -0.40142573F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[142].setRotationPoint(-36.4F, 7F, 6F);
		bodyModel[142].rotateAngleY = -0.40142573F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[143].setRotationPoint(-36.4F, 10F, 6F);
		bodyModel[143].rotateAngleY = -0.40142573F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[144].setRotationPoint(-36F, 10F, -7F);
		bodyModel[144].rotateAngleY = 0.40142573F;

		bodyModel[145].addShapeBox(6F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[145].setRotationPoint(-36F, 8F, -7F);
		bodyModel[145].rotateAngleY = 0.40142573F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[146].setRotationPoint(-36F, 7F, -7F);
		bodyModel[146].rotateAngleY = 0.40142573F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[147].setRotationPoint(-36F, 8F, -7F);
		bodyModel[147].rotateAngleY = 0.40142573F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 168
		bodyModel[148].setRotationPoint(-36.5F, 13.4F, -5F);
		bodyModel[148].rotateAngleZ = 0.27925268F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[149].setRotationPoint(-36F, 11.5F, 6F);
		bodyModel[149].rotateAngleX = -0.73303829F;
		bodyModel[149].rotateAngleY = -0.38397244F;
		bodyModel[149].rotateAngleZ = 0.03490659F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[150].setRotationPoint(-36F, 12F, -7F);
		bodyModel[150].rotateAngleX = 0.6981317F;
		bodyModel[150].rotateAngleY = 0.38397244F;
		bodyModel[150].rotateAngleZ = 0.01745329F;

		bodyModel[151].addShapeBox(6F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[151].setRotationPoint(59.3F, 7F, -3.5F);

		bodyModel[152].addShapeBox(6F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[152].setRotationPoint(59.3F, 10F, -3.5F);

		bodyModel[153].addShapeBox(6F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 174
		bodyModel[153].setRotationPoint(59.3F, 8F, 1F);

		bodyModel[154].addShapeBox(6F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 175
		bodyModel[154].setRotationPoint(59.3F, 8F, -3.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 176
		bodyModel[155].setRotationPoint(64.5F, 9.8F, -0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 177
		bodyModel[156].setRotationPoint(57.5F, 13.4F, -5F);
		bodyModel[156].rotateAngleZ = 0.27925268F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 178
		bodyModel[157].setRotationPoint(57.5F, 13.4F, 0F);
		bodyModel[157].rotateAngleZ = 0.27925268F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[158].setRotationPoint(57.5F, 13.4F, -2F);
		bodyModel[158].rotateAngleZ = 0.27925268F;

		bodyModel[159].addShapeBox(6F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[159].setRotationPoint(-34.7F, 10F, -3.5F);

		bodyModel[160].addShapeBox(6F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 184
		bodyModel[160].setRotationPoint(-34.7F, 8F, -3.5F);

		bodyModel[161].addShapeBox(6F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[161].setRotationPoint(-34.7F, 7F, -3.5F);

		bodyModel[162].addShapeBox(6F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 186
		bodyModel[162].setRotationPoint(-34.7F, 8F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 187
		bodyModel[163].setRotationPoint(-29.5F, 9.8F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[164].setRotationPoint(34F, 7F, -7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[165].setRotationPoint(49F, 7F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[166].setRotationPoint(45F, 7F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[167].setRotationPoint(45F, 10F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[168].setRotationPoint(-45F, 7F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[169].setRotationPoint(-60F, 7F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[170].setRotationPoint(-49F, 7F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[171].setRotationPoint(-49F, 10F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[172].setRotationPoint(36F, 3.5F, -2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[173].setRotationPoint(45F, 3.5F, -2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[174].setRotationPoint(54F, 3.5F, -2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[175].setRotationPoint(-49F, 3.5F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[176].setRotationPoint(-58F, 3.5F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[177].setRotationPoint(-40F, 3.5F, -2F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[178].setRotationPoint(55F, 0.5F, -1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[179].setRotationPoint(46F, 0.5F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[180].setRotationPoint(-57F, 0.5F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[181].setRotationPoint(-48F, 0.5F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[182].setRotationPoint(-39F, 0.5F, -1F);

		bodyModel[183].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[183].setRotationPoint(55.5F, -2.5F, -5F);
		bodyModel[183].rotateAngleX = 0.76794487F;

		bodyModel[184].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[184].setRotationPoint(55.5F, -3.5F, 4F);
		bodyModel[184].rotateAngleX = -0.73303829F;

		bodyModel[185].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[185].setRotationPoint(46.5F, -3.5F, 4F);
		bodyModel[185].rotateAngleX = -0.73303829F;

		bodyModel[186].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[186].setRotationPoint(46.5F, -2.5F, -5F);
		bodyModel[186].rotateAngleX = 0.76794487F;

		bodyModel[187].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[187].setRotationPoint(37.5F, -3.5F, 4F);
		bodyModel[187].rotateAngleX = -0.73303829F;

		bodyModel[188].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[188].setRotationPoint(37.5F, -2.5F, -5F);
		bodyModel[188].rotateAngleX = 0.76794487F;

		bodyModel[189].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[189].setRotationPoint(-56.5F, -3.5F, 4F);
		bodyModel[189].rotateAngleX = -0.73303829F;

		bodyModel[190].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[190].setRotationPoint(-56.5F, -2.5F, -5F);
		bodyModel[190].rotateAngleX = 0.76794487F;

		bodyModel[191].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[191].setRotationPoint(-47.5F, -3.5F, 4F);
		bodyModel[191].rotateAngleX = -0.73303829F;

		bodyModel[192].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[192].setRotationPoint(-47.5F, -2.5F, -5F);
		bodyModel[192].rotateAngleX = 0.76794487F;

		bodyModel[193].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[193].setRotationPoint(-38.5F, -3.5F, 4F);
		bodyModel[193].rotateAngleX = -0.73303829F;

		bodyModel[194].addShapeBox(0F, -1F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[194].setRotationPoint(-38.5F, -2.5F, -5F);
		bodyModel[194].rotateAngleX = 0.76794487F;

		bodyModel[195].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[195].setRotationPoint(50.5F, -2.5F, -10F);
		bodyModel[195].rotateAngleX = 0.48869219F;

		bodyModel[196].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[196].setRotationPoint(42.5F, -2.5F, -10F);
		bodyModel[196].rotateAngleX = 0.48869219F;

		bodyModel[197].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[197].setRotationPoint(42.5F, -2.5F, 9F);
		bodyModel[197].rotateAngleX = -0.52359878F;

		bodyModel[198].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[198].setRotationPoint(50.5F, -2.5F, 9F);
		bodyModel[198].rotateAngleX = -0.52359878F;

		bodyModel[199].addShapeBox(0F, -2F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[199].setRotationPoint(50.5F, 0.5F, -8.5F);

		bodyModel[200].addShapeBox(0F, -2F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[200].setRotationPoint(42.5F, 0.5F, -8.5F);

		bodyModel[201].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[201].setRotationPoint(-51.5F, -2.5F, -10F);
		bodyModel[201].rotateAngleX = 0.48869219F;

		bodyModel[202].addShapeBox(0F, -2F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[202].setRotationPoint(-51.5F, 0.5F, -8.5F);

		bodyModel[203].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[203].setRotationPoint(-51.5F, -2.5F, 9F);
		bodyModel[203].rotateAngleX = -0.52359878F;

		bodyModel[204].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[204].setRotationPoint(-43.5F, -2.5F, -10F);
		bodyModel[204].rotateAngleX = 0.48869219F;

		bodyModel[205].addShapeBox(0F, -2F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[205].setRotationPoint(-43.5F, 0.5F, -8.5F);

		bodyModel[206].addShapeBox(0F, -2F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[206].setRotationPoint(-43.5F, -2.5F, 9F);
		bodyModel[206].rotateAngleX = -0.52359878F;

		bodyModel[207].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[207].setRotationPoint(-58F, -18F, -18F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 120, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[208].setRotationPoint(-58F, -23F, -18F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 120, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[209].setRotationPoint(-58F, -30F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 120, 5, 17, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[210].setRotationPoint(-58F, -13F, -17F);
		
		
		bodyModel[211] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 115
		bodyModel[212] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 116

		bodyModel[211].addShapeBox(-8F, 0F, -1F, 8, 8, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[211].setRotationPoint(-119F, -33F, 0F);

		bodyModel[212].addShapeBox(-8F, 0F, -1F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 116
		bodyModel[212].setRotationPoint(-119F, -12F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 182

		bodyDoorOpenModel[0].addShapeBox(1F, -0.5F, 0F, 2, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0F); // Box 182
		bodyDoorOpenModel[0].setRotationPoint(57.5F, 13.4F, -2F);
		bodyDoorOpenModel[0].rotateAngleX = 2.63544717F;
		bodyDoorOpenModel[0].rotateAngleY = 0.10471976F;
		bodyDoorOpenModel[0].rotateAngleZ = 0.27925268F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 181

		bodyDoorCloseModel[0].addShapeBox(1F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 181
		bodyDoorCloseModel[0].setRotationPoint(57.5F, 13.4F, -2F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.27925268F;
	}



	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 119
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 120
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 153
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 154

		leftBackWheelModel[0].addShapeBox(0F, -10.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftBackWheelModel[0].setRotationPoint(28F, 9.5F, 0F);
		leftBackWheelModel[0].rotateAngleX = 3.14159265F;
		leftBackWheelModel[0].rotateAngleY = -1.57079633F;

		leftBackWheelModel[1].addShapeBox(0F, -9.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftBackWheelModel[1].setRotationPoint(28F, 8.5F, 0F);
		leftBackWheelModel[1].rotateAngleY = -1.57079633F;

		leftBackWheelModel[2].addShapeBox(0F, -10.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftBackWheelModel[2].setRotationPoint(-66F, 9.5F, 0F);
		leftBackWheelModel[2].rotateAngleX = 3.14159265F;
		leftBackWheelModel[2].rotateAngleY = -1.57079633F;

		leftBackWheelModel[3].addShapeBox(0F, -9.5F, -0.5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftBackWheelModel[3].setRotationPoint(-66F, 8.5F, 0F);
		leftBackWheelModel[3].rotateAngleY = -1.57079633F;
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 151
		leftTrackModel[1] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 180
		leftTrackModel[2] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 204

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 151
		leftTrackModel[0].setRotationPoint(58F, 11.5F, 6F);
		leftTrackModel[0].rotateAngleX = -0.73303829F;
		leftTrackModel[0].rotateAngleY = -0.38397244F;
		leftTrackModel[0].rotateAngleZ = 0.03490659F;

		leftTrackModel[1].addShapeBox(3F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.1F); // Box 180
		leftTrackModel[1].setRotationPoint(57.5F, 13.4F, -2F);
		leftTrackModel[1].rotateAngleZ = 0.27925268F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackModel[2].setRotationPoint(37F, 0.5F, -1F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[11];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_1_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_1_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_1_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_1_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_1_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_1_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_1_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_1_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_1_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_1_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_1_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(47F, 10F, -5.5F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[11];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_2_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_2_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_2_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_2_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_2_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_2_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_2_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_2_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_2_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_2_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_2_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(47F, 10F, 5.5F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[11];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_3_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_3_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_3_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_3_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_3_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_3_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_3_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_3_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_3_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_3_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_3_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-28.7F, 10F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[11];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_4_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_4_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_4_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_4_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_4_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_4_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_4_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_4_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_4_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_4_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_4_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-47F, 10F, -5.5F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[11];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_5_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_5_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_5_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_5_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_5_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_5_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_5_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_5_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_5_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_5_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_5_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-47F, 10F, 5.5F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[0];

		gun_6_Model[1] = new ModelRendererTurbo[11];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 21, 399, textureX, textureY); // Box 1
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 37, 399, textureX, textureY); // Box 6
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 45, 399, textureX, textureY); // Box 7
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 53, 399, textureX, textureY); // Box 8
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 61, 399, textureX, textureY); // Box 9
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 10
		gun_6_Model[1][6] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 11
		gun_6_Model[1][7] = new ModelRendererTurbo(this, 85, 399, textureX, textureY); // Box 12
		gun_6_Model[1][8] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 13
		gun_6_Model[1][9] = new ModelRendererTurbo(this, 69, 399, textureX, textureY); // Box 14
		gun_6_Model[1][10] = new ModelRendererTurbo(this, 77, 399, textureX, textureY); // Box 16

		gun_6_Model[1][0].addShapeBox(-0.5F, -1.2F, -0.5F, 5, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 1

		gun_6_Model[1][1].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 6

		gun_6_Model[1][2].addShapeBox(-1.5F, -1F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 7

		gun_6_Model[1][3].addShapeBox(3.7F, -1.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 8

		gun_6_Model[1][4].addShapeBox(3.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 9

		gun_6_Model[1][5].addShapeBox(1.2F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 10

		gun_6_Model[1][6].addShapeBox(-0.5F, -0.8F, 0F, 1, 2, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 11

		gun_6_Model[1][7].addShapeBox(-1.9F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 12

		gun_6_Model[1][8].addShapeBox(-0.8F, -1.4F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 13

		gun_6_Model[1][9].addShapeBox(-0.3F, -1.1F, -0.2F, 1, 1, 1, 0F,0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, 0.01F, -0.4F, -0.4F); // Box 14

		gun_6_Model[1][10].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(65.3F, 10F, 0F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}