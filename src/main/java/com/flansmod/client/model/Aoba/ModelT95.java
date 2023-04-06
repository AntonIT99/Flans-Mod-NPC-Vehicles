//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: T95
// Model Creator: 
// Created on: 06.07.2017 - 00:34:39
// Last changed on: 06.07.2017 - 00:34:39

package com.flansmod.client.model.Aoba; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelT95 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelT95() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[371];
		barrelModel = new ModelRendererTurbo[36];
		leftTrackWheelModels = new ModelRendererTurbo[40];
		rightTrackWheelModels = new ModelRendererTurbo[40];
		leftTrackModel = new ModelRendererTurbo[403];
		rightTrackModel = new ModelRendererTurbo[403];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 832, 229, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 57
		bodyModel[43] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 71
		bodyModel[50] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 78
		bodyModel[54] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 80
		bodyModel[56] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 81
		bodyModel[57] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 82
		bodyModel[58] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 83
		bodyModel[59] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 84
		bodyModel[60] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 85
		bodyModel[61] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 86
		bodyModel[62] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 88
		bodyModel[64] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 89
		bodyModel[65] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 91
		bodyModel[67] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 92
		bodyModel[68] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 93
		bodyModel[69] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 96
		bodyModel[72] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 133
		bodyModel[73] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 138
		bodyModel[78] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 139
		bodyModel[79] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 140
		bodyModel[80] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 141
		bodyModel[81] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 142
		bodyModel[82] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 143
		bodyModel[83] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 144
		bodyModel[84] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 145
		bodyModel[85] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 146
		bodyModel[86] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 150
		bodyModel[90] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 152
		bodyModel[92] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 153
		bodyModel[93] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 154
		bodyModel[94] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 155
		bodyModel[95] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 156
		bodyModel[96] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 157
		bodyModel[97] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 158
		bodyModel[98] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 159
		bodyModel[99] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 160
		bodyModel[100] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 161
		bodyModel[101] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 163
		bodyModel[102] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 143
		bodyModel[103] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 144
		bodyModel[104] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 146
		bodyModel[105] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 147
		bodyModel[106] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 148
		bodyModel[107] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 149
		bodyModel[108] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 150
		bodyModel[109] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 151
		bodyModel[110] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 152
		bodyModel[111] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 153
		bodyModel[112] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 154
		bodyModel[113] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 155
		bodyModel[114] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 156
		bodyModel[115] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 157
		bodyModel[116] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 158
		bodyModel[117] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 163
		bodyModel[118] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 164
		bodyModel[119] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 165
		bodyModel[120] = new ModelRendererTurbo(this, 252, 205, textureX, textureY); // Box 166
		bodyModel[121] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 167
		bodyModel[122] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 168
		bodyModel[123] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 169
		bodyModel[124] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 175
		bodyModel[129] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 176
		bodyModel[130] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 177
		bodyModel[131] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 178
		bodyModel[132] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 179
		bodyModel[133] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 180
		bodyModel[134] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 181
		bodyModel[135] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 182
		bodyModel[136] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 183
		bodyModel[137] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 187
		bodyModel[138] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 188
		bodyModel[139] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 189
		bodyModel[140] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 190
		bodyModel[141] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 191
		bodyModel[142] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 192
		bodyModel[143] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 193
		bodyModel[144] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 194
		bodyModel[145] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 195
		bodyModel[146] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 196
		bodyModel[147] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 197
		bodyModel[148] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 198
		bodyModel[149] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 199
		bodyModel[150] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 200
		bodyModel[151] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 201
		bodyModel[152] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 202
		bodyModel[153] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 203
		bodyModel[154] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 204
		bodyModel[155] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 205
		bodyModel[156] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 206
		bodyModel[157] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 207
		bodyModel[158] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 208
		bodyModel[159] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 209
		bodyModel[160] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 210
		bodyModel[161] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 211
		bodyModel[162] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 212
		bodyModel[163] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 213
		bodyModel[164] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 214
		bodyModel[165] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 216
		bodyModel[166] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 217
		bodyModel[167] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 220
		bodyModel[168] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 222
		bodyModel[169] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 223
		bodyModel[170] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 224
		bodyModel[171] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 225
		bodyModel[172] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 226
		bodyModel[173] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 227
		bodyModel[174] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 228
		bodyModel[175] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 229
		bodyModel[176] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 230
		bodyModel[177] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 231
		bodyModel[178] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 232
		bodyModel[179] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 233
		bodyModel[180] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 234
		bodyModel[181] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 235
		bodyModel[182] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 236
		bodyModel[183] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 237
		bodyModel[184] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 238
		bodyModel[185] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 239
		bodyModel[186] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 240
		bodyModel[187] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 241
		bodyModel[188] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 242
		bodyModel[189] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 243
		bodyModel[190] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 244
		bodyModel[191] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 245
		bodyModel[192] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 246
		bodyModel[193] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 247
		bodyModel[194] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 248
		bodyModel[195] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 249
		bodyModel[196] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 250
		bodyModel[197] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 251
		bodyModel[198] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 252
		bodyModel[199] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 253
		bodyModel[200] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 254
		bodyModel[201] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 255
		bodyModel[202] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 256
		bodyModel[203] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 257
		bodyModel[204] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 258
		bodyModel[205] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 259
		bodyModel[206] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 260
		bodyModel[207] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 261
		bodyModel[208] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 262
		bodyModel[209] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 263
		bodyModel[210] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 264
		bodyModel[211] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 265
		bodyModel[212] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Box 266
		bodyModel[213] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 267
		bodyModel[214] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 268
		bodyModel[215] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 269
		bodyModel[216] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 270
		bodyModel[217] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 271
		bodyModel[218] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 272
		bodyModel[219] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 294
		bodyModel[220] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 295
		bodyModel[221] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 296
		bodyModel[222] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 297
		bodyModel[223] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 298
		bodyModel[224] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 299
		bodyModel[225] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 300
		bodyModel[226] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 301
		bodyModel[227] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 302
		bodyModel[228] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 303
		bodyModel[229] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 304
		bodyModel[230] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 305
		bodyModel[231] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 306
		bodyModel[232] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 307
		bodyModel[233] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 308
		bodyModel[234] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 309
		bodyModel[235] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 310
		bodyModel[236] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 311
		bodyModel[237] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 312
		bodyModel[238] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 313
		bodyModel[239] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 314
		bodyModel[240] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 315
		bodyModel[241] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 316
		bodyModel[242] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 317
		bodyModel[243] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 318
		bodyModel[244] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 319
		bodyModel[245] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 320
		bodyModel[246] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 321
		bodyModel[247] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 322
		bodyModel[248] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 323
		bodyModel[249] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 324
		bodyModel[250] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 325
		bodyModel[251] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 326
		bodyModel[252] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 327
		bodyModel[253] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 328
		bodyModel[254] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 329
		bodyModel[255] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 330
		bodyModel[256] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 331
		bodyModel[257] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 332
		bodyModel[258] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 333
		bodyModel[259] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 334
		bodyModel[260] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 335
		bodyModel[261] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 336
		bodyModel[262] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 337
		bodyModel[263] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 338
		bodyModel[264] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 339
		bodyModel[265] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 340
		bodyModel[266] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 341
		bodyModel[267] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 342
		bodyModel[268] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 343
		bodyModel[269] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 344
		bodyModel[270] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 345
		bodyModel[271] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 346
		bodyModel[272] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 347
		bodyModel[273] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 348
		bodyModel[274] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 349
		bodyModel[275] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 350
		bodyModel[276] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 351
		bodyModel[277] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 352
		bodyModel[278] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 353
		bodyModel[279] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 354
		bodyModel[280] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 355
		bodyModel[281] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 356
		bodyModel[282] = new ModelRendererTurbo(this, 761, 129, textureX, textureY); // Box 357
		bodyModel[283] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 358
		bodyModel[284] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 359
		bodyModel[285] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 360
		bodyModel[286] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 361
		bodyModel[287] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 362
		bodyModel[288] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 363
		bodyModel[289] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 364
		bodyModel[290] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 365
		bodyModel[291] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 366
		bodyModel[292] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 367
		bodyModel[293] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 368
		bodyModel[294] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 369
		bodyModel[295] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 370
		bodyModel[296] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 371
		bodyModel[297] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 372
		bodyModel[298] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 373
		bodyModel[299] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 374
		bodyModel[300] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 375
		bodyModel[301] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 376
		bodyModel[302] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 377
		bodyModel[303] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 378
		bodyModel[304] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 379
		bodyModel[305] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 380
		bodyModel[306] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 381
		bodyModel[307] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 382
		bodyModel[308] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 383
		bodyModel[309] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 384
		bodyModel[310] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 385
		bodyModel[311] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 386
		bodyModel[312] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 387
		bodyModel[313] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 388
		bodyModel[314] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 389
		bodyModel[315] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Box 390
		bodyModel[316] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 391
		bodyModel[317] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 392
		bodyModel[318] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 393
		bodyModel[319] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 394
		bodyModel[320] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 395
		bodyModel[321] = new ModelRendererTurbo(this, 777, 145, textureX, textureY); // Box 396
		bodyModel[322] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 397
		bodyModel[323] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 398
		bodyModel[324] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 399
		bodyModel[325] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 400
		bodyModel[326] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 401
		bodyModel[327] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 402
		bodyModel[328] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 403
		bodyModel[329] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 404
		bodyModel[330] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 405
		bodyModel[331] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 406
		bodyModel[332] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 407
		bodyModel[333] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 408
		bodyModel[334] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 409
		bodyModel[335] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 410
		bodyModel[336] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 411
		bodyModel[337] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 412
		bodyModel[338] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 413
		bodyModel[339] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 414
		bodyModel[340] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 415
		bodyModel[341] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 416
		bodyModel[342] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 417
		bodyModel[343] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 418
		bodyModel[344] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 419
		bodyModel[345] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 420
		bodyModel[346] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 421
		bodyModel[347] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 422
		bodyModel[348] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 423
		bodyModel[349] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 424
		bodyModel[350] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 425
		bodyModel[351] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 426
		bodyModel[352] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 427
		bodyModel[353] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 428
		bodyModel[354] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 429
		bodyModel[355] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 430
		bodyModel[356] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 431
		bodyModel[357] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 432
		bodyModel[358] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 433
		bodyModel[359] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 486
		bodyModel[360] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 487
		bodyModel[361] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 488
		bodyModel[362] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 489
		bodyModel[363] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 774
		bodyModel[364] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 775
		bodyModel[365] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 1239
		bodyModel[366] = new ModelRendererTurbo(this, 832, 229, textureX, textureY); // Box 1240
		bodyModel[367] = new ModelRendererTurbo(this, 309, 25, textureX, textureY); // Box 1241
		bodyModel[368] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 1242
		bodyModel[369] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 1243
		bodyModel[370] = new ModelRendererTurbo(this, 447, 212, textureX, textureY); // Box 1253

		bodyModel[0].addBox(0F, 0F, 0F, 112, 12, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-111F, -13F, -45F);

		bodyModel[1].addBox(0F, 0F, 0F, 110, 2, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(-109F, -1F, -45F);

		bodyModel[2].addBox(0F, 0F, 0F, 23, 14, 1, 0F); // Box 2
		bodyModel[2].setRotationPoint(2F, -13F, -44F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(25F, -13F, -44F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(1F, -13F, -45F);

		bodyModel[5].addBox(0F, 0F, 0F, 18, 1, 23, 0F); // Box 6
		bodyModel[5].setRotationPoint(7F, -13F, -43F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(25F, -13F, -43F);

		bodyModel[7].addBox(0F, 0F, 0F, 118, 1, 24, 0F); // Box 8
		bodyModel[7].setRotationPoint(-111F, -13F, -43F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 23, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 5.75F, 0F, -1F, 5.75F, 0F, 1F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(34F, -13F, -43F);

		bodyModel[9].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(7F, -13F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(25F, -13F, -20F);

		bodyModel[11].addBox(0F, 0F, 0F, 118, 1, 24, 0F); // Box 11
		bodyModel[11].setRotationPoint(-111F, -13F, 19F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 118, 11, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-111F, -13F, -19F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 113, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-107F, -2F, -19F);

		bodyModel[14].addBox(0F, 0F, 0F, 112, 12, 2, 0F); // Box 14
		bodyModel[14].setRotationPoint(-111F, -13F, 43F);

		bodyModel[15].addBox(0F, 0F, 0F, 110, 2, 2, 0F); // Box 15
		bodyModel[15].setRotationPoint(-109F, -1F, 43F);

		bodyModel[16].addBox(0F, 0F, 0F, 23, 14, 1, 0F); // Box 16
		bodyModel[16].setRotationPoint(2F, -13F, 43F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(25F, -13F, 43F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(1F, -13F, 43F);

		bodyModel[19].addBox(0F, 0F, 0F, 18, 1, 23, 0F); // Box 19
		bodyModel[19].setRotationPoint(7F, -13F, 20F);

		bodyModel[20].addBox(0F, 0F, 0F, 18, 14, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(7F, -13F, 19F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(25F, -13F, 19F);

		bodyModel[22].addBox(0F, 0F, 0F, 56, 17, 36, 0F); // Box 22
		bodyModel[22].setRotationPoint(-59F, -30F, -18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 17, 36, 0F,0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-3F, -30F, -18F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-20F, -23F, 31F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 91, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-111F, -23F, 31F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 52, 10, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-111F, -23F, -31F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 52, 7, 13, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 32
		bodyModel[27].setRotationPoint(-111F, -30F, -31F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 56, 17, 13, 0F,0F, -7F, 0F, -10F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-59F, -30F, -31F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 52, 7, 1, 0F,0F, -7F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		bodyModel[29].setRotationPoint(-111F, -30F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 17, 12, 0F,10F, -7F, 11F, 0F, -17F, 0F, 0F, -2F, 0F, 0F, 0F, -10F, 10F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 35
		bodyModel[30].setRotationPoint(-3F, -30F, -20F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, 0F, 0F, 13F, -10F, 11F, -14F, -10F, 0F, 7F, -10F, 0F, 0F, 0F, 0F, 13F, 0F, 11F, -14F, 0F, 0F, 7F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-13F, -23F, 31F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(-1F, -14F, 31F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(-1F, -17F, 31F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(-1F, -14F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(-1F, -17F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-20F, -27F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-20F, -27F, 31F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[38].setRotationPoint(-40F, -27F, 29F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[39].setRotationPoint(-40F, -27F, 31F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-61F, -27F, 29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(-61F, -27F, 31F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[42].setRotationPoint(-109F, -27F, 29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[43].setRotationPoint(-109F, -27F, 31F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[44].setRotationPoint(-1F, -17F, -32F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(-1F, -17F, -31F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[46].setRotationPoint(-20F, -27F, -31F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[47].setRotationPoint(-20F, -27F, -32F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[48].setRotationPoint(-40F, -27F, -31F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[49].setRotationPoint(-40F, -27F, -32F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-61F, -24F, -32F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[51].setRotationPoint(-61F, -27F, -31F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(-61F, -27F, -32F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[53].setRotationPoint(-109F, -27F, -31F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[54].setRotationPoint(-109F, -27F, -32F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[55].setRotationPoint(25F, -13F, 20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 23, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 5.75F, 0F, -1F, 5.75F, 0F, 1F, 0F, 0F); // Box 81
		bodyModel[56].setRotationPoint(34F, -13F, 20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 82
		bodyModel[57].setRotationPoint(-61F, -24F, -31F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 83
		bodyModel[58].setRotationPoint(-61F, -24F, 31F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 84
		bodyModel[59].setRotationPoint(-61F, -24F, 29F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 85
		bodyModel[60].setRotationPoint(-40F, -24F, 31F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 86
		bodyModel[61].setRotationPoint(-40F, -24F, 29F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 87
		bodyModel[62].setRotationPoint(-40F, -24F, -32F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 88
		bodyModel[63].setRotationPoint(-40F, -24F, -31F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 89
		bodyModel[64].setRotationPoint(-20F, -24F, -32F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 90
		bodyModel[65].setRotationPoint(-20F, -24F, -31F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 91
		bodyModel[66].setRotationPoint(-20F, -24F, 31F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 92
		bodyModel[67].setRotationPoint(-20F, -24F, 29F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 93
		bodyModel[68].setRotationPoint(-109F, -24F, 31F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 94
		bodyModel[69].setRotationPoint(-109F, -24F, 29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 95
		bodyModel[70].setRotationPoint(-109F, -24F, -31F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 96
		bodyModel[71].setRotationPoint(-109F, -24F, -32F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 49, 2, 36, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 133
		bodyModel[72].setRotationPoint(-108F, -28F, -18F);

		bodyModel[73].addShapeBox(2F, 0F, 0F, 17, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[73].setRotationPoint(-107F, -24F, -17F);
		bodyModel[73].rotateAngleZ = 0.13962634F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 135
		bodyModel[74].setRotationPoint(-107F, -24F, -17F);
		bodyModel[74].rotateAngleZ = 0.13962634F;

		bodyModel[75].addShapeBox(19F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 136
		bodyModel[75].setRotationPoint(-107F, -24F, -17F);
		bodyModel[75].rotateAngleZ = 0.13962634F;

		bodyModel[76].addShapeBox(-0.5F, -0.5F, 4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[76].setRotationPoint(-107F, -24F, -17F);
		bodyModel[76].rotateAngleZ = 0.13962634F;

		bodyModel[77].addShapeBox(-0.5F, -0.5F, 10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[77].setRotationPoint(-107F, -24F, -17F);
		bodyModel[77].rotateAngleZ = 0.13962634F;

		bodyModel[78].addShapeBox(-0.5F, -0.5F, -10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[78].setRotationPoint(-107F, -24F, 16F);
		bodyModel[78].rotateAngleZ = 0.13962634F;

		bodyModel[79].addShapeBox(-0.5F, -0.5F, -4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[79].setRotationPoint(-107F, -24F, 16F);
		bodyModel[79].rotateAngleZ = 0.13962634F;

		bodyModel[80].addShapeBox(-0.5F, -0.5F, -16.5F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[80].setRotationPoint(-107F, -24F, 16F);
		bodyModel[80].rotateAngleZ = 0.13962634F;

		bodyModel[81].addShapeBox(24.5F, -0.5F, -16.5F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[81].setRotationPoint(-107F, -24F, 16F);
		bodyModel[81].rotateAngleZ = 0.13962634F;

		bodyModel[82].addShapeBox(24.5F, -0.5F, 4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[82].setRotationPoint(-107F, -24F, -17F);
		bodyModel[82].rotateAngleZ = 0.13962634F;

		bodyModel[83].addShapeBox(24.5F, -0.5F, 10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[83].setRotationPoint(-107F, -24F, -17F);
		bodyModel[83].rotateAngleZ = 0.13962634F;

		bodyModel[84].addShapeBox(24.5F, -0.5F, -10F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[84].setRotationPoint(-107F, -24F, 16F);
		bodyModel[84].rotateAngleZ = 0.13962634F;

		bodyModel[85].addShapeBox(24.5F, -0.5F, -4F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[85].setRotationPoint(-107F, -24F, 16F);
		bodyModel[85].rotateAngleZ = 0.13962634F;

		bodyModel[86].addShapeBox(25F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 147
		bodyModel[86].setRotationPoint(-107F, -24F, -17F);
		bodyModel[86].rotateAngleZ = 0.13962634F;

		bodyModel[87].addShapeBox(27F, 0F, 0F, 17, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[87].setRotationPoint(-107F, -24F, -17F);
		bodyModel[87].rotateAngleZ = 0.13962634F;

		bodyModel[88].addShapeBox(44F, 0F, 0F, 2, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 149
		bodyModel[88].setRotationPoint(-107F, -24F, -17F);
		bodyModel[88].rotateAngleZ = 0.13962634F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 150
		bodyModel[89].setRotationPoint(-111F, -31F, -19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 151
		bodyModel[90].setRotationPoint(-111F, -31F, 18F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[91].setRotationPoint(-59F, -31F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[92].setRotationPoint(-59F, -31F, -18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[93].setRotationPoint(-58F, -31F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[94].setRotationPoint(-58F, -31F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[95].setRotationPoint(-55F, -31F, -4F);

		bodyModel[96].addShapeBox(0F, -0.5F, 0F, 1, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[96].setRotationPoint(-111.5F, -23F, -18F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[97].setRotationPoint(-112F, -24F, -19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[98].setRotationPoint(-112F, -24F, 18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[99].setRotationPoint(-112F, -18F, -18F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,0F, -10F, 0F, -7F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[100].setRotationPoint(-20F, -23F, -45F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 10, 14, 0F,7F, -10F, 0F, -14F, -10F, 0F, 13F, -10F, 11F, 0F, 0F, 0F, 7F, 0F, 0F, -14F, 0F, 0F, 13F, 0F, 11F, 0F, 0F, 0F); // Box 163
		bodyModel[101].setRotationPoint(-13F, -23F, -45F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[102].setRotationPoint(-36F, -39F, -17F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[103].setRotationPoint(-49F, -39F, -23F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F); // Box 146
		bodyModel[104].setRotationPoint(-41F, -39F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[105].setRotationPoint(-49F, -39F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F); // Box 148
		bodyModel[106].setRotationPoint(-41F, -39F, -23F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F, 1F, 0F, -6F, 0F, 0F, 0F, 0.5F, 0F, -5F, 0F, 0F, 0.5F); // Box 149
		bodyModel[107].setRotationPoint(-54F, -39F, -23F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 0.5F, 0.5F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, -6F); // Box 150
		bodyModel[108].setRotationPoint(-54F, -39F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[109].setRotationPoint(-48.5F, -33F, -23.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 152
		bodyModel[110].setRotationPoint(-55.5F, -33F, -23.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 153
		bodyModel[111].setRotationPoint(-41.5F, -33F, -23.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 154
		bodyModel[112].setRotationPoint(-40.5F, -31F, -24.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 1, 23, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 155
		bodyModel[113].setRotationPoint(-56.5F, -31F, -24.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[114].setRotationPoint(-49.5F, -31F, -24.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 157
		bodyModel[115].setRotationPoint(-25.5F, -31F, 5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[116].setRotationPoint(-20.5F, -31F, 5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 26, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -7F, 0F, 2F, -7F, 0F, 2F); // Box 163
		bodyModel[117].setRotationPoint(-28.5F, -30F, 18F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 26, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[118].setRotationPoint(-28.5F, -30F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 165
		bodyModel[119].setRotationPoint(-11.5F, -31F, 5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[120].setRotationPoint(-19.5F, -33F, 6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 167
		bodyModel[121].setRotationPoint(-24.5F, -33F, 6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 168
		bodyModel[122].setRotationPoint(-12.5F, -33F, 6.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 9, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 169
		bodyModel[123].setRotationPoint(-18.5F, -30F, -23F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[124].setRotationPoint(-18.5F, -30F, -18F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[125].setRotationPoint(-53F, -38F, -19F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[126].setRotationPoint(-53F, -38F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[127].setRotationPoint(-39F, -38F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[128].setRotationPoint(-39F, -38F, -20F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[129].setRotationPoint(-46F, -38F, -23F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[130].setRotationPoint(-46F, -38F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 178
		bodyModel[131].setRotationPoint(-116F, -21F, -4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 179
		bodyModel[132].setRotationPoint(-113F, -7F, -19F);
		bodyModel[132].rotateAngleZ = 0.34906585F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 180
		bodyModel[133].setRotationPoint(-113F, -7F, 15F);
		bodyModel[133].rotateAngleZ = 0.34906585F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[134].setRotationPoint(-50F, -31F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[135].setRotationPoint(-48F, -31F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 183
		bodyModel[136].setRotationPoint(-51F, -31F, 1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[137].setRotationPoint(-50F, -35F, 2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[138].setRotationPoint(-49.5F, -62F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[139].setRotationPoint(-45F, -31F, 15F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 190
		bodyModel[140].setRotationPoint(-46F, -31F, 15F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 191
		bodyModel[141].setRotationPoint(-43F, -31F, 15F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[142].setRotationPoint(-45F, -35F, 16F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 193
		bodyModel[143].setRotationPoint(-44.5F, -62F, 16.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[144].setRotationPoint(-27F, -31F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 195
		bodyModel[145].setRotationPoint(-28F, -31F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 196
		bodyModel[146].setRotationPoint(-25F, -31F, -1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[147].setRotationPoint(-27F, -35F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 198
		bodyModel[148].setRotationPoint(-26.5F, -62F, 0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 199
		bodyModel[149].setRotationPoint(-56F, -31F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[150].setRotationPoint(-54F, -31F, 9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 201
		bodyModel[151].setRotationPoint(-49F, -31F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 202
		bodyModel[152].setRotationPoint(-15F, -31F, -18F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[153].setRotationPoint(-13F, -31F, -18F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 204
		bodyModel[154].setRotationPoint(-8F, -31F, -18F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[155].setRotationPoint(-1F, -14F, -32F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[156].setRotationPoint(-1F, -14F, -31F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[157].setRotationPoint(-89F, -25F, 28F);

		bodyModel[158].addShapeBox(0F, 0F, -1F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[158].setRotationPoint(-11F, -25F, 29F);
		bodyModel[158].rotateAngleY = -0.76794487F;
		bodyModel[158].rotateAngleZ = 0.10471976F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[159].setRotationPoint(7F, -28F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[160].setRotationPoint(-89F, -25F, -29F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[161].setRotationPoint(-11F, -25F, -29F);
		bodyModel[161].rotateAngleY = 0.76794487F;
		bodyModel[161].rotateAngleZ = 0.10471976F;

		bodyModel[162].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[162].setRotationPoint(-95F, -25F, 28F);
		bodyModel[162].rotateAngleX = -0.50614548F;

		bodyModel[163].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 213
		bodyModel[163].setRotationPoint(-96F, -25F, 28F);
		bodyModel[163].rotateAngleX = -0.50614548F;

		bodyModel[164].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[164].setRotationPoint(-95F, -24F, -29F);
		bodyModel[164].rotateAngleX = 0.50614548F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[165].setRotationPoint(-103F, -27F, 18F);

		bodyModel[166].addShapeBox(0F, -4F, 9F, 1, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[166].setRotationPoint(-103F, -27F, 18F);

		bodyModel[167].addShapeBox(0F, -5F, 11F, 1, 4, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 220
		bodyModel[167].setRotationPoint(-103F, -27F, 18F);

		bodyModel[168].addShapeBox(0F, -2F, 6F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[168].setRotationPoint(-103F, -27F, 18F);

		bodyModel[169].addShapeBox(0F, -2F, 3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 223
		bodyModel[169].setRotationPoint(-103F, -27F, 18F);

		bodyModel[170].addShapeBox(0F, 1F, 3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[170].setRotationPoint(-103F, -27F, 18F);

		bodyModel[171].addShapeBox(0F, 1F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[171].setRotationPoint(-103F, -27F, 18F);

		bodyModel[172].addShapeBox(0F, -4F, 7F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[172].setRotationPoint(-103F, -27F, 18F);

		bodyModel[173].addShapeBox(5F, -5F, 11F, 1, 4, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 227
		bodyModel[173].setRotationPoint(-103F, -27F, 18F);

		bodyModel[174].addShapeBox(5F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[174].setRotationPoint(-103F, -27F, 18F);

		bodyModel[175].addShapeBox(5F, -2F, 3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 229
		bodyModel[175].setRotationPoint(-103F, -27F, 18F);

		bodyModel[176].addShapeBox(5F, -4F, 7F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[176].setRotationPoint(-103F, -27F, 18F);

		bodyModel[177].addShapeBox(5F, -4F, 9F, 1, 7, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[177].setRotationPoint(-103F, -27F, 18F);

		bodyModel[178].addShapeBox(5F, 1F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[178].setRotationPoint(-103F, -27F, 18F);

		bodyModel[179].addShapeBox(5F, 1F, 3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[179].setRotationPoint(-103F, -27F, 18F);

		bodyModel[180].addShapeBox(5F, -2F, 6F, 1, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[180].setRotationPoint(-103F, -27F, 18F);

		bodyModel[181].addFlexTrapezoid(0F, -8F, 16F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 235
		bodyModel[181].setRotationPoint(-103F, -27F, 18F);

		bodyModel[182].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[182].setRotationPoint(-103F, -27F, 18F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[183].setRotationPoint(-103F, -27F, -21F);

		bodyModel[184].addShapeBox(0F, -4F, -9F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[184].setRotationPoint(-103F, -27F, -20F);

		bodyModel[185].addShapeBox(0F, -5F, -11F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[185].setRotationPoint(-103F, -27F, -23F);

		bodyModel[186].addShapeBox(0F, -2F, -6F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[186].setRotationPoint(-103F, -27F, -19F);

		bodyModel[187].addShapeBox(0F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 241
		bodyModel[187].setRotationPoint(-103F, -27F, -18F);

		bodyModel[188].addShapeBox(0F, 1F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[188].setRotationPoint(-103F, -27F, -21F);

		bodyModel[189].addShapeBox(0F, 1F, -7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[189].setRotationPoint(-103F, -27F, -20F);

		bodyModel[190].addShapeBox(0F, -4F, -7F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[190].setRotationPoint(-103F, -27F, -20F);

		bodyModel[191].addShapeBox(5F, -5F, -11F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[191].setRotationPoint(-103F, -27F, -23F);

		bodyModel[192].addShapeBox(5F, 0F, 0F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[192].setRotationPoint(-103F, -27F, -21F);

		bodyModel[193].addShapeBox(5F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 247
		bodyModel[193].setRotationPoint(-103F, -27F, -18F);

		bodyModel[194].addShapeBox(5F, -4F, -7F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[194].setRotationPoint(-103F, -27F, -20F);

		bodyModel[195].addShapeBox(5F, -4F, -9F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[195].setRotationPoint(-103F, -27F, -20F);

		bodyModel[196].addShapeBox(5F, 1F, -7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[196].setRotationPoint(-103F, -27F, -20F);

		bodyModel[197].addShapeBox(5F, 1F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[197].setRotationPoint(-103F, -27F, -21F);

		bodyModel[198].addShapeBox(5F, -2F, -6F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[198].setRotationPoint(-103F, -27F, -19F);

		bodyModel[199].addFlexTrapezoid(0F, -8F, -16F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 253
		bodyModel[199].setRotationPoint(-103F, -27F, -19F);

		bodyModel[200].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[200].setRotationPoint(-103F, -27F, -19F);

		bodyModel[201].addShapeBox(0F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[201].setRotationPoint(23F, -15F, -31F);
		bodyModel[201].rotateAngleY = 2.16420827F;

		bodyModel[202].addFlexTrapezoid(0F, -8F, -17F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 256
		bodyModel[202].setRotationPoint(23F, -15F, -31F);
		bodyModel[202].rotateAngleY = 2.16420827F;

		bodyModel[203].addShapeBox(0F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[203].setRotationPoint(23F, -15F, -31F);
		bodyModel[203].rotateAngleY = 2.16420827F;

		bodyModel[204].addShapeBox(5F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[204].setRotationPoint(23F, -15F, -31F);
		bodyModel[204].rotateAngleY = 2.16420827F;

		bodyModel[205].addShapeBox(5F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[205].setRotationPoint(23F, -15F, -31F);
		bodyModel[205].rotateAngleY = 2.16420827F;

		bodyModel[206].addShapeBox(5F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[206].setRotationPoint(23F, -15F, -31F);
		bodyModel[206].rotateAngleY = 2.16420827F;

		bodyModel[207].addShapeBox(0F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[207].setRotationPoint(23F, -15F, -31F);
		bodyModel[207].rotateAngleY = 2.16420827F;

		bodyModel[208].addShapeBox(0F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[208].setRotationPoint(23F, -15F, -31F);
		bodyModel[208].rotateAngleY = 2.16420827F;

		bodyModel[209].addShapeBox(5F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[209].setRotationPoint(23F, -15F, -31F);
		bodyModel[209].rotateAngleY = 2.16420827F;

		bodyModel[210].addShapeBox(0F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[210].setRotationPoint(23F, -15F, -31F);
		bodyModel[210].rotateAngleY = 2.16420827F;

		bodyModel[211].addShapeBox(0F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[211].setRotationPoint(23F, -15F, -31F);
		bodyModel[211].rotateAngleY = 2.16420827F;

		bodyModel[212].addShapeBox(5F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[212].setRotationPoint(23F, -15F, -31F);
		bodyModel[212].rotateAngleY = 2.16420827F;

		bodyModel[213].addShapeBox(0F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 267
		bodyModel[213].setRotationPoint(23F, -15F, -31F);
		bodyModel[213].rotateAngleY = 2.16420827F;

		bodyModel[214].addShapeBox(0F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[214].setRotationPoint(23F, -15F, -31F);
		bodyModel[214].rotateAngleY = 2.16420827F;

		bodyModel[215].addShapeBox(5F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[215].setRotationPoint(23F, -15F, -31F);
		bodyModel[215].rotateAngleY = 2.16420827F;

		bodyModel[216].addShapeBox(5F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[216].setRotationPoint(23F, -15F, -31F);
		bodyModel[216].rotateAngleY = 2.16420827F;

		bodyModel[217].addShapeBox(5F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 271
		bodyModel[217].setRotationPoint(23F, -15F, -31F);
		bodyModel[217].rotateAngleY = 2.16420827F;

		bodyModel[218].addShapeBox(1F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[218].setRotationPoint(23F, -15F, -31F);
		bodyModel[218].rotateAngleY = 2.16420827F;

		bodyModel[219].addShapeBox(-5F, 0F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[219].setRotationPoint(24F, -15F, 31F);
		bodyModel[219].rotateAngleY = 0.97738438F;

		bodyModel[220].addShapeBox(-6F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[220].setRotationPoint(24F, -15F, 31F);
		bodyModel[220].rotateAngleY = 0.97738438F;

		bodyModel[221].addShapeBox(-6F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 296
		bodyModel[221].setRotationPoint(24F, -15F, 31F);
		bodyModel[221].rotateAngleY = 0.97738438F;

		bodyModel[222].addShapeBox(-6F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[222].setRotationPoint(24F, -15F, 31F);
		bodyModel[222].rotateAngleY = 0.97738438F;

		bodyModel[223].addShapeBox(-6F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[223].setRotationPoint(24F, -15F, 31F);
		bodyModel[223].rotateAngleY = 0.97738438F;

		bodyModel[224].addShapeBox(-6F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[224].setRotationPoint(24F, -15F, 31F);
		bodyModel[224].rotateAngleY = 0.97738438F;

		bodyModel[225].addShapeBox(-6F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[225].setRotationPoint(24F, -15F, 31F);
		bodyModel[225].rotateAngleY = 0.97738438F;

		bodyModel[226].addFlexTrapezoid(-6F, -8F, -17F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 301
		bodyModel[226].setRotationPoint(24F, -15F, 31F);
		bodyModel[226].rotateAngleY = 0.97738438F;

		bodyModel[227].addShapeBox(-1F, -5F, -16F, 1, 4, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[227].setRotationPoint(24F, -15F, 31F);
		bodyModel[227].rotateAngleY = 0.97738438F;

		bodyModel[228].addShapeBox(-1F, -4F, -11F, 1, 7, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[228].setRotationPoint(24F, -15F, 31F);
		bodyModel[228].rotateAngleY = 0.97738438F;

		bodyModel[229].addShapeBox(-1F, -4F, -9F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[229].setRotationPoint(24F, -15F, 31F);
		bodyModel[229].rotateAngleY = 0.97738438F;

		bodyModel[230].addShapeBox(-1F, -2F, -7F, 1, 4, 1, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[230].setRotationPoint(24F, -15F, 31F);
		bodyModel[230].rotateAngleY = 0.97738438F;

		bodyModel[231].addShapeBox(-1F, -2F, -4F, 1, 1, 1, 0F,0F, 1F, 2F, 0F, 1F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 306
		bodyModel[231].setRotationPoint(24F, -15F, 31F);
		bodyModel[231].rotateAngleY = 0.97738438F;

		bodyModel[232].addShapeBox(-1F, 0F, -3F, 1, 2, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[232].setRotationPoint(24F, -15F, 31F);
		bodyModel[232].rotateAngleY = 0.97738438F;

		bodyModel[233].addShapeBox(-6F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[233].setRotationPoint(24F, -15F, 31F);
		bodyModel[233].rotateAngleY = 0.97738438F;

		bodyModel[234].addShapeBox(-6F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[234].setRotationPoint(24F, -15F, 31F);
		bodyModel[234].rotateAngleY = 0.97738438F;

		bodyModel[235].addShapeBox(-1F, 1F, -6F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[235].setRotationPoint(24F, -15F, 31F);
		bodyModel[235].rotateAngleY = 0.97738438F;

		bodyModel[236].addShapeBox(-1F, 1F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[236].setRotationPoint(24F, -15F, 31F);
		bodyModel[236].rotateAngleY = 0.97738438F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[237].setRotationPoint(30F, -14F, 30F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[238].setRotationPoint(30F, -14F, 35F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[239].setRotationPoint(29F, -14F, 35F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[240].setRotationPoint(29F, -14F, 30F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 316
		bodyModel[241].setRotationPoint(30.5F, -17F, 29.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 317
		bodyModel[242].setRotationPoint(30.5F, -17F, 34.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[243].setRotationPoint(33F, -16F, 38F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[244].setRotationPoint(33F, -16F, 33F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[245].setRotationPoint(33F, -16F, 28F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 321
		bodyModel[246].setRotationPoint(32F, -18F, 28F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 322
		bodyModel[247].setRotationPoint(32F, -18F, 33F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 323
		bodyModel[248].setRotationPoint(32F, -18F, 38F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 324
		bodyModel[249].setRotationPoint(30F, -19F, 33F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[250].setRotationPoint(30F, -19F, 28F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[251].setRotationPoint(30F, -15F, 38F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[252].setRotationPoint(30F, -15F, 33F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[253].setRotationPoint(30F, -15F, 28F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[254].setRotationPoint(30F, -14F, -32F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[255].setRotationPoint(30F, -14F, -37F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[256].setRotationPoint(29F, -14F, -37F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[257].setRotationPoint(29F, -14F, -32F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 333
		bodyModel[258].setRotationPoint(30.5F, -17F, -32.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 334
		bodyModel[259].setRotationPoint(30.5F, -17F, -37.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[260].setRotationPoint(33F, -16F, -39F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[261].setRotationPoint(33F, -16F, -34F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[262].setRotationPoint(33F, -16F, -29F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 338
		bodyModel[263].setRotationPoint(32F, -18F, -29F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 339
		bodyModel[264].setRotationPoint(32F, -18F, -34F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 340
		bodyModel[265].setRotationPoint(32F, -18F, -39F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 341
		bodyModel[266].setRotationPoint(30F, -19F, -39F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 342
		bodyModel[267].setRotationPoint(30F, -19F, -34F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[268].setRotationPoint(30F, -15F, -39F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[269].setRotationPoint(30F, -15F, -34F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[270].setRotationPoint(30F, -15F, -29F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[271].setRotationPoint(-63F, -17F, -43F);
		bodyModel[271].rotateAngleX = 0.62831853F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 12, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[272].setRotationPoint(-45F, -17F, -43F);
		bodyModel[272].rotateAngleX = 0.62831853F;

		bodyModel[273].addShapeBox(0F, -2F, 0F, 12, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[273].setRotationPoint(-63F, -17F, -43F);
		bodyModel[273].rotateAngleX = 0.62831853F;

		bodyModel[274].addShapeBox(0F, -2F, 0F, 12, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[274].setRotationPoint(-45F, -17F, -43F);
		bodyModel[274].rotateAngleX = 0.62831853F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[275].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[275].rotateAngleX = 0.99483767F;

		bodyModel[276].addShapeBox(1F, 7F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[276].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[276].rotateAngleX = 0.99483767F;

		bodyModel[277].addShapeBox(12F, -2F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[277].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[277].rotateAngleX = 0.99483767F;

		bodyModel[278].addShapeBox(16F, -2F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[278].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[278].rotateAngleX = 0.99483767F;

		bodyModel[279].addShapeBox(-3F, 5F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[279].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[279].rotateAngleX = 0.99483767F;

		bodyModel[280].addShapeBox(-4F, 5F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 355
		bodyModel[280].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[280].rotateAngleX = 0.99483767F;

		bodyModel[281].addShapeBox(-1F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[281].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[281].rotateAngleX = 0.99483767F;

		bodyModel[282].addShapeBox(-4F, -1F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[282].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[282].rotateAngleX = 0.99483767F;

		bodyModel[283].addShapeBox(-3F, -1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[283].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[283].rotateAngleX = 0.99483767F;

		bodyModel[284].addShapeBox(-3F, 1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[284].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[284].rotateAngleX = 0.99483767F;

		bodyModel[285].addShapeBox(14F, 8F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[285].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[285].rotateAngleX = 0.99483767F;

		bodyModel[286].addShapeBox(13F, 6F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[286].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[286].rotateAngleX = 0.99483767F;

		bodyModel[287].addShapeBox(14F, 6F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[287].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[287].rotateAngleX = 0.99483767F;

		bodyModel[288].addShapeBox(16F, 6F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[288].setRotationPoint(-40F, -20.5F, 34F);
		bodyModel[288].rotateAngleX = 0.99483767F;

		bodyModel[289].addShapeBox(-6F, 7F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[289].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[289].rotateAngleX = 0.99483767F;
		bodyModel[289].rotateAngleY = -0.06981317F;
		bodyModel[289].rotateAngleZ = 0.05235988F;

		bodyModel[290].addShapeBox(-6F, 8F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 365
		bodyModel[290].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[290].rotateAngleX = 0.99483767F;
		bodyModel[290].rotateAngleY = -0.06981317F;
		bodyModel[290].rotateAngleZ = 0.05235988F;

		bodyModel[291].addShapeBox(-6F, 2F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[291].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[291].rotateAngleX = 0.99483767F;

		bodyModel[292].addShapeBox(-11F, -2F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[292].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[292].rotateAngleX = 0.99483767F;

		bodyModel[293].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[293].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[293].rotateAngleX = 0.99483767F;

		bodyModel[294].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[294].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[294].rotateAngleX = 0.99483767F;

		bodyModel[295].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[295].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[295].rotateAngleX = 0.99483767F;

		bodyModel[296].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[296].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[296].rotateAngleX = 0.99483767F;

		bodyModel[297].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[297].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[297].rotateAngleX = 0.99483767F;

		bodyModel[298].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[298].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[298].rotateAngleX = 0.99483767F;

		bodyModel[299].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[299].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[299].rotateAngleX = 0.99483767F;

		bodyModel[300].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[300].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[300].rotateAngleX = 0.99483767F;

		bodyModel[301].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[301].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[301].rotateAngleX = 0.99483767F;

		bodyModel[302].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[302].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[302].rotateAngleX = 0.99483767F;

		bodyModel[303].addShapeBox(-29F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[303].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[303].rotateAngleX = 0.99483767F;

		bodyModel[304].addShapeBox(-29F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[304].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[304].rotateAngleX = 0.99483767F;

		bodyModel[305].addShapeBox(-25F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[305].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[305].rotateAngleX = 0.99483767F;

		bodyModel[306].addShapeBox(-25F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[306].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[306].rotateAngleX = 0.99483767F;

		bodyModel[307].addShapeBox(-21F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[307].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[307].rotateAngleX = 0.99483767F;

		bodyModel[308].addShapeBox(-21F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[308].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[308].rotateAngleX = 0.99483767F;

		bodyModel[309].addShapeBox(-17F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[309].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[309].rotateAngleX = 0.99483767F;

		bodyModel[310].addShapeBox(-17F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[310].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[310].rotateAngleX = 0.99483767F;

		bodyModel[311].addShapeBox(-13F, 5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[311].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[311].rotateAngleX = 0.99483767F;

		bodyModel[312].addShapeBox(-13F, -5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[312].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[312].rotateAngleX = 0.99483767F;

		bodyModel[313].addShapeBox(-29F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[313].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[313].rotateAngleX = 0.99483767F;

		bodyModel[314].addShapeBox(-29F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[314].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[314].rotateAngleX = 0.99483767F;

		bodyModel[315].addShapeBox(-25F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[315].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[315].rotateAngleX = 0.99483767F;

		bodyModel[316].addShapeBox(-25F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[316].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[316].rotateAngleX = 0.99483767F;

		bodyModel[317].addShapeBox(-21F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[317].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[317].rotateAngleX = 0.99483767F;

		bodyModel[318].addShapeBox(-21F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[318].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[318].rotateAngleX = 0.99483767F;

		bodyModel[319].addShapeBox(-17F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[319].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[319].rotateAngleX = 0.99483767F;

		bodyModel[320].addShapeBox(-17F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[320].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[320].rotateAngleX = 0.99483767F;

		bodyModel[321].addShapeBox(-13F, 11F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[321].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[321].rotateAngleX = 0.99483767F;

		bodyModel[322].addShapeBox(-13F, 1F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[322].setRotationPoint(-65F, -20.5F, 34F);
		bodyModel[322].rotateAngleX = 0.99483767F;

		bodyModel[323].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[323].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[323].rotateAngleX = -0.99483767F;

		bodyModel[324].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[324].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[324].rotateAngleX = -0.99483767F;

		bodyModel[325].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[325].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[325].rotateAngleX = -0.99483767F;

		bodyModel[326].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[326].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[326].rotateAngleX = -0.99483767F;

		bodyModel[327].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[327].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[327].rotateAngleX = -0.99483767F;

		bodyModel[328].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[328].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[328].rotateAngleX = -0.99483767F;

		bodyModel[329].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[329].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[329].rotateAngleX = -0.99483767F;

		bodyModel[330].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[330].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[330].rotateAngleX = -0.99483767F;

		bodyModel[331].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[331].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[331].rotateAngleX = -0.99483767F;

		bodyModel[332].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[332].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[332].rotateAngleX = -0.99483767F;

		bodyModel[333].addShapeBox(-29F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[333].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[333].rotateAngleX = -0.99483767F;

		bodyModel[334].addShapeBox(-29F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[334].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[334].rotateAngleX = -0.99483767F;

		bodyModel[335].addShapeBox(-25F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[335].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[335].rotateAngleX = -0.99483767F;

		bodyModel[336].addShapeBox(-25F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[336].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[336].rotateAngleX = -0.99483767F;

		bodyModel[337].addShapeBox(-21F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[337].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[337].rotateAngleX = -0.99483767F;

		bodyModel[338].addShapeBox(-21F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[338].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[338].rotateAngleX = -0.99483767F;

		bodyModel[339].addShapeBox(-17F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[339].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[339].rotateAngleX = -0.99483767F;

		bodyModel[340].addShapeBox(-17F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[340].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[340].rotateAngleX = -0.99483767F;

		bodyModel[341].addShapeBox(-13F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[341].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[341].rotateAngleX = -0.99483767F;

		bodyModel[342].addShapeBox(-13F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[342].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[342].rotateAngleX = -0.99483767F;

		bodyModel[343].addShapeBox(-29F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[343].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[343].rotateAngleX = -0.99483767F;

		bodyModel[344].addShapeBox(-29F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[344].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[344].rotateAngleX = -0.99483767F;

		bodyModel[345].addShapeBox(-25F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[345].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[345].rotateAngleX = -0.99483767F;

		bodyModel[346].addShapeBox(-25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[346].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[346].rotateAngleX = -0.99483767F;

		bodyModel[347].addShapeBox(-21F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[347].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[347].rotateAngleX = -0.99483767F;

		bodyModel[348].addShapeBox(-21F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[348].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[348].rotateAngleX = -0.99483767F;

		bodyModel[349].addShapeBox(-17F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[349].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[349].rotateAngleX = -0.99483767F;

		bodyModel[350].addShapeBox(-17F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[350].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[350].rotateAngleX = -0.99483767F;

		bodyModel[351].addShapeBox(-13F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[351].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[351].rotateAngleX = -0.99483767F;

		bodyModel[352].addShapeBox(-13F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[352].setRotationPoint(-65F, -21.5F, -35F);
		bodyModel[352].rotateAngleX = -0.99483767F;

		bodyModel[353].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 428
		bodyModel[353].setRotationPoint(21F, -7F, -45F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[354].setRotationPoint(25F, -7F, -45F);

		bodyModel[355].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 430
		bodyModel[355].setRotationPoint(21F, -7F, 44F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[356].setRotationPoint(25F, -7F, 44F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 25, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 432
		bodyModel[357].setRotationPoint(7F, -27F, -5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 10, 25, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[358].setRotationPoint(7F, -19.5F, -12.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[359].setRotationPoint(25F, -7F, 18F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 487
		bodyModel[360].setRotationPoint(21F, -7F, 18F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 488
		bodyModel[361].setRotationPoint(21F, -7F, -19F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[362].setRotationPoint(25F, -7F, -19F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 9, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[363].setRotationPoint(-109F, -8F, 15F);
		bodyModel[363].rotateAngleZ = 0.34906585F;

		bodyModel[364].addFlexTrapezoid(0F, 0F, 0F, 9, 13, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 775
		bodyModel[364].setRotationPoint(-109F, -8F, -19F);
		bodyModel[364].rotateAngleZ = 0.34906585F;

		bodyModel[365].addShapeBox(0F, 0F, 0F, 52, 7, 13, 0F,0F, -7F, -13F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1239
		bodyModel[365].setRotationPoint(-111F, -30F, 18F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 56, 17, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 1240
		bodyModel[366].setRotationPoint(-59F, -30F, 18F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 52, 7, 1, 0F,0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, 13F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 13F); // Box 1241
		bodyModel[367].setRotationPoint(-111F, -30F, 17F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 10, 17, 12, 0F,0F, 0F, -10F, 0F, -2F, 0F, 0F, -17F, 0F, 10F, -7F, 11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 11F); // Box 1242
		bodyModel[368].setRotationPoint(-3F, -30F, 8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 91, 10, 14, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1243
		bodyModel[369].setRotationPoint(-111F, -23F, -45F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 23, 4, 7, 0F,-7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1253
		bodyModel[370].setRotationPoint(-56.5F, -30F, -24.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 434
		barrelModel[1] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 435
		barrelModel[2] = new ModelRendererTurbo(this, 929, 185, textureX, textureY); // Box 436
		barrelModel[3] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Box 404
		barrelModel[4] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 405
		barrelModel[5] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 406
		barrelModel[6] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 407
		barrelModel[7] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 408
		barrelModel[8] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Box 409
		barrelModel[9] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 410
		barrelModel[10] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 411
		barrelModel[11] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 412
		barrelModel[12] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 413
		barrelModel[13] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Box 415
		barrelModel[14] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 416
		barrelModel[15] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 421
		barrelModel[16] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 422
		barrelModel[17] = new ModelRendererTurbo(this, 937, 185, textureX, textureY); // Box 423
		barrelModel[18] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 424
		barrelModel[19] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 425
		barrelModel[20] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 426
		barrelModel[21] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 427
		barrelModel[22] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 428
		barrelModel[23] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 429
		barrelModel[24] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 430
		barrelModel[25] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 431
		barrelModel[26] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 432
		barrelModel[27] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 433
		barrelModel[28] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 434
		barrelModel[29] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 435
		barrelModel[30] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 436
		barrelModel[31] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 437
		barrelModel[32] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 438
		barrelModel[33] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Box 439
		barrelModel[34] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 440
		barrelModel[35] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 441

		barrelModel[0].addShapeBox(3F, -8.5F, -13F, 5, 18, 26, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 434
		barrelModel[0].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[1].addShapeBox(3F, -12.5F, -13F, 5, 4, 26, 0F,0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 435
		barrelModel[1].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[2].addShapeBox(3F, 9.5F, -13F, 5, 4, 26, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0F, -4F); // Box 436
		barrelModel[2].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[3].addShapeBox(8F, 6.5F, -10F, 3, 4, 20, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F); // Box 404
		barrelModel[3].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[4].addShapeBox(8F, -5.5F, -10F, 3, 12, 20, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 405
		barrelModel[4].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[5].addShapeBox(8F, -9.5F, -10F, 3, 4, 20, 0F,0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 406
		barrelModel[5].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[6].addShapeBox(11F, -1F, -2F, 79, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 407
		barrelModel[6].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[7].addShapeBox(11F, -2F, -2F, 79, 1, 5, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 408
		barrelModel[7].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[8].addShapeBox(11F, 2F, -2F, 79, 1, 5, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 409
		barrelModel[8].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[9].addShapeBox(90F, 0F, -1.5F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 410
		barrelModel[9].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[10].addShapeBox(90F, -1F, -1.5F, 1, 1, 4, 0F,0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 411
		barrelModel[10].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[11].addShapeBox(90F, 1F, -1.5F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -1.5F); // Box 412
		barrelModel[11].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[12].addShapeBox(91F, -0.5F, -1.5F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		barrelModel[12].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[13].addShapeBox(91F, -1.5F, -1.5F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		barrelModel[13].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[14].addShapeBox(91F, 1.5F, -1.5F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 416
		barrelModel[14].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[15].addShapeBox(100F, 2F, -2.5F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F); // Box 421
		barrelModel[15].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[16].addShapeBox(100F, -1F, -2.5F, 1, 3, 6, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 422
		barrelModel[16].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[17].addShapeBox(100F, -2F, -2.5F, 1, 1, 6, 0F,0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 423
		barrelModel[17].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[18].addShapeBox(-2F, -8.5F, -13F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 424
		barrelModel[18].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[19].addShapeBox(-2F, -12.5F, -9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 425
		barrelModel[19].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[20].addShapeBox(-2F, -12.5F, -13F, 5, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		barrelModel[20].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[21].addShapeBox(-2F, -12.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		barrelModel[21].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[22].addShapeBox(-2F, -8.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 428
		barrelModel[22].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[23].addShapeBox(-2F, -12.5F, 5F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		barrelModel[23].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[24].addShapeBox(-2F, 9.5F, -9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 430
		barrelModel[24].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[25].addShapeBox(-2F, 9.5F, 5F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		barrelModel[25].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[26].addShapeBox(-2F, 9.5F, 9F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 432
		barrelModel[26].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[27].addShapeBox(-2F, 9.5F, -13F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		barrelModel[27].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[28].addShapeBox(-2F, 5.5F, 9F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		barrelModel[28].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[29].addShapeBox(-2F, 5.5F, -13F, 5, 4, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		barrelModel[29].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[30].addShapeBox(-3F, -1F, -2F, 8, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		barrelModel[30].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[31].addShapeBox(-3F, -2F, -2F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		barrelModel[31].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[32].addShapeBox(-3F, 2F, -2F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 438
		barrelModel[32].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[33].addShapeBox(97F, 2F, -2.5F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F); // Box 439
		barrelModel[33].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[34].addShapeBox(97F, -1F, -2.5F, 1, 3, 6, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 440
		barrelModel[34].setRotationPoint(10F, -14.5F, 0F);

		barrelModel[35].addShapeBox(97F, -2F, -2.5F, 1, 1, 6, 0F,0F, 0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 441
		barrelModel[35].setRotationPoint(10F, -14.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 758
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 759
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 760
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 761
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 762
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 763
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 764
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 765
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 800
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 801
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 802
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 803
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 804
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 805
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 806
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 807
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 808
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 809
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 810
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 811
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 812
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 813
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 814
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 815
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 816
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 817
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 818
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 819
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 820
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 821
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 822
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 823
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 824
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 825
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 826
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 827
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 828
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 829
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 830
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 831

		leftTrackWheelModels[0].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 758
		leftTrackWheelModels[0].setRotationPoint(26.5F, -2F, 41F);

		leftTrackWheelModels[1].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 759
		leftTrackWheelModels[1].setRotationPoint(26.5F, -2F, 36F);

		leftTrackWheelModels[2].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 760
		leftTrackWheelModels[2].setRotationPoint(26.5F, -2F, 25F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 761
		leftTrackWheelModels[3].setRotationPoint(26.5F, -2F, 30F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 762
		leftTrackWheelModels[4].setRotationPoint(-106.5F, -2F, 41F);

		leftTrackWheelModels[5].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 763
		leftTrackWheelModels[5].setRotationPoint(-106.5F, -2F, 36F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 764
		leftTrackWheelModels[6].setRotationPoint(-106.5F, -2F, 25F);

		leftTrackWheelModels[7].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 765
		leftTrackWheelModels[7].setRotationPoint(-106.5F, -2F, 30F);

		leftTrackWheelModels[8].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 800
		leftTrackWheelModels[8].setRotationPoint(-45F, 4.5F, 41F);

		leftTrackWheelModels[9].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 801
		leftTrackWheelModels[9].setRotationPoint(-45F, 4.5F, 36F);

		leftTrackWheelModels[10].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 802
		leftTrackWheelModels[10].setRotationPoint(-64F, 4.5F, 41F);

		leftTrackWheelModels[11].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 803
		leftTrackWheelModels[11].setRotationPoint(-64F, 4.5F, 36F);

		leftTrackWheelModels[12].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 804
		leftTrackWheelModels[12].setRotationPoint(-64F, 4.5F, 29F);

		leftTrackWheelModels[13].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 805
		leftTrackWheelModels[13].setRotationPoint(-64F, 4.5F, 24F);

		leftTrackWheelModels[14].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 806
		leftTrackWheelModels[14].setRotationPoint(-45F, 4.5F, 24F);

		leftTrackWheelModels[15].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 807
		leftTrackWheelModels[15].setRotationPoint(-45F, 4.5F, 29F);

		leftTrackWheelModels[16].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 808
		leftTrackWheelModels[16].setRotationPoint(-33F, 4.5F, 41F);

		leftTrackWheelModels[17].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 809
		leftTrackWheelModels[17].setRotationPoint(-33F, 4.5F, 36F);

		leftTrackWheelModels[18].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 810
		leftTrackWheelModels[18].setRotationPoint(-33F, 4.5F, 29F);

		leftTrackWheelModels[19].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 811
		leftTrackWheelModels[19].setRotationPoint(-33F, 4.5F, 24F);

		leftTrackWheelModels[20].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 812
		leftTrackWheelModels[20].setRotationPoint(-14F, 4.5F, 24F);

		leftTrackWheelModels[21].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 813
		leftTrackWheelModels[21].setRotationPoint(-14F, 4.5F, 29F);

		leftTrackWheelModels[22].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 814
		leftTrackWheelModels[22].setRotationPoint(-14F, 4.5F, 36F);

		leftTrackWheelModels[23].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 815
		leftTrackWheelModels[23].setRotationPoint(-14F, 4.5F, 41F);

		leftTrackWheelModels[24].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 816
		leftTrackWheelModels[24].setRotationPoint(16F, 4.5F, 24F);

		leftTrackWheelModels[25].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 817
		leftTrackWheelModels[25].setRotationPoint(16F, 4.5F, 29F);

		leftTrackWheelModels[26].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 818
		leftTrackWheelModels[26].setRotationPoint(16F, 4.5F, 36F);

		leftTrackWheelModels[27].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 819
		leftTrackWheelModels[27].setRotationPoint(16F, 4.5F, 41F);

		leftTrackWheelModels[28].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 820
		leftTrackWheelModels[28].setRotationPoint(-3F, 4.5F, 24F);

		leftTrackWheelModels[29].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 821
		leftTrackWheelModels[29].setRotationPoint(-3F, 4.5F, 29F);

		leftTrackWheelModels[30].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 822
		leftTrackWheelModels[30].setRotationPoint(-3F, 4.5F, 36F);

		leftTrackWheelModels[31].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 823
		leftTrackWheelModels[31].setRotationPoint(-3F, 4.5F, 41F);

		leftTrackWheelModels[32].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 824
		leftTrackWheelModels[32].setRotationPoint(-75F, 4.5F, 24F);

		leftTrackWheelModels[33].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 825
		leftTrackWheelModels[33].setRotationPoint(-75F, 4.5F, 29F);

		leftTrackWheelModels[34].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 826
		leftTrackWheelModels[34].setRotationPoint(-75F, 4.5F, 36F);

		leftTrackWheelModels[35].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 827
		leftTrackWheelModels[35].setRotationPoint(-75F, 4.5F, 41F);

		leftTrackWheelModels[36].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 828
		leftTrackWheelModels[36].setRotationPoint(-94F, 4.5F, 24F);

		leftTrackWheelModels[37].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 829
		leftTrackWheelModels[37].setRotationPoint(-94F, 4.5F, 29F);

		leftTrackWheelModels[38].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 830
		leftTrackWheelModels[38].setRotationPoint(-94F, 4.5F, 36F);

		leftTrackWheelModels[39].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 831
		leftTrackWheelModels[39].setRotationPoint(-94F, 4.5F, 41F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 7
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 466
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 467
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 471
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 472
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 473
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 474
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 475
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 476
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 477
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 478
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 479
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 768
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 770
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 771
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 135, 212, textureX, textureY); // Shape 773
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 776
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 777
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 778
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 779
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 780
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 781
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 782
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 783
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 784
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 785
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 786
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 787
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 788
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 789
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 790
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 791
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 792
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 793
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 794
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 795
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 796
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 797
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 798
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 10, 213, textureX, textureY); // Shape 799

		rightTrackWheelModels[0].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 7
		rightTrackWheelModels[0].setRotationPoint(26.5F, -2F, -38F);

		rightTrackWheelModels[1].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 466
		rightTrackWheelModels[1].setRotationPoint(-45F, 4.5F, -38F);

		rightTrackWheelModels[2].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 467
		rightTrackWheelModels[2].setRotationPoint(-45F, 4.5F, -33F);

		rightTrackWheelModels[3].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 471
		rightTrackWheelModels[3].setRotationPoint(-64F, 4.5F, -38F);

		rightTrackWheelModels[4].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 472
		rightTrackWheelModels[4].setRotationPoint(-64F, 4.5F, -33F);

		rightTrackWheelModels[5].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 473
		rightTrackWheelModels[5].setRotationPoint(26.5F, -2F, -33F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 474
		rightTrackWheelModels[6].setRotationPoint(26.5F, -2F, -22F);

		rightTrackWheelModels[7].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 475
		rightTrackWheelModels[7].setRotationPoint(26.5F, -2F, -27F);

		rightTrackWheelModels[8].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 476
		rightTrackWheelModels[8].setRotationPoint(-64F, 4.5F, -26F);

		rightTrackWheelModels[9].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 477
		rightTrackWheelModels[9].setRotationPoint(-64F, 4.5F, -21F);

		rightTrackWheelModels[10].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 478
		rightTrackWheelModels[10].setRotationPoint(-45F, 4.5F, -21F);

		rightTrackWheelModels[11].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 479
		rightTrackWheelModels[11].setRotationPoint(-45F, 4.5F, -26F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 768
		rightTrackWheelModels[12].setRotationPoint(-106.5F, -2F, -27F);

		rightTrackWheelModels[13].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 770
		rightTrackWheelModels[13].setRotationPoint(-106.5F, -2F, -33F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 771
		rightTrackWheelModels[14].setRotationPoint(-106.5F, -2F, -38F);

		rightTrackWheelModels[15].addShape3D(5F, -5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 3, 10, 10, 36, 3, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Shape 773
		rightTrackWheelModels[15].setRotationPoint(-106.5F, -2F, -22F);

		rightTrackWheelModels[16].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 776
		rightTrackWheelModels[16].setRotationPoint(-33F, 4.5F, -38F);

		rightTrackWheelModels[17].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 777
		rightTrackWheelModels[17].setRotationPoint(-33F, 4.5F, -33F);

		rightTrackWheelModels[18].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 778
		rightTrackWheelModels[18].setRotationPoint(-33F, 4.5F, -26F);

		rightTrackWheelModels[19].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 779
		rightTrackWheelModels[19].setRotationPoint(-33F, 4.5F, -21F);

		rightTrackWheelModels[20].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 780
		rightTrackWheelModels[20].setRotationPoint(-14F, 4.5F, -21F);

		rightTrackWheelModels[21].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 781
		rightTrackWheelModels[21].setRotationPoint(-14F, 4.5F, -26F);

		rightTrackWheelModels[22].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 782
		rightTrackWheelModels[22].setRotationPoint(-14F, 4.5F, -33F);

		rightTrackWheelModels[23].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 783
		rightTrackWheelModels[23].setRotationPoint(-14F, 4.5F, -38F);

		rightTrackWheelModels[24].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 784
		rightTrackWheelModels[24].setRotationPoint(16F, 4.5F, -21F);

		rightTrackWheelModels[25].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 785
		rightTrackWheelModels[25].setRotationPoint(16F, 4.5F, -26F);

		rightTrackWheelModels[26].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 786
		rightTrackWheelModels[26].setRotationPoint(16F, 4.5F, -33F);

		rightTrackWheelModels[27].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 787
		rightTrackWheelModels[27].setRotationPoint(16F, 4.5F, -38F);

		rightTrackWheelModels[28].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 788
		rightTrackWheelModels[28].setRotationPoint(-3F, 4.5F, -21F);

		rightTrackWheelModels[29].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 789
		rightTrackWheelModels[29].setRotationPoint(-3F, 4.5F, -26F);

		rightTrackWheelModels[30].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 790
		rightTrackWheelModels[30].setRotationPoint(-3F, 4.5F, -33F);

		rightTrackWheelModels[31].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 791
		rightTrackWheelModels[31].setRotationPoint(-3F, 4.5F, -38F);

		rightTrackWheelModels[32].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 792
		rightTrackWheelModels[32].setRotationPoint(-75F, 4.5F, -21F);

		rightTrackWheelModels[33].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 793
		rightTrackWheelModels[33].setRotationPoint(-75F, 4.5F, -26F);

		rightTrackWheelModels[34].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 794
		rightTrackWheelModels[34].setRotationPoint(-75F, 4.5F, -33F);

		rightTrackWheelModels[35].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 795
		rightTrackWheelModels[35].setRotationPoint(-75F, 4.5F, -38F);

		rightTrackWheelModels[36].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 796
		rightTrackWheelModels[36].setRotationPoint(-94F, 4.5F, -21F);

		rightTrackWheelModels[37].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 797
		rightTrackWheelModels[37].setRotationPoint(-94F, 4.5F, -26F);

		rightTrackWheelModels[38].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 798
		rightTrackWheelModels[38].setRotationPoint(-94F, 4.5F, -33F);

		rightTrackWheelModels[39].addShape3D(4.5F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 3, 9, 9, 32, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Shape 799
		rightTrackWheelModels[39].setRotationPoint(-94F, 4.5F, -38F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1414
		leftTrackModel[1] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1415
		leftTrackModel[2] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1416
		leftTrackModel[3] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1417
		leftTrackModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1418
		leftTrackModel[5] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1419
		leftTrackModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1420
		leftTrackModel[7] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1421
		leftTrackModel[8] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1422
		leftTrackModel[9] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1423
		leftTrackModel[10] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1424
		leftTrackModel[11] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1425
		leftTrackModel[12] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1426
		leftTrackModel[13] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1427
		leftTrackModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1428
		leftTrackModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1429
		leftTrackModel[16] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1430
		leftTrackModel[17] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1431
		leftTrackModel[18] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1432
		leftTrackModel[19] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1433
		leftTrackModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1434
		leftTrackModel[21] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1435
		leftTrackModel[22] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1436
		leftTrackModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1437
		leftTrackModel[24] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1438
		leftTrackModel[25] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1439
		leftTrackModel[26] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1440
		leftTrackModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1441
		leftTrackModel[28] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1442
		leftTrackModel[29] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1443
		leftTrackModel[30] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1444
		leftTrackModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1445
		leftTrackModel[32] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1446
		leftTrackModel[33] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1447
		leftTrackModel[34] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1448
		leftTrackModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1449
		leftTrackModel[36] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1450
		leftTrackModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1451
		leftTrackModel[38] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1452
		leftTrackModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1453
		leftTrackModel[40] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1454
		leftTrackModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1455
		leftTrackModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1456
		leftTrackModel[43] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1457
		leftTrackModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1458
		leftTrackModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1459
		leftTrackModel[46] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1460
		leftTrackModel[47] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1461
		leftTrackModel[48] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1462
		leftTrackModel[49] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1463
		leftTrackModel[50] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1464
		leftTrackModel[51] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1465
		leftTrackModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1466
		leftTrackModel[53] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1467
		leftTrackModel[54] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1468
		leftTrackModel[55] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1469
		leftTrackModel[56] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1470
		leftTrackModel[57] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1471
		leftTrackModel[58] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1472
		leftTrackModel[59] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1473
		leftTrackModel[60] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1474
		leftTrackModel[61] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1475
		leftTrackModel[62] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1476
		leftTrackModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1477
		leftTrackModel[64] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1478
		leftTrackModel[65] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1479
		leftTrackModel[66] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1480
		leftTrackModel[67] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1481
		leftTrackModel[68] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1482
		leftTrackModel[69] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1483
		leftTrackModel[70] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1484
		leftTrackModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1485
		leftTrackModel[72] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1486
		leftTrackModel[73] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1487
		leftTrackModel[74] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1488
		leftTrackModel[75] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1489
		leftTrackModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1490
		leftTrackModel[77] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1491
		leftTrackModel[78] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1492
		leftTrackModel[79] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1493
		leftTrackModel[80] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1494
		leftTrackModel[81] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1495
		leftTrackModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1496
		leftTrackModel[83] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1497
		leftTrackModel[84] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1498
		leftTrackModel[85] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1499
		leftTrackModel[86] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1500
		leftTrackModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1501
		leftTrackModel[88] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1502
		leftTrackModel[89] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1503
		leftTrackModel[90] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1504
		leftTrackModel[91] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1505
		leftTrackModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1506
		leftTrackModel[93] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1507
		leftTrackModel[94] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1508
		leftTrackModel[95] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1509
		leftTrackModel[96] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1510
		leftTrackModel[97] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1511
		leftTrackModel[98] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1512
		leftTrackModel[99] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1513
		leftTrackModel[100] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1514
		leftTrackModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1515
		leftTrackModel[102] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1516
		leftTrackModel[103] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1517
		leftTrackModel[104] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1518
		leftTrackModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1519
		leftTrackModel[106] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1520
		leftTrackModel[107] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1521
		leftTrackModel[108] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1522
		leftTrackModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1523
		leftTrackModel[110] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1524
		leftTrackModel[111] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1525
		leftTrackModel[112] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1526
		leftTrackModel[113] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1527
		leftTrackModel[114] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1528
		leftTrackModel[115] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1529
		leftTrackModel[116] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 1530
		leftTrackModel[117] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 1531
		leftTrackModel[118] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1532
		leftTrackModel[119] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1533
		leftTrackModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1534
		leftTrackModel[121] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1535
		leftTrackModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1536
		leftTrackModel[123] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1537
		leftTrackModel[124] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1538
		leftTrackModel[125] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1539
		leftTrackModel[126] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1540
		leftTrackModel[127] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1541
		leftTrackModel[128] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1542
		leftTrackModel[129] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1543
		leftTrackModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1544
		leftTrackModel[131] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1545
		leftTrackModel[132] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1546
		leftTrackModel[133] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1547
		leftTrackModel[134] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1548
		leftTrackModel[135] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1549
		leftTrackModel[136] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1550
		leftTrackModel[137] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1551
		leftTrackModel[138] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1552
		leftTrackModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1553
		leftTrackModel[140] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1554
		leftTrackModel[141] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1555
		leftTrackModel[142] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 1556
		leftTrackModel[143] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1557
		leftTrackModel[144] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 1558
		leftTrackModel[145] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 1559
		leftTrackModel[146] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 1560
		leftTrackModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1561
		leftTrackModel[148] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 1562
		leftTrackModel[149] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 1563
		leftTrackModel[150] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1564
		leftTrackModel[151] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1565
		leftTrackModel[152] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1566
		leftTrackModel[153] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1567
		leftTrackModel[154] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1568
		leftTrackModel[155] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 1569
		leftTrackModel[156] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1570
		leftTrackModel[157] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1571
		leftTrackModel[158] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1572
		leftTrackModel[159] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1573
		leftTrackModel[160] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1574
		leftTrackModel[161] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1575
		leftTrackModel[162] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1576
		leftTrackModel[163] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1577
		leftTrackModel[164] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1578
		leftTrackModel[165] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1579
		leftTrackModel[166] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1580
		leftTrackModel[167] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1581
		leftTrackModel[168] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1582
		leftTrackModel[169] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1583
		leftTrackModel[170] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1584
		leftTrackModel[171] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1585
		leftTrackModel[172] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1586
		leftTrackModel[173] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1587
		leftTrackModel[174] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1588
		leftTrackModel[175] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1589
		leftTrackModel[176] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1590
		leftTrackModel[177] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1591
		leftTrackModel[178] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1592
		leftTrackModel[179] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1593
		leftTrackModel[180] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1594
		leftTrackModel[181] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1595
		leftTrackModel[182] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1596
		leftTrackModel[183] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1597
		leftTrackModel[184] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1598
		leftTrackModel[185] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1599
		leftTrackModel[186] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1600
		leftTrackModel[187] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1601
		leftTrackModel[188] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1602
		leftTrackModel[189] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1603
		leftTrackModel[190] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1604
		leftTrackModel[191] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1605
		leftTrackModel[192] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1606
		leftTrackModel[193] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1607
		leftTrackModel[194] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1608
		leftTrackModel[195] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1609
		leftTrackModel[196] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1610
		leftTrackModel[197] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1611
		leftTrackModel[198] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1612
		leftTrackModel[199] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1613
		leftTrackModel[200] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1614
		leftTrackModel[201] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1615
		leftTrackModel[202] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1616
		leftTrackModel[203] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1617
		leftTrackModel[204] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1618
		leftTrackModel[205] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1619
		leftTrackModel[206] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1620
		leftTrackModel[207] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1621
		leftTrackModel[208] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1622
		leftTrackModel[209] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1623
		leftTrackModel[210] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1624
		leftTrackModel[211] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1625
		leftTrackModel[212] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1626
		leftTrackModel[213] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1627
		leftTrackModel[214] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1628
		leftTrackModel[215] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1629
		leftTrackModel[216] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1630
		leftTrackModel[217] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1631
		leftTrackModel[218] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1632
		leftTrackModel[219] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1633
		leftTrackModel[220] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1634
		leftTrackModel[221] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1635
		leftTrackModel[222] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1636
		leftTrackModel[223] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1637
		leftTrackModel[224] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1638
		leftTrackModel[225] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1639
		leftTrackModel[226] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1640
		leftTrackModel[227] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1641
		leftTrackModel[228] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1642
		leftTrackModel[229] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1643
		leftTrackModel[230] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1644
		leftTrackModel[231] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1645
		leftTrackModel[232] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1646
		leftTrackModel[233] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1647
		leftTrackModel[234] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1648
		leftTrackModel[235] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1649
		leftTrackModel[236] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1650
		leftTrackModel[237] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1651
		leftTrackModel[238] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1652
		leftTrackModel[239] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1653
		leftTrackModel[240] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1654
		leftTrackModel[241] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1655
		leftTrackModel[242] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1656
		leftTrackModel[243] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1657
		leftTrackModel[244] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1658
		leftTrackModel[245] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1659
		leftTrackModel[246] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1660
		leftTrackModel[247] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1661
		leftTrackModel[248] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1662
		leftTrackModel[249] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1663
		leftTrackModel[250] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1664
		leftTrackModel[251] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1665
		leftTrackModel[252] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1666
		leftTrackModel[253] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1667
		leftTrackModel[254] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1668
		leftTrackModel[255] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1669
		leftTrackModel[256] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1670
		leftTrackModel[257] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1671
		leftTrackModel[258] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1672
		leftTrackModel[259] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1673
		leftTrackModel[260] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1674
		leftTrackModel[261] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1675
		leftTrackModel[262] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1676
		leftTrackModel[263] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1677
		leftTrackModel[264] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1678
		leftTrackModel[265] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1679
		leftTrackModel[266] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1680
		leftTrackModel[267] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1681
		leftTrackModel[268] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1682
		leftTrackModel[269] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1683
		leftTrackModel[270] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1684
		leftTrackModel[271] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1685
		leftTrackModel[272] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1686
		leftTrackModel[273] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1687
		leftTrackModel[274] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1688
		leftTrackModel[275] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1689
		leftTrackModel[276] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1690
		leftTrackModel[277] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1691
		leftTrackModel[278] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1692
		leftTrackModel[279] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1693
		leftTrackModel[280] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1694
		leftTrackModel[281] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1695
		leftTrackModel[282] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1696
		leftTrackModel[283] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1697
		leftTrackModel[284] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1698
		leftTrackModel[285] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1699
		leftTrackModel[286] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1700
		leftTrackModel[287] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1701
		leftTrackModel[288] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1702
		leftTrackModel[289] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1703
		leftTrackModel[290] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1704
		leftTrackModel[291] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1705
		leftTrackModel[292] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1706
		leftTrackModel[293] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1707
		leftTrackModel[294] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1708
		leftTrackModel[295] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1709
		leftTrackModel[296] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1710
		leftTrackModel[297] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1711
		leftTrackModel[298] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1712
		leftTrackModel[299] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1713
		leftTrackModel[300] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1714
		leftTrackModel[301] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1715
		leftTrackModel[302] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1716
		leftTrackModel[303] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1717
		leftTrackModel[304] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1718
		leftTrackModel[305] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1719
		leftTrackModel[306] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1720
		leftTrackModel[307] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 1721
		leftTrackModel[308] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 1722
		leftTrackModel[309] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1723
		leftTrackModel[310] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 1724
		leftTrackModel[311] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1725
		leftTrackModel[312] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 1726
		leftTrackModel[313] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1727
		leftTrackModel[314] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 1728
		leftTrackModel[315] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1730
		leftTrackModel[316] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1731
		leftTrackModel[317] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1734
		leftTrackModel[318] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1735
		leftTrackModel[319] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1738
		leftTrackModel[320] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1739
		leftTrackModel[321] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1740
		leftTrackModel[322] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1741
		leftTrackModel[323] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1742
		leftTrackModel[324] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 1743
		leftTrackModel[325] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 1744
		leftTrackModel[326] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 1745
		leftTrackModel[327] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 1746
		leftTrackModel[328] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 1747
		leftTrackModel[329] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1748
		leftTrackModel[330] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1762
		leftTrackModel[331] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1763
		leftTrackModel[332] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1764
		leftTrackModel[333] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1765
		leftTrackModel[334] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1766
		leftTrackModel[335] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1767
		leftTrackModel[336] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1768
		leftTrackModel[337] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1769
		leftTrackModel[338] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1770
		leftTrackModel[339] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1771
		leftTrackModel[340] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1772
		leftTrackModel[341] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1773
		leftTrackModel[342] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1774
		leftTrackModel[343] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1775
		leftTrackModel[344] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1776
		leftTrackModel[345] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1777
		leftTrackModel[346] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1778
		leftTrackModel[347] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1779
		leftTrackModel[348] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1780
		leftTrackModel[349] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1781
		leftTrackModel[350] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1782
		leftTrackModel[351] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1783
		leftTrackModel[352] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1784
		leftTrackModel[353] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1785
		leftTrackModel[354] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1786
		leftTrackModel[355] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1787
		leftTrackModel[356] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1788
		leftTrackModel[357] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1789
		leftTrackModel[358] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1790
		leftTrackModel[359] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1791
		leftTrackModel[360] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1792
		leftTrackModel[361] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1793
		leftTrackModel[362] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1794
		leftTrackModel[363] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1795
		leftTrackModel[364] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1796
		leftTrackModel[365] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1797
		leftTrackModel[366] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1798
		leftTrackModel[367] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1257
		leftTrackModel[368] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1258
		leftTrackModel[369] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1259
		leftTrackModel[370] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1260
		leftTrackModel[371] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1261
		leftTrackModel[372] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1262
		leftTrackModel[373] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1263
		leftTrackModel[374] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1264
		leftTrackModel[375] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1265
		leftTrackModel[376] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1266
		leftTrackModel[377] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1267
		leftTrackModel[378] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1268
		leftTrackModel[379] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1269
		leftTrackModel[380] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1270
		leftTrackModel[381] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1271
		leftTrackModel[382] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1272
		leftTrackModel[383] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1273
		leftTrackModel[384] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1274
		leftTrackModel[385] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1275
		leftTrackModel[386] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1276
		leftTrackModel[387] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1277
		leftTrackModel[388] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1278
		leftTrackModel[389] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1279
		leftTrackModel[390] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1280
		leftTrackModel[391] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1281
		leftTrackModel[392] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1282
		leftTrackModel[393] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1283
		leftTrackModel[394] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1284
		leftTrackModel[395] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1285
		leftTrackModel[396] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1286
		leftTrackModel[397] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1287
		leftTrackModel[398] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1288
		leftTrackModel[399] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1289
		leftTrackModel[400] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1290
		leftTrackModel[401] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1291
		leftTrackModel[402] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1292

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1414
		leftTrackModel[0].setRotationPoint(-59F, -4F, 19F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1415
		leftTrackModel[1].setRotationPoint(-59F, -1F, 19F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1416
		leftTrackModel[2].setRotationPoint(-57F, 4F, 20F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1417
		leftTrackModel[3].setRotationPoint(-57F, 1F, 20F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1418
		leftTrackModel[4].setRotationPoint(-62F, 1F, 20F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1419
		leftTrackModel[5].setRotationPoint(-64F, 3F, 20F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1420
		leftTrackModel[6].setRotationPoint(-52F, 1F, 20F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1421
		leftTrackModel[7].setRotationPoint(-45F, 3F, 20F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1422
		leftTrackModel[8].setRotationPoint(-47F, 3F, 20F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1423
		leftTrackModel[9].setRotationPoint(-65F, 3F, 20F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1424
		leftTrackModel[10].setRotationPoint(-45F, 3F, 41F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1425
		leftTrackModel[11].setRotationPoint(-47F, 3F, 41F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1426
		leftTrackModel[12].setRotationPoint(-52F, 1F, 41F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1427
		leftTrackModel[13].setRotationPoint(-57F, 1F, 41F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1428
		leftTrackModel[14].setRotationPoint(-62F, 1F, 41F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1429
		leftTrackModel[15].setRotationPoint(-64F, 3F, 41F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1430
		leftTrackModel[16].setRotationPoint(-65F, 3F, 41F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1431
		leftTrackModel[17].setRotationPoint(-57F, 4F, 41F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1432
		leftTrackModel[18].setRotationPoint(-45F, 3F, 32F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1433
		leftTrackModel[19].setRotationPoint(-47F, 3F, 32F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1434
		leftTrackModel[20].setRotationPoint(-52F, 1F, 32F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1435
		leftTrackModel[21].setRotationPoint(-57F, 1F, 32F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1436
		leftTrackModel[22].setRotationPoint(-57F, 4F, 32F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1437
		leftTrackModel[23].setRotationPoint(-62F, 1F, 32F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1438
		leftTrackModel[24].setRotationPoint(-65F, 3F, 32F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1439
		leftTrackModel[25].setRotationPoint(-64F, 3F, 32F);

		leftTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1440
		leftTrackModel[26].setRotationPoint(-45F, 3F, 29F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1441
		leftTrackModel[27].setRotationPoint(-47F, 3F, 29F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1442
		leftTrackModel[28].setRotationPoint(-52F, 1F, 29F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1443
		leftTrackModel[29].setRotationPoint(-57F, 1F, 29F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1444
		leftTrackModel[30].setRotationPoint(-57F, 4F, 29F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1445
		leftTrackModel[31].setRotationPoint(-62F, 1F, 29F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1446
		leftTrackModel[32].setRotationPoint(-65F, 3F, 29F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1447
		leftTrackModel[33].setRotationPoint(-64F, 3F, 29F);

		leftTrackModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1448
		leftTrackModel[34].setRotationPoint(-46F, 3.5F, 19.5F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1449
		leftTrackModel[35].setRotationPoint(-65F, 3.5F, 19.5F);

		leftTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1450
		leftTrackModel[36].setRotationPoint(-46F, 3.5F, 31.5F);

		leftTrackModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1451
		leftTrackModel[37].setRotationPoint(-65F, 3.5F, 31.5F);

		leftTrackModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1452
		leftTrackModel[38].setRotationPoint(25.5F, -3F, 18.5F);

		leftTrackModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1453
		leftTrackModel[39].setRotationPoint(25.5F, -3F, 31.5F);

		leftTrackModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1454
		leftTrackModel[40].setRotationPoint(-89F, -4F, 19F);

		leftTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1455
		leftTrackModel[41].setRotationPoint(-89F, -1F, 19F);

		leftTrackModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1456
		leftTrackModel[42].setRotationPoint(-87F, 4F, 20F);

		leftTrackModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1457
		leftTrackModel[43].setRotationPoint(-87F, 1F, 20F);

		leftTrackModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1458
		leftTrackModel[44].setRotationPoint(-92F, 1F, 20F);

		leftTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1459
		leftTrackModel[45].setRotationPoint(-94F, 3F, 20F);

		leftTrackModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1460
		leftTrackModel[46].setRotationPoint(-82F, 1F, 20F);

		leftTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1461
		leftTrackModel[47].setRotationPoint(-75F, 3F, 20F);

		leftTrackModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1462
		leftTrackModel[48].setRotationPoint(-77F, 3F, 20F);

		leftTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1463
		leftTrackModel[49].setRotationPoint(-95F, 3F, 20F);

		leftTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1464
		leftTrackModel[50].setRotationPoint(-75F, 3F, 41F);

		leftTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1465
		leftTrackModel[51].setRotationPoint(-77F, 3F, 41F);

		leftTrackModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1466
		leftTrackModel[52].setRotationPoint(-82F, 1F, 41F);

		leftTrackModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1467
		leftTrackModel[53].setRotationPoint(-87F, 1F, 41F);

		leftTrackModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1468
		leftTrackModel[54].setRotationPoint(-92F, 1F, 41F);

		leftTrackModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1469
		leftTrackModel[55].setRotationPoint(-94F, 3F, 41F);

		leftTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1470
		leftTrackModel[56].setRotationPoint(-95F, 3F, 41F);

		leftTrackModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1471
		leftTrackModel[57].setRotationPoint(-87F, 4F, 41F);

		leftTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1472
		leftTrackModel[58].setRotationPoint(-75F, 3F, 32F);

		leftTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1473
		leftTrackModel[59].setRotationPoint(-77F, 3F, 32F);

		leftTrackModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1474
		leftTrackModel[60].setRotationPoint(-82F, 1F, 32F);

		leftTrackModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1475
		leftTrackModel[61].setRotationPoint(-87F, 1F, 32F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1476
		leftTrackModel[62].setRotationPoint(-87F, 4F, 32F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1477
		leftTrackModel[63].setRotationPoint(-92F, 1F, 32F);

		leftTrackModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1478
		leftTrackModel[64].setRotationPoint(-95F, 3F, 32F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1479
		leftTrackModel[65].setRotationPoint(-94F, 3F, 32F);

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1480
		leftTrackModel[66].setRotationPoint(-75F, 3F, 29F);

		leftTrackModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1481
		leftTrackModel[67].setRotationPoint(-77F, 3F, 29F);

		leftTrackModel[68].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1482
		leftTrackModel[68].setRotationPoint(-82F, 1F, 29F);

		leftTrackModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1483
		leftTrackModel[69].setRotationPoint(-87F, 1F, 29F);

		leftTrackModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1484
		leftTrackModel[70].setRotationPoint(-87F, 4F, 29F);

		leftTrackModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1485
		leftTrackModel[71].setRotationPoint(-92F, 1F, 29F);

		leftTrackModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1486
		leftTrackModel[72].setRotationPoint(-95F, 3F, 29F);

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1487
		leftTrackModel[73].setRotationPoint(-94F, 3F, 29F);

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1488
		leftTrackModel[74].setRotationPoint(-76F, 3.5F, 19.5F);

		leftTrackModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1489
		leftTrackModel[75].setRotationPoint(-95F, 3.5F, 19.5F);

		leftTrackModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1490
		leftTrackModel[76].setRotationPoint(-76F, 3.5F, 31.5F);

		leftTrackModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1491
		leftTrackModel[77].setRotationPoint(-95F, 3.5F, 31.5F);

		leftTrackModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1492
		leftTrackModel[78].setRotationPoint(-28F, -4F, 19F);

		leftTrackModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1493
		leftTrackModel[79].setRotationPoint(-28F, -1F, 19F);

		leftTrackModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1494
		leftTrackModel[80].setRotationPoint(-26F, 4F, 20F);

		leftTrackModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1495
		leftTrackModel[81].setRotationPoint(-26F, 1F, 20F);

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1496
		leftTrackModel[82].setRotationPoint(-31F, 1F, 20F);

		leftTrackModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1497
		leftTrackModel[83].setRotationPoint(-33F, 3F, 20F);

		leftTrackModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1498
		leftTrackModel[84].setRotationPoint(-21F, 1F, 20F);

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1499
		leftTrackModel[85].setRotationPoint(-14F, 3F, 20F);

		leftTrackModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1500
		leftTrackModel[86].setRotationPoint(-16F, 3F, 20F);

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1501
		leftTrackModel[87].setRotationPoint(-34F, 3F, 20F);

		leftTrackModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1502
		leftTrackModel[88].setRotationPoint(-14F, 3F, 41F);

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1503
		leftTrackModel[89].setRotationPoint(-16F, 3F, 41F);

		leftTrackModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1504
		leftTrackModel[90].setRotationPoint(-21F, 1F, 41F);

		leftTrackModel[91].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1505
		leftTrackModel[91].setRotationPoint(-26F, 1F, 41F);

		leftTrackModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1506
		leftTrackModel[92].setRotationPoint(-31F, 1F, 41F);

		leftTrackModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1507
		leftTrackModel[93].setRotationPoint(-33F, 3F, 41F);

		leftTrackModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1508
		leftTrackModel[94].setRotationPoint(-34F, 3F, 41F);

		leftTrackModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1509
		leftTrackModel[95].setRotationPoint(-26F, 4F, 41F);

		leftTrackModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1510
		leftTrackModel[96].setRotationPoint(-14F, 3F, 32F);

		leftTrackModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1511
		leftTrackModel[97].setRotationPoint(-16F, 3F, 32F);

		leftTrackModel[98].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1512
		leftTrackModel[98].setRotationPoint(-21F, 1F, 32F);

		leftTrackModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1513
		leftTrackModel[99].setRotationPoint(-26F, 1F, 32F);

		leftTrackModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1514
		leftTrackModel[100].setRotationPoint(-26F, 4F, 32F);

		leftTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1515
		leftTrackModel[101].setRotationPoint(-31F, 1F, 32F);

		leftTrackModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1516
		leftTrackModel[102].setRotationPoint(-34F, 3F, 32F);

		leftTrackModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1517
		leftTrackModel[103].setRotationPoint(-33F, 3F, 32F);

		leftTrackModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1518
		leftTrackModel[104].setRotationPoint(-14F, 3F, 29F);

		leftTrackModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1519
		leftTrackModel[105].setRotationPoint(-16F, 3F, 29F);

		leftTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1520
		leftTrackModel[106].setRotationPoint(-21F, 1F, 29F);

		leftTrackModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1521
		leftTrackModel[107].setRotationPoint(-26F, 1F, 29F);

		leftTrackModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1522
		leftTrackModel[108].setRotationPoint(-26F, 4F, 29F);

		leftTrackModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1523
		leftTrackModel[109].setRotationPoint(-31F, 1F, 29F);

		leftTrackModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1524
		leftTrackModel[110].setRotationPoint(-34F, 3F, 29F);

		leftTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1525
		leftTrackModel[111].setRotationPoint(-33F, 3F, 29F);

		leftTrackModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1526
		leftTrackModel[112].setRotationPoint(-15F, 3.5F, 19.5F);

		leftTrackModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1527
		leftTrackModel[113].setRotationPoint(-34F, 3.5F, 19.5F);

		leftTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1528
		leftTrackModel[114].setRotationPoint(-15F, 3.5F, 31.5F);

		leftTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1529
		leftTrackModel[115].setRotationPoint(-34F, 3.5F, 31.5F);

		leftTrackModel[116].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1530
		leftTrackModel[116].setRotationPoint(2F, -4F, 19F);

		leftTrackModel[117].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1531
		leftTrackModel[117].setRotationPoint(2F, -1F, 19F);

		leftTrackModel[118].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1532
		leftTrackModel[118].setRotationPoint(4F, 4F, 20F);

		leftTrackModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1533
		leftTrackModel[119].setRotationPoint(4F, 1F, 20F);

		leftTrackModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1534
		leftTrackModel[120].setRotationPoint(-1F, 1F, 20F);

		leftTrackModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1535
		leftTrackModel[121].setRotationPoint(-3F, 3F, 20F);

		leftTrackModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1536
		leftTrackModel[122].setRotationPoint(9F, 1F, 20F);

		leftTrackModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1537
		leftTrackModel[123].setRotationPoint(16F, 3F, 20F);

		leftTrackModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1538
		leftTrackModel[124].setRotationPoint(14F, 3F, 20F);

		leftTrackModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1539
		leftTrackModel[125].setRotationPoint(-4F, 3F, 20F);

		leftTrackModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1540
		leftTrackModel[126].setRotationPoint(16F, 3F, 41F);

		leftTrackModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1541
		leftTrackModel[127].setRotationPoint(14F, 3F, 41F);

		leftTrackModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1542
		leftTrackModel[128].setRotationPoint(9F, 1F, 41F);

		leftTrackModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1543
		leftTrackModel[129].setRotationPoint(4F, 1F, 41F);

		leftTrackModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1544
		leftTrackModel[130].setRotationPoint(-1F, 1F, 41F);

		leftTrackModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1545
		leftTrackModel[131].setRotationPoint(-3F, 3F, 41F);

		leftTrackModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1546
		leftTrackModel[132].setRotationPoint(-4F, 3F, 41F);

		leftTrackModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1547
		leftTrackModel[133].setRotationPoint(4F, 4F, 41F);

		leftTrackModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1548
		leftTrackModel[134].setRotationPoint(16F, 3F, 32F);

		leftTrackModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1549
		leftTrackModel[135].setRotationPoint(14F, 3F, 32F);

		leftTrackModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1550
		leftTrackModel[136].setRotationPoint(9F, 1F, 32F);

		leftTrackModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1551
		leftTrackModel[137].setRotationPoint(4F, 1F, 32F);

		leftTrackModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1552
		leftTrackModel[138].setRotationPoint(4F, 4F, 32F);

		leftTrackModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1553
		leftTrackModel[139].setRotationPoint(-1F, 1F, 32F);

		leftTrackModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1554
		leftTrackModel[140].setRotationPoint(-4F, 3F, 32F);

		leftTrackModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1555
		leftTrackModel[141].setRotationPoint(-3F, 3F, 32F);

		leftTrackModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 1556
		leftTrackModel[142].setRotationPoint(16F, 3F, 29F);

		leftTrackModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1557
		leftTrackModel[143].setRotationPoint(14F, 3F, 29F);

		leftTrackModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 1558
		leftTrackModel[144].setRotationPoint(9F, 1F, 29F);

		leftTrackModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1559
		leftTrackModel[145].setRotationPoint(4F, 1F, 29F);

		leftTrackModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 1560
		leftTrackModel[146].setRotationPoint(4F, 4F, 29F);

		leftTrackModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1561
		leftTrackModel[147].setRotationPoint(-1F, 1F, 29F);

		leftTrackModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 1562
		leftTrackModel[148].setRotationPoint(-4F, 3F, 29F);

		leftTrackModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1563
		leftTrackModel[149].setRotationPoint(-3F, 3F, 29F);

		leftTrackModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1564
		leftTrackModel[150].setRotationPoint(15F, 3.5F, 19.5F);

		leftTrackModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1565
		leftTrackModel[151].setRotationPoint(-4F, 3.5F, 19.5F);

		leftTrackModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1566
		leftTrackModel[152].setRotationPoint(15F, 3.5F, 31.5F);

		leftTrackModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1567
		leftTrackModel[153].setRotationPoint(-4F, 3.5F, 31.5F);

		leftTrackModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1568
		leftTrackModel[154].setRotationPoint(-107.5F, -3F, 31.5F);

		leftTrackModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1569
		leftTrackModel[155].setRotationPoint(-107.5F, -3F, 18.5F);

		leftTrackModel[156].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1570
		leftTrackModel[156].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[156].rotateAngleX = -1.57079633F;

		leftTrackModel[157].addShapeBox(-29F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1571
		leftTrackModel[157].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[157].rotateAngleX = -1.57079633F;

		leftTrackModel[158].addShapeBox(-29F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1572
		leftTrackModel[158].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[158].rotateAngleX = -1.57079633F;

		leftTrackModel[159].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1573
		leftTrackModel[159].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[159].rotateAngleX = -1.57079633F;

		leftTrackModel[160].addShapeBox(-25F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1574
		leftTrackModel[160].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[160].rotateAngleX = -1.57079633F;

		leftTrackModel[161].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1575
		leftTrackModel[161].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[161].rotateAngleX = -1.57079633F;

		leftTrackModel[162].addShapeBox(-21F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1576
		leftTrackModel[162].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[162].rotateAngleX = -1.57079633F;

		leftTrackModel[163].addShapeBox(-21F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1577
		leftTrackModel[163].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[163].rotateAngleX = -1.57079633F;

		leftTrackModel[164].addShapeBox(-25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1578
		leftTrackModel[164].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[164].rotateAngleX = -1.57079633F;

		leftTrackModel[165].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1579
		leftTrackModel[165].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[165].rotateAngleX = -1.57079633F;

		leftTrackModel[166].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1580
		leftTrackModel[166].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[166].rotateAngleX = -1.57079633F;

		leftTrackModel[167].addShapeBox(-17F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1581
		leftTrackModel[167].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[167].rotateAngleX = -1.57079633F;

		leftTrackModel[168].addShapeBox(-13F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1582
		leftTrackModel[168].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[168].rotateAngleX = -1.57079633F;

		leftTrackModel[169].addShapeBox(-13F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1583
		leftTrackModel[169].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[169].rotateAngleX = -1.57079633F;

		leftTrackModel[170].addShapeBox(-17F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1584
		leftTrackModel[170].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[170].rotateAngleX = -1.57079633F;

		leftTrackModel[171].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1585
		leftTrackModel[171].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[171].rotateAngleX = -1.57079633F;

		leftTrackModel[172].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1586
		leftTrackModel[172].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[172].rotateAngleX = -1.57079633F;

		leftTrackModel[173].addShapeBox(-13F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1587
		leftTrackModel[173].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[173].rotateAngleX = -1.57079633F;

		leftTrackModel[174].addShapeBox(-17F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1588
		leftTrackModel[174].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[174].rotateAngleX = -1.57079633F;

		leftTrackModel[175].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1589
		leftTrackModel[175].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[175].rotateAngleX = -1.57079633F;

		leftTrackModel[176].addShapeBox(-21F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1590
		leftTrackModel[176].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[176].rotateAngleX = -1.57079633F;

		leftTrackModel[177].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1591
		leftTrackModel[177].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[177].rotateAngleX = -1.57079633F;

		leftTrackModel[178].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1592
		leftTrackModel[178].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[178].rotateAngleX = -1.57079633F;

		leftTrackModel[179].addShapeBox(-25F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1593
		leftTrackModel[179].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[179].rotateAngleX = -1.57079633F;

		leftTrackModel[180].addShapeBox(-29F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1594
		leftTrackModel[180].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[180].rotateAngleX = -1.57079633F;

		leftTrackModel[181].addShapeBox(-29F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1595
		leftTrackModel[181].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[181].rotateAngleX = -1.57079633F;

		leftTrackModel[182].addShapeBox(-25F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1596
		leftTrackModel[182].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[182].rotateAngleX = -1.57079633F;

		leftTrackModel[183].addShapeBox(-21F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1597
		leftTrackModel[183].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[183].rotateAngleX = -1.57079633F;

		leftTrackModel[184].addShapeBox(-17F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1598
		leftTrackModel[184].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[184].rotateAngleX = -1.57079633F;

		leftTrackModel[185].addShapeBox(-13F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1599
		leftTrackModel[185].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[185].rotateAngleX = -1.57079633F;

		leftTrackModel[186].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1600
		leftTrackModel[186].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[186].rotateAngleX = -1.57079633F;

		leftTrackModel[187].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1601
		leftTrackModel[187].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[187].rotateAngleX = -1.57079633F;

		leftTrackModel[188].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1602
		leftTrackModel[188].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[188].rotateAngleX = -1.57079633F;

		leftTrackModel[189].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1603
		leftTrackModel[189].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[189].rotateAngleX = -1.57079633F;

		leftTrackModel[190].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1604
		leftTrackModel[190].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[190].rotateAngleX = -1.57079633F;

		leftTrackModel[191].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1605
		leftTrackModel[191].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[191].rotateAngleX = -1.57079633F;

		leftTrackModel[192].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1606
		leftTrackModel[192].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[192].rotateAngleX = -1.57079633F;

		leftTrackModel[193].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1607
		leftTrackModel[193].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[193].rotateAngleX = -1.57079633F;

		leftTrackModel[194].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1608
		leftTrackModel[194].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[194].rotateAngleX = -1.57079633F;

		leftTrackModel[195].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1609
		leftTrackModel[195].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[195].rotateAngleX = -1.57079633F;

		leftTrackModel[196].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1610
		leftTrackModel[196].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[196].rotateAngleX = -1.57079633F;

		leftTrackModel[197].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1611
		leftTrackModel[197].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[197].rotateAngleX = -1.57079633F;

		leftTrackModel[198].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1612
		leftTrackModel[198].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[198].rotateAngleX = -1.57079633F;

		leftTrackModel[199].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1613
		leftTrackModel[199].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[199].rotateAngleX = -1.57079633F;

		leftTrackModel[200].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1614
		leftTrackModel[200].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[200].rotateAngleX = -1.57079633F;

		leftTrackModel[201].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1615
		leftTrackModel[201].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[201].rotateAngleX = -1.57079633F;

		leftTrackModel[202].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1616
		leftTrackModel[202].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[202].rotateAngleX = -1.57079633F;

		leftTrackModel[203].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1617
		leftTrackModel[203].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[203].rotateAngleX = -1.57079633F;

		leftTrackModel[204].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1618
		leftTrackModel[204].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[204].rotateAngleX = -1.57079633F;

		leftTrackModel[205].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1619
		leftTrackModel[205].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[205].rotateAngleX = -1.57079633F;

		leftTrackModel[206].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1620
		leftTrackModel[206].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[206].rotateAngleX = -1.57079633F;

		leftTrackModel[207].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1621
		leftTrackModel[207].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[207].rotateAngleX = -1.57079633F;

		leftTrackModel[208].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1622
		leftTrackModel[208].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[208].rotateAngleX = -1.57079633F;

		leftTrackModel[209].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1623
		leftTrackModel[209].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[209].rotateAngleX = -1.57079633F;

		leftTrackModel[210].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1624
		leftTrackModel[210].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[210].rotateAngleX = -1.57079633F;

		leftTrackModel[211].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1625
		leftTrackModel[211].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[211].rotateAngleX = -1.57079633F;

		leftTrackModel[212].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1626
		leftTrackModel[212].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[212].rotateAngleX = -1.57079633F;

		leftTrackModel[213].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1627
		leftTrackModel[213].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[213].rotateAngleX = -1.57079633F;

		leftTrackModel[214].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1628
		leftTrackModel[214].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[214].rotateAngleX = -1.57079633F;

		leftTrackModel[215].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1629
		leftTrackModel[215].setRotationPoint(-65F, 9F, 34.5F);
		leftTrackModel[215].rotateAngleX = -1.57079633F;

		leftTrackModel[216].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1630
		leftTrackModel[216].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[216].rotateAngleX = -1.57079633F;

		leftTrackModel[217].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1631
		leftTrackModel[217].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[217].rotateAngleX = -1.57079633F;

		leftTrackModel[218].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1632
		leftTrackModel[218].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[218].rotateAngleX = -1.57079633F;

		leftTrackModel[219].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1633
		leftTrackModel[219].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[219].rotateAngleX = -1.57079633F;

		leftTrackModel[220].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1634
		leftTrackModel[220].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[220].rotateAngleX = -1.57079633F;

		leftTrackModel[221].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1635
		leftTrackModel[221].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[221].rotateAngleX = -1.57079633F;

		leftTrackModel[222].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1636
		leftTrackModel[222].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[222].rotateAngleX = -1.57079633F;

		leftTrackModel[223].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1637
		leftTrackModel[223].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[223].rotateAngleX = -1.57079633F;

		leftTrackModel[224].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1638
		leftTrackModel[224].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[224].rotateAngleX = -1.57079633F;

		leftTrackModel[225].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1639
		leftTrackModel[225].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[225].rotateAngleX = -1.57079633F;

		leftTrackModel[226].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1640
		leftTrackModel[226].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[226].rotateAngleX = -1.57079633F;

		leftTrackModel[227].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1641
		leftTrackModel[227].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[227].rotateAngleX = -1.57079633F;

		leftTrackModel[228].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1642
		leftTrackModel[228].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[228].rotateAngleX = -1.57079633F;

		leftTrackModel[229].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1643
		leftTrackModel[229].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[229].rotateAngleX = -1.57079633F;

		leftTrackModel[230].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1644
		leftTrackModel[230].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[230].rotateAngleX = -1.57079633F;

		leftTrackModel[231].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1645
		leftTrackModel[231].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[231].rotateAngleX = -1.57079633F;

		leftTrackModel[232].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1646
		leftTrackModel[232].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[232].rotateAngleX = -1.57079633F;

		leftTrackModel[233].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1647
		leftTrackModel[233].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[233].rotateAngleX = -1.57079633F;

		leftTrackModel[234].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1648
		leftTrackModel[234].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[234].rotateAngleX = -1.57079633F;

		leftTrackModel[235].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1649
		leftTrackModel[235].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[235].rotateAngleX = -1.57079633F;

		leftTrackModel[236].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1650
		leftTrackModel[236].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[236].rotateAngleX = -1.57079633F;

		leftTrackModel[237].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1651
		leftTrackModel[237].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[237].rotateAngleX = -1.57079633F;

		leftTrackModel[238].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1652
		leftTrackModel[238].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[238].rotateAngleX = -1.57079633F;

		leftTrackModel[239].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1653
		leftTrackModel[239].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[239].rotateAngleX = -1.57079633F;

		leftTrackModel[240].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1654
		leftTrackModel[240].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[240].rotateAngleX = -1.57079633F;

		leftTrackModel[241].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1655
		leftTrackModel[241].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[241].rotateAngleX = -1.57079633F;

		leftTrackModel[242].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1656
		leftTrackModel[242].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[242].rotateAngleX = -1.57079633F;

		leftTrackModel[243].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1657
		leftTrackModel[243].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[243].rotateAngleX = -1.57079633F;

		leftTrackModel[244].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1658
		leftTrackModel[244].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[244].rotateAngleX = -1.57079633F;

		leftTrackModel[245].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1659
		leftTrackModel[245].setRotationPoint(-45F, 9F, 34.5F);
		leftTrackModel[245].rotateAngleX = -1.57079633F;

		leftTrackModel[246].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1660
		leftTrackModel[246].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[246].rotateAngleX = -1.57079633F;

		leftTrackModel[247].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1661
		leftTrackModel[247].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[247].rotateAngleX = -1.57079633F;

		leftTrackModel[248].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1662
		leftTrackModel[248].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[248].rotateAngleX = -1.57079633F;

		leftTrackModel[249].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1663
		leftTrackModel[249].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[249].rotateAngleX = -1.57079633F;

		leftTrackModel[250].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1664
		leftTrackModel[250].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[250].rotateAngleX = -1.57079633F;

		leftTrackModel[251].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1665
		leftTrackModel[251].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[251].rotateAngleX = -1.57079633F;

		leftTrackModel[252].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1666
		leftTrackModel[252].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[252].rotateAngleX = -1.57079633F;

		leftTrackModel[253].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1667
		leftTrackModel[253].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[253].rotateAngleX = -1.57079633F;

		leftTrackModel[254].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1668
		leftTrackModel[254].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[254].rotateAngleX = -1.57079633F;

		leftTrackModel[255].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1669
		leftTrackModel[255].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[255].rotateAngleX = -1.57079633F;

		leftTrackModel[256].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1670
		leftTrackModel[256].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[256].rotateAngleX = -1.57079633F;

		leftTrackModel[257].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1671
		leftTrackModel[257].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[257].rotateAngleX = -1.57079633F;

		leftTrackModel[258].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1672
		leftTrackModel[258].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[258].rotateAngleX = -1.57079633F;

		leftTrackModel[259].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1673
		leftTrackModel[259].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[259].rotateAngleX = -1.57079633F;

		leftTrackModel[260].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1674
		leftTrackModel[260].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[260].rotateAngleX = -1.57079633F;

		leftTrackModel[261].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1675
		leftTrackModel[261].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[261].rotateAngleX = -1.57079633F;

		leftTrackModel[262].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1676
		leftTrackModel[262].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[262].rotateAngleX = -1.57079633F;

		leftTrackModel[263].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1677
		leftTrackModel[263].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[263].rotateAngleX = -1.57079633F;

		leftTrackModel[264].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1678
		leftTrackModel[264].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[264].rotateAngleX = -1.57079633F;

		leftTrackModel[265].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1679
		leftTrackModel[265].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[265].rotateAngleX = -1.57079633F;

		leftTrackModel[266].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1680
		leftTrackModel[266].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[266].rotateAngleX = -1.57079633F;

		leftTrackModel[267].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1681
		leftTrackModel[267].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[267].rotateAngleX = -1.57079633F;

		leftTrackModel[268].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1682
		leftTrackModel[268].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[268].rotateAngleX = -1.57079633F;

		leftTrackModel[269].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1683
		leftTrackModel[269].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[269].rotateAngleX = -1.57079633F;

		leftTrackModel[270].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1684
		leftTrackModel[270].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[270].rotateAngleX = -1.57079633F;

		leftTrackModel[271].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1685
		leftTrackModel[271].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[271].rotateAngleX = -1.57079633F;

		leftTrackModel[272].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1686
		leftTrackModel[272].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[272].rotateAngleX = -1.57079633F;

		leftTrackModel[273].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1687
		leftTrackModel[273].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[273].rotateAngleX = -1.57079633F;

		leftTrackModel[274].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1688
		leftTrackModel[274].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[274].rotateAngleX = -1.57079633F;

		leftTrackModel[275].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1689
		leftTrackModel[275].setRotationPoint(-25F, 9F, 34.5F);
		leftTrackModel[275].rotateAngleX = -1.57079633F;

		leftTrackModel[276].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1690
		leftTrackModel[276].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[276].rotateAngleX = -1.57079633F;

		leftTrackModel[277].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1691
		leftTrackModel[277].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[277].rotateAngleX = -1.57079633F;

		leftTrackModel[278].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1692
		leftTrackModel[278].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[278].rotateAngleX = -1.57079633F;

		leftTrackModel[279].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1693
		leftTrackModel[279].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[279].rotateAngleX = -1.57079633F;

		leftTrackModel[280].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1694
		leftTrackModel[280].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[280].rotateAngleX = -1.57079633F;

		leftTrackModel[281].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1695
		leftTrackModel[281].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[281].rotateAngleX = -1.57079633F;

		leftTrackModel[282].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1696
		leftTrackModel[282].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[282].rotateAngleX = -1.57079633F;

		leftTrackModel[283].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1697
		leftTrackModel[283].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[283].rotateAngleX = -1.57079633F;

		leftTrackModel[284].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1698
		leftTrackModel[284].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[284].rotateAngleX = -1.57079633F;

		leftTrackModel[285].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1699
		leftTrackModel[285].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[285].rotateAngleX = -1.57079633F;

		leftTrackModel[286].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1700
		leftTrackModel[286].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[286].rotateAngleX = -1.57079633F;

		leftTrackModel[287].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1701
		leftTrackModel[287].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[287].rotateAngleX = -1.57079633F;

		leftTrackModel[288].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1702
		leftTrackModel[288].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[288].rotateAngleX = -1.57079633F;

		leftTrackModel[289].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1703
		leftTrackModel[289].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[289].rotateAngleX = -1.57079633F;

		leftTrackModel[290].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1704
		leftTrackModel[290].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[290].rotateAngleX = -1.57079633F;

		leftTrackModel[291].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1705
		leftTrackModel[291].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[291].rotateAngleX = -1.57079633F;

		leftTrackModel[292].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1706
		leftTrackModel[292].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[292].rotateAngleX = -1.57079633F;

		leftTrackModel[293].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1707
		leftTrackModel[293].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[293].rotateAngleX = -1.57079633F;

		leftTrackModel[294].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1708
		leftTrackModel[294].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[294].rotateAngleX = -1.57079633F;

		leftTrackModel[295].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1709
		leftTrackModel[295].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[295].rotateAngleX = -1.57079633F;

		leftTrackModel[296].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1710
		leftTrackModel[296].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[296].rotateAngleX = -1.57079633F;

		leftTrackModel[297].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1711
		leftTrackModel[297].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[297].rotateAngleX = -1.57079633F;

		leftTrackModel[298].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1712
		leftTrackModel[298].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[298].rotateAngleX = -1.57079633F;

		leftTrackModel[299].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1713
		leftTrackModel[299].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[299].rotateAngleX = -1.57079633F;

		leftTrackModel[300].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1714
		leftTrackModel[300].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[300].rotateAngleX = -1.57079633F;

		leftTrackModel[301].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1715
		leftTrackModel[301].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[301].rotateAngleX = -1.57079633F;

		leftTrackModel[302].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1716
		leftTrackModel[302].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[302].rotateAngleX = -1.57079633F;

		leftTrackModel[303].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1717
		leftTrackModel[303].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[303].rotateAngleX = -1.57079633F;

		leftTrackModel[304].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1718
		leftTrackModel[304].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[304].rotateAngleX = -1.57079633F;

		leftTrackModel[305].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1719
		leftTrackModel[305].setRotationPoint(-5F, 9F, 34.5F);
		leftTrackModel[305].rotateAngleX = -1.57079633F;

		leftTrackModel[306].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1720
		leftTrackModel[306].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[306].rotateAngleX = -1.57079633F;

		leftTrackModel[307].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1721
		leftTrackModel[307].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[307].rotateAngleX = -1.57079633F;

		leftTrackModel[308].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1722
		leftTrackModel[308].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[308].rotateAngleX = -1.57079633F;

		leftTrackModel[309].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1723
		leftTrackModel[309].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[309].rotateAngleX = -1.57079633F;

		leftTrackModel[310].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1724
		leftTrackModel[310].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[310].rotateAngleX = -1.57079633F;

		leftTrackModel[311].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1725
		leftTrackModel[311].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[311].rotateAngleX = -1.57079633F;

		leftTrackModel[312].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1726
		leftTrackModel[312].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[312].rotateAngleX = -1.57079633F;

		leftTrackModel[313].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1727
		leftTrackModel[313].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[313].rotateAngleX = -1.57079633F;

		leftTrackModel[314].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1728
		leftTrackModel[314].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[314].rotateAngleX = -1.57079633F;

		leftTrackModel[315].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1730
		leftTrackModel[315].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[315].rotateAngleX = -1.57079633F;

		leftTrackModel[316].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1731
		leftTrackModel[316].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[316].rotateAngleX = -1.57079633F;

		leftTrackModel[317].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1734
		leftTrackModel[317].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[317].rotateAngleX = -1.57079633F;

		leftTrackModel[318].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1735
		leftTrackModel[318].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[318].rotateAngleX = -1.57079633F;

		leftTrackModel[319].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1738
		leftTrackModel[319].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[319].rotateAngleX = -1.57079633F;

		leftTrackModel[320].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1739
		leftTrackModel[320].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[320].rotateAngleX = -1.57079633F;

		leftTrackModel[321].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1740
		leftTrackModel[321].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[321].rotateAngleX = -1.57079633F;

		leftTrackModel[322].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1741
		leftTrackModel[322].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[322].rotateAngleX = -1.57079633F;

		leftTrackModel[323].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1742
		leftTrackModel[323].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[323].rotateAngleX = -1.57079633F;

		leftTrackModel[324].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1743
		leftTrackModel[324].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[324].rotateAngleX = -1.57079633F;

		leftTrackModel[325].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1744
		leftTrackModel[325].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[325].rotateAngleX = -1.57079633F;

		leftTrackModel[326].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1745
		leftTrackModel[326].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[326].rotateAngleX = -1.57079633F;

		leftTrackModel[327].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1746
		leftTrackModel[327].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[327].rotateAngleX = -1.57079633F;

		leftTrackModel[328].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1747
		leftTrackModel[328].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[328].rotateAngleX = -1.57079633F;

		leftTrackModel[329].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1748
		leftTrackModel[329].setRotationPoint(15F, 9F, 34.5F);
		leftTrackModel[329].rotateAngleX = -1.57079633F;

		leftTrackModel[330].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1762
		leftTrackModel[330].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[330].rotateAngleX = -1.57079633F;
		leftTrackModel[330].rotateAngleZ = 0.78539816F;

		leftTrackModel[331].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1763
		leftTrackModel[331].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[331].rotateAngleX = -1.57079633F;
		leftTrackModel[331].rotateAngleZ = 0.78539816F;

		leftTrackModel[332].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1764
		leftTrackModel[332].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[332].rotateAngleX = -1.57079633F;
		leftTrackModel[332].rotateAngleZ = 0.78539816F;

		leftTrackModel[333].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1765
		leftTrackModel[333].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[333].rotateAngleX = -1.57079633F;
		leftTrackModel[333].rotateAngleZ = 0.78539816F;

		leftTrackModel[334].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1766
		leftTrackModel[334].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[334].rotateAngleX = -1.57079633F;
		leftTrackModel[334].rotateAngleZ = 0.78539816F;

		leftTrackModel[335].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1767
		leftTrackModel[335].setRotationPoint(-112F, -4.5F, 34.5F);
		leftTrackModel[335].rotateAngleX = -1.57079633F;
		leftTrackModel[335].rotateAngleZ = 0.78539816F;

		leftTrackModel[336].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1768
		leftTrackModel[336].setRotationPoint(-112F, 0F, 34.5F);
		leftTrackModel[336].rotateAngleX = -1.57079633F;
		leftTrackModel[336].rotateAngleZ = 1.57079633F;

		leftTrackModel[337].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1769
		leftTrackModel[337].setRotationPoint(-112F, 0F, 34.5F);
		leftTrackModel[337].rotateAngleX = -1.57079633F;
		leftTrackModel[337].rotateAngleZ = 1.57079633F;

		leftTrackModel[338].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1770
		leftTrackModel[338].setRotationPoint(-112F, 0F, 34.5F);
		leftTrackModel[338].rotateAngleX = -1.57079633F;
		leftTrackModel[338].rotateAngleZ = 1.57079633F;

		leftTrackModel[339].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1771
		leftTrackModel[339].setRotationPoint(-112F, 0F, 34.5F);
		leftTrackModel[339].rotateAngleX = -1.57079633F;
		leftTrackModel[339].rotateAngleZ = 1.57079633F;

		leftTrackModel[340].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1772
		leftTrackModel[340].setRotationPoint(-112F, 0F, 34.5F);
		leftTrackModel[340].rotateAngleX = -1.57079633F;
		leftTrackModel[340].rotateAngleZ = 1.57079633F;

		leftTrackModel[341].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1773
		leftTrackModel[341].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[341].rotateAngleX = -1.57079633F;
		leftTrackModel[341].rotateAngleZ = 5.49778714F;

		leftTrackModel[342].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1774
		leftTrackModel[342].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[342].rotateAngleX = -1.57079633F;
		leftTrackModel[342].rotateAngleZ = 5.49778714F;

		leftTrackModel[343].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1775
		leftTrackModel[343].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[343].rotateAngleX = -1.57079633F;
		leftTrackModel[343].rotateAngleZ = 5.49778714F;

		leftTrackModel[344].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1776
		leftTrackModel[344].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[344].rotateAngleX = -1.57079633F;
		leftTrackModel[344].rotateAngleZ = 5.49778714F;

		leftTrackModel[345].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1777
		leftTrackModel[345].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[345].rotateAngleX = -1.57079633F;
		leftTrackModel[345].rotateAngleZ = 5.49778714F;

		leftTrackModel[346].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1778
		leftTrackModel[346].setRotationPoint(-111.5F, 0.5F, 34.5F);
		leftTrackModel[346].rotateAngleX = -1.57079633F;
		leftTrackModel[346].rotateAngleZ = 5.49778714F;

		leftTrackModel[347].addShapeBox(-0.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1779
		leftTrackModel[347].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[347].rotateAngleX = -1.57079633F;
		leftTrackModel[347].rotateAngleZ = 5.84685299F;

		leftTrackModel[348].addShapeBox(-0.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1780
		leftTrackModel[348].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[348].rotateAngleX = -1.57079633F;
		leftTrackModel[348].rotateAngleZ = 5.84685299F;

		leftTrackModel[349].addShapeBox(1.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1781
		leftTrackModel[349].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[349].rotateAngleX = -1.57079633F;
		leftTrackModel[349].rotateAngleZ = 5.84685299F;

		leftTrackModel[350].addShapeBox(1.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1782
		leftTrackModel[350].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[350].rotateAngleX = -1.57079633F;
		leftTrackModel[350].rotateAngleZ = 5.84685299F;

		leftTrackModel[351].addShapeBox(1.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1783
		leftTrackModel[351].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[351].rotateAngleX = -1.57079633F;
		leftTrackModel[351].rotateAngleZ = 5.84685299F;

		leftTrackModel[352].addShapeBox(1.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1784
		leftTrackModel[352].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[352].rotateAngleX = -1.57079633F;
		leftTrackModel[352].rotateAngleZ = 5.84685299F;

		leftTrackModel[353].addShapeBox(3.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1785
		leftTrackModel[353].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[353].rotateAngleX = -1.57079633F;
		leftTrackModel[353].rotateAngleZ = 5.84685299F;

		leftTrackModel[354].addShapeBox(3.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1786
		leftTrackModel[354].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[354].rotateAngleX = -1.57079633F;
		leftTrackModel[354].rotateAngleZ = 5.84685299F;

		leftTrackModel[355].addShapeBox(5.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1787
		leftTrackModel[355].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[355].rotateAngleX = -1.57079633F;
		leftTrackModel[355].rotateAngleZ = 5.84685299F;

		leftTrackModel[356].addShapeBox(5.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1788
		leftTrackModel[356].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[356].rotateAngleX = -1.57079633F;
		leftTrackModel[356].rotateAngleZ = 5.84685299F;

		leftTrackModel[357].addShapeBox(5.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1789
		leftTrackModel[357].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[357].rotateAngleX = -1.57079633F;
		leftTrackModel[357].rotateAngleZ = 5.84685299F;

		leftTrackModel[358].addShapeBox(5.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1790
		leftTrackModel[358].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[358].rotateAngleX = -1.57079633F;
		leftTrackModel[358].rotateAngleZ = 5.84685299F;

		leftTrackModel[359].addShapeBox(7.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1791
		leftTrackModel[359].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[359].rotateAngleX = -1.57079633F;
		leftTrackModel[359].rotateAngleZ = 5.84685299F;

		leftTrackModel[360].addShapeBox(7.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1792
		leftTrackModel[360].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[360].rotateAngleX = -1.57079633F;
		leftTrackModel[360].rotateAngleZ = 5.84685299F;

		leftTrackModel[361].addShapeBox(9.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1793
		leftTrackModel[361].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[361].rotateAngleX = -1.57079633F;
		leftTrackModel[361].rotateAngleZ = 5.84685299F;

		leftTrackModel[362].addShapeBox(9.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1794
		leftTrackModel[362].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[362].rotateAngleX = -1.57079633F;
		leftTrackModel[362].rotateAngleZ = 5.84685299F;

		leftTrackModel[363].addShapeBox(9.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1795
		leftTrackModel[363].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[363].rotateAngleX = -1.57079633F;
		leftTrackModel[363].rotateAngleZ = 5.84685299F;

		leftTrackModel[364].addShapeBox(9.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1796
		leftTrackModel[364].setRotationPoint(-108.5F, 3.5F, 34.5F);
		leftTrackModel[364].rotateAngleX = -1.57079633F;
		leftTrackModel[364].rotateAngleZ = 5.84685299F;

		leftTrackModel[365].addShapeBox(11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1797
		leftTrackModel[365].setRotationPoint(-108.5F, 3.7F, 34.5F);
		leftTrackModel[365].rotateAngleX = -1.57079633F;
		leftTrackModel[365].rotateAngleZ = 5.88175958F;

		leftTrackModel[366].addShapeBox(11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1798
		leftTrackModel[366].setRotationPoint(-108.5F, 3.7F, 34.5F);
		leftTrackModel[366].rotateAngleX = -1.57079633F;
		leftTrackModel[366].rotateAngleZ = 5.88175958F;

		leftTrackModel[367].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1257
		leftTrackModel[367].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[367].rotateAngleX = -1.57079633F;
		leftTrackModel[367].rotateAngleZ = 0.61086524F;

		leftTrackModel[368].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1258
		leftTrackModel[368].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[368].rotateAngleX = -1.57079633F;
		leftTrackModel[368].rotateAngleZ = 0.61086524F;

		leftTrackModel[369].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1259
		leftTrackModel[369].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[369].rotateAngleX = -1.57079633F;
		leftTrackModel[369].rotateAngleZ = 0.61086524F;

		leftTrackModel[370].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1260
		leftTrackModel[370].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[370].rotateAngleX = -1.57079633F;
		leftTrackModel[370].rotateAngleZ = 0.61086524F;

		leftTrackModel[371].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1261
		leftTrackModel[371].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[371].rotateAngleX = -1.57079633F;
		leftTrackModel[371].rotateAngleZ = 0.61086524F;

		leftTrackModel[372].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1262
		leftTrackModel[372].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[372].rotateAngleX = -1.57079633F;
		leftTrackModel[372].rotateAngleZ = 0.61086524F;

		leftTrackModel[373].addShapeBox(4F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1263
		leftTrackModel[373].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[373].rotateAngleX = -1.57079633F;
		leftTrackModel[373].rotateAngleZ = 0.61086524F;

		leftTrackModel[374].addShapeBox(4F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1264
		leftTrackModel[374].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[374].rotateAngleX = -1.57079633F;
		leftTrackModel[374].rotateAngleZ = 0.61086524F;

		leftTrackModel[375].addShapeBox(6F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1265
		leftTrackModel[375].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[375].rotateAngleX = -1.57079633F;
		leftTrackModel[375].rotateAngleZ = 0.61086524F;

		leftTrackModel[376].addShapeBox(6F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1266
		leftTrackModel[376].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[376].rotateAngleX = -1.57079633F;
		leftTrackModel[376].rotateAngleZ = 0.61086524F;

		leftTrackModel[377].addShapeBox(6F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1267
		leftTrackModel[377].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[377].rotateAngleX = -1.57079633F;
		leftTrackModel[377].rotateAngleZ = 0.61086524F;

		leftTrackModel[378].addShapeBox(6F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1268
		leftTrackModel[378].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[378].rotateAngleX = -1.57079633F;
		leftTrackModel[378].rotateAngleZ = 0.61086524F;

		leftTrackModel[379].addShapeBox(8F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1269
		leftTrackModel[379].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[379].rotateAngleX = -1.57079633F;
		leftTrackModel[379].rotateAngleZ = 0.61086524F;

		leftTrackModel[380].addShapeBox(8F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1270
		leftTrackModel[380].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[380].rotateAngleX = -1.57079633F;
		leftTrackModel[380].rotateAngleZ = 0.61086524F;

		leftTrackModel[381].addShapeBox(10F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1271
		leftTrackModel[381].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[381].rotateAngleX = -1.57079633F;
		leftTrackModel[381].rotateAngleZ = 0.61086524F;

		leftTrackModel[382].addShapeBox(10F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1272
		leftTrackModel[382].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[382].rotateAngleX = -1.57079633F;
		leftTrackModel[382].rotateAngleZ = 0.61086524F;

		leftTrackModel[383].addShapeBox(10F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1273
		leftTrackModel[383].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[383].rotateAngleX = -1.57079633F;
		leftTrackModel[383].rotateAngleZ = 0.61086524F;

		leftTrackModel[384].addShapeBox(10F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1274
		leftTrackModel[384].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[384].rotateAngleX = -1.57079633F;
		leftTrackModel[384].rotateAngleZ = 0.61086524F;

		leftTrackModel[385].addShapeBox(12F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1275
		leftTrackModel[385].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[385].rotateAngleX = -1.57079633F;
		leftTrackModel[385].rotateAngleZ = 0.61086524F;

		leftTrackModel[386].addShapeBox(12F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1276
		leftTrackModel[386].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[386].rotateAngleX = -1.57079633F;
		leftTrackModel[386].rotateAngleZ = 0.61086524F;

		leftTrackModel[387].addShapeBox(14F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1277
		leftTrackModel[387].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[387].rotateAngleX = -1.57079633F;
		leftTrackModel[387].rotateAngleZ = 0.61086524F;

		leftTrackModel[388].addShapeBox(14F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1278
		leftTrackModel[388].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[388].rotateAngleX = -1.57079633F;
		leftTrackModel[388].rotateAngleZ = 0.61086524F;

		leftTrackModel[389].addShapeBox(14F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1279
		leftTrackModel[389].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[389].rotateAngleX = -1.57079633F;
		leftTrackModel[389].rotateAngleZ = 0.61086524F;

		leftTrackModel[390].addShapeBox(14F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1280
		leftTrackModel[390].setRotationPoint(19.5F, 9F, 34.5F);
		leftTrackModel[390].rotateAngleX = -1.57079633F;
		leftTrackModel[390].rotateAngleZ = 0.61086524F;

		leftTrackModel[391].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1281
		leftTrackModel[391].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[391].rotateAngleX = -1.57079633F;
		leftTrackModel[391].rotateAngleZ = 1.57079633F;

		leftTrackModel[392].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1282
		leftTrackModel[392].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[392].rotateAngleX = -1.57079633F;
		leftTrackModel[392].rotateAngleZ = 1.57079633F;

		leftTrackModel[393].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1283
		leftTrackModel[393].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[393].rotateAngleX = -1.57079633F;
		leftTrackModel[393].rotateAngleZ = 1.57079633F;

		leftTrackModel[394].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1284
		leftTrackModel[394].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[394].rotateAngleX = -1.57079633F;
		leftTrackModel[394].rotateAngleZ = 1.57079633F;

		leftTrackModel[395].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1285
		leftTrackModel[395].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[395].rotateAngleX = -1.57079633F;
		leftTrackModel[395].rotateAngleZ = 1.57079633F;

		leftTrackModel[396].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1286
		leftTrackModel[396].setRotationPoint(32F, 0F, 34.5F);
		leftTrackModel[396].rotateAngleX = -1.57079633F;
		leftTrackModel[396].rotateAngleZ = 1.57079633F;

		leftTrackModel[397].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1287
		leftTrackModel[397].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[397].rotateAngleX = -1.57079633F;
		leftTrackModel[397].rotateAngleZ = 2.18166156F;

		leftTrackModel[398].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1288
		leftTrackModel[398].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[398].rotateAngleX = -1.57079633F;
		leftTrackModel[398].rotateAngleZ = 2.18166156F;

		leftTrackModel[399].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1289
		leftTrackModel[399].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[399].rotateAngleX = -1.57079633F;
		leftTrackModel[399].rotateAngleZ = 2.18166156F;

		leftTrackModel[400].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1290
		leftTrackModel[400].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[400].rotateAngleX = -1.57079633F;
		leftTrackModel[400].rotateAngleZ = 2.18166156F;

		leftTrackModel[401].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1291
		leftTrackModel[401].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[401].rotateAngleX = -1.57079633F;
		leftTrackModel[401].rotateAngleZ = 2.18166156F;

		leftTrackModel[402].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1292
		leftTrackModel[402].setRotationPoint(32F, -3F, 34.5F);
		leftTrackModel[402].rotateAngleX = -1.57079633F;
		leftTrackModel[402].rotateAngleZ = 2.18166156F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 97
		rightTrackModel[1] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 98
		rightTrackModel[2] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 99
		rightTrackModel[3] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 100
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 101
		rightTrackModel[5] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 102
		rightTrackModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 103
		rightTrackModel[7] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 104
		rightTrackModel[8] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 105
		rightTrackModel[9] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 106
		rightTrackModel[10] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 442
		rightTrackModel[11] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 443
		rightTrackModel[12] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 444
		rightTrackModel[13] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 445
		rightTrackModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 446
		rightTrackModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 447
		rightTrackModel[16] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 448
		rightTrackModel[17] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 449
		rightTrackModel[18] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 450
		rightTrackModel[19] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 451
		rightTrackModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 452
		rightTrackModel[21] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 453
		rightTrackModel[22] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 454
		rightTrackModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 455
		rightTrackModel[24] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 456
		rightTrackModel[25] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 457
		rightTrackModel[26] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 458
		rightTrackModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 459
		rightTrackModel[28] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 460
		rightTrackModel[29] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 461
		rightTrackModel[30] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 462
		rightTrackModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 463
		rightTrackModel[32] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 464
		rightTrackModel[33] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 465
		rightTrackModel[34] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 469
		rightTrackModel[35] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 470
		rightTrackModel[36] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 480
		rightTrackModel[37] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 481
		rightTrackModel[38] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 483
		rightTrackModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 485
		rightTrackModel[40] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 490
		rightTrackModel[41] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 491
		rightTrackModel[42] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 492
		rightTrackModel[43] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 493
		rightTrackModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 494
		rightTrackModel[45] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 495
		rightTrackModel[46] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 496
		rightTrackModel[47] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 497
		rightTrackModel[48] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 498
		rightTrackModel[49] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 499
		rightTrackModel[50] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 500
		rightTrackModel[51] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 501
		rightTrackModel[52] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 502
		rightTrackModel[53] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 503
		rightTrackModel[54] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 504
		rightTrackModel[55] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 505
		rightTrackModel[56] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 506
		rightTrackModel[57] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 507
		rightTrackModel[58] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 508
		rightTrackModel[59] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 509
		rightTrackModel[60] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 510
		rightTrackModel[61] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 511
		rightTrackModel[62] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 512
		rightTrackModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 513
		rightTrackModel[64] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 514
		rightTrackModel[65] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 515
		rightTrackModel[66] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 516
		rightTrackModel[67] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 517
		rightTrackModel[68] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 518
		rightTrackModel[69] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 519
		rightTrackModel[70] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 520
		rightTrackModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 521
		rightTrackModel[72] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 522
		rightTrackModel[73] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 523
		rightTrackModel[74] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 524
		rightTrackModel[75] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 525
		rightTrackModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 526
		rightTrackModel[77] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 527
		rightTrackModel[78] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 528
		rightTrackModel[79] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 529
		rightTrackModel[80] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 530
		rightTrackModel[81] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 531
		rightTrackModel[82] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 532
		rightTrackModel[83] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 533
		rightTrackModel[84] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 534
		rightTrackModel[85] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 535
		rightTrackModel[86] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 536
		rightTrackModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 537
		rightTrackModel[88] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 538
		rightTrackModel[89] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 539
		rightTrackModel[90] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 540
		rightTrackModel[91] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 541
		rightTrackModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 542
		rightTrackModel[93] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 543
		rightTrackModel[94] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 544
		rightTrackModel[95] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 545
		rightTrackModel[96] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 546
		rightTrackModel[97] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 547
		rightTrackModel[98] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 548
		rightTrackModel[99] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 549
		rightTrackModel[100] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 550
		rightTrackModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 551
		rightTrackModel[102] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 552
		rightTrackModel[103] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 553
		rightTrackModel[104] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 554
		rightTrackModel[105] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 555
		rightTrackModel[106] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 556
		rightTrackModel[107] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 557
		rightTrackModel[108] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 558
		rightTrackModel[109] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 559
		rightTrackModel[110] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 560
		rightTrackModel[111] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 561
		rightTrackModel[112] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 562
		rightTrackModel[113] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 563
		rightTrackModel[114] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 564
		rightTrackModel[115] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 565
		rightTrackModel[116] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 566
		rightTrackModel[117] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 567
		rightTrackModel[118] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 568
		rightTrackModel[119] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 569
		rightTrackModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 570
		rightTrackModel[121] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 571
		rightTrackModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 572
		rightTrackModel[123] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 573
		rightTrackModel[124] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 574
		rightTrackModel[125] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 575
		rightTrackModel[126] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 576
		rightTrackModel[127] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 577
		rightTrackModel[128] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 578
		rightTrackModel[129] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 579
		rightTrackModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 580
		rightTrackModel[131] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 581
		rightTrackModel[132] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 582
		rightTrackModel[133] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 583
		rightTrackModel[134] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 584
		rightTrackModel[135] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 585
		rightTrackModel[136] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 586
		rightTrackModel[137] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 587
		rightTrackModel[138] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 588
		rightTrackModel[139] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 589
		rightTrackModel[140] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 590
		rightTrackModel[141] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 591
		rightTrackModel[142] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 592
		rightTrackModel[143] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 593
		rightTrackModel[144] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 594
		rightTrackModel[145] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 595
		rightTrackModel[146] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 596
		rightTrackModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 597
		rightTrackModel[148] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 598
		rightTrackModel[149] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 599
		rightTrackModel[150] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 600
		rightTrackModel[151] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 601
		rightTrackModel[152] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 602
		rightTrackModel[153] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 603
		rightTrackModel[154] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 769
		rightTrackModel[155] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 772
		rightTrackModel[156] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 799
		rightTrackModel[157] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 800
		rightTrackModel[158] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 801
		rightTrackModel[159] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 802
		rightTrackModel[160] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 803
		rightTrackModel[161] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 804
		rightTrackModel[162] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 805
		rightTrackModel[163] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 806
		rightTrackModel[164] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 807
		rightTrackModel[165] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 808
		rightTrackModel[166] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 809
		rightTrackModel[167] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 810
		rightTrackModel[168] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 811
		rightTrackModel[169] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 812
		rightTrackModel[170] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 813
		rightTrackModel[171] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 814
		rightTrackModel[172] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 815
		rightTrackModel[173] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 816
		rightTrackModel[174] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 817
		rightTrackModel[175] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 818
		rightTrackModel[176] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 819
		rightTrackModel[177] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 820
		rightTrackModel[178] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 821
		rightTrackModel[179] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 822
		rightTrackModel[180] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 823
		rightTrackModel[181] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 824
		rightTrackModel[182] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 825
		rightTrackModel[183] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 826
		rightTrackModel[184] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 827
		rightTrackModel[185] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 828
		rightTrackModel[186] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 829
		rightTrackModel[187] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 830
		rightTrackModel[188] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 831
		rightTrackModel[189] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 832
		rightTrackModel[190] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 833
		rightTrackModel[191] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 834
		rightTrackModel[192] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 835
		rightTrackModel[193] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 836
		rightTrackModel[194] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 837
		rightTrackModel[195] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 838
		rightTrackModel[196] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 839
		rightTrackModel[197] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 840
		rightTrackModel[198] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 841
		rightTrackModel[199] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 842
		rightTrackModel[200] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 843
		rightTrackModel[201] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 844
		rightTrackModel[202] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 845
		rightTrackModel[203] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 846
		rightTrackModel[204] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 847
		rightTrackModel[205] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 848
		rightTrackModel[206] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 849
		rightTrackModel[207] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 850
		rightTrackModel[208] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 851
		rightTrackModel[209] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 852
		rightTrackModel[210] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 853
		rightTrackModel[211] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 854
		rightTrackModel[212] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 855
		rightTrackModel[213] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 856
		rightTrackModel[214] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 857
		rightTrackModel[215] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 858
		rightTrackModel[216] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 859
		rightTrackModel[217] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 860
		rightTrackModel[218] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 861
		rightTrackModel[219] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 862
		rightTrackModel[220] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 863
		rightTrackModel[221] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 864
		rightTrackModel[222] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 865
		rightTrackModel[223] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 866
		rightTrackModel[224] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 867
		rightTrackModel[225] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 868
		rightTrackModel[226] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 869
		rightTrackModel[227] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 870
		rightTrackModel[228] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 871
		rightTrackModel[229] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 872
		rightTrackModel[230] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 873
		rightTrackModel[231] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 874
		rightTrackModel[232] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 875
		rightTrackModel[233] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 876
		rightTrackModel[234] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 877
		rightTrackModel[235] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 878
		rightTrackModel[236] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 879
		rightTrackModel[237] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 880
		rightTrackModel[238] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 881
		rightTrackModel[239] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 882
		rightTrackModel[240] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 883
		rightTrackModel[241] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 884
		rightTrackModel[242] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 885
		rightTrackModel[243] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 886
		rightTrackModel[244] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 887
		rightTrackModel[245] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 888
		rightTrackModel[246] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 889
		rightTrackModel[247] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 890
		rightTrackModel[248] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 891
		rightTrackModel[249] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 892
		rightTrackModel[250] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 893
		rightTrackModel[251] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 894
		rightTrackModel[252] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 895
		rightTrackModel[253] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 896
		rightTrackModel[254] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 897
		rightTrackModel[255] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 898
		rightTrackModel[256] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 899
		rightTrackModel[257] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 900
		rightTrackModel[258] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 901
		rightTrackModel[259] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 902
		rightTrackModel[260] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 903
		rightTrackModel[261] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 904
		rightTrackModel[262] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 905
		rightTrackModel[263] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 906
		rightTrackModel[264] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 907
		rightTrackModel[265] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 908
		rightTrackModel[266] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 909
		rightTrackModel[267] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 910
		rightTrackModel[268] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 911
		rightTrackModel[269] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 912
		rightTrackModel[270] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 913
		rightTrackModel[271] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 914
		rightTrackModel[272] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 915
		rightTrackModel[273] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 916
		rightTrackModel[274] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 917
		rightTrackModel[275] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 918
		rightTrackModel[276] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 919
		rightTrackModel[277] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 920
		rightTrackModel[278] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 921
		rightTrackModel[279] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 922
		rightTrackModel[280] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 923
		rightTrackModel[281] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 924
		rightTrackModel[282] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 925
		rightTrackModel[283] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 926
		rightTrackModel[284] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 927
		rightTrackModel[285] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 928
		rightTrackModel[286] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 929
		rightTrackModel[287] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 930
		rightTrackModel[288] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 931
		rightTrackModel[289] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 932
		rightTrackModel[290] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 933
		rightTrackModel[291] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 934
		rightTrackModel[292] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 935
		rightTrackModel[293] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 936
		rightTrackModel[294] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 937
		rightTrackModel[295] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 938
		rightTrackModel[296] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 939
		rightTrackModel[297] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 940
		rightTrackModel[298] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 941
		rightTrackModel[299] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 942
		rightTrackModel[300] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 943
		rightTrackModel[301] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 944
		rightTrackModel[302] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 945
		rightTrackModel[303] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 946
		rightTrackModel[304] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 947
		rightTrackModel[305] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 948
		rightTrackModel[306] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 949
		rightTrackModel[307] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 950
		rightTrackModel[308] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 951
		rightTrackModel[309] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 952
		rightTrackModel[310] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 953
		rightTrackModel[311] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 954
		rightTrackModel[312] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 955
		rightTrackModel[313] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 956
		rightTrackModel[314] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 957
		rightTrackModel[315] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 959
		rightTrackModel[316] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 960
		rightTrackModel[317] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 963
		rightTrackModel[318] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 964
		rightTrackModel[319] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 967
		rightTrackModel[320] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 968
		rightTrackModel[321] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 969
		rightTrackModel[322] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 970
		rightTrackModel[323] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 971
		rightTrackModel[324] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 972
		rightTrackModel[325] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Box 973
		rightTrackModel[326] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 974
		rightTrackModel[327] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 975
		rightTrackModel[328] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 976
		rightTrackModel[329] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 977
		rightTrackModel[330] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 991
		rightTrackModel[331] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 992
		rightTrackModel[332] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 993
		rightTrackModel[333] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 994
		rightTrackModel[334] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 995
		rightTrackModel[335] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 996
		rightTrackModel[336] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 997
		rightTrackModel[337] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 998
		rightTrackModel[338] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 999
		rightTrackModel[339] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1000
		rightTrackModel[340] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1002
		rightTrackModel[341] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1003
		rightTrackModel[342] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1004
		rightTrackModel[343] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1005
		rightTrackModel[344] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1006
		rightTrackModel[345] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1007
		rightTrackModel[346] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1008
		rightTrackModel[347] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1009
		rightTrackModel[348] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1010
		rightTrackModel[349] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1011
		rightTrackModel[350] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1012
		rightTrackModel[351] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1013
		rightTrackModel[352] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1014
		rightTrackModel[353] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1015
		rightTrackModel[354] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1016
		rightTrackModel[355] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1017
		rightTrackModel[356] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1018
		rightTrackModel[357] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1019
		rightTrackModel[358] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1020
		rightTrackModel[359] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1021
		rightTrackModel[360] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1022
		rightTrackModel[361] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 1023
		rightTrackModel[362] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 1024
		rightTrackModel[363] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 1025
		rightTrackModel[364] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 1026
		rightTrackModel[365] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1027
		rightTrackModel[366] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1028
		rightTrackModel[367] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1293
		rightTrackModel[368] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1294
		rightTrackModel[369] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1295
		rightTrackModel[370] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1296
		rightTrackModel[371] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1297
		rightTrackModel[372] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1298
		rightTrackModel[373] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1299
		rightTrackModel[374] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1300
		rightTrackModel[375] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1301
		rightTrackModel[376] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1302
		rightTrackModel[377] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1303
		rightTrackModel[378] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1304
		rightTrackModel[379] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1305
		rightTrackModel[380] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1306
		rightTrackModel[381] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1307
		rightTrackModel[382] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1308
		rightTrackModel[383] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1309
		rightTrackModel[384] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1310
		rightTrackModel[385] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1311
		rightTrackModel[386] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 1312
		rightTrackModel[387] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1313
		rightTrackModel[388] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1314
		rightTrackModel[389] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1315
		rightTrackModel[390] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1316
		rightTrackModel[391] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1317
		rightTrackModel[392] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1318
		rightTrackModel[393] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1319
		rightTrackModel[394] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1320
		rightTrackModel[395] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1321
		rightTrackModel[396] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1322
		rightTrackModel[397] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1323
		rightTrackModel[398] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1324
		rightTrackModel[399] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1325
		rightTrackModel[400] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 1326
		rightTrackModel[401] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 1327
		rightTrackModel[402] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 1328

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightTrackModel[0].setRotationPoint(-59F, -4F, -43F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		rightTrackModel[1].setRotationPoint(-59F, -1F, -43F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 99
		rightTrackModel[2].setRotationPoint(-57F, 4F, -42F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		rightTrackModel[3].setRotationPoint(-57F, 1F, -42F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 101
		rightTrackModel[4].setRotationPoint(-62F, 1F, -42F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackModel[5].setRotationPoint(-64F, 3F, -42F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 103
		rightTrackModel[6].setRotationPoint(-52F, 1F, -42F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 104
		rightTrackModel[7].setRotationPoint(-45F, 3F, -42F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightTrackModel[8].setRotationPoint(-47F, 3F, -42F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		rightTrackModel[9].setRotationPoint(-65F, 3F, -42F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 442
		rightTrackModel[10].setRotationPoint(-45F, 3F, -21F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightTrackModel[11].setRotationPoint(-47F, 3F, -21F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 444
		rightTrackModel[12].setRotationPoint(-52F, 1F, -21F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		rightTrackModel[13].setRotationPoint(-57F, 1F, -21F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 446
		rightTrackModel[14].setRotationPoint(-62F, 1F, -21F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightTrackModel[15].setRotationPoint(-64F, 3F, -21F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 448
		rightTrackModel[16].setRotationPoint(-65F, 3F, -21F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 449
		rightTrackModel[17].setRotationPoint(-57F, 4F, -21F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 450
		rightTrackModel[18].setRotationPoint(-45F, 3F, -30F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightTrackModel[19].setRotationPoint(-47F, 3F, -30F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 452
		rightTrackModel[20].setRotationPoint(-52F, 1F, -30F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightTrackModel[21].setRotationPoint(-57F, 1F, -30F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 454
		rightTrackModel[22].setRotationPoint(-57F, 4F, -30F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 455
		rightTrackModel[23].setRotationPoint(-62F, 1F, -30F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 456
		rightTrackModel[24].setRotationPoint(-65F, 3F, -30F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		rightTrackModel[25].setRotationPoint(-64F, 3F, -30F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 458
		rightTrackModel[26].setRotationPoint(-45F, 3F, -33F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		rightTrackModel[27].setRotationPoint(-47F, 3F, -33F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 460
		rightTrackModel[28].setRotationPoint(-52F, 1F, -33F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[29].setRotationPoint(-57F, 1F, -33F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 462
		rightTrackModel[30].setRotationPoint(-57F, 4F, -33F);

		rightTrackModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 463
		rightTrackModel[31].setRotationPoint(-62F, 1F, -33F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 464
		rightTrackModel[32].setRotationPoint(-65F, 3F, -33F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackModel[33].setRotationPoint(-64F, 3F, -33F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightTrackModel[34].setRotationPoint(-46F, 3.5F, -42.5F);

		rightTrackModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightTrackModel[35].setRotationPoint(-65F, 3.5F, -42.5F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightTrackModel[36].setRotationPoint(-46F, 3.5F, -30.5F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackModel[37].setRotationPoint(-65F, 3.5F, -30.5F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		rightTrackModel[38].setRotationPoint(25.5F, -3F, -43.5F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		rightTrackModel[39].setRotationPoint(25.5F, -3F, -30.5F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		rightTrackModel[40].setRotationPoint(-89F, -4F, -43F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 491
		rightTrackModel[41].setRotationPoint(-89F, -1F, -43F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 492
		rightTrackModel[42].setRotationPoint(-87F, 4F, -42F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightTrackModel[43].setRotationPoint(-87F, 1F, -42F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 494
		rightTrackModel[44].setRotationPoint(-92F, 1F, -42F);

		rightTrackModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightTrackModel[45].setRotationPoint(-94F, 3F, -42F);

		rightTrackModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 496
		rightTrackModel[46].setRotationPoint(-82F, 1F, -42F);

		rightTrackModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 497
		rightTrackModel[47].setRotationPoint(-75F, 3F, -42F);

		rightTrackModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightTrackModel[48].setRotationPoint(-77F, 3F, -42F);

		rightTrackModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 499
		rightTrackModel[49].setRotationPoint(-95F, 3F, -42F);

		rightTrackModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 500
		rightTrackModel[50].setRotationPoint(-75F, 3F, -21F);

		rightTrackModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		rightTrackModel[51].setRotationPoint(-77F, 3F, -21F);

		rightTrackModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 502
		rightTrackModel[52].setRotationPoint(-82F, 1F, -21F);

		rightTrackModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		rightTrackModel[53].setRotationPoint(-87F, 1F, -21F);

		rightTrackModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 504
		rightTrackModel[54].setRotationPoint(-92F, 1F, -21F);

		rightTrackModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightTrackModel[55].setRotationPoint(-94F, 3F, -21F);

		rightTrackModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 506
		rightTrackModel[56].setRotationPoint(-95F, 3F, -21F);

		rightTrackModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 507
		rightTrackModel[57].setRotationPoint(-87F, 4F, -21F);

		rightTrackModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 508
		rightTrackModel[58].setRotationPoint(-75F, 3F, -30F);

		rightTrackModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackModel[59].setRotationPoint(-77F, 3F, -30F);

		rightTrackModel[60].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 510
		rightTrackModel[60].setRotationPoint(-82F, 1F, -30F);

		rightTrackModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		rightTrackModel[61].setRotationPoint(-87F, 1F, -30F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 512
		rightTrackModel[62].setRotationPoint(-87F, 4F, -30F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 513
		rightTrackModel[63].setRotationPoint(-92F, 1F, -30F);

		rightTrackModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 514
		rightTrackModel[64].setRotationPoint(-95F, 3F, -30F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		rightTrackModel[65].setRotationPoint(-94F, 3F, -30F);

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 516
		rightTrackModel[66].setRotationPoint(-75F, 3F, -33F);

		rightTrackModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		rightTrackModel[67].setRotationPoint(-77F, 3F, -33F);

		rightTrackModel[68].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackModel[68].setRotationPoint(-82F, 1F, -33F);

		rightTrackModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		rightTrackModel[69].setRotationPoint(-87F, 1F, -33F);

		rightTrackModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 520
		rightTrackModel[70].setRotationPoint(-87F, 4F, -33F);

		rightTrackModel[71].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 521
		rightTrackModel[71].setRotationPoint(-92F, 1F, -33F);

		rightTrackModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 522
		rightTrackModel[72].setRotationPoint(-95F, 3F, -33F);

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightTrackModel[73].setRotationPoint(-94F, 3F, -33F);

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		rightTrackModel[74].setRotationPoint(-76F, 3.5F, -42.5F);

		rightTrackModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackModel[75].setRotationPoint(-95F, 3.5F, -42.5F);

		rightTrackModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		rightTrackModel[76].setRotationPoint(-76F, 3.5F, -30.5F);

		rightTrackModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightTrackModel[77].setRotationPoint(-95F, 3.5F, -30.5F);

		rightTrackModel[78].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		rightTrackModel[78].setRotationPoint(-28F, -4F, -43F);

		rightTrackModel[79].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 529
		rightTrackModel[79].setRotationPoint(-28F, -1F, -43F);

		rightTrackModel[80].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 530
		rightTrackModel[80].setRotationPoint(-26F, 4F, -42F);

		rightTrackModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		rightTrackModel[81].setRotationPoint(-26F, 1F, -42F);

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 532
		rightTrackModel[82].setRotationPoint(-31F, 1F, -42F);

		rightTrackModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackModel[83].setRotationPoint(-33F, 3F, -42F);

		rightTrackModel[84].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 534
		rightTrackModel[84].setRotationPoint(-21F, 1F, -42F);

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 535
		rightTrackModel[85].setRotationPoint(-14F, 3F, -42F);

		rightTrackModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		rightTrackModel[86].setRotationPoint(-16F, 3F, -42F);

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 537
		rightTrackModel[87].setRotationPoint(-34F, 3F, -42F);

		rightTrackModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 538
		rightTrackModel[88].setRotationPoint(-14F, 3F, -21F);

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		rightTrackModel[89].setRotationPoint(-16F, 3F, -21F);

		rightTrackModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 540
		rightTrackModel[90].setRotationPoint(-21F, 1F, -21F);

		rightTrackModel[91].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		rightTrackModel[91].setRotationPoint(-26F, 1F, -21F);

		rightTrackModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 542
		rightTrackModel[92].setRotationPoint(-31F, 1F, -21F);

		rightTrackModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		rightTrackModel[93].setRotationPoint(-33F, 3F, -21F);

		rightTrackModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 544
		rightTrackModel[94].setRotationPoint(-34F, 3F, -21F);

		rightTrackModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 545
		rightTrackModel[95].setRotationPoint(-26F, 4F, -21F);

		rightTrackModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 546
		rightTrackModel[96].setRotationPoint(-14F, 3F, -30F);

		rightTrackModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightTrackModel[97].setRotationPoint(-16F, 3F, -30F);

		rightTrackModel[98].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 548
		rightTrackModel[98].setRotationPoint(-21F, 1F, -30F);

		rightTrackModel[99].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		rightTrackModel[99].setRotationPoint(-26F, 1F, -30F);

		rightTrackModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 550
		rightTrackModel[100].setRotationPoint(-26F, 4F, -30F);

		rightTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 551
		rightTrackModel[101].setRotationPoint(-31F, 1F, -30F);

		rightTrackModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 552
		rightTrackModel[102].setRotationPoint(-34F, 3F, -30F);

		rightTrackModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		rightTrackModel[103].setRotationPoint(-33F, 3F, -30F);

		rightTrackModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 554
		rightTrackModel[104].setRotationPoint(-14F, 3F, -33F);

		rightTrackModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 555
		rightTrackModel[105].setRotationPoint(-16F, 3F, -33F);

		rightTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 556
		rightTrackModel[106].setRotationPoint(-21F, 1F, -33F);

		rightTrackModel[107].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		rightTrackModel[107].setRotationPoint(-26F, 1F, -33F);

		rightTrackModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 558
		rightTrackModel[108].setRotationPoint(-26F, 4F, -33F);

		rightTrackModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 559
		rightTrackModel[109].setRotationPoint(-31F, 1F, -33F);

		rightTrackModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 560
		rightTrackModel[110].setRotationPoint(-34F, 3F, -33F);

		rightTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		rightTrackModel[111].setRotationPoint(-33F, 3F, -33F);

		rightTrackModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		rightTrackModel[112].setRotationPoint(-15F, 3.5F, -42.5F);

		rightTrackModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		rightTrackModel[113].setRotationPoint(-34F, 3.5F, -42.5F);

		rightTrackModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		rightTrackModel[114].setRotationPoint(-15F, 3.5F, -30.5F);

		rightTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightTrackModel[115].setRotationPoint(-34F, 3.5F, -30.5F);

		rightTrackModel[116].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		rightTrackModel[116].setRotationPoint(2F, -4F, -43F);

		rightTrackModel[117].addShapeBox(0F, 0F, 0F, 9, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 567
		rightTrackModel[117].setRotationPoint(2F, -1F, -43F);

		rightTrackModel[118].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 568
		rightTrackModel[118].setRotationPoint(4F, 4F, -42F);

		rightTrackModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackModel[119].setRotationPoint(4F, 1F, -42F);

		rightTrackModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 570
		rightTrackModel[120].setRotationPoint(-1F, 1F, -42F);

		rightTrackModel[121].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		rightTrackModel[121].setRotationPoint(-3F, 3F, -42F);

		rightTrackModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 572
		rightTrackModel[122].setRotationPoint(9F, 1F, -42F);

		rightTrackModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 573
		rightTrackModel[123].setRotationPoint(16F, 3F, -42F);

		rightTrackModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		rightTrackModel[124].setRotationPoint(14F, 3F, -42F);

		rightTrackModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 575
		rightTrackModel[125].setRotationPoint(-4F, 3F, -42F);

		rightTrackModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 576
		rightTrackModel[126].setRotationPoint(16F, 3F, -21F);

		rightTrackModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		rightTrackModel[127].setRotationPoint(14F, 3F, -21F);

		rightTrackModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackModel[128].setRotationPoint(9F, 1F, -21F);

		rightTrackModel[129].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		rightTrackModel[129].setRotationPoint(4F, 1F, -21F);

		rightTrackModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 580
		rightTrackModel[130].setRotationPoint(-1F, 1F, -21F);

		rightTrackModel[131].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		rightTrackModel[131].setRotationPoint(-3F, 3F, -21F);

		rightTrackModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 582
		rightTrackModel[132].setRotationPoint(-4F, 3F, -21F);

		rightTrackModel[133].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 583
		rightTrackModel[133].setRotationPoint(4F, 4F, -21F);

		rightTrackModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 584
		rightTrackModel[134].setRotationPoint(16F, 3F, -30F);

		rightTrackModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		rightTrackModel[135].setRotationPoint(14F, 3F, -30F);

		rightTrackModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 586
		rightTrackModel[136].setRotationPoint(9F, 1F, -30F);

		rightTrackModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		rightTrackModel[137].setRotationPoint(4F, 1F, -30F);

		rightTrackModel[138].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 588
		rightTrackModel[138].setRotationPoint(4F, 4F, -30F);

		rightTrackModel[139].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 589
		rightTrackModel[139].setRotationPoint(-1F, 1F, -30F);

		rightTrackModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 590
		rightTrackModel[140].setRotationPoint(-4F, 3F, -30F);

		rightTrackModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightTrackModel[141].setRotationPoint(-3F, 3F, -30F);

		rightTrackModel[142].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 592
		rightTrackModel[142].setRotationPoint(16F, 3F, -33F);

		rightTrackModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackModel[143].setRotationPoint(14F, 3F, -33F);

		rightTrackModel[144].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 594
		rightTrackModel[144].setRotationPoint(9F, 1F, -33F);

		rightTrackModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		rightTrackModel[145].setRotationPoint(4F, 1F, -33F);

		rightTrackModel[146].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 596
		rightTrackModel[146].setRotationPoint(4F, 4F, -33F);

		rightTrackModel[147].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 597
		rightTrackModel[147].setRotationPoint(-1F, 1F, -33F);

		rightTrackModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 598
		rightTrackModel[148].setRotationPoint(-4F, 3F, -33F);

		rightTrackModel[149].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		rightTrackModel[149].setRotationPoint(-3F, 3F, -33F);

		rightTrackModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackModel[150].setRotationPoint(15F, 3.5F, -42.5F);

		rightTrackModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		rightTrackModel[151].setRotationPoint(-4F, 3.5F, -42.5F);

		rightTrackModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		rightTrackModel[152].setRotationPoint(15F, 3.5F, -30.5F);

		rightTrackModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		rightTrackModel[153].setRotationPoint(-4F, 3.5F, -30.5F);

		rightTrackModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		rightTrackModel[154].setRotationPoint(-107.5F, -3F, -30.5F);

		rightTrackModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		rightTrackModel[155].setRotationPoint(-107.5F, -3F, -43.5F);

		rightTrackModel[156].addShapeBox(-31F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 799
		rightTrackModel[156].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[156].rotateAngleX = -1.57079633F;

		rightTrackModel[157].addShapeBox(-29F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		rightTrackModel[157].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[157].rotateAngleX = -1.57079633F;

		rightTrackModel[158].addShapeBox(-29F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		rightTrackModel[158].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[158].rotateAngleX = -1.57079633F;

		rightTrackModel[159].addShapeBox(-27F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		rightTrackModel[159].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[159].rotateAngleX = -1.57079633F;

		rightTrackModel[160].addShapeBox(-25F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		rightTrackModel[160].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[160].rotateAngleX = -1.57079633F;

		rightTrackModel[161].addShapeBox(-23F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		rightTrackModel[161].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[161].rotateAngleX = -1.57079633F;

		rightTrackModel[162].addShapeBox(-21F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		rightTrackModel[162].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[162].rotateAngleX = -1.57079633F;

		rightTrackModel[163].addShapeBox(-21F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		rightTrackModel[163].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[163].rotateAngleX = -1.57079633F;

		rightTrackModel[164].addShapeBox(-25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		rightTrackModel[164].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[164].rotateAngleX = -1.57079633F;

		rightTrackModel[165].addShapeBox(-15F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		rightTrackModel[165].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[165].rotateAngleX = -1.57079633F;

		rightTrackModel[166].addShapeBox(-19F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		rightTrackModel[166].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[166].rotateAngleX = -1.57079633F;

		rightTrackModel[167].addShapeBox(-17F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		rightTrackModel[167].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[167].rotateAngleX = -1.57079633F;

		rightTrackModel[168].addShapeBox(-13F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		rightTrackModel[168].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[168].rotateAngleX = -1.57079633F;

		rightTrackModel[169].addShapeBox(-13F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		rightTrackModel[169].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[169].rotateAngleX = -1.57079633F;

		rightTrackModel[170].addShapeBox(-17F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		rightTrackModel[170].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[170].rotateAngleX = -1.57079633F;

		rightTrackModel[171].addShapeBox(-31F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		rightTrackModel[171].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[171].rotateAngleX = -1.57079633F;

		rightTrackModel[172].addShapeBox(-15F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		rightTrackModel[172].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[172].rotateAngleX = -1.57079633F;

		rightTrackModel[173].addShapeBox(-13F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 816
		rightTrackModel[173].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[173].rotateAngleX = -1.57079633F;

		rightTrackModel[174].addShapeBox(-17F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		rightTrackModel[174].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[174].rotateAngleX = -1.57079633F;

		rightTrackModel[175].addShapeBox(-19F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 818
		rightTrackModel[175].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[175].rotateAngleX = -1.57079633F;

		rightTrackModel[176].addShapeBox(-21F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		rightTrackModel[176].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[176].rotateAngleX = -1.57079633F;

		rightTrackModel[177].addShapeBox(-23F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 820
		rightTrackModel[177].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[177].rotateAngleX = -1.57079633F;

		rightTrackModel[178].addShapeBox(-27F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		rightTrackModel[178].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[178].rotateAngleX = -1.57079633F;

		rightTrackModel[179].addShapeBox(-25F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		rightTrackModel[179].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[179].rotateAngleX = -1.57079633F;

		rightTrackModel[180].addShapeBox(-29F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		rightTrackModel[180].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[180].rotateAngleX = -1.57079633F;

		rightTrackModel[181].addShapeBox(-29F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		rightTrackModel[181].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[181].rotateAngleX = -1.57079633F;

		rightTrackModel[182].addShapeBox(-25F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 825
		rightTrackModel[182].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[182].rotateAngleX = -1.57079633F;

		rightTrackModel[183].addShapeBox(-21F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		rightTrackModel[183].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[183].rotateAngleX = -1.57079633F;

		rightTrackModel[184].addShapeBox(-17F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		rightTrackModel[184].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[184].rotateAngleX = -1.57079633F;

		rightTrackModel[185].addShapeBox(-13F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		rightTrackModel[185].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[185].rotateAngleX = -1.57079633F;

		rightTrackModel[186].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		rightTrackModel[186].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[186].rotateAngleX = -1.57079633F;

		rightTrackModel[187].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 830
		rightTrackModel[187].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[187].rotateAngleX = -1.57079633F;

		rightTrackModel[188].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		rightTrackModel[188].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[188].rotateAngleX = -1.57079633F;

		rightTrackModel[189].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		rightTrackModel[189].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[189].rotateAngleX = -1.57079633F;

		rightTrackModel[190].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		rightTrackModel[190].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[190].rotateAngleX = -1.57079633F;

		rightTrackModel[191].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		rightTrackModel[191].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[191].rotateAngleX = -1.57079633F;

		rightTrackModel[192].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 835
		rightTrackModel[192].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[192].rotateAngleX = -1.57079633F;

		rightTrackModel[193].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		rightTrackModel[193].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[193].rotateAngleX = -1.57079633F;

		rightTrackModel[194].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		rightTrackModel[194].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[194].rotateAngleX = -1.57079633F;

		rightTrackModel[195].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 838
		rightTrackModel[195].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[195].rotateAngleX = -1.57079633F;

		rightTrackModel[196].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 839
		rightTrackModel[196].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[196].rotateAngleX = -1.57079633F;

		rightTrackModel[197].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 840
		rightTrackModel[197].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[197].rotateAngleX = -1.57079633F;

		rightTrackModel[198].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 841
		rightTrackModel[198].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[198].rotateAngleX = -1.57079633F;

		rightTrackModel[199].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		rightTrackModel[199].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[199].rotateAngleX = -1.57079633F;

		rightTrackModel[200].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		rightTrackModel[200].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[200].rotateAngleX = -1.57079633F;

		rightTrackModel[201].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		rightTrackModel[201].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[201].rotateAngleX = -1.57079633F;

		rightTrackModel[202].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		rightTrackModel[202].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[202].rotateAngleX = -1.57079633F;

		rightTrackModel[203].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		rightTrackModel[203].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[203].rotateAngleX = -1.57079633F;

		rightTrackModel[204].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		rightTrackModel[204].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[204].rotateAngleX = -1.57079633F;

		rightTrackModel[205].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 848
		rightTrackModel[205].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[205].rotateAngleX = -1.57079633F;

		rightTrackModel[206].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 849
		rightTrackModel[206].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[206].rotateAngleX = -1.57079633F;

		rightTrackModel[207].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 850
		rightTrackModel[207].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[207].rotateAngleX = -1.57079633F;

		rightTrackModel[208].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 851
		rightTrackModel[208].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[208].rotateAngleX = -1.57079633F;

		rightTrackModel[209].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 852
		rightTrackModel[209].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[209].rotateAngleX = -1.57079633F;

		rightTrackModel[210].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		rightTrackModel[210].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[210].rotateAngleX = -1.57079633F;

		rightTrackModel[211].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 854
		rightTrackModel[211].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[211].rotateAngleX = -1.57079633F;

		rightTrackModel[212].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 855
		rightTrackModel[212].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[212].rotateAngleX = -1.57079633F;

		rightTrackModel[213].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 856
		rightTrackModel[213].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[213].rotateAngleX = -1.57079633F;

		rightTrackModel[214].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 857
		rightTrackModel[214].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[214].rotateAngleX = -1.57079633F;

		rightTrackModel[215].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 858
		rightTrackModel[215].setRotationPoint(-65F, 9F, -27.5F);
		rightTrackModel[215].rotateAngleX = -1.57079633F;

		rightTrackModel[216].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 859
		rightTrackModel[216].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[216].rotateAngleX = -1.57079633F;

		rightTrackModel[217].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		rightTrackModel[217].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[217].rotateAngleX = -1.57079633F;

		rightTrackModel[218].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 861
		rightTrackModel[218].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[218].rotateAngleX = -1.57079633F;

		rightTrackModel[219].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		rightTrackModel[219].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[219].rotateAngleX = -1.57079633F;

		rightTrackModel[220].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		rightTrackModel[220].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[220].rotateAngleX = -1.57079633F;

		rightTrackModel[221].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		rightTrackModel[221].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[221].rotateAngleX = -1.57079633F;

		rightTrackModel[222].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 865
		rightTrackModel[222].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[222].rotateAngleX = -1.57079633F;

		rightTrackModel[223].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		rightTrackModel[223].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[223].rotateAngleX = -1.57079633F;

		rightTrackModel[224].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		rightTrackModel[224].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[224].rotateAngleX = -1.57079633F;

		rightTrackModel[225].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		rightTrackModel[225].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[225].rotateAngleX = -1.57079633F;

		rightTrackModel[226].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		rightTrackModel[226].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[226].rotateAngleX = -1.57079633F;

		rightTrackModel[227].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		rightTrackModel[227].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[227].rotateAngleX = -1.57079633F;

		rightTrackModel[228].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 871
		rightTrackModel[228].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[228].rotateAngleX = -1.57079633F;

		rightTrackModel[229].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 872
		rightTrackModel[229].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[229].rotateAngleX = -1.57079633F;

		rightTrackModel[230].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 873
		rightTrackModel[230].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[230].rotateAngleX = -1.57079633F;

		rightTrackModel[231].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		rightTrackModel[231].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[231].rotateAngleX = -1.57079633F;

		rightTrackModel[232].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 875
		rightTrackModel[232].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[232].rotateAngleX = -1.57079633F;

		rightTrackModel[233].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		rightTrackModel[233].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[233].rotateAngleX = -1.57079633F;

		rightTrackModel[234].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 877
		rightTrackModel[234].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[234].rotateAngleX = -1.57079633F;

		rightTrackModel[235].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		rightTrackModel[235].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[235].rotateAngleX = -1.57079633F;

		rightTrackModel[236].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		rightTrackModel[236].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[236].rotateAngleX = -1.57079633F;

		rightTrackModel[237].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		rightTrackModel[237].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[237].rotateAngleX = -1.57079633F;

		rightTrackModel[238].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 881
		rightTrackModel[238].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[238].rotateAngleX = -1.57079633F;

		rightTrackModel[239].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		rightTrackModel[239].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[239].rotateAngleX = -1.57079633F;

		rightTrackModel[240].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		rightTrackModel[240].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[240].rotateAngleX = -1.57079633F;

		rightTrackModel[241].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		rightTrackModel[241].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[241].rotateAngleX = -1.57079633F;

		rightTrackModel[242].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 885
		rightTrackModel[242].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[242].rotateAngleX = -1.57079633F;

		rightTrackModel[243].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 886
		rightTrackModel[243].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[243].rotateAngleX = -1.57079633F;

		rightTrackModel[244].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		rightTrackModel[244].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[244].rotateAngleX = -1.57079633F;

		rightTrackModel[245].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		rightTrackModel[245].setRotationPoint(-45F, 9F, -27.5F);
		rightTrackModel[245].rotateAngleX = -1.57079633F;

		rightTrackModel[246].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		rightTrackModel[246].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[246].rotateAngleX = -1.57079633F;

		rightTrackModel[247].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		rightTrackModel[247].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[247].rotateAngleX = -1.57079633F;

		rightTrackModel[248].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		rightTrackModel[248].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[248].rotateAngleX = -1.57079633F;

		rightTrackModel[249].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		rightTrackModel[249].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[249].rotateAngleX = -1.57079633F;

		rightTrackModel[250].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		rightTrackModel[250].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[250].rotateAngleX = -1.57079633F;

		rightTrackModel[251].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		rightTrackModel[251].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[251].rotateAngleX = -1.57079633F;

		rightTrackModel[252].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		rightTrackModel[252].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[252].rotateAngleX = -1.57079633F;

		rightTrackModel[253].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 896
		rightTrackModel[253].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[253].rotateAngleX = -1.57079633F;

		rightTrackModel[254].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		rightTrackModel[254].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[254].rotateAngleX = -1.57079633F;

		rightTrackModel[255].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		rightTrackModel[255].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[255].rotateAngleX = -1.57079633F;

		rightTrackModel[256].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		rightTrackModel[256].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[256].rotateAngleX = -1.57079633F;

		rightTrackModel[257].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		rightTrackModel[257].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[257].rotateAngleX = -1.57079633F;

		rightTrackModel[258].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		rightTrackModel[258].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[258].rotateAngleX = -1.57079633F;

		rightTrackModel[259].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 902
		rightTrackModel[259].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[259].rotateAngleX = -1.57079633F;

		rightTrackModel[260].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 903
		rightTrackModel[260].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[260].rotateAngleX = -1.57079633F;

		rightTrackModel[261].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		rightTrackModel[261].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[261].rotateAngleX = -1.57079633F;

		rightTrackModel[262].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 905
		rightTrackModel[262].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[262].rotateAngleX = -1.57079633F;

		rightTrackModel[263].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		rightTrackModel[263].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[263].rotateAngleX = -1.57079633F;

		rightTrackModel[264].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		rightTrackModel[264].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[264].rotateAngleX = -1.57079633F;

		rightTrackModel[265].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		rightTrackModel[265].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[265].rotateAngleX = -1.57079633F;

		rightTrackModel[266].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		rightTrackModel[266].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[266].rotateAngleX = -1.57079633F;

		rightTrackModel[267].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		rightTrackModel[267].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[267].rotateAngleX = -1.57079633F;

		rightTrackModel[268].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		rightTrackModel[268].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[268].rotateAngleX = -1.57079633F;

		rightTrackModel[269].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		rightTrackModel[269].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[269].rotateAngleX = -1.57079633F;

		rightTrackModel[270].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		rightTrackModel[270].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[270].rotateAngleX = -1.57079633F;

		rightTrackModel[271].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 914
		rightTrackModel[271].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[271].rotateAngleX = -1.57079633F;

		rightTrackModel[272].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		rightTrackModel[272].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[272].rotateAngleX = -1.57079633F;

		rightTrackModel[273].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		rightTrackModel[273].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[273].rotateAngleX = -1.57079633F;

		rightTrackModel[274].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		rightTrackModel[274].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[274].rotateAngleX = -1.57079633F;

		rightTrackModel[275].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		rightTrackModel[275].setRotationPoint(-25F, 9F, -27.5F);
		rightTrackModel[275].rotateAngleX = -1.57079633F;

		rightTrackModel[276].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 919
		rightTrackModel[276].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[276].rotateAngleX = -1.57079633F;

		rightTrackModel[277].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 920
		rightTrackModel[277].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[277].rotateAngleX = -1.57079633F;

		rightTrackModel[278].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 921
		rightTrackModel[278].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[278].rotateAngleX = -1.57079633F;

		rightTrackModel[279].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		rightTrackModel[279].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[279].rotateAngleX = -1.57079633F;

		rightTrackModel[280].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		rightTrackModel[280].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[280].rotateAngleX = -1.57079633F;

		rightTrackModel[281].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		rightTrackModel[281].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[281].rotateAngleX = -1.57079633F;

		rightTrackModel[282].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		rightTrackModel[282].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[282].rotateAngleX = -1.57079633F;

		rightTrackModel[283].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		rightTrackModel[283].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[283].rotateAngleX = -1.57079633F;

		rightTrackModel[284].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		rightTrackModel[284].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[284].rotateAngleX = -1.57079633F;

		rightTrackModel[285].addShapeBox(5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		rightTrackModel[285].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[285].rotateAngleX = -1.57079633F;

		rightTrackModel[286].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 929
		rightTrackModel[286].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[286].rotateAngleX = -1.57079633F;

		rightTrackModel[287].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 930
		rightTrackModel[287].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[287].rotateAngleX = -1.57079633F;

		rightTrackModel[288].addShapeBox(7F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 931
		rightTrackModel[288].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[288].rotateAngleX = -1.57079633F;

		rightTrackModel[289].addShapeBox(7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		rightTrackModel[289].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[289].rotateAngleX = -1.57079633F;

		rightTrackModel[290].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 933
		rightTrackModel[290].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[290].rotateAngleX = -1.57079633F;

		rightTrackModel[291].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 934
		rightTrackModel[291].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[291].rotateAngleX = -1.57079633F;

		rightTrackModel[292].addShapeBox(5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 935
		rightTrackModel[292].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[292].rotateAngleX = -1.57079633F;

		rightTrackModel[293].addShapeBox(7F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 936
		rightTrackModel[293].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[293].rotateAngleX = -1.57079633F;

		rightTrackModel[294].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		rightTrackModel[294].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[294].rotateAngleX = -1.57079633F;

		rightTrackModel[295].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		rightTrackModel[295].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[295].rotateAngleX = -1.57079633F;

		rightTrackModel[296].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		rightTrackModel[296].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[296].rotateAngleX = -1.57079633F;

		rightTrackModel[297].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 940
		rightTrackModel[297].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[297].rotateAngleX = -1.57079633F;

		rightTrackModel[298].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 941
		rightTrackModel[298].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[298].rotateAngleX = -1.57079633F;

		rightTrackModel[299].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		rightTrackModel[299].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[299].rotateAngleX = -1.57079633F;

		rightTrackModel[300].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		rightTrackModel[300].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[300].rotateAngleX = -1.57079633F;

		rightTrackModel[301].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		rightTrackModel[301].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[301].rotateAngleX = -1.57079633F;

		rightTrackModel[302].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		rightTrackModel[302].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[302].rotateAngleX = -1.57079633F;

		rightTrackModel[303].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 946
		rightTrackModel[303].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[303].rotateAngleX = -1.57079633F;

		rightTrackModel[304].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		rightTrackModel[304].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[304].rotateAngleX = -1.57079633F;

		rightTrackModel[305].addShapeBox(7F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		rightTrackModel[305].setRotationPoint(-5F, 9F, -27.5F);
		rightTrackModel[305].rotateAngleX = -1.57079633F;

		rightTrackModel[306].addShapeBox(-11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		rightTrackModel[306].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[306].rotateAngleX = -1.57079633F;

		rightTrackModel[307].addShapeBox(-9F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		rightTrackModel[307].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[307].rotateAngleX = -1.57079633F;

		rightTrackModel[308].addShapeBox(-9F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 951
		rightTrackModel[308].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[308].rotateAngleX = -1.57079633F;

		rightTrackModel[309].addShapeBox(-7F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		rightTrackModel[309].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[309].rotateAngleX = -1.57079633F;

		rightTrackModel[310].addShapeBox(-5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		rightTrackModel[310].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[310].rotateAngleX = -1.57079633F;

		rightTrackModel[311].addShapeBox(-3F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		rightTrackModel[311].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[311].rotateAngleX = -1.57079633F;

		rightTrackModel[312].addShapeBox(-1F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		rightTrackModel[312].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[312].rotateAngleX = -1.57079633F;

		rightTrackModel[313].addShapeBox(-1F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 956
		rightTrackModel[313].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[313].rotateAngleX = -1.57079633F;

		rightTrackModel[314].addShapeBox(-5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 957
		rightTrackModel[314].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[314].rotateAngleX = -1.57079633F;

		rightTrackModel[315].addShapeBox(1F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		rightTrackModel[315].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[315].rotateAngleX = -1.57079633F;

		rightTrackModel[316].addShapeBox(3F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		rightTrackModel[316].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[316].rotateAngleX = -1.57079633F;

		rightTrackModel[317].addShapeBox(3F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		rightTrackModel[317].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[317].rotateAngleX = -1.57079633F;

		rightTrackModel[318].addShapeBox(-11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		rightTrackModel[318].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[318].rotateAngleX = -1.57079633F;

		rightTrackModel[319].addShapeBox(3F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		rightTrackModel[319].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[319].rotateAngleX = -1.57079633F;

		rightTrackModel[320].addShapeBox(1F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		rightTrackModel[320].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[320].rotateAngleX = -1.57079633F;

		rightTrackModel[321].addShapeBox(-1F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		rightTrackModel[321].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[321].rotateAngleX = -1.57079633F;

		rightTrackModel[322].addShapeBox(-3F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		rightTrackModel[322].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[322].rotateAngleX = -1.57079633F;

		rightTrackModel[323].addShapeBox(-7F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		rightTrackModel[323].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[323].rotateAngleX = -1.57079633F;

		rightTrackModel[324].addShapeBox(-5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		rightTrackModel[324].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[324].rotateAngleX = -1.57079633F;

		rightTrackModel[325].addShapeBox(-9F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		rightTrackModel[325].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[325].rotateAngleX = -1.57079633F;

		rightTrackModel[326].addShapeBox(-9F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		rightTrackModel[326].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[326].rotateAngleX = -1.57079633F;

		rightTrackModel[327].addShapeBox(-5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		rightTrackModel[327].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[327].rotateAngleX = -1.57079633F;

		rightTrackModel[328].addShapeBox(-1F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		rightTrackModel[328].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[328].rotateAngleX = -1.57079633F;

		rightTrackModel[329].addShapeBox(3F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		rightTrackModel[329].setRotationPoint(15F, 9F, -27.5F);
		rightTrackModel[329].rotateAngleX = -1.57079633F;

		rightTrackModel[330].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		rightTrackModel[330].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[330].rotateAngleX = -1.57079633F;
		rightTrackModel[330].rotateAngleZ = 0.78539816F;

		rightTrackModel[331].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		rightTrackModel[331].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[331].rotateAngleX = -1.57079633F;
		rightTrackModel[331].rotateAngleZ = 0.78539816F;

		rightTrackModel[332].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 993
		rightTrackModel[332].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[332].rotateAngleX = -1.57079633F;
		rightTrackModel[332].rotateAngleZ = 0.78539816F;

		rightTrackModel[333].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		rightTrackModel[333].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[333].rotateAngleX = -1.57079633F;
		rightTrackModel[333].rotateAngleZ = 0.78539816F;

		rightTrackModel[334].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 995
		rightTrackModel[334].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[334].rotateAngleX = -1.57079633F;
		rightTrackModel[334].rotateAngleZ = 0.78539816F;

		rightTrackModel[335].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 996
		rightTrackModel[335].setRotationPoint(-112F, -4.5F, -27.5F);
		rightTrackModel[335].rotateAngleX = -1.57079633F;
		rightTrackModel[335].rotateAngleZ = 0.78539816F;

		rightTrackModel[336].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 997
		rightTrackModel[336].setRotationPoint(-112F, 0F, -27.5F);
		rightTrackModel[336].rotateAngleX = -1.57079633F;
		rightTrackModel[336].rotateAngleZ = 1.57079633F;

		rightTrackModel[337].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 998
		rightTrackModel[337].setRotationPoint(-112F, 0F, -27.5F);
		rightTrackModel[337].rotateAngleX = -1.57079633F;
		rightTrackModel[337].rotateAngleZ = 1.57079633F;

		rightTrackModel[338].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 999
		rightTrackModel[338].setRotationPoint(-112F, 0F, -27.5F);
		rightTrackModel[338].rotateAngleX = -1.57079633F;
		rightTrackModel[338].rotateAngleZ = 1.57079633F;

		rightTrackModel[339].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		rightTrackModel[339].setRotationPoint(-112F, 0F, -27.5F);
		rightTrackModel[339].rotateAngleX = -1.57079633F;
		rightTrackModel[339].rotateAngleZ = 1.57079633F;

		rightTrackModel[340].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1002
		rightTrackModel[340].setRotationPoint(-112F, 0F, -27.5F);
		rightTrackModel[340].rotateAngleX = -1.57079633F;
		rightTrackModel[340].rotateAngleZ = 1.57079633F;

		rightTrackModel[341].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1003
		rightTrackModel[341].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[341].rotateAngleX = -1.57079633F;
		rightTrackModel[341].rotateAngleZ = 5.49778714F;

		rightTrackModel[342].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		rightTrackModel[342].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[342].rotateAngleX = -1.57079633F;
		rightTrackModel[342].rotateAngleZ = 5.49778714F;

		rightTrackModel[343].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1005
		rightTrackModel[343].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[343].rotateAngleX = -1.57079633F;
		rightTrackModel[343].rotateAngleZ = 5.49778714F;

		rightTrackModel[344].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1006
		rightTrackModel[344].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[344].rotateAngleX = -1.57079633F;
		rightTrackModel[344].rotateAngleZ = 5.49778714F;

		rightTrackModel[345].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		rightTrackModel[345].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[345].rotateAngleX = -1.57079633F;
		rightTrackModel[345].rotateAngleZ = 5.49778714F;

		rightTrackModel[346].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		rightTrackModel[346].setRotationPoint(-111.5F, 0.5F, -27.5F);
		rightTrackModel[346].rotateAngleX = -1.57079633F;
		rightTrackModel[346].rotateAngleZ = 5.49778714F;

		rightTrackModel[347].addShapeBox(-0.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1009
		rightTrackModel[347].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[347].rotateAngleX = -1.57079633F;
		rightTrackModel[347].rotateAngleZ = 5.84685299F;

		rightTrackModel[348].addShapeBox(-0.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1010
		rightTrackModel[348].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[348].rotateAngleX = -1.57079633F;
		rightTrackModel[348].rotateAngleZ = 5.84685299F;

		rightTrackModel[349].addShapeBox(1.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1011
		rightTrackModel[349].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[349].rotateAngleX = -1.57079633F;
		rightTrackModel[349].rotateAngleZ = 5.84685299F;

		rightTrackModel[350].addShapeBox(1.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1012
		rightTrackModel[350].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[350].rotateAngleX = -1.57079633F;
		rightTrackModel[350].rotateAngleZ = 5.84685299F;

		rightTrackModel[351].addShapeBox(1.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		rightTrackModel[351].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[351].rotateAngleX = -1.57079633F;
		rightTrackModel[351].rotateAngleZ = 5.84685299F;

		rightTrackModel[352].addShapeBox(1.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		rightTrackModel[352].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[352].rotateAngleX = -1.57079633F;
		rightTrackModel[352].rotateAngleZ = 5.84685299F;

		rightTrackModel[353].addShapeBox(3.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1015
		rightTrackModel[353].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[353].rotateAngleX = -1.57079633F;
		rightTrackModel[353].rotateAngleZ = 5.84685299F;

		rightTrackModel[354].addShapeBox(3.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1016
		rightTrackModel[354].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[354].rotateAngleX = -1.57079633F;
		rightTrackModel[354].rotateAngleZ = 5.84685299F;

		rightTrackModel[355].addShapeBox(5.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1017
		rightTrackModel[355].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[355].rotateAngleX = -1.57079633F;
		rightTrackModel[355].rotateAngleZ = 5.84685299F;

		rightTrackModel[356].addShapeBox(5.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		rightTrackModel[356].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[356].rotateAngleX = -1.57079633F;
		rightTrackModel[356].rotateAngleZ = 5.84685299F;

		rightTrackModel[357].addShapeBox(5.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		rightTrackModel[357].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[357].rotateAngleX = -1.57079633F;
		rightTrackModel[357].rotateAngleZ = 5.84685299F;

		rightTrackModel[358].addShapeBox(5.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1020
		rightTrackModel[358].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[358].rotateAngleX = -1.57079633F;
		rightTrackModel[358].rotateAngleZ = 5.84685299F;

		rightTrackModel[359].addShapeBox(7.5F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1021
		rightTrackModel[359].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[359].rotateAngleX = -1.57079633F;
		rightTrackModel[359].rotateAngleZ = 5.84685299F;

		rightTrackModel[360].addShapeBox(7.5F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1022
		rightTrackModel[360].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[360].rotateAngleX = -1.57079633F;
		rightTrackModel[360].rotateAngleZ = 5.84685299F;

		rightTrackModel[361].addShapeBox(9.5F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1023
		rightTrackModel[361].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[361].rotateAngleX = -1.57079633F;
		rightTrackModel[361].rotateAngleZ = 5.84685299F;

		rightTrackModel[362].addShapeBox(9.5F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		rightTrackModel[362].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[362].rotateAngleX = -1.57079633F;
		rightTrackModel[362].rotateAngleZ = 5.84685299F;

		rightTrackModel[363].addShapeBox(9.5F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		rightTrackModel[363].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[363].rotateAngleX = -1.57079633F;
		rightTrackModel[363].rotateAngleZ = 5.84685299F;

		rightTrackModel[364].addShapeBox(9.5F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		rightTrackModel[364].setRotationPoint(-108.5F, 3.5F, -27.5F);
		rightTrackModel[364].rotateAngleX = -1.57079633F;
		rightTrackModel[364].rotateAngleZ = 5.84685299F;

		rightTrackModel[365].addShapeBox(11F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1027
		rightTrackModel[365].setRotationPoint(-108.5F, 3.7F, -27.5F);
		rightTrackModel[365].rotateAngleX = -1.57079633F;
		rightTrackModel[365].rotateAngleZ = 5.88175958F;

		rightTrackModel[366].addShapeBox(11F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		rightTrackModel[366].setRotationPoint(-108.5F, 3.7F, -27.5F);
		rightTrackModel[366].rotateAngleX = -1.57079633F;
		rightTrackModel[366].rotateAngleZ = 5.88175958F;

		rightTrackModel[367].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1293
		rightTrackModel[367].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[367].rotateAngleX = -1.57079633F;
		rightTrackModel[367].rotateAngleZ = 2.18166156F;

		rightTrackModel[368].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1294
		rightTrackModel[368].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[368].rotateAngleX = -1.57079633F;
		rightTrackModel[368].rotateAngleZ = 2.18166156F;

		rightTrackModel[369].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1295
		rightTrackModel[369].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[369].rotateAngleX = -1.57079633F;
		rightTrackModel[369].rotateAngleZ = 2.18166156F;

		rightTrackModel[370].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1296
		rightTrackModel[370].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[370].rotateAngleX = -1.57079633F;
		rightTrackModel[370].rotateAngleZ = 2.18166156F;

		rightTrackModel[371].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1297
		rightTrackModel[371].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[371].rotateAngleX = -1.57079633F;
		rightTrackModel[371].rotateAngleZ = 2.18166156F;

		rightTrackModel[372].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1298
		rightTrackModel[372].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[372].rotateAngleX = -1.57079633F;
		rightTrackModel[372].rotateAngleZ = 1.57079633F;

		rightTrackModel[373].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1299
		rightTrackModel[373].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[373].rotateAngleX = -1.57079633F;
		rightTrackModel[373].rotateAngleZ = 1.57079633F;

		rightTrackModel[374].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1300
		rightTrackModel[374].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[374].rotateAngleX = -1.57079633F;
		rightTrackModel[374].rotateAngleZ = 1.57079633F;

		rightTrackModel[375].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1301
		rightTrackModel[375].setRotationPoint(32F, -3F, -28F);
		rightTrackModel[375].rotateAngleX = -1.57079633F;
		rightTrackModel[375].rotateAngleZ = 2.18166156F;

		rightTrackModel[376].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1302
		rightTrackModel[376].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[376].rotateAngleX = -1.57079633F;
		rightTrackModel[376].rotateAngleZ = 1.57079633F;

		rightTrackModel[377].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1303
		rightTrackModel[377].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[377].rotateAngleX = -1.57079633F;
		rightTrackModel[377].rotateAngleZ = 1.57079633F;

		rightTrackModel[378].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1304
		rightTrackModel[378].setRotationPoint(32F, 0F, -28F);
		rightTrackModel[378].rotateAngleX = -1.57079633F;
		rightTrackModel[378].rotateAngleZ = 1.57079633F;

		rightTrackModel[379].addShapeBox(12F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1305
		rightTrackModel[379].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[379].rotateAngleX = -1.57079633F;
		rightTrackModel[379].rotateAngleZ = 0.61086524F;

		rightTrackModel[380].addShapeBox(12F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1306
		rightTrackModel[380].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[380].rotateAngleX = -1.57079633F;
		rightTrackModel[380].rotateAngleZ = 0.61086524F;

		rightTrackModel[381].addShapeBox(8F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1307
		rightTrackModel[381].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[381].rotateAngleX = -1.57079633F;
		rightTrackModel[381].rotateAngleZ = 0.61086524F;

		rightTrackModel[382].addShapeBox(4F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1308
		rightTrackModel[382].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[382].rotateAngleX = -1.57079633F;
		rightTrackModel[382].rotateAngleZ = 0.61086524F;

		rightTrackModel[383].addShapeBox(0F, -6F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1309
		rightTrackModel[383].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[383].rotateAngleX = -1.57079633F;
		rightTrackModel[383].rotateAngleZ = 0.61086524F;

		rightTrackModel[384].addShapeBox(0F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1310
		rightTrackModel[384].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[384].rotateAngleX = -1.57079633F;
		rightTrackModel[384].rotateAngleZ = 0.61086524F;

		rightTrackModel[385].addShapeBox(4F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1311
		rightTrackModel[385].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[385].rotateAngleX = -1.57079633F;
		rightTrackModel[385].rotateAngleZ = 0.61086524F;

		rightTrackModel[386].addShapeBox(8F, 4F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1312
		rightTrackModel[386].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[386].rotateAngleX = -1.57079633F;
		rightTrackModel[386].rotateAngleZ = 0.61086524F;

		rightTrackModel[387].addShapeBox(14F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1313
		rightTrackModel[387].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[387].rotateAngleX = -1.57079633F;
		rightTrackModel[387].rotateAngleZ = 0.61086524F;

		rightTrackModel[388].addShapeBox(14F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1314
		rightTrackModel[388].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[388].rotateAngleX = -1.57079633F;
		rightTrackModel[388].rotateAngleZ = 0.61086524F;

		rightTrackModel[389].addShapeBox(14F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1315
		rightTrackModel[389].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[389].rotateAngleX = -1.57079633F;
		rightTrackModel[389].rotateAngleZ = 0.61086524F;

		rightTrackModel[390].addShapeBox(14F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1316
		rightTrackModel[390].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[390].rotateAngleX = -1.57079633F;
		rightTrackModel[390].rotateAngleZ = 0.61086524F;

		rightTrackModel[391].addShapeBox(10F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1317
		rightTrackModel[391].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[391].rotateAngleX = -1.57079633F;
		rightTrackModel[391].rotateAngleZ = 0.61086524F;

		rightTrackModel[392].addShapeBox(10F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1318
		rightTrackModel[392].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[392].rotateAngleX = -1.57079633F;
		rightTrackModel[392].rotateAngleZ = 0.61086524F;

		rightTrackModel[393].addShapeBox(10F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1319
		rightTrackModel[393].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[393].rotateAngleX = -1.57079633F;
		rightTrackModel[393].rotateAngleZ = 0.61086524F;

		rightTrackModel[394].addShapeBox(10F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1320
		rightTrackModel[394].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[394].rotateAngleX = -1.57079633F;
		rightTrackModel[394].rotateAngleZ = 0.61086524F;

		rightTrackModel[395].addShapeBox(6F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1321
		rightTrackModel[395].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[395].rotateAngleX = -1.57079633F;
		rightTrackModel[395].rotateAngleZ = 0.61086524F;

		rightTrackModel[396].addShapeBox(6F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1322
		rightTrackModel[396].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[396].rotateAngleX = -1.57079633F;
		rightTrackModel[396].rotateAngleZ = 0.61086524F;

		rightTrackModel[397].addShapeBox(6F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1323
		rightTrackModel[397].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[397].rotateAngleX = -1.57079633F;
		rightTrackModel[397].rotateAngleZ = 0.61086524F;

		rightTrackModel[398].addShapeBox(6F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1324
		rightTrackModel[398].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[398].rotateAngleX = -1.57079633F;
		rightTrackModel[398].rotateAngleZ = 0.61086524F;

		rightTrackModel[399].addShapeBox(2F, 11F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1325
		rightTrackModel[399].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[399].rotateAngleX = -1.57079633F;
		rightTrackModel[399].rotateAngleZ = 0.61086524F;

		rightTrackModel[400].addShapeBox(2F, 5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1326
		rightTrackModel[400].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[400].rotateAngleX = -1.57079633F;
		rightTrackModel[400].rotateAngleZ = 0.61086524F;

		rightTrackModel[401].addShapeBox(2F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1327
		rightTrackModel[401].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[401].rotateAngleX = -1.57079633F;
		rightTrackModel[401].rotateAngleZ = 0.61086524F;

		rightTrackModel[402].addShapeBox(2F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1328
		rightTrackModel[402].setRotationPoint(19.5F, 9F, -28F);
		rightTrackModel[402].rotateAngleX = -1.57079633F;
		rightTrackModel[402].rotateAngleZ = 0.61086524F;
	}
}