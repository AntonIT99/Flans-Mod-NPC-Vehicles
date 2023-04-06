//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPalmyraGuard extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPalmyraGuard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[217];
		leftArmModel = new ModelRendererTurbo[23];
		rightArmModel = new ModelRendererTurbo[22];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];
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
		bodyModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 249
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 290
		bodyModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 291
		bodyModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 292
		bodyModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 293
		bodyModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 294
		bodyModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 295
		bodyModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 298
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 309
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 312
		bodyModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 314
		bodyModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 315
		bodyModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 316
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 317
		bodyModel[14] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 324
		bodyModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 327
		bodyModel[16] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 328
		bodyModel[17] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 329
		bodyModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 333
		bodyModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 334
		bodyModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 339
		bodyModel[21] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 340
		bodyModel[22] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 351
		bodyModel[23] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 352
		bodyModel[24] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 357
		bodyModel[25] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 358
		bodyModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 365
		bodyModel[27] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 372
		bodyModel[28] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 373
		bodyModel[29] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 374
		bodyModel[30] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 385
		bodyModel[31] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 386
		bodyModel[32] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 387
		bodyModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 388
		bodyModel[34] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 389
		bodyModel[35] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 390
		bodyModel[36] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 391
		bodyModel[37] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 392
		bodyModel[38] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 393
		bodyModel[39] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 394
		bodyModel[40] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 395
		bodyModel[41] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 396
		bodyModel[42] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 397
		bodyModel[43] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 398
		bodyModel[44] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 402
		bodyModel[45] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 403
		bodyModel[46] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 318
		bodyModel[47] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 248
		bodyModel[48] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 249
		bodyModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 24
		bodyModel[50] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 20
		bodyModel[51] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		bodyModel[52] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 22
		bodyModel[53] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 23
		bodyModel[54] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 24
		bodyModel[55] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 25
		bodyModel[56] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 26
		bodyModel[57] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 28
		bodyModel[59] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 29
		bodyModel[60] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 30
		bodyModel[61] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 31
		bodyModel[62] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 32
		bodyModel[63] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 33
		bodyModel[64] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 34
		bodyModel[65] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 35
		bodyModel[66] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 36
		bodyModel[67] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 37
		bodyModel[68] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 38
		bodyModel[69] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 39
		bodyModel[70] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 40
		bodyModel[71] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 41
		bodyModel[72] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 42
		bodyModel[73] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 43
		bodyModel[74] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 44
		bodyModel[75] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 45
		bodyModel[76] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 46
		bodyModel[77] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 47
		bodyModel[78] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 48
		bodyModel[79] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 49
		bodyModel[80] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 50
		bodyModel[81] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 51
		bodyModel[82] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 52
		bodyModel[83] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 53
		bodyModel[84] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 54
		bodyModel[85] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 55
		bodyModel[86] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 56
		bodyModel[87] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 57
		bodyModel[88] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 58
		bodyModel[89] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 59
		bodyModel[90] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 60
		bodyModel[91] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 61
		bodyModel[92] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 62
		bodyModel[93] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 63
		bodyModel[94] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 64
		bodyModel[95] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 65
		bodyModel[96] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 66
		bodyModel[97] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 67
		bodyModel[98] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 68
		bodyModel[99] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 69
		bodyModel[100] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 70
		bodyModel[101] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 71
		bodyModel[102] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 72
		bodyModel[103] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 73
		bodyModel[104] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 74
		bodyModel[105] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 75
		bodyModel[106] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 76
		bodyModel[107] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 77
		bodyModel[108] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 78
		bodyModel[109] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 79
		bodyModel[110] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 80
		bodyModel[111] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 81
		bodyModel[112] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 82
		bodyModel[113] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 83
		bodyModel[114] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 84
		bodyModel[115] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 85
		bodyModel[116] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 86
		bodyModel[117] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 87
		bodyModel[118] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 88
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 89
		bodyModel[120] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 90
		bodyModel[121] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 91
		bodyModel[122] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 92
		bodyModel[123] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 93
		bodyModel[124] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 94
		bodyModel[125] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 95
		bodyModel[126] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 96
		bodyModel[127] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 97
		bodyModel[128] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 98
		bodyModel[129] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 99
		bodyModel[130] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 100
		bodyModel[131] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 101
		bodyModel[132] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 102
		bodyModel[133] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 103
		bodyModel[134] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 104
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 105
		bodyModel[136] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 106
		bodyModel[137] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 107
		bodyModel[138] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 114
		bodyModel[139] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 115
		bodyModel[140] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 116
		bodyModel[141] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 117
		bodyModel[142] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 118
		bodyModel[143] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 119
		bodyModel[144] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 201
		bodyModel[145] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 202
		bodyModel[146] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 207
		bodyModel[147] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 208
		bodyModel[148] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 214
		bodyModel[149] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 216
		bodyModel[150] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 224
		bodyModel[151] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 231
		bodyModel[152] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 262
		bodyModel[153] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 265
		bodyModel[154] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 87
		bodyModel[155] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 93
		bodyModel[156] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 94
		bodyModel[157] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 95
		bodyModel[158] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 33
		bodyModel[159] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[160] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 36
		bodyModel[161] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 37
		bodyModel[162] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 38
		bodyModel[163] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 52
		bodyModel[164] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 53
		bodyModel[165] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 211
		bodyModel[166] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 212
		bodyModel[167] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 110
		bodyModel[168] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 111
		bodyModel[169] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 112
		bodyModel[170] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 113
		bodyModel[171] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 114
		bodyModel[172] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 115
		bodyModel[173] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 116
		bodyModel[174] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 117
		bodyModel[175] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 118
		bodyModel[176] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 119
		bodyModel[177] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 120
		bodyModel[178] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 121
		bodyModel[179] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 122
		bodyModel[180] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 124
		bodyModel[181] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 125
		bodyModel[182] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 126
		bodyModel[183] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 127
		bodyModel[184] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 128
		bodyModel[185] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 129
		bodyModel[186] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 130
		bodyModel[187] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 131
		bodyModel[188] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 132
		bodyModel[189] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 133
		bodyModel[190] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 134
		bodyModel[191] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 135
		bodyModel[192] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 136
		bodyModel[193] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 137
		bodyModel[194] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 138
		bodyModel[195] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 139
		bodyModel[196] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 140
		bodyModel[197] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 141
		bodyModel[198] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 142
		bodyModel[199] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 143
		bodyModel[200] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 144
		bodyModel[201] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 145
		bodyModel[202] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 146
		bodyModel[203] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 147
		bodyModel[204] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 148
		bodyModel[205] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 149
		bodyModel[206] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 150
		bodyModel[207] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 151
		bodyModel[208] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 152
		bodyModel[209] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 153
		bodyModel[210] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 154
		bodyModel[211] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 155
		bodyModel[212] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 156
		bodyModel[213] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 157
		bodyModel[214] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 158
		bodyModel[215] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 159
		bodyModel[216] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 160

		bodyModel[0].addShapeBox(-4F, 10.8F, -2F, 8, 9, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.4F); // Box 249
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 290
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(3F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 291
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 0.4F, -2.1F, 6, 1, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 292
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 293
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(3.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 294
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 295
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 298
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 309
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 312
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 314
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 315
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 316
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 317
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 324
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 327
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 328
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 329
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 333
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 334
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 339
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 340
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 351
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 352
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 357
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 358
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 365
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 372
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 373
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 374
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4F, 5.5F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 385
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 5.5F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 386
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 5.5F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 387
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-4F, 5.5F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 388
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 7.3F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 389
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 7.3F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 390
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4F, 7.3F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 391
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 7.3F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 392
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(3F, 4.3F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 393
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3F, 7.3F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 394
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(3F, 4.3F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 395
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3F, 7.3F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 396
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3F, 5.5F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 397
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3F, 5.5F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 398
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(3F, 5.5F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 402
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(3F, 5.5F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 403
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4F, 4.5F, -2F, 8, 1, 4, 0F,0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F); // Box 318
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 7.5F, -2F, 8, 1, 4, 0F,0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, -0.5F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F); // Box 248
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4F, 10.5F, -2F, 8, 1, 4, 0F,0.4F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F); // Box 249
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F); // Box 24
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 20
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 21
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-2F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 22
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-1F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 23
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 24
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 25
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(2F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 26
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(3F, 5.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 27
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 28
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 29
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-2F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 30
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 31
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(0F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 32
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(1F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 33
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(2F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 34
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(3F, 5.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 35
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 36
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-3F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 37
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-2F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 38
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-1F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 39
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(0F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 40
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(1F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 41
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(2F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 42
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(3F, 6.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 43
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 44
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 45
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-2F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 46
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-1F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 47
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(0F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 48
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(1F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 49
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(2F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 50
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3F, 6.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 51
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-4F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 52
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-3F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 53
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-2F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 54
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-1F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 55
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(0F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 56
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(1F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 57
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(2F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 58
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(3F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 59
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-4F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 60
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-3F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 61
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-2F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 62
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-1F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 63
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(0F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 64
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(1F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 65
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(2F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 66
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(3F, 8.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 67
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-4F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 68
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-3F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 69
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-2F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 70
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-1F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 71
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(0F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 72
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(1F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 73
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(2F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 74
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(3F, 9.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 75
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-4F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 76
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-3F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 77
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-2F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 78
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-1F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 79
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(0F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 80
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(1F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 81
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(2F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 82
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(3F, 9.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 83
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(3F, 6.5F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 84
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(3F, 6.5F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 85
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(3F, 6.5F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 86
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(3F, 6.5F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 87
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-4F, 6.5F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 88
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-4F, 6.5F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 89
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-4F, 6.5F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 90
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-4F, 6.5F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 91
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(3F, 8.2F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 92
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(3F, 8.2F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 93
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(3F, 8.2F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 94
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(3F, 8.2F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 95
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4F, 8.2F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 96
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4F, 8.2F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 97
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-4F, 8.2F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 98
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-4F, 8.2F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 99
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(3F, 9.3F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 100
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(3F, 9.3F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 101
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(3F, 9.3F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 102
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(3F, 9.3F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 103
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-4F, 9.3F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 104
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-4F, 9.3F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 105
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-4F, 9.3F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 106
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-4F, 9.3F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 107
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(2F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 114
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(1F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 115
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(0F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 116
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-1F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 117
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-2F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 118
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(-3F, 2.6F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 119
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-3.5F, 11.2F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 201
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-1.5F, 11.2F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 202
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(0.5F, 11.2F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 207
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(2.5F, 11.2F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 208
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-4.2F, 11.2F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 214
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(3.2F, 11.2F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 216
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-3.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 224
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(2.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 231
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(3.2F, 11.5F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 262
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(-4.2F, 11.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 265
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(3.2F, 11.5F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 87
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(3.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, 0.1F, 1F, 0.5F, 0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 93
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(-4.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, 0.1F, 1F, -0.5F); // Box 94
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(-4.2F, 11.5F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 95
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(-4F, 0F, -2.2F, 2, 2, 4, 0F,0.7F, 0.6F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.7F, 0.6F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F); // Box 33
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(-4F, 0F, 1F, 8, 4, 1, 0F,0.55F, 0.7F, -1F, 0.55F, 0.7F, -1F, 0.55F, 0.7F, 0.55F, 0.55F, 0.7F, 0.55F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, -1F, 0.55F, 0.3F, 0.8F, 0.55F, 0.3F, 0.8F); // Box 35
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(-2.65F, 2.6F, -2.2F, 1, 2, 1, 0F,0.5F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.5F, -0.2F, 0.55F, 0.5F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.2F, 0F, 0.55F, 0.5F, 0F, 0.55F); // Box 36
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(1.65F, 2.6F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.55F, 0.5F, -0.2F, 0.55F, 0.5F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0.2F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.2F, 0F, 0.55F); // Box 37
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(2F, 0F, -2.2F, 2, 2, 4, 0F,0.55F, 0.8F, 0.55F, 0.7F, 0.6F, 0.55F, 0.7F, 0.6F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F, 0.55F, 0.8F, 0.55F); // Box 38
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(-5F, -1F, 2F, 10, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 52
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(-7F, 0F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(-4.5F, -1.7F, -3F, 5, 3, 1, 0F,0F, -1F, 0F, 0.5F, -1F, 0F, 1.5F, -0.7F, 3F, 0.5F, -0.8F, 3F, -1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 5F, -1F, 0F, 5F); // Box 211
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(0.5F, -1.7F, -3F, 4, 3, 1, 0F,0.5F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.8F, 3F, 1.5F, -0.7F, 3F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 1F, 0.5F, 5F); // Box 212
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(-2.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 110
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(-1.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 111
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(1.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 112
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(0.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 113
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(-0.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 114
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(2.5F, 11.5F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 115
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(2.5F, 11.2F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 116
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(0.5F, 11.2F, -2.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Box 117
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(-3.5F, 11.2F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 118
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(-1.5F, 11.2F, 1.2F, 1, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 119
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(1.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 120
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(-0.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 121
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(0.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 122
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(-3.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 124
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(-2.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 125
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(-1.5F, 11.5F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 126
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(-4.2F, 11.5F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 127
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(-4.2F, 11.5F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 128
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-4.2F, 11.2F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 129
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(3.2F, 11.2F, 0.5F, 1, 3, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 130
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(3.2F, 11.5F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 131
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(3.2F, 11.5F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 132
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(3.2F, 11.5F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 133
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(3.2F, 14F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 134
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(3.2F, 14F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 135
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(3.2F, 14F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 136
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(3.2F, 14F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 137
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addShapeBox(3.2F, 14F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, -0.3F, 0F, -0.7F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F); // Box 138
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(3.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, 0.1F, 1F, 0.5F, 0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 139
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addShapeBox(2.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 140
		bodyModel[196].setRotationPoint(0F, 0F, 0F);

		bodyModel[197].addShapeBox(1.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 141
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addShapeBox(0.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 142
		bodyModel[198].setRotationPoint(0F, 0F, 0F);

		bodyModel[199].addShapeBox(-0.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 143
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(-1.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 144
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addShapeBox(-2.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 145
		bodyModel[201].setRotationPoint(0F, 0F, 0F);

		bodyModel[202].addShapeBox(-3.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F); // Box 146
		bodyModel[202].setRotationPoint(0F, 0F, 0F);

		bodyModel[203].addShapeBox(-4.5F, 14F, -2.2F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, -0.5F, 0.1F, 1F, -0.5F); // Box 147
		bodyModel[203].setRotationPoint(0F, 0F, 0F);

		bodyModel[204].addShapeBox(-4.2F, 14F, -1.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 148
		bodyModel[204].setRotationPoint(0F, 0F, 0F);

		bodyModel[205].addShapeBox(-4.2F, 14F, -0.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 149
		bodyModel[205].setRotationPoint(0F, 0F, 0F);

		bodyModel[206].addShapeBox(-4.2F, 14F, 0.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 150
		bodyModel[206].setRotationPoint(0F, 0F, 0F);

		bodyModel[207].addShapeBox(-4.2F, 14F, 1.8F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 151
		bodyModel[207].setRotationPoint(0F, 0F, 0F);

		bodyModel[208].addShapeBox(-3.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 152
		bodyModel[208].setRotationPoint(0F, 0F, 0F);

		bodyModel[209].addShapeBox(-2.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 153
		bodyModel[209].setRotationPoint(0F, 0F, 0F);

		bodyModel[210].addShapeBox(-1.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 154
		bodyModel[210].setRotationPoint(0F, 0F, 0F);

		bodyModel[211].addShapeBox(-0.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 155
		bodyModel[211].setRotationPoint(0F, 0F, 0F);

		bodyModel[212].addShapeBox(0.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 156
		bodyModel[212].setRotationPoint(0F, 0F, 0F);

		bodyModel[213].addShapeBox(1.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 157
		bodyModel[213].setRotationPoint(0F, 0F, 0F);

		bodyModel[214].addShapeBox(2.5F, 14F, 1.2F, 1, 4, 1, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, 0.5F, -0.1F, 1F, 0.5F); // Box 158
		bodyModel[214].setRotationPoint(0F, 0F, 0F);

		bodyModel[215].addShapeBox(-4.2F, 11.5F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 159
		bodyModel[215].setRotationPoint(0F, 0F, 0F);

		bodyModel[216].addShapeBox(-4.2F, 14F, -2.2F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F); // Box 160
		bodyModel[216].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 18
		leftArmModel[1] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 2
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 2
		leftArmModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 2
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 2
		leftArmModel[5] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 2
		leftArmModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 2
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		leftArmModel[8] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 2
		leftArmModel[9] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 169
		leftArmModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 170
		leftArmModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 171
		leftArmModel[12] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 172
		leftArmModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 173
		leftArmModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 174
		leftArmModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 175
		leftArmModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 176
		leftArmModel[17] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 177
		leftArmModel[18] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 178
		leftArmModel[19] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 183
		leftArmModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 184
		leftArmModel[21] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 185
		leftArmModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 186

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.7F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.1F, 0.7F, 0.1F); // Box 18
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 2
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 2
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 2
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 2
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 2
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.4F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 2
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.4F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 2
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, -2.6F, 1.1F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 2
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1F, -2.6F, -0.4F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 169
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(2.4F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 170
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.4F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 171
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -2.6F, -1.9F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 172
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.4F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 173
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.4F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 174
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-1F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 175
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-1F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 176
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(0.5F, -2F, -2.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 177
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(0.5F, -2F, -2.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 178
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(-1F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 183
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-1F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 184
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(0.5F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 185
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(0.5F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 186
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box20
		rightArmModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 2
		rightArmModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 2
		rightArmModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 2
		rightArmModel[6] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 163
		rightArmModel[7] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 164
		rightArmModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 165
		rightArmModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 166
		rightArmModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 167
		rightArmModel[11] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 168
		rightArmModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 179
		rightArmModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 180
		rightArmModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 181
		rightArmModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 182
		rightArmModel[16] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 187
		rightArmModel[17] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 188
		rightArmModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 189
		rightArmModel[19] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 190
		rightArmModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 191
		rightArmModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 192

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, 0.3F, 0.4F, 0.1F); // Import Box20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.5F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 2
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.5F, -2F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 2
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, -2.6F, 1.1F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 2
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -2.6F, -0.4F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 163
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.5F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 164
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.5F, -2F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 165
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, -2.6F, -1.9F, 4, 1, 1, 0F,0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 166
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3.5F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 167
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.5F, -2F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 168
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(0F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 179
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(0F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 180
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-1.5F, -2F, -2.35F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 181
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-1.5F, -2F, -2.35F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 182
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(0F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 187
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(0F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 188
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 189
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 190
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-1.5F, -2F, 1.4F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 191
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-1.5F, -2F, 1.4F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 192
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 161
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 162

		leftLegModel[0].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 162
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 402

		rightLegModel[0].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 402
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 54

		skirtRearModel[0].addShapeBox(-7F, -1.5F, 3F, 14, 10, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 54
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}