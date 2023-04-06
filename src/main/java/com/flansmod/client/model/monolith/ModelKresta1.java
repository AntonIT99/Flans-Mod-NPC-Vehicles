//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kresta1
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKresta1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelKresta1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[305];
		bodyDoorOpenModel = new ModelRendererTurbo[14];
		bodyDoorCloseModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 50
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 54
		bodyModel[6] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 55
		bodyModel[7] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 56
		bodyModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 57
		bodyModel[9] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 58
		bodyModel[10] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 60
		bodyModel[12] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 64
		bodyModel[16] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 65
		bodyModel[17] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 66
		bodyModel[18] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 67
		bodyModel[19] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 68
		bodyModel[20] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 69
		bodyModel[21] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 70
		bodyModel[22] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 71
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		bodyModel[24] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 73
		bodyModel[25] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 74
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 75
		bodyModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 76
		bodyModel[28] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 77
		bodyModel[29] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 78
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[31] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 244
		bodyModel[33] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 84
		bodyModel[36] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 85
		bodyModel[37] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 86
		bodyModel[38] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 88
		bodyModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 136
		bodyModel[41] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 137
		bodyModel[42] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 138
		bodyModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 139
		bodyModel[44] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 140
		bodyModel[45] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 141
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 142
		bodyModel[47] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 143
		bodyModel[48] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 144
		bodyModel[49] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 145
		bodyModel[50] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 146
		bodyModel[51] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 147
		bodyModel[52] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 148
		bodyModel[53] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 149
		bodyModel[54] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 150
		bodyModel[55] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 151
		bodyModel[56] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 152
		bodyModel[57] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 153
		bodyModel[58] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 154
		bodyModel[59] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 155
		bodyModel[60] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 156
		bodyModel[61] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 175
		bodyModel[62] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 176
		bodyModel[63] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 177
		bodyModel[64] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 178
		bodyModel[65] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 179
		bodyModel[66] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 180
		bodyModel[67] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 181
		bodyModel[68] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 182
		bodyModel[69] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 183
		bodyModel[70] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 194
		bodyModel[71] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 195
		bodyModel[72] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 207
		bodyModel[74] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 208
		bodyModel[75] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 209
		bodyModel[76] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 210
		bodyModel[77] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 211
		bodyModel[78] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 212
		bodyModel[79] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 213
		bodyModel[80] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 214
		bodyModel[81] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 215
		bodyModel[82] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 216
		bodyModel[83] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 217
		bodyModel[84] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 218
		bodyModel[85] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 219
		bodyModel[86] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 220
		bodyModel[87] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 221
		bodyModel[88] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 222
		bodyModel[89] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 223
		bodyModel[90] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 224
		bodyModel[91] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 225
		bodyModel[92] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 226
		bodyModel[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 227
		bodyModel[94] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 228
		bodyModel[95] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 229
		bodyModel[96] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 230
		bodyModel[97] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 231
		bodyModel[98] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 232
		bodyModel[99] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 233
		bodyModel[100] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 234
		bodyModel[101] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 235
		bodyModel[102] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 236
		bodyModel[103] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 237
		bodyModel[104] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 153
		bodyModel[105] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 154
		bodyModel[106] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 155
		bodyModel[107] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 156
		bodyModel[108] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 157
		bodyModel[109] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 158
		bodyModel[110] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 159
		bodyModel[111] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 160
		bodyModel[112] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 161
		bodyModel[113] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 162
		bodyModel[114] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 163
		bodyModel[115] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 164
		bodyModel[116] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 165
		bodyModel[117] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 166
		bodyModel[118] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 167
		bodyModel[119] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 265
		bodyModel[120] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 169
		bodyModel[121] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 159
		bodyModel[122] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 648
		bodyModel[126] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 649
		bodyModel[127] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 650
		bodyModel[128] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 651
		bodyModel[129] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 652
		bodyModel[130] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 653
		bodyModel[131] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 654
		bodyModel[132] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 655
		bodyModel[133] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 656
		bodyModel[134] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 657
		bodyModel[135] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 658
		bodyModel[136] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 659
		bodyModel[137] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 660
		bodyModel[138] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 661
		bodyModel[139] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 662
		bodyModel[140] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 663
		bodyModel[141] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 154
		bodyModel[148] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 155
		bodyModel[149] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 157
		bodyModel[150] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 158
		bodyModel[151] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 159
		bodyModel[152] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 160
		bodyModel[153] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 161
		bodyModel[154] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 162
		bodyModel[155] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 163
		bodyModel[156] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 164
		bodyModel[157] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 165
		bodyModel[158] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 166
		bodyModel[159] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 167
		bodyModel[160] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 168
		bodyModel[161] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 169
		bodyModel[162] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 170
		bodyModel[163] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 171
		bodyModel[164] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 172
		bodyModel[165] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 173
		bodyModel[166] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 24
		bodyModel[167] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 25
		bodyModel[168] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 375
		bodyModel[169] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 376
		bodyModel[170] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 377
		bodyModel[171] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 378
		bodyModel[172] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 385
		bodyModel[173] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 386
		bodyModel[174] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 182
		bodyModel[175] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 183
		bodyModel[176] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 184
		bodyModel[177] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 185
		bodyModel[178] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 186
		bodyModel[179] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 187
		bodyModel[180] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 188
		bodyModel[181] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 189
		bodyModel[182] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 190
		bodyModel[183] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 191
		bodyModel[184] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 192
		bodyModel[185] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 193
		bodyModel[186] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 194
		bodyModel[187] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 195
		bodyModel[188] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 196
		bodyModel[189] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 197
		bodyModel[190] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 198
		bodyModel[191] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 199
		bodyModel[192] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 200
		bodyModel[193] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 201
		bodyModel[194] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 202
		bodyModel[195] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 203
		bodyModel[196] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 204
		bodyModel[197] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 205
		bodyModel[198] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 206
		bodyModel[199] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 207
		bodyModel[200] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 208
		bodyModel[201] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 209
		bodyModel[202] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 210
		bodyModel[203] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 541
		bodyModel[204] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 542
		bodyModel[205] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 213
		bodyModel[206] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 214
		bodyModel[207] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 215
		bodyModel[208] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 216
		bodyModel[209] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 217
		bodyModel[210] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 218
		bodyModel[211] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 219
		bodyModel[212] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 220
		bodyModel[213] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 221
		bodyModel[214] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 222
		bodyModel[215] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 223
		bodyModel[216] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 224
		bodyModel[217] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 225
		bodyModel[218] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 226
		bodyModel[219] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 227
		bodyModel[220] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 228
		bodyModel[221] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 229
		bodyModel[222] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 230
		bodyModel[223] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 231
		bodyModel[224] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 231
		bodyModel[225] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 232
		bodyModel[226] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 233
		bodyModel[227] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 234
		bodyModel[228] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 235
		bodyModel[229] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 236
		bodyModel[230] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 237
		bodyModel[231] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 238
		bodyModel[232] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 239
		bodyModel[233] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 240
		bodyModel[234] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 241
		bodyModel[235] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 242
		bodyModel[236] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 243
		bodyModel[237] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 41
		bodyModel[238] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 245
		bodyModel[239] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 246
		bodyModel[240] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 247
		bodyModel[241] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 310
		bodyModel[242] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 311
		bodyModel[243] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 312
		bodyModel[244] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 251
		bodyModel[245] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 252
		bodyModel[246] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 253
		bodyModel[247] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 254
		bodyModel[248] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 255
		bodyModel[249] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 258
		bodyModel[250] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 259
		bodyModel[251] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 260
		bodyModel[252] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 261
		bodyModel[253] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 262
		bodyModel[254] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 263
		bodyModel[255] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 334
		bodyModel[256] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 335
		bodyModel[257] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 336
		bodyModel[258] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 337
		bodyModel[259] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 338
		bodyModel[260] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 339
		bodyModel[261] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 340
		bodyModel[262] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 341
		bodyModel[263] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 342
		bodyModel[264] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 343
		bodyModel[265] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 344
		bodyModel[266] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 345
		bodyModel[267] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 346
		bodyModel[268] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 347
		bodyModel[269] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 348
		bodyModel[270] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 349
		bodyModel[271] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 350
		bodyModel[272] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 351
		bodyModel[273] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 352
		bodyModel[274] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 353
		bodyModel[275] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 354
		bodyModel[276] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 355
		bodyModel[277] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 356
		bodyModel[278] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 357
		bodyModel[279] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 358
		bodyModel[280] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 359
		bodyModel[281] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 360
		bodyModel[282] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 361
		bodyModel[283] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 362
		bodyModel[284] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 363
		bodyModel[285] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 364
		bodyModel[286] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 365
		bodyModel[287] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 366
		bodyModel[288] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 367
		bodyModel[289] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 368
		bodyModel[290] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 369
		bodyModel[291] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 370
		bodyModel[292] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 371
		bodyModel[293] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 384
		bodyModel[294] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 385
		bodyModel[295] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 393
		bodyModel[296] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 394
		bodyModel[297] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 395
		bodyModel[298] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 396
		bodyModel[299] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 397
		bodyModel[300] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 398
		bodyModel[301] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 399
		bodyModel[302] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 400
		bodyModel[303] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 401
		bodyModel[304] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 402

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 7, 20, 0F,0F, 0.1F, -0.5F, 0F, -0.5F, 2.75F, 0F, -0.5F, 2.75F, 0F, 0.1F, -0.5F, -4.75F, -0.25F, -1.5F, 0F, 5F, -1.75F, 0F, 5F, -1.75F, -4.75F, -0.25F, -1.5F); // Box 49
		bodyModel[0].setRotationPoint(-123F, -2F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 78, 12, 20, 0F,0F, -0.5F, 2.75F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, -0.5F, 2.75F, 0F, 0F, -1.75F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, -1.75F); // Box 50
		bodyModel[1].setRotationPoint(-78F, -2F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 78, 3, 20, 0F,0F, 0.1F, 2.75F, 0F, 0.25F, 4.25F, 0F, 0.25F, 4.25F, 0F, 0.1F, 2.75F, 0F, 0.5F, 2.75F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0.5F, 2.75F); // Box 51
		bodyModel[2].setRotationPoint(-78F, -5F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 20, 0F,0F, 0.25F, 4.25F, 0F, 0.1F, 4F, 0F, 0.1F, 4F, 0F, 0.25F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, 4.25F); // Box 52
		bodyModel[3].setRotationPoint(0F, -5F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 12, 20, 0F,0F, 0F, 4.25F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, 4.25F, 0F, 0.25F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.25F, 0.5F); // Box 53
		bodyModel[4].setRotationPoint(0F, -2F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 3, 20, 0F,0F, 0.1F, 4F, 0F, 0.25F, 3.75F, 0F, 0.25F, 3.75F, 0F, 0.1F, 4F, 0F, 0F, 3.75F, 0F, -3.25F, 3.75F, 0F, -3.25F, 3.75F, 0F, 0F, 3.75F); // Box 54
		bodyModel[5].setRotationPoint(24F, -5F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 12, 20, 0F,0F, 0F, 3.75F, 0F, 3.25F, 3.75F, 0F, 3.25F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, -1.5F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, -1.5F); // Box 55
		bodyModel[6].setRotationPoint(24F, -2F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 36, 15, 20, 0F,0F, 0.25F, 3.75F, 0.5F, 1F, 1F, 0.5F, 1F, 1F, 0F, 0.25F, 3.75F, 0F, 0F, -3.25F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, -3.25F); // Box 56
		bodyModel[7].setRotationPoint(41F, -5F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 4, 20, 0F,0F, -0.25F, 3.25F, 1F, -0.25F, 0.5F, 1F, -0.25F, 0.5F, 0F, -0.25F, 3.25F, 0F, 1.25F, 3.75F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0F, 1.25F, 3.75F); // Box 57
		bodyModel[8].setRotationPoint(41F, -10.5F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 15, 20, 0F,0.5F, 1F, 1F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0.5F, 1F, 1F, 0.5F, 0F, -7F, 0F, 0F, -7.75F, 0F, 0F, -7.75F, 0.5F, 0F, -7F); // Box 58
		bodyModel[9].setRotationPoint(78F, -5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 15, 20, 0F,0F, 1.75F, 0F, 0.5F, 4.5F, -4.5F, 0.5F, 4.5F, -4.5F, 0F, 1.75F, 0F, 0F, 0F, -7.75F, 0.5F, 0F, -8.75F, 0.5F, 0F, -8.75F, 0F, 0F, -7.75F); // Box 59
		bodyModel[10].setRotationPoint(87F, -5F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 15, 20, 0F,0.5F, 4.5F, -4.5F, 0.5F, 6.25F, -9.75F, 0.5F, 6.25F, -9.75F, 0.5F, 4.5F, -4.5F, 0.5F, 0F, -8.75F, -13.75F, 0F, -9.75F, -13.75F, 0F, -9.75F, 0.5F, 0F, -8.75F); // Box 60
		bodyModel[11].setRotationPoint(108F, -5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 18, 0F,1F, -0.25F, 1.5F, 0F, -0.2F, -3.25F, 0F, -0.2F, -3.25F, 1F, -0.25F, 1.5F, 1.5F, 0.5F, 2F, 0.75F, 0F, -3.25F, 0.75F, 0F, -3.25F, 1.5F, 0.5F, 2F); // Box 61
		bodyModel[12].setRotationPoint(79F, -10.5F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[13].setRotationPoint(-89.5F, -11F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0.1F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, -0.25F); // Box 63
		bodyModel[14].setRotationPoint(-90F, -5F, -7.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0.1F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, -0.25F); // Box 64
		bodyModel[15].setRotationPoint(-90F, -5F, 3.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[16].setRotationPoint(2F, -10.25F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[17].setRotationPoint(8F, -10.25F, -13.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0F); // Box 67
		bodyModel[18].setRotationPoint(13F, -10.25F, -13.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 6, 17, 0F,0F, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.25F); // Box 68
		bodyModel[19].setRotationPoint(17F, -10.25F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[20].setRotationPoint(21F, -10.25F, -4.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 5, 9, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 70
		bodyModel[21].setRotationPoint(23F, -14.45F, -4.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,-1.5F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, -1.5F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 71
		bodyModel[22].setRotationPoint(23F, -14.45F, -13.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-1.5F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -2.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.5F, 0.25F, -0.5F, -2.75F, 0.25F, -0.5F); // Box 72
		bodyModel[23].setRotationPoint(23F, -13.45F, -13.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,-2.75F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.5F, 0.25F, -0.5F, -2.75F, 0.25F, -0.5F, -0.75F, 0F, 0F, -4.25F, 0F, 0F, -4F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 73
		bodyModel[24].setRotationPoint(23F, -11.95F, -13.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1.25F, 0F, 0F, -1.5F, 0F, 0F); // Box 74
		bodyModel[25].setRotationPoint(23F, -14.45F, 4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.25F, 0F, 0F, -1.5F, 0F, 0F, -2.75F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -1.75F, 0.25F, 0F, -2.75F, 0.25F, 0F); // Box 75
		bodyModel[26].setRotationPoint(23F, -13.45F, 12.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,-2.75F, 0.25F, -0.5F, -1.5F, 0.25F, -0.5F, -1.75F, 0.25F, 0F, -2.75F, 0.25F, 0F, -0.75F, 0F, -0.5F, -4F, 0F, -0.5F, -4.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 76
		bodyModel[27].setRotationPoint(23F, -11.95F, 12.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 26, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[28].setRotationPoint(-23.5F, -10.25F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 6, 14, 0F,0F, 0F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F); // Box 78
		bodyModel[29].setRotationPoint(-27.5F, -10.25F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 79
		bodyModel[30].setRotationPoint(-32.5F, -10.25F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 4F); // Box 80
		bodyModel[31].setRotationPoint(-36.75F, -10.25F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 244
		bodyModel[32].setRotationPoint(-45.7F, -12.5F, 5.9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 82
		bodyModel[33].setRotationPoint(-45.7F, -12.5F, -12.9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[34].setRotationPoint(-45.7F, -10.3F, -12.9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[35].setRotationPoint(-45.7F, -10.3F, 5.9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[36].setRotationPoint(-45.75F, -10.25F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 86
		bodyModel[37].setRotationPoint(-47.5F, -10.25F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[38].setRotationPoint(-58.5F, -10.25F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[39].setRotationPoint(-69.5F, -10.25F, -8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 136
		bodyModel[40].setRotationPoint(28.25F, -24.5F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 137
		bodyModel[41].setRotationPoint(28.25F, -22F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 138
		bodyModel[42].setRotationPoint(28.25F, -25.5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 139
		bodyModel[43].setRotationPoint(28.25F, -27.5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 140
		bodyModel[44].setRotationPoint(28.25F, -28.5F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[45].setRotationPoint(29.75F, -26F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 142
		bodyModel[46].setRotationPoint(29.75F, -26F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[47].setRotationPoint(29.75F, -26F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 144
		bodyModel[48].setRotationPoint(29.75F, -26F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 145
		bodyModel[49].setRotationPoint(29.75F, -25.5F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 146
		bodyModel[50].setRotationPoint(29.75F, -26.5F, 2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 147
		bodyModel[51].setRotationPoint(31F, -26.25F, 1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 148
		bodyModel[52].setRotationPoint(31.75F, -25.5F, 2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 149
		bodyModel[53].setRotationPoint(31.75F, -28.5F, 2.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 150
		bodyModel[54].setRotationPoint(31.75F, -26.5F, 2.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 151
		bodyModel[55].setRotationPoint(31F, -25.25F, -1.5F);
		bodyModel[55].rotateAngleX = 4.71238898F;

		bodyModel[56].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 152
		bodyModel[56].setRotationPoint(31.75F, -24F, -2F);
		bodyModel[56].rotateAngleX = 1.57079633F;

		bodyModel[57].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 153
		bodyModel[57].setRotationPoint(31.75F, -24F, -2F);
		bodyModel[57].rotateAngleX = 1.57079633F;

		bodyModel[58].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 154
		bodyModel[58].setRotationPoint(31.75F, -24F, -2F);
		bodyModel[58].rotateAngleX = 1.57079633F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 155
		bodyModel[59].setRotationPoint(30.75F, -28F, -2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
		bodyModel[60].setRotationPoint(29.75F, -26.7F, -2.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F); // Box 175
		bodyModel[61].setRotationPoint(30.75F, -28.5F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 176
		bodyModel[62].setRotationPoint(30.95F, -28.1F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 177
		bodyModel[63].setRotationPoint(30.95F, -28.1F, -3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // Box 178
		bodyModel[64].setRotationPoint(30.95F, -28.1F, -1.5F);

		bodyModel[65].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 179
		bodyModel[65].setRotationPoint(30.95F, -26.5F, -3.75F);
		bodyModel[65].rotateAngleX = 1.57079633F;

		bodyModel[66].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 1, 0F,-0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 180
		bodyModel[66].setRotationPoint(30.95F, -26.5F, -3.75F);
		bodyModel[66].rotateAngleX = 1.57079633F;

		bodyModel[67].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // Box 181
		bodyModel[67].setRotationPoint(30.95F, -26.5F, -3.75F);
		bodyModel[67].rotateAngleX = 1.57079633F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F); // Box 182
		bodyModel[68].setRotationPoint(30.75F, -26F, -4.5F);
		bodyModel[68].rotateAngleX = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[69].setRotationPoint(30.75F, -26F, -4F);
		bodyModel[69].rotateAngleX = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 194
		bodyModel[70].setRotationPoint(25.25F, -26F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 195
		bodyModel[71].setRotationPoint(24.75F, -28.5F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 0.5F, -0.75F, 0.5F, 3F, 0F, 2.5F, 3F, 0F, 2.5F, 3F, 0F, 2.5F, 3F, 0F, 2.5F); // Box 121
		bodyModel[72].setRotationPoint(28.25F, -21F, -1F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F); // Box 207
		bodyModel[73].setRotationPoint(-44F, -23.65F, -3.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 208
		bodyModel[74].setRotationPoint(-44F, -25.65F, -3.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 209
		bodyModel[75].setRotationPoint(-44F, -22.65F, -3.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 210
		bodyModel[76].setRotationPoint(-42F, -23.65F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 211
		bodyModel[77].setRotationPoint(-42F, -22.65F, -4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 212
		bodyModel[78].setRotationPoint(-41.5F, -21.65F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 213
		bodyModel[79].setRotationPoint(-41.5F, -19.15F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 214
		bodyModel[80].setRotationPoint(-41.5F, -22.65F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 215
		bodyModel[81].setRotationPoint(-41.5F, -24.65F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F); // Box 216
		bodyModel[82].setRotationPoint(-40.5F, -23.15F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 217
		bodyModel[83].setRotationPoint(-39F, -25.65F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 218
		bodyModel[84].setRotationPoint(-41.5F, -25.65F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[85].setRotationPoint(-44.75F, -23.4F, -2.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[86].setRotationPoint(-42F, -23.15F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[87].setRotationPoint(-42F, -23.15F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 222
		bodyModel[88].setRotationPoint(-42F, -23.15F, -0.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 223
		bodyModel[89].setRotationPoint(-42F, -23.15F, -1F);

		bodyModel[90].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 224
		bodyModel[90].setRotationPoint(-44F, -21.15F, 1.5F);
		bodyModel[90].rotateAngleX = 1.57079633F;

		bodyModel[91].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F); // Box 225
		bodyModel[91].setRotationPoint(-44F, -21.15F, 1.5F);
		bodyModel[91].rotateAngleX = 1.57079633F;

		bodyModel[92].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 226
		bodyModel[92].setRotationPoint(-44F, -21.15F, 1.5F);
		bodyModel[92].rotateAngleX = 1.57079633F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 227
		bodyModel[93].setRotationPoint(-44.75F, -22.4F, 2.5F);
		bodyModel[93].rotateAngleX = 4.71238898F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 228
		bodyModel[94].setRotationPoint(-43F, -25.15F, 1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 229
		bodyModel[95].setRotationPoint(-43.2F, -25.25F, 1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 230
		bodyModel[96].setRotationPoint(-43.2F, -25.25F, 2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 231
		bodyModel[97].setRotationPoint(-43.2F, -25.25F, 0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F); // Box 232
		bodyModel[98].setRotationPoint(-45F, -25.65F, 1.5F);

		bodyModel[99].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 233
		bodyModel[99].setRotationPoint(-43.2F, -23.65F, 3.75F);
		bodyModel[99].rotateAngleX = 1.57079633F;

		bodyModel[100].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 234
		bodyModel[100].setRotationPoint(-43.2F, -23.65F, 3.75F);
		bodyModel[100].rotateAngleX = 1.57079633F;

		bodyModel[101].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 235
		bodyModel[101].setRotationPoint(-43.2F, -23.65F, 3.75F);
		bodyModel[101].rotateAngleX = 1.57079633F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 236
		bodyModel[102].setRotationPoint(-43F, -23.15F, 2F);
		bodyModel[102].rotateAngleX = 1.57079633F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F); // Box 237
		bodyModel[103].setRotationPoint(-45F, -23.15F, 3.5F);
		bodyModel[103].rotateAngleX = 1.57079633F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0.75F, 1.25F, 0F, 0.75F, -1.25F, 0F, 0F); // Box 153
		bodyModel[104].setRotationPoint(-18.75F, -21.85F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 22, 12, 12, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -1.25F, 0F, 0.75F, 1.25F, 0F, 0.75F, 1.25F, 0F, 0.75F, -1.25F, 0F, 0.75F); // Box 154
		bodyModel[105].setRotationPoint(-17.75F, -21.85F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0.75F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, 0.75F, -1.25F, 0F, 0.75F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, -1.25F, 0F, 0.75F); // Box 155
		bodyModel[106].setRotationPoint(4.25F, -21.85F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,2.75F, 0F, -2.75F, -3.25F, 0F, -3.25F, -3.25F, 0F, -3.25F, 2.75F, 0F, -2.75F, 0F, 0F, 2.75F, -0.2F, 0F, 1.75F, -0.2F, 0F, 1.75F, 0F, 0F, 2.75F); // Box 156
		bodyModel[107].setRotationPoint(4.25F, -41.85F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 20, 8, 0F,-3.25F, 0F, -3.25F, 2.75F, 0F, -2.75F, 2.75F, 0F, -2.75F, -3.25F, 0F, -3.25F, 0.55F, 0F, 1.75F, -0.75F, 0F, 2.75F, -0.75F, 0F, 2.75F, 0.55F, 0F, 1.75F); // Box 157
		bodyModel[108].setRotationPoint(-3.75F, -41.85F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 20, 8, 0F,-3.25F, 0F, -2.75F, 0.75F, 0F, -2.75F, 0.75F, 0F, -2.75F, -3.25F, 0F, -2.75F, 0.3F, 0F, 2.75F, 3.5F, 0F, 2.75F, 3.5F, 0F, 2.75F, 0.3F, 0F, 2.75F); // Box 158
		bodyModel[109].setRotationPoint(-3.25F, -41.85F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[110].setRotationPoint(11.5F, -12.25F, -5.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5.5F, 0F, 0.3F, 0F, 0F, 0.25F, 0F, 0F, -0.7F, -5.5F, 0F, -0.6F, 0F, 0.1F, 0.82F, 0F, 0F, 0.75F, 0F, 0F, -1.1F, 0F, 0.1F, -1.2F); // Box 160
		bodyModel[111].setRotationPoint(35F, -10.25F, -13F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-5.5F, 0F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, 0.25F, -5.5F, 0F, 0.3F, 0F, 0.1F, -1.2F, 0F, 0F, -1.1F, 0F, 0F, 0.75F, 0F, 0.1F, 0.82F); // Box 161
		bodyModel[112].setRotationPoint(35F, -10.25F, 12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-5.9F, -0.1F, 1.05F, 0F, -0.1F, 1F, 0F, -0.1F, -1.45F, -5.9F, -0.1F, -1.35F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.95F, 0F, -0.3F, -1.1F, 0F, -0.3F, -0.95F); // Box 162
		bodyModel[113].setRotationPoint(-84F, -5.25F, -11.8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-5.9F, -0.1F, -1.35F, 0F, -0.1F, -1.45F, 0F, -0.1F, 1F, -5.9F, -0.1F, 1.05F, 0F, -0.3F, -0.95F, 0F, -0.3F, -1.1F, 0F, -0.3F, 0.95F, 0F, -0.3F, 0.5F); // Box 163
		bodyModel[114].setRotationPoint(-84F, -5.25F, 10.8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 164
		bodyModel[115].setRotationPoint(-46.75F, -13.5F, -4.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[116].setRotationPoint(-49.5F, -13.5F, -5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,-0.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -3F, 0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -3F); // Box 166
		bodyModel[117].setRotationPoint(-51.5F, -13.5F, -5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 167
		bodyModel[118].setRotationPoint(-44.75F, -17.5F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[119].setRotationPoint(-66.5F, -12.25F, -1.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[120].setRotationPoint(69.25F, -12.25F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[121].setRotationPoint(95F, -11.25F, 2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(94.1F, -11.95F, 1.95F);
		bodyModel[122].rotateAngleZ = 0.15707963F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(95F, -11.25F, -3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[124].setRotationPoint(94.1F, -11.95F, -3.95F);
		bodyModel[124].rotateAngleZ = 0.15707963F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 648
		bodyModel[125].setRotationPoint(-31F, -7F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 649
		bodyModel[126].setRotationPoint(-30.5F, -8F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 650
		bodyModel[127].setRotationPoint(-30.5F, -8.35F, 6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 651
		bodyModel[128].setRotationPoint(-30.5F, -7.65F, 6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 652
		bodyModel[129].setRotationPoint(-29.5F, -7.65F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 653
		bodyModel[130].setRotationPoint(-29.5F, -8.35F, 6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 654
		bodyModel[131].setRotationPoint(-29.5F, -8F, 6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 655
		bodyModel[132].setRotationPoint(-28.5F, -7.65F, 6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 656
		bodyModel[133].setRotationPoint(-28.5F, -8.35F, 6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 657
		bodyModel[134].setRotationPoint(-28.5F, -8F, 6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 658
		bodyModel[135].setRotationPoint(-31.5F, -7.65F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 659
		bodyModel[136].setRotationPoint(-31.5F, -8.35F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 660
		bodyModel[137].setRotationPoint(-31.5F, -8F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F); // Box 661
		bodyModel[138].setRotationPoint(-32.5F, -7.65F, 6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 662
		bodyModel[139].setRotationPoint(-32.5F, -8.35F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F); // Box 663
		bodyModel[140].setRotationPoint(-32.5F, -8F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		bodyModel[141].setRotationPoint(33F, -18.5F, -5.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, -3.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.5F); // Box 143
		bodyModel[142].setRotationPoint(31F, -18.5F, -5.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, -0.25F, 1F, 0F, -1.25F, 1F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0.75F, -0.25F, -1.25F, 0.75F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Box 144
		bodyModel[143].setRotationPoint(38F, -18.5F, -5.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.5F, -0.25F, 0.75F, -0.5F, -1.25F, 0.75F, -0.5F, -1.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -1.25F, 1F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 145
		bodyModel[144].setRotationPoint(38F, -17.5F, -5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 146
		bodyModel[145].setRotationPoint(41F, -13.45F, -4.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0.5F, 0F, -0.25F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, -0.25F, 0F, -0.25F); // Box 147
		bodyModel[146].setRotationPoint(44F, -13.45F, -4.5F);

		bodyModel[147].addShapeBox(-4F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[147].setRotationPoint(27F, -8F, -13F);

		bodyModel[148].addShapeBox(-4F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[148].setRotationPoint(37F, -8F, -13F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.25F, -0.75F, 1F, -0.5F, -0.75F, 2F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 157
		bodyModel[149].setRotationPoint(-18.75F, -24.85F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.75F, 2F, 0.25F, -0.75F, 1F, 0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0F, 0.75F, 0.75F, 0F, 0F, 0.75F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 158
		bodyModel[150].setRotationPoint(-12.75F, -24.85F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0.5F, -0.75F, 2F, -0.5F, -0.75F, 2F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 159
		bodyModel[151].setRotationPoint(-17.75F, -24.85F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 2F, 0.25F, -0.75F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Box 160
		bodyModel[152].setRotationPoint(-18.75F, -24.85F, 3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.75F, 1F, -0.5F, -0.75F, 2F, 0F, 0F, 1.5F, 0.75F, 0F, 1.5F, 0.75F, 0F, 0F, -1F, 0F, 0.75F); // Box 161
		bodyModel[153].setRotationPoint(-12.75F, -24.85F, 3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.75F, 2F, 0.5F, -0.75F, 2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 162
		bodyModel[154].setRotationPoint(-17.75F, -24.85F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[155].setRotationPoint(-17.25F, -31.5F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2.5F); // Box 164
		bodyModel[156].setRotationPoint(-15.25F, -30.5F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0F); // Box 165
		bodyModel[157].setRotationPoint(-24.25F, -30.5F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 1.25F, 0F, 1F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.25F, 0F, 1F); // Box 166
		bodyModel[158].setRotationPoint(-17.25F, -29.75F, -2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.5F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[159].setRotationPoint(-16.25F, -36.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 168
		bodyModel[160].setRotationPoint(-24.25F, -24F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-2.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 169
		bodyModel[161].setRotationPoint(-24.25F, -24F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, -2.5F, -0.25F, 0.5F); // Box 170
		bodyModel[162].setRotationPoint(-24.25F, -24F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[163].setRotationPoint(-17F, -10.25F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
		bodyModel[164].setRotationPoint(-20F, -10.25F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,-0.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.75F, 0F, 0F); // Box 173
		bodyModel[165].setRotationPoint(-10.5F, -10.25F, -13.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, -0.5F, 0.25F, 2F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[166].setRotationPoint(-6.5F, -15.55F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 1.3F, -0.5F, 0.25F, 0F, 0F, 0.75F); // Box 25
		bodyModel[167].setRotationPoint(-6.5F, -15.55F, 12F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-2F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, -2F, -0.4F, -0.75F, -2.75F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -2.75F, -0.65F, -1.25F); // Box 375
		bodyModel[168].setRotationPoint(-16.5F, -14.25F, 9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 376
		bodyModel[169].setRotationPoint(-12.5F, -14.25F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.5F, 0.1F, -2F, 0.5F, 0.1F, -2F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.25F, -0.9F, -2.05F, -0.25F, -0.9F, -2.05F, 0F, -0.15F, -0.75F); // Box 377
		bodyModel[170].setRotationPoint(-4.5F, -14.25F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[171].setRotationPoint(-13.5F, -15.55F, 10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 385
		bodyModel[172].setRotationPoint(-11.5F, -11.75F, 10.1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
		bodyModel[173].setRotationPoint(-3.5F, -11.75F, 10.1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 182
		bodyModel[174].setRotationPoint(-14.5F, -14.25F, -14F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, -0.15F, -0.8F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 183
		bodyModel[175].setRotationPoint(-11.5F, -14.25F, -14F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.5F, -0.15F, -2F, 0.5F, -0.15F, -2F, 0F, -0.4F, 0.5F, 0F, 0.1F, -0.75F, -0.25F, -0.9F, -2.05F, -0.25F, -0.9F, -2.05F, 0F, 0.1F, -0.75F); // Box 184
		bodyModel[176].setRotationPoint(-4.5F, -14.25F, -14F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 185
		bodyModel[177].setRotationPoint(-9.5F, -11.75F, -13.1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 186
		bodyModel[178].setRotationPoint(-3.5F, -11.75F, -13.1F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[179].setRotationPoint(-61.5F, -10.25F, -9.8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[180].setRotationPoint(-61.5F, -10.25F, 8.8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[181].setRotationPoint(-76F, -7.25F, -10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[182].setRotationPoint(-76.9F, -8.25F, -10.95F);
		bodyModel[182].rotateAngleZ = -0.15707963F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 0F); // Box 191
		bodyModel[183].setRotationPoint(-21.25F, -17.75F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 192
		bodyModel[184].setRotationPoint(-22.5F, -17.75F, -10.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 193
		bodyModel[185].setRotationPoint(-21.2F, -19F, -9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[186].setRotationPoint(-21.2F, -20F, -9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 195
		bodyModel[187].setRotationPoint(-21.2F, -21.7F, -9.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[188].setRotationPoint(0.25F, -41.3F, -10F);

		bodyModel[189].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 197
		bodyModel[189].setRotationPoint(8.75F, -33.5F, 0F);
		bodyModel[189].rotateAngleX = 1.57079633F;

		bodyModel[190].addShapeBox(0F, -3.5F, -0.5F, 1, 3, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 198
		bodyModel[190].setRotationPoint(8.75F, -33.5F, 0F);
		bodyModel[190].rotateAngleX = 1.57079633F;

		bodyModel[191].addShapeBox(0F, 0.5F, -0.5F, 1, 4, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 199
		bodyModel[191].setRotationPoint(8.75F, -33.5F, 0F);
		bodyModel[191].rotateAngleX = 1.57079633F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 200
		bodyModel[192].setRotationPoint(8F, -35.75F, 0.5F);
		bodyModel[192].rotateAngleX = 4.71238898F;

		bodyModel[193].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 201
		bodyModel[193].setRotationPoint(8.75F, -39.5F, 0F);
		bodyModel[193].rotateAngleX = 1.57079633F;

		bodyModel[194].addShapeBox(0F, -3.5F, -0.5F, 1, 3, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 202
		bodyModel[194].setRotationPoint(8.75F, -39.5F, 0F);
		bodyModel[194].rotateAngleX = 1.57079633F;

		bodyModel[195].addShapeBox(0F, 0.5F, -0.5F, 1, 4, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 203
		bodyModel[195].setRotationPoint(8.75F, -39.5F, 0F);
		bodyModel[195].rotateAngleX = 1.57079633F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[196].setRotationPoint(8F, -39.25F, 0.5F);
		bodyModel[196].rotateAngleX = 4.71238898F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 205
		bodyModel[197].setRotationPoint(7F, -37.5F, -1.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 206
		bodyModel[198].setRotationPoint(3F, -37.5F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1.5F, 2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2.4F); // Box 207
		bodyModel[199].setRotationPoint(2.5F, -37.5F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 208
		bodyModel[200].setRotationPoint(7F, -38.5F, -1.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 209
		bodyModel[201].setRotationPoint(7F, -36.5F, -1.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0.75F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.5F, -0.25F, -6.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -6.25F, 0F, -0.25F); // Box 210
		bodyModel[202].setRotationPoint(-23.25F, -30.5F, -0.5F);

		bodyModel[203].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,0F, -1.25F, 0F, 0F, 1.25F, 0.25F, 0F, 1.25F, -1F, 0F, -1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[203].setRotationPoint(101.5F, -9.5F, 0F);
		bodyModel[203].rotateAngleX = -0.13962634F;
		bodyModel[203].rotateAngleY = 0.61086524F;
		bodyModel[203].rotateAngleZ = -0.19198622F;

		bodyModel[204].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 542
		bodyModel[204].setRotationPoint(101.5F, -9.5F, 0F);
		bodyModel[204].rotateAngleX = 0.13962634F;
		bodyModel[204].rotateAngleY = -0.61086524F;
		bodyModel[204].rotateAngleZ = -0.19198622F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,-5.25F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -5.25F, -0.5F, 0F, -1F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[205].setRotationPoint(-5.75F, -21.85F, -12.75F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[206].setRotationPoint(2.25F, -21.85F, -8.75F);

		bodyModel[207].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 215
		bodyModel[207].setRotationPoint(1.75F, -24.5F, -10.5F);
		bodyModel[207].rotateAngleX = 1.57079633F;

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F); // Box 216
		bodyModel[208].setRotationPoint(1F, -24.1F, -10F);
		bodyModel[208].rotateAngleX = 4.71238898F;

		bodyModel[209].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 217
		bodyModel[209].setRotationPoint(1.75F, -24.5F, -10.5F);
		bodyModel[209].rotateAngleX = 1.57079633F;

		bodyModel[210].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 218
		bodyModel[210].setRotationPoint(1.75F, -24.5F, -10.5F);
		bodyModel[210].rotateAngleX = 1.57079633F;

		bodyModel[211].addShapeBox(0F, -0.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 219
		bodyModel[211].setRotationPoint(0F, -24.5F, -10.5F);

		bodyModel[212].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[212].setRotationPoint(-0.4F, -30F, -7.5F);

		bodyModel[213].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[213].setRotationPoint(-0.4F, -33.25F, -7F);

		bodyModel[214].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 222
		bodyModel[214].setRotationPoint(2F, -29F, -4.25F);

		bodyModel[215].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 223
		bodyModel[215].setRotationPoint(2F, -29F, -5.25F);

		bodyModel[216].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 224
		bodyModel[216].setRotationPoint(1.5F, -32.5F, -4.5F);

		bodyModel[217].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 225
		bodyModel[217].setRotationPoint(1.5F, -32.5F, -3.5F);

		bodyModel[218].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 226
		bodyModel[218].setRotationPoint(-2.5F, -32.5F, -3.5F);

		bodyModel[219].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 227
		bodyModel[219].setRotationPoint(-2.5F, -32.5F, -4.5F);

		bodyModel[220].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 228
		bodyModel[220].setRotationPoint(-3F, -29F, -5.25F);

		bodyModel[221].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 229
		bodyModel[221].setRotationPoint(-3F, -29F, -4.25F);

		bodyModel[222].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 230
		bodyModel[222].setRotationPoint(0.3F, -17.6F, -10.2F);

		bodyModel[223].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 231
		bodyModel[223].setRotationPoint(1F, -14.25F, -10.2F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 231
		bodyModel[224].setRotationPoint(-1F, -42F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 232
		bodyModel[225].setRotationPoint(2F, -42F, -2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, -1F); // Box 233
		bodyModel[226].setRotationPoint(-2F, -42F, -2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 234
		bodyModel[227].setRotationPoint(-7F, -42F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, -4.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -4.5F, -0.5F, -0.25F); // Box 235
		bodyModel[228].setRotationPoint(-6F, -41.5F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1.25F, -0.25F, -0.25F); // Box 236
		bodyModel[229].setRotationPoint(-8F, -48.5F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 237
		bodyModel[230].setRotationPoint(-8.2F, -54.5F, -0.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[231].setRotationPoint(0.25F, -45F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 239
		bodyModel[232].setRotationPoint(0.25F, -47F, -0.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 240
		bodyModel[233].setRotationPoint(1F, -47.25F, 0.5F);
		bodyModel[233].rotateAngleX = 4.71238898F;

		bodyModel[234].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 241
		bodyModel[234].setRotationPoint(1.75F, -47.5F, 0F);
		bodyModel[234].rotateAngleX = 1.57079633F;

		bodyModel[235].addShapeBox(0F, -3.5F, -0.5F, 1, 3, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 242
		bodyModel[235].setRotationPoint(1.75F, -47.5F, 0F);
		bodyModel[235].rotateAngleX = 1.57079633F;

		bodyModel[236].addShapeBox(0F, 0.5F, -0.5F, 1, 4, 2, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 243
		bodyModel[236].setRotationPoint(1.75F, -47.5F, 0F);
		bodyModel[236].rotateAngleX = 1.57079633F;

		bodyModel[237].addShapeBox(0F, -5F, -6F, 1, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[237].setRotationPoint(-17F, -35.25F, 0F);
		bodyModel[237].rotateAngleZ = -0.27925268F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 245
		bodyModel[238].setRotationPoint(124.75F, -19F, -0.5F);

		bodyModel[239].addShapeBox(0F, -0.5F, 0F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 246
		bodyModel[239].setRotationPoint(-124.5F, -9F, -0.5F);
		bodyModel[239].rotateAngleZ = 0.15707963F;

		bodyModel[240].addShapeBox(-5.2F, -0.45F, 0F, 12, 8, 1, 0F,-0.4F, 0F, -0.45F, -6.4F, 0F, -0.45F, -6.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, -4.5F, -0.45F, -6.4F, -4.5F, -0.45F, -6.4F, -4.5F, -0.45F, -0.4F, -4.5F, -0.45F); // Box 247
		bodyModel[240].setRotationPoint(-124.5F, -9F, -0.5F);
		bodyModel[240].rotateAngleZ = 0.15707963F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[241].setRotationPoint(-116.5F, -2.15F, -7.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F); // Box 311
		bodyModel[242].setRotationPoint(-119.5F, -2.15F, -7.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F); // Box 312
		bodyModel[243].setRotationPoint(-102.5F, -2.15F, -7.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F); // Box 251
		bodyModel[244].setRotationPoint(0.25F, -58.3F, -10F);

		bodyModel[245].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 252
		bodyModel[245].setRotationPoint(1F, -41F, -9.9F);
		bodyModel[245].rotateAngleY = -0.15707963F;
		bodyModel[245].rotateAngleZ = 0.75049158F;

		bodyModel[246].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 253
		bodyModel[246].setRotationPoint(1F, -41F, -7F);
		bodyModel[246].rotateAngleY = -0.15707963F;
		bodyModel[246].rotateAngleZ = 0.75049158F;

		bodyModel[247].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 254
		bodyModel[247].setRotationPoint(1F, -41F, -8.5F);
		bodyModel[247].rotateAngleY = -0.15707963F;
		bodyModel[247].rotateAngleZ = 0.75049158F;

		bodyModel[248].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 22.5F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22.5F, -0.4F); // Box 255
		bodyModel[248].setRotationPoint(0.25F, -41F, -8.9F);
		bodyModel[248].rotateAngleY = -0.17453293F;
		bodyModel[248].rotateAngleZ = -0.86393798F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[249].setRotationPoint(25F, -17.45F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[250].setRotationPoint(25.5F, -18F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[251].setRotationPoint(25F, -17.45F, 8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[252].setRotationPoint(25.5F, -18F, 7F);

		bodyModel[253].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F); // Box 262
		bodyModel[253].setRotationPoint(24F, -30F, -8F);

		bodyModel[254].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 263
		bodyModel[254].setRotationPoint(-49F, -24F, -3.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -5.25F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -5.25F, -0.5F, 0F); // Box 334
		bodyModel[255].setRotationPoint(-5.75F, -21.85F, 6.75F);

		bodyModel[256].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 335
		bodyModel[256].setRotationPoint(1.75F, -24.5F, 9.5F);
		bodyModel[256].rotateAngleX = 1.57079633F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 336
		bodyModel[257].setRotationPoint(1F, -24.1F, 9F);
		bodyModel[257].rotateAngleX = 4.71238898F;

		bodyModel[258].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 337
		bodyModel[258].setRotationPoint(1.75F, -24.5F, 9.5F);
		bodyModel[258].rotateAngleX = 1.57079633F;

		bodyModel[259].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 338
		bodyModel[259].setRotationPoint(1.75F, -24.5F, 9.5F);
		bodyModel[259].rotateAngleX = 1.57079633F;

		bodyModel[260].addShapeBox(0F, -0.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 339
		bodyModel[260].setRotationPoint(0F, -24.5F, 9.5F);

		bodyModel[261].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[261].setRotationPoint(-0.4F, -30F, 3.5F);

		bodyModel[262].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[262].setRotationPoint(-0.4F, -33.25F, 3F);

		bodyModel[263].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 342
		bodyModel[263].setRotationPoint(2F, -29F, 2.25F);

		bodyModel[264].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 343
		bodyModel[264].setRotationPoint(2F, -29F, 4.25F);

		bodyModel[265].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 344
		bodyModel[265].setRotationPoint(1.5F, -32.5F, 3.5F);

		bodyModel[266].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 345
		bodyModel[266].setRotationPoint(1.5F, -32.5F, 1.5F);

		bodyModel[267].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 346
		bodyModel[267].setRotationPoint(-2.5F, -32.5F, 1.5F);

		bodyModel[268].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 347
		bodyModel[268].setRotationPoint(-2.5F, -32.5F, 3.5F);

		bodyModel[269].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 348
		bodyModel[269].setRotationPoint(-3F, -29F, 4.25F);

		bodyModel[270].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 2, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F); // Box 349
		bodyModel[270].setRotationPoint(-3F, -29F, 2.25F);

		bodyModel[271].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 350
		bodyModel[271].setRotationPoint(0.3F, -17.6F, 6.2F);

		bodyModel[272].addShapeBox(0F, -0.5F, -0.5F, 2, 2, 4, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 351
		bodyModel[272].setRotationPoint(1F, -14.25F, 6.2F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 352
		bodyModel[273].setRotationPoint(-22.5F, -17.75F, 6.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 353
		bodyModel[274].setRotationPoint(-21.2F, -19F, 7.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[275].setRotationPoint(-21.2F, -20F, 7.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 355
		bodyModel[276].setRotationPoint(-21.2F, -21.7F, 7.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 356
		bodyModel[277].setRotationPoint(-31F, -7F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 357
		bodyModel[278].setRotationPoint(-30.5F, -8F, -16F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 358
		bodyModel[279].setRotationPoint(-30.5F, -8.35F, -16F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 359
		bodyModel[280].setRotationPoint(-30.5F, -7.65F, -16F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 360
		bodyModel[281].setRotationPoint(-29.5F, -7.65F, -16F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 361
		bodyModel[282].setRotationPoint(-29.5F, -8.35F, -16F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 362
		bodyModel[283].setRotationPoint(-29.5F, -8F, -16F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 363
		bodyModel[284].setRotationPoint(-28.5F, -7.65F, -16F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 364
		bodyModel[285].setRotationPoint(-28.5F, -8.35F, -16F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 365
		bodyModel[286].setRotationPoint(-28.5F, -8F, -16F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 366
		bodyModel[287].setRotationPoint(-31.5F, -7.65F, -16F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 367
		bodyModel[288].setRotationPoint(-31.5F, -8.35F, -16F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 368
		bodyModel[289].setRotationPoint(-31.5F, -8F, -16F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.35F, -0.25F, 0F, -0.35F, -0.25F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 369
		bodyModel[290].setRotationPoint(-32.5F, -7.65F, -16F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 370
		bodyModel[291].setRotationPoint(-32.5F, -8.35F, -16F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 371
		bodyModel[292].setRotationPoint(-32.5F, -8F, -16F);

		bodyModel[293].addShapeBox(-4F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[293].setRotationPoint(27F, -8F, 6F);

		bodyModel[294].addShapeBox(-4F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[294].setRotationPoint(37F, -8F, 6F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 393
		bodyModel[295].setRotationPoint(-17F, -10.25F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F); // Box 394
		bodyModel[296].setRotationPoint(-20F, -10.25F, 6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[297].setRotationPoint(-76F, -7.25F, 9.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[298].setRotationPoint(-76.9F, -8.25F, 8.95F);
		bodyModel[298].rotateAngleZ = -0.15707963F;

		bodyModel[299].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 397
		bodyModel[299].setRotationPoint(1F, -41F, 9F);
		bodyModel[299].rotateAngleY = 0.15707963F;
		bodyModel[299].rotateAngleZ = 0.75049158F;

		bodyModel[300].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 398
		bodyModel[300].setRotationPoint(1F, -41F, 7.5F);
		bodyModel[300].rotateAngleY = 0.15707963F;
		bodyModel[300].rotateAngleZ = 0.75049158F;

		bodyModel[301].addShapeBox(-0.5F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F, -0.4F, 34F, -0.4F); // Box 399
		bodyModel[301].setRotationPoint(1F, -41F, 6.1F);
		bodyModel[301].rotateAngleY = 0.15707963F;
		bodyModel[301].rotateAngleZ = 0.75049158F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F); // Box 400
		bodyModel[302].setRotationPoint(0.25F, -58.3F, 9F);

		bodyModel[303].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F); // Box 401
		bodyModel[303].setRotationPoint(24F, -30F, 7F);

		bodyModel[304].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 402
		bodyModel[304].setRotationPoint(-49F, -24F, 2.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 156
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 372
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 373
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 374
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 375
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 376
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 377
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 386
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 387
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 388
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 389
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 390
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 391
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 392

		bodyDoorOpenModel[0].addShapeBox(-4F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyDoorOpenModel[0].setRotationPoint(37.5F, -11F, -12F);

		bodyDoorOpenModel[1].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyDoorOpenModel[1].setRotationPoint(25F, -8F, -12.5F);
		bodyDoorOpenModel[1].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[2].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 373
		bodyDoorOpenModel[2].setRotationPoint(25F, -8F, -12.5F);
		bodyDoorOpenModel[2].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[3].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyDoorOpenModel[3].setRotationPoint(25F, -8F, -12.5F);
		bodyDoorOpenModel[3].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[4].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 375
		bodyDoorOpenModel[4].setRotationPoint(25F, -8F, -8.5F);
		bodyDoorOpenModel[4].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[5].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyDoorOpenModel[5].setRotationPoint(25F, -8F, -8.5F);
		bodyDoorOpenModel[5].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[6].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyDoorOpenModel[6].setRotationPoint(25F, -8F, -8.5F);
		bodyDoorOpenModel[6].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[7].addShapeBox(-4F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyDoorOpenModel[7].setRotationPoint(37.5F, -11F, 7F);

		bodyDoorOpenModel[8].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyDoorOpenModel[8].setRotationPoint(25F, -8F, 9.5F);
		bodyDoorOpenModel[8].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[9].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 388
		bodyDoorOpenModel[9].setRotationPoint(25F, -8F, 9.5F);
		bodyDoorOpenModel[9].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[10].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyDoorOpenModel[10].setRotationPoint(25F, -8F, 9.5F);
		bodyDoorOpenModel[10].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[11].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 390
		bodyDoorOpenModel[11].setRotationPoint(25F, -8F, 5.5F);
		bodyDoorOpenModel[11].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[12].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyDoorOpenModel[12].setRotationPoint(25F, -8F, 5.5F);
		bodyDoorOpenModel[12].rotateAngleZ = 0.20943951F;

		bodyDoorOpenModel[13].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyDoorOpenModel[13].setRotationPoint(25F, -8F, 5.5F);
		bodyDoorOpenModel[13].rotateAngleZ = 0.20943951F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 148
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 149
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 150
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 151
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 152
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 153
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 378
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 379
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 380
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 381
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 382
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 383

		bodyDoorCloseModel[0].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyDoorCloseModel[0].setRotationPoint(25F, -8F, -12.5F);

		bodyDoorCloseModel[1].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyDoorCloseModel[1].setRotationPoint(25F, -8F, -12.5F);

		bodyDoorCloseModel[2].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		bodyDoorCloseModel[2].setRotationPoint(25F, -8F, -12.5F);

		bodyDoorCloseModel[3].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 151
		bodyDoorCloseModel[3].setRotationPoint(25F, -8F, -8.5F);

		bodyDoorCloseModel[4].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyDoorCloseModel[4].setRotationPoint(25F, -8F, -8.5F);

		bodyDoorCloseModel[5].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyDoorCloseModel[5].setRotationPoint(25F, -8F, -8.5F);

		bodyDoorCloseModel[6].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyDoorCloseModel[6].setRotationPoint(25F, -8F, 9.5F);

		bodyDoorCloseModel[7].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyDoorCloseModel[7].setRotationPoint(25F, -8F, 9.5F);

		bodyDoorCloseModel[8].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 380
		bodyDoorCloseModel[8].setRotationPoint(25F, -8F, 9.5F);

		bodyDoorCloseModel[9].addShapeBox(-4F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 381
		bodyDoorCloseModel[9].setRotationPoint(25F, -8F, 5.5F);

		bodyDoorCloseModel[10].addShapeBox(-4F, -2F, 0F, 18, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyDoorCloseModel[10].setRotationPoint(25F, -8F, 5.5F);

		bodyDoorCloseModel[11].addShapeBox(-4F, -1F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyDoorCloseModel[11].setRotationPoint(25F, -8F, 5.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[11];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 259
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 260
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 261
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 262
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 263
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 264
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 267
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 268
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 269
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 270
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 271

		gun_2_Model[0][0].addShapeBox(-4F, 3.5F, -0.5F, 3, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 259

		gun_2_Model[0][1].addShapeBox(-1F, 3.5F, -0.5F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 260

		gun_2_Model[0][2].addShapeBox(-4F, 3F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 261

		gun_2_Model[0][3].addShapeBox(-4F, 2F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 262

		gun_2_Model[0][4].addShapeBox(-4F, 1F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 263

		gun_2_Model[0][5].addShapeBox(-4F, 0.5F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 264

		gun_2_Model[0][6].addShapeBox(-1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 267

		gun_2_Model[0][7].addShapeBox(1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 268

		gun_2_Model[0][8].addShapeBox(1F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269

		gun_2_Model[0][9].addShapeBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F,-1.1F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.1F, -0.75F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0F); // Box 270

		gun_2_Model[0][10].addShapeBox(0.75F, -0.5F, -4F, 1, 1, 8, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 271

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(71.7F, -16.9F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[30];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 276
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 277
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 279
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 280
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 282
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 283
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 284
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 285
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 286
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 287
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 289
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 290
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 291
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 292
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 293
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 43
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 44
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 45
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 46
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 47
		gun_2_Model[1][20] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 48
		gun_2_Model[1][21] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 49
		gun_2_Model[1][22] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 51
		gun_2_Model[1][23] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 52
		gun_2_Model[1][24] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 53
		gun_2_Model[1][25] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 54
		gun_2_Model[1][26] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 55
		gun_2_Model[1][27] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 56
		gun_2_Model[1][28] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 57
		gun_2_Model[1][29] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 58

		gun_2_Model[1][0].addShapeBox(-2.25F, 1F, -3.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 276

		gun_2_Model[1][1].addShapeBox(1F, 1F, -3.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 277

		gun_2_Model[1][2].addShapeBox(10F, 1F, -3.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 279

		gun_2_Model[1][3].addShapeBox(8F, 1F, -3.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 280

		gun_2_Model[1][4].addShapeBox(-2.25F, 0F, -2.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 282

		gun_2_Model[1][5].addShapeBox(-2.25F, 0F, -4.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 283

		gun_2_Model[1][6].addShapeBox(2F, 0.5F, -4.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 284

		gun_2_Model[1][7].addShapeBox(2.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 285

		gun_2_Model[1][8].addShapeBox(2.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 286

		gun_2_Model[1][9].addShapeBox(2F, 0.5F, -2.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 287

		gun_2_Model[1][10].addShapeBox(2.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 289

		gun_2_Model[1][11].addShapeBox(9.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 290

		gun_2_Model[1][12].addShapeBox(9.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 291

		gun_2_Model[1][13].addShapeBox(9.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 292

		gun_2_Model[1][14].addShapeBox(9.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 293

		gun_2_Model[1][15].addShapeBox(-2.25F, 1F, 2.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 43

		gun_2_Model[1][16].addShapeBox(1F, 1F, 2.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 44

		gun_2_Model[1][17].addShapeBox(10F, 1F, 2.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 45

		gun_2_Model[1][18].addShapeBox(8F, 1F, 2.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 46

		gun_2_Model[1][19].addShapeBox(-2.25F, 0F, 3.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 47

		gun_2_Model[1][20].addShapeBox(-2.25F, 0F, 1.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 48

		gun_2_Model[1][21].addShapeBox(2F, 0.5F, 1.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 49

		gun_2_Model[1][22].addShapeBox(2.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 51

		gun_2_Model[1][23].addShapeBox(2F, 0.5F, 3.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 52

		gun_2_Model[1][24].addShapeBox(2.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 53

		gun_2_Model[1][25].addShapeBox(2.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 54

		gun_2_Model[1][26].addShapeBox(9.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 55

		gun_2_Model[1][27].addShapeBox(9.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 56

		gun_2_Model[1][28].addShapeBox(9.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 57

		gun_2_Model[1][29].addShapeBox(9.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 58

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(71.7F, -16.9F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[4];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 272
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 273
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 274
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 275

		gun_2_Model[2][0].addShapeBox(0.75F, 0F, -3.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 272

		gun_2_Model[2][1].addShapeBox(-2.25F, 0F, -3.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 273

		gun_2_Model[2][2].addShapeBox(-2.25F, 0F, 2.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 274

		gun_2_Model[2][3].addShapeBox(0.75F, 0F, 2.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 275

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(71.7F, -16.9F, 0F);
		}


		registerGunModel("VolnaFront", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[11];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 259
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 260
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 261
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 262
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 263
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 264
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 267
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 268
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 269
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 270
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 271

		gun_3_Model[0][0].addShapeBox(-4F, 3.5F, -0.5F, 3, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 259

		gun_3_Model[0][1].addShapeBox(-1F, 3.5F, -0.5F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 260

		gun_3_Model[0][2].addShapeBox(-4F, 3F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 261

		gun_3_Model[0][3].addShapeBox(-4F, 2F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 262

		gun_3_Model[0][4].addShapeBox(-4F, 1F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 263

		gun_3_Model[0][5].addShapeBox(-4F, 0.5F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 264

		gun_3_Model[0][6].addShapeBox(-1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 267

		gun_3_Model[0][7].addShapeBox(1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 268

		gun_3_Model[0][8].addShapeBox(1F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269

		gun_3_Model[0][9].addShapeBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F,-1.1F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.1F, -0.75F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0F); // Box 270

		gun_3_Model[0][10].addShapeBox(0.75F, -0.5F, -4F, 1, 1, 8, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 271

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-65.7F, -16.9F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[30];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 276
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 277
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 279
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 280
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 282
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 283
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 284
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 285
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 286
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 287
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 289
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 290
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 291
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 292
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 293
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 43
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 44
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 45
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 46
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 47
		gun_3_Model[1][20] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 48
		gun_3_Model[1][21] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 49
		gun_3_Model[1][22] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 51
		gun_3_Model[1][23] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 52
		gun_3_Model[1][24] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 53
		gun_3_Model[1][25] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 54
		gun_3_Model[1][26] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 55
		gun_3_Model[1][27] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 56
		gun_3_Model[1][28] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 57
		gun_3_Model[1][29] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 58

		gun_3_Model[1][0].addShapeBox(-2.25F, 1F, -3.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 276

		gun_3_Model[1][1].addShapeBox(1F, 1F, -3.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 277

		gun_3_Model[1][2].addShapeBox(10F, 1F, -3.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 279

		gun_3_Model[1][3].addShapeBox(8F, 1F, -3.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 280

		gun_3_Model[1][4].addShapeBox(-2.25F, 0F, -2.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 282

		gun_3_Model[1][5].addShapeBox(-2.25F, 0F, -4.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 283

		gun_3_Model[1][6].addShapeBox(2F, 0.5F, -4.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 284

		gun_3_Model[1][7].addShapeBox(2.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 285

		gun_3_Model[1][8].addShapeBox(2.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 286

		gun_3_Model[1][9].addShapeBox(2F, 0.5F, -2.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 287

		gun_3_Model[1][10].addShapeBox(2.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 289

		gun_3_Model[1][11].addShapeBox(9.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 290

		gun_3_Model[1][12].addShapeBox(9.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 291

		gun_3_Model[1][13].addShapeBox(9.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 292

		gun_3_Model[1][14].addShapeBox(9.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 293

		gun_3_Model[1][15].addShapeBox(-2.25F, 1F, 2.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 43

		gun_3_Model[1][16].addShapeBox(1F, 1F, 2.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 44

		gun_3_Model[1][17].addShapeBox(10F, 1F, 2.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 45

		gun_3_Model[1][18].addShapeBox(8F, 1F, 2.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 46

		gun_3_Model[1][19].addShapeBox(-2.25F, 0F, 3.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 47

		gun_3_Model[1][20].addShapeBox(-2.25F, 0F, 1.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 48

		gun_3_Model[1][21].addShapeBox(2F, 0.5F, 1.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 49

		gun_3_Model[1][22].addShapeBox(2.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 51

		gun_3_Model[1][23].addShapeBox(2F, 0.5F, 3.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 52

		gun_3_Model[1][24].addShapeBox(2.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 53

		gun_3_Model[1][25].addShapeBox(2.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 54

		gun_3_Model[1][26].addShapeBox(9.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 55

		gun_3_Model[1][27].addShapeBox(9.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 56

		gun_3_Model[1][28].addShapeBox(9.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 57

		gun_3_Model[1][29].addShapeBox(9.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 58

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-65.7F, -16.9F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[4];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 272
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 273
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 274
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 275

		gun_3_Model[2][0].addShapeBox(0.75F, 0F, -3.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 272

		gun_3_Model[2][1].addShapeBox(-2.25F, 0F, -3.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 273

		gun_3_Model[2][2].addShapeBox(-2.25F, 0F, 2.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 274

		gun_3_Model[2][3].addShapeBox(0.75F, 0F, 2.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 275

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-65.7F, -16.9F, 0F);
		}


		registerGunModel("VolnaRear", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[7];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 245
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 246
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 247
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 248
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 249
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 250
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 251

		gun_4_Model[0][0].addShapeBox(1F, 1.5F, -3.5F, 2, 1, 7, 0F,-0.5F, 1F, 0.25F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -0.5F, 1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0.25F); // Box 245

		gun_4_Model[0][1].addShapeBox(-1F, 0.5F, -3.5F, 2, 2, 7, 0F,0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 246

		gun_4_Model[0][2].addShapeBox(-2F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 247

		gun_4_Model[0][3].addShapeBox(-4F, 0.5F, -3.5F, 1, 2, 7, 0F,0.75F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.75F, 0.5F, -0.5F, 0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 248

		gun_4_Model[0][4].addShapeBox(-3F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 0.5F, 0F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F); // Box 249

		gun_4_Model[0][5].addShapeBox(-4F, -1F, -3.5F, 2, 1, 7, 0F,0.75F, -0.25F, -1.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 250

		gun_4_Model[0][6].addShapeBox(-4F, -1.7F, -2.5F, 3, 1, 5, 0F,-2.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 0.75F, -0.05F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, -0.05F, -0.25F); // Box 251

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-42F, -13.5F, 9.5F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 264
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 265

		gun_4_Model[1][0].addShapeBox(3F, -0.5F, -0.05F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 264

		gun_4_Model[1][1].addShapeBox(3F, -0.5F, -0.95F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 265

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-42F, -13.5F, 9.5F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[14];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 252
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 253
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 254
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 255
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 256
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 257
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 258
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 259
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 260
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 261
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 262
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 263
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 266
		gun_4_Model[2][13] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 267

		gun_4_Model[2][0].addShapeBox(-2.5F, -1F, -1F, 5, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 252

		gun_4_Model[2][1].addShapeBox(-2.5F, -2F, -1F, 5, 1, 2, 0F,-1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 253

		gun_4_Model[2][2].addShapeBox(-2.5F, 1F, -1F, 5, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F); // Box 254

		gun_4_Model[2][3].addShapeBox(-2.5F, -2F, -3F, 5, 1, 2, 0F,-1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, -1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F); // Box 255

		gun_4_Model[2][4].addShapeBox(-2.5F, 1F, -3F, 5, 1, 2, 0F,-0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.6F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F); // Box 256

		gun_4_Model[2][5].addShapeBox(-2.5F, -1F, -3F, 5, 2, 2, 0F,-0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Box 257

		gun_4_Model[2][6].addShapeBox(-2.5F, -2F, 1F, 5, 1, 2, 0F,-1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F); // Box 258

		gun_4_Model[2][7].addShapeBox(-2.5F, 1F, 1F, 5, 1, 2, 0F,0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0F, -0.5F, -1.6F, 0F, -0.5F); // Box 259

		gun_4_Model[2][8].addShapeBox(-2.5F, -1F, 1F, 5, 2, 2, 0F,0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 260

		gun_4_Model[2][9].addShapeBox(1.7F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 261

		gun_4_Model[2][10].addShapeBox(2F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 262

		gun_4_Model[2][11].addShapeBox(2F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 263

		gun_4_Model[2][12].addShapeBox(3F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 266

		gun_4_Model[2][13].addShapeBox(3F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 267

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-42F, -13.5F, 9.5F);
		}


		registerGunModel("AK725Left", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[7];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 245
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 246
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 247
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 248
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 249
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 250
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 251

		gun_5_Model[0][0].addShapeBox(1F, 1.5F, -3.5F, 2, 1, 7, 0F,-0.5F, 1F, 0.25F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -0.5F, 1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0.25F); // Box 245

		gun_5_Model[0][1].addShapeBox(-1F, 0.5F, -3.5F, 2, 2, 7, 0F,0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 246

		gun_5_Model[0][2].addShapeBox(-2F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 247

		gun_5_Model[0][3].addShapeBox(-4F, 0.5F, -3.5F, 1, 2, 7, 0F,0.75F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.75F, 0.5F, -0.5F, 0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 248

		gun_5_Model[0][4].addShapeBox(-3F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 0.5F, 0F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F); // Box 249

		gun_5_Model[0][5].addShapeBox(-4F, -1F, -3.5F, 2, 1, 7, 0F,0.75F, -0.25F, -1.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 250

		gun_5_Model[0][6].addShapeBox(-4F, -1.7F, -2.5F, 3, 1, 5, 0F,-2.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 0.75F, -0.05F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, -0.05F, -0.25F); // Box 251

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-42F, -13.5F, -9.5F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 264
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 265

		gun_5_Model[1][0].addShapeBox(3F, -0.5F, -0.05F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 264

		gun_5_Model[1][1].addShapeBox(3F, -0.5F, -0.95F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 265

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-42F, -13.5F, -9.5F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[14];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 252
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 253
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 254
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 255
		gun_5_Model[2][4] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 256
		gun_5_Model[2][5] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 257
		gun_5_Model[2][6] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 258
		gun_5_Model[2][7] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 259
		gun_5_Model[2][8] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 260
		gun_5_Model[2][9] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 261
		gun_5_Model[2][10] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 262
		gun_5_Model[2][11] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 263
		gun_5_Model[2][12] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 266
		gun_5_Model[2][13] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 267

		gun_5_Model[2][0].addShapeBox(-2.5F, -1F, -1F, 5, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 252

		gun_5_Model[2][1].addShapeBox(-2.5F, -2F, -1F, 5, 1, 2, 0F,-1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 253

		gun_5_Model[2][2].addShapeBox(-2.5F, 1F, -1F, 5, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F); // Box 254

		gun_5_Model[2][3].addShapeBox(-2.5F, -2F, -3F, 5, 1, 2, 0F,-1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, -1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F); // Box 255

		gun_5_Model[2][4].addShapeBox(-2.5F, 1F, -3F, 5, 1, 2, 0F,-0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.6F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F); // Box 256

		gun_5_Model[2][5].addShapeBox(-2.5F, -1F, -3F, 5, 2, 2, 0F,-0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Box 257

		gun_5_Model[2][6].addShapeBox(-2.5F, -2F, 1F, 5, 1, 2, 0F,-1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F); // Box 258

		gun_5_Model[2][7].addShapeBox(-2.5F, 1F, 1F, 5, 1, 2, 0F,0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0F, -0.5F, -1.6F, 0F, -0.5F); // Box 259

		gun_5_Model[2][8].addShapeBox(-2.5F, -1F, 1F, 5, 2, 2, 0F,0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 260

		gun_5_Model[2][9].addShapeBox(1.7F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 261

		gun_5_Model[2][10].addShapeBox(2F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 262

		gun_5_Model[2][11].addShapeBox(2F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 263

		gun_5_Model[2][12].addShapeBox(3F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 266

		gun_5_Model[2][13].addShapeBox(3F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 267

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(-42F, -13.5F, -9.5F);
		}


		registerGunModel("AK725Right", gun_5_Model);
	}
}