//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AurelianScale
// Model Creator: 
// Created on: 20.12.2019 - 11:13:27
// Last changed on: 20.12.2019 - 11:13:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAurelianScale extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelAurelianScale() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[188];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 203
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 291
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 296
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 299
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 300
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 301
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 302
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 303
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 304
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 305
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 306
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 307
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 308
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 309
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 310
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 311
		bodyModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 312
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 313
		bodyModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 315
		bodyModel[19] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 316
		bodyModel[20] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 317
		bodyModel[21] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 318
		bodyModel[22] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 319
		bodyModel[23] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 320
		bodyModel[24] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 321
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 322
		bodyModel[26] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 323
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 324
		bodyModel[28] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 325
		bodyModel[29] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 326
		bodyModel[30] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 327
		bodyModel[31] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 328
		bodyModel[32] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 329
		bodyModel[33] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 338
		bodyModel[34] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 339
		bodyModel[35] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 340
		bodyModel[36] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 341
		bodyModel[37] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 342
		bodyModel[38] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 343
		bodyModel[39] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 344
		bodyModel[40] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 345
		bodyModel[41] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 362
		bodyModel[42] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 363
		bodyModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 364
		bodyModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 365
		bodyModel[45] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 366
		bodyModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 367
		bodyModel[47] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 368
		bodyModel[48] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 369
		bodyModel[49] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 378
		bodyModel[50] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 380
		bodyModel[51] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 381
		bodyModel[52] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 382
		bodyModel[53] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 383
		bodyModel[54] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 384
		bodyModel[55] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 385
		bodyModel[56] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 388
		bodyModel[57] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 394
		bodyModel[58] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 395
		bodyModel[59] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 396
		bodyModel[60] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 397
		bodyModel[61] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 399
		bodyModel[62] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 400
		bodyModel[63] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 405
		bodyModel[64] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 406
		bodyModel[65] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 407
		bodyModel[66] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 408
		bodyModel[67] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 414
		bodyModel[68] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 415
		bodyModel[69] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 416
		bodyModel[70] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 417
		bodyModel[71] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 143
		bodyModel[72] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 145
		bodyModel[73] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 148
		bodyModel[75] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 149
		bodyModel[76] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 150
		bodyModel[77] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 152
		bodyModel[78] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 153
		bodyModel[79] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 154
		bodyModel[80] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 155
		bodyModel[81] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 157
		bodyModel[82] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 158
		bodyModel[83] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 159
		bodyModel[84] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 160
		bodyModel[85] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 162
		bodyModel[86] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 163
		bodyModel[87] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 164
		bodyModel[88] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 165
		bodyModel[89] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 167
		bodyModel[90] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 168
		bodyModel[91] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 169
		bodyModel[92] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 170
		bodyModel[93] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 171
		bodyModel[94] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 172
		bodyModel[95] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 173
		bodyModel[96] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 174
		bodyModel[97] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 175
		bodyModel[98] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 176
		bodyModel[99] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 177
		bodyModel[100] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 178
		bodyModel[101] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 179
		bodyModel[102] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 180
		bodyModel[103] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 181
		bodyModel[104] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 182
		bodyModel[105] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 187
		bodyModel[106] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 188
		bodyModel[107] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 189
		bodyModel[108] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 190
		bodyModel[109] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 191
		bodyModel[110] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 192
		bodyModel[111] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 193
		bodyModel[112] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 209
		bodyModel[113] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 210
		bodyModel[114] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 211
		bodyModel[115] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 212
		bodyModel[116] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 213
		bodyModel[117] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 214
		bodyModel[118] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 215
		bodyModel[119] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 216
		bodyModel[120] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 217
		bodyModel[121] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 218
		bodyModel[122] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 219
		bodyModel[123] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 220
		bodyModel[124] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 221
		bodyModel[125] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 222
		bodyModel[126] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 223
		bodyModel[127] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 224
		bodyModel[128] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 225
		bodyModel[129] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 226
		bodyModel[130] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 227
		bodyModel[131] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 228
		bodyModel[132] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 229
		bodyModel[133] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 241
		bodyModel[134] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 242
		bodyModel[135] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 245
		bodyModel[136] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 246
		bodyModel[137] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 247
		bodyModel[138] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 248
		bodyModel[139] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 251
		bodyModel[140] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 252
		bodyModel[141] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 52
		bodyModel[142] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 53
		bodyModel[143] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 33
		bodyModel[144] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 35
		bodyModel[145] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 36
		bodyModel[146] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 37
		bodyModel[147] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 38
		bodyModel[148] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 199
		bodyModel[149] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 200
		bodyModel[150] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 201
		bodyModel[151] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 202
		bodyModel[152] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 203
		bodyModel[153] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 204
		bodyModel[154] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 205
		bodyModel[155] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 206
		bodyModel[156] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 207
		bodyModel[157] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 208
		bodyModel[158] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 209
		bodyModel[159] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 210
		bodyModel[160] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 211
		bodyModel[161] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 212
		bodyModel[162] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 213
		bodyModel[163] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 214
		bodyModel[164] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 215
		bodyModel[165] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 216
		bodyModel[166] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 224
		bodyModel[167] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 231
		bodyModel[168] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 235
		bodyModel[169] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 236
		bodyModel[170] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 248
		bodyModel[171] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 249
		bodyModel[172] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 250
		bodyModel[173] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 251
		bodyModel[174] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 252
		bodyModel[175] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 253
		bodyModel[176] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 254
		bodyModel[177] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 255
		bodyModel[178] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 256
		bodyModel[179] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 257
		bodyModel[180] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 258
		bodyModel[181] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 259
		bodyModel[182] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 260
		bodyModel[183] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 261
		bodyModel[184] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 262
		bodyModel[185] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 263
		bodyModel[186] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 264
		bodyModel[187] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 265

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 203
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 0F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 291
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, 0F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 296
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 299
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 300
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 301
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 302
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 303
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 304
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 1.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 305
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(3F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 306
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 307
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 308
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 309
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 310
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 311
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 312
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 3F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 313
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 315
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 316
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 317
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 318
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 319
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 320
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 321
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 322
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 323
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 324
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 325
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 326
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 327
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 328
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 329
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(3F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 338
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(2F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 339
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 340
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 341
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 342
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-2F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 343
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 344
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 345
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 362
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 363
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(1F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 364
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(0F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 365
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-1F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 366
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 367
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 368
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 9F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 369
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 378
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(2F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 380
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(1F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 381
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 382
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-1F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 383
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 384
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-4F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 385
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3F, 6F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 388
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 394
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(1F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 395
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 396
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(3F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 397
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 399
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(1F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 400
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 405
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-1F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 406
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-2F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 407
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-3F, 0F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 408
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-1F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 414
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-2F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 415
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-3F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 416
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4F, 3F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 417
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(3F, 6F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 143
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(3F, 9F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 145
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(4F, 4.5F, -2F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 147
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(4F, 6F, -2F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 148
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(4F, 7.5F, -2F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 149
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(4F, 9F, -2F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 150
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(4F, 7.5F, -1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 152
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(4F, 4.5F, -1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 153
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(4F, 6F, -1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 154
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(4F, 9F, -1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 155
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(4F, 7.5F, 0F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 157
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(4F, 4.5F, 0F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 158
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(4F, 6F, 0F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 159
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(4F, 9F, 0F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 160
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(4F, 7.5F, 1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 162
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(4F, 4.5F, 1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 163
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(4F, 6F, 1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 164
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(4F, 9F, 1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 165
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-5F, 4.5F, 1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 167
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-5F, 4.5F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 168
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-5F, 4.5F, -1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 169
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-5F, 4.5F, -2F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 170
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-5F, 6F, -2F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 171
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-5F, 6F, -1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 172
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-5F, 6F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 173
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-5F, 6F, 1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 174
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-5F, 7.5F, 1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 175
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-5F, 7.5F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 176
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-5F, 7.5F, -1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 177
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-5F, 7.5F, -2F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 178
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-5F, 9F, 1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 179
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-5F, 9F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 180
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-5F, 9F, -1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 181
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-5F, 9F, -2F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 182
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-3.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 187
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-2.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 188
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-1.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 189
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-0.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 190
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(0.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 191
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(1.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 192
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(2.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 193
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-3.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 209
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-2.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 210
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-1.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 211
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-0.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 212
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(0.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 213
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(1.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 214
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(2.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 215
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-3.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 216
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-2.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 217
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-1.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 218
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-0.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 219
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(0.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 220
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(1.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 221
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(2.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 222
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-3.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 223
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-2.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 224
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-1.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 225
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-0.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 226
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(0.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 227
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(1.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 228
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(2.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 229
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(3.5F, 4.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 241
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(3.5F, 7.5F, -3F, 1, 2, 1, 0F,0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F); // Box 242
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-4.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F); // Box 245
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-4.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F); // Box 246
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-4.5F, 4.5F, 2F, 1, 2, 1, 0F,-0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F); // Box 247
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(-4.5F, 7.5F, 2F, 1, 2, 1, 0F,-0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F); // Box 248
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(3.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 251
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(3.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 252
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-5F, -1F, 2F, 10, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 52
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-7F, 0F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(-4F, -0.2F, -2.2F, 2, 3, 4, 0F,0.55F, 0.3F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 33
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-4F, 0F, 1F, 8, 4, 1, 0F,0.55F, 0.3F, -1F, 0.55F, 0.5F, -1F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 35
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-2.65F, 2.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F); // Box 36
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(1.65F, 2.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F); // Box 37
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(2F, -0.2F, -2.2F, 2, 3, 4, 0F,0.55F, 0.3F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.5F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F, 0.55F, 0.3F, 0.55F); // Box 38
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-6F, -0.2F, -2.2F, 2, 3, 4, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F); // Box 199
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(4F, -0.2F, -2.2F, 2, 3, 4, 0F,0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F, 0F, -0.2F, 0.45F); // Box 200
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-3.5F, 10.5F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 201
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(-1.5F, 10.5F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 202
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(0.5F, 10.5F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 203
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(2.5F, 10.5F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 204
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(-3.5F, 10.5F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 205
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(-1.5F, 10.5F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 206
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(0.5F, 10.5F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 207
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(2.5F, 10.5F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 208
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(-3.5F, 1F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(2.5F, 1F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(-4.5F, -1.7F, -3F, 1, 3, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 1.5F, -0.7F, 3F, 0.5F, -0.8F, 3F, -1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 5F, -1F, 0F, 5F); // Box 211
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(3.5F, -1.7F, -3F, 1, 3, 1, 0F,0.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.8F, 3F, 1.5F, -0.7F, 3F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 1F, 0.5F, 5F); // Box 212
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(-4.2F, 10.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 213
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(-4.2F, 10.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 214
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(3.2F, 10.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 215
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(3.2F, 10.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 216
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(-3.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 224
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(2.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 231
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(3.2F, 10.5F, 0.8F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 235
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(-4.2F, 10.5F, -2.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 236
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(-2.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 248
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(-1.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 249
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(-0.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 250
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(0.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 251
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(1.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 252
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(2.5F, 10.5F, -2.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 253
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(1.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 254
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(-0.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 255
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(0.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 256
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(-1.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 257
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(-2.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 258
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(-3.5F, 10.5F, 1.2F, 1, 5, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 259
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(3.2F, 10.5F, -0.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 260
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(3.2F, 10.5F, -1.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 261
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(3.2F, 10.5F, -2.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 262
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-4.2F, 10.5F, -1.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 263
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-4.2F, 10.5F, -0.2F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 264
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-4.2F, 10.5F, 0.8F, 1, 5, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 265
		bodyModel[187].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 74
		leftLegModel[2] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 25

		leftLegModel[0].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 74
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 2, 4, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -1.8F, 0.1F, 0F, -1.8F); // Box 25
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 75
		rightLegModel[2] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 26

		rightLegModel[0].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 75
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 2, 4, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -1.8F, 0.1F, 0F, -1.8F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 54

		skirtRearModel[0].addShapeBox(-7F, -1.5F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 54
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}