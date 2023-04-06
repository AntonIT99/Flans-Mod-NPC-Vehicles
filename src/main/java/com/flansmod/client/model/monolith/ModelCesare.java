//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Cesare
// Model Creator: 
// Created on: 22.07.2020 - 16:37:26
// Last changed on: 22.07.2020 - 16:37:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCesare extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCesare() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[359];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 97
		bodyModel[33] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 98
		bodyModel[34] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 99
		bodyModel[35] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 100
		bodyModel[36] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 101
		bodyModel[37] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 102
		bodyModel[38] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 103
		bodyModel[39] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 104
		bodyModel[40] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 105
		bodyModel[41] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 106
		bodyModel[42] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 107
		bodyModel[43] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 109
		bodyModel[45] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 110
		bodyModel[46] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 111
		bodyModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		bodyModel[48] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 114
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 115
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 117
		bodyModel[51] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 88
		bodyModel[52] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 105
		bodyModel[53] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 106
		bodyModel[54] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 104
		bodyModel[64] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 107
		bodyModel[65] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 109
		bodyModel[67] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 161
		bodyModel[68] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 162
		bodyModel[69] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 163
		bodyModel[70] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 164
		bodyModel[71] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 165
		bodyModel[72] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 166
		bodyModel[73] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 167
		bodyModel[74] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 168
		bodyModel[75] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 169
		bodyModel[76] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 170
		bodyModel[77] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 171
		bodyModel[78] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 172
		bodyModel[79] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 173
		bodyModel[80] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 174
		bodyModel[81] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 175
		bodyModel[82] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 176
		bodyModel[83] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 181
		bodyModel[84] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 182
		bodyModel[85] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 183
		bodyModel[86] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 184
		bodyModel[87] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 185
		bodyModel[88] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 186
		bodyModel[89] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 187
		bodyModel[90] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 188
		bodyModel[91] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 189
		bodyModel[92] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 190
		bodyModel[93] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 191
		bodyModel[94] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 192
		bodyModel[95] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 193
		bodyModel[96] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 194
		bodyModel[97] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 195
		bodyModel[98] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 196
		bodyModel[99] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 197
		bodyModel[100] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 198
		bodyModel[101] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 199
		bodyModel[102] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 200
		bodyModel[103] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 201
		bodyModel[104] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 202
		bodyModel[105] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 203
		bodyModel[106] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 204
		bodyModel[107] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 205
		bodyModel[108] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 206
		bodyModel[109] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 207
		bodyModel[110] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 208
		bodyModel[111] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 209
		bodyModel[112] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 210
		bodyModel[113] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 211
		bodyModel[114] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 212
		bodyModel[115] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 213
		bodyModel[116] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 214
		bodyModel[117] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 215
		bodyModel[118] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 216
		bodyModel[119] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 217
		bodyModel[120] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 218
		bodyModel[121] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 219
		bodyModel[122] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 220
		bodyModel[123] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 221
		bodyModel[124] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 222
		bodyModel[125] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 223
		bodyModel[126] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 224
		bodyModel[127] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 225
		bodyModel[128] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 226
		bodyModel[129] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 227
		bodyModel[130] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 228
		bodyModel[131] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 229
		bodyModel[132] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 230
		bodyModel[133] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 231
		bodyModel[134] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 232
		bodyModel[135] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 233
		bodyModel[136] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 234
		bodyModel[137] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 235
		bodyModel[138] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 236
		bodyModel[139] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 237
		bodyModel[140] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 238
		bodyModel[141] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 239
		bodyModel[142] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 240
		bodyModel[143] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 241
		bodyModel[144] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 242
		bodyModel[145] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 243
		bodyModel[146] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 244
		bodyModel[147] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 245
		bodyModel[148] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 246
		bodyModel[149] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 247
		bodyModel[150] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 248
		bodyModel[151] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 249
		bodyModel[152] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 250
		bodyModel[153] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 251
		bodyModel[154] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 252
		bodyModel[155] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 253
		bodyModel[156] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 254
		bodyModel[157] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 255
		bodyModel[158] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 256
		bodyModel[159] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 257
		bodyModel[160] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 258
		bodyModel[161] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 259
		bodyModel[162] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 260
		bodyModel[163] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Box 261
		bodyModel[164] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 262
		bodyModel[165] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 263
		bodyModel[166] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 264
		bodyModel[167] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Box 265
		bodyModel[168] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 266
		bodyModel[169] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 267
		bodyModel[170] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Box 268
		bodyModel[171] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 269
		bodyModel[172] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 270
		bodyModel[173] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Box 271
		bodyModel[174] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 272
		bodyModel[175] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 273
		bodyModel[176] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 274
		bodyModel[177] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Box 275
		bodyModel[178] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 276
		bodyModel[179] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 277
		bodyModel[180] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 278
		bodyModel[181] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 279
		bodyModel[182] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 280
		bodyModel[183] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 281
		bodyModel[184] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 282
		bodyModel[185] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 283
		bodyModel[186] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 284
		bodyModel[187] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 285
		bodyModel[188] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 286
		bodyModel[189] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 287
		bodyModel[190] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 288
		bodyModel[191] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 289
		bodyModel[192] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 290
		bodyModel[193] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 291
		bodyModel[194] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 292
		bodyModel[195] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 293
		bodyModel[196] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 294
		bodyModel[197] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 242
		bodyModel[198] = new ModelRendererTurbo(this, 377, 305, textureX, textureY); // Box 243
		bodyModel[199] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 244
		bodyModel[200] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 245
		bodyModel[201] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 246
		bodyModel[202] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 247
		bodyModel[203] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Box 214
		bodyModel[204] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Box 215
		bodyModel[205] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 250
		bodyModel[206] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 251
		bodyModel[207] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 252
		bodyModel[208] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 254
		bodyModel[209] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 255
		bodyModel[210] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 256
		bodyModel[211] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Box 257
		bodyModel[212] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 258
		bodyModel[213] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 259
		bodyModel[214] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 260
		bodyModel[215] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 261
		bodyModel[216] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 262
		bodyModel[217] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 263
		bodyModel[218] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 264
		bodyModel[219] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 265
		bodyModel[220] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 266
		bodyModel[221] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Box 267
		bodyModel[222] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 268
		bodyModel[223] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 269
		bodyModel[224] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 270
		bodyModel[225] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 271
		bodyModel[226] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 272
		bodyModel[227] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Box 273
		bodyModel[228] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Box 274
		bodyModel[229] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 275
		bodyModel[230] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 276
		bodyModel[231] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 277
		bodyModel[232] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 278
		bodyModel[233] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 279
		bodyModel[234] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 280
		bodyModel[235] = new ModelRendererTurbo(this, 121, 321, textureX, textureY); // Box 281
		bodyModel[236] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Box 282
		bodyModel[237] = new ModelRendererTurbo(this, 217, 321, textureX, textureY); // Box 283
		bodyModel[238] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 284
		bodyModel[239] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 285
		bodyModel[240] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 286
		bodyModel[241] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Box 287
		bodyModel[242] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 288
		bodyModel[243] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 289
		bodyModel[244] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 290
		bodyModel[245] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 291
		bodyModel[246] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 292
		bodyModel[247] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 293
		bodyModel[248] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 294
		bodyModel[249] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 295
		bodyModel[250] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 296
		bodyModel[251] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 297
		bodyModel[252] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 298
		bodyModel[253] = new ModelRendererTurbo(this, 33, 329, textureX, textureY); // Box 299
		bodyModel[254] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 300
		bodyModel[255] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 301
		bodyModel[256] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 302
		bodyModel[257] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 303
		bodyModel[258] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 304
		bodyModel[259] = new ModelRendererTurbo(this, 49, 329, textureX, textureY); // Box 305
		bodyModel[260] = new ModelRendererTurbo(this, 129, 329, textureX, textureY); // Box 306
		bodyModel[261] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 307
		bodyModel[262] = new ModelRendererTurbo(this, 73, 329, textureX, textureY); // Box 308
		bodyModel[263] = new ModelRendererTurbo(this, 153, 329, textureX, textureY); // Box 309
		bodyModel[264] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 310
		bodyModel[265] = new ModelRendererTurbo(this, 225, 329, textureX, textureY); // Box 311
		bodyModel[266] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 312
		bodyModel[267] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 313
		bodyModel[268] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 314
		bodyModel[269] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Box 315
		bodyModel[270] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Box 316
		bodyModel[271] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 317
		bodyModel[272] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 318
		bodyModel[273] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 319
		bodyModel[274] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Box 320
		bodyModel[275] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 321
		bodyModel[276] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 322
		bodyModel[277] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 323
		bodyModel[278] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 324
		bodyModel[279] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 325
		bodyModel[280] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 326
		bodyModel[281] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 327
		bodyModel[282] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 328
		bodyModel[283] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 329
		bodyModel[284] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 330
		bodyModel[285] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Box 331
		bodyModel[286] = new ModelRendererTurbo(this, 49, 337, textureX, textureY); // Box 332
		bodyModel[287] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Box 333
		bodyModel[288] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 334
		bodyModel[289] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 335
		bodyModel[290] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 336
		bodyModel[291] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 337
		bodyModel[292] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 338
		bodyModel[293] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 339
		bodyModel[294] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 340
		bodyModel[295] = new ModelRendererTurbo(this, 129, 337, textureX, textureY); // Box 342
		bodyModel[296] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 344
		bodyModel[297] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 345
		bodyModel[298] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 346
		bodyModel[299] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 347
		bodyModel[300] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 348
		bodyModel[301] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 349
		bodyModel[302] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 351
		bodyModel[303] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 352
		bodyModel[304] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 353
		bodyModel[305] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 354
		bodyModel[306] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 355
		bodyModel[307] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Box 356
		bodyModel[308] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 357
		bodyModel[309] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 358
		bodyModel[310] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 359
		bodyModel[311] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 360
		bodyModel[312] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 361
		bodyModel[313] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 362
		bodyModel[314] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Box 363
		bodyModel[315] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Box 364
		bodyModel[316] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Box 365
		bodyModel[317] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 366
		bodyModel[318] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 367
		bodyModel[319] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 368
		bodyModel[320] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 369
		bodyModel[321] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 370
		bodyModel[322] = new ModelRendererTurbo(this, 473, 337, textureX, textureY); // Box 371
		bodyModel[323] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 372
		bodyModel[324] = new ModelRendererTurbo(this, 25, 345, textureX, textureY); // Box 373
		bodyModel[325] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 374
		bodyModel[326] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 375
		bodyModel[327] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 376
		bodyModel[328] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 377
		bodyModel[329] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 378
		bodyModel[330] = new ModelRendererTurbo(this, 153, 345, textureX, textureY); // Box 379
		bodyModel[331] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 380
		bodyModel[332] = new ModelRendererTurbo(this, 177, 345, textureX, textureY); // Box 381
		bodyModel[333] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Box 382
		bodyModel[334] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 383
		bodyModel[335] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 384
		bodyModel[336] = new ModelRendererTurbo(this, 49, 353, textureX, textureY); // Box 385
		bodyModel[337] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 386
		bodyModel[338] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 387
		bodyModel[339] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 388
		bodyModel[340] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 389
		bodyModel[341] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 390
		bodyModel[342] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 391
		bodyModel[343] = new ModelRendererTurbo(this, 97, 353, textureX, textureY); // Box 392
		bodyModel[344] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 393
		bodyModel[345] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 394
		bodyModel[346] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 395
		bodyModel[347] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 396
		bodyModel[348] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 397
		bodyModel[349] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 398
		bodyModel[350] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 399
		bodyModel[351] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 400
		bodyModel[352] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 401
		bodyModel[353] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 402
		bodyModel[354] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Box 403
		bodyModel[355] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 404
		bodyModel[356] = new ModelRendererTurbo(this, 209, 345, textureX, textureY); // Box 405
		bodyModel[357] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 406
		bodyModel[358] = new ModelRendererTurbo(this, 137, 353, textureX, textureY); // Box 407

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 11, 53, 0F,20F, 0F, 0F, 20F, 0F, -1F, 20F, 0F, -1F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-13F, -7F, -26F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 47, 0F,19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -7F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 11, 41, 0F,10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-91F, -7F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 11, 35, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-116F, -7F, -17F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 11, 29, 0F,0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 5
		bodyModel[4].setRotationPoint(-138F, -7F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F,0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F); // Box 6
		bodyModel[5].setRotationPoint(-157F, -7F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 11, 9, 0F,0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F); // Box 7
		bodyModel[6].setRotationPoint(-173F, -7F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 8, 11, 9, 0F,-0.5F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, -3.5F); // Box 8
		bodyModel[7].setRotationPoint(-181F, -7F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 11, 55, 0F,17.5F, 0F, -2F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, -2F, 17.5F, 0F, -1F, 17.5F, 0F, -3F, 17.5F, 0F, -3F, 17.5F, 0F, -1F); // Box 9
		bodyModel[8].setRotationPoint(34.5F, -7F, -27F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 15, 49, 0F,15F, 0F, -1F, 15F, 0F, -3.5F, 15F, 0F, -3.5F, 15F, 0F, -1F, 15F, 0F, 0F, 15F, 0F, -4F, 15F, 0F, -4F, 15F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(72F, -11F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 15, 41, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(88F, -11F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, 6F, 4.5F, 0F, 6.2F, 0F, 0F, 6.2F, 0F, 0F, 6F, 4.5F, 0F, 4.5F, 0F, 0F, 4.5F, -5F, 0F, 4.5F, -5F, 0F, 4.5F, 0F); // Box 13
		bodyModel[11].setRotationPoint(153F, -5.5F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, 6.2F, 5F, 10F, 7F, -1.5F, 10F, 7F, -1.5F, 0F, 6.2F, 5F, 0F, 4.5F, 0F, 1F, 4.5F, -2.5F, 1F, 4.5F, -2.5F, 0F, 4.5F, 0F); // Box 14
		bodyModel[12].setRotationPoint(173F, -5.5F, -2.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 8, 46, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 18
		bodyModel[13].setRotationPoint(53F, -11F, -22.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 46, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
		bodyModel[14].setRotationPoint(49F, -11F, -22.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 8, 48, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 20
		bodyModel[15].setRotationPoint(42F, -11F, -23.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 8, 52, 0F,15F, 0F, 0F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(24F, -11F, -25.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 8, 50, 0F,20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0.5F); // Box 22
		bodyModel[17].setRotationPoint(-13F, -11F, -25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 4, 46, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(-38F, -11F, -22.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 4, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-44F, -11F, -22.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 4, 20, 0F,0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -1F); // Box 25
		bodyModel[20].setRotationPoint(-82F, -11F, -9.5F);

		bodyModel[21].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(96.5F, -10F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[22].setRotationPoint(88F, -10F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(88F, -10F, 2.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 33
		bodyModel[24].setRotationPoint(18F, -10F, -12F);

		bodyModel[25].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[25].setRotationPoint(26.5F, -10F, -14.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[26].setRotationPoint(18F, -10F, -23F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 36
		bodyModel[27].setRotationPoint(-31F, -10F, 18F);

		bodyModel[28].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[28].setRotationPoint(-22.5F, -10F, 15.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[29].setRotationPoint(-31F, -10F, 7F);

		bodyModel[30].addShapeBox(-10F, 0F, -3.5F, 20, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(-81F, -15F, 1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[31].setRotationPoint(-181F, -24F, 0F);
		bodyModel[31].rotateAngleZ = 0.03490659F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 15, 1, 41, 0F,0F, 7F, 0F, 0F, 7F, -3.5F, 0F, 7F, -3.5F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 7F, -8.5F, 0F, 7F, -8.5F, 0F, 7F, -6F); // Box 97
		bodyModel[32].setRotationPoint(88F, 11F, -20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,15F, 7F, 0F, 15F, 7F, -4F, 15F, 7F, -4F, 15F, 7F, 0F, 15F, 7F, -5F, 15F, 7F, -10F, 15F, 7F, -10F, 15F, 7F, -5F); // Box 98
		bodyModel[33].setRotationPoint(72F, 11F, -24F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 55, 0F,17.5F, 7F, -1F, 17.5F, 7F, -3F, 17.5F, 7F, -3F, 17.5F, 7F, -1F, 17.5F, 7F, -6F, 17.5F, 7F, -8F, 17.5F, 7F, -8F, 17.5F, 7F, -6F); // Box 99
		bodyModel[34].setRotationPoint(34.5F, 11F, -27F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 53, 0F,20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F); // Box 100
		bodyModel[35].setRotationPoint(-13F, 11F, -26F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 47, 0F,19F, 7F, 0F, 19F, 7F, 3F, 19F, 7F, 3F, 19F, 7F, 0F, 19F, 7F, -5F, 19F, 7F, -2F, 19F, 7F, -2F, 19F, 7F, -5F); // Box 101
		bodyModel[36].setRotationPoint(-53F, 11F, -23F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 41, 0F,10F, 7F, 0F, 10F, 7F, 3F, 10F, 7F, 3F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -2F, 10F, 7F, -2F, 10F, 7F, -5F); // Box 102
		bodyModel[37].setRotationPoint(-91F, 11F, -20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 22, 1, 25, 0F,0F, 7F, 1F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 7F, 1F, -4F, 6F, -5F, 0F, 7F, 0F, 0F, 7F, 0F, -4F, 6F, -5F); // Box 103
		bodyModel[38].setRotationPoint(-138F, 11F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 1, 35, 0F,0F, 7F, 0F, 0F, 7F, 3F, 0F, 7F, 3F, 0F, 7F, 0F, 0F, 7F, -5F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 7F, -5F); // Box 104
		bodyModel[39].setRotationPoint(-116F, 11F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -1F); // Box 105
		bodyModel[40].setRotationPoint(-173F, 4F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -2F, -3F, 3F, 0F, 2.8F, 3F, 0F, 2.8F, 0F, -2F, -3F); // Box 106
		bodyModel[41].setRotationPoint(-157F, 4F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -1.5F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, -1F, -2F); // Box 107
		bodyModel[42].setRotationPoint(-181F, 4F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 50, 5, 34, 0F,0F, 5F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 5F, 0F, 0F, 5F, -5F, -8F, 4F, -14F, -8F, 4F, -14F, 0F, 5F, -5F); // Box 108
		bodyModel[43].setRotationPoint(103F, 9F, -16.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8F, 0F, -5F, -1F, 1F, -7F, -1F, 1F, -7F, 8F, 0F, -5F); // Box 109
		bodyModel[44].setRotationPoint(153F, 4F, -7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 14, 6, 0F,0F, 0F, 0F, 8F, 0F, -2.5F, 8F, 0F, -2.5F, 0F, 0F, 0F, 1F, 1F, -2F, 2.5F, -2F, -2.8F, 2.5F, -2F, -2.8F, 1F, 1F, -2F); // Box 110
		bodyModel[45].setRotationPoint(173F, 4F, -2.5F);

		bodyModel[46].addShapeBox(-17F, 0F, 0F, 18, 15, 1, 0F,-4.5F, -4F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, -4.5F, -4F, -0.4F, -3F, -1.3F, -0.4F, 0F, -4.3F, -0.4F, 0F, -4.3F, -0.4F, -3F, -1.3F, -0.4F); // Box 111
		bodyModel[46].setRotationPoint(189.5F, -30.5F, 0F);
		bodyModel[46].rotateAngleZ = 0.03490659F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F); // Box 112
		bodyModel[47].setRotationPoint(-56.5F, -64F, 0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F); // Box 114
		bodyModel[48].setRotationPoint(-59F, -66F, 0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[49].setRotationPoint(-59F, -70F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 117
		bodyModel[50].setRotationPoint(190.5F, -31F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 18, 12, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[51].setRotationPoint(31F, -29F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 6, 25, 0F,10F, 4.5F, 4F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 4.5F, 4F, 10F, 4.5F, 0F, 10F, 4.5F, -4.5F, 10F, 4.5F, -4.5F, 10F, 4.5F, 0F); // Box 105
		bodyModel[52].setRotationPoint(136F, -6.5F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 23, 15, 34, 0F,0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 106
		bodyModel[53].setRotationPoint(103F, -11F, -16.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 4, 46, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 95
		bodyModel[54].setRotationPoint(-48F, -11F, -22.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 14, 4, 38, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 96
		bodyModel[55].setRotationPoint(-62F, -11F, -18.5F);

		bodyModel[56].addShapeBox(-10F, 0F, -3.5F, 20, 12, 6, 0F,-6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[56].setRotationPoint(-81F, -15F, -5F);

		bodyModel[57].addShapeBox(-10F, 0F, -3.5F, 20, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F); // Box 98
		bodyModel[57].setRotationPoint(-81F, -15F, 8F);

		bodyModel[58].addShapeBox(-10F, 0F, -3.5F, 20, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F); // Box 99
		bodyModel[58].setRotationPoint(58.5F, -19.5F, 8F);

		bodyModel[59].addShapeBox(-10F, 0F, -3.5F, 20, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[59].setRotationPoint(58.5F, -19.5F, 1F);

		bodyModel[60].addShapeBox(-10F, 0F, -3.5F, 20, 9, 6, 0F,-6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[60].setRotationPoint(58.5F, -19.5F, -5F);

		bodyModel[61].addShapeBox(-10F, 0F, -4F, 21, 4, 6, 0F,-6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[61].setRotationPoint(89.5F, -14.5F, -5F);

		bodyModel[62].addShapeBox(-10F, 0F, -4F, 21, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[62].setRotationPoint(89.5F, -14.5F, 1F);

		bodyModel[63].addShapeBox(-10F, 0F, -3F, 21, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F); // Box 104
		bodyModel[63].setRotationPoint(89.5F, -14.5F, 8F);

		bodyModel[64].addShapeBox(-10F, 0F, -3.5F, 21, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F); // Box 107
		bodyModel[64].setRotationPoint(-113F, -9.5F, 8.5F);

		bodyModel[65].addShapeBox(-10F, 0F, -3F, 21, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[65].setRotationPoint(-113F, -9.5F, 0F);

		bodyModel[66].addShapeBox(-10F, 0F, -3.5F, 21, 3, 6, 0F,-6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[66].setRotationPoint(-113F, -9.5F, -5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 18, 12, 0F,1F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 161
		bodyModel[67].setRotationPoint(35F, -29F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 18, 12, 0F,-1F, 0F, -5F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 162
		bodyModel[68].setRotationPoint(27F, -29F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[69].setRotationPoint(32F, -37F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 164
		bodyModel[70].setRotationPoint(34F, -37F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 8, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 165
		bodyModel[71].setRotationPoint(28F, -37F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[72].setRotationPoint(32F, -42F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,0F, 0F, -1.5F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 167
		bodyModel[73].setRotationPoint(34F, -42F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,1.5F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1.5F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F); // Box 168
		bodyModel[74].setRotationPoint(30F, -42F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[75].setRotationPoint(28.5F, -48F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[76].setRotationPoint(34.5F, -48F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 171
		bodyModel[77].setRotationPoint(32F, -48F, -2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,3.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[78].setRotationPoint(32F, -48F, 2.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, -1.98F, 0F, 0F, 0.5F, -1F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 173
		bodyModel[79].setRotationPoint(34F, -48F, -2.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[80].setRotationPoint(29F, -48F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[81].setRotationPoint(32F, -48F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0.3F, -1F, -3.5F, 0.5F, -1F, 2F, -0.01F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, -3.5F, 0.5F, 0F, 2F, 0F, 0F, -0.5F); // Box 176
		bodyModel[82].setRotationPoint(34F, -48F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[83].setRotationPoint(29F, -48F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 182
		bodyModel[84].setRotationPoint(32F, -48F, 4.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.01F, 0F, -0.5F, 0.5F, -1F, 2F, 0.3F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 2F, 0.3F, 0F, -3.5F, 0F, 0F, 0F); // Box 183
		bodyModel[85].setRotationPoint(34F, -48F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,-0.5F, 0F, 0.5F, 0.5F, -1F, 0.5F, -1.98F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.9F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[86].setRotationPoint(34F, -48F, 2.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[87].setRotationPoint(25F, -31F, -6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[88].setRotationPoint(20F, -31F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 187
		bodyModel[89].setRotationPoint(34F, -31F, -6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 188
		bodyModel[90].setRotationPoint(37F, -31F, -5.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0F); // Box 189
		bodyModel[91].setRotationPoint(39F, -31F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0.5F, 0F, 0.2F, 0.5F, -3F, 0.2F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0F); // Box 190
		bodyModel[92].setRotationPoint(39F, -34.5F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 191
		bodyModel[93].setRotationPoint(37F, -34.5F, -5.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 192
		bodyModel[94].setRotationPoint(34F, -34.5F, -6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 15, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 193
		bodyModel[95].setRotationPoint(31F, -35.5F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, -0.5F, 0.3F, 0.5F, -0.5F, -3F, 0.5F, -0.5F, -3F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0F); // Box 194
		bodyModel[96].setRotationPoint(39F, -36F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 195
		bodyModel[97].setRotationPoint(37F, -36F, -5.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 196
		bodyModel[98].setRotationPoint(34F, -36F, -6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 197
		bodyModel[99].setRotationPoint(27.5F, -35.5F, -5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 198
		bodyModel[100].setRotationPoint(25.5F, -35.5F, -3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[101].setRotationPoint(19.5F, -35.5F, -1.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 200
		bodyModel[102].setRotationPoint(32F, -35.5F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 201
		bodyModel[103].setRotationPoint(32.5F, -30.5F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 202
		bodyModel[104].setRotationPoint(32F, -35.5F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 203
		bodyModel[105].setRotationPoint(32.5F, -30.5F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[106].setRotationPoint(30F, -39F, -6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 205
		bodyModel[107].setRotationPoint(27F, -39F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 206
		bodyModel[108].setRotationPoint(26F, -39F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 207
		bodyModel[109].setRotationPoint(35F, -39F, -6.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 13, 0F,0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 208
		bodyModel[110].setRotationPoint(38F, -39F, -5.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 209
		bodyModel[111].setRotationPoint(40.5F, -39F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 210
		bodyModel[112].setRotationPoint(42F, -39F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 211
		bodyModel[113].setRotationPoint(30F, -39F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 212
		bodyModel[114].setRotationPoint(30F, -39F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F, -0.4F, 10F, -0.4F); // Box 213
		bodyModel[115].setRotationPoint(22.5F, -57.5F, 0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 5, 20, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 214
		bodyModel[116].setRotationPoint(1F, -15.5F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 215
		bodyModel[117].setRotationPoint(28F, -20.5F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[118].setRotationPoint(13.5F, -20.5F, -4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[119].setRotationPoint(23.5F, -20.5F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[120].setRotationPoint(26F, -20.5F, -10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[121].setRotationPoint(26F, -20.5F, -11.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 220
		bodyModel[122].setRotationPoint(26F, -20.5F, -8.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[123].setRotationPoint(23.5F, -23.5F, -11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[124].setRotationPoint(23.5F, -23.5F, -14F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 223
		bodyModel[125].setRotationPoint(23.5F, -23.5F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[126].setRotationPoint(26F, -25.5F, -11.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[127].setRotationPoint(25.5F, -28F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 226
		bodyModel[128].setRotationPoint(29.5F, -28F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[129].setRotationPoint(26F, -20.5F, 10.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 228
		bodyModel[130].setRotationPoint(26F, -20.5F, 12.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[131].setRotationPoint(26F, -20.5F, 9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[132].setRotationPoint(23.5F, -23.5F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 231
		bodyModel[133].setRotationPoint(23.5F, -23.5F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[134].setRotationPoint(23.5F, -23.5F, 7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[135].setRotationPoint(26F, -25.5F, 9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[136].setRotationPoint(25.5F, -28F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 235
		bodyModel[137].setRotationPoint(29.5F, -28F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[138].setRotationPoint(-9F, -18.5F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F); // Box 237
		bodyModel[139].setRotationPoint(-57.5F, -59F, 2F);
		bodyModel[139].rotateAngleX = 0.10471976F;
		bodyModel[139].rotateAngleZ = -0.19198622F;

		bodyModel[140].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F, 0.1F, 55F, 0F); // Box 238
		bodyModel[140].setRotationPoint(-57.5F, -59F, 0F);
		bodyModel[140].rotateAngleX = -0.10471976F;
		bodyModel[140].rotateAngleZ = -0.19198622F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 239
		bodyModel[141].setRotationPoint(2F, -19F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 1.5F); // Box 240
		bodyModel[142].setRotationPoint(7F, -19F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, -1.5F); // Box 241
		bodyModel[143].setRotationPoint(-1F, -19F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 15, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 242
		bodyModel[144].setRotationPoint(0.5F, -34F, -2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.5F); // Box 243
		bodyModel[145].setRotationPoint(-0.5F, -34F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 15, 7, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 244
		bodyModel[146].setRotationPoint(5.5F, -34F, -2.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 15, 4, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 245
		bodyModel[147].setRotationPoint(9F, -34F, -1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 20, 0F,12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, -0.5F, 0F, 12F, -0.5F, 0F, 12F, -0.5F, 0F, 12F, -0.5F, 0F); // Box 246
		bodyModel[148].setRotationPoint(-37F, -15.5F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[149].setRotationPoint(-49F, -15F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[150].setRotationPoint(-49F, -15F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[151].setRotationPoint(4F, -37F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0.5F, 0F, -0.8F, 1F, -2F, -0.8F, 1F, -2F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, -1F, 0F, 0F); // Box 250
		bodyModel[152].setRotationPoint(6F, -37F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -1.4F, -1.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.4F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F); // Box 251
		bodyModel[153].setRotationPoint(1F, -37F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.2F, -0.9F, -1.7F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.9F, -1.7F, 0.2F, 0F, -1.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -1.7F); // Box 252
		bodyModel[154].setRotationPoint(0F, -36F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 12, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 253
		bodyModel[155].setRotationPoint(-22.5F, -31F, -2.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, -1.5F); // Box 254
		bodyModel[156].setRotationPoint(-24F, -19F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 255
		bodyModel[157].setRotationPoint(-21F, -19F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 1.5F); // Box 256
		bodyModel[158].setRotationPoint(-16F, -19F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 12, 7, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 257
		bodyModel[159].setRotationPoint(-17.5F, -31F, -2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.5F, 0.2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.5F); // Box 258
		bodyModel[160].setRotationPoint(-23.5F, -31F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 259
		bodyModel[161].setRotationPoint(-14F, -31F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0.5F, 0F, -0.8F, 1F, -2F, -0.8F, 1F, -2F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0.2F, 0F, -2F, 0.2F, 0F, -2F, -1F, 0F, 0F); // Box 260
		bodyModel[162].setRotationPoint(-17F, -34F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -0.1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[163].setRotationPoint(-19F, -34F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -1.4F, -1.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.4F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F); // Box 262
		bodyModel[164].setRotationPoint(-22F, -34F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0.2F, -0.9F, -1.7F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.9F, -1.7F, 0.2F, 0F, -1.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -1.7F); // Box 263
		bodyModel[165].setRotationPoint(-23F, -33F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F,6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, 0F, -0.5F, 6F, -0.5F, -0.5F, 6F, -0.5F, -0.5F, 6F, -0.5F, -0.5F, 6F, -0.5F, -0.5F); // Box 264
		bodyModel[166].setRotationPoint(-28F, -15F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 2, 20, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 265
		bodyModel[167].setRotationPoint(-65F, -28F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 20, 0F,0F, 0F, 0F, 0.5F, 0F, -9F, 0.5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -9F, 0.5F, 0F, -9F, 0F, 0F, 0F); // Box 266
		bodyModel[168].setRotationPoint(-57F, -28F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 267
		bodyModel[169].setRotationPoint(-64F, -32.5F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[170].setRotationPoint(-60F, -32.5F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0.8F, 0F, -8F, 0.8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -8F, 0.8F, 0F, -8F, 0F, 0F, 0F); // Box 269
		bodyModel[171].setRotationPoint(-56F, -32.5F, -8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,0.1F, 0F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F); // Box 270
		bodyModel[172].setRotationPoint(-56F, -30.5F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 7, 0F,-1.3F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F); // Box 271
		bodyModel[173].setRotationPoint(-56F, -30.5F, 1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[174].setRotationPoint(-62F, -35.5F, -2.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[175].setRotationPoint(-63.5F, -30.5F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[176].setRotationPoint(-59.5F, -30.5F, -2F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 275
		bodyModel[177].setRotationPoint(-61.5F, -42.8F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, -3.5F, 0F, -0.3F, -3.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -3.5F, 0F, -0.3F, -3.5F, 0F, -0.3F, 0F); // Box 276
		bodyModel[178].setRotationPoint(-59.5F, -42.8F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 277
		bodyModel[179].setRotationPoint(-58.5F, -59.8F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 0.7F, 0F); // Box 278
		bodyModel[180].setRotationPoint(-58.5F, -59.8F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 279
		bodyModel[181].setRotationPoint(-58.5F, -60.2F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 280
		bodyModel[182].setRotationPoint(-58.5F, -60.2F, 11F);

		bodyModel[183].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 281
		bodyModel[183].setRotationPoint(41.2F, -37F, -1.3F);
		bodyModel[183].rotateAngleZ = -0.2268928F;

		bodyModel[184].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 282
		bodyModel[184].setRotationPoint(41.2F, -37F, 2.3F);
		bodyModel[184].rotateAngleZ = -0.2268928F;

		bodyModel[185].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 283
		bodyModel[185].setRotationPoint(41.2F, -37F, -0.2F);
		bodyModel[185].rotateAngleZ = -0.2268928F;

		bodyModel[186].addShapeBox(0F, -0.5F, 0F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 284
		bodyModel[186].setRotationPoint(41.2F, -37F, 1.2F);
		bodyModel[186].rotateAngleZ = -0.2268928F;

		bodyModel[187].addShapeBox(0F, -0.5F, -1.8F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 285
		bodyModel[187].setRotationPoint(41.1F, -37F, -1F);
		bodyModel[187].rotateAngleY = -0.59341195F;

		bodyModel[188].addShapeBox(0F, -0.5F, -3.5F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 286
		bodyModel[188].setRotationPoint(41.1F, -37F, -1F);
		bodyModel[188].rotateAngleY = -0.64577182F;

		bodyModel[189].addShapeBox(0F, -0.5F, 1.2F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 287
		bodyModel[189].setRotationPoint(40.3F, -37F, 4F);
		bodyModel[189].rotateAngleY = 0.64577182F;

		bodyModel[190].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 288
		bodyModel[190].setRotationPoint(40.4F, -37F, 4F);
		bodyModel[190].rotateAngleY = 0.59341195F;

		bodyModel[191].addShapeBox(0F, -0.5F, 3F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 289
		bodyModel[191].setRotationPoint(40.3F, -37F, 4F);
		bodyModel[191].rotateAngleY = 0.71558499F;

		bodyModel[192].addShapeBox(0F, -0.5F, -5.5F, 1, 2, 1, 0F,-0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 290
		bodyModel[192].setRotationPoint(41.1F, -37F, -1F);
		bodyModel[192].rotateAngleY = -0.71558499F;

		bodyModel[193].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 291
		bodyModel[193].setRotationPoint(36.7F, -37F, -6F);
		bodyModel[193].rotateAngleY = 0.36651914F;

		bodyModel[194].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 292
		bodyModel[194].setRotationPoint(35F, -37F, -6.5F);
		bodyModel[194].rotateAngleY = 0.36651914F;

		bodyModel[195].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F); // Box 293
		bodyModel[195].setRotationPoint(36.7F, -37F, 8F);
		bodyModel[195].rotateAngleY = -0.36651914F;

		bodyModel[196].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, -0.5F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F); // Box 294
		bodyModel[196].setRotationPoint(35F, -37F, 8.5F);
		bodyModel[196].rotateAngleY = -0.36651914F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 20, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[197].setRotationPoint(-166F, 7F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 12, 9, 2, 0F,0F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[198].setRotationPoint(-146F, 7F, -0.5F);

		bodyModel[199].addShapeBox(-7F, 0F, -1F, 8, 10, 2, 0F,0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 244
		bodyModel[199].setRotationPoint(-167F, 10F, 0.5F);

		bodyModel[200].addShapeBox(-9F, 0F, -1F, 2, 10, 2, 0F,0F, -0.5F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 245
		bodyModel[200].setRotationPoint(-167F, 10F, 0.5F);

		bodyModel[201].addShapeBox(1F, 6F, -1F, 5, 4, 2, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 246
		bodyModel[201].setRotationPoint(-167F, 10F, 0.5F);

		bodyModel[202].addShapeBox(6F, 6F, -1F, 1, 4, 2, 0F,0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 247
		bodyModel[202].setRotationPoint(-167F, 10F, 0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 214
		bodyModel[203].setRotationPoint(-53F, -20F, 5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 215
		bodyModel[204].setRotationPoint(-37F, -20F, 5.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 16, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 250
		bodyModel[205].setRotationPoint(-53F, -20F, -9.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 251
		bodyModel[206].setRotationPoint(-37F, -20F, -9.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0.2F, -1F); // Box 252
		bodyModel[207].setRotationPoint(-66F, -9F, -23.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 0.9F, -1.5F, -0.5F, 0.9F, -1.5F, 0F, 1F, -1F); // Box 254
		bodyModel[208].setRotationPoint(-54F, -9F, -23.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.8F, -0.2F, 0.3F, 1F, -2F, 0.3F, 1F, -2F, 0F, 0.8F, -0.2F, 0F, 0.9F, -1.5F, -0.5F, 0.7F, -2.3F, -0.5F, 0.7F, -2.3F, 0F, 0.9F, -1.5F); // Box 255
		bodyModel[209].setRotationPoint(-49F, -9F, -23.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-0.2F, 0F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.4F, 0.2F, 0.5F, 0F); // Box 256
		bodyModel[210].setRotationPoint(-61F, -10.7F, -22.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0.2F, -1F); // Box 257
		bodyModel[211].setRotationPoint(-50F, -19F, -1.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, -1F, -0.5F, 0.9F, -1.5F, 0F, 0.9F, -1.5F, 0F, 1F, -1F); // Box 258
		bodyModel[212].setRotationPoint(-38F, -19F, -1.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.8F, -0.2F, 0.3F, 1F, -2F, 0.3F, 1F, -2F, 0F, 0.8F, -0.2F, 0F, 0.9F, -1.5F, -0.5F, 0.7F, -2.3F, -0.5F, 0.7F, -2.3F, 0F, 0.9F, -1.5F); // Box 259
		bodyModel[213].setRotationPoint(-33F, -19F, -1.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-0.2F, 0F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.4F, 0.2F, 0.5F, 0F); // Box 260
		bodyModel[214].setRotationPoint(-45F, -20.7F, -0.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.8F, -0.2F, 0.3F, 1F, -2F, 0.3F, 1F, -2F, 0F, 0.8F, -0.2F, 0F, 0.9F, -1.5F, -0.5F, 0.7F, -2.3F, -0.5F, 0.7F, -2.3F, 0F, 0.9F, -1.5F); // Box 261
		bodyModel[215].setRotationPoint(69F, -13F, -22F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 0.9F, -1.5F, -0.5F, 0.9F, -1.5F, 0F, 1F, -1F); // Box 262
		bodyModel[216].setRotationPoint(64F, -13F, -22F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0.2F, -1F); // Box 263
		bodyModel[217].setRotationPoint(52F, -13F, -22F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-0.2F, 0F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.4F, 0.2F, 0.5F, 0F); // Box 264
		bodyModel[218].setRotationPoint(57F, -14.7F, -21F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.8F, -0.2F, 0.3F, 1F, -2F, 0.3F, 1F, -2F, 0F, 0.8F, -0.2F, 0F, 0.9F, -1.5F, -0.5F, 0.7F, -2.3F, -0.5F, 0.7F, -2.3F, 0F, 0.9F, -1.5F); // Box 265
		bodyModel[219].setRotationPoint(69F, -13F, 18F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.5F, 0F, 0F, 1F, -1F, -0.5F, 0.9F, -1.5F, 0F, 0.9F, -1.5F, 0F, 1F, -1F); // Box 266
		bodyModel[220].setRotationPoint(64F, -13F, 18F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-0.5F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0.2F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -0.5F, 0.2F, -1F); // Box 267
		bodyModel[221].setRotationPoint(52F, -13F, 18F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-0.2F, 0F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.4F, 0.2F, 0.5F, 0F); // Box 268
		bodyModel[222].setRotationPoint(57F, -14.7F, 19F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[223].setRotationPoint(5.5F, -11.8F, -18F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[224].setRotationPoint(5.5F, -11.8F, -21F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 271
		bodyModel[225].setRotationPoint(5.5F, -11.8F, -15F);

		bodyModel[226].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[226].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[226].rotateAngleY = -0.89011792F;

		bodyModel[227].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 273
		bodyModel[227].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[227].rotateAngleY = -0.89011792F;

		bodyModel[228].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 274
		bodyModel[228].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[228].rotateAngleY = -0.89011792F;

		bodyModel[229].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 275
		bodyModel[229].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[229].rotateAngleY = -0.89011792F;

		bodyModel[230].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 276
		bodyModel[230].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[230].rotateAngleY = -0.89011792F;

		bodyModel[231].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[231].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[231].rotateAngleY = -0.89011792F;

		bodyModel[232].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 278
		bodyModel[232].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[232].rotateAngleY = -0.89011792F;

		bodyModel[233].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 279
		bodyModel[233].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[233].rotateAngleY = -0.89011792F;
		bodyModel[233].rotateAngleZ = 0.15707963F;

		bodyModel[234].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 280
		bodyModel[234].setRotationPoint(10F, -13F, -16.5F);
		bodyModel[234].rotateAngleY = -0.89011792F;
		bodyModel[234].rotateAngleZ = 0.15707963F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[235].setRotationPoint(5.5F, -11.8F, 17F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[236].setRotationPoint(5.5F, -11.8F, 14F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 283
		bodyModel[237].setRotationPoint(5.5F, -11.8F, 20F);

		bodyModel[238].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 284
		bodyModel[238].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[238].rotateAngleY = 0.89011792F;

		bodyModel[239].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[239].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[239].rotateAngleY = 0.89011792F;

		bodyModel[240].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 286
		bodyModel[240].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[240].rotateAngleY = 0.89011792F;

		bodyModel[241].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 287
		bodyModel[241].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[241].rotateAngleY = 0.89011792F;

		bodyModel[242].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 288
		bodyModel[242].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[242].rotateAngleY = 0.89011792F;

		bodyModel[243].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[243].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[243].rotateAngleY = 0.89011792F;

		bodyModel[244].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 290
		bodyModel[244].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[244].rotateAngleY = 0.89011792F;

		bodyModel[245].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 291
		bodyModel[245].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[245].rotateAngleY = 0.89011792F;
		bodyModel[245].rotateAngleZ = 0.15707963F;

		bodyModel[246].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 292
		bodyModel[246].setRotationPoint(10F, -13F, 18.5F);
		bodyModel[246].rotateAngleY = 0.89011792F;
		bodyModel[246].rotateAngleZ = 0.15707963F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[247].setRotationPoint(-45.5F, -11.8F, 17F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[248].setRotationPoint(-45.5F, -11.8F, 14F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 295
		bodyModel[249].setRotationPoint(-45.5F, -11.8F, 20F);

		bodyModel[250].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 296
		bodyModel[250].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[250].rotateAngleY = 2.51327412F;

		bodyModel[251].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[251].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[251].rotateAngleY = 2.51327412F;

		bodyModel[252].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 298
		bodyModel[252].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[252].rotateAngleY = 2.51327412F;

		bodyModel[253].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 299
		bodyModel[253].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[253].rotateAngleY = 2.51327412F;

		bodyModel[254].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 300
		bodyModel[254].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[254].rotateAngleY = 2.51327412F;

		bodyModel[255].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[255].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[255].rotateAngleY = 2.51327412F;

		bodyModel[256].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 302
		bodyModel[256].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[256].rotateAngleY = 2.51327412F;

		bodyModel[257].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 303
		bodyModel[257].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[257].rotateAngleY = 2.51327412F;
		bodyModel[257].rotateAngleZ = 0.15707963F;

		bodyModel[258].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 304
		bodyModel[258].setRotationPoint(-41F, -13F, 18.5F);
		bodyModel[258].rotateAngleY = 2.51327412F;
		bodyModel[258].rotateAngleZ = 0.15707963F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[259].setRotationPoint(-45.5F, -11.8F, -18F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[260].setRotationPoint(-45.5F, -11.8F, -21F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 307
		bodyModel[261].setRotationPoint(-45.5F, -11.8F, -15F);

		bodyModel[262].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 308
		bodyModel[262].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[262].rotateAngleY = -2.53072742F;

		bodyModel[263].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[263].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[263].rotateAngleY = -2.53072742F;

		bodyModel[264].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 310
		bodyModel[264].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[264].rotateAngleY = -2.53072742F;

		bodyModel[265].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 311
		bodyModel[265].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[265].rotateAngleY = -2.53072742F;

		bodyModel[266].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 312
		bodyModel[266].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[266].rotateAngleY = -2.53072742F;

		bodyModel[267].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[267].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[267].rotateAngleY = -2.53072742F;

		bodyModel[268].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 314
		bodyModel[268].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[268].rotateAngleY = -2.53072742F;

		bodyModel[269].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 315
		bodyModel[269].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[269].rotateAngleY = -2.53072742F;
		bodyModel[269].rotateAngleZ = 0.15707963F;

		bodyModel[270].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 316
		bodyModel[270].setRotationPoint(-41F, -13F, -16.5F);
		bodyModel[270].rotateAngleY = -2.53072742F;
		bodyModel[270].rotateAngleZ = 0.15707963F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[271].setRotationPoint(-19F, -11.8F, -21F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[272].setRotationPoint(-19F, -11.8F, -24F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 319
		bodyModel[273].setRotationPoint(-19F, -11.8F, -18F);

		bodyModel[274].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 320
		bodyModel[274].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[274].rotateAngleY = -1.57079633F;

		bodyModel[275].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[275].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[275].rotateAngleY = -1.57079633F;

		bodyModel[276].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 322
		bodyModel[276].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[276].rotateAngleY = -1.57079633F;

		bodyModel[277].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 323
		bodyModel[277].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[277].rotateAngleY = -1.57079633F;

		bodyModel[278].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 324
		bodyModel[278].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[278].rotateAngleY = -1.57079633F;

		bodyModel[279].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[279].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[279].rotateAngleY = -1.57079633F;

		bodyModel[280].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 326
		bodyModel[280].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[280].rotateAngleY = -1.57079633F;

		bodyModel[281].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 327
		bodyModel[281].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[281].rotateAngleY = -1.57079633F;
		bodyModel[281].rotateAngleZ = 0.15707963F;

		bodyModel[282].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 328
		bodyModel[282].setRotationPoint(-14.5F, -13F, -19.5F);
		bodyModel[282].rotateAngleY = -1.57079633F;
		bodyModel[282].rotateAngleZ = 0.15707963F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[283].setRotationPoint(-19F, -11.8F, 19F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[284].setRotationPoint(-19F, -11.8F, 16F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 331
		bodyModel[285].setRotationPoint(-19F, -11.8F, 22F);

		bodyModel[286].addShapeBox(-2.5F, -1.8F, -4F, 5, 3, 8, 0F,0F, 0F, 0F, 0.1F, -0.5F, -1.5F, 0.1F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, -2F, 1.1F, 0F, -2F, 0F, 0F, 0F); // Box 332
		bodyModel[286].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[286].rotateAngleY = 1.57079633F;

		bodyModel[287].addShapeBox(-4.5F, -1.8F, -4F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[287].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[287].rotateAngleY = 1.57079633F;

		bodyModel[288].addShapeBox(-4.7F, -1.7F, 4F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 334
		bodyModel[288].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[288].rotateAngleY = 1.57079633F;

		bodyModel[289].addShapeBox(-6.5F, -1.8F, -4F, 2, 3, 8, 0F,-0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2.5F); // Box 335
		bodyModel[289].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[289].rotateAngleY = 1.57079633F;

		bodyModel[290].addShapeBox(-4.7F, -1.7F, -5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 336
		bodyModel[290].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[290].rotateAngleY = 1.57079633F;

		bodyModel[291].addShapeBox(2.5F, -0.5F, -1F, 2, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[291].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[291].rotateAngleY = 1.57079633F;

		bodyModel[292].addShapeBox(2.5F, 0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F); // Box 338
		bodyModel[292].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[292].rotateAngleY = 1.57079633F;

		bodyModel[293].addShapeBox(3.7F, 0F, -1F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 339
		bodyModel[293].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[293].rotateAngleY = 1.57079633F;
		bodyModel[293].rotateAngleZ = 0.15707963F;

		bodyModel[294].addShapeBox(3.7F, 0F, 0F, 7, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.1F, -0.1F); // Box 340
		bodyModel[294].setRotationPoint(-14.5F, -13F, 20.5F);
		bodyModel[294].rotateAngleY = 1.57079633F;
		bodyModel[294].rotateAngleZ = 0.15707963F;

		bodyModel[295].addShapeBox(-2F, 0.5F, -3F, 3, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[295].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[295].rotateAngleY = -0.61086524F;

		bodyModel[296].addShapeBox(-2F, -1.5F, -3F, 3, 2, 6, 0F,1F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -1F, 1F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[296].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[296].rotateAngleY = -0.61086524F;

		bodyModel[297].addShapeBox(2F, -1.5F, -3F, 1, 2, 6, 0F,1.7F, -0.5F, -1F, -0.6F, -1.2F, -1F, -0.6F, -1.2F, -1F, 1.7F, -0.5F, -1F, 0.5F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.5F, 0F, 0F); // Box 345
		bodyModel[297].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[297].rotateAngleY = -0.61086524F;

		bodyModel[298].addShapeBox(1.5F, 0.5F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, 0F); // Box 346
		bodyModel[298].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[298].rotateAngleY = -0.61086524F;

		bodyModel[299].addShapeBox(-3.5F, -0.5F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 347
		bodyModel[299].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[299].rotateAngleY = -0.61086524F;

		bodyModel[300].addShapeBox(-3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 348
		bodyModel[300].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[300].rotateAngleY = -0.61086524F;

		bodyModel[301].addShapeBox(0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 349
		bodyModel[301].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[301].rotateAngleY = -0.61086524F;

		bodyModel[302].addShapeBox(0.5F, -0.5F, -1F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 351
		bodyModel[302].setRotationPoint(41.5F, -15.8F, -11F);
		bodyModel[302].rotateAngleY = -0.61086524F;

		bodyModel[303].addShapeBox(0.5F, -0.5F, -1F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 352
		bodyModel[303].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[303].rotateAngleY = 0.61086524F;

		bodyModel[304].addShapeBox(0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 353
		bodyModel[304].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[304].rotateAngleY = 0.61086524F;

		bodyModel[305].addShapeBox(2F, -1.5F, -3F, 1, 2, 6, 0F,1.7F, -0.5F, -1F, -0.6F, -1.2F, -1F, -0.6F, -1.2F, -1F, 1.7F, -0.5F, -1F, 0.5F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.5F, 0F, 0F); // Box 354
		bodyModel[305].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[305].rotateAngleY = 0.61086524F;

		bodyModel[306].addShapeBox(1.5F, 0.5F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, 0F); // Box 355
		bodyModel[306].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[306].rotateAngleY = 0.61086524F;

		bodyModel[307].addShapeBox(-2F, 0.5F, -3F, 3, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[307].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[307].rotateAngleY = 0.61086524F;

		bodyModel[308].addShapeBox(-2F, -1.5F, -3F, 3, 2, 6, 0F,1F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -1F, 1F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[308].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[308].rotateAngleY = 0.61086524F;

		bodyModel[309].addShapeBox(-3.5F, -0.5F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 358
		bodyModel[309].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[309].rotateAngleY = 0.61086524F;

		bodyModel[310].addShapeBox(-3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 359
		bodyModel[310].setRotationPoint(41.5F, -15.8F, 13F);
		bodyModel[310].rotateAngleY = 0.61086524F;

		bodyModel[311].addShapeBox(0.5F, -0.5F, -1F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 360
		bodyModel[311].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[311].rotateAngleY = 2.26892803F;

		bodyModel[312].addShapeBox(0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 361
		bodyModel[312].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[312].rotateAngleY = 2.26892803F;

		bodyModel[313].addShapeBox(2F, -1.5F, -3F, 1, 2, 6, 0F,1.7F, -0.5F, -1F, -0.6F, -1.2F, -1F, -0.6F, -1.2F, -1F, 1.7F, -0.5F, -1F, 0.5F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.5F, 0F, 0F); // Box 362
		bodyModel[313].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[313].rotateAngleY = 2.26892803F;

		bodyModel[314].addShapeBox(1.5F, 0.5F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, 0F); // Box 363
		bodyModel[314].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[314].rotateAngleY = 2.26892803F;

		bodyModel[315].addShapeBox(-2F, 0.5F, -3F, 3, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[315].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[315].rotateAngleY = 2.26892803F;

		bodyModel[316].addShapeBox(-2F, -1.5F, -3F, 3, 2, 6, 0F,1F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -1F, 1F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[316].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[316].rotateAngleY = 2.26892803F;

		bodyModel[317].addShapeBox(-3.5F, -0.5F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 366
		bodyModel[317].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[317].rotateAngleY = 2.26892803F;

		bodyModel[318].addShapeBox(-3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 367
		bodyModel[318].setRotationPoint(-64F, -15.8F, 13F);
		bodyModel[318].rotateAngleY = 2.26892803F;

		bodyModel[319].addShapeBox(0.5F, -0.5F, -1F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 368
		bodyModel[319].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[319].rotateAngleY = -2.26892803F;

		bodyModel[320].addShapeBox(0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 369
		bodyModel[320].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[320].rotateAngleY = -2.26892803F;

		bodyModel[321].addShapeBox(2F, -1.5F, -3F, 1, 2, 6, 0F,1.7F, -0.5F, -1F, -0.6F, -1.2F, -1F, -0.6F, -1.2F, -1F, 1.7F, -0.5F, -1F, 0.5F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 0.5F, 0F, 0F); // Box 370
		bodyModel[321].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[321].rotateAngleY = -2.26892803F;

		bodyModel[322].addShapeBox(1.5F, 0.5F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, 0F); // Box 371
		bodyModel[322].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[322].rotateAngleY = -2.26892803F;

		bodyModel[323].addShapeBox(-2F, 0.5F, -3F, 3, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[323].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[323].rotateAngleY = -2.26892803F;

		bodyModel[324].addShapeBox(-2F, -1.5F, -3F, 3, 2, 6, 0F,1F, -0.5F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -1F, 1F, -0.5F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[324].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[324].rotateAngleY = -2.26892803F;

		bodyModel[325].addShapeBox(-3.5F, -0.5F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 374
		bodyModel[325].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[325].rotateAngleY = -2.26892803F;

		bodyModel[326].addShapeBox(-3.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 375
		bodyModel[326].setRotationPoint(-64F, -15.8F, -11F);
		bodyModel[326].rotateAngleY = -2.26892803F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F, -0.2F, -0.4F, 16F); // Box 376
		bodyModel[327].setRotationPoint(22.5F, -37.5F, -1.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[328].setRotationPoint(-15.5F, -21.5F, -7.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 378
		bodyModel[329].setRotationPoint(-15.5F, -21.5F, -3.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[330].setRotationPoint(-15.5F, -21.5F, -5.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 380
		bodyModel[331].setRotationPoint(-13.5F, -19.5F, -5.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 381
		bodyModel[332].setRotationPoint(-15.5F, -21.5F, 7.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[333].setRotationPoint(-15.5F, -21.5F, 3.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[334].setRotationPoint(-15.5F, -21.5F, 5.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 384
		bodyModel[335].setRotationPoint(-13.5F, -19.5F, 5.5F);

		bodyModel[336].addShapeBox(7F, 0F, -0.5F, 20, 1, 1, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // Box 385
		bodyModel[336].setRotationPoint(141F, -12.5F, -2.5F);
		bodyModel[336].rotateAngleY = -0.10471976F;

		bodyModel[337].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[337].setRotationPoint(139F, -14F, -2.5F);

		bodyModel[338].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[338].setRotationPoint(139F, -14F, -3.5F);

		bodyModel[339].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 388
		bodyModel[339].setRotationPoint(139F, -14F, -1.5F);

		bodyModel[340].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 389
		bodyModel[340].setRotationPoint(139F, -14F, 5F);

		bodyModel[341].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[341].setRotationPoint(139F, -14F, 4F);

		bodyModel[342].addShapeBox(0F, 0F, -0.5F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[342].setRotationPoint(139F, -14F, 3F);

		bodyModel[343].addShapeBox(7F, 0F, -0.5F, 20, 1, 1, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // Box 392
		bodyModel[343].setRotationPoint(141F, -12.5F, 4F);
		bodyModel[343].rotateAngleY = 0.10471976F;

		bodyModel[344].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 393
		bodyModel[344].setRotationPoint(40.6F, -32.5F, 0F);

		bodyModel[345].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 394
		bodyModel[345].setRotationPoint(40.6F, -32.5F, 2F);

		bodyModel[346].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 395
		bodyModel[346].setRotationPoint(39.7F, -32.5F, -2F);
		bodyModel[346].rotateAngleY = -0.66322512F;

		bodyModel[347].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 396
		bodyModel[347].setRotationPoint(39.7F, -32.5F, 4F);
		bodyModel[347].rotateAngleY = 0.66322512F;

		bodyModel[348].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 397
		bodyModel[348].setRotationPoint(38.5F, -32.5F, -3.5F);
		bodyModel[348].rotateAngleY = -0.66322512F;

		bodyModel[349].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 398
		bodyModel[349].setRotationPoint(38.5F, -32.5F, 5.5F);
		bodyModel[349].rotateAngleY = 0.66322512F;

		bodyModel[350].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 399
		bodyModel[350].setRotationPoint(37F, -32.5F, -4.7F);
		bodyModel[350].rotateAngleY = -0.97738438F;

		bodyModel[351].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 400
		bodyModel[351].setRotationPoint(37F, -32.5F, 6.7F);
		bodyModel[351].rotateAngleY = 0.97738438F;

		bodyModel[352].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 401
		bodyModel[352].setRotationPoint(35F, -32.5F, 7.5F);
		bodyModel[352].rotateAngleY = 1.22173048F;

		bodyModel[353].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F); // Box 402
		bodyModel[353].setRotationPoint(35F, -32.5F, -5.5F);
		bodyModel[353].rotateAngleY = -1.22173048F;

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 403
		bodyModel[354].setRotationPoint(22.5F, -37F, -15.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, -1F); // Box 404
		bodyModel[355].setRotationPoint(22.5F, -37F, 7.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.5F, -6F, -9F, -0.5F, 10F, 10F, 0F, 8.1F, -10F, 0F, 9.5F, 0F, 0F, -6F, -9F, 0F, 10F, 10F, 0F, 7.5F, -10F, 0F, 9.1F); // Box 405
		bodyModel[356].setRotationPoint(126F, -11.5F, -5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,10F, -0.5F, 10F, -9F, -0.5F, 8.5F, 10F, -0.2F, 6.6F, -10F, -0.2F, 9F, 10F, 0F, 9.5F, -9F, 0F, 8.3F, 10F, 0F, 6F, -10F, 0F, 8.1F); // Box 406
		bodyModel[357].setRotationPoint(149F, -12F, -4F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,7F, -0.9F, 6.5F, -3F, -0.5F, 2.5F, 4F, -0.2F, 3F, -7F, -0.4F, 5F, 7F, 0F, 6F, -3F, 0F, 2F, 4F, 0F, 2.5F, -7F, 0F, 4.5F); // Box 407
		bodyModel[358].setRotationPoint(173F, -12.5F, -3F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[10];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 105
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 106
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 110
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 111
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 112
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 113
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 114
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 115
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 117

		gun_1_Model[0][0].addShapeBox(-3F, -3.5F, -4F, 10, 5, 4, 0F,0F, -0.2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 105

		gun_1_Model[0][1].addShapeBox(-3F, -3.5F, -8F, 10, 5, 4, 0F,0F, -1.3F, 0F, -4F, -2.3F, 0.3F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106

		gun_1_Model[0][2].addShapeBox(-15F, -3.5F, -8F, 12, 5, 4, 0F,-2.8F, -1F, -0.4F, 0F, -1.3F, 0F, 0F, -0.2F, 0F, -2F, -0.5F, -2F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 110

		gun_1_Model[0][3].addShapeBox(-15F, -3.5F, -4F, 12, 5, 4, 0F,-2F, -0.5F, 2F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_1_Model[0][4].addShapeBox(-15F, -3.5F, 0F, 12, 5, 4, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F); // Box 112

		gun_1_Model[0][5].addShapeBox(-15F, -3.5F, 4F, 12, 5, 4, 0F,-2F, -0.5F, -2F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, -2.8F, -1F, -0.4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0F); // Box 113

		gun_1_Model[0][6].addShapeBox(-3F, -3.5F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114

		gun_1_Model[0][7].addShapeBox(-3F, -3.5F, 4F, 10, 5, 4, 0F,0F, -0.2F, 0F, 0F, -2F, 0F, -4F, -2.3F, 0.3F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 115

		gun_1_Model[0][8].addShapeBox(-10.5F, -1F, -11.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 116

		gun_1_Model[0][9].addShapeBox(-10.5F, -1F, 7.5F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(90.5F, -16F, 1F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[15];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 118
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 119
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 120
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 121
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 123
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 124
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 125
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 127
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 128
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 129
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 130
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 131
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 133
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 134
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 135

		gun_1_Model[1][0].addShapeBox(2F, -2.1F, -1F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 118

		gun_1_Model[1][1].addShapeBox(8F, -2.1F, -1F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 119

		gun_1_Model[1][2].addShapeBox(9.5F, -1F, -1F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 120

		gun_1_Model[1][3].addShapeBox(11.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 121

		gun_1_Model[1][4].addShapeBox(24.2F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 123

		gun_1_Model[1][5].addShapeBox(24.2F, -0.5F, -5F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 124

		gun_1_Model[1][6].addShapeBox(11.5F, -0.5F, -5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 125

		gun_1_Model[1][7].addShapeBox(9.5F, -1F, -5.5F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 127

		gun_1_Model[1][8].addShapeBox(8F, -2.1F, -5.5F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 128

		gun_1_Model[1][9].addShapeBox(2F, -2.1F, -5.5F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 129

		gun_1_Model[1][10].addShapeBox(24.2F, -0.5F, 4F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 130

		gun_1_Model[1][11].addShapeBox(11.5F, -0.5F, 4F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 131

		gun_1_Model[1][12].addShapeBox(9.5F, -1F, 3.5F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 133

		gun_1_Model[1][13].addShapeBox(8F, -2.1F, 3.5F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 134

		gun_1_Model[1][14].addShapeBox(2F, -2.1F, 3.5F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 135

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(90.5F, -16F, 1F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontTripleGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[20];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 136
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 139
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 140
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 141
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 144
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 146
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 147
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 148
		gun_2_Model[1][8] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 149
		gun_2_Model[1][9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 150
		gun_2_Model[1][10] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 151
		gun_2_Model[1][11] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 152
		gun_2_Model[1][12] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 153
		gun_2_Model[1][13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 154
		gun_2_Model[1][14] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 155
		gun_2_Model[1][15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 156
		gun_2_Model[1][16] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 157
		gun_2_Model[1][17] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 158
		gun_2_Model[1][18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 159
		gun_2_Model[1][19] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 160

		gun_2_Model[1][0].addShapeBox(-3F, -3.5F, -3F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, 0.5F, -1.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_2_Model[1][1].addShapeBox(-3F, -3.5F, -7F, 10, 5, 4, 0F,0F, -0.7F, -0.5F, -4F, -1.8F, -0.2F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_2_Model[1][2].addShapeBox(-14F, -3.5F, -7F, 11, 5, 4, 0F,-2.8F, -0.5F, -1F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 140

		gun_2_Model[1][3].addShapeBox(-14F, -3.5F, -3F, 11, 5, 3, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.3F, 0.2F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 141

		gun_2_Model[1][4].addShapeBox(-9.5F, -2.5F, -9.5F, 2, 2, 4, 0F,0.5F, 0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 144

		gun_2_Model[1][5].addShapeBox(1F, -2.1F, 1.25F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 146

		gun_2_Model[1][6].addShapeBox(7F, -2.1F, 1.25F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 147

		gun_2_Model[1][7].addShapeBox(8.5F, -1F, 1.25F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 148

		gun_2_Model[1][8].addShapeBox(10.5F, -0.5F, 1.75F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 149

		gun_2_Model[1][9].addShapeBox(23.2F, -0.5F, 1.75F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 150

		gun_2_Model[1][10].addShapeBox(-14F, -3.5F, 0F, 11, 5, 3, 0F,-1.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 151

		gun_2_Model[1][11].addShapeBox(-3F, -3.5F, 0F, 10, 5, 3, 0F,0F, 0.2F, 0F, 0.5F, -1.5F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152

		gun_2_Model[1][12].addShapeBox(-14F, -3.5F, 3F, 11, 5, 4, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.5F, -2.8F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F); // Box 153

		gun_2_Model[1][13].addShapeBox(-3F, -3.5F, 3F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, -4F, -1.8F, -0.2F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, 0F, 0F, 0.5F); // Box 154

		gun_2_Model[1][14].addShapeBox(7F, -2.1F, -3.25F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 155

		gun_2_Model[1][15].addShapeBox(1F, -2.1F, -3.25F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 156

		gun_2_Model[1][16].addShapeBox(8.5F, -1F, -3.25F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 157

		gun_2_Model[1][17].addShapeBox(10.5F, -0.5F, -2.75F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 158

		gun_2_Model[1][18].addShapeBox(23.2F, -0.5F, -2.75F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 159

		gun_2_Model[1][19].addShapeBox(-9.5F, -2.5F, 5.5F, 2, 2, 4, 0F,0.5F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F); // Box 160

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(59F, -21.2F, 1F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontDualGun", gun_2_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[20];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 136
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 139
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 140
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 141
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 144
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 146
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 147
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 148
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 149
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 150
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 151
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 152
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 153
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 154
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 155
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 156
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 157
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 158
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 159
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 160

		gun_3_Model[1][0].addShapeBox(-3F, -3.5F, -3F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, 0.5F, -1.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_3_Model[1][1].addShapeBox(-3F, -3.5F, -7F, 10, 5, 4, 0F,0F, -0.7F, -0.5F, -4F, -1.8F, -0.2F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_3_Model[1][2].addShapeBox(-14F, -3.5F, -7F, 11, 5, 4, 0F,-2.8F, -0.5F, -1F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 140

		gun_3_Model[1][3].addShapeBox(-14F, -3.5F, -3F, 11, 5, 3, 0F,-2F, 0F, 1F, 0F, 0F, 0F, 0F, 0.2F, 0F, -1.3F, 0.2F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 141

		gun_3_Model[1][4].addShapeBox(-9.5F, -2.5F, -9.5F, 2, 2, 4, 0F,0.5F, 0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F); // Box 144

		gun_3_Model[1][5].addShapeBox(1F, -2.1F, 1.25F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 146

		gun_3_Model[1][6].addShapeBox(7F, -2.1F, 1.25F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 147

		gun_3_Model[1][7].addShapeBox(8.5F, -1F, 1.25F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 148

		gun_3_Model[1][8].addShapeBox(10.5F, -0.5F, 1.75F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 149

		gun_3_Model[1][9].addShapeBox(23.2F, -0.5F, 1.75F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 150

		gun_3_Model[1][10].addShapeBox(-14F, -3.5F, 0F, 11, 5, 3, 0F,-1.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 151

		gun_3_Model[1][11].addShapeBox(-3F, -3.5F, 0F, 10, 5, 3, 0F,0F, 0.2F, 0F, 0.5F, -1.5F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152

		gun_3_Model[1][12].addShapeBox(-14F, -3.5F, 3F, 11, 5, 4, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, -0.5F, -2.8F, -0.5F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F); // Box 153

		gun_3_Model[1][13].addShapeBox(-3F, -3.5F, 3F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, -1.7F, 0F, -4F, -1.8F, -0.2F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, 0F, 0F, 0.5F); // Box 154

		gun_3_Model[1][14].addShapeBox(7F, -2.1F, -3.25F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 155

		gun_3_Model[1][15].addShapeBox(1F, -2.1F, -3.25F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 156

		gun_3_Model[1][16].addShapeBox(8.5F, -1F, -3.25F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 157

		gun_3_Model[1][17].addShapeBox(10.5F, -0.5F, -2.75F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 158

		gun_3_Model[1][18].addShapeBox(23.2F, -0.5F, -2.75F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 159

		gun_3_Model[1][19].addShapeBox(-9.5F, -2.5F, 5.5F, 2, 2, 4, 0F,0.5F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F); // Box 160

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-81.5F, -16.5F, 1F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearDualGun", gun_3_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[10];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 105
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 106
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 110
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 111
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 112
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 113
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 114
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 115
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 117

		gun_4_Model[0][0].addShapeBox(-3F, -3.5F, -4F, 10, 5, 4, 0F,0F, -0.2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 105

		gun_4_Model[0][1].addShapeBox(-3F, -3.5F, -8F, 10, 5, 4, 0F,0F, -1.3F, 0F, -4F, -2.3F, 0.3F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106

		gun_4_Model[0][2].addShapeBox(-15F, -3.5F, -8F, 12, 5, 4, 0F,-2.8F, -1F, -0.4F, 0F, -1.3F, 0F, 0F, -0.2F, 0F, -2F, -0.5F, -2F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 110

		gun_4_Model[0][3].addShapeBox(-15F, -3.5F, -4F, 12, 5, 4, 0F,-2F, -0.5F, 2F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_4_Model[0][4].addShapeBox(-15F, -3.5F, 0F, 12, 5, 4, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -2F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F); // Box 112

		gun_4_Model[0][5].addShapeBox(-15F, -3.5F, 4F, 12, 5, 4, 0F,-2F, -0.5F, -2F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, -2.8F, -1F, -0.4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0F); // Box 113

		gun_4_Model[0][6].addShapeBox(-3F, -3.5F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114

		gun_4_Model[0][7].addShapeBox(-3F, -3.5F, 4F, 10, 5, 4, 0F,0F, -0.2F, 0F, 0F, -2F, 0F, -4F, -2.3F, 0.3F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 115

		gun_4_Model[0][8].addShapeBox(-10.5F, -1F, -11.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 116

		gun_4_Model[0][9].addShapeBox(-10.5F, -1F, 7.5F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-113F, -11F, 1F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[15];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 118
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 119
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 120
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 121
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 123
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 124
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 125
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 127
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 128
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 129
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 130
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 131
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 133
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 134
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 135

		gun_4_Model[1][0].addShapeBox(2F, -2.1F, -1F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 118

		gun_4_Model[1][1].addShapeBox(8F, -2.1F, -1F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 119

		gun_4_Model[1][2].addShapeBox(9.5F, -1F, -1F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 120

		gun_4_Model[1][3].addShapeBox(11.5F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 121

		gun_4_Model[1][4].addShapeBox(24.2F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 123

		gun_4_Model[1][5].addShapeBox(24.2F, -0.5F, -5F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 124

		gun_4_Model[1][6].addShapeBox(11.5F, -0.5F, -5F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 125

		gun_4_Model[1][7].addShapeBox(9.5F, -1F, -5.5F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 127

		gun_4_Model[1][8].addShapeBox(8F, -2.1F, -5.5F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 128

		gun_4_Model[1][9].addShapeBox(2F, -2.1F, -5.5F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 129

		gun_4_Model[1][10].addShapeBox(24.2F, -0.5F, 4F, 1, 1, 1, 0F,-0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F, -0.1F, -0.05F, -0.05F); // Box 130

		gun_4_Model[1][11].addShapeBox(11.5F, -0.5F, 4F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 131

		gun_4_Model[1][12].addShapeBox(9.5F, -1F, 3.5F, 2, 2, 2, 0F,0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 133

		gun_4_Model[1][13].addShapeBox(8F, -2.1F, 3.5F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, -1.2F, -0.1F, 0F, -1.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.3F, 0F); // Box 134

		gun_4_Model[1][14].addShapeBox(2F, -2.1F, 3.5F, 6, 3, 2, 0F,1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 135

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-113F, -11F, 1F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearTripleGun", gun_4_Model);
	}
}