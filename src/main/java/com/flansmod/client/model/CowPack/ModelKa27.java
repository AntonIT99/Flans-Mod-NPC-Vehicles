//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ka27
// Model Creator: 
// Created on: 25.07.2019 - 20:04:04
// Last changed on: 25.07.2019 - 20:04:04

package com.flansmod.client.model.CowPack; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelKa27 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKa27() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[248];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 51
		bodyModel[35] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 761, 9, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 54
		bodyModel[38] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 57
		bodyModel[39] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 58
		bodyModel[40] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 59
		bodyModel[41] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 60
		bodyModel[42] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 74
		bodyModel[56] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 75
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 76
		bodyModel[58] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 77
		bodyModel[59] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 84
		bodyModel[61] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 85
		bodyModel[62] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 86
		bodyModel[63] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 87
		bodyModel[64] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 88
		bodyModel[65] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 89
		bodyModel[66] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Box 91
		bodyModel[68] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 92
		bodyModel[69] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 93
		bodyModel[70] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 94
		bodyModel[71] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 95
		bodyModel[72] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 96
		bodyModel[73] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 97
		bodyModel[74] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 98
		bodyModel[75] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 99
		bodyModel[76] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 100
		bodyModel[77] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 101
		bodyModel[78] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 102
		bodyModel[79] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 87
		bodyModel[80] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 88
		bodyModel[81] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 89
		bodyModel[82] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 94
		bodyModel[85] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 95
		bodyModel[86] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 97
		bodyModel[88] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Box 98
		bodyModel[89] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 99
		bodyModel[90] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 100
		bodyModel[91] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 101
		bodyModel[92] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 104
		bodyModel[95] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 105
		bodyModel[96] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 106
		bodyModel[97] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 107
		bodyModel[98] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 108
		bodyModel[99] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 109
		bodyModel[100] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 110
		bodyModel[101] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 111
		bodyModel[102] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 112
		bodyModel[103] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 113
		bodyModel[104] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 115
		bodyModel[106] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 116
		bodyModel[107] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 117
		bodyModel[108] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 118
		bodyModel[109] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 119
		bodyModel[110] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 120
		bodyModel[111] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 121
		bodyModel[112] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 122
		bodyModel[113] = new ModelRendererTurbo(this, 537, 233, textureX, textureY); // Box 123
		bodyModel[114] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 124
		bodyModel[115] = new ModelRendererTurbo(this, 537, 185, textureX, textureY); // Box 125
		bodyModel[116] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 126
		bodyModel[117] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 127
		bodyModel[118] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 128
		bodyModel[119] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 129
		bodyModel[120] = new ModelRendererTurbo(this, 913, 209, textureX, textureY); // Box 130
		bodyModel[121] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 131
		bodyModel[122] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 132
		bodyModel[123] = new ModelRendererTurbo(this, 673, 241, textureX, textureY); // Box 133
		bodyModel[124] = new ModelRendererTurbo(this, 777, 241, textureX, textureY); // Box 134
		bodyModel[125] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 135
		bodyModel[126] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 137
		bodyModel[127] = new ModelRendererTurbo(this, 857, 273, textureX, textureY); // Box 146
		bodyModel[128] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 147
		bodyModel[129] = new ModelRendererTurbo(this, 625, 281, textureX, textureY); // Box 148
		bodyModel[130] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 149
		bodyModel[131] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 150
		bodyModel[132] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 151
		bodyModel[133] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 152
		bodyModel[134] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 153
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 154
		bodyModel[136] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 155
		bodyModel[137] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 156
		bodyModel[138] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 157
		bodyModel[139] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 158
		bodyModel[140] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 159
		bodyModel[141] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 160
		bodyModel[142] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 161
		bodyModel[143] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 162
		bodyModel[144] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 163
		bodyModel[145] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 164
		bodyModel[146] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 165
		bodyModel[147] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 166
		bodyModel[148] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 167
		bodyModel[149] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 168
		bodyModel[150] = new ModelRendererTurbo(this, 577, 281, textureX, textureY); // Box 169
		bodyModel[151] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 170
		bodyModel[152] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Box 171
		bodyModel[153] = new ModelRendererTurbo(this, 761, 297, textureX, textureY); // Box 172
		bodyModel[154] = new ModelRendererTurbo(this, 929, 273, textureX, textureY); // Box 173
		bodyModel[155] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 174
		bodyModel[156] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 175
		bodyModel[157] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Box 176
		bodyModel[158] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 177
		bodyModel[159] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 178
		bodyModel[160] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 179
		bodyModel[161] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 180
		bodyModel[162] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 181
		bodyModel[163] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 182
		bodyModel[164] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 183
		bodyModel[165] = new ModelRendererTurbo(this, 985, 137, textureX, textureY); // Box 184
		bodyModel[166] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 185
		bodyModel[167] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 186
		bodyModel[168] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 187
		bodyModel[169] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 188
		bodyModel[170] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 189
		bodyModel[171] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 190
		bodyModel[172] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 191
		bodyModel[173] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 192
		bodyModel[174] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 193
		bodyModel[175] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 194
		bodyModel[176] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 195
		bodyModel[177] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 196
		bodyModel[178] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 197
		bodyModel[179] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 198
		bodyModel[180] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 199
		bodyModel[181] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 200
		bodyModel[182] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 201
		bodyModel[183] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 202
		bodyModel[184] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 203
		bodyModel[185] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 204
		bodyModel[186] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 205
		bodyModel[187] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 206
		bodyModel[188] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 208
		bodyModel[189] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 209
		bodyModel[190] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 210
		bodyModel[191] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 211
		bodyModel[192] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 212
		bodyModel[193] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 213
		bodyModel[194] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 214
		bodyModel[195] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 215
		bodyModel[196] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 216
		bodyModel[197] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 220
		bodyModel[198] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 221
		bodyModel[199] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 222
		bodyModel[200] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 226
		bodyModel[201] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 227
		bodyModel[202] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Box 228
		bodyModel[203] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 229
		bodyModel[204] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 230
		bodyModel[205] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 231
		bodyModel[206] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 228
		bodyModel[207] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 229
		bodyModel[208] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 230
		bodyModel[209] = new ModelRendererTurbo(this, 865, 177, textureX, textureY); // Box 231
		bodyModel[210] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 232
		bodyModel[211] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 233
		bodyModel[212] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 234
		bodyModel[213] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 235
		bodyModel[214] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 236
		bodyModel[215] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Box 237
		bodyModel[216] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 238
		bodyModel[217] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 239
		bodyModel[218] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 240
		bodyModel[219] = new ModelRendererTurbo(this, 721, 161, textureX, textureY); // Box 241
		bodyModel[220] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 242
		bodyModel[221] = new ModelRendererTurbo(this, 721, 329, textureX, textureY); // Box 252
		bodyModel[222] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 253
		bodyModel[223] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 254
		bodyModel[224] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 255
		bodyModel[225] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 257
		bodyModel[226] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 258
		bodyModel[227] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 259
		bodyModel[228] = new ModelRendererTurbo(this, 537, 217, textureX, textureY); // Box 260
		bodyModel[229] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 261
		bodyModel[230] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 262
		bodyModel[231] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 263
		bodyModel[232] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 264
		bodyModel[233] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 265
		bodyModel[234] = new ModelRendererTurbo(this, 961, 321, textureX, textureY); // Box 266
		bodyModel[235] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 267
		bodyModel[236] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 268
		bodyModel[237] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 269
		bodyModel[238] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 270
		bodyModel[239] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 271
		bodyModel[240] = new ModelRendererTurbo(this, 785, 329, textureX, textureY); // Box 272
		bodyModel[241] = new ModelRendererTurbo(this, 465, 337, textureX, textureY); // Box 273
		bodyModel[242] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 283
		bodyModel[243] = new ModelRendererTurbo(this, 609, 321, textureX, textureY); // Box 284
		bodyModel[244] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 285
		bodyModel[245] = new ModelRendererTurbo(this, 889, 329, textureX, textureY); // Box 286
		bodyModel[246] = new ModelRendererTurbo(this, 641, 337, textureX, textureY); // Box 287
		bodyModel[247] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 288

		bodyModel[0].addShapeBox(0F, 0F, 0F, 79, 28, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-37F, -45F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 79, 28, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-37F, -45F, 16.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 97, 10, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 2
		bodyModel[2].setRotationPoint(-46F, -17F, -19.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 19, 39, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, -3.5F, -6.5F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -3.5F, -6.5F); // Box 3
		bodyModel[3].setRotationPoint(-58F, -26F, -19.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-82F, -37F, -19.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 12, 25, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-58F, -45F, -19.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-82F, -37F, 18.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 22, 39, 0F, 0F, -6F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -6F, 0F, 0F, -6.5F, -6F, 0F, -0.5F, -6.5F, 0F, -0.5F, -6.5F, 0F, -6.5F, -6F); // Box 10
		bodyModel[7].setRotationPoint(-82F, -32F, -19.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 10, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F); // Box 14
		bodyModel[8].setRotationPoint(-83F, -26F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-83F, -38F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-82F, -38F, -19.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[11].setRotationPoint(-82F, -38F, 18.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 9, 39, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-58F, -54F, -19.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 33, 9, 39, 0F, 0F, 0F, -6F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-46F, -54F, -19.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 23, 7, 39, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(-13F, -52F, -19.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 6, 39, 0F, 0F, 0F, -4F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(10F, -51F, -19.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 9, 39, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(51F, -54F, -19.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 9, 35, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 0F); // Box 30
		bodyModel[17].setRotationPoint(60F, -54F, -17.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 9, 29, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -1F, 0F); // Box 31
		bodyModel[18].setRotationPoint(70F, -54F, -14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 9, 23, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -2F, 0F); // Box 32
		bodyModel[19].setRotationPoint(79F, -54F, -11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 28, 39, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(51F, -45F, -19.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 29, 35, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(60F, -46F, -17.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 29, 29, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(70F, -46F, -14.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 26, 23, 0F, 0F, 1F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(79F, -46F, -11.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 10, 39, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, -0.5F, -6F); // Box 37
		bodyModel[24].setRotationPoint(51F, -17F, -19.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 10, 35, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -5F, -3F, -2F, -8F, -3F, -2F, -8F, 0F, -1F, -5F); // Box 38
		bodyModel[25].setRotationPoint(60F, -17F, -17.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 9, 29, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 3F, -1F, -5F, -2.5F, -5.5F, -6.5F, -2.5F, -5.5F, -6.5F, 3F, -1F, -5F); // Box 39
		bodyModel[26].setRotationPoint(70F, -17F, -14.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 9, 23, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 2.5F, -2.5F, -3.5F, 0F, -7.5F, -4.5F, 0F, -7.5F, -4.5F, 2.5F, -2.5F, -3.5F); // Box 40
		bodyModel[27].setRotationPoint(79F, -20F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(-60F, -46F, -19.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 8, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 45
		bodyModel[29].setRotationPoint(-60F, -54F, -19.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 46
		bodyModel[30].setRotationPoint(-71F, -54F, -14.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -1.7F, 0F, 0F, -0.7F); // Box 47
		bodyModel[31].setRotationPoint(-77F, -54F, -14.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.2F, 0F, 0F, -0.2F, 0F, 0F, -3.7F, 0F, 0F, -0.7F); // Box 48
		bodyModel[32].setRotationPoint(-82F, -54F, -13.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.2F, 0F, 0F, -0.2F, 0F, 0F, -4.7F, 0F, 0F, -0.7F); // Box 49
		bodyModel[33].setRotationPoint(-85F, -54F, -10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[34].setRotationPoint(-60F, -46F, 18.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 8, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[35].setRotationPoint(-60F, -54F, 12.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 53
		bodyModel[36].setRotationPoint(-71F, -54F, 12.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.2F, 0F, 0F, -1.7F, 0F, 0F, -0.2F, 0F, 0F, -1F); // Box 54
		bodyModel[37].setRotationPoint(-77F, -54F, 11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -0.7F, 0F, 0F, -3.7F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 57
		bodyModel[38].setRotationPoint(-82F, -54F, 8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -1.2F, 0F, 0F, -4.7F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 58
		bodyModel[39].setRotationPoint(-85F, -54F, 4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -0.5F, 0F, -1F); // Box 59
		bodyModel[40].setRotationPoint(-87F, -54F, -5.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 25, 5, 27, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[41].setRotationPoint(-71F, -59F, -13.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 5, 27, 0F, 0F, -0.5F, -11F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, -0.5F, -11F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 61
		bodyModel[42].setRotationPoint(-77F, -59F, -13.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 4, 25, 0F, 0F, -2F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, -2F, -10F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 62
		bodyModel[43].setRotationPoint(-82F, -58F, -12.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 19, 0F, 0F, -1.5F, -7.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.5F, -7.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 63
		bodyModel[44].setRotationPoint(-85F, -56F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, -0.1F, -0.5F, -4F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, -0.1F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 64
		bodyModel[45].setRotationPoint(-86F, -55F, -5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 65
		bodyModel[46].setRotationPoint(-83F, -46F, -19.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, -4F, 0F, -5.2F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, 0F, 0F, -5F); // Box 66
		bodyModel[47].setRotationPoint(-81F, -53F, -18.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[48].setRotationPoint(-83F, -46F, 17.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[49].setRotationPoint(-83F, -38F, 18.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.8F, -4F, 0F, -5F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[50].setRotationPoint(-81F, -53F, 12.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 70
		bodyModel[51].setRotationPoint(-90F, -38F, -19.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 71
		bodyModel[52].setRotationPoint(-96F, -38F, -17.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 72
		bodyModel[53].setRotationPoint(-100F, -38F, -13.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 73
		bodyModel[54].setRotationPoint(-90F, -38F, 16.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 74
		bodyModel[55].setRotationPoint(-96F, -38F, 12.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 75
		bodyModel[56].setRotationPoint(-100F, -38F, 6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 76
		bodyModel[57].setRotationPoint(-101F, -38F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 77
		bodyModel[58].setRotationPoint(-90F, -37F, -19.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 79
		bodyModel[59].setRotationPoint(-90F, -37F, 16.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 10, 15, 0F, 0F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, -3F, -2.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -2.5F, -4F); // Box 84
		bodyModel[60].setRotationPoint(-101F, -26F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 12, 27, 0F, 0F, 0F, -6F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -6F, -2.5F, -6F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, -6F, -2.5F, -6F); // Box 85
		bodyModel[61].setRotationPoint(-100F, -26F, -13.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 12, 39, 0F, 1F, 0F, -6F, -7F, 0F, -2F, -7F, 0F, -2F, 1F, 0F, -6F, -6F, -2.5F, -7F, -6F, -2.5F, -7F, -6F, -2.5F, -7F, -6F, -2.5F, -7F); // Box 86
		bodyModel[62].setRotationPoint(-95F, -26F, -19.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 10, 39, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, -0.5F, -7F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -7F); // Box 87
		bodyModel[63].setRotationPoint(-89F, -26F, -19.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[64].setRotationPoint(-101F, -46F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F, -9F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[65].setRotationPoint(-95.5F, -53F, -0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 9, 24, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 90
		bodyModel[66].setRotationPoint(-90F, -17F, -13F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[67].setRotationPoint(-82F, -17F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 92
		bodyModel[68].setRotationPoint(-74F, -17F, -13F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F); // Box 93
		bodyModel[69].setRotationPoint(-74F, -8F, -13F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		bodyModel[70].setRotationPoint(-82F, -8F, -13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 2, 24, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 95
		bodyModel[71].setRotationPoint(-90F, -8F, -13F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, -3F); // Box 96
		bodyModel[72].setRotationPoint(-74F, -6F, -12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 22, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, -7F); // Box 97
		bodyModel[73].setRotationPoint(-89F, -6F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 98
		bodyModel[74].setRotationPoint(-82F, -6F, -12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[75].setRotationPoint(-46F, -36F, -19.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[76].setRotationPoint(-46F, -36F, 16.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[77].setRotationPoint(42F, -36F, -19.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 19, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[78].setRotationPoint(42F, -36F, 16.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 33, 5, 27, 0F, 0F, 0.5F, -10F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, -10F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 87
		bodyModel[79].setRotationPoint(-46F, -59F, -13.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 23, 5, 31, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		bodyModel[80].setRotationPoint(-13F, -56F, -15.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 41, 5, 31, 0F, 0F, -0.5F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 89
		bodyModel[81].setRotationPoint(10F, -56F, -15.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 32, 14, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-19.5F, -40F, -23.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[83].setRotationPoint(-19.5F, -41F, -23.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[84].setRotationPoint(-19.5F, -41F, -22.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 95
		bodyModel[85].setRotationPoint(-19.5F, -26F, -23.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 96
		bodyModel[86].setRotationPoint(-19.5F, -26F, -22.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 32, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[87].setRotationPoint(-19.5F, -40F, -22.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 30, 12, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[88].setRotationPoint(-32.5F, -21.5F, -21.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 30, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[89].setRotationPoint(-32.5F, -22.5F, -20.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[90].setRotationPoint(-32.5F, -22.5F, -21.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 101
		bodyModel[91].setRotationPoint(-32.5F, -9.5F, -21.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 102
		bodyModel[92].setRotationPoint(-32.5F, -9.5F, -20.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[93].setRotationPoint(-32.5F, -21.5F, -20.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 30, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[94].setRotationPoint(-32.5F, -12.5F, -16.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 32, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[95].setRotationPoint(-19.5F, -40F, 19.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[96].setRotationPoint(-19.5F, -41F, 19.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 107
		bodyModel[97].setRotationPoint(-19.5F, -41F, 22.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 32, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 108
		bodyModel[98].setRotationPoint(-19.5F, -40F, 22.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 109
		bodyModel[99].setRotationPoint(-19.5F, -26F, 22.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 110
		bodyModel[100].setRotationPoint(-19.5F, -26F, 19.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 30, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[101].setRotationPoint(-32.5F, -21.5F, 16.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 30, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 112
		bodyModel[102].setRotationPoint(-32.5F, -21.5F, 20.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[103].setRotationPoint(-32.5F, -22.5F, 20.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 30, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[104].setRotationPoint(-32.5F, -22.5F, 18.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 115
		bodyModel[105].setRotationPoint(-32.5F, -9.5F, 20.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 116
		bodyModel[106].setRotationPoint(-32.5F, -9.5F, 13.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 30, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[107].setRotationPoint(-32.5F, -12.5F, 14.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 35, 6, 41, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[108].setRotationPoint(-22F, -74F, -20.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 35, 6, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F); // Box 119
		bodyModel[109].setRotationPoint(-22F, -61F, -20.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 35, 8, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[110].setRotationPoint(-22F, -68.5F, -20.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 47, 6, 41, 0F, 0F, 0F, -6F, 0F, -6F, -18F, 0F, -6F, -18F, 0F, 0F, -6F, 0F, -0.5F, 0F, 0F, 3.5F, -12F, 0F, 3.5F, -12F, 0F, -0.5F, 0F); // Box 121
		bodyModel[111].setRotationPoint(13F, -74F, -20.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 47, 8, 41, 0F, 0F, 0F, 0F, 0F, -4F, -12F, 0F, -4F, -12F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, -11F, 0F, 1.5F, -11F, 0F, -0.5F, 0F); // Box 122
		bodyModel[112].setRotationPoint(13F, -68.5F, -20.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 47, 6, 41, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, 1.5F, -8F, 0F, 1.5F, -8F, 0F, -0.5F, -5F); // Box 123
		bodyModel[113].setRotationPoint(13F, -61F, -20.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 6, 19, 0F, 0F, 0F, -3F, -1.5F, -4F, -8F, -1.5F, -4F, -8F, 0F, 0F, -3F, 0F, -0.5F, 1F, 0F, 1.5F, -7F, 0F, 1.5F, -7F, 0F, -0.5F, 1F); // Box 124
		bodyModel[114].setRotationPoint(66F, -64.5F, -9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 6, 19, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 125
		bodyModel[115].setRotationPoint(60F, -64.5F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 5, 25, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F); // Box 126
		bodyModel[116].setRotationPoint(60F, -58.5F, -12.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 10, 5, 25, 0F, 0F, 0.5F, -2F, -1F, -1.5F, -10F, -1F, -1.5F, -10F, 0F, 0.5F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -9F, 0F, -0.5F, -9F, 0F, -0.5F, -1.5F); // Box 127
		bodyModel[117].setRotationPoint(66F, -58.5F, -12.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 4, 17, 0F, 0F, -0.5F, -6F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 128
		bodyModel[118].setRotationPoint(60F, -68.5F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 7, 13, 0F, 0F, -0.5F, -5F, -1F, -6F, -6.5F, -1F, -6F, -6.5F, 0F, -0.5F, -5F, 0F, -4.5F, 0F, -0.5F, -0.5F, -5F, -0.5F, -0.5F, -5F, 0F, -4.5F, 0F); // Box 129
		bodyModel[119].setRotationPoint(66F, -67F, -6.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, -4F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, -7F, 0F, -0.5F, -3F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -3F); // Box 130
		bodyModel[120].setRotationPoint(-54F, -74F, -20.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4.5F, -7F, 0F, -2.5F, -5F, 0F, -2.5F, -5F, 0F, -4.5F, -7F); // Box 131
		bodyModel[121].setRotationPoint(-54F, -61F, -20.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F); // Box 132
		bodyModel[122].setRotationPoint(-54F, -68.5F, -20.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F); // Box 133
		bodyModel[123].setRotationPoint(-54F, -68.5F, 2.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4.5F, -7F, 0F, -2.5F, -5F, 0F, -2.5F, -5F, 0F, -4.5F, -7F); // Box 134
		bodyModel[124].setRotationPoint(-54F, -61F, 2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 32, 8, 18, 0F, 0F, -4F, -7F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -4F, -7F, 0F, -0.5F, -3F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -3F); // Box 135
		bodyModel[125].setRotationPoint(-54F, -74F, 2.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 14, 19, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 137
		bodyModel[126].setRotationPoint(-51F, -70.5F, -9.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 3, 47, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 146
		bodyModel[127].setRotationPoint(-17F, -68.5F, -23.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 5, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 147
		bodyModel[128].setRotationPoint(-17F, -66F, -23.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 3, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 148
		bodyModel[129].setRotationPoint(-17F, -61.5F, -23.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 23, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 149
		bodyModel[130].setRotationPoint(-2F, -96.5F, -2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[131].setRotationPoint(-1F, -96.5F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 151
		bodyModel[132].setRotationPoint(1F, -96.5F, -2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 152
		bodyModel[133].setRotationPoint(-3F, -93.5F, -3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 153
		bodyModel[134].setRotationPoint(2F, -93.5F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[135].setRotationPoint(-2F, -93.5F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 155
		bodyModel[136].setRotationPoint(-3F, -87.5F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[137].setRotationPoint(-2F, -87.5F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 157
		bodyModel[138].setRotationPoint(2F, -87.5F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 158
		bodyModel[139].setRotationPoint(-4F, -80.5F, -3.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[140].setRotationPoint(-3F, -80.5F, -3.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 160
		bodyModel[141].setRotationPoint(3F, -80.5F, -3.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[142].setRotationPoint(-1F, -113F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[143].setRotationPoint(-3F, -111.5F, -4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 163
		bodyModel[144].setRotationPoint(3F, -111.5F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 164
		bodyModel[145].setRotationPoint(-4F, -111.5F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 19, 25, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F); // Box 165
		bodyModel[146].setRotationPoint(13.5F, -40F, -42.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[147].setRotationPoint(13.5F, -21F, -42.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 16, 3, 23, 0F, 0F, -2F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -2F, 0F, -15F, -2F, 0F); // Box 167
		bodyModel[148].setRotationPoint(13.5F, -23F, -42.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 7, 2, 23, 0F, -6F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[149].setRotationPoint(7.5F, -22F, -42.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 16, 3, 29, 0F, 0F, -2F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -2F, 0F, -15F, -2F, 0F); // Box 169
		bodyModel[150].setRotationPoint(13.5F, -9.5F, -42.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 7, 2, 29, 0F, -6F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[151].setRotationPoint(7.5F, -8.5F, -42.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 7, 2, 23, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 171
		bodyModel[152].setRotationPoint(7.5F, -22F, 19.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 16, 3, 23, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[153].setRotationPoint(13.5F, -23F, 19.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 19, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[154].setRotationPoint(13.5F, -40F, 17.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[155].setRotationPoint(13.5F, -21F, 40.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 16, 3, 29, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[156].setRotationPoint(13.5F, -9.5F, 13.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 2, 29, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 176
		bodyModel[157].setRotationPoint(7.5F, -8.5F, 13.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[158].setRotationPoint(12.5F, -4.5F, -43.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[159].setRotationPoint(12.5F, -4.5F, 38.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[160].setRotationPoint(7F, -4F, -43F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[161].setRotationPoint(7F, 0F, -43F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 181
		bodyModel[162].setRotationPoint(7F, 6F, -43F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 14, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[163].setRotationPoint(7F, 0F, 40F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 183
		bodyModel[164].setRotationPoint(7F, 6F, 40F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[165].setRotationPoint(7F, -4F, 40F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[166].setRotationPoint(-53.5F, -10F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[167].setRotationPoint(-54F, -2F, -13F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[168].setRotationPoint(-54F, 0F, -13F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[169].setRotationPoint(-54F, 0F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[170].setRotationPoint(-57F, 2F, -11.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[171].setRotationPoint(-57F, 4F, -11.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 191
		bodyModel[172].setRotationPoint(-57F, 8F, -11.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[173].setRotationPoint(-54F, 4F, -13F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[174].setRotationPoint(-54F, -2F, 8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[175].setRotationPoint(-53.5F, -10F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[176].setRotationPoint(-54F, 0F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[177].setRotationPoint(-54F, 0F, 12F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[178].setRotationPoint(-57F, 4F, 9.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[179].setRotationPoint(-57F, 2F, 9.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[180].setRotationPoint(-54F, 4F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 200
		bodyModel[181].setRotationPoint(-57F, 8F, 9.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 24, 1, 37, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[182].setRotationPoint(-82F, -26F, -18.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 15, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[183].setRotationPoint(-81F, -29F, -15.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 15, 11, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[184].setRotationPoint(-69F, -44F, -15.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 15, 3, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[185].setRotationPoint(-81F, -29F, 3.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 15, 11, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[186].setRotationPoint(-69F, -44F, 3.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 19, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[187].setRotationPoint(-77F, -30F, -3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[188].setRotationPoint(-83F, -31F, -3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 7, 5, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[189].setRotationPoint(-91F, -33F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 7, 16, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[190].setRotationPoint(-96F, -38F, -13F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[191].setRotationPoint(-96F, -38F, 4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[192].setRotationPoint(-96F, -34F, 3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[193].setRotationPoint(-96F, -31F, -12F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[194].setRotationPoint(-88F, -32F, -10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[195].setRotationPoint(-86F, -32F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[196].setRotationPoint(-85F, -37F, -9.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[197].setRotationPoint(-85F, -37F, 7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[198].setRotationPoint(-86F, -32F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[199].setRotationPoint(-88F, -32F, 7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 50, 26, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[200].setRotationPoint(-25F, -43F, -16.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 37, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[201].setRotationPoint(-21F, -18F, 3.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 14, 10, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[202].setRotationPoint(-9F, -68.5F, -21F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[203].setRotationPoint(20F, -75.5F, -2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		bodyModel[204].setRotationPoint(19F, -75.5F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 231
		bodyModel[205].setRotationPoint(22F, -75.5F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[206].setRotationPoint(43F, -75.5F, -3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 229
		bodyModel[207].setRotationPoint(47F, -75.5F, -3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 230
		bodyModel[208].setRotationPoint(42F, -75.5F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[209].setRotationPoint(15.5F, -18F, -22.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 10, 3, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[210].setRotationPoint(15.5F, -28F, -22.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[211].setRotationPoint(16.5F, -41F, -21.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[212].setRotationPoint(16.5F, -43F, -22.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[213].setRotationPoint(13.5F, -43.5F, -23F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[214].setRotationPoint(16.5F, -40F, -22.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 29, 8, 1, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[215].setRotationPoint(21.5F, -46F, -21.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[216].setRotationPoint(50.5F, -46F, -21.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[217].setRotationPoint(46.75F, -40.5F, -24F);
		bodyModel[217].rotateAngleZ = 0.34906585F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[218].setRotationPoint(49.5F, -43F, -21.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[219].setRotationPoint(-36.5F, -31F, -19.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[220].setRotationPoint(-69F, -62F, -0.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 22, 17, 19, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 252
		bodyModel[221].setRotationPoint(-44F, -73.5F, -9.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[222].setRotationPoint(-49F, -48F, -20F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[223].setRotationPoint(-16F, -48F, -20F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 255
		bodyModel[224].setRotationPoint(-49F, -48F, 17F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 257
		bodyModel[225].setRotationPoint(-16F, -48F, 17F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[226].setRotationPoint(-81F, -27F, 15F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[227].setRotationPoint(-99.5F, -40F, -1.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 260
		bodyModel[228].setRotationPoint(-83F, -34F, 2.25F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[229].setRotationPoint(-85F, -34F, 2.25F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[230].setRotationPoint(-84F, -30F, -4.25F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[231].setRotationPoint(-84F, -31F, -4.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Box 264
		bodyModel[232].setRotationPoint(-79F, -33F, -4.13F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F); // Box 265
		bodyModel[233].setRotationPoint(-78F, -31F, -4.13F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 12, 26, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[234].setRotationPoint(-37F, -43F, -17F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 12, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[235].setRotationPoint(9F, -37F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[236].setRotationPoint(-5F, -41F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[237].setRotationPoint(-10F, -38F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[238].setRotationPoint(-15F, -38F, -6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 19, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[239].setRotationPoint(17F, -29F, 3.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 37, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[240].setRotationPoint(-21F, -28F, 3.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 37, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[241].setRotationPoint(-21F, -34F, 3.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[242].setRotationPoint(16F, -43F, 3.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[243].setRotationPoint(-22F, -43F, 3.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 37, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[244].setRotationPoint(-21F, -43F, 3.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[245].setRotationPoint(36F, -43F, 3.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 14, 19, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[246].setRotationPoint(37F, -36F, 3.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[247].setRotationPoint(59F, -72F, -1F);


		noseModel = new ModelRendererTurbo[6];
		noseModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 78
		noseModel[1] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 80
		noseModel[2] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 81
		noseModel[3] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 82
		noseModel[4] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 83
		noseModel[5] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 251

		noseModel[0].addShapeBox(0F, 0F, 0F, 6, 11, 5, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 78
		noseModel[0].setRotationPoint(-96F, -37F, -17.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 6, 11, 5, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 80
		noseModel[1].setRotationPoint(-96F, -37F, 12.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 4, 11, 7, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 81
		noseModel[2].setRotationPoint(-100F, -37F, -13.5F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 4, 11, 7, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 82
		noseModel[3].setRotationPoint(-100F, -37F, 6.5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 1, 11, 15, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 83
		noseModel[4].setRotationPoint(-101F, -37F, -7.5F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		noseModel[5].setRotationPoint(-116F, -37F, -0.5F);


		tailModel = new ModelRendererTurbo[11];
		tailModel[0] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 41
		tailModel[1] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 42
		tailModel[2] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 43
		tailModel[3] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 138
		tailModel[4] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 139
		tailModel[5] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 140
		tailModel[6] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Box 141
		tailModel[7] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 142
		tailModel[8] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 143
		tailModel[9] = new ModelRendererTurbo(this, 705, 273, textureX, textureY); // Box 144
		tailModel[10] = new ModelRendererTurbo(this, 801, 273, textureX, textureY); // Box 145

		tailModel[0].addShapeBox(0F, 0F, 0F, 69, 8, 19, 0F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -2F, 0F); // Box 41
		tailModel[0].setRotationPoint(83F, -54F, -9.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 69, 26, 19, 0F, 0F, 2F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -22F, -4F, 0F, -22F, -4F, 0F, -3F, 0F); // Box 42
		tailModel[1].setRotationPoint(83F, -46F, -9.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 69, 9, 19, 0F, 0F, -1F, 0F, 0F, 18F, -4F, 0F, 18F, -4F, 0F, -1F, 0F, 0F, -3.5F, -2.5F, 0F, -25F, -6.5F, 0F, -25F, -6.5F, 0F, -3.5F, -2.5F); // Box 43
		tailModel[2].setRotationPoint(83F, -24F, -9.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 73, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 138
		tailModel[3].setRotationPoint(116F, -48.5F, -36.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 73, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 139
		tailModel[4].setRotationPoint(132F, -48.5F, -36.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 40, 32, 11, 0F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 140
		tailModel[5].setRotationPoint(113F, -61.5F, -43F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 35, 7, 11, 0F, -5F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, -8F, -5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 141
		tailModel[6].setRotationPoint(118F, -68.5F, -43F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 40, 11, 11, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -9F, -1F, -8F, 0F, -11F, 0F, 0F, -11F, -8F, -9F, -1F, 0F); // Box 142
		tailModel[7].setRotationPoint(113F, -29.5F, -43F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 40, 32, 11, 0F, -5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 143
		tailModel[8].setRotationPoint(113F, -61.5F, 32F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 35, 7, 11, 0F, -5F, 0F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 144
		tailModel[9].setRotationPoint(118F, -68.5F, 32F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 40, 11, 11, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, -9F, -1F, 0F, 0F, -11F, -8F, 0F, -11F, 0F, -9F, -1F, -8F); // Box 145
		tailModel[10].setRotationPoint(113F, -29.5F, 32F);


heliMainRotorModels = new ModelRendererTurbo[2][];
		heliMainRotorModels[0] = new ModelRendererTurbo[7];
heliMainRotorModels[1] = new ModelRendererTurbo[6];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Box 289
		heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 290
		heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 291
		heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 689, 369, textureX, textureY); // Box 292
		heliMainRotorModels[0][4] = new ModelRendererTurbo(this, 97, 361, textureX, textureY); // Box 293
		heliMainRotorModels[0][5] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 294
		heliMainRotorModels[0][6] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Box 295
		heliMainRotorModels[1][0] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Box 295
		heliMainRotorModels[1][1] = new ModelRendererTurbo(this, 241, 385, textureX, textureY); // Box 296
		heliMainRotorModels[1][2] = new ModelRendererTurbo(this, 489, 385, textureX, textureY); // Box 297
		heliMainRotorModels[1][3] = new ModelRendererTurbo(this, 921, 361, textureX, textureY); // Box 298
		heliMainRotorModels[1][4] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 299
		heliMainRotorModels[1][5] = new ModelRendererTurbo(this, 737, 385, textureX, textureY); // Box 300

		heliMainRotorModels[0][0].addShapeBox(3F, 2F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		heliMainRotorModels[0][0].setRotationPoint(0F, -113F, 0F);

		heliMainRotorModels[0][1].addShapeBox(47F, 2F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 290
		heliMainRotorModels[0][1].setRotationPoint(0F, -113F, 0F);

		heliMainRotorModels[0][2].addShapeBox(3F, 2F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		heliMainRotorModels[0][2].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[0][2].rotateAngleY = -2.0943951F;

		heliMainRotorModels[0][3].addShapeBox(47F, 2F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 292
		heliMainRotorModels[0][3].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[0][3].rotateAngleY = -2.0943951F;

		heliMainRotorModels[0][4].addShapeBox(3F, 2F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		heliMainRotorModels[0][4].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[0][4].rotateAngleY = 2.0943951F;

		heliMainRotorModels[0][5].addShapeBox(47F, 2F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 294
		heliMainRotorModels[0][5].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[0][5].rotateAngleY = 2.0943951F;

		heliMainRotorModels[1][0].addShapeBox(3F, -34F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		heliMainRotorModels[1][0].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][0].rotateAngleZ = 3.14159265F;

		heliMainRotorModels[1][1].addShapeBox(47F, -34F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 296
		heliMainRotorModels[1][1].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][1].rotateAngleZ = 3.14159265F;

		heliMainRotorModels[1][2].addShapeBox(47F, -34F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 297
		heliMainRotorModels[1][2].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][2].rotateAngleY = 2.0943951F;
		heliMainRotorModels[1][2].rotateAngleZ = 3.14159265F;

		heliMainRotorModels[1][3].addShapeBox(3F, -34F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		heliMainRotorModels[1][3].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][3].rotateAngleY = 2.0943951F;
		heliMainRotorModels[1][3].rotateAngleZ = 3.14159265F;

		heliMainRotorModels[1][4].addShapeBox(3F, -34F, -1.5F, 44, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		heliMainRotorModels[1][4].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][4].rotateAngleY = -2.0943951F;
		heliMainRotorModels[1][4].rotateAngleZ = 3.14159265F;

		heliMainRotorModels[1][5].addShapeBox(47F, -34F, -1.5F, 112, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -5F); // Box 300
		heliMainRotorModels[1][5].setRotationPoint(0F, -113F, 0F);
		heliMainRotorModels[1][5].rotateAngleY = -2.0943951F;
		heliMainRotorModels[1][5].rotateAngleZ = 3.14159265F;




		
        heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F / 16F, 0F / 16F, 0F / 16F), new Vector3f(0F / 16F, 0F / 16F, 0F / 16F) };

		heliRotorSpeeds = new float[] { 3f , -3F };

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}