//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.06.2015 - 19:28:42
// Last changed on: 07.06.2015 - 19:28:42

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBMD1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBMD1() //Same as Filename
	{
				
				bodyModel = new ModelRendererTurbo[207];
				bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
				bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
				bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
				bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 7
				bodyModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 9
				bodyModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 10
				bodyModel[6] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 11
				bodyModel[7] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 13
				bodyModel[8] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 14
				bodyModel[9] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 15
				bodyModel[10] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 16
				bodyModel[11] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 18
				bodyModel[12] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 21
				bodyModel[13] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 22
				bodyModel[14] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 23
				bodyModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
				bodyModel[16] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 25
				bodyModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 26
				bodyModel[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 27
				bodyModel[19] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
				bodyModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
				bodyModel[21] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 30
				bodyModel[22] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 31
				bodyModel[23] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 32
				bodyModel[24] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 34
				bodyModel[25] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 35
				bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 36
				bodyModel[27] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 37
				bodyModel[28] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 38
				bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
				bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 40
				bodyModel[31] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 41
				bodyModel[32] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 42
				bodyModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 43
				bodyModel[34] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 44
				bodyModel[35] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 45
				bodyModel[36] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 46
				bodyModel[37] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 47
				bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
				bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 49
				bodyModel[40] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 50
				bodyModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 51
				bodyModel[42] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 52
				bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 53
				bodyModel[44] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 54
				bodyModel[45] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 55
				bodyModel[46] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 56
				bodyModel[47] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 57
				bodyModel[48] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 58
				bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
				bodyModel[50] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 60
				bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 61
				bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 62
				bodyModel[53] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 63
				bodyModel[54] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 58
				bodyModel[55] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 59
				bodyModel[56] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 53
				bodyModel[57] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 54
				bodyModel[58] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 55
				bodyModel[59] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 56
				bodyModel[60] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 57
				bodyModel[61] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 60
				bodyModel[62] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 61
				bodyModel[63] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 62
				bodyModel[64] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 63
				bodyModel[65] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 43
				bodyModel[66] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 44
				bodyModel[67] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 45
				bodyModel[68] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 46
				bodyModel[69] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 47
				bodyModel[70] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 48
				bodyModel[71] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 49
				bodyModel[72] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 50
				bodyModel[73] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 51
				bodyModel[74] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 52
				bodyModel[75] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 163
				bodyModel[76] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 167
				bodyModel[77] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 168
				bodyModel[78] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 169
				bodyModel[79] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 170
				bodyModel[80] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 171
				bodyModel[81] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 172
				bodyModel[82] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 173
				bodyModel[83] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 174
				bodyModel[84] = new ModelRendererTurbo(this, 115, 147, textureX, textureY); // Box 175
				bodyModel[85] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 176
				bodyModel[86] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 177
				bodyModel[87] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 178
				bodyModel[88] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 179
				bodyModel[89] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 180
				bodyModel[90] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 181
				bodyModel[91] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 182
				bodyModel[92] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 183
				bodyModel[93] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 184
				bodyModel[94] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 185
				bodyModel[95] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 186
				bodyModel[96] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 187
				bodyModel[97] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 188
				bodyModel[98] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 189
				bodyModel[99] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 190
				bodyModel[100] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 191
				bodyModel[101] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 192
				bodyModel[102] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 193
				bodyModel[103] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 194
				bodyModel[104] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 195
				bodyModel[105] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 194
				bodyModel[106] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 195
				bodyModel[107] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 196
				bodyModel[108] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 197
				bodyModel[109] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 198
				bodyModel[110] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 199
				bodyModel[111] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 200
				bodyModel[112] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 201
				bodyModel[113] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 202
				bodyModel[114] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 203
				bodyModel[115] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 204
				bodyModel[116] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 205
				bodyModel[117] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 206
				bodyModel[118] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 207
				bodyModel[119] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 208
				bodyModel[120] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 209
				bodyModel[121] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 210
				bodyModel[122] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 211
				bodyModel[123] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 212
				bodyModel[124] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 213
				bodyModel[125] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 214
				bodyModel[126] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 215
				bodyModel[127] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 216
				bodyModel[128] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 217
				bodyModel[129] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 218
				bodyModel[130] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 219
				bodyModel[131] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 220
				bodyModel[132] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 221
				bodyModel[133] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 222
				bodyModel[134] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 223
				bodyModel[135] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 224
				bodyModel[136] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 223
				bodyModel[137] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 224
				bodyModel[138] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 225
				bodyModel[139] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 226
				bodyModel[140] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 227
				bodyModel[141] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 231
				bodyModel[142] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 232
				bodyModel[143] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 233
				bodyModel[144] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 234
				bodyModel[145] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 242
				bodyModel[146] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 243
				bodyModel[147] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 244
				bodyModel[148] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 245
				bodyModel[149] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 246
				bodyModel[150] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 247
				bodyModel[151] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 249
				bodyModel[152] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 250
				bodyModel[153] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 251
				bodyModel[154] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 252
				bodyModel[155] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 253
				bodyModel[156] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 254
				bodyModel[157] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 255
				bodyModel[158] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 256
				bodyModel[159] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 257
				bodyModel[160] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 258
				bodyModel[161] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 259
				bodyModel[162] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 260
				bodyModel[163] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 261
				bodyModel[164] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 262
				bodyModel[165] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 263
				bodyModel[166] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 264
				bodyModel[167] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 265
				bodyModel[168] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 266
				bodyModel[169] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 267
				bodyModel[170] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 268
				bodyModel[171] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 269
				bodyModel[172] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 270
				bodyModel[173] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 272
				bodyModel[174] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 273
				bodyModel[175] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 274
				bodyModel[176] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 275
				bodyModel[177] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 276
				bodyModel[178] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 277
				bodyModel[179] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 278
				bodyModel[180] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 279
				bodyModel[181] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 280
				bodyModel[182] = new ModelRendererTurbo(this, 3, 167, textureX, textureY); // Box 328
				bodyModel[183] = new ModelRendererTurbo(this, 74, 157, textureX, textureY); // Box 271
				bodyModel[184] = new ModelRendererTurbo(this, 74, 196, textureX, textureY); // Box 272
				bodyModel[185] = new ModelRendererTurbo(this, 74, 188, textureX, textureY); // Box 273
				bodyModel[186] = new ModelRendererTurbo(this, 74, 180, textureX, textureY); // Box 274
				bodyModel[187] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 275
				bodyModel[188] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 276
				bodyModel[189] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 277
				bodyModel[190] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 353
				bodyModel[191] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 354
				bodyModel[192] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 355
				bodyModel[193] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 356
				bodyModel[194] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 357
				bodyModel[195] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 358
				bodyModel[196] = new ModelRendererTurbo(this, 425, 143, textureX, textureY); // Box 363
				bodyModel[197] = new ModelRendererTurbo(this, 431, 151, textureX, textureY); // Box 364
				bodyModel[198] = new ModelRendererTurbo(this, 424, 151, textureX, textureY); // Box 365
				bodyModel[199] = new ModelRendererTurbo(this, 440, 146, textureX, textureY); // Box 366
				bodyModel[200] = new ModelRendererTurbo(this, 431, 146, textureX, textureY); // Box 367
				bodyModel[201] = new ModelRendererTurbo(this, 425, 146, textureX, textureY); // Box 368
				bodyModel[202] = new ModelRendererTurbo(this, 440, 149, textureX, textureY); // Box 369
				bodyModel[203] = new ModelRendererTurbo(this, 431, 151, textureX, textureY); // Box 370
				bodyModel[204] = new ModelRendererTurbo(this, 424, 155, textureX, textureY); // Box 371
				bodyModel[205] = new ModelRendererTurbo(this, 424, 151, textureX, textureY); // Box 372
				bodyModel[206] = new ModelRendererTurbo(this, 424, 158, textureX, textureY); // Box 373

				bodyModel[0].addBox(-7F, 0F, -17F, 19, 8, 34, 0F); // Box 3
				bodyModel[0].setRotationPoint(0F, -13F, 0F);

				bodyModel[1].addShapeBox(0F, 0F, -17F, 14, 5, 17, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
				bodyModel[1].setRotationPoint(12F, -13F, 0F);

				bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, 0F, 0F, 0F); // Box 6
				bodyModel[2].setRotationPoint(12F, -13F, 0F);

				bodyModel[3].addShapeBox(0F, 8F, 0F, 20, 12, 17, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -9.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -3F, 0F, 0F, -3F); // Box 7
				bodyModel[3].setRotationPoint(12F, -16F, 0F);

				bodyModel[4].addShapeBox(0F, 0F, -17F, 20, 4, 17, 0F, 0.5F, 0F, -2F, -3.5F, -4F, -5F, 0F, -4F, 0F, -3F, 0F, 0F, 0.5F, 0F, -2F, -3.5F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 9
				bodyModel[4].setRotationPoint(23F, -13F, 0F);

				bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 4, 17, 0F, -3F, 0F, 0F, 0F, -4F, 0F, -3.5F, -4F, -5F, 0.5F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -5F, 0.5F, 0F, -2F); // Box 10
				bodyModel[5].setRotationPoint(23F, -13F, 0F);

				bodyModel[6].addShapeBox(0F, 4F, 0F, 20, 13, 15, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -3F, 0.5F, 0F, 0F, -11F, -2F, 0F, 0F, -13F, 0F, -3.5F, -13F, -3F, -5.5F, 0F, -1F); // Box 11
				bodyModel[6].setRotationPoint(23F, -13F, 0F);

				bodyModel[7].addShapeBox(0F, 0F, 12F, 16, 6, 10, 0F, 0.5F, -1F, -3F, -2.6F, -4.27F, -0.55F, -4F, -4.3F, -5.65F, -3F, -3F, -4F, 0.5F, 0F, -3F, -0.6F, 0.3F, -0.2F, -2.1F, 0.3F, -6F, 0F, 0F, -3.5F); // Box 13
				bodyModel[7].setRotationPoint(23F, -14F, 0F);

				bodyModel[8].addShapeBox(0F, 5F, 12F, 16, 12, 8, 0F, -5F, 0F, -2F, -2F, -0.3F, -0.2F, -4F, -0.3F, -4F, -5F, 0F, -4F, -5.5F, 0F, -2F, -0.6F, -11.7F, -0.2F, -2.1F, -11.7F, -4F, -5F, 0F, -4F); // Box 14
				bodyModel[8].setRotationPoint(23F, -13F, 0F);

				bodyModel[9].addShapeBox(0F, 0F, 15F, 15, 5, 5, 0F, 0F, 0F, -2F, -4.5F, 0F, 0F, -1F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, 0F); // Box 15
				bodyModel[9].setRotationPoint(12F, -13F, 0F);

				bodyModel[10].addShapeBox(0F, 7F, 14F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
				bodyModel[10].setRotationPoint(12F, -15F, 0F);

				bodyModel[11].addShapeBox(0F, 0F, -20F, 15, 5, 5, 0F, 0F, -2F, 0F, -1F, -2F, -2F, -4.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -1.5F, -4.5F, 0F, 0F, 0F, 0F, 0F); // Box 18
				bodyModel[11].setRotationPoint(12F, -13F, 0F);

				bodyModel[12].addBox(0F, 0F, 0F, 30, 8, 7, 0F); // Box 21
				bodyModel[12].setRotationPoint(-37F, -13F, 10F);

				bodyModel[13].addBox(0F, 0F, -7F, 30, 8, 7, 0F); // Box 22
				bodyModel[13].setRotationPoint(-37F, -13F, -10F);

				bodyModel[14].addShapeBox(0F, 0F, 0F, 37, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
				bodyModel[14].setRotationPoint(-25F, -13F, 17F);

				bodyModel[15].addShapeBox(0F, 0F, -3F, 37, 8, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
				bodyModel[15].setRotationPoint(-25F, -13F, -17F);

				bodyModel[16].addBox(0F, 0F, -16F, 54, 9, 32, 0F); // Box 25
				bodyModel[16].setRotationPoint(-42F, -5F, 0F);

				bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F, -5F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
				bodyModel[17].setRotationPoint(-30F, -13F, 17F);

				bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
				bodyModel[18].setRotationPoint(-37F, -13F, 17F);

				bodyModel[19].addShapeBox(0F, 0F, -3F, 5, 8, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
				bodyModel[19].setRotationPoint(-30F, -13F, -17F);

				bodyModel[20].addShapeBox(0F, 0F, -3F, 7, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
				bodyModel[20].setRotationPoint(-37F, -13F, -17F);

				bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 8, 10, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
				bodyModel[21].setRotationPoint(-43F, -13F, 10F);

				bodyModel[22].addShapeBox(0F, 0F, -10F, 6, 8, 10, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
				bodyModel[22].setRotationPoint(-43F, -13F, -10F);

				bodyModel[23].addShapeBox(0F, 7F, -16F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
				bodyModel[23].setRotationPoint(12F, -15F, 0F);

				bodyModel[24].addShapeBox(0F, 8F, -17F, 20, 12, 17, 0F, 0F, 0F, -1F, -9.5F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
				bodyModel[24].setRotationPoint(12F, -16F, 0F);

				bodyModel[25].addShapeBox(0F, 6F, -15F, 20, 13, 15, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -5.5F, 0F, -1F, -3.5F, -13F, -3F, 0F, -13F, 0F, -11F, -2F, 0F); // Box 35
				bodyModel[25].setRotationPoint(23F, -15F, 0F);

				bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
				bodyModel[26].setRotationPoint(12F, -6F, 16F);

				bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
				bodyModel[27].setRotationPoint(30F, -6F, 16F);
				bodyModel[27].rotateAngleZ = -0.33161256F;

				bodyModel[28].addShapeBox(0F, 0F, -4F, 18, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
				bodyModel[28].setRotationPoint(12F, -6F, -16F);

				bodyModel[29].addShapeBox(0F, 0F, -4F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
				bodyModel[29].setRotationPoint(30F, -6F, -16F);
				bodyModel[29].rotateAngleZ = -0.33161256F;

				bodyModel[30].addShapeBox(0F, 0F, -16F, 1, 9, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 40
				bodyModel[30].setRotationPoint(-43F, -5F, 0F);

				bodyModel[31].addShapeBox(0F, 0F, -10F, 36, 3, 20, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
				bodyModel[31].setRotationPoint(-43F, -8F, 0F);

				bodyModel[32].addShapeBox(-11F, 0F, -10F, 11, 5, 20, 0F, -1F, -2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, -2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 42
				bodyModel[32].setRotationPoint(-7F, -13F, 0F);

				bodyModel[33].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 43
				bodyModel[33].setRotationPoint(22F, 2F, 16F);
				bodyModel[33].rotateAngleZ = 0.52359878F;

				bodyModel[34].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 44
				bodyModel[34].setRotationPoint(22F, 2F, 16F);
				bodyModel[34].rotateAngleZ = 0.52359878F;

				bodyModel[35].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 45
				bodyModel[35].setRotationPoint(11F, 2F, 16F);
				bodyModel[35].rotateAngleZ = 0.52359878F;

				bodyModel[36].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 46
				bodyModel[36].setRotationPoint(11F, 2F, 16F);
				bodyModel[36].rotateAngleZ = 0.52359878F;

				bodyModel[37].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 47
				bodyModel[37].setRotationPoint(0F, 2F, 16F);
				bodyModel[37].rotateAngleZ = 0.52359878F;

				bodyModel[38].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 48
				bodyModel[38].setRotationPoint(0F, 2F, 16F);
				bodyModel[38].rotateAngleZ = 0.52359878F;

				bodyModel[39].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 49
				bodyModel[39].setRotationPoint(-11F, 2F, 16F);
				bodyModel[39].rotateAngleZ = 0.52359878F;

				bodyModel[40].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 50
				bodyModel[40].setRotationPoint(-11F, 2F, 16F);
				bodyModel[40].rotateAngleZ = 0.52359878F;

				bodyModel[41].addShapeBox(-1F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 51
				bodyModel[41].setRotationPoint(-23F, 2F, 16F);
				bodyModel[41].rotateAngleZ = 0.52359878F;

				bodyModel[42].addShapeBox(-7F, 0F, 0F, 7, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
				bodyModel[42].setRotationPoint(-23F, 2F, 16F);
				bodyModel[42].rotateAngleZ = 0.52359878F;

				bodyModel[43].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
				bodyModel[43].setRotationPoint(22F, 2F, 16F);
				bodyModel[43].rotateAngleZ = 0.52359878F;

				bodyModel[44].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
				bodyModel[44].setRotationPoint(11F, 2F, 16F);
				bodyModel[44].rotateAngleZ = 0.52359878F;

				bodyModel[45].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
				bodyModel[45].setRotationPoint(0F, 2F, 16F);
				bodyModel[45].rotateAngleZ = 0.52359878F;

				bodyModel[46].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
				bodyModel[46].setRotationPoint(-11F, 2F, 16F);
				bodyModel[46].rotateAngleZ = 0.52359878F;

				bodyModel[47].addShapeBox(-6.5F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
				bodyModel[47].setRotationPoint(-23F, 2F, 16F);
				bodyModel[47].rotateAngleZ = 0.52359878F;

				bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
				bodyModel[48].setRotationPoint(27.5F, 0F, 16F);

				bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
				bodyModel[49].setRotationPoint(-39.5F, 0F, 16F);

				bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 60
				bodyModel[50].setRotationPoint(10F, -3F, 16F);

				bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 61
				bodyModel[51].setRotationPoint(0F, -3F, 16F);

				bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 62
				bodyModel[52].setRotationPoint(-12F, -3F, 16F);

				bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 63
				bodyModel[53].setRotationPoint(-23F, -2.5F, 16F);

				bodyModel[54].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
				bodyModel[54].setRotationPoint(27.5F, 0F, -16F);

				bodyModel[55].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
				bodyModel[55].setRotationPoint(-39.5F, 0F, -16F);

				bodyModel[56].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 53
				bodyModel[56].setRotationPoint(22F, 2F, -16F);
				bodyModel[56].rotateAngleZ = 0.52359878F;

				bodyModel[57].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
				bodyModel[57].setRotationPoint(11F, 2F, -16F);
				bodyModel[57].rotateAngleZ = 0.52359878F;

				bodyModel[58].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
				bodyModel[58].setRotationPoint(0F, 2F, -16F);
				bodyModel[58].rotateAngleZ = 0.52359878F;

				bodyModel[59].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
				bodyModel[59].setRotationPoint(-11F, 2F, -16F);
				bodyModel[59].rotateAngleZ = 0.52359878F;

				bodyModel[60].addShapeBox(-6.5F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 57
				bodyModel[60].setRotationPoint(-23F, 2F, -16F);
				bodyModel[60].rotateAngleZ = 0.52359878F;

				bodyModel[61].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
				bodyModel[61].setRotationPoint(10F, -3F, -16F);

				bodyModel[62].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
				bodyModel[62].setRotationPoint(0F, -3F, -16F);

				bodyModel[63].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
				bodyModel[63].setRotationPoint(-12F, -3F, -16F);

				bodyModel[64].addShapeBox(0F, 0F, -4F, 1, 1, 4, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
				bodyModel[64].setRotationPoint(-23F, -2.5F, -16F);

				bodyModel[65].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 43
				bodyModel[65].setRotationPoint(22F, 2F, -16F);
				bodyModel[65].rotateAngleZ = 0.52359878F;

				bodyModel[66].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 44
				bodyModel[66].setRotationPoint(22F, 2F, -16F);
				bodyModel[66].rotateAngleZ = 0.52359878F;

				bodyModel[67].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 45
				bodyModel[67].setRotationPoint(11F, 2F, -16F);
				bodyModel[67].rotateAngleZ = 0.52359878F;

				bodyModel[68].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 46
				bodyModel[68].setRotationPoint(11F, 2F, -16F);
				bodyModel[68].rotateAngleZ = 0.52359878F;

				bodyModel[69].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 47
				bodyModel[69].setRotationPoint(0F, 2F, -16F);
				bodyModel[69].rotateAngleZ = 0.52359878F;

				bodyModel[70].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
				bodyModel[70].setRotationPoint(0F, 2F, -16F);
				bodyModel[70].rotateAngleZ = 0.52359878F;

				bodyModel[71].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 49
				bodyModel[71].setRotationPoint(-11F, 2F, -16F);
				bodyModel[71].rotateAngleZ = 0.52359878F;

				bodyModel[72].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 50
				bodyModel[72].setRotationPoint(-11F, 2F, -16F);
				bodyModel[72].rotateAngleZ = 0.52359878F;

				bodyModel[73].addShapeBox(-1F, 0F, -1F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 51
				bodyModel[73].setRotationPoint(-23F, 2F, -16F);
				bodyModel[73].rotateAngleZ = 0.52359878F;

				bodyModel[74].addShapeBox(-7F, 0F, -1F, 7, 1, 1, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
				bodyModel[74].setRotationPoint(-23F, 2F, -16F);
				bodyModel[74].rotateAngleZ = 0.52359878F;

				bodyModel[75].addShapeBox(-1F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 163
				bodyModel[75].setRotationPoint(26F, -11F, -18F);

				bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 167
				bodyModel[76].setRotationPoint(-43F, -5F, 16F);

				bodyModel[77].addShapeBox(0F, 0F, -4F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
				bodyModel[77].setRotationPoint(-43F, -5F, -16F);

				bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
				bodyModel[78].setRotationPoint(-43.01F, -6.25F, 10.25F);

				bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
				bodyModel[79].setRotationPoint(-43.01F, -6.25F, 16.75F);

				bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
				bodyModel[80].setRotationPoint(-43.01F, -6.25F, 13.5F);

				bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
				bodyModel[81].setRotationPoint(-43.01F, -6.25F, -19.75F);

				bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
				bodyModel[82].setRotationPoint(-43.01F, -6.25F, -16.5F);

				bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
				bodyModel[83].setRotationPoint(-43.01F, -6.25F, -13.25F);

				bodyModel[84].addShapeBox(0F, -0.4F, -3F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
				bodyModel[84].setRotationPoint(18F, -13F, 0F);

				bodyModel[85].addShapeBox(0F, -0.4F, -4F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
				bodyModel[85].setRotationPoint(18F, -13F, 0F);

				bodyModel[86].addShapeBox(0F, -0.4F, 3F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 177
				bodyModel[86].setRotationPoint(18F, -13F, 0F);

				bodyModel[87].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
				bodyModel[87].setRotationPoint(25.5F, -13F, 0F);

				bodyModel[88].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
				bodyModel[88].setRotationPoint(25F, -13F, 3F);
				bodyModel[88].rotateAngleY = 0.34906585F;

				bodyModel[89].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
				bodyModel[89].setRotationPoint(25F, -13F, -3F);
				bodyModel[89].rotateAngleY = -0.34906585F;

				bodyModel[90].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 181
				bodyModel[90].setRotationPoint(21.5F, -13F, -10F);

				bodyModel[91].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 182
				bodyModel[91].setRotationPoint(21.5F, -13F, 10F);

				bodyModel[92].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
				bodyModel[92].setRotationPoint(20.5F, -13F, -13F);
				bodyModel[92].rotateAngleY = -0.34906585F;

				bodyModel[93].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 184
				bodyModel[93].setRotationPoint(20.5F, -13F, 13F);
				bodyModel[93].rotateAngleY = 0.34906585F;

				bodyModel[94].addShapeBox(1.5F, -0.6F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
				bodyModel[94].setRotationPoint(19F, -13F, 0F);

				bodyModel[95].addShapeBox(2F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 186
				bodyModel[95].setRotationPoint(15F, -13F, -10F);
				bodyModel[95].rotateAngleY = -0.6981317F;

				bodyModel[96].addShapeBox(4F, -0.2F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 187
				bodyModel[96].setRotationPoint(15F, -13F, -10F);
				bodyModel[96].rotateAngleY = -0.6981317F;

				bodyModel[97].addShapeBox(0F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
				bodyModel[97].setRotationPoint(15F, -13F, -10F);
				bodyModel[97].rotateAngleY = -0.6981317F;

				bodyModel[98].addShapeBox(0F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
				bodyModel[98].setRotationPoint(15F, -13F, 10F);
				bodyModel[98].rotateAngleY = 0.6981317F;

				bodyModel[99].addShapeBox(2F, -0.2F, -4F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 190
				bodyModel[99].setRotationPoint(15F, -13F, 10F);
				bodyModel[99].rotateAngleY = 0.6981317F;

				bodyModel[100].addShapeBox(4F, -0.2F, -3F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 191
				bodyModel[100].setRotationPoint(15F, -13F, 10F);
				bodyModel[100].rotateAngleY = 0.6981317F;

				bodyModel[101].addShapeBox(-0.5F, -0.4F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 192
				bodyModel[101].setRotationPoint(15F, -13F, -10F);
				bodyModel[101].rotateAngleY = -0.6981317F;

				bodyModel[102].addShapeBox(-0.5F, -0.4F, 2.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 193
				bodyModel[102].setRotationPoint(15F, -13F, -10F);
				bodyModel[102].rotateAngleY = -0.6981317F;

				bodyModel[103].addShapeBox(-0.5F, -0.4F, 2.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 194
				bodyModel[103].setRotationPoint(15F, -13F, 10F);
				bodyModel[103].rotateAngleY = 0.6981317F;

				bodyModel[104].addShapeBox(-0.5F, -0.4F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 195
				bodyModel[104].setRotationPoint(15F, -13F, 10F);
				bodyModel[104].rotateAngleY = 0.6981317F;

				bodyModel[105].addShapeBox(-10F, 0F, -10F, 10, 2, 20, 0F, -4.9F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, -4.9F, 0F, -3F, 0F, 0F, -0.1F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0F, 0F, -0.1F); // Box 194
				bodyModel[105].setRotationPoint(-7F, -13F, 0F);

				bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
				bodyModel[106].setRotationPoint(-10F, -14F, 10F);

				bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
				bodyModel[107].setRotationPoint(-7F, -14F, 14F);

				bodyModel[108].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F, 0F, -0.7F, -0.5F, -0.5F, -0.7F, -6.9F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
				bodyModel[108].setRotationPoint(-7F, -14F, 7F);

				bodyModel[109].addShapeBox(0F, 0F, -7F, 3, 1, 7, 0F, -0.5F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
				bodyModel[109].setRotationPoint(-10F, -14F, -10F);

				bodyModel[110].addShapeBox(0F, 0F, -7F, 11, 1, 7, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -6.9F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.9F, 0F, 0F, 0F); // Box 199
				bodyModel[110].setRotationPoint(-7F, -14F, -7F);

				bodyModel[111].addShapeBox(0F, 0F, -3F, 13, 1, 3, 0F, 0F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -2.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 200
				bodyModel[111].setRotationPoint(-7F, -14F, -14F);

				bodyModel[112].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 201
				bodyModel[112].setRotationPoint(-3F, -14F, -16F);
				bodyModel[112].rotateAngleX = 0.50614548F;

				bodyModel[113].addShapeBox(0F, 0F, -3F, 4, 1, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
				bodyModel[113].setRotationPoint(-3F, -14F, -16F);
				bodyModel[113].rotateAngleX = 0.50614548F;

				bodyModel[114].addShapeBox(0F, 0F, -4F, 4, 1, 1, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
				bodyModel[114].setRotationPoint(-3F, -14F, -16F);
				bodyModel[114].rotateAngleX = 0.50614548F;

				bodyModel[115].addShapeBox(-3F, 0.02F, -3.25F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 204
				bodyModel[115].setRotationPoint(-3F, -14F, -16F);
				bodyModel[115].rotateAngleX = 0.36651914F;
				bodyModel[115].rotateAngleY = 0.78539816F;
				bodyModel[115].rotateAngleZ = 0.34906585F;

				bodyModel[116].addShapeBox(0F, 0F, -7F, 7, 1, 7, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
				bodyModel[116].setRotationPoint(-18F, -14F, -10F);

				bodyModel[117].addShapeBox(0F, 0F, -3F, 7, 3, 3, 0F, -1F, -2F, -0.3F, -4F, -2F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, 0F, -0.3F, -4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
				bodyModel[117].setRotationPoint(-18F, -14F, -17F);

				bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 207
				bodyModel[118].setRotationPoint(-37F, -13.2F, 10F);

				bodyModel[119].addShapeBox(0F, 0F, -10F, 7, 1, 10, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 208
				bodyModel[119].setRotationPoint(-37F, -13.2F, -10F);

				bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
				bodyModel[120].setRotationPoint(-30F, -13.5F, 18F);

				bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 210
				bodyModel[121].setRotationPoint(-30F, -31.5F, 18F);

				bodyModel[122].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F); // Box 211
				bodyModel[122].setRotationPoint(-30F, -13F, 17F);

				bodyModel[123].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 212
				bodyModel[123].setRotationPoint(-37F, -13F, 7F);

				bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
				bodyModel[124].setRotationPoint(-23F, -13F, 7F);

				bodyModel[125].addShapeBox(-5F, 0F, 0F, 7, 8, 3, 0F, 0F, -5.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5.5F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 214
				bodyModel[125].setRotationPoint(-37F, -13F, 7F);

				bodyModel[126].addShapeBox(0F, 0F, -3F, 14, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 215
				bodyModel[126].setRotationPoint(-37F, -13F, -7F);

				bodyModel[127].addShapeBox(0F, 0F, -3F, 3, 5, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
				bodyModel[127].setRotationPoint(-23F, -13F, -7F);

				bodyModel[128].addShapeBox(-5F, 0F, -3F, 7, 8, 3, 0F, 0F, -5.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -5.5F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F); // Box 217
				bodyModel[128].setRotationPoint(-37F, -13F, -7F);

				bodyModel[129].addShapeBox(0F, 5F, -20F, 16, 12, 8, 0F, -5F, 0F, -4F, -4F, -0.3F, -4F, -2F, -0.3F, -0.2F, -5F, 0F, -2F, -5F, 0F, -4F, -2.1F, -11.7F, -4F, -0.6F, -11.7F, -0.2F, -5.5F, 0F, -2F); // Box 218
				bodyModel[129].setRotationPoint(23F, -13F, 0F);

				bodyModel[130].addShapeBox(0F, 0F, -22F, 16, 6, 10, 0F, -3F, -3F, -4F, -4F, -4.3F, -5.65F, -2.6F, -4.27F, -0.55F, 0.5F, -1F, -3F, 0F, 0F, -3.5F, -2.1F, 0.3F, -6F, -0.6F, 0.3F, -0.2F, 0.5F, 0F, -3F); // Box 219
				bodyModel[130].setRotationPoint(23F, -14F, 0F);

				bodyModel[131].addShapeBox(0F, 0F, -20F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
				bodyModel[131].setRotationPoint(12F, -8F, 0F);

				bodyModel[132].addShapeBox(0F, 0F, 15F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 221
				bodyModel[132].setRotationPoint(12F, -8F, 0F);

				bodyModel[133].addShapeBox(0F, 0F, -20F, 14, 2, 3, 0F, 0F, 0F, -0.5F, -0.1F, -0.3F, -3F, -1.1F, -0.3F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.4F, 0F, -3F, -2.685F, 0F, 1F, 0F, 0F, 0F); // Box 222
				bodyModel[133].setRotationPoint(23F, -8F, 1F);

				bodyModel[134].addShapeBox(0F, 0F, 15F, 11, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 223
				bodyModel[134].setRotationPoint(12F, -8F, 0F);

				bodyModel[135].addShapeBox(0F, 0F, 15F, 14, 2, 3, 0F, 0F, 0F, 0F, -1.1F, -0.3F, 1F, -0.1F, -0.3F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.685F, 0F, 1F, -1.4F, 0F, -3F, 0F, 0F, -0.5F); // Box 224
				bodyModel[135].setRotationPoint(23F, -8F, 1F);

				bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
				bodyModel[136].setRotationPoint(-40F, -12F, 18F);

				bodyModel[137].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
				bodyModel[137].setRotationPoint(-40F, -12F, -18F);

				bodyModel[138].addShapeBox(-7.5F, 0F, -0.25F, 6, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 225
				bodyModel[138].setRotationPoint(-35F, -8F, 0F);
				bodyModel[138].rotateAngleZ = 0.34906585F;

				bodyModel[139].addShapeBox(-7.5F, 0F, -4.75F, 6, 1, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 226
				bodyModel[139].setRotationPoint(-35F, -8F, 0F);
				bodyModel[139].rotateAngleZ = 0.34906585F;

				bodyModel[140].addShapeBox(4F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
				bodyModel[140].setRotationPoint(26F, -13F, 0F);
				bodyModel[140].rotateAngleZ = -0.2268928F;

				bodyModel[141].addShapeBox(4F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 231
				bodyModel[141].setRotationPoint(26F, -13F, 0F);
				bodyModel[141].rotateAngleZ = -0.2268928F;

				bodyModel[142].addShapeBox(5F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 232
				bodyModel[142].setRotationPoint(26F, -13F, 0F);
				bodyModel[142].rotateAngleZ = -0.2268928F;

				bodyModel[143].addShapeBox(6F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 233
				bodyModel[143].setRotationPoint(26F, -13F, 0F);
				bodyModel[143].rotateAngleZ = -0.2268928F;

				bodyModel[144].addShapeBox(7F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 234
				bodyModel[144].setRotationPoint(26F, -13F, 0F);
				bodyModel[144].rotateAngleZ = -0.2268928F;

				bodyModel[145].addShapeBox(8F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 242
				bodyModel[145].setRotationPoint(26F, -13F, 0F);
				bodyModel[145].rotateAngleZ = -0.2268928F;

				bodyModel[146].addShapeBox(9F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 243
				bodyModel[146].setRotationPoint(26F, -13F, 0F);
				bodyModel[146].rotateAngleZ = -0.2268928F;

				bodyModel[147].addShapeBox(10F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 244
				bodyModel[147].setRotationPoint(26F, -13F, 0F);
				bodyModel[147].rotateAngleZ = -0.2268928F;

				bodyModel[148].addShapeBox(11F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 245
				bodyModel[148].setRotationPoint(26F, -13F, 0F);
				bodyModel[148].rotateAngleZ = -0.2268928F;

				bodyModel[149].addShapeBox(12F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 246
				bodyModel[149].setRotationPoint(26F, -13F, 0F);
				bodyModel[149].rotateAngleZ = -0.2268928F;

				bodyModel[150].addShapeBox(13F, -0.25F, 0F, 1, 1, 4, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 247
				bodyModel[150].setRotationPoint(26F, -13F, 0F);
				bodyModel[150].rotateAngleZ = -0.2268928F;

				bodyModel[151].addShapeBox(5F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
				bodyModel[151].setRotationPoint(26F, -13F, 0F);
				bodyModel[151].rotateAngleZ = -0.2268928F;

				bodyModel[152].addShapeBox(6F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
				bodyModel[152].setRotationPoint(26F, -13F, 0F);
				bodyModel[152].rotateAngleZ = -0.2268928F;

				bodyModel[153].addShapeBox(7F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
				bodyModel[153].setRotationPoint(26F, -13F, 0F);
				bodyModel[153].rotateAngleZ = -0.2268928F;

				bodyModel[154].addShapeBox(8F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
				bodyModel[154].setRotationPoint(26F, -13F, 0F);
				bodyModel[154].rotateAngleZ = -0.2268928F;

				bodyModel[155].addShapeBox(9F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
				bodyModel[155].setRotationPoint(26F, -13F, 0F);
				bodyModel[155].rotateAngleZ = -0.2268928F;

				bodyModel[156].addShapeBox(10F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
				bodyModel[156].setRotationPoint(26F, -13F, 0F);
				bodyModel[156].rotateAngleZ = -0.2268928F;

				bodyModel[157].addShapeBox(11F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
				bodyModel[157].setRotationPoint(26F, -13F, 0F);
				bodyModel[157].rotateAngleZ = -0.2268928F;

				bodyModel[158].addShapeBox(12F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
				bodyModel[158].setRotationPoint(26F, -13F, 0F);
				bodyModel[158].rotateAngleZ = -0.2268928F;

				bodyModel[159].addShapeBox(13F, -0.25F, -4F, 1, 1, 4, 0F, 1F, -0.48F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
				bodyModel[159].setRotationPoint(26F, -13F, 0F);
				bodyModel[159].rotateAngleZ = -0.2268928F;

				bodyModel[160].addShapeBox(14.45F, -0.25F, -11F, 3, 1, 11, 0F, 3.117F, -0.7F, 0F, -3.117F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.117F, 0F, 0F, -3.117F, 0.045F, 0F, 0F, -0.68F, 0F, 0F, 0F, 0F); // Box 258
				bodyModel[160].setRotationPoint(26F, -13F, 0F);
				bodyModel[160].rotateAngleZ = -0.2268928F;

				bodyModel[161].addShapeBox(14.45F, -0.25F, 0F, 3, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.117F, -0.7F, 0F, 3.117F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.68F, 0F, -3.117F, 0.045F, 0F, 3.117F, 0F, 0F); // Box 259
				bodyModel[161].setRotationPoint(26F, -13F, 0F);
				bodyModel[161].rotateAngleZ = -0.2268928F;

				bodyModel[162].addShapeBox(-1F, 0F, -2F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 260
				bodyModel[162].setRotationPoint(26F, -11F, -18F);

				bodyModel[163].addShapeBox(-1F, 0.4F, -2F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 261
				bodyModel[163].setRotationPoint(26F, -11F, -18F);

				bodyModel[164].addShapeBox(-1F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 262
				bodyModel[164].setRotationPoint(26F, -11F, 18F);

				bodyModel[165].addShapeBox(-1F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 263
				bodyModel[165].setRotationPoint(26F, -11F, 18F);

				bodyModel[166].addShapeBox(-1F, 0.4F, 0F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 264
				bodyModel[166].setRotationPoint(26F, -11F, 18F);

				bodyModel[167].addShapeBox(-2F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F); // Box 265
				bodyModel[167].setRotationPoint(26F, -11F, 18F);

				bodyModel[168].addShapeBox(-2F, -0.4F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F); // Box 266
				bodyModel[168].setRotationPoint(26F, -11F, 18F);

				bodyModel[169].addShapeBox(-2F, 0.4F, 0F, 1, 1, 2, 0F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F); // Box 267
				bodyModel[169].setRotationPoint(26F, -11F, 18F);

				bodyModel[170].addShapeBox(-2F, 0F, -2F, 1, 1, 2, 0F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, -0.25F); // Box 268
				bodyModel[170].setRotationPoint(26F, -11F, -18F);

				bodyModel[171].addShapeBox(-2F, -0.4F, -2F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F); // Box 269
				bodyModel[171].setRotationPoint(26F, -11F, -18F);

				bodyModel[172].addShapeBox(-2F, 0.4F, -2F, 1, 1, 2, 0F, -0.5F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, -0.25F, -0.5F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -0.25F, -0.7F); // Box 270
				bodyModel[172].setRotationPoint(26F, -11F, -18F);

				bodyModel[173].addShapeBox(-1F, 3F, 12F, 1, 4, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 272
				bodyModel[173].setRotationPoint(-43F, -5F, 0F);
				bodyModel[173].rotateAngleZ = 0.06981317F;

				bodyModel[174].addShapeBox(-1F, 3F, -13F, 1, 4, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 273
				bodyModel[174].setRotationPoint(-43F, -5F, 0F);
				bodyModel[174].rotateAngleZ = 0.06981317F;

				bodyModel[175].addShapeBox(-1F, 2.5F, 11F, 1, 3, 3, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 274
				bodyModel[175].setRotationPoint(-43F, -5F, 0F);
				bodyModel[175].rotateAngleZ = 0.06981317F;

				bodyModel[176].addShapeBox(-1F, 2.5F, 14F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F); // Box 275
				bodyModel[176].setRotationPoint(-43F, -5F, 0F);
				bodyModel[176].rotateAngleZ = 0.06981317F;

				bodyModel[177].addShapeBox(-1F, 2.5F, 10F, 1, 3, 1, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 276
				bodyModel[177].setRotationPoint(-43F, -5F, 0F);
				bodyModel[177].rotateAngleZ = 0.06981317F;

				bodyModel[178].addShapeBox(-1F, 2.5F, -14F, 1, 3, 3, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 277
				bodyModel[178].setRotationPoint(-43F, -5F, 0F);
				bodyModel[178].rotateAngleZ = 0.06981317F;

				bodyModel[179].addShapeBox(-1F, 2.5F, -11F, 1, 3, 1, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F); // Box 278
				bodyModel[179].setRotationPoint(-43F, -5F, 0F);
				bodyModel[179].rotateAngleZ = 0.06981317F;

				bodyModel[180].addShapeBox(-1F, 2.5F, -15F, 1, 3, 1, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 279
				bodyModel[180].setRotationPoint(-43F, -5F, 0F);
				bodyModel[180].rotateAngleZ = 0.06981317F;

				bodyModel[181].addShapeBox(-1F, 6F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
				bodyModel[181].setRotationPoint(-43F, -5F, 0F);
				bodyModel[181].rotateAngleZ = 0.06981317F;

				bodyModel[182].addShapeBox(2.5F, 0F, -14F, 5, 13, 28, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -14F, 0.5F, -2F, -14F, 0F, 0F, 0F); // Box 328
				bodyModel[182].setRotationPoint(26F, -9F, 0F);

				bodyModel[183].addShapeBox(0F, 0F, -9F, 12, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F); // Box 271
				bodyModel[183].setRotationPoint(-42F, 4F, 0F);

				bodyModel[184].addShapeBox(12F, 0F, -9F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 272
				bodyModel[184].setRotationPoint(-42F, 4F, 0F);

				bodyModel[185].addShapeBox(12F, 0F, -2F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 273
				bodyModel[185].setRotationPoint(-42F, 4F, 0F);

				bodyModel[186].addShapeBox(12F, 0F, 5F, 58, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -1F, -0.6F, 0F, -1F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 274
				bodyModel[186].setRotationPoint(-42F, 4F, 0F);

				bodyModel[187].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 275
				bodyModel[187].setRotationPoint(-7F, -13.2F, 16F);
				bodyModel[187].rotateAngleY = 1.06465084F;

				bodyModel[188].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 276
				bodyModel[188].setRotationPoint(-7F, -13.3F, -16F);
				bodyModel[188].rotateAngleY = -1.06465084F;

				bodyModel[189].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 277
				bodyModel[189].setRotationPoint(-16F, -11.4F, -4F);
				bodyModel[189].rotateAngleY = -3.14159265F;

				bodyModel[190].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 353
				bodyModel[190].setRotationPoint(26F, -11F, -18F);

				bodyModel[191].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, -1.3F, -0.3F, -0.9F, -1.3F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 354
				bodyModel[191].setRotationPoint(26F, -11F, -18F);

				bodyModel[192].addShapeBox(0F, -0.4F, -2F, 1, 1, 2, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.9F, -1.3F, 0F, -0.9F, -1.3F); // Box 355
				bodyModel[192].setRotationPoint(26F, -11F, -18F);

				bodyModel[193].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.9F, -1.3F, 0F, -0.9F, -1.3F); // Box 356
				bodyModel[193].setRotationPoint(26F, -11F, 18F);

				bodyModel[194].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, -0.3F, -0.9F, -0.7F, 0F, -0.9F, -0.7F); // Box 357
				bodyModel[194].setRotationPoint(26F, -11F, 18F);

				bodyModel[195].addShapeBox(0F, -0.4F, 0F, 1, 1, 2, 0F, 0F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.9F, -1.3F, -0.3F, -0.9F, -1.3F, -0.3F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 358
				bodyModel[195].setRotationPoint(26F, -11F, 18F);

				bodyModel[196].addShapeBox(6F, 0F, -1F, 16, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 363
				bodyModel[196].setRotationPoint(12F, -10F, -20F);
				bodyModel[196].rotateAngleY = 0.14835299F;
				bodyModel[196].rotateAngleZ = -0.13962634F;

				bodyModel[197].addShapeBox(20F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 364
				bodyModel[197].setRotationPoint(12F, -10F, -20F);
				bodyModel[197].rotateAngleY = 0.14835299F;
				bodyModel[197].rotateAngleZ = -0.13962634F;

				bodyModel[198].addShapeBox(9F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 365
				bodyModel[198].setRotationPoint(12F, -10F, -20F);
				bodyModel[198].rotateAngleY = 0.14835299F;
				bodyModel[198].rotateAngleZ = -0.13962634F;

				bodyModel[199].addShapeBox(6F, 0F, -1F, 3, 1, 1, 0F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F); // Box 366
				bodyModel[199].setRotationPoint(12F, -10F, -20F);
				bodyModel[199].rotateAngleY = 0.14835299F;
				bodyModel[199].rotateAngleZ = -0.13962634F;

				bodyModel[200].addShapeBox(2F, -1F, -1F, 3, 3, 1, 0F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 367
				bodyModel[200].setRotationPoint(12F, -10F, -20F);
				bodyModel[200].rotateAngleY = 0.14835299F;
				bodyModel[200].rotateAngleZ = -0.13962634F;

				bodyModel[201].addShapeBox(1F, -1F, -1F, 1, 3, 1, 0F, -0.5F, -0.5F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.22F, 0F, 0F, -0.22F, 0F, 0F, -0.6F, -0.5F, -0.5F, -0.6F); // Box 368
				bodyModel[201].setRotationPoint(12F, -10F, -20F);
				bodyModel[201].rotateAngleY = 0.14835299F;
				bodyModel[201].rotateAngleZ = -0.13962634F;

				bodyModel[202].addShapeBox(4F, 0F, -1F, 2, 1, 1, 0F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.6F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.6F); // Box 369
				bodyModel[202].setRotationPoint(12F, -10F, -20F);
				bodyModel[202].rotateAngleY = 0.14835299F;
				bodyModel[202].rotateAngleZ = -0.13962634F;

				bodyModel[203].addShapeBox(20F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 370
				bodyModel[203].setRotationPoint(12F, -10F, 20F);
				bodyModel[203].rotateAngleY = -0.14835299F;
				bodyModel[203].rotateAngleZ = -0.13962634F;

				bodyModel[204].addShapeBox(1F, 0F, 0F, 21, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371
				bodyModel[204].setRotationPoint(12F, -10F, 20F);
				bodyModel[204].rotateAngleY = -0.14835299F;
				bodyModel[204].rotateAngleZ = -0.13962634F;

				bodyModel[205].addShapeBox(9F, 0F, -1F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 372
				bodyModel[205].setRotationPoint(12F, -10F, 20F);
				bodyModel[205].rotateAngleY = -0.14835299F;
				bodyModel[205].rotateAngleZ = -0.13962634F;

				bodyModel[206].addShapeBox(0.9F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 373
				bodyModel[206].setRotationPoint(12F, -10F, 20F);
				bodyModel[206].rotateAngleY = -0.14835299F;
				bodyModel[206].rotateAngleZ = -0.13962634F;


				turretModel = new ModelRendererTurbo[58];
				turretModel[0] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 132
				turretModel[1] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 133
				turretModel[2] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 140
				turretModel[3] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 141
				turretModel[4] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 5
				turretModel[5] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 149
				turretModel[6] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 150
				turretModel[7] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 151
				turretModel[8] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 154
				turretModel[9] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 155
				turretModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 148
				turretModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 149
				turretModel[12] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 150
				turretModel[13] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 151
				turretModel[14] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 152
				turretModel[15] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 153
				turretModel[16] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 154
				turretModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 155
				turretModel[18] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 156
				turretModel[19] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 157
				turretModel[20] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 158
				turretModel[21] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 159
				turretModel[22] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 160
				turretModel[23] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 161
				turretModel[24] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 162
				turretModel[25] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 165
				turretModel[26] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 271
				turretModel[27] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 303
				turretModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 304
				turretModel[29] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 305
				turretModel[30] = new ModelRendererTurbo(this, 26, 219, textureX, textureY); // Box 0
				turretModel[31] = new ModelRendererTurbo(this, 14, 223, textureX, textureY); // Box 1
				turretModel[32] = new ModelRendererTurbo(this, 20, 219, textureX, textureY); // Box 2
				turretModel[33] = new ModelRendererTurbo(this, 14, 219, textureX, textureY); // Box 3
				turretModel[34] = new ModelRendererTurbo(this, 34, 214, textureX, textureY); // Box 4
				turretModel[35] = new ModelRendererTurbo(this, 46, 220, textureX, textureY); // Box 5
				turretModel[36] = new ModelRendererTurbo(this, 46, 214, textureX, textureY); // Box 6
				turretModel[37] = new ModelRendererTurbo(this, 46, 217, textureX, textureY); // Box 7
				turretModel[38] = new ModelRendererTurbo(this, 17, 211, textureX, textureY); // Box 74
				turretModel[39] = new ModelRendererTurbo(this, 3, 211, textureX, textureY); // Box 75
				turretModel[40] = new ModelRendererTurbo(this, 38, 219, textureX, textureY); // Box 78
				turretModel[41] = new ModelRendererTurbo(this, 32, 219, textureX, textureY); // Box 79
				turretModel[42] = new ModelRendererTurbo(this, 32, 211, textureX, textureY); // Box 80
				turretModel[43] = new ModelRendererTurbo(this, 43, 166, textureX, textureY); // Box 374
				turretModel[44] = new ModelRendererTurbo(this, 62, 164, textureX, textureY); // Box 375
				turretModel[45] = new ModelRendererTurbo(this, 43, 180, textureX, textureY); // Box 376
				turretModel[46] = new ModelRendererTurbo(this, 4, 175, textureX, textureY); // Box 377
				turretModel[47] = new ModelRendererTurbo(this, 0, 188, textureX, textureY); // Box 378
				turretModel[48] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Box 379
				turretModel[49] = new ModelRendererTurbo(this, 1, 164, textureX, textureY); // Box 380
				turretModel[50] = new ModelRendererTurbo(this, 66, 153, textureX, textureY); // Box 381
				turretModel[51] = new ModelRendererTurbo(this, 66, 158, textureX, textureY); // Box 382
				turretModel[52] = new ModelRendererTurbo(this, 16, 183, textureX, textureY); // Box 386
				turretModel[53] = new ModelRendererTurbo(this, 16, 192, textureX, textureY); // Box 387
				turretModel[54] = new ModelRendererTurbo(this, 16, 189, textureX, textureY); // Box 388
				turretModel[55] = new ModelRendererTurbo(this, 16, 183, textureX, textureY); // Box 389
				turretModel[56] = new ModelRendererTurbo(this, 16, 192, textureX, textureY); // Box 390
				turretModel[57] = new ModelRendererTurbo(this, 16, 189, textureX, textureY); // Box 391

				turretModel[0].addShapeBox(5F, -4F, -2F, 6, 4, 5, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 1F, 0F); // Box 132
				turretModel[0].setRotationPoint(6F, -14F, 0F);

				turretModel[1].addShapeBox(8.5F, -4F, -2F, 1, 4, 5, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 133
				turretModel[1].setRotationPoint(8F, -14F, 0F);

				turretModel[2].addShapeBox(7F, -4F, -3.5F, 2, 4, 2, 0F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.25F, 0.5F, 0F, 0F, 0.5F); // Box 140
				turretModel[2].setRotationPoint(8F, -14F, 0F);

				turretModel[3].addShapeBox(7F, -4F, -3.5F, 4, 4, 2, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 141
				turretModel[3].setRotationPoint(4F, -14F, 0F);

				turretModel[4].addShapeBox(4F, -5F, -1F, 6, 1, 4, 0F, 0F, -0.8F, -0.1F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 5
				turretModel[4].setRotationPoint(6F, -14F, 0F);

				turretModel[5].addShapeBox(-3F, -4F, -12F, 6, 5, 24, 0F, -1F, 0F, -5F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
				turretModel[5].setRotationPoint(6F, -14F, 0F);

				turretModel[6].addShapeBox(3F, -4F, -12F, 4, 5, 24, 0F, 1F, 0F, -6F, -2F, 0F, -9F, -2F, 0F, -9F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 150
				turretModel[6].setRotationPoint(6F, -14F, 0F);

				turretModel[7].addShapeBox(7F, -4F, -10F, 4, 5, 20, 0F, 2F, 0F, -7F, -5.9F, 0F, -7F, -5.9F, 0F, -7F, 2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 151
				turretModel[7].setRotationPoint(6F, -14F, 0F);

				turretModel[8].addShapeBox(-7F, -4F, -12F, 4, 5, 24, 0F, -1F, 0F, -6F, 1F, 0F, -5F, 1F, 0F, -5F, -1F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 154
				turretModel[8].setRotationPoint(6F, -14F, 0F);

				turretModel[9].addShapeBox(-11F, -4F, -10F, 4, 5, 20, 0F, -3F, 0F, -7F, 1F, 0F, -4F, 1F, 0F, -4F, -3F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 155
				turretModel[9].setRotationPoint(6F, -14F, 0F);

				turretModel[10].addShapeBox(2F, -5F, 3F, 1, 1, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 148
				turretModel[10].setRotationPoint(6F, -14F, 0F);

				turretModel[11].addShapeBox(2F, -5.5F, 3F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 149
				turretModel[11].setRotationPoint(6F, -14F, 0F);

				turretModel[12].addShapeBox(3F, -5.5F, 3F, 1, 1, 2, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 150
				turretModel[12].setRotationPoint(6F, -14F, 0F);

				turretModel[13].addShapeBox(-0.5F, -4.2F, -2F, 1, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 151
				turretModel[13].setRotationPoint(6F, -14F, 0F);

				turretModel[14].addShapeBox(-4.5F, -4.2F, -2F, 4, 1, 7, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 152
				turretModel[14].setRotationPoint(6F, -14F, 0F);

				turretModel[15].addShapeBox(-6.5F, -4.2F, -2F, 1, 1, 7, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 153
				turretModel[15].setRotationPoint(6F, -14F, 0F);

				turretModel[16].addShapeBox(0F, -4.5F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 154
				turretModel[16].setRotationPoint(6F, -14F, 0F);

				turretModel[17].addShapeBox(0F, -4.5F, 3F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 155
				turretModel[17].setRotationPoint(6F, -14F, 0F);

				turretModel[18].addShapeBox(-4F, -5F, 6F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156
				turretModel[18].setRotationPoint(6F, -14F, 0F);

				turretModel[19].addShapeBox(-1F, -1F, -1F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
				turretModel[19].setRotationPoint(2F, -18F, -2.5F);
				turretModel[19].rotateAngleY = -0.26179939F;

				turretModel[20].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
				turretModel[20].setRotationPoint(8F, -18F, 1.5F);
				turretModel[20].rotateAngleY = -0.17453293F;

				turretModel[21].addShapeBox(-1F, -1F, -1F, 1, 1, 2, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 159
				turretModel[21].setRotationPoint(6.5F, -18F, 5.9F);
				turretModel[21].rotateAngleY = 0.90757121F;

				turretModel[22].addShapeBox(1F, -4.5F, -5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 160
				turretModel[22].setRotationPoint(6F, -14F, 0F);

				turretModel[23].addShapeBox(1F, -5.5F, -5F, 1, 1, 1, 0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 161
				turretModel[23].setRotationPoint(6F, -14F, 0F);

				turretModel[24].addShapeBox(1.5F, -6.2F, -5.5F, 1, 1, 2, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 162
				turretModel[24].setRotationPoint(6F, -14F, 0F);

				turretModel[25].addShapeBox(1.5F, -5.8F, -5.5F, 1, 1, 2, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 165
				turretModel[25].setRotationPoint(6F, -14F, 0F);

				turretModel[26].addShapeBox(1.5F, -6.6F, -5.5F, 1, 1, 2, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 271
				turretModel[26].setRotationPoint(6F, -14F, 0F);

				turretModel[27].addShapeBox(0.5F, -6.6F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.2F, -0.7F, -0.7F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.4F, -0.2F); // Box 303
				turretModel[27].setRotationPoint(6F, -14F, 0F);

				turretModel[28].addShapeBox(0.5F, -5.8F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.4F, -0.2F, -0.7F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, -0.2F, -0.7F); // Box 304
				turretModel[28].setRotationPoint(6F, -14F, 0F);

				turretModel[29].addShapeBox(0.5F, -6.2F, -5.5F, 1, 1, 2, 0F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, -0.2F, -0.7F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, -0.2F); // Box 305
				turretModel[29].setRotationPoint(6F, -14F, 0F);

				turretModel[30].addShapeBox(-5F, -6F, -6F, 1, 2, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
				turretModel[30].setRotationPoint(6F, -14F, 0F);

				turretModel[31].addShapeBox(-5F, -8F, -6F, 5, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
				turretModel[31].setRotationPoint(6F, -14F, 0F);

				turretModel[32].addShapeBox(-5.5F, -8F, -6F, 1, 2, 1, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F); // Box 2
				turretModel[32].setRotationPoint(6F, -14F, 0F);

				turretModel[33].addShapeBox(-1F, -8F, -6F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F); // Box 3
				turretModel[33].setRotationPoint(6F, -14F, 0F);

				turretModel[34].addShapeBox(-4F, -8F, -6F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
				turretModel[34].setRotationPoint(6F, -14F, 0F);

				turretModel[35].addShapeBox(-5F, -8.5F, -6F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
				turretModel[35].setRotationPoint(6F, -14F, 0F);

				turretModel[36].addShapeBox(-5F, -5.5F, -6F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 6
				turretModel[36].setRotationPoint(6F, -14F, 0F);

				turretModel[37].addShapeBox(-5F, -9F, -6F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 7
				turretModel[37].setRotationPoint(6F, -14F, 0F);

				turretModel[38].addShapeBox(-5F, -7.9F, -6F, 5, 1, 1, 0F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F); // Box 74
				turretModel[38].setRotationPoint(6F, -14F, 0F);

				turretModel[39].addShapeBox(-5F, -6.9F, -6F, 5, 1, 1, 0F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -0.5F, -0.4F, 0.01F, -1F, -0.4F, 0.01F); // Box 75
				turretModel[39].setRotationPoint(6F, -14F, 0F);

				turretModel[40].addShapeBox(-6.5F, -7.5F, -6F, 1, 1, 1, 0F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F); // Box 78
				turretModel[40].setRotationPoint(6F, -14F, 0F);

				turretModel[41].addShapeBox(-5.2F, -7F, -5F, 1, 1, 1, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F); // Box 79
				turretModel[41].setRotationPoint(6F, -14F, 0F);

				turretModel[42].addShapeBox(-6.75F, -7.5F, -6F, 1, 1, 1, 0F, -0.75F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.1F, -0.75F, -0.7F, -0.1F, -0.75F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F); // Box 80
				turretModel[42].setRotationPoint(6F, -14F, 0F);

				turretModel[43].addShapeBox(-4F, 0F, -4.5F, 4, 4, 9, 0F, -2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 374
				turretModel[43].setRotationPoint(-2F, -18F, 0F);

				turretModel[44].addShapeBox(-4F, 0F, 2.5F, 6, 4, 5, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F); // Box 375
				turretModel[44].setRotationPoint(-2F, -18F, 0F);

				turretModel[45].addShapeBox(-4F, 0F, -7.5F, 6, 4, 5, 0F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.1F, 0F, 0F, -2.1F); // Box 376
				turretModel[45].setRotationPoint(-2F, -18F, 0F);

				turretModel[46].addShapeBox(-2F, -1F, -3F, 2, 1, 6, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
				turretModel[46].setRotationPoint(-2F, -18F, 0F);

				turretModel[47].addShapeBox(-2F, -1F, 3F, 4, 1, 3, 0F, -0.5F, -0.5F, 0.2F, -2.5F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -2.5F, -0.5F, -0.3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 378
				turretModel[47].setRotationPoint(-2F, -18F, 0F);

				turretModel[48].addShapeBox(-2F, -1F, -6F, 4, 1, 3, 0F, -2.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -2.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 379
				turretModel[48].setRotationPoint(-2F, -18F, 0F);

				turretModel[49].addShapeBox(-4F, 4F, -4.5F, 2, 1, 9, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F); // Box 380
				turretModel[49].setRotationPoint(-2F, -18F, 0F);

				turretModel[50].addShapeBox(-4F, 4F, 4.5F, 4, 1, 3, 0F, 0F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F); // Box 381
				turretModel[50].setRotationPoint(-2F, -18F, 0F);

				turretModel[51].addShapeBox(-4F, 4F, -7.5F, 4, 1, 3, 0F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -2.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 382
				turretModel[51].setRotationPoint(-2F, -18F, 0F);

				turretModel[52].addShapeBox(-4F, 0F, -3F, 4, 4, 1, 0F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.9F, 0F, -0.3F, 0.1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 386
				turretModel[52].setRotationPoint(-2F, -18F, 0F);

				turretModel[53].addShapeBox(-2F, -1F, -3F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 387
				turretModel[53].setRotationPoint(-2F, -18F, 0F);

				turretModel[54].addShapeBox(-4F, 4F, -3F, 2, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F); // Box 388
				turretModel[54].setRotationPoint(-2F, -18F, 0F);

				turretModel[55].addShapeBox(-4F, 0F, 2F, 4, 4, 1, 0F, -1.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.9F, 0F, -0.3F, 0.1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 389
				turretModel[55].setRotationPoint(-2F, -18F, 0F);

				turretModel[56].addShapeBox(-2F, -1F, 2F, 2, 1, 1, 0F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 390
				turretModel[56].setRotationPoint(-2F, -18F, 0F);

				turretModel[57].addShapeBox(-4F, 4F, 2F, 2, 1, 1, 0F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F); // Box 391
				turretModel[57].setRotationPoint(-2F, -18F, 0F);


				barrelModel = new ModelRendererTurbo[77];
				barrelModel[0] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 134
				barrelModel[1] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 135
				barrelModel[2] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 136
				barrelModel[3] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 137
				barrelModel[4] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 139
				barrelModel[5] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 142
				barrelModel[6] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 0
				barrelModel[7] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 1
				barrelModel[8] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 2
				barrelModel[9] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 3
				barrelModel[10] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 4
				barrelModel[11] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 148
				barrelModel[12] = new ModelRendererTurbo(this, 141, 169, textureX, textureY); // Box 278
				barrelModel[13] = new ModelRendererTurbo(this, 141, 163, textureX, textureY); // Box 279
				barrelModel[14] = new ModelRendererTurbo(this, 141, 157, textureX, textureY); // Box 280
				barrelModel[15] = new ModelRendererTurbo(this, 14, 214, textureX, textureY); // Box 8
				barrelModel[16] = new ModelRendererTurbo(this, 3, 234, textureX, textureY); // Box 10
				barrelModel[17] = new ModelRendererTurbo(this, 3, 231, textureX, textureY); // Box 11
				barrelModel[18] = new ModelRendererTurbo(this, 3, 228, textureX, textureY); // Box 12
				barrelModel[19] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 20
				barrelModel[20] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 21
				barrelModel[21] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 32
				barrelModel[22] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 36
				barrelModel[23] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 37
				barrelModel[24] = new ModelRendererTurbo(this, 9, 243, textureX, textureY); // Box 40
				barrelModel[25] = new ModelRendererTurbo(this, 9, 240, textureX, textureY); // Box 41
				barrelModel[26] = new ModelRendererTurbo(this, 9, 237, textureX, textureY); // Box 42
				barrelModel[27] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 43
				barrelModel[28] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 46
				barrelModel[29] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 47
				barrelModel[30] = new ModelRendererTurbo(this, 3, 240, textureX, textureY); // Box 51
				barrelModel[31] = new ModelRendererTurbo(this, 3, 243, textureX, textureY); // Box 52
				barrelModel[32] = new ModelRendererTurbo(this, 3, 237, textureX, textureY); // Box 53
				barrelModel[33] = new ModelRendererTurbo(this, 49, 223, textureX, textureY); // Box 54
				barrelModel[34] = new ModelRendererTurbo(this, 41, 235, textureX, textureY); // Box 55
				barrelModel[35] = new ModelRendererTurbo(this, 41, 232, textureX, textureY); // Box 56
				barrelModel[36] = new ModelRendererTurbo(this, 41, 229, textureX, textureY); // Box 57
				barrelModel[37] = new ModelRendererTurbo(this, 41, 226, textureX, textureY); // Box 58
				barrelModel[38] = new ModelRendererTurbo(this, 41, 223, textureX, textureY); // Box 59
				barrelModel[39] = new ModelRendererTurbo(this, 35, 235, textureX, textureY); // Box 60
				barrelModel[40] = new ModelRendererTurbo(this, 35, 232, textureX, textureY); // Box 61
				barrelModel[41] = new ModelRendererTurbo(this, 35, 229, textureX, textureY); // Box 62
				barrelModel[42] = new ModelRendererTurbo(this, 35, 226, textureX, textureY); // Box 63
				barrelModel[43] = new ModelRendererTurbo(this, 35, 223, textureX, textureY); // Box 64
				barrelModel[44] = new ModelRendererTurbo(this, 29, 235, textureX, textureY); // Box 65
				barrelModel[45] = new ModelRendererTurbo(this, 29, 232, textureX, textureY); // Box 67
				barrelModel[46] = new ModelRendererTurbo(this, 29, 229, textureX, textureY); // Box 68
				barrelModel[47] = new ModelRendererTurbo(this, 29, 226, textureX, textureY); // Box 69
				barrelModel[48] = new ModelRendererTurbo(this, 29, 223, textureX, textureY); // Box 70
				barrelModel[49] = new ModelRendererTurbo(this, 14, 240, textureX, textureY); // Box 71
				barrelModel[50] = new ModelRendererTurbo(this, 19, 237, textureX, textureY); // Box 72
				barrelModel[51] = new ModelRendererTurbo(this, 14, 237, textureX, textureY); // Box 73
				barrelModel[52] = new ModelRendererTurbo(this, 49, 229, textureX, textureY); // Box 76
				barrelModel[53] = new ModelRendererTurbo(this, 49, 226, textureX, textureY); // Box 77
				barrelModel[54] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 81
				barrelModel[55] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 82
				barrelModel[56] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 83
				barrelModel[57] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 84
				barrelModel[58] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 85
				barrelModel[59] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 86
				barrelModel[60] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 87
				barrelModel[61] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 88
				barrelModel[62] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 89
				barrelModel[63] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 90
				barrelModel[64] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 91
				barrelModel[65] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 92
				barrelModel[66] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 93
				barrelModel[67] = new ModelRendererTurbo(this, 3, 225, textureX, textureY); // Box 94
				barrelModel[68] = new ModelRendererTurbo(this, 3, 222, textureX, textureY); // Box 95
				barrelModel[69] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 96
				barrelModel[70] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 97
				barrelModel[71] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 98
				barrelModel[72] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Box 99
				barrelModel[73] = new ModelRendererTurbo(this, 9, 222, textureX, textureY); // Box 100
				barrelModel[74] = new ModelRendererTurbo(this, 91, 31, textureX, textureY); // Box 359
				barrelModel[75] = new ModelRendererTurbo(this, 86, 31, textureX, textureY); // Box 360
				barrelModel[76] = new ModelRendererTurbo(this, 81, 31, textureX, textureY); // Box 361

				barrelModel[0].addShapeBox(1.25F, -2F, -1F, 2, 4, 2, 0F, 0F, 0.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.2F, 0F); // Box 134
				barrelModel[0].setRotationPoint(16F, -16F, 0F);

				barrelModel[1].addShapeBox(0.25F, -2F, -1.5F, 1, 4, 4, 0F, -0.25F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.25F, -0.25F, 0.2F, 0.25F, -0.25F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.25F, -0.25F, 0.2F, 0.25F); // Box 135
				barrelModel[1].setRotationPoint(16F, -16F, 0F);

				barrelModel[2].addShapeBox(1.25F, -1F, -2.5F, 2, 2, 1, 0F, 0F, 0F, 0.5F, 0.5F, -0.7F, -0.2F, 0.5F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0.5F, -0.7F, -0.2F, 0.5F, -0.7F, 0F, 0F, 0.5F, 0F); // Box 136
				barrelModel[2].setRotationPoint(16F, -16F, 0F);

				barrelModel[3].addShapeBox(1F, -1F, -1F, 9, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 137
				barrelModel[3].setRotationPoint(16F, -16F, 0F);

				barrelModel[4].addShapeBox(0F, -0.5F, -2.4F, 5, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 139
				barrelModel[4].setRotationPoint(16F, -16F, 0F);

				barrelModel[5].addShapeBox(0.75F, -2F, -3F, 1, 4, 1, 0F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F); // Box 142
				barrelModel[5].setRotationPoint(16F, -16F, 0F);

				barrelModel[6].addShapeBox(1.25F, -2F, 1F, 2, 4, 2, 0F, 0F, 0.2F, -0.5F, 0.5F, -1.9F, -0.5F, 0.5F, -1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0.5F, -1.9F, -0.5F, 0.5F, -1.9F, -0.25F, 0F, 0.2F, -0.25F); // Box 0
				barrelModel[6].setRotationPoint(16F, -16F, 0F);

				barrelModel[7].addShapeBox(1.25F, -2F, -2.5F, 2, 4, 1, 0F, 0F, -0.5F, -1F, 0.5F, -1.7F, -1F, 0.5F, -1F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, -1F, 0.5F, -1.7F, -1F, 0.5F, -1F, 0.5F, 0F, 0.2F, 0.5F); // Box 1
				barrelModel[7].setRotationPoint(16F, -16F, 0F);

				barrelModel[8].addShapeBox(1.25F, -2F, 1.5F, 2, 4, 1, 0F, 0F, 0.2F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1.9F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1.9F, -1F, 0F, 0.2F, -1F); // Box 2
				barrelModel[8].setRotationPoint(16F, -16F, 0F);

				barrelModel[9].addShapeBox(10F, -1F, -1F, 1, 2, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.1F, -0.1F); // Box 3
				barrelModel[9].setRotationPoint(16F, -16F, 0F);

				barrelModel[10].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F); // Box 4
				barrelModel[10].setRotationPoint(16F, -16F, 0F);

				barrelModel[11].addShapeBox(0.75F, -2F, -2.5F, 1, 4, 1, 0F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.2F, 0.5F, 0.25F, 0.2F, 0.5F, 0.25F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0.2F, 0.5F, 0.25F, 0.2F, 0.5F); // Box 148
				barrelModel[11].setRotationPoint(16F, -16F, 0F);

				barrelModel[12].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -1.6F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278
				barrelModel[12].setRotationPoint(16F, -16F, 0F);

				barrelModel[13].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F); // Box 279
				barrelModel[13].setRotationPoint(16F, -16F, 0F);

				barrelModel[14].addShapeBox(11F, -1F, -1F, 13, 2, 2, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F); // Box 280
				barrelModel[14].setRotationPoint(16F, -16F, 0F);

				barrelModel[15].addShapeBox(-4F, -1F, -0.5F, 8, 1, 1, 0F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F); // Box 8
				barrelModel[15].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[16].addShapeBox(-6F, -1.9F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F); // Box 10
				barrelModel[16].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[17].addShapeBox(-6F, -2.5F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F); // Box 11
				barrelModel[17].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[18].addShapeBox(-6F, -1.3F, -0.5F, 13, 1, 1, 0F, 0.5F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0.5F, -0.2F, 0.4F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F); // Box 12
				barrelModel[18].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[19].addShapeBox(2F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 20
				barrelModel[19].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[20].addShapeBox(2F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 21
				barrelModel[20].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[21].addShapeBox(-7F, -2.55F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Box 32
				barrelModel[21].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[22].addShapeBox(-7F, -1.9F, -0.65F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Box 36
				barrelModel[22].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[23].addShapeBox(-7F, -2.55F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.15F, 0.4F, -0.5F, -0.15F, 0.4F, -0.5F, -0.15F, -1.3F, 0F, -0.15F, -1.3F); // Box 37
				barrelModel[23].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[24].addShapeBox(-7F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F); // Box 40
				barrelModel[24].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[25].addShapeBox(-7F, -2.4F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F); // Box 41
				barrelModel[25].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[26].addShapeBox(-7F, -1.4F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 42
				barrelModel[26].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[27].addShapeBox(7F, -1.9F, -0.6F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.25F, -0.2F, 0.3F, -0.25F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.25F, -0.2F, 0.3F, -0.25F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Box 43
				barrelModel[27].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[28].addShapeBox(7F, -2.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // Box 46
				barrelModel[28].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[29].addShapeBox(7F, -2.5F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -1.25F, 0F, -0.2F, -1.25F); // Box 47
				barrelModel[29].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[30].addShapeBox(7.65F, -1.3F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 51
				barrelModel[30].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[31].addShapeBox(7.65F, -0.7F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 52
				barrelModel[31].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[32].addShapeBox(7.65F, -0.1F, 0.7F, 1, 1, 1, 0F, 0F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, -0.9F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, -0.9F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 53
				barrelModel[32].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[33].addShapeBox(-0.5F, -1F, 0.4F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
				barrelModel[33].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[34].addShapeBox(-0.5F, -2F, 0.9F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F); // Box 55
				barrelModel[34].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[35].addShapeBox(-0.5F, -3F, 0.65F, 2, 1, 1, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
				barrelModel[35].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[36].addShapeBox(-0.5F, -3.5F, 0.65F, 2, 1, 1, 0F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, 0F, 0.2F, -0.15F); // Box 57
				barrelModel[36].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[37].addShapeBox(-1F, -3F, 0.65F, 1, 1, 1, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 58
				barrelModel[37].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[38].addShapeBox(-1F, -3.5F, 0.65F, 1, 1, 1, 0F, 0.15F, -0.1F, -0.15F, -0.5F, -0.1F, -0.15F, -0.5F, -0.1F, -0.15F, 0.15F, -0.1F, -0.15F, 0F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, -0.5F, 0.2F, -0.15F, 0F, 0.2F, -0.15F); // Box 59
				barrelModel[38].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[39].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.02F, -0.15F, -0.5F, -0.02F, -0.15F, -0.5F, -0.02F, -0.15F, 0F, -0.02F, -0.15F, 0F, -0.9F, -0.125F, -0.5F, -0.9F, -0.125F, -0.5F, -0.9F, -0.125F, 0F, -0.9F, -0.125F); // Box 60
				barrelModel[39].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[40].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, 0.25F, -0.8F, -0.5F, 0.25F, -0.8F, -0.5F, 0.25F, -0.125F, 0F, 0.25F, -0.125F); // Box 61
				barrelModel[40].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[41].addShapeBox(1F, -3.55F, 0.65F, 1, 1, 1, 0F, 0F, -0.1F, -0.125F, -0.5F, -0.1F, -0.125F, -0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0.25F, -0.125F, -0.5F, 0.25F, -0.125F, -0.5F, 0.25F, -0.8F, 0F, 0.25F, -0.8F); // Box 62
				barrelModel[41].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[42].addShapeBox(1F, -2.8F, 0.65F, 1, 1, 1, 0F, 0F, -0.02F, -0.2F, -0.6F, -0.02F, -0.2F, -0.6F, -0.02F, -0.2F, 0F, -0.02F, -0.2F, 0F, -0.9F, -0.2F, -0.6F, -0.9F, -0.2F, -0.6F, -0.9F, -0.2F, 0F, -0.9F, -0.2F); // Box 63
				barrelModel[42].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[43].addShapeBox(1F, -2.95F, 0.65F, 1, 1, 1, 0F, 0F, -0.9F, -0.3F, -0.65F, -0.9F, -0.3F, -0.65F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.02F, -0.25F, -0.7F, -0.02F, -0.25F, -0.7F, -0.02F, -0.25F, 0F, -0.02F, -0.25F); // Box 64
				barrelModel[43].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[44].addShapeBox(1F, -2.3F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.67F, -0.25F, -0.7F, -0.67F, -0.25F, -0.65F, -0.75F, -0.7F, 0F, -0.75F, -0.7F); // Box 65
				barrelModel[44].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[45].addShapeBox(1F, -2.3F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.75F, -0.7F, -0.65F, -0.75F, -0.7F, -0.7F, -0.67F, -0.25F, 0F, -0.67F, -0.25F); // Box 67
				barrelModel[45].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[46].addShapeBox(-0.4F, -0.5F, 0.65F, 1, 1, 1, 0F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F, -0.26F, 0.5F, -0.26F); // Box 68
				barrelModel[46].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[47].addShapeBox(-0.4F, 1F, 0.65F, 1, 1, 1, 0F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F); // Box 69
				barrelModel[47].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[48].addShapeBox(-1F, -3.5F, 0.65F, 1, 1, 1, 0F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0.15F, -0.9F, -0.15F, -0.5F, -0.9F, -0.15F, -0.5F, -0.9F, -0.15F, 0.15F, -0.9F, -0.15F); // Box 70
				barrelModel[48].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[49].addShapeBox(-4F, -1.3F, -0.5F, 8, 1, 1, 0F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 71
				barrelModel[49].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[50].addShapeBox(-4F, -1F, -0.5F, 1, 1, 1, 0F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, -0.55F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 72
				barrelModel[50].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[51].addShapeBox(-5F, -1F, -0.5F, 1, 1, 1, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 73
				barrelModel[51].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[52].addShapeBox(-0.4F, -0.5F, 0.65F, 1, 1, 1, 0F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F); // Box 76
				barrelModel[52].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[53].addShapeBox(-0.4F, 0.1F, 0.65F, 1, 1, 1, 0F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F, -0.23F, -0.4F, -0.23F); // Box 77
				barrelModel[53].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[54].addShapeBox(7F, -1.3F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, -0.25F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 81
				barrelModel[54].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[55].addShapeBox(7F, -1.3F, -0.55F, 1, 1, 1, 0F, 0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, -1.25F, 0F, -0.2F, -1.25F, 0F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // Box 82
				barrelModel[55].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[56].addShapeBox(7F, -1.9F, -0.4F, 1, 1, 1, 0F, 0F, -0.2F, -1.2F, -0.25F, -0.2F, -1.2F, -0.25F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -1.2F, -0.25F, -0.2F, -1.2F, -0.25F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 83
				barrelModel[56].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[57].addShapeBox(7F, -2.5F, -0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -1.25F, -0.25F, -0.2F, -1.25F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F); // Box 84
				barrelModel[57].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[58].addShapeBox(7F, -1.3F, -0.45F, 1, 1, 1, 0F, 0F, -0.2F, -1.25F, -0.25F, -0.2F, -1.25F, -0.25F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 85
				barrelModel[58].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[59].addShapeBox(2F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 86
				barrelModel[59].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[60].addShapeBox(3F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 87
				barrelModel[60].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[61].addShapeBox(3F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 88
				barrelModel[61].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[62].addShapeBox(3F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 89
				barrelModel[62].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[63].addShapeBox(-2F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 90
				barrelModel[63].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[64].addShapeBox(-2F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 91
				barrelModel[64].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[65].addShapeBox(-2F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 92
				barrelModel[65].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[66].addShapeBox(-3F, -1.3F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, -0.2F); // Box 93
				barrelModel[66].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[67].addShapeBox(-3F, -1.9F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 94
				barrelModel[67].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[68].addShapeBox(-3F, -2.5F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.15F, -0.2F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F, -0.25F, -0.2F, 0.45F); // Box 95
				barrelModel[68].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[69].addShapeBox(-7F, -1.25F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 96
				barrelModel[69].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[70].addShapeBox(-7F, -1.25F, -0.55F, 1, 1, 1, 0F, 0F, -0.15F, 0.4F, -0.5F, -0.15F, 0.4F, -0.5F, -0.15F, -1.3F, 0F, -0.15F, -1.3F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.3F, -0.75F, 0F, -0.3F, -0.75F); // Box 97
				barrelModel[70].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[71].addShapeBox(-7F, -2.55F, -0.45F, 1, 1, 1, 0F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.15F, -1.3F, -0.5F, -0.15F, -1.3F, -0.5F, -0.15F, 0.4F, 0F, -0.15F, 0.4F); // Box 98
				barrelModel[71].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[72].addShapeBox(-7F, -1.9F, 1.15F, 1, 1, 1, 0F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, -1.2F, 0F, -0.2F, -1.2F); // Box 99
				barrelModel[72].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[73].addShapeBox(-7F, -1.25F, -0.45F, 1, 1, 1, 0F, 0F, -0.15F, -1.3F, -0.5F, -0.15F, -1.3F, -0.5F, -0.15F, 0.4F, 0F, -0.15F, 0.4F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F, -0.5F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 100
				barrelModel[73].setRotationPoint(1.5F, -22.5F, -5.5F);

				barrelModel[74].addShapeBox(2.6F, -2F, -1F, 1, 1, 1, 0F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 359
				barrelModel[74].setRotationPoint(16F, -16F, 0F);

				barrelModel[75].addShapeBox(2.6F, -2F, 0F, 1, 1, 1, 0F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 360
				barrelModel[75].setRotationPoint(16F, -16F, 0F);

				barrelModel[76].addShapeBox(2.6F, -2F, -0.5F, 1, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
				barrelModel[76].setRotationPoint(16F, -16F, 0F);


				leftTrackWheelModels = new ModelRendererTurbo[11];
				leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 64
				leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 65
				leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 66
				leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 67
				leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 68
				leftTrackWheelModels[5] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Shape 69
				leftTrackWheelModels[6] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Shape 70
				leftTrackWheelModels[7] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 73
				leftTrackWheelModels[8] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 74
				leftTrackWheelModels[9] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 75
				leftTrackWheelModels[10] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 76

				leftTrackWheelModels[0].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 64
				leftTrackWheelModels[0].setRotationPoint(17F, 5.5F, 19F);

				leftTrackWheelModels[1].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 65
				leftTrackWheelModels[1].setRotationPoint(6F, 5.5F, 19F);

				leftTrackWheelModels[2].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 66
				leftTrackWheelModels[2].setRotationPoint(-5F, 5.5F, 19F);

				leftTrackWheelModels[3].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 67
				leftTrackWheelModels[3].setRotationPoint(-16F, 5.5F, 19F);

				leftTrackWheelModels[4].addShape3D(4F, -4F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 68
				leftTrackWheelModels[4].setRotationPoint(-28F, 5.5F, 19F);

				leftTrackWheelModels[5].addShape3D(3F, -3F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 69
				leftTrackWheelModels[5].setRotationPoint(-39F, 0.5F, 19F);

				leftTrackWheelModels[6].addShape3D(3F, -3F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 70
				leftTrackWheelModels[6].setRotationPoint(28F, 0.5F, 19F);

				leftTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 73
				leftTrackWheelModels[7].setRotationPoint(10.5F, -2.5F, 19F);

				leftTrackWheelModels[8].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 74
				leftTrackWheelModels[8].setRotationPoint(0.5F, -2.5F, 19F);

				leftTrackWheelModels[9].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 75
				leftTrackWheelModels[9].setRotationPoint(-11.5F, -2.5F, 19F);

				leftTrackWheelModels[10].addShape3D(1.5F, -1.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 76
				leftTrackWheelModels[10].setRotationPoint(-22.5F, -2F, 19F);


				rightTrackWheelModels = new ModelRendererTurbo[11];
				rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 64
				rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 65
				rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 66
				rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 67
				rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Shape 68
				rightTrackWheelModels[5] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Shape 69
				rightTrackWheelModels[6] = new ModelRendererTurbo(this, 30, 154, textureX, textureY); // Shape 70
				rightTrackWheelModels[7] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 73
				rightTrackWheelModels[8] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 74
				rightTrackWheelModels[9] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 75
				rightTrackWheelModels[10] = new ModelRendererTurbo(this, 52, 158, textureX, textureY); // Shape 76

				rightTrackWheelModels[0].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 64
				rightTrackWheelModels[0].setRotationPoint(17F, 5.5F, -19F);

				rightTrackWheelModels[1].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 65
				rightTrackWheelModels[1].setRotationPoint(6F, 5.5F, -19F);

				rightTrackWheelModels[2].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 66
				rightTrackWheelModels[2].setRotationPoint(-5F, 5.5F, -19F);

				rightTrackWheelModels[3].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 67
				rightTrackWheelModels[3].setRotationPoint(-16F, 5.5F, -19F);

				rightTrackWheelModels[4].addShape3D(4F, -4F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 3, 8, 8, 28, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 68
				rightTrackWheelModels[4].setRotationPoint(-28F, 5.5F, -19F);

				rightTrackWheelModels[5].addShape3D(3F, -3F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 69
				rightTrackWheelModels[5].setRotationPoint(-39F, 0.5F, -19F);

				rightTrackWheelModels[6].addShape3D(3F, -3F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 3, 6, 6, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 70
				rightTrackWheelModels[6].setRotationPoint(28F, 0.5F, -19F);

				rightTrackWheelModels[7].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 73
				rightTrackWheelModels[7].setRotationPoint(10.5F, -2.5F, -19F);

				rightTrackWheelModels[8].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 74
				rightTrackWheelModels[8].setRotationPoint(0.5F, -2.5F, -19F);

				rightTrackWheelModels[9].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 75
				rightTrackWheelModels[9].setRotationPoint(-11.5F, -2.5F, -19F);

				rightTrackWheelModels[10].addShape3D(1.5F, -1.5F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 0, 2, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2), new Coord2D(2, 3, 2, 3), new Coord2D(1, 3, 1, 3), new Coord2D(0, 2, 0, 2), new Coord2D(0, 1, 0, 1) }), 2, 3, 3, 12, 2, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,2 ,1 ,2 ,1 ,2 ,1}); // Shape 76
				rightTrackWheelModels[10].setRotationPoint(-22.5F, -2F, -19F);

		fancyTrackModel = new ModelRendererTurbo[1];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 240, 304, textureX, textureY); // Box 87

		fancyTrackModel[0].addShapeBox(-1F, -1F, -2F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}