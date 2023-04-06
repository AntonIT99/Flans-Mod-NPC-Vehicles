//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSlava extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSlava() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[247];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 126
		bodyModel[127] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 127
		bodyModel[128] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 128
		bodyModel[129] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 129
		bodyModel[130] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 130
		bodyModel[131] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 131
		bodyModel[132] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 132
		bodyModel[133] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 133
		bodyModel[134] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 136
		bodyModel[137] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 137
		bodyModel[138] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 138
		bodyModel[139] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 139
		bodyModel[140] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 140
		bodyModel[141] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 141
		bodyModel[142] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 142
		bodyModel[143] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 143
		bodyModel[144] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 144
		bodyModel[145] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 146
		bodyModel[147] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 147
		bodyModel[148] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 148
		bodyModel[149] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 149
		bodyModel[150] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 150
		bodyModel[151] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 151
		bodyModel[152] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 152
		bodyModel[153] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 153
		bodyModel[154] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 154
		bodyModel[155] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 155
		bodyModel[156] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 157
		bodyModel[158] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 160
		bodyModel[161] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 161
		bodyModel[162] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 9, 249, textureX, textureY); // Box 1
		bodyModel[164] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Box 2
		bodyModel[165] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 3
		bodyModel[166] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 4
		bodyModel[167] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 5
		bodyModel[168] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 6
		bodyModel[169] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 7
		bodyModel[170] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 8
		bodyModel[171] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 9
		bodyModel[172] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		bodyModel[173] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 11
		bodyModel[174] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 12
		bodyModel[175] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 13
		bodyModel[176] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 14
		bodyModel[177] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 15
		bodyModel[178] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 16
		bodyModel[179] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 17
		bodyModel[180] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 18
		bodyModel[181] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 19
		bodyModel[182] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 20
		bodyModel[183] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 21
		bodyModel[184] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 22
		bodyModel[185] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 23
		bodyModel[186] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 24
		bodyModel[187] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 25
		bodyModel[188] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 26
		bodyModel[189] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 27
		bodyModel[190] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 29
		bodyModel[191] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 30
		bodyModel[192] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 31
		bodyModel[193] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 32
		bodyModel[194] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 34
		bodyModel[195] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[196] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 36
		bodyModel[197] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 37
		bodyModel[198] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 38
		bodyModel[199] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 39
		bodyModel[200] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 40
		bodyModel[201] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 41
		bodyModel[202] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 42
		bodyModel[203] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 43
		bodyModel[204] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 44
		bodyModel[205] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 45
		bodyModel[206] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 46
		bodyModel[207] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 47
		bodyModel[208] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 48
		bodyModel[209] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 49
		bodyModel[210] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 50
		bodyModel[211] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 51
		bodyModel[212] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 52
		bodyModel[213] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 53
		bodyModel[214] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 77
		bodyModel[215] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 78
		bodyModel[216] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 79
		bodyModel[217] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Box 80
		bodyModel[218] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 81
		bodyModel[219] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 82
		bodyModel[220] = new ModelRendererTurbo(this, 233, 329, textureX, textureY); // Box 83
		bodyModel[221] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Box 84
		bodyModel[222] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 85
		bodyModel[223] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 86
		bodyModel[224] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 87
		bodyModel[225] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 88
		bodyModel[226] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 89
		bodyModel[227] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 90
		bodyModel[228] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 91
		bodyModel[229] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 92
		bodyModel[230] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 93
		bodyModel[231] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 94
		bodyModel[232] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 95
		bodyModel[233] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 96
		bodyModel[234] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 97
		bodyModel[235] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 98
		bodyModel[236] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 99
		bodyModel[237] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 100
		bodyModel[238] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 101
		bodyModel[239] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 1
		bodyModel[241] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 2
		bodyModel[242] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 3
		bodyModel[243] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 4
		bodyModel[244] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 5
		bodyModel[245] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 6
		bodyModel[246] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 7

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, 0F, 2F, -6F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 1F, -6F, 0F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-149F, -6.5F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, 0F, 2F); // Box 1
		bodyModel[1].setRotationPoint(-149F, -7.5F, -15F);

		bodyModel[2].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 2
		bodyModel[2].setRotationPoint(-147.5F, -7F, -14F);
		bodyModel[2].rotateAngleZ = 0.15707963F;

		bodyModel[3].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 3
		bodyModel[3].setRotationPoint(-147.5F, -7F, 15F);
		bodyModel[3].rotateAngleZ = 0.15707963F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-140.5F, -10F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 49, 10, 30, 0F,0F, 0F, 3.5F, 100F, -1F, 4F, 100F, -1F, 3.5F, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 89F, 0F, -2F, 89F, 0F, -2F, 0F, 0F, 1F); // Box 5
		bodyModel[5].setRotationPoint(-111F, -6.5F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 2, 30, 0F,0F, 0F, 3.5F, 100F, 0F, 4F, 100F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, 1F, 3.5F, 100F, 2F, 4F, 100F, 2F, 3.5F, 0F, 1F, 4.5F); // Box 6
		bodyModel[6].setRotationPoint(-110F, -9.5F, -15F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 30, 0F,0F, -2F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, -2F, 4.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F); // Box 7
		bodyModel[7].setRotationPoint(-111F, -9.5F, -15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 23, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-141F, -10.5F, -10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 28, 4, 30, 0F,0F, 0F, 4F, 1F, 0.7F, 2.5F, 1F, 0.7F, 1.5F, 0F, 0F, 3.5F, 0F, 0F, 4F, 0.5F, -2.5F, 2.5F, 0.5F, -2.5F, 1.5F, 0F, 0F, 3.5F); // Box 9
		bodyModel[9].setRotationPoint(38F, -9.5F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 28, 8, 30, 0F,0F, 0F, 4F, -1.5F, 0F, 2F, -1.5F, 0F, 1F, 0F, 0F, 3.5F, 11F, 1F, -2F, -6F, 0.7F, -3.5F, -6F, 0.7F, -4.5F, 11F, 1F, -2F); // Box 10
		bodyModel[10].setRotationPoint(38F, -5.5F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 28, 1, 30, 0F,0F, -0.9F, 4F, 0.5F, 1.5F, 2.5F, 0.5F, 1.5F, 1.5F, 0F, -0.9F, 3.5F, 0F, 0F, 4F, -1.5F, 0F, 2F, -1.5F, 0F, 1F, 0F, 0F, 3.5F); // Box 11
		bodyModel[11].setRotationPoint(38F, -6.5F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-114.5F, -9.2F, -13.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 8, 19, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-113.5F, -17.2F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 14
		bodyModel[14].setRotationPoint(-97.5F, -14.2F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 15
		bodyModel[15].setRotationPoint(-95F, -18.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 5, 21, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 16
		bodyModel[16].setRotationPoint(-45.5F, -14.5F, -10.5F);

		bodyModel[17].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 17
		bodyModel[17].setRotationPoint(-45.5F, -14F, -10F);
		bodyModel[17].rotateAngleZ = 0.15707963F;

		bodyModel[18].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 18
		bodyModel[18].setRotationPoint(-45.5F, -14F, 10F);
		bodyModel[18].rotateAngleZ = 0.15707963F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 9, 17, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 3F, 0.5F, 0F, 3F); // Box 19
		bodyModel[19].setRotationPoint(-38.5F, -18F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 16, 11, 5, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, 1F); // Box 20
		bodyModel[20].setRotationPoint(-37.5F, -29F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 11, 5, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, 1F); // Box 21
		bodyModel[21].setRotationPoint(-37.5F, -29F, 3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 31, 4, 30, 0F,1F, 0.7F, 2.5F, 0F, 2.5F, 0F, 0F, 2.5F, -1.5F, 1F, 0.7F, 1.5F, 1.5F, -2.5F, 2.5F, 0F, -4.5F, 0F, 0F, -4.5F, -1.5F, 1.5F, -2.5F, 1.5F); // Box 22
		bodyModel[22].setRotationPoint(68F, -9.5F, -15F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 31, 1, 30, 0F,0.5F, 1.5F, 2.5F, 1F, 3.5F, 0F, 1F, 3.5F, -1.5F, 0.5F, 1.5F, 1.5F, 2.5F, 0F, 2F, 1F, 0F, -4F, 1F, 0F, -5F, 2.5F, 0F, 1F); // Box 23
		bodyModel[23].setRotationPoint(67F, -6.5F, -15F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 36, 8, 30, 0F,-1.5F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -5F, -1.5F, 0F, 1F, 3F, 0.7F, -3.5F, 0F, 1F, -8F, 0F, 1F, -10F, 3F, 0.7F, -4.5F); // Box 24
		bodyModel[24].setRotationPoint(63F, -5.5F, -15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 25
		bodyModel[25].setRotationPoint(-93.5F, -21.5F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 26
		bodyModel[26].setRotationPoint(-91.5F, -23F, -1F);

		bodyModel[27].addShapeBox(-1F, -0.8F, 1F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[27].rotateAngleZ = -0.38397244F;

		bodyModel[28].addShapeBox(-1F, -0.8F, 3F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[28].rotateAngleZ = -0.38397244F;

		bodyModel[29].addShapeBox(-1F, -0.8F, -1F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[29].rotateAngleZ = -0.38397244F;

		bodyModel[30].addShapeBox(3F, -0.8F, -1F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[30].rotateAngleZ = -0.38397244F;

		bodyModel[31].addShapeBox(3F, -0.8F, 1F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[31].rotateAngleZ = -0.38397244F;

		bodyModel[32].addShapeBox(3F, -0.8F, 3F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-91.5F, -28F, -1F);
		bodyModel[32].rotateAngleZ = -0.38397244F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 22, 13, 17, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, 2F, 5.5F, 0F, 2F, 5.5F, 0F, 3F, 1.5F, 0F, 3F); // Box 33
		bodyModel[33].setRotationPoint(-18.5F, -22F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 9, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, 4F); // Box 34
		bodyModel[34].setRotationPoint(-14.5F, -30.5F, -4.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 13, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-10.5F, -43.5F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-11.5F, -44F, -2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(-10.5F, -48.5F, -0.2F);

		bodyModel[38].addShapeBox(0F, -1F, -3F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[38].setRotationPoint(-10.5F, -48.5F, -0.2F);
		bodyModel[38].rotateAngleZ = 0.31415927F;

		bodyModel[39].addShapeBox(0F, -1F, -2F, 1, 3, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-12.5F, -46.7F, -0.2F);
		bodyModel[39].rotateAngleZ = -0.19198622F;

		bodyModel[40].addShapeBox(0F, -1F, -2F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 40
		bodyModel[40].setRotationPoint(-12F, -45.2F, 1.8F);

		bodyModel[41].addShapeBox(0F, -1F, -2F, 5, 1, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 41
		bodyModel[41].setRotationPoint(-14F, -40.7F, 1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-10.5F, -13.5F, -15F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 17, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 43
		bodyModel[43].setRotationPoint(-10.5F, -13.5F, 10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 9, 17, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 2.5F, 0F, 2F, 2.5F, 0F, 2F, 0F, 0F, 2F); // Box 44
		bodyModel[44].setRotationPoint(5F, -18.2F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(8.5F, -15.2F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(8.5F, -15.2F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 6, 10, 0F,0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(11.5F, -15.2F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(51.5F, -12.2F, -16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(57.5F, -12.2F, -16F);
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(57.5F, -12.2F, -16F);
		bodyModel[50].rotateAngleZ = 0.27925268F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(58.5F, -11.2F, -16F);

		bodyModel[52].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(58.5F, -14.7F, -15.2F);
		bodyModel[52].rotateAngleZ = 0.29670597F;

		bodyModel[53].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(58.5F, -14.7F, -15.2F);
		bodyModel[53].rotateAngleZ = 0.29670597F;

		bodyModel[54].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		bodyModel[54].setRotationPoint(58.5F, -14.7F, -15.2F);
		bodyModel[54].rotateAngleZ = 0.29670597F;

		bodyModel[55].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[55].setRotationPoint(58.5F, -14.7F, -11.2F);
		bodyModel[55].rotateAngleZ = 0.29670597F;

		bodyModel[56].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(58.5F, -14.7F, -11.2F);
		bodyModel[56].rotateAngleZ = 0.29670597F;

		bodyModel[57].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(58.5F, -14.7F, -11.2F);
		bodyModel[57].rotateAngleZ = 0.29670597F;

		bodyModel[58].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 58
		bodyModel[58].setRotationPoint(76.7F, -15F, -11.2F);
		bodyModel[58].rotateAngleZ = 0.29670597F;

		bodyModel[59].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[59].setRotationPoint(76.7F, -15F, -11.2F);
		bodyModel[59].rotateAngleZ = 0.29670597F;

		bodyModel[60].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(76.7F, -15F, -11.2F);
		bodyModel[60].rotateAngleZ = 0.29670597F;

		bodyModel[61].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(76.7F, -15F, -15.2F);
		bodyModel[61].rotateAngleZ = 0.29670597F;

		bodyModel[62].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[62].setRotationPoint(76.7F, -15F, -15.2F);
		bodyModel[62].rotateAngleZ = 0.29670597F;

		bodyModel[63].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		bodyModel[63].setRotationPoint(76.7F, -15F, -15.2F);
		bodyModel[63].rotateAngleZ = 0.29670597F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[64].setRotationPoint(75.7F, -12.5F, -16F);
		bodyModel[64].rotateAngleZ = 0.27925268F;

		bodyModel[65].addShapeBox(8F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[65].setRotationPoint(75.7F, -12.5F, -16F);
		bodyModel[65].rotateAngleZ = 0.27925268F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[66].setRotationPoint(76.7F, -11.5F, -16F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(69.7F, -12.5F, -16F);

		bodyModel[68].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[68].setRotationPoint(39.9F, -13.9F, -15.2F);
		bodyModel[68].rotateAngleZ = 0.29670597F;

		bodyModel[69].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(39.9F, -13.9F, -11.2F);
		bodyModel[69].rotateAngleZ = 0.29670597F;

		bodyModel[70].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[70].setRotationPoint(39.9F, -13.9F, -15.2F);
		bodyModel[70].rotateAngleZ = 0.29670597F;

		bodyModel[71].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(39.9F, -13.9F, -11.2F);
		bodyModel[71].rotateAngleZ = 0.29670597F;

		bodyModel[72].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		bodyModel[72].setRotationPoint(39.9F, -13.9F, -11.2F);
		bodyModel[72].rotateAngleZ = 0.29670597F;

		bodyModel[73].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[73].setRotationPoint(39.9F, -13.9F, -15.2F);
		bodyModel[73].rotateAngleZ = 0.29670597F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(38.9F, -11.4F, -16F);
		bodyModel[74].rotateAngleZ = 0.27925268F;

		bodyModel[75].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(38.9F, -11.4F, -16F);
		bodyModel[75].rotateAngleZ = 0.27925268F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[76].setRotationPoint(39.9F, -10.4F, -16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(32.9F, -11.4F, -16F);

		bodyModel[78].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[78].setRotationPoint(21.7F, -13.8F, -15.2F);
		bodyModel[78].rotateAngleZ = 0.29670597F;

		bodyModel[79].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[79].setRotationPoint(21.7F, -13.8F, -11.2F);
		bodyModel[79].rotateAngleZ = 0.29670597F;

		bodyModel[80].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[80].setRotationPoint(21.7F, -13.8F, -15.2F);
		bodyModel[80].rotateAngleZ = 0.29670597F;

		bodyModel[81].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[81].setRotationPoint(21.7F, -13.8F, -11.2F);
		bodyModel[81].rotateAngleZ = 0.29670597F;

		bodyModel[82].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 82
		bodyModel[82].setRotationPoint(21.7F, -13.8F, -11.2F);
		bodyModel[82].rotateAngleZ = 0.29670597F;

		bodyModel[83].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 83
		bodyModel[83].setRotationPoint(21.7F, -13.8F, -15.2F);
		bodyModel[83].rotateAngleZ = 0.29670597F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[84].setRotationPoint(20.7F, -11.3F, -16F);
		bodyModel[84].rotateAngleZ = 0.27925268F;

		bodyModel[85].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[85].setRotationPoint(20.7F, -11.3F, -16F);
		bodyModel[85].rotateAngleZ = 0.27925268F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[86].setRotationPoint(21.7F, -10.3F, -16F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[87].setRotationPoint(14.7F, -11.3F, -16F);

		bodyModel[88].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[88].setRotationPoint(21.7F, -13.8F, 11F);
		bodyModel[88].rotateAngleZ = 0.29670597F;

		bodyModel[89].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[89].setRotationPoint(21.7F, -13.8F, 7F);
		bodyModel[89].rotateAngleZ = 0.29670597F;

		bodyModel[90].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(21.7F, -13.8F, 11F);
		bodyModel[90].rotateAngleZ = 0.29670597F;

		bodyModel[91].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[91].setRotationPoint(21.7F, -13.8F, 7F);
		bodyModel[91].rotateAngleZ = 0.29670597F;

		bodyModel[92].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 92
		bodyModel[92].setRotationPoint(21.7F, -13.8F, 7F);
		bodyModel[92].rotateAngleZ = 0.29670597F;

		bodyModel[93].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 93
		bodyModel[93].setRotationPoint(21.7F, -13.8F, 11F);
		bodyModel[93].rotateAngleZ = 0.29670597F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[94].setRotationPoint(20.7F, -11.3F, 5.8F);
		bodyModel[94].rotateAngleZ = 0.27925268F;

		bodyModel[95].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[95].setRotationPoint(20.7F, -11.3F, 5.8F);
		bodyModel[95].rotateAngleZ = 0.27925268F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[96].setRotationPoint(21.7F, -10.3F, 5.8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[97].setRotationPoint(14.7F, -11.3F, 5.8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(51.5F, -12.2F, 5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[99].setRotationPoint(57.5F, -12.2F, 5.5F);
		bodyModel[99].rotateAngleZ = 0.27925268F;

		bodyModel[100].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(57.5F, -12.2F, 5.5F);
		bodyModel[100].rotateAngleZ = 0.27925268F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[101].setRotationPoint(58.5F, -11.2F, 5.5F);

		bodyModel[102].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[102].setRotationPoint(58.5F, -14.7F, 10.7F);
		bodyModel[102].rotateAngleZ = 0.29670597F;

		bodyModel[103].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[103].setRotationPoint(58.5F, -14.7F, 10.7F);
		bodyModel[103].rotateAngleZ = 0.29670597F;

		bodyModel[104].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
		bodyModel[104].setRotationPoint(58.5F, -14.7F, 10.7F);
		bodyModel[104].rotateAngleZ = 0.29670597F;

		bodyModel[105].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 105
		bodyModel[105].setRotationPoint(58.5F, -14.7F, 6.7F);
		bodyModel[105].rotateAngleZ = 0.29670597F;

		bodyModel[106].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[106].setRotationPoint(58.5F, -14.7F, 6.7F);
		bodyModel[106].rotateAngleZ = 0.29670597F;

		bodyModel[107].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[107].setRotationPoint(58.5F, -14.7F, 6.7F);
		bodyModel[107].rotateAngleZ = 0.29670597F;

		bodyModel[108].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 108
		bodyModel[108].setRotationPoint(76.7F, -15F, 6.7F);
		bodyModel[108].rotateAngleZ = 0.29670597F;

		bodyModel[109].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[109].setRotationPoint(76.7F, -15F, 6.7F);
		bodyModel[109].rotateAngleZ = 0.29670597F;

		bodyModel[110].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[110].setRotationPoint(76.7F, -15F, 6.7F);
		bodyModel[110].rotateAngleZ = 0.29670597F;

		bodyModel[111].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[111].setRotationPoint(76.7F, -15F, 10.7F);
		bodyModel[111].rotateAngleZ = 0.29670597F;

		bodyModel[112].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[112].setRotationPoint(76.7F, -15F, 10.7F);
		bodyModel[112].rotateAngleZ = 0.29670597F;

		bodyModel[113].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 113
		bodyModel[113].setRotationPoint(76.7F, -15F, 10.7F);
		bodyModel[113].rotateAngleZ = 0.29670597F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[114].setRotationPoint(75.7F, -12.5F, 5.5F);
		bodyModel[114].rotateAngleZ = 0.27925268F;

		bodyModel[115].addShapeBox(8F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 115
		bodyModel[115].setRotationPoint(75.7F, -12.5F, 5.5F);
		bodyModel[115].rotateAngleZ = 0.27925268F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[116].setRotationPoint(76.7F, -11.5F, 5.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[117].setRotationPoint(69.7F, -12.5F, 5.5F);

		bodyModel[118].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[118].setRotationPoint(39.9F, -13.9F, 10.7F);
		bodyModel[118].rotateAngleZ = 0.29670597F;

		bodyModel[119].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[119].setRotationPoint(39.9F, -13.9F, 6.7F);
		bodyModel[119].rotateAngleZ = 0.29670597F;

		bodyModel[120].addShapeBox(-8F, -1F, 0F, 20, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[120].setRotationPoint(39.9F, -13.9F, 10.7F);
		bodyModel[120].rotateAngleZ = 0.29670597F;

		bodyModel[121].addShapeBox(-8F, 0F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[121].setRotationPoint(39.9F, -13.9F, 6.7F);
		bodyModel[121].rotateAngleZ = 0.29670597F;

		bodyModel[122].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[122].setRotationPoint(39.9F, -13.9F, 6.7F);
		bodyModel[122].rotateAngleZ = 0.29670597F;

		bodyModel[123].addShapeBox(-8F, 1F, 0F, 20, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 123
		bodyModel[123].setRotationPoint(39.9F, -13.9F, 10.7F);
		bodyModel[123].rotateAngleZ = 0.29670597F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[124].setRotationPoint(38.9F, -11.4F, 5.5F);
		bodyModel[124].rotateAngleZ = 0.27925268F;

		bodyModel[125].addShapeBox(8F, 0F, 0F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[125].setRotationPoint(38.9F, -11.4F, 5.5F);
		bodyModel[125].rotateAngleZ = 0.27925268F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[126].setRotationPoint(39.9F, -10.4F, 5.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 7, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[127].setRotationPoint(32.9F, -11.4F, 5.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 71, 11, 12, 0F,0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 128
		bodyModel[128].setRotationPoint(21.5F, -20.2F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 40, 4, 12, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, -1.5F, 0F, 0F, 0F); // Box 129
		bodyModel[129].setRotationPoint(21.5F, -24.2F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 130
		bodyModel[130].setRotationPoint(21.5F, -28.2F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 20, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 3.2F, 6F, 0F, 3.2F, 6F, 0F, 3.2F, 1.5F, 0F, 3.2F); // Box 131
		bodyModel[131].setRotationPoint(24F, -48.2F, -3.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 11, 8, 0F,0F, 0F, 0.5F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 1F, 0F, -1F, 1F, 0F, -2F, -2F, 0F, 0.5F); // Box 132
		bodyModel[132].setRotationPoint(91.5F, -20.2F, -4.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[133].setRotationPoint(20.5F, -31.4F, -3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 134
		bodyModel[134].setRotationPoint(19F, -31.4F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[135].setRotationPoint(34F, -31.4F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[136].setRotationPoint(40.5F, -31.4F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -0.4F, -1F, 0.5F, -0.4F, -1F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[137].setRotationPoint(38F, -31.4F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, -0.4F, -1F, 0.5F, -0.4F, -1F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[138].setRotationPoint(41.5F, -31.4F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F,-1.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[139].setRotationPoint(19F, -31.4F, 3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 140
		bodyModel[140].setRotationPoint(34F, -31.4F, 4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 141
		bodyModel[141].setRotationPoint(40.5F, -31.4F, 4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 142
		bodyModel[142].setRotationPoint(38F, -31.4F, 4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 143
		bodyModel[143].setRotationPoint(41.5F, -31.4F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 144
		bodyModel[144].setRotationPoint(25F, -31.4F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[145].setRotationPoint(25F, -31.4F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 146
		bodyModel[146].setRotationPoint(33F, -31.3F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -1F); // Box 147
		bodyModel[147].setRotationPoint(43F, -31.3F, -6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 148
		bodyModel[148].setRotationPoint(45F, -31.5F, -8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,0F, -0.2F, 0F, 0F, -0.2F, -3.7F, 0F, -0.2F, -3.7F, 0F, -0.2F, 0F, 0F, 0F, 0.3F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0F, 0F, 0.3F); // Box 149
		bodyModel[149].setRotationPoint(50F, -31.5F, -8.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 16, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 150
		bodyModel[150].setRotationPoint(45F, -29.5F, -8.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 9, 4, 16, 0F,0F, 0F, 0.3F, -3.8F, 0F, -3.5F, -3.8F, 0F, -3.5F, 0F, 0F, 0.3F, 0F, -1.7F, 0F, -4F, -1.7F, -3.7F, -4F, -1.7F, -3.7F, 0F, -1.7F, 0F); // Box 151
		bodyModel[151].setRotationPoint(50F, -29.5F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.3F, -1.5F, -1F, 0.3F, -1.5F, -1F, 0.3F, -1.5F, 0F, 0.3F, -1.5F); // Box 152
		bodyModel[152].setRotationPoint(44.5F, -27.5F, -6.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.3F, 1F, 0.3F, -1.5F, -0.5F, 0.3F, -2F, -0.5F, 0.3F, -2F, 1F, 0.3F, -1.5F); // Box 153
		bodyModel[153].setRotationPoint(49.5F, -27.5F, -6.5F);

		bodyModel[154].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 154
		bodyModel[154].setRotationPoint(50.5F, -31F, -6.5F);
		bodyModel[154].rotateAngleZ = -0.15707963F;

		bodyModel[155].addShapeBox(0F, -17F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 155
		bodyModel[155].setRotationPoint(50.5F, -31F, 5F);
		bodyModel[155].rotateAngleZ = -0.15707963F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[156].setRotationPoint(24.5F, -50.2F, -1.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[157].setRotationPoint(25.8F, -54.2F, -0.5F);

		bodyModel[158].addShapeBox(0F, -2F, -3F, 1, 4, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 158
		bodyModel[158].setRotationPoint(26.5F, -54.2F, -0.5F);
		bodyModel[158].rotateAngleZ = 0.10471976F;

		bodyModel[159].addShapeBox(0F, -2F, -3F, 1, 4, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 159
		bodyModel[159].setRotationPoint(25F, -54.2F, -0.5F);
		bodyModel[159].rotateAngleZ = -0.10471976F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 160
		bodyModel[160].setRotationPoint(15.5F, -48.2F, -2.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 161
		bodyModel[161].setRotationPoint(17F, -62.5F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 16, 4, 30, 0F,0F, 2.5F, 0F, 1F, 3.7F, -2.5F, 1F, 3.7F, -4F, 0F, 2.5F, -1.5F, 0F, -4.5F, 0F, 1F, -5.2F, -3.5F, 1F, -5.2F, -5F, 0F, -4.5F, -1.5F); // Box 0
		bodyModel[162].setRotationPoint(99F, -9.5F, -15F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 16, 1, 30, 0F,1F, 3.5F, 0F, 0F, 4.2F, -3.5F, 0F, 4.2F, -5F, 1F, 3.5F, -1.5F, 1F, 0F, -4F, 0F, 0F, -7.5F, 0F, 0F, -9F, 1F, 0F, -5F); // Box 1
		bodyModel[163].setRotationPoint(100F, -6.5F, -15F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 17, 8, 30, 0F,0F, 0F, -4F, 0F, 0F, -7.5F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 1F, -8F, 0F, 0.7F, -10.5F, 0F, 0.7F, -12F, 0F, 1F, -10F); // Box 2
		bodyModel[164].setRotationPoint(99F, -5.5F, -15F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 24, 4, 30, 0F,0F, 3.7F, -2.5F, 6F, 6.6F, -11.3F, 6F, 6.6F, -13.5F, 0F, 3.7F, -4F, 0F, -5.2F, -3.5F, 0F, -6F, -11F, 0F, -6F, -13F, 0F, -5.2F, -5F); // Box 3
		bodyModel[165].setRotationPoint(116F, -9.5F, -15F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 17, 8, 16, 0F,0F, 0F, -0.5F, 1F, 0.5F, -4F, 1F, 0.5F, -6F, 0F, 0F, -2F, 0F, 0.7F, -3.5F, -6F, 1F, -5F, -6F, 1F, -7F, 0F, 0.7F, -5F); // Box 4
		bodyModel[166].setRotationPoint(116F, -5.5F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 17, 1, 22, 0F,1F, 4.2F, 0.5F, 6F, 5F, -7F, 6F, 5F, -9F, 1F, 4.2F, -1F, 1F, 0F, -3.5F, 0F, -0.5F, -7F, 0F, -0.5F, -9F, 1F, 0F, -5F); // Box 5
		bodyModel[167].setRotationPoint(117F, -6.5F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 8, 16, 0F,-13F, 0.5F, -4F, 14F, 0.5F, -6.5F, 14F, 0.5F, -8.5F, -13F, 0.5F, -6F, -6F, 1F, -5F, 7F, 1F, -6.5F, 7F, 1F, -8.5F, -6F, 1F, -7F); // Box 6
		bodyModel[168].setRotationPoint(121F, -5.5F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F,-12F, 0.5F, -4F, 13.5F, 0.5F, -6.5F, 13.5F, 0.5F, -8.5F, -12F, 0.5F, -6F, -6F, 1F, -4F, 7F, 1F, -6.5F, 7F, 1F, -8.5F, -6F, 1F, -6F); // Box 7
		bodyModel[169].setRotationPoint(128F, -11F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,-12F, 0.6F, -4.3F, 13.5F, 1F, -6.5F, 13.5F, 1F, -8.5F, -12F, 0.6F, -6.5F, -6F, 1F, -4F, 7.5F, 1F, -6.5F, 7.5F, 1F, -8.5F, -6F, 1F, -6F); // Box 8
		bodyModel[170].setRotationPoint(134F, -15.5F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[171].setRotationPoint(85F, -21.2F, -3.2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
		bodyModel[172].setRotationPoint(90F, -21.2F, -3.2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[173].setRotationPoint(83.5F, -22.2F, -3.2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[174].setRotationPoint(77.5F, -22.2F, -3.2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 13
		bodyModel[175].setRotationPoint(75.5F, -22.2F, -3.2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 14
		bodyModel[176].setRotationPoint(-76F, -10.5F, -10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[177].setRotationPoint(-73.3F, -11F, -8.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		bodyModel[178].setRotationPoint(-71.3F, -11F, -8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 17
		bodyModel[179].setRotationPoint(-75.3F, -11F, -8.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		bodyModel[180].setRotationPoint(-68.7F, -11F, -8.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[181].setRotationPoint(-66.7F, -11F, -8.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 20
		bodyModel[182].setRotationPoint(-64.7F, -11F, -8.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21
		bodyModel[183].setRotationPoint(-62F, -11F, -8.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[184].setRotationPoint(-60F, -11F, -8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 23
		bodyModel[185].setRotationPoint(-58F, -11F, -8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 24
		bodyModel[186].setRotationPoint(-55.5F, -11F, -8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[187].setRotationPoint(-53.5F, -11F, -8.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 26
		bodyModel[188].setRotationPoint(-51.5F, -11F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[189].setRotationPoint(-78.3F, -12F, -1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[190].setRotationPoint(-50.3F, -12F, -1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[191].setRotationPoint(60F, -23.7F, -2.2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[192].setRotationPoint(61F, -21.7F, -4.2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[193].setRotationPoint(61.5F, -26.7F, -1.2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[194].setRotationPoint(87F, -22F, -2.2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 35
		bodyModel[195].setRotationPoint(87F, -22.7F, -2.2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 36
		bodyModel[196].setRotationPoint(88.5F, -23F, -1.2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 37
		bodyModel[197].setRotationPoint(80F, -24.1F, -1.2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 38
		bodyModel[198].setRotationPoint(78.5F, -23.8F, -2.2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[199].setRotationPoint(78.5F, -23.1F, -2.2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 40
		bodyModel[200].setRotationPoint(4F, -15.1F, -13.2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 41
		bodyModel[201].setRotationPoint(2.5F, -14.8F, -14.2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[202].setRotationPoint(2.5F, -14.1F, -14.2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 43
		bodyModel[203].setRotationPoint(-8F, -15.1F, -13.2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 44
		bodyModel[204].setRotationPoint(-9.5F, -14.8F, -14.2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[205].setRotationPoint(-9.5F, -14.1F, -14.2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[206].setRotationPoint(28.2F, -18.5F, -15.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 47
		bodyModel[207].setRotationPoint(28.2F, -18.5F, -15.7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[208].setRotationPoint(28.2F, -18.5F, 5.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 49
		bodyModel[209].setRotationPoint(28.2F, -18.5F, 13.7F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 50
		bodyModel[210].setRotationPoint(26.7F, -20.5F, -10.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.2F, -1.5F, -0.5F, 0.2F, -1.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 51
		bodyModel[211].setRotationPoint(26.7F, -19.5F, -10.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 52
		bodyModel[212].setRotationPoint(26.7F, -20.5F, 5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, -1.5F, -0.5F, 0.2F, -1.5F); // Box 53
		bodyModel[213].setRotationPoint(26.7F, -19.5F, 5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[214].setRotationPoint(99F, -12.9F, -3F);
		bodyModel[214].rotateAngleZ = 0.01745329F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 78
		bodyModel[215].setRotationPoint(99F, -12.9F, 1F);
		bodyModel[215].rotateAngleZ = 0.01745329F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[216].setRotationPoint(99F, -12.9F, -7F);
		bodyModel[216].rotateAngleZ = 0.01745329F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 49, 8, 30, 0F,0F, 0F, -0.5F, 89F, 0F, -2F, 89F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, -14F, 89F, 0F, -14F, 89F, 0F, -14F, 0F, -1F, -14F); // Box 80
		bodyModel[217].setRotationPoint(-111F, 3.5F, -15F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 38, 7, 30, 0F,-6F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 1F, -6F, 0F, -1F, -23F, -2F, -10F, 0F, 0F, -14F, 0F, 0F, -14F, -23F, -2F, -10F); // Box 81
		bodyModel[218].setRotationPoint(-149F, 3.5F, -15F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 28, 7, 30, 0F,11F, 1F, -2F, -6F, 1.3F, -3.5F, -6F, 1.3F, -4.5F, 11F, 1F, -2F, 11F, 0F, -14F, -6F, 0F, -14F, -6F, 0F, -14F, 11F, 0F, -14F); // Box 82
		bodyModel[219].setRotationPoint(38F, 4.5F, -15F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 34, 7, 30, 0F,-6F, 1.3F, -3.5F, 11F, 1F, -8F, 11F, 1F, -10F, -6F, 1.3F, -4.5F, -6F, 0F, -14F, 11F, -1F, -13.5F, 11F, -1F, -14.5F, -6F, 0F, -14F); // Box 83
		bodyModel[220].setRotationPoint(54F, 4.5F, -15F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 23, 7, 30, 0F,0F, 1F, -8F, -6F, 1.3F, -10.5F, -6F, 1.3F, -12F, 0F, 1F, -10F, 0F, -1F, -13.5F, -6F, -2F, -13.5F, -6F, -2F, -14.5F, 0F, -1F, -14.5F); // Box 84
		bodyModel[221].setRotationPoint(99F, 4.5F, -15F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 11, 7, 30, 0F,0F, 1.3F, -10.5F, 0F, 1F, -12F, 0F, 1F, -14F, 0F, 1.3F, -12F, 0F, -2F, -13.5F, 0F, -4F, -13.7F, 0F, -4F, -15.3F, 0F, -2F, -14.5F); // Box 85
		bodyModel[222].setRotationPoint(116F, 4.5F, -15F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 7, 30, 0F,1F, 1F, -12F, 1F, 1F, -13.5F, 1F, 1F, -15.5F, 1F, 1F, -14F, 1F, -4F, -13.7F, 0F, -6F, -13.5F, 0F, -6F, -15.5F, 1F, -4F, -15.3F); // Box 86
		bodyModel[223].setRotationPoint(128F, 4.5F, -15F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[224].setRotationPoint(68.5F, -22.2F, -3.2F);
		bodyModel[224].rotateAngleZ = 0.15707963F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		bodyModel[225].setRotationPoint(69.3F, -21.5F, -2.7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 89
		bodyModel[226].setRotationPoint(-76F, -10.5F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 90
		bodyModel[227].setRotationPoint(-75.3F, -11F, 3.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[228].setRotationPoint(-73.3F, -11F, 3.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 92
		bodyModel[229].setRotationPoint(-71.3F, -11F, 3.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 93
		bodyModel[230].setRotationPoint(-68.7F, -11F, 3.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[231].setRotationPoint(-66.7F, -11F, 3.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 95
		bodyModel[232].setRotationPoint(-64.7F, -11F, 3.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 96
		bodyModel[233].setRotationPoint(-62F, -11F, 3.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[234].setRotationPoint(-60F, -11F, 3.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 98
		bodyModel[235].setRotationPoint(-58F, -11F, 3.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 99
		bodyModel[236].setRotationPoint(-55.5F, -11F, 3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[237].setRotationPoint(-53.5F, -11F, 3.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 101
		bodyModel[238].setRotationPoint(-51.5F, -11F, 3.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[239].setRotationPoint(68.5F, -22.2F, 0.7F);
		bodyModel[239].rotateAngleZ = 0.15707963F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[240].setRotationPoint(69.3F, -21.5F, 1.2F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 2
		bodyModel[241].setRotationPoint(4F, -15.1F, 13.2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 3
		bodyModel[242].setRotationPoint(2.5F, -14.8F, 12.2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[243].setRotationPoint(2.5F, -14.1F, 12.2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 5
		bodyModel[244].setRotationPoint(-8F, -15.1F, 13.2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 6
		bodyModel[245].setRotationPoint(-9.5F, -14.8F, 12.2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[246].setRotationPoint(-9.5F, -14.1F, 12.2F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[16];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 55
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 56
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 57
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 58
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 59
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 60
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 61
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 62
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 63
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 64
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 65
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 68
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 69
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 70

		gun_2_Model[0][0].addShapeBox(0F, 0.7F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 54

		gun_2_Model[0][1].addShapeBox(0F, -1.3F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 55

		gun_2_Model[0][2].addShapeBox(0F, -2.3F, 1F, 4, 1, 2, 0F,0F, 0.3F, 0F, -1.7F, 0F, 0F, -2.5F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F); // Box 56

		gun_2_Model[0][3].addShapeBox(-4F, 0.7F, 0F, 4, 2, 3, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F); // Box 57

		gun_2_Model[0][4].addShapeBox(-4F, -1.3F, 0F, 4, 2, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F); // Box 58

		gun_2_Model[0][5].addShapeBox(-4F, -2.3F, 0F, 4, 1, 3, 0F,-1.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -2F, -2.3F, -0.2F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F); // Box 59

		gun_2_Model[0][6].addShapeBox(-4F, -2.3F, -3F, 4, 1, 3, 0F,-2.3F, -0.2F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 60

		gun_2_Model[0][7].addShapeBox(-4F, -1.3F, -3F, 4, 2, 3, 0F,-1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 61

		gun_2_Model[0][8].addShapeBox(-4F, 0.7F, -3F, 4, 2, 3, 0F,-0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 62

		gun_2_Model[0][9].addShapeBox(0F, -2.3F, -3F, 4, 1, 2, 0F,0F, -0.1F, -1.5F, -2.5F, -0.1F, -1.5F, -1.7F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][10].addShapeBox(0F, -1.3F, -3F, 4, 2, 2, 0F,0F, 0F, -0.3F, -1.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 64

		gun_2_Model[0][11].addShapeBox(0F, 0.7F, -3F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 65

		gun_2_Model[0][12].addShapeBox(1F, -1.6F, -1.5F, 2, 1, 3, 0F,1F, 0.7F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.7F, -0.5F, 0F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][13].addShapeBox(1.3F, -0.0999999999999998F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 68

		gun_2_Model[0][14].addShapeBox(-2.5F, -2.8F, -2.7F, 4, 4, 2, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 69

		gun_2_Model[0][15].addShapeBox(-2F, -2.7F, -2.2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 70

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(105F, -15.7F, -1F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 71
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 72
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 73
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 74
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 75
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 76

		gun_2_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 71

		gun_2_Model[1][1].addShapeBox(5.5F, -0.5F, -1.1F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 72

		gun_2_Model[1][2].addShapeBox(-0.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 73

		gun_2_Model[1][3].addShapeBox(5.5F, -0.5F, 0.1F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74

		gun_2_Model[1][4].addShapeBox(-1F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 75

		gun_2_Model[1][5].addShapeBox(-1F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(105F, -15.7F, -1F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("AK130", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[16];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 55
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 56
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 57
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 58
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 59
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 60
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 61
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 62
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 63
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 64
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 65
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 67
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 68
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 69
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 70

		gun_3_Model[0][0].addShapeBox(0F, 0.7F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 54

		gun_3_Model[0][1].addShapeBox(0F, -1.3F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 55

		gun_3_Model[0][2].addShapeBox(0F, -2.3F, 1F, 4, 1, 2, 0F,0F, 0.3F, 0F, -1.7F, 0F, 0F, -2.5F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F); // Box 56

		gun_3_Model[0][3].addShapeBox(-4F, 0.7F, 0F, 4, 2, 3, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F); // Box 57

		gun_3_Model[0][4].addShapeBox(-4F, -1.3F, 0F, 4, 2, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F); // Box 58

		gun_3_Model[0][5].addShapeBox(-4F, -2.3F, 0F, 4, 1, 3, 0F,-1.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -2F, -2.3F, -0.2F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F); // Box 59

		gun_3_Model[0][6].addShapeBox(-4F, -2.3F, -3F, 4, 1, 3, 0F,-2.3F, -0.2F, -2F, 0F, 0.3F, -2F, 0F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 60

		gun_3_Model[0][7].addShapeBox(-4F, -1.3F, -3F, 4, 2, 3, 0F,-1.5F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 61

		gun_3_Model[0][8].addShapeBox(-4F, 0.7F, -3F, 4, 2, 3, 0F,-0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 62

		gun_3_Model[0][9].addShapeBox(0F, -2.3F, -3F, 4, 1, 2, 0F,0F, -0.1F, -1.5F, -2.5F, -0.1F, -1.5F, -1.7F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.3F, -1.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 63

		gun_3_Model[0][10].addShapeBox(0F, -1.3F, -3F, 4, 2, 2, 0F,0F, 0F, -0.3F, -1.5F, 0F, -0.7F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 64

		gun_3_Model[0][11].addShapeBox(0F, 0.7F, -3F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 65

		gun_3_Model[0][12].addShapeBox(1F, -1.6F, -1.5F, 2, 1, 3, 0F,1F, 0.7F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.7F, -0.5F, 0F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 0F); // Box 67

		gun_3_Model[0][13].addShapeBox(1.3F, -0.0999999999999998F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 68

		gun_3_Model[0][14].addShapeBox(-2.5F, -2.8F, -2.7F, 4, 4, 2, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 69

		gun_3_Model[0][15].addShapeBox(-2F, -2.7F, -2.2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 70

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(105F, -15.7F, -1F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 71
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 72
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 73
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 74
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 75
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 76

		gun_3_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 71

		gun_3_Model[1][1].addShapeBox(5.5F, -0.5F, -1.1F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 72

		gun_3_Model[1][2].addShapeBox(-0.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 73

		gun_3_Model[1][3].addShapeBox(5.5F, -0.5F, 0.1F, 8, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74

		gun_3_Model[1][4].addShapeBox(-1F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 75

		gun_3_Model[1][5].addShapeBox(-1F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(105F, -15.7F, -1F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}