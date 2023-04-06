//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 02.01.2017 - 22:03:04
// Last changed on: 02.01.2017 - 22:03:04

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeopard2A6 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 2048;

	public ModelLeopard2A6() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[143];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 79, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 152, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 288, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 259, 0, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 259, 78, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 331, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 384, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 439, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 493, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 512, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 537, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 557, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 0, 576, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 583, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 52, 493, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 20, 500, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 165, 512, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 80, 537, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 52, 557, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 25, 576, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 44, 583, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 83, 523, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 25, 606, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 0, 694, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 0, 728, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 0, 746, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 13, 773, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 0, 773, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 0, 783, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 0, 803, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 44, 794, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 44, 803, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 0, 822, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 44, 822, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 44, 830, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 44, 841, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 44, 850, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 44, 855, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 0, 830, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 0, 841, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 0, 850, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 0, 855, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 0, 864, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 0, 864, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 0, 872, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 0, 872, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 0, 887, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 0, 888, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 0, 904, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 15, 900, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 15, 904, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 0, 922, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 42, 910, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 44, 922, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 15, 546, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 0, 934, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 0, 943, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 0, 951, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 0, 959, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 0, 963, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 0, 967, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 0, 973, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 0, 972, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 0, 967, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 0, 973, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1016, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1087, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 65, 1087, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1062, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 53, 1066, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1097, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1118, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1121, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 33, 1097, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 0, 1118, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 0, 1128, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 0, 1121, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1141, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1099, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1174, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1175, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 23, 1175, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Box 224
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 225
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 226
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 227
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 228
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 229
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 230
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 231
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 232
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 233
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 234
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 235
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 236
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 237
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 238
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Box 239
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 240
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 241
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 242
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 243
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 244
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1247, textureX, textureY); // Box 245
		bodyModel[120] = new ModelRendererTurbo(this, 25, 1288, textureX, textureY); // Box 264
		bodyModel[121] = new ModelRendererTurbo(this, 30, 1292, textureX, textureY); // Box 265
		bodyModel[122] = new ModelRendererTurbo(this, 20, 1292, textureX, textureY); // Box 266
		bodyModel[123] = new ModelRendererTurbo(this, 30, 1300, textureX, textureY); // Box 267
		bodyModel[124] = new ModelRendererTurbo(this, 20, 1300, textureX, textureY); // Box 268
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Box 269
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1292, textureX, textureY); // Box 270
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1288, textureX, textureY); // Box 271
		bodyModel[128] = new ModelRendererTurbo(this, 10, 1300, textureX, textureY); // Box 272
		bodyModel[129] = new ModelRendererTurbo(this, 10, 1292, textureX, textureY); // Box 273
		bodyModel[130] = new ModelRendererTurbo(this, 50, 1288, textureX, textureY); // Box 274
		bodyModel[131] = new ModelRendererTurbo(this, 40, 1292, textureX, textureY); // Box 275
		bodyModel[132] = new ModelRendererTurbo(this, 50, 1292, textureX, textureY); // Box 276
		bodyModel[133] = new ModelRendererTurbo(this, 40, 1300, textureX, textureY); // Box 277
		bodyModel[134] = new ModelRendererTurbo(this, 50, 1300, textureX, textureY); // Box 278
		bodyModel[135] = new ModelRendererTurbo(this, 70, 1300, textureX, textureY); // Box 279
		bodyModel[136] = new ModelRendererTurbo(this, 70, 1292, textureX, textureY); // Box 280
		bodyModel[137] = new ModelRendererTurbo(this, 75, 1288, textureX, textureY); // Box 281
		bodyModel[138] = new ModelRendererTurbo(this, 60, 1300, textureX, textureY); // Box 282
		bodyModel[139] = new ModelRendererTurbo(this, 60, 1292, textureX, textureY); // Box 283
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1307, textureX, textureY); // Box 288
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 289
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 290

		bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 7, 66, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(33F, -21.5F, -33F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 7, 36, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[1].setRotationPoint(59F, -15.5F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 7, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(59F, -11.5F, -18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 103, 10, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-44F, -14.5F, -18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 103, 4, 36, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 6
		bodyModel[4].setRotationPoint(-44F, -4.5F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 51, 7, 66, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-18F, -21.5F, -33F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 54, 10, 66, 0F, -0.5F, 0.3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0.3F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-72F, -24.5F, -33F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 14, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-56F, -14.5F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 15, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-61F, -14.5F, -18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 15, 36, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-69F, -14.5F, -18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-69.5F, -15.5F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-49.5F, -15.5F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 76, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-45.5F, -15.5F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 36, 9, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 13
		bodyModel[13].setRotationPoint(30.5F, -15.5F, -35.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F, 0F, -1F, 0F, -33F, -1F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(31F, -21.5F, -34F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[15].setRotationPoint(28.5F, -14.5F, -35F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(66F, -15.5F, -33F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(66F, -14.5F, -19F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 4, 15, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(72F, -15.5F, -33F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F, 0F, 0F, 0F, -0.5F, -0.1F, -2.5F, -0.5F, -0.1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -5F, -2.5F, -0.5F, -5F, 1.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[19].setRotationPoint(66.5F, -15.5F, -35.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-69.5F, -15.5F, 33F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-49.5F, -15.5F, 33F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 76, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-45.5F, -15.5F, 33F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F, 0F, 0F, 0F, -33F, 0F, 0F, -33F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(31F, -21.5F, 33F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(66F, -15.5F, 18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(66F, -14.5F, 18F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 15, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(72F, -15.5F, 18F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 36, 9, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(30.5F, -15.5F, 33.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 9, 2, 0F, 0F, 0F, 0.5F, -0.5F, -0.1F, 1.5F, -0.5F, -0.1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -5F, 1.5F, -0.5F, -5F, -2.5F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(66.5F, -15.5F, 33.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(30F, -21.6F, -32F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(33F, -21.5F, -6F);

		bodyModel[31].addShapeBox(6F, -1F, 0F, 7, 2, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(33F, -21.5F, 3F);
		bodyModel[31].rotateAngleZ = -0.17453293F;

		bodyModel[32].addShapeBox(3F, -0.5F, 0F, 9, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(33F, -21.5F, -18F);
		bodyModel[32].rotateAngleZ = -0.17453293F;

		bodyModel[33].addShapeBox(12F, -0.5F, -10F, 5, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[33].setRotationPoint(33F, -21.5F, -18F);
		bodyModel[33].rotateAngleZ = -0.17453293F;

		bodyModel[34].addShapeBox(10F, -1.5F, 0F, 1, 2, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(33F, -21.5F, -11F);
		bodyModel[34].rotateAngleZ = -0.17453293F;

		bodyModel[35].addShapeBox(8.5F, -1.5F, 0F, 1, 2, 5, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(33F, -21.5F, -11.5F);
		bodyModel[35].rotateAngleX = -0.08726646F;
		bodyModel[35].rotateAngleY = -0.52359878F;
		bodyModel[35].rotateAngleZ = -0.15707963F;

		bodyModel[36].addShapeBox(16.5F, -1.5F, 0F, 2, 2, 7, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(33F, -21.5F, -11.5F);
		bodyModel[36].rotateAngleX = 0.08726646F;
		bodyModel[36].rotateAngleY = 0.45378561F;
		bodyModel[36].rotateAngleZ = -0.15707963F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(64.5F, -17.5F, -35F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(70F, -16.5F, -33F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(64.5F, -17.5F, 29F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[40].setRotationPoint(70F, -16.5F, 18F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(68F, -18.5F, -31F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(68F, -18.5F, 29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(67F, -16F, 14F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(66F, -16F, 14F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 49
		bodyModel[45].setRotationPoint(71F, -15.5F, 15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -0.9F, 0.5F, 0F, -0.9F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 50
		bodyModel[46].setRotationPoint(72F, -15.5F, 15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(67F, -16F, -18F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(66F, -16F, -18F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 53
		bodyModel[49].setRotationPoint(71F, -15.5F, -17F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0.5F, -0.9F, 0F, 0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, -0.9F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 54
		bodyModel[50].setRotationPoint(72F, -15.5F, -17F);

		bodyModel[51].addShapeBox(-1F, -1.5F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(66F, -15.5F, 1.5F);
		bodyModel[51].rotateAngleZ = -0.52359878F;

		bodyModel[52].addShapeBox(-1F, -1.5F, 0F, 9, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[52].setRotationPoint(66F, -15.5F, -4.5F);
		bodyModel[52].rotateAngleZ = -0.52359878F;

		bodyModel[53].addShapeBox(1F, -2.5F, -1F, 2, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(66F, -15.5F, -4.5F);
		bodyModel[53].rotateAngleZ = -0.52359878F;

		bodyModel[54].addShapeBox(4F, -2.5F, -1F, 2, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[54].setRotationPoint(66F, -15.5F, -4.5F);
		bodyModel[54].rotateAngleZ = -0.52359878F;

		bodyModel[55].addShapeBox(0F, -3.5F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(66F, -15.5F, 1.5F);
		bodyModel[55].rotateAngleZ = -0.52359878F;

		bodyModel[56].addShapeBox(3F, -3.5F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(66F, -15.5F, 1.5F);
		bodyModel[56].rotateAngleZ = -0.52359878F;

		bodyModel[57].addShapeBox(6F, -3.5F, -1F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(66F, -15.5F, 1.5F);
		bodyModel[57].rotateAngleZ = -0.52359878F;

		bodyModel[58].addShapeBox(0F, -0.5F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(66F, -15.5F, -3.5F);
		bodyModel[58].rotateAngleZ = -0.52359878F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(69F, -14F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(73F, -14F, -12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(69F, -14F, 11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(73F, -14F, 11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[63].setRotationPoint(19F, -21.7F, -32F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(8F, -21.7F, -32F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[65].setRotationPoint(19F, -21.7F, 23F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 70
		bodyModel[66].setRotationPoint(8F, -21.7F, 23F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
		bodyModel[67].setRotationPoint(28.5F, -14.5F, 33F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 19, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(-17F, -21.7F, -31F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-17F, -21.7F, 26F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[70].setRotationPoint(-1F, -21.7F, 27F);

		bodyModel[71].addShapeBox(2F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(-71.5F, -24.8F, -32F);
		bodyModel[71].rotateAngleZ = -0.06108652F;

		bodyModel[72].addShapeBox(2F, -1F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-71.5F, -24.8F, 31F);
		bodyModel[72].rotateAngleZ = -0.06108652F;

		bodyModel[73].addShapeBox(9F, -1F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-71.5F, -24.8F, -22F);
		bodyModel[73].rotateAngleZ = -0.06108652F;

		bodyModel[74].addShapeBox(5F, -1F, 0F, 4, 2, 4, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(-71.5F, -24.8F, -22F);
		bodyModel[74].rotateAngleZ = -0.06108652F;

		bodyModel[75].addShapeBox(5F, -1F, 0F, 2, 2, 39, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-71.5F, -24.8F, -18F);
		bodyModel[75].rotateAngleZ = -0.06108652F;

		bodyModel[76].addShapeBox(9F, -1F, 0F, 18, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[76].setRotationPoint(-71.5F, -24.8F, 23F);
		bodyModel[76].rotateAngleZ = -0.06108652F;

		bodyModel[77].addShapeBox(5F, -1F, 0F, 4, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 82
		bodyModel[77].setRotationPoint(-71.5F, -24.8F, 21F);
		bodyModel[77].rotateAngleZ = -0.06108652F;

		bodyModel[78].addShapeBox(8F, 0.5F, -1F, 19, 2, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[78].setRotationPoint(-71.5F, -24.8F, -18F);

		bodyModel[79].addShapeBox(31F, -0.5F, 0F, 21, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[79].setRotationPoint(-71.5F, -24.8F, -32F);
		bodyModel[79].rotateAngleZ = -0.06108652F;

		bodyModel[80].addShapeBox(31F, -0.5F, 0F, 21, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[80].setRotationPoint(-71.5F, -24.8F, 24F);
		bodyModel[80].rotateAngleZ = -0.06108652F;

		bodyModel[81].addShapeBox(8F, 0.5F, -1F, 17, 2, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[81].setRotationPoint(-70.5F, -25.3F, -16F);

		bodyModel[82].addShapeBox(8F, 0.5F, -1F, 17, 2, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[82].setRotationPoint(-70.5F, -25.3F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[83].setRotationPoint(-67.5F, -15.5F, -32F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[84].setRotationPoint(-68F, -13.5F, -30F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[85].setRotationPoint(-68F, -13.5F, -23F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[86].setRotationPoint(-68.5F, -10.5F, -32F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		bodyModel[87].setRotationPoint(-68.5F, -5.5F, -32F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[88].setRotationPoint(-67.5F, -15.5F, 18F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[89].setRotationPoint(-68F, -13.5F, 25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[90].setRotationPoint(-68F, -13.5F, 21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[91].setRotationPoint(-68.5F, -10.5F, 18F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 94
		bodyModel[92].setRotationPoint(-68.5F, -5.5F, 18F);

		bodyModel[93].addShapeBox(-1F, 0F, 0F, 1, 10, 64, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 95
		bodyModel[93].setRotationPoint(-71.5F, -24.8F, -32F);
		bodyModel[93].rotateAngleZ = 0.19198622F;

		bodyModel[94].addShapeBox(-2F, 0F, 0F, 1, 9, 60, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(-71.5F, -24.8F, -30F);
		bodyModel[94].rotateAngleZ = 0.19198622F;

		bodyModel[95].addShapeBox(-0.5F, 1F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[95].setRotationPoint(-69.5F, -14.5F, -11F);
		bodyModel[95].rotateAngleZ = 0.41887902F;

		bodyModel[96].addShapeBox(-0.5F, 1F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[96].setRotationPoint(-69.5F, -14.5F, 2F);
		bodyModel[96].rotateAngleZ = 0.41887902F;

		bodyModel[97].addShapeBox(-1.5F, 3F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(-69.5F, -14.5F, -1.5F);
		bodyModel[97].rotateAngleZ = 0.41887902F;

		bodyModel[98].addShapeBox(31F, -0.5F, 0F, 15, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[98].setRotationPoint(-69.5F, -20.8F, 32.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[99].setRotationPoint(-40F, -5.5F, -18F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 226
		bodyModel[100].setRotationPoint(-50F, -5.5F, -21F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 227
		bodyModel[101].setRotationPoint(-50F, -5.5F, 18F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 228
		bodyModel[102].setRotationPoint(-34F, -5.5F, 18F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[103].setRotationPoint(-24F, -5.5F, -18F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 230
		bodyModel[104].setRotationPoint(-18F, -5.5F, 18F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[105].setRotationPoint(-8F, -5.5F, -18F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 232
		bodyModel[106].setRotationPoint(-2F, -5.5F, 18F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[107].setRotationPoint(8F, -5.5F, -18F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 234
		bodyModel[108].setRotationPoint(14F, -5.5F, 18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[109].setRotationPoint(24F, -5.5F, -18F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 236
		bodyModel[110].setRotationPoint(31F, -5.5F, 18F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[111].setRotationPoint(41F, -5.5F, -18F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 238
		bodyModel[112].setRotationPoint(47F, -5.5F, 18F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[113].setRotationPoint(57F, -5.5F, -18F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 240
		bodyModel[114].setRotationPoint(-34F, -5.5F, -21F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 241
		bodyModel[115].setRotationPoint(-18F, -5.5F, -21F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 242
		bodyModel[116].setRotationPoint(-2F, -5.5F, -21F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 243
		bodyModel[117].setRotationPoint(14F, -5.5F, -21F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 244
		bodyModel[118].setRotationPoint(31F, -5.5F, -21F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F); // Box 245
		bodyModel[119].setRotationPoint(47F, -5.5F, -21F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[120].setRotationPoint(-21.5F, -3.5F, 33F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[121].setRotationPoint(-21.5F, -7.5F, 33F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 266
		bodyModel[122].setRotationPoint(-14.5F, -7.5F, 33F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[123].setRotationPoint(-20.5F, -7.5F, 33F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[124].setRotationPoint(-15.5F, -7.5F, 33F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[125].setRotationPoint(17.5F, -7.5F, 33F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 270
		bodyModel[126].setRotationPoint(18.5F, -7.5F, 33F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[127].setRotationPoint(11.5F, -3.5F, 33F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[128].setRotationPoint(12.5F, -7.5F, 33F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[129].setRotationPoint(11.5F, -7.5F, 33F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[130].setRotationPoint(-21.5F, -3.5F, -34F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[131].setRotationPoint(-21.5F, -7.5F, -34F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 276
		bodyModel[132].setRotationPoint(-14.5F, -7.5F, -34F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[133].setRotationPoint(-20.5F, -7.5F, -34F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[134].setRotationPoint(-15.5F, -7.5F, -34F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[135].setRotationPoint(17.5F, -7.5F, -34F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 280
		bodyModel[136].setRotationPoint(18.5F, -7.5F, -34F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[137].setRotationPoint(11.5F, -3.5F, -34F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[138].setRotationPoint(12.5F, -7.5F, -34F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[139].setRotationPoint(11.5F, -7.5F, -34F);

		bodyModel[140].addShapeBox(31F, -0.5F, 0F, 26, 1, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[140].setRotationPoint(-72.5F, -23F, -17F);
		bodyModel[140].rotateAngleZ = -0.02792527F;

		bodyModel[141].addShapeBox(38F, -1F, 0F, 11, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[141].setRotationPoint(-72.5F, -23F, -15F);
		bodyModel[141].rotateAngleZ = -0.02792527F;

		bodyModel[142].addShapeBox(38F, -1F, 0F, 11, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[142].setRotationPoint(-72.5F, -23F, 7F);
		bodyModel[142].rotateAngleZ = -0.02792527F;


		turretModel = new ModelRendererTurbo[118];
		turretModel[0] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 100
		turretModel[1] = new ModelRendererTurbo(this, 0, 1411, textureX, textureY); // Box 101
		turretModel[2] = new ModelRendererTurbo(this, 0, 1474, textureX, textureY); // Box 102
		turretModel[3] = new ModelRendererTurbo(this, 0, 1481, textureX, textureY); // Box 104
		turretModel[4] = new ModelRendererTurbo(this, 0, 1491, textureX, textureY); // Box 105
		turretModel[5] = new ModelRendererTurbo(this, 0, 1506, textureX, textureY); // Box 106
		turretModel[6] = new ModelRendererTurbo(this, 40, 1474, textureX, textureY); // Box 107
		turretModel[7] = new ModelRendererTurbo(this, 0, 1518, textureX, textureY); // Box 108
		turretModel[8] = new ModelRendererTurbo(this, 0, 1541, textureX, textureY); // Box 109
		turretModel[9] = new ModelRendererTurbo(this, 0, 1554, textureX, textureY); // Box 110
		turretModel[10] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 111
		turretModel[11] = new ModelRendererTurbo(this, 50, 1541, textureX, textureY); // Box 112
		turretModel[12] = new ModelRendererTurbo(this, 65, 1554, textureX, textureY); // Box 113
		turretModel[13] = new ModelRendererTurbo(this, 65, 1575, textureX, textureY); // Box 114
		turretModel[14] = new ModelRendererTurbo(this, 0, 1596, textureX, textureY); // Box 115
		turretModel[15] = new ModelRendererTurbo(this, 0, 1618, textureX, textureY); // Box 117
		turretModel[16] = new ModelRendererTurbo(this, 0, 1628, textureX, textureY); // Box 119
		turretModel[17] = new ModelRendererTurbo(this, 0, 1641, textureX, textureY); // Box 121
		turretModel[18] = new ModelRendererTurbo(this, 0, 1655, textureX, textureY); // Box 123
		turretModel[19] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 124
		turretModel[20] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 125
		turretModel[21] = new ModelRendererTurbo(this, 0, 1661, textureX, textureY); // Box 126
		turretModel[22] = new ModelRendererTurbo(this, 0, 1663, textureX, textureY); // Box 127
		turretModel[23] = new ModelRendererTurbo(this, 0, 1665, textureX, textureY); // Box 128
		turretModel[24] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 129
		turretModel[25] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 130
		turretModel[26] = new ModelRendererTurbo(this, 0, 1655, textureX, textureY); // Box 137
		turretModel[27] = new ModelRendererTurbo(this, 0, 1657, textureX, textureY); // Box 138
		turretModel[28] = new ModelRendererTurbo(this, 0, 1659, textureX, textureY); // Box 139
		turretModel[29] = new ModelRendererTurbo(this, 0, 1661, textureX, textureY); // Box 140
		turretModel[30] = new ModelRendererTurbo(this, 0, 1663, textureX, textureY); // Box 141
		turretModel[31] = new ModelRendererTurbo(this, 0, 1665, textureX, textureY); // Box 142
		turretModel[32] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 143
		turretModel[33] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Box 144
		turretModel[34] = new ModelRendererTurbo(this, 0, 1673, textureX, textureY); // Box 145
		turretModel[35] = new ModelRendererTurbo(this, 0, 1698, textureX, textureY); // Box 146
		turretModel[36] = new ModelRendererTurbo(this, 0, 1714, textureX, textureY); // Box 147
		turretModel[37] = new ModelRendererTurbo(this, 21, 1714, textureX, textureY); // Box 148
		turretModel[38] = new ModelRendererTurbo(this, 0, 1672, textureX, textureY); // Box 149
		turretModel[39] = new ModelRendererTurbo(this, 0, 1736, textureX, textureY); // Box 150
		turretModel[40] = new ModelRendererTurbo(this, 0, 1795, textureX, textureY); // Box 151
		turretModel[41] = new ModelRendererTurbo(this, 0, 1851, textureX, textureY); // Box 152
		turretModel[42] = new ModelRendererTurbo(this, 0, 1883, textureX, textureY); // Box 153
		turretModel[43] = new ModelRendererTurbo(this, 0, 1903, textureX, textureY); // Box 154
		turretModel[44] = new ModelRendererTurbo(this, 0, 1914, textureX, textureY); // Box 155
		turretModel[45] = new ModelRendererTurbo(this, 0, 1924, textureX, textureY); // Box 156
		turretModel[46] = new ModelRendererTurbo(this, 0, 1924, textureX, textureY); // Box 157
		turretModel[47] = new ModelRendererTurbo(this, 55, 1931, textureX, textureY); // Box 158
		turretModel[48] = new ModelRendererTurbo(this, 30, 1944, textureX, textureY); // Box 159
		turretModel[49] = new ModelRendererTurbo(this, 15, 1963, textureX, textureY); // Box 160
		turretModel[50] = new ModelRendererTurbo(this, 30, 1975, textureX, textureY); // Box 161
		turretModel[51] = new ModelRendererTurbo(this, 0, 1931, textureX, textureY); // Box 162
		turretModel[52] = new ModelRendererTurbo(this, 0, 1944, textureX, textureY); // Box 163
		turretModel[53] = new ModelRendererTurbo(this, 0, 1963, textureX, textureY); // Box 164
		turretModel[54] = new ModelRendererTurbo(this, 0, 1975, textureX, textureY); // Box 165
		turretModel[55] = new ModelRendererTurbo(this, 0, 1983, textureX, textureY); // Box 166
		turretModel[56] = new ModelRendererTurbo(this, 0, 1995, textureX, textureY); // Box 167
		turretModel[57] = new ModelRendererTurbo(this, 0, 2016, textureX, textureY); // Box 168
		turretModel[58] = new ModelRendererTurbo(this, 0, 2021, textureX, textureY); // Box 169
		turretModel[59] = new ModelRendererTurbo(this, 36, 2024, textureX, textureY); // Box 170
		turretModel[60] = new ModelRendererTurbo(this, 0, 2026, textureX, textureY); // Box 171
		turretModel[61] = new ModelRendererTurbo(this, 10, 2026, textureX, textureY); // Box 180
		turretModel[62] = new ModelRendererTurbo(this, 20, 2026, textureX, textureY); // Box 181
		turretModel[63] = new ModelRendererTurbo(this, 30, 2026, textureX, textureY); // Box 182
		turretModel[64] = new ModelRendererTurbo(this, 0, 2024, textureX, textureY); // Box 188
		turretModel[65] = new ModelRendererTurbo(this, 80, 2026, textureX, textureY); // Box 189
		turretModel[66] = new ModelRendererTurbo(this, 90, 2026, textureX, textureY); // Box 190
		turretModel[67] = new ModelRendererTurbo(this, 100, 2026, textureX, textureY); // Box 191
		turretModel[68] = new ModelRendererTurbo(this, 110, 2026, textureX, textureY); // Box 192
		turretModel[69] = new ModelRendererTurbo(this, 53, 2033, textureX, textureY); // Box 193
		turretModel[70] = new ModelRendererTurbo(this, 40, 2026, textureX, textureY); // Box 194
		turretModel[71] = new ModelRendererTurbo(this, 50, 2026, textureX, textureY); // Box 195
		turretModel[72] = new ModelRendererTurbo(this, 60, 2026, textureX, textureY); // Box 196
		turretModel[73] = new ModelRendererTurbo(this, 70, 2026, textureX, textureY); // Box 197
		turretModel[74] = new ModelRendererTurbo(this, 0, 2033, textureX, textureY); // Box 198
		turretModel[75] = new ModelRendererTurbo(this, 120, 2026, textureX, textureY); // Box 199
		turretModel[76] = new ModelRendererTurbo(this, 130, 2026, textureX, textureY); // Box 200
		turretModel[77] = new ModelRendererTurbo(this, 140, 2026, textureX, textureY); // Box 201
		turretModel[78] = new ModelRendererTurbo(this, 150, 2026, textureX, textureY); // Box 202
		turretModel[79] = new ModelRendererTurbo(this, 189, 0, textureX, textureY); // Box 203
		turretModel[80] = new ModelRendererTurbo(this, 220, 0, textureX, textureY); // Box 204
		turretModel[81] = new ModelRendererTurbo(this, 250, 0, textureX, textureY); // Box 205
		turretModel[82] = new ModelRendererTurbo(this, 281, 0, textureX, textureY); // Box 206
		turretModel[83] = new ModelRendererTurbo(this, 188, 11, textureX, textureY); // Box 192
		turretModel[84] = new ModelRendererTurbo(this, 190, 19, textureX, textureY); // Box 193
		turretModel[85] = new ModelRendererTurbo(this, 190, 34, textureX, textureY); // Box 194
		turretModel[86] = new ModelRendererTurbo(this, 190, 77, textureX, textureY); // Box 195
		turretModel[87] = new ModelRendererTurbo(this, 190, 94, textureX, textureY); // Box 196
		turretModel[88] = new ModelRendererTurbo(this, 217, 94, textureX, textureY); // Box 197
		turretModel[89] = new ModelRendererTurbo(this, 243, 94, textureX, textureY); // Box 198
		turretModel[90] = new ModelRendererTurbo(this, 270, 94, textureX, textureY); // Box 199
		turretModel[91] = new ModelRendererTurbo(this, 190, 106, textureX, textureY); // Box 200
		turretModel[92] = new ModelRendererTurbo(this, 190, 118, textureX, textureY); // Box 201
		turretModel[93] = new ModelRendererTurbo(this, 190, 131, textureX, textureY); // Box 202
		turretModel[94] = new ModelRendererTurbo(this, 190, 154, textureX, textureY); // Box 203
		turretModel[95] = new ModelRendererTurbo(this, 190, 164, textureX, textureY); // Box 204
		turretModel[96] = new ModelRendererTurbo(this, 190, 174, textureX, textureY); // Box 205
		turretModel[97] = new ModelRendererTurbo(this, 190, 184, textureX, textureY); // Box 206
		turretModel[98] = new ModelRendererTurbo(this, 190, 194, textureX, textureY); // Box 207
		turretModel[99] = new ModelRendererTurbo(this, 190, 209, textureX, textureY); // Box 208
		turretModel[100] = new ModelRendererTurbo(this, 190, 329, textureX, textureY); // Box 209
		turretModel[101] = new ModelRendererTurbo(this, 190, 345, textureX, textureY); // Box 210
		turretModel[102] = new ModelRendererTurbo(this, 190, 353, textureX, textureY); // Box 211
		turretModel[103] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 212
		turretModel[104] = new ModelRendererTurbo(this, 190, 353, textureX, textureY); // Box 213
		turretModel[105] = new ModelRendererTurbo(this, 328, 194, textureX, textureY); // Box 284
		turretModel[106] = new ModelRendererTurbo(this, 328, 174, textureX, textureY); // Box 285
		turretModel[107] = new ModelRendererTurbo(this, 328, 158, textureX, textureY); // Box 286
		turretModel[108] = new ModelRendererTurbo(this, 50, 1618, textureX, textureY); // Box 287
		turretModel[109] = new ModelRendererTurbo(this, 41, 1628, textureX, textureY); // Box 288
		turretModel[110] = new ModelRendererTurbo(this, 35, 1641, textureX, textureY); // Box 289
		turretModel[111] = new ModelRendererTurbo(this, 385, 194, textureX, textureY); // Box 290
		turretModel[112] = new ModelRendererTurbo(this, 385, 174, textureX, textureY); // Box 291
		turretModel[113] = new ModelRendererTurbo(this, 365, 158, textureX, textureY); // Box 292
		turretModel[114] = new ModelRendererTurbo(this, 190, 373, textureX, textureY); // Box 293
		turretModel[115] = new ModelRendererTurbo(this, 190, 373, textureX, textureY); // Box 294
		turretModel[116] = new ModelRendererTurbo(this, 190, 373, textureX, textureY); // Box 295
		turretModel[117] = new ModelRendererTurbo(this, 190, 373, textureX, textureY); // Box 296

		turretModel[0].addShapeBox(0F, 0F, 0F, 27, 16, 47, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		turretModel[0].setRotationPoint(-9F, -37.5F, -24.5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 15, 16, 47, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		turretModel[1].setRotationPoint(18F, -37.5F, -24.5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10.3157F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 102
		turretModel[2].setRotationPoint(33F, -34.5F, -5.5F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F, 0F, 0F, 0F, -2.444F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5789F, 0F, 0F, 10.3157F, 0F, 0F, 0F, 0F, 0F); // Box 104
		turretModel[3].setRotationPoint(33F, -34.5F, -9.5F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 9, 0F, 0F, -2F, 0F, -4.8196F, -2F, 0F, 0.8969F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.421F, 0F, 0F, 7.5789F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[4].setRotationPoint(33F, -34.5F, -18.5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 6, 0F, 0F, 0F, 0F, -11.61F, 0F, 0F, -7.94F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.68421F, 0F, 0F, 1.421F, 0F, 0F, 0F, 0F, 0F); // Box 106
		turretModel[5].setRotationPoint(33F, -34.5F, -24.5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 10.3157F, 0F, 0F, 0F, 0F, 0F); // Box 107
		turretModel[6].setRotationPoint(33F, -34.5F, 4.5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 18, 6, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.61F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10.3157F, 0F, 0F, -2.68421F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[7].setRotationPoint(33F, -34.5F, 5.5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F, 0F, 0F, 0F, -2.68421F, 0F, 0F, 1.421F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.61F, 0F, 0F, -7.94F, 0F, 0F, 0F, 0F, 0F); // Box 109
		turretModel[8].setRotationPoint(33F, -28.5F, -24.5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 17, 7, 14, 0F, 0F, 0F, 0F, 1.421F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.94F, 0F, 0F, -7.94F, 0F, 0F, 0F, 0F, 0F); // Box 110
		turretModel[9].setRotationPoint(33F, -28.5F, -18.5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 18, 7, 14, 0F, 0F, 0F, 0F, 1.421F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3.9281F, -3F, 0F, 4.714F, -3F, 0F, 0F, -3F, 0F); // Box 111
		turretModel[10].setRotationPoint(33F, -28.5F, -18.5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F, 0F, 0F, 0F, 1.421F, 0F, 0F, -2.68421F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -7.94F, 0F, 0F, -11.61F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 112
		turretModel[11].setRotationPoint(33F, -28.5F, 17.1F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 17, 7, 14, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.421F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -7.94F, 0F, 0F, -7.94F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 113
		turretModel[12].setRotationPoint(33F, -28.5F, 4.5F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 18, 7, 14, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 1.421F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -3F, 0F, 4.714F, -3F, 0F, -3.9281F, -3F, -1.4F, 0F, -3F, -1.4F); // Box 114
		turretModel[13].setRotationPoint(33F, -28.5F, 4.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 13, 13, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		turretModel[14].setRotationPoint(33F, -34.5F, -4.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F, 0F, -0.5F, -3F, -14F, -0.5F, -3F, -11.61F, 0F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, -12F, 0F, -1F, -2.68421F, 0F, 0F, -0.5F, 0F, 0F); // Box 117
		turretModel[15].setRotationPoint(33F, -34.5F, -28.5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 0F, -0.5F, -3F, -0.5F, -3.5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		turretModel[16].setRotationPoint(18F, -37.5F, -28.5F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, -1F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		turretModel[17].setRotationPoint(5F, -37.5F, -28.5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 123
		turretModel[18].setRotationPoint(33F, -28.5F, -30.5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 124
		turretModel[19].setRotationPoint(30F, -28.5F, -28.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 125
		turretModel[20].setRotationPoint(45F, -28.5F, -26.5F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		turretModel[21].setRotationPoint(12F, -28.5F, -30.5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 127
		turretModel[22].setRotationPoint(9F, -28.5F, -28.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 128
		turretModel[23].setRotationPoint(24F, -28.5F, -28.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		turretModel[24].setRotationPoint(15F, -28.5F, -29.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		turretModel[25].setRotationPoint(23F, -28.5F, -29.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 137
		turretModel[26].setRotationPoint(33F, -28.5F, 27.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 138
		turretModel[27].setRotationPoint(30F, -28.5F, 25.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 139
		turretModel[28].setRotationPoint(45F, -28.5F, 23.5F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		turretModel[29].setRotationPoint(12F, -28.5F, 27.5F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 141
		turretModel[30].setRotationPoint(9F, -28.5F, 25.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 142
		turretModel[31].setRotationPoint(24F, -28.5F, 25.5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		turretModel[32].setRotationPoint(15F, -28.5F, 22.5F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		turretModel[33].setRotationPoint(23F, -28.5F, 22.5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 11, 16, 9, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 145
		turretModel[34].setRotationPoint(24F, -38.5F, -18.5F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 7, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		turretModel[35].setRotationPoint(34F, -36.5F, -2.5F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		turretModel[36].setRotationPoint(25F, -37.5F, -7.5F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		turretModel[37].setRotationPoint(25F, -37.5F, 6.5F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 12, 16, 47, 0F, 0F, 0F, -1.565F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1.565F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 149
		turretModel[38].setRotationPoint(-21F, -37.5F, -24.5F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 11, 12, 47, 0F, 0F, 0F, -3F, 0F, 0F, -1.565F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.565F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		turretModel[39].setRotationPoint(-32F, -37.5F, -24.5F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 11, 12, 44, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 151
		turretModel[40].setRotationPoint(-43F, -37.5F, -21.5F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 8, 10, 22, 0F, 0F, -1.5F, -4.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, -4.36F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 152
		turretModel[41].setRotationPoint(-51F, -36.5F, -15.5F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 10, 10, 0F, 0F, -1.5F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, -5.36F, 0F, -1.5F, -4.36F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -5.36F, -1F, 0F, -4.36F); // Box 153
		turretModel[42].setRotationPoint(-51F, -36.5F, 6.5F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 8, 10, 1, 0F, -1F, -1.35F, 4.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4.36F, -2F, 0F, 4.36F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4.36F); // Box 154
		turretModel[43].setRotationPoint(-51F, -36.5F, 15.5F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.36F); // Box 155
		turretModel[44].setRotationPoint(-49F, -27.5F, 6.5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		turretModel[45].setRotationPoint(-55F, -34.5F, -8.5F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		turretModel[46].setRotationPoint(-55F, -34.5F, -2.5F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		turretModel[47].setRotationPoint(-50F, -28F, 12.5F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[48].setRotationPoint(-50F, -34F, 11.5F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[49].setRotationPoint(-36F, -34F, 19.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[50].setRotationPoint(-49F, -34F, 23.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0.5F); // Box 162
		turretModel[51].setRotationPoint(-50F, -28F, -23.5F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 163
		turretModel[52].setRotationPoint(-50F, -34F, -23.5F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		turretModel[53].setRotationPoint(-36F, -34F, -23.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		turretModel[54].setRotationPoint(-49F, -34F, -23.5F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 23, 1, 10, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		turretModel[55].setRotationPoint(-31F, -38F, -23.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 20, 1, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 167
		turretModel[56].setRotationPoint(-30F, -38F, 2.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[57].setRotationPoint(-20F, -38F, -1.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		turretModel[58].setRotationPoint(-19F, -40F, -0.5F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		turretModel[59].setRotationPoint(-32F, -33F, 22.5F);

		turretModel[60].addShapeBox(0F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 171
		turretModel[60].setRotationPoint(-32F, -33F, 22.5F);

		turretModel[61].addShapeBox(3F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 180
		turretModel[61].setRotationPoint(-32F, -33F, 22.5F);

		turretModel[62].addShapeBox(6F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 181
		turretModel[62].setRotationPoint(-32F, -33F, 22.5F);

		turretModel[63].addShapeBox(9F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 182
		turretModel[63].setRotationPoint(-32F, -33F, 22.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		turretModel[64].setRotationPoint(-32F, -33F, -22.5F);
		turretModel[64].rotateAngleY = -0.10471976F;

		turretModel[65].addShapeBox(0F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 189
		turretModel[65].setRotationPoint(-32F, -33F, -23.5F);
		turretModel[65].rotateAngleY = -0.10471976F;

		turretModel[66].addShapeBox(3F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 190
		turretModel[66].setRotationPoint(-32F, -33F, -23.5F);
		turretModel[66].rotateAngleY = -0.10471976F;

		turretModel[67].addShapeBox(6F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 191
		turretModel[67].setRotationPoint(-32F, -33F, -23.5F);
		turretModel[67].rotateAngleY = -0.10471976F;

		turretModel[68].addShapeBox(9F, -3.5F, 0F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 192
		turretModel[68].setRotationPoint(-32F, -33F, -23.5F);
		turretModel[68].rotateAngleY = -0.10471976F;

		turretModel[69].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		turretModel[69].setRotationPoint(-24F, -29F, 19.5F);

		turretModel[70].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 194
		turretModel[70].setRotationPoint(-24F, -29F, 23.5F);
		turretModel[70].rotateAngleY = 0.45378561F;

		turretModel[71].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 195
		turretModel[71].setRotationPoint(-16F, -29F, 23.5F);
		turretModel[71].rotateAngleY = 0.45378561F;

		turretModel[72].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 196
		turretModel[72].setRotationPoint(-12F, -29F, 23.5F);
		turretModel[72].rotateAngleY = 0.31415927F;

		turretModel[73].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 197
		turretModel[73].setRotationPoint(-9F, -29F, 23.5F);
		turretModel[73].rotateAngleY = 0.03490659F;

		turretModel[74].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		turretModel[74].setRotationPoint(-24F, -29F, -26.5F);

		turretModel[75].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 199
		turretModel[75].setRotationPoint(-24F, -29F, -25.5F);
		turretModel[75].rotateAngleY = -0.45378561F;

		turretModel[76].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 200
		turretModel[76].setRotationPoint(-16F, -29F, -25.5F);
		turretModel[76].rotateAngleY = -0.45378561F;

		turretModel[77].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 201
		turretModel[77].setRotationPoint(-12F, -29F, -25.5F);
		turretModel[77].rotateAngleY = -0.31415927F;

		turretModel[78].addShapeBox(0F, -3.5F, -1F, 2, 4, 2, 0F, -2.2F, 0F, -0.2F, 1.8F, -1F, -0.2F, 1.8F, -1F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F); // Box 202
		turretModel[78].setRotationPoint(-9F, -29F, -25.5F);
		turretModel[78].rotateAngleY = 0.03490659F;

		turretModel[79].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		turretModel[79].setRotationPoint(-4F, -40F, 3.5F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F); // Box 204
		turretModel[80].setRotationPoint(-4F, -40F, 10.5F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 205
		turretModel[81].setRotationPoint(3F, -40F, 10.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		turretModel[82].setRotationPoint(3F, -40F, 3.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		turretModel[83].setRotationPoint(-15F, -39F, -7.5F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		turretModel[84].setRotationPoint(-9F, -38F, -18F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		turretModel[85].setRotationPoint(-4F, -38F, -18F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		turretModel[86].setRotationPoint(-1F, -38F, -19F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		turretModel[87].setRotationPoint(-3F, -40F, -17F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 197
		turretModel[88].setRotationPoint(-3F, -40F, -11F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 198
		turretModel[89].setRotationPoint(3F, -40F, -11F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		turretModel[90].setRotationPoint(3F, -40F, -17F);

		turretModel[91].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		turretModel[91].setRotationPoint(10F, -39F, -16F);

		turretModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[92].setRotationPoint(9.5F, -42F, -16.5F);

		turretModel[93].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		turretModel[93].setRotationPoint(-8F, -40F, -7.5F);

		turretModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		turretModel[94].setRotationPoint(-8.5F, -42F, -8F);

		turretModel[95].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		turretModel[95].setRotationPoint(-7.5F, -47F, -7F);

		turretModel[96].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		turretModel[96].setRotationPoint(-5.5F, -47F, -7F);

		turretModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		turretModel[97].setRotationPoint(16F, -39F, 10.5F);
		turretModel[97].rotateAngleY = 0.6981317F;

		turretModel[98].addShapeBox(-13F, 0F, 0F, 13, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		turretModel[98].setRotationPoint(60F, -33.5F, 5.5F);
		turretModel[98].rotateAngleZ = 0.34906585F;

		turretModel[99].addShapeBox(-6F, -3F, 0F, 1, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		turretModel[99].setRotationPoint(60F, -33.5F, 5.5F);
		turretModel[99].rotateAngleZ = 0.34906585F;

		turretModel[100].addShapeBox(-5F, -3F, 0.5F, 4, 3, 12, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		turretModel[100].setRotationPoint(60F, -33.5F, 5.5F);
		turretModel[100].rotateAngleZ = 0.34906585F;

		turretModel[101].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 210
		turretModel[101].setRotationPoint(-34F, -40F, -19.5F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 211
		turretModel[102].setRotationPoint(-34F, -57F, -19.5F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 212
		turretModel[103].setRotationPoint(-34F, -40F, 17.5F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 213
		turretModel[104].setRotationPoint(-34F, -57F, 17.5F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 18, 7, 4, 0F, 4F, 0F, 0F, -12F, 0F, -1F, -2.68421F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -3F, -14F, -0.5F, -3F, -11.61F, 0F, 0F, -0.5F, 0F, 0F); // Box 284
		turretModel[105].setRotationPoint(33F, -28.5F, -28.5F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		turretModel[106].setRotationPoint(18F, -28.5F, -28.5F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		turretModel[107].setRotationPoint(5F, -28.5F, -28.5F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 18, 6, 4, 0F, -0.5F, 0F, 0F, -11.61F, 0F, 0F, -14F, -0.5F, -3F, 0F, -0.5F, -3F, -0.5F, 0F, 0F, -2.68421F, 0F, 0F, -12F, 0F, -1F, 4F, 0F, 0F); // Box 287
		turretModel[108].setRotationPoint(33F, -34.5F, 22.5F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 15, 9, 4, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[109].setRotationPoint(18F, -37.5F, 22.5F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 13, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, -1F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // Box 289
		turretModel[110].setRotationPoint(5F, -37.5F, 22.5F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 18, 7, 4, 0F, -0.5F, 0F, 0F, -2.68421F, 0F, 0F, -12F, 0F, -1F, 4F, 0F, 0F, -0.5F, 0F, 0F, -11.61F, 0F, 0F, -14F, -0.5F, -3F, 0F, -0.5F, -3F); // Box 290
		turretModel[111].setRotationPoint(33F, -28.5F, 22.5F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -3F, 0F, -0.5F, -3F); // Box 291
		turretModel[112].setRotationPoint(18F, -28.5F, 22.5F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 13, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, -1F, -0.5F, -3F); // Box 292
		turretModel[113].setRotationPoint(5F, -28.5F, 22.5F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[114].setRotationPoint(33F, -28.5F, -30.3F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 294
		turretModel[115].setRotationPoint(42F, -28.5F, -28.3F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 295
		turretModel[116].setRotationPoint(33F, -28.5F, 23.3F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 296
		turretModel[117].setRotationPoint(42F, -28.5F, 21.3F);


		barrelModel = new ModelRendererTurbo[10];
		barrelModel[0] = new ModelRendererTurbo(this, 188, 380, textureX, textureY); // Box 214
		barrelModel[1] = new ModelRendererTurbo(this, 188, 395, textureX, textureY); // Box 215
		barrelModel[2] = new ModelRendererTurbo(this, 188, 411, textureX, textureY); // Box 216
		barrelModel[3] = new ModelRendererTurbo(this, 188, 419, textureX, textureY); // Box 217
		barrelModel[4] = new ModelRendererTurbo(this, 188, 427, textureX, textureY); // Box 218
		barrelModel[5] = new ModelRendererTurbo(this, 188, 439, textureX, textureY); // Box 219
		barrelModel[6] = new ModelRendererTurbo(this, 188, 447, textureX, textureY); // Box 220
		barrelModel[7] = new ModelRendererTurbo(this, 188, 455, textureX, textureY); // Box 221
		barrelModel[8] = new ModelRendererTurbo(this, 188, 463, textureX, textureY); // Box 222
		barrelModel[9] = new ModelRendererTurbo(this, 188, 471, textureX, textureY); // Box 223

		barrelModel[0].addShapeBox(0F, -7F, -4.5F, 5, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F); // Box 214
		barrelModel[0].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[1].addShapeBox(0F, -1F, -4.5F, 5, 7, 9, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		barrelModel[1].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[2].addShapeBox(12F, -2F, -2F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		barrelModel[2].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[3].addShapeBox(26F, -2F, -2F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 217
		barrelModel[3].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[4].addShapeBox(28F, -4F, -3F, 10, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		barrelModel[4].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[5].addShapeBox(38F, -2F, -2F, 3, 4, 4, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 219
		barrelModel[5].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[6].addShapeBox(41F, -2F, -2F, 35, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 220
		barrelModel[6].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[7].addShapeBox(76F, -2F, -2F, 2, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		barrelModel[7].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[8].addShapeBox(78F, -2F, -2F, 4, 4, 4, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 222
		barrelModel[8].setRotationPoint(46F, -27.5F, 0F);

		barrelModel[9].addShapeBox(77F, -1F, -3F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		barrelModel[9].setRotationPoint(46F, -27.5F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[9];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 255
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 256
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 257
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 258
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 259
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 260
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 261
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 188, 551, textureX, textureY); // Shape 262
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 188, 579, textureX, textureY); // Shape 263

		leftTrackWheelModels[0].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 255
		leftTrackWheelModels[0].setRotationPoint(49F, 1.5F, 30F);

		leftTrackWheelModels[1].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 256
		leftTrackWheelModels[1].setRotationPoint(33F, 1.5F, 30F);

		leftTrackWheelModels[2].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 257
		leftTrackWheelModels[2].setRotationPoint(17F, 1.5F, 30F);

		leftTrackWheelModels[3].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 258
		leftTrackWheelModels[3].setRotationPoint(-15F, 1.5F, 30F);

		leftTrackWheelModels[4].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 259
		leftTrackWheelModels[4].setRotationPoint(1F, 1.5F, 30F);

		leftTrackWheelModels[5].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 260
		leftTrackWheelModels[5].setRotationPoint(-31F, 1.5F, 30F);

		leftTrackWheelModels[6].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 261
		leftTrackWheelModels[6].setRotationPoint(-47F, 1.5F, 30F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,4 ,6 ,4 ,6 ,4 ,7}); // Shape 262
		leftTrackWheelModels[7].setRotationPoint(66F, -7F, 30F);

		leftTrackWheelModels[8].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,4 ,6 ,4 ,6 ,4 ,7}); // Shape 263
		leftTrackWheelModels[8].setRotationPoint(-59F, -7F, 30F);


		rightTrackWheelModels = new ModelRendererTurbo[9];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 246
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 247
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 248
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 249
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 250
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 251
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 188, 525, textureX, textureY); // Shape 252
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 188, 579, textureX, textureY); // Shape 253
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 188, 551, textureX, textureY); // Shape 254

		rightTrackWheelModels[0].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 246
		rightTrackWheelModels[0].setRotationPoint(-47F, 1.5F, -21F);

		rightTrackWheelModels[1].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 247
		rightTrackWheelModels[1].setRotationPoint(-31F, 1.5F, -21F);

		rightTrackWheelModels[2].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 248
		rightTrackWheelModels[2].setRotationPoint(-15F, 1.5F, -21F);

		rightTrackWheelModels[3].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 249
		rightTrackWheelModels[3].setRotationPoint(1F, 1.5F, -21F);

		rightTrackWheelModels[4].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 250
		rightTrackWheelModels[4].setRotationPoint(17F, 1.5F, -21F);

		rightTrackWheelModels[5].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 251
		rightTrackWheelModels[5].setRotationPoint(33F, 1.5F, -21F);

		rightTrackWheelModels[6].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 252
		rightTrackWheelModels[6].setRotationPoint(49F, 1.5F, -21F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,4 ,6 ,4 ,6 ,4 ,7}); // Shape 253
		rightTrackWheelModels[7].setRotationPoint(-59F, -7F, -18F);

		rightTrackWheelModels[8].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {3 ,6 ,4 ,6 ,4 ,6 ,4 ,7}); // Shape 254
		rightTrackWheelModels[8].setRotationPoint(66F, -7F, -18F);


		fancyTrackModel = new ModelRendererTurbo[3];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 188, 607, textureX, textureY); // Box 291
		fancyTrackModel[1] = new ModelRendererTurbo(this, 188, 620, textureX, textureY); // Box 292
		fancyTrackModel[2] = new ModelRendererTurbo(this, 188, 620, textureX, textureY); // Box 293

		fancyTrackModel[0].addShapeBox(-1.5F, -1F, -5.5F, 4, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291

		fancyTrackModel[1].addShapeBox(-2.5F, -1F, -6.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292

		fancyTrackModel[2].addShapeBox(-2.5F, -1F, 5.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}