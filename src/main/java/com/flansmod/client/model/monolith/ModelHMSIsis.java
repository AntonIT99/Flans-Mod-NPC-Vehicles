//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Isis
// Model Creator: 
// Created on: 25.07.2020 - 13:27:24
// Last changed on: 25.07.2020 - 13:27:24

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHMSIsis extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelHMSIsis() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[145];
		bodyDoorOpenModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initbodyDoorOpenModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 194
		bodyModel[28] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 195
		bodyModel[29] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 196
		bodyModel[30] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 197
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 198
		bodyModel[32] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 199
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 200
		bodyModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 201
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 202
		bodyModel[36] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 203
		bodyModel[37] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 204
		bodyModel[38] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 205
		bodyModel[39] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 206
		bodyModel[40] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 207
		bodyModel[41] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 208
		bodyModel[42] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 209
		bodyModel[43] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 211
		bodyModel[44] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 212
		bodyModel[45] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 214
		bodyModel[46] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 215
		bodyModel[47] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 216
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 217
		bodyModel[49] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 218
		bodyModel[50] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 219
		bodyModel[51] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 220
		bodyModel[52] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 221
		bodyModel[53] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 222
		bodyModel[54] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 223
		bodyModel[55] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 224
		bodyModel[56] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 225
		bodyModel[57] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 226
		bodyModel[58] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 227
		bodyModel[59] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 228
		bodyModel[60] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 229
		bodyModel[61] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 230
		bodyModel[62] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 231
		bodyModel[63] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 232
		bodyModel[64] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 233
		bodyModel[65] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 234
		bodyModel[66] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 235
		bodyModel[67] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 236
		bodyModel[68] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 237
		bodyModel[69] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 238
		bodyModel[70] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 78
		bodyModel[71] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 79
		bodyModel[72] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 69
		bodyModel[74] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 70
		bodyModel[75] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 71
		bodyModel[76] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 122
		bodyModel[77] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 123
		bodyModel[78] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 124
		bodyModel[79] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 125
		bodyModel[80] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 126
		bodyModel[81] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 127
		bodyModel[82] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 137
		bodyModel[83] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 138
		bodyModel[84] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 139
		bodyModel[85] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 140
		bodyModel[86] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 141
		bodyModel[87] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 142
		bodyModel[88] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 257
		bodyModel[89] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258
		bodyModel[90] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		bodyModel[91] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260
		bodyModel[92] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 261
		bodyModel[93] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 262
		bodyModel[94] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 263
		bodyModel[95] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 265
		bodyModel[96] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 266
		bodyModel[97] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 34
		bodyModel[98] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 35
		bodyModel[99] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 36
		bodyModel[100] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 273
		bodyModel[101] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 274
		bodyModel[102] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 275
		bodyModel[103] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 276
		bodyModel[104] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 277
		bodyModel[105] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 278
		bodyModel[106] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 279
		bodyModel[107] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 280
		bodyModel[108] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 281
		bodyModel[109] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 282
		bodyModel[110] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 283
		bodyModel[111] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 284
		bodyModel[112] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 285
		bodyModel[113] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 286
		bodyModel[114] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 287
		bodyModel[115] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 288
		bodyModel[116] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 289
		bodyModel[117] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 290
		bodyModel[118] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 291
		bodyModel[119] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 292
		bodyModel[120] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 293
		bodyModel[121] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 294
		bodyModel[122] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 295
		bodyModel[123] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 296
		bodyModel[124] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 297
		bodyModel[125] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 298
		bodyModel[126] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 299
		bodyModel[127] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 300
		bodyModel[128] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 301
		bodyModel[129] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 302
		bodyModel[130] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 303
		bodyModel[131] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 304
		bodyModel[132] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 305
		bodyModel[133] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 306
		bodyModel[134] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 307
		bodyModel[135] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 308
		bodyModel[136] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 309
		bodyModel[137] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 310
		bodyModel[138] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 311
		bodyModel[139] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 312
		bodyModel[140] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 313
		bodyModel[141] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 314
		bodyModel[142] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 315
		bodyModel[143] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 316
		bodyModel[144] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 317

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 9, 28, 0F,20F, -0.1F, -1.5F, 20F, 0F, -1.5F, 20F, 0F, -1.5F, 20F, -0.1F, -1.5F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-3F, 1.5F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 9, 25, 0F,0F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[1].setRotationPoint(-46F, 1.5F, -12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 29, 7, 19, 0F,0F, -0.1F, 0.5F, 0F, -0.2F, 3F, 0F, -0.2F, 3F, 0F, -0.1F, 0.5F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 1F); // Box 3
		bodyModel[2].setRotationPoint(-75F, 3.5F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 7, 13, 0F,0F, 0F, -0.5F, 0F, -0.1F, 3.5F, 0F, -0.1F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-92F, 3.5F, -6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 7, 7, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-96F, 3.5F, -3.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1.5F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-100F, 3.5F, -0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 7
		bodyModel[6].setRotationPoint(23F, 1.5F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 23, 12, 24, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 8
		bodyModel[7].setRotationPoint(42F, -1.5F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 12, 21, 0F,0F, 0F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 9
		bodyModel[8].setRotationPoint(65F, -1.5F, -10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 12, 19, 0F,0F, 0.2F, 0F, 0F, 0.4F, -2F, 0F, 0.4F, -2F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 10
		bodyModel[9].setRotationPoint(72F, -1.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 12, 15, 0F,0F, 0.4F, 0F, 0F, 0.6F, -3F, 0F, 0.6F, -3F, 0F, 0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[10].setRotationPoint(81F, -1.5F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 12, 9, 0F,0F, 0.6F, 0F, 0.7F, 1F, -2.5F, 0.7F, 1F, -2.5F, 0F, 0.6F, 0F, 0F, 0F, 0.5F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 0.5F); // Box 12
		bodyModel[11].setRotationPoint(91F, -1.5F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 7, 9, 0F,0F, 0F, 0.5F, 2F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 5F, 0F, -3F, 5F, 0F, -3F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(91F, 10.5F, -4.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, 0F, 5F, 0F, -3F, 5F, 0F, -3F, 0F, 0F, 0F, 10F, 1F, 1F, 1.5F, -2F, -3F, 1.5F, -2F, -3F, 10F, 1F, 1F); // Box 14
		bodyModel[13].setRotationPoint(91F, 17.5F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 7, 15, 0F,0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 6F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -2F); // Box 15
		bodyModel[14].setRotationPoint(81F, 10.5F, -7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 13, 19, 0F,0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 16
		bodyModel[15].setRotationPoint(72F, 10.5F, -9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 13, 21, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 17
		bodyModel[16].setRotationPoint(65F, 10.5F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 13, 24, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -4F); // Box 18
		bodyModel[17].setRotationPoint(42F, 10.5F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 13, 25, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4F); // Box 19
		bodyModel[18].setRotationPoint(23F, 10.5F, -12.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 13, 28, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, -5.5F, 20F, 0F, -5.5F, 20F, 0F, -5.5F, 20F, 0F, -5.5F); // Box 20
		bodyModel[19].setRotationPoint(-3F, 10.5F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 13, 25, 0F,0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 21
		bodyModel[20].setRotationPoint(-46F, 10.5F, -12.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 29, 8, 19, 0F,0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 2F, -3.5F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 2F, -3.5F); // Box 22
		bodyModel[21].setRotationPoint(-75F, 10.5F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 17, 10, 13, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -3F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -5.5F); // Box 23
		bodyModel[22].setRotationPoint(-92F, 10.5F, -6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, -1F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 2F, -1F, -3F); // Box 24
		bodyModel[23].setRotationPoint(-96F, 10.5F, -3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,1.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 1.5F, 0F, 0F, 0.5F, -1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, -1.5F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-100F, 10.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[25].setRotationPoint(-101.5F, -9F, -0.5F);
		bodyModel[25].rotateAngleZ = 0.15707963F;

		bodyModel[26].addShapeBox(-6.2F, 2.5F, 0F, 23, 15, 1, 0F,-6.4F, -1.5F, -0.2F, -5.2F, 0F, -0.2F, -5.2F, 0F, -0.2F, -6.4F, -1.5F, -0.2F, -6F, -5F, -0.2F, -5.2F, -7F, -0.2F, -5.2F, -7F, -0.2F, -6F, -5F, -0.2F); // Box 32
		bodyModel[26].setRotationPoint(-113F, -9F, -0.5F);
		bodyModel[26].rotateAngleZ = 0.15707963F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 9, 25, 0F,0F, -0.2F, -1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 194
		bodyModel[27].setRotationPoint(-59F, 1.5F, -12.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2.5F, 1F, 0F, 2.5F, 1F, 0F, 0F, 1F, 0F); // Box 195
		bodyModel[28].setRotationPoint(-59F, -1.3F, -11.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 5, 23, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 196
		bodyModel[29].setRotationPoint(-62F, -1.3F, -11.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[30].setRotationPoint(-54F, 0.7F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,-0.5F, 0F, -1.5F, 0.2F, 0F, 3F, 0.2F, 0F, 3F, -0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -1F); // Box 198
		bodyModel[31].setRotationPoint(-104F, 5F, -2.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 36, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[32].setRotationPoint(-82F, 17.5F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 200
		bodyModel[33].setRotationPoint(-90F, 16.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[34].setRotationPoint(-94F, 22F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[35].setRotationPoint(-98.5F, 17F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 203
		bodyModel[36].setRotationPoint(-14.5F, -20F, -2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[37].setRotationPoint(-13.2F, -0.5F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[38].setRotationPoint(15.8F, -0.5F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 206
		bodyModel[39].setRotationPoint(14.5F, -20F, -2.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[40].setRotationPoint(41F, -12.5F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F); // Box 208
		bodyModel[41].setRotationPoint(46F, -12.5F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[42].setRotationPoint(52F, -4.3F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[43].setRotationPoint(44F, -5.3F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.5F, 2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.5F, 2F, 0F, 0.5F); // Box 212
		bodyModel[44].setRotationPoint(44F, -8.5F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,2F, 0F, 0.5F, 4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.5F, 4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[45].setRotationPoint(44F, -8.5F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[46].setRotationPoint(41F, -10.5F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 216
		bodyModel[47].setRotationPoint(46F, -9.5F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 217
		bodyModel[48].setRotationPoint(51F, -11F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 218
		bodyModel[49].setRotationPoint(51F, -11F, 3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 219
		bodyModel[50].setRotationPoint(51F, -11F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 220
		bodyModel[51].setRotationPoint(51F, -11F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 221
		bodyModel[52].setRotationPoint(48F, -11F, -3.6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 222
		bodyModel[53].setRotationPoint(48F, -11F, 2.6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F); // Box 223
		bodyModel[54].setRotationPoint(38F, -55.5F, -0.5F);
		bodyModel[54].rotateAngleZ = 0.13962634F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F); // Box 224
		bodyModel[55].setRotationPoint(41.5F, -30.5F, -0.5F);
		bodyModel[55].rotateAngleZ = -0.05235988F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 225
		bodyModel[56].setRotationPoint(38.5F, -22F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 226
		bodyModel[57].setRotationPoint(38.5F, -22F, -4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 227
		bodyModel[58].setRotationPoint(38.5F, -22F, 1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -4F, 0.5F, -0.7F, -3F, 0.5F, -0.7F, -3F, 0.5F, -0.7F, -4F, 0.5F, -0.7F); // Box 228
		bodyModel[59].setRotationPoint(39.5F, -21F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F); // Box 229
		bodyModel[60].setRotationPoint(41.5F, -30.5F, -0.5F);
		bodyModel[60].rotateAngleZ = -0.05235988F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 230
		bodyModel[61].setRotationPoint(40F, -43.5F, -0.5F);
		bodyModel[61].rotateAngleZ = -0.05235988F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F, -0.2F, 30F, -0.2F); // Box 231
		bodyModel[62].setRotationPoint(-51.5F, -30.5F, -0.5F);
		bodyModel[62].rotateAngleZ = -0.03490659F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 60F, 0F, 0F, 60F, 0F); // Box 232
		bodyModel[63].setRotationPoint(-55F, -55.5F, -0.5F);
		bodyModel[63].rotateAngleZ = 0.13962634F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -4F, 0.5F, -0.7F, -3F, 0.5F, -0.7F, -3F, 0.5F, -0.7F, -4F, 0.5F, -0.7F); // Box 233
		bodyModel[64].setRotationPoint(-53F, -17F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 234
		bodyModel[65].setRotationPoint(-54F, -18F, -4.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 235
		bodyModel[66].setRotationPoint(-54F, -18F, -1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 236
		bodyModel[67].setRotationPoint(-54F, -18F, 1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F); // Box 237
		bodyModel[68].setRotationPoint(-51.5F, -30.5F, -0.5F);
		bodyModel[68].rotateAngleZ = -0.05235988F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 238
		bodyModel[69].setRotationPoint(-53F, -43.5F, -0.5F);
		bodyModel[69].rotateAngleZ = -0.05235988F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[70].setRotationPoint(10.5F, -6F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[71].setRotationPoint(10.5F, -11F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 80
		bodyModel[72].setRotationPoint(14.5F, -11F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[73].setRotationPoint(23.5F, -3.5F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 70
		bodyModel[74].setRotationPoint(27.5F, -8.5F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[75].setRotationPoint(23.5F, -8.5F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 122
		bodyModel[76].setRotationPoint(2.5F, -6.5F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[77].setRotationPoint(-1.5F, -6.5F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[78].setRotationPoint(-1.5F, -1.5F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[79].setRotationPoint(-11.5F, -6F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[80].setRotationPoint(-11.5F, -11F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 127
		bodyModel[81].setRotationPoint(-7.5F, -11F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 137
		bodyModel[82].setRotationPoint(-21.5F, -6.5F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[83].setRotationPoint(-25.5F, -6.5F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[84].setRotationPoint(-25.5F, -1.5F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[85].setRotationPoint(-35.5F, -6F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[86].setRotationPoint(-35.5F, -11F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 142
		bodyModel[87].setRotationPoint(-31.5F, -11F, -9F);

		bodyModel[88].addShapeBox(-1.5F, 2F, -1.5F, 3, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[88].setRotationPoint(63F, -4F, 0F);

		bodyModel[89].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258
		bodyModel[89].setRotationPoint(63F, -4F, 0F);

		bodyModel[90].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259
		bodyModel[90].setRotationPoint(63F, -4F, 0F);

		bodyModel[91].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260
		bodyModel[91].setRotationPoint(63F, -4F, 0F);

		bodyModel[92].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[92].setRotationPoint(35F, -1F, -10F);

		bodyModel[93].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[93].setRotationPoint(35F, -1F, 10F);

		bodyModel[94].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[94].setRotationPoint(-46F, -3.5F, -10F);
		bodyModel[94].rotateAngleY = 0.17453293F;

		bodyModel[95].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[95].setRotationPoint(-68F, 1F, -6F);

		bodyModel[96].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[96].setRotationPoint(-68F, 1F, 6F);

		bodyModel[97].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 34
		bodyModel[97].setRotationPoint(22F, -0.7F, -12F);
		bodyModel[97].rotateAngleY = -0.76794487F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 35
		bodyModel[98].setRotationPoint(22F, -0.7F, -12F);
		bodyModel[98].rotateAngleY = -0.76794487F;

		bodyModel[99].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[99].setRotationPoint(22.5F, 0.2F, -12F);

		bodyModel[100].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 273
		bodyModel[100].setRotationPoint(-5F, -0.7F, -12F);
		bodyModel[100].rotateAngleY = -0.76794487F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 274
		bodyModel[101].setRotationPoint(-5F, -0.7F, -12F);
		bodyModel[101].rotateAngleY = -0.76794487F;

		bodyModel[102].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 275
		bodyModel[102].setRotationPoint(-4.5F, 0.2F, -12F);

		bodyModel[103].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 276
		bodyModel[103].setRotationPoint(-32F, -0.7F, -12F);
		bodyModel[103].rotateAngleY = -0.76794487F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 277
		bodyModel[104].setRotationPoint(-32F, -0.7F, -12F);
		bodyModel[104].rotateAngleY = -0.76794487F;

		bodyModel[105].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 278
		bodyModel[105].setRotationPoint(-31.5F, 0.2F, -12F);

		bodyModel[106].addShapeBox(-0.7F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 279
		bodyModel[106].setRotationPoint(-45F, -3.5F, -10F);
		bodyModel[106].rotateAngleY = -1.3962634F;

		bodyModel[107].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[107].setRotationPoint(-17F, -3.5F, -10F);
		bodyModel[107].rotateAngleY = 0.17453293F;

		bodyModel[108].addShapeBox(-0.7F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 281
		bodyModel[108].setRotationPoint(-16F, -3.5F, -10F);
		bodyModel[108].rotateAngleY = -1.3962634F;

		bodyModel[109].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[109].setRotationPoint(8.5F, -3.5F, -10F);
		bodyModel[109].rotateAngleY = 0.17453293F;

		bodyModel[110].addShapeBox(-0.7F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 283
		bodyModel[110].setRotationPoint(9.5F, -3.5F, -10F);
		bodyModel[110].rotateAngleY = -1.3962634F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[111].setRotationPoint(-60F, -5F, -2.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[112].setRotationPoint(10.5F, -6F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[113].setRotationPoint(10.5F, -11F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 287
		bodyModel[114].setRotationPoint(14.5F, -11F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[115].setRotationPoint(23.5F, -3.5F, 3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 289
		bodyModel[116].setRotationPoint(27.5F, -8.5F, 3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[117].setRotationPoint(23.5F, -8.5F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 291
		bodyModel[118].setRotationPoint(2.5F, -6.5F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[119].setRotationPoint(-1.5F, -6.5F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[120].setRotationPoint(-1.5F, -1.5F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[121].setRotationPoint(-11.5F, -6F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[122].setRotationPoint(-11.5F, -11F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 296
		bodyModel[123].setRotationPoint(-7.5F, -11F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 297
		bodyModel[124].setRotationPoint(-21.5F, -6.5F, 4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[125].setRotationPoint(-25.5F, -6.5F, 4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[126].setRotationPoint(-25.5F, -1.5F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[127].setRotationPoint(-35.5F, -6F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[128].setRotationPoint(-35.5F, -11F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 302
		bodyModel[129].setRotationPoint(-31.5F, -11F, 5F);

		bodyModel[130].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 303
		bodyModel[130].setRotationPoint(22.5F, -0.7F, 11.2F);
		bodyModel[130].rotateAngleY = 0.76794487F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 304
		bodyModel[131].setRotationPoint(22.5F, -0.7F, 11.2F);
		bodyModel[131].rotateAngleY = 0.76794487F;

		bodyModel[132].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 305
		bodyModel[132].setRotationPoint(22.5F, 0.2F, 11F);

		bodyModel[133].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[133].setRotationPoint(8.5F, -3.5F, 10F);
		bodyModel[133].rotateAngleY = -0.17453293F;

		bodyModel[134].addShapeBox(-5.3F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 307
		bodyModel[134].setRotationPoint(9.5F, -3.5F, 10F);
		bodyModel[134].rotateAngleY = -1.74532925F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 308
		bodyModel[135].setRotationPoint(-4.5F, -0.7F, 11.2F);
		bodyModel[135].rotateAngleY = 0.76794487F;

		bodyModel[136].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 309
		bodyModel[136].setRotationPoint(-4.5F, -0.7F, 11.2F);
		bodyModel[136].rotateAngleY = 0.76794487F;

		bodyModel[137].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 310
		bodyModel[137].setRotationPoint(-4.5F, 0.2F, 11F);

		bodyModel[138].addShapeBox(-5.3F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 311
		bodyModel[138].setRotationPoint(-16F, -3.5F, 10F);
		bodyModel[138].rotateAngleY = -1.74532925F;

		bodyModel[139].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[139].setRotationPoint(-17F, -3.5F, 10F);
		bodyModel[139].rotateAngleY = -0.17453293F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 313
		bodyModel[140].setRotationPoint(-31.5F, -0.7F, 11.2F);
		bodyModel[140].rotateAngleY = 0.76794487F;

		bodyModel[141].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 314
		bodyModel[141].setRotationPoint(-31.5F, -0.7F, 11.2F);
		bodyModel[141].rotateAngleY = 0.76794487F;

		bodyModel[142].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 315
		bodyModel[142].setRotationPoint(-31.5F, 0.2F, 11F);

		bodyModel[143].addShapeBox(-1.3F, 2F, -1.5F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[143].setRotationPoint(-46F, -3.5F, 10F);
		bodyModel[143].rotateAngleY = -0.17453293F;

		bodyModel[144].addShapeBox(-5.3F, 2.5F, -1.2F, 6, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 317
		bodyModel[144].setRotationPoint(-45F, -3.5F, 10F);
		bodyModel[144].rotateAngleY = -1.74532925F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 325, 106, textureX, textureY); // Box 318

		bodyDoorOpenModel[0].addShapeBox(-21F, 1F, 0F, 21, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyDoorOpenModel[0].setRotationPoint(-55F, -55.5F, -0.5F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.13962634F;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258

		gun_2_Model[0][0].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(63F, -4F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260

		gun_2_Model[1][0].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259

		gun_2_Model[1][1].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(63F, -4F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[1];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258

		gun_3_Model[0][0].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(35F, -1F, -10F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260

		gun_3_Model[1][0].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259

		gun_3_Model[1][1].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(35F, -1F, -10F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258

		gun_4_Model[0][0].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(35F, -1F, 10F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260

		gun_4_Model[1][0].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259

		gun_4_Model[1][1].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(35F, -1F, 10F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[1];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258

		gun_5_Model[0][0].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-68F, 1F, -6F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260

		gun_5_Model[1][0].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259

		gun_5_Model[1][1].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-68F, 1F, -6F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[1];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 258

		gun_6_Model[0][0].addShapeBox(-1.5F, -1F, -1.5F, 3, 3, 3, 0F,0.2F, 0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 0F, 0F, 0F, 1F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 1F); // Box 258

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-68F, 1F, 6F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[2];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 259
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 260

		gun_6_Model[1][0].addShapeBox(0F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 259

		gun_6_Model[1][1].addShapeBox(-2.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 260

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-68F, 1F, 6F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}