//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 27.12.2016 - 15:46:19
// Last changed on: 27.12.2016 - 15:46:19

package com.flansmod.client.model.mw; //Path where the model is located

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.vector.Vector3f;

public class ModelT90 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 2048;

	public ModelT90() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[190];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 135, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 184, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 233, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 282, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 333, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 382, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 437, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 0, 494, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 0, 523, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 0, 538, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 0, 546, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 0, 550, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 0, 557, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 0, 569, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 0, 595, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 16, 569, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 21, 569, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 0, 608, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 0, 621, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 0, 636, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 0, 651, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 655, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 0, 659, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 0, 672, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 0, 683, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 0, 686, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 17, 672, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 39, 659, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 0, 689, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 0, 692, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 0, 509, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 34, 523, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 0, 542, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 9, 546, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 11, 550, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 81, 557, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 5, 569, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 51, 582, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 59, 595, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 11, 569, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 26, 569, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 57, 608, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 43, 621, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 41, 636, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 21, 651, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 19, 655, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 19, 659, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 51, 672, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 17, 683, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 19, 686, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 34, 672, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 58, 659, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 43, 689, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 43, 692, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 58, 716, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 0, 734, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 0, 751, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 87, 716, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 116, 716, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 29, 716, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 0, 716, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 32, 768, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 0, 781, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 0, 768, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 75
		bodyModel[72] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 76
		bodyModel[73] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 77
		bodyModel[74] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 96, 768, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 32, 781, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 64, 768, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 99
		bodyModel[88] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 100
		bodyModel[89] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 101
		bodyModel[90] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 102
		bodyModel[91] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 69, 700, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 203, 716, textureX, textureY); // Box 107
		bodyModel[96] = new ModelRendererTurbo(this, 0, 794, textureX, textureY); // Box 108
		bodyModel[97] = new ModelRendererTurbo(this, 94, 751, textureX, textureY); // Box 109
		bodyModel[98] = new ModelRendererTurbo(this, 232, 716, textureX, textureY); // Box 110
		bodyModel[99] = new ModelRendererTurbo(this, 261, 716, textureX, textureY); // Box 111
		bodyModel[100] = new ModelRendererTurbo(this, 174, 716, textureX, textureY); // Box 112
		bodyModel[101] = new ModelRendererTurbo(this, 145, 716, textureX, textureY); // Box 113
		bodyModel[102] = new ModelRendererTurbo(this, 0, 811, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 0, 828, textureX, textureY); // Box 115
		bodyModel[104] = new ModelRendererTurbo(this, 0, 844, textureX, textureY); // Box 116
		bodyModel[105] = new ModelRendererTurbo(this, 0, 856, textureX, textureY); // Box 117
		bodyModel[106] = new ModelRendererTurbo(this, 0, 869, textureX, textureY); // Box 118
		bodyModel[107] = new ModelRendererTurbo(this, 0, 869, textureX, textureY); // Box 119
		bodyModel[108] = new ModelRendererTurbo(this, 0, 913, textureX, textureY); // Box 120
		bodyModel[109] = new ModelRendererTurbo(this, 0, 953, textureX, textureY); // Box 121
		bodyModel[110] = new ModelRendererTurbo(this, 0, 993, textureX, textureY); // Box 122
		bodyModel[111] = new ModelRendererTurbo(this, 40, 1026, textureX, textureY); // Box 123
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1026, textureX, textureY); // Box 124
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1042, textureX, textureY); // Box 125
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1042, textureX, textureY); // Box 126
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1042, textureX, textureY); // Box 127
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1048, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1054, textureX, textureY); // Box 129
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 130
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1066, textureX, textureY); // Box 131
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1066, textureX, textureY); // Box 132
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1048, textureX, textureY); // Box 133
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1054, textureX, textureY); // Box 134
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 135
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1048, textureX, textureY); // Box 136
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1054, textureX, textureY); // Box 137
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 138
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1066, textureX, textureY); // Box 139
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1066, textureX, textureY); // Box 140
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1048, textureX, textureY); // Box 141
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1054, textureX, textureY); // Box 142
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Box 143
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1072, textureX, textureY); // Box 144
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1081, textureX, textureY); // Box 145
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1088, textureX, textureY); // Box 146
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1096, textureX, textureY); // Box 147
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1115, textureX, textureY); // Box 148
		bodyModel[137] = new ModelRendererTurbo(this, 26, 1115, textureX, textureY); // Box 149
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1119, textureX, textureY); // Box 150
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1129, textureX, textureY); // Box 151
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 153
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Box 154
		bodyModel[142] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 157
		bodyModel[143] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 13, 1169, textureX, textureY); // Box 159
		bodyModel[145] = new ModelRendererTurbo(this, 13, 1169, textureX, textureY); // Box 160
		bodyModel[146] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 161
		bodyModel[147] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1168, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 165
		bodyModel[151] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 166
		bodyModel[152] = new ModelRendererTurbo(this, 13, 1169, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 13, 1169, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 169
		bodyModel[155] = new ModelRendererTurbo(this, 13, 1161, textureX, textureY); // Box 170
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1176, textureX, textureY); // Box 171
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1176, textureX, textureY); // Box 172
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1176, textureX, textureY); // Box 173
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1176, textureX, textureY); // Box 174
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1182, textureX, textureY); // Box 176
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1182, textureX, textureY); // Box 177
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1188, textureX, textureY); // Box 178
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1188, textureX, textureY); // Box 179
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1188, textureX, textureY); // Box 180
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1188, textureX, textureY); // Box 181
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 356
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 357
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 359
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 360
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 361
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 362
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 363
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 364
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 365
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 366
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 367
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 368
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 369
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 370
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 371
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 372
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 373
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1216, textureX, textureY); // Box 374
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 375
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 376
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 377
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 378
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 379
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Box 380

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 12, 42, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(39F, -19F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 6, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -2F, -2F, -2F, -2F, -2F, 0F, 0F, -3F); // Box 1
		bodyModel[1].setRotationPoint(39F, -7F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 80, 6, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-41F, -7F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-47F, -7F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 8, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-52F, -7F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-57F, -5F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 91, 12, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-52F, -19F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 14, 42, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-57F, -19F, -21F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 125, 1, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 8
		bodyModel[8].setRotationPoint(-64F, -16.5F, -33.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 9
		bodyModel[9].setRotationPoint(-66F, -16.5F, -33.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 125, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-64F, -16.5F, -35.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-66F, -16.5F, -35.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-64F, -15.5F, -35.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 39, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-60F, -15.5F, -36F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-21F, -15.5F, -35.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 24, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-20F, -15.5F, -36F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 28, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(5F, -15.5F, -36F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(4F, -15.5F, -35.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(33F, -15.5F, -35.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 27, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(34F, -15.5F, -36F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 13, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 20
		bodyModel[20].setRotationPoint(61F, -16.5F, -33.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, -0.5F, 0F, 0F, -0.5F); // Box 21
		bodyModel[21].setRotationPoint(69F, -15.5F, -33.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(61F, -16.5F, -35.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -0.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(69F, -15.5F, -35.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(61F, -15.5F, -35.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2F, 0.5F, 0F); // Box 29
		bodyModel[25].setRotationPoint(69F, -14.5F, -35.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(69F, -15.5F, -21F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[27].setRotationPoint(61F, -16.5F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2F, 0.5F, 0F); // Box 32
		bodyModel[28].setRotationPoint(69F, -14.5F, -21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(61F, -15.5F, -21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(41F, -16.5F, -21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 20, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[31].setRotationPoint(41F, -15.5F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 125, 1, 13, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(-64F, -16.5F, 20.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 37
		bodyModel[33].setRotationPoint(-66F, -16.5F, 20.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 125, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-64F, -16.5F, 33.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-66F, -16.5F, 33.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-64F, -15.5F, 34.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 39, 11, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 41
		bodyModel[37].setRotationPoint(-60F, -15.5F, 35F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-21F, -15.5F, 34.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 11, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(-20F, -15.5F, 35F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 28, 11, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[40].setRotationPoint(5F, -15.5F, 35F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(4F, -15.5F, 34.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(33F, -15.5F, 34.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 27, 11, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(34F, -15.5F, 35F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 1, 13, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(61F, -16.5F, 20.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 13, 0F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 7F, -0.5F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(69F, -15.5F, 20.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[46].setRotationPoint(61F, -16.5F, 33.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(69F, -15.5F, 33.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(61F, -15.5F, 34.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2F, 0.5F, 0F); // Box 53
		bodyModel[49].setRotationPoint(69F, -14.5F, 34.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -7.25F, -0.25F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(69F, -15.5F, 20F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[51].setRotationPoint(61F, -16.5F, 20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2F, 0.5F, 0F); // Box 56
		bodyModel[52].setRotationPoint(69F, -14.5F, 20F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(61F, -15.5F, 20F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[54].setRotationPoint(41F, -16.5F, 20F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 20, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[55].setRotationPoint(41F, -15.5F, 20F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[56].setRotationPoint(39F, -19F, -33F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[57].setRotationPoint(3F, -20.2F, -33.2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 63, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 62
		bodyModel[58].setRotationPoint(-58F, -20F, -33F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 34, 4, 12, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 63
		bodyModel[59].setRotationPoint(5F, -20F, -33F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(-20.5F, -20.2F, -33.2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(-41.5F, -20.2F, -33.2F);

		bodyModel[62].addShapeBox(22.5F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[62].setRotationPoint(5F, -20.2F, -33.2F);
		bodyModel[62].rotateAngleZ = -0.03490659F;

		bodyModel[63].addShapeBox(12F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[63].setRotationPoint(39F, -18.8F, -33.2F);
		bodyModel[63].rotateAngleZ = -0.08726646F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(20.5F, -18.5F, -38.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 12, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[65].setRotationPoint(34.5F, -17.5F, -38.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[66].setRotationPoint(47.5F, -16.5F, -38.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(45.5F, -16.5F, -36.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(57F, -16.5F, -36.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[69].setRotationPoint(34.5F, -16.5F, -36.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[70].setRotationPoint(29.5F, -16.5F, -36.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[71].setRotationPoint(19F, -16.5F, -36.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[72].setRotationPoint(58F, -17F, -35F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[73].setRotationPoint(46.5F, -17F, -35F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[74].setRotationPoint(35.5F, -17F, -35F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[75].setRotationPoint(30.5F, -17F, -35F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[76].setRotationPoint(20F, -17F, -35F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[77].setRotationPoint(6.5F, -17F, -35F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(5.5F, -16.5F, -36.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 13, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[79].setRotationPoint(20.5F, -18.5F, 36.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(34.5F, -17.5F, 36.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[81].setRotationPoint(47.5F, -16.5F, 36.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[82].setRotationPoint(45.5F, -16.5F, 34.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[83].setRotationPoint(57F, -16.5F, 34.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(34.5F, -16.5F, 34.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[85].setRotationPoint(29.5F, -16.5F, 34.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[86].setRotationPoint(19F, -16.5F, 34.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[87].setRotationPoint(58F, -17F, 33F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[88].setRotationPoint(46.5F, -17F, 33F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[89].setRotationPoint(35.5F, -17F, 33F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[90].setRotationPoint(30.5F, -17F, 33F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[91].setRotationPoint(20F, -17F, 33F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[92].setRotationPoint(6.5F, -17F, 33F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[93].setRotationPoint(5.5F, -16.5F, 34.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 22, 3, 12, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[94].setRotationPoint(39F, -19F, 21F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[95].setRotationPoint(3F, -20.2F, 21.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 108
		bodyModel[96].setRotationPoint(-58F, -20F, 21F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 34, 4, 12, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 109
		bodyModel[97].setRotationPoint(5F, -20F, 21F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[98].setRotationPoint(-23.5F, -20.2F, 21.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[99].setRotationPoint(-42.5F, -20.2F, 21.2F);

		bodyModel[100].addShapeBox(27.5F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[100].setRotationPoint(5F, -20.2F, 21.2F);
		bodyModel[100].rotateAngleZ = -0.03490659F;

		bodyModel[101].addShapeBox(13F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[101].setRotationPoint(39F, -18.8F, 21.2F);
		bodyModel[101].rotateAngleZ = -0.08726646F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 25, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[102].setRotationPoint(-22F, -20F, 21F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[103].setRotationPoint(-41F, -20.5F, 22F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[104].setRotationPoint(-35F, -20.5F, 22F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[105].setRotationPoint(-41F, -21.5F, 21.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[106].setRotationPoint(-35F, -19.5F, 32F);
		bodyModel[106].rotateAngleX = -0.13962634F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 48, 1, 42, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 119
		bodyModel[107].setRotationPoint(-57F, -20F, -21F);

		bodyModel[108].addTrapezoid(0F, 0F, 0F, 14, 1, 38, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 120
		bodyModel[108].setRotationPoint(-55F, -21F, -19F);

		bodyModel[109].addTrapezoid(0F, 0F, 0F, 14, 1, 38, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 121
		bodyModel[109].setRotationPoint(-39F, -21F, -19F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 1, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[110].setRotationPoint(-63F, -20F, -12F);

		bodyModel[111].addShapeBox(-5F, 0F, 0F, 5, 1, 14, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 123
		bodyModel[111].setRotationPoint(-58F, -20F, -11F);
		bodyModel[111].rotateAngleZ = -0.90757121F;

		bodyModel[112].addShapeBox(-5F, 0F, 0F, 5, 1, 14, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 124
		bodyModel[112].setRotationPoint(-58F, -20F, 4F);
		bodyModel[112].rotateAngleZ = -0.90757121F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 4, 68, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[113].setRotationPoint(-65.5F, -12.5F, -34F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[114].setRotationPoint(-66F, -12F, -17F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[115].setRotationPoint(-66F, -12F, 16F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 128
		bodyModel[116].setRotationPoint(-66F, -17F, -16.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[117].setRotationPoint(-69F, -17F, -16.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[118].setRotationPoint(-72F, -17F, -16.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 131
		bodyModel[119].setRotationPoint(-75F, -17F, -16.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 132
		bodyModel[120].setRotationPoint(-75F, -17F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 133
		bodyModel[121].setRotationPoint(-66F, -17F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[122].setRotationPoint(-69F, -17F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[123].setRotationPoint(-72F, -17F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[124].setRotationPoint(-66F, -17F, 15.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[125].setRotationPoint(-69F, -17F, 15.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[126].setRotationPoint(-72F, -17F, 15.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[127].setRotationPoint(-75F, -17F, 15.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 140
		bodyModel[128].setRotationPoint(-75F, -17F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 141
		bodyModel[129].setRotationPoint(-66F, -17F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[130].setRotationPoint(-69F, -17F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[131].setRotationPoint(-72F, -17F, 7F);

		bodyModel[132].addShapeBox(-4F, 0F, 0F, 16, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[132].setRotationPoint(39F, -18.8F, 24.2F);
		bodyModel[132].rotateAngleZ = -0.08726646F;

		bodyModel[133].addShapeBox(2.5F, 0F, 0F, 22, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[133].setRotationPoint(5F, -20.2F, 27.2F);
		bodyModel[133].rotateAngleZ = -0.03490659F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[134].setRotationPoint(-20.5F, -20.2F, 26.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[135].setRotationPoint(-56.5F, -20.2F, 24.2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[136].setRotationPoint(29F, -20F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[137].setRotationPoint(29F, -20F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[138].setRotationPoint(29F, -20F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 28, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[139].setRotationPoint(54F, -15F, -14F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[140].setRotationPoint(53.8F, -16F, -18F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[141].setRotationPoint(55.8F, -16F, -18F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[142].setRotationPoint(52.8F, -16.5F, -15F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[143].setRotationPoint(52.8F, -16.5F, -19F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[144].setRotationPoint(52.8F, -17.5F, -19F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[145].setRotationPoint(55.8F, -17.5F, -19F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[146].setRotationPoint(55.8F, -16.5F, -15F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[147].setRotationPoint(55.8F, -16.5F, -19F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[148].setRotationPoint(53.8F, -16F, 15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[149].setRotationPoint(55.8F, -16F, 15F);
		bodyModel[141].glow = true;
		bodyModel[149].glow = true;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[150].setRotationPoint(52.8F, -16.5F, 14F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[151].setRotationPoint(52.8F, -16.5F, 18F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[152].setRotationPoint(52.8F, -17.5F, 14F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[153].setRotationPoint(55.8F, -17.5F, 14F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[154].setRotationPoint(55.8F, -16.5F, 14F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[155].setRotationPoint(55.8F, -16.5F, 18F);

		bodyModel[156].addShapeBox(0F, -1F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[156].setRotationPoint(49F, -3F, -16F);
		bodyModel[156].rotateAngleZ = -0.08726646F;

		bodyModel[157].addShapeBox(0F, -1F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[157].setRotationPoint(49F, -3F, -7F);
		bodyModel[157].rotateAngleZ = -0.08726646F;

		bodyModel[158].addShapeBox(0F, -1F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[158].setRotationPoint(49F, -3F, 14F);
		bodyModel[158].rotateAngleZ = -0.08726646F;

		bodyModel[159].addShapeBox(0F, -1F, 0F, 10, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[159].setRotationPoint(49F, -3F, 5F);
		bodyModel[159].rotateAngleZ = -0.08726646F;

		bodyModel[160].addShapeBox(18F, -4F, 0F, 8, 4, 1, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[160].setRotationPoint(39F, -19F, -11F);
		bodyModel[160].rotateAngleZ = -0.40142573F;

		bodyModel[161].addShapeBox(18F, -4F, 0F, 8, 4, 1, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[161].setRotationPoint(39F, -19F, 10F);
		bodyModel[161].rotateAngleZ = -0.40142573F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 25, 2, 25, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[162].setRotationPoint(-21F, -21F, -25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 25, 2, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F); // Box 179
		bodyModel[163].setRotationPoint(-21F, -21F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 25, 2, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F); // Box 180
		bodyModel[164].setRotationPoint(4F, -21F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 25, 2, 25, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[165].setRotationPoint(4F, -21F, -25F);

		bodyModel[166].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[166].setRotationPoint(56F, -5F, -21F);
		bodyModel[166].rotateAngleZ = -0.08726646F;

		bodyModel[167].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 357
		bodyModel[167].setRotationPoint(56F, -5F, -24F);
		bodyModel[167].rotateAngleZ = -0.08726646F;

		bodyModel[168].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 359
		bodyModel[168].setRotationPoint(56F, -5F, 21F);
		bodyModel[168].rotateAngleZ = -0.08726646F;

		bodyModel[169].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 360
		bodyModel[169].setRotationPoint(39F, -5F, 21F);
		bodyModel[169].rotateAngleZ = -0.08726646F;

		bodyModel[170].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[170].setRotationPoint(39F, -5F, -21F);
		bodyModel[170].rotateAngleZ = -0.08726646F;

		bodyModel[171].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 362
		bodyModel[171].setRotationPoint(39F, -5F, -24F);
		bodyModel[171].rotateAngleZ = -0.08726646F;

		bodyModel[172].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 363
		bodyModel[172].setRotationPoint(22F, -5F, 21F);
		bodyModel[172].rotateAngleZ = -0.08726646F;

		bodyModel[173].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[173].setRotationPoint(22F, -5F, -21F);
		bodyModel[173].rotateAngleZ = -0.08726646F;

		bodyModel[174].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 365
		bodyModel[174].setRotationPoint(22F, -5F, -24F);
		bodyModel[174].rotateAngleZ = -0.08726646F;

		bodyModel[175].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 366
		bodyModel[175].setRotationPoint(5F, -5F, 21F);
		bodyModel[175].rotateAngleZ = -0.08726646F;

		bodyModel[176].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[176].setRotationPoint(5F, -5F, -21F);
		bodyModel[176].rotateAngleZ = -0.08726646F;

		bodyModel[177].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 368
		bodyModel[177].setRotationPoint(5F, -5F, -24F);
		bodyModel[177].rotateAngleZ = -0.08726646F;

		bodyModel[178].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 369
		bodyModel[178].setRotationPoint(-12F, -5F, 21F);
		bodyModel[178].rotateAngleZ = -0.08726646F;

		bodyModel[179].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[179].setRotationPoint(-12F, -5F, -21F);
		bodyModel[179].rotateAngleZ = -0.08726646F;

		bodyModel[180].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 371
		bodyModel[180].setRotationPoint(-12F, -5F, -24F);
		bodyModel[180].rotateAngleZ = -0.08726646F;

		bodyModel[181].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 372
		bodyModel[181].setRotationPoint(-29F, -5F, 21F);
		bodyModel[181].rotateAngleZ = -0.08726646F;

		bodyModel[182].addShapeBox(0F, -1F, 0F, 2, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[182].setRotationPoint(-29F, -5F, -21F);
		bodyModel[182].rotateAngleZ = -0.08726646F;

		bodyModel[183].addShapeBox(0F, -1F, 0F, 3, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 6F, 0F, 0F); // Box 374
		bodyModel[183].setRotationPoint(-29F, -5F, -24F);
		bodyModel[183].rotateAngleZ = -0.08726646F;

		bodyModel[184].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 375
		bodyModel[184].setRotationPoint(65F, -7F, 15F);
		bodyModel[184].rotateAngleZ = -0.4712389F;

		bodyModel[185].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 376
		bodyModel[185].setRotationPoint(65F, -7F, 9F);
		bodyModel[185].rotateAngleZ = -0.4712389F;

		bodyModel[186].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 377
		bodyModel[186].setRotationPoint(65F, -7F, 3F);
		bodyModel[186].rotateAngleZ = -0.4712389F;

		bodyModel[187].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 378
		bodyModel[187].setRotationPoint(65F, -7F, -17F);
		bodyModel[187].rotateAngleZ = -0.4712389F;

		bodyModel[188].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 379
		bodyModel[188].setRotationPoint(65F, -7F, -11F);
		bodyModel[188].rotateAngleZ = -0.4712389F;

		bodyModel[189].addTrapezoid(-0.5F, 1F, 0F, 1, 3, 2, 0F, -0.40F, ModelRendererTurbo.MR_LEFT); // Box 380
		bodyModel[189].setRotationPoint(65F, -7F, -5F);
		bodyModel[189].rotateAngleZ = -0.4712389F;


		turretModel = new ModelRendererTurbo[156];
		turretModel[0] = new ModelRendererTurbo(this, 0, 1263, textureX, textureY); // Box 182
		turretModel[1] = new ModelRendererTurbo(this, 0, 1297, textureX, textureY); // Box 189
		turretModel[2] = new ModelRendererTurbo(this, 29, 1297, textureX, textureY); // Box 190
		turretModel[3] = new ModelRendererTurbo(this, 0, 1315, textureX, textureY); // Box 203
		turretModel[4] = new ModelRendererTurbo(this, 0, 1327, textureX, textureY); // Box 195
		turretModel[5] = new ModelRendererTurbo(this, 0, 1335, textureX, textureY); // Box 196
		turretModel[6] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 197
		turretModel[7] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 198
		turretModel[8] = new ModelRendererTurbo(this, 28, 1335, textureX, textureY); // Box 199
		turretModel[9] = new ModelRendererTurbo(this, 36, 1327, textureX, textureY); // Box 200
		turretModel[10] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 201
		turretModel[11] = new ModelRendererTurbo(this, 55, 1335, textureX, textureY); // Box 202
		turretModel[12] = new ModelRendererTurbo(this, 72, 1327, textureX, textureY); // Box 203
		turretModel[13] = new ModelRendererTurbo(this, 0, 1348, textureX, textureY); // Box 213
		turretModel[14] = new ModelRendererTurbo(this, 0, 1359, textureX, textureY); // Box 214
		turretModel[15] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Box 217
		turretModel[16] = new ModelRendererTurbo(this, 0, 1375, textureX, textureY); // Box 218
		turretModel[17] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 219
		turretModel[18] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Box 220
		turretModel[19] = new ModelRendererTurbo(this, 0, 1384, textureX, textureY); // Box 221
		turretModel[20] = new ModelRendererTurbo(this, 0, 1391, textureX, textureY); // Box 228
		turretModel[21] = new ModelRendererTurbo(this, 0, 1402, textureX, textureY); // Box 231
		turretModel[22] = new ModelRendererTurbo(this, 0, 1416, textureX, textureY); // Box 232
		turretModel[23] = new ModelRendererTurbo(this, 16, 1416, textureX, textureY); // Box 233
		turretModel[24] = new ModelRendererTurbo(this, 32, 1416, textureX, textureY); // Box 234
		turretModel[25] = new ModelRendererTurbo(this, 0, 1425, textureX, textureY); // Box 235
		turretModel[26] = new ModelRendererTurbo(this, 0, 1391, textureX, textureY); // Box 236
		turretModel[27] = new ModelRendererTurbo(this, 0, 1441, textureX, textureY); // Box 237
		turretModel[28] = new ModelRendererTurbo(this, 0, 1446, textureX, textureY); // Box 238
		turretModel[29] = new ModelRendererTurbo(this, 0, 1391, textureX, textureY); // Box 238
		turretModel[30] = new ModelRendererTurbo(this, 0, 1449, textureX, textureY); // Box 239
		turretModel[31] = new ModelRendererTurbo(this, 34, 1449, textureX, textureY); // Box 240
		turretModel[32] = new ModelRendererTurbo(this, 104, 1449, textureX, textureY); // Box 242
		turretModel[33] = new ModelRendererTurbo(this, 68, 1449, textureX, textureY); // Box 243
		turretModel[34] = new ModelRendererTurbo(this, 20, 1463, textureX, textureY); // Box 244
		turretModel[35] = new ModelRendererTurbo(this, 0, 1463, textureX, textureY); // Box 245
		turretModel[36] = new ModelRendererTurbo(this, 0, 1472, textureX, textureY); // Box 246
		turretModel[37] = new ModelRendererTurbo(this, 0, 1484, textureX, textureY); // Box 247
		turretModel[38] = new ModelRendererTurbo(this, 0, 1493, textureX, textureY); // Box 248
		turretModel[39] = new ModelRendererTurbo(this, 20, 1493, textureX, textureY); // Box 249
		turretModel[40] = new ModelRendererTurbo(this, 40, 1493, textureX, textureY); // Box 250
		turretModel[41] = new ModelRendererTurbo(this, 200, 1493, textureX, textureY); // Box 251
		turretModel[42] = new ModelRendererTurbo(this, 220, 1493, textureX, textureY); // Box 252
		turretModel[43] = new ModelRendererTurbo(this, 60, 1493, textureX, textureY); // Box 253
		turretModel[44] = new ModelRendererTurbo(this, 80, 1493, textureX, textureY); // Box 254
		turretModel[45] = new ModelRendererTurbo(this, 100, 1493, textureX, textureY); // Box 255
		turretModel[46] = new ModelRendererTurbo(this, 120, 1493, textureX, textureY); // Box 256
		turretModel[47] = new ModelRendererTurbo(this, 260, 1493, textureX, textureY); // Box 258
		turretModel[48] = new ModelRendererTurbo(this, 240, 1493, textureX, textureY); // Box 261
		turretModel[49] = new ModelRendererTurbo(this, 0, 1499, textureX, textureY); // Box 262
		turretModel[50] = new ModelRendererTurbo(this, 0, 1499, textureX, textureY); // Box 263
		turretModel[51] = new ModelRendererTurbo(this, 0, 1515, textureX, textureY); // Box 264
		turretModel[52] = new ModelRendererTurbo(this, 0, 1531, textureX, textureY); // Box 265
		turretModel[53] = new ModelRendererTurbo(this, 0, 1544, textureX, textureY); // Box 266
		turretModel[54] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Box 267
		turretModel[55] = new ModelRendererTurbo(this, 0, 1561, textureX, textureY); // Box 268
		turretModel[56] = new ModelRendererTurbo(this, 0, 1568, textureX, textureY); // Box 269
		turretModel[57] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Box 270
		turretModel[58] = new ModelRendererTurbo(this, 0, 1581, textureX, textureY); // Box 272
		turretModel[59] = new ModelRendererTurbo(this, 10, 1575, textureX, textureY); // Box 274
		turretModel[60] = new ModelRendererTurbo(this, 0, 1581, textureX, textureY); // Box 275
		turretModel[61] = new ModelRendererTurbo(this, 44, 1499, textureX, textureY); // Box 276
		turretModel[62] = new ModelRendererTurbo(this, 160, 1493, textureX, textureY); // Box 277
		turretModel[63] = new ModelRendererTurbo(this, 180, 1493, textureX, textureY); // Box 278
		turretModel[64] = new ModelRendererTurbo(this, 140, 1493, textureX, textureY); // Box 279
		turretModel[65] = new ModelRendererTurbo(this, 320, 1490, textureX, textureY); // Box 280
		turretModel[66] = new ModelRendererTurbo(this, 340, 1490, textureX, textureY); // Box 281
		turretModel[67] = new ModelRendererTurbo(this, 6, 1581, textureX, textureY); // Box 282
		turretModel[68] = new ModelRendererTurbo(this, 6, 1588, textureX, textureY); // Box 283
		turretModel[69] = new ModelRendererTurbo(this, 6, 1595, textureX, textureY); // Box 284
		turretModel[70] = new ModelRendererTurbo(this, 6, 1602, textureX, textureY); // Box 285
		turretModel[71] = new ModelRendererTurbo(this, 6, 1611, textureX, textureY); // Box 286
		turretModel[72] = new ModelRendererTurbo(this, 6, 1621, textureX, textureY); // Box 287
		turretModel[73] = new ModelRendererTurbo(this, 6, 1625, textureX, textureY); // Box 288
		turretModel[74] = new ModelRendererTurbo(this, 0, 1629, textureX, textureY); // Box 289
		turretModel[75] = new ModelRendererTurbo(this, 0, 1633, textureX, textureY); // Box 290
		turretModel[76] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Box 291
		turretModel[77] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 292
		turretModel[78] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 293
		turretModel[79] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 294
		turretModel[80] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 295
		turretModel[81] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 296
		turretModel[82] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 297
		turretModel[83] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 298
		turretModel[84] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 299
		turretModel[85] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 300
		turretModel[86] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 301
		turretModel[87] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 302
		turretModel[88] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 303
		turretModel[89] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 304
		turretModel[90] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 305
		turretModel[91] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 306
		turretModel[92] = new ModelRendererTurbo(this, 0, 1643, textureX, textureY); // Box 307
		turretModel[93] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 308
		turretModel[94] = new ModelRendererTurbo(this, 0, 1653, textureX, textureY); // Box 309
		turretModel[95] = new ModelRendererTurbo(this, 0, 1658, textureX, textureY); // Box 310
		turretModel[96] = new ModelRendererTurbo(this, 0, 1658, textureX, textureY); // Box 311
		turretModel[97] = new ModelRendererTurbo(this, 0, 1671, textureX, textureY); // Box 312
		turretModel[98] = new ModelRendererTurbo(this, 0, 1688, textureX, textureY); // Box 313
		turretModel[99] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Box 314
		turretModel[100] = new ModelRendererTurbo(this, 0, 1713, textureX, textureY); // Box 315
		turretModel[101] = new ModelRendererTurbo(this, 0, 1719, textureX, textureY); // Box 316
		turretModel[102] = new ModelRendererTurbo(this, 26, 1719, textureX, textureY); // Box 317
		turretModel[103] = new ModelRendererTurbo(this, 0, 1731, textureX, textureY); // Box 318
		turretModel[104] = new ModelRendererTurbo(this, 24, 1731, textureX, textureY); // Box 319
		turretModel[105] = new ModelRendererTurbo(this, 0, 1741, textureX, textureY); // Box 320
		turretModel[106] = new ModelRendererTurbo(this, 0, 1761, textureX, textureY); // Box 321
		turretModel[107] = new ModelRendererTurbo(this, 0, 1797, textureX, textureY); // Box 322
		turretModel[108] = new ModelRendererTurbo(this, 32, 1797, textureX, textureY); // Box 323
		turretModel[109] = new ModelRendererTurbo(this, 0, 1806, textureX, textureY); // Box 324
		turretModel[110] = new ModelRendererTurbo(this, 0, 1829, textureX, textureY); // Box 325
		turretModel[111] = new ModelRendererTurbo(this, 0, 1829, textureX, textureY); // Box 326
		turretModel[112] = new ModelRendererTurbo(this, 0, 1829, textureX, textureY); // Box 327
		turretModel[113] = new ModelRendererTurbo(this, 0, 1858, textureX, textureY); // Box 328
		turretModel[114] = new ModelRendererTurbo(this, 11, 1858, textureX, textureY); // Box 329
		turretModel[115] = new ModelRendererTurbo(this, 0, 1864, textureX, textureY); // Box 330
		turretModel[116] = new ModelRendererTurbo(this, 13, 1864, textureX, textureY); // Box 331
		turretModel[117] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 334
		turretModel[118] = new ModelRendererTurbo(this, 0, 1874, textureX, textureY); // Box 336
		turretModel[119] = new ModelRendererTurbo(this, 0, 1887, textureX, textureY); // Box 337
		turretModel[120] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Box 338
		turretModel[121] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Box 339
		turretModel[122] = new ModelRendererTurbo(this, 0, 1920, textureX, textureY); // Box 340
		turretModel[123] = new ModelRendererTurbo(this, 0, 1402, textureX, textureY); // Box 341
		turretModel[124] = new ModelRendererTurbo(this, 0, 1416, textureX, textureY); // Box 342
		turretModel[125] = new ModelRendererTurbo(this, 16, 1416, textureX, textureY); // Box 343
		turretModel[126] = new ModelRendererTurbo(this, 32, 1416, textureX, textureY); // Box 344
		turretModel[127] = new ModelRendererTurbo(this, 0, 1425, textureX, textureY); // Box 345
		turretModel[128] = new ModelRendererTurbo(this, 0, 1391, textureX, textureY); // Box 346
		turretModel[129] = new ModelRendererTurbo(this, 0, 1441, textureX, textureY); // Box 347
		turretModel[130] = new ModelRendererTurbo(this, 0, 1446, textureX, textureY); // Box 348
		turretModel[131] = new ModelRendererTurbo(this, 94, 1263, textureX, textureY); // Box 350
		turretModel[132] = new ModelRendererTurbo(this, 0, 1927, textureX, textureY); // Box 351
		turretModel[133] = new ModelRendererTurbo(this, 103, 1927, textureX, textureY); // Box 352
		turretModel[134] = new ModelRendererTurbo(this, 0, 1962, textureX, textureY); // Box 353
		turretModel[135] = new ModelRendererTurbo(this, 0, 1983, textureX, textureY); // Box 354
		turretModel[136] = new ModelRendererTurbo(this, 0, 2004, textureX, textureY); // Box 355
		turretModel[137] = new ModelRendererTurbo(this, 37, 2004, textureX, textureY); // Box 356
		turretModel[138] = new ModelRendererTurbo(this, 280, 1493, textureX, textureY); // Box 357
		turretModel[139] = new ModelRendererTurbo(this, 300, 1493, textureX, textureY); // Box 358
		turretModel[140] = new ModelRendererTurbo(this, 182, 1327, textureX, textureY); // Box 359
		turretModel[141] = new ModelRendererTurbo(this, 139, 1335, textureX, textureY); // Box 360
		turretModel[142] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 361
		turretModel[143] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 362
		turretModel[144] = new ModelRendererTurbo(this, 111, 1335, textureX, textureY); // Box 363
		turretModel[145] = new ModelRendererTurbo(this, 146, 1327, textureX, textureY); // Box 364
		turretModel[146] = new ModelRendererTurbo(this, 0, 1344, textureX, textureY); // Box 365
		turretModel[147] = new ModelRendererTurbo(this, 83, 1335, textureX, textureY); // Box 366
		turretModel[148] = new ModelRendererTurbo(this, 109, 1327, textureX, textureY); // Box 367
		turretModel[149] = new ModelRendererTurbo(this, 29, 1348, textureX, textureY); // Box 368
		turretModel[150] = new ModelRendererTurbo(this, 19, 1359, textureX, textureY); // Box 369
		turretModel[151] = new ModelRendererTurbo(this, 46, 1315, textureX, textureY); // Box 370
		turretModel[152] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 371
		turretModel[153] = new ModelRendererTurbo(this, 0, 1868, textureX, textureY); // Box 372
		turretModel[154] = new ModelRendererTurbo(this, 200, 25, textureX, textureY); // Box 373
		turretModel[155] = new ModelRendererTurbo(this, 305, 0, textureX, textureY); // Box 374

		turretModel[0].addShapeBox(0F, 0F, 0F, 22, 10, 23, 0F, -1F, -2F, 1F, -3F, -3F, -12F, -3F, -2F, 0F, -6F, 1F, 0F, -1F, 0F, 1F, -3F, 0F, -12F, -3F, 0F, 0F, -6F, 0F, 0F); // Box 182
		turretModel[0].setRotationPoint(9F, -32F, -28.5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1F, -1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 189
		turretModel[1].setRotationPoint(15F, -33F, -5.5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 7, 12, 5, 0F, 0F, 0F, 0.5F, -1F, -1.5F, 0.5F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		turretModel[2].setRotationPoint(15F, -33F, 0.5F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F, 5F, 0F, 15F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 14F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 203
		turretModel[3].setRotationPoint(15F, -22F, -14.5F);

		turretModel[4].addShapeBox(-2F, 0F, -3F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 195
		turretModel[4].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[4].rotateAngleY = -0.6981317F;

		turretModel[5].addShapeBox(1F, 7F, -3F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 196
		turretModel[5].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[5].rotateAngleY = -0.6981317F;

		turretModel[6].addShapeBox(-2.5F, 6F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		turretModel[6].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[6].rotateAngleY = -0.6981317F;

		turretModel[7].addShapeBox(-2.5F, 6F, 5.2F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		turretModel[7].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[7].rotateAngleY = -0.6981317F;

		turretModel[8].addShapeBox(1F, 7F, 3.2F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 199
		turretModel[8].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[8].rotateAngleY = -0.6981317F;

		turretModel[9].addShapeBox(-2F, 0F, 3.2F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 200
		turretModel[9].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[9].rotateAngleY = -0.6981317F;

		turretModel[10].addShapeBox(-2.5F, 6F, 11.4F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[10].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[10].rotateAngleY = -0.6981317F;

		turretModel[11].addShapeBox(1F, 7F, 9.4F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 202
		turretModel[11].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[11].rotateAngleY = -0.6981317F;

		turretModel[12].addShapeBox(-2F, 0F, 9.4F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 203
		turretModel[12].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[12].rotateAngleY = -0.6981317F;

		turretModel[13].addShapeBox(2.5F, -3.5F, 9.4F, 7, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		turretModel[13].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[13].rotateAngleY = -0.6981317F;
		turretModel[13].rotateAngleZ = -0.36651914F;

		turretModel[14].addShapeBox(0.5F, -3.5F, 9.4F, 2, 4, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[14].setRotationPoint(13.8F, -31F, -28.6F);
		turretModel[14].rotateAngleY = -0.6981317F;
		turretModel[14].rotateAngleZ = -0.36651914F;

		turretModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 217
		turretModel[15].setRotationPoint(29F, -30F, -11.5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 218
		turretModel[16].setRotationPoint(30F, -25F, -11.5F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		turretModel[17].setRotationPoint(28F, -25F, -11F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		turretModel[18].setRotationPoint(27F, -26F, 8F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 221
		turretModel[19].setRotationPoint(30F, -27F, 6.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 228
		turretModel[20].setRotationPoint(31F, -22.5F, -22F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 231
		turretModel[21].setRotationPoint(29F, -28.5F, 14F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[22].setRotationPoint(34.5F, -26.5F, 14.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		turretModel[23].setRotationPoint(34.5F, -28.5F, 14.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		turretModel[24].setRotationPoint(34.5F, -24.5F, 14.5F);
		turretModel[22].glow = true;
		turretModel[23].glow = true;
		turretModel[24].glow = true;

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		turretModel[25].setRotationPoint(31F, -28.5F, 13F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		turretModel[26].setRotationPoint(31F, -29.5F, 13F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 237
		turretModel[27].setRotationPoint(26F, -27F, 12F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		turretModel[28].setRotationPoint(22F, -27F, 21F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 238
		turretModel[29].setRotationPoint(31F, -22.5F, 13F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 3F, 1F, 0F, 3F, 6F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 239
		turretModel[30].setRotationPoint(-3F, -36F, -19.5F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 6F, 0F, 0.5F, 1F, 0F, 3F, 0F, 1F, 3F); // Box 240
		turretModel[31].setRotationPoint(-3F, -36F, -11.5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -1F, 0F, 1F, 3F, 0F, 0F, 0.5F, 5F, 0F, 0.5F); // Box 242
		turretModel[32].setRotationPoint(-11F, -36F, -19.5F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, -1F, 5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 3F, 0F, 1F, -1F); // Box 243
		turretModel[33].setRotationPoint(-11F, -36F, -11.5F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F); // Box 244
		turretModel[34].setRotationPoint(15F, -35F, 0F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		turretModel[35].setRotationPoint(15F, -35F, -4F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		turretModel[36].setRotationPoint(10F, -35F, 6F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		turretModel[37].setRotationPoint(16F, -35F, 8F);

		turretModel[38].addShapeBox(0.2F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 248
		turretModel[38].setRotationPoint(8F, -34.5F, 3F);
		turretModel[38].rotateAngleZ = -0.12217305F;

		turretModel[39].addShapeBox(0.2F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 249
		turretModel[39].setRotationPoint(8F, -34.5F, 0F);
		turretModel[39].rotateAngleZ = -0.12217305F;

		turretModel[40].addShapeBox(0.2F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 250
		turretModel[40].setRotationPoint(8F, -34.5F, -3F);
		turretModel[40].rotateAngleZ = -0.12217305F;

		turretModel[41].addShapeBox(-0.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 251
		turretModel[41].setRotationPoint(8F, -34.5F, -6F);
		turretModel[41].rotateAngleZ = -0.12217305F;

		turretModel[42].addShapeBox(-0.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 252
		turretModel[42].setRotationPoint(8F, -34.5F, -9F);
		turretModel[42].rotateAngleZ = -0.12217305F;

		turretModel[43].addShapeBox(-5.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 253
		turretModel[43].setRotationPoint(8F, -34.5F, 4.5F);
		turretModel[43].rotateAngleZ = -0.01745329F;

		turretModel[44].addShapeBox(-5.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 254
		turretModel[44].setRotationPoint(8F, -34.5F, 1.5F);
		turretModel[44].rotateAngleZ = -0.01745329F;

		turretModel[45].addShapeBox(-5.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 255
		turretModel[45].setRotationPoint(8F, -34.5F, -1.5F);
		turretModel[45].rotateAngleZ = -0.01745329F;

		turretModel[46].addShapeBox(-5.8F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 256
		turretModel[46].setRotationPoint(2F, -34.5F, -0.5F);
		turretModel[46].rotateAngleZ = 0.01745329F;

		turretModel[47].addShapeBox(2F, 0F, -3F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		turretModel[47].setRotationPoint(14F, -33.5F, -15.5F);
		turretModel[47].rotateAngleX = 0.19198622F;
		turretModel[47].rotateAngleY = 0.85521133F;
		turretModel[47].rotateAngleZ = -0.01745329F;

		turretModel[48].addShapeBox(-0.8F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		turretModel[48].setRotationPoint(9F, -34F, -12F);
		turretModel[48].rotateAngleZ = -0.05235988F;

		turretModel[49].addShapeBox(1.2F, 0F, -2F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		turretModel[49].setRotationPoint(9F, -34F, -12F);
		turretModel[49].rotateAngleZ = -0.05235988F;

		turretModel[50].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		turretModel[50].setRotationPoint(-6F, -34.2F, 3.5F);
		turretModel[50].rotateAngleX = -0.15707963F;

		turretModel[51].addShapeBox(-5F, 0F, 0F, 5, 2, 13, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 264
		turretModel[51].setRotationPoint(-6F, -34.2F, 3.5F);
		turretModel[51].rotateAngleX = -0.15707963F;

		turretModel[52].addShapeBox(3F, -1F, 2F, 3, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		turretModel[52].setRotationPoint(-6F, -34.2F, 3.5F);
		turretModel[52].rotateAngleX = -0.17453293F;

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		turretModel[53].setRotationPoint(0F, -34.2F, 7.5F);
		turretModel[53].rotateAngleX = -0.06981317F;

		turretModel[54].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		turretModel[54].setRotationPoint(1F, -36F, 12.5F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		turretModel[55].setRotationPoint(1F, -37F, 12.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		turretModel[56].setRotationPoint(4F, -32F, 20F);

		turretModel[57].addTrapezoid(0F, 0F, 0F, 2, 3, 2, 0F, -0.30F, ModelRendererTurbo.MR_TOP); // Box 270
		turretModel[57].setRotationPoint(4.5F, -35F, 20.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 1, 46, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 272
		turretModel[58].setRotationPoint(5F, -81F, 21F);

		turretModel[59].addTrapezoid(0F, 0F, 0F, 2, 3, 2, 0F, -0.30F, ModelRendererTurbo.MR_TOP); // Box 274
		turretModel[59].setRotationPoint(-19.5F, -33.5F, -6.5F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 46, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 275
		turretModel[60].setRotationPoint(-19F, -79.5F, -6F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		turretModel[61].setRotationPoint(-8F, -32F, 17.5F);
		turretModel[61].rotateAngleX = -0.12217305F;
		turretModel[61].rotateAngleY = 0.06981317F;

		turretModel[62].addShapeBox(-6.5F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 277
		turretModel[62].setRotationPoint(-14F, -33.5F, -0.5F);
		turretModel[62].rotateAngleZ = 0.19198622F;

		turretModel[63].addShapeBox(-6.5F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 278
		turretModel[63].setRotationPoint(-14F, -33.5F, -3.5F);
		turretModel[63].rotateAngleZ = 0.19198622F;

		turretModel[64].addShapeBox(-6.5F, 0F, 0F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 279
		turretModel[64].setRotationPoint(-14F, -33.5F, 2.5F);
		turretModel[64].rotateAngleZ = 0.19198622F;

		turretModel[65].addShapeBox(-6.5F, 0F, 0.5F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 280
		turretModel[65].setRotationPoint(-10F, -34F, -5.5F);
		turretModel[65].rotateAngleX = -0.17453293F;
		turretModel[65].rotateAngleY = 1.15191731F;
		turretModel[65].rotateAngleZ = 0.06981317F;

		turretModel[66].addShapeBox(-4.5F, -0.5F, 1.5F, 6, 2, 3, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 281
		turretModel[66].setRotationPoint(-14F, -32.5F, -10.5F);
		turretModel[66].rotateAngleX = -0.15707963F;
		turretModel[66].rotateAngleY = 1.71042267F;
		turretModel[66].rotateAngleZ = 0.2268928F;

		turretModel[67].addTrapezoid(0F, 0F, 0F, 1, 5, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 282
		turretModel[67].setRotationPoint(9.5F, -35F, 22.5F);

		turretModel[68].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 283
		turretModel[68].setRotationPoint(8.5F, -36F, 20F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 284
		turretModel[69].setRotationPoint(10.5F, -36F, 20F);
		turretModel[69].glow = true;

		turretModel[70].addShapeBox(1F, 0F, 0F, 5, 5, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		turretModel[70].setRotationPoint(-16F, -35F, 11.5F);
		turretModel[70].rotateAngleY = 0.55850536F;

		turretModel[71].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		turretModel[71].setRotationPoint(-15.5F, -39.5F, 6F);

		turretModel[72].addTrapezoid(0F, 0F, 0F, 1, 2, 1, 0F, 0.20F, ModelRendererTurbo.MR_TOP); // Box 287
		turretModel[72].setRotationPoint(-15.5F, -41.5F, 6F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 288
		turretModel[73].setRotationPoint(-15.5F, -45.5F, 6F);

		turretModel[74].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.20F, ModelRendererTurbo.MR_BOTTOM); // Box 289
		turretModel[74].setRotationPoint(-15.5F, -46.5F, 6F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		turretModel[75].setRotationPoint(-15.5F, -51.5F, 6F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		turretModel[76].setRotationPoint(-16.5F, -43.5F, 6F);

		turretModel[77].addShapeBox(-2F, 0F, -2.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		turretModel[77].setRotationPoint(-1F, -32.5F, -28.5F);
		turretModel[77].rotateAngleZ = 0.20943951F;

		turretModel[78].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 293
		turretModel[78].setRotationPoint(-1F, -32.5F, -28.5F);
		turretModel[78].rotateAngleZ = 0.20943951F;

		turretModel[79].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 294
		turretModel[79].setRotationPoint(-1F, -32.5F, -28.5F);
		turretModel[79].rotateAngleZ = 0.20943951F;

		turretModel[80].addShapeBox(-2F, 0F, -3.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[80].setRotationPoint(-1F, -32.5F, 28.5F);
		turretModel[80].rotateAngleZ = 0.20943951F;

		turretModel[81].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 296
		turretModel[81].setRotationPoint(-1F, -32.5F, 28.5F);
		turretModel[81].rotateAngleZ = 0.20943951F;

		turretModel[82].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 297
		turretModel[82].setRotationPoint(-1F, -32.5F, 28.5F);
		turretModel[82].rotateAngleZ = 0.20943951F;

		turretModel[83].addShapeBox(-2F, 0F, -3.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		turretModel[83].setRotationPoint(-1F, -29.5F, 29.5F);
		turretModel[83].rotateAngleY = 0.41887902F;
		turretModel[83].rotateAngleZ = 0.20943951F;

		turretModel[84].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299
		turretModel[84].setRotationPoint(-1F, -29.5F, 29.5F);
		turretModel[84].rotateAngleY = 0.41887902F;
		turretModel[84].rotateAngleZ = 0.20943951F;

		turretModel[85].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 300
		turretModel[85].setRotationPoint(-1F, -29.5F, 29.5F);
		turretModel[85].rotateAngleY = 0.41887902F;
		turretModel[85].rotateAngleZ = 0.20943951F;

		turretModel[86].addShapeBox(-2F, 0F, -2.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		turretModel[86].setRotationPoint(-1F, -29.5F, -29.5F);
		turretModel[86].rotateAngleY = -0.41887902F;
		turretModel[86].rotateAngleZ = 0.20943951F;

		turretModel[87].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 302
		turretModel[87].setRotationPoint(-1F, -29.5F, -29.5F);
		turretModel[87].rotateAngleY = -0.41887902F;
		turretModel[87].rotateAngleZ = 0.20943951F;

		turretModel[88].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 303
		turretModel[88].setRotationPoint(-1F, -29.5F, -29.5F);
		turretModel[88].rotateAngleY = -0.41887902F;
		turretModel[88].rotateAngleZ = 0.20943951F;

		turretModel[89].addShapeBox(-2F, 0F, -2.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		turretModel[89].setRotationPoint(-1F, -26.5F, -28.5F);
		turretModel[89].rotateAngleY = -0.6981317F;
		turretModel[89].rotateAngleZ = 0.20943951F;

		turretModel[90].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 305
		turretModel[90].setRotationPoint(-1F, -26.5F, -28.5F);
		turretModel[90].rotateAngleY = -0.6981317F;
		turretModel[90].rotateAngleZ = 0.20943951F;

		turretModel[91].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 306
		turretModel[91].setRotationPoint(-1F, -26.5F, -28.5F);
		turretModel[91].rotateAngleY = -0.6981317F;
		turretModel[91].rotateAngleZ = 0.20943951F;

		turretModel[92].addShapeBox(-2F, 0F, -3.5F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		turretModel[92].setRotationPoint(-1F, -26.5F, 28.5F);
		turretModel[92].rotateAngleY = 0.6981317F;
		turretModel[92].rotateAngleZ = 0.20943951F;

		turretModel[93].addShapeBox(0F, 0F, -2.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 308
		turretModel[93].setRotationPoint(-1F, -26.5F, 28.5F);
		turretModel[93].rotateAngleY = 0.6981317F;
		turretModel[93].rotateAngleZ = 0.20943951F;

		turretModel[94].addShapeBox(0F, 0F, 0.5F, 4, 2, 2, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 309
		turretModel[94].setRotationPoint(-1F, -26.5F, 28.5F);
		turretModel[94].rotateAngleY = 0.6981317F;
		turretModel[94].rotateAngleZ = 0.20943951F;

		turretModel[95].addShapeBox(-3F, 3F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		turretModel[95].setRotationPoint(-1F, -32.5F, -28.5F);
		turretModel[95].rotateAngleZ = 0.20943951F;

		turretModel[96].addShapeBox(-3F, 3F, 0F, 1, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		turretModel[96].setRotationPoint(-1F, -32.5F, 19.5F);
		turretModel[96].rotateAngleZ = 0.20943951F;

		turretModel[97].addShapeBox(0F, 0F, 0F, 3, 10, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		turretModel[97].setRotationPoint(-8F, -31.5F, -28.5F);
		turretModel[97].rotateAngleY = -0.43633231F;

		turretModel[98].addShapeBox(-13F, 0F, 0F, 13, 8, 3, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		turretModel[98].setRotationPoint(-11F, -31.5F, -28.5F);
		turretModel[98].rotateAngleY = -0.43633231F;

		turretModel[99].addShapeBox(-13F, 0F, 3F, 13, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		turretModel[99].setRotationPoint(-11F, -31.5F, -28.5F);
		turretModel[99].rotateAngleY = -0.43633231F;

		turretModel[100].addShapeBox(-11F, 0F, 1F, 10, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		turretModel[100].setRotationPoint(-11F, -32F, -28.5F);
		turretModel[100].rotateAngleY = -0.43633231F;

		turretModel[101].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		turretModel[101].setRotationPoint(-28F, -32F, -14.5F);

		turretModel[102].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		turretModel[102].setRotationPoint(-28F, -32F, 9.5F);

		turretModel[103].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 318
		turretModel[103].setRotationPoint(-28F, -32F, -9.5F);

		turretModel[104].addShapeBox(0F, 0F, 0F, 7, 6, 3, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		turretModel[104].setRotationPoint(-28F, -32F, 6.5F);

		turretModel[105].addShapeBox(0F, 0F, 0F, 4, 6, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		turretModel[105].setRotationPoint(-28F, -32F, -6.5F);

		turretModel[106].addShapeBox(0F, 0F, 0F, 2, 6, 29, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2.5F); // Box 321
		turretModel[106].setRotationPoint(-30F, -32F, -14.5F);

		turretModel[107].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 322
		turretModel[107].setRotationPoint(-28F, -26F, -14.5F);

		turretModel[108].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 323
		turretModel[108].setRotationPoint(-28F, -26F, 9.5F);

		turretModel[109].addShapeBox(0F, 0F, 0F, 4, 3, 19, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 324
		turretModel[109].setRotationPoint(-28F, -26F, -9.5F);

		turretModel[110].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		turretModel[110].setRotationPoint(-27F, -31F, -16.5F);

		turretModel[111].addShapeBox(0F, 0F, 0F, 5, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		turretModel[111].setRotationPoint(-27F, -31F, 14.5F);

		turretModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		turretModel[112].setRotationPoint(-33.5F, -28F, -13.5F);

		turretModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 328
		turretModel[113].setRotationPoint(-33.5F, -28F, -15.5F);

		turretModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 329
		turretModel[114].setRotationPoint(-33.5F, -28F, 11.5F);

		turretModel[115].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		turretModel[115].setRotationPoint(-32.5F, -30F, -9.5F);

		turretModel[116].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		turretModel[116].setRotationPoint(-32.5F, -30F, 8.5F);

		turretModel[117].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		turretModel[117].setRotationPoint(-22F, -29F, -12.5F);

		turretModel[118].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 336
		turretModel[118].setRotationPoint(-19.5F, -31.5F, 17.5F);
		turretModel[118].rotateAngleY = 0.43633231F;

		turretModel[119].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -4F); // Box 337
		turretModel[119].setRotationPoint(-19.5F, -27.5F, 17.5F);
		turretModel[119].rotateAngleY = 0.43633231F;

		turretModel[120].addShapeBox(0F, 0F, -2F, 17, 8, 2, 0F, -1F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		turretModel[120].setRotationPoint(-19.5F, -31.5F, 17.5F);
		turretModel[120].rotateAngleY = 0.43633231F;

		turretModel[121].addShapeBox(3F, 0F, -4F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		turretModel[121].setRotationPoint(-19.5F, -29.5F, 17.5F);
		turretModel[121].rotateAngleY = 0.43633231F;

		turretModel[122].addShapeBox(4F, 0F, 2F, 12, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		turretModel[122].setRotationPoint(-19.5F, -32F, 17.5F);
		turretModel[122].rotateAngleY = 0.43633231F;

		turretModel[123].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 341
		turretModel[123].setRotationPoint(29F, -28.5F, -21F);

		turretModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		turretModel[124].setRotationPoint(34.5F, -26.5F, -20.5F);

		turretModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		turretModel[125].setRotationPoint(34.5F, -28.5F, -20.5F);

		turretModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		turretModel[126].setRotationPoint(34.5F, -24.5F, -20.5F);
		turretModel[124].glow = true;
		turretModel[125].glow = true;
		turretModel[126].glow = true;

		turretModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		turretModel[127].setRotationPoint(31F, -28.5F, -22F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		turretModel[128].setRotationPoint(31F, -29.5F, -22F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 347
		turretModel[129].setRotationPoint(26F, -27F, -13F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		turretModel[130].setRotationPoint(22F, -27F, -22F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 22, 10, 23, 0F, -6F, 1F, 0F, -3F, -2F, 0F, -3F, -3F, -12F, -1F, -2F, 1F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -12F, -1F, 0F, 1F); // Box 350
		turretModel[131].setRotationPoint(9F, -32F, 5.5F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 27, 10, 24, 0F, 0F, -2F, -12F, 0F, -2F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 351
		turretModel[132].setRotationPoint(-17F, -32F, -29.5F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 27, 10, 24, 0F, 0F, 0F, 0F, 5F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -12F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F); // Box 352
		turretModel[133].setRotationPoint(-17F, -32F, 5.5F);

		turretModel[134].addShapeBox(0F, 0F, 0F, 32, 10, 11, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		turretModel[134].setRotationPoint(-17F, -32F, -5.5F);

		turretModel[135].addShapeBox(0F, 0F, 0F, 6, 10, 11, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 354
		turretModel[135].setRotationPoint(-23F, -32F, -5.5F);

		turretModel[136].addShapeBox(0F, 0F, 0F, 6, 10, 12, 0F, 0F, -2F, -15F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 355
		turretModel[136].setRotationPoint(-23F, -32F, -17.5F);

		turretModel[137].addShapeBox(0F, 0F, 0F, 6, 10, 12, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -15F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Box 356
		turretModel[137].setRotationPoint(-23F, -32F, 5.5F);

		turretModel[138].addShapeBox(-5F, 0F, -3F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		turretModel[138].setRotationPoint(14F, -33.5F, -15.5F);
		turretModel[138].rotateAngleX = 0.19198622F;
		turretModel[138].rotateAngleY = 0.85521133F;
		turretModel[138].rotateAngleZ = -0.01745329F;

		turretModel[139].addShapeBox(-12F, 0F, -3F, 6, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		turretModel[139].setRotationPoint(14F, -33.5F, -15.5F);
		turretModel[139].rotateAngleX = 0.19198622F;
		turretModel[139].rotateAngleY = 0.85521133F;
		turretModel[139].rotateAngleZ = -0.01745329F;

		turretModel[140].addShapeBox(-2F, 0F, -3F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 359
		turretModel[140].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[140].rotateAngleY = 0.6981317F;

		turretModel[141].addShapeBox(1F, 7F, -3F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 360
		turretModel[141].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[141].rotateAngleY = 0.6981317F;

		turretModel[142].addShapeBox(-2.5F, 6F, -1F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[142].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[142].rotateAngleY = 0.6981317F;

		turretModel[143].addShapeBox(-2.5F, 6F, -7.2F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		turretModel[143].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[143].rotateAngleY = 0.6981317F;

		turretModel[144].addShapeBox(1F, 7F, -9.2F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[144].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[144].rotateAngleY = 0.6981317F;

		turretModel[145].addShapeBox(-2F, 0F, -9.2F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 364
		turretModel[145].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[145].rotateAngleY = 0.6981317F;

		turretModel[146].addShapeBox(-2.5F, 6F, -13.4F, 6, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		turretModel[146].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[146].rotateAngleY = 0.6981317F;

		turretModel[147].addShapeBox(1F, 7F, -15.4F, 7, 1, 6, 0F, 0F, 0F, 0F, -0.2F, 2.55F, 0F, -0.2F, 2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[147].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[147].rotateAngleY = 0.6981317F;

		turretModel[148].addShapeBox(-2F, 0F, -15.4F, 11, 1, 6, 0F, -0.5F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[148].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[148].rotateAngleY = 0.6981317F;

		turretModel[149].addShapeBox(2.5F, -3.5F, -15.4F, 7, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		turretModel[149].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[149].rotateAngleY = 0.6981317F;
		turretModel[149].rotateAngleZ = -0.36651914F;

		turretModel[150].addShapeBox(0.5F, -3.5F, -15.4F, 2, 4, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		turretModel[150].setRotationPoint(13.8F, -31F, 28.6F);
		turretModel[150].rotateAngleY = 0.6981317F;
		turretModel[150].rotateAngleZ = -0.36651914F;

		turretModel[151].addShapeBox(0F, 0F, 0F, 13, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 15F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 5F, 0F, 14F); // Box 370
		turretModel[151].setRotationPoint(15F, -22F, 5.5F);

		turretModel[152].addShapeBox(0F, 0F, 0F, 27, 1, 24, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 371
		turretModel[152].setRotationPoint(-17F, -22F, -29.5F);

		turretModel[153].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		turretModel[153].setRotationPoint(-22F, -29F, 10.5F);

		turretModel[154].addShapeBox(0F, 0F, 0F, 6, 1, 35, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, -1F, 0F, -16F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -16F); // Box 373
		turretModel[154].setRotationPoint(-23F, -22F, -17.5F);

		turretModel[155].addShapeBox(0F, 0F, 0F, 27, 1, 24, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -13F); // Box 374
		turretModel[155].setRotationPoint(-17F, -22F, 5.5F);


		barrelModel = new ModelRendererTurbo[4];
		barrelModel[0] = new ModelRendererTurbo(this, 200, 62, textureX, textureY); // Box 375
		barrelModel[1] = new ModelRendererTurbo(this, 200, 83, textureX, textureY); // Box 376
		barrelModel[2] = new ModelRendererTurbo(this, 200, 99, textureX, textureY); // Box 377
		barrelModel[3] = new ModelRendererTurbo(this, 200, 121, textureX, textureY); // Box 378

		barrelModel[0].addShapeBox(0F, -6F, -5.5F, 7, 10, 5, 0F, -1F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 375
		barrelModel[0].setRotationPoint(21F, -25F, 0F);

		barrelModel[1].addShapeBox(0F, -6F, 0.5F, 7, 10, 5, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 376
		barrelModel[1].setRotationPoint(21F, -25F, 0F);

		barrelModel[2].addShapeBox(7F, -5F, -5.5F, 3, 9, 11, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 377
		barrelModel[2].setRotationPoint(21F, -25F, 0F);

		barrelModel[3].addShapeBox(10F, -5F, -5.5F, 4, 9, 11, 0F, 0F, -1F, -1F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -1F); // Box 378
		barrelModel[3].setRotationPoint(21F, -25F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[8];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 350
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 351
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 352
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 353
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 354
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 355
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 200, 261, textureX, textureY); // Shape 356
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 200, 289, textureX, textureY); // Shape 357

		leftTrackWheelModels[0].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 350
		leftTrackWheelModels[0].setRotationPoint(-33.5F, 1.5F, 24F);

		leftTrackWheelModels[1].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 351
		leftTrackWheelModels[1].setRotationPoint(-16.5F, 1.5F, 24F);

		leftTrackWheelModels[2].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 352
		leftTrackWheelModels[2].setRotationPoint(0.5F, 1.5F, 24F);

		leftTrackWheelModels[3].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 353
		leftTrackWheelModels[3].setRotationPoint(17.5F, 1.5F, 24F);

		leftTrackWheelModels[4].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 354
		leftTrackWheelModels[4].setRotationPoint(34.5F, 1.5F, 24F);

		leftTrackWheelModels[5].addShape3D(7.5F, -7.5F, -9F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 355
		leftTrackWheelModels[5].setRotationPoint(51.5F, 1.5F, 24F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, -12F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 356
		leftTrackWheelModels[6].setRotationPoint(-49F, -7F, 21F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, -12F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 357
		leftTrackWheelModels[7].setRotationPoint(64F, -7F, 21F);


		rightTrackWheelModels = new ModelRendererTurbo[8];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 341
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 342
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 343
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 344
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 345
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 200, 235, textureX, textureY); // Shape 346
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 200, 261, textureX, textureY); // Shape 348
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 200, 289, textureX, textureY); // Shape 349

		rightTrackWheelModels[0].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 341
		rightTrackWheelModels[0].setRotationPoint(51.5F, 1.5F, -24F);

		rightTrackWheelModels[1].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 342
		rightTrackWheelModels[1].setRotationPoint(34.5F, 1.5F, -24F);

		rightTrackWheelModels[2].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 343
		rightTrackWheelModels[2].setRotationPoint(17.5F, 1.5F, -24F);

		rightTrackWheelModels[3].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 344
		rightTrackWheelModels[3].setRotationPoint(0.5F, 1.5F, -24F);

		rightTrackWheelModels[4].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 345
		rightTrackWheelModels[4].setRotationPoint(-16.5F, 1.5F, -24F);

		rightTrackWheelModels[5].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(5, 0, 5, 0), new Coord2D(10, 0, 10, 0), new Coord2D(15, 5, 15, 5), new Coord2D(15, 10, 15, 10), new Coord2D(10, 15, 10, 15), new Coord2D(5, 15, 5, 15), new Coord2D(0, 10, 0, 10) }), 9, 15, 15, 52, 9, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Shape 346
		rightTrackWheelModels[5].setRotationPoint(-33.5F, 1.5F, -24F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 348
		rightTrackWheelModels[6].setRotationPoint(-49F, -7F, -21F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 349
		rightTrackWheelModels[7].setRotationPoint(64F, -7F, -21F);


		fancyTrackModel = new ModelRendererTurbo[3];
		fancyTrackModel[0] = new ModelRendererTurbo(this, 200, 327, textureX, textureY); // Box 381
		fancyTrackModel[1] = new ModelRendererTurbo(this, 200, 327, textureX, textureY); // Box 382
		fancyTrackModel[2] = new ModelRendererTurbo(this, 200, 327, textureX, textureY); // Box 383

		fancyTrackModel[0].addShapeBox(-1.5F, -1F, -6F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381

		fancyTrackModel[1].addShapeBox(-2.5F, -1F, -7F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382

		fancyTrackModel[2].addShapeBox(-2.5F, -1F, 6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383


		animBarrelModel = new ModelRendererTurbo[11];
		animBarrelModel[0] = new ModelRendererTurbo(this, 200, 142, textureX, textureY); // Box 379
		animBarrelModel[1] = new ModelRendererTurbo(this, 200, 153, textureX, textureY); // Box 380
		animBarrelModel[2] = new ModelRendererTurbo(this, 200, 164, textureX, textureY); // Box 381
		animBarrelModel[3] = new ModelRendererTurbo(this, 204, 175, textureX, textureY); // Box 382
		animBarrelModel[4] = new ModelRendererTurbo(this, 206, 186, textureX, textureY); // Box 383
		animBarrelModel[5] = new ModelRendererTurbo(this, 206, 196, textureX, textureY); // Box 384
		animBarrelModel[6] = new ModelRendererTurbo(this, 206, 192, textureX, textureY); // Box 385
		animBarrelModel[7] = new ModelRendererTurbo(this, 206, 200, textureX, textureY); // Box 386
		animBarrelModel[8] = new ModelRendererTurbo(this, 206, 206, textureX, textureY); // Box 387
		animBarrelModel[9] = new ModelRendererTurbo(this, 221, 206, textureX, textureY); // Box 388
		animBarrelModel[10] = new ModelRendererTurbo(this, 236, 206, textureX, textureY); // Box 389

		animBarrelModel[0].addTrapezoid(12F, -2.5F, -2.5F, 49, 5, 5, 0F, -0.50F, ModelRendererTurbo.MR_LEFT); // Box 379

		animBarrelModel[1].addShapeBox(78F, -2.5F, -2.5F, 25, 5, 5, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 380

		animBarrelModel[2].addShapeBox(60F, -2.5F, -2.5F, 19, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381

		animBarrelModel[3].addShapeBox(103F, -2.5F, -2.5F, 3, 5, 5, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 382

		animBarrelModel[4].addShapeBox(106F, -2F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383

		animBarrelModel[5].addShapeBox(106F, -1F, -2F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384

		animBarrelModel[6].addShapeBox(106F, -1F, 1F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385

		animBarrelModel[7].addShapeBox(106F, 1F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386

		animBarrelModel[8].addShapeBox(91F, -2.5F, -2.5F, 1, 5, 5, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 387

		animBarrelModel[9].addShapeBox(44F, -2.5F, -2.5F, 1, 5, 5, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 388

		animBarrelModel[10].addShapeBox(28F, -2.5F, -2.5F, 1, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389

		barrelAttach = new Vector3f(21F/16F, 25F/16F, 0F/16F);

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[13];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 6
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Box 7
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Box 8
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Box 9
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 0, 46, textureX, textureY); // Box 10
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 0, 52, textureX, textureY); // Box 11
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 0, 59, textureX, textureY); // Box 12
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 0, 69, textureX, textureY); // Box 13
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Box 14
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 0, 81, textureX, textureY); // Box 15

		gun_1_Model[0][0].addShapeBox(0F, 4F, 0F, 7, 2, 7, 0F,0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(-7F, 4F, 0F, 7, 2, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 4

		gun_1_Model[0][2].addShapeBox(-7F, 4F, -7F, 7, 2, 7, 0F,-3.5F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_1_Model[0][3].addShapeBox(0F, 4F, -7F, 7, 2, 7, 0F,0F, 0F, -2F, -3.5F, 0F, -3.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_1_Model[0][4].addShapeBox(0F, 2F, -4F, 5, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_1_Model[0][5].addShapeBox(5F, 2F, -4F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_1_Model[0][6].addShapeBox(3F, -1F, -2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 9

		gun_1_Model[0][7].addShapeBox(1F, 2F, 2F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_1_Model[0][8].addShapeBox(5F, -3F, 2F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 11

		gun_1_Model[0][9].addShapeBox(9F, -3F, 2F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_1_Model[0][10].addShapeBox(4F, -1F, 4F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_1_Model[0][11].addShapeBox(2F, 2F, -10F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_1_Model[0][12].addShapeBox(8F, -4F, -13F, 3, 6, 9, 0F,4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 15

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(-3F, -42F, -12F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[6];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 0, 97, textureX, textureY); // Box 16
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 0, 103, textureX, textureY); // Box 17
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 0, 106, textureX, textureY); // Box 18
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Box 19
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 0, 114, textureX, textureY); // Box 20
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 0, 118, textureX, textureY); // Box 21

		gun_1_Model[2][0].addShapeBox(0F, -2F, -1.5F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_1_Model[2][1].addShapeBox(11F, -2F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_1_Model[2][2].addShapeBox(11F, -0.5F, -1F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_1_Model[2][3].addShapeBox(18F, -2.5F, -1F, 1, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 19

		gun_1_Model[2][4].addShapeBox(23F, -2.9F, -1F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 20

		gun_1_Model[2][5].addShapeBox(29F, -2F, -1F, 2, 1, 1, 0F,0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 21

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(-3F, -42F, -12F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		translateAll(0F, 0F, 0F);


		flipAll();
	}
}