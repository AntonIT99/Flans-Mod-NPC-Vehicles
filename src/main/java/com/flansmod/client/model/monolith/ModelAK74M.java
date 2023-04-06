//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.11.2017 - 15:57:40
// Last changed on: 30.11.2017 - 15:57:40

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAK74M extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAK74M() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[227];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 28
		gunModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		gunModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 31
		gunModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 32
		gunModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 33
		gunModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 34
		gunModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 37
		gunModel[31] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 38
		gunModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 39
		gunModel[33] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 40
		gunModel[34] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 41
		gunModel[35] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 42
		gunModel[36] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		gunModel[37] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 44
		gunModel[38] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 45
		gunModel[39] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
		gunModel[40] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 47
		gunModel[41] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 48
		gunModel[42] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 49
		gunModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 50
		gunModel[44] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 51
		gunModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		gunModel[46] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 54
		gunModel[47] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 55
		gunModel[48] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 56
		gunModel[49] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 57
		gunModel[50] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 60
		gunModel[51] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 61
		gunModel[52] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 62
		gunModel[53] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 64
		gunModel[55] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 65
		gunModel[56] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 66
		gunModel[57] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 67
		gunModel[58] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 68
		gunModel[59] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 69
		gunModel[60] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 71
		gunModel[61] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 72
		gunModel[62] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 73
		gunModel[63] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 75
		gunModel[64] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 76
		gunModel[65] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 77
		gunModel[66] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 78
		gunModel[67] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 79
		gunModel[68] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 80
		gunModel[69] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 81
		gunModel[70] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 77
		gunModel[75] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 78
		gunModel[76] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 79
		gunModel[77] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 80
		gunModel[78] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 81
		gunModel[79] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 82
		gunModel[80] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 83
		gunModel[81] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 84
		gunModel[82] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 85
		gunModel[83] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 86
		gunModel[84] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 87
		gunModel[85] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 88
		gunModel[86] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 89
		gunModel[87] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 90
		gunModel[88] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 91
		gunModel[89] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 92
		gunModel[90] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 93
		gunModel[91] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 94
		gunModel[92] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 95
		gunModel[93] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 96
		gunModel[94] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 97
		gunModel[95] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 98
		gunModel[96] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 99
		gunModel[97] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 100
		gunModel[98] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 101
		gunModel[99] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 102
		gunModel[100] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 103
		gunModel[101] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 104
		gunModel[102] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 105
		gunModel[103] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 106
		gunModel[104] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 107
		gunModel[105] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 108
		gunModel[106] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 109
		gunModel[107] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 110
		gunModel[108] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 111
		gunModel[109] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 112
		gunModel[110] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 113
		gunModel[111] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 118
		gunModel[112] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 119
		gunModel[113] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 120
		gunModel[114] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 121
		gunModel[115] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 122
		gunModel[116] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 123
		gunModel[117] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 124
		gunModel[118] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 125
		gunModel[119] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 126
		gunModel[120] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 127
		gunModel[121] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 128
		gunModel[122] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 130
		gunModel[123] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 131
		gunModel[124] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 142
		gunModel[125] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 143
		gunModel[126] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 144
		gunModel[127] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 138
		gunModel[128] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 139
		gunModel[129] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 140
		gunModel[130] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 141
		gunModel[131] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 142
		gunModel[132] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 143
		gunModel[133] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 144
		gunModel[134] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 145
		gunModel[135] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 146
		gunModel[136] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 148
		gunModel[137] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 149
		gunModel[138] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 150
		gunModel[139] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 151
		gunModel[140] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 152
		gunModel[141] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 157
		gunModel[142] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 158
		gunModel[143] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 160
		gunModel[144] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 161
		gunModel[145] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 162
		gunModel[146] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 163
		gunModel[147] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 164
		gunModel[148] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 165
		gunModel[149] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 166
		gunModel[150] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 167
		gunModel[151] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 168
		gunModel[152] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 169
		gunModel[153] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 170
		gunModel[154] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 171
		gunModel[155] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 37
		gunModel[156] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 38
		gunModel[157] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 174
		gunModel[158] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 175
		gunModel[159] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 176
		gunModel[160] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 177
		gunModel[161] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 178
		gunModel[162] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 179
		gunModel[163] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 195
		gunModel[164] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 196
		gunModel[165] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 197
		gunModel[166] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 198
		gunModel[167] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 194
		gunModel[168] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 196
		gunModel[169] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 197
		gunModel[170] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 198
		gunModel[171] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 199
		gunModel[172] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 200
		gunModel[173] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 201
		gunModel[174] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 202
		gunModel[175] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 203
		gunModel[176] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 204
		gunModel[177] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 206
		gunModel[178] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 207
		gunModel[179] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 210
		gunModel[180] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 211
		gunModel[181] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 212
		gunModel[182] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 213
		gunModel[183] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 214
		gunModel[184] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 215
		gunModel[185] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 216
		gunModel[186] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 217
		gunModel[187] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 218
		gunModel[188] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 219
		gunModel[189] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 220
		gunModel[190] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 221
		gunModel[191] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 222
		gunModel[192] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 223
		gunModel[193] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 224
		gunModel[194] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 225
		gunModel[195] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 226
		gunModel[196] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 204
		gunModel[197] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 205
		gunModel[198] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 206
		gunModel[199] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 207
		gunModel[200] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 208
		gunModel[201] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import 
		gunModel[202] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import 
		gunModel[203] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import 
		gunModel[204] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import 
		gunModel[205] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[206] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[207] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[208] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[209] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[210] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import 
		gunModel[211] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import 
		gunModel[212] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import 
		gunModel[213] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import 
		gunModel[214] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[215] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[216] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[217] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[218] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[219] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[220] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[221] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[222] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[223] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[224] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[225] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		gunModel[226] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 

		gunModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F); // Box 0
		gunModel[0].setRotationPoint(-0.35F, -3.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.05F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0F, -0.6F, -0.05F, 0F, 0.6F, -0.05F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0F, 0.6F, -0.05F); // Box 1
		gunModel[1].setRotationPoint(-2.75F, -3.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.4F, -0.6F, -0.05F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.4F, -0.6F, -0.05F, 0.4F, -0.13F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0.4F, -0.13F, -0.2F); // Box 3
		gunModel[2].setRotationPoint(-2.35F, -2.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, -0.05F, -0.35F, 0.1F, -0.05F, -0.35F, 0.1F, 0F); // Box 4
		gunModel[3].setRotationPoint(-3.4F, -3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, 0F); // Box 5
		gunModel[4].setRotationPoint(-3.4F, -3.55F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, -0.05F, -0.35F, -0.35F, 0F, -0.35F, -0.3F, -0.2F, -0.35F, -0.38F, -0.2F, -0.35F, -0.38F, -0.2F, -0.35F, -0.3F, -0.2F); // Box 6
		gunModel[5].setRotationPoint(-3.4F, -2.25F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.7F, 0.4F, -0.25F, -0.7F, 0.4F, -0.25F, -0.1F, 0F, -0.6F, -0.2F, 0F, -0.1F, -0.7F, 0.4F, -0.65F, -0.7F, 0.4F, -0.65F, 0F, 0F, -0.1F, -0.05F); // Box 7
		gunModel[6].setRotationPoint(-2.75F, -3.8F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.4F, 0.5F, -0.38F, -0.4F, 0.4F, -0.38F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.4F, 0.5F, -0.3F, -0.4F, 0.4F, -0.3F, -0.4F, 0F, -0.1F, -0.4F); // Box 8
		gunModel[7].setRotationPoint(-2.75F, -3.8F, -0.6F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.6F, -0.2F, 0.4F, -0.25F, -0.1F, 0.4F, -0.25F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.1F, -0.05F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, -0.7F, 0F, -0.1F, -0.7F); // Box 9
		gunModel[8].setRotationPoint(-2.75F, -3.8F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, -0.4F, 0.4F, -0.38F, -0.4F, 0.5F, -0.38F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.1F, -0.4F, 0.4F, -0.3F, -0.4F, 0.5F, -0.3F, -0.4F, 0F, -0.1F, -0.4F); // Box 10
		gunModel[9].setRotationPoint(-2.75F, -3.8F, -0.4F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F); // Box 11
		gunModel[10].setRotationPoint(-3.85F, -3F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.35F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, 0.35F, 0.2F, -0.2F, 0.25F, 1.1F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.25F, 1.1F, -0.2F); // Box 12
		gunModel[11].setRotationPoint(-7.45F, -3F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.25F, -0.35F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.25F, -0.35F, -0.25F, 0.15F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.15F, -0.3F, 0F); // Box 13
		gunModel[12].setRotationPoint(-7.65F, -3.9F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.25F, -0.4F, -0.65F, -0.2F, -0.4F, -0.65F, -0.2F, 0F, -0.4F, -0.25F, 0F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.3F, 0F); // Box 14
		gunModel[13].setRotationPoint(-3.65F, -3.9F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.25F, -0.4F, -0.65F, -0.2F, -0.4F, -0.65F, -0.2F, 0F, -0.5F, -0.25F); // Box 15
		gunModel[14].setRotationPoint(-3.65F, -1.9F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.35F, -1.8F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.35F, -1.8F, 0F, 0.4F, 1.3F, -0.25F, -0.2F, 0.3F, -0.25F, -0.2F, 0.3F, -0.25F, 0.4F, 1.3F, -0.25F); // Box 16
		gunModel[15].setRotationPoint(-7.45F, -2.7F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.2F, 0.05F); // Box 18
		gunModel[16].setRotationPoint(9.85F, -3.65F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F); // Box 19
		gunModel[17].setRotationPoint(9.25F, -3.65F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, 0.1F, 0.05F, 0.4F, 0.1F, 0.05F, 0.4F, 0.1F, 0.05F, 0.35F, 0.1F, 0.05F, 0.35F, -0.2F, 0.05F, 0.4F, -0.2F, 0.05F, 0.4F, -0.2F, 0.05F, 0.35F, -0.2F, 0.05F); // Box 20
		gunModel[18].setRotationPoint(8.25F, -3.65F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 1F, -0.3F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 1F, -0.3F, 0.05F, 1F, -0.4F, -0.2F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.2F, 1F, -0.4F, -0.2F); // Box 21
		gunModel[19].setRotationPoint(10.85F, -3.15F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, -0.3F, 0.05F); // Box 22
		gunModel[20].setRotationPoint(8.85F, -3.15F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.1F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, -0.5F, -0.1F, 0.05F); // Box 23
		gunModel[21].setRotationPoint(7.95F, -3.15F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F, 0.05F); // Box 24
		gunModel[22].setRotationPoint(7.85F, -3.15F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.3F, -0.3F, 0.05F, -0.35F, -0.1F, 0.05F, -0.35F, -0.1F, 0.05F, -0.3F, -0.3F, 0.05F); // Box 25
		gunModel[23].setRotationPoint(7.6F, -3.15F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 28
		gunModel[24].setRotationPoint(9.85F, -4.7F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -0.2F, -0.3F, -0.4F, 0.1F, -0.3F, -0.4F, 0.5F, -0.2F, -0.45F, 0F, -0.3F, -0.45F, -0.2F, -0.4F, -0.4F, 0.1F, -0.35F, -0.4F); // Box 29
		gunModel[25].setRotationPoint(10.15F, -3.65F, 0.1F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.2F, -0.35F, -0.25F, 0F, -0.38F, -0.25F, 0F, -0.38F, -0.25F, 0.2F, -0.35F, -0.25F, 0.2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.2F, -0.35F, 0F); // Box 31
		gunModel[26].setRotationPoint(9.85F, -5.05F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.3F, -0.45F, 0F); // Box 32
		gunModel[27].setRotationPoint(12.1F, -4.35F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.3F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.3F, -0.45F, 0F); // Box 33
		gunModel[28].setRotationPoint(10.45F, -4.35F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.35F, -0.45F, 0F, -0.55F, -0.45F, 0F); // Box 34
		gunModel[29].setRotationPoint(9.1F, -4.35F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F); // Box 37
		gunModel[30].setRotationPoint(12.45F, -4.7F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F); // Box 38
		gunModel[31].setRotationPoint(12.45F, -5.05F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 39
		gunModel[32].setRotationPoint(12.45F, -3.95F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.58F, -0.25F, 0F, -0.58F, -0.25F, 0F, -0.58F, -0.25F, 1F, -0.58F, -0.25F); // Box 40
		gunModel[33].setRotationPoint(12.05F, -3.15F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.3F, -0.05F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F, -0.4F, -0.05F, -0.05F); // Box 41
		gunModel[34].setRotationPoint(9.05F, -4.7F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.38F, -0.3F, -0.4F, -0.38F, -0.3F, -0.4F, -0.38F, -0.3F, -0.4F, -0.38F, -0.3F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F, -0.4F, -0.35F, -0.05F); // Box 42
		gunModel[35].setRotationPoint(9.05F, -5.05F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.3F, -0.15F, -0.4F, -0.05F, -0.15F, -0.4F, -0.05F, -0.15F, -0.4F, -0.05F, -0.15F, -0.4F, -0.05F, -0.15F); // Box 43
		gunModel[36].setRotationPoint(8.95F, -4.6F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.38F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.38F, -0.35F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F); // Box 44
		gunModel[37].setRotationPoint(8.95F, -4.95F, -0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, -0.3F, -0.1F, -0.45F, 0.3F, -0.1F, -0.45F, 0.3F, -0.1F, -0.45F, 0.3F, -0.1F, -0.45F, 0.3F, -0.1F); // Box 45
		gunModel[38].setRotationPoint(6.8F, -4.8F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.2F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 46
		gunModel[39].setRotationPoint(8.65F, -5.1F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.4F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 47
		gunModel[40].setRotationPoint(7.25F, -5.05F, -0.2F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.45F, -0.1F, -0.35F, -0.45F, -0.1F, -0.35F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.4F, 0F, -0.45F, -0.4F); // Box 48
		gunModel[41].setRotationPoint(7.25F, -5.05F, -0.8F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 49
		gunModel[42].setRotationPoint(7.75F, -5.05F, -0.2F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 50
		gunModel[43].setRotationPoint(7.75F, -5.05F, -0.75F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 51
		gunModel[44].setRotationPoint(7.95F, -5.05F, -0.2F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.45F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.45F); // Box 52
		gunModel[45].setRotationPoint(7.95F, -5.05F, -0.75F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F); // Box 54
		gunModel[46].setRotationPoint(8.15F, -5.05F, -0.25F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.15F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F); // Box 55
		gunModel[47].setRotationPoint(8.15F, -5.05F, -0.25F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.15F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F); // Box 56
		gunModel[48].setRotationPoint(8.15F, -5.05F, -0.75F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.4F, -0.5F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F); // Box 57
		gunModel[49].setRotationPoint(8.15F, -5.05F, -0.75F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.15F, -0.35F, -0.25F, -0.15F, -0.35F, -0.25F, -0.15F, -0.4F, -0.2F, -0.15F, -0.4F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F); // Box 60
		gunModel[50].setRotationPoint(8.4F, -5.05F, -0.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F, 0.1F, -0.45F, -0.3F); // Box 61
		gunModel[51].setRotationPoint(7.25F, -5.22F, -0.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F); // Box 62
		gunModel[52].setRotationPoint(8.05F, -5.22F, -0.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 63
		gunModel[53].setRotationPoint(7F, -5.27F, -0.25F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 64
		gunModel[54].setRotationPoint(7F, -5.27F, -0.75F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F); // Box 65
		gunModel[55].setRotationPoint(6.55F, -5.26F, -0.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.35F); // Box 66
		gunModel[56].setRotationPoint(6.55F, -5.41F, -0.7F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.5F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.35F, -0.5F, -0.45F, -0.35F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 67
		gunModel[57].setRotationPoint(6.55F, -5.41F, -0.3F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.05F, -0.3F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.05F, -0.35F, 0F); // Box 68
		gunModel[58].setRotationPoint(7.2F, -4.25F, -0.5F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.1F, -0.3F, 0F); // Box 69
		gunModel[59].setRotationPoint(6.25F, -4.3F, -0.5F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.35F, -0.4F, 0.05F, 0.7F, -0.4F, 0.05F, 0.7F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.35F, -0.2F, 0.05F, 0.4F, -0.2F, 0.05F, 0.4F, -0.2F, 0.05F, -0.35F, -0.2F, 0.05F); // Box 71
		gunModel[60].setRotationPoint(-0.2F, -4.3F, -0.5F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.25F, 0.7F, -0.4F, -0.25F, 0.7F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0.3F, -0.2F, -0.25F, 0.7F, -0.2F, -0.25F, 0.7F, -0.2F, 0.05F, 0.3F, -0.2F, 0.05F); // Box 72
		gunModel[61].setRotationPoint(2.5F, -4.3F, -0.5F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.05F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0.05F, -0.05F, -0.4F, 0.05F, -0.05F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, -0.45F, 0.05F, -0.05F, -0.45F, 0.05F); // Box 73
		gunModel[62].setRotationPoint(6.25F, -4.3F, -0.5F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.15F, -0.4F, -0.1F, 0.6F, -0.4F, -0.1F, 0.6F, -0.4F, -0.1F, -0.15F, -0.4F, -0.1F, -0.05F, -0.4F, 0.05F, 0.6F, -0.4F, 0.05F, 0.6F, -0.4F, 0.05F, -0.05F, -0.4F, 0.05F); // Box 75
		gunModel[63].setRotationPoint(0.1F, -4.5F, -0.5F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, -0.3F, -0.35F, -0.2F, 0.8F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0.05F, -0.4F, -0.1F, 0.6F, -0.4F, -0.1F, 0.6F, -0.4F, -0.1F, 0.05F, -0.4F, -0.1F); // Box 76
		gunModel[64].setRotationPoint(0.1F, -4.7F, -0.5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.55F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.3F, -0.45F, -0.2F, 0.15F, -0.45F, -0.2F, 0.15F, -0.45F, -0.2F, -0.3F, -0.45F, -0.2F); // Box 77
		gunModel[65].setRotationPoint(0.1F, -4.9F, -0.5F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.2F, 0.05F, -0.35F, -0.2F, 0.05F, -0.35F, -0.2F, 0.05F, -0.3F, -0.2F, 0.05F, -0.2F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // Box 78
		gunModel[66].setRotationPoint(-0.5F, -4.1F, -0.5F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, -0.55F, -0.4F, -0.1F, -0.3F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.35F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F); // Box 79
		gunModel[67].setRotationPoint(-0.5F, -4.5F, -0.5F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.3F, 0.6F, -0.35F, -0.3F, 0.6F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, 0.05F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.6F, -0.4F, -0.3F, 0.05F, -0.4F, -0.3F); // Box 80
		gunModel[68].setRotationPoint(-0.25F, -4.55F, -0.5F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.4F, -0.4F, -0.5F, -0.05F, -0.4F, -0.5F, -0.05F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.05F, -0.4F, -0.5F, -0.05F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 81
		gunModel[69].setRotationPoint(4.3F, -4.5F, -0.5F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.5F, -0.25F, -0.35F, -0.5F, -0.25F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F); // Box 73
		gunModel[70].setRotationPoint(4.5F, -4.7F, -0.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F); // Box 74
		gunModel[71].setRotationPoint(2.1F, -4.7F, -0.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F); // Box 75
		gunModel[72].setRotationPoint(2.1F, -4.9F, -0.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 76
		gunModel[73].setRotationPoint(2.1F, -4.5F, -0.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F); // Box 77
		gunModel[74].setRotationPoint(4.1F, -4.7F, -0.5F);

		gunModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 78
		gunModel[75].setRotationPoint(4.1F, -4.5F, -0.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F); // Box 79
		gunModel[76].setRotationPoint(4.1F, -4.9F, -0.5F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F); // Box 80
		gunModel[77].setRotationPoint(6.1F, -4.7F, -0.5F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, 0.05F, -0.4F, -0.4F, 0.05F); // Box 81
		gunModel[78].setRotationPoint(6.1F, -4.5F, -0.5F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.35F, -0.37F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F, -0.4F, -0.45F, -0.15F); // Box 82
		gunModel[79].setRotationPoint(6.1F, -4.9F, -0.5F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F); // Box 83
		gunModel[80].setRotationPoint(3.1F, -4.95F, -0.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F); // Box 84
		gunModel[81].setRotationPoint(5.1F, -4.95F, -0.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F); // Box 85
		gunModel[82].setRotationPoint(1.1F, -4.95F, -0.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 86
		gunModel[83].setRotationPoint(0.05F, -4.2F, -0.82F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 87
		gunModel[84].setRotationPoint(0.05F, -4.2F, -0.18F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, -0.5F, -0.45F, -0.4F, 0.05F, -0.45F, -0.4F, 0.05F, -0.45F, -0.35F, -0.5F, -0.45F, -0.45F, -0.5F, -0.45F, -0.45F, 0.05F, -0.45F, -0.35F, 0.05F); // Box 88
		gunModel[85].setRotationPoint(5.75F, -4.3F, -0.5F);

		gunModel[86].addShapeBox(0F, -0.05F, 0F, 1, 2, 1, 0F, -0.3F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.3F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F, -0.2F, 0.1F, -0.05F); // Box 89
		gunModel[86].setRotationPoint(-8.25F, -3F, -0.5F);
		gunModel[86].rotateAngleZ = 0.03490659F;

		gunModel[87].addShapeBox(0F, 1.95F, 0F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.1F, -0.4F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.1F, -0.4F, -0.3F); // Box 90
		gunModel[87].setRotationPoint(-8.25F, -3F, -0.5F);
		gunModel[87].rotateAngleZ = 0.03490659F;

		gunModel[88].addShapeBox(0F, -1.05F, 0F, 1, 1, 1, 0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.55F, -0.3F, -0.3F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F); // Box 91
		gunModel[88].setRotationPoint(-8.25F, -3F, -0.5F);
		gunModel[88].rotateAngleZ = 0.03490659F;

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 92
		gunModel[89].setRotationPoint(12.75F, -4.05F, -0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 93
		gunModel[90].setRotationPoint(12.75F, -3.85F, -0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 94
		gunModel[91].setRotationPoint(12.75F, -4.05F, -0.5F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 95
		gunModel[92].setRotationPoint(12.75F, -3.65F, -0.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 96
		gunModel[93].setRotationPoint(15.45F, -4.05F, -0.5F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 97
		gunModel[94].setRotationPoint(15.45F, -3.85F, -0.5F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 98
		gunModel[95].setRotationPoint(15.45F, -3.65F, -0.5F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F); // Box 99
		gunModel[96].setRotationPoint(18.65F, -3.85F, -0.5F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F); // Box 100
		gunModel[97].setRotationPoint(18.65F, -4.05F, -0.5F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F); // Box 101
		gunModel[98].setRotationPoint(18.65F, -3.65F, -0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 102
		gunModel[99].setRotationPoint(12.75F, -3.85F, -0.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 103
		gunModel[100].setRotationPoint(12.75F, -4.05F, -0.5F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 104
		gunModel[101].setRotationPoint(12.75F, -3.65F, -0.5F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 105
		gunModel[102].setRotationPoint(12.15F, -4.65F, -0.5F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 106
		gunModel[103].setRotationPoint(12.15F, -4.85F, -0.5F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 107
		gunModel[104].setRotationPoint(12.15F, -4.45F, -0.5F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, 0.24F, -0.4F, -0.25F, 0.24F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 108
		gunModel[105].setRotationPoint(12.75F, -4.65F, -0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F, -0.1F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F); // Box 109
		gunModel[106].setRotationPoint(12.75F, -4.85F, -0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.1F, -0.4F, -0.25F, 0.24F, -0.4F, -0.25F, 0.24F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, 0.25F, -0.45F, -0.4F, -0.1F, -0.45F, -0.4F); // Box 110
		gunModel[107].setRotationPoint(12.75F, -4.45F, -0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F); // Box 111
		gunModel[108].setRotationPoint(15.65F, -3.5F, -0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F); // Box 112
		gunModel[109].setRotationPoint(18.75F, -3.55F, -0.5F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.15F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.4F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F); // Box 113
		gunModel[110].setRotationPoint(15.1F, -4.3F, -0.5F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Box 118
		gunModel[111].setRotationPoint(18.65F, -4.05F, -0.5F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.16F, -0.3F, -0.15F, -0.16F, -0.3F, -0.15F, -0.16F, -0.3F, -0.35F, -0.16F, -0.3F, -0.25F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F); // Box 119
		gunModel[112].setRotationPoint(18.65F, -4.8F, -0.5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F); // Box 120
		gunModel[113].setRotationPoint(18.95F, -4.4F, -0.5F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F); // Box 121
		gunModel[114].setRotationPoint(18.4F, -4.4F, -0.5F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.25F, 0.4F, -0.25F, -0.25F, 0.4F, -0.25F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.1F, -0.25F, 0.4F, -0.65F, -0.25F, 0.4F, -0.65F, -0.25F, 0F, -0.1F, -0.25F); // Box 122
		gunModel[115].setRotationPoint(-1.75F, -3.7F, -0.5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 123
		gunModel[116].setRotationPoint(18.75F, -5.25F, -0.65F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F); // Box 124
		gunModel[117].setRotationPoint(18.75F, -5.45F, -0.65F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F); // Box 125
		gunModel[118].setRotationPoint(18.75F, -5.45F, -0.35F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F); // Box 126
		gunModel[119].setRotationPoint(18.75F, -5.25F, -0.35F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F); // Box 127
		gunModel[120].setRotationPoint(18.75F, -5.15F, -0.5F);

		gunModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.4F, -0.47F, -0.45F, -0.4F, -0.47F, -0.45F, -0.4F, -0.47F, -0.45F, -0.4F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F); // Box 128
		gunModel[121].setRotationPoint(18.75F, -5.33F, -0.5F);

		gunModel[122].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F); // Box 130
		gunModel[122].setRotationPoint(12.25F, -3.4F, -0.5F);

		gunModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 131
		gunModel[123].setRotationPoint(18.55F, -3.4F, -0.5F);

		gunModel[124].addShapeBox(0F, -0.5F, -1F, 3, 1, 1, 0F, -0.4F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F); // Box 142
		gunModel[124].setRotationPoint(1.3F, -3F, 0.1F);

		gunModel[125].addShapeBox(0F, -0.5F, -1F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.6F, -0.4F, -0.5F, -0.6F); // Box 143
		gunModel[125].setRotationPoint(1.1F, -3F, 0.1F);

		gunModel[126].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.55F, -0.3F, -0.3F, -0.55F, -0.3F, -0.5F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.55F, -0.3F, -0.5F, -0.55F); // Box 144
		gunModel[126].setRotationPoint(1.05F, -4F, -0.95F);

		gunModel[127].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -0.15F, -0.55F, -0.3F, -0.1F, -0.55F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F); // Box 138
		gunModel[127].setRotationPoint(1.35F, -4F, -0.95F);

		gunModel[128].addShapeBox(0F, 0.5F, 0F, 2, 1, 1, 0F, -0.7F, 0F, -0.3F, 0.35F, -0.4F, -0.3F, 0.35F, -0.4F, -0.55F, -0.7F, 0F, -0.55F, -0.7F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.55F, -0.7F, -0.3F, -0.55F); // Box 139
		gunModel[128].setRotationPoint(1.95F, -4F, -0.95F);

		gunModel[129].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.55F, -0.3F, -0.15F, -0.55F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.55F, -0.3F, -0.3F, -0.55F); // Box 140
		gunModel[129].setRotationPoint(1.95F, -4F, -0.95F);

		gunModel[130].addShapeBox(0F, 0.5F, 0F, 2, 1, 1, 0F, -0.7F, 0F, -0.3F, 0.35F, -0.4F, -0.3F, 0.35F, -0.4F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.6F, -0.7F, -0.3F, -0.6F); // Box 141
		gunModel[130].setRotationPoint(1.95F, -4.05F, -0.9F);

		gunModel[131].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.6F, -0.3F, -0.15F, -0.6F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F); // Box 142
		gunModel[131].setRotationPoint(1.95F, -4.05F, -0.9F);

		gunModel[132].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.6F, -0.3F, -0.1F, -0.6F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F); // Box 143
		gunModel[132].setRotationPoint(1.35F, -4F, -0.9F);

		gunModel[133].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.35F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.55F, -0.4F, -0.3F, -0.55F, -0.2F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.55F, -0.2F, -0.25F, -0.55F); // Box 144
		gunModel[133].setRotationPoint(3.9F, -3.95F, -0.95F);

		gunModel[134].addShapeBox(0F, 0.5F, 0F, 1, 1, 1, 0F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F, -0.15F, -0.45F, -0.35F); // Box 145
		gunModel[134].setRotationPoint(3.95F, -3.7F, -1.15F);

		gunModel[135].addShapeBox(0F, -0.5F, -1F, 1, 1, 1, 0F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.6F, -0.37F, -0.37F, -0.6F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.2F, -0.37F, -0.37F, -0.6F, -0.37F, -0.37F, -0.6F); // Box 146
		gunModel[135].setRotationPoint(1.25F, -3.1F, 0.0500000000000003F);

		gunModel[136].addShapeBox(0F, -0.5F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F); // Box 148
		gunModel[136].setRotationPoint(0.6F, -3F, -1F);

		gunModel[137].addShapeBox(0F, -0.5F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F); // Box 149
		gunModel[137].setRotationPoint(-0.5F, -3.3F, -1F);

		gunModel[138].addShapeBox(0F, -0.5F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F); // Box 150
		gunModel[138].setRotationPoint(7.1F, -3.35F, -1F);

		gunModel[139].addShapeBox(0F, -0.5F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F); // Box 151
		gunModel[139].setRotationPoint(6.5F, -3.35F, -1F);

		gunModel[140].addShapeBox(0F, -0.5F, 0F, 1, 1, 2, 0F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F, -0.4F, -0.4F, -0.42F); // Box 152
		gunModel[140].setRotationPoint(5.6F, -2.75F, -1F);

		gunModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 157
		gunModel[141].setRotationPoint(3.4F, -2.5F, -0.5F);

		gunModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 158
		gunModel[142].setRotationPoint(3.4F, -2.15F, -0.5F);

		gunModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F, -0.2F, -0.25F, -0.05F); // Box 160
		gunModel[143].setRotationPoint(3.4F, -3F, -0.5F);

		gunModel[144].addShapeBox(-0.5F, -0.2F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 161
		gunModel[144].setRotationPoint(3.87F, -1.75F, -0.5F);
		gunModel[144].rotateAngleZ = -0.59341195F;

		gunModel[145].addShapeBox(-0.5F, -0.2F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 162
		gunModel[145].setRotationPoint(1.86F, -1.75F, -0.5F);
		gunModel[145].rotateAngleZ = 0.59341195F;

		gunModel[146].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.45F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F, 0.25F, -0.4F, -0.3F); // Box 163
		gunModel[146].setRotationPoint(2.85F, -1.6F, -0.5F);

		gunModel[147].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F); // Box 164
		gunModel[147].setRotationPoint(1.85F, -2.4F, -0.5F);

		gunModel[148].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, -0.02F, 0.5F, -0.3F, -0.02F, 0.5F, -0.3F, -0.02F, 0.3F, -0.3F, -0.02F, 0.3F, -0.3F, -0.02F, 0.5F, -0.3F, -0.02F, 0.5F, -0.3F, -0.02F, 0.3F, -0.3F, -0.02F); // Box 165
		gunModel[148].setRotationPoint(0.85F, -2.5F, -0.5F);

		gunModel[149].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, 0.3F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 166
		gunModel[149].setRotationPoint(0.85F, -2.1F, -0.5F);

		gunModel[150].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.25F, -0.4F, -0.1F, 0.25F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 167
		gunModel[150].setRotationPoint(0.85F, -1.8F, -0.5F);

		gunModel[151].addShapeBox(-0.5F, -0.25F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0.65F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.65F, 0F, -0.1F); // Box 168
		gunModel[151].setRotationPoint(0.85F, -1.2F, -0.5F);

		gunModel[152].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, 0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, -0.25F, -0.6F, -0.1F, -0.25F, -0.6F, -0.1F, 0.2F, -0.75F, -0.1F); // Box 169
		gunModel[152].setRotationPoint(0.45F, 0.8F, -0.5F);

		gunModel[153].addShapeBox(-0.5F, -0.25F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.1F, -0.6F, -0.2F, -0.1F, -0.6F, -0.2F, -0.1F, -0.25F, 0F, -0.1F, 0F, -0.6F, -0.1F, -0.7F, -0.6F, -0.1F, -0.7F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 170
		gunModel[153].setRotationPoint(1.2F, 0.8F, -0.5F);

		gunModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F); // Box 171
		gunModel[154].setRotationPoint(3.55F, -2F, -0.5F);
		gunModel[154].rotateAngleZ = -0.15707963F;

		gunModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F); // Box 37
		gunModel[155].setRotationPoint(1.95F, -2.65F, -0.45F);

		gunModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.7F, -0.3F, -0.4F); // Box 38
		gunModel[156].setRotationPoint(1.85F, -2.2F, -0.45F);

		gunModel[157].addShapeBox(-0.5F, -0.25F, 0F, 1, 2, 1, 0F, -0.1F, 0.2F, -0.05F, -0.1F, 0.45F, -0.05F, -0.1F, 0.45F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F); // Box 174
		gunModel[157].setRotationPoint(0.85F, -1.2F, -0.5F);
		gunModel[157].rotateAngleZ = -0.31415927F;

		gunModel[158].addShapeBox(-0.15F, -0.25F, 0F, 1, 2, 1, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.4F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F); // Box 175
		gunModel[158].setRotationPoint(0.85F, -1.2F, -0.5F);
		gunModel[158].rotateAngleZ = -0.31415927F;

		gunModel[159].addShapeBox(-0.85F, -0.25F, 0F, 1, 2, 1, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F); // Box 176
		gunModel[159].setRotationPoint(0.85F, -1.2F, -0.5F);
		gunModel[159].rotateAngleZ = -0.31415927F;

		gunModel[160].addShapeBox(-0.5F, 1.4F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F); // Box 177
		gunModel[160].setRotationPoint(0.85F, -1.2F, -0.5F);
		gunModel[160].rotateAngleZ = -0.31415927F;

		gunModel[161].addShapeBox(-0.4F, -1F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.05F, -0.45F, 0F, -0.2F, -0.45F, 0F); // Box 178
		gunModel[161].setRotationPoint(0.85F, -1.2F, -0.5F);

		gunModel[162].addShapeBox(-0.1F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F); // Box 179
		gunModel[162].setRotationPoint(-1.5F, -3.8F, -0.5F);
		gunModel[162].rotateAngleZ = 0.17453293F;

		gunModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F); // Box 195
		gunModel[163].setRotationPoint(12.45F, -3.85F, 0.25F);

		gunModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F); // Box 196
		gunModel[164].setRotationPoint(12.45F, -4.2F, 0F);

		gunModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F); // Box 197
		gunModel[165].setRotationPoint(12.45F, -3.5F, 0F);

		gunModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.3F, -0.02F, -0.4F, -0.3F, -0.02F, -0.4F, -0.3F, -0.02F, -0.4F, -0.3F, -0.02F, -0.4F, 0F, -0.02F, -0.4F, 0F, -0.02F, -0.4F, 0F, -0.02F, -0.4F, 0F, -0.02F); // Box 198
		gunModel[166].setRotationPoint(8.65F, -4.8F, -0.5F);

		gunModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.35F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.35F, 0.1F, 0F, 0.35F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 194
		gunModel[167].setRotationPoint(-7.45F, -3.1F, -0.5F);

		gunModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0.35F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, 0.35F, -0.9F, 0F, 0.35F, 1.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0.35F, 1.1F, 0F); // Box 196
		gunModel[168].setRotationPoint(-7.45F, -3F, -0.5F);

		gunModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.35F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0.35F, -0.5F, 0F); // Box 197
		gunModel[169].setRotationPoint(-7.45F, -2.6F, -0.5F);

		gunModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.35F, 0F, -0.55F, -0.35F, 0F, -0.55F, -0.35F, 0F, -0.4F, -0.35F, 0F); // Box 198
		gunModel[170].setRotationPoint(-7.15F, -3F, -0.5F);

		gunModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0F, -0.55F, -0.35F, 0F, -0.55F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 199
		gunModel[171].setRotationPoint(-7.15F, -2.7F, -0.5F);

		gunModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.55F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.55F, -0.35F, 0F, -0.35F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 200
		gunModel[172].setRotationPoint(-4.25F, -2.7F, -0.5F);

		gunModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.55F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.55F, -0.35F, 0F); // Box 201
		gunModel[173].setRotationPoint(-4.25F, -3F, -0.5F);

		gunModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, 0F, -0.35F, 0.05F); // Box 202
		gunModel[174].setRotationPoint(9.85F, -4.1F, -0.5F);

		gunModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F, -0.3F, -0.35F, 0.05F); // Box 203
		gunModel[175].setRotationPoint(12.15F, -4.1F, -0.5F);

		gunModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F, -0.4F, -0.35F, 0.05F); // Box 204
		gunModel[176].setRotationPoint(9.25F, -4.1F, -0.5F);

		gunModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.1F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, 0F, -0.2F, -0.45F, 0.5F, -0.2F, -0.45F, 0.1F, -0.35F, -0.4F, -0.2F, -0.4F, -0.4F, 0F, -0.3F, -0.45F, 0.5F, -0.2F, -0.45F); // Box 206
		gunModel[177].setRotationPoint(10.15F, -3.65F, -1.1F);

		gunModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.15F); // Box 207
		gunModel[178].setRotationPoint(19.2F, -3.85F, -0.5F);

		gunModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.5F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.15F); // Box 210
		gunModel[179].setRotationPoint(19.2F, -4.15F, -0.5F);

		gunModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.1F, -0.4F, -0.35F, -0.15F, -0.4F, -0.5F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.5F, -0.35F); // Box 211
		gunModel[180].setRotationPoint(19.2F, -3.55F, -0.5F);

		gunModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F); // Box 212
		gunModel[181].setRotationPoint(19.45F, -3.85F, -0.5F);

		gunModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F); // Box 213
		gunModel[182].setRotationPoint(19.45F, -4.15F, -0.5F);

		gunModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.35F, -0.1F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F, -0.34F, -0.4F, -0.35F); // Box 214
		gunModel[183].setRotationPoint(19.45F, -3.55F, -0.5F);

		gunModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F); // Box 215
		gunModel[184].setRotationPoint(19.65F, -3.85F, -0.5F);

		gunModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F); // Box 216
		gunModel[185].setRotationPoint(19.65F, -4.1F, -0.5F);

		gunModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.15F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F); // Box 217
		gunModel[186].setRotationPoint(19.65F, -3.6F, -0.5F);

		gunModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.25F, -0.4F, -0.35F, -0.25F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F); // Box 218
		gunModel[187].setRotationPoint(21.15F, -4.1F, -0.5F);

		gunModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F); // Box 219
		gunModel[188].setRotationPoint(21.45F, -3.85F, -0.5F);

		gunModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F); // Box 220
		gunModel[189].setRotationPoint(21.45F, -4.1F, -0.5F);

		gunModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F); // Box 221
		gunModel[190].setRotationPoint(21.45F, -3.6F, -0.5F);

		gunModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.25F, -0.45F, -0.35F); // Box 222
		gunModel[191].setRotationPoint(21.15F, -3.55F, -0.5F);

		gunModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F); // Box 223
		gunModel[192].setRotationPoint(21.65F, -3.85F, -0.5F);

		gunModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F); // Box 224
		gunModel[193].setRotationPoint(21.65F, -4.05F, -0.5F);

		gunModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F); // Box 225
		gunModel[194].setRotationPoint(21.65F, -3.65F, -0.5F);

		gunModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.35F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.05F, -0.4F, -0.4F, -0.35F, -0.4F, -0.4F, -0.35F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, 0.1F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F); // Box 226
		gunModel[195].setRotationPoint(15.15F, -4.15F, -0.5F);

		gunModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.05F, -0.2F, -0.2F, 0.05F); // Box 204
		gunModel[196].setRotationPoint(-0.4F, -3.5F, -0.5F);

		gunModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F); // Box 205
		gunModel[197].setRotationPoint(-0.4F, -3.15F, -0.4F);

		gunModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F); // Box 206
		gunModel[198].setRotationPoint(0.8F, -3.15F, -0.35F);

		gunModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F); // Box 207
		gunModel[199].setRotationPoint(0.8F, -3.5F, -0.35F);

		gunModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, 0.05F, -0.2F, -0.45F, 0.05F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.05F, -0.2F, -0.2F, 0.05F); // Box 208
		gunModel[200].setRotationPoint(0.6F, -3.5F, -0.5F);

		gunModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[201].setRotationPoint(8F, -4.6F, -0.4F);

		gunModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[202].setRotationPoint(8F, -4.5F, -0.4F);

		gunModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[203].setRotationPoint(8F, -4.4F, -0.4F);

		gunModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[204].setRotationPoint(8F, -4.3F, -0.4F);

		gunModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[205].setRotationPoint(8F, -4.2F, -0.4F);

		gunModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[206].setRotationPoint(8F, -4.1F, -0.4F);

		gunModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[207].setRotationPoint(8F, -4F, -0.4F);

		gunModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[208].setRotationPoint(8F, -3.9F, -0.4F);

		gunModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[209].setRotationPoint(8F, -3.8F, -0.4F);

		gunModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.8F, -0.95F, -0.8F, 1.8F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.8F, 0.0F, -0.8F, 1.8F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[210].setRotationPoint(8F, -4.6F, -1.4F);

		gunModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[211].setRotationPoint(8F, -4.5F, -1.4F);

		gunModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[212].setRotationPoint(8F, -4.4F, -1.4F);

		gunModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 1.9F, -0.95F, -0.8F, 1.9F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 1.9F, 0.0F, -0.8F, 1.9F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[213].setRotationPoint(8F, -4.3F, -1.4F);

		gunModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[214].setRotationPoint(8F, -4.2F, -1.4F);

		gunModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[215].setRotationPoint(8F, -4.1F, -1.4F);

		gunModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[216].setRotationPoint(8F, -4F, -1.4F);

		gunModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[217].setRotationPoint(8F, -3.9F, -1.4F);

		gunModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.0F, -0.95F, -0.8F, 0.7F, -0.95F, -0.8F, 0.7F, -0.95F, 0F, 0.0F, -0.95F, 0F, 0.0F, 0.0F, -0.8F, 0.7F, 0.0F, -0.8F, 0.7F, 0.0F, 0F, 0.0F, 0.0F, 0F); // Import 
		gunModel[218].setRotationPoint(8F, -3.8F, -1.4F);

		gunModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, -0.9F, 0F, 0.05F, -0.9F, 0F, 0.05F, 0F, -0.9F, 0.05F, 0F, -0.9F, -0.45F, -0.9F, 0F, -0.45F, -0.9F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Import 
		gunModel[219].setRotationPoint(11.8F, -3.5F, -0.4F);

		gunModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, -0.9F, 0F, 0.05F, -0.9F, 0F, 0.05F, 0F, -0.9F, 0.05F, 0F, -0.9F, -0.45F, -0.9F, 0F, -0.45F, -0.9F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Import 
		gunModel[220].setRotationPoint(11.67F, -3.5F, -0.4F);

		gunModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, -0.9F, 0F, 0.05F, -0.9F, 0F, 0.05F, 0F, -0.9F, 0.05F, 0F, -0.9F, -0.45F, -0.9F, 0F, -0.45F, -0.9F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Import 
		gunModel[221].setRotationPoint(11.55F, -3.5F, -0.4F);

		gunModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, -0.9F, 0F, 0.05F, -0.9F, 0F, 0.05F, 0F, -0.9F, 0.05F, 0F, -0.9F, -0.45F, -0.9F, 0F, -0.45F, -0.9F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Import 
		gunModel[222].setRotationPoint(11.42F, -3.5F, -0.4F);

		gunModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.9F, -0.9F, 0.05F, -0.9F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.9F, -0.9F, -0.45F, -0.9F); // Import 
		gunModel[223].setRotationPoint(11.8F, -3.5F, -0.6F);

		gunModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.9F, -0.9F, 0.05F, -0.9F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.9F, -0.9F, -0.45F, -0.9F); // Import 
		gunModel[224].setRotationPoint(11.67F, -3.5F, -0.6F);

		gunModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.9F, -0.9F, 0.05F, -0.9F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.9F, -0.9F, -0.45F, -0.9F); // Import 
		gunModel[225].setRotationPoint(11.55F, -3.5F, -0.6F);

		gunModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, -0.9F, -0.9F, 0.05F, -0.9F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.9F, -0.9F, -0.45F, -0.9F); // Import 
		gunModel[226].setRotationPoint(11.42F, -3.5F, -0.6F);


		ammoModel = new ModelRendererTurbo[11];
		ammoModel[0] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 180
		ammoModel[1] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 183
		ammoModel[2] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 187
		ammoModel[3] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 188
		ammoModel[4] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 193
		ammoModel[5] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 194
		ammoModel[6] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 199
		ammoModel[7] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 230
		ammoModel[8] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 231
		ammoModel[9] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 233
		ammoModel[10] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 234

		ammoModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.2F, 0F, -0.05F, -0.3F, -0.25F, -0.05F, -0.3F, -0.25F, -0.05F, -0.2F, 0F, -0.05F, -0.1F, -0.25F, -0.05F, -0.4F, -0.34F, -0.05F, -0.4F, -0.34F, -0.05F, -0.1F, -0.25F, -0.05F); // Box 180
		ammoModel[0].setRotationPoint(4.32F, -2.95F, -0.5F);
		ammoModel[0].rotateAngleZ = 0.15707963F;

		ammoModel[1].addShapeBox(-0.35F, 1.5F, 0F, 2, 2, 1, 0F, -0.1F, -0.25F, -0.05F, -0.4F, -0.45F, -0.05F, -0.4F, -0.45F, -0.05F, -0.1F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.25F, -0.05F); // Box 183
		ammoModel[1].setRotationPoint(4.32F, -2.97F, -0.5F);
		ammoModel[1].rotateAngleZ = 0.34906585F;

		ammoModel[2].addShapeBox(1.25F, 0F, 0F, 1, 2, 1, 0F, -0.2F, -0.22F, -0.2F, -0.2F, -0.32F, -0.2F, -0.2F, -0.32F, -0.2F, -0.2F, -0.22F, -0.2F, -0.1F, -0.25F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.1F, -0.25F, -0.2F); // Box 187
		ammoModel[2].setRotationPoint(4.32F, -3F, -0.5F);
		ammoModel[2].rotateAngleZ = 0.15707963F;

		ammoModel[3].addShapeBox(0.05F, 1.5F, 0F, 2, 2, 1, 0F, -0.2F, -0.45F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.25F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 188
		ammoModel[3].setRotationPoint(4.23F, -2.97F, -0.5F);
		ammoModel[3].rotateAngleZ = 0.34906585F;

		ammoModel[4].addShapeBox(0.05F, 3.35F, 0F, 2, 1, 1, 0F, -0.15F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.15F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.25F, -0.45F, 0F, -0.15F, -0.45F, 0F); // Box 193
		ammoModel[4].setRotationPoint(4.17F, -0.02F, -0.5F);
		ammoModel[4].rotateAngleZ = 0.57595865F;

		ammoModel[5].addShapeBox(1.6F, 3.35F, 0F, 1, 1, 1, 0F, -0.2F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.3F, -0.45F, -0.15F, -0.2F, -0.45F, -0.15F); // Box 194
		ammoModel[5].setRotationPoint(4.17F, -0.02F, -0.5F);
		ammoModel[5].rotateAngleZ = 0.57595865F;

		ammoModel[6].addShapeBox(0F, 0.05F, 0F, 1, 2, 1, 0F, 0F, 0.05F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.05F, -0.2F, 0.1F, -0.8F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0.1F, -0.8F, -0.2F); // Box 199
		ammoModel[6].setRotationPoint(4.17F, -3F, -0.5F);
		ammoModel[6].rotateAngleZ = 0.15707963F;

		ammoModel[7].addShapeBox(-0.35F, 2.5F, 0F, 2, 2, 1, 0F, -0.1F, -0.25F, -0.05F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.1F, -0.25F, -0.05F, -0.15F, -0.25F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.15F, -0.25F, -0.05F); // Box 230
		ammoModel[7].setRotationPoint(4.4F, -2.47F, -0.5F);
		ammoModel[7].rotateAngleZ = 0.34906585F;

		ammoModel[8].addShapeBox(0.1F, 2.47F, 0F, 2, 2, 1, 0F, -0.1F, -0.25F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.1F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.2F, -0.25F, -0.2F); // Box 231
		ammoModel[8].setRotationPoint(4.4F, -2.47F, -0.5F);
		ammoModel[8].rotateAngleZ = 0.34906585F;

		ammoModel[9].addShapeBox(-0.35F, 2.5F, 0F, 2, 2, 1, 0F, -0.05F, -0.25F, -0.05F, -0.4F, -0.2F, -0.05F, -0.4F, -0.2F, -0.05F, -0.05F, -0.25F, -0.05F, -0.3F, -0.15F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.3F, -0.15F, -0.05F); // Box 233
		ammoModel[9].setRotationPoint(5.01F, -1.1F, -0.5F);
		ammoModel[9].rotateAngleZ = 0.34906585F;

		ammoModel[10].addShapeBox(0.1F, 2.5F, 0F, 2, 2, 1, 0F, -0.1F, -0.25F, -0.2F, -0.4F, -0.16F, -0.2F, -0.4F, -0.16F, -0.2F, -0.1F, -0.25F, -0.2F, -0.3F, -0.25F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.3F, -0.25F, -0.2F); // Box 234
		ammoModel[10].setRotationPoint(5.01F, -1.1F, -0.5F);
		ammoModel[10].rotateAngleZ = 0.34906585F;


		slideModel = new ModelRendererTurbo[6];
		slideModel[0] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 133
		slideModel[1] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 134
		slideModel[2] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 135
		slideModel[3] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 136
		slideModel[4] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 153
		slideModel[5] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 154

		slideModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.2F, -0.35F, -0.2F, -0.25F, -0.35F, -0.2F, -0.25F, -0.35F, -0.5F, -0.2F, -0.35F, -0.5F, -0.2F, -0.4F, -0.1F, -0.25F, -0.4F, -0.1F, -0.25F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F); // Box 133
		slideModel[0].setRotationPoint(4.5F, -4.7F, -0.4F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.4F, -0.4F, -0.1F, -0.05F, -0.4F, -0.1F, -0.05F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0.05F, -0.05F, -0.4F, 0.05F, -0.05F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F); // Box 134
		slideModel[1].setRotationPoint(4.3F, -4.5F, -0.4F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.3F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, 0.3F, -0.4F, -0.25F, 0.3F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.3F, -0.2F, -0.25F); // Box 135
		slideModel[2].setRotationPoint(5F, -4.3F, -0.7F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.6F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F); // Box 136
		slideModel[3].setRotationPoint(3.9F, -4.35F, -0.7F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.35F, -0.15F, -0.4F, -0.35F, -0.15F, -0.45F, -0.35F, -0.4F, -0.4F, -0.35F, -0.4F, -0.5F, -0.4F, -0.15F, -0.4F, -0.4F, -0.15F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 153
		slideModel[4].setRotationPoint(6.6F, -4.25F, -1.25F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 154
		slideModel[5].setRotationPoint(6.6F, -4.25F, -1.05F);



		animationType = EnumAnimationType.CUSTOM;
        scopeAttachPoint = new Vector3f(0.4F /16F, -0.1F /16F, -0.5F /16F);
        gripAttachPoint = new Vector3f(12 /16F, 3.1F /16F, 0F /16F);
        rotateGunVertical = 60F;
        rotateClipVertical = -75F;
      RecoilSlideDistance = 0.2F;
    RotateSlideDistance = -12.0F;



                thirdPersonOffset = new Vector3f(0F, 0F, 0.0F);


            gunSlideDistance = 0.25F;


            animationType = EnumAnimationType.CUSTOM;


            rotateGunVertical = 40.0F;


            rotateClipVertical = -140.0F;


            slideLockOnEmpty = true;

            casingAnimTime = 2;
            casingAnimDistance = new Vector3f(0.0F, 1.0F, 12.0F);
            casingAnimSpread = new Vector3f(2.0F, 2.0F, 0.0F);
            casingRotateVector = new Vector3f(0.1F, 1.0F, 0.1F);
            caseScale = 0.08F;
            casingAttachPoint = new Vector3f(2.5F, 3.5F, 0.3F);

            flashScale = 0.85F;
            muzzleFlashPoint = new Vector3f(1.45F, 0.3F, 0F);

            fancyStance = true;
            stanceRotate = new Vector3f(40.0F, 0.0F, -8.0F);
            stanceTranslate = new Vector3f(0.4F, 0.0F, 0.0F);
            ShakeDistance = 0.1F;

            crouchZoom = -0.15F;

        translateAll(-1F, -0.9F, 0F);
        flipAll();
	}
}