//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Suzuya1944
// Model Creator: 
// Created on: 12.02.2020 - 00:59:19
// Last changed on: 12.02.2020 - 00:59:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTakao extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTakao() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[299];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 969
		bodyModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 200, 146, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 4, 136, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 4, 136, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 542
		bodyModel[50] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 543
		bodyModel[51] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 544
		bodyModel[52] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 545
		bodyModel[53] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 987, 49, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 848
		bodyModel[67] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 849
		bodyModel[68] = new ModelRendererTurbo(this, 609, 9, textureX, textureY); // Box 850
		bodyModel[69] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 92
		bodyModel[90] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 93
		bodyModel[91] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 94
		bodyModel[92] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 97
		bodyModel[95] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 98
		bodyModel[96] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 99
		bodyModel[97] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 100
		bodyModel[98] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 101
		bodyModel[99] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 102
		bodyModel[100] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 103
		bodyModel[101] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 104
		bodyModel[102] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 105
		bodyModel[103] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 106
		bodyModel[104] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 107
		bodyModel[105] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 109
		bodyModel[107] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 110
		bodyModel[108] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 111
		bodyModel[109] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 112
		bodyModel[110] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 113
		bodyModel[111] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 115
		bodyModel[113] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 969, 33, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 118
		bodyModel[116] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 134
		bodyModel[128] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 136
		bodyModel[130] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 137
		bodyModel[131] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 138
		bodyModel[132] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 139
		bodyModel[133] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 140
		bodyModel[134] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 141
		bodyModel[135] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 142
		bodyModel[136] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Box 143
		bodyModel[137] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 144
		bodyModel[138] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 145
		bodyModel[139] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 147
		bodyModel[140] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148
		bodyModel[141] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 149
		bodyModel[142] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 150
		bodyModel[143] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 151
		bodyModel[144] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 154
		bodyModel[145] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 155
		bodyModel[146] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 156
		bodyModel[147] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 161
		bodyModel[148] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 162
		bodyModel[149] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 163
		bodyModel[150] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 164
		bodyModel[151] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 165
		bodyModel[152] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 166
		bodyModel[153] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 167
		bodyModel[154] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 168
		bodyModel[155] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 169
		bodyModel[156] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 170
		bodyModel[157] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 171
		bodyModel[158] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 172
		bodyModel[159] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 173
		bodyModel[160] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 174
		bodyModel[161] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 175
		bodyModel[162] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 604
		bodyModel[163] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 605
		bodyModel[164] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 606
		bodyModel[165] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 607
		bodyModel[166] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 608
		bodyModel[167] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 609
		bodyModel[168] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 610
		bodyModel[169] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 611
		bodyModel[170] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 612
		bodyModel[171] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 613
		bodyModel[172] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 604
		bodyModel[173] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 605
		bodyModel[174] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 606
		bodyModel[175] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 607
		bodyModel[176] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 608
		bodyModel[177] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 609
		bodyModel[178] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 610
		bodyModel[179] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 611
		bodyModel[180] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 612
		bodyModel[181] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 613
		bodyModel[182] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 614
		bodyModel[183] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 615
		bodyModel[184] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 616
		bodyModel[185] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 617
		bodyModel[186] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 618
		bodyModel[187] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 619
		bodyModel[188] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 620
		bodyModel[189] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 621
		bodyModel[190] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 622
		bodyModel[191] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 623
		bodyModel[192] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 614
		bodyModel[193] = new ModelRendererTurbo(this, 881, 41, textureX, textureY); // Box 615
		bodyModel[194] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 616
		bodyModel[195] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 617
		bodyModel[196] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 618
		bodyModel[197] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 619
		bodyModel[198] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 620
		bodyModel[199] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 621
		bodyModel[200] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 622
		bodyModel[201] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 623
		bodyModel[202] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 218
		bodyModel[203] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 218
		bodyModel[204] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 218
		bodyModel[205] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 218
		bodyModel[206] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 218
		bodyModel[207] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 218
		bodyModel[208] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 218
		bodyModel[209] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 218
		bodyModel[210] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 218
		bodyModel[211] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 218
		bodyModel[212] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 218
		bodyModel[213] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 218
		bodyModel[214] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 218
		bodyModel[215] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 218
		bodyModel[216] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 44
		bodyModel[217] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 44
		bodyModel[218] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 542
		bodyModel[219] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 543
		bodyModel[220] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 544
		bodyModel[221] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 545
		bodyModel[222] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 623
		bodyModel[223] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 542
		bodyModel[224] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 543
		bodyModel[225] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 544
		bodyModel[226] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 545
		bodyModel[227] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 55
		bodyModel[228] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 56
		bodyModel[229] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 57
		bodyModel[230] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 58
		bodyModel[231] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 604
		bodyModel[232] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 605
		bodyModel[233] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 606
		bodyModel[234] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 607
		bodyModel[235] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 608
		bodyModel[236] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 609
		bodyModel[237] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 610
		bodyModel[238] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 611
		bodyModel[239] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 612
		bodyModel[240] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 613
		bodyModel[241] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 614
		bodyModel[242] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 615
		bodyModel[243] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 616
		bodyModel[244] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 617
		bodyModel[245] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 618
		bodyModel[246] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 619
		bodyModel[247] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 620
		bodyModel[248] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 621
		bodyModel[249] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 622
		bodyModel[250] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 623
		bodyModel[251] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 97
		bodyModel[252] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 310
		bodyModel[253] = new ModelRendererTurbo(this, 922, 49, textureX, textureY); // Box 311
		bodyModel[254] = new ModelRendererTurbo(this, 922, 49, textureX, textureY); // Box 312
		bodyModel[255] = new ModelRendererTurbo(this, 4, 136, textureX, textureY); // Box 313
		bodyModel[256] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 314
		bodyModel[257] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 315
		bodyModel[258] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 316
		bodyModel[259] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 317
		bodyModel[260] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 318
		bodyModel[261] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 319
		bodyModel[262] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 320
		bodyModel[263] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 321
		bodyModel[264] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 322
		bodyModel[265] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 323
		bodyModel[266] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 324
		bodyModel[267] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 325
		bodyModel[268] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 326
		bodyModel[269] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 327
		bodyModel[270] = new ModelRendererTurbo(this, 943, 49, textureX, textureY); // Box 328
		bodyModel[271] = new ModelRendererTurbo(this, 927, 49, textureX, textureY); // Box 329
		bodyModel[272] = new ModelRendererTurbo(this, 987, 49, textureX, textureY); // Box 330
		bodyModel[273] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 331
		bodyModel[274] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 332
		bodyModel[275] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 333
		bodyModel[276] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 334
		bodyModel[277] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 335
		bodyModel[278] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 336
		bodyModel[279] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 337
		bodyModel[280] = new ModelRendererTurbo(this, 922, 49, textureX, textureY); // Box 338
		bodyModel[281] = new ModelRendererTurbo(this, 4, 136, textureX, textureY); // Box 339
		bodyModel[282] = new ModelRendererTurbo(this, 922, 49, textureX, textureY); // Box 340
		bodyModel[283] = new ModelRendererTurbo(this, 943, 49, textureX, textureY); // Box 341
		bodyModel[284] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 342
		bodyModel[285] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 343
		bodyModel[286] = new ModelRendererTurbo(this, 987, 49, textureX, textureY); // Box 344
		bodyModel[287] = new ModelRendererTurbo(this, 987, 49, textureX, textureY); // Box 345
		bodyModel[288] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 346
		bodyModel[289] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 347
		bodyModel[290] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 348
		bodyModel[291] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 349
		bodyModel[292] = new ModelRendererTurbo(this, 1, 146, textureX, textureY); // Box 350
		bodyModel[293] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 351
		bodyModel[294] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 352
		bodyModel[295] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 353
		bodyModel[296] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 354
		bodyModel[297] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 355
		bodyModel[298] = new ModelRendererTurbo(this, 1, 143, textureX, textureY); // Box 356

		bodyModel[0].addShapeBox(0F, 0F, 0F, 90, 7, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-60F, -2F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 46, 7, 34, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(30F, -2F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 46, 7, 34, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 2
		bodyModel[2].setRotationPoint(-106F, -2F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 52, 7, 28, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(76F, -2F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 34, 7, 18, 0F,0F, 0F, 0F, 2F, 4.5F, -6F, 2F, 4.5F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(128F, -2F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 45, 7, 28, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -8F); // Box 5
		bodyModel[5].setRotationPoint(-151F, -2F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 11, 14, 0F,0F, 0F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -6F, -6F, 0F, -6F, 0F, 0F, -3F); // Box 6
		bodyModel[6].setRotationPoint(128F, 5F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 52, 11, 26, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3F); // Box 7
		bodyModel[7].setRotationPoint(76F, 5F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 46, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 8
		bodyModel[8].setRotationPoint(30F, 5F, -16F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 90, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 9
		bodyModel[9].setRotationPoint(-60F, 5F, -16F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 46, 11, 32, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 10
		bodyModel[10].setRotationPoint(-106F, 5F, -16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 90, 5, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-60F, -7F, -17F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 5, 34, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 13
		bodyModel[12].setRotationPoint(-76F, -7F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(30F, -7F, -15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 7, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 15
		bodyModel[14].setRotationPoint(-162F, -2F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(41F, -7F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 17
		bodyModel[16].setRotationPoint(-86F, -7F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		bodyModel[17].setRotationPoint(-17F, -22F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		bodyModel[18].setRotationPoint(-17F, -24F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-12F, -25F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-12F, -22F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-15F, -22F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-15F, -25F, -3F);

		bodyModel[23].addShapeBox(-7.7F, 1.5F, 0F, 23, 20, 1, 0F,-0.4F, -0.4F, -0.4F, -15.4F, -0.4F, -0.4F, -15.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -15.4F, -0.4F, -15.4F, -15.4F, -0.4F, -15.4F, -15.4F, -0.4F, -0.4F, -15.4F, -0.4F); // Box 969
		bodyModel[23].setRotationPoint(-161.5F, -14F, -0.5F);
		bodyModel[23].rotateAngleZ = 0.06981317F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 25
		bodyModel[24].setRotationPoint(-162F, -13F, -0.5F);
		bodyModel[24].rotateAngleZ = 0.05235988F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 26
		bodyModel[25].setRotationPoint(162.25F, -16F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(8F, -24F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(2F, -23F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 8, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[28].setRotationPoint(-3F, -23F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(8F, -27F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 31
		bodyModel[30].setRotationPoint(2F, -27F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 32
		bodyModel[31].setRotationPoint(-3F, -26F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(8F, -21F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		bodyModel[33].setRotationPoint(8F, -18F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0.3F); // Box 35
		bodyModel[34].setRotationPoint(16F, -18F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 6, 6, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 36
		bodyModel[35].setRotationPoint(16F, -15F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 6F, 0F, -1F, 6F, 0F, -1F, 0F, 0F, 0.3F); // Box 37
		bodyModel[36].setRotationPoint(25F, -15F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 4, 6, 0F,0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 38
		bodyModel[37].setRotationPoint(25F, -13F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(9F, -10F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-6F, -13F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 30, 1, 0F); // Box 41
		bodyModel[40].setRotationPoint(-68F, -36F, -0.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 30, 1, 0F); // Box 42
		bodyModel[41].setRotationPoint(-67F, -36F, -0.5F);
		bodyModel[41].rotateAngleX = 0.05235988F;
		bodyModel[41].rotateAngleZ = 0.06981317F;

		bodyModel[42].addBox(0F, 0F, 0F, 1, 30, 1, 0F); // Box 43
		bodyModel[42].setRotationPoint(-67F, -36F, -0.5F);
		bodyModel[42].rotateAngleX = -0.03490659F;
		bodyModel[42].rotateAngleZ = 0.06981317F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 45
		bodyModel[43].setRotationPoint(-100F, -27F, -0.5F);
		bodyModel[43].rotateAngleZ = -0.20943951F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 46
		bodyModel[44].setRotationPoint(-65.5F, -53F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 13, 6, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 47
		bodyModel[45].setRotationPoint(39F, -22F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48
		bodyModel[46].setRotationPoint(38F, -29F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 49
		bodyModel[47].setRotationPoint(38F, -26F, -3F);

		bodyModel[48].addBox(0F, 0F, 0F, 10, 2, 10, 0F); // Box 50
		bodyModel[48].setRotationPoint(28F, -29F, -5F);

		bodyModel[49].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[49].setRotationPoint(-7F, -13.25F, 5.3F);

		bodyModel[50].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 543
		bodyModel[50].setRotationPoint(-10F, -13.25F, 5.3F);

		bodyModel[51].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 544
		bodyModel[51].setRotationPoint(-10F, -13.25F, 2.3F);

		bodyModel[52].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[52].setRotationPoint(-7F, -13.25F, 2.3F);

		bodyModel[53].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 55
		bodyModel[53].setRotationPoint(-10F, -13.25F, -5.3F);

		bodyModel[54].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 56
		bodyModel[54].setRotationPoint(-7F, -13.25F, -5.3F);

		bodyModel[55].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-10F, -13.25F, -8.3F);

		bodyModel[56].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[56].setRotationPoint(-7F, -13.25F, -8.3F);

		bodyModel[57].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 59
		bodyModel[57].setRotationPoint(4F, -13.25F, -6.3F);

		bodyModel[58].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 60
		bodyModel[58].setRotationPoint(7F, -13.25F, -6.3F);

		bodyModel[59].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(7F, -13.25F, -9.3F);

		bodyModel[60].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 62
		bodyModel[60].setRotationPoint(4F, -13.25F, -9.3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 63
		bodyModel[61].setRotationPoint(22.5F, -40F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 64
		bodyModel[62].setRotationPoint(26F, -22F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 65
		bodyModel[63].setRotationPoint(27F, -27F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 7, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[64].setRotationPoint(34F, -10F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 3, 20, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 68
		bodyModel[65].setRotationPoint(25F, -10F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.7F, -0.7F, -1F, -0.7F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 848
		bodyModel[66].setRotationPoint(-23.3F, -12F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F); // Box 849
		bodyModel[67].setRotationPoint(-20.75F, -11F, 12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F); // Box 850
		bodyModel[68].setRotationPoint(-21.75F, -11F, 12F);

		bodyModel[69].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 72
		bodyModel[69].setRotationPoint(-21F, -8F, 11.5F);

		bodyModel[70].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 73
		bodyModel[70].setRotationPoint(-25F, -8F, 11.5F);

		bodyModel[71].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 74
		bodyModel[71].setRotationPoint(-25F, -8F, 7.5F);

		bodyModel[72].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[72].setRotationPoint(-21F, -8F, 7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F); // Box 76
		bodyModel[73].setRotationPoint(14.25F, -11F, 12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F); // Box 77
		bodyModel[74].setRotationPoint(13.25F, -11F, 12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.7F, -0.7F, -1F, -0.7F, -0.7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 78
		bodyModel[75].setRotationPoint(11.7F, -12F, 10F);

		bodyModel[76].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 79
		bodyModel[76].setRotationPoint(10F, -8F, 11.5F);

		bodyModel[77].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
		bodyModel[77].setRotationPoint(10F, -8F, 7.5F);

		bodyModel[78].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[78].setRotationPoint(14F, -8F, 11.5F);

		bodyModel[79].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[79].setRotationPoint(14F, -8F, 7.5F);

		bodyModel[80].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 83
		bodyModel[80].setRotationPoint(-25F, -8F, -11.5F);

		bodyModel[81].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 84
		bodyModel[81].setRotationPoint(-25F, -8F, -15.5F);

		bodyModel[82].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[82].setRotationPoint(-21F, -8F, -15.5F);

		bodyModel[83].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 86
		bodyModel[83].setRotationPoint(-21F, -8F, -11.5F);

		bodyModel[84].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 87
		bodyModel[84].setRotationPoint(10F, -8F, -15.5F);

		bodyModel[85].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 88
		bodyModel[85].setRotationPoint(14F, -8F, -15.5F);

		bodyModel[86].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 89
		bodyModel[86].setRotationPoint(14F, -8F, -11.5F);

		bodyModel[87].addShapeBox(0.25F, 0F, 0F, 4, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 90
		bodyModel[87].setRotationPoint(10F, -8F, -11.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 91
		bodyModel[88].setRotationPoint(14.25F, -11F, -16F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 92
		bodyModel[89].setRotationPoint(13.25F, -11F, -16F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-0.7F, -0.7F, -1F, -0.7F, -0.7F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[90].setRotationPoint(11.7F, -12F, -13F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,-0.7F, -0.7F, -1F, -0.7F, -0.7F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[91].setRotationPoint(-23.3F, -12F, -13F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 95
		bodyModel[92].setRotationPoint(-20.75F, -11F, -16F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 96
		bodyModel[93].setRotationPoint(-21.75F, -11F, -16F);

		bodyModel[94].addBox(0F, 0F, 0F, 6, 2, 6, 0F); // Box 97
		bodyModel[94].setRotationPoint(28F, -33F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 4, 26, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -6F); // Box 98
		bodyModel[95].setRotationPoint(-125F, 5F, -13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 26, 3, 18, 0F,0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -6F); // Box 99
		bodyModel[96].setRotationPoint(-151F, 5F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 100
		bodyModel[97].setRotationPoint(-162F, 6F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 101
		bodyModel[98].setRotationPoint(-149F, 9F, -0.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 102
		bodyModel[99].setRotationPoint(28.5F, -34F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[100].setRotationPoint(28F, -36F, -2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 104
		bodyModel[101].setRotationPoint(-91F, -25F, -0.5F);
		bodyModel[101].rotateAngleZ = 0.40142573F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 105
		bodyModel[102].setRotationPoint(23.5F, -34F, -0.5F);
		bodyModel[102].rotateAngleX = 0.06981317F;
		bodyModel[102].rotateAngleZ = -0.08726646F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 106
		bodyModel[103].setRotationPoint(24.5F, -34F, -0.5F);
		bodyModel[103].rotateAngleZ = 0.08726646F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 107
		bodyModel[104].setRotationPoint(23.5F, -34F, -0.5F);
		bodyModel[104].rotateAngleX = -0.06981317F;
		bodyModel[104].rotateAngleZ = -0.08726646F;

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 108
		bodyModel[105].setRotationPoint(23.5F, -34F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[106].setRotationPoint(23.5F, -35F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 110
		bodyModel[107].setRotationPoint(24F, -34F, 0F);
		bodyModel[107].rotateAngleX = 0.26179939F;

		bodyModel[108].addShapeBox(0F, 0F, -12F, 1, 1, 12, 0F,-0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F); // Box 111
		bodyModel[108].setRotationPoint(24F, -34F, 0F);
		bodyModel[108].rotateAngleX = -0.26179939F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[109].setRotationPoint(-68.5F, -32F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 113
		bodyModel[110].setRotationPoint(-65.5F, -46F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 114
		bodyModel[111].setRotationPoint(-65.5F, -36.5F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F); // Box 115
		bodyModel[112].setRotationPoint(-65.5F, -36.5F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 116
		bodyModel[113].setRotationPoint(-65.5F, -36.9F, 0F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 117
		bodyModel[114].setRotationPoint(-68.5F, -37F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[115].setRotationPoint(-68.5F, -36F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 19, 7, 18, 0F,0F, 0F, -2F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F); // Box 123
		bodyModel[116].setRotationPoint(-125F, 9F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124
		bodyModel[117].setRotationPoint(-121F, 12F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 125
		bodyModel[118].setRotationPoint(-120F, 13F, 9F);
		bodyModel[118].rotateAngleX = 1.04719755F;
		bodyModel[118].rotateAngleZ = 0.01745329F;

		bodyModel[119].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		bodyModel[119].setRotationPoint(-120F, 13F, 9F);
		bodyModel[119].rotateAngleX = -1.04719755F;
		bodyModel[119].rotateAngleZ = 0.01745329F;

		bodyModel[120].addShapeBox(0F, -3F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 127
		bodyModel[120].setRotationPoint(-120F, 13F, 9F);

		bodyModel[121].addShapeBox(0F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[121].setRotationPoint(-118F, 10F, 8.5F);

		bodyModel[122].addShapeBox(0F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 129
		bodyModel[122].setRotationPoint(-138F, 10F, 3.5F);

		bodyModel[123].addShapeBox(0F, -3F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
		bodyModel[123].setRotationPoint(-140F, 13F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 131
		bodyModel[124].setRotationPoint(-141F, 12F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 132
		bodyModel[125].setRotationPoint(-140F, 13F, 4F);
		bodyModel[125].rotateAngleX = 1.04719755F;
		bodyModel[125].rotateAngleZ = 0.01745329F;

		bodyModel[126].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 133
		bodyModel[126].setRotationPoint(-140F, 13F, 4F);
		bodyModel[126].rotateAngleX = -1.04719755F;
		bodyModel[126].rotateAngleZ = 0.01745329F;

		bodyModel[127].addShapeBox(0F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 134
		bodyModel[127].setRotationPoint(-138F, 10F, -4.5F);

		bodyModel[128].addShapeBox(0F, -3F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[128].setRotationPoint(-140F, 13F, -4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 136
		bodyModel[129].setRotationPoint(-141F, 12F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 137
		bodyModel[130].setRotationPoint(-140F, 13F, -4F);
		bodyModel[130].rotateAngleX = 1.04719755F;
		bodyModel[130].rotateAngleZ = 0.01745329F;

		bodyModel[131].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
		bodyModel[131].setRotationPoint(-140F, 13F, -4F);
		bodyModel[131].rotateAngleX = -1.04719755F;
		bodyModel[131].rotateAngleZ = 0.01745329F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 139
		bodyModel[132].setRotationPoint(-121F, 12F, -10F);

		bodyModel[133].addShapeBox(0F, -3F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 140
		bodyModel[133].setRotationPoint(-118F, 10F, -9.5F);

		bodyModel[134].addShapeBox(0F, -3F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 141
		bodyModel[134].setRotationPoint(-120F, 13F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 142
		bodyModel[135].setRotationPoint(-120F, 13F, -9F);
		bodyModel[135].rotateAngleX = -1.04719755F;
		bodyModel[135].rotateAngleZ = 0.01745329F;

		bodyModel[136].addShapeBox(0F, 0F, -1F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 143
		bodyModel[136].setRotationPoint(-120F, 13F, -9F);
		bodyModel[136].rotateAngleX = 1.04719755F;
		bodyModel[136].rotateAngleZ = 0.01745329F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 24, 1, 6, 0F,0F, 0F, 0.5F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 3F, 2.5F, 0F, 3F, 2.5F, 0F, 0F, -2F); // Box 144
		bodyModel[137].setRotationPoint(-149F, 8F, -3F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 145
		bodyModel[138].setRotationPoint(-27.5F, -18F, -1F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 147
		bodyModel[139].setRotationPoint(-28.5F, -15F, -2F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 148
		bodyModel[140].setRotationPoint(-27F, -16F, -0.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 149
		bodyModel[141].setRotationPoint(-27.5F, -14F, -1F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 150
		bodyModel[142].setRotationPoint(33.5F, -18F, -2F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 151
		bodyModel[143].setRotationPoint(33.5F, -14F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 154
		bodyModel[144].setRotationPoint(-100F, -27F, -0.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 155
		bodyModel[145].setRotationPoint(23.5F, -27F, -1F);

		bodyModel[146].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 156
		bodyModel[146].setRotationPoint(26F, -15F, 9F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 161
		bodyModel[147].setRotationPoint(26F, -15F, -11F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 162
		bodyModel[148].setRotationPoint(17F, -18F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 163
		bodyModel[149].setRotationPoint(17.5F, -16F, -8.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 164
		bodyModel[150].setRotationPoint(16F, -15F, -10F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 165
		bodyModel[151].setRotationPoint(17F, -14F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 166
		bodyModel[152].setRotationPoint(17F, -18F, 7F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 167
		bodyModel[153].setRotationPoint(17.5F, -16F, 7.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 168
		bodyModel[154].setRotationPoint(16F, -15F, 6F);

		bodyModel[155].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 169
		bodyModel[155].setRotationPoint(17F, -14F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 90, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 170
		bodyModel[156].setRotationPoint(-65F, -46F, 5F);
		bodyModel[156].rotateAngleY = 0.05235988F;
		bodyModel[156].rotateAngleZ = -0.09948377F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 90, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 171
		bodyModel[157].setRotationPoint(-65F, -46F, -6F);
		bodyModel[157].rotateAngleY = -0.05235988F;
		bodyModel[157].rotateAngleZ = -0.09948377F;

		bodyModel[158].addShapeBox(0F, 0F, -0.5F, 102, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 172
		bodyModel[158].setRotationPoint(-161.5F, -13F, 0F);
		bodyModel[158].rotateAngleY = 0.05585054F;
		bodyModel[158].rotateAngleZ = 0.33073989F;

		bodyModel[159].addShapeBox(0F, 0F, -0.5F, 102, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 173
		bodyModel[159].setRotationPoint(-161.5F, -13F, 0F);
		bodyModel[159].rotateAngleY = -0.05585054F;
		bodyModel[159].rotateAngleZ = 0.33073989F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 146, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 174
		bodyModel[160].setRotationPoint(19F, -37F, -11F);
		bodyModel[160].rotateAngleY = 0.07330383F;
		bodyModel[160].rotateAngleZ = -0.15707963F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 140, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 175
		bodyModel[161].setRotationPoint(25F, -37F, 10F);
		bodyModel[161].rotateAngleY = -0.07504916F;
		bodyModel[161].rotateAngleZ = -0.15707963F;

		bodyModel[162].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 604
		bodyModel[162].setRotationPoint(-7F, -14.75F, 3.6F);

		bodyModel[163].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 605
		bodyModel[163].setRotationPoint(-7F, -15.15F, 3.7F);

		bodyModel[164].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 606
		bodyModel[164].setRotationPoint(-7.5F, -15.15F, 3.7F);

		bodyModel[165].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 607
		bodyModel[165].setRotationPoint(-7.5F, -14.75F, 3.6F);

		bodyModel[166].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 608
		bodyModel[166].setRotationPoint(-8F, -14.75F, 3.6F);

		bodyModel[167].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 609
		bodyModel[167].setRotationPoint(-8F, -15.15F, 3.7F);

		bodyModel[168].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 610
		bodyModel[168].setRotationPoint(-8F, -14.75F, 4.6F);

		bodyModel[169].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 611
		bodyModel[169].setRotationPoint(-7.5F, -14.75F, 4.6F);

		bodyModel[170].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 612
		bodyModel[170].setRotationPoint(-7F, -14.75F, 4.6F);

		bodyModel[171].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 613
		bodyModel[171].setRotationPoint(-7.5F, -13.95F, 4.6F);

		bodyModel[172].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 604
		bodyModel[172].setRotationPoint(7F, -14.5F, 4F);

		bodyModel[173].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 605
		bodyModel[173].setRotationPoint(7F, -14.9F, 4.1F);

		bodyModel[174].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 606
		bodyModel[174].setRotationPoint(6.5F, -14.9F, 4.1F);

		bodyModel[175].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 607
		bodyModel[175].setRotationPoint(6.5F, -14.5F, 4F);

		bodyModel[176].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 608
		bodyModel[176].setRotationPoint(6F, -14.5F, 4F);

		bodyModel[177].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 609
		bodyModel[177].setRotationPoint(6F, -14.9F, 4.1F);

		bodyModel[178].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 610
		bodyModel[178].setRotationPoint(6F, -14.5F, 5F);

		bodyModel[179].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 611
		bodyModel[179].setRotationPoint(6.5F, -14.5F, 5F);

		bodyModel[180].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 612
		bodyModel[180].setRotationPoint(7F, -14.5F, 5F);

		bodyModel[181].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 613
		bodyModel[181].setRotationPoint(6.5F, -13.7F, 5F);

		bodyModel[182].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 614
		bodyModel[182].setRotationPoint(-7F, -14.75F, -6F);

		bodyModel[183].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 615
		bodyModel[183].setRotationPoint(-7F, -15.15F, -5.1F);

		bodyModel[184].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 616
		bodyModel[184].setRotationPoint(-7.5F, -15.15F, -5.1F);

		bodyModel[185].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 617
		bodyModel[185].setRotationPoint(-7.5F, -14.75F, -6F);

		bodyModel[186].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 618
		bodyModel[186].setRotationPoint(-8F, -14.75F, -6F);

		bodyModel[187].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 619
		bodyModel[187].setRotationPoint(-8F, -15.15F, -5.1F);

		bodyModel[188].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 620
		bodyModel[188].setRotationPoint(-8F, -14.75F, -8F);

		bodyModel[189].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 621
		bodyModel[189].setRotationPoint(-7.5F, -14.75F, -8F);

		bodyModel[190].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 622
		bodyModel[190].setRotationPoint(-7F, -14.75F, -8F);

		bodyModel[191].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 623
		bodyModel[191].setRotationPoint(-7.5F, -13.95F, -6F);

		bodyModel[192].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 614
		bodyModel[192].setRotationPoint(7F, -14.75F, -7F);

		bodyModel[193].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 615
		bodyModel[193].setRotationPoint(7F, -15.15F, -6.1F);

		bodyModel[194].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 616
		bodyModel[194].setRotationPoint(6.5F, -15.15F, -6.1F);

		bodyModel[195].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 617
		bodyModel[195].setRotationPoint(6.5F, -14.75F, -7F);

		bodyModel[196].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 618
		bodyModel[196].setRotationPoint(6F, -14.75F, -7F);

		bodyModel[197].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 619
		bodyModel[197].setRotationPoint(6F, -15.15F, -6.1F);

		bodyModel[198].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 620
		bodyModel[198].setRotationPoint(6F, -14.75F, -9F);

		bodyModel[199].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 621
		bodyModel[199].setRotationPoint(6.5F, -14.75F, -9F);

		bodyModel[200].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 622
		bodyModel[200].setRotationPoint(7F, -14.75F, -9F);

		bodyModel[201].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 623
		bodyModel[201].setRotationPoint(6.5F, -13.95F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[202].setRotationPoint(42.15F, -27F, 2.5F);

		bodyModel[203].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[203].setRotationPoint(42.15F, -27F, 1.5F);

		bodyModel[204].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[204].setRotationPoint(42.15F, -27F, 0.5F);

		bodyModel[205].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[205].setRotationPoint(42.15F, -27F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[206].setRotationPoint(42.15F, -27F, -1.5F);

		bodyModel[207].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[207].setRotationPoint(42.15F, -27F, -2.5F);

		bodyModel[208].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[208].setRotationPoint(41.3F, -27F, -3.3F);

		bodyModel[209].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[209].setRotationPoint(40.3F, -27F, -3.6F);

		bodyModel[210].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[210].setRotationPoint(39.3F, -27F, -4F);

		bodyModel[211].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[211].setRotationPoint(38.3F, -27F, -4.4F);

		bodyModel[212].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[212].setRotationPoint(41.3F, -27F, 3.2F);

		bodyModel[213].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[213].setRotationPoint(40.3F, -27F, 3.55F);

		bodyModel[214].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[214].setRotationPoint(39.3F, -27F, 3.95F);

		bodyModel[215].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 218
		bodyModel[215].setRotationPoint(38.3F, -27F, 4.4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[216].setRotationPoint(-53F, -9F, 16F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[217].setRotationPoint(-53F, -9F, -18F);

		bodyModel[218].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[218].setRotationPoint(7F, -13.25F, 5.3F);

		bodyModel[219].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 543
		bodyModel[219].setRotationPoint(4F, -13.25F, 5.3F);

		bodyModel[220].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 544
		bodyModel[220].setRotationPoint(4F, -13.25F, 2.3F);

		bodyModel[221].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[221].setRotationPoint(7F, -13.25F, 2.3F);

		bodyModel[222].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 623
		bodyModel[222].setRotationPoint(-30.5F, -12.95F, -5.5F);

		bodyModel[223].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 542
		bodyModel[223].setRotationPoint(-133F, -2.5F, 5.3F);

		bodyModel[224].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 543
		bodyModel[224].setRotationPoint(-136F, -2.5F, 5.3F);

		bodyModel[225].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 544
		bodyModel[225].setRotationPoint(-136F, -2.5F, 2.3F);

		bodyModel[226].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[226].setRotationPoint(-133F, -2.5F, 2.3F);

		bodyModel[227].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 55
		bodyModel[227].setRotationPoint(-136F, -2.5F, -5.3F);

		bodyModel[228].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 56
		bodyModel[228].setRotationPoint(-133F, -2.5F, -5.3F);

		bodyModel[229].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 57
		bodyModel[229].setRotationPoint(-136F, -2.5F, -8.3F);

		bodyModel[230].addShapeBox(0.25F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[230].setRotationPoint(-133F, -2.5F, -8.3F);

		bodyModel[231].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 604
		bodyModel[231].setRotationPoint(-133F, -4F, 3.6F);

		bodyModel[232].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 605
		bodyModel[232].setRotationPoint(-133F, -4.4F, 3.7F);

		bodyModel[233].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 606
		bodyModel[233].setRotationPoint(-133.5F, -4.4F, 3.7F);

		bodyModel[234].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 607
		bodyModel[234].setRotationPoint(-133.5F, -4F, 3.6F);

		bodyModel[235].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 608
		bodyModel[235].setRotationPoint(-134F, -4F, 3.6F);

		bodyModel[236].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 609
		bodyModel[236].setRotationPoint(-134F, -4.4F, 3.7F);

		bodyModel[237].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 610
		bodyModel[237].setRotationPoint(-134F, -4F, 4.6F);

		bodyModel[238].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 611
		bodyModel[238].setRotationPoint(-133.5F, -4F, 4.6F);

		bodyModel[239].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 612
		bodyModel[239].setRotationPoint(-133F, -4F, 4.6F);

		bodyModel[240].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 613
		bodyModel[240].setRotationPoint(-133.5F, -3.2F, 4.6F);

		bodyModel[241].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 614
		bodyModel[241].setRotationPoint(-133F, -4F, -6F);

		bodyModel[242].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 615
		bodyModel[242].setRotationPoint(-133F, -4.4F, -5.1F);

		bodyModel[243].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 616
		bodyModel[243].setRotationPoint(-133.5F, -4.4F, -5.1F);

		bodyModel[244].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 617
		bodyModel[244].setRotationPoint(-133.5F, -4F, -6F);

		bodyModel[245].addShapeBox(0.25F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 618
		bodyModel[245].setRotationPoint(-134F, -4F, -6F);

		bodyModel[246].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F); // Box 619
		bodyModel[246].setRotationPoint(-134F, -4.4F, -5.1F);

		bodyModel[247].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 620
		bodyModel[247].setRotationPoint(-134F, -4F, -8F);

		bodyModel[248].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 621
		bodyModel[248].setRotationPoint(-133.5F, -4F, -8F);

		bodyModel[249].addShapeBox(0.25F, 0F, 0F, 1, 1, 3, 0F,-0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F, -0.458F, -0.458F, -0.4F); // Box 622
		bodyModel[249].setRotationPoint(-133F, -4F, -8F);

		bodyModel[250].addShapeBox(0.25F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 623
		bodyModel[250].setRotationPoint(-133.5F, -3.2F, -6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,-2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, -1F, 4F, -2F, -1F, 4F, -2F, -1F, 4F, -2F, -1F, 4F); // Box 97
		bodyModel[251].setRotationPoint(28F, -34.5F, -2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,3F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 2F, 0F, 0F, 8F, 1F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 8F); // Box 310
		bodyModel[252].setRotationPoint(42F, -19F, -3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 8, 6, 22, 0F,0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 2F); // Box 311
		bodyModel[253].setRotationPoint(42F, -15F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 9, 7, 22, 0F,0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 2F); // Box 312
		bodyModel[254].setRotationPoint(42F, -9F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 313
		bodyModel[255].setRotationPoint(38F, -24F, -3F);

		bodyModel[256].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 314
		bodyModel[256].setRotationPoint(40.3F, -25F, 4.4F);

		bodyModel[257].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 315
		bodyModel[257].setRotationPoint(41.3F, -25F, 3.95F);

		bodyModel[258].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 316
		bodyModel[258].setRotationPoint(42.3F, -25F, 3.55F);

		bodyModel[259].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 317
		bodyModel[259].setRotationPoint(43.3F, -25F, 3.2F);

		bodyModel[260].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 318
		bodyModel[260].setRotationPoint(44.15F, -25F, 2.5F);

		bodyModel[261].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 319
		bodyModel[261].setRotationPoint(44.15F, -25F, 1.5F);

		bodyModel[262].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 320
		bodyModel[262].setRotationPoint(44.15F, -25F, 0.5F);

		bodyModel[263].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 321
		bodyModel[263].setRotationPoint(44.15F, -25F, -0.5F);

		bodyModel[264].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 322
		bodyModel[264].setRotationPoint(44.15F, -25F, -1.5F);

		bodyModel[265].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 323
		bodyModel[265].setRotationPoint(44.15F, -25F, -2.5F);

		bodyModel[266].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 324
		bodyModel[266].setRotationPoint(43.3F, -25F, -3.3F);

		bodyModel[267].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 325
		bodyModel[267].setRotationPoint(42.3F, -25F, -3.6F);

		bodyModel[268].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 326
		bodyModel[268].setRotationPoint(41.3F, -25F, -4F);

		bodyModel[269].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 327
		bodyModel[269].setRotationPoint(40.3F, -25F, -4.4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 13, 4, 6, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 8F, 2.9F, 0F, 8F, 2.9F, 0F, 8F, 0F, 0F, 8F); // Box 328
		bodyModel[270].setRotationPoint(26F, -19F, -3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 16, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, 1F, 0F, 2F); // Box 329
		bodyModel[271].setRotationPoint(26F, -15F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[272].setRotationPoint(43.8F, -22F, -6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 331
		bodyModel[273].setRotationPoint(33F, -31F, -2F);

		bodyModel[274].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 332
		bodyModel[274].setRotationPoint(37.15F, -30F, 2.5F);

		bodyModel[275].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 333
		bodyModel[275].setRotationPoint(39.15F, -30F, 1.5F);

		bodyModel[276].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 334
		bodyModel[276].setRotationPoint(39.15F, -30F, 0.5F);

		bodyModel[277].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 335
		bodyModel[277].setRotationPoint(39.15F, -30F, -0.5F);

		bodyModel[278].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 336
		bodyModel[278].setRotationPoint(39.15F, -30F, -1.5F);

		bodyModel[279].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 337
		bodyModel[279].setRotationPoint(37.15F, -30F, -2.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 16, 7, 22, 0F,1F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, -2F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 338
		bodyModel[280].setRotationPoint(26F, -9F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 16, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, 1F, 0F, 2F); // Box 339
		bodyModel[281].setRotationPoint(20F, -13F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 16, 7, 16, 0F,1F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, -2F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 340
		bodyModel[282].setRotationPoint(20F, -7F, -8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 13, 4, 0, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 8F, 2.9F, 0F, 8F, 2.9F, 0F, 8F, 0F, 0F, 8F); // Box 341
		bodyModel[283].setRotationPoint(20F, -17F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 342
		bodyModel[284].setRotationPoint(35.15F, -30F, -3F);

		bodyModel[285].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 343
		bodyModel[285].setRotationPoint(35.15F, -30F, 3F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[286].setRotationPoint(30.5F, -22F, -6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[287].setRotationPoint(33.5F, -26F, -6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 346
		bodyModel[288].setRotationPoint(41.5F, -16F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 5, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[289].setRotationPoint(30.5F, -19F, -12F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 6, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[290].setRotationPoint(25.5F, -16F, -13F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 6, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[291].setRotationPoint(25.5F, -16F, -13F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[292].setRotationPoint(30.5F, -26F, -9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 22, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[293].setRotationPoint(-25F, -9F, -5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 22, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[294].setRotationPoint(-25F, -9F, -5F);

		bodyModel[295].addShapeBox(0.25F, 0F, 0F, 6, 5, 6, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 353
		bodyModel[295].setRotationPoint(81F, -7F, -6F);

		bodyModel[296].addShapeBox(0.25F, 0F, 0F, 6, 5, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 354
		bodyModel[296].setRotationPoint(87F, -7F, 0F);

		bodyModel[297].addShapeBox(0.25F, 0F, 0F, 6, 5, 6, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 355
		bodyModel[297].setRotationPoint(87F, -7F, -6F);

		bodyModel[298].addShapeBox(0.25F, 0F, 0F, 6, 5, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 356
		bodyModel[298].setRotationPoint(81F, -7F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[15];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 581, 971, textureX, textureY); // Import 
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 301, 971, textureX, textureY); // Import 
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 201, 971, textureX, textureY); // Import 
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 1, 971, textureX, textureY); // Import 
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 421, 971, textureX, textureY); // Import 
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 501, 971, textureX, textureY); // Import 
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 

		gun_1_Model[0][0].addShapeBox(0.25F, 2.5F, -6.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_1_Model[0][1].addShapeBox(-6.25F, 2.5F, -6.25F, 6, 2, 6, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_1_Model[0][2].addShapeBox(-6.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_1_Model[0][3].addShapeBox(0.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F); // Import 

		gun_1_Model[0][4].addShapeBox(0.25F, 1F, -5.25F, 5, 2, 5, 0F,0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_1_Model[0][5].addShapeBox(-5.25F, 1F, -5.25F, 5, 2, 5, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import 

		gun_1_Model[0][6].addShapeBox(0.25F, 1F, 0F, 5, 2, 5, 0F,0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F); // Import 

		gun_1_Model[0][7].addShapeBox(-5.25F, 1F, 0F, 5, 2, 5, 0F,-0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_1_Model[0][8].addShapeBox(-7.75F, -2F, -5F, 8, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[0][9].addShapeBox(0.25F, -2F, -5F, 3, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[0][10].addShapeBox(3.25F, -2F, -5F, 2, 4, 10, 0F,0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[0][11].addShapeBox(-6.75F, -4F, -5F, 5, 2, 10, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[0][12].addShapeBox(-6.75F, -4F, -7.5F, 5, 2, 15, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[0][13].addShapeBox(-5.25F, -4F, -7.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		gun_1_Model[0][14].addShapeBox(-5.25F, -4F, 5.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(70F, -6F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[2];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 

		gun_1_Model[1][0].addShapeBox(2F, -0.6F, 1.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		gun_1_Model[1][1].addShapeBox(2F, -0.6F, -2.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(70F, -6F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[15];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 581, 971, textureX, textureY); // Import 
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 301, 971, textureX, textureY); // Import 
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 201, 971, textureX, textureY); // Import 
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 1, 971, textureX, textureY); // Import 
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 421, 971, textureX, textureY); // Import 
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 501, 971, textureX, textureY); // Import 
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 

		gun_2_Model[0][0].addShapeBox(0.25F, 2.5F, -6.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_2_Model[0][1].addShapeBox(-6.25F, 2.5F, -6.25F, 6, 2, 6, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_2_Model[0][2].addShapeBox(-6.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_2_Model[0][3].addShapeBox(0.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F); // Import 

		gun_2_Model[0][4].addShapeBox(0.25F, 1F, -5.25F, 5, 2, 5, 0F,0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_2_Model[0][5].addShapeBox(-5.25F, 1F, -5.25F, 5, 2, 5, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import 

		gun_2_Model[0][6].addShapeBox(0.25F, 1F, 0F, 5, 2, 5, 0F,0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F); // Import 

		gun_2_Model[0][7].addShapeBox(-5.25F, 1F, 0F, 5, 2, 5, 0F,-0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_2_Model[0][8].addShapeBox(-7.75F, -2F, -5F, 8, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[0][9].addShapeBox(0.25F, -2F, -5F, 3, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[0][10].addShapeBox(3.25F, -2F, -5F, 2, 4, 10, 0F,0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[0][11].addShapeBox(-6.75F, -4F, -5F, 5, 2, 10, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[0][12].addShapeBox(-6.75F, -4F, -7.5F, 5, 2, 15, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[0][13].addShapeBox(-5.25F, -4F, -7.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		gun_2_Model[0][14].addShapeBox(-5.25F, -4F, 5.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(87F, -11F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 

		gun_2_Model[1][0].addShapeBox(2F, -0.6F, 1.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		gun_2_Model[1][1].addShapeBox(2F, -0.6F, -2.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(87F, -11F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[15];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 581, 971, textureX, textureY); // Import 
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 301, 971, textureX, textureY); // Import 
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 201, 971, textureX, textureY); // Import 
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 1, 971, textureX, textureY); // Import 
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 421, 971, textureX, textureY); // Import 
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 501, 971, textureX, textureY); // Import 
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 

		gun_3_Model[0][0].addShapeBox(0.25F, 2.5F, -6.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_3_Model[0][1].addShapeBox(-6.25F, 2.5F, -6.25F, 6, 2, 6, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_3_Model[0][2].addShapeBox(-6.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_3_Model[0][3].addShapeBox(0.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F); // Import 

		gun_3_Model[0][4].addShapeBox(0.25F, 1F, -5.25F, 5, 2, 5, 0F,0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_3_Model[0][5].addShapeBox(-5.25F, 1F, -5.25F, 5, 2, 5, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import 

		gun_3_Model[0][6].addShapeBox(0.25F, 1F, 0F, 5, 2, 5, 0F,0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F); // Import 

		gun_3_Model[0][7].addShapeBox(-5.25F, 1F, 0F, 5, 2, 5, 0F,-0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_3_Model[0][8].addShapeBox(-7.75F, -2F, -5F, 8, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[0][9].addShapeBox(0.25F, -2F, -5F, 3, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[0][10].addShapeBox(3.25F, -2F, -5F, 2, 4, 10, 0F,0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[0][11].addShapeBox(-6.75F, -4F, -5F, 5, 2, 10, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[0][12].addShapeBox(-6.75F, -4F, -7.5F, 5, 2, 15, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[0][13].addShapeBox(-5.25F, -4F, -7.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		gun_3_Model[0][14].addShapeBox(-5.25F, -4F, 5.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(104F, -6F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 

		gun_3_Model[1][0].addShapeBox(2F, -0.6F, 1.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		gun_3_Model[1][1].addShapeBox(2F, -0.6F, -2.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(104F, -6F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[15];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 581, 971, textureX, textureY); // Import 
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 301, 971, textureX, textureY); // Import 
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 201, 971, textureX, textureY); // Import 
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 1, 971, textureX, textureY); // Import 
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 421, 971, textureX, textureY); // Import 
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 501, 971, textureX, textureY); // Import 
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 

		gun_4_Model[0][0].addShapeBox(0.25F, 2.5F, -6.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_4_Model[0][1].addShapeBox(-6.25F, 2.5F, -6.25F, 6, 2, 6, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_4_Model[0][2].addShapeBox(-6.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_4_Model[0][3].addShapeBox(0.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F); // Import 

		gun_4_Model[0][4].addShapeBox(0.25F, 1F, -5.25F, 5, 2, 5, 0F,0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_4_Model[0][5].addShapeBox(-5.25F, 1F, -5.25F, 5, 2, 5, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import 

		gun_4_Model[0][6].addShapeBox(0.25F, 1F, 0F, 5, 2, 5, 0F,0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F); // Import 

		gun_4_Model[0][7].addShapeBox(-5.25F, 1F, 0F, 5, 2, 5, 0F,-0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_4_Model[0][8].addShapeBox(-7.75F, -2F, -5F, 8, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[0][9].addShapeBox(0.25F, -2F, -5F, 3, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[0][10].addShapeBox(3.25F, -2F, -5F, 2, 4, 10, 0F,0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[0][11].addShapeBox(-6.75F, -4F, -5F, 5, 2, 10, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[0][12].addShapeBox(-6.75F, -4F, -7.5F, 5, 2, 15, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[0][13].addShapeBox(-5.25F, -4F, -7.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		gun_4_Model[0][14].addShapeBox(-5.25F, -4F, 5.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-79F, -11F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 

		gun_4_Model[1][0].addShapeBox(2F, -0.6F, 1.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		gun_4_Model[1][1].addShapeBox(2F, -0.6F, -2.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-79F, -11F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[15];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 691, 971, textureX, textureY); // Import 
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 581, 971, textureX, textureY); // Import 
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 582, 971, textureX, textureY); // Import 
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 301, 971, textureX, textureY); // Import 
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 201, 971, textureX, textureY); // Import 
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 1, 971, textureX, textureY); // Import 
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 421, 971, textureX, textureY); // Import 
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 501, 971, textureX, textureY); // Import 
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 351, 971, textureX, textureY); // Import 

		gun_5_Model[0][0].addShapeBox(0.25F, 2.5F, -6.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_5_Model[0][1].addShapeBox(-6.25F, 2.5F, -6.25F, 6, 2, 6, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_5_Model[0][2].addShapeBox(-6.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_5_Model[0][3].addShapeBox(0.25F, 2.5F, 0.25F, 6, 2, 6, 0F,0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, 0.25F); // Import 

		gun_5_Model[0][4].addShapeBox(0.25F, 1F, -5.25F, 5, 2, 5, 0F,0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 

		gun_5_Model[0][5].addShapeBox(-5.25F, 1F, -5.25F, 5, 2, 5, 0F,-1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F); // Import 

		gun_5_Model[0][6].addShapeBox(0.25F, 1F, 0F, 5, 2, 5, 0F,0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -1.75F, 0.0F, -1.75F, 0.25F, 0.0F, -0.25F); // Import 

		gun_5_Model[0][7].addShapeBox(-5.25F, 1F, 0F, 5, 2, 5, 0F,-0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F, -0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, -0.25F, -1.75F, 0.0F, -1.75F); // Import 

		gun_5_Model[0][8].addShapeBox(-7.75F, -2F, -5F, 8, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[0][9].addShapeBox(0.25F, -2F, -5F, 3, 4, 10, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[0][10].addShapeBox(3.25F, -2F, -5F, 2, 4, 10, 0F,0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[0][11].addShapeBox(-6.75F, -4F, -5F, 5, 2, 10, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[0][12].addShapeBox(-6.75F, -4F, -7.5F, 5, 2, 15, 0F,-2.0F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.3F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[0][13].addShapeBox(-5.25F, -4F, -7.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		gun_5_Model[0][14].addShapeBox(-5.25F, -4F, 5.5F, 5, 2, 2, 0F,-2.0F, -0.5F, -0.2F, -1.5F, -0.3F, 0.0F, -1.5F, -0.3F, 0.0F, -2.0F, -0.5F, -0.2F, -2.0F, -0.5F, -0.2F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, -0.5F, -0.2F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-96F, -6F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 101, 971, textureX, textureY); // Import 

		gun_5_Model[1][0].addShapeBox(2F, -0.6F, 1.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		gun_5_Model[1][1].addShapeBox(2F, -0.6F, -2.25F, 13, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, 0.0F, 0.0F); // Import 

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-96F, -6F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);
	}
}