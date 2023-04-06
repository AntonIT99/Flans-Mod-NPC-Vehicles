//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 13.09.2016 - 20:09:40
// Last changed on: 13.09.2016 - 20:09:40

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM60A1 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelM60A1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[236];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 287, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Box 82
		bodyModel[71] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 0, 748, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 0, 763, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 0, 777, textureX, textureY); // Box 99
		bodyModel[87] = new ModelRendererTurbo(this, 0, 798, textureX, textureY); // Box 100
		bodyModel[88] = new ModelRendererTurbo(this, 0, 836, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 0, 879, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 0, 928, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 0, 977, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1026, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Shape 107
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Shape 108
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1114, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Box 125
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Box 126
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 134
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 137
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Box 138
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Box 139
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Box 141
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 142
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Box 143
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 144
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 145
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 146
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 147
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Box 148
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Box 149
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Box 150
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 151
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Box 152
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 153
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Box 154
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Box 155
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Box 156
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 157
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 20, 1246, textureX, textureY); // Box 159
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 160
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 161
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 165
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 166
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 169
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 170
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 171
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 173
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 174
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 175
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 177
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 178
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 179
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 180
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 181
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 182
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 183
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 184
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 185
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 186
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 187
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 188
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 189
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 190
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 191
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 192
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 193
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 194
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 195
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 196
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 197
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 198
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 199
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 200
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 201
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 202
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 203
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 204
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 205
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 206
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 207
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 208
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 209
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 210
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 211
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 212
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 213
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 214
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 215
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 216
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Box 217
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 218
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Box 219
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Box 220
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Box 221
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Box 222
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Box 223
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 224
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 225
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 226
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 227
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 228
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 229
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 230
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 231
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 232
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 233
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 234
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 235
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 236
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 237
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 238
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Box 239
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Box 240
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Box 241
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Box 333
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 339
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 343
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 279
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 283
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 284
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Box 285
		bodyModel[233] = new ModelRendererTurbo(this, 30, 763, textureX, textureY); // Box 471
		bodyModel[234] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Box 652
		bodyModel[235] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Box 653

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 14, 39, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 18F, -7F, 0F, 18F, -7F, 0F, 0F, -7F, 2F); // Box 0
		bodyModel[0].setRotationPoint(37.5F, -16.5F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -14F, -1F, -2F, -15F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(37.5F, -9.5F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -14F, -1F, -2F, 0F, -1F, -2F); // Box 2
		bodyModel[2].setRotationPoint(37.5F, -9.5F, 0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-58.5F, -9.5F, -19.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 6
		bodyModel[4].setRotationPoint(-58.5F, -9.5F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F, 0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -9F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, -10F, 0F, 0.5F); // Box 7
		bodyModel[5].setRotationPoint(-71.5F, -9.5F, -19.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.5F, 0F, 0F, -10F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -9F, -1F, -2F); // Box 8
		bodyModel[6].setRotationPoint(-71.5F, -9.5F, 0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F, 0F, 0F, 0F, 93F, 0F, 0F, 93F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 93F, 0F, 2F, 93F, 0F, 2F, 0F, 0F, 2F); // Box 9
		bodyModel[7].setRotationPoint(-58.5F, -16.5F, -19.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 39, 0F, 0F, 0F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[8].setRotationPoint(37.5F, -19F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 2, 39, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		bodyModel[9].setRotationPoint(13.5F, -19F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 12
		bodyModel[10].setRotationPoint(-63.5F, -17.5F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 13
		bodyModel[11].setRotationPoint(20.5F, -17.5F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[12].setRotationPoint(37.5F, -17.5F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Box 15
		bodyModel[13].setRotationPoint(45.5F, -17F, -34F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F); // Box 16
		bodyModel[14].setRotationPoint(50.5F, -15.5F, -34F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[15].setRotationPoint(45.5F, -15.5F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, 2.5F, -0.5F, -1F, 2.5F, 0F, 0F, -0.5F, -0.5F); // Box 18
		bodyModel[16].setRotationPoint(50.5F, -14F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 19
		bodyModel[17].setRotationPoint(-66.5F, -17.5F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F); // Box 20
		bodyModel[18].setRotationPoint(-70.5F, -17.5F, -34F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, -1F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 3F, -0.5F); // Box 21
		bodyModel[19].setRotationPoint(-75.5F, -16F, -34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[20].setRotationPoint(-63.5F, -17F, -34F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[21].setRotationPoint(-44.5F, -17F, -34F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-60.5F, -20F, -34.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-60F, -21F, -32.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-60F, -21F, -34.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-58F, -21.5F, -25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-48.5F, -21.5F, -25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 30
		bodyModel[27].setRotationPoint(-39.5F, -22.8F, -30F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 31
		bodyModel[28].setRotationPoint(-23.5F, -22.8F, -30F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-41.5F, -22.3F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-15.5F, -19F, -34.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-15.5F, -20F, -32.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-15.5F, -20F, -34.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-14.5F, -20.5F, -26F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-4.5F, -20.5F, -26F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(6.5F, -20.5F, -26F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(16.5F, -20.5F, -26F);

		bodyModel[37].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(50.5F, -15.5F, -34F);
		bodyModel[37].rotateAngleZ = -0.34906585F;

		bodyModel[38].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(50.5F, -15.5F, -33F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(50.5F, -15.5F, -20F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(50.5F, -15.5F, -20F);
		bodyModel[40].rotateAngleZ = -0.34906585F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[41].setRotationPoint(-63.5F, -17.5F, 19F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[42].setRotationPoint(20.5F, -17.5F, 19F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[43].setRotationPoint(37.5F, -17.5F, 19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[44].setRotationPoint(45.5F, -17F, 19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[45].setRotationPoint(50.5F, -15.5F, 19F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyModel[46].setRotationPoint(-66.5F, -17.5F, 19F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 50
		bodyModel[47].setRotationPoint(-70.5F, -17.5F, 19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 3F, 0F); // Box 51
		bodyModel[48].setRotationPoint(-75.5F, -16F, 19F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[49].setRotationPoint(-63.5F, -17F, 33F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[50].setRotationPoint(-44.5F, -17F, 33F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-60.5F, -20F, 22.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-60F, -21F, 24.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 56
		bodyModel[53].setRotationPoint(-60F, -21F, 32.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[54].setRotationPoint(-58F, -21.5F, 24F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[55].setRotationPoint(-48.5F, -21.5F, 24F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 59
		bodyModel[56].setRotationPoint(-39.5F, -22.8F, 21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 60
		bodyModel[57].setRotationPoint(-23.5F, -22.8F, 21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F); // Box 61
		bodyModel[58].setRotationPoint(-41.5F, -22.3F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[59].setRotationPoint(-15.5F, -19F, 20.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[60].setRotationPoint(-15.5F, -20F, 25.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 64
		bodyModel[61].setRotationPoint(-15.5F, -20F, 32.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[62].setRotationPoint(-14.5F, -20.5F, 25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[63].setRotationPoint(-4.5F, -20.5F, 25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[64].setRotationPoint(6.5F, -20.5F, 25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[65].setRotationPoint(16.5F, -20.5F, 25F);

		bodyModel[66].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 69
		bodyModel[66].setRotationPoint(50.5F, -15.5F, 20F);
		bodyModel[66].rotateAngleZ = -0.34906585F;

		bodyModel[67].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[67].setRotationPoint(50.5F, -15.5F, 20F);
		bodyModel[67].rotateAngleZ = -0.34906585F;

		bodyModel[68].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[68].setRotationPoint(50.5F, -15.5F, 18F);
		bodyModel[68].rotateAngleZ = -0.34906585F;

		bodyModel[69].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(50.5F, -15.5F, 18F);
		bodyModel[69].rotateAngleZ = -0.34906585F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[70].setRotationPoint(-22F, -19.5F, -20F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[71].setRotationPoint(-22F, -19.5F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 4, 34, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[72].setRotationPoint(-30F, -21F, -17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[73].setRotationPoint(-30F, -21F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[74].setRotationPoint(-30F, -21F, 17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[75].setRotationPoint(-29.9F, -22F, -21F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[76].setRotationPoint(-29.9F, -22F, 17F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 6, 15, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[77].setRotationPoint(-45F, -25F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, -0.5F, -5F, -4F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[78].setRotationPoint(-45F, -25.5F, -13.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, 4F); // Box 91
		bodyModel[79].setRotationPoint(-45F, -25.5F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 19, 6, 14, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(-45F, -25.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 4F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 93
		bodyModel[81].setRotationPoint(-51F, -25.5F, -16F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -2F, 0F, 4F); // Box 94
		bodyModel[82].setRotationPoint(-51F, -25.5F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[83].setRotationPoint(-53F, -25F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(-52.5F, -25.5F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 3F, 2.5F, -1.5F, 3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 97
		bodyModel[85].setRotationPoint(-58F, -25.5F, -16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 6, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[86].setRotationPoint(-58F, -25.5F, -7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 6, 32, 0F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -2F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -2F, 2F); // Box 100
		bodyModel[87].setRotationPoint(-72F, -25.5F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 5, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[88].setRotationPoint(-72F, -21.5F, -19F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 102
		bodyModel[89].setRotationPoint(-62F, -21.5F, -22F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 5, 44, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[90].setRotationPoint(-59F, -21.5F, -22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 104
		bodyModel[91].setRotationPoint(-46F, -21.5F, -22F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 13, 5, 40, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[92].setRotationPoint(-43F, -21.5F, -20F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Shape 107
		bodyModel[93].setRotationPoint(-72F, -12.5F, 2F);
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Shape 108
		bodyModel[94].setRotationPoint(-73F, -12.5F, -2F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 109
		bodyModel[95].setRotationPoint(-64.5F, -20.5F, -33F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[96].setRotationPoint(-70.5F, -19.5F, -27F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[97].setRotationPoint(-64.5F, -20.5F, 19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[98].setRotationPoint(-70.5F, -19.5F, 21F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[99].setRotationPoint(-18.5F, -20.8F, -28F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[100].setRotationPoint(-18.5F, -20.8F, -24F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[101].setRotationPoint(-18.5F, -20.8F, 27F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[102].setRotationPoint(-18.5F, -20.8F, 23F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[103].setRotationPoint(-74.5F, -9.5F, -2F);

		bodyModel[104].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[104].setRotationPoint(-72.5F, -9.5F, -11F);
		bodyModel[104].rotateAngleZ = 0.36651914F;

		bodyModel[105].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[105].setRotationPoint(-72.5F, -9.5F, 6F);
		bodyModel[105].rotateAngleZ = 0.36651914F;

		bodyModel[106].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[106].setRotationPoint(-74.5F, -8.5F, -18F);

		bodyModel[107].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[107].setRotationPoint(-74.5F, -9.5F, -18F);

		bodyModel[108].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[108].setRotationPoint(-75F, -9F, -17F);

		bodyModel[109].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[109].setRotationPoint(-74.5F, -8.5F, 14F);

		bodyModel[110].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[110].setRotationPoint(-74.5F, -9.5F, 14F);

		bodyModel[111].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[111].setRotationPoint(-75F, -9F, 15F);

		bodyModel[112].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F, -1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Box 126
		bodyModel[112].setRotationPoint(-74.5F, -6.5F, -15.2F);

		bodyModel[113].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F, -1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Box 128
		bodyModel[113].setRotationPoint(-74.5F, -6.5F, 12.2F);

		bodyModel[114].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 129
		bodyModel[114].setRotationPoint(50.5F, -15.5F, -24F);
		bodyModel[114].rotateAngleZ = -0.34906585F;

		bodyModel[115].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 130
		bodyModel[115].setRotationPoint(50.5F, -15.5F, -19F);
		bodyModel[115].rotateAngleZ = -0.34906585F;

		bodyModel[116].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[116].setRotationPoint(50.5F, -15.5F, -15F);
		bodyModel[116].rotateAngleZ = -0.34906585F;

		bodyModel[117].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[117].setRotationPoint(50.5F, -15.5F, -11F);
		bodyModel[117].rotateAngleZ = -0.34906585F;

		bodyModel[118].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[118].setRotationPoint(50.5F, -15.5F, 19F);
		bodyModel[118].rotateAngleZ = -0.34906585F;

		bodyModel[119].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[119].setRotationPoint(50.5F, -15.5F, 15F);
		bodyModel[119].rotateAngleZ = -0.34906585F;

		bodyModel[120].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[120].setRotationPoint(50.5F, -15.5F, 10F);
		bodyModel[120].rotateAngleZ = -0.34906585F;

		bodyModel[121].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[121].setRotationPoint(50.5F, -15.5F, 10F);
		bodyModel[121].rotateAngleZ = -0.34906585F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[122].setRotationPoint(48F, -15.5F, -17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[123].setRotationPoint(48F, -16.5F, -17.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[124].setRotationPoint(48F, -15.5F, 16.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[125].setRotationPoint(48F, -16.5F, 16.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[126].setRotationPoint(52F, -12.5F, -15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[127].setRotationPoint(52.5F, -13.5F, -14.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[128].setRotationPoint(51F, -16.5F, -15.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[129].setRotationPoint(51F, -16.5F, -16.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 145
		bodyModel[130].setRotationPoint(51F, -16.5F, -12.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 146
		bodyModel[131].setRotationPoint(53.5F, -16F, -16F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 147
		bodyModel[132].setRotationPoint(53.5F, -16F, -14F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[133].setRotationPoint(52F, -12.5F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[134].setRotationPoint(52.5F, -13.5F, 13.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[135].setRotationPoint(51F, -16.5F, 12.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 151
		bodyModel[136].setRotationPoint(51F, -16.5F, 15.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[137].setRotationPoint(51F, -16.5F, 11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 153
		bodyModel[138].setRotationPoint(53.5F, -16F, 14F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 154
		bodyModel[139].setRotationPoint(53.5F, -16F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 155
		bodyModel[140].setRotationPoint(26.5F, -19.5F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[141].setRotationPoint(27.5F, -19.5F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 157
		bodyModel[142].setRotationPoint(29.5F, -19.5F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[143].setRotationPoint(32.5F, -19.5F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 159
		bodyModel[144].setRotationPoint(32.5F, -19.5F, 0F);

		bodyModel[145].addShapeBox(3F, -1F, -2F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[145].setRotationPoint(32.5F, -19.5F, 0F);

		bodyModel[146].addShapeBox(4F, -1F, -5F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[146].setRotationPoint(32.5F, -19.5F, 0F);
		bodyModel[146].rotateAngleY = -0.76794487F;

		bodyModel[147].addShapeBox(4F, -1F, 1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[147].setRotationPoint(32.5F, -19.5F, 0F);
		bodyModel[147].rotateAngleY = 0.76794487F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 163
		bodyModel[148].setRotationPoint(-46F, -2F, -21.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 164
		bodyModel[149].setRotationPoint(-54F, -2F, -22.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[150].setRotationPoint(-55F, 1F, -24.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[151].setRotationPoint(-54F, -7F, -23.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 167
		bodyModel[152].setRotationPoint(-54F, -7F, -21.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[153].setRotationPoint(-53.5F, -2F, -23F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 169
		bodyModel[154].setRotationPoint(-54F, -2F, 21.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[155].setRotationPoint(-55F, 1F, 20.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[156].setRotationPoint(-54F, -7F, 21.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[157].setRotationPoint(-53.5F, -2F, 22F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 174
		bodyModel[158].setRotationPoint(-36F, -2F, 21.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[159].setRotationPoint(-37F, 1F, 20.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[160].setRotationPoint(-36F, -7F, 21.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[161].setRotationPoint(-36F, -7F, 20.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[162].setRotationPoint(-35.5F, -2F, 22F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 179
		bodyModel[163].setRotationPoint(-28F, -2F, -21.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[164].setRotationPoint(-36F, -7F, -23.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[165].setRotationPoint(-35.5F, -2F, -23F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[166].setRotationPoint(-37F, 1F, -24.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 183
		bodyModel[167].setRotationPoint(-36F, -2F, -22.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 184
		bodyModel[168].setRotationPoint(-20F, -2F, 21.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[169].setRotationPoint(-21F, 1F, 20.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[170].setRotationPoint(-20F, -7F, 21.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[171].setRotationPoint(-20F, -7F, 20.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[172].setRotationPoint(-19.5F, -2F, 22F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 189
		bodyModel[173].setRotationPoint(-12F, -2F, -21.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[174].setRotationPoint(-20F, -7F, -23.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[175].setRotationPoint(-19.5F, -2F, -23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[176].setRotationPoint(-21F, 1F, -24.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 193
		bodyModel[177].setRotationPoint(-20F, -2F, -22.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 194
		bodyModel[178].setRotationPoint(-3F, -2F, 21.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[179].setRotationPoint(-4F, 1F, 20.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[180].setRotationPoint(-3F, -7F, 21.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[181].setRotationPoint(-3F, -7F, 20.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[182].setRotationPoint(-2.5F, -2F, 22F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 199
		bodyModel[183].setRotationPoint(5F, -2F, -21.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[184].setRotationPoint(-3F, -7F, -23.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[185].setRotationPoint(-2.5F, -2F, -23F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[186].setRotationPoint(-4F, 1F, -24.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 203
		bodyModel[187].setRotationPoint(-3F, -2F, -22.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 204
		bodyModel[188].setRotationPoint(14F, -2F, 21.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[189].setRotationPoint(13F, 1F, 20.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[190].setRotationPoint(14F, -7F, 21.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[191].setRotationPoint(14F, -7F, 20.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[192].setRotationPoint(14.5F, -2F, 22F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 209
		bodyModel[193].setRotationPoint(22F, -2F, -21.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[194].setRotationPoint(14F, -7F, -23.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[195].setRotationPoint(14.5F, -2F, -23F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[196].setRotationPoint(13F, 1F, -24.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 213
		bodyModel[197].setRotationPoint(14F, -2F, -22.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 214
		bodyModel[198].setRotationPoint(30F, -2F, 21.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[199].setRotationPoint(29F, 1F, 20.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[200].setRotationPoint(30F, -7F, 21.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[201].setRotationPoint(30F, -7F, 20.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[202].setRotationPoint(30.5F, -2F, 22F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Box 219
		bodyModel[203].setRotationPoint(38F, -2F, -21.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[204].setRotationPoint(30F, -7F, -23.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[205].setRotationPoint(30.5F, -2F, -23F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[206].setRotationPoint(29F, 1F, -24.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 223
		bodyModel[207].setRotationPoint(30F, -2F, -22.5F);

		bodyModel[208].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[208].setRotationPoint(-52.5F, 1F, -24F);
		bodyModel[208].rotateAngleZ = -0.45378561F;

		bodyModel[209].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 225
		bodyModel[209].setRotationPoint(-52.5F, 1F, -24F);
		bodyModel[209].rotateAngleZ = -0.45378561F;

		bodyModel[210].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 226
		bodyModel[210].setRotationPoint(-52.5F, 1F, -22.4F);
		bodyModel[210].rotateAngleZ = -0.45378561F;

		bodyModel[211].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[211].setRotationPoint(-52.5F, 1F, 23F);
		bodyModel[211].rotateAngleZ = -0.45378561F;

		bodyModel[212].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 228
		bodyModel[212].setRotationPoint(-52.5F, 1F, 23F);
		bodyModel[212].rotateAngleZ = -0.45378561F;

		bodyModel[213].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 229
		bodyModel[213].setRotationPoint(-52.5F, 1F, 18.4F);
		bodyModel[213].rotateAngleZ = -0.45378561F;

		bodyModel[214].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[214].setRotationPoint(15.5F, 1F, 23F);
		bodyModel[214].rotateAngleZ = -0.45378561F;

		bodyModel[215].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 231
		bodyModel[215].setRotationPoint(15.5F, 1F, 23F);
		bodyModel[215].rotateAngleZ = -0.45378561F;

		bodyModel[216].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 232
		bodyModel[216].setRotationPoint(15.5F, 1F, 18.4F);
		bodyModel[216].rotateAngleZ = -0.45378561F;

		bodyModel[217].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[217].setRotationPoint(15.5F, 1F, -24F);
		bodyModel[217].rotateAngleZ = -0.45378561F;

		bodyModel[218].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 234
		bodyModel[218].setRotationPoint(15.5F, 1F, -24F);
		bodyModel[218].rotateAngleZ = -0.45378561F;

		bodyModel[219].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 235
		bodyModel[219].setRotationPoint(15.5F, 1F, -22.4F);
		bodyModel[219].rotateAngleZ = -0.45378561F;

		bodyModel[220].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[220].setRotationPoint(31.5F, 1F, 23F);
		bodyModel[220].rotateAngleZ = -0.45378561F;

		bodyModel[221].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 237
		bodyModel[221].setRotationPoint(31.5F, 1F, 23F);
		bodyModel[221].rotateAngleZ = -0.45378561F;

		bodyModel[222].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 238
		bodyModel[222].setRotationPoint(31.5F, 1F, 18.4F);
		bodyModel[222].rotateAngleZ = -0.45378561F;

		bodyModel[223].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[223].setRotationPoint(31.5F, 1F, -24F);
		bodyModel[223].rotateAngleZ = -0.45378561F;

		bodyModel[224].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 240
		bodyModel[224].setRotationPoint(31.5F, 1F, -24F);
		bodyModel[224].rotateAngleZ = -0.45378561F;

		bodyModel[225].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 241
		bodyModel[225].setRotationPoint(31.5F, 1F, -22.4F);
		bodyModel[225].rotateAngleZ = -0.45378561F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F, 0.5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 10F, 0F, 2F, 10F, 0F, 2F, 0.5F, 0F, 0F); // Box 333
		bodyModel[226].setRotationPoint(-71.5F, -16.5F, -19.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[227].setRotationPoint(-8.5F, -12.25F, 19.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[228].setRotationPoint(25.5F, -12F, 19.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[229].setRotationPoint(-39.5F, -12.5F, 19.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[230].setRotationPoint(-8.5F, -12.25F, -24.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[231].setRotationPoint(25.5F, -12F, -24.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[232].setRotationPoint(-39.5F, -12.5F, -24.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 2.5F, -1.5F, 3F, 0F, -1F, 3F); // Box 471
		bodyModel[233].setRotationPoint(-58F, -25.5F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 652
		bodyModel[234].setRotationPoint(45.5F, -15.5F, 19F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, 2.5F, 0F, -1F, 2.5F, -0.5F, 0F, -0.5F, 0F); // Box 653
		bodyModel[235].setRotationPoint(50.5F, -14F, 19F);


		turretModel = new ModelRendererTurbo[134];
		turretModel[0] = new ModelRendererTurbo(this, 250, 57, textureX, textureY); // Box 295
		turretModel[1] = new ModelRendererTurbo(this, 250, 71, textureX, textureY); // Box 296
		turretModel[2] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Box 297
		turretModel[3] = new ModelRendererTurbo(this, 250, 99, textureX, textureY); // Box 301
		turretModel[4] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 305
		turretModel[5] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 309
		turretModel[6] = new ModelRendererTurbo(this, 250, 150, textureX, textureY); // Box 310
		turretModel[7] = new ModelRendererTurbo(this, 250, 164, textureX, textureY); // Box 311
		turretModel[8] = new ModelRendererTurbo(this, 250, 57, textureX, textureY); // Box 312
		turretModel[9] = new ModelRendererTurbo(this, 250, 164, textureX, textureY); // Box 317
		turretModel[10] = new ModelRendererTurbo(this, 250, 181, textureX, textureY); // Box 318
		turretModel[11] = new ModelRendererTurbo(this, 250, 230, textureX, textureY); // Box 319
		turretModel[12] = new ModelRendererTurbo(this, 250, 274, textureX, textureY); // Box 320
		turretModel[13] = new ModelRendererTurbo(this, 250, 325, textureX, textureY); // Box 321
		turretModel[14] = new ModelRendererTurbo(this, 250, 380, textureX, textureY); // Box 322
		turretModel[15] = new ModelRendererTurbo(this, 250, 433, textureX, textureY); // Box 323
		turretModel[16] = new ModelRendererTurbo(this, 250, 485, textureX, textureY); // Box 324
		turretModel[17] = new ModelRendererTurbo(this, 250, 71, textureX, textureY); // Box 325
		turretModel[18] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Box 326
		turretModel[19] = new ModelRendererTurbo(this, 250, 136, textureX, textureY); // Box 327
		turretModel[20] = new ModelRendererTurbo(this, 250, 150, textureX, textureY); // Box 328
		turretModel[21] = new ModelRendererTurbo(this, 250, 541, textureX, textureY); // Box 329
		turretModel[22] = new ModelRendererTurbo(this, 250, 598, textureX, textureY); // Box 330
		turretModel[23] = new ModelRendererTurbo(this, 250, 649, textureX, textureY); // Box 331
		turretModel[24] = new ModelRendererTurbo(this, 250, 704, textureX, textureY); // Box 332
		turretModel[25] = new ModelRendererTurbo(this, 250, 761, textureX, textureY); // Box 333
		turretModel[26] = new ModelRendererTurbo(this, 250, 761, textureX, textureY); // Box 334
		turretModel[27] = new ModelRendererTurbo(this, 250, 784, textureX, textureY); // Box 335
		turretModel[28] = new ModelRendererTurbo(this, 250, 784, textureX, textureY); // Box 336
		turretModel[29] = new ModelRendererTurbo(this, 250, 810, textureX, textureY); // Box 337
		turretModel[30] = new ModelRendererTurbo(this, 302, 810, textureX, textureY); // Box 338
		turretModel[31] = new ModelRendererTurbo(this, 250, 840, textureX, textureY); // Box 339
		turretModel[32] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 340
		turretModel[33] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 341
		turretModel[34] = new ModelRendererTurbo(this, 250, 884, textureX, textureY); // Box 342
		turretModel[35] = new ModelRendererTurbo(this, 250, 934, textureX, textureY); // Box 343
		turretModel[36] = new ModelRendererTurbo(this, 250, 984, textureX, textureY); // Box 344
		turretModel[37] = new ModelRendererTurbo(this, 250, 1034, textureX, textureY); // Box 345
		turretModel[38] = new ModelRendererTurbo(this, 250, 1034, textureX, textureY); // Box 346
		turretModel[39] = new ModelRendererTurbo(this, 250, 1057, textureX, textureY); // Box 347
		turretModel[40] = new ModelRendererTurbo(this, 250, 1057, textureX, textureY); // Box 348
		turretModel[41] = new ModelRendererTurbo(this, 250, 1062, textureX, textureY); // Box 349
		turretModel[42] = new ModelRendererTurbo(this, 250, 1071, textureX, textureY); // Box 350
		turretModel[43] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 352
		turretModel[44] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 353
		turretModel[45] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 354
		turretModel[46] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 355
		turretModel[47] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 356
		turretModel[48] = new ModelRendererTurbo(this, 250, 1080, textureX, textureY); // Box 357
		turretModel[49] = new ModelRendererTurbo(this, 250, 1085, textureX, textureY); // Box 358
		turretModel[50] = new ModelRendererTurbo(this, 250, 1092, textureX, textureY); // Box 359
		turretModel[51] = new ModelRendererTurbo(this, 250, 1112, textureX, textureY); // Box 360
		turretModel[52] = new ModelRendererTurbo(this, 250, 1119, textureX, textureY); // Box 361
		turretModel[53] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 362
		turretModel[54] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 363
		turretModel[55] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 364
		turretModel[56] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 365
		turretModel[57] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 366
		turretModel[58] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 367
		turretModel[59] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 369
		turretModel[60] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 370
		turretModel[61] = new ModelRendererTurbo(this, 250, 1139, textureX, textureY); // Box 371
		turretModel[62] = new ModelRendererTurbo(this, 250, 1143, textureX, textureY); // Box 372
		turretModel[63] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 373
		turretModel[64] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 374
		turretModel[65] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 375
		turretModel[66] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 376
		turretModel[67] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 377
		turretModel[68] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 378
		turretModel[69] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 379
		turretModel[70] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 380
		turretModel[71] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 381
		turretModel[72] = new ModelRendererTurbo(this, 250, 1158, textureX, textureY); // Box 382
		turretModel[73] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 383
		turretModel[74] = new ModelRendererTurbo(this, 250, 1161, textureX, textureY); // Box 384
		turretModel[75] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 385
		turretModel[76] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 386
		turretModel[77] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 387
		turretModel[78] = new ModelRendererTurbo(this, 250, 1164, textureX, textureY); // Box 388
		turretModel[79] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 389
		turretModel[80] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 390
		turretModel[81] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 391
		turretModel[82] = new ModelRendererTurbo(this, 250, 1167, textureX, textureY); // Box 392
		turretModel[83] = new ModelRendererTurbo(this, 250, 1177, textureX, textureY); // Box 393
		turretModel[84] = new ModelRendererTurbo(this, 250, 1187, textureX, textureY); // Box 394
		turretModel[85] = new ModelRendererTurbo(this, 250, 1197, textureX, textureY); // Box 396
		turretModel[86] = new ModelRendererTurbo(this, 250, 1204, textureX, textureY); // Box 397
		turretModel[87] = new ModelRendererTurbo(this, 250, 1211, textureX, textureY); // Box 398
		turretModel[88] = new ModelRendererTurbo(this, 250, 1215, textureX, textureY); // Box 400
		turretModel[89] = new ModelRendererTurbo(this, 250, 1177, textureX, textureY); // Box 401
		turretModel[90] = new ModelRendererTurbo(this, 250, 1187, textureX, textureY); // Box 402
		turretModel[91] = new ModelRendererTurbo(this, 250, 1197, textureX, textureY); // Box 403
		turretModel[92] = new ModelRendererTurbo(this, 250, 1204, textureX, textureY); // Box 404
		turretModel[93] = new ModelRendererTurbo(this, 250, 1215, textureX, textureY); // Box 405
		turretModel[94] = new ModelRendererTurbo(this, 250, 1211, textureX, textureY); // Box 406
		turretModel[95] = new ModelRendererTurbo(this, 250, 1219, textureX, textureY); // Box 407
		turretModel[96] = new ModelRendererTurbo(this, 250, 1230, textureX, textureY); // Box 408
		turretModel[97] = new ModelRendererTurbo(this, 250, 1241, textureX, textureY); // Box 409
		turretModel[98] = new ModelRendererTurbo(this, 250, 1252, textureX, textureY); // Box 410
		turretModel[99] = new ModelRendererTurbo(this, 250, 1257, textureX, textureY); // Box 411
		turretModel[100] = new ModelRendererTurbo(this, 250, 1260, textureX, textureY); // Box 412
		turretModel[101] = new ModelRendererTurbo(this, 250, 1265, textureX, textureY); // Box 413
		turretModel[102] = new ModelRendererTurbo(this, 250, 1270, textureX, textureY); // Box 414
		turretModel[103] = new ModelRendererTurbo(this, 250, 1282, textureX, textureY); // Box 415
		turretModel[104] = new ModelRendererTurbo(this, 250, 1286, textureX, textureY); // Box 416
		turretModel[105] = new ModelRendererTurbo(this, 250, 1295, textureX, textureY); // Box 417
		turretModel[106] = new ModelRendererTurbo(this, 250, 1301, textureX, textureY); // Box 418
		turretModel[107] = new ModelRendererTurbo(this, 250, 1307, textureX, textureY); // Box 419
		turretModel[108] = new ModelRendererTurbo(this, 250, 1313, textureX, textureY); // Box 420
		turretModel[109] = new ModelRendererTurbo(this, 250, 1318, textureX, textureY); // Box 421
		turretModel[110] = new ModelRendererTurbo(this, 250, 1313, textureX, textureY); // Box 422
		turretModel[111] = new ModelRendererTurbo(this, 250, 1338, textureX, textureY); // Box 423
		turretModel[112] = new ModelRendererTurbo(this, 250, 1354, textureX, textureY); // Box 424
		turretModel[113] = new ModelRendererTurbo(this, 250, 1368, textureX, textureY); // Box 425
		turretModel[114] = new ModelRendererTurbo(this, 250, 1378, textureX, textureY); // Box 426
		turretModel[115] = new ModelRendererTurbo(this, 250, 1390, textureX, textureY); // Box 427
		turretModel[116] = new ModelRendererTurbo(this, 250, 1415, textureX, textureY); // Box 428
		turretModel[117] = new ModelRendererTurbo(this, 250, 1430, textureX, textureY); // Box 429
		turretModel[118] = new ModelRendererTurbo(this, 250, 1443, textureX, textureY); // Box 430
		turretModel[119] = new ModelRendererTurbo(this, 250, 1452, textureX, textureY); // Box 431
		turretModel[120] = new ModelRendererTurbo(this, 250, 1464, textureX, textureY); // Box 432
		turretModel[121] = new ModelRendererTurbo(this, 250, 1480, textureX, textureY); // Box 433
		turretModel[122] = new ModelRendererTurbo(this, 250, 1491, textureX, textureY); // Box 434
		turretModel[123] = new ModelRendererTurbo(this, 250, 1500, textureX, textureY); // Box 435
		turretModel[124] = new ModelRendererTurbo(this, 250, 1510, textureX, textureY); // Box 436
		turretModel[125] = new ModelRendererTurbo(this, 250, 1515, textureX, textureY); // Box 437
		turretModel[126] = new ModelRendererTurbo(this, 250, 1520, textureX, textureY); // Box 438
		turretModel[127] = new ModelRendererTurbo(this, 250, 1525, textureX, textureY); // Box 439
		turretModel[128] = new ModelRendererTurbo(this, 250, 1529, textureX, textureY); // Box 440
		turretModel[129] = new ModelRendererTurbo(this, 250, 1525, textureX, textureY); // Box 472
		turretModel[130] = new ModelRendererTurbo(this, 250, 1548, textureX, textureY); // Box 473
		turretModel[131] = new ModelRendererTurbo(this, 250, 1548, textureX, textureY); // Box 474
		turretModel[132] = new ModelRendererTurbo(this, 250, 1562, textureX, textureY); // Box 475
		turretModel[133] = new ModelRendererTurbo(this, 250, 1562, textureX, textureY); // Box 476

		turretModel[0].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 3F, -3F, 2.5F, -5F, -2F, -2F, -5F, -2F, 0F, 3F, -3F, 0F, 3F, 0F, 2F, -7F, 0F, -3F, -7F, 0F, 1F, 3F, 0F, 0F); // Box 295
		turretModel[0].setRotationPoint(17.5F, -26F, -19F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 8, 0F, 0F, -2F, 0F, -5F, -3F, -3.5F, -5F, -3F, 0F, 0F, -2F, 0F, 0F, 3F, 2.5F, -4F, 2F, -2F, -4F, 2F, 0F, 0F, 3F, 0F); // Box 296
		turretModel[1].setRotationPoint(14.5F, -31F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 7, 0F, 0F, 1F, -3F, -8F, -0.6667F, -5F, -8F, -0.6667F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -6F, 1F, -2.5F, -6F, 1F, 0F, 0F, 0F, 0F); // Box 297
		turretModel[2].setRotationPoint(14.5F, -35F, -18F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 4, 15, 21, 0F, 0F, 0F, 0F, 0F, -1.115F, 0F, 0F, -1.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		turretModel[3].setRotationPoint(14.5F, -36F, -11F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 9, 2, 42, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F); // Box 305
		turretModel[4].setRotationPoint(5.5F, -23F, -21.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, -4F, -0.6667F, -5F, -5F, -2F, -6.5F, -5F, -2F, 0F, -4F, -0.6667F, 0F, -6F, 1F, -2.5F, -1F, 1F, -6.5F, -1F, 1F, 0F, -6F, 1F, 0F); // Box 309
		turretModel[5].setRotationPoint(16.5F, -35F, -18F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F, -3F, -3F, -3.5F, -1F, -3F, -7.5F, -1F, -3F, 0F, -3F, -3F, 0F, -4F, 2F, -2F, -0.5F, 2F, -7.5F, -0.5F, 2F, 0F, -4F, 2F, 0F); // Box 310
		turretModel[6].setRotationPoint(19.5F, -31F, -19F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F, -5F, -2F, -2F, 3.5F, -2F, -7.5F, 3.5F, -2F, 0F, -5F, -2F, 0F, -3F, 0F, -3F, 0.5F, 0F, -8.5F, 0.5F, 0F, 1F, -3F, 0F, 1F); // Box 311
		turretModel[7].setRotationPoint(18.5F, -26F, -19F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 8, 0F, 3F, -3F, 0F, -5F, -2F, 0F, -5F, -2F, -2F, 3F, -3F, 2.5F, 3F, 0F, 0F, -7F, 0F, 1F, -7F, 0F, -3F, 3F, 0F, 2F); // Box 312
		turretModel[8].setRotationPoint(17.5F, -26F, 10F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F, -5F, -2F, 0F, 3.5F, -2F, 0F, 3.5F, -2F, -7.5F, -5F, -2F, -2F, -3F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -8.5F, -3F, 0F, -3F); // Box 317
		turretModel[9].setRotationPoint(18.5F, -26F, 10F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 9, 6, 42, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 318
		turretModel[10].setRotationPoint(5.5F, -29F, -21.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 9, 7, 36, 0F, 1F, 2.5F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 1F, 2.5F, -2F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F); // Box 319
		turretModel[11].setRotationPoint(5.5F, -36F, -18.5F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 48, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 320
		turretModel[12].setRotationPoint(-3.5F, -23F, -24.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 9, 6, 48, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 321
		turretModel[13].setRotationPoint(-3.5F, -29F, -24.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 9, 9, 43, 0F, 0F, 1.5F, -2F, -1F, 0.5F, -3F, -1F, 0.5F, -5F, 0F, 1.5F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 322
		turretModel[14].setRotationPoint(-3.5F, -38F, -22.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 49, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 323
		turretModel[15].setRotationPoint(-15.5F, -23F, -25F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 12, 6, 49, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 324
		turretModel[16].setRotationPoint(-15.5F, -29F, -25F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 13, 5, 8, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, -3.5F, 0F, -2F, 0F, 0F, 3F, 0F, -4F, 2F, 0F, -4F, 2F, -2F, 0F, 3F, 2.5F); // Box 325
		turretModel[17].setRotationPoint(14.5F, -31F, 10F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 14, 6, 7, 0F, 0F, 1F, 0F, -8F, -0.6667F, 0F, -8F, -0.6667F, -5F, 0F, 1F, -3F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, 1F, -2.5F, 0F, 0F, 1F); // Box 326
		turretModel[18].setRotationPoint(14.5F, -35F, 10F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F, -4F, -0.6667F, 0F, -5F, -2F, 0F, -5F, -2F, -6.5F, -4F, -0.6667F, -5F, -6F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, -6.5F, -6F, 1F, -2.5F); // Box 327
		turretModel[19].setRotationPoint(16.5F, -35F, 10F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F, -3F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, -7.5F, -3F, -3F, -3.5F, -4F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, -7.5F, -4F, 2F, -2F); // Box 328
		turretModel[20].setRotationPoint(19.5F, -31F, 10F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 12, 11, 45, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		turretModel[21].setRotationPoint(-15.5F, -40F, -23.5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 20, 2, 48, 0F, 0F, 0F, -4.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, 0F, -5F); // Box 330
		turretModel[22].setRotationPoint(-35.5F, -26F, -24.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 20, 6, 48, 0F, 0F, 2F, -5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 2F, -5F, 0F, -3F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4.5F); // Box 331
		turretModel[23].setRotationPoint(-35.5F, -29F, -24.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 20, 11, 45, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -6F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 332
		turretModel[24].setRotationPoint(-35.5F, -40F, -23.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, -1F, 0.7F, -9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F, -1.5F, -0.7F, -9.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 333
		turretModel[25].setRotationPoint(-40.5F, -26F, -20.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0.7F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -0.7F, -9.5F); // Box 334
		turretModel[26].setRotationPoint(-40.5F, -26F, -0.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F, -1.5F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, -9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 335
		turretModel[27].setRotationPoint(-40.5F, -31F, -20.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.7F, -9F); // Box 336
		turretModel[28].setRotationPoint(-40.5F, -31F, -0.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 5, 9, 20, 0F, -2.5F, -0.5F, -11F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -1.5F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		turretModel[29].setRotationPoint(-40.5F, -40F, -20.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 5, 9, 20, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, -2.5F, -0.5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -9F); // Box 338
		turretModel[30].setRotationPoint(-40.5F, -40F, -0.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 339
		turretModel[31].setRotationPoint(14.5F, -21F, -21F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 340
		turretModel[32].setRotationPoint(21.5F, -21F, -16F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 341
		turretModel[33].setRotationPoint(21.5F, -21F, 0F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 47, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 342
		turretModel[34].setRotationPoint(5.5F, -21F, -24F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 47, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 343
		turretModel[35].setRotationPoint(-3.5F, -21F, -24F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 47, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F); // Box 344
		turretModel[36].setRotationPoint(-15.5F, -21F, -24F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, -1F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 345
		turretModel[37].setRotationPoint(-22.5F, -21F, -20F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -10F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -10F); // Box 346
		turretModel[38].setRotationPoint(-22.5F, -21F, -1F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		turretModel[39].setRotationPoint(5.5F, -40F, -15F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		turretModel[40].setRotationPoint(5.5F, -40F, -9F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		turretModel[41].setRotationPoint(5.5F, -40F, -14F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[42].setRotationPoint(5.5F, -41F, -15F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[43].setRotationPoint(-7.5F, -38F, -23F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 353
		turretModel[44].setRotationPoint(-7.5F, -36F, -23F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[45].setRotationPoint(-7.5F, -37F, -23F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		turretModel[46].setRotationPoint(-7.5F, -38F, 17F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 356
		turretModel[47].setRotationPoint(-7.5F, -36F, 17F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		turretModel[48].setRotationPoint(-7.5F, -37F, 17F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[49].setRotationPoint(-45.5F, -32F, -23.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 359
		turretModel[50].setRotationPoint(-45.5F, -32F, -18.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 360
		turretModel[51].setRotationPoint(-45.5F, -32F, 17.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 11, 1, 18, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[52].setRotationPoint(-45.5F, -32F, -0.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 362
		turretModel[53].setRotationPoint(-48.5F, -31F, -8F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[54].setRotationPoint(-48.5F, -38F, -8F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 364
		turretModel[55].setRotationPoint(-48.5F, -31F, 6F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[56].setRotationPoint(-48.5F, -38F, 6F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[57].setRotationPoint(-48F, -37.5F, -7F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[58].setRotationPoint(-48F, -35F, -7F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 369
		turretModel[59].setRotationPoint(-46.5F, -31F, -19F);
		turretModel[59].rotateAngleY = 0.36651914F;

		turretModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		turretModel[60].setRotationPoint(-46.5F, -38F, -19F);
		turretModel[60].rotateAngleY = 0.36651914F;

		turretModel[61].addShapeBox(0F, 0F, -1F, 11, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 371
		turretModel[61].setRotationPoint(-46.5F, -31F, 18F);
		turretModel[61].rotateAngleY = -0.36651914F;

		turretModel[62].addShapeBox(0F, 0F, -1F, 2, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[62].setRotationPoint(-46.5F, -38F, 18F);
		turretModel[62].rotateAngleY = -0.36651914F;

		turretModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 373
		turretModel[63].setRotationPoint(-42.5F, -35F, -23.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 374
		turretModel[64].setRotationPoint(-42.5F, -37.5F, -23.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F); // Box 375
		turretModel[65].setRotationPoint(-37.5F, -35F, -23.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 6F, 1F, 0F, 0F); // Box 376
		turretModel[66].setRotationPoint(-37.5F, -37.5F, -23.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F); // Box 377
		turretModel[67].setRotationPoint(-45.5F, -37.5F, -23.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F); // Box 378
		turretModel[68].setRotationPoint(-45.5F, -35F, -23.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 379
		turretModel[69].setRotationPoint(-45.5F, -37.5F, -18.5F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 380
		turretModel[70].setRotationPoint(-45.5F, -35F, -18.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[71].setRotationPoint(-42.5F, -35F, 21.5F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[72].setRotationPoint(-42.5F, -37.5F, 21.5F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 383
		turretModel[73].setRotationPoint(-37.5F, -35F, 21.5F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 384
		turretModel[74].setRotationPoint(-37.5F, -37.5F, 21.5F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 385
		turretModel[75].setRotationPoint(-45.5F, -37.5F, 21.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 386
		turretModel[76].setRotationPoint(-45.5F, -35F, 21.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		turretModel[77].setRotationPoint(-45.5F, -37.5F, 6.5F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		turretModel[78].setRotationPoint(-45.5F, -35F, 6.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[79].setRotationPoint(-49F, -35F, -7F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		turretModel[80].setRotationPoint(-49F, -35F, -3F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		turretModel[81].setRotationPoint(-49F, -35F, 4F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		turretModel[82].setRotationPoint(-49F, -35F, 0F);

		turretModel[83].addShapeBox(-8F, 0F, -4F, 12, 1, 8, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 393
		turretModel[83].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[83].rotateAngleY = -0.89011792F;
		turretModel[83].rotateAngleZ = 0.48869219F;

		turretModel[84].addShapeBox(-8F, 1F, -4F, 12, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F); // Box 394
		turretModel[84].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[84].rotateAngleY = -0.89011792F;
		turretModel[84].rotateAngleZ = 0.48869219F;

		turretModel[85].addShapeBox(-8F, 2F, -3F, 12, 1, 5, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 396
		turretModel[85].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[85].rotateAngleY = -0.89011792F;
		turretModel[85].rotateAngleZ = 0.48869219F;

		turretModel[86].addShapeBox(-8F, 3F, -3F, 12, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F); // Box 397
		turretModel[86].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[86].rotateAngleY = -0.89011792F;
		turretModel[86].rotateAngleZ = 0.48869219F;

		turretModel[87].addShapeBox(-4F, 5F, -2F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 398
		turretModel[87].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[87].rotateAngleY = -0.89011792F;
		turretModel[87].rotateAngleZ = 0.48869219F;

		turretModel[88].addShapeBox(-4F, 4F, -2F, 8, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		turretModel[88].setRotationPoint(9.5F, -32F, -21.5F);
		turretModel[88].rotateAngleY = -0.89011792F;
		turretModel[88].rotateAngleZ = 0.48869219F;

		turretModel[89].addShapeBox(-8F, 0F, -4F, 12, 1, 8, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 401
		turretModel[89].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[89].rotateAngleY = 0.89011792F;
		turretModel[89].rotateAngleZ = 0.48869219F;

		turretModel[90].addShapeBox(-8F, 1F, -4F, 12, 1, 8, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 402
		turretModel[90].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[90].rotateAngleY = 0.89011792F;
		turretModel[90].rotateAngleZ = 0.48869219F;

		turretModel[91].addShapeBox(-8F, 2F, -2F, 12, 1, 5, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 403
		turretModel[91].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[91].rotateAngleY = 0.89011792F;
		turretModel[91].rotateAngleZ = 0.48869219F;

		turretModel[92].addShapeBox(-8F, 3F, -2F, 12, 1, 5, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 404
		turretModel[92].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[92].rotateAngleY = 0.89011792F;
		turretModel[92].rotateAngleZ = 0.48869219F;

		turretModel[93].addShapeBox(-4F, 4F, 0F, 8, 1, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		turretModel[93].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[93].rotateAngleY = 0.89011792F;
		turretModel[93].rotateAngleZ = 0.48869219F;

		turretModel[94].addShapeBox(-4F, 5F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		turretModel[94].setRotationPoint(8.5F, -33F, 21.5F);
		turretModel[94].rotateAngleY = 0.89011792F;
		turretModel[94].rotateAngleZ = 0.48869219F;

		turretModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 407
		turretModel[95].setRotationPoint(-36F, -40F, -17F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		turretModel[96].setRotationPoint(-33F, -40F, -17F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 409
		turretModel[97].setRotationPoint(-30F, -40F, -17F);

		turretModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		turretModel[98].setRotationPoint(-32F, -41F, -3F);

		turretModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		turretModel[99].setRotationPoint(-31.5F, -42F, -2.5F);

		turretModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 412
		turretModel[100].setRotationPoint(-31.5F, -45F, -2.5F);

		turretModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 413
		turretModel[101].setRotationPoint(-32.5F, -42F, 12F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 414
		turretModel[102].setRotationPoint(-32.5F, -52F, 12F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 415
		turretModel[103].setRotationPoint(-19.5F, -40F, 12F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		turretModel[104].setRotationPoint(-18.5F, -40.5F, 3F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		turretModel[105].setRotationPoint(-17.5F, -40.5F, 5F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		turretModel[106].setRotationPoint(-15.5F, -40F, 4.5F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F); // Box 419
		turretModel[107].setRotationPoint(-15.5F, -40F, 8.5F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 420
		turretModel[108].setRotationPoint(0.5F, -40F, 9F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 421
		turretModel[109].setRotationPoint(0.5F, -41F, 3F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 9, 5, 19, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 422
		turretModel[110].setRotationPoint(-13.5F, -49F, -20F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F, -5F, -0.5F, -5F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		turretModel[111].setRotationPoint(-21.5F, -49F, -20F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, -5F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F); // Box 424
		turretModel[112].setRotationPoint(-21.5F, -49F, -10F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, -0.5F, -3F, -2F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		turretModel[113].setRotationPoint(-4.5F, -49F, -20F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F, 0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1.5F); // Box 426
		turretModel[114].setRotationPoint(-4.5F, -49F, -8F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 427
		turretModel[115].setRotationPoint(-13.5F, -44F, -20.5F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 8, 4, 10, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 428
		turretModel[116].setRotationPoint(-21.5F, -44F, -20F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -4F); // Box 429
		turretModel[117].setRotationPoint(-21.5F, -44F, -10F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 430
		turretModel[118].setRotationPoint(-4.5F, -44F, -20F);

		turretModel[119].addShapeBox(0F, 0F, 0F, 5, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 431
		turretModel[119].setRotationPoint(-4.5F, -44F, -8F);

		turretModel[120].addShapeBox(0F, -5F, 0F, 8, 7, 8, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		turretModel[120].setRotationPoint(-4.5F, -44F, -16F);

		turretModel[121].addShapeBox(0F, 2F, 0F, 8, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 433
		turretModel[121].setRotationPoint(-4.5F, -44F, -16F);

		turretModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		turretModel[122].setRotationPoint(-7.5F, -51F, -15F);

		turretModel[123].addShapeBox(6F, -5F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		turretModel[123].setRotationPoint(-4.5F, -43.25F, -12F);

		turretModel[124].addShapeBox(7F, -4F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		turretModel[124].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[125].addShapeBox(9F, -4F, 0F, 4, 2, 2, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 437
		turretModel[125].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[126].addShapeBox(13F, -4F, 0F, 9, 2, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 438
		turretModel[126].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[127].addTrapezoid(22F, -3.5F, 0.5F, 1, 1, 1, 0F, 0.20F, ModelRendererTurbo.MR_LEFT); // Box 439
		turretModel[127].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[128].addTrapezoid(23F, -3.5F, 0.5F, 2, 1, 1, 0F, 0.20F, ModelRendererTurbo.MR_RIGHT); // Box 440
		turretModel[128].setRotationPoint(-4.5F, -43.25F, -11.5F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		turretModel[129].setRotationPoint(-13.5F, -40F, -19.5F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		turretModel[130].setRotationPoint(-20.5F, -40F, -19F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 7, 4, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, -3F); // Box 474
		turretModel[131].setRotationPoint(-20.5F, -40F, -10F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		turretModel[132].setRotationPoint(-4.5F, -40F, -19F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0.5F); // Box 476
		turretModel[133].setRotationPoint(-4.5F, -40F, -8F);


		barrelModel = new ModelRendererTurbo[32];
		barrelModel[0] = new ModelRendererTurbo(this, 250, 1730, textureX, textureY); // Box 441
		barrelModel[1] = new ModelRendererTurbo(this, 250, 1741, textureX, textureY); // Box 442
		barrelModel[2] = new ModelRendererTurbo(this, 250, 1753, textureX, textureY); // Box 443
		barrelModel[3] = new ModelRendererTurbo(this, 250, 1762, textureX, textureY); // Box 444
		barrelModel[4] = new ModelRendererTurbo(this, 250, 1770, textureX, textureY); // Box 445
		barrelModel[5] = new ModelRendererTurbo(this, 285, 1762, textureX, textureY); // Box 446
		barrelModel[6] = new ModelRendererTurbo(this, 285, 1753, textureX, textureY); // Box 447
		barrelModel[7] = new ModelRendererTurbo(this, 285, 1741, textureX, textureY); // Box 448
		barrelModel[8] = new ModelRendererTurbo(this, 285, 1730, textureX, textureY); // Box 449
		barrelModel[9] = new ModelRendererTurbo(this, 250, 1797, textureX, textureY); // Box 450
		barrelModel[10] = new ModelRendererTurbo(this, 250, 1825, textureX, textureY); // Box 451
		barrelModel[11] = new ModelRendererTurbo(this, 250, 1840, textureX, textureY); // Box 452
		barrelModel[12] = new ModelRendererTurbo(this, 250, 1857, textureX, textureY); // Box 453
		barrelModel[13] = new ModelRendererTurbo(this, 250, 1875, textureX, textureY); // Box 454
		barrelModel[14] = new ModelRendererTurbo(this, 250, 1890, textureX, textureY); // Box 455
		barrelModel[15] = new ModelRendererTurbo(this, 250, 1895, textureX, textureY); // Box 456
		barrelModel[16] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 457
		barrelModel[17] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 458
		barrelModel[18] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 459
		barrelModel[19] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 460
		barrelModel[20] = new ModelRendererTurbo(this, 250, 1921, textureX, textureY); // Box 461
		barrelModel[21] = new ModelRendererTurbo(this, 250, 1908, textureX, textureY); // Box 462
		barrelModel[22] = new ModelRendererTurbo(this, 250, 1606, textureX, textureY); // Box 463
		barrelModel[23] = new ModelRendererTurbo(this, 250, 1616, textureX, textureY); // Box 464
		barrelModel[24] = new ModelRendererTurbo(this, 250, 1627, textureX, textureY); // Box 465
		barrelModel[25] = new ModelRendererTurbo(this, 250, 1636, textureX, textureY); // Box 466
		barrelModel[26] = new ModelRendererTurbo(this, 250, 1641, textureX, textureY); // Box 467
		barrelModel[27] = new ModelRendererTurbo(this, 250, 1648, textureX, textureY); // Box 468
		barrelModel[28] = new ModelRendererTurbo(this, 250, 1655, textureX, textureY); // Box 469
		barrelModel[29] = new ModelRendererTurbo(this, 250, 1655, textureX, textureY); // Box 470
		barrelModel[30] = new ModelRendererTurbo(this, 250, 1916, textureX, textureY); // Box 588
		barrelModel[31] = new ModelRendererTurbo(this, 250, 1950, textureX, textureY); // Box 650

		barrelModel[0].addShapeBox(-1F, 0F, -11F, 10, 4, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		barrelModel[0].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[1].addShapeBox(-1F, -6F, -11F, 9, 6, 5, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 442
		barrelModel[1].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[2].addShapeBox(-1F, -9F, -11F, 4, 3, 5, 0F, 2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 443
		barrelModel[2].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[3].addShapeBox(0F, 4F, -10F, 9, 3, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 444
		barrelModel[3].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[4].addShapeBox(-4F, -7F, -11F, 3, 5, 21, 0F, 0F, -0.115F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		barrelModel[4].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[5].addShapeBox(0F, 4F, 5F, 9, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 446
		barrelModel[5].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[6].addShapeBox(-1F, -9F, 5F, 4, 3, 5, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		barrelModel[6].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[7].addShapeBox(-1F, -6F, 5F, 9, 6, 5, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		barrelModel[7].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[8].addShapeBox(-1F, 0F, 5F, 10, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 449
		barrelModel[8].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[9].addShapeBox(0F, 0F, -11F, 6, 6, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 450
		barrelModel[9].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[10].addShapeBox(0F, 4F, -6F, 9, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 451
		barrelModel[10].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[11].addShapeBox(-1F, 0F, -6F, 10, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		barrelModel[11].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[12].addShapeBox(-1F, -6F, -6F, 9, 6, 11, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 453
		barrelModel[12].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[13].addShapeBox(-1F, -9F, -6F, 4, 3, 11, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 454
		barrelModel[13].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[14].addShapeBox(6F, -2.5F, -8F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		barrelModel[14].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[15].addShapeBox(6F, -3.5F, -4F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		barrelModel[15].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[16].addShapeBox(10F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 457
		barrelModel[16].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[17].addShapeBox(11F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		barrelModel[17].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[18].addShapeBox(13F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		barrelModel[18].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[19].addShapeBox(12F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 460
		barrelModel[19].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[20].addShapeBox(15F, -3.5F, -4F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		barrelModel[20].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[21].addShapeBox(14F, -3.5F, -4F, 1, 6, 6, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 462
		barrelModel[21].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[22].addShapeBox(16F, -2.5F, -3F, 12, 4, 4, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Box 463
		barrelModel[22].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[23].addShapeBox(28F, -3F, -4F, 10, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		barrelModel[23].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[24].addShapeBox(38F, -2.5F, -3F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		barrelModel[24].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[25].addShapeBox(40F, -1.5F, -2F, 2, 2, 2, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F); // Box 466
		barrelModel[25].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[26].addShapeBox(42F, -2F, -2.5F, 47, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		barrelModel[26].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[27].addShapeBox(82F, -2F, -2.5F, 1, 3, 3, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 468
		barrelModel[27].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[28].addShapeBox(28F, -4F, -4F, 10, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		barrelModel[28].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[29].addShapeBox(28F, 1F, -4F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 470
		barrelModel[29].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[30].addShapeBox(-7F, -7F, -11F, 3, 5, 21, 0F, 0F, -2F, 0F, 0F, -0.115F, 0F, 0F, -0.115F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		barrelModel[30].setRotationPoint(22.5F, -28F, 0F);

		barrelModel[31].addShapeBox(-1.5F, -2.5F, 3.5F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		barrelModel[31].setRotationPoint(32F, -24.5F, 4.5F);
		barrelModel[31].rotateAngleY = 0.41887902F;
		barrelModel[31].rotateAngleZ = -0.78539816F;


		leftTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 317
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 318
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 319
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 320
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 321
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 322
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 323
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Shape 324
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 335
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 337
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 338
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 340
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 341
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 342
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 280
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 281
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 282

		leftTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 317
		leftTrackWheelModels[0].setRotationPoint(-2F, 3F, 31.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 318
		leftTrackWheelModels[1].setRotationPoint(14F, 3F, 31.5F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 319
		leftTrackWheelModels[2].setRotationPoint(31F, 3F, 31.5F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 320
		leftTrackWheelModels[3].setRotationPoint(45F, -7F, 31.5F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 321
		leftTrackWheelModels[4].setRotationPoint(-19F, 3F, 31.5F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 322
		leftTrackWheelModels[5].setRotationPoint(-36F, 3F, 31.5F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 323
		leftTrackWheelModels[6].setRotationPoint(-53F, 3F, 31.5F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 324
		leftTrackWheelModels[7].setRotationPoint(-67F, -8F, 33F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		leftTrackWheelModels[8].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		leftTrackWheelModels[9].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 338
		leftTrackWheelModels[10].setRotationPoint(-7F, -10.75F, 24.5F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 340
		leftTrackWheelModels[11].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		leftTrackWheelModels[12].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackWheelModels[13].setRotationPoint(27F, -10.5F, 24.5F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		leftTrackWheelModels[14].setRotationPoint(-38F, -11F, 24.5F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 281
		leftTrackWheelModels[15].setRotationPoint(-38F, -11F, 24.5F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		leftTrackWheelModels[16].setRotationPoint(-38F, -11F, 24.5F);


		rightTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 325
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 326
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 327
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 328
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 329
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 330
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Shape 331
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Shape 332
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 286
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 287
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 288
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 289
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 290
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 291
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Box 292
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 293
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Box 294

		rightTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 325
		rightTrackWheelModels[0].setRotationPoint(-2F, 3F, -24.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 326
		rightTrackWheelModels[1].setRotationPoint(14F, 3F, -24.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 327
		rightTrackWheelModels[2].setRotationPoint(31F, 3F, -24.5F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 328
		rightTrackWheelModels[3].setRotationPoint(45F, -7F, -24.5F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 329
		rightTrackWheelModels[4].setRotationPoint(-19F, 3F, -24.5F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 330
		rightTrackWheelModels[5].setRotationPoint(-36F, 3F, -24.5F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 331
		rightTrackWheelModels[6].setRotationPoint(-53F, 3F, -24.5F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 332
		rightTrackWheelModels[7].setRotationPoint(-67F, -8F, -20F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		rightTrackWheelModels[8].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackWheelModels[9].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 288
		rightTrackWheelModels[10].setRotationPoint(-7F, -10.75F, -29.5F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 289
		rightTrackWheelModels[11].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[12].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackWheelModels[13].setRotationPoint(27F, -10.5F, -29.5F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		rightTrackWheelModels[14].setRotationPoint(-38F, -11F, -29.5F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 293
		rightTrackWheelModels[15].setRotationPoint(-38F, -11F, -29.5F);

		rightTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackWheelModels[16].setRotationPoint(-38F, -11F, -29.5F);

		
		fancyTrackModel = new ModelRendererTurbo[3];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 122, 51, textureX, textureY); // Box 0
		fancyTrackModel[1] = new ModelRendererTurbo(this, 129, 70, textureX, textureY); // Box 1
		fancyTrackModel[2] = new ModelRendererTurbo(this, 129, 70, textureX, textureY); // Box 2

		fancyTrackModel[0].addShapeBox(-1.5F, -1F, -5.5F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		fancyTrackModel[1].addShapeBox(-2.5F, -1F, -6.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		fancyTrackModel[2].addShapeBox(-2.5F, -1F, 5.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}