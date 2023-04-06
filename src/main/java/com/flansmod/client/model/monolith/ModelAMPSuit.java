//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAMPSuit extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAMPSuit() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[307];
		hipsModel = new ModelRendererTurbo[59];
		leftArmModel = new ModelRendererTurbo[43];
		rightArmModel = new ModelRendererTurbo[43];
		leftLegModel = new ModelRendererTurbo[67];
		rightLegModel = new ModelRendererTurbo[49];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 8, 56, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 42, 74, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 10, 74, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 26, 74, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 59, 93, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 26, 74, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 42, 74, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 27, 94, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 43, 94, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 27, 94, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 43, 94, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 10, 62, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 10, 70, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 52, 117, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 54, 268, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 10, 70, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 10, 62, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 59, 73, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 52, 128, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 7, 302, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 3, 221, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 4, 115, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 24, 157, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 52, 157, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 59, 82, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 9, 115, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 9, 125, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 5, 169, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 4, 196, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 38, 177, textureX, textureY); // Box 5
		bodyModel[32] = new ModelRendererTurbo(this, 5, 156, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 13, 41, textureX, textureY); // Box 7
		bodyModel[34] = new ModelRendererTurbo(this, 33, 47, textureX, textureY); // Box 8
		bodyModel[35] = new ModelRendererTurbo(this, 42, 181, textureX, textureY); // Box 9
		bodyModel[36] = new ModelRendererTurbo(this, 21, 176, textureX, textureY); // Box 10
		bodyModel[37] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 11
		bodyModel[38] = new ModelRendererTurbo(this, 23, 302, textureX, textureY); // Box 19
		bodyModel[39] = new ModelRendererTurbo(this, 82, 201, textureX, textureY); // Box 25
		bodyModel[40] = new ModelRendererTurbo(this, 82, 212, textureX, textureY); // Box 27
		bodyModel[41] = new ModelRendererTurbo(this, 84, 158, textureX, textureY); // Box 32
		bodyModel[42] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 33
		bodyModel[43] = new ModelRendererTurbo(this, 84, 72, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 35
		bodyModel[45] = new ModelRendererTurbo(this, 68, 212, textureX, textureY); // Box 36
		bodyModel[46] = new ModelRendererTurbo(this, 68, 201, textureX, textureY); // Box 37
		bodyModel[47] = new ModelRendererTurbo(this, 50, 212, textureX, textureY); // Box 38
		bodyModel[48] = new ModelRendererTurbo(this, 50, 201, textureX, textureY); // Box 39
		bodyModel[49] = new ModelRendererTurbo(this, 50, 201, textureX, textureY); // Box 40
		bodyModel[50] = new ModelRendererTurbo(this, 68, 201, textureX, textureY); // Box 41
		bodyModel[51] = new ModelRendererTurbo(this, 82, 201, textureX, textureY); // Box 42
		bodyModel[52] = new ModelRendererTurbo(this, 12, 47, textureX, textureY); // Box 43
		bodyModel[53] = new ModelRendererTurbo(this, 80, 123, textureX, textureY); // Box 45
		bodyModel[54] = new ModelRendererTurbo(this, 81, 130, textureX, textureY); // Box 46
		bodyModel[55] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 47
		bodyModel[56] = new ModelRendererTurbo(this, 94, 91, textureX, textureY); // Box 48
		bodyModel[57] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 49
		bodyModel[58] = new ModelRendererTurbo(this, 77, 60, textureX, textureY); // Box 50
		bodyModel[59] = new ModelRendererTurbo(this, 77, 49, textureX, textureY); // Box 51
		bodyModel[60] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 52
		bodyModel[61] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 53
		bodyModel[62] = new ModelRendererTurbo(this, 94, 177, textureX, textureY); // Box 54
		bodyModel[63] = new ModelRendererTurbo(this, 23, 260, textureX, textureY); // Box 55
		bodyModel[64] = new ModelRendererTurbo(this, 47, 221, textureX, textureY); // Box 56
		bodyModel[65] = new ModelRendererTurbo(this, 59, 228, textureX, textureY); // Box 57
		bodyModel[66] = new ModelRendererTurbo(this, 33, 242, textureX, textureY); // Box 58
		bodyModel[67] = new ModelRendererTurbo(this, 59, 221, textureX, textureY); // Box 59
		bodyModel[68] = new ModelRendererTurbo(this, 33, 258, textureX, textureY); // Box 60
		bodyModel[69] = new ModelRendererTurbo(this, 33, 274, textureX, textureY); // Box 61
		bodyModel[70] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 62
		bodyModel[71] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 1
		bodyModel[73] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 2
		bodyModel[74] = new ModelRendererTurbo(this, 4, 241, textureX, textureY); // Box 3
		bodyModel[75] = new ModelRendererTurbo(this, 4, 249, textureX, textureY); // Box 4
		bodyModel[76] = new ModelRendererTurbo(this, 4, 241, textureX, textureY); // Box 5
		bodyModel[77] = new ModelRendererTurbo(this, 18, 258, textureX, textureY); // Box 6
		bodyModel[78] = new ModelRendererTurbo(this, 4, 258, textureX, textureY); // Box 7
		bodyModel[79] = new ModelRendererTurbo(this, 18, 258, textureX, textureY); // Box 9
		bodyModel[80] = new ModelRendererTurbo(this, 4, 266, textureX, textureY); // Box 10
		bodyModel[81] = new ModelRendererTurbo(this, 5, 274, textureX, textureY); // Box 11
		bodyModel[82] = new ModelRendererTurbo(this, 76, 104, textureX, textureY); // Box 20
		bodyModel[83] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Box 21
		bodyModel[84] = new ModelRendererTurbo(this, 59, 55, textureX, textureY); // Box 22
		bodyModel[85] = new ModelRendererTurbo(this, 59, 67, textureX, textureY); // Box 23
		bodyModel[86] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 27
		bodyModel[87] = new ModelRendererTurbo(this, 73, 232, textureX, textureY); // Box 3
		bodyModel[88] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 4
		bodyModel[89] = new ModelRendererTurbo(this, 50, 238, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 74, 238, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 60, 243, textureX, textureY); // Box 7
		bodyModel[92] = new ModelRendererTurbo(this, 78, 242, textureX, textureY); // Box 8
		bodyModel[93] = new ModelRendererTurbo(this, 50, 243, textureX, textureY); // Box 10
		bodyModel[94] = new ModelRendererTurbo(this, 46, 36, textureX, textureY); // Box 11
		bodyModel[95] = new ModelRendererTurbo(this, 71, 40, textureX, textureY); // Box 12
		bodyModel[96] = new ModelRendererTurbo(this, 71, 31, textureX, textureY); // Box 13
		bodyModel[97] = new ModelRendererTurbo(this, 4, 266, textureX, textureY); // Box 14
		bodyModel[98] = new ModelRendererTurbo(this, 23, 172, textureX, textureY); // Box 15
		bodyModel[99] = new ModelRendererTurbo(this, 23, 180, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 7, 176, textureX, textureY); // Box 1
		bodyModel[101] = new ModelRendererTurbo(this, 15, 176, textureX, textureY); // Box 3
		bodyModel[102] = new ModelRendererTurbo(this, 52, 117, textureX, textureY); // Box 9
		bodyModel[103] = new ModelRendererTurbo(this, 52, 128, textureX, textureY); // Box 10
		bodyModel[104] = new ModelRendererTurbo(this, 9, 115, textureX, textureY); // Box 11
		bodyModel[105] = new ModelRendererTurbo(this, 9, 125, textureX, textureY); // Box 12
		bodyModel[106] = new ModelRendererTurbo(this, 24, 157, textureX, textureY); // Box 13
		bodyModel[107] = new ModelRendererTurbo(this, 52, 157, textureX, textureY); // Box 14
		bodyModel[108] = new ModelRendererTurbo(this, 5, 156, textureX, textureY); // Box 15
		bodyModel[109] = new ModelRendererTurbo(this, 13, 41, textureX, textureY); // Box 16
		bodyModel[110] = new ModelRendererTurbo(this, 33, 47, textureX, textureY); // Box 17
		bodyModel[111] = new ModelRendererTurbo(this, 4, 42, textureX, textureY); // Box 18
		bodyModel[112] = new ModelRendererTurbo(this, 42, 181, textureX, textureY); // Box 19
		bodyModel[113] = new ModelRendererTurbo(this, 5, 169, textureX, textureY); // Box 20
		bodyModel[114] = new ModelRendererTurbo(this, 4, 196, textureX, textureY); // Box 21
		bodyModel[115] = new ModelRendererTurbo(this, 12, 47, textureX, textureY); // Box 22
		bodyModel[116] = new ModelRendererTurbo(this, 82, 201, textureX, textureY); // Box 23
		bodyModel[117] = new ModelRendererTurbo(this, 82, 212, textureX, textureY); // Box 24
		bodyModel[118] = new ModelRendererTurbo(this, 82, 201, textureX, textureY); // Box 25
		bodyModel[119] = new ModelRendererTurbo(this, 68, 201, textureX, textureY); // Box 33
		bodyModel[120] = new ModelRendererTurbo(this, 68, 212, textureX, textureY); // Box 34
		bodyModel[121] = new ModelRendererTurbo(this, 68, 201, textureX, textureY); // Box 37
		bodyModel[122] = new ModelRendererTurbo(this, 50, 201, textureX, textureY); // Box 38
		bodyModel[123] = new ModelRendererTurbo(this, 50, 212, textureX, textureY); // Box 39
		bodyModel[124] = new ModelRendererTurbo(this, 50, 201, textureX, textureY); // Box 40
		bodyModel[125] = new ModelRendererTurbo(this, 94, 177, textureX, textureY); // Box 41
		bodyModel[126] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 42
		bodyModel[127] = new ModelRendererTurbo(this, 69, 167, textureX, textureY); // Box 43
		bodyModel[128] = new ModelRendererTurbo(this, 84, 158, textureX, textureY); // Box 44
		bodyModel[129] = new ModelRendererTurbo(this, 79, 144, textureX, textureY); // Box 45
		bodyModel[130] = new ModelRendererTurbo(this, 81, 130, textureX, textureY); // Box 46
		bodyModel[131] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 47
		bodyModel[132] = new ModelRendererTurbo(this, 80, 123, textureX, textureY); // Box 48
		bodyModel[133] = new ModelRendererTurbo(this, 80, 115, textureX, textureY); // Box 49
		bodyModel[134] = new ModelRendererTurbo(this, 77, 60, textureX, textureY); // Box 50
		bodyModel[135] = new ModelRendererTurbo(this, 77, 49, textureX, textureY); // Box 51
		bodyModel[136] = new ModelRendererTurbo(this, 33, 242, textureX, textureY); // Box 52
		bodyModel[137] = new ModelRendererTurbo(this, 33, 258, textureX, textureY); // Box 53
		bodyModel[138] = new ModelRendererTurbo(this, 33, 274, textureX, textureY); // Box 54
		bodyModel[139] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 55
		bodyModel[140] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 56
		bodyModel[141] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 57
		bodyModel[142] = new ModelRendererTurbo(this, 49, 251, textureX, textureY); // Box 58
		bodyModel[143] = new ModelRendererTurbo(this, 47, 221, textureX, textureY); // Box 59
		bodyModel[144] = new ModelRendererTurbo(this, 59, 228, textureX, textureY); // Box 60
		bodyModel[145] = new ModelRendererTurbo(this, 59, 221, textureX, textureY); // Box 61
		bodyModel[146] = new ModelRendererTurbo(this, 84, 72, textureX, textureY); // Box 62
		bodyModel[147] = new ModelRendererTurbo(this, 4, 266, textureX, textureY); // Box 63
		bodyModel[148] = new ModelRendererTurbo(this, 5, 274, textureX, textureY); // Box 64
		bodyModel[149] = new ModelRendererTurbo(this, 4, 266, textureX, textureY); // Box 65
		bodyModel[150] = new ModelRendererTurbo(this, 4, 241, textureX, textureY); // Box 66
		bodyModel[151] = new ModelRendererTurbo(this, 4, 249, textureX, textureY); // Box 67
		bodyModel[152] = new ModelRendererTurbo(this, 4, 241, textureX, textureY); // Box 68
		bodyModel[153] = new ModelRendererTurbo(this, 18, 258, textureX, textureY); // Box 69
		bodyModel[154] = new ModelRendererTurbo(this, 4, 258, textureX, textureY); // Box 70
		bodyModel[155] = new ModelRendererTurbo(this, 18, 258, textureX, textureY); // Box 71
		bodyModel[156] = new ModelRendererTurbo(this, 76, 91, textureX, textureY); // Box 72
		bodyModel[157] = new ModelRendererTurbo(this, 94, 91, textureX, textureY); // Box 73
		bodyModel[158] = new ModelRendererTurbo(this, 76, 104, textureX, textureY); // Box 74
		bodyModel[159] = new ModelRendererTurbo(this, 46, 36, textureX, textureY); // Box 75
		bodyModel[160] = new ModelRendererTurbo(this, 71, 40, textureX, textureY); // Box 76
		bodyModel[161] = new ModelRendererTurbo(this, 71, 31, textureX, textureY); // Box 77
		bodyModel[162] = new ModelRendererTurbo(this, 73, 227, textureX, textureY); // Box 78
		bodyModel[163] = new ModelRendererTurbo(this, 73, 232, textureX, textureY); // Box 79
		bodyModel[164] = new ModelRendererTurbo(this, 50, 238, textureX, textureY); // Box 80
		bodyModel[165] = new ModelRendererTurbo(this, 50, 243, textureX, textureY); // Box 81
		bodyModel[166] = new ModelRendererTurbo(this, 60, 243, textureX, textureY); // Box 82
		bodyModel[167] = new ModelRendererTurbo(this, 74, 238, textureX, textureY); // Box 83
		bodyModel[168] = new ModelRendererTurbo(this, 78, 242, textureX, textureY); // Box 84
		bodyModel[169] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 85
		bodyModel[170] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 86
		bodyModel[171] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 87
		bodyModel[172] = new ModelRendererTurbo(this, 59, 55, textureX, textureY); // Box 88
		bodyModel[173] = new ModelRendererTurbo(this, 59, 67, textureX, textureY); // Box 89
		bodyModel[174] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Box 90
		bodyModel[175] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 91
		bodyModel[176] = new ModelRendererTurbo(this, 23, 172, textureX, textureY); // Box 92
		bodyModel[177] = new ModelRendererTurbo(this, 23, 180, textureX, textureY); // Box 93
		bodyModel[178] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 94
		bodyModel[179] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 95
		bodyModel[180] = new ModelRendererTurbo(this, 24, 186, textureX, textureY); // Box 96
		bodyModel[181] = new ModelRendererTurbo(this, 39, 300, textureX, textureY); // Box 97
		bodyModel[182] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Box 98
		bodyModel[183] = new ModelRendererTurbo(this, 53, 308, textureX, textureY); // Box 99
		bodyModel[184] = new ModelRendererTurbo(this, 53, 268, textureX, textureY); // Box 100
		bodyModel[185] = new ModelRendererTurbo(this, 53, 268, textureX, textureY); // Box 101
		bodyModel[186] = new ModelRendererTurbo(this, 23, 302, textureX, textureY); // Box 102
		bodyModel[187] = new ModelRendererTurbo(this, 69, 308, textureX, textureY); // Box 103
		bodyModel[188] = new ModelRendererTurbo(this, 69, 308, textureX, textureY); // Box 104
		bodyModel[189] = new ModelRendererTurbo(this, 39, 300, textureX, textureY); // Box 105
		bodyModel[190] = new ModelRendererTurbo(this, 61, 252, textureX, textureY); // Box 106
		bodyModel[191] = new ModelRendererTurbo(this, 83, 249, textureX, textureY); // Box 107
		bodyModel[192] = new ModelRendererTurbo(this, 92, 256, textureX, textureY); // Box 108
		bodyModel[193] = new ModelRendererTurbo(this, 92, 256, textureX, textureY); // Box 109
		bodyModel[194] = new ModelRendererTurbo(this, 92, 264, textureX, textureY); // Box 110
		bodyModel[195] = new ModelRendererTurbo(this, 92, 264, textureX, textureY); // Box 111
		bodyModel[196] = new ModelRendererTurbo(this, 83, 249, textureX, textureY); // Box 113
		bodyModel[197] = new ModelRendererTurbo(this, 92, 256, textureX, textureY); // Box 114
		bodyModel[198] = new ModelRendererTurbo(this, 92, 264, textureX, textureY); // Box 115
		bodyModel[199] = new ModelRendererTurbo(this, 92, 256, textureX, textureY); // Box 116
		bodyModel[200] = new ModelRendererTurbo(this, 92, 264, textureX, textureY); // Box 117
		bodyModel[201] = new ModelRendererTurbo(this, 7, 339, textureX, textureY); // Box 119
		bodyModel[202] = new ModelRendererTurbo(this, 7, 350, textureX, textureY); // Box 120
		bodyModel[203] = new ModelRendererTurbo(this, 7, 356, textureX, textureY); // Box 121
		bodyModel[204] = new ModelRendererTurbo(this, 27, 327, textureX, textureY); // Box 124
		bodyModel[205] = new ModelRendererTurbo(this, 7, 333, textureX, textureY); // Box 125
		bodyModel[206] = new ModelRendererTurbo(this, 7, 328, textureX, textureY); // Box 126
		bodyModel[207] = new ModelRendererTurbo(this, 35, 335, textureX, textureY); // Box 127
		bodyModel[208] = new ModelRendererTurbo(this, 22, 356, textureX, textureY); // Box 128
		bodyModel[209] = new ModelRendererTurbo(this, 35, 343, textureX, textureY); // Box 129
		bodyModel[210] = new ModelRendererTurbo(this, 35, 327, textureX, textureY); // Box 130
		bodyModel[211] = new ModelRendererTurbo(this, 59, 326, textureX, textureY); // Box 131
		bodyModel[212] = new ModelRendererTurbo(this, 22, 356, textureX, textureY); // Box 132
		bodyModel[213] = new ModelRendererTurbo(this, 59, 340, textureX, textureY); // Box 133
		bodyModel[214] = new ModelRendererTurbo(this, 59, 354, textureX, textureY); // Box 134
		bodyModel[215] = new ModelRendererTurbo(this, 59, 340, textureX, textureY); // Box 142
		bodyModel[216] = new ModelRendererTurbo(this, 59, 354, textureX, textureY); // Box 143
		bodyModel[217] = new ModelRendererTurbo(this, 47, 329, textureX, textureY); // Box 146
		bodyModel[218] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 147
		bodyModel[219] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 148
		bodyModel[220] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 149
		bodyModel[221] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 150
		bodyModel[222] = new ModelRendererTurbo(this, 87, 290, textureX, textureY); // Box 151
		bodyModel[223] = new ModelRendererTurbo(this, 104, 290, textureX, textureY); // Box 152
		bodyModel[224] = new ModelRendererTurbo(this, 87, 308, textureX, textureY); // Box 153
		bodyModel[225] = new ModelRendererTurbo(this, 87, 321, textureX, textureY); // Box 154
		bodyModel[226] = new ModelRendererTurbo(this, 87, 339, textureX, textureY); // Box 155
		bodyModel[227] = new ModelRendererTurbo(this, 104, 290, textureX, textureY); // Box 156
		bodyModel[228] = new ModelRendererTurbo(this, 87, 299, textureX, textureY); // Box 157
		bodyModel[229] = new ModelRendererTurbo(this, 104, 358, textureX, textureY); // Box 158
		bodyModel[230] = new ModelRendererTurbo(this, 86, 358, textureX, textureY); // Box 159
		bodyModel[231] = new ModelRendererTurbo(this, 102, 372, textureX, textureY); // Box 161
		bodyModel[232] = new ModelRendererTurbo(this, 87, 372, textureX, textureY); // Box 162
		bodyModel[233] = new ModelRendererTurbo(this, 88, 351, textureX, textureY); // Box 163
		bodyModel[234] = new ModelRendererTurbo(this, 106, 351, textureX, textureY); // Box 164
		bodyModel[235] = new ModelRendererTurbo(this, 88, 351, textureX, textureY); // Box 165
		bodyModel[236] = new ModelRendererTurbo(this, 106, 351, textureX, textureY); // Box 166
		bodyModel[237] = new ModelRendererTurbo(this, 74, 368, textureX, textureY); // Box 167
		bodyModel[238] = new ModelRendererTurbo(this, 74, 363, textureX, textureY); // Box 168
		bodyModel[239] = new ModelRendererTurbo(this, 74, 363, textureX, textureY); // Box 169
		bodyModel[240] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 1
		bodyModel[242] = new ModelRendererTurbo(this, 47, 329, textureX, textureY); // Box 2
		bodyModel[243] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 3
		bodyModel[244] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 4
		bodyModel[245] = new ModelRendererTurbo(this, 102, 372, textureX, textureY); // Box 5
		bodyModel[246] = new ModelRendererTurbo(this, 87, 372, textureX, textureY); // Box 6
		bodyModel[247] = new ModelRendererTurbo(this, 86, 358, textureX, textureY); // Box 7
		bodyModel[248] = new ModelRendererTurbo(this, 104, 358, textureX, textureY); // Box 8
		bodyModel[249] = new ModelRendererTurbo(this, 35, 327, textureX, textureY); // Box 9
		bodyModel[250] = new ModelRendererTurbo(this, 27, 327, textureX, textureY); // Box 10
		bodyModel[251] = new ModelRendererTurbo(this, 35, 335, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 35, 343, textureX, textureY); // Box 12
		bodyModel[253] = new ModelRendererTurbo(this, 7, 356, textureX, textureY); // Box 13
		bodyModel[254] = new ModelRendererTurbo(this, 7, 350, textureX, textureY); // Box 14
		bodyModel[255] = new ModelRendererTurbo(this, 7, 339, textureX, textureY); // Box 15
		bodyModel[256] = new ModelRendererTurbo(this, 7, 333, textureX, textureY); // Box 16
		bodyModel[257] = new ModelRendererTurbo(this, 7, 328, textureX, textureY); // Box 17
		bodyModel[258] = new ModelRendererTurbo(this, 35, 335, textureX, textureY); // Box 18
		bodyModel[259] = new ModelRendererTurbo(this, 27, 327, textureX, textureY); // Box 19
		bodyModel[260] = new ModelRendererTurbo(this, 27, 327, textureX, textureY); // Box 20
		bodyModel[261] = new ModelRendererTurbo(this, 35, 335, textureX, textureY); // Box 21
		bodyModel[262] = new ModelRendererTurbo(this, 22, 356, textureX, textureY); // Box 22
		bodyModel[263] = new ModelRendererTurbo(this, 22, 356, textureX, textureY); // Box 23
		bodyModel[264] = new ModelRendererTurbo(this, 35, 343, textureX, textureY); // Box 24
		bodyModel[265] = new ModelRendererTurbo(this, 35, 327, textureX, textureY); // Box 25
		bodyModel[266] = new ModelRendererTurbo(this, 35, 343, textureX, textureY); // Box 26
		bodyModel[267] = new ModelRendererTurbo(this, 35, 327, textureX, textureY); // Box 27
		bodyModel[268] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 28
		bodyModel[269] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 29
		bodyModel[270] = new ModelRendererTurbo(this, 47, 329, textureX, textureY); // Box 30
		bodyModel[271] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 31
		bodyModel[272] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 32
		bodyModel[273] = new ModelRendererTurbo(this, 59, 354, textureX, textureY); // Box 33
		bodyModel[274] = new ModelRendererTurbo(this, 59, 340, textureX, textureY); // Box 34
		bodyModel[275] = new ModelRendererTurbo(this, 59, 326, textureX, textureY); // Box 35
		bodyModel[276] = new ModelRendererTurbo(this, 59, 340, textureX, textureY); // Box 36
		bodyModel[277] = new ModelRendererTurbo(this, 59, 354, textureX, textureY); // Box 37
		bodyModel[278] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 38
		bodyModel[279] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 39
		bodyModel[280] = new ModelRendererTurbo(this, 47, 354, textureX, textureY); // Box 40
		bodyModel[281] = new ModelRendererTurbo(this, 47, 343, textureX, textureY); // Box 41
		bodyModel[282] = new ModelRendererTurbo(this, 47, 329, textureX, textureY); // Box 42
		bodyModel[283] = new ModelRendererTurbo(this, 104, 290, textureX, textureY); // Box 43
		bodyModel[284] = new ModelRendererTurbo(this, 87, 290, textureX, textureY); // Box 44
		bodyModel[285] = new ModelRendererTurbo(this, 104, 290, textureX, textureY); // Box 45
		bodyModel[286] = new ModelRendererTurbo(this, 87, 299, textureX, textureY); // Box 46
		bodyModel[287] = new ModelRendererTurbo(this, 87, 308, textureX, textureY); // Box 47
		bodyModel[288] = new ModelRendererTurbo(this, 87, 321, textureX, textureY); // Box 48
		bodyModel[289] = new ModelRendererTurbo(this, 87, 339, textureX, textureY); // Box 49
		bodyModel[290] = new ModelRendererTurbo(this, 86, 358, textureX, textureY); // Box 50
		bodyModel[291] = new ModelRendererTurbo(this, 104, 358, textureX, textureY); // Box 51
		bodyModel[292] = new ModelRendererTurbo(this, 102, 372, textureX, textureY); // Box 52
		bodyModel[293] = new ModelRendererTurbo(this, 87, 372, textureX, textureY); // Box 53
		bodyModel[294] = new ModelRendererTurbo(this, 104, 358, textureX, textureY); // Box 54
		bodyModel[295] = new ModelRendererTurbo(this, 87, 372, textureX, textureY); // Box 55
		bodyModel[296] = new ModelRendererTurbo(this, 102, 372, textureX, textureY); // Box 56
		bodyModel[297] = new ModelRendererTurbo(this, 86, 358, textureX, textureY); // Box 57
		bodyModel[298] = new ModelRendererTurbo(this, 74, 363, textureX, textureY); // Box 62
		bodyModel[299] = new ModelRendererTurbo(this, 74, 368, textureX, textureY); // Box 63
		bodyModel[300] = new ModelRendererTurbo(this, 74, 363, textureX, textureY); // Box 64
		bodyModel[301] = new ModelRendererTurbo(this, 88, 351, textureX, textureY); // Box 40
		bodyModel[302] = new ModelRendererTurbo(this, 106, 351, textureX, textureY); // Box 41
		bodyModel[303] = new ModelRendererTurbo(this, 88, 351, textureX, textureY); // Box 42
		bodyModel[304] = new ModelRendererTurbo(this, 106, 351, textureX, textureY); // Box 43
		bodyModel[305] = new ModelRendererTurbo(this, 106, 64, textureX, textureY); // Box 92
		bodyModel[306] = new ModelRendererTurbo(this, 106, 64, textureX, textureY); // Box 93

		bodyModel[0].addShapeBox(-9F, -1F, -2F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -47F, 0F);

		bodyModel[1].addShapeBox(-2F, -14F, 6F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, -47F, 0F);

		bodyModel[2].addShapeBox(2F, -14F, 6F, 4, 13, 3, 0F,0F, 0F, 0F, -1.5F, 0F, 1.5F, .5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1.5F, .5F, 0F, -2.5F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, -47F, 0F);

		bodyModel[3].addShapeBox(6F, -14F, -2F, 3, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, -47F, 0F);

		bodyModel[4].addShapeBox(6F, -14F, 2F, 3, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, .5F, 1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, .5F, 1.5F, 0F, -1.5F); // Box 5
		bodyModel[4].setRotationPoint(0F, -47F, 0F);

		bodyModel[5].addShapeBox(-9F, -15F, -2F, 3, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, -47F, 0F);

		bodyModel[6].addShapeBox(-2F, -14F, -9F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, -47F, 0F);

		bodyModel[7].addShapeBox(6F, -14F, -6F, 3, 13, 4, 0F,1.5F, 0F, -1.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(0F, -47F, 0F);

		bodyModel[8].addShapeBox(2F, -14F, -9F, 4, 13, 3, 0F,0F, 0F, 0F, 0.5F, 0F, -2.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(0F, -47F, 0F);

		bodyModel[9].addShapeBox(-6F, -14F, -9F, 4, 13, 3, 0F,0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 1.5F); // Box 10
		bodyModel[9].setRotationPoint(0F, -47F, 0F);

		bodyModel[10].addShapeBox(-9F, -15F, -6F, 3, 14, 4, 0F,-2.5F, 0F, 0.5F, 1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, 1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(0F, -47F, 0F);

		bodyModel[11].addShapeBox(-6F, -14F, 6F, 4, 13, 3, 0F,-1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, -1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F); // Box 12
		bodyModel[11].setRotationPoint(0F, -47F, 0F);

		bodyModel[12].addShapeBox(-9F, -15F, 2F, 3, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, -2.5F, 0F, 0.5F); // Box 13
		bodyModel[12].setRotationPoint(0F, -47F, 0F);

		bodyModel[13].addShapeBox(-9F, -1F, 2F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F); // Box 14
		bodyModel[13].setRotationPoint(0F, -47F, 0F);

		bodyModel[14].addShapeBox(-7F, -1F, 7F, 14, 1, 2, 0F,-.5F, 0F, .5F, -.5F, 0F, .5F, -5F, 0F, 0F, -5F, 0F, 0F, -.5F, 0F, .5F, -.5F, 0F, .5F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(0F, -47F, 0F);

		bodyModel[15].addShapeBox(2F, -12F, 7F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(0F, -47F, 0F);

		bodyModel[16].addShapeBox(6F, -12F, -7F, 6, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(0F, -47F, 0F);

		bodyModel[17].addShapeBox(-7F, -1F, -9F, 14, 1, 2, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -5F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 19
		bodyModel[17].setRotationPoint(0F, -47F, 0F);

		bodyModel[18].addShapeBox(-9F, -1F, -6F, 18, 1, 4, 0F,-2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(0F, -47F, 0F);

		bodyModel[19].addShapeBox(9F, -10F, -1F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(0F, -47F, 0F);

		bodyModel[20].addShapeBox(-6F, -12F, 6F, 8, 2, 5, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 22
		bodyModel[20].setRotationPoint(0F, -47F, 0F);

		bodyModel[21].addShapeBox(-6.5F, -25F, -2F, 2, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(0F, -47F, 0F);

		bodyModel[22].addShapeBox(-15F, -30F, -6F, 9, 4, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(0F, -47F, 0F);

		bodyModel[23].addShapeBox(-15F, -26F, -13F, 9, 13, 26, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 28
		bodyModel[23].setRotationPoint(0F, -47F, 0F);

		bodyModel[24].addShapeBox(2F, -21F, 11F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(0F, -47F, 0F);

		bodyModel[25].addShapeBox(-6F, -21F, 11F, 8, 11, 2, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 5F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 30
		bodyModel[25].setRotationPoint(0F, -47F, 0F);

		bodyModel[26].addShapeBox(12F, -12F, -3F, 5, 2, 6, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(0F, -47F, 0F);

		bodyModel[27].addShapeBox(11F, -14F, 3F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[27].setRotationPoint(0F, -47F, 0F);

		bodyModel[28].addShapeBox(11F, -18F, 7F, 1, 6, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[28].setRotationPoint(0F, -47F, 0F);

		bodyModel[29].addShapeBox(12F, -18F, 11F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 1.88F); // Box 3
		bodyModel[29].setRotationPoint(0F, -47F, 0F);

		bodyModel[30].addShapeBox(-15F, -38F, 6F, 9, 12, 10, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(0F, -47F, 0F);

		bodyModel[31].addShapeBox(18F, -18F, -9F, 2, 3, 18, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 5
		bodyModel[31].setRotationPoint(0F, -47F, 0F);

		bodyModel[32].addShapeBox(12F, -26F, 11F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, -8F, 4F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 3F); // Box 6
		bodyModel[32].setRotationPoint(0F, -47F, 0F);

		bodyModel[33].addShapeBox(5F, -26F, 11F, 7, 1, 2, 0F,0F, 8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 1F); // Box 7
		bodyModel[33].setRotationPoint(0F, -47F, 0F);

		bodyModel[34].addShapeBox(-6F, -34F, 12F, 11, 1, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 8
		bodyModel[34].setRotationPoint(0F, -47F, 0F);

		bodyModel[35].addShapeBox(18F, -15F, 6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -2F, 0F, .5F, 0F); // Box 9
		bodyModel[35].setRotationPoint(0F, -47F, 0F);

		bodyModel[36].addShapeBox(17F, -15F, -7F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 10
		bodyModel[36].setRotationPoint(0F, -47F, 0F);

		bodyModel[37].addShapeBox(4F, -33F, 13F, 1, 12, 1, 0F,0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 2F, 0F, -2F, -2F, .3F, -2F, -2F, .3F, 2F, 2F, 0F, 2F); // Box 11
		bodyModel[37].setRotationPoint(0F, -47F, 0F);

		bodyModel[38].addShapeBox(-5.5F, -25F, 2F, 2, 11, 4, 0F,.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 19
		bodyModel[38].setRotationPoint(0F, -47F, 0F);

		bodyModel[39].addShapeBox(-15F, -36F, 5F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[39].setRotationPoint(0F, -47F, 0F);

		bodyModel[40].addShapeBox(-14F, -35F, 5F, 6, 3, 8, 0F,.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 27
		bodyModel[40].setRotationPoint(0F, -47F, 0F);

		bodyModel[41].addShapeBox(-15F, -26F, 13F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.86F, 0F, 0F, -2.86F); // Box 32
		bodyModel[41].setRotationPoint(0F, -47F, 0F);

		bodyModel[42].addShapeBox(-15F, -31F, 17F, 9, 5, 7, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 33
		bodyModel[42].setRotationPoint(0F, -47F, 0F);

		bodyModel[43].addShapeBox(-14F, -40.5F, 17F, 7, 10, 7, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 34
		bodyModel[43].setRotationPoint(0F, -47F, 0F);

		bodyModel[44].addShapeBox(-17F, -31F, 21.5F, 13, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[44].setRotationPoint(0F, -47F, 0F);

		bodyModel[45].addShapeBox(-14F, -35F, 13F, 6, 3, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[45].setRotationPoint(0F, -47F, 0F);

		bodyModel[46].addShapeBox(-15F, -36F, 13F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 37
		bodyModel[46].setRotationPoint(0F, -47F, 0F);

		bodyModel[47].addShapeBox(-13F, -35F, 15F, 5, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[47].setRotationPoint(0F, -47F, 0F);

		bodyModel[48].addShapeBox(-14F, -36F, 15F, 7, 1, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.5F, 0F, .2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.5F, 0F, .2F); // Box 39
		bodyModel[48].setRotationPoint(0F, -47F, 0F);

		bodyModel[49].addShapeBox(-14F, -32F, 15F, 7, 1, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.5F, 0F, .2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.5F, 0F, .2F); // Box 40
		bodyModel[49].setRotationPoint(0F, -47F, 0F);

		bodyModel[50].addShapeBox(-15F, -32F, 13F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 41
		bodyModel[50].setRotationPoint(0F, -47F, 0F);

		bodyModel[51].addShapeBox(-15F, -32F, 5F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[51].setRotationPoint(0F, -47F, 0F);

		bodyModel[52].addShapeBox(-6F, -34F, 6F, 5, 1, 6, 0F,0F, 4F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -4F, 0F); // Box 43
		bodyModel[52].setRotationPoint(0F, -47F, 0F);

		bodyModel[53].addShapeBox(-17F, -30F, 21.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[53].setRotationPoint(0F, -47F, 0F);

		bodyModel[54].addShapeBox(-14.5F, -30.5F, 15F, 8, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[54].setRotationPoint(0F, -47F, 0F);

		bodyModel[55].addShapeBox(-17F, -29F, 21.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[55].setRotationPoint(0F, -47F, 0F);

		bodyModel[56].addShapeBox(-14F, -40.5F, 25F, 7, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[56].setRotationPoint(0F, -47F, 0F);

		bodyModel[57].addShapeBox(-14F, -40.5F, 24F, 7, 9, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[57].setRotationPoint(0F, -47F, 0F);

		bodyModel[58].addShapeBox(-14F, -35.5F, 17F, 7, 5, 5, 0F,.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -1F, .2F, 0F, -1F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F); // Box 50
		bodyModel[58].setRotationPoint(0F, -47F, 0F);

		bodyModel[59].addShapeBox(-14F, -40.5F, 17F, 7, 5, 5, 0F,.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -3F, .2F, 0F, -3F, .2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -1F, .2F, 0F, -1F); // Box 51
		bodyModel[59].setRotationPoint(0F, -47F, 0F);

		bodyModel[60].addShapeBox(-6F, -26F, 16F, 3, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 52
		bodyModel[60].setRotationPoint(0F, -47F, 0F);

		bodyModel[61].addShapeBox(-12F, -22F, 13F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .14F, 0F, 0F, .14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 53
		bodyModel[61].setRotationPoint(0F, -47F, 0F);

		bodyModel[62].addShapeBox(-15F, -22F, 13F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .14F, 0F, 0F, .14F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -2F); // Box 54
		bodyModel[62].setRotationPoint(0F, -47F, 0F);

		bodyModel[63].addShapeBox(-16F, -26F, -13F, 1, 8, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F); // Box 55
		bodyModel[63].setRotationPoint(0F, -47F, 0F);

		bodyModel[64].addShapeBox(-16F, -31.5F, 13F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[64].setRotationPoint(0F, -47F, 0F);

		bodyModel[65].addShapeBox(-16F, -30.5F, 17F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[65].setRotationPoint(0F, -47F, 0F);

		bodyModel[66].addShapeBox(-17F, -31.5F, 9F, 2, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[66].setRotationPoint(0F, -47F, 0F);

		bodyModel[67].addShapeBox(-16F, -31.5F, 17F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[67].setRotationPoint(0F, -47F, 0F);

		bodyModel[68].addShapeBox(-19F, -31.5F, 9F, 2, 9, 4, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 60
		bodyModel[68].setRotationPoint(0F, -47F, 0F);

		bodyModel[69].addShapeBox(-19F, -27.5F, 9F, 2, 5, 4, 0F,-2F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, -2F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Box 61
		bodyModel[69].setRotationPoint(0F, -47F, 0F);

		bodyModel[70].addShapeBox(-19.4F, -31F, 9F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 62
		bodyModel[70].setRotationPoint(0F, -47F, 0F);

		bodyModel[71].addShapeBox(-19.3F, -29F, 9F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 0
		bodyModel[71].setRotationPoint(0F, -47F, 0F);

		bodyModel[72].addShapeBox(-19.2F, -27F, 9F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 1
		bodyModel[72].setRotationPoint(0F, -47F, 0F);

		bodyModel[73].addShapeBox(-19F, -25F, 9F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 2
		bodyModel[73].setRotationPoint(0F, -47F, 0F);

		bodyModel[74].addShapeBox(-23F, -39F, 19F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[74].setRotationPoint(0F, -47F, 0F);

		bodyModel[75].addShapeBox(-23F, -38F, 19F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[75].setRotationPoint(0F, -47F, 0F);

		bodyModel[76].addShapeBox(-23F, -36F, 19F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[76].setRotationPoint(0F, -47F, 0F);

		bodyModel[77].addShapeBox(-24F, -39F, 19F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		bodyModel[77].setRotationPoint(0F, -47F, 0F);

		bodyModel[78].addShapeBox(-24F, -38F, 19F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[78].setRotationPoint(0F, -47F, 0F);

		bodyModel[79].addShapeBox(-24F, -36F, 19F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 9
		bodyModel[79].setRotationPoint(0F, -47F, 0F);

		bodyModel[80].addShapeBox(-21F, -35.5F, 16F, 7, 1, 4, 0F,-.8F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -.3F, 0F, -3F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 10
		bodyModel[80].setRotationPoint(0F, -47F, 0F);

		bodyModel[81].addShapeBox(-21F, -34.5F, 16F, 7, 2, 4, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 11
		bodyModel[81].setRotationPoint(0F, -47F, 0F);

		bodyModel[82].addShapeBox(-14F, -40.5F, 27F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[82].setRotationPoint(0F, -47F, 0F);

		bodyModel[83].addShapeBox(7F, -8F, 11F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 21
		bodyModel[83].setRotationPoint(0F, -47F, 0F);

		bodyModel[84].addShapeBox(7F, -10F, 11F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[84].setRotationPoint(0F, -47F, 0F);

		bodyModel[85].addShapeBox(7F, -6F, 8F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[85].setRotationPoint(0F, -47F, 0F);

		bodyModel[86].addShapeBox(18F, -14.7F, 4F, 3, 1, 1, 0F,0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, 0F, 0F, -.5F, 0F); // Box 27
		bodyModel[86].setRotationPoint(0F, -47F, 0F);

		bodyModel[87].addShapeBox(-15F, -41.5F, 17F, 9, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[87].setRotationPoint(0F, -47F, 0F);

		bodyModel[88].addShapeBox(-15F, -41.5F, 19F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[88].setRotationPoint(0F, -47F, 0F);

		bodyModel[89].addShapeBox(-15F, -17.5F, 40F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[89].setRotationPoint(0F, -47F, 0F);
		bodyModel[89].rotateAngleX = 0.78539816F;

		bodyModel[90].addShapeBox(-14F, -21.5F, 40F, 8, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[90].setRotationPoint(0F, -47F, 0F);
		bodyModel[90].rotateAngleX = 0.78539816F;

		bodyModel[91].addShapeBox(-15F, -20.5F, 40F, 6, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[91].setRotationPoint(0F, -47F, 0F);
		bodyModel[91].rotateAngleX = 0.78539816F;

		bodyModel[92].addShapeBox(-10F, -21.5F, 39F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[92].setRotationPoint(0F, -47F, 0F);
		bodyModel[92].rotateAngleX = 0.78539816F;

		bodyModel[93].addShapeBox(-8F, -20.5F, 40F, 2, 3, 2, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 10
		bodyModel[93].setRotationPoint(0F, -47F, 0F);
		bodyModel[93].rotateAngleX = 0.78539816F;

		bodyModel[94].addShapeBox(-14.5F, -42.5F, 23F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[94].setRotationPoint(0F, -47F, 0F);

		bodyModel[95].addShapeBox(-14.5F, -43.5F, 23F, 8, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[95].setRotationPoint(0F, -47F, 0F);

		bodyModel[96].addShapeBox(-13.5F, -44.5F, 23F, 6, 1, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[96].setRotationPoint(0F, -47F, 0F);

		bodyModel[97].addShapeBox(-21F, -32.5F, 16F, 7, 1, 4, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.8F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.3F, 0F, -3F); // Box 14
		bodyModel[97].setRotationPoint(0F, -47F, 0F);

		bodyModel[98].addShapeBox(19F, -14.7F, 2F, 1, 3, 3, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 15
		bodyModel[98].setRotationPoint(0F, -47F, 0F);

		bodyModel[99].addShapeBox(20F, -14.2F, 2.5F, 1, 2, 2, 0F,0F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, 0F, -.2F, -.2F); // Box 0
		bodyModel[99].setRotationPoint(0F, -47F, 0F);

		bodyModel[100].addShapeBox(18F, -26.5F, -6F, 1, 9, 1, 0F,5.5F, 0F, 3.5F, -6F, 0F, 3.5F, -6F, 0F, -4F, 5.5F, 0F, -4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 1
		bodyModel[100].setRotationPoint(0F, -47F, 0F);

		bodyModel[101].addShapeBox(15F, -30.5F, -10F, 1, 9, 1, 0F,5.5F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, -1.5F, 5.5F, 0F, -1.5F, 0F, 0F, -2F, -.5F, 0F, -2F, -.5F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 3
		bodyModel[101].setRotationPoint(0F, -47F, 0F);

		bodyModel[102].addShapeBox(2F, -12F, -11F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[102].setRotationPoint(0F, -47F, 0F);

		bodyModel[103].addShapeBox(-6F, -12F, -11F, 8, 2, 5, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 10
		bodyModel[103].setRotationPoint(0F, -47F, 0F);

		bodyModel[104].addShapeBox(11F, -14F, -7F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[104].setRotationPoint(0F, -47F, 0F);

		bodyModel[105].addShapeBox(11F, -18F, -11F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[105].setRotationPoint(0F, -47F, 0F);

		bodyModel[106].addShapeBox(2F, -21F, -13F, 10, 11, 2, 0F,0F, 0F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[106].setRotationPoint(0F, -47F, 0F);

		bodyModel[107].addShapeBox(-6F, -21F, -13F, 8, 11, 2, 0F,0F, 5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 14
		bodyModel[107].setRotationPoint(0F, -47F, 0F);

		bodyModel[108].addShapeBox(12F, -26F, -13F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, -8F, -4F, 0F, -8F, 4F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 15
		bodyModel[108].setRotationPoint(0F, -47F, 0F);

		bodyModel[109].addShapeBox(5F, -26F, -13F, 7, 1, 2, 0F,0F, 8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -1F, 0F, -8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F); // Box 16
		bodyModel[109].setRotationPoint(0F, -47F, 0F);

		bodyModel[110].addShapeBox(-6F, -34F, -14F, 11, 1, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 17
		bodyModel[110].setRotationPoint(0F, -47F, 0F);

		bodyModel[111].addShapeBox(4F, -33F, -14F, 1, 12, 1, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 2F, 0F, 2F, -2F, 0.3F, 2F, -2F, 0.3F, -2F, 2F, 0F, -2F); // Box 18
		bodyModel[111].setRotationPoint(0F, -47F, 0F);

		bodyModel[112].addShapeBox(18F, -15F, -9F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 19
		bodyModel[112].setRotationPoint(0F, -47F, 0F);

		bodyModel[113].addShapeBox(12F, -18F, -13F, 6, 3, 2, 0F,0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1.88F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F); // Box 20
		bodyModel[113].setRotationPoint(0F, -47F, 0F);

		bodyModel[114].addShapeBox(-15F, -38F, -16F, 9, 12, 10, 0F,-4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[114].setRotationPoint(0F, -47F, 0F);

		bodyModel[115].addShapeBox(-6F, -34F, -12F, 5, 1, 6, 0F,0F, 4F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, -4F, 0F); // Box 22
		bodyModel[115].setRotationPoint(0F, -47F, 0F);

		bodyModel[116].addShapeBox(-15F, -32F, -13F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[116].setRotationPoint(0F, -47F, 0F);

		bodyModel[117].addShapeBox(-14F, -35F, -13F, 6, 3, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 24
		bodyModel[117].setRotationPoint(0F, -47F, 0F);

		bodyModel[118].addShapeBox(-15F, -36F, -13F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[118].setRotationPoint(0F, -47F, 0F);

		bodyModel[119].addShapeBox(-15F, -36F, -15F, 7, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[119].setRotationPoint(0F, -47F, 0F);

		bodyModel[120].addShapeBox(-14F, -35F, -15F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 34
		bodyModel[120].setRotationPoint(0F, -47F, 0F);

		bodyModel[121].addShapeBox(-15F, -32F, -15F, 7, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[121].setRotationPoint(0F, -47F, 0F);

		bodyModel[122].addShapeBox(-14F, -32F, -16F, 7, 1, 1, 0F,-0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38
		bodyModel[122].setRotationPoint(0F, -47F, 0F);

		bodyModel[123].addShapeBox(-13F, -35F, -16F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 39
		bodyModel[123].setRotationPoint(0F, -47F, 0F);

		bodyModel[124].addShapeBox(-14F, -36F, -16F, 7, 1, 1, 0F,-0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 40
		bodyModel[124].setRotationPoint(0F, -47F, 0F);

		bodyModel[125].addShapeBox(-15F, -22F, -19F, 3, 3, 6, 0F,0F, 0F, 0.14F, 0F, 0F, 0.14F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 41
		bodyModel[125].setRotationPoint(0F, -47F, 0F);

		bodyModel[126].addShapeBox(-12F, -22F, -19F, 6, 3, 6, 0F,0F, 0F, 0.14F, 0F, 0F, 0.14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[126].setRotationPoint(0F, -47F, 0F);

		bodyModel[127].addShapeBox(-6F, -26F, -22F, 3, 7, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 43
		bodyModel[127].setRotationPoint(0F, -47F, 0F);

		bodyModel[128].addShapeBox(-15F, -26F, -22F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.86F, 0F, 0F, -2.86F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[128].setRotationPoint(0F, -47F, 0F);

		bodyModel[129].addShapeBox(-15F, -31F, -24F, 9, 5, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[129].setRotationPoint(0F, -47F, 0F);

		bodyModel[130].addShapeBox(-14.5F, -30.5F, -21F, 8, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[130].setRotationPoint(0F, -47F, 0F);

		bodyModel[131].addShapeBox(-17F, -31F, -24.5F, 13, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[131].setRotationPoint(0F, -47F, 0F);

		bodyModel[132].addShapeBox(-17F, -30F, -24.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[132].setRotationPoint(0F, -47F, 0F);

		bodyModel[133].addShapeBox(-17F, -29F, -24.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[133].setRotationPoint(0F, -47F, 0F);

		bodyModel[134].addShapeBox(-14F, -35.5F, -22F, 7, 5, 5, 0F,0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 50
		bodyModel[134].setRotationPoint(0F, -47F, 0F);

		bodyModel[135].addShapeBox(-14F, -40.5F, -22F, 7, 5, 5, 0F,0.2F, 0F, -3F, 0.2F, 0F, -3F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 51
		bodyModel[135].setRotationPoint(0F, -47F, 0F);

		bodyModel[136].addShapeBox(-17F, -31.5F, -13F, 2, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[136].setRotationPoint(0F, -47F, 0F);

		bodyModel[137].addShapeBox(-19F, -31.5F, -13F, 2, 9, 4, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 53
		bodyModel[137].setRotationPoint(0F, -47F, 0F);

		bodyModel[138].addShapeBox(-19F, -27.5F, -13F, 2, 5, 4, 0F,-2F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, -2F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Box 54
		bodyModel[138].setRotationPoint(0F, -47F, 0F);

		bodyModel[139].addShapeBox(-19F, -25F, -13F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 55
		bodyModel[139].setRotationPoint(0F, -47F, 0F);

		bodyModel[140].addShapeBox(-19.2F, -27F, -13F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 56
		bodyModel[140].setRotationPoint(0F, -47F, 0F);

		bodyModel[141].addShapeBox(-19.3F, -29F, -13F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 57
		bodyModel[141].setRotationPoint(0F, -47F, 0F);

		bodyModel[142].addShapeBox(-19.4F, -31F, -13F, 2, 2, 4, 0F,0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F); // Box 58
		bodyModel[142].setRotationPoint(0F, -47F, 0F);

		bodyModel[143].addShapeBox(-16F, -31.5F, -17F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[143].setRotationPoint(0F, -47F, 0F);

		bodyModel[144].addShapeBox(-16F, -30.5F, -21F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[144].setRotationPoint(0F, -47F, 0F);

		bodyModel[145].addShapeBox(-16F, -31.5F, -21F, 1, 1, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[145].setRotationPoint(0F, -47F, 0F);

		bodyModel[146].addShapeBox(-14F, -40.5F, -24F, 7, 10, 7, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 62
		bodyModel[146].setRotationPoint(0F, -47F, 0F);

		bodyModel[147].addShapeBox(-21F, -35.5F, -20F, 7, 1, 4, 0F,-0.3F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 63
		bodyModel[147].setRotationPoint(0F, -47F, 0F);

		bodyModel[148].addShapeBox(-21F, -34.5F, -20F, 7, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 64
		bodyModel[148].setRotationPoint(0F, -47F, 0F);

		bodyModel[149].addShapeBox(-21F, -32.5F, -20F, 7, 1, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -0.3F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, 0F, 1F); // Box 65
		bodyModel[149].setRotationPoint(0F, -47F, 0F);

		bodyModel[150].addShapeBox(-23F, -36F, -23F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 66
		bodyModel[150].setRotationPoint(0F, -47F, 0F);

		bodyModel[151].addShapeBox(-23F, -38F, -23F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[151].setRotationPoint(0F, -47F, 0F);

		bodyModel[152].addShapeBox(-23F, -39F, -23F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[152].setRotationPoint(0F, -47F, 0F);

		bodyModel[153].addShapeBox(-24F, -39F, -23F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[153].setRotationPoint(0F, -47F, 0F);

		bodyModel[154].addShapeBox(-24F, -38F, -23F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 70
		bodyModel[154].setRotationPoint(0F, -47F, 0F);

		bodyModel[155].addShapeBox(-24F, -36F, -23F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 71
		bodyModel[155].setRotationPoint(0F, -47F, 0F);

		bodyModel[156].addShapeBox(-14F, -40.5F, -25F, 7, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 72
		bodyModel[156].setRotationPoint(0F, -47F, 0F);

		bodyModel[157].addShapeBox(-14F, -40.5F, -27F, 7, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[157].setRotationPoint(0F, -47F, 0F);

		bodyModel[158].addShapeBox(-14F, -40.5F, -29F, 7, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[158].setRotationPoint(0F, -47F, 0F);

		bodyModel[159].addShapeBox(-14.5F, -42.5F, -29F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[159].setRotationPoint(0F, -47F, 0F);

		bodyModel[160].addShapeBox(-14.5F, -43.5F, -29F, 8, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[160].setRotationPoint(0F, -47F, 0F);

		bodyModel[161].addShapeBox(-13.5F, -44.5F, -29F, 6, 1, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[161].setRotationPoint(0F, -47F, 0F);

		bodyModel[162].addShapeBox(-15F, -41.5F, -20F, 9, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[162].setRotationPoint(0F, -47F, 0F);

		bodyModel[163].addShapeBox(-15F, -41.5F, -19F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[163].setRotationPoint(0F, -47F, 0F);

		bodyModel[164].addShapeBox(-15F, -17.5F, -42F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[164].setRotationPoint(0F, -47F, 0F);
		bodyModel[164].rotateAngleX = -0.78539816F;

		bodyModel[165].addShapeBox(-8F, -20.5F, -42F, 2, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[165].setRotationPoint(0F, -47F, 0F);
		bodyModel[165].rotateAngleX = -0.78539816F;

		bodyModel[166].addShapeBox(-15F, -20.5F, -42F, 6, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[166].setRotationPoint(0F, -47F, 0F);
		bodyModel[166].rotateAngleX = -0.78539816F;

		bodyModel[167].addShapeBox(-14F, -21.5F, -42F, 8, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[167].setRotationPoint(0F, -47F, 0F);
		bodyModel[167].rotateAngleX = -0.78539816F;

		bodyModel[168].addShapeBox(-10F, -21.5F, -40F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[168].setRotationPoint(0F, -47F, 0F);
		bodyModel[168].rotateAngleX = -0.78539816F;

		bodyModel[169].addShapeBox(18F, -12.7F, 4F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[169].setRotationPoint(0F, -47F, 0F);

		bodyModel[170].addShapeBox(18F, -12.7F, 2F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 86
		bodyModel[170].setRotationPoint(0F, -47F, 0F);

		bodyModel[171].addShapeBox(18F, -14.7F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 87
		bodyModel[171].setRotationPoint(0F, -47F, 0F);

		bodyModel[172].addShapeBox(7F, -10F, -13F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[172].setRotationPoint(0F, -47F, 0F);

		bodyModel[173].addShapeBox(7F, -6F, -11F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[173].setRotationPoint(0F, -47F, 0F);

		bodyModel[174].addShapeBox(7F, -8F, -13F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 90
		bodyModel[174].setRotationPoint(0F, -47F, 0F);

		bodyModel[175].addShapeBox(18F, -14.7F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[175].setRotationPoint(0F, -47F, 0F);

		bodyModel[176].addShapeBox(19F, -14.7F, -5F, 1, 3, 3, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Box 92
		bodyModel[176].setRotationPoint(0F, -47F, 0F);

		bodyModel[177].addShapeBox(20F, -14.2F, -4.5F, 1, 2, 2, 0F,0F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, 0F, -.2F, -.2F); // Box 93
		bodyModel[177].setRotationPoint(0F, -47F, 0F);

		bodyModel[178].addShapeBox(18F, -14.7F, -3F, 3, 1, 1, 0F,0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, 0F, 0F, -.5F, 0F); // Box 94
		bodyModel[178].setRotationPoint(0F, -47F, 0F);

		bodyModel[179].addShapeBox(18F, -12.7F, -3F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[179].setRotationPoint(0F, -47F, 0F);

		bodyModel[180].addShapeBox(18F, -12.7F, -5F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 96
		bodyModel[180].setRotationPoint(0F, -47F, 0F);

		bodyModel[181].addShapeBox(-6.5F, -17F, 7F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[181].setRotationPoint(0F, -47F, 0F);

		bodyModel[182].addShapeBox(10.5F, -14F, -2F, 1, 2, 4, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[182].setRotationPoint(0F, -47F, 0F);

		bodyModel[183].addShapeBox(11.5F, -17F, -3F, 1, 3, 6, 0F,-1F, 0F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[183].setRotationPoint(0F, -47F, 0F);

		bodyModel[184].addShapeBox(-6.5F, -25F, 5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[184].setRotationPoint(0F, -47F, 0F);

		bodyModel[185].addShapeBox(-6.5F, -25F, -10F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[185].setRotationPoint(0F, -47F, 0F);

		bodyModel[186].addShapeBox(-5.5F, -25F, -6F, 2, 11, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 102
		bodyModel[186].setRotationPoint(0F, -47F, 0F);

		bodyModel[187].addShapeBox(0F, -3F, 1F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[187].setRotationPoint(0F, -47F, 0F);

		bodyModel[188].addShapeBox(0F, -3F, -4F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[188].setRotationPoint(0F, -47F, 0F);

		bodyModel[189].addShapeBox(-6.5F, -17F, -11F, 17, 2, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[189].setRotationPoint(0F, -47F, 0F);

		bodyModel[190].addShapeBox(-7.5F, -35F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[190].setRotationPoint(0F, -47F, 0F);

		bodyModel[191].addShapeBox(-9F, -7F, 2F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[191].setRotationPoint(0F, -47F, 0F);

		bodyModel[192].addShapeBox(-11F, -7F, 2F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[192].setRotationPoint(0F, -47F, 0F);

		bodyModel[193].addShapeBox(-11F, -3F, 2F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[193].setRotationPoint(0F, -47F, 0F);

		bodyModel[194].addShapeBox(-11F, -6F, 2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[194].setRotationPoint(0F, -47F, 0F);

		bodyModel[195].addShapeBox(-11F, -6F, 6F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[195].setRotationPoint(0F, -47F, 0F);

		bodyModel[196].addShapeBox(-9F, -7F, -7F, 1, 5, 5, 0F,0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[196].setRotationPoint(0F, -47F, 0F);

		bodyModel[197].addShapeBox(-11F, -7F, -7F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[197].setRotationPoint(0F, -47F, 0F);

		bodyModel[198].addShapeBox(-11F, -6F, -3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[198].setRotationPoint(0F, -47F, 0F);

		bodyModel[199].addShapeBox(-11F, -3F, -7F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[199].setRotationPoint(0F, -47F, 0F);

		bodyModel[200].addShapeBox(-11F, -6F, -7F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[200].setRotationPoint(0F, -47F, 0F);

		bodyModel[201].addShapeBox(-15F, -43.5F, 29F, 9, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[201].setRotationPoint(0F, -47F, 0F);

		bodyModel[202].addShapeBox(-14F, -37.5F, 29F, 7, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[202].setRotationPoint(0F, -47F, 0F);

		bodyModel[203].addShapeBox(-12.5F, -35.5F, 29F, 4, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[203].setRotationPoint(0F, -47F, 0F);

		bodyModel[204].addShapeBox(-8F, -46.5F, 29F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[204].setRotationPoint(0F, -47F, 0F);

		bodyModel[205].addShapeBox(-14F, -44.5F, 29F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 125
		bodyModel[205].setRotationPoint(0F, -47F, 0F);

		bodyModel[206].addShapeBox(-12F, -45.5F, 29F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 126
		bodyModel[206].setRotationPoint(0F, -47F, 0F);

		bodyModel[207].addShapeBox(-8F, -45.5F, 29F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 127
		bodyModel[207].setRotationPoint(0F, -47F, 0F);

		bodyModel[208].addShapeBox(-7F, -42.5F, 31F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[208].setRotationPoint(0F, -47F, 0F);

		bodyModel[209].addShapeBox(-8F, -45.5F, 31F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2.5F, -2.5F, 0F, -2.5F); // Box 129
		bodyModel[209].setRotationPoint(0F, -47F, 0F);

		bodyModel[210].addShapeBox(-8F, -46.5F, 31F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[210].setRotationPoint(0F, -47F, 0F);

		bodyModel[211].addShapeBox(-13F, -41F, 31F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[211].setRotationPoint(0F, -47F, 0F);

		bodyModel[212].addShapeBox(-15F, -42.5F, 31F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[212].setRotationPoint(0F, -47F, 0F);

		bodyModel[213].addShapeBox(-13F, -43F, 31F, 5, 2, 8, 0F,0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[213].setRotationPoint(0F, -47F, 0F);

		bodyModel[214].addShapeBox(-13F, -44F, 34F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 2F, 0F, .3F, 2F, 0F, .3F, 2F, 0F, .3F, 2F); // Box 134
		bodyModel[214].setRotationPoint(0F, -47F, 0F);

		bodyModel[215].addShapeBox(-13F, -39F, 31F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 142
		bodyModel[215].setRotationPoint(0F, -47F, 0F);

		bodyModel[216].addShapeBox(-13F, -37F, 34F, 5, 1, 2, 0F,0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[216].setRotationPoint(0F, -47F, 0F);

		bodyModel[217].addShapeBox(-8F, -41F, 31F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 146
		bodyModel[217].setRotationPoint(0F, -47F, 0F);

		bodyModel[218].addShapeBox(-8F, -43F, 31F, 1, 2, 8, 0F,0F, -.3F, -1F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 147
		bodyModel[218].setRotationPoint(0F, -47F, 0F);

		bodyModel[219].addShapeBox(-8F, -44F, 34F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .3F, 2F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, .3F, 2F); // Box 148
		bodyModel[219].setRotationPoint(0F, -47F, 0F);

		bodyModel[220].addShapeBox(-8F, -39F, 31F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.3F, -1F); // Box 149
		bodyModel[220].setRotationPoint(0F, -47F, 0F);

		bodyModel[221].addShapeBox(-8F, -37F, 34F, 1, 1, 2, 0F,0F, 0.3F, 2F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[221].setRotationPoint(0F, -47F, 0F);

		bodyModel[222].addShapeBox(-13F, -38F, 34F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[222].setRotationPoint(0F, -47F, 0F);

		bodyModel[223].addShapeBox(-13F, -38F, 36F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 152
		bodyModel[223].setRotationPoint(0F, -47F, 0F);

		bodyModel[224].addShapeBox(-13.5F, -32F, 32F, 6, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 153
		bodyModel[224].setRotationPoint(0F, -47F, 0F);

		bodyModel[225].addShapeBox(-13.5F, -27F, 30F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[225].setRotationPoint(0F, -47F, 0F);

		bodyModel[226].addShapeBox(-13.5F, -20F, 30F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 155
		bodyModel[226].setRotationPoint(0F, -47F, 0F);

		bodyModel[227].addShapeBox(-13F, -38F, 32F, 5, 5, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[227].setRotationPoint(0F, -47F, 0F);

		bodyModel[228].addShapeBox(-13.5F, -33F, 32F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[228].setRotationPoint(0F, -47F, 0F);

		bodyModel[229].addShapeBox(-6.5F, -24F, 32F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 158
		bodyModel[229].setRotationPoint(0F, -47F, 0F);

		bodyModel[230].addShapeBox(-7.5F, -24F, 31F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 159
		bodyModel[230].setRotationPoint(0F, -47F, 0F);

		bodyModel[231].addShapeBox(-7.5F, -25F, 31F, 1, 1, 7, 0F,0F, .5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 161
		bodyModel[231].setRotationPoint(0F, -47F, 0F);

		bodyModel[232].addShapeBox(-6.5F, -25F, 32F, 1, 1, 5, 0F,0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 162
		bodyModel[232].setRotationPoint(0F, -47F, 0F);

		bodyModel[233].addShapeBox(-13F, -19F, 36F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[233].setRotationPoint(0F, -47F, 0F);

		bodyModel[234].addShapeBox(-13F, -16F, 36F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 164
		bodyModel[234].setRotationPoint(0F, -47F, 0F);

		bodyModel[235].addShapeBox(-13F, -19F, 31F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[235].setRotationPoint(0F, -47F, 0F);

		bodyModel[236].addShapeBox(-13F, -16F, 31F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 166
		bodyModel[236].setRotationPoint(0F, -47F, 0F);

		bodyModel[237].addShapeBox(-12F, -16.5F, 38F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[237].setRotationPoint(0F, -47F, 0F);

		bodyModel[238].addShapeBox(-12F, -17.5F, 38F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[238].setRotationPoint(0F, -47F, 0F);

		bodyModel[239].addShapeBox(-12F, -15.5F, 38F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		bodyModel[239].setRotationPoint(0F, -47F, 0F);

		bodyModel[240].addShapeBox(-14F, -37F, 34F, 1, 1, 2, 0F,0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[240].setRotationPoint(0F, -47F, 0F);

		bodyModel[241].addShapeBox(-14F, -39F, 31F, 1, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -2F); // Box 1
		bodyModel[241].setRotationPoint(0F, -47F, 0F);

		bodyModel[242].addShapeBox(-14F, -41F, 31F, 1, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[242].setRotationPoint(0F, -47F, 0F);

		bodyModel[243].addShapeBox(-14F, -43F, 31F, 1, 2, 8, 0F,0F, -0.5F, -2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[243].setRotationPoint(0F, -47F, 0F);

		bodyModel[244].addShapeBox(-14F, -44F, 34F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.5F, 1F); // Box 4
		bodyModel[244].setRotationPoint(0F, -47F, 0F);

		bodyModel[245].addShapeBox(-14.5F, -25F, 31F, 1, 1, 7, 0F,0F, 0F, -2.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[245].setRotationPoint(0F, -47F, 0F);

		bodyModel[246].addShapeBox(-15.5F, -25F, 32F, 1, 1, 5, 0F,-1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 6
		bodyModel[246].setRotationPoint(0F, -47F, 0F);

		bodyModel[247].addShapeBox(-14.5F, -24F, 31F, 1, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[247].setRotationPoint(0F, -47F, 0F);

		bodyModel[248].addShapeBox(-15.5F, -24F, 32F, 1, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 8
		bodyModel[248].setRotationPoint(0F, -47F, 0F);

		bodyModel[249].addShapeBox(-14F, -46.5F, 31F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[249].setRotationPoint(0F, -47F, 0F);

		bodyModel[250].addShapeBox(-14F, -46.5F, 29F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[250].setRotationPoint(0F, -47F, 0F);

		bodyModel[251].addShapeBox(-14F, -45.5F, 29F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 11
		bodyModel[251].setRotationPoint(0F, -47F, 0F);

		bodyModel[252].addShapeBox(-14F, -45.5F, 31F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -2.5F, 2F, 0F, -2.5F); // Box 12
		bodyModel[252].setRotationPoint(0F, -47F, 0F);

		bodyModel[253].addShapeBox(-12.5F, -35.5F, -31F, 4, 1, 2, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[253].setRotationPoint(0F, -47F, 0F);

		bodyModel[254].addShapeBox(-14F, -37.5F, -31F, 7, 2, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[254].setRotationPoint(0F, -47F, 0F);

		bodyModel[255].addShapeBox(-15F, -43.5F, -31F, 9, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[255].setRotationPoint(0F, -47F, 0F);

		bodyModel[256].addShapeBox(-14F, -44.5F, -31F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 16
		bodyModel[256].setRotationPoint(0F, -47F, 0F);

		bodyModel[257].addShapeBox(-12F, -45.5F, -31F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 17
		bodyModel[257].setRotationPoint(0F, -47F, 0F);

		bodyModel[258].addShapeBox(-8F, -45.5F, -31F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 18
		bodyModel[258].setRotationPoint(0F, -47F, 0F);

		bodyModel[259].addShapeBox(-8F, -46.5F, -31F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[259].setRotationPoint(0F, -47F, 0F);

		bodyModel[260].addShapeBox(-14F, -46.5F, -31F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[260].setRotationPoint(0F, -47F, 0F);

		bodyModel[261].addShapeBox(-14F, -45.5F, -31F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 21
		bodyModel[261].setRotationPoint(0F, -47F, 0F);

		bodyModel[262].addShapeBox(-7F, -42.5F, -35F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[262].setRotationPoint(0F, -47F, 0F);

		bodyModel[263].addShapeBox(-15F, -42.5F, -35F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[263].setRotationPoint(0F, -47F, 0F);

		bodyModel[264].addShapeBox(-14F, -45.5F, -35F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 24
		bodyModel[264].setRotationPoint(0F, -47F, 0F);

		bodyModel[265].addShapeBox(-14F, -46.5F, -35F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[265].setRotationPoint(0F, -47F, 0F);

		bodyModel[266].addShapeBox(-8F, -45.5F, -35F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 26
		bodyModel[266].setRotationPoint(0F, -47F, 0F);

		bodyModel[267].addShapeBox(-8F, -46.5F, -35F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[267].setRotationPoint(0F, -47F, 0F);

		bodyModel[268].addShapeBox(-8F, -37F, -36F, 1, 1, 2, 0F,0F, 0.3F, 2F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[268].setRotationPoint(0F, -47F, 0F);

		bodyModel[269].addShapeBox(-8F, -39F, -39F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.3F, -1F); // Box 29
		bodyModel[269].setRotationPoint(0F, -47F, 0F);

		bodyModel[270].addShapeBox(-8F, -41F, -39F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[270].setRotationPoint(0F, -47F, 0F);

		bodyModel[271].addShapeBox(-8F, -43F, -39F, 1, 2, 8, 0F,0F, -.3F, -1F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		bodyModel[271].setRotationPoint(0F, -47F, 0F);

		bodyModel[272].addShapeBox(-8F, -44F, -36F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .3F, 2F, 0F, .5F, 1F, 0F, .5F, 1F, 0F, .3F, 2F); // Box 32
		bodyModel[272].setRotationPoint(0F, -47F, 0F);

		bodyModel[273].addShapeBox(-13F, -44F, -36F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 2F, 0F, .3F, 2F, 0F, .3F, 2F, 0F, .3F, 2F); // Box 33
		bodyModel[273].setRotationPoint(0F, -47F, 0F);

		bodyModel[274].addShapeBox(-13F, -43F, -39F, 5, 2, 8, 0F,0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[274].setRotationPoint(0F, -47F, 0F);

		bodyModel[275].addShapeBox(-13F, -41F, -39F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[275].setRotationPoint(0F, -47F, 0F);

		bodyModel[276].addShapeBox(-13F, -39F, -39F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 36
		bodyModel[276].setRotationPoint(0F, -47F, 0F);

		bodyModel[277].addShapeBox(-13F, -37F, -36F, 5, 1, 2, 0F,0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[277].setRotationPoint(0F, -47F, 0F);

		bodyModel[278].addShapeBox(-14F, -37F, -36F, 1, 1, 2, 0F,0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 38
		bodyModel[278].setRotationPoint(0F, -47F, 0F);

		bodyModel[279].addShapeBox(-14F, -39F, -39F, 1, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -2F); // Box 39
		bodyModel[279].setRotationPoint(0F, -47F, 0F);

		bodyModel[280].addShapeBox(-14F, -44F, -36F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0.3F, 2F, 0F, 0.3F, 2F, 0F, 0.5F, 1F); // Box 40
		bodyModel[280].setRotationPoint(0F, -47F, 0F);

		bodyModel[281].addShapeBox(-14F, -43F, -39F, 1, 2, 8, 0F,0F, -0.5F, -2F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		bodyModel[281].setRotationPoint(0F, -47F, 0F);

		bodyModel[282].addShapeBox(-14F, -41F, -39F, 1, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 42
		bodyModel[282].setRotationPoint(0F, -47F, 0F);

		bodyModel[283].addShapeBox(-13F, -38F, -34F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 43
		bodyModel[283].setRotationPoint(0F, -47F, 0F);

		bodyModel[284].addShapeBox(-13F, -38F, -36F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[284].setRotationPoint(0F, -47F, 0F);

		bodyModel[285].addShapeBox(-13F, -38F, -38F, 5, 5, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[285].setRotationPoint(0F, -47F, 0F);

		bodyModel[286].addShapeBox(-13.5F, -33F, -38F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[286].setRotationPoint(0F, -47F, 0F);

		bodyModel[287].addShapeBox(-13.5F, -32F, -38F, 6, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 47
		bodyModel[287].setRotationPoint(0F, -47F, 0F);

		bodyModel[288].addShapeBox(-13.5F, -27F, -39F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[288].setRotationPoint(0F, -47F, 0F);

		bodyModel[289].addShapeBox(-13.5F, -20F, -39F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[289].setRotationPoint(0F, -47F, 0F);

		bodyModel[290].addShapeBox(-7.5F, -24F, -38F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 50
		bodyModel[290].setRotationPoint(0F, -47F, 0F);

		bodyModel[291].addShapeBox(-6.5F, -24F, -37F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 51
		bodyModel[291].setRotationPoint(0F, -47F, 0F);

		bodyModel[292].addShapeBox(-7.5F, -25F, -38F, 1, 1, 7, 0F,0F, .5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 52
		bodyModel[292].setRotationPoint(0F, -47F, 0F);

		bodyModel[293].addShapeBox(-6.5F, -25F, -37F, 1, 1, 5, 0F,0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 53
		bodyModel[293].setRotationPoint(0F, -47F, 0F);

		bodyModel[294].addShapeBox(-15.5F, -24F, -37F, 1, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 54
		bodyModel[294].setRotationPoint(0F, -47F, 0F);

		bodyModel[295].addShapeBox(-15.5F, -25F, -37F, 1, 1, 5, 0F,-1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 55
		bodyModel[295].setRotationPoint(0F, -47F, 0F);

		bodyModel[296].addShapeBox(-14.5F, -25F, -38F, 1, 1, 7, 0F,0F, 0F, -2.5F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 56
		bodyModel[296].setRotationPoint(0F, -47F, 0F);

		bodyModel[297].addShapeBox(-14.5F, -24F, -38F, 1, 5, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 57
		bodyModel[297].setRotationPoint(0F, -47F, 0F);

		bodyModel[298].addShapeBox(-12F, -17.5F, -39F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[298].setRotationPoint(0F, -47F, 0F);

		bodyModel[299].addShapeBox(-12F, -16.5F, -39F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[299].setRotationPoint(0F, -47F, 0F);

		bodyModel[300].addShapeBox(-12F, -15.5F, -39F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[300].setRotationPoint(0F, -47F, 0F);

		bodyModel[301].addShapeBox(-13F, -19F, -33F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[301].setRotationPoint(0F, -47F, 0F);

		bodyModel[302].addShapeBox(-13F, -16F, -33F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		bodyModel[302].setRotationPoint(0F, -47F, 0F);

		bodyModel[303].addShapeBox(-13F, -19F, -38F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[303].setRotationPoint(0F, -47F, 0F);

		bodyModel[304].addShapeBox(-13F, -16F, -38F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 43
		bodyModel[304].setRotationPoint(0F, -47F, 0F);

		bodyModel[305].addShapeBox(-13F, -35F, 16F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[305].setRotationPoint(0F, -47F, 0F);

		bodyModel[306].addShapeBox(-13F, -35F, -18F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[306].setRotationPoint(0F, -47F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 8, 401, textureX, textureY); // Box 65
		hipsModel[1] = new ModelRendererTurbo(this, 8, 428, textureX, textureY); // Box 68
		hipsModel[2] = new ModelRendererTurbo(this, 8, 468, textureX, textureY); // Box 71
		hipsModel[3] = new ModelRendererTurbo(this, 8, 479, textureX, textureY); // Box 72
		hipsModel[4] = new ModelRendererTurbo(this, 8, 455, textureX, textureY); // Box 77
		hipsModel[5] = new ModelRendererTurbo(this, 8, 468, textureX, textureY); // Box 78
		hipsModel[6] = new ModelRendererTurbo(this, 77, 406, textureX, textureY); // Box 82
		hipsModel[7] = new ModelRendererTurbo(this, 63, 459, textureX, textureY); // Box 83
		hipsModel[8] = new ModelRendererTurbo(this, 77, 434, textureX, textureY); // Box 85
		hipsModel[9] = new ModelRendererTurbo(this, 77, 426, textureX, textureY); // Box 86
		hipsModel[10] = new ModelRendererTurbo(this, 77, 426, textureX, textureY); // Box 87
		hipsModel[11] = new ModelRendererTurbo(this, 99, 426, textureX, textureY); // Box 89
		hipsModel[12] = new ModelRendererTurbo(this, 99, 434, textureX, textureY); // Box 90
		hipsModel[13] = new ModelRendererTurbo(this, 99, 442, textureX, textureY); // Box 91
		hipsModel[14] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 92
		hipsModel[15] = new ModelRendererTurbo(this, 99, 418, textureX, textureY); // Box 93
		hipsModel[16] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 94
		hipsModel[17] = new ModelRendererTurbo(this, 99, 450, textureX, textureY); // Box 95
		hipsModel[18] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 96
		hipsModel[19] = new ModelRendererTurbo(this, 118, 442, textureX, textureY); // Box 97
		hipsModel[20] = new ModelRendererTurbo(this, 117, 434, textureX, textureY); // Box 98
		hipsModel[21] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 99
		hipsModel[22] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 100
		hipsModel[23] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 101
		hipsModel[24] = new ModelRendererTurbo(this, 8, 468, textureX, textureY); // Box 102
		hipsModel[25] = new ModelRendererTurbo(this, 8, 479, textureX, textureY); // Box 103
		hipsModel[26] = new ModelRendererTurbo(this, 8, 468, textureX, textureY); // Box 104
		hipsModel[27] = new ModelRendererTurbo(this, 63, 459, textureX, textureY); // Box 105
		hipsModel[28] = new ModelRendererTurbo(this, 77, 406, textureX, textureY); // Box 107
		hipsModel[29] = new ModelRendererTurbo(this, 77, 426, textureX, textureY); // Box 108
		hipsModel[30] = new ModelRendererTurbo(this, 77, 434, textureX, textureY); // Box 109
		hipsModel[31] = new ModelRendererTurbo(this, 77, 426, textureX, textureY); // Box 110
		hipsModel[32] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 111
		hipsModel[33] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 112
		hipsModel[34] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 113
		hipsModel[35] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 114
		hipsModel[36] = new ModelRendererTurbo(this, 118, 442, textureX, textureY); // Box 115
		hipsModel[37] = new ModelRendererTurbo(this, 117, 434, textureX, textureY); // Box 116
		hipsModel[38] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 117
		hipsModel[39] = new ModelRendererTurbo(this, 99, 418, textureX, textureY); // Box 118
		hipsModel[40] = new ModelRendererTurbo(this, 99, 426, textureX, textureY); // Box 119
		hipsModel[41] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 120
		hipsModel[42] = new ModelRendererTurbo(this, 118, 442, textureX, textureY); // Box 121
		hipsModel[43] = new ModelRendererTurbo(this, 117, 434, textureX, textureY); // Box 122
		hipsModel[44] = new ModelRendererTurbo(this, 118, 442, textureX, textureY); // Box 123
		hipsModel[45] = new ModelRendererTurbo(this, 117, 434, textureX, textureY); // Box 124
		hipsModel[46] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 125
		hipsModel[47] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 126
		hipsModel[48] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 127
		hipsModel[49] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 128
		hipsModel[50] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 129
		hipsModel[51] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 130
		hipsModel[52] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 131
		hipsModel[53] = new ModelRendererTurbo(this, 99, 450, textureX, textureY); // Box 132
		hipsModel[54] = new ModelRendererTurbo(this, 99, 442, textureX, textureY); // Box 133
		hipsModel[55] = new ModelRendererTurbo(this, 115, 418, textureX, textureY); // Box 134
		hipsModel[56] = new ModelRendererTurbo(this, 99, 434, textureX, textureY); // Box 135
		hipsModel[57] = new ModelRendererTurbo(this, 77, 406, textureX, textureY); // Box 87
		hipsModel[58] = new ModelRendererTurbo(this, 77, 406, textureX, textureY); // Box 88

		hipsModel[0].addShapeBox(-10F, 0F, -10F, 20, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 65
		hipsModel[0].setRotationPoint(0F, -47F, 0F);

		hipsModel[1].addShapeBox(-10F, 3F, -9.5F, 20, 5, 19, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 68
		hipsModel[1].setRotationPoint(0F, -47F, 0F);

		hipsModel[2].addShapeBox(-10F, 8F, -10F, 20, 1, 7, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 71
		hipsModel[2].setRotationPoint(0F, -47F, 0F);

		hipsModel[3].addShapeBox(-10F, 9F, -10F, 20, 2, 7, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 72
		hipsModel[3].setRotationPoint(0F, -47F, 0F);

		hipsModel[4].addShapeBox(-10F, 8F, -2.5F, 20, 4, 5, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F); // Box 77
		hipsModel[4].setRotationPoint(0F, -47F, 0F);

		hipsModel[5].addShapeBox(-10F, 11F, -10F, 20, 1, 7, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 78
		hipsModel[5].setRotationPoint(0F, -47F, 0F);

		hipsModel[6].addShapeBox(-10.5F, 2F, 9.5F, 21, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 82
		hipsModel[6].setRotationPoint(0F, -47F, 0F);

		hipsModel[7].addShapeBox(-10F, 8F, -3.5F, 20, 4, 1, 0F,.3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F); // Box 83
		hipsModel[7].setRotationPoint(0F, -47F, 0F);

		hipsModel[8].addShapeBox(-2F, 4.5F, 10.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[8].setRotationPoint(0F, -47F, 0F);

		hipsModel[9].addShapeBox(-2F, 3.5F, 10.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[9].setRotationPoint(0F, -47F, 0F);

		hipsModel[10].addShapeBox(-2F, 6.5F, 10.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 87
		hipsModel[10].setRotationPoint(0F, -47F, 0F);

		hipsModel[11].addShapeBox(9.5F, 2F, -2F, 2, 2, 4, 0F,-.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 89
		hipsModel[11].setRotationPoint(0F, -47F, 0F);

		hipsModel[12].addShapeBox(10F, 4F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[12].setRotationPoint(0F, -47F, 0F);

		hipsModel[13].addShapeBox(9.5F, 7F, -2F, 2, 1, 4, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F); // Box 91
		hipsModel[13].setRotationPoint(0F, -47F, 0F);

		hipsModel[14].addShapeBox(10F, 7.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		hipsModel[14].setRotationPoint(0F, -47F, 0F);

		hipsModel[15].addShapeBox(9.5F, 1F, -2.5F, 2, 1, 5, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 93
		hipsModel[15].setRotationPoint(0F, -47F, 0F);

		hipsModel[16].addShapeBox(10F, 8.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 94
		hipsModel[16].setRotationPoint(0F, -47F, 0F);

		hipsModel[17].addShapeBox(9.5F, 8F, -2F, 2, 1, 4, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F); // Box 95
		hipsModel[17].setRotationPoint(0F, -47F, 0F);

		hipsModel[18].addShapeBox(10F, 1.5F, 1.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		hipsModel[18].setRotationPoint(0F, -47F, 0F);

		hipsModel[19].addShapeBox(10F, 1F, 6.5F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		hipsModel[19].setRotationPoint(0F, -47F, 0F);

		hipsModel[20].addShapeBox(10F, 1F, 7.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 98
		hipsModel[20].setRotationPoint(0F, -47F, 0F);

		hipsModel[21].addShapeBox(10F, 8F, 1.5F, 1, 1, 3, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // Box 99
		hipsModel[21].setRotationPoint(0F, -47F, 0F);

		hipsModel[22].addShapeBox(10F, 7F, 4.5F, 1, 1, 3, 0F,-.2F, -3F, 0F, -.2F, -3F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 3F, 0F, -.2F, 3F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 100
		hipsModel[22].setRotationPoint(0F, -47F, 0F);

		hipsModel[23].addShapeBox(10F, 3F, 7.5F, 1, 5, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F); // Box 101
		hipsModel[23].setRotationPoint(0F, -47F, 0F);

		hipsModel[24].addShapeBox(-10F, 8F, 3F, 20, 1, 7, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 102
		hipsModel[24].setRotationPoint(0F, -47F, 0F);

		hipsModel[25].addShapeBox(-10F, 9F, 3F, 20, 2, 7, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 103
		hipsModel[25].setRotationPoint(0F, -47F, 0F);

		hipsModel[26].addShapeBox(-10F, 11F, 3F, 20, 1, 7, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 104
		hipsModel[26].setRotationPoint(0F, -47F, 0F);

		hipsModel[27].addShapeBox(-10F, 8F, 2.5F, 20, 4, 1, 0F,.3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F, .3F, .2F, .2F); // Box 105
		hipsModel[27].setRotationPoint(0F, -47F, 0F);

		hipsModel[28].addShapeBox(-10.5F, 2F, -10.5F, 21, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		hipsModel[28].setRotationPoint(0F, -47F, 0F);

		hipsModel[29].addShapeBox(-2F, 3.5F, -12.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		hipsModel[29].setRotationPoint(0F, -47F, 0F);

		hipsModel[30].addShapeBox(-2F, 4.5F, -12.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		hipsModel[30].setRotationPoint(0F, -47F, 0F);

		hipsModel[31].addShapeBox(-2F, 6.5F, -12.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 110
		hipsModel[31].setRotationPoint(0F, -47F, 0F);

		hipsModel[32].addShapeBox(10F, 1.5F, -6.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		hipsModel[32].setRotationPoint(0F, -47F, 0F);

		hipsModel[33].addShapeBox(10F, 8F, -4.5F, 1, 1, 3, 0F,-0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 112
		hipsModel[33].setRotationPoint(0F, -47F, 0F);

		hipsModel[34].addShapeBox(10F, 7F, -7.5F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 3F, 0F, -0.2F, 3F, 0F); // Box 113
		hipsModel[34].setRotationPoint(0F, -47F, 0F);

		hipsModel[35].addShapeBox(10F, 3F, -8.5F, 1, 5, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 114
		hipsModel[35].setRotationPoint(0F, -47F, 0F);

		hipsModel[36].addShapeBox(10F, 1F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 115
		hipsModel[36].setRotationPoint(0F, -47F, 0F);

		hipsModel[37].addShapeBox(10F, 1F, -9.5F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		hipsModel[37].setRotationPoint(0F, -47F, 0F);

		hipsModel[38].addShapeBox(-11F, 1.5F, -6.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		hipsModel[38].setRotationPoint(0F, -47F, 0F);

		hipsModel[39].addShapeBox(-11.5F, 1F, -2.5F, 2, 1, 5, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 118
		hipsModel[39].setRotationPoint(0F, -47F, 0F);

		hipsModel[40].addShapeBox(-11.5F, 2F, -2F, 2, 2, 4, 0F,-.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, .5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 119
		hipsModel[40].setRotationPoint(0F, -47F, 0F);

		hipsModel[41].addShapeBox(-11F, 1.5F, 1.5F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		hipsModel[41].setRotationPoint(0F, -47F, 0F);

		hipsModel[42].addShapeBox(-11F, 1F, 6.5F, 1, 3, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		hipsModel[42].setRotationPoint(0F, -47F, 0F);

		hipsModel[43].addShapeBox(-11F, 1F, 7.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 122
		hipsModel[43].setRotationPoint(0F, -47F, 0F);

		hipsModel[44].addShapeBox(-11F, 1F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		hipsModel[44].setRotationPoint(0F, -47F, 0F);

		hipsModel[45].addShapeBox(-11F, 1F, -9.5F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		hipsModel[45].setRotationPoint(0F, -47F, 0F);

		hipsModel[46].addShapeBox(-11F, 3F, -8.5F, 1, 5, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 125
		hipsModel[46].setRotationPoint(0F, -47F, 0F);

		hipsModel[47].addShapeBox(-11F, 7F, -7.5F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 3F, 0F, -0.2F, 3F, 0F); // Box 126
		hipsModel[47].setRotationPoint(0F, -47F, 0F);

		hipsModel[48].addShapeBox(-11F, 8F, -4.5F, 1, 1, 3, 0F,-0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 127
		hipsModel[48].setRotationPoint(0F, -47F, 0F);

		hipsModel[49].addShapeBox(-11F, 8F, 1.5F, 1, 1, 3, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // Box 128
		hipsModel[49].setRotationPoint(0F, -47F, 0F);

		hipsModel[50].addShapeBox(-11F, 7F, 4.5F, 1, 1, 3, 0F,-.2F, -3F, 0F, -.2F, -3F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 3F, 0F, -.2F, 3F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 129
		hipsModel[50].setRotationPoint(0F, -47F, 0F);

		hipsModel[51].addShapeBox(-11F, 3F, 7.5F, 1, 5, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F); // Box 130
		hipsModel[51].setRotationPoint(0F, -47F, 0F);

		hipsModel[52].addShapeBox(-11F, 8.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 131
		hipsModel[52].setRotationPoint(0F, -47F, 0F);

		hipsModel[53].addShapeBox(-11.5F, 8F, -2F, 2, 1, 4, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F); // Box 132
		hipsModel[53].setRotationPoint(0F, -47F, 0F);

		hipsModel[54].addShapeBox(-11.5F, 7F, -2F, 2, 1, 4, 0F,-.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F); // Box 133
		hipsModel[54].setRotationPoint(0F, -47F, 0F);

		hipsModel[55].addShapeBox(-11F, 7.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		hipsModel[55].setRotationPoint(0F, -47F, 0F);

		hipsModel[56].addShapeBox(-11F, 4F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		hipsModel[56].setRotationPoint(0F, -47F, 0F);

		hipsModel[57].addShapeBox(-10.5F, 2F, -9.5F, 21, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 87
		hipsModel[57].setRotationPoint(0F, -47F, 0F);

		hipsModel[58].addShapeBox(-10.5F, 2F, 8.5F, 21, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		hipsModel[58].setRotationPoint(0F, -47F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 148, 38, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 134, 38, textureX, textureY); // Box 0
		leftArmModel[2] = new ModelRendererTurbo(this, 134, 38, textureX, textureY); // Box 1
		leftArmModel[3] = new ModelRendererTurbo(this, 168, 56, textureX, textureY); // Box 2
		leftArmModel[4] = new ModelRendererTurbo(this, 161, 38, textureX, textureY); // Box 3
		leftArmModel[5] = new ModelRendererTurbo(this, 134, 56, textureX, textureY); // Box 0
		leftArmModel[6] = new ModelRendererTurbo(this, 163, 45, textureX, textureY); // Box 1
		leftArmModel[7] = new ModelRendererTurbo(this, 168, 77, textureX, textureY); // Box 2
		leftArmModel[8] = new ModelRendererTurbo(this, 134, 77, textureX, textureY); // Box 3
		leftArmModel[9] = new ModelRendererTurbo(this, 134, 103, textureX, textureY); // Box 6
		leftArmModel[10] = new ModelRendererTurbo(this, 159, 103, textureX, textureY); // Box 7
		leftArmModel[11] = new ModelRendererTurbo(this, 134, 94, textureX, textureY); // Box 8
		leftArmModel[12] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 9
		leftArmModel[13] = new ModelRendererTurbo(this, 134, 112, textureX, textureY); // Box 10
		leftArmModel[14] = new ModelRendererTurbo(this, 134, 124, textureX, textureY); // Box 11
		leftArmModel[15] = new ModelRendererTurbo(this, 134, 135, textureX, textureY); // Box 14
		leftArmModel[16] = new ModelRendererTurbo(this, 166, 146, textureX, textureY); // Box 15
		leftArmModel[17] = new ModelRendererTurbo(this, 168, 140, textureX, textureY); // Box 16
		leftArmModel[18] = new ModelRendererTurbo(this, 170, 155, textureX, textureY); // Box 17
		leftArmModel[19] = new ModelRendererTurbo(this, 170, 155, textureX, textureY); // Box 18
		leftArmModel[20] = new ModelRendererTurbo(this, 166, 121, textureX, textureY); // Box 19
		leftArmModel[21] = new ModelRendererTurbo(this, 166, 130, textureX, textureY); // Box 20
		leftArmModel[22] = new ModelRendererTurbo(this, 137, 148, textureX, textureY); // Box 21
		leftArmModel[23] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 22
		leftArmModel[24] = new ModelRendererTurbo(this, 137, 168, textureX, textureY); // Box 24
		leftArmModel[25] = new ModelRendererTurbo(this, 137, 176, textureX, textureY); // Box 25
		leftArmModel[26] = new ModelRendererTurbo(this, 137, 155, textureX, textureY); // Box 27
		leftArmModel[27] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 28
		leftArmModel[28] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 29
		leftArmModel[29] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 30
		leftArmModel[30] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 31
		leftArmModel[31] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 32
		leftArmModel[32] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 33
		leftArmModel[33] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 34
		leftArmModel[34] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 35
		leftArmModel[35] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 36
		leftArmModel[36] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 37
		leftArmModel[37] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 38
		leftArmModel[38] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 39
		leftArmModel[39] = new ModelRendererTurbo(this, 161, 38, textureX, textureY); // Box 44
		leftArmModel[40] = new ModelRendererTurbo(this, 163, 45, textureX, textureY); // Box 45
		leftArmModel[41] = new ModelRendererTurbo(this, 159, 103, textureX, textureY); // Box 62
		leftArmModel[42] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 63

		leftArmModel[0].addShapeBox(-1F, -3F, -1.5F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(1F, -3F, -1.5F, 2, 9, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-3F, -3F, -1.5F, 2, 9, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-3.5F, 5F, -4.5F, 4, 9, 9, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0.5F, 3F, 1.5F, 3, 2, 2, 0F,0F, .5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .5F, .5F, 0F, .3F, .5F); // Box 3
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-4.5F, 5F, -3.5F, 8, 9, 7, 0F,-.5F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, -.5F, 0F, .5F, -.5F, 0F, 0F, 1.5F, 0F, -.5F, 1.5F, 0F, -.5F, -.5F, 0F, 0F); // Box 0
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-3.5F, 3F, 1.5F, 4, 2, 3, 0F,-1.5F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 1
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-3.5F, 14F, -4.5F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 2
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-4.5F, 14F, -3.5F, 8, 5, 7, 0F,-.5F, 0F, 0F, 1.5F, 0F, -.5F, 1.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F); // Box 3
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-4.5F, 20F, -1.5F, 8, 1, 3, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 6
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-4.5F, 20F, 2F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 7
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-4.5F, 19F, -1.5F, 8, 1, 3, 0F,-.5F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 8
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-4.5F, 19F, 2F, 8, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -3F, 0F, -.5F, -3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 9
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-4F, 21F, -2F, 7, 1, 5, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-5F, 22F, -2F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-5F, 25F, 0F, 9, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-5F, 25F, -2F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(-3F, 21F, -3F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(-3F, 22F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(1F, 22F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-5F, 21.8F, 2.5F, 9, 5, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 19
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(-5F, 26.8F, 2.5F, 9, 5, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 20
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(2F, 25F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(2F, 27F, -4F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, -.5F, 0F, 0F, -.5F); // Box 22
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(1F, 30F, -4.5F, 3, 2, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F); // Box 24
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-1F, 29F, -4.5F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F); // Box 25
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(2F, 27F, -3F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(1.65F, 32.5F, -2F, 2, 2, 4, 0F,0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 28
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(1.65F, 30.5F, -4F, 2, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 29
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(1.65F, 28.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(-0.45F, 29F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(-0.45F, 33F, -2F, 2, 2, 4, 0F,0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 32
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(-0.45F, 31F, -4F, 2, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 33
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(-2.55F, 28.5F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(-2.55F, 32.5F, -2F, 2, 2, 4, 0F,0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 35
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(-2.55F, 30.5F, -4F, 2, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 36
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(-4.65F, 28.2F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(-4.65F, 32.2F, -2F, 2, 2, 4, 0F,0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 38
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(-4.65F, 30.2F, -4F, 2, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 39
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(0.5F, 3F, -3.5F, 3, 2, 2, 0F,0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 44
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(-3.5F, 3F, -4.5F, 4, 2, 3, 0F,-1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(-4.5F, 20F, -4F, 8, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(-4.5F, 19F, -4F, 8, 1, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 148, 38, textureX, textureY); // Box 46
		rightArmModel[1] = new ModelRendererTurbo(this, 134, 38, textureX, textureY); // Box 47
		rightArmModel[2] = new ModelRendererTurbo(this, 134, 38, textureX, textureY); // Box 48
		rightArmModel[3] = new ModelRendererTurbo(this, 163, 45, textureX, textureY); // Box 49
		rightArmModel[4] = new ModelRendererTurbo(this, 161, 38, textureX, textureY); // Box 50
		rightArmModel[5] = new ModelRendererTurbo(this, 134, 56, textureX, textureY); // Box 51
		rightArmModel[6] = new ModelRendererTurbo(this, 168, 56, textureX, textureY); // Box 52
		rightArmModel[7] = new ModelRendererTurbo(this, 163, 45, textureX, textureY); // Box 53
		rightArmModel[8] = new ModelRendererTurbo(this, 161, 38, textureX, textureY); // Box 54
		rightArmModel[9] = new ModelRendererTurbo(this, 168, 77, textureX, textureY); // Box 55
		rightArmModel[10] = new ModelRendererTurbo(this, 134, 77, textureX, textureY); // Box 56
		rightArmModel[11] = new ModelRendererTurbo(this, 134, 94, textureX, textureY); // Box 57
		rightArmModel[12] = new ModelRendererTurbo(this, 134, 103, textureX, textureY); // Box 58
		rightArmModel[13] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 59
		rightArmModel[14] = new ModelRendererTurbo(this, 159, 103, textureX, textureY); // Box 60
		rightArmModel[15] = new ModelRendererTurbo(this, 134, 112, textureX, textureY); // Box 61
		rightArmModel[16] = new ModelRendererTurbo(this, 159, 103, textureX, textureY); // Box 64
		rightArmModel[17] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 65
		rightArmModel[18] = new ModelRendererTurbo(this, 134, 124, textureX, textureY); // Box 67
		rightArmModel[19] = new ModelRendererTurbo(this, 166, 121, textureX, textureY); // Box 68
		rightArmModel[20] = new ModelRendererTurbo(this, 166, 130, textureX, textureY); // Box 69
		rightArmModel[21] = new ModelRendererTurbo(this, 137, 148, textureX, textureY); // Box 70
		rightArmModel[22] = new ModelRendererTurbo(this, 170, 155, textureX, textureY); // Box 71
		rightArmModel[23] = new ModelRendererTurbo(this, 168, 140, textureX, textureY); // Box 72
		rightArmModel[24] = new ModelRendererTurbo(this, 170, 155, textureX, textureY); // Box 73
		rightArmModel[25] = new ModelRendererTurbo(this, 137, 155, textureX, textureY); // Box 74
		rightArmModel[26] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 75
		rightArmModel[27] = new ModelRendererTurbo(this, 166, 146, textureX, textureY); // Box 76
		rightArmModel[28] = new ModelRendererTurbo(this, 137, 168, textureX, textureY); // Box 77
		rightArmModel[29] = new ModelRendererTurbo(this, 137, 176, textureX, textureY); // Box 78
		rightArmModel[30] = new ModelRendererTurbo(this, 134, 135, textureX, textureY); // Box 79
		rightArmModel[31] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 80
		rightArmModel[32] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 81
		rightArmModel[33] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 82
		rightArmModel[34] = new ModelRendererTurbo(this, 153, 148, textureX, textureY); // Box 83
		rightArmModel[35] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 84
		rightArmModel[36] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 85
		rightArmModel[37] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 86
		rightArmModel[38] = new ModelRendererTurbo(this, 153, 156, textureX, textureY); // Box 87
		rightArmModel[39] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 88
		rightArmModel[40] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 89
		rightArmModel[41] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 90
		rightArmModel[42] = new ModelRendererTurbo(this, 153, 164, textureX, textureY); // Box 91

		rightArmModel[0].addShapeBox(-1F, -3F, -1.5F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(1F, -3F, -1.5F, 2, 9, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -3F, -1.5F, 2, 9, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.5F, 3F, 1.5F, 4, 2, 3, 0F,-1.5F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 49
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(0.5F, 3F, 1.5F, 3, 2, 2, 0F,0F, .5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .5F, .5F, 0F, .3F, .5F); // Box 50
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4.5F, 5F, -3.5F, 8, 9, 7, 0F,-.5F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, -.5F, 0F, .5F, -.5F, 0F, 0F, 1.5F, 0F, -.5F, 1.5F, 0F, -.5F, -.5F, 0F, 0F); // Box 51
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.5F, 5F, -4.5F, 4, 9, 9, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.5F, 3F, -4.5F, 4, 2, 3, 0F,-1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(0.5F, 3F, -3.5F, 3, 2, 2, 0F,0F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 54
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.5F, 14F, -4.5F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 55
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-4.5F, 14F, -3.5F, 8, 5, 7, 0F,-.5F, 0F, 0F, 1.5F, 0F, -.5F, 1.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F); // Box 56
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-4.5F, 19F, -1.5F, 8, 1, 3, 0F,-.5F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 57
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-4.5F, 20F, -1.5F, 8, 1, 3, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 58
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-4.5F, 19F, 2F, 8, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -3F, 0F, -.5F, -3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 59
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-4.5F, 20F, 2F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-4F, 21F, -3F, 7, 1, 5, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-4.5F, 20F, -4F, 8, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-4.5F, 19F, -4F, 8, 1, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-5F, 22F, -3F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-5F, 21.8F, -3.5F, 9, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 68
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-5F, 26.8F, -3.5F, 9, 5, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 69
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(2F, 25F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 70
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-3F, 22F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-3F, 21F, 2F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(1F, 22F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(2F, 27F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(2F, 27F, 2F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 75
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-5F, 25F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(1F, 30F, 2.5F, 3, 2, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F); // Box 77
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-1F, 29F, 2.5F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F); // Box 78
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-5F, 25F, -3F, 9, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-4.65F, 28.2F, -2F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 80
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-2.55F, 28.5F, -2F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-0.45F, 29F, -2F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 82
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(1.65F, 28.5F, -2F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 83
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-4.65F, 32.2F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 84
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-2.55F, 32.5F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 85
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-0.45F, 33F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 86
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(1.65F, 32.5F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 87
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-4.65F, 30.2F, 2F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 88
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-2.55F, 30.5F, 2F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 89
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(-0.45F, 31F, 2F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 90
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(1.65F, 30.5F, 2F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 91
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 165, 224, textureX, textureY); // Box 94
		leftLegModel[1] = new ModelRendererTurbo(this, 119, 224, textureX, textureY); // Box 97
		leftLegModel[2] = new ModelRendererTurbo(this, 168, 246, textureX, textureY); // Box 99
		leftLegModel[3] = new ModelRendererTurbo(this, 127, 243, textureX, textureY); // Box 100
		leftLegModel[4] = new ModelRendererTurbo(this, 148, 210, textureX, textureY); // Box 112
		leftLegModel[5] = new ModelRendererTurbo(this, 212, 241, textureX, textureY); // Box 119
		leftLegModel[6] = new ModelRendererTurbo(this, 211, 258, textureX, textureY); // Box 120
		leftLegModel[7] = new ModelRendererTurbo(this, 136, 258, textureX, textureY); // Box 121
		leftLegModel[8] = new ModelRendererTurbo(this, 136, 272, textureX, textureY); // Box 123
		leftLegModel[9] = new ModelRendererTurbo(this, 220, 297, textureX, textureY); // Box 124
		leftLegModel[10] = new ModelRendererTurbo(this, 120, 193, textureX, textureY); // Box 125
		leftLegModel[11] = new ModelRendererTurbo(this, 152, 193, textureX, textureY); // Box 126
		leftLegModel[12] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 127
		leftLegModel[13] = new ModelRendererTurbo(this, 119, 210, textureX, textureY); // Box 128
		leftLegModel[14] = new ModelRendererTurbo(this, 152, 193, textureX, textureY); // Box 129
		leftLegModel[15] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 130
		leftLegModel[16] = new ModelRendererTurbo(this, 163, 302, textureX, textureY); // Box 131
		leftLegModel[17] = new ModelRendererTurbo(this, 132, 302, textureX, textureY); // Box 134
		leftLegModel[18] = new ModelRendererTurbo(this, 128, 318, textureX, textureY); // Box 135
		leftLegModel[19] = new ModelRendererTurbo(this, 177, 318, textureX, textureY); // Box 136
		leftLegModel[20] = new ModelRendererTurbo(this, 165, 337, textureX, textureY); // Box 137
		leftLegModel[21] = new ModelRendererTurbo(this, 151, 368, textureX, textureY); // Box 138
		leftLegModel[22] = new ModelRendererTurbo(this, 186, 402, textureX, textureY); // Box 139
		leftLegModel[23] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 140
		leftLegModel[24] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 143
		leftLegModel[25] = new ModelRendererTurbo(this, 165, 351, textureX, textureY); // Box 144
		leftLegModel[26] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 145
		leftLegModel[27] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 146
		leftLegModel[28] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 147
		leftLegModel[29] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 148
		leftLegModel[30] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 149
		leftLegModel[31] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 150
		leftLegModel[32] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 151
		leftLegModel[33] = new ModelRendererTurbo(this, 180, 368, textureX, textureY); // Box 152
		leftLegModel[34] = new ModelRendererTurbo(this, 130, 398, textureX, textureY); // Box 153
		leftLegModel[35] = new ModelRendererTurbo(this, 167, 417, textureX, textureY); // Box 154
		leftLegModel[36] = new ModelRendererTurbo(this, 124, 382, textureX, textureY); // Box 155
		leftLegModel[37] = new ModelRendererTurbo(this, 124, 390, textureX, textureY); // Box 156
		leftLegModel[38] = new ModelRendererTurbo(this, 153, 381, textureX, textureY); // Box 157
		leftLegModel[39] = new ModelRendererTurbo(this, 136, 428, textureX, textureY); // Box 158
		leftLegModel[40] = new ModelRendererTurbo(this, 136, 416, textureX, textureY); // Box 159
		leftLegModel[41] = new ModelRendererTurbo(this, 136, 416, textureX, textureY); // Box 160
		leftLegModel[42] = new ModelRendererTurbo(this, 192, 424, textureX, textureY); // Box 161
		leftLegModel[43] = new ModelRendererTurbo(this, 161, 432, textureX, textureY); // Box 162
		leftLegModel[44] = new ModelRendererTurbo(this, 159, 453, textureX, textureY); // Box 163
		leftLegModel[45] = new ModelRendererTurbo(this, 139, 448, textureX, textureY); // Box 164
		leftLegModel[46] = new ModelRendererTurbo(this, 115, 461, textureX, textureY); // Box 166
		leftLegModel[47] = new ModelRendererTurbo(this, 138, 468, textureX, textureY); // Box 167
		leftLegModel[48] = new ModelRendererTurbo(this, 160, 472, textureX, textureY); // Box 168
		leftLegModel[49] = new ModelRendererTurbo(this, 123, 444, textureX, textureY); // Box 169
		leftLegModel[50] = new ModelRendererTurbo(this, 123, 444, textureX, textureY); // Box 170
		leftLegModel[51] = new ModelRendererTurbo(this, 130, 337, textureX, textureY); // Box 171
		leftLegModel[52] = new ModelRendererTurbo(this, 158, 398, textureX, textureY); // Box 172
		leftLegModel[53] = new ModelRendererTurbo(this, 211, 273, textureX, textureY); // Box 0
		leftLegModel[54] = new ModelRendererTurbo(this, 178, 273, textureX, textureY); // Box 4
		leftLegModel[55] = new ModelRendererTurbo(this, 178, 258, textureX, textureY); // Box 5
		leftLegModel[56] = new ModelRendererTurbo(this, 212, 225, textureX, textureY); // Box 7
		leftLegModel[57] = new ModelRendererTurbo(this, 102, 259, textureX, textureY); // Box 8
		leftLegModel[58] = new ModelRendererTurbo(this, 102, 259, textureX, textureY); // Box 9
		leftLegModel[59] = new ModelRendererTurbo(this, 212, 225, textureX, textureY); // Box 10
		leftLegModel[60] = new ModelRendererTurbo(this, 178, 258, textureX, textureY); // Box 11
		leftLegModel[61] = new ModelRendererTurbo(this, 136, 258, textureX, textureY); // Box 12
		leftLegModel[62] = new ModelRendererTurbo(this, 211, 258, textureX, textureY); // Box 13
		leftLegModel[63] = new ModelRendererTurbo(this, 212, 241, textureX, textureY); // Box 14
		leftLegModel[64] = new ModelRendererTurbo(this, 211, 273, textureX, textureY); // Box 15
		leftLegModel[65] = new ModelRendererTurbo(this, 136, 272, textureX, textureY); // Box 16
		leftLegModel[66] = new ModelRendererTurbo(this, 178, 273, textureX, textureY); // Box 17

		leftLegModel[0].addShapeBox(-5F, -1F, 0F, 10, 9, 10, 0F,1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftLegModel[0].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[1].addShapeBox(-5F, -4F, 0F, 10, 3, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F); // Box 97
		leftLegModel[1].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[2].addShapeBox(4F, 11F, 0F, 4, 1, 10, 0F,1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 1F, 0F); // Box 99
		leftLegModel[2].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[3].addShapeBox(0F, 8F, 0F, 7, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 0F); // Box 100
		leftLegModel[3].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[4].addShapeBox(-4F, -5F, 0F, 8, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		leftLegModel[4].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[5].addShapeBox(-6F, 11.5F, -0.5F, 2, 3, 11, 0F,0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftLegModel[5].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[6].addShapeBox(-6F, 9.5F, -0.5F, 4, 2, 11, 0F,-1.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftLegModel[6].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[7].addShapeBox(-4.5F, 8.5F, -0.5F, 7, 1, 11, 0F,-2F, .5F, 0F, -2F, .5F, 0F, -2F, .5F, 0F, -2F, .5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 121
		leftLegModel[7].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[8].addShapeBox(-4.5F, 16.5F, -0.5F, 7, 1, 11, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 123
		leftLegModel[8].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[9].addShapeBox(-5F, 8F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 124
		leftLegModel[9].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[10].addShapeBox(-2F, -7F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftLegModel[10].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[11].addShapeBox(2F, -6F, 0F, 2, 1, 10, 0F,0F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F); // Box 126
		leftLegModel[11].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[12].addShapeBox(4F, -6F, 0F, 2, 1, 10, 0F,-.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, -.3F, 0F); // Box 127
		leftLegModel[12].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[13].addShapeBox(-2F, -6F, 1F, 4, 1, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftLegModel[13].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[14].addShapeBox(-4F, -6F, 0F, 2, 1, 10, 0F,0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F); // Box 129
		leftLegModel[14].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[15].addShapeBox(-6F, -6F, 0F, 2, 1, 10, 0F,0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 1.5F, 0F); // Box 130
		leftLegModel[15].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[16].addShapeBox(0F, 16F, 0F, 7, 2, 10, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftLegModel[16].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[17].addShapeBox(4F, 15F, 0F, 4, 1, 10, 0F,0F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 134
		leftLegModel[17].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[18].addShapeBox(-6F, 18F, 0F, 13, 5, 10, 0F,-1F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 135
		leftLegModel[18].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[19].addShapeBox(-5F, 23F, 0F, 12, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftLegModel[19].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[20].addShapeBox(-8F, 29F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 137
		leftLegModel[20].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[21].addShapeBox(-5F, 31.5F, 2F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		leftLegModel[21].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[22].addShapeBox(-12F, 39.5F, 1F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 139
		leftLegModel[22].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[23].addShapeBox(-6F, 16F, 8F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 140
		leftLegModel[23].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[24].addShapeBox(-5F, 17F, 0F, 3, 1, 10, 0F,0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftLegModel[24].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[25].addShapeBox(-8F, 31F, 0F, 14, 1, 10, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 144
		leftLegModel[25].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[26].addShapeBox(5F, 16F, 4F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftLegModel[26].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[27].addShapeBox(-9F, 23F, 4F, 3, 6, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		leftLegModel[27].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[28].addShapeBox(-8F, 18F, 4F, 2, 5, 2, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		leftLegModel[28].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[29].addShapeBox(-6F, 18F, 8F, 2, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftLegModel[29].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[30].addShapeBox(-9F, 29F, 4F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		leftLegModel[30].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[31].addShapeBox(-6F, 16F, 1F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 150
		leftLegModel[31].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[32].addShapeBox(-6F, 18F, 1F, 2, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftLegModel[32].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[33].addShapeBox(-5F, 33.5F, 2F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 152
		leftLegModel[33].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[34].addShapeBox(1F, 35.5F, 1F, 4, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Box 153
		leftLegModel[34].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[35].addShapeBox(4F, 36.5F, 1F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		leftLegModel[35].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[36].addShapeBox(1F, 33.5F, 3F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 155
		leftLegModel[36].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[37].addShapeBox(1F, 34.5F, 3F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftLegModel[37].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[38].addShapeBox(-12F, 35.5F, 1F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		leftLegModel[38].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[39].addShapeBox(5F, 35.5F, 0.5F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		leftLegModel[39].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[40].addShapeBox(5F, 34.5F, 0.5F, 5, 1, 9, 0F,-1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		leftLegModel[40].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[41].addShapeBox(5F, 37.5F, 0.5F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 160
		leftLegModel[41].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[42].addShapeBox(11F, 36.5F, 1F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 161
		leftLegModel[42].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[43].addShapeBox(14F, 36.5F, 1F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 162
		leftLegModel[43].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[44].addShapeBox(4F, 40.5F, -2.5F, 7, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftLegModel[44].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[45].addShapeBox(3F, 39.5F, -2.5F, 1, 2, 15, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftLegModel[45].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[46].addShapeBox(11F, 40.5F, -2.5F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 166
		leftLegModel[46].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[47].addShapeBox(14F, 39.5F, -2.5F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 167
		leftLegModel[47].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[48].addShapeBox(16F, 35.5F, -2.5F, 1, 3, 15, 0F,0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.2F, -1.5F, 0F, -.2F, -1.5F, 0F, 0F, 0F, 0F); // Box 168
		leftLegModel[48].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[49].addShapeBox(5F, 38.5F, -1F, 1, 2, 12, 0F,-.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 169
		leftLegModel[49].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[50].addShapeBox(9F, 38.5F, -1F, 1, 2, 12, 0F,-.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 170
		leftLegModel[50].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[51].addShapeBox(-8F, 23F, 0F, 3, 6, 10, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		leftLegModel[51].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[52].addShapeBox(-12F, 38.5F, 1F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		leftLegModel[52].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[53].addShapeBox(-6F, 14.5F, -0.5F, 4, 2, 11, 0F,0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 0
		leftLegModel[53].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[54].addShapeBox(0F, 14.5F, -0.5F, 4, 2, 11, 0F,-2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -.3F, 0F, 0F); // Box 4
		leftLegModel[54].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[55].addShapeBox(0F, 9.5F, -0.5F, 4, 2, 11, 0F,-.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F); // Box 5
		leftLegModel[55].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[56].addShapeBox(2F, 11.5F, -0.5F, 2, 3, 11, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F); // Box 7
		leftLegModel[56].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[57].addShapeBox(-4.5F, 9.5F, 0.5F, 7, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftLegModel[57].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[58].addShapeBox(-4.5F, 9.5F, -34.5F, 7, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftLegModel[58].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[59].addShapeBox(2F, 11.5F, -35.5F, 2, 3, 11, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F); // Box 10
		leftLegModel[59].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[60].addShapeBox(0F, 9.5F, -35.5F, 4, 2, 11, 0F,-.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F); // Box 11
		leftLegModel[60].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[61].addShapeBox(-4.5F, 8.5F, -35.5F, 7, 1, 11, 0F,-2F, .5F, 0F, -2F, .5F, 0F, -2F, .5F, 0F, -2F, .5F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 12
		leftLegModel[61].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[62].addShapeBox(-6F, 9.5F, -35.5F, 4, 2, 11, 0F,-1.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftLegModel[62].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[63].addShapeBox(-6F, 11.5F, -35.5F, 2, 3, 11, 0F,0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftLegModel[63].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[64].addShapeBox(-6F, 14.5F, -35.5F, 4, 2, 11, 0F,0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 15
		leftLegModel[64].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[65].addShapeBox(-4.5F, 16.5F, -35.5F, 7, 1, 11, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 16
		leftLegModel[65].setRotationPoint(0F, -41.5F, 12.5F);

		leftLegModel[66].addShapeBox(0F, 14.5F, -35.5F, 4, 2, 11, 0F,-2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -.3F, 0F, 0F); // Box 17
		leftLegModel[66].setRotationPoint(0F, -41.5F, 12.5F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 173
		rightLegModel[1] = new ModelRendererTurbo(this, 152, 193, textureX, textureY); // Box 174
		rightLegModel[2] = new ModelRendererTurbo(this, 120, 193, textureX, textureY); // Box 175
		rightLegModel[3] = new ModelRendererTurbo(this, 152, 193, textureX, textureY); // Box 176
		rightLegModel[4] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 177
		rightLegModel[5] = new ModelRendererTurbo(this, 119, 210, textureX, textureY); // Box 178
		rightLegModel[6] = new ModelRendererTurbo(this, 148, 210, textureX, textureY); // Box 179
		rightLegModel[7] = new ModelRendererTurbo(this, 119, 224, textureX, textureY); // Box 180
		rightLegModel[8] = new ModelRendererTurbo(this, 165, 224, textureX, textureY); // Box 181
		rightLegModel[9] = new ModelRendererTurbo(this, 127, 243, textureX, textureY); // Box 182
		rightLegModel[10] = new ModelRendererTurbo(this, 168, 246, textureX, textureY); // Box 183
		rightLegModel[11] = new ModelRendererTurbo(this, 220, 297, textureX, textureY); // Box 189
		rightLegModel[12] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 190
		rightLegModel[13] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 191
		rightLegModel[14] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 192
		rightLegModel[15] = new ModelRendererTurbo(this, 160, 305, textureX, textureY); // Box 193
		rightLegModel[16] = new ModelRendererTurbo(this, 128, 318, textureX, textureY); // Box 194
		rightLegModel[17] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 195
		rightLegModel[18] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 196
		rightLegModel[19] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 197
		rightLegModel[20] = new ModelRendererTurbo(this, 130, 337, textureX, textureY); // Box 198
		rightLegModel[21] = new ModelRendererTurbo(this, 165, 337, textureX, textureY); // Box 199
		rightLegModel[22] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 200
		rightLegModel[23] = new ModelRendererTurbo(this, 165, 351, textureX, textureY); // Box 201
		rightLegModel[24] = new ModelRendererTurbo(this, 177, 318, textureX, textureY); // Box 202
		rightLegModel[25] = new ModelRendererTurbo(this, 163, 302, textureX, textureY); // Box 203
		rightLegModel[26] = new ModelRendererTurbo(this, 132, 302, textureX, textureY); // Box 204
		rightLegModel[27] = new ModelRendererTurbo(this, 133, 355, textureX, textureY); // Box 205
		rightLegModel[28] = new ModelRendererTurbo(this, 151, 368, textureX, textureY); // Box 206
		rightLegModel[29] = new ModelRendererTurbo(this, 180, 368, textureX, textureY); // Box 207
		rightLegModel[30] = new ModelRendererTurbo(this, 186, 402, textureX, textureY); // Box 208
		rightLegModel[31] = new ModelRendererTurbo(this, 158, 398, textureX, textureY); // Box 209
		rightLegModel[32] = new ModelRendererTurbo(this, 153, 381, textureX, textureY); // Box 210
		rightLegModel[33] = new ModelRendererTurbo(this, 139, 448, textureX, textureY); // Box 211
		rightLegModel[34] = new ModelRendererTurbo(this, 130, 398, textureX, textureY); // Box 212
		rightLegModel[35] = new ModelRendererTurbo(this, 124, 390, textureX, textureY); // Box 213
		rightLegModel[36] = new ModelRendererTurbo(this, 124, 382, textureX, textureY); // Box 214
		rightLegModel[37] = new ModelRendererTurbo(this, 136, 416, textureX, textureY); // Box 215
		rightLegModel[38] = new ModelRendererTurbo(this, 136, 428, textureX, textureY); // Box 216
		rightLegModel[39] = new ModelRendererTurbo(this, 136, 416, textureX, textureY); // Box 217
		rightLegModel[40] = new ModelRendererTurbo(this, 167, 417, textureX, textureY); // Box 218
		rightLegModel[41] = new ModelRendererTurbo(this, 159, 453, textureX, textureY); // Box 219
		rightLegModel[42] = new ModelRendererTurbo(this, 123, 444, textureX, textureY); // Box 220
		rightLegModel[43] = new ModelRendererTurbo(this, 123, 444, textureX, textureY); // Box 221
		rightLegModel[44] = new ModelRendererTurbo(this, 192, 424, textureX, textureY); // Box 222
		rightLegModel[45] = new ModelRendererTurbo(this, 115, 461, textureX, textureY); // Box 223
		rightLegModel[46] = new ModelRendererTurbo(this, 138, 468, textureX, textureY); // Box 224
		rightLegModel[47] = new ModelRendererTurbo(this, 161, 432, textureX, textureY); // Box 225
		rightLegModel[48] = new ModelRendererTurbo(this, 160, 472, textureX, textureY); // Box 226

		rightLegModel[0].addShapeBox(4F, -6F, -10F, 2, 1, 10, 0F,-.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, -.3F, 0F); // Box 173
		rightLegModel[0].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[1].addShapeBox(2F, -6F, -10F, 2, 1, 10, 0F,0F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F); // Box 174
		rightLegModel[1].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[2].addShapeBox(-2F, -7F, -10F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightLegModel[2].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[3].addShapeBox(-4F, -6F, -10F, 2, 1, 10, 0F,0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F); // Box 176
		rightLegModel[3].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[4].addShapeBox(-6F, -6F, -10F, 2, 1, 10, 0F,0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 1.5F, 0F); // Box 177
		rightLegModel[4].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[5].addShapeBox(-2F, -6F, -9F, 4, 1, 8, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightLegModel[5].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[6].addShapeBox(-4F, -5F, -10F, 8, 1, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightLegModel[6].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[7].addShapeBox(-5F, -4F, -10F, 10, 3, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F); // Box 180
		rightLegModel[7].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[8].addShapeBox(-5F, -1F, -10F, 10, 9, 10, 0F,1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 181
		rightLegModel[8].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[9].addShapeBox(0F, 8F, -10F, 7, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 0F); // Box 182
		rightLegModel[9].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[10].addShapeBox(4F, 11F, -10F, 4, 1, 10, 0F,1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 1F, 0F); // Box 183
		rightLegModel[10].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[11].addShapeBox(-5F, 8F, -10F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 189
		rightLegModel[11].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[12].addShapeBox(-6F, 16F, -2F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 190
		rightLegModel[12].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[13].addShapeBox(-6F, 18F, -2F, 2, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		rightLegModel[13].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[14].addShapeBox(-6F, 16F, -9F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 192
		rightLegModel[14].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[15].addShapeBox(-6F, 18F, -9F, 2, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightLegModel[15].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[16].addShapeBox(-6F, 18F, -10F, 13, 5, 10, 0F,-1F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 194
		rightLegModel[16].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[17].addShapeBox(-5F, 17F, -10F, 3, 1, 10, 0F,0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightLegModel[17].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[18].addShapeBox(-8F, 18F, -6F, 2, 5, 2, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightLegModel[18].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[19].addShapeBox(-9F, 23F, -6F, 3, 6, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightLegModel[19].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[20].addShapeBox(-8F, 23F, -10F, 3, 6, 10, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightLegModel[20].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[21].addShapeBox(-8F, 29F, -10F, 15, 2, 10, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightLegModel[21].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[22].addShapeBox(-9F, 29F, -6F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightLegModel[22].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[23].addShapeBox(-8F, 31F, -10F, 14, 1, 10, 0F,0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 201
		rightLegModel[23].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[24].addShapeBox(-5F, 23F, -10F, 12, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F); // Box 202
		rightLegModel[24].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[25].addShapeBox(0F, 16F, -10F, 7, 2, 10, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[25].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[26].addShapeBox(4F, 15F, -10F, 4, 1, 10, 0F,0F, 1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 204
		rightLegModel[26].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[27].addShapeBox(5F, 16F, -6F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightLegModel[27].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[28].addShapeBox(-5F, 31.5F, -8F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightLegModel[28].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[29].addShapeBox(-5F, 33.5F, -8F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 207
		rightLegModel[29].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[30].addShapeBox(-12F, 39.5F, -9F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 208
		rightLegModel[30].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[31].addShapeBox(-12F, 38.5F, -9F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightLegModel[31].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[32].addShapeBox(-12F, 35.5F, -9F, 13, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightLegModel[32].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[33].addShapeBox(3F, 39.5F, -12.5F, 1, 2, 15, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		rightLegModel[33].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[34].addShapeBox(1F, 35.5F, -9F, 4, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Box 212
		rightLegModel[34].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[35].addShapeBox(1F, 34.5F, -7F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightLegModel[35].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[36].addShapeBox(1F, 33.5F, -7F, 6, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 214
		rightLegModel[36].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[37].addShapeBox(5F, 34.5F, -9.5F, 5, 1, 9, 0F,-1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightLegModel[37].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[38].addShapeBox(5F, 35.5F, -9.5F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightLegModel[38].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[39].addShapeBox(5F, 37.5F, -9.5F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 217
		rightLegModel[39].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[40].addShapeBox(4F, 36.5F, -9F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightLegModel[40].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[41].addShapeBox(4F, 40.5F, -12.5F, 7, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightLegModel[41].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[42].addShapeBox(9F, 38.5F, -11F, 1, 2, 12, 0F,-.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 220
		rightLegModel[42].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[43].addShapeBox(5F, 38.5F, -11F, 1, 2, 12, 0F,-.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, -2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 221
		rightLegModel[43].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[44].addShapeBox(11F, 36.5F, -9F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 222
		rightLegModel[44].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[45].addShapeBox(11F, 40.5F, -12.5F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 223
		rightLegModel[45].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[46].addShapeBox(14F, 39.5F, -12.5F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 224
		rightLegModel[46].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[47].addShapeBox(14F, 36.5F, -9F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 225
		rightLegModel[47].setRotationPoint(0F, -41.5F, -12.5F);

		rightLegModel[48].addShapeBox(16F, 35.5F, -12.5F, 1, 3, 15, 0F,0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.2F, -1.5F, 0F, -.2F, -1.5F, 0F, 0F, 0F, 0F); // Box 226
		rightLegModel[48].setRotationPoint(0F, -41.5F, -12.5F);
	}
}