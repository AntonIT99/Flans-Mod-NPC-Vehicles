//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNakedElephant extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNakedElephant() //Same as Filename
	{
		hipsModel = new ModelRendererTurbo[304];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[60];
		rightLegModel = new ModelRendererTurbo[58];

		inithipsModel_1();
		inithipsModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // Box 0
		hipsModel[1] = new ModelRendererTurbo(this, 7, 111, textureX, textureY); // Box 3
		hipsModel[2] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 4
		hipsModel[3] = new ModelRendererTurbo(this, 7, 161, textureX, textureY); // Box 5
		hipsModel[4] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Box 8
		hipsModel[5] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Box 9
		hipsModel[6] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Box 10
		hipsModel[7] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 11
		hipsModel[8] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 12
		hipsModel[9] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Box 13
		hipsModel[10] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Box 14
		hipsModel[11] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Box 15
		hipsModel[12] = new ModelRendererTurbo(this, 44, 187, textureX, textureY); // Box 16
		hipsModel[13] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Box 17
		hipsModel[14] = new ModelRendererTurbo(this, 7, 204, textureX, textureY); // Box 18
		hipsModel[15] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Box 19
		hipsModel[16] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Box 20
		hipsModel[17] = new ModelRendererTurbo(this, 44, 118, textureX, textureY); // Box 21
		hipsModel[18] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 22
		hipsModel[19] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 23
		hipsModel[20] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 24
		hipsModel[21] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 25
		hipsModel[22] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 26
		hipsModel[23] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 27
		hipsModel[24] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 28
		hipsModel[25] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 29
		hipsModel[26] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 30
		hipsModel[27] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 31
		hipsModel[28] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 32
		hipsModel[29] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 33
		hipsModel[30] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 34
		hipsModel[31] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 35
		hipsModel[32] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 36
		hipsModel[33] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 37
		hipsModel[34] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 38
		hipsModel[35] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 39
		hipsModel[36] = new ModelRendererTurbo(this, 86, 185, textureX, textureY); // Box 40
		hipsModel[37] = new ModelRendererTurbo(this, 86, 156, textureX, textureY); // Box 41
		hipsModel[38] = new ModelRendererTurbo(this, 86, 170, textureX, textureY); // Box 42
		hipsModel[39] = new ModelRendererTurbo(this, 86, 199, textureX, textureY); // Box 43
		hipsModel[40] = new ModelRendererTurbo(this, 86, 211, textureX, textureY); // Box 44
		hipsModel[41] = new ModelRendererTurbo(this, 121, 211, textureX, textureY); // Box 45
		hipsModel[42] = new ModelRendererTurbo(this, 86, 144, textureX, textureY); // Box 46
		hipsModel[43] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 47
		hipsModel[44] = new ModelRendererTurbo(this, 86, 115, textureX, textureY); // Box 48
		hipsModel[45] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 49
		hipsModel[46] = new ModelRendererTurbo(this, 121, 176, textureX, textureY); // Box 50
		hipsModel[47] = new ModelRendererTurbo(this, 121, 194, textureX, textureY); // Box 51
		hipsModel[48] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 0
		hipsModel[49] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 1
		hipsModel[50] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 2
		hipsModel[51] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 3
		hipsModel[52] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Box 4
		hipsModel[53] = new ModelRendererTurbo(this, 121, 140, textureX, textureY); // Box 8
		hipsModel[54] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 9
		hipsModel[55] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Box 10
		hipsModel[56] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 12
		hipsModel[57] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 13
		hipsModel[58] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 14
		hipsModel[59] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 15
		hipsModel[60] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 18
		hipsModel[61] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 19
		hipsModel[62] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 20
		hipsModel[63] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 21
		hipsModel[64] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Box 22
		hipsModel[65] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 23
		hipsModel[66] = new ModelRendererTurbo(this, 121, 100, textureX, textureY); // Box 25
		hipsModel[67] = new ModelRendererTurbo(this, 86, 81, textureX, textureY); // Box 28
		hipsModel[68] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Box 32
		hipsModel[69] = new ModelRendererTurbo(this, 121, 80, textureX, textureY); // Box 33
		hipsModel[70] = new ModelRendererTurbo(this, 70, 55, textureX, textureY); // Box 0
		hipsModel[71] = new ModelRendererTurbo(this, 59, 35, textureX, textureY); // Box 1
		hipsModel[72] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Box 2
		hipsModel[73] = new ModelRendererTurbo(this, 70, 64, textureX, textureY); // Box 3
		hipsModel[74] = new ModelRendererTurbo(this, 59, 52, textureX, textureY); // Box 4
		hipsModel[75] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Box 5
		hipsModel[76] = new ModelRendererTurbo(this, 59, 70, textureX, textureY); // Box 6
		hipsModel[77] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Box 8
		hipsModel[78] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // Box 9
		hipsModel[79] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 10
		hipsModel[80] = new ModelRendererTurbo(this, 7, 111, textureX, textureY); // Box 11
		hipsModel[81] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Box 12
		hipsModel[82] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 13
		hipsModel[83] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Box 14
		hipsModel[84] = new ModelRendererTurbo(this, 7, 161, textureX, textureY); // Box 15
		hipsModel[85] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Box 16
		hipsModel[86] = new ModelRendererTurbo(this, 7, 204, textureX, textureY); // Box 17
		hipsModel[87] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Box 18
		hipsModel[88] = new ModelRendererTurbo(this, 44, 187, textureX, textureY); // Box 19
		hipsModel[89] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Box 20
		hipsModel[90] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Box 21
		hipsModel[91] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Box 22
		hipsModel[92] = new ModelRendererTurbo(this, 44, 118, textureX, textureY); // Box 23
		hipsModel[93] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 24
		hipsModel[94] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Box 25
		hipsModel[95] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Box 26
		hipsModel[96] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 27
		hipsModel[97] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 28
		hipsModel[98] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 29
		hipsModel[99] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 30
		hipsModel[100] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 31
		hipsModel[101] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 32
		hipsModel[102] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 33
		hipsModel[103] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 34
		hipsModel[104] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 35
		hipsModel[105] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 36
		hipsModel[106] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 37
		hipsModel[107] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 38
		hipsModel[108] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 39
		hipsModel[109] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 40
		hipsModel[110] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 41
		hipsModel[111] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 42
		hipsModel[112] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 43
		hipsModel[113] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 44
		hipsModel[114] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 45
		hipsModel[115] = new ModelRendererTurbo(this, 59, 35, textureX, textureY); // Box 47
		hipsModel[116] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Box 48
		hipsModel[117] = new ModelRendererTurbo(this, 70, 55, textureX, textureY); // Box 49
		hipsModel[118] = new ModelRendererTurbo(this, 7, 315, textureX, textureY); // Box 50
		hipsModel[119] = new ModelRendererTurbo(this, 7, 301, textureX, textureY); // Box 52
		hipsModel[120] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Box 53
		hipsModel[121] = new ModelRendererTurbo(this, 7, 287, textureX, textureY); // Box 54
		hipsModel[122] = new ModelRendererTurbo(this, 7, 363, textureX, textureY); // Box 56
		hipsModel[123] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Box 57
		hipsModel[124] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Box 58
		hipsModel[125] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Box 59
		hipsModel[126] = new ModelRendererTurbo(this, 7, 327, textureX, textureY); // Box 60
		hipsModel[127] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 61
		hipsModel[128] = new ModelRendererTurbo(this, 7, 340, textureX, textureY); // Box 62
		hipsModel[129] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 63
		hipsModel[130] = new ModelRendererTurbo(this, 7, 351, textureX, textureY); // Box 64
		hipsModel[131] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 65
		hipsModel[132] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Box 66
		hipsModel[133] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 68
		hipsModel[134] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 69
		hipsModel[135] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Box 73
		hipsModel[136] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 74
		hipsModel[137] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Box 75
		hipsModel[138] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 76
		hipsModel[139] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 77
		hipsModel[140] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 78
		hipsModel[141] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 79
		hipsModel[142] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Box 80
		hipsModel[143] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Box 81
		hipsModel[144] = new ModelRendererTurbo(this, 62, 283, textureX, textureY); // Box 82
		hipsModel[145] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 83
		hipsModel[146] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 84
		hipsModel[147] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 85
		hipsModel[148] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 86
		hipsModel[149] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 87
		hipsModel[150] = new ModelRendererTurbo(this, 62, 291, textureX, textureY); // Box 89
		hipsModel[151] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 90
		hipsModel[152] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 91
		hipsModel[153] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 92
		hipsModel[154] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 93
		hipsModel[155] = new ModelRendererTurbo(this, 78, 306, textureX, textureY); // Box 94
		hipsModel[156] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Box 95
		hipsModel[157] = new ModelRendererTurbo(this, 62, 309, textureX, textureY); // Box 96
		hipsModel[158] = new ModelRendererTurbo(this, 62, 303, textureX, textureY); // Box 97
		hipsModel[159] = new ModelRendererTurbo(this, 62, 297, textureX, textureY); // Box 98
		hipsModel[160] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Box 99
		hipsModel[161] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Box 100
		hipsModel[162] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 102
		hipsModel[163] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 103
		hipsModel[164] = new ModelRendererTurbo(this, 78, 314, textureX, textureY); // Box 104
		hipsModel[165] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Box 107
		hipsModel[166] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Box 0
		hipsModel[167] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 1
		hipsModel[168] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Box 3
		hipsModel[169] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Box 4
		hipsModel[170] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 5
		hipsModel[171] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Box 6
		hipsModel[172] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Box 7
		hipsModel[173] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Box 9
		hipsModel[174] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Box 10
		hipsModel[175] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 11
		hipsModel[176] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 14
		hipsModel[177] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Box 18
		hipsModel[178] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 19
		hipsModel[179] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 23
		hipsModel[180] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 1
		hipsModel[181] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 2
		hipsModel[182] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 3
		hipsModel[183] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Eye
		hipsModel[184] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 7
		hipsModel[185] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 9
		hipsModel[186] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 10
		hipsModel[187] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 12
		hipsModel[188] = new ModelRendererTurbo(this, 42, 303, textureX, textureY); // Box 13
		hipsModel[189] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 14
		hipsModel[190] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Box 15
		hipsModel[191] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Box 16
		hipsModel[192] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Box 17
		hipsModel[193] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Box 18
		hipsModel[194] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Box 19
		hipsModel[195] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Box 20
		hipsModel[196] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Box 21
		hipsModel[197] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 22
		hipsModel[198] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 23
		hipsModel[199] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Box 24
		hipsModel[200] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Box 25
		hipsModel[201] = new ModelRendererTurbo(this, 7, 287, textureX, textureY); // Box 26
		hipsModel[202] = new ModelRendererTurbo(this, 7, 301, textureX, textureY); // Box 27
		hipsModel[203] = new ModelRendererTurbo(this, 7, 315, textureX, textureY); // Box 28
		hipsModel[204] = new ModelRendererTurbo(this, 7, 327, textureX, textureY); // Box 29
		hipsModel[205] = new ModelRendererTurbo(this, 7, 340, textureX, textureY); // Box 30
		hipsModel[206] = new ModelRendererTurbo(this, 7, 351, textureX, textureY); // Box 31
		hipsModel[207] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Box 32
		hipsModel[208] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 33
		hipsModel[209] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 34
		hipsModel[210] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Box 35
		hipsModel[211] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Box 36
		hipsModel[212] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 37
		hipsModel[213] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 38
		hipsModel[214] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 39
		hipsModel[215] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 40
		hipsModel[216] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Box 42
		hipsModel[217] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Box 43
		hipsModel[218] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 44
		hipsModel[219] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Box 45
		hipsModel[220] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 46
		hipsModel[221] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Box 47
		hipsModel[222] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Box 48
		hipsModel[223] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 49
		hipsModel[224] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 50
		hipsModel[225] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 51
		hipsModel[226] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 52
		hipsModel[227] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 53
		hipsModel[228] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 54
		hipsModel[229] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 55
		hipsModel[230] = new ModelRendererTurbo(this, 62, 291, textureX, textureY); // Box 56
		hipsModel[231] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Box 57
		hipsModel[232] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Box 58
		hipsModel[233] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 59
		hipsModel[234] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 60
		hipsModel[235] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Box 61
		hipsModel[236] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 62
		hipsModel[237] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 63
		hipsModel[238] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 64
		hipsModel[239] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 65
		hipsModel[240] = new ModelRendererTurbo(this, 62, 297, textureX, textureY); // Box 66
		hipsModel[241] = new ModelRendererTurbo(this, 62, 303, textureX, textureY); // Box 67
		hipsModel[242] = new ModelRendererTurbo(this, 62, 309, textureX, textureY); // Box 68
		hipsModel[243] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Box 69
		hipsModel[244] = new ModelRendererTurbo(this, 78, 306, textureX, textureY); // Box 70
		hipsModel[245] = new ModelRendererTurbo(this, 78, 314, textureX, textureY); // Box 71
		hipsModel[246] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 72
		hipsModel[247] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 73
		hipsModel[248] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 74
		hipsModel[249] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 75
		hipsModel[250] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 76
		hipsModel[251] = new ModelRendererTurbo(this, 62, 283, textureX, textureY); // Box 77
		hipsModel[252] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Box 78
		hipsModel[253] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 79
		hipsModel[254] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 80
		hipsModel[255] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 81
		hipsModel[256] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Box 82
		hipsModel[257] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 83
		hipsModel[258] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 84
		hipsModel[259] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 85
		hipsModel[260] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 86
		hipsModel[261] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Box 87
		hipsModel[262] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Box 88
		hipsModel[263] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Box 89
		hipsModel[264] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Box 90
		hipsModel[265] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Box 91
		hipsModel[266] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Box 92
		hipsModel[267] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Box 93
		hipsModel[268] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Box 94
		hipsModel[269] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Box 95
		hipsModel[270] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Box 96
		hipsModel[271] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Box 226
		hipsModel[272] = new ModelRendererTurbo(this, 121, 80, textureX, textureY); // Box 227
		hipsModel[273] = new ModelRendererTurbo(this, 121, 100, textureX, textureY); // Box 228
		hipsModel[274] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Box 229
		hipsModel[275] = new ModelRendererTurbo(this, 121, 140, textureX, textureY); // Box 230
		hipsModel[276] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 231
		hipsModel[277] = new ModelRendererTurbo(this, 121, 176, textureX, textureY); // Box 232
		hipsModel[278] = new ModelRendererTurbo(this, 121, 194, textureX, textureY); // Box 233
		hipsModel[279] = new ModelRendererTurbo(this, 121, 211, textureX, textureY); // Box 234
		hipsModel[280] = new ModelRendererTurbo(this, 86, 211, textureX, textureY); // Box 235
		hipsModel[281] = new ModelRendererTurbo(this, 86, 199, textureX, textureY); // Box 236
		hipsModel[282] = new ModelRendererTurbo(this, 86, 185, textureX, textureY); // Box 237
		hipsModel[283] = new ModelRendererTurbo(this, 86, 170, textureX, textureY); // Box 238
		hipsModel[284] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 239
		hipsModel[285] = new ModelRendererTurbo(this, 86, 144, textureX, textureY); // Box 240
		hipsModel[286] = new ModelRendererTurbo(this, 86, 156, textureX, textureY); // Box 241
		hipsModel[287] = new ModelRendererTurbo(this, 86, 115, textureX, textureY); // Box 242
		hipsModel[288] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Box 243
		hipsModel[289] = new ModelRendererTurbo(this, 86, 81, textureX, textureY); // Box 244
		hipsModel[290] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 245
		hipsModel[291] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 246
		hipsModel[292] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 247
		hipsModel[293] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 248
		hipsModel[294] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 249
		hipsModel[295] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 250
		hipsModel[296] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 251
		hipsModel[297] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 252
		hipsModel[298] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 253
		hipsModel[299] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 254
		hipsModel[300] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 255
		hipsModel[301] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 256
		hipsModel[302] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 257
		hipsModel[303] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Box 1

		hipsModel[0].addShapeBox(14F, -25F, 0F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[0].setRotationPoint(-6F, -37F, 0F);

		hipsModel[1].addShapeBox(1F, -25F, 0F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[1].setRotationPoint(-6F, -37F, 0F);

		hipsModel[2].addShapeBox(-15F, -25F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[2].setRotationPoint(-6F, -37F, 0F);

		hipsModel[3].addShapeBox(-30F, -25F, 0F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[3].setRotationPoint(-6F, -37F, 0F);

		hipsModel[4].addShapeBox(-21F, 3F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 8
		hipsModel[4].setRotationPoint(-6F, -37F, 0F);

		hipsModel[5].addShapeBox(22F, -21F, 0F, 6, 11, 5, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[5].setRotationPoint(-6F, -37F, 0F);

		hipsModel[6].addShapeBox(12F, 3F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[6].setRotationPoint(-6F, -37F, 0F);

		hipsModel[7].addShapeBox(1F, 3F, 0F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[7].setRotationPoint(-6F, -37F, 0F);

		hipsModel[8].addShapeBox(11F, -25F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[8].setRotationPoint(-6F, -37F, 0F);

		hipsModel[9].addShapeBox(-3F, -23F, 0F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[9].setRotationPoint(-6F, -37F, 0F);

		hipsModel[10].addShapeBox(-20F, -25F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[10].setRotationPoint(-6F, -37F, 0F);

		hipsModel[11].addShapeBox(-34F, -23F, 0F, 4, 23, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[11].setRotationPoint(-6F, -37F, 0F);

		hipsModel[12].addShapeBox(-34F, 3F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[12].setRotationPoint(-6F, -37F, 0F);

		hipsModel[13].addShapeBox(22F, -7F, 0F, 6, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[13].setRotationPoint(-6F, -37F, 0F);

		hipsModel[14].addShapeBox(-37F, -20F, 0F, 3, 11, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 18
		hipsModel[14].setRotationPoint(-6F, -37F, 0F);

		hipsModel[15].addShapeBox(-37F, -9F, 0F, 3, 19, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 19
		hipsModel[15].setRotationPoint(-6F, -37F, 0F);

		hipsModel[16].addShapeBox(-27F, 3F, 0F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 20
		hipsModel[16].setRotationPoint(-6F, -37F, 0F);

		hipsModel[17].addShapeBox(-3F, 3F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[17].setRotationPoint(-6F, -37F, 0F);

		hipsModel[18].addShapeBox(14F, -25F, 5F, 8, 4, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[18].setRotationPoint(-6F, -37F, 0F);

		hipsModel[19].addShapeBox(11F, -25F, 5F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[19].setRotationPoint(-6F, -37F, 0F);

		hipsModel[20].addShapeBox(1F, -25F, 5F, 10, 4, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[20].setRotationPoint(-6F, -37F, 0F);

		hipsModel[21].addShapeBox(-3F, -23F, 5F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[21].setRotationPoint(-6F, -37F, 0F);

		hipsModel[22].addShapeBox(-15F, -25F, 5F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[22].setRotationPoint(-6F, -37F, 0F);

		hipsModel[23].addShapeBox(-20F, -25F, 5F, 5, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[23].setRotationPoint(-6F, -37F, 0F);

		hipsModel[24].addShapeBox(-30F, -25F, 5F, 10, 4, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[24].setRotationPoint(-6F, -37F, 0F);

		hipsModel[25].addShapeBox(-34F, -23F, 5F, 4, 9, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 29
		hipsModel[25].setRotationPoint(-6F, -37F, 0F);

		hipsModel[26].addShapeBox(-37F, -20F, 5F, 3, 11, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 30
		hipsModel[26].setRotationPoint(-6F, -37F, 0F);

		hipsModel[27].addShapeBox(-37F, -9F, 5F, 3, 19, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -6F, 0F); // Box 31
		hipsModel[27].setRotationPoint(-6F, -37F, 0F);

		hipsModel[28].addShapeBox(-34F, 3F, 5F, 7, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F); // Box 32
		hipsModel[28].setRotationPoint(-6F, -37F, 0F);

		hipsModel[29].addShapeBox(-27F, 3F, 5F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 33
		hipsModel[29].setRotationPoint(-6F, -37F, 0F);

		hipsModel[30].addShapeBox(-21F, 3F, 5F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[30].setRotationPoint(-6F, -37F, 0F);

		hipsModel[31].addShapeBox(-3F, 3F, 5F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 35
		hipsModel[31].setRotationPoint(-6F, -37F, 0F);

		hipsModel[32].addShapeBox(1F, 3F, 5F, 11, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 36
		hipsModel[32].setRotationPoint(-6F, -37F, 0F);

		hipsModel[33].addShapeBox(12F, 3F, 5F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 37
		hipsModel[33].setRotationPoint(-6F, -37F, 0F);

		hipsModel[34].addShapeBox(22F, -10F, 5F, 6, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, -1F, 0F, 0F, 0F); // Box 38
		hipsModel[34].setRotationPoint(-6F, -37F, 0F);

		hipsModel[35].addShapeBox(22F, -21F, 5F, 6, 11, 9, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 39
		hipsModel[35].setRotationPoint(-6F, -37F, 0F);

		hipsModel[36].addShapeBox(-30F, -21F, 14F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 1F); // Box 40
		hipsModel[36].setRotationPoint(-6F, -37F, 0F);

		hipsModel[37].addShapeBox(-15F, -21F, 14F, 12, 7, 4, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 41
		hipsModel[37].setRotationPoint(-6F, -37F, 0F);

		hipsModel[38].addShapeBox(-20F, -21F, 14F, 5, 7, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 42
		hipsModel[38].setRotationPoint(-6F, -37F, 0F);

		hipsModel[39].addShapeBox(-35F, -21F, 14F, 5, 5, 4, 0F,-3F, -1F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 1F, -4F, 2F, 0F); // Box 43
		hipsModel[39].setRotationPoint(-6F, -37F, 0F);

		hipsModel[40].addShapeBox(-35F, -16F, 14F, 5, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 1F, -4F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 0F); // Box 44
		hipsModel[40].setRotationPoint(-6F, -37F, 0F);

		hipsModel[41].addShapeBox(-35F, -9F, 14F, 5, 14, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -4F, -3F, -1F); // Box 45
		hipsModel[41].setRotationPoint(-6F, -37F, 0F);

		hipsModel[42].addShapeBox(-3F, -21F, 14F, 4, 7, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 46
		hipsModel[42].setRotationPoint(-6F, -37F, 0F);

		hipsModel[43].addShapeBox(1F, -21F, 14F, 10, 7, 3, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 47
		hipsModel[43].setRotationPoint(-6F, -37F, 0F);

		hipsModel[44].addShapeBox(11F, -21F, 14F, 3, 7, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 48
		hipsModel[44].setRotationPoint(-6F, -37F, 0F);

		hipsModel[45].addShapeBox(-21F, 2F, 14F, 6, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -1F, -1F); // Box 49
		hipsModel[45].setRotationPoint(-6F, -37F, 0F);

		hipsModel[46].addShapeBox(-27F, 2F, 14F, 6, 6, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Box 50
		hipsModel[46].setRotationPoint(-6F, -37F, 0F);

		hipsModel[47].addShapeBox(-34F, 3F, 14F, 7, 5, 4, 0F,1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, -4F, -3F, -2F); // Box 51
		hipsModel[47].setRotationPoint(-6F, -37F, 0F);

		hipsModel[48].addShapeBox(-27F, -9F, 14F, 7, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[48].setRotationPoint(-6F, -37F, 0F);

		hipsModel[49].addShapeBox(-20F, -9F, 14F, 5, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[49].setRotationPoint(-6F, -37F, 0F);

		hipsModel[50].addShapeBox(-15F, -9F, 14F, 12, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 2
		hipsModel[50].setRotationPoint(-6F, -37F, 0F);

		hipsModel[51].addShapeBox(-3F, -14F, 14F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 3
		hipsModel[51].setRotationPoint(-6F, -37F, 0F);

		hipsModel[52].addShapeBox(-3F, 1F, 14F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 4
		hipsModel[52].setRotationPoint(-6F, -37F, 0F);

		hipsModel[53].addShapeBox(-15F, 2F, 14F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F); // Box 8
		hipsModel[53].setRotationPoint(-6F, -37F, 0F);

		hipsModel[54].addShapeBox(-15F, 3F, 5F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 9
		hipsModel[54].setRotationPoint(-6F, -37F, 0F);

		hipsModel[55].addShapeBox(-15F, 3F, 0F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		hipsModel[55].setRotationPoint(-6F, -37F, 0F);

		hipsModel[56].addShapeBox(-15F, -14F, 14F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		hipsModel[56].setRotationPoint(-6F, -37F, 0F);

		hipsModel[57].addShapeBox(-20F, -14F, 14F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[57].setRotationPoint(-6F, -37F, 0F);

		hipsModel[58].addShapeBox(-27F, -14F, 14F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 14
		hipsModel[58].setRotationPoint(-6F, -37F, 0F);

		hipsModel[59].addShapeBox(-3F, -9F, 14F, 4, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[59].setRotationPoint(-6F, -37F, 0F);

		hipsModel[60].addShapeBox(1F, -9F, 14F, 10, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, -1F, 0F, 0F, 0F); // Box 18
		hipsModel[60].setRotationPoint(-6F, -37F, 0F);

		hipsModel[61].addShapeBox(11F, -9F, 14F, 3, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, -2F, -1F, 2F, -2F); // Box 19
		hipsModel[61].setRotationPoint(-6F, -37F, 0F);

		hipsModel[62].addShapeBox(1F, -14F, 14F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 20
		hipsModel[62].setRotationPoint(-6F, -37F, 0F);

		hipsModel[63].addShapeBox(11F, -14F, 14F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[63].setRotationPoint(-6F, -37F, 0F);

		hipsModel[64].addShapeBox(14F, -21F, 14F, 8, 7, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F); // Box 22
		hipsModel[64].setRotationPoint(-6F, -37F, 0F);

		hipsModel[65].addShapeBox(14F, -14F, 14F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F); // Box 23
		hipsModel[65].setRotationPoint(-6F, -37F, 0F);

		hipsModel[66].addShapeBox(1F, 1F, 14F, 11, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 25
		hipsModel[66].setRotationPoint(-6F, -37F, 0F);

		hipsModel[67].addShapeBox(22F, -21F, 9F, 6, 11, 3, 0F,0F, 0F, 0F, -2F, -4F, 1F, -4F, -5F, -2F, 2F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 28
		hipsModel[67].setRotationPoint(-6F, -37F, 5F);

		hipsModel[68].addShapeBox(22F, -10F, 14F, 6, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -4F, 1F, -4F, -5F, -2F, 2F, -2F, -1F); // Box 32
		hipsModel[68].setRotationPoint(-6F, -37F, 0F);

		hipsModel[69].addShapeBox(14F, -6F, 14F, 8, 10, 3, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 2F, 2F, 1F, 0F, 0F, -1F, 0F, -2F, -2F, -1F, 2F, -1F, -1F); // Box 33
		hipsModel[69].setRotationPoint(-6F, -37F, 0F);

		hipsModel[70].addShapeBox(-40F, -16F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 0
		hipsModel[70].setRotationPoint(-6F, -37F, 0F);

		hipsModel[71].addShapeBox(-37F, -22F, 0F, 7, 3, 2, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 0F); // Box 1
		hipsModel[71].setRotationPoint(-6F, -37F, 0F);

		hipsModel[72].addShapeBox(-40F, -19F, 0F, 3, 3, 2, 0F,-1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		hipsModel[72].setRotationPoint(-6F, -37F, 0F);

		hipsModel[73].addShapeBox(-41F, -13F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[73].setRotationPoint(-6F, -37F, 0F);

		hipsModel[74].addShapeBox(-41F, -9F, -1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Box 4
		hipsModel[74].setRotationPoint(-6F, -38F, 0F);

		hipsModel[75].addShapeBox(-40.5F, -5F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 5
		hipsModel[75].setRotationPoint(-6F, -38F, 0F);

		hipsModel[76].addShapeBox(-40F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, .3F, 0F, -.2F); // Box 6
		hipsModel[76].setRotationPoint(-6F, -37F, 0F);

		hipsModel[77].addShapeBox(22F, -21F, -5F, 6, 11, 5, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[77].setRotationPoint(-6F, -37F, 0F);

		hipsModel[78].addShapeBox(14F, -25F, -5F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[78].setRotationPoint(-6F, -37F, 0F);

		hipsModel[79].addShapeBox(11F, -25F, -5F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[79].setRotationPoint(-6F, -37F, 0F);

		hipsModel[80].addShapeBox(1F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[80].setRotationPoint(-6F, -37F, 0F);

		hipsModel[81].addShapeBox(-3F, -23F, -5F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[81].setRotationPoint(-6F, -37F, 0F);

		hipsModel[82].addShapeBox(-15F, -25F, -5F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[82].setRotationPoint(-6F, -37F, 0F);

		hipsModel[83].addShapeBox(-20F, -25F, -5F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[83].setRotationPoint(-6F, -37F, 0F);

		hipsModel[84].addShapeBox(-30F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[84].setRotationPoint(-6F, -37F, 0F);

		hipsModel[85].addShapeBox(-34F, -23F, -5F, 4, 23, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[85].setRotationPoint(-6F, -37F, 0F);

		hipsModel[86].addShapeBox(-37F, -20F, -5F, 3, 11, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 17
		hipsModel[86].setRotationPoint(-6F, -37F, 0F);

		hipsModel[87].addShapeBox(-37F, -9F, -5F, 3, 19, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 18
		hipsModel[87].setRotationPoint(-6F, -37F, 0F);

		hipsModel[88].addShapeBox(-34F, 3F, -5F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[88].setRotationPoint(-6F, -37F, 0F);

		hipsModel[89].addShapeBox(-27F, 3F, -5F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 20
		hipsModel[89].setRotationPoint(-6F, -37F, 0F);

		hipsModel[90].addShapeBox(-21F, 3F, -5F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 21
		hipsModel[90].setRotationPoint(-6F, -37F, 0F);

		hipsModel[91].addShapeBox(-15F, 3F, -5F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		hipsModel[91].setRotationPoint(-6F, -37F, 0F);

		hipsModel[92].addShapeBox(-3F, 3F, -5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[92].setRotationPoint(-6F, -37F, 0F);

		hipsModel[93].addShapeBox(1F, 3F, -5F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[93].setRotationPoint(-6F, -37F, 0F);

		hipsModel[94].addShapeBox(12F, 3F, -5F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[94].setRotationPoint(-6F, -37F, 0F);

		hipsModel[95].addShapeBox(22F, -7F, -5F, 6, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[95].setRotationPoint(-6F, -37F, 0F);

		hipsModel[96].addShapeBox(-34F, 3F, -14F, 7, 7, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[96].setRotationPoint(-6F, -37F, 0F);

		hipsModel[97].addShapeBox(-37F, -9F, -14F, 3, 19, 9, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -6F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 28
		hipsModel[97].setRotationPoint(-6F, -37F, 0F);

		hipsModel[98].addShapeBox(-37F, -20F, -14F, 3, 11, 9, 0F,-2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
		hipsModel[98].setRotationPoint(-6F, -37F, 0F);

		hipsModel[99].addShapeBox(-34F, -23F, -14F, 4, 9, 9, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[99].setRotationPoint(-6F, -37F, 0F);

		hipsModel[100].addShapeBox(-30F, -25F, -14F, 10, 4, 9, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[100].setRotationPoint(-6F, -37F, 0F);

		hipsModel[101].addShapeBox(-20F, -25F, -14F, 5, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[101].setRotationPoint(-6F, -37F, 0F);

		hipsModel[102].addShapeBox(-15F, -25F, -14F, 12, 4, 9, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[102].setRotationPoint(-6F, -37F, 0F);

		hipsModel[103].addShapeBox(-3F, -23F, -14F, 4, 2, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[103].setRotationPoint(-6F, -37F, 0F);

		hipsModel[104].addShapeBox(1F, -25F, -14F, 10, 4, 9, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[104].setRotationPoint(-6F, -37F, 0F);

		hipsModel[105].addShapeBox(11F, -25F, -14F, 3, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[105].setRotationPoint(-6F, -37F, 0F);

		hipsModel[106].addShapeBox(14F, -25F, -14F, 8, 4, 9, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[106].setRotationPoint(-6F, -37F, 0F);

		hipsModel[107].addShapeBox(22F, -21F, -14F, 6, 11, 9, 0F,0F, 0F, 0F, -2F, -4F, -1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[107].setRotationPoint(-6F, -37F, 0F);

		hipsModel[108].addShapeBox(22F, -10F, -14F, 6, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[108].setRotationPoint(-6F, -37F, 0F);

		hipsModel[109].addShapeBox(12F, 3F, -14F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[109].setRotationPoint(-6F, -37F, 0F);

		hipsModel[110].addShapeBox(1F, 3F, -14F, 11, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[110].setRotationPoint(-6F, -37F, 0F);

		hipsModel[111].addShapeBox(-3F, 3F, -14F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[111].setRotationPoint(-6F, -37F, 0F);

		hipsModel[112].addShapeBox(-15F, 3F, -14F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 43
		hipsModel[112].setRotationPoint(-6F, -37F, 0F);

		hipsModel[113].addShapeBox(-21F, 3F, -14F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 44
		hipsModel[113].setRotationPoint(-6F, -37F, 0F);

		hipsModel[114].addShapeBox(-27F, 3F, -14F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 45
		hipsModel[114].setRotationPoint(-6F, -37F, 0F);

		hipsModel[115].addShapeBox(-37F, -22F, -2F, 7, 3, 2, 0F,0F, -4F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 47
		hipsModel[115].setRotationPoint(-6F, -37F, 0F);

		hipsModel[116].addShapeBox(-40F, -19F, -2F, 3, 3, 2, 0F,-1F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[116].setRotationPoint(-6F, -37F, 0F);

		hipsModel[117].addShapeBox(-40F, -16F, -2F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 49
		hipsModel[117].setRotationPoint(-6F, -37F, 0F);

		hipsModel[118].addShapeBox(13F, -3F, 0F, 9, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[118].setRotationPoint(20F, -50F, 0F);

		hipsModel[119].addShapeBox(13F, -7F, 0F, 8, 4, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[119].setRotationPoint(20F, -50F, 0F);

		hipsModel[120].addShapeBox(0F, -10F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[120].setRotationPoint(20F, -50F, 0F);

		hipsModel[121].addShapeBox(13F, -9F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 54
		hipsModel[121].setRotationPoint(20F, -50F, 0F);

		hipsModel[122].addShapeBox(18F, -21F, -5F, 14, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		hipsModel[122].setRotationPoint(-6F, -37F, 0F);

		hipsModel[123].addShapeBox(18F, -21F, 5F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[123].setRotationPoint(-6F, -37F, 0F);

		hipsModel[124].addShapeBox(18F, -21F, -10F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[124].setRotationPoint(-6F, -37F, 0F);

		hipsModel[125].addShapeBox(-3F, -10F, 0F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[125].setRotationPoint(20F, -50F, 0F);

		hipsModel[126].addShapeBox(13F, 3F, 0F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[126].setRotationPoint(20F, -50F, 0F);

		hipsModel[127].addShapeBox(7F, 9F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 61
		hipsModel[127].setRotationPoint(20F, -50F, 0F);

		hipsModel[128].addShapeBox(13F, 9F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[128].setRotationPoint(20F, -50F, 0F);

		hipsModel[129].addShapeBox(0F, 9F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 63
		hipsModel[129].setRotationPoint(20F, -50F, 0F);

		hipsModel[130].addShapeBox(17F, 13F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[130].setRotationPoint(20F, -50F, 0F);

		hipsModel[131].addShapeBox(12F, 13F, 0F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 65
		hipsModel[131].setRotationPoint(20F, -50F, 0F);

		hipsModel[132].addShapeBox(17F, 16F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[132].setRotationPoint(20F, -50F, 0F);

		hipsModel[133].addShapeBox(0F, 9F, 3F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 68
		hipsModel[133].setRotationPoint(20F, -50F, 0F);

		hipsModel[134].addShapeBox(7F, 9F, 3F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		hipsModel[134].setRotationPoint(20F, -50F, 0F);

		hipsModel[135].addShapeBox(0F, -10F, 3F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[135].setRotationPoint(20F, -50F, 0F);

		hipsModel[136].addShapeBox(-3F, -10F, 3F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[136].setRotationPoint(20F, -50F, 0F);

		hipsModel[137].addShapeBox(0F, 9F, 7F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 75
		hipsModel[137].setRotationPoint(20F, -50F, 0F);

		hipsModel[138].addShapeBox(7F, 9F, 7F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 76
		hipsModel[138].setRotationPoint(20F, -50F, 0F);

		hipsModel[139].addShapeBox(0F, 3F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[139].setRotationPoint(20F, -50F, 0F);

		hipsModel[140].addShapeBox(0F, -3F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 78
		hipsModel[140].setRotationPoint(20F, -50F, 0F);

		hipsModel[141].addShapeBox(0F, -7F, 7F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[141].setRotationPoint(20F, -50F, 0F);

		hipsModel[142].addShapeBox(0F, -9F, 7F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 80
		hipsModel[142].setRotationPoint(20F, -50F, 0F);

		hipsModel[143].addShapeBox(-3F, -9F, 7F, 3, 18, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[143].setRotationPoint(20F, -50F, 0F);

		hipsModel[144].addShapeBox(13F, -9F, 3F, 6, 2, 4, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 82
		hipsModel[144].setRotationPoint(20F, -50F, 0F);

		hipsModel[145].addShapeBox(13F, -7F, 3F, 8, 4, 4, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[145].setRotationPoint(20F, -50F, 0F);

		hipsModel[146].addShapeBox(13F, -3F, 3F, 9, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		hipsModel[146].setRotationPoint(20F, -50F, 0F);

		hipsModel[147].addShapeBox(13F, 3F, 3F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[147].setRotationPoint(20F, -50F, 0F);

		hipsModel[148].addShapeBox(13F, 9F, 3F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[148].setRotationPoint(20F, -50F, 0F);

		hipsModel[149].addShapeBox(17F, 13F, 3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[149].setRotationPoint(20F, -50F, 0F);

		hipsModel[150].addShapeBox(13F, -7F, 7F, 5, 2, 2, 0F,0F, 1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		hipsModel[150].setRotationPoint(20F, -50F, 0F);

		hipsModel[151].addShapeBox(13F, -3F, 7F, 7, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[151].setRotationPoint(20F, -50F, 0F);

		hipsModel[152].addShapeBox(13F, 3F, 7F, 8, 6, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[152].setRotationPoint(20F, -50F, 0F);

		hipsModel[153].addShapeBox(13F, 9F, 7F, 9, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		hipsModel[153].setRotationPoint(20F, -50F, 0F);

		hipsModel[154].addShapeBox(13F, -5F, 7F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		hipsModel[154].setRotationPoint(20F, -50F, 0F);

		hipsModel[155].addShapeBox(13F, 9F, 9F, 7, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
		hipsModel[155].setRotationPoint(20F, -50F, 0F);

		hipsModel[156].addShapeBox(13F, 3F, 9F, 6, 6, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 95
		hipsModel[156].setRotationPoint(20F, -50F, 0F);

		hipsModel[157].addShapeBox(13F, -3F, 9F, 5, 6, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 96
		hipsModel[157].setRotationPoint(20F, -50F, 0F);

		hipsModel[158].addShapeBox(13F, -5F, 9F, 4, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 97
		hipsModel[158].setRotationPoint(20F, -50F, 0F);

		hipsModel[159].addShapeBox(13F, -7F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		hipsModel[159].setRotationPoint(20F, -50F, 0F);

		hipsModel[160].addShapeBox(8F, -8F, 7F, 2, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 99
		hipsModel[160].setRotationPoint(20F, -50F, 0F);

		hipsModel[161].addShapeBox(3F, -9F, 13F, 2, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 100
		hipsModel[161].setRotationPoint(20F, -50F, 0F);

		hipsModel[162].addShapeBox(17F, 13F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		hipsModel[162].setRotationPoint(20F, -50F, 0F);

		hipsModel[163].addShapeBox(17F, 13F, 7F, 5, 3, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		hipsModel[163].setRotationPoint(20F, -50F, 0F);

		hipsModel[164].addShapeBox(17F, 13F, 9F, 3, 3, 1, 0F,4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 104
		hipsModel[164].setRotationPoint(20F, -50F, 0F);

		hipsModel[165].addShapeBox(13F, 13F, 6F, 4, 3, 3, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 107
		hipsModel[165].setRotationPoint(20F, -50F, 0F);

		hipsModel[166].addShapeBox(18F, 16F, 6F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[166].setRotationPoint(20F, -50F, 0F);

		hipsModel[167].addShapeBox(16F, 16F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		hipsModel[167].setRotationPoint(20F, -50F, 0F);

		hipsModel[168].addShapeBox(16F, 16F, 6F, 1, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[168].setRotationPoint(20F, -50F, 0F);

		hipsModel[169].addShapeBox(17F, 16F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F); // Box 4
		hipsModel[169].setRotationPoint(20F, -50F, 0F);

		hipsModel[170].addShapeBox(18F, 16F, 7F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[170].setRotationPoint(20F, -50F, 0F);

		hipsModel[171].addShapeBox(17F, 20F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F); // Box 6
		hipsModel[171].setRotationPoint(20F, -50F, 0F);

		hipsModel[172].addShapeBox(17F, 20F, 4F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -.5F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 7
		hipsModel[172].setRotationPoint(20F, -50F, 0F);

		hipsModel[173].addShapeBox(17F, 24F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F); // Box 9
		hipsModel[173].setRotationPoint(20F, -50F, 0F);

		hipsModel[174].addShapeBox(17F, 24F, 2F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -3.5F, 0F, -2F, -3.5F, 0F, -2F); // Box 10
		hipsModel[174].setRotationPoint(20F, -50F, 0F);

		hipsModel[175].addShapeBox(18.5F, 18F, 7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 11
		hipsModel[175].setRotationPoint(20F, -50F, 0F);

		hipsModel[176].addShapeBox(18.5F, 18F, 8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Box 14
		hipsModel[176].setRotationPoint(20F, -50F, 0F);

		hipsModel[177].addShapeBox(22.5F, 22F, 7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Box 18
		hipsModel[177].setRotationPoint(20F, -50F, 0F);

		hipsModel[178].addShapeBox(22.5F, 22F, 8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Box 19
		hipsModel[178].setRotationPoint(20F, -50F, 0F);

		hipsModel[179].addShapeBox(24.5F, 22F, 7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Box 23
		hipsModel[179].setRotationPoint(20F, -50F, 0F);

		hipsModel[180].addShapeBox(22.5F, 22F, 6F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Box 1
		hipsModel[180].setRotationPoint(20F, -50F, 0F);

		hipsModel[181].addShapeBox(24.5F, 22F, 6.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[181].setRotationPoint(20F, -50F, 0F);

		hipsModel[182].addShapeBox(18.5F, 18F, 6F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[182].setRotationPoint(20F, -50F, 0F);

		hipsModel[183].addShapeBox(4F, -7F, 10F, 26, 26, 1, 0F,-10F, -10F, -.8F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .8F, -10F, -10F, -.5F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .5F); // Eye
		hipsModel[183].setRotationPoint(20F, -50F, 0F);

		hipsModel[184].addShapeBox(18.5F, 31F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		hipsModel[184].setRotationPoint(20F, -50F, 0F);

		hipsModel[185].addShapeBox(18.5F, 35F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 9
		hipsModel[185].setRotationPoint(20F, -50F, 0F);

		hipsModel[186].addShapeBox(20.5F, 39F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, -7F, 0F, 0F); // Box 10
		hipsModel[186].setRotationPoint(20F, -50F, 0F);

		hipsModel[187].addShapeBox(27.5F, 41F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 12
		hipsModel[187].setRotationPoint(20F, -50F, 0F);

		hipsModel[188].addShapeBox(31.5F, 41F, -1F, 4, 4, 2, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 13
		hipsModel[188].setRotationPoint(20F, -50F, 0F);

		hipsModel[189].addShapeBox(31.5F, 41F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 1F, 0F, -2F, 0F); // Box 14
		hipsModel[189].setRotationPoint(20F, -50F, 0F);

		hipsModel[190].addShapeBox(8F, 10F, 7F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 15
		hipsModel[190].setRotationPoint(20F, -50F, 0F);

		hipsModel[191].addShapeBox(3F, 10F, 13F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F); // Box 16
		hipsModel[191].setRotationPoint(20F, -50F, 0F);

		hipsModel[192].addShapeBox(0F, 10F, 16F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 7F, -4F, 0F); // Box 17
		hipsModel[192].setRotationPoint(20F, -50F, 0F);

		hipsModel[193].addShapeBox(0F, -9F, 16F, 2, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 18
		hipsModel[193].setRotationPoint(20F, -50F, 0F);

		hipsModel[194].addShapeBox(-7F, -8F, 24F, 2, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 19
		hipsModel[194].setRotationPoint(20F, -50F, 0F);

		hipsModel[195].addShapeBox(-7F, 10F, 24F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 3F, -4F, 0F); // Box 20
		hipsModel[195].setRotationPoint(20F, -50F, 0F);

		hipsModel[196].addShapeBox(-10F, -6F, 27F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 1F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 1F, -5F, -1F); // Box 21
		hipsModel[196].setRotationPoint(20F, -50F, 0F);

		hipsModel[197].addShapeBox(0F, 9F, -3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 22
		hipsModel[197].setRotationPoint(20F, -50F, 0F);

		hipsModel[198].addShapeBox(7F, 9F, -3F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		hipsModel[198].setRotationPoint(20F, -50F, 0F);

		hipsModel[199].addShapeBox(-3F, -10F, -3F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[199].setRotationPoint(20F, -50F, 0F);

		hipsModel[200].addShapeBox(0F, -10F, -3F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[200].setRotationPoint(20F, -50F, 0F);

		hipsModel[201].addShapeBox(13F, -9F, -3F, 6, 2, 3, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[201].setRotationPoint(20F, -50F, 0F);

		hipsModel[202].addShapeBox(13F, -7F, -3F, 8, 4, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[202].setRotationPoint(20F, -50F, 0F);

		hipsModel[203].addShapeBox(13F, -3F, -3F, 9, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[203].setRotationPoint(20F, -50F, 0F);

		hipsModel[204].addShapeBox(13F, 3F, -3F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[204].setRotationPoint(20F, -50F, 0F);

		hipsModel[205].addShapeBox(13F, 9F, -3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[205].setRotationPoint(20F, -50F, 0F);

		hipsModel[206].addShapeBox(17F, 13F, -3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[206].setRotationPoint(20F, -50F, 0F);

		hipsModel[207].addShapeBox(17F, 16F, -6F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[207].setRotationPoint(20F, -50F, 0F);

		hipsModel[208].addShapeBox(12F, 13F, -6F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 33
		hipsModel[208].setRotationPoint(20F, -50F, 0F);

		hipsModel[209].addShapeBox(16F, 16F, -6F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		hipsModel[209].setRotationPoint(20F, -50F, 0F);

		hipsModel[210].addShapeBox(17F, 20F, -4F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[210].setRotationPoint(20F, -50F, 0F);

		hipsModel[211].addShapeBox(17F, 24F, -2F, 7, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 36
		hipsModel[211].setRotationPoint(20F, -50F, 0F);

		hipsModel[212].addShapeBox(18.5F, 31F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[212].setRotationPoint(20F, -50F, 0F);

		hipsModel[213].addShapeBox(18.5F, 35F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 38
		hipsModel[213].setRotationPoint(20F, -50F, 0F);

		hipsModel[214].addShapeBox(20.5F, 39F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -7F, 2F, 0F); // Box 39
		hipsModel[214].setRotationPoint(20F, -50F, 0F);

		hipsModel[215].addShapeBox(27.5F, 41F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[215].setRotationPoint(20F, -50F, 0F);

		hipsModel[216].addShapeBox(17F, 24F, -4F, 7, 7, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 2F, -1.5F, 0F, 2F); // Box 42
		hipsModel[216].setRotationPoint(20F, -50F, 0F);

		hipsModel[217].addShapeBox(17F, 20F, -6F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 2F); // Box 43
		hipsModel[217].setRotationPoint(20F, -50F, 0F);

		hipsModel[218].addShapeBox(31.5F, 41F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 44
		hipsModel[218].setRotationPoint(20F, -50F, 0F);

		hipsModel[219].addShapeBox(18F, 16F, -7F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 45
		hipsModel[219].setRotationPoint(20F, -50F, 0F);

		hipsModel[220].addShapeBox(18F, 16F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 46
		hipsModel[220].setRotationPoint(20F, -50F, 0F);

		hipsModel[221].addShapeBox(17F, 16F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 47
		hipsModel[221].setRotationPoint(20F, -50F, 0F);

		hipsModel[222].addShapeBox(16F, 16F, -9F, 1, 2, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, -1F, 0F, 0F); // Box 48
		hipsModel[222].setRotationPoint(20F, -50F, 0F);

		hipsModel[223].addShapeBox(17F, 13F, -6F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[223].setRotationPoint(20F, -50F, 0F);

		hipsModel[224].addShapeBox(17F, 13F, -7F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[224].setRotationPoint(20F, -50F, 0F);

		hipsModel[225].addShapeBox(17F, 13F, -9F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[225].setRotationPoint(20F, -50F, 0F);

		hipsModel[226].addShapeBox(13F, 9F, -9F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[226].setRotationPoint(20F, -50F, 0F);

		hipsModel[227].addShapeBox(13F, 3F, -9F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[227].setRotationPoint(20F, -50F, 0F);

		hipsModel[228].addShapeBox(13F, -3F, -9F, 7, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 54
		hipsModel[228].setRotationPoint(20F, -50F, 0F);

		hipsModel[229].addShapeBox(13F, -5F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[229].setRotationPoint(20F, -50F, 0F);

		hipsModel[230].addShapeBox(13F, -7F, -9F, 5, 2, 2, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 56
		hipsModel[230].setRotationPoint(20F, -50F, 0F);

		hipsModel[231].addShapeBox(0F, -9F, -11F, 13, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[231].setRotationPoint(20F, -50F, 0F);

		hipsModel[232].addShapeBox(-3F, -9F, -11F, 3, 18, 4, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[232].setRotationPoint(20F, -50F, 0F);

		hipsModel[233].addShapeBox(7F, 9F, -7F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
		hipsModel[233].setRotationPoint(20F, -50F, 0F);

		hipsModel[234].addShapeBox(0F, 9F, -7F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 60
		hipsModel[234].setRotationPoint(20F, -50F, 0F);

		hipsModel[235].addShapeBox(0F, 9F, -11F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 61
		hipsModel[235].setRotationPoint(20F, -50F, 0F);

		hipsModel[236].addShapeBox(7F, 9F, -11F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		hipsModel[236].setRotationPoint(20F, -50F, 0F);

		hipsModel[237].addShapeBox(0F, 3F, -11F, 13, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[237].setRotationPoint(20F, -50F, 0F);

		hipsModel[238].addShapeBox(0F, -3F, -11F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[238].setRotationPoint(20F, -50F, 0F);

		hipsModel[239].addShapeBox(0F, -7F, -11F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[239].setRotationPoint(20F, -50F, 0F);

		hipsModel[240].addShapeBox(13F, -7F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[240].setRotationPoint(20F, -50F, 0F);

		hipsModel[241].addShapeBox(13F, -5F, -10F, 4, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[241].setRotationPoint(20F, -50F, 0F);

		hipsModel[242].addShapeBox(13F, -3F, -10F, 5, 6, 1, 0F,0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[242].setRotationPoint(20F, -50F, 0F);

		hipsModel[243].addShapeBox(13F, 3F, -10F, 6, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 69
		hipsModel[243].setRotationPoint(20F, -50F, 0F);

		hipsModel[244].addShapeBox(13F, 9F, -10F, 7, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[244].setRotationPoint(20F, -50F, 0F);

		hipsModel[245].addShapeBox(17F, 13F, -10F, 3, 3, 1, 0F,4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[245].setRotationPoint(20F, -50F, 0F);

		hipsModel[246].addShapeBox(-3F, -10F, -7F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		hipsModel[246].setRotationPoint(20F, -50F, 0F);

		hipsModel[247].addShapeBox(13F, 9F, -7F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[247].setRotationPoint(20F, -50F, 0F);

		hipsModel[248].addShapeBox(13F, 3F, -7F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[248].setRotationPoint(20F, -50F, 0F);

		hipsModel[249].addShapeBox(13F, -3F, -7F, 9, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[249].setRotationPoint(20F, -50F, 0F);

		hipsModel[250].addShapeBox(13F, -7F, -7F, 8, 4, 4, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[250].setRotationPoint(20F, -50F, 0F);

		hipsModel[251].addShapeBox(13F, -9F, -7F, 6, 2, 4, 0F,0F, -1F, 0F, -3F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[251].setRotationPoint(20F, -50F, 0F);

		hipsModel[252].addShapeBox(0F, -10F, -7F, 13, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[252].setRotationPoint(20F, -50F, 0F);

		hipsModel[253].addShapeBox(18.5F, 18F, -9F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 79
		hipsModel[253].setRotationPoint(20F, -50F, 0F);

		hipsModel[254].addShapeBox(18.5F, 18F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 80
		hipsModel[254].setRotationPoint(20F, -50F, 0F);

		hipsModel[255].addShapeBox(18.5F, 18F, -7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Box 81
		hipsModel[255].setRotationPoint(20F, -50F, 0F);

		hipsModel[256].addShapeBox(22.5F, 22F, -8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Box 82
		hipsModel[256].setRotationPoint(20F, -50F, 0F);

		hipsModel[257].addShapeBox(22.5F, 22F, -9F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Box 83
		hipsModel[257].setRotationPoint(20F, -50F, 0F);

		hipsModel[258].addShapeBox(22.5F, 22F, -7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Box 84
		hipsModel[258].setRotationPoint(20F, -50F, 0F);

		hipsModel[259].addShapeBox(24.5F, 22F, -8.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[259].setRotationPoint(20F, -50F, 0F);

		hipsModel[260].addShapeBox(24.5F, 22F, -7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Box 86
		hipsModel[260].setRotationPoint(20F, -50F, 0F);

		hipsModel[261].addShapeBox(8F, -8F, -13F, 2, 18, 6, 0F,5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[261].setRotationPoint(20F, -50F, 0F);

		hipsModel[262].addShapeBox(3F, -9F, -16F, 2, 19, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		hipsModel[262].setRotationPoint(20F, -50F, 0F);

		hipsModel[263].addShapeBox(0F, -9F, -24F, 2, 19, 8, 0F,7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		hipsModel[263].setRotationPoint(20F, -50F, 0F);

		hipsModel[264].addShapeBox(-7F, -8F, -27F, 2, 18, 3, 0F,3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[264].setRotationPoint(20F, -50F, 0F);

		hipsModel[265].addShapeBox(-10F, -6F, -29F, 2, 16, 2, 0F,1F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -1F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[265].setRotationPoint(20F, -50F, 0F);

		hipsModel[266].addShapeBox(8F, 10F, -13F, 2, 9, 6, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 92
		hipsModel[266].setRotationPoint(20F, -50F, 0F);

		hipsModel[267].addShapeBox(3F, 10F, -16F, 2, 9, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		hipsModel[267].setRotationPoint(20F, -50F, 0F);

		hipsModel[268].addShapeBox(0F, 10F, -24F, 2, 8, 8, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		hipsModel[268].setRotationPoint(20F, -50F, 0F);

		hipsModel[269].addShapeBox(-7F, 10F, -27F, 2, 4, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		hipsModel[269].setRotationPoint(20F, -50F, 0F);

		hipsModel[270].addShapeBox(4F, -7F, -11F, 26, 26, 1, 0F,-10F, -10F, 0.8F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.8F, -10F, -10F, 0.5F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.5F); // Box 96
		hipsModel[270].setRotationPoint(20F, -50F, 0F);

		hipsModel[271].addShapeBox(22F, -10F, -17F, 6, 14, 3, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, -1F, 0F); // Box 226
		hipsModel[271].setRotationPoint(-6F, -37F, 0F);

		hipsModel[272].addShapeBox(14F, -6F, -17F, 8, 10, 3, 0F,0F, 3F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 2F, -1F, -1F, -2F, -2F, -1F, 0F, -1F, 0F, 2F, 1F, 0F); // Box 227
		hipsModel[272].setRotationPoint(-6F, -37F, 0F);

		hipsModel[273].addShapeBox(1F, 1F, -16F, 11, 5, 2, 0F,0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 228
		hipsModel[273].setRotationPoint(-6F, -37F, 0F);

		hipsModel[274].addShapeBox(-3F, 1F, -16F, 4, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		hipsModel[274].setRotationPoint(-6F, -37F, 0F);

		hipsModel[275].addShapeBox(-15F, 2F, -18F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 230
		hipsModel[275].setRotationPoint(-6F, -37F, 0F);

		hipsModel[276].addShapeBox(-21F, 2F, -18F, 6, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 231
		hipsModel[276].setRotationPoint(-6F, -37F, 0F);

		hipsModel[277].addShapeBox(-27F, 2F, -18F, 6, 6, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 232
		hipsModel[277].setRotationPoint(-6F, -37F, 0F);

		hipsModel[278].addShapeBox(-34F, 3F, -18F, 7, 5, 4, 0F,-3F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, -3F, -2F, 0F, -2F, -1F, 0F, 1F, 0F, -2F, 0F, 0F); // Box 233
		hipsModel[278].setRotationPoint(-6F, -37F, 0F);

		hipsModel[279].addShapeBox(-35F, -9F, -18F, 5, 14, 4, 0F,-3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -3F, -1F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 234
		hipsModel[279].setRotationPoint(-6F, -37F, 0F);

		hipsModel[280].addShapeBox(-35F, -16F, -18F, 5, 7, 4, 0F,-4F, -2F, 0F, 3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 235
		hipsModel[280].setRotationPoint(-6F, -37F, 0F);

		hipsModel[281].addShapeBox(-35F, -21F, -18F, 5, 5, 4, 0F,-5F, -5F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, 2F, 0F, 3F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		hipsModel[281].setRotationPoint(-6F, -37F, 0F);

		hipsModel[282].addShapeBox(-30F, -21F, -18F, 10, 7, 4, 0F,-3F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		hipsModel[282].setRotationPoint(-6F, -37F, 0F);

		hipsModel[283].addShapeBox(-20F, -21F, -18F, 5, 7, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		hipsModel[283].setRotationPoint(-6F, -37F, 0F);

		hipsModel[284].addShapeBox(1F, -21F, -17F, 10, 7, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		hipsModel[284].setRotationPoint(-6F, -37F, 0F);

		hipsModel[285].addShapeBox(-3F, -21F, -16F, 4, 7, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		hipsModel[285].setRotationPoint(-6F, -37F, 0F);

		hipsModel[286].addShapeBox(-15F, -21F, -18F, 12, 7, 4, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		hipsModel[286].setRotationPoint(-6F, -37F, 0F);

		hipsModel[287].addShapeBox(11F, -21F, -18F, 3, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		hipsModel[287].setRotationPoint(-6F, -37F, 0F);

		hipsModel[288].addShapeBox(14F, -21F, -17F, 8, 7, 3, 0F,0F, 0F, 0F, -2F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 243
		hipsModel[288].setRotationPoint(-6F, -37F, 0F);

		hipsModel[289].addShapeBox(22F, -21F, -22F, 6, 11, 3, 0F,2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 244
		hipsModel[289].setRotationPoint(-6F, -37F, 5F);

		hipsModel[290].addShapeBox(14F, -14F, -17F, 8, 5, 3, 0F,0F, 0F, 2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 245
		hipsModel[290].setRotationPoint(-6F, -37F, 0F);

		hipsModel[291].addShapeBox(11F, -14F, -19F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		hipsModel[291].setRotationPoint(-6F, -37F, 0F);

		hipsModel[292].addShapeBox(1F, -14F, -17F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		hipsModel[292].setRotationPoint(-6F, -37F, 0F);

		hipsModel[293].addShapeBox(-3F, -14F, -18F, 4, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		hipsModel[293].setRotationPoint(-6F, -37F, 0F);

		hipsModel[294].addShapeBox(-15F, -14F, -20F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		hipsModel[294].setRotationPoint(-6F, -37F, 0F);

		hipsModel[295].addShapeBox(-27F, -9F, -18F, 7, 11, 4, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		hipsModel[295].setRotationPoint(-6F, -37F, 0F);

		hipsModel[296].addShapeBox(-27F, -14F, -19F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		hipsModel[296].setRotationPoint(-6F, -37F, 0F);

		hipsModel[297].addShapeBox(-20F, -14F, -25F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		hipsModel[297].setRotationPoint(-6F, -37F, 5F);

		hipsModel[298].addShapeBox(-20F, -9F, -18F, 5, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		hipsModel[298].setRotationPoint(-6F, -37F, 0F);

		hipsModel[299].addShapeBox(-15F, -9F, -18F, 12, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 254
		hipsModel[299].setRotationPoint(-6F, -37F, 0F);

		hipsModel[300].addShapeBox(-3F, -9F, -17F, 4, 10, 3, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		hipsModel[300].setRotationPoint(-6F, -37F, 0F);

		hipsModel[301].addShapeBox(1F, -9F, -17F, 10, 10, 3, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 1F, 2F, 0F, 0F, 0F, 0F); // Box 256
		hipsModel[301].setRotationPoint(-6F, -37F, 0F);

		hipsModel[302].addShapeBox(11F, -9F, -18F, 3, 10, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -2F, -2F, 2F, -2F, -2F, 2F, 0F, -1F, 2F, 0F); // Box 257
		hipsModel[302].setRotationPoint(-6F, -37F, 0F);

		hipsModel[303].addShapeBox(13F, 13F, -9F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 1
		hipsModel[303].setRotationPoint(20F, -50F, 0F);
	}



	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 37, 43, textureX, textureY); // Box 224

		rightArmModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightArmModel[0].setRotationPoint(15F, -67F, 6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 186, 34, textureX, textureY); // Box 98
		leftLegModel[1] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Box 103
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 124, textureX, textureY); // Box 104
		leftLegModel[3] = new ModelRendererTurbo(this, 220, 109, textureX, textureY); // Box 105
		leftLegModel[4] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Box 107
		leftLegModel[5] = new ModelRendererTurbo(this, 177, 142, textureX, textureY); // Box 108
		leftLegModel[6] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Box 109
		leftLegModel[7] = new ModelRendererTurbo(this, 177, 101, textureX, textureY); // Box 110
		leftLegModel[8] = new ModelRendererTurbo(this, 177, 156, textureX, textureY); // Box 111
		leftLegModel[9] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Box 112
		leftLegModel[10] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Box 117
		leftLegModel[11] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Box 118
		leftLegModel[12] = new ModelRendererTurbo(this, 177, 196, textureX, textureY); // Box 119
		leftLegModel[13] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Box 120
		leftLegModel[14] = new ModelRendererTurbo(this, 177, 174, textureX, textureY); // Box 121
		leftLegModel[15] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Box 122
		leftLegModel[16] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Box 123
		leftLegModel[17] = new ModelRendererTurbo(this, 177, 207, textureX, textureY); // Box 124
		leftLegModel[18] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Box 125
		leftLegModel[19] = new ModelRendererTurbo(this, 177, 218, textureX, textureY); // Box 126
		leftLegModel[20] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Box 127
		leftLegModel[21] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Box 128
		leftLegModel[22] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Box 129
		leftLegModel[23] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Box 130
		leftLegModel[24] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Box 131
		leftLegModel[25] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Box 132
		leftLegModel[26] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Box 133
		leftLegModel[27] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Box 134
		leftLegModel[28] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Box 135
		leftLegModel[29] = new ModelRendererTurbo(this, 186, 34, textureX, textureY); // Box 164
		leftLegModel[30] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Box 166
		leftLegModel[31] = new ModelRendererTurbo(this, 177, 218, textureX, textureY); // Box 167
		leftLegModel[32] = new ModelRendererTurbo(this, 220, 211, textureX, textureY); // Box 168
		leftLegModel[33] = new ModelRendererTurbo(this, 177, 207, textureX, textureY); // Box 169
		leftLegModel[34] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Box 170
		leftLegModel[35] = new ModelRendererTurbo(this, 220, 203, textureX, textureY); // Box 171
		leftLegModel[36] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Box 172
		leftLegModel[37] = new ModelRendererTurbo(this, 177, 196, textureX, textureY); // Box 173
		leftLegModel[38] = new ModelRendererTurbo(this, 220, 195, textureX, textureY); // Box 174
		leftLegModel[39] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Box 175
		leftLegModel[40] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Box 176
		leftLegModel[41] = new ModelRendererTurbo(this, 220, 186, textureX, textureY); // Box 177
		leftLegModel[42] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Box 178
		leftLegModel[43] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Box 179
		leftLegModel[44] = new ModelRendererTurbo(this, 177, 174, textureX, textureY); // Box 180
		leftLegModel[45] = new ModelRendererTurbo(this, 220, 180, textureX, textureY); // Box 181
		leftLegModel[46] = new ModelRendererTurbo(this, 220, 163, textureX, textureY); // Box 182
		leftLegModel[47] = new ModelRendererTurbo(this, 177, 156, textureX, textureY); // Box 183
		leftLegModel[48] = new ModelRendererTurbo(this, 177, 142, textureX, textureY); // Box 184
		leftLegModel[49] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Box 185
		leftLegModel[50] = new ModelRendererTurbo(this, 220, 154, textureX, textureY); // Box 186
		leftLegModel[51] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Box 187
		leftLegModel[52] = new ModelRendererTurbo(this, 177, 124, textureX, textureY); // Box 188
		leftLegModel[53] = new ModelRendererTurbo(this, 220, 140, textureX, textureY); // Box 189
		leftLegModel[54] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Box 190
		leftLegModel[55] = new ModelRendererTurbo(this, 220, 122, textureX, textureY); // Box 191
		leftLegModel[56] = new ModelRendererTurbo(this, 177, 101, textureX, textureY); // Box 192
		leftLegModel[57] = new ModelRendererTurbo(this, 220, 109, textureX, textureY); // Box 193
		leftLegModel[58] = new ModelRendererTurbo(this, 218, 94, textureX, textureY); // Box 194
		leftLegModel[59] = new ModelRendererTurbo(this, 218, 94, textureX, textureY); // Box 195

		leftLegModel[0].addBox(-1F, -1F, 0F, 2, 2, 19, 0F); // Box 98
		leftLegModel[0].setRotationPoint(10F, -38F, 0F);

		leftLegModel[1].addShapeBox(-7F, 8F, 16F, 12, 8, 3, 0F,3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Box 103
		leftLegModel[1].setRotationPoint(10F, -38F, 0F);

		leftLegModel[2].addShapeBox(-7F, 8F, 12F, 12, 8, 4, 0F,3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 104
		leftLegModel[2].setRotationPoint(10F, -38F, 0F);

		leftLegModel[3].addShapeBox(-7F, -8F, 16F, 12, 4, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 105
		leftLegModel[3].setRotationPoint(10F, -38F, 0F);

		leftLegModel[4].addShapeBox(-10F, 16F, 16F, 13, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 107
		leftLegModel[4].setRotationPoint(10F, -38F, 0F);

		leftLegModel[5].addShapeBox(-10F, 16F, 12F, 13, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftLegModel[5].setRotationPoint(10F, -38F, 0F);

		leftLegModel[6].addShapeBox(-7F, -4F, 16F, 12, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F); // Box 109
		leftLegModel[6].setRotationPoint(10F, -38F, 0F);

		leftLegModel[7].addShapeBox(-7F, -4F, 12F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F); // Box 110
		leftLegModel[7].setRotationPoint(10F, -38F, 0F);

		leftLegModel[8].addShapeBox(-10F, 19F, 12F, 13, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 111
		leftLegModel[8].setRotationPoint(10F, -38F, 0F);

		leftLegModel[9].addShapeBox(-10F, 19F, 16F, 13, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F); // Box 112
		leftLegModel[9].setRotationPoint(10F, -38F, 0F);

		leftLegModel[10].addShapeBox(-5F, 30F, 12F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 117
		leftLegModel[10].setRotationPoint(10F, -38F, 0F);

		leftLegModel[11].addShapeBox(-5F, 30F, 16F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F); // Box 118
		leftLegModel[11].setRotationPoint(10F, -38F, 0F);

		leftLegModel[12].addShapeBox(-6.5F, 33F, 12F, 12, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftLegModel[12].setRotationPoint(10F, -38F, 0F);

		leftLegModel[13].addShapeBox(-6.5F, 33F, 16F, 12, 2, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F); // Box 120
		leftLegModel[13].setRotationPoint(10F, -38F, 0F);

		leftLegModel[14].addShapeBox(-5F, 29F, 12F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftLegModel[14].setRotationPoint(10F, -38F, 0F);

		leftLegModel[15].addShapeBox(-5F, 29F, 16F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 122
		leftLegModel[15].setRotationPoint(10F, -38F, 0F);

		leftLegModel[16].addShapeBox(-6.5F, 35F, 16F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 123
		leftLegModel[16].setRotationPoint(10F, -38F, 0F);

		leftLegModel[17].addShapeBox(-6.5F, 35F, 12F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 124
		leftLegModel[17].setRotationPoint(10F, -38F, 0F);

		leftLegModel[18].addShapeBox(-6.5F, 37F, 16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 125
		leftLegModel[18].setRotationPoint(10F, -38F, 0F);

		leftLegModel[19].addShapeBox(-6.5F, 37F, 12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftLegModel[19].setRotationPoint(10F, -38F, 0F);

		leftLegModel[20].addShapeBox(-7F, -4F, 9F, 12, 12, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F); // Box 127
		leftLegModel[20].setRotationPoint(10F, -38F, 0F);

		leftLegModel[21].addShapeBox(-7F, 8F, 9F, 12, 8, 3, 0F,-1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 128
		leftLegModel[21].setRotationPoint(10F, -38F, 0F);

		leftLegModel[22].addShapeBox(-10F, 16F, 9F, 13, 3, 3, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftLegModel[22].setRotationPoint(10F, -38F, 0F);

		leftLegModel[23].addShapeBox(-10F, 19F, 9F, 13, 10, 3, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 130
		leftLegModel[23].setRotationPoint(10F, -38F, 0F);

		leftLegModel[24].addShapeBox(-5F, 29F, 9F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftLegModel[24].setRotationPoint(10F, -38F, 0F);

		leftLegModel[25].addShapeBox(-5F, 30F, 9F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
		leftLegModel[25].setRotationPoint(10F, -38F, 0F);

		leftLegModel[26].addShapeBox(-6.5F, 33F, 9F, 12, 2, 3, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftLegModel[26].setRotationPoint(10F, -38F, 0F);

		leftLegModel[27].addShapeBox(-6.5F, 35F, 8F, 12, 2, 4, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 134
		leftLegModel[27].setRotationPoint(10F, -38F, 0F);

		leftLegModel[28].addShapeBox(-6.5F, 37F, 8F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftLegModel[28].setRotationPoint(10F, -38F, 0F);

		leftLegModel[29].addBox(-1F, -1F, -19F, 2, 2, 19, 0F); // Box 164
		leftLegModel[29].setRotationPoint(10F, -38F, 0F);

		leftLegModel[30].addShapeBox(-6.5F, 37F, -20F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		leftLegModel[30].setRotationPoint(10F, -38F, 0F);

		leftLegModel[31].addShapeBox(-6.5F, 37F, -16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftLegModel[31].setRotationPoint(10F, -38F, 0F);

		leftLegModel[32].addShapeBox(-6.5F, 37F, -12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 168
		leftLegModel[32].setRotationPoint(10F, -38F, 0F);

		leftLegModel[33].addShapeBox(-6.5F, 35F, -16F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 169
		leftLegModel[33].setRotationPoint(10F, -38F, 0F);

		leftLegModel[34].addShapeBox(-6.5F, 35F, -20F, 12, 2, 4, 0F,-3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		leftLegModel[34].setRotationPoint(10F, -38F, 0F);

		leftLegModel[35].addShapeBox(-6.5F, 35F, -12F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 171
		leftLegModel[35].setRotationPoint(10F, -38F, 0F);

		leftLegModel[36].addShapeBox(-6.5F, 33F, -12F, 12, 2, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, .5F, -4F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F); // Box 172
		leftLegModel[36].setRotationPoint(10F, -38F, 0F);

		leftLegModel[37].addShapeBox(-6.5F, 33F, -16F, 12, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		leftLegModel[37].setRotationPoint(10F, -38F, 0F);

		leftLegModel[38].addShapeBox(-6.5F, 33F, -19F, 12, 2, 3, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		leftLegModel[38].setRotationPoint(10F, -38F, 0F);

		leftLegModel[39].addShapeBox(-5F, 30F, -19F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 175
		leftLegModel[39].setRotationPoint(10F, -38F, 0F);

		leftLegModel[40].addShapeBox(-5F, 30F, -16F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 176
		leftLegModel[40].setRotationPoint(10F, -38F, 0F);

		leftLegModel[41].addShapeBox(-5F, 30F, -12F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2.5F, 0F, .5F, -2.5F, 0F, .5F); // Box 177
		leftLegModel[41].setRotationPoint(10F, -38F, 0F);

		leftLegModel[42].addShapeBox(-10F, 19F, -12F, 13, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F); // Box 178
		leftLegModel[42].setRotationPoint(10F, -38F, 0F);

		leftLegModel[43].addShapeBox(-5F, 29F, -12F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 179
		leftLegModel[43].setRotationPoint(10F, -38F, 0F);

		leftLegModel[44].addShapeBox(-5F, 29F, -16F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		leftLegModel[44].setRotationPoint(10F, -38F, 0F);

		leftLegModel[45].addShapeBox(-5F, 29F, -19F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftLegModel[45].setRotationPoint(10F, -38F, 0F);

		leftLegModel[46].addShapeBox(-10F, 19F, -19F, 13, 10, 3, 0F,-5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 182
		leftLegModel[46].setRotationPoint(10F, -38F, 0F);

		leftLegModel[47].addShapeBox(-10F, 19F, -16F, 13, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F); // Box 183
		leftLegModel[47].setRotationPoint(10F, -38F, 0F);

		leftLegModel[48].addShapeBox(-10F, 16F, -16F, 13, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftLegModel[48].setRotationPoint(10F, -38F, 0F);

		leftLegModel[49].addShapeBox(-10F, 16F, -19F, 13, 3, 3, 0F,-4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftLegModel[49].setRotationPoint(10F, -38F, 0F);

		leftLegModel[50].addShapeBox(-10F, 16F, -12F, 13, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 186
		leftLegModel[50].setRotationPoint(10F, -38F, 0F);

		leftLegModel[51].addShapeBox(-7F, 8F, -12F, 12, 8, 3, 0F,3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F, 4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F); // Box 187
		leftLegModel[51].setRotationPoint(10F, -38F, 0F);

		leftLegModel[52].addShapeBox(-7F, 8F, -16F, 12, 8, 4, 0F,3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 188
		leftLegModel[52].setRotationPoint(10F, -38F, 0F);

		leftLegModel[53].addShapeBox(-7F, 8F, -19F, 12, 8, 3, 0F,-1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F); // Box 189
		leftLegModel[53].setRotationPoint(10F, -38F, 0F);

		leftLegModel[54].addShapeBox(-7F, -4F, -19F, 12, 12, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0F, 0F, 3F, 0F, 0F); // Box 190
		leftLegModel[54].setRotationPoint(10F, -38F, 0F);

		leftLegModel[55].addShapeBox(-7F, -4F, -12F, 12, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 1F, -1F, 0F, 1F); // Box 191
		leftLegModel[55].setRotationPoint(10F, -38F, 0F);

		leftLegModel[56].addShapeBox(-7F, -4F, -16F, 12, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F); // Box 192
		leftLegModel[56].setRotationPoint(10F, -38F, 0F);

		leftLegModel[57].addShapeBox(-7F, -8F, -19F, 12, 4, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftLegModel[57].setRotationPoint(10F, -38F, 0F);

		leftLegModel[58].addShapeBox(-7F, -8F, -16F, 11, 4, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		leftLegModel[58].setRotationPoint(10F, -38F, 0F);

		leftLegModel[59].addShapeBox(-7F, -8F, 12F, 11, 4, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftLegModel[59].setRotationPoint(10F, -38F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 233, 35, textureX, textureY); // Box 102
		rightLegModel[1] = new ModelRendererTurbo(this, 185, 348, textureX, textureY); // Box 136
		rightLegModel[2] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Box 137
		rightLegModel[3] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Box 138
		rightLegModel[4] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Box 139
		rightLegModel[5] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Box 140
		rightLegModel[6] = new ModelRendererTurbo(this, 185, 326, textureX, textureY); // Box 141
		rightLegModel[7] = new ModelRendererTurbo(this, 185, 314, textureX, textureY); // Box 142
		rightLegModel[8] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Box 143
		rightLegModel[9] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Box 144
		rightLegModel[10] = new ModelRendererTurbo(this, 185, 304, textureX, textureY); // Box 145
		rightLegModel[11] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Box 146
		rightLegModel[12] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Box 147
		rightLegModel[13] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Box 148
		rightLegModel[14] = new ModelRendererTurbo(this, 185, 272, textureX, textureY); // Box 149
		rightLegModel[15] = new ModelRendererTurbo(this, 185, 254, textureX, textureY); // Box 150
		rightLegModel[16] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Box 151
		rightLegModel[17] = new ModelRendererTurbo(this, 185, 231, textureX, textureY); // Box 152
		rightLegModel[18] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Box 153
		rightLegModel[19] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 154
		rightLegModel[20] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Box 155
		rightLegModel[21] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Box 156
		rightLegModel[22] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Box 157
		rightLegModel[23] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Box 158
		rightLegModel[24] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Box 159
		rightLegModel[25] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Box 160
		rightLegModel[26] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Box 161
		rightLegModel[27] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Box 162
		rightLegModel[28] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Box 163
		rightLegModel[29] = new ModelRendererTurbo(this, 233, 35, textureX, textureY); // Box 165
		rightLegModel[30] = new ModelRendererTurbo(this, 228, 239, textureX, textureY); // Box 196
		rightLegModel[31] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Box 197
		rightLegModel[32] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Box 198
		rightLegModel[33] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Box 199
		rightLegModel[34] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Box 200
		rightLegModel[35] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Box 201
		rightLegModel[36] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Box 202
		rightLegModel[37] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Box 203
		rightLegModel[38] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Box 204
		rightLegModel[39] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Box 205
		rightLegModel[40] = new ModelRendererTurbo(this, 185, 348, textureX, textureY); // Box 206
		rightLegModel[41] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Box 207
		rightLegModel[42] = new ModelRendererTurbo(this, 185, 326, textureX, textureY); // Box 208
		rightLegModel[43] = new ModelRendererTurbo(this, 185, 314, textureX, textureY); // Box 209
		rightLegModel[44] = new ModelRendererTurbo(this, 185, 304, textureX, textureY); // Box 210
		rightLegModel[45] = new ModelRendererTurbo(this, 185, 286, textureX, textureY); // Box 211
		rightLegModel[46] = new ModelRendererTurbo(this, 185, 272, textureX, textureY); // Box 212
		rightLegModel[47] = new ModelRendererTurbo(this, 185, 254, textureX, textureY); // Box 213
		rightLegModel[48] = new ModelRendererTurbo(this, 185, 231, textureX, textureY); // Box 214
		rightLegModel[49] = new ModelRendererTurbo(this, 228, 252, textureX, textureY); // Box 215
		rightLegModel[50] = new ModelRendererTurbo(this, 228, 270, textureX, textureY); // Box 216
		rightLegModel[51] = new ModelRendererTurbo(this, 228, 284, textureX, textureY); // Box 217
		rightLegModel[52] = new ModelRendererTurbo(this, 228, 293, textureX, textureY); // Box 218
		rightLegModel[53] = new ModelRendererTurbo(this, 228, 310, textureX, textureY); // Box 219
		rightLegModel[54] = new ModelRendererTurbo(this, 228, 316, textureX, textureY); // Box 220
		rightLegModel[55] = new ModelRendererTurbo(this, 228, 325, textureX, textureY); // Box 221
		rightLegModel[56] = new ModelRendererTurbo(this, 228, 333, textureX, textureY); // Box 222
		rightLegModel[57] = new ModelRendererTurbo(this, 228, 341, textureX, textureY); // Box 223

		rightLegModel[0].addBox(-1F, -1F, 0F, 2, 2, 19, 0F); // Box 102
		rightLegModel[0].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[1].addShapeBox(-7.5F, 37F, 12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightLegModel[1].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[2].addShapeBox(-7.5F, 37F, 16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 137
		rightLegModel[2].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[3].addShapeBox(-7.5F, 35F, 16F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 138
		rightLegModel[3].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[4].addShapeBox(-7.5F, 35F, 12F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 139
		rightLegModel[4].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[5].addShapeBox(-7.5F, 33F, 16F, 12, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1F); // Box 140
		rightLegModel[5].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[6].addShapeBox(-7.5F, 33F, 12F, 12, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 141
		rightLegModel[6].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[7].addShapeBox(-7F, 30F, 12F, 10, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 142
		rightLegModel[7].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[8].addShapeBox(-7F, 30F, 16F, 10, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 143
		rightLegModel[8].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[9].addShapeBox(-6F, 26F, 16F, 9, 4, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 144
		rightLegModel[9].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[10].addShapeBox(-6F, 26F, 12F, 9, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 145
		rightLegModel[10].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[11].addShapeBox(-5F, 19F, 12F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 146
		rightLegModel[11].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[12].addShapeBox(-5F, 19F, 16F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F); // Box 147
		rightLegModel[12].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[13].addShapeBox(-5F, 16F, 16F, 13, 3, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 148
		rightLegModel[13].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[14].addShapeBox(-5F, 16F, 12F, 13, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		rightLegModel[14].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[15].addShapeBox(-7F, 8F, 12F, 12, 8, 4, 0F,2F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 150
		rightLegModel[15].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[16].addShapeBox(-7F, 8F, 16F, 12, 8, 3, 0F,2F, -3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -3F, -3F, 1F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 151
		rightLegModel[16].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[17].addShapeBox(-8F, -4F, 12F, 16, 12, 4, 0F,4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 1F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 3F, 0F); // Box 152
		rightLegModel[17].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[18].addShapeBox(-8F, -4F, 16F, 13, 12, 3, 0F,4F, -3F, 0F, 3F, 0F, 0F, 0F, -2F, 1F, -2F, -3F, 1F, 1F, 3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -4F, 3F, 1F); // Box 153
		rightLegModel[18].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[19].addShapeBox(-8F, -8F, 16F, 16, 4, 4, 0F,-1F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -2F, -3F, 0F, -2F, 4F, 3F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -2F, 3F, 0F); // Box 154
		rightLegModel[19].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[20].addShapeBox(-8F, -4F, 9F, 13, 12, 3, 0F,-2F, -3F, 1F, 0F, -2F, 1F, 3F, 0F, 0F, 4F, -3F, 0F, -4F, 3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 1F, 3F, 0F); // Box 155
		rightLegModel[20].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[21].addShapeBox(-7F, 8F, 9F, 12, 8, 3, 0F,-3F, -3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 2F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 156
		rightLegModel[21].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[22].addShapeBox(-5F, 16F, 9F, 13, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightLegModel[22].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[23].addShapeBox(-5F, 19F, 9F, 13, 7, 3, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 158
		rightLegModel[23].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[24].addShapeBox(-6F, 26F, 9F, 9, 4, 3, 0F,-3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 159
		rightLegModel[24].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[25].addShapeBox(-7F, 30F, 9F, 10, 3, 3, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 160
		rightLegModel[25].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[26].addShapeBox(-7.5F, 33F, 9F, 12, 2, 3, 0F,-3F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 161
		rightLegModel[26].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[27].addShapeBox(-7.5F, 35F, 8F, 12, 2, 4, 0F,-3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 162
		rightLegModel[27].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[28].addShapeBox(-7.5F, 37F, 8F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rightLegModel[28].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[29].addBox(-1F, -1F, -19F, 2, 2, 19, 0F); // Box 165
		rightLegModel[29].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[30].addShapeBox(-8F, -8F, -20F, 16, 4, 4, 0F,-3F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 3F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 4F, 3F, 0F); // Box 196
		rightLegModel[30].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[31].addShapeBox(-8F, -4F, -12F, 13, 12, 3, 0F,4F, -3F, 0F, 3F, 0F, 0F, 0F, -2F, 1F, -2F, -3F, 1F, 1F, 3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -4F, 3F, 1F); // Box 197
		rightLegModel[31].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[32].addShapeBox(-7F, 8F, -12F, 12, 8, 3, 0F,2F, -3F, 0F, 6F, 0F, 0F, 2F, 0F, 1F, -3F, -3F, 1F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 198
		rightLegModel[32].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[33].addShapeBox(-5F, 16F, -12F, 13, 3, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F); // Box 199
		rightLegModel[33].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[34].addShapeBox(-5F, 19F, -12F, 13, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F); // Box 200
		rightLegModel[34].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[35].addShapeBox(-6F, 26F, -12F, 9, 4, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 201
		rightLegModel[35].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[36].addShapeBox(-7F, 30F, -12F, 10, 3, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 202
		rightLegModel[36].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[37].addShapeBox(-7.5F, 33F, -12F, 12, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1F); // Box 203
		rightLegModel[37].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[38].addShapeBox(-7.5F, 35F, -12F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F); // Box 204
		rightLegModel[38].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[39].addShapeBox(-7.5F, 37F, -12F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 205
		rightLegModel[39].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[40].addShapeBox(-7.5F, 37F, -16F, 12, 1, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		rightLegModel[40].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[41].addShapeBox(-7.5F, 35F, -16F, 12, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 207
		rightLegModel[41].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[42].addShapeBox(-7.5F, 33F, -16F, 12, 2, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 208
		rightLegModel[42].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[43].addShapeBox(-7F, 30F, -16F, 10, 3, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F); // Box 209
		rightLegModel[43].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[44].addShapeBox(-6F, 26F, -16F, 9, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 210
		rightLegModel[44].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[45].addShapeBox(-5F, 19F, -16F, 13, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 211
		rightLegModel[45].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[46].addShapeBox(-5F, 16F, -16F, 13, 3, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightLegModel[46].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[47].addShapeBox(-7F, 8F, -16F, 12, 8, 4, 0F,2F, -3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -3F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 213
		rightLegModel[47].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[48].addShapeBox(-8F, -4F, -16F, 16, 12, 4, 0F,4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 1F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 3F, 0F); // Box 214
		rightLegModel[48].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[49].addShapeBox(-8F, -4F, -19F, 13, 12, 3, 0F,-2F, -3F, 1F, 0F, -2F, 1F, 3F, 0F, 0F, 4F, -3F, 0F, -4F, 3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 1F, 3F, 0F); // Box 215
		rightLegModel[49].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[50].addShapeBox(-7F, 8F, -19F, 12, 8, 3, 0F,-3F, -3F, 1F, 2F, 0F, 1F, 6F, 0F, 0F, 2F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F); // Box 216
		rightLegModel[50].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[51].addShapeBox(-5F, 16F, -19F, 13, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightLegModel[51].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[52].addShapeBox(-5F, 19F, -19F, 13, 7, 3, 0F,-3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 218
		rightLegModel[52].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[53].addShapeBox(-6F, 26F, -19F, 9, 4, 3, 0F,-3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 219
		rightLegModel[53].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[54].addShapeBox(-7F, 30F, -19F, 10, 3, 3, 0F,-2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 220
		rightLegModel[54].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[55].addShapeBox(-7.5F, 33F, -19F, 12, 2, 3, 0F,-3F, 0F, 0.5F, -4F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -3.5F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 221
		rightLegModel[55].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[56].addShapeBox(-7.5F, 35F, -20F, 12, 2, 4, 0F,-3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 222
		rightLegModel[56].setRotationPoint(-27F, -38F, 0F);

		rightLegModel[57].addShapeBox(-7.5F, 37F, -20F, 12, 1, 4, 0F,-3F, 0F, 1F, -3F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightLegModel[57].setRotationPoint(-27F, -38F, 0F);
	}
}