//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.10.2019 - 17:38:09
// Last changed on: 05.10.2019 - 17:38:09

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKuznetsov extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKuznetsov() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[558];
		bodyDoorOpenModel = new ModelRendererTurbo[24];
		bodyDoorCloseModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyModel_2();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 185, 273, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 577, 281, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 801, 281, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 337, 337, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 177, 353, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 497, 353, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 801, 369, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 449, 417, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 593, 417, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 705, 433, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 305, 425, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 145, 441, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 1, 513, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 545, 521, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 729, 521, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 185, 585, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 409, 585, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 545, 609, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 457, 473, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 601, 641, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 1, 649, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 913, 225, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 417, 649, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 553, 657, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 393, 681, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 217, 441, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 745, 281, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 897, 521, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 297, 353, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 561, 697, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 913, 433, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 209, 713, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 113, 449, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 897, 657, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 953, 257, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 569, 281, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Box 148
		bodyModel[149] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 149
		bodyModel[150] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 150
		bodyModel[151] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 151
		bodyModel[152] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 152
		bodyModel[153] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 153
		bodyModel[154] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 217, 473, textureX, textureY); // Box 155
		bodyModel[156] = new ModelRendererTurbo(this, 649, 465, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 561, 505, textureX, textureY); // Box 157
		bodyModel[158] = new ModelRendererTurbo(this, 809, 697, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 160
		bodyModel[161] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 161
		bodyModel[162] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 162
		bodyModel[163] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Box 163
		bodyModel[164] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 164
		bodyModel[165] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 165
		bodyModel[166] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 166
		bodyModel[167] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 167
		bodyModel[168] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 168
		bodyModel[169] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 169
		bodyModel[170] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 170
		bodyModel[171] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 171
		bodyModel[172] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 172
		bodyModel[173] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 173
		bodyModel[174] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 174
		bodyModel[175] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 175
		bodyModel[176] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 176
		bodyModel[177] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 177
		bodyModel[178] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 178
		bodyModel[179] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 179
		bodyModel[180] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 180
		bodyModel[181] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 181
		bodyModel[182] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 182
		bodyModel[183] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 183
		bodyModel[184] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 184
		bodyModel[185] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 185
		bodyModel[186] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 186
		bodyModel[187] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 187
		bodyModel[188] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 188
		bodyModel[189] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 189
		bodyModel[190] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 190
		bodyModel[191] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 191
		bodyModel[192] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 192
		bodyModel[193] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 193
		bodyModel[194] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 194
		bodyModel[195] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 195
		bodyModel[196] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 196
		bodyModel[197] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 197
		bodyModel[198] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 198
		bodyModel[199] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 199
		bodyModel[200] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 200
		bodyModel[201] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 201
		bodyModel[202] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 202
		bodyModel[203] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 203
		bodyModel[204] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 204
		bodyModel[205] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 205
		bodyModel[206] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 206
		bodyModel[207] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 207
		bodyModel[208] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 208
		bodyModel[209] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 209
		bodyModel[210] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 210
		bodyModel[211] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 211
		bodyModel[212] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 212
		bodyModel[213] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 213
		bodyModel[214] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 214
		bodyModel[215] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 215
		bodyModel[216] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 216
		bodyModel[217] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 217
		bodyModel[218] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 218
		bodyModel[219] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 219
		bodyModel[220] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 220
		bodyModel[221] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 221
		bodyModel[222] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 222
		bodyModel[223] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 223
		bodyModel[224] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 224
		bodyModel[225] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 225
		bodyModel[226] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 226
		bodyModel[227] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 227
		bodyModel[228] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 228
		bodyModel[229] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 229
		bodyModel[230] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 230
		bodyModel[231] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 231
		bodyModel[232] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 232
		bodyModel[233] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 233
		bodyModel[234] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 234
		bodyModel[235] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 235
		bodyModel[236] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 236
		bodyModel[237] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 237
		bodyModel[238] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 238
		bodyModel[239] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 239
		bodyModel[240] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 240
		bodyModel[241] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 241
		bodyModel[242] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 242
		bodyModel[243] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 243
		bodyModel[244] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 244
		bodyModel[245] = new ModelRendererTurbo(this, 873, 129, textureX, textureY); // Box 245
		bodyModel[246] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 246
		bodyModel[247] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 247
		bodyModel[248] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 248
		bodyModel[249] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 249
		bodyModel[250] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 250
		bodyModel[251] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Box 252
		bodyModel[252] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 253
		bodyModel[253] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 254
		bodyModel[254] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 255
		bodyModel[255] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 256
		bodyModel[256] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 257
		bodyModel[257] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 258
		bodyModel[258] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 259
		bodyModel[259] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 260
		bodyModel[260] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 261
		bodyModel[261] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 262
		bodyModel[262] = new ModelRendererTurbo(this, 953, 481, textureX, textureY); // Box 263
		bodyModel[263] = new ModelRendererTurbo(this, 657, 185, textureX, textureY); // Box 264
		bodyModel[264] = new ModelRendererTurbo(this, 929, 561, textureX, textureY); // Box 265
		bodyModel[265] = new ModelRendererTurbo(this, 705, 185, textureX, textureY); // Box 266
		bodyModel[266] = new ModelRendererTurbo(this, 569, 249, textureX, textureY); // Box 267
		bodyModel[267] = new ModelRendererTurbo(this, 129, 585, textureX, textureY); // Box 268
		bodyModel[268] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 269
		bodyModel[269] = new ModelRendererTurbo(this, 161, 585, textureX, textureY); // Box 271
		bodyModel[270] = new ModelRendererTurbo(this, 353, 585, textureX, textureY); // Box 272
		bodyModel[271] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 273
		bodyModel[272] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 274
		bodyModel[273] = new ModelRendererTurbo(this, 945, 601, textureX, textureY); // Box 275
		bodyModel[274] = new ModelRendererTurbo(this, 769, 697, textureX, textureY); // Box 276
		bodyModel[275] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 277
		bodyModel[276] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 278
		bodyModel[277] = new ModelRendererTurbo(this, 905, 697, textureX, textureY); // Box 279
		bodyModel[278] = new ModelRendererTurbo(this, 945, 705, textureX, textureY); // Box 280
		bodyModel[279] = new ModelRendererTurbo(this, 609, 145, textureX, textureY); // Box 281
		bodyModel[280] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 282
		bodyModel[281] = new ModelRendererTurbo(this, 937, 169, textureX, textureY); // Box 283
		bodyModel[282] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 284
		bodyModel[283] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 285
		bodyModel[284] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 287
		bodyModel[285] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 288
		bodyModel[286] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 289
		bodyModel[287] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 290
		bodyModel[288] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 291
		bodyModel[289] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 292
		bodyModel[290] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 293
		bodyModel[291] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 294
		bodyModel[292] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 295
		bodyModel[293] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 296
		bodyModel[294] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 297
		bodyModel[295] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 298
		bodyModel[296] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 299
		bodyModel[297] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 300
		bodyModel[298] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 301
		bodyModel[299] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 302
		bodyModel[300] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 303
		bodyModel[301] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 304
		bodyModel[302] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 305
		bodyModel[303] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 306
		bodyModel[304] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 307
		bodyModel[305] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 308
		bodyModel[306] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 309
		bodyModel[307] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 310
		bodyModel[308] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 311
		bodyModel[309] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 312
		bodyModel[310] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 313
		bodyModel[311] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 314
		bodyModel[312] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 315
		bodyModel[313] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 316
		bodyModel[314] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 317
		bodyModel[315] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 318
		bodyModel[316] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 319
		bodyModel[317] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Box 320
		bodyModel[318] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 321
		bodyModel[319] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 322
		bodyModel[320] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 323
		bodyModel[321] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 324
		bodyModel[322] = new ModelRendererTurbo(this, 569, 257, textureX, textureY); // Box 325
		bodyModel[323] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 326
		bodyModel[324] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 327
		bodyModel[325] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 328
		bodyModel[326] = new ModelRendererTurbo(this, 617, 249, textureX, textureY); // Box 329
		bodyModel[327] = new ModelRendererTurbo(this, 913, 225, textureX, textureY); // Box 330
		bodyModel[328] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 331
		bodyModel[329] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 332
		bodyModel[330] = new ModelRendererTurbo(this, 1009, 177, textureX, textureY); // Box 333
		bodyModel[331] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 334
		bodyModel[332] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 335
		bodyModel[333] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 336
		bodyModel[334] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 337
		bodyModel[335] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 338
		bodyModel[336] = new ModelRendererTurbo(this, 569, 273, textureX, textureY); // Box 339
		bodyModel[337] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 340
		bodyModel[338] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 341
		bodyModel[339] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Box 342
		bodyModel[340] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 343
		bodyModel[341] = new ModelRendererTurbo(this, 993, 273, textureX, textureY); // Box 344
		bodyModel[342] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Box 345
		bodyModel[343] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 346
		bodyModel[344] = new ModelRendererTurbo(this, 745, 281, textureX, textureY); // Box 347
		bodyModel[345] = new ModelRendererTurbo(this, 833, 281, textureX, textureY); // Box 348
		bodyModel[346] = new ModelRendererTurbo(this, 937, 201, textureX, textureY); // Box 349
		bodyModel[347] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 350
		bodyModel[348] = new ModelRendererTurbo(this, 649, 249, textureX, textureY); // Box 351
		bodyModel[349] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 352
		bodyModel[350] = new ModelRendererTurbo(this, 1009, 217, textureX, textureY); // Box 353
		bodyModel[351] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 354
		bodyModel[352] = new ModelRendererTurbo(this, 913, 241, textureX, textureY); // Box 355
		bodyModel[353] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Box 356
		bodyModel[354] = new ModelRendererTurbo(this, 1009, 241, textureX, textureY); // Box 357
		bodyModel[355] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 358
		bodyModel[356] = new ModelRendererTurbo(this, 609, 281, textureX, textureY); // Box 359
		bodyModel[357] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 360
		bodyModel[358] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 361
		bodyModel[359] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 362
		bodyModel[360] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Box 363
		bodyModel[361] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 364
		bodyModel[362] = new ModelRendererTurbo(this, 833, 297, textureX, textureY); // Box 365
		bodyModel[363] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 366
		bodyModel[364] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 367
		bodyModel[365] = new ModelRendererTurbo(this, 593, 257, textureX, textureY); // Box 368
		bodyModel[366] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 369
		bodyModel[367] = new ModelRendererTurbo(this, 745, 297, textureX, textureY); // Box 370
		bodyModel[368] = new ModelRendererTurbo(this, 953, 297, textureX, textureY); // Box 371
		bodyModel[369] = new ModelRendererTurbo(this, 585, 273, textureX, textureY); // Box 372
		bodyModel[370] = new ModelRendererTurbo(this, 993, 297, textureX, textureY); // Box 373
		bodyModel[371] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 374
		bodyModel[372] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 375
		bodyModel[373] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 376
		bodyModel[374] = new ModelRendererTurbo(this, 993, 305, textureX, textureY); // Box 377
		bodyModel[375] = new ModelRendererTurbo(this, 969, 257, textureX, textureY); // Box 378
		bodyModel[376] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 379
		bodyModel[377] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 380
		bodyModel[378] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 381
		bodyModel[379] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 382
		bodyModel[380] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 383
		bodyModel[381] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 384
		bodyModel[382] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 385
		bodyModel[383] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 386
		bodyModel[384] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Box 387
		bodyModel[385] = new ModelRendererTurbo(this, 1017, 289, textureX, textureY); // Box 388
		bodyModel[386] = new ModelRendererTurbo(this, 841, 313, textureX, textureY); // Box 389
		bodyModel[387] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 390
		bodyModel[388] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 391
		bodyModel[389] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 392
		bodyModel[390] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 393
		bodyModel[391] = new ModelRendererTurbo(this, 1, 753, textureX, textureY); // Box 391
		bodyModel[392] = new ModelRendererTurbo(this, 1, 761, textureX, textureY); // Box 392
		bodyModel[393] = new ModelRendererTurbo(this, 953, 281, textureX, textureY); // Box 393
		bodyModel[394] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 395
		bodyModel[395] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 396
		bodyModel[396] = new ModelRendererTurbo(this, 41, 321, textureX, textureY); // Box 397
		bodyModel[397] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Box 398
		bodyModel[398] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Box 399
		bodyModel[399] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 400
		bodyModel[400] = new ModelRendererTurbo(this, 41, 329, textureX, textureY); // Box 401
		bodyModel[401] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 402
		bodyModel[402] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Box 403
		bodyModel[403] = new ModelRendererTurbo(this, 345, 329, textureX, textureY); // Box 404
		bodyModel[404] = new ModelRendererTurbo(this, 377, 329, textureX, textureY); // Box 405
		bodyModel[405] = new ModelRendererTurbo(this, 953, 329, textureX, textureY); // Box 406
		bodyModel[406] = new ModelRendererTurbo(this, 985, 329, textureX, textureY); // Box 407
		bodyModel[407] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 408
		bodyModel[408] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 409
		bodyModel[409] = new ModelRendererTurbo(this, 521, 337, textureX, textureY); // Box 410
		bodyModel[410] = new ModelRendererTurbo(this, 801, 337, textureX, textureY); // Box 411
		bodyModel[411] = new ModelRendererTurbo(this, 953, 337, textureX, textureY); // Box 412
		bodyModel[412] = new ModelRendererTurbo(this, 985, 337, textureX, textureY); // Box 414
		bodyModel[413] = new ModelRendererTurbo(this, 521, 345, textureX, textureY); // Box 415
		bodyModel[414] = new ModelRendererTurbo(this, 801, 345, textureX, textureY); // Box 418
		bodyModel[415] = new ModelRendererTurbo(this, 953, 345, textureX, textureY); // Box 419
		bodyModel[416] = new ModelRendererTurbo(this, 985, 345, textureX, textureY); // Box 420
		bodyModel[417] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 421
		bodyModel[418] = new ModelRendererTurbo(this, 33, 353, textureX, textureY); // Box 422
		bodyModel[419] = new ModelRendererTurbo(this, 177, 353, textureX, textureY); // Box 423
		bodyModel[420] = new ModelRendererTurbo(this, 209, 353, textureX, textureY); // Box 424
		bodyModel[421] = new ModelRendererTurbo(this, 521, 353, textureX, textureY); // Box 425
		bodyModel[422] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 426
		bodyModel[423] = new ModelRendererTurbo(this, 505, 369, textureX, textureY); // Box 427
		bodyModel[424] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 428
		bodyModel[425] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 430
		bodyModel[426] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 432
		bodyModel[427] = new ModelRendererTurbo(this, 753, 153, textureX, textureY); // Box 435
		bodyModel[428] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 436
		bodyModel[429] = new ModelRendererTurbo(this, 569, 297, textureX, textureY); // Box 437
		bodyModel[430] = new ModelRendererTurbo(this, 609, 297, textureX, textureY); // Box 438
		bodyModel[431] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Box 439
		bodyModel[432] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Box 440
		bodyModel[433] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 441
		bodyModel[434] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Box 442
		bodyModel[435] = new ModelRendererTurbo(this, 849, 313, textureX, textureY); // Box 443
		bodyModel[436] = new ModelRendererTurbo(this, 953, 313, textureX, textureY); // Box 444
		bodyModel[437] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 445
		bodyModel[438] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 446
		bodyModel[439] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Box 447
		bodyModel[440] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 448
		bodyModel[441] = new ModelRendererTurbo(this, 849, 329, textureX, textureY); // Box 450
		bodyModel[442] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 451
		bodyModel[443] = new ModelRendererTurbo(this, 553, 337, textureX, textureY); // Box 452
		bodyModel[444] = new ModelRendererTurbo(this, 849, 337, textureX, textureY); // Box 453
		bodyModel[445] = new ModelRendererTurbo(this, 433, 345, textureX, textureY); // Box 454
		bodyModel[446] = new ModelRendererTurbo(this, 553, 345, textureX, textureY); // Box 455
		bodyModel[447] = new ModelRendererTurbo(this, 849, 345, textureX, textureY); // Box 456
		bodyModel[448] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); // Box 457
		bodyModel[449] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 458
		bodyModel[450] = new ModelRendererTurbo(this, 377, 361, textureX, textureY); // Box 459
		bodyModel[451] = new ModelRendererTurbo(this, 537, 369, textureX, textureY); // Box 460
		bodyModel[452] = new ModelRendererTurbo(this, 801, 369, textureX, textureY); // Box 461
		bodyModel[453] = new ModelRendererTurbo(this, 825, 369, textureX, textureY); // Box 462
		bodyModel[454] = new ModelRendererTurbo(this, 969, 369, textureX, textureY); // Box 463
		bodyModel[455] = new ModelRendererTurbo(this, 993, 369, textureX, textureY); // Box 464
		bodyModel[456] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 465
		bodyModel[457] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 466
		bodyModel[458] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Box 467
		bodyModel[459] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 468
		bodyModel[460] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 469
		bodyModel[461] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Box 470
		bodyModel[462] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 471
		bodyModel[463] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Box 472
		bodyModel[464] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Box 473
		bodyModel[465] = new ModelRendererTurbo(this, 801, 377, textureX, textureY); // Box 474
		bodyModel[466] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 466
		bodyModel[467] = new ModelRendererTurbo(this, 969, 377, textureX, textureY); // Box 467
		bodyModel[468] = new ModelRendererTurbo(this, 441, 713, textureX, textureY); // Box 468
		bodyModel[469] = new ModelRendererTurbo(this, 665, 481, textureX, textureY); // Box 469
		bodyModel[470] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // Box 491
		bodyModel[471] = new ModelRendererTurbo(this, 537, 377, textureX, textureY); // Box 492
		bodyModel[472] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 532
		bodyModel[473] = new ModelRendererTurbo(this, 1001, 377, textureX, textureY); // Box 534
		bodyModel[474] = new ModelRendererTurbo(this, 969, 393, textureX, textureY); // Box 535
		bodyModel[475] = new ModelRendererTurbo(this, 153, 417, textureX, textureY); // Box 536
		bodyModel[476] = new ModelRendererTurbo(this, 593, 433, textureX, textureY); // Box 537
		bodyModel[477] = new ModelRendererTurbo(this, 737, 433, textureX, textureY); // Box 538
		bodyModel[478] = new ModelRendererTurbo(this, 761, 433, textureX, textureY); // Box 539
		bodyModel[479] = new ModelRendererTurbo(this, 913, 433, textureX, textureY); // Box 540
		bodyModel[480] = new ModelRendererTurbo(this, 993, 433, textureX, textureY); // Box 541
		bodyModel[481] = new ModelRendererTurbo(this, 217, 441, textureX, textureY); // Box 542
		bodyModel[482] = new ModelRendererTurbo(this, 345, 441, textureX, textureY); // Box 543
		bodyModel[483] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 544
		bodyModel[484] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 545
		bodyModel[485] = new ModelRendererTurbo(this, 25, 385, textureX, textureY); // Box 546
		bodyModel[486] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 547
		bodyModel[487] = new ModelRendererTurbo(this, 857, 281, textureX, textureY); // Box 548
		bodyModel[488] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 549
		bodyModel[489] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 550
		bodyModel[490] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 551
		bodyModel[491] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 552
		bodyModel[492] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 553
		bodyModel[493] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 554
		bodyModel[494] = new ModelRendererTurbo(this, 857, 289, textureX, textureY); // Box 555
		bodyModel[495] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Box 556
		bodyModel[496] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Box 557
		bodyModel[497] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 558
		bodyModel[498] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 559
		bodyModel[499] = new ModelRendererTurbo(this, 745, 313, textureX, textureY); // Box 560

		bodyModel[0].addShapeBox(0F, 0F, 0F, 120, 19, 69, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-120F, -12F, -35F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 19, 61, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, -12F, -27F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 19, 67, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(52F, -12F, -34F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 19, 61, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(100F, -12F, -31F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 23, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, -12F, -35F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 29, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(23F, 3F, -35F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 50, 19, 69, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(-222F, -12F, -35F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 32, 19, 67, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F); // Box 7
		bodyModel[7].setRotationPoint(-254F, -12F, -34F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 19, 59, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, -1F, -4F, 6F, 0F, 0F, 6F, 0F, 0F, -3F, -1F, -4F); // Box 8
		bodyModel[8].setRotationPoint(-258F, -12F, -30F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 53, 19, 55, 0F,0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(148F, -12F, -28F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 23, 47, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -4F, -20F, 0F, -4F, -20F, 0F, 0F, -9F); // Box 10
		bodyModel[10].setRotationPoint(201F, -16F, -24F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 34, 23, 43, 0F,0F, 0F, 0F, 0F, 8F, -6F, 0F, 8F, -2F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -18F); // Box 11
		bodyModel[11].setRotationPoint(237F, -20F, -22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 23, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-172F, -12F, -35F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 29, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-149F, 3F, -35F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 19, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		bodyModel[14].setRotationPoint(-172F, -12F, -27F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 120, 14, 69, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 15
		bodyModel[15].setRotationPoint(-120F, 7F, -35F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 52, 14, 69, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F); // Box 16
		bodyModel[16].setRotationPoint(0F, 7F, -35F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 48, 14, 67, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -6F); // Box 17
		bodyModel[17].setRotationPoint(52F, 7F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 14, 61, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F); // Box 18
		bodyModel[18].setRotationPoint(100F, 7F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 53, 14, 55, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -9F); // Box 19
		bodyModel[19].setRotationPoint(148F, 7F, -28F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 14, 29, 0F,0F, 0F, 0F, 0F, 4F, -11F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, -14F, -8F, 0F, -14F, 0F, 0F, -9F); // Box 20
		bodyModel[20].setRotationPoint(201F, 7F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 52, 14, 69, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 21
		bodyModel[21].setRotationPoint(-172F, 7F, -35F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 39, 14, 69, 0F,0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -13F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -13F); // Box 22
		bodyModel[22].setRotationPoint(-211F, 7F, -35F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 14, 67, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -10F, 0F, -13F, 0F, 0F, -12F, 0F, 0F, -12F, -10F, 0F, -13F); // Box 23
		bodyModel[23].setRotationPoint(-222F, 7F, -34F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 26, 14, 67, 0F,0F, 0F, -4F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -4F, 0F, -13F, -13F, 10F, 0F, -13F, 10F, 0F, -13F, 0F, -13F, -13F); // Box 24
		bodyModel[24].setRotationPoint(-248F, 7F, -34F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 59, 0F,0F, 1F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, -4F, 0F, -1F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -9F); // Box 25
		bodyModel[25].setRotationPoint(-255F, 7F, -30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 120, 5, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 26
		bodyModel[26].setRotationPoint(-120F, 21F, -29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 52, 5, 57, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -13F); // Box 27
		bodyModel[27].setRotationPoint(0F, 21F, -29F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 48, 5, 55, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -13F); // Box 28
		bodyModel[28].setRotationPoint(52F, 21F, -28F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 48, 5, 47, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -13F); // Box 29
		bodyModel[29].setRotationPoint(100F, 21F, -24F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 53, 5, 37, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -13F); // Box 30
		bodyModel[30].setRotationPoint(148F, 21F, -19F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 28, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -3F); // Box 31
		bodyModel[31].setRotationPoint(201F, 21F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 22, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-172F, -18F, -34F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 42, 1, 26, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-192F, -19F, -53F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-193F, -19F, -53F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 42, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-192F, -19F, -54F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 26, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-150F, -19F, -53F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-193F, -19F, -54F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-150F, -19F, -54F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 67, 7, 73, 0F,0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 39
		bodyModel[39].setRotationPoint(-259F, -19F, -36F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 7, 65, 0F,-8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 40
		bodyModel[40].setRotationPoint(-269F, -19F, -34F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 15, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 8F, 0F, -0.5F); // Box 41
		bodyModel[41].setRotationPoint(-207F, -18F, -46F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 23, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[42].setRotationPoint(-230F, -16F, -46F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 14, 7, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[43].setRotationPoint(-244F, -13F, -46F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(-193F, -19F, -37F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 66, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(-259F, -19F, -35F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(-261F, -19F, -35F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(-262F, -19F, -35F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 7, 64, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, -7F, 0.5F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(-262F, -19F, -34F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-269F, -19F, 30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 67, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-259F, -19F, 31F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-268F, -19F, 30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 20, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-192F, -18F, -34F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 6, 15, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
		bodyModel[53].setRotationPoint(-255F, -9F, -41F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
		bodyModel[54].setRotationPoint(-207F, -6F, -46F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 23, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[55].setRotationPoint(-230F, -6F, -46F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 56
		bodyModel[56].setRotationPoint(-241F, -6F, -46F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 29, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F); // Box 57
		bodyModel[57].setRotationPoint(23F, 7F, -35F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 244, 7, 64, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-192F, -19F, -27F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 49, 7, 79, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(52F, -19F, -42F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 7, 31, 0F,0F, 0.5F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(101F, -19F, -42F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 41, 7, 21, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[61].setRotationPoint(107F, -19F, -32F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 53, 8, 60, 0F,0F, 0.5F, 0F, 0F, 3F, -3.5F, 0F, 3F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, -3.5F, 0F, -4F, -1.5F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(148F, -20F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 36, 7, 54, 0F,0F, 0F, 0.5F, 0F, 4.5F, -3.5F, 0F, 4.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4F, -3.5F, 0F, -4F, -2F, 0F, 0F, 0.5F); // Box 64
		bodyModel[63].setRotationPoint(201F, -23F, -28F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 29, 7, 48, 0F,0F, -0.5F, 0.5F, 0F, 5F, -3.5F, 0F, 5F, -2.5F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -2.5F, 0F, 1F, 0F); // Box 65
		bodyModel[64].setRotationPoint(237F, -28F, -24F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 7, 41, 0F,0F, -1F, 0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -2F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, -3F, 0F, -3.5F, -3F, 0F, -2F, 0F, 0.5F, 0.5F); // Box 66
		bodyModel[65].setRotationPoint(266F, -34F, -20F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 52, 5, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 67
		bodyModel[66].setRotationPoint(-172F, 21F, -29F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 39, 5, 57, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -7F, -2F, -20F, 0F, 0F, -13F, 0F, 0F, -13F, -7F, -1F, -20F); // Box 68
		bodyModel[67].setRotationPoint(-211F, 21F, -29F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 17, 7, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(-192F, -19F, 37F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 181, 7, 18, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[69].setRotationPoint(-175F, -19F, 37F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 84, 7, 18, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(6F, -19F, 37F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 34, 3, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 72
		bodyModel[71].setRotationPoint(6F, -19F, 55F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 47, 3, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(40F, -19F, 55F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(87F, -19F, 55F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 3, 22, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -18F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(90F, -19F, 37F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 24, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(-199F, -16F, 45F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 165, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(-175F, -16F, 55F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(-10F, -16F, 55F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(-11F, -18F, 62F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 5, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(-11F, -18F, 55F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(25F, -1F, -28F);

		bodyModel[81].addBox(0F, 0F, 0F, 17, 2, 2, 0F); // Box 82
		bodyModel[81].setRotationPoint(29F, 1F, -28F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(46F, -1F, -28F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 84
		bodyModel[83].setRotationPoint(46F, -12F, -28F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[84].setRotationPoint(25F, -12F, -28F);

		bodyModel[85].addBox(0F, 0F, 0F, 29, 2, 2, 0F); // Box 86
		bodyModel[85].setRotationPoint(23F, -12F, -28.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 87
		bodyModel[86].setRotationPoint(23F, -12F, -28F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 88
		bodyModel[87].setRotationPoint(50F, -12F, -28F);

		bodyModel[88].addBox(0F, 0F, 0F, 29, 2, 2, 0F); // Box 89
		bodyModel[88].setRotationPoint(-149F, -12F, -28.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(-147F, -12F, -28F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 91
		bodyModel[90].setRotationPoint(-149F, -12F, -28F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[91].setRotationPoint(-147F, -1F, -28F);

		bodyModel[92].addBox(0F, 0F, 0F, 17, 2, 2, 0F); // Box 93
		bodyModel[92].setRotationPoint(-143F, 1F, -28F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[93].setRotationPoint(-126F, -1F, -28F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Box 95
		bodyModel[94].setRotationPoint(-122F, -12F, -28F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 96
		bodyModel[95].setRotationPoint(-126F, -12F, -28F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 181, 8, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 97
		bodyModel[96].setRotationPoint(-175F, -12F, 30F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 28, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, -3F); // Box 98
		bodyModel[97].setRotationPoint(6F, -12F, 30F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 56, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 99
		bodyModel[98].setRotationPoint(34F, -12F, 30F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 15, 11, 12, 0F,8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(-207F, -18F, 34F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 25, 10, 16, 0F,8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[100].setRotationPoint(-232F, -17F, 30F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 17, 8, 13, 0F,2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(-248F, -15F, 30F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 15, 5, 15, 0F,1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 103
		bodyModel[102].setRotationPoint(-256F, -12F, 26F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 143, 7, 27, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[103].setRotationPoint(-120.5F, -19F, -54F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 63, 4, 27, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-99F, -11.5F, -54F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 28, 4, 27, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[105].setRotationPoint(-25F, -11.5F, -54F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 47, 4, 27, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-25F, -7.5F, -54F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 84, 4, 27, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 107
		bodyModel[107].setRotationPoint(-120F, -7.5F, -54F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 12, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.625F, 0.5F, 0F, -3.625F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 108
		bodyModel[108].setRotationPoint(-36F, -12.5F, -43F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 27, 2, 27, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[109].setRotationPoint(-148.5F, -19F, -54F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F,-2F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -2F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 110
		bodyModel[110].setRotationPoint(-148.5F, -19F, -56F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 27, 2, 27, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[111].setRotationPoint(23.5F, -19F, -54F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F,-2F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -2F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 112
		bodyModel[112].setRotationPoint(23.5F, -19F, -56F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 7, 13, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[113].setRotationPoint(52F, -19F, -55F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[114].setRotationPoint(52F, -11.5F, -41F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 41, 8, 20, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[115].setRotationPoint(62F, -12.5F, -50F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 8, 20, 0F,0F, 0.5F, 0F, 0F, 0.5F, -9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[116].setRotationPoint(103F, -12.5F, -50F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 33, 10, 13, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[117].setRotationPoint(112F, -14.5F, -41F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 10, 15, 0F,0F, 0.5F, 0F, -3F, 0.5F, -3F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[118].setRotationPoint(145F, -14.5F, -41F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 33, 9, 13, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[119].setRotationPoint(112F, -13.5F, 24F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 9, 15, 0F,0F, 0.5F, 0F, 1F, 0.5F, 0F, -3F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, 0F); // Box 120
		bodyModel[120].setRotationPoint(145F, -13.5F, 22F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[121].setRotationPoint(59F, -12.5F, -50F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 122
		bodyModel[122].setRotationPoint(101F, -16.5F, -41F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(55F, -20.5F, -50.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 104, 18, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[124].setRotationPoint(-104.5F, -37F, -51.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 17, 17, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 126
		bodyModel[125].setRotationPoint(-109.5F, -36F, -51.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 17, 11, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 127
		bodyModel[126].setRotationPoint(-111.5F, -36F, -48.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(4.5F, -37F, -48.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 18, 17, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 129
		bodyModel[128].setRotationPoint(-0.5F, -37F, -51.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[129].setRotationPoint(-159.5F, -18F, 55F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[130].setRotationPoint(-145F, -18F, 55F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[131].setRotationPoint(-128F, -18F, 55F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[132].setRotationPoint(-99.5F, -18F, 55F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 23, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[133].setRotationPoint(-55.5F, -18F, 55F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[134].setRotationPoint(-27.5F, -18F, 55F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 1, 25, 0F,0F, -0.5F, -7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 135
		bodyModel[135].setRotationPoint(-117.5F, -37F, -55.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 18, 1, 37, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[136].setRotationPoint(-109.5F, -37F, -61.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 96, 19, 19, 0F,-3F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0.5F, -3F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F); // Box 137
		bodyModel[137].setRotationPoint(-104.5F, -55F, -53.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 37, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[138].setRotationPoint(-85F, -37F, -61.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 1, 37, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[139].setRotationPoint(-66.5F, -37F, -61.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 19, 1, 33, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[140].setRotationPoint(-53.5F, -37F, -59.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 37, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[141].setRotationPoint(-33.5F, -37F, -61.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 26, 1, 33, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[142].setRotationPoint(-24F, -37F, -59.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 31, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[143].setRotationPoint(2F, -37F, -58.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 25, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[144].setRotationPoint(3F, -37F, -55.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 1, 25, 0F,0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 145
		bodyModel[145].setRotationPoint(6F, -37F, -55.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 3, 23, 0F,0F, -0.5F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 146
		bodyModel[146].setRotationPoint(6.5F, -39F, -54.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 23, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[147].setRotationPoint(1.5F, -39F, -54.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 3, 23, 0F,0F, 0F, -0.75F, -0.25F, 0F, -6.75F, -0.25F, 0F, -6.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -6.75F, -0.25F, -0.5F, -6.75F, 0F, -0.5F, -0.75F); // Box 148
		bodyModel[148].setRotationPoint(6.5F, -41F, -54.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 3, 23, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 149
		bodyModel[149].setRotationPoint(1.5F, -41F, -54.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 150
		bodyModel[150].setRotationPoint(1.5F, -44F, -54F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -6.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -6.25F, 0F, 0F, -0.5F, 0F, 0F, -6.5F, 0F, 0F, -0.25F, 0F, 0F, -6.25F); // Box 151
		bodyModel[151].setRotationPoint(6.5F, -44F, -54.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[152].setRotationPoint(12.25F, -44F, -48F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -0.75F, -6.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -6.5F, 0F, -0.75F, -0.5F, 0F, 0F, -6.25F, 0F, 0F, -0.25F, 0F, 0F, -6.5F, 0F, 0F, -0.5F); // Box 153
		bodyModel[153].setRotationPoint(6.5F, -44F, -38.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[154].setRotationPoint(1.5F, -44F, -33F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 59, 9, 6, 0F,-6F, 0F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 155
		bodyModel[155].setRotationPoint(-81.5F, -64F, -53.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 56, 9, 6, 0F,-0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 156
		bodyModel[156].setRotationPoint(-78.5F, -64F, -47F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 59, 9, 6, 0F,-3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -5F, 0F, 0F, -6F, 0F, 0F, -2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 157
		bodyModel[157].setRotationPoint(-81.5F, -64F, -40F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 41, 1, 25, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 158
		bodyModel[158].setRotationPoint(-39.5F, -41F, -55.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[159].setRotationPoint(-24.5F, -58F, -35F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,-0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 160
		bodyModel[160].setRotationPoint(-14F, -58F, -54F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[161].setRotationPoint(-24.5F, -58F, -54.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[162].setRotationPoint(-39.5F, -44F, -32F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 41, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[163].setRotationPoint(-39.5F, -44F, -55.75F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 24, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 164
		bodyModel[164].setRotationPoint(-40.25F, -44F, -55F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 165
		bodyModel[165].setRotationPoint(0.5F, -44F, -54.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 166
		bodyModel[166].setRotationPoint(0.5F, -44F, -32.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 167
		bodyModel[167].setRotationPoint(-98.5F, -16F, -56F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 168
		bodyModel[168].setRotationPoint(-98.5F, -16F, -55F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 169
		bodyModel[169].setRotationPoint(-95F, -16F, -56F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 170
		bodyModel[170].setRotationPoint(-95F, -16F, -55F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 171
		bodyModel[171].setRotationPoint(-95F, -18F, -56F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 172
		bodyModel[172].setRotationPoint(-95F, -18F, -55F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 173
		bodyModel[173].setRotationPoint(-98.5F, -18F, -55F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 174
		bodyModel[174].setRotationPoint(-98.5F, -18F, -56F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 175
		bodyModel[175].setRotationPoint(-88F, -18F, -56F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 176
		bodyModel[176].setRotationPoint(-88F, -18F, -55F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 177
		bodyModel[177].setRotationPoint(-91.5F, -18F, -55F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 178
		bodyModel[178].setRotationPoint(-91.5F, -18F, -56F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 179
		bodyModel[179].setRotationPoint(-91.5F, -16F, -55F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 180
		bodyModel[180].setRotationPoint(-91.5F, -16F, -56F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 181
		bodyModel[181].setRotationPoint(-88F, -16F, -56F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 182
		bodyModel[182].setRotationPoint(-88F, -16F, -55F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 183
		bodyModel[183].setRotationPoint(-81F, -18F, -56F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 184
		bodyModel[184].setRotationPoint(-81F, -18F, -55F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 185
		bodyModel[185].setRotationPoint(-84.5F, -18F, -55F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 186
		bodyModel[186].setRotationPoint(-84.5F, -18F, -56F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 187
		bodyModel[187].setRotationPoint(-84.5F, -16F, -55F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 188
		bodyModel[188].setRotationPoint(-84.5F, -16F, -56F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 189
		bodyModel[189].setRotationPoint(-81F, -16F, -56F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 190
		bodyModel[190].setRotationPoint(-81F, -16F, -55F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 191
		bodyModel[191].setRotationPoint(-74F, -18F, -56F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 192
		bodyModel[192].setRotationPoint(-74F, -18F, -55F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 193
		bodyModel[193].setRotationPoint(-77.5F, -18F, -55F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 194
		bodyModel[194].setRotationPoint(-77.5F, -18F, -56F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 195
		bodyModel[195].setRotationPoint(-77.5F, -16F, -55F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 196
		bodyModel[196].setRotationPoint(-77.5F, -16F, -56F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 197
		bodyModel[197].setRotationPoint(-74F, -16F, -56F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 198
		bodyModel[198].setRotationPoint(-74F, -16F, -55F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 199
		bodyModel[199].setRotationPoint(-67F, -18F, -56F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 200
		bodyModel[200].setRotationPoint(-67F, -18F, -55F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 201
		bodyModel[201].setRotationPoint(-70.5F, -18F, -55F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 202
		bodyModel[202].setRotationPoint(-70.5F, -18F, -56F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 203
		bodyModel[203].setRotationPoint(-70.5F, -16F, -55F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 204
		bodyModel[204].setRotationPoint(-70.5F, -16F, -56F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 205
		bodyModel[205].setRotationPoint(-67F, -16F, -56F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 206
		bodyModel[206].setRotationPoint(-67F, -16F, -55F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 207
		bodyModel[207].setRotationPoint(-60F, -18F, -56F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 208
		bodyModel[208].setRotationPoint(-60F, -18F, -55F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 209
		bodyModel[209].setRotationPoint(-63.5F, -18F, -55F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 210
		bodyModel[210].setRotationPoint(-63.5F, -18F, -56F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 211
		bodyModel[211].setRotationPoint(-63.5F, -16F, -55F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 212
		bodyModel[212].setRotationPoint(-63.5F, -16F, -56F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 213
		bodyModel[213].setRotationPoint(-60F, -16F, -56F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 214
		bodyModel[214].setRotationPoint(-60F, -16F, -55F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 215
		bodyModel[215].setRotationPoint(-53F, -18F, -56F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 216
		bodyModel[216].setRotationPoint(-53F, -18F, -55F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 217
		bodyModel[217].setRotationPoint(-56.5F, -18F, -55F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 218
		bodyModel[218].setRotationPoint(-56.5F, -18F, -56F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 219
		bodyModel[219].setRotationPoint(-56.5F, -16F, -55F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 220
		bodyModel[220].setRotationPoint(-56.5F, -16F, -56F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 221
		bodyModel[221].setRotationPoint(-53F, -16F, -56F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 222
		bodyModel[222].setRotationPoint(-53F, -16F, -55F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 223
		bodyModel[223].setRotationPoint(-33F, -18F, -56F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 224
		bodyModel[224].setRotationPoint(-33F, -18F, -55F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 225
		bodyModel[225].setRotationPoint(-36.5F, -18F, -55F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 226
		bodyModel[226].setRotationPoint(-36.5F, -18F, -56F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 227
		bodyModel[227].setRotationPoint(-36.5F, -16F, -55F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 228
		bodyModel[228].setRotationPoint(-36.5F, -16F, -56F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 229
		bodyModel[229].setRotationPoint(-33F, -16F, -56F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 230
		bodyModel[230].setRotationPoint(-33F, -16F, -55F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 231
		bodyModel[231].setRotationPoint(-26F, -18F, -56F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 232
		bodyModel[232].setRotationPoint(-26F, -18F, -55F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 233
		bodyModel[233].setRotationPoint(-29.5F, -18F, -55F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 234
		bodyModel[234].setRotationPoint(-29.5F, -18F, -56F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 235
		bodyModel[235].setRotationPoint(-29.5F, -16F, -55F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 236
		bodyModel[236].setRotationPoint(-29.5F, -16F, -56F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 237
		bodyModel[237].setRotationPoint(-26F, -16F, -56F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 238
		bodyModel[238].setRotationPoint(-26F, -16F, -55F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 239
		bodyModel[239].setRotationPoint(-19F, -18F, -56F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 240
		bodyModel[240].setRotationPoint(-19F, -18F, -55F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 241
		bodyModel[241].setRotationPoint(-22.5F, -18F, -55F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 242
		bodyModel[242].setRotationPoint(-22.5F, -18F, -56F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 243
		bodyModel[243].setRotationPoint(-22.5F, -16F, -55F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 244
		bodyModel[244].setRotationPoint(-22.5F, -16F, -56F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 245
		bodyModel[245].setRotationPoint(-19F, -16F, -56F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 246
		bodyModel[246].setRotationPoint(-19F, -16F, -55F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[247].setRotationPoint(-46.5F, -46F, -34.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[248].setRotationPoint(-45.5F, -50.5F, -34.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[249].setRotationPoint(-43.5F, -50.5F, -34.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[250].setRotationPoint(-46.5F, -55F, -34.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[251].setRotationPoint(-49.5F, -49F, -56.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[252].setRotationPoint(-53F, -44F, -58.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[253].setRotationPoint(-52.5F, -49F, -58.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[254].setRotationPoint(-52.5F, -53.5F, -58.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[255].setRotationPoint(-49.5F, -53.5F, -56.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[256].setRotationPoint(-53F, -58F, -58.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[257].setRotationPoint(-47F, -64.5F, -58.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 259
		bodyModel[258].setRotationPoint(-47F, -64.5F, -34F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 260
		bodyModel[259].setRotationPoint(-109.5F, -46F, -52.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, -0.5F, -4.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3.5F); // Box 261
		bodyModel[260].setRotationPoint(-113.5F, -46F, -52.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[261].setRotationPoint(-81.5F, -44F, -34.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 33, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 263
		bodyModel[262].setRotationPoint(-54.25F, -39.5F, -59.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[263].setRotationPoint(-53.5F, -39.5F, -27.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 33, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 265
		bodyModel[264].setRotationPoint(-35.5F, -39.5F, -59.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 266
		bodyModel[265].setRotationPoint(-53.5F, -39.5F, -59.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[266].setRotationPoint(-24F, -39.5F, -27.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 33, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 268
		bodyModel[267].setRotationPoint(-24.75F, -39.5F, -59.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[268].setRotationPoint(-24F, -39.5F, -60.25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 271
		bodyModel[269].setRotationPoint(-34.25F, -39.5F, -61.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 272
		bodyModel[270].setRotationPoint(-30.5F, -39.5F, -61.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 273
		bodyModel[271].setRotationPoint(-33.5F, -39.5F, -61.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 274
		bodyModel[272].setRotationPoint(-33.5F, -39.5F, -24.75F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 275
		bodyModel[273].setRotationPoint(-67.25F, -39.5F, -61.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 276
		bodyModel[274].setRotationPoint(-62.5F, -39.5F, -61.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[275].setRotationPoint(-66.5F, -39.5F, -25.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[276].setRotationPoint(-66.5F, -39.5F, -62.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 279
		bodyModel[277].setRotationPoint(-85.75F, -39.5F, -61.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 3, 37, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 280
		bodyModel[278].setRotationPoint(-83F, -39.5F, -61.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[279].setRotationPoint(-85F, -39.5F, -25.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[280].setRotationPoint(-85F, -39.5F, -62.25F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 283
		bodyModel[281].setRotationPoint(-82.25F, -46.5F, -34.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 284
		bodyModel[282].setRotationPoint(-79.5F, -46.5F, -34.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[283].setRotationPoint(-81.5F, -46.5F, -28.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 287
		bodyModel[284].setRotationPoint(-53.75F, -47F, -58.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 288
		bodyModel[285].setRotationPoint(-44F, -47F, -58.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 289
		bodyModel[286].setRotationPoint(-41.5F, -51.5F, -56.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 290
		bodyModel[287].setRotationPoint(-53.25F, -51.5F, -58.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 291
		bodyModel[288].setRotationPoint(-53.25F, -56F, -58.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 292
		bodyModel[289].setRotationPoint(-41.5F, -56F, -56.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 293
		bodyModel[290].setRotationPoint(-47.25F, -57.5F, -34.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 294
		bodyModel[291].setRotationPoint(-38.5F, -57.5F, -34.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 295
		bodyModel[292].setRotationPoint(-36.5F, -52.5F, -34.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 296
		bodyModel[293].setRotationPoint(-46.25F, -52.5F, -34.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 297
		bodyModel[294].setRotationPoint(-47.25F, -48.5F, -34.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 298
		bodyModel[295].setRotationPoint(-38.5F, -48.5F, -34.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 299
		bodyModel[296].setRotationPoint(-53F, -47F, -58.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 300
		bodyModel[297].setRotationPoint(-52.5F, -51.5F, -58.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 301
		bodyModel[298].setRotationPoint(-49.5F, -51.5F, -56.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 302
		bodyModel[299].setRotationPoint(-50.5F, -51.5F, -58.25F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 303
		bodyModel[300].setRotationPoint(-50.5F, -56F, -58.25F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 304
		bodyModel[301].setRotationPoint(-44.5F, -52.5F, -30.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 305
		bodyModel[302].setRotationPoint(-52.5F, -56F, -58.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 306
		bodyModel[303].setRotationPoint(-49.5F, -56F, -56.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[304].setRotationPoint(-46.5F, -48.5F, -29.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[305].setRotationPoint(-45.5F, -52.5F, -29.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[306].setRotationPoint(-43.75F, -52.5F, -31.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[307].setRotationPoint(-46.5F, -57.5F, -29.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[308].setRotationPoint(-59F, -67F, -35F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[309].setRotationPoint(-37F, -67F, -35F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[310].setRotationPoint(-37F, -67F, -54.25F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[311].setRotationPoint(-59F, -67F, -54.25F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-0.25F, -0.75F, -0.75F, -1.5F, -0.75F, -0.75F, 0F, -0.75F, 0.25F, -1.75F, -0.75F, 0.25F, -0.25F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0F, 0F, 0.25F, -1.75F, 0F, 0.25F); // Box 315
		bodyModel[312].setRotationPoint(-28F, -67F, -54.25F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,-1.75F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -1.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -1.75F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 316
		bodyModel[313].setRotationPoint(-28F, -67F, -40.25F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-0.75F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Box 317
		bodyModel[314].setRotationPoint(-27F, -67F, -46.75F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 7, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 318
		bodyModel[315].setRotationPoint(-104.5F, -54F, -44.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 9, 11, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 319
		bodyModel[316].setRotationPoint(-13.5F, -54F, -49F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-3.5F, 0F, 0.5F, -2F, 0F, 0.5F, 0.5F, 0F, 0F, -6F, 0F, 0F, -2.5F, 0F, 0.5F, -2F, 0F, 0.5F, 0.5F, 0F, 0F, -5F, 0F, 0F); // Box 320
		bodyModel[317].setRotationPoint(-80.5F, -70F, -40F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[318].setRotationPoint(-74.5F, -70F, -35F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 322
		bodyModel[319].setRotationPoint(-74.5F, -70F, -53.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-6F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0.5F, -3.5F, 0F, 0.5F, -5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 323
		bodyModel[320].setRotationPoint(-80.5F, -70F, -53.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,-2F, 0F, 0.5F, -3.5F, 0F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, -3.5F, 0F, 0.5F, -5.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 324
		bodyModel[321].setRotationPoint(-59.5F, -71F, -40F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 0F, -5.5F, 0F, 0F, -3.5F, 0F, 0.5F, -2F, 0F, 0.5F, 0.5F, 0F, 0F, -5.5F, 0F, 0F, -3.5F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 325
		bodyModel[322].setRotationPoint(-59.5F, -71F, -53.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 326
		bodyModel[323].setRotationPoint(-77.5F, -70F, -47.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[324].setRotationPoint(-57.5F, -71F, -47.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 6, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[325].setRotationPoint(-44.5F, -71F, -46.75F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 329
		bodyModel[326].setRotationPoint(-45.5F, -73F, -47.75F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[327].setRotationPoint(-45.5F, -83F, -47.75F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[328].setRotationPoint(-43.5F, -86F, -45.75F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[329].setRotationPoint(-44.5F, -87F, -46.75F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[330].setRotationPoint(-42.5F, -93F, -44.75F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 334
		bodyModel[331].setRotationPoint(-42.5F, -96F, -44.75F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[332].setRotationPoint(-41F, -97F, -46.75F);
		bodyModel[332].rotateAngleZ = 0.08726646F;

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[333].setRotationPoint(-43F, -97F, -46.75F);
		bodyModel[333].rotateAngleZ = -0.08726646F;

		bodyModel[334].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[334].setRotationPoint(-45.5F, -83F, -40.75F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[335].setRotationPoint(-45.5F, -83F, -47.75F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[336].setRotationPoint(-38.5F, -83F, -47.75F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 30, 11, 9, 0F,0F, 0.5F, 0F, 3.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 340
		bodyModel[337].setRotationPoint(90F, -16F, 28F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,-0.75F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Box 341
		bodyModel[338].setRotationPoint(-102.25F, -58F, -53.25F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[339].setRotationPoint(-101.5F, -58F, -35F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[340].setRotationPoint(-101.5F, -58F, -54.25F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[341].setRotationPoint(-32.5F, -72F, -45.75F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[342].setRotationPoint(-32.5F, -74F, -45.75F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[343].setRotationPoint(-55F, -70F, -46.75F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 347
		bodyModel[344].setRotationPoint(-55F, -68F, -46.75F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 348
		bodyModel[345].setRotationPoint(-55F, -66F, -46.75F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[346].setRotationPoint(-21F, -60.5F, -45.75F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 350
		bodyModel[347].setRotationPoint(-21F, -58.5F, -45.75F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 351
		bodyModel[348].setRotationPoint(-21F, -56.5F, -45.75F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[349].setRotationPoint(-43F, -67.5F, -32.75F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 353
		bodyModel[350].setRotationPoint(-43F, -66.5F, -32.75F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 354
		bodyModel[351].setRotationPoint(-43F, -65.5F, -32.75F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 355
		bodyModel[352].setRotationPoint(-43F, -65.5F, -57.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[353].setRotationPoint(-43F, -67.5F, -57.75F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 357
		bodyModel[354].setRotationPoint(-43F, -66.5F, -57.75F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[355].setRotationPoint(-109.5F, -39.5F, -62.25F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 359
		bodyModel[356].setRotationPoint(-92.5F, -39.5F, -61.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 360
		bodyModel[357].setRotationPoint(-110.25F, -39.5F, -61.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[358].setRotationPoint(-109.5F, -39.5F, -25.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 362
		bodyModel[359].setRotationPoint(-92.5F, -39.5F, -34.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 363
		bodyModel[360].setRotationPoint(-110.25F, -39.5F, -30.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 364
		bodyModel[361].setRotationPoint(-118.25F, -39.5F, -48.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F,-8.75F, -0.75F, 0F, 0F, -0.75F, 0F, -8F, -0.75F, 0F, -0.75F, -0.75F, 0F, -8.75F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -0.75F, 0F, 0F); // Box 365
		bodyModel[362].setRotationPoint(-118.25F, -39.5F, -55.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F,-0.75F, -0.75F, 0F, -8F, -0.75F, 0F, 0F, -0.75F, 0F, -8.75F, -0.75F, 0F, -0.75F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8.75F, 0F, 0F); // Box 366
		bodyModel[363].setRotationPoint(-118.25F, -39.5F, -37.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 367
		bodyModel[364].setRotationPoint(-114.25F, -48.5F, -48F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[365].setRotationPoint(-109.5F, -48.5F, -35F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[366].setRotationPoint(-109.5F, -48.5F, -53.25F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,-4F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, -3.75F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -4F, 0F, -0.75F, 0.25F, 0F, -0.75F, -3.75F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 370
		bodyModel[367].setRotationPoint(-113.5F, -48.5F, -53.25F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, -0.75F, -0.25F, -3.75F, -0.75F, -0.25F, 0.25F, -0.75F, -0.75F, -4F, -0.75F, -0.75F, 0F, 0F, -0.25F, -3.75F, 0F, -0.25F, 0.25F, 0F, -0.75F, -4F, 0F, -0.75F); // Box 371
		bodyModel[368].setRotationPoint(-113.5F, -48.5F, -38.25F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[369].setRotationPoint(-99F, -61F, -42.75F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 373
		bodyModel[370].setRotationPoint(-99F, -59F, -42.75F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 374
		bodyModel[371].setRotationPoint(-99F, -57F, -42.75F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[372].setRotationPoint(-88F, -64.5F, -39.25F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 376
		bodyModel[373].setRotationPoint(-88F, -62.5F, -39.25F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 377
		bodyModel[374].setRotationPoint(-88F, -61.5F, -39.25F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[375].setRotationPoint(-88F, -63.5F, -39.25F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 379
		bodyModel[376].setRotationPoint(-97.25F, -76F, -35.75F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 380
		bodyModel[377].setRotationPoint(11.5F, -61.5F, -44.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 381
		bodyModel[378].setRotationPoint(4F, -73F, -54F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 382
		bodyModel[379].setRotationPoint(-3.5F, -53F, -54.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F); // Box 383
		bodyModel[380].setRotationPoint(-3.5F, -48.5F, -33.25F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F); // Box 384
		bodyModel[381].setRotationPoint(-8.25F, -50.5F, -33.25F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F); // Box 385
		bodyModel[382].setRotationPoint(4F, -48.5F, -33.75F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 386
		bodyModel[383].setRotationPoint(53.5F, -49F, -47.25F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 387
		bodyModel[384].setRotationPoint(53.5F, -49F, -53.25F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 388
		bodyModel[385].setRotationPoint(56.5F, -49F, -53.25F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 31, 1, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 389
		bodyModel[386].setRotationPoint(56.5F, -49F, -47.25F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 390
		bodyModel[387].setRotationPoint(53F, -20.5F, -52.75F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 391
		bodyModel[388].setRotationPoint(56F, -20.5F, -52.75F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 392
		bodyModel[389].setRotationPoint(56F, -20.5F, -46.75F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 393
		bodyModel[390].setRotationPoint(53F, -20.5F, -46.75F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 328, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[391].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[391].rotateAngleY = 0.13089969F;

		bodyModel[392].addShapeBox(0F, 0F, 53F, 275, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[392].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[392].rotateAngleY = 0.09162979F;

		bodyModel[393].addShapeBox(0F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[393].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[393].rotateAngleY = 0.1134464F;

		bodyModel[394].addShapeBox(19F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[394].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[394].rotateAngleY = 0.1134464F;

		bodyModel[395].addShapeBox(38F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[395].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[395].rotateAngleY = 0.1134464F;

		bodyModel[396].addShapeBox(95F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[396].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[396].rotateAngleY = 0.1134464F;

		bodyModel[397].addShapeBox(76F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[397].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[397].rotateAngleY = 0.1134464F;

		bodyModel[398].addShapeBox(57F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[398].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[398].rotateAngleY = 0.1134464F;

		bodyModel[399].addShapeBox(209F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[399].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[399].rotateAngleY = 0.1134464F;

		bodyModel[400].addShapeBox(190F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[400].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[400].rotateAngleY = 0.1134464F;

		bodyModel[401].addShapeBox(171F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[401].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[401].rotateAngleY = 0.1134464F;

		bodyModel[402].addShapeBox(133F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[402].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[402].rotateAngleY = 0.1134464F;

		bodyModel[403].addShapeBox(152F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[403].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[403].rotateAngleY = 0.1134464F;

		bodyModel[404].addShapeBox(114F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[404].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[404].rotateAngleY = 0.1134464F;

		bodyModel[405].addShapeBox(323F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[405].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[405].rotateAngleY = 0.1134464F;

		bodyModel[406].addShapeBox(304F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[406].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[406].rotateAngleY = 0.1134464F;

		bodyModel[407].addShapeBox(285F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[407].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[407].rotateAngleY = 0.1134464F;

		bodyModel[408].addShapeBox(247F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[408].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[408].rotateAngleY = 0.1134464F;

		bodyModel[409].addShapeBox(266F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[409].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[409].rotateAngleY = 0.1134464F;

		bodyModel[410].addShapeBox(228F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[410].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[410].rotateAngleY = 0.1134464F;

		bodyModel[411].addShapeBox(342F, 0F, 28F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[411].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[411].rotateAngleY = 0.1134464F;

		bodyModel[412].addShapeBox(36F, 0F, -14.91F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[412].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[412].rotateAngleY = 0.13089969F;

		bodyModel[413].addShapeBox(55F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[413].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[413].rotateAngleY = 0.13089969F;

		bodyModel[414].addShapeBox(93F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[414].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[414].rotateAngleY = 0.13089969F;

		bodyModel[415].addShapeBox(74F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[415].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[415].rotateAngleY = 0.13089969F;

		bodyModel[416].addShapeBox(169F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[416].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[416].rotateAngleY = 0.13089969F;

		bodyModel[417].addShapeBox(150F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[417].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[417].rotateAngleY = 0.13089969F;

		bodyModel[418].addShapeBox(131F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[418].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[418].rotateAngleY = 0.13089969F;

		bodyModel[419].addShapeBox(112F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[419].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[419].rotateAngleY = 0.13089969F;

		bodyModel[420].addShapeBox(245F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[420].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[420].rotateAngleY = 0.13089969F;

		bodyModel[421].addShapeBox(226F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[421].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[421].rotateAngleY = 0.13089969F;

		bodyModel[422].addShapeBox(207F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[422].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[422].rotateAngleY = 0.13089969F;

		bodyModel[423].addShapeBox(188F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[423].setRotationPoint(-261F, -19.15F, -26F);
		bodyModel[423].rotateAngleY = 0.13089969F;

		bodyModel[424].addShapeBox(-1F, 1.25F, 0F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[424].setRotationPoint(261F, -33F, 0F);
		bodyModel[424].rotateAngleZ = 0.19198622F;

		bodyModel[425].addShapeBox(-75F, 4.85F, -22.5F, 33, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[425].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[425].rotateAngleY = 0.14835299F;

		bodyModel[426].addShapeBox(-35F, 4.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[426].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[426].rotateAngleY = 0.14835299F;
		bodyModel[426].rotateAngleZ = 0.01745329F;

		bodyModel[427].addShapeBox(-25F, 4.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[427].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[427].rotateAngleY = 0.14835299F;
		bodyModel[427].rotateAngleZ = 0.01745329F;

		bodyModel[428].addShapeBox(-15F, 4.05F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[428].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[428].rotateAngleY = 0.14835299F;
		bodyModel[428].rotateAngleZ = 0.01745329F;

		bodyModel[429].addShapeBox(-5F, 4F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[429].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[429].rotateAngleY = 0.14835299F;
		bodyModel[429].rotateAngleZ = 0.01745329F;

		bodyModel[430].addShapeBox(5F, 4F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[430].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[430].rotateAngleY = 0.14835299F;
		bodyModel[430].rotateAngleZ = 0.05235988F;

		bodyModel[431].addShapeBox(15F, 4.1F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[431].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[431].rotateAngleY = 0.14835299F;
		bodyModel[431].rotateAngleZ = 0.05235988F;

		bodyModel[432].addShapeBox(25F, 4.1F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[432].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[432].rotateAngleY = 0.14835299F;
		bodyModel[432].rotateAngleZ = 0.05235988F;

		bodyModel[433].addShapeBox(35F, 4.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[433].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[433].rotateAngleY = 0.14835299F;
		bodyModel[433].rotateAngleZ = 0.05235988F;

		bodyModel[434].addShapeBox(45F, 4.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[434].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[434].rotateAngleY = 0.14835299F;
		bodyModel[434].rotateAngleZ = 0.05235988F;

		bodyModel[435].addShapeBox(55F, 5.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[435].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[435].rotateAngleY = 0.14835299F;
		bodyModel[435].rotateAngleZ = 0.06981317F;

		bodyModel[436].addShapeBox(65F, 8.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[436].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[436].rotateAngleY = 0.14835299F;
		bodyModel[436].rotateAngleZ = 0.12217305F;

		bodyModel[437].addShapeBox(75F, 8.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[437].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[437].rotateAngleY = 0.14835299F;
		bodyModel[437].rotateAngleZ = 0.12217305F;

		bodyModel[438].addShapeBox(85F, 8.15F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[438].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[438].rotateAngleY = 0.14835299F;
		bodyModel[438].rotateAngleZ = 0.12217305F;

		bodyModel[439].addShapeBox(95F, 11.3F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[439].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[439].rotateAngleY = 0.14835299F;
		bodyModel[439].rotateAngleZ = 0.15707963F;

		bodyModel[440].addShapeBox(105F, 14.8F, -22.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[440].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[440].rotateAngleY = 0.14835299F;
		bodyModel[440].rotateAngleZ = 0.19198622F;

		bodyModel[441].addShapeBox(105F, 14.8F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[441].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[441].rotateAngleY = -0.14835299F;
		bodyModel[441].rotateAngleZ = 0.19198622F;

		bodyModel[442].addShapeBox(95F, 11.3F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[442].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[442].rotateAngleY = -0.14835299F;
		bodyModel[442].rotateAngleZ = 0.15707963F;

		bodyModel[443].addShapeBox(85F, 8.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[443].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[443].rotateAngleY = -0.14835299F;
		bodyModel[443].rotateAngleZ = 0.12217305F;

		bodyModel[444].addShapeBox(75F, 8.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[444].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[444].rotateAngleY = -0.14835299F;
		bodyModel[444].rotateAngleZ = 0.12217305F;

		bodyModel[445].addShapeBox(65F, 8.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[445].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[445].rotateAngleY = -0.14835299F;
		bodyModel[445].rotateAngleZ = 0.12217305F;

		bodyModel[446].addShapeBox(55F, 5.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[446].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[446].rotateAngleY = -0.14835299F;
		bodyModel[446].rotateAngleZ = 0.06981317F;

		bodyModel[447].addShapeBox(45F, 4.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[447].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[447].rotateAngleY = -0.14835299F;
		bodyModel[447].rotateAngleZ = 0.05235988F;

		bodyModel[448].addShapeBox(25F, 4.1F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[448].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[448].rotateAngleY = -0.14835299F;
		bodyModel[448].rotateAngleZ = 0.05235988F;

		bodyModel[449].addShapeBox(35F, 4.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[449].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[449].rotateAngleY = -0.14835299F;
		bodyModel[449].rotateAngleZ = 0.05235988F;

		bodyModel[450].addShapeBox(5F, 4F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[450].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[450].rotateAngleY = -0.14835299F;
		bodyModel[450].rotateAngleZ = 0.05235988F;

		bodyModel[451].addShapeBox(15F, 4.1F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[451].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[451].rotateAngleY = -0.14835299F;
		bodyModel[451].rotateAngleZ = 0.05235988F;

		bodyModel[452].addShapeBox(-35F, 4.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[452].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[452].rotateAngleY = -0.14835299F;
		bodyModel[452].rotateAngleZ = 0.01745329F;

		bodyModel[453].addShapeBox(-25F, 4.15F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[453].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[453].rotateAngleY = -0.14835299F;
		bodyModel[453].rotateAngleZ = 0.01745329F;

		bodyModel[454].addShapeBox(-15F, 4.05F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[454].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[454].rotateAngleY = -0.14835299F;
		bodyModel[454].rotateAngleZ = 0.01745329F;

		bodyModel[455].addShapeBox(-5F, 4F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[455].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[455].rotateAngleY = -0.14835299F;
		bodyModel[455].rotateAngleZ = 0.01745329F;

		bodyModel[456].addShapeBox(-45F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[456].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[456].rotateAngleY = -0.14835299F;

		bodyModel[457].addShapeBox(-55F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[457].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[457].rotateAngleY = -0.14835299F;

		bodyModel[458].addShapeBox(-65F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[458].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[458].rotateAngleY = -0.14835299F;

		bodyModel[459].addShapeBox(-75F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[459].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[459].rotateAngleY = -0.14835299F;

		bodyModel[460].addShapeBox(-85F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[460].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[460].rotateAngleY = -0.14835299F;

		bodyModel[461].addShapeBox(-95F, 4.85F, 18.5F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[461].setRotationPoint(142F, -24F, 1.5F);
		bodyModel[461].rotateAngleY = -0.14835299F;

		bodyModel[462].addShapeBox(0F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		bodyModel[462].setRotationPoint(8F, -19.15F, 7F);
		bodyModel[462].rotateAngleY = -0.37524579F;

		bodyModel[463].addShapeBox(19F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[463].setRotationPoint(8F, -19.15F, 7F);
		bodyModel[463].rotateAngleY = -0.37524579F;

		bodyModel[464].addShapeBox(38F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		bodyModel[464].setRotationPoint(8F, -19.15F, 7F);
		bodyModel[464].rotateAngleY = -0.37524579F;

		bodyModel[465].addShapeBox(57F, 0F, -15F, 12, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		bodyModel[465].setRotationPoint(8F, -19.15F, 7F);
		bodyModel[465].rotateAngleY = -0.37524579F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 466
		bodyModel[466].setRotationPoint(-94F, -55F, -57.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 467
		bodyModel[467].setRotationPoint(-27F, -55F, -34F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 41, 7, 21, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		bodyModel[468].setRotationPoint(107F, -19F, 7F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 41, 7, 4, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[469].setRotationPoint(107F, -19F, -4F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 6, 7, 21, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[470].setRotationPoint(101F, -19F, 7F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 492
		bodyModel[471].setRotationPoint(103F, -19F, -4F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 7, 18, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[472].setRotationPoint(101F, -19F, -11F);

		bodyModel[473].addShapeBox(3.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[473].setRotationPoint(107F, -19.5F, -11F);
		bodyModel[473].rotateAngleZ = 0.02356194F;

		bodyModel[474].addShapeBox(11F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[474].setRotationPoint(107F, -19.5F, -11F);
		bodyModel[474].rotateAngleZ = 0.02356194F;

		bodyModel[475].addShapeBox(18.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[475].setRotationPoint(107F, -19.5F, -11F);
		bodyModel[475].rotateAngleZ = 0.02356194F;

		bodyModel[476].addShapeBox(26F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[476].setRotationPoint(107F, -19.5F, -11F);
		bodyModel[476].rotateAngleZ = 0.02356194F;

		bodyModel[477].addShapeBox(33.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[477].setRotationPoint(107F, -19.5F, -11F);
		bodyModel[477].rotateAngleZ = 0.02356194F;

		bodyModel[478].addShapeBox(33.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[478].setRotationPoint(107F, -19.5F, 0F);
		bodyModel[478].rotateAngleZ = 0.02356194F;

		bodyModel[479].addShapeBox(26F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[479].setRotationPoint(107F, -19.5F, 0F);
		bodyModel[479].rotateAngleZ = 0.02356194F;

		bodyModel[480].addShapeBox(18.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[480].setRotationPoint(107F, -19.5F, 0F);
		bodyModel[480].rotateAngleZ = 0.02356194F;

		bodyModel[481].addShapeBox(11F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[481].setRotationPoint(107F, -19.5F, 0F);
		bodyModel[481].rotateAngleZ = 0.02356194F;

		bodyModel[482].addShapeBox(3.5F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 543
		bodyModel[482].setRotationPoint(107F, -19.5F, 0F);
		bodyModel[482].rotateAngleZ = 0.02356194F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 544
		bodyModel[483].setRotationPoint(-11.5F, -21.5F, 59F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 545
		bodyModel[484].setRotationPoint(-7.5F, -21.5F, 59F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 546
		bodyModel[485].setRotationPoint(-11F, -18.75F, 59F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F); // Box 547
		bodyModel[486].setRotationPoint(-11F, -18.75F, 62F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 548
		bodyModel[487].setRotationPoint(-9.5F, -21.5F, 59F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 549
		bodyModel[488].setRotationPoint(-9.5F, -22F, 62F);
		bodyModel[488].rotateAngleX = 0.26179939F;

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[489].setRotationPoint(-9.5F, -21F, 60F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[490].setRotationPoint(-38.5F, -20.5F, 60F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 552
		bodyModel[491].setRotationPoint(-40.5F, -21F, 59F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 553
		bodyModel[492].setRotationPoint(-38.5F, -21F, 59F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 554
		bodyModel[493].setRotationPoint(-38.5F, -21.5F, 62F);
		bodyModel[493].rotateAngleX = 0.26179939F;

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 555
		bodyModel[494].setRotationPoint(-36.5F, -21F, 59F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 556
		bodyModel[495].setRotationPoint(-40F, -18.25F, 59F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F); // Box 557
		bodyModel[496].setRotationPoint(-40F, -18.25F, 62F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[497].setRotationPoint(-219F, -19.5F, 39.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 559
		bodyModel[498].setRotationPoint(-221F, -20F, 38.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 560
		bodyModel[499].setRotationPoint(-219F, -20F, 38.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 561
		bodyModel[501] = new ModelRendererTurbo(this, 825, 313, textureX, textureY); // Box 562
		bodyModel[502] = new ModelRendererTurbo(this, 225, 393, textureX, textureY); // Box 563
		bodyModel[503] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 564
		bodyModel[504] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 565
		bodyModel[505] = new ModelRendererTurbo(this, 1009, 321, textureX, textureY); // Box 566
		bodyModel[506] = new ModelRendererTurbo(this, 57, 345, textureX, textureY); // Box 567
		bodyModel[507] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Box 568
		bodyModel[508] = new ModelRendererTurbo(this, 297, 353, textureX, textureY); // Box 569
		bodyModel[509] = new ModelRendererTurbo(this, 537, 393, textureX, textureY); // Box 570
		bodyModel[510] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 571
		bodyModel[511] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 572
		bodyModel[512] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 573
		bodyModel[513] = new ModelRendererTurbo(this, 177, 385, textureX, textureY); // Box 574
		bodyModel[514] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Box 575
		bodyModel[515] = new ModelRendererTurbo(this, 201, 385, textureX, textureY); // Box 576
		bodyModel[516] = new ModelRendererTurbo(this, 537, 401, textureX, textureY); // Box 577
		bodyModel[517] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 578
		bodyModel[518] = new ModelRendererTurbo(this, 393, 393, textureX, textureY); // Box 579
		bodyModel[519] = new ModelRendererTurbo(this, 1009, 393, textureX, textureY); // Box 580
		bodyModel[520] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 581
		bodyModel[521] = new ModelRendererTurbo(this, 177, 401, textureX, textureY); // Box 582
		bodyModel[522] = new ModelRendererTurbo(this, 17, 305, textureX, textureY); // Box 585
		bodyModel[523] = new ModelRendererTurbo(this, 233, 401, textureX, textureY); // Box 586
		bodyModel[524] = new ModelRendererTurbo(this, 321, 401, textureX, textureY); // Box 587
		bodyModel[525] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 588
		bodyModel[526] = new ModelRendererTurbo(this, 1009, 401, textureX, textureY); // Box 589
		bodyModel[527] = new ModelRendererTurbo(this, 745, 321, textureX, textureY); // Box 590
		bodyModel[528] = new ModelRendererTurbo(this, 201, 409, textureX, textureY); // Box 591
		bodyModel[529] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 592
		bodyModel[530] = new ModelRendererTurbo(this, 825, 321, textureX, textureY); // Box 593
		bodyModel[531] = new ModelRendererTurbo(this, 617, 417, textureX, textureY); // Box 594
		bodyModel[532] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 595
		bodyModel[533] = new ModelRendererTurbo(this, 761, 417, textureX, textureY); // Box 596
		bodyModel[534] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 597
		bodyModel[535] = new ModelRendererTurbo(this, 793, 417, textureX, textureY); // Box 598
		bodyModel[536] = new ModelRendererTurbo(this, 225, 409, textureX, textureY); // Box 599
		bodyModel[537] = new ModelRendererTurbo(this, 833, 345, textureX, textureY); // Box 600
		bodyModel[538] = new ModelRendererTurbo(this, 825, 417, textureX, textureY); // Box 601
		bodyModel[539] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 602
		bodyModel[540] = new ModelRendererTurbo(this, 841, 417, textureX, textureY); // Box 603
		bodyModel[541] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 604
		bodyModel[542] = new ModelRendererTurbo(this, 417, 425, textureX, textureY); // Box 605
		bodyModel[543] = new ModelRendererTurbo(this, 969, 409, textureX, textureY); // Box 606
		bodyModel[544] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 607
		bodyModel[545] = new ModelRendererTurbo(this, 465, 425, textureX, textureY); // Box 608
		bodyModel[546] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 609
		bodyModel[547] = new ModelRendererTurbo(this, 481, 425, textureX, textureY); // Box 610
		bodyModel[548] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 611
		bodyModel[549] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 612
		bodyModel[550] = new ModelRendererTurbo(this, 153, 433, textureX, textureY); // Box 613
		bodyModel[551] = new ModelRendererTurbo(this, 545, 361, textureX, textureY); // Box 614
		bodyModel[552] = new ModelRendererTurbo(this, 17, 433, textureX, textureY); // Box 615
		bodyModel[553] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 616
		bodyModel[554] = new ModelRendererTurbo(this, 609, 433, textureX, textureY); // Box 617
		bodyModel[555] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 618
		bodyModel[556] = new ModelRendererTurbo(this, 753, 433, textureX, textureY); // Box 619
		bodyModel[557] = new ModelRendererTurbo(this, 929, 433, textureX, textureY); // Box 620

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 561
		bodyModel[500].setRotationPoint(-219F, -20.5F, 41.5F);
		bodyModel[500].rotateAngleX = 0.26179939F;

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 562
		bodyModel[501].setRotationPoint(-217F, -20F, 38.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 563
		bodyModel[502].setRotationPoint(-220.5F, -17.25F, 38.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F); // Box 564
		bodyModel[503].setRotationPoint(-220.5F, -17.25F, 41.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[504].setRotationPoint(-229.5F, -19.5F, 39.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 566
		bodyModel[505].setRotationPoint(-231.5F, -20F, 38.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 567
		bodyModel[506].setRotationPoint(-229.5F, -20F, 38.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 568
		bodyModel[507].setRotationPoint(-229.5F, -20.5F, 41.5F);
		bodyModel[507].rotateAngleX = 0.26179939F;

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 569
		bodyModel[508].setRotationPoint(-227.5F, -20F, 38.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 570
		bodyModel[509].setRotationPoint(-231F, -17.25F, 38.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F); // Box 571
		bodyModel[510].setRotationPoint(-231F, -17.25F, 41.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[511].setRotationPoint(-244F, -17.5F, 37.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 573
		bodyModel[512].setRotationPoint(-246F, -18F, 36.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 574
		bodyModel[513].setRotationPoint(-244F, -18F, 36.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 575
		bodyModel[514].setRotationPoint(-244F, -18.5F, 39.5F);
		bodyModel[514].rotateAngleX = 0.26179939F;

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 576
		bodyModel[515].setRotationPoint(-242F, -18F, 36.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 577
		bodyModel[516].setRotationPoint(-245.5F, -15.25F, 36.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F); // Box 578
		bodyModel[517].setRotationPoint(-245.5F, -15.25F, 39.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 579
		bodyModel[518].setRotationPoint(131.5F, -16.5F, 32F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F); // Box 580
		bodyModel[519].setRotationPoint(133.5F, -16.5F, 32F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[520].setRotationPoint(133.5F, -16F, 33F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 582
		bodyModel[521].setRotationPoint(135.5F, -16.5F, 32F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F); // Box 585
		bodyModel[522].setRotationPoint(133.5F, -17F, 35F);
		bodyModel[522].rotateAngleX = 0.26179939F;

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 586
		bodyModel[523].setRotationPoint(73F, -16F, -47F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 587
		bodyModel[524].setRotationPoint(75F, -16F, -47F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[525].setRotationPoint(75F, -15.5F, -46F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[526].setRotationPoint(77F, -16F, -47F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 590
		bodyModel[527].setRotationPoint(75F, -17F, -49F);
		bodyModel[527].rotateAngleX = -0.26179939F;

		bodyModel[528].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 591
		bodyModel[528].setRotationPoint(73.5F, -13.25F, -47F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 592
		bodyModel[529].setRotationPoint(73.5F, -13.25F, -48F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 593
		bodyModel[530].setRotationPoint(83.5F, -17F, -49F);
		bodyModel[530].rotateAngleX = -0.26179939F;

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[531].setRotationPoint(85.5F, -16F, -47F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[532].setRotationPoint(83.5F, -15.5F, -46F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 596
		bodyModel[533].setRotationPoint(83.5F, -16F, -47F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 597
		bodyModel[534].setRotationPoint(82F, -13.25F, -48F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 598
		bodyModel[535].setRotationPoint(81.5F, -16F, -47F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 599
		bodyModel[536].setRotationPoint(82F, -13.25F, -47F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 600
		bodyModel[537].setRotationPoint(131F, -19F, -39F);
		bodyModel[537].rotateAngleX = -0.26179939F;

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[538].setRotationPoint(133F, -18F, -37F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[539].setRotationPoint(131F, -17.5F, -36F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 603
		bodyModel[540].setRotationPoint(131F, -18F, -37F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 604
		bodyModel[541].setRotationPoint(129.5F, -15.25F, -38F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 605
		bodyModel[542].setRotationPoint(129F, -18F, -37F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 606
		bodyModel[543].setRotationPoint(129.5F, -15.25F, -37F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 607
		bodyModel[544].setRotationPoint(-225F, -20F, -44.5F);
		bodyModel[544].rotateAngleX = -0.26179939F;

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[545].setRotationPoint(-223F, -19F, -42.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[546].setRotationPoint(-225F, -18.5F, -41.5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 610
		bodyModel[547].setRotationPoint(-225F, -19F, -42.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 611
		bodyModel[548].setRotationPoint(-226.5F, -16.25F, -43.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 612
		bodyModel[549].setRotationPoint(-227F, -19F, -42.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 613
		bodyModel[550].setRotationPoint(-226.5F, -16.25F, -42.5F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 614
		bodyModel[551].setRotationPoint(-237.5F, -17F, -44.5F);
		bodyModel[551].rotateAngleX = -0.26179939F;

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[552].setRotationPoint(-235.5F, -16F, -42.5F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[553].setRotationPoint(-237.5F, -15.5F, -41.5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 617
		bodyModel[554].setRotationPoint(-237.5F, -16F, -42.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0.5F, -2.5F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 618
		bodyModel[555].setRotationPoint(-239F, -13.25F, -43.5F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -1.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 619
		bodyModel[556].setRotationPoint(-239.5F, -16F, -42.5F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 620
		bodyModel[557].setRotationPoint(-239F, -13.25F, -42.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 825, 377, textureX, textureY); // Box 470
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 478
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 153, 385, textureX, textureY); // Box 482
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 483
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 505, 385, textureX, textureY); // Box 487
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 801, 385, textureX, textureY); // Box 493
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 25, 393, textureX, textureY); // Box 494
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Box 497
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 369, 393, textureX, textureY); // Box 501
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 825, 393, textureX, textureY); // Box 505
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 509
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 153, 401, textureX, textureY); // Box 516
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Box 518
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 801, 401, textureX, textureY); // Box 521
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 25, 409, textureX, textureY); // Box 522
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 523
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 593, 417, textureX, textureY); // Box 524
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 737, 417, textureX, textureY); // Box 525
		bodyDoorOpenModel[18] = new ModelRendererTurbo(this, 769, 417, textureX, textureY); // Box 526
		bodyDoorOpenModel[19] = new ModelRendererTurbo(this, 801, 417, textureX, textureY); // Box 527
		bodyDoorOpenModel[20] = new ModelRendererTurbo(this, 25, 425, textureX, textureY); // Box 528
		bodyDoorOpenModel[21] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Box 529
		bodyDoorOpenModel[22] = new ModelRendererTurbo(this, 441, 425, textureX, textureY); // Box 530
		bodyDoorOpenModel[23] = new ModelRendererTurbo(this, 465, 433, textureX, textureY); // Box 531

		bodyDoorOpenModel[0].addShapeBox(4F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 470
		bodyDoorOpenModel[0].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[0].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[0].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[1].addShapeBox(11.5F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 478
		bodyDoorOpenModel[1].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[1].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[1].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[2].addShapeBox(26.5F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 482
		bodyDoorOpenModel[2].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[2].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[2].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[3].addShapeBox(19F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 483
		bodyDoorOpenModel[3].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[3].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[3].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[4].addShapeBox(34F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 487
		bodyDoorOpenModel[4].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[4].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[4].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[5].addShapeBox(-3.5F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 493
		bodyDoorOpenModel[5].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[5].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[5].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[6].addShapeBox(-3.75F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 494
		bodyDoorOpenModel[6].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[6].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[6].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[7].addShapeBox(-3.5F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 497
		bodyDoorOpenModel[7].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[7].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[7].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[8].addShapeBox(4F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 501
		bodyDoorOpenModel[8].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[8].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[8].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[9].addShapeBox(11.5F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 505
		bodyDoorOpenModel[9].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[9].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[9].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[10].addShapeBox(19F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 509
		bodyDoorOpenModel[10].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[10].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[10].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[11].addShapeBox(26.5F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 516
		bodyDoorOpenModel[11].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[11].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[11].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[12].addShapeBox(34F, 0F, -7F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 518
		bodyDoorOpenModel[12].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[12].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[12].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[13].addShapeBox(11.25F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 521
		bodyDoorOpenModel[13].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[13].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[13].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[14].addShapeBox(3.75F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 522
		bodyDoorOpenModel[14].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[14].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[14].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[15].addShapeBox(18.75F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 523
		bodyDoorOpenModel[15].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[15].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[15].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[16].addShapeBox(26.25F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 524
		bodyDoorOpenModel[16].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[16].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[16].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[17].addShapeBox(33.75F, 1F, 0F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 525
		bodyDoorOpenModel[17].setRotationPoint(107F, -19.5F, -11F);
		bodyDoorOpenModel[17].rotateAngleX = 1.57079633F;
		bodyDoorOpenModel[17].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[18].addShapeBox(33.75F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 526
		bodyDoorOpenModel[18].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[18].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[18].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[19].addShapeBox(26.25F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 527
		bodyDoorOpenModel[19].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[19].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[19].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[20].addShapeBox(18.75F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 528
		bodyDoorOpenModel[20].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[20].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[20].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[21].addShapeBox(11.25F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 529
		bodyDoorOpenModel[21].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[21].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[21].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[22].addShapeBox(3.75F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 530
		bodyDoorOpenModel[22].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[22].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[22].rotateAngleZ = 0.02356194F;

		bodyDoorOpenModel[23].addShapeBox(-3.75F, 1F, -7F, 8, 1, 7, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 531
		bodyDoorOpenModel[23].setRotationPoint(107F, -19.5F, 7F);
		bodyDoorOpenModel[23].rotateAngleX = -1.57079633F;
		bodyDoorOpenModel[23].rotateAngleZ = 0.02356194F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 665, 481, textureX, textureY); // Box 582
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 665, 481, textureX, textureY); // Box 583

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 41, 7, 4, 0F,2F, 0.5F, 2F, 2F, 1.5F, 2F, 2F, 1.5F, 2F, 2F, 0.5F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 582
		bodyDoorCloseModel[0].setRotationPoint(106F, -19.1F, 1F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 41, 7, 4, 0F,2F, 0.5F, 2F, 2F, 1.5F, 2F, 2F, 1.5F, 2F, 2F, 0.5F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 583
		bodyDoorCloseModel[1].setRotationPoint(106F, -19.1F, -10F);
	}
}