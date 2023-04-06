//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDreadnought extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelDreadnought() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[293];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 1513, 145, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 1833, 145, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 1625, 65, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 1897, 73, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 1929, 145, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 1193, 177, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 1321, 177, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 1977, 25, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 1417, 177, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 1833, 145, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 1361, 249, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 54
		bodyModel[47] = new ModelRendererTurbo(this, 1505, 81, textureX, textureY); // Box 55
		bodyModel[48] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 2001, 145, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 1129, 177, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 1513, 177, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 1521, 209, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 697, 177, textureX, textureY); // Box 70
		bodyModel[61] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 1681, 33, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 1193, 177, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 1321, 177, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 77
		bodyModel[67] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 1945, 241, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 1129, 209, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 905, 217, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 1401, 225, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 2017, 177, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 745, 177, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 1273, 49, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 1585, 81, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 585, 257, textureX, textureY); // Box 104
		bodyModel[87] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 1505, 25, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 107
		bodyModel[90] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 108
		bodyModel[91] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 109
		bodyModel[92] = new ModelRendererTurbo(this, 1417, 225, textureX, textureY); // Box 110
		bodyModel[93] = new ModelRendererTurbo(this, 1833, 225, textureX, textureY); // Box 111
		bodyModel[94] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 112
		bodyModel[95] = new ModelRendererTurbo(this, 1889, 233, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 115
		bodyModel[98] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 116
		bodyModel[99] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 117
		bodyModel[100] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 118
		bodyModel[101] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 119
		bodyModel[102] = new ModelRendererTurbo(this, 1209, 209, textureX, textureY); // Box 120
		bodyModel[103] = new ModelRendererTurbo(this, 753, 273, textureX, textureY); // Box 121
		bodyModel[104] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 122
		bodyModel[105] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 123
		bodyModel[106] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 124
		bodyModel[107] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 125
		bodyModel[108] = new ModelRendererTurbo(this, 1417, 177, textureX, textureY); // Box 126
		bodyModel[109] = new ModelRendererTurbo(this, 1577, 177, textureX, textureY); // Box 127
		bodyModel[110] = new ModelRendererTurbo(this, 2033, 177, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 129
		bodyModel[112] = new ModelRendererTurbo(this, 769, 273, textureX, textureY); // Box 130
		bodyModel[113] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 153
		bodyModel[114] = new ModelRendererTurbo(this, 2041, 33, textureX, textureY); // Box 154
		bodyModel[115] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 809, 273, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 1081, 273, textureX, textureY); // Box 134
		bodyModel[118] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 1217, 273, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 1913, 281, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 1497, 289, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 521, 321, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 1817, 289, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 1073, 377, textureX, textureY); // Box 145
		bodyModel[128] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 146
		bodyModel[129] = new ModelRendererTurbo(this, 625, 409, textureX, textureY); // Box 147
		bodyModel[130] = new ModelRendererTurbo(this, 313, 401, textureX, textureY); // Box 148
		bodyModel[131] = new ModelRendererTurbo(this, 897, 409, textureX, textureY); // Box 149
		bodyModel[132] = new ModelRendererTurbo(this, 1297, 321, textureX, textureY); // Box 150
		bodyModel[133] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Box 151
		bodyModel[134] = new ModelRendererTurbo(this, 1497, 425, textureX, textureY); // Box 152
		bodyModel[135] = new ModelRendererTurbo(this, 897, 505, textureX, textureY); // Box 153
		bodyModel[136] = new ModelRendererTurbo(this, 1873, 321, textureX, textureY); // Box 154
		bodyModel[137] = new ModelRendererTurbo(this, 1321, 209, textureX, textureY); // Box 12
		bodyModel[138] = new ModelRendererTurbo(this, 1569, 209, textureX, textureY); // Box 13
		bodyModel[139] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 14
		bodyModel[140] = new ModelRendererTurbo(this, 849, 273, textureX, textureY); // Box 15
		bodyModel[141] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 16
		bodyModel[142] = new ModelRendererTurbo(this, 1505, 33, textureX, textureY); // Box 17
		bodyModel[143] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 18
		bodyModel[144] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 19
		bodyModel[145] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 20
		bodyModel[146] = new ModelRendererTurbo(this, 1081, 273, textureX, textureY); // Box 21
		bodyModel[147] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 22
		bodyModel[148] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 23
		bodyModel[149] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 24
		bodyModel[150] = new ModelRendererTurbo(this, 1897, 25, textureX, textureY); // Box 25
		bodyModel[151] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 26
		bodyModel[152] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 27
		bodyModel[153] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 28
		bodyModel[154] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 29
		bodyModel[155] = new ModelRendererTurbo(this, 1273, 1, textureX, textureY); // Box 30
		bodyModel[156] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 31
		bodyModel[157] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 32
		bodyModel[158] = new ModelRendererTurbo(this, 1673, 9, textureX, textureY); // Box 33
		bodyModel[159] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 34
		bodyModel[160] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 35
		bodyModel[161] = new ModelRendererTurbo(this, 449, 401, textureX, textureY); // Box 36
		bodyModel[162] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 37
		bodyModel[163] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 38
		bodyModel[164] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 39
		bodyModel[165] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 40
		bodyModel[166] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 41
		bodyModel[167] = new ModelRendererTurbo(this, 1641, 57, textureX, textureY); // Box 42
		bodyModel[168] = new ModelRendererTurbo(this, 1273, 105, textureX, textureY); // Box 43
		bodyModel[169] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 44
		bodyModel[170] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 45
		bodyModel[171] = new ModelRendererTurbo(this, 681, 177, textureX, textureY); // Box 46
		bodyModel[172] = new ModelRendererTurbo(this, 1073, 113, textureX, textureY); // Box 48
		bodyModel[173] = new ModelRendererTurbo(this, 1137, 113, textureX, textureY); // Box 49
		bodyModel[174] = new ModelRendererTurbo(this, 1697, 9, textureX, textureY); // Box 50
		bodyModel[175] = new ModelRendererTurbo(this, 609, 273, textureX, textureY); // Box 51
		bodyModel[176] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 52
		bodyModel[177] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 53
		bodyModel[178] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 54
		bodyModel[179] = new ModelRendererTurbo(this, 1201, 113, textureX, textureY); // Box 55
		bodyModel[180] = new ModelRendererTurbo(this, 745, 217, textureX, textureY); // Box 56
		bodyModel[181] = new ModelRendererTurbo(this, 881, 273, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 1513, 289, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 1897, 105, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 897, 273, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 753, 297, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 649, 297, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 2033, 273, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 1889, 225, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 1081, 297, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 1513, 249, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 1337, 297, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 1417, 297, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 1337, 305, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 1945, 233, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 1833, 249, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 617, 257, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 1297, 25, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 1217, 177, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 1345, 177, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 1713, 25, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 1297, 41, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 521, 305, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 1081, 321, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Box 215
		bodyModel[215] = new ModelRendererTurbo(this, 1273, 49, textureX, textureY); // Box 216
		bodyModel[216] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 217
		bodyModel[217] = new ModelRendererTurbo(this, 1297, 73, textureX, textureY); // Box 218
		bodyModel[218] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 219
		bodyModel[219] = new ModelRendererTurbo(this, 1217, 321, textureX, textureY); // Box 220
		bodyModel[220] = new ModelRendererTurbo(this, 521, 329, textureX, textureY); // Box 221
		bodyModel[221] = new ModelRendererTurbo(this, 1273, 321, textureX, textureY); // Box 222
		bodyModel[222] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 223
		bodyModel[223] = new ModelRendererTurbo(this, 1217, 273, textureX, textureY); // Box 224
		bodyModel[224] = new ModelRendererTurbo(this, 1977, 321, textureX, textureY); // Box 225
		bodyModel[225] = new ModelRendererTurbo(this, 1401, 329, textureX, textureY); // Box 226
		bodyModel[226] = new ModelRendererTurbo(this, 1481, 329, textureX, textureY); // Box 227
		bodyModel[227] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 228
		bodyModel[228] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 229
		bodyModel[229] = new ModelRendererTurbo(this, 1849, 401, textureX, textureY); // Box 230
		bodyModel[230] = new ModelRendererTurbo(this, 497, 417, textureX, textureY); // Box 231
		bodyModel[231] = new ModelRendererTurbo(this, 1537, 329, textureX, textureY); // Box 232
		bodyModel[232] = new ModelRendererTurbo(this, 1817, 337, textureX, textureY); // Box 233
		bodyModel[233] = new ModelRendererTurbo(this, 1977, 345, textureX, textureY); // Box 234
		bodyModel[234] = new ModelRendererTurbo(this, 233, 353, textureX, textureY); // Box 235
		bodyModel[235] = new ModelRendererTurbo(this, 777, 353, textureX, textureY); // Box 236
		bodyModel[236] = new ModelRendererTurbo(this, 1561, 289, textureX, textureY); // Box 237
		bodyModel[237] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 238
		bodyModel[238] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 239
		bodyModel[239] = new ModelRendererTurbo(this, 1505, 81, textureX, textureY); // Box 240
		bodyModel[240] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 241
		bodyModel[241] = new ModelRendererTurbo(this, 1385, 353, textureX, textureY); // Box 242
		bodyModel[242] = new ModelRendererTurbo(this, 289, 353, textureX, textureY); // Box 243
		bodyModel[243] = new ModelRendererTurbo(this, 521, 353, textureX, textureY); // Box 244
		bodyModel[244] = new ModelRendererTurbo(this, 9, 329, textureX, textureY); // Box 245
		bodyModel[245] = new ModelRendererTurbo(this, 1129, 273, textureX, textureY); // Box 246
		bodyModel[246] = new ModelRendererTurbo(this, 1481, 353, textureX, textureY); // Box 247
		bodyModel[247] = new ModelRendererTurbo(this, 1881, 353, textureX, textureY); // Box 248
		bodyModel[248] = new ModelRendererTurbo(this, 865, 353, textureX, textureY); // Box 249
		bodyModel[249] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 250
		bodyModel[250] = new ModelRendererTurbo(this, 657, 361, textureX, textureY); // Box 251
		bodyModel[251] = new ModelRendererTurbo(this, 1129, 177, textureX, textureY); // Box 252
		bodyModel[252] = new ModelRendererTurbo(this, 1513, 177, textureX, textureY); // Box 253
		bodyModel[253] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 254
		bodyModel[254] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Box 255
		bodyModel[255] = new ModelRendererTurbo(this, 721, 361, textureX, textureY); // Box 256
		bodyModel[256] = new ModelRendererTurbo(this, 1817, 361, textureX, textureY); // Box 257
		bodyModel[257] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 258
		bodyModel[258] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 259
		bodyModel[259] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Box 260
		bodyModel[260] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 261
		bodyModel[261] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 262
		bodyModel[262] = new ModelRendererTurbo(this, 441, 529, textureX, textureY); // Box 263
		bodyModel[263] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 269
		bodyModel[264] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 270
		bodyModel[265] = new ModelRendererTurbo(this, 1705, 41, textureX, textureY); // Box 271
		bodyModel[266] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 272
		bodyModel[267] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 273
		bodyModel[268] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 274
		bodyModel[269] = new ModelRendererTurbo(this, 1897, 73, textureX, textureY); // Box 275
		bodyModel[270] = new ModelRendererTurbo(this, 2001, 73, textureX, textureY); // Box 276
		bodyModel[271] = new ModelRendererTurbo(this, 1585, 81, textureX, textureY); // Box 277
		bodyModel[272] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 278
		bodyModel[273] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 279
		bodyModel[274] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 280
		bodyModel[275] = new ModelRendererTurbo(this, 1609, 81, textureX, textureY); // Box 281
		bodyModel[276] = new ModelRendererTurbo(this, 1289, 89, textureX, textureY); // Box 282
		bodyModel[277] = new ModelRendererTurbo(this, 1505, 97, textureX, textureY); // Box 283
		bodyModel[278] = new ModelRendererTurbo(this, 1521, 97, textureX, textureY); // Box 284
		bodyModel[279] = new ModelRendererTurbo(this, 1297, 105, textureX, textureY); // Box 285
		bodyModel[280] = new ModelRendererTurbo(this, 1609, 105, textureX, textureY); // Box 286
		bodyModel[281] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 287
		bodyModel[282] = new ModelRendererTurbo(this, 1833, 145, textureX, textureY); // Box 288
		bodyModel[283] = new ModelRendererTurbo(this, 1929, 201, textureX, textureY); // Box 289
		bodyModel[284] = new ModelRendererTurbo(this, 1321, 233, textureX, textureY); // Box 290
		bodyModel[285] = new ModelRendererTurbo(this, 1873, 145, textureX, textureY); // Box 291
		bodyModel[286] = new ModelRendererTurbo(this, 1929, 145, textureX, textureY); // Box 292
		bodyModel[287] = new ModelRendererTurbo(this, 689, 305, textureX, textureY); // Box 293
		bodyModel[288] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 294
		bodyModel[289] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 295
		bodyModel[290] = new ModelRendererTurbo(this, 1369, 313, textureX, textureY); // Box 296
		bodyModel[291] = new ModelRendererTurbo(this, 1000, 1012, textureX, textureY); // Box 1
		bodyModel[292] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 41, 14, 62, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 13F, 0F, 0F); // Box 3
		bodyModel[0].setRotationPoint(290F, -29F, -31F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 14, 32, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -16F, -2F, 0F, -16F, 0F, 0F, -1F); // Box 4
		bodyModel[1].setRotationPoint(352F, -29F, -16F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 14, 46, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -1F); // Box 5
		bodyModel[2].setRotationPoint(331F, -29F, -23F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 143, 12, 62, 0F, 0F, 0F, 0F, 13F, 2F, 0F, 13F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(134F, -27F, -31F);

		bodyModel[4].addBox(0F, 0F, 0F, 150, 50, 120, 0F); // Box 9
		bodyModel[4].setRotationPoint(-70F, -15F, -60F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 94, 50, 120, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(80F, -15F, -60F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 79, 31, 110, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(174F, -15F, -55F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 31, 80, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(253F, -15F, -40F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 54, 31, 62, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -1F); // Box 13
		bodyModel[8].setRotationPoint(277F, -15F, -31F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 21, 31, 44, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -18F, -8F, 0F, -18F, -8F, 0F, 0F, -1F); // Box 14
		bodyModel[9].setRotationPoint(331F, -15F, -22F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 13, 30, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -1F); // Box 15
		bodyModel[10].setRotationPoint(352F, -15F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 112, 50, 120, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 16
		bodyModel[11].setRotationPoint(-182F, -15F, -60F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 100, 31, 112, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F); // Box 17
		bodyModel[12].setRotationPoint(-282F, -15F, -56F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 75, 31, 84, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F); // Box 18
		bodyModel[13].setRotationPoint(-357F, -15F, -42F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 31, 34, 0F, -1F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -12F, 7F, -8F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -8F, -12F); // Box 19
		bodyModel[14].setRotationPoint(-379F, -15F, -17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 23, 10, 0F, -4F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, -3F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-386F, -15F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 14, 62, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(134F, -41F, -31F);

		bodyModel[17].addBox(0F, 0F, 0F, 48, 26, 62, 0F); // Box 22
		bodyModel[17].setRotationPoint(86F, -41F, -31F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 13, 62, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F); // Box 23
		bodyModel[18].setRotationPoint(71F, -28F, -31F);

		bodyModel[19].addBox(0F, 0F, 0F, 34, 23, 18, 0F); // Box 24
		bodyModel[19].setRotationPoint(76F, -51F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 15, 13, 28, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 25
		bodyModel[20].setRotationPoint(56F, -28F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 45, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(11F, -28F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 64, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 27
		bodyModel[22].setRotationPoint(79F, -92F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 20, 64, 14, 0F); // Box 28
		bodyModel[23].setRotationPoint(84F, -92F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 64, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(104F, -92F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 20, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 31
		bodyModel[25].setRotationPoint(84F, -95F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 1F); // Box 32
		bodyModel[26].setRotationPoint(104F, -95F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -3F); // Box 34
		bodyModel[27].setRotationPoint(79F, -95F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 41, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(-22F, -92F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 20, 41, 14, 0F); // Box 36
		bodyModel[29].setRotationPoint(-42F, -92F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 41, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 37
		bodyModel[30].setRotationPoint(-47F, -92F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -3F); // Box 38
		bodyModel[31].setRotationPoint(-47F, -95F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 20, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
		bodyModel[32].setRotationPoint(-42F, -95F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 1F); // Box 40
		bodyModel[33].setRotationPoint(-22F, -95F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 34, 10, 18, 0F); // Box 41
		bodyModel[34].setRotationPoint(-49F, -51F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 44, 26, 66, 0F); // Box 42
		bodyModel[35].setRotationPoint(-31F, -41F, -33F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 30, 26, 66, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 43
		bodyModel[36].setRotationPoint(-61F, -41F, -33F);

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 28, 0F); // Box 44
		bodyModel[37].setRotationPoint(13F, -41F, -14F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 2, 62, 0F); // Box 45
		bodyModel[38].setRotationPoint(71F, -41F, -31F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 29, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(82F, -41F, -36F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 29, 2, 5, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[40].setRotationPoint(82F, -41F, 31F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 25, 2, 40, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(27F, -41F, -20F);

		bodyModel[42].addBox(0F, 0F, 0F, 11, 44, 16, 0F); // Box 50
		bodyModel[42].setRotationPoint(4F, -59F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 44, 12, 20, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[43].setRotationPoint(29F, -16F, 19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 44, 15, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F); // Box 52
		bodyModel[44].setRotationPoint(29F, -16F, 39F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 44, 12, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 53
		bodyModel[45].setRotationPoint(28F, -16F, -39F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 44, 15, 25, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[46].setRotationPoint(29F, -16F, -64F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 22, 9, 28, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 10.5F, 0F, 3.5F, 7F, 0F, -14F, 7F, 0F, -14F, 10.5F, 0F, 3.5F); // Box 55
		bodyModel[47].setRotationPoint(352F, -2F, -14F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 39, 9, 35, 0F, 0F, 0F, 0F, 0.5F, 0F, -17.5F, 0.5F, 0F, -17.5F, 0F, 0F, 0F, 10.5F, 0F, 3.5F, 5F, 0F, -17.5F, 5F, 0F, -17.5F, 10.5F, 0F, 3.5F); // Box 56
		bodyModel[48].setRotationPoint(341.5F, 7F, -17.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 131, 5, 0F); // Box 57
		bodyModel[49].setRotationPoint(56.5F, -158F, -2.5F);

		bodyModel[50].addBox(0F, -104F, -1.5F, 3, 118, 3, 0F); // Box 58
		bodyModel[50].setRotationPoint(78.5F, -41F, -10.5F);
		bodyModel[50].rotateAngleX = -0.08726646F;
		bodyModel[50].rotateAngleZ = 0.17453293F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -4F, 0F, 0F, -4F); // Box 59
		bodyModel[51].setRotationPoint(56F, -146F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 38, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -8F, 0F, 0F); // Box 60
		bodyModel[52].setRotationPoint(41F, -159F, -3F);

		bodyModel[53].addBox(0F, 0F, 0F, 12, 15, 30, 0F); // Box 61
		bodyModel[53].setRotationPoint(115F, -79F, -15F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 15, 30, 0F); // Box 62
		bodyModel[54].setRotationPoint(141F, -79F, -15F);

		bodyModel[55].addBox(0F, 0F, 0F, 14, 1, 30, 0F); // Box 63
		bodyModel[55].setRotationPoint(127F, -79F, -15F);

		bodyModel[56].addBox(0F, 0F, 0F, 14, 1, 30, 0F); // Box 64
		bodyModel[56].setRotationPoint(127F, -65F, -15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 7, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 65
		bodyModel[57].setRotationPoint(130F, -64F, -15F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 16, 3, 0F); // Box 67
		bodyModel[58].setRotationPoint(130F, -57F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 1, 19, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[59].setRotationPoint(127F, -65F, -34F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[60].setRotationPoint(126F, -65F, 15F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 71
		bodyModel[61].setRotationPoint(141F, -71F, 15F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 19, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[62].setRotationPoint(141F, -71F, -34F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 6, 19, 0F); // Box 73
		bodyModel[63].setRotationPoint(126F, -71F, 15F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 74
		bodyModel[64].setRotationPoint(127F, -71F, 33F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 19, 0F); // Box 76
		bodyModel[65].setRotationPoint(126F, -71F, -34F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 77
		bodyModel[66].setRotationPoint(127F, -71F, -34F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 16, 2, 0F); // Box 78
		bodyModel[67].setRotationPoint(115F, -57F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 7, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 79
		bodyModel[68].setRotationPoint(115F, -64F, -15F);

		bodyModel[69].addBox(0F, 0F, 0F, 21, 7, 18, 0F); // Box 80
		bodyModel[69].setRotationPoint(53F, -166F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 21, 1, 18, 0F); // Box 81
		bodyModel[70].setRotationPoint(53F, -173F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 82
		bodyModel[71].setRotationPoint(53F, -172F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 83
		bodyModel[72].setRotationPoint(53F, -172F, 8F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 84
		bodyModel[73].setRotationPoint(73F, -172F, 8F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 85
		bodyModel[74].setRotationPoint(73F, -172F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 86
		bodyModel[75].setRotationPoint(58F, -172F, -9F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 87
		bodyModel[76].setRotationPoint(58F, -172F, 8F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 3, 100, 0F); // Box 88
		bodyModel[77].setRotationPoint(57F, -154F, -50F);

		bodyModel[78].addBox(0F, -104F, -1.5F, 3, 118, 3, 0F); // Box 89
		bodyModel[78].setRotationPoint(78.5F, -41F, 10.5F);
		bodyModel[78].rotateAngleX = 0.08726646F;
		bodyModel[78].rotateAngleZ = 0.17453293F;

		bodyModel[79].addBox(0F, 0F, 0F, 27, 6, 1, 0F); // Box 96
		bodyModel[79].setRotationPoint(115F, -85F, -15F);

		bodyModel[80].addBox(0F, 0F, 0F, 27, 6, 1, 0F); // Box 97
		bodyModel[80].setRotationPoint(115F, -85F, 14F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 6, 28, 0F); // Box 98
		bodyModel[81].setRotationPoint(115F, -85F, -14F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 6, 28, 0F); // Box 99
		bodyModel[82].setRotationPoint(141F, -85F, -14F);

		bodyModel[83].addBox(0F, 0F, 0F, 8, 12, 6, 0F); // Box 101
		bodyModel[83].setRotationPoint(33F, -40F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 6, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F); // Box 102
		bodyModel[84].setRotationPoint(143F, -47F, 14F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 17, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[85].setRotationPoint(143F, -47F, -31F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 6, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[86].setRotationPoint(143F, -47F, -14F);

		bodyModel[87].addBox(0F, 0F, 0F, 19, 6, 1, 0F); // Box 105
		bodyModel[87].setRotationPoint(115F, -47F, 30F);

		bodyModel[88].addBox(0F, 0F, 0F, 20, 6, 1, 0F); // Box 106
		bodyModel[88].setRotationPoint(114F, -47F, -31F);

		bodyModel[89].addBox(0F, -58F, -1F, 2, 54, 2, 0F); // Box 107
		bodyModel[89].setRotationPoint(-180.5F, -12F, 9.5F);
		bodyModel[89].rotateAngleX = 0.13962634F;
		bodyModel[89].rotateAngleZ = -0.2268928F;

		bodyModel[90].addBox(0F, -58F, -1F, 2, 54, 2, 0F); // Box 108
		bodyModel[90].setRotationPoint(-180.5F, -12F, -9.5F);
		bodyModel[90].rotateAngleX = -0.13962634F;
		bodyModel[90].rotateAngleZ = -0.2268928F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 24, 3, 0F); // Box 109
		bodyModel[91].setRotationPoint(-167.5F, -68F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 29, 4, 6, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, -17F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -17F, 0F, 0F); // Box 110
		bodyModel[92].setRotationPoint(-185F, -68F, -3F);

		bodyModel[93].addBox(0F, 0F, 0F, 18, 6, 16, 0F); // Box 111
		bodyModel[93].setRotationPoint(-174.5F, -74F, -8F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 112
		bodyModel[94].setRotationPoint(-157.5F, -80F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 19, 1, 16, 0F); // Box 113
		bodyModel[95].setRotationPoint(-174.5F, -81F, -8F);

		bodyModel[96].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 114
		bodyModel[96].setRotationPoint(-166.5F, -80F, -8F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 115
		bodyModel[97].setRotationPoint(-174.5F, -80F, -8F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 116
		bodyModel[98].setRotationPoint(-157.5F, -80F, 7F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 117
		bodyModel[99].setRotationPoint(-166.5F, -80F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 118
		bodyModel[100].setRotationPoint(-174.5F, -80F, 7F);

		bodyModel[101].addBox(0F, 0F, 0F, 17, 9, 24, 0F); // Box 119
		bodyModel[101].setRotationPoint(-180F, -24F, -12F);

		bodyModel[102].addBox(0F, 0F, 0F, 14, 18, 10, 0F); // Box 120
		bodyModel[102].setRotationPoint(-177F, -42F, -5F);

		bodyModel[103].addBox(0F, 0F, 0F, 20, 1, 20, 0F); // Box 121
		bodyModel[103].setRotationPoint(-182F, -43F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[104].setRotationPoint(57F, -154F, -51F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 123
		bodyModel[105].setRotationPoint(57F, -154F, 50F);

		bodyModel[106].addBox(0F, 0F, 0F, 20, 6, 1, 0F); // Box 124
		bodyModel[106].setRotationPoint(-182F, -49F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 20, 6, 1, 0F); // Box 125
		bodyModel[107].setRotationPoint(-182F, -49F, 9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 126
		bodyModel[108].setRotationPoint(-182F, -49F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 6, 18, 0F); // Box 127
		bodyModel[109].setRotationPoint(-163F, -49F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 91, 2, 0F); // Box 128
		bodyModel[110].setRotationPoint(52.5F, -250F, -1F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 65, 1, 0F); // Box 129
		bodyModel[111].setRotationPoint(56F, -300F, -0.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 2, 2, 70, 0F); // Box 130
		bodyModel[112].setRotationPoint(52.5F, -215F, -35F);

		bodyModel[113].addBox(0F, 0F, -3F, 7, 16, 3, 0F); // Box 153
		bodyModel[113].setRotationPoint(130F, -57F, 6F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 67, 1, 0F); // Box 154
		bodyModel[114].setRotationPoint(-156.5F, -135F, -0.5F);

		bodyModel[115].addBox(0F, 0F, -2F, 2, 16, 2, 0F); // Box 130
		bodyModel[115].setRotationPoint(115F, -57F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 79, 19, 110, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F); // Box 133
		bodyModel[116].setRotationPoint(174F, 16F, -55F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 24, 19, 80, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -4F); // Box 134
		bodyModel[117].setRotationPoint(253F, 16F, -40F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 54, 19, 60, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -1F); // Box 135
		bodyModel[118].setRotationPoint(277F, 16F, -30F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 39, 9, 35, 0F, 10.5F, 0F, 3.5F, 5F, 0F, -17.5F, 5F, 0F, -17.5F, 10.5F, 0F, 3.5F, 0.5F, 0F, -1.7F, 6.5F, 0F, -17.5F, 6.5F, 0F, -17.5F, 0.5F, 0F, -1.7F); // Box 136
		bodyModel[119].setRotationPoint(341.5F, 16F, -17.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 22, 10, 28, 0F, 11.1F, 0F, 1.8F, 13F, 0F, -14F, 13F, 0F, -14F, 11.1F, 0F, 1.8F, 0F, 0F, -4F, 6F, 0F, -14F, 6F, 0F, -14F, 0F, 0F, -4F); // Box 137
		bodyModel[120].setRotationPoint(352F, 25F, -14F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 21, 19, 44, 0F, 0F, 0F, -1F, 0F, -19F, -12F, 0F, -19F, -12F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F); // Box 138
		bodyModel[121].setRotationPoint(331F, 16F, -22F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 100, 19, 112, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 139
		bodyModel[122].setRotationPoint(-282F, 16F, -56F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 75, 6, 84, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -2F, -30F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, -2F, -30F); // Box 140
		bodyModel[123].setRotationPoint(-357F, 16F, -42F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 25, 13, 80, 0F, 0F, 1F, -30F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 1F, -30F, -10F, 0F, -35F, 0F, 0F, -4F, 0F, 0F, -4F, -10F, 0F, -35F); // Box 141
		bodyModel[124].setRotationPoint(-307F, 22F, -40F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 29, 12, 34, 0F, 0F, 0F, -12F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, -12F, 0F, -8F, -12F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -8F, -12F); // Box 142
		bodyModel[125].setRotationPoint(-386F, 8F, -17F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 29, 12, 34, 0F, 0F, 0F, -12F, 0F, -8F, -5F, 0F, -8F, -5F, 0F, 0F, -12F, -5F, -5F, -15F, 0F, -4F, -5F, 0F, -4F, -5F, -5F, -5F, -15F); // Box 143
		bodyModel[126].setRotationPoint(-386F, 12F, -17F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 150, 6, 120, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 145
		bodyModel[127].setRotationPoint(-70F, 35F, -60F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 94, 6, 120, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -5F); // Box 146
		bodyModel[128].setRotationPoint(80F, 35F, -60F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 79, 6, 110, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -7F); // Box 147
		bodyModel[129].setRotationPoint(174F, 35F, -55F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 24, 6, 80, 0F, 0F, 0F, -4F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -7F); // Box 148
		bodyModel[130].setRotationPoint(253F, 35F, -40F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 54, 6, 58, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -3F); // Box 149
		bodyModel[131].setRotationPoint(277F, 35F, -29F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 21, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F); // Box 150
		bodyModel[132].setRotationPoint(331F, 35F, -15F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 28, 6, 20, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, -10F, -11F, 0F, -10F, 0F, 0F, -5F); // Box 151
		bodyModel[133].setRotationPoint(352F, 35F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 112, 6, 120, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -9F); // Box 152
		bodyModel[134].setRotationPoint(-182F, 35F, -60F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 100, 6, 112, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -35F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -35F); // Box 153
		bodyModel[135].setRotationPoint(-282F, 35F, -56F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 15, 6, 72, 0F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, -36F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -36F); // Box 154
		bodyModel[136].setRotationPoint(-297F, 35F, -36F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 12
		bodyModel[137].setRotationPoint(-61F, -41F, -28F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 14, 13, 10, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 13
		bodyModel[138].setRotationPoint(-61F, -41F, 18F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 44, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[139].setRotationPoint(4F, -59F, -12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 11, 44, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 15
		bodyModel[140].setRotationPoint(4F, -59F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[141].setRotationPoint(5F, -60F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Box 17
		bodyModel[142].setRotationPoint(5F, -60F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 18
		bodyModel[143].setRotationPoint(5F, -60F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 19
		bodyModel[144].setRotationPoint(3F, -62F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[145].setRotationPoint(3F, -62F, -14F);

		bodyModel[146].addBox(0F, 0F, 0F, 13, 2, 20, 0F); // Box 21
		bodyModel[146].setRotationPoint(3F, -62F, -10F);

		bodyModel[147].addBox(-14F, -1F, -1F, 15, 2, 2, 0F); // Box 22
		bodyModel[147].setRotationPoint(-58F, -35F, -23F);
		bodyModel[147].rotateAngleY = 0.17453293F;

		bodyModel[148].addBox(-14F, -1F, -1F, 15, 2, 2, 0F); // Box 23
		bodyModel[148].setRotationPoint(-58F, -35F, 21F);
		bodyModel[148].rotateAngleY = -0.17453293F;

		bodyModel[149].addBox(-3F, 0F, -2F, 6, 10, 4, 0F); // Box 24
		bodyModel[149].setRotationPoint(132F, -51F, -20F);
		bodyModel[149].rotateAngleY = -0.29670597F;

		bodyModel[150].addBox(-1F, -1F, -1F, 14, 2, 2, 0F); // Box 25
		bodyModel[150].setRotationPoint(132F, -49F, -20F);
		bodyModel[150].rotateAngleY = -0.29670597F;

		bodyModel[151].addBox(-1F, -1F, -1F, 14, 2, 2, 0F); // Box 26
		bodyModel[151].setRotationPoint(132F, -49F, 20F);
		bodyModel[151].rotateAngleY = 0.29670597F;

		bodyModel[152].addBox(-3F, 0F, -2F, 6, 10, 4, 0F); // Box 27
		bodyModel[152].setRotationPoint(132F, -51F, 20F);
		bodyModel[152].rotateAngleY = 0.29670597F;

		bodyModel[153].addBox(0F, 0F, 0F, 29, 6, 1, 0F); // Box 28
		bodyModel[153].setRotationPoint(82F, -47F, 35F);

		bodyModel[154].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 29
		bodyModel[154].setRotationPoint(71F, -47F, 30F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 30
		bodyModel[155].setRotationPoint(78F, -47F, 30F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 31
		bodyModel[156].setRotationPoint(111F, -47F, 30F);

		bodyModel[157].addBox(0F, 0F, 0F, 29, 6, 1, 0F); // Box 32
		bodyModel[157].setRotationPoint(82F, -47F, -36F);

		bodyModel[158].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 33
		bodyModel[158].setRotationPoint(71F, -47F, -31F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 34
		bodyModel[159].setRotationPoint(78F, -47F, -31F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 35
		bodyModel[160].setRotationPoint(111F, -47F, -31F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 6, 60, 0F); // Box 36
		bodyModel[161].setRotationPoint(71F, -47F, -30F);

		bodyModel[162].addBox(-1F, -1F, -13F, 2, 2, 13, 0F); // Box 37
		bodyModel[162].setRotationPoint(0F, -35F, -32F);

		bodyModel[163].addBox(-1F, -1F, -13F, 2, 2, 13, 0F); // Box 38
		bodyModel[163].setRotationPoint(-18F, -35F, -32F);

		bodyModel[164].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 39
		bodyModel[164].setRotationPoint(0F, -35F, 32F);

		bodyModel[165].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 40
		bodyModel[165].setRotationPoint(-18F, -35F, 32F);

		bodyModel[166].addBox(-1F, -1F, -1F, 14, 2, 2, 0F); // Box 41
		bodyModel[166].setRotationPoint(139F, -35F, 23F);
		bodyModel[166].rotateAngleY = 0.34906585F;

		bodyModel[167].addBox(-1F, -1F, -1F, 14, 2, 2, 0F); // Box 42
		bodyModel[167].setRotationPoint(139F, -35F, -23F);
		bodyModel[167].rotateAngleY = -0.34906585F;

		bodyModel[168].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 43
		bodyModel[168].setRotationPoint(108F, -35F, 30F);
		bodyModel[168].rotateAngleX = -0.05235988F;

		bodyModel[169].addBox(-1F, -1F, 0F, 2, 2, 13, 0F); // Box 44
		bodyModel[169].setRotationPoint(90F, -35F, 30F);
		bodyModel[169].rotateAngleX = -0.05235988F;

		bodyModel[170].addBox(-1F, -1F, -13F, 2, 2, 13, 0F); // Box 45
		bodyModel[170].setRotationPoint(108F, -35F, -30F);
		bodyModel[170].rotateAngleX = 0.05235988F;

		bodyModel[171].addBox(-1F, -1F, -13F, 2, 2, 13, 0F); // Box 46
		bodyModel[171].setRotationPoint(90F, -35F, -30F);
		bodyModel[171].rotateAngleX = 0.05235988F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 30, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 15F, 0F, 0F, 0F); // Box 48
		bodyModel[172].setRotationPoint(-61F, -47F, 17F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 30, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 49
		bodyModel[173].setRotationPoint(-61F, -47F, -18F);

		bodyModel[174].addBox(0F, 0F, 0F, 10, 6, 1, 0F); // Box 50
		bodyModel[174].setRotationPoint(-31F, -47F, -33F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 6, 36, 0F); // Box 51
		bodyModel[175].setRotationPoint(-61F, -47F, -18F);

		bodyModel[176].addBox(0F, 0F, 0F, 6, 10, 6, 0F); // Box 52
		bodyModel[176].setRotationPoint(56F, -65F, -3F);

		bodyModel[177].addBox(-84F, -1.5F, -1.5F, 85, 3, 3, 0F); // Box 53
		bodyModel[177].setRotationPoint(56F, -61F, 0F);
		bodyModel[177].rotateAngleY = 0.43633231F;
		bodyModel[177].rotateAngleZ = -0.48869219F;

		bodyModel[178].addBox(0F, 0F, 0F, 16, 6, 1, 0F); // Box 54
		bodyModel[178].setRotationPoint(56F, -152F, 6F);

		bodyModel[179].addBox(0F, 0F, 0F, 16, 6, 1, 0F); // Box 55
		bodyModel[179].setRotationPoint(56F, -152F, -7F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 6, 14, 0F); // Box 56
		bodyModel[180].setRotationPoint(72F, -152F, -7F);

		bodyModel[181].addBox(-0.5F, 0F, -0.5F, 3, 56, 3, 0F); // Box 182
		bodyModel[181].setRotationPoint(-55F, -71F, -40F);

		bodyModel[182].addBox(0F, 0F, 0F, 10, 3, 25, 0F); // Box 183
		bodyModel[182].setRotationPoint(-59F, -17F, -44F);

		bodyModel[183].addBox(-54F, 0F, -1F, 55, 2, 2, 0F); // Box 184
		bodyModel[183].setRotationPoint(-55F, -30F, -39F);
		bodyModel[183].rotateAngleY = 0.2443461F;
		bodyModel[183].rotateAngleZ = -0.6981317F;

		bodyModel[184].addBox(-0.5F, 0F, -0.5F, 3, 56, 3, 0F); // Box 185
		bodyModel[184].setRotationPoint(-55F, -71F, 38F);

		bodyModel[185].addBox(0F, 0F, -15F, 10, 3, 25, 0F); // Box 186
		bodyModel[185].setRotationPoint(-59F, -17F, 34F);

		bodyModel[186].addBox(-54F, 0F, -1F, 55, 2, 2, 0F); // Box 187
		bodyModel[186].setRotationPoint(-55F, -30F, 39F);
		bodyModel[186].rotateAngleY = -0.2443461F;
		bodyModel[186].rotateAngleZ = -0.6981317F;

		bodyModel[187].addBox(-0.5F, 0F, -0.5F, 3, 48, 3, 0F); // Box 188
		bodyModel[187].setRotationPoint(-180F, -65F, -18F);

		bodyModel[188].addBox(0F, 0F, 0F, 10, 3, 20, 0F); // Box 189
		bodyModel[188].setRotationPoint(-184F, -17F, -22F);

		bodyModel[189].addBox(1F, 0F, -0.5F, 51, 2, 2, 0F); // Box 190
		bodyModel[189].setRotationPoint(-180F, -24F, -17F);
		bodyModel[189].rotateAngleY = -0.2443461F;
		bodyModel[189].rotateAngleZ = 0.6981317F;

		bodyModel[190].addBox(-0.5F, 0F, 0.5F, 3, 48, 3, 0F); // Box 191
		bodyModel[190].setRotationPoint(-180F, -65F, 15F);

		bodyModel[191].addBox(0F, 0F, -10F, 10, 3, 20, 0F); // Box 192
		bodyModel[191].setRotationPoint(-184F, -17F, 12F);

		bodyModel[192].addBox(1F, 0F, -1.5F, 50, 2, 2, 0F); // Box 193
		bodyModel[192].setRotationPoint(-180F, -24F, 17F);
		bodyModel[192].rotateAngleY = 0.2443461F;
		bodyModel[192].rotateAngleZ = 0.6981317F;

		bodyModel[193].addBox(-39F, 0F, -0.5F, 40, 1, 1, 0F); // Box 194
		bodyModel[193].setRotationPoint(-55F, -68F, -39F);
		bodyModel[193].rotateAngleY = 0.2443461F;
		bodyModel[193].rotateAngleZ = 0.17453293F;

		bodyModel[194].addBox(-39F, 0F, -0.5F, 40, 1, 1, 0F); // Box 195
		bodyModel[194].setRotationPoint(-55F, -68F, 39F);
		bodyModel[194].rotateAngleY = -0.2443461F;
		bodyModel[194].rotateAngleZ = 0.17453293F;

		bodyModel[195].addBox(-0.5F, 0F, -0.5F, 35, 1, 1, 0F); // Box 196
		bodyModel[195].setRotationPoint(-178F, -63F, 17F);
		bodyModel[195].rotateAngleY = 0.2443461F;
		bodyModel[195].rotateAngleZ = -0.31415927F;

		bodyModel[196].addBox(-0.5F, 0F, -0.5F, 35, 1, 1, 0F); // Box 197
		bodyModel[196].setRotationPoint(-178F, -63F, -17F);
		bodyModel[196].rotateAngleY = -0.2443461F;
		bodyModel[196].rotateAngleZ = -0.31415927F;

		bodyModel[197].addBox(-74F, 0F, -0.5F, 74, 1, 1, 0F); // Box 198
		bodyModel[197].setRotationPoint(57F, -132F, 0F);
		bodyModel[197].rotateAngleY = 0.43633231F;
		bodyModel[197].rotateAngleZ = 0.52359878F;

		bodyModel[198].addBox(0F, 0F, 0F, 7, 11, 7, 0F); // Box 199
		bodyModel[198].setRotationPoint(85F, -52F, 22F);

		bodyModel[199].addBox(0F, 0F, 0F, 7, 11, 7, 0F); // Box 200
		bodyModel[199].setRotationPoint(85F, -52F, -29F);

		bodyModel[200].addBox(0F, 0F, 0F, 7, 11, 7, 0F); // Box 201
		bodyModel[200].setRotationPoint(100F, -52F, 22F);

		bodyModel[201].addBox(0F, 0F, 0F, 7, 11, 7, 0F); // Box 202
		bodyModel[201].setRotationPoint(100F, -52F, -29F);

		bodyModel[202].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 203
		bodyModel[202].setRotationPoint(-22F, -38F, -34F);

		bodyModel[203].addBox(0F, 0F, 0F, 26, 6, 1, 0F); // Box 204
		bodyModel[203].setRotationPoint(-22F, -38F, 33F);

		bodyModel[204].addBox(0F, 0F, 0F, 24, 6, 1, 0F); // Box 205
		bodyModel[204].setRotationPoint(87F, -38F, 31F);

		bodyModel[205].addBox(0F, 0F, 0F, 24, 6, 1, 0F); // Box 206
		bodyModel[205].setRotationPoint(87F, -38F, -32F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 207
		bodyModel[206].setRotationPoint(110.5F, -55F, -18F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[207].setRotationPoint(110.5F, -67F, -18F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 2, 15, 0F); // Box 209
		bodyModel[208].setRotationPoint(111F, -67F, -33F);
		bodyModel[208].rotateAngleX = -0.01745329F;

		bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 15, 0F); // Box 210
		bodyModel[209].setRotationPoint(85F, -67F, -33F);
		bodyModel[209].rotateAngleX = -0.01745329F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[210].setRotationPoint(84.5F, -67F, -18F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 212
		bodyModel[211].setRotationPoint(84.5F, -55F, -18F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 10, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -2F); // Box 213
		bodyModel[212].setRotationPoint(110F, -65F, -37F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 214
		bodyModel[213].setRotationPoint(89F, -65F, -37F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 215
		bodyModel[214].setRotationPoint(78F, -65F, -37F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 216
		bodyModel[215].setRotationPoint(110.5F, -55F, 16F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[216].setRotationPoint(110.5F, -67F, 16F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[217].setRotationPoint(84.5F, -67F, 16F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 219
		bodyModel[218].setRotationPoint(84.5F, -55F, 16F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 10, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -2F); // Box 220
		bodyModel[219].setRotationPoint(110F, -65F, 22F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 221
		bodyModel[220].setRotationPoint(89F, -65F, 22F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 222
		bodyModel[221].setRotationPoint(78F, -65F, 22F);

		bodyModel[222].addBox(0F, 0F, -15F, 1, 2, 15, 0F); // Box 223
		bodyModel[222].setRotationPoint(111F, -67F, 33F);
		bodyModel[222].rotateAngleX = 0.01745329F;

		bodyModel[223].addBox(0F, 0F, -15F, 1, 2, 15, 0F); // Box 224
		bodyModel[223].setRotationPoint(85F, -67F, 33F);
		bodyModel[223].rotateAngleX = 0.01745329F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 225
		bodyModel[224].setRotationPoint(33F, -50F, 20F);
		bodyModel[224].rotateAngleY = -1.57079633F;

		bodyModel[225].addShapeBox(11F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 226
		bodyModel[225].setRotationPoint(33F, -50F, 20F);
		bodyModel[225].rotateAngleY = -1.57079633F;

		bodyModel[226].addShapeBox(32F, 0F, 0F, 10, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -2F); // Box 227
		bodyModel[226].setRotationPoint(33F, -50F, 20F);
		bodyModel[226].rotateAngleY = -1.57079633F;

		bodyModel[227].addBox(0F, 0F, 0F, 13, 4, 2, 0F); // Box 228
		bodyModel[227].setRotationPoint(34F, -45F, -8F);

		bodyModel[228].addBox(0F, 0F, -2F, 13, 4, 2, 0F); // Box 229
		bodyModel[228].setRotationPoint(34F, -45F, 8F);

		bodyModel[229].addBox(0F, 0F, 0F, 2, 3, 80, 0F); // Box 230
		bodyModel[229].setRotationPoint(-18F, -44F, -40F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 3, 80, 0F); // Box 231
		bodyModel[230].setRotationPoint(14F, -44F, -40F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 232
		bodyModel[231].setRotationPoint(-20F, -51F, -43F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 21, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 233
		bodyModel[232].setRotationPoint(-9F, -51F, -43F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 10, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -2F); // Box 234
		bodyModel[233].setRotationPoint(12F, -51F, -43F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 11, 7, 13, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 235
		bodyModel[234].setRotationPoint(-27F, -50F, 13F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 30, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 236
		bodyModel[235].setRotationPoint(-16F, -50F, 13F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 10, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -2F); // Box 237
		bodyModel[236].setRotationPoint(14F, -50F, 13F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 238
		bodyModel[237].setRotationPoint(-17.5F, -47F, -40F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 3, 9, 0F); // Box 239
		bodyModel[238].setRotationPoint(14.5F, -47F, -40F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 240
		bodyModel[239].setRotationPoint(-17.5F, -47F, 14.5F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // Box 241
		bodyModel[240].setRotationPoint(14.5F, -47F, 14.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 30, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 242
		bodyModel[241].setRotationPoint(-16.5F, -51F, 26.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 14, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 243
		bodyModel[242].setRotationPoint(-30.5F, -51F, 26.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 13, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -2F); // Box 244
		bodyModel[243].setRotationPoint(13.5F, -51F, 26.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[244].setRotationPoint(-13.5F, -55F, 28F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, 0F, 0F, 0F); // Box 246
		bodyModel[245].setRotationPoint(6.5F, -58F, 29F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 30, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 247
		bodyModel[246].setRotationPoint(-17F, -52F, -27.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 14, 8, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 248
		bodyModel[247].setRotationPoint(-31F, -52F, -27.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[248].setRotationPoint(-14F, -56F, -26F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, -1F, 0F, 0F, 0F); // Box 250
		bodyModel[249].setRotationPoint(6F, -59F, -25F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 13, 8, 15, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -6F, 0F, -7F, -6F, 0F, 0F, -2F); // Box 251
		bodyModel[250].setRotationPoint(13F, -52F, -27.5F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 252
		bodyModel[251].setRotationPoint(14.5F, -47F, -26F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 253
		bodyModel[252].setRotationPoint(-17.5F, -47F, -26F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 254
		bodyModel[253].setRotationPoint(14.5F, -47F, 28F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 3, 12, 0F); // Box 255
		bodyModel[254].setRotationPoint(-17.5F, -47F, 28F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 19, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 256
		bodyModel[255].setRotationPoint(-8F, -54F, -42F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 10, 7, 13, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -2F); // Box 257
		bodyModel[256].setRotationPoint(11F, -54F, -42F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 9, 7, 13, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 258
		bodyModel[257].setRotationPoint(-17F, -54F, -42F);

		bodyModel[258].addBox(-0.5F, -31F, -0.5F, 1, 40, 1, 0F); // Box 259
		bodyModel[258].setRotationPoint(374.75F, -38F, 0F);
		bodyModel[258].rotateAngleY = 0.78539816F;

		bodyModel[259].addShapeBox(-16F, 0F, 0F, 18, 17, 2, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[259].setRotationPoint(-340F, 19F, -1F);

		bodyModel[260].addShapeBox(-16F, 15F, 0F, 17, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -5F, -2F, 0F); // Box 261
		bodyModel[260].setRotationPoint(-340F, 21F, -1F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 214, 3, 5, 0F, 25F, 0F, 1F, 30F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 1F, 30F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[261].setRotationPoint(-89F, 36F, 58F);
		bodyModel[261].rotateAngleX = -0.54105207F;

		bodyModel[262].addShapeBox(0F, 0F, -5F, 214, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 3F, 25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 3F, 25F, 0F, 1F); // Box 263
		bodyModel[262].setRotationPoint(-89F, 36F, -58F);
		bodyModel[262].rotateAngleX = 0.54105207F;

		bodyModel[263].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 269
		bodyModel[263].setRotationPoint(-325F, 34F, 10F);
		bodyModel[263].rotateAngleX = 2.0943951F;

		bodyModel[264].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 270
		bodyModel[264].setRotationPoint(-325F, 34F, 10F);
		bodyModel[264].rotateAngleX = -2.0943951F;

		bodyModel[265].addShapeBox(-6F, -2F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 271
		bodyModel[265].setRotationPoint(-325F, 34F, 10F);

		bodyModel[266].addBox(-3F, -2F, -2F, 4, 4, 4, 0F); // Box 272
		bodyModel[266].setRotationPoint(-325F, 34F, 10F);

		bodyModel[267].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 273
		bodyModel[267].setRotationPoint(-325F, 34F, 10F);

		bodyModel[268].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 274
		bodyModel[268].setRotationPoint(-325F, 34F, -10F);
		bodyModel[268].rotateAngleX = -2.0943951F;

		bodyModel[269].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 275
		bodyModel[269].setRotationPoint(-325F, 34F, -10F);
		bodyModel[269].rotateAngleX = 2.0943951F;

		bodyModel[270].addShapeBox(-6F, -2F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 276
		bodyModel[270].setRotationPoint(-325F, 34F, -10F);

		bodyModel[271].addBox(-3F, -2F, -2F, 4, 4, 4, 0F); // Box 277
		bodyModel[271].setRotationPoint(-325F, 34F, -10F);

		bodyModel[272].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 278
		bodyModel[272].setRotationPoint(-325F, 34F, -10F);

		bodyModel[273].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 279
		bodyModel[273].setRotationPoint(-309F, 32F, -25F);
		bodyModel[273].rotateAngleX = -2.0943951F;

		bodyModel[274].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 280
		bodyModel[274].setRotationPoint(-309F, 32F, -25F);
		bodyModel[274].rotateAngleX = 2.0943951F;

		bodyModel[275].addShapeBox(-6F, -2F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 281
		bodyModel[275].setRotationPoint(-309F, 32F, -25F);

		bodyModel[276].addBox(-3F, -2F, -2F, 4, 4, 4, 0F); // Box 282
		bodyModel[276].setRotationPoint(-309F, 32F, -25F);

		bodyModel[277].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 283
		bodyModel[277].setRotationPoint(-309F, 32F, -25F);

		bodyModel[278].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 284
		bodyModel[278].setRotationPoint(-309F, 32F, 25F);
		bodyModel[278].rotateAngleX = -2.0943951F;

		bodyModel[279].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 285
		bodyModel[279].setRotationPoint(-309F, 32F, 25F);
		bodyModel[279].rotateAngleX = 2.0943951F;

		bodyModel[280].addShapeBox(-6F, -2F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 286
		bodyModel[280].setRotationPoint(-309F, 32F, 25F);

		bodyModel[281].addBox(-3F, -2F, -2F, 4, 4, 4, 0F); // Box 287
		bodyModel[281].setRotationPoint(-309F, 32F, 25F);

		bodyModel[282].addShapeBox(-2F, -8F, -2F, 1, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 288
		bodyModel[282].setRotationPoint(-309F, 32F, 25F);

		bodyModel[283].addBox(0F, -1F, -1F, 22, 2, 2, 0F); // Box 289
		bodyModel[283].setRotationPoint(-309F, 32F, 25F);
		bodyModel[283].rotateAngleY = -0.03490659F;
		bodyModel[283].rotateAngleZ = 0.10471976F;

		bodyModel[284].addBox(0F, -1F, -1F, 22, 2, 2, 0F); // Box 290
		bodyModel[284].setRotationPoint(-309F, 32F, -25F);
		bodyModel[284].rotateAngleY = 0.03490659F;
		bodyModel[284].rotateAngleZ = 0.10471976F;

		bodyModel[285].addBox(0F, -11F, -0.5F, 3, 11, 1, 0F); // Box 291
		bodyModel[285].setRotationPoint(-306F, 32F, -25F);
		bodyModel[285].rotateAngleY = 0.03490659F;
		bodyModel[285].rotateAngleZ = 0.10471976F;

		bodyModel[286].addBox(0F, -11F, -0.5F, 3, 11, 1, 0F); // Box 292
		bodyModel[286].setRotationPoint(-306F, 32F, 25F);
		bodyModel[286].rotateAngleY = -0.01745329F;
		bodyModel[286].rotateAngleZ = 0.10471976F;

		bodyModel[287].addBox(0F, -1F, -1F, 29, 2, 2, 0F); // Box 293
		bodyModel[287].setRotationPoint(-325F, 34F, 10F);
		bodyModel[287].rotateAngleY = -0.03490659F;
		bodyModel[287].rotateAngleZ = 0.10471976F;

		bodyModel[288].addBox(0F, -14F, -0.5F, 3, 13, 1, 0F); // Box 294
		bodyModel[288].setRotationPoint(-322F, 34F, 10F);
		bodyModel[288].rotateAngleY = -0.03490659F;
		bodyModel[288].rotateAngleZ = 0.10471976F;

		bodyModel[289].addBox(0F, -14F, -0.5F, 3, 13, 1, 0F); // Box 295
		bodyModel[289].setRotationPoint(-322F, 34F, -10F);
		bodyModel[289].rotateAngleY = 0.03490659F;
		bodyModel[289].rotateAngleZ = 0.10471976F;

		bodyModel[290].addBox(0F, -1F, -1F, 29, 2, 2, 0F); // Box 296
		bodyModel[290].setRotationPoint(-325F, 34F, -10F);
		bodyModel[290].rotateAngleY = 0.03490659F;
		bodyModel[290].rotateAngleZ = 0.10471976F;

		bodyModel[291].addShapeBox(-20F, 0F, 0F, 50, 30, 1, 0F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -28F, -19F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, -28F, -19F, 0F); // Box 1
		bodyModel[291].setRotationPoint(26F, -300F, -0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 65, 1, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -50F, 0F, 2F, -50F, 0F, 2F, -50F, 0F, 0F, -50F, 0F); // Box 2
		bodyModel[292].setRotationPoint(54F, -250F, -0.5F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[6];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 250, 1400, textureX, textureY); // Box 1
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 313, 1500, textureX, textureY); // Box 2
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 900, 1550, textureX, textureY); // Box 9
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 700, 1400, textureX, textureY); // Box 10
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Box 11

		gun_1_Model[0][0].addShapeBox(-8F, -12F, -22F, 16, 12, 44, 0F,0F, 2F, -6F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(-23F, -14F, -22F, 15, 14, 44, 0F,0F, 1F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -15F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 1

		gun_1_Model[0][2].addShapeBox(8F, -12F, -21F, 10, 12, 42, 0F,0F, 1F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -6F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 2

		gun_1_Model[0][3].addShapeBox(-22.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 9

		gun_1_Model[0][4].addShapeBox(7.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 10

		gun_1_Model[0][5].addBox(-7.5F, 0F, -22.5F, 15, 3, 45, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(51F, -18F, 41F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[6];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 4
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 5
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 10
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 11

		gun_1_Model[2][0].addBox(7F, -10.5F, -12F, 10, 10, 10, 0F); // Box 3

		gun_1_Model[2][1].addShapeBox(17F, -10.5F, -12F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4

		gun_1_Model[2][2].addShapeBox(17F, -10.5F, 2F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 5

		gun_1_Model[2][3].addBox(7F, -10.5F, 2F, 10, 10, 10, 0F); // Box 6

		gun_1_Model[2][4].addShapeBox(25F, -8.5F, 4F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10

		gun_1_Model[2][5].addShapeBox(25F, -8.5F, -10F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(51F, -18F, 41F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 250, 1400, textureX, textureY); // Box 1
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 313, 1500, textureX, textureY); // Box 2
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 900, 1550, textureX, textureY); // Box 9
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 700, 1400, textureX, textureY); // Box 10
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Box 11

		gun_2_Model[0][0].addShapeBox(-8F, -12F, -22F, 16, 12, 44, 0F,0F, 2F, -6F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(-23F, -14F, -22F, 15, 14, 44, 0F,0F, 1F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -15F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 1

		gun_2_Model[0][2].addShapeBox(8F, -12F, -21F, 10, 12, 42, 0F,0F, 1F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -6F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 2

		gun_2_Model[0][3].addShapeBox(-22.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 9

		gun_2_Model[0][4].addShapeBox(7.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 10

		gun_2_Model[0][5].addBox(-7.5F, 0F, -22.5F, 15, 3, 45, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(51F, -18F, -41F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[6];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 4
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 5
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 10
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 11

		gun_2_Model[2][0].addBox(7F, -10.5F, -12F, 10, 10, 10, 0F); // Box 3

		gun_2_Model[2][1].addShapeBox(17F, -10.5F, -12F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4

		gun_2_Model[2][2].addShapeBox(17F, -10.5F, 2F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 5

		gun_2_Model[2][3].addBox(7F, -10.5F, 2F, 10, 10, 10, 0F); // Box 6

		gun_2_Model[2][4].addShapeBox(25F, -8.5F, 4F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10

		gun_2_Model[2][5].addShapeBox(25F, -8.5F, -10F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(51F, -18F, -41F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 0
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 250, 1400, textureX, textureY); // Box 1
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 313, 1500, textureX, textureY); // Box 2
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 900, 1550, textureX, textureY); // Box 9
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 700, 1400, textureX, textureY); // Box 10
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Box 11

		gun_3_Model[0][0].addShapeBox(-8F, -12F, -22F, 16, 12, 44, 0F,0F, 2F, -6F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0

		gun_3_Model[0][1].addShapeBox(-23F, -14F, -22F, 15, 14, 44, 0F,0F, 1F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -15F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 1

		gun_3_Model[0][2].addShapeBox(8F, -12F, -21F, 10, 12, 42, 0F,0F, 1F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -6F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 2

		gun_3_Model[0][3].addShapeBox(-22.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 9

		gun_3_Model[0][4].addShapeBox(7.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 10

		gun_3_Model[0][5].addBox(-7.5F, 0F, -22.5F, 15, 3, 45, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-95F, -17F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[6];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 4
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 5
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 10
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 11

		gun_3_Model[2][0].addBox(7F, -10.5F, -12F, 10, 10, 10, 0F); // Box 3

		gun_3_Model[2][1].addShapeBox(17F, -10.5F, -12F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4

		gun_3_Model[2][2].addShapeBox(17F, -10.5F, 2F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 5

		gun_3_Model[2][3].addBox(7F, -10.5F, 2F, 10, 10, 10, 0F); // Box 6

		gun_3_Model[2][4].addShapeBox(25F, -8.5F, 4F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10

		gun_3_Model[2][5].addShapeBox(25F, -8.5F, -10F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-95F, -17F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 0
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 250, 1400, textureX, textureY); // Box 1
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 313, 1500, textureX, textureY); // Box 2
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 900, 1550, textureX, textureY); // Box 9
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 700, 1400, textureX, textureY); // Box 10
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Box 11

		gun_4_Model[0][0].addShapeBox(-8F, -12F, -22F, 16, 12, 44, 0F,0F, 2F, -6F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0

		gun_4_Model[0][1].addShapeBox(-23F, -14F, -22F, 15, 14, 44, 0F,0F, 1F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -15F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 1

		gun_4_Model[0][2].addShapeBox(8F, -12F, -21F, 10, 12, 42, 0F,0F, 1F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -6F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 2

		gun_4_Model[0][3].addShapeBox(-22.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 9

		gun_4_Model[0][4].addShapeBox(7.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 10

		gun_4_Model[0][5].addBox(-7.5F, 0F, -22.5F, 15, 3, 45, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-220F, -17F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[6];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 4
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 5
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 10
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 11

		gun_4_Model[2][0].addBox(7F, -10.5F, -12F, 10, 10, 10, 0F); // Box 3

		gun_4_Model[2][1].addShapeBox(17F, -10.5F, -12F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4

		gun_4_Model[2][2].addShapeBox(17F, -10.5F, 2F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 5

		gun_4_Model[2][3].addBox(7F, -10.5F, 2F, 10, 10, 10, 0F); // Box 6

		gun_4_Model[2][4].addShapeBox(25F, -8.5F, 4F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10

		gun_4_Model[2][5].addShapeBox(25F, -8.5F, -10F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-220F, -17F, 0F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 400, 1420, textureX, textureY); // Box 0
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 250, 1400, textureX, textureY); // Box 1
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 313, 1500, textureX, textureY); // Box 2
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 900, 1550, textureX, textureY); // Box 9
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 700, 1400, textureX, textureY); // Box 10
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 800, 1500, textureX, textureY); // Box 11

		gun_5_Model[0][0].addShapeBox(-8F, -12F, -22F, 16, 12, 44, 0F,0F, 2F, -6F, 0F, 1F, -7F, 0F, 1F, -7F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0

		gun_5_Model[0][1].addShapeBox(-23F, -14F, -22F, 15, 14, 44, 0F,0F, 1F, -15F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -15F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 1

		gun_5_Model[0][2].addShapeBox(8F, -12F, -21F, 10, 12, 42, 0F,0F, 1F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -6F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 2

		gun_5_Model[0][3].addShapeBox(-22.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 9

		gun_5_Model[0][4].addShapeBox(7.5F, 0F, -22.5F, 15, 3, 45, 0F,0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F); // Box 10

		gun_5_Model[0][5].addBox(-7.5F, 0F, -22.5F, 15, 3, 45, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(172F, -30F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[6];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 4
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 113, 1500, textureX, textureY); // Box 5
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 10
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 1, 1500, textureX, textureY); // Box 11

		gun_5_Model[2][0].addBox(7F, -10.5F, -12F, 10, 10, 10, 0F); // Box 3

		gun_5_Model[2][1].addShapeBox(17F, -10.5F, -12F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4

		gun_5_Model[2][2].addShapeBox(17F, -10.5F, 2F, 8, 10, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 5

		gun_5_Model[2][3].addBox(7F, -10.5F, 2F, 10, 10, 10, 0F); // Box 6

		gun_5_Model[2][4].addShapeBox(25F, -8.5F, 4F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 10

		gun_5_Model[2][5].addShapeBox(25F, -8.5F, -10F, 40, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(172F, -30F, 0F);
		}


		registerGunModel("PassengerGun5", gun_5_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}