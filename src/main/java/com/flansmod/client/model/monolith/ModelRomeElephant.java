//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RomanianWarElephant
// Model Creator: 
// Created on: 30.11.2019 - 21:50:53
// Last changed on: 30.11.2019 - 21:50:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomeElephant extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRomeElephant() //Same as Filename
	{
		hipsModel = new ModelRendererTurbo[590];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[60];
		rightLegModel = new ModelRendererTurbo[58];

		inithipsModel_1();
		inithipsModel_2();
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
		hipsModel[71] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Box 2
		hipsModel[72] = new ModelRendererTurbo(this, 70, 64, textureX, textureY); // Box 3
		hipsModel[73] = new ModelRendererTurbo(this, 59, 52, textureX, textureY); // Box 4
		hipsModel[74] = new ModelRendererTurbo(this, 59, 61, textureX, textureY); // Box 5
		hipsModel[75] = new ModelRendererTurbo(this, 59, 70, textureX, textureY); // Box 6
		hipsModel[76] = new ModelRendererTurbo(this, 7, 41, textureX, textureY); // Box 8
		hipsModel[77] = new ModelRendererTurbo(this, 7, 83, textureX, textureY); // Box 9
		hipsModel[78] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 10
		hipsModel[79] = new ModelRendererTurbo(this, 7, 111, textureX, textureY); // Box 11
		hipsModel[80] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Box 12
		hipsModel[81] = new ModelRendererTurbo(this, 7, 136, textureX, textureY); // Box 13
		hipsModel[82] = new ModelRendererTurbo(this, 7, 147, textureX, textureY); // Box 14
		hipsModel[83] = new ModelRendererTurbo(this, 7, 161, textureX, textureY); // Box 15
		hipsModel[84] = new ModelRendererTurbo(this, 7, 172, textureX, textureY); // Box 16
		hipsModel[85] = new ModelRendererTurbo(this, 7, 204, textureX, textureY); // Box 17
		hipsModel[86] = new ModelRendererTurbo(this, 44, 204, textureX, textureY); // Box 18
		hipsModel[87] = new ModelRendererTurbo(this, 44, 187, textureX, textureY); // Box 19
		hipsModel[88] = new ModelRendererTurbo(this, 44, 169, textureX, textureY); // Box 20
		hipsModel[89] = new ModelRendererTurbo(this, 47, 149, textureX, textureY); // Box 21
		hipsModel[90] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Box 22
		hipsModel[91] = new ModelRendererTurbo(this, 44, 118, textureX, textureY); // Box 23
		hipsModel[92] = new ModelRendererTurbo(this, 44, 101, textureX, textureY); // Box 24
		hipsModel[93] = new ModelRendererTurbo(this, 44, 86, textureX, textureY); // Box 25
		hipsModel[94] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Box 26
		hipsModel[95] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 27
		hipsModel[96] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 28
		hipsModel[97] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 29
		hipsModel[98] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 30
		hipsModel[99] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 31
		hipsModel[100] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 32
		hipsModel[101] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 33
		hipsModel[102] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 34
		hipsModel[103] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 35
		hipsModel[104] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 36
		hipsModel[105] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 37
		hipsModel[106] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 38
		hipsModel[107] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 39
		hipsModel[108] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 40
		hipsModel[109] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 41
		hipsModel[110] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 42
		hipsModel[111] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 43
		hipsModel[112] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 44
		hipsModel[113] = new ModelRendererTurbo(this, 83, 42, textureX, textureY); // Box 45
		hipsModel[114] = new ModelRendererTurbo(this, 59, 44, textureX, textureY); // Box 48
		hipsModel[115] = new ModelRendererTurbo(this, 70, 55, textureX, textureY); // Box 49
		hipsModel[116] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Box 53
		hipsModel[117] = new ModelRendererTurbo(this, 7, 363, textureX, textureY); // Box 56
		hipsModel[118] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Box 57
		hipsModel[119] = new ModelRendererTurbo(this, 65, 363, textureX, textureY); // Box 58
		hipsModel[120] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Box 59
		hipsModel[121] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 61
		hipsModel[122] = new ModelRendererTurbo(this, 7, 340, textureX, textureY); // Box 62
		hipsModel[123] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 63
		hipsModel[124] = new ModelRendererTurbo(this, 7, 351, textureX, textureY); // Box 64
		hipsModel[125] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 65
		hipsModel[126] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Box 66
		hipsModel[127] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 68
		hipsModel[128] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 69
		hipsModel[129] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Box 73
		hipsModel[130] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 74
		hipsModel[131] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Box 75
		hipsModel[132] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 76
		hipsModel[133] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 77
		hipsModel[134] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 78
		hipsModel[135] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 79
		hipsModel[136] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Box 80
		hipsModel[137] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Box 81
		hipsModel[138] = new ModelRendererTurbo(this, 198, 393, textureX, textureY); // Box 82
		hipsModel[139] = new ModelRendererTurbo(this, 198, 406, textureX, textureY); // Box 83
		hipsModel[140] = new ModelRendererTurbo(this, 200, 421, textureX, textureY); // Box 84
		hipsModel[141] = new ModelRendererTurbo(this, 198, 437, textureX, textureY); // Box 85
		hipsModel[142] = new ModelRendererTurbo(this, 235, 397, textureX, textureY); // Box 89
		hipsModel[143] = new ModelRendererTurbo(this, 239, 418, textureX, textureY); // Box 90
		hipsModel[144] = new ModelRendererTurbo(this, 237, 430, textureX, textureY); // Box 91
		hipsModel[145] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 92
		hipsModel[146] = new ModelRendererTurbo(this, 238, 408, textureX, textureY); // Box 93
		hipsModel[147] = new ModelRendererTurbo(this, 78, 306, textureX, textureY); // Box 94
		hipsModel[148] = new ModelRendererTurbo(this, 262, 409, textureX, textureY); // Box 96
		hipsModel[149] = new ModelRendererTurbo(this, 265, 400, textureX, textureY); // Box 97
		hipsModel[150] = new ModelRendererTurbo(this, 264, 394, textureX, textureY); // Box 98
		hipsModel[151] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Box 99
		hipsModel[152] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Box 100
		hipsModel[153] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 103
		hipsModel[154] = new ModelRendererTurbo(this, 78, 314, textureX, textureY); // Box 104
		hipsModel[155] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Box 107
		hipsModel[156] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Box 0
		hipsModel[157] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 1
		hipsModel[158] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Box 3
		hipsModel[159] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Box 4
		hipsModel[160] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 5
		hipsModel[161] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Box 6
		hipsModel[162] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Box 7
		hipsModel[163] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Box 9
		hipsModel[164] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Box 10
		hipsModel[165] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 11
		hipsModel[166] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 14
		hipsModel[167] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Box 18
		hipsModel[168] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 19
		hipsModel[169] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 23
		hipsModel[170] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 1
		hipsModel[171] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 2
		hipsModel[172] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 3
		hipsModel[173] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Eye
		hipsModel[174] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 7
		hipsModel[175] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 9
		hipsModel[176] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 10
		hipsModel[177] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 12
		hipsModel[178] = new ModelRendererTurbo(this, 42, 303, textureX, textureY); // Box 13
		hipsModel[179] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 14
		hipsModel[180] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Box 15
		hipsModel[181] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Box 16
		hipsModel[182] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Box 17
		hipsModel[183] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Box 18
		hipsModel[184] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Box 19
		hipsModel[185] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Box 20
		hipsModel[186] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Box 21
		hipsModel[187] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 22
		hipsModel[188] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 23
		hipsModel[189] = new ModelRendererTurbo(this, 7, 248, textureX, textureY); // Box 24
		hipsModel[190] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Box 25
		hipsModel[191] = new ModelRendererTurbo(this, 7, 287, textureX, textureY); // Box 26
		hipsModel[192] = new ModelRendererTurbo(this, 7, 301, textureX, textureY); // Box 27
		hipsModel[193] = new ModelRendererTurbo(this, 7, 315, textureX, textureY); // Box 28
		hipsModel[194] = new ModelRendererTurbo(this, 7, 327, textureX, textureY); // Box 29
		hipsModel[195] = new ModelRendererTurbo(this, 7, 340, textureX, textureY); // Box 30
		hipsModel[196] = new ModelRendererTurbo(this, 7, 351, textureX, textureY); // Box 31
		hipsModel[197] = new ModelRendererTurbo(this, 42, 253, textureX, textureY); // Box 32
		hipsModel[198] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 33
		hipsModel[199] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 34
		hipsModel[200] = new ModelRendererTurbo(this, 42, 271, textureX, textureY); // Box 35
		hipsModel[201] = new ModelRendererTurbo(this, 42, 283, textureX, textureY); // Box 36
		hipsModel[202] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 37
		hipsModel[203] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 38
		hipsModel[204] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 39
		hipsModel[205] = new ModelRendererTurbo(this, 42, 294, textureX, textureY); // Box 40
		hipsModel[206] = new ModelRendererTurbo(this, 38, 322, textureX, textureY); // Box 42
		hipsModel[207] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Box 43
		hipsModel[208] = new ModelRendererTurbo(this, 35, 0, textureX, textureY); // Box 44
		hipsModel[209] = new ModelRendererTurbo(this, 89, 319, textureX, textureY); // Box 45
		hipsModel[210] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 46
		hipsModel[211] = new ModelRendererTurbo(this, 78, 319, textureX, textureY); // Box 47
		hipsModel[212] = new ModelRendererTurbo(this, 64, 340, textureX, textureY); // Box 48
		hipsModel[213] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 49
		hipsModel[214] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 50
		hipsModel[215] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 51
		hipsModel[216] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 52
		hipsModel[217] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 53
		hipsModel[218] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 54
		hipsModel[219] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 55
		hipsModel[220] = new ModelRendererTurbo(this, 62, 291, textureX, textureY); // Box 56
		hipsModel[221] = new ModelRendererTurbo(this, 82, 256, textureX, textureY); // Box 57
		hipsModel[222] = new ModelRendererTurbo(this, 22, 249, textureX, textureY); // Box 58
		hipsModel[223] = new ModelRendererTurbo(this, 122, 287, textureX, textureY); // Box 59
		hipsModel[224] = new ModelRendererTurbo(this, 110, 320, textureX, textureY); // Box 60
		hipsModel[225] = new ModelRendererTurbo(this, 110, 307, textureX, textureY); // Box 61
		hipsModel[226] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 62
		hipsModel[227] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 63
		hipsModel[228] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 64
		hipsModel[229] = new ModelRendererTurbo(this, 122, 266, textureX, textureY); // Box 65
		hipsModel[230] = new ModelRendererTurbo(this, 62, 297, textureX, textureY); // Box 66
		hipsModel[231] = new ModelRendererTurbo(this, 62, 303, textureX, textureY); // Box 67
		hipsModel[232] = new ModelRendererTurbo(this, 62, 309, textureX, textureY); // Box 68
		hipsModel[233] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Box 69
		hipsModel[234] = new ModelRendererTurbo(this, 78, 306, textureX, textureY); // Box 70
		hipsModel[235] = new ModelRendererTurbo(this, 78, 314, textureX, textureY); // Box 71
		hipsModel[236] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 72
		hipsModel[237] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 73
		hipsModel[238] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 74
		hipsModel[239] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 75
		hipsModel[240] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 76
		hipsModel[241] = new ModelRendererTurbo(this, 62, 283, textureX, textureY); // Box 77
		hipsModel[242] = new ModelRendererTurbo(this, 83, 243, textureX, textureY); // Box 78
		hipsModel[243] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 79
		hipsModel[244] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 80
		hipsModel[245] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 81
		hipsModel[246] = new ModelRendererTurbo(this, 89, 340, textureX, textureY); // Box 82
		hipsModel[247] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 83
		hipsModel[248] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 84
		hipsModel[249] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 85
		hipsModel[250] = new ModelRendererTurbo(this, 89, 332, textureX, textureY); // Box 86
		hipsModel[251] = new ModelRendererTurbo(this, 7, 397, textureX, textureY); // Box 87
		hipsModel[252] = new ModelRendererTurbo(this, 29, 397, textureX, textureY); // Box 88
		hipsModel[253] = new ModelRendererTurbo(this, 43, 397, textureX, textureY); // Box 89
		hipsModel[254] = new ModelRendererTurbo(this, 68, 397, textureX, textureY); // Box 90
		hipsModel[255] = new ModelRendererTurbo(this, 84, 397, textureX, textureY); // Box 91
		hipsModel[256] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Box 92
		hipsModel[257] = new ModelRendererTurbo(this, 29, 428, textureX, textureY); // Box 93
		hipsModel[258] = new ModelRendererTurbo(this, 43, 428, textureX, textureY); // Box 94
		hipsModel[259] = new ModelRendererTurbo(this, 68, 428, textureX, textureY); // Box 95
		hipsModel[260] = new ModelRendererTurbo(this, 83, 6, textureX, textureY); // Box 96
		hipsModel[261] = new ModelRendererTurbo(this, 121, 62, textureX, textureY); // Box 226
		hipsModel[262] = new ModelRendererTurbo(this, 121, 80, textureX, textureY); // Box 227
		hipsModel[263] = new ModelRendererTurbo(this, 121, 100, textureX, textureY); // Box 228
		hipsModel[264] = new ModelRendererTurbo(this, 121, 120, textureX, textureY); // Box 229
		hipsModel[265] = new ModelRendererTurbo(this, 121, 140, textureX, textureY); // Box 230
		hipsModel[266] = new ModelRendererTurbo(this, 121, 158, textureX, textureY); // Box 231
		hipsModel[267] = new ModelRendererTurbo(this, 121, 176, textureX, textureY); // Box 232
		hipsModel[268] = new ModelRendererTurbo(this, 121, 194, textureX, textureY); // Box 233
		hipsModel[269] = new ModelRendererTurbo(this, 121, 211, textureX, textureY); // Box 234
		hipsModel[270] = new ModelRendererTurbo(this, 86, 211, textureX, textureY); // Box 235
		hipsModel[271] = new ModelRendererTurbo(this, 86, 199, textureX, textureY); // Box 236
		hipsModel[272] = new ModelRendererTurbo(this, 86, 185, textureX, textureY); // Box 237
		hipsModel[273] = new ModelRendererTurbo(this, 86, 170, textureX, textureY); // Box 238
		hipsModel[274] = new ModelRendererTurbo(this, 86, 130, textureX, textureY); // Box 239
		hipsModel[275] = new ModelRendererTurbo(this, 86, 144, textureX, textureY); // Box 240
		hipsModel[276] = new ModelRendererTurbo(this, 86, 156, textureX, textureY); // Box 241
		hipsModel[277] = new ModelRendererTurbo(this, 86, 115, textureX, textureY); // Box 242
		hipsModel[278] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Box 243
		hipsModel[279] = new ModelRendererTurbo(this, 86, 81, textureX, textureY); // Box 244
		hipsModel[280] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 245
		hipsModel[281] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 246
		hipsModel[282] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 247
		hipsModel[283] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 248
		hipsModel[284] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 249
		hipsModel[285] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 250
		hipsModel[286] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 251
		hipsModel[287] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 252
		hipsModel[288] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 253
		hipsModel[289] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 254
		hipsModel[290] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 255
		hipsModel[291] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 256
		hipsModel[292] = new ModelRendererTurbo(this, 148, 39, textureX, textureY); // Box 257
		hipsModel[293] = new ModelRendererTurbo(this, 320, 409, textureX, textureY); // Box 1
		hipsModel[294] = new ModelRendererTurbo(this, 320, 419, textureX, textureY); // Box 2
		hipsModel[295] = new ModelRendererTurbo(this, 320, 434, textureX, textureY); // Box 3
		hipsModel[296] = new ModelRendererTurbo(this, 320, 443, textureX, textureY); // Box 4
		hipsModel[297] = new ModelRendererTurbo(this, 320, 400, textureX, textureY); // Box 7
		hipsModel[298] = new ModelRendererTurbo(this, 307, 251, textureX, textureY); // Box 8
		hipsModel[299] = new ModelRendererTurbo(this, 327, 357, textureX, textureY); // Box 11
		hipsModel[300] = new ModelRendererTurbo(this, 100, 397, textureX, textureY); // Box 64
		hipsModel[301] = new ModelRendererTurbo(this, 100, 426, textureX, textureY); // Box 66
		hipsModel[302] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 70
		hipsModel[303] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 71
		hipsModel[304] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 72
		hipsModel[305] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 73
		hipsModel[306] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 75
		hipsModel[307] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 76
		hipsModel[308] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 77
		hipsModel[309] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 78
		hipsModel[310] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 79
		hipsModel[311] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 81
		hipsModel[312] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 82
		hipsModel[313] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 83
		hipsModel[314] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 84
		hipsModel[315] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 85
		hipsModel[316] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 86
		hipsModel[317] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 87
		hipsModel[318] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 88
		hipsModel[319] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 99
		hipsModel[320] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 100
		hipsModel[321] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 101
		hipsModel[322] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 102
		hipsModel[323] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 103
		hipsModel[324] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 104
		hipsModel[325] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 105
		hipsModel[326] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 106
		hipsModel[327] = new ModelRendererTurbo(this, 151, 417, textureX, textureY); // Box 107
		hipsModel[328] = new ModelRendererTurbo(this, 125, 419, textureX, textureY); // Box 139
		hipsModel[329] = new ModelRendererTurbo(this, 125, 410, textureX, textureY); // Box 140
		hipsModel[330] = new ModelRendererTurbo(this, 59, 462, textureX, textureY); // Box 141
		hipsModel[331] = new ModelRendererTurbo(this, 320, 409, textureX, textureY); // Box 145
		hipsModel[332] = new ModelRendererTurbo(this, 320, 419, textureX, textureY); // Box 146
		hipsModel[333] = new ModelRendererTurbo(this, 320, 434, textureX, textureY); // Box 147
		hipsModel[334] = new ModelRendererTurbo(this, 320, 443, textureX, textureY); // Box 148
		hipsModel[335] = new ModelRendererTurbo(this, 320, 453, textureX, textureY); // Box 149
		hipsModel[336] = new ModelRendererTurbo(this, 320, 400, textureX, textureY); // Box 151
		hipsModel[337] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 189
		hipsModel[338] = new ModelRendererTurbo(this, 155, 470, textureX, textureY); // Box 191
		hipsModel[339] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 192
		hipsModel[340] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 203
		hipsModel[341] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 205
		hipsModel[342] = new ModelRendererTurbo(this, 181, 444, textureX, textureY); // Box 206
		hipsModel[343] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 207
		hipsModel[344] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 208
		hipsModel[345] = new ModelRendererTurbo(this, 150, 457, textureX, textureY); // Box 209
		hipsModel[346] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 211
		hipsModel[347] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 212
		hipsModel[348] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 213
		hipsModel[349] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 214
		hipsModel[350] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 215
		hipsModel[351] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 216
		hipsModel[352] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 217
		hipsModel[353] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 218
		hipsModel[354] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 219
		hipsModel[355] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 220
		hipsModel[356] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 221
		hipsModel[357] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 222
		hipsModel[358] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 223
		hipsModel[359] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 224
		hipsModel[360] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 232
		hipsModel[361] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 233
		hipsModel[362] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 234
		hipsModel[363] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 235
		hipsModel[364] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 236
		hipsModel[365] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 237
		hipsModel[366] = new ModelRendererTurbo(this, 130, 400, textureX, textureY); // Box 238
		hipsModel[367] = new ModelRendererTurbo(this, 100, 397, textureX, textureY); // Box 272
		hipsModel[368] = new ModelRendererTurbo(this, 100, 426, textureX, textureY); // Box 278
		hipsModel[369] = new ModelRendererTurbo(this, 424, 356, textureX, textureY); // Box 139
		hipsModel[370] = new ModelRendererTurbo(this, 423, 405, textureX, textureY); // Box 140
		hipsModel[371] = new ModelRendererTurbo(this, 423, 422, textureX, textureY); // Box 141
		hipsModel[372] = new ModelRendererTurbo(this, 307, 279, textureX, textureY); // Box 142
		hipsModel[373] = new ModelRendererTurbo(this, 423, 405, textureX, textureY); // Box 0
		hipsModel[374] = new ModelRendererTurbo(this, 424, 356, textureX, textureY); // Box 1
		hipsModel[375] = new ModelRendererTurbo(this, 327, 318, textureX, textureY); // Box 2
		hipsModel[376] = new ModelRendererTurbo(this, 423, 422, textureX, textureY); // Box 3
		hipsModel[377] = new ModelRendererTurbo(this, 457, 405, textureX, textureY); // Box 4
		hipsModel[378] = new ModelRendererTurbo(this, 457, 405, textureX, textureY); // Box 5
		hipsModel[379] = new ModelRendererTurbo(this, 414, 280, textureX, textureY); // Box 6
		hipsModel[380] = new ModelRendererTurbo(this, 414, 280, textureX, textureY); // Box 7
		hipsModel[381] = new ModelRendererTurbo(this, 413, 346, textureX, textureY); // Box 8
		hipsModel[382] = new ModelRendererTurbo(this, 413, 346, textureX, textureY); // Box 9
		hipsModel[383] = new ModelRendererTurbo(this, 155, 470, textureX, textureY); // Box 11
		hipsModel[384] = new ModelRendererTurbo(this, 151, 417, textureX, textureY); // Box 12
		hipsModel[385] = new ModelRendererTurbo(this, 321, 475, textureX, textureY); // Box 18
		hipsModel[386] = new ModelRendererTurbo(this, 284, 357, textureX, textureY); // Box 23
		hipsModel[387] = new ModelRendererTurbo(this, 284, 347, textureX, textureY); // Box 24
		hipsModel[388] = new ModelRendererTurbo(this, 284, 338, textureX, textureY); // Box 27
		hipsModel[389] = new ModelRendererTurbo(this, 284, 347, textureX, textureY); // Box 30
		hipsModel[390] = new ModelRendererTurbo(this, 284, 338, textureX, textureY); // Box 32
		hipsModel[391] = new ModelRendererTurbo(this, 284, 305, textureX, textureY); // Box 33
		hipsModel[392] = new ModelRendererTurbo(this, 284, 314, textureX, textureY); // Box 34
		hipsModel[393] = new ModelRendererTurbo(this, 284, 324, textureX, textureY); // Box 35
		hipsModel[394] = new ModelRendererTurbo(this, 284, 314, textureX, textureY); // Box 36
		hipsModel[395] = new ModelRendererTurbo(this, 284, 305, textureX, textureY); // Box 37
		hipsModel[396] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 38
		hipsModel[397] = new ModelRendererTurbo(this, 330, 231, textureX, textureY); // Box 39
		hipsModel[398] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 40
		hipsModel[399] = new ModelRendererTurbo(this, 330, 231, textureX, textureY); // Box 41
		hipsModel[400] = new ModelRendererTurbo(this, 330, 231, textureX, textureY); // Box 42
		hipsModel[401] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 43
		hipsModel[402] = new ModelRendererTurbo(this, 330, 231, textureX, textureY); // Box 44
		hipsModel[403] = new ModelRendererTurbo(this, 371, 196, textureX, textureY); // Box 45
		hipsModel[404] = new ModelRendererTurbo(this, 421, 207, textureX, textureY); // Box 46
		hipsModel[405] = new ModelRendererTurbo(this, 421, 207, textureX, textureY); // Box 47
		hipsModel[406] = new ModelRendererTurbo(this, 421, 207, textureX, textureY); // Box 48
		hipsModel[407] = new ModelRendererTurbo(this, 421, 207, textureX, textureY); // Box 49
		hipsModel[408] = new ModelRendererTurbo(this, 321, 491, textureX, textureY); // Box 0
		hipsModel[409] = new ModelRendererTurbo(this, 259, 161, textureX, textureY); // Box 9
		hipsModel[410] = new ModelRendererTurbo(this, 259, 152, textureX, textureY); // Box 10
		hipsModel[411] = new ModelRendererTurbo(this, 259, 137, textureX, textureY); // Box 11
		hipsModel[412] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Box 12
		hipsModel[413] = new ModelRendererTurbo(this, 423, 405, textureX, textureY); // Box 17
		hipsModel[414] = new ModelRendererTurbo(this, 457, 405, textureX, textureY); // Box 18
		hipsModel[415] = new ModelRendererTurbo(this, 262, 170, textureX, textureY); // Box 19
		hipsModel[416] = new ModelRendererTurbo(this, 262, 210, textureX, textureY); // Box 21
		hipsModel[417] = new ModelRendererTurbo(this, 260, 193, textureX, textureY); // Box 22
		hipsModel[418] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // Box 28
		hipsModel[419] = new ModelRendererTurbo(this, 295, 161, textureX, textureY); // Box 29
		hipsModel[420] = new ModelRendererTurbo(this, 295, 152, textureX, textureY); // Box 30
		hipsModel[421] = new ModelRendererTurbo(this, 295, 137, textureX, textureY); // Box 31
		hipsModel[422] = new ModelRendererTurbo(this, 295, 127, textureX, textureY); // Box 32
		hipsModel[423] = new ModelRendererTurbo(this, 295, 195, textureX, textureY); // Box 34
		hipsModel[424] = new ModelRendererTurbo(this, 295, 208, textureX, textureY); // Box 35
		hipsModel[425] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 36
		hipsModel[426] = new ModelRendererTurbo(this, 334, 140, textureX, textureY); // Box 37
		hipsModel[427] = new ModelRendererTurbo(this, 334, 155, textureX, textureY); // Box 38
		hipsModel[428] = new ModelRendererTurbo(this, 334, 164, textureX, textureY); // Box 39
		hipsModel[429] = new ModelRendererTurbo(this, 332, 171, textureX, textureY); // Box 40
		hipsModel[430] = new ModelRendererTurbo(this, 332, 184, textureX, textureY); // Box 44
		hipsModel[431] = new ModelRendererTurbo(this, 332, 197, textureX, textureY); // Box 45
		hipsModel[432] = new ModelRendererTurbo(this, 388, 125, textureX, textureY); // Box 46
		hipsModel[433] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Box 47
		hipsModel[434] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Box 48
		hipsModel[435] = new ModelRendererTurbo(this, 388, 139, textureX, textureY); // Box 49
		hipsModel[436] = new ModelRendererTurbo(this, 363, 140, textureX, textureY); // Box 50
		hipsModel[437] = new ModelRendererTurbo(this, 347, 172, textureX, textureY); // Box 51
		hipsModel[438] = new ModelRendererTurbo(this, 347, 182, textureX, textureY); // Box 52
		hipsModel[439] = new ModelRendererTurbo(this, 363, 157, textureX, textureY); // Box 53
		hipsModel[440] = new ModelRendererTurbo(this, 388, 153, textureX, textureY); // Box 54
		hipsModel[441] = new ModelRendererTurbo(this, 347, 196, textureX, textureY); // Box 55
		hipsModel[442] = new ModelRendererTurbo(this, 363, 174, textureX, textureY); // Box 56
		hipsModel[443] = new ModelRendererTurbo(this, 388, 170, textureX, textureY); // Box 57
		hipsModel[444] = new ModelRendererTurbo(this, 320, 97, textureX, textureY); // Box 58
		hipsModel[445] = new ModelRendererTurbo(this, 318, 80, textureX, textureY); // Box 59
		hipsModel[446] = new ModelRendererTurbo(this, 320, 57, textureX, textureY); // Box 60
		hipsModel[447] = new ModelRendererTurbo(this, 317, 48, textureX, textureY); // Box 61
		hipsModel[448] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Box 62
		hipsModel[449] = new ModelRendererTurbo(this, 317, 24, textureX, textureY); // Box 63
		hipsModel[450] = new ModelRendererTurbo(this, 317, 14, textureX, textureY); // Box 64
		hipsModel[451] = new ModelRendererTurbo(this, 351, 98, textureX, textureY); // Box 65
		hipsModel[452] = new ModelRendererTurbo(this, 351, 85, textureX, textureY); // Box 66
		hipsModel[453] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Box 67
		hipsModel[454] = new ModelRendererTurbo(this, 351, 51, textureX, textureY); // Box 68
		hipsModel[455] = new ModelRendererTurbo(this, 351, 42, textureX, textureY); // Box 69
		hipsModel[456] = new ModelRendererTurbo(this, 351, 27, textureX, textureY); // Box 70
		hipsModel[457] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Box 71
		hipsModel[458] = new ModelRendererTurbo(this, 394, 92, textureX, textureY); // Box 72
		hipsModel[459] = new ModelRendererTurbo(this, 408, 92, textureX, textureY); // Box 73
		hipsModel[460] = new ModelRendererTurbo(this, 393, 47, textureX, textureY); // Box 74
		hipsModel[461] = new ModelRendererTurbo(this, 393, 71, textureX, textureY); // Box 75
		hipsModel[462] = new ModelRendererTurbo(this, 393, 71, textureX, textureY); // Box 76
		hipsModel[463] = new ModelRendererTurbo(this, 393, 47, textureX, textureY); // Box 77
		hipsModel[464] = new ModelRendererTurbo(this, 408, 92, textureX, textureY); // Box 78
		hipsModel[465] = new ModelRendererTurbo(this, 394, 92, textureX, textureY); // Box 79
		hipsModel[466] = new ModelRendererTurbo(this, 351, 98, textureX, textureY); // Box 80
		hipsModel[467] = new ModelRendererTurbo(this, 320, 97, textureX, textureY); // Box 81
		hipsModel[468] = new ModelRendererTurbo(this, 351, 85, textureX, textureY); // Box 82
		hipsModel[469] = new ModelRendererTurbo(this, 318, 80, textureX, textureY); // Box 83
		hipsModel[470] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Box 84
		hipsModel[471] = new ModelRendererTurbo(this, 320, 57, textureX, textureY); // Box 85
		hipsModel[472] = new ModelRendererTurbo(this, 320, 453, textureX, textureY); // Box 86
		hipsModel[473] = new ModelRendererTurbo(this, 351, 17, textureX, textureY); // Box 87
		hipsModel[474] = new ModelRendererTurbo(this, 317, 14, textureX, textureY); // Box 88
		hipsModel[475] = new ModelRendererTurbo(this, 351, 27, textureX, textureY); // Box 89
		hipsModel[476] = new ModelRendererTurbo(this, 317, 24, textureX, textureY); // Box 90
		hipsModel[477] = new ModelRendererTurbo(this, 351, 42, textureX, textureY); // Box 91
		hipsModel[478] = new ModelRendererTurbo(this, 317, 39, textureX, textureY); // Box 92
		hipsModel[479] = new ModelRendererTurbo(this, 317, 48, textureX, textureY); // Box 93
		hipsModel[480] = new ModelRendererTurbo(this, 351, 51, textureX, textureY); // Box 94
		hipsModel[481] = new ModelRendererTurbo(this, 321, 475, textureX, textureY); // Box 95
		hipsModel[482] = new ModelRendererTurbo(this, 321, 491, textureX, textureY); // Box 96
		hipsModel[483] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Box 97
		hipsModel[484] = new ModelRendererTurbo(this, 295, 127, textureX, textureY); // Box 98
		hipsModel[485] = new ModelRendererTurbo(this, 334, 125, textureX, textureY); // Box 99
		hipsModel[486] = new ModelRendererTurbo(this, 388, 125, textureX, textureY); // Box 100
		hipsModel[487] = new ModelRendererTurbo(this, 388, 139, textureX, textureY); // Box 101
		hipsModel[488] = new ModelRendererTurbo(this, 388, 153, textureX, textureY); // Box 102
		hipsModel[489] = new ModelRendererTurbo(this, 388, 170, textureX, textureY); // Box 103
		hipsModel[490] = new ModelRendererTurbo(this, 363, 174, textureX, textureY); // Box 104
		hipsModel[491] = new ModelRendererTurbo(this, 363, 157, textureX, textureY); // Box 105
		hipsModel[492] = new ModelRendererTurbo(this, 363, 140, textureX, textureY); // Box 106
		hipsModel[493] = new ModelRendererTurbo(this, 363, 123, textureX, textureY); // Box 107
		hipsModel[494] = new ModelRendererTurbo(this, 334, 140, textureX, textureY); // Box 108
		hipsModel[495] = new ModelRendererTurbo(this, 259, 137, textureX, textureY); // Box 109
		hipsModel[496] = new ModelRendererTurbo(this, 295, 137, textureX, textureY); // Box 110
		hipsModel[497] = new ModelRendererTurbo(this, 259, 152, textureX, textureY); // Box 111
		hipsModel[498] = new ModelRendererTurbo(this, 295, 152, textureX, textureY); // Box 112
		hipsModel[499] = new ModelRendererTurbo(this, 334, 155, textureX, textureY); // Box 113

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

		hipsModel[70].addShapeBox(-41F, -16F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 0
		hipsModel[70].setRotationPoint(-6F, -37F, 0F);

		hipsModel[71].addShapeBox(-41F, -19F, 0F, 3, 3, 2, 0F,-1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		hipsModel[71].setRotationPoint(-6F, -37F, 0F);

		hipsModel[72].addShapeBox(-42F, -13F, -1F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[72].setRotationPoint(-6F, -37F, 0F);

		hipsModel[73].addShapeBox(-42F, -9F, -1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Box 4
		hipsModel[73].setRotationPoint(-6F, -38F, 0F);

		hipsModel[74].addShapeBox(-41.5F, -5F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 5
		hipsModel[74].setRotationPoint(-6F, -38F, 0F);

		hipsModel[75].addShapeBox(-41F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, .3F, 0F, -.2F); // Box 6
		hipsModel[75].setRotationPoint(-6F, -37F, 0F);

		hipsModel[76].addShapeBox(22F, -21F, -5F, 6, 11, 5, 0F,0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[76].setRotationPoint(-6F, -37F, 0F);

		hipsModel[77].addShapeBox(14F, -25F, -5F, 8, 4, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[77].setRotationPoint(-6F, -37F, 0F);

		hipsModel[78].addShapeBox(11F, -25F, -5F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[78].setRotationPoint(-6F, -37F, 0F);

		hipsModel[79].addShapeBox(1F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[79].setRotationPoint(-6F, -37F, 0F);

		hipsModel[80].addShapeBox(-3F, -23F, -5F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[80].setRotationPoint(-6F, -37F, 0F);

		hipsModel[81].addShapeBox(-15F, -25F, -5F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[81].setRotationPoint(-6F, -37F, 0F);

		hipsModel[82].addShapeBox(-20F, -25F, -5F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[82].setRotationPoint(-6F, -37F, 0F);

		hipsModel[83].addShapeBox(-30F, -25F, -5F, 10, 4, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[83].setRotationPoint(-6F, -37F, 0F);

		hipsModel[84].addShapeBox(-34F, -23F, -5F, 4, 23, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[84].setRotationPoint(-6F, -37F, 0F);

		hipsModel[85].addShapeBox(-37F, -20F, -5F, 3, 11, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 17
		hipsModel[85].setRotationPoint(-6F, -37F, 0F);

		hipsModel[86].addShapeBox(-37F, -9F, -5F, 3, 19, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 18
		hipsModel[86].setRotationPoint(-6F, -37F, 0F);

		hipsModel[87].addShapeBox(-34F, 3F, -5F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[87].setRotationPoint(-6F, -37F, 0F);

		hipsModel[88].addShapeBox(-27F, 3F, -5F, 6, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 20
		hipsModel[88].setRotationPoint(-6F, -37F, 0F);

		hipsModel[89].addShapeBox(-21F, 3F, -5F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 21
		hipsModel[89].setRotationPoint(-6F, -37F, 0F);

		hipsModel[90].addShapeBox(-15F, 3F, -5F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		hipsModel[90].setRotationPoint(-6F, -37F, 0F);

		hipsModel[91].addShapeBox(-3F, 3F, -5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[91].setRotationPoint(-6F, -37F, 0F);

		hipsModel[92].addShapeBox(1F, 3F, -5F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[92].setRotationPoint(-6F, -37F, 0F);

		hipsModel[93].addShapeBox(12F, 3F, -5F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[93].setRotationPoint(-6F, -37F, 0F);

		hipsModel[94].addShapeBox(22F, -7F, -5F, 6, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[94].setRotationPoint(-6F, -37F, 0F);

		hipsModel[95].addShapeBox(-34F, 3F, -14F, 7, 7, 9, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[95].setRotationPoint(-6F, -37F, 0F);

		hipsModel[96].addShapeBox(-37F, -9F, -14F, 3, 19, 9, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -6F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 28
		hipsModel[96].setRotationPoint(-6F, -37F, 0F);

		hipsModel[97].addShapeBox(-37F, -20F, -14F, 3, 11, 9, 0F,-2F, -4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
		hipsModel[97].setRotationPoint(-6F, -37F, 0F);

		hipsModel[98].addShapeBox(-34F, -23F, -14F, 4, 9, 9, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[98].setRotationPoint(-6F, -37F, 0F);

		hipsModel[99].addShapeBox(-30F, -25F, -14F, 10, 4, 9, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[99].setRotationPoint(-6F, -37F, 0F);

		hipsModel[100].addShapeBox(-20F, -25F, -14F, 5, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[100].setRotationPoint(-6F, -37F, 0F);

		hipsModel[101].addShapeBox(-15F, -25F, -14F, 12, 4, 9, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[101].setRotationPoint(-6F, -37F, 0F);

		hipsModel[102].addShapeBox(-3F, -23F, -14F, 4, 2, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[102].setRotationPoint(-6F, -37F, 0F);

		hipsModel[103].addShapeBox(1F, -25F, -14F, 10, 4, 9, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[103].setRotationPoint(-6F, -37F, 0F);

		hipsModel[104].addShapeBox(11F, -25F, -14F, 3, 4, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[104].setRotationPoint(-6F, -37F, 0F);

		hipsModel[105].addShapeBox(14F, -25F, -14F, 8, 4, 9, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[105].setRotationPoint(-6F, -37F, 0F);

		hipsModel[106].addShapeBox(22F, -21F, -14F, 6, 11, 9, 0F,0F, 0F, 0F, -2F, -4F, -1F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[106].setRotationPoint(-6F, -37F, 0F);

		hipsModel[107].addShapeBox(22F, -10F, -14F, 6, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[107].setRotationPoint(-6F, -37F, 0F);

		hipsModel[108].addShapeBox(12F, 3F, -14F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[108].setRotationPoint(-6F, -37F, 0F);

		hipsModel[109].addShapeBox(1F, 3F, -14F, 11, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[109].setRotationPoint(-6F, -37F, 0F);

		hipsModel[110].addShapeBox(-3F, 3F, -14F, 4, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[110].setRotationPoint(-6F, -37F, 0F);

		hipsModel[111].addShapeBox(-15F, 3F, -14F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 43
		hipsModel[111].setRotationPoint(-6F, -37F, 0F);

		hipsModel[112].addShapeBox(-21F, 3F, -14F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 44
		hipsModel[112].setRotationPoint(-6F, -37F, 0F);

		hipsModel[113].addShapeBox(-27F, 3F, -14F, 6, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 45
		hipsModel[113].setRotationPoint(-6F, -37F, 0F);

		hipsModel[114].addShapeBox(-41F, -19F, -2F, 3, 3, 2, 0F,-1F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[114].setRotationPoint(-6F, -37F, 0F);

		hipsModel[115].addShapeBox(-41F, -16F, -2F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 49
		hipsModel[115].setRotationPoint(-6F, -37F, 0F);

		hipsModel[116].addShapeBox(0F, -10F, 0F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[116].setRotationPoint(20F, -50F, 0F);

		hipsModel[117].addShapeBox(18F, -21F, -5F, 14, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		hipsModel[117].setRotationPoint(-6F, -37F, 0F);

		hipsModel[118].addShapeBox(18F, -21F, 5F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[118].setRotationPoint(-6F, -37F, 0F);

		hipsModel[119].addShapeBox(18F, -21F, -10F, 14, 19, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[119].setRotationPoint(-6F, -37F, 0F);

		hipsModel[120].addShapeBox(-3F, -10F, 0F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[120].setRotationPoint(20F, -50F, 0F);

		hipsModel[121].addShapeBox(7F, 9F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 61
		hipsModel[121].setRotationPoint(20F, -50F, 0F);

		hipsModel[122].addShapeBox(13F, 9F, 0F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[122].setRotationPoint(20F, -50F, 0F);

		hipsModel[123].addShapeBox(0F, 9F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 63
		hipsModel[123].setRotationPoint(20F, -50F, 0F);

		hipsModel[124].addShapeBox(17F, 13F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[124].setRotationPoint(20F, -50F, 0F);

		hipsModel[125].addShapeBox(12F, 13F, 0F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 65
		hipsModel[125].setRotationPoint(20F, -50F, 0F);

		hipsModel[126].addShapeBox(17F, 16F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[126].setRotationPoint(20F, -50F, 0F);

		hipsModel[127].addShapeBox(0F, 9F, 3F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 68
		hipsModel[127].setRotationPoint(20F, -50F, 0F);

		hipsModel[128].addShapeBox(7F, 9F, 3F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 69
		hipsModel[128].setRotationPoint(20F, -50F, 0F);

		hipsModel[129].addShapeBox(0F, -10F, 3F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[129].setRotationPoint(20F, -50F, 0F);

		hipsModel[130].addShapeBox(-3F, -10F, 3F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[130].setRotationPoint(20F, -50F, 0F);

		hipsModel[131].addShapeBox(0F, 9F, 7F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 75
		hipsModel[131].setRotationPoint(20F, -50F, 0F);

		hipsModel[132].addShapeBox(7F, 9F, 7F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 76
		hipsModel[132].setRotationPoint(20F, -50F, 0F);

		hipsModel[133].addShapeBox(0F, 3F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[133].setRotationPoint(20F, -50F, 0F);

		hipsModel[134].addShapeBox(0F, -3F, 7F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 78
		hipsModel[134].setRotationPoint(20F, -50F, 0F);

		hipsModel[135].addShapeBox(0F, -7F, 7F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[135].setRotationPoint(20F, -50F, 0F);

		hipsModel[136].addShapeBox(0F, -9F, 7F, 13, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 80
		hipsModel[136].setRotationPoint(20F, -50F, 0F);

		hipsModel[137].addShapeBox(-3F, -9F, 7F, 3, 18, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[137].setRotationPoint(20F, -50F, 0F);

		hipsModel[138].addShapeBox(13F, -10F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 82
		hipsModel[138].setRotationPoint(20F, -50F, 0F);

		hipsModel[139].addShapeBox(13F, -8F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[139].setRotationPoint(20F, -50F, 0F);

		hipsModel[140].addShapeBox(19F, -3F, 0F, 5, 6, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		hipsModel[140].setRotationPoint(20F, -50F, 0F);

		hipsModel[141].addShapeBox(19F, 3F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[141].setRotationPoint(20F, -50F, 0F);

		hipsModel[142].addShapeBox(13F, -8F, 7F, 7, 2, 2, 0F,0F, 1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, .5F); // Box 89
		hipsModel[142].setRotationPoint(20F, -50F, 0F);

		hipsModel[143].addShapeBox(17F, -3F, 7F, 5, 6, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[143].setRotationPoint(20F, -50F, 0F);

		hipsModel[144].addShapeBox(17F, 3F, 7F, 6, 8, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[144].setRotationPoint(20F, -50F, 0F);

		hipsModel[145].addShapeBox(13F, 9F, 7F, 9, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		hipsModel[145].setRotationPoint(20F, -50F, 0F);

		hipsModel[146].addShapeBox(16F, -6F, 7F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		hipsModel[146].setRotationPoint(20F, -50F, 0F);

		hipsModel[147].addShapeBox(13F, 9F, 9F, 7, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
		hipsModel[147].setRotationPoint(20F, -50F, 0F);

		hipsModel[148].addShapeBox(13F, -3F, 9F, 7, 6, 1, 0F,2F, 0F, -3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -3F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F); // Box 96
		hipsModel[148].setRotationPoint(20F, -50F, 0F);

		hipsModel[149].addShapeBox(13F, -6F, 9F, 6, 3, 1, 0F,2F, 1F, -.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 97
		hipsModel[149].setRotationPoint(20F, -50F, 0F);

		hipsModel[150].addShapeBox(13F, -8F, 9F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 2F, -1F, -.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 98
		hipsModel[150].setRotationPoint(20F, -50F, 0F);

		hipsModel[151].addShapeBox(8F, -8F, 7F, 2, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 99
		hipsModel[151].setRotationPoint(20F, -50F, 0F);

		hipsModel[152].addShapeBox(3F, -9F, 13F, 2, 19, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 100
		hipsModel[152].setRotationPoint(20F, -50F, 0F);

		hipsModel[153].addShapeBox(17F, 13F, 7F, 5, 3, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		hipsModel[153].setRotationPoint(20F, -50F, 0F);

		hipsModel[154].addShapeBox(17F, 13F, 9F, 3, 3, 1, 0F,4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 104
		hipsModel[154].setRotationPoint(20F, -50F, 0F);

		hipsModel[155].addShapeBox(13F, 13F, 6F, 4, 3, 3, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 107
		hipsModel[155].setRotationPoint(20F, -50F, 0F);

		hipsModel[156].addShapeBox(18F, 16F, 6F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[156].setRotationPoint(20F, -50F, 0F);

		hipsModel[157].addShapeBox(16F, 16F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 1
		hipsModel[157].setRotationPoint(20F, -50F, 0F);

		hipsModel[158].addShapeBox(16F, 16F, 6F, 1, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1.5F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[158].setRotationPoint(20F, -50F, 0F);

		hipsModel[159].addShapeBox(17F, 16F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F); // Box 4
		hipsModel[159].setRotationPoint(20F, -50F, 0F);

		hipsModel[160].addShapeBox(18F, 16F, 7F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[160].setRotationPoint(20F, -50F, 0F);

		hipsModel[161].addShapeBox(17F, 20F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F); // Box 6
		hipsModel[161].setRotationPoint(20F, -50F, 0F);

		hipsModel[162].addShapeBox(17F, 20F, 4F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -.5F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 7
		hipsModel[162].setRotationPoint(20F, -50F, 0F);

		hipsModel[163].addShapeBox(17F, 24F, 0F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F); // Box 9
		hipsModel[163].setRotationPoint(20F, -50F, 0F);

		hipsModel[164].addShapeBox(17F, 24F, 2F, 7, 7, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 2F, -1.5F, 0F, 2F, -3.5F, 0F, -2F, -3.5F, 0F, -2F); // Box 10
		hipsModel[164].setRotationPoint(20F, -50F, 0F);

		hipsModel[165].addShapeBox(18.5F, 18F, 7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 11
		hipsModel[165].setRotationPoint(20F, -50F, 0F);

		hipsModel[166].addShapeBox(18.5F, 18F, 8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Box 14
		hipsModel[166].setRotationPoint(20F, -50F, 0F);

		hipsModel[167].addShapeBox(22.5F, 22F, 7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Box 18
		hipsModel[167].setRotationPoint(20F, -50F, 0F);

		hipsModel[168].addShapeBox(22.5F, 22F, 8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Box 19
		hipsModel[168].setRotationPoint(20F, -50F, 0F);

		hipsModel[169].addShapeBox(24.5F, 22F, 7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Box 23
		hipsModel[169].setRotationPoint(20F, -50F, 0F);

		hipsModel[170].addShapeBox(22.5F, 22F, 6F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Box 1
		hipsModel[170].setRotationPoint(20F, -50F, 0F);

		hipsModel[171].addShapeBox(24.5F, 22F, 6.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[171].setRotationPoint(20F, -50F, 0F);

		hipsModel[172].addShapeBox(18.5F, 18F, 6F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[172].setRotationPoint(20F, -50F, 0F);

		hipsModel[173].addShapeBox(5F, -6F, 10F, 26, 26, 1, 0F,-10F, -10F, -.8F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .8F, -10F, -10F, -.5F, -10F, -10F, .9F, -10F, -10F, -.9F, -10F, -10F, .5F); // Eye
		hipsModel[173].setRotationPoint(20F, -50F, 0F);

		hipsModel[174].addShapeBox(18.5F, 31F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		hipsModel[174].setRotationPoint(20F, -50F, 0F);

		hipsModel[175].addShapeBox(18.5F, 35F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 9
		hipsModel[175].setRotationPoint(20F, -50F, 0F);

		hipsModel[176].addShapeBox(20.5F, 39F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, -7F, 0F, 0F); // Box 10
		hipsModel[176].setRotationPoint(20F, -50F, 0F);

		hipsModel[177].addShapeBox(27.5F, 41F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 12
		hipsModel[177].setRotationPoint(20F, -50F, 0F);

		hipsModel[178].addShapeBox(31.5F, 41F, -1F, 4, 4, 2, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 13
		hipsModel[178].setRotationPoint(20F, -50F, 0F);

		hipsModel[179].addShapeBox(31.5F, 41F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, 1F, 0F, -2F, 0F); // Box 14
		hipsModel[179].setRotationPoint(20F, -50F, 0F);

		hipsModel[180].addShapeBox(8F, 10F, 7F, 2, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 15
		hipsModel[180].setRotationPoint(20F, -50F, 0F);

		hipsModel[181].addShapeBox(3F, 10F, 13F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 3F, -1F, 0F); // Box 16
		hipsModel[181].setRotationPoint(20F, -50F, 0F);

		hipsModel[182].addShapeBox(0F, 10F, 16F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, 7F, -4F, 0F); // Box 17
		hipsModel[182].setRotationPoint(20F, -50F, 0F);

		hipsModel[183].addShapeBox(0F, -9F, 16F, 2, 19, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 18
		hipsModel[183].setRotationPoint(20F, -50F, 0F);

		hipsModel[184].addShapeBox(-7F, -8F, 24F, 2, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 19
		hipsModel[184].setRotationPoint(20F, -50F, 0F);

		hipsModel[185].addShapeBox(-7F, 10F, 24F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 3F, -4F, 0F); // Box 20
		hipsModel[185].setRotationPoint(20F, -50F, 0F);

		hipsModel[186].addShapeBox(-10F, -6F, 27F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 1F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, 1F, -5F, -1F); // Box 21
		hipsModel[186].setRotationPoint(20F, -50F, 0F);

		hipsModel[187].addShapeBox(0F, 9F, -3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 22
		hipsModel[187].setRotationPoint(20F, -50F, 0F);

		hipsModel[188].addShapeBox(7F, 9F, -3F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 23
		hipsModel[188].setRotationPoint(20F, -50F, 0F);

		hipsModel[189].addShapeBox(-3F, -10F, -3F, 3, 19, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[189].setRotationPoint(20F, -50F, 0F);

		hipsModel[190].addShapeBox(0F, -10F, -3F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[190].setRotationPoint(20F, -50F, 0F);

		hipsModel[191].addShapeBox(13F, -9F, -3F, 6, 2, 3, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[191].setRotationPoint(20F, -50F, 0F);

		hipsModel[192].addShapeBox(13F, -7F, -3F, 8, 4, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[192].setRotationPoint(20F, -50F, 0F);

		hipsModel[193].addShapeBox(13F, -3F, -3F, 9, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[193].setRotationPoint(20F, -50F, 0F);

		hipsModel[194].addShapeBox(13F, 3F, -3F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[194].setRotationPoint(20F, -50F, 0F);

		hipsModel[195].addShapeBox(13F, 9F, -3F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[195].setRotationPoint(20F, -50F, 0F);

		hipsModel[196].addShapeBox(17F, 13F, -3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[196].setRotationPoint(20F, -50F, 0F);

		hipsModel[197].addShapeBox(17F, 16F, -6F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[197].setRotationPoint(20F, -50F, 0F);

		hipsModel[198].addShapeBox(12F, 13F, -6F, 5, 3, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 33
		hipsModel[198].setRotationPoint(20F, -50F, 0F);

		hipsModel[199].addShapeBox(16F, 16F, -6F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		hipsModel[199].setRotationPoint(20F, -50F, 0F);

		hipsModel[200].addShapeBox(17F, 20F, -4F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[200].setRotationPoint(20F, -50F, 0F);

		hipsModel[201].addShapeBox(17F, 24F, -2F, 7, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 36
		hipsModel[201].setRotationPoint(20F, -50F, 0F);

		hipsModel[202].addShapeBox(18.5F, 31F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[202].setRotationPoint(20F, -50F, 0F);

		hipsModel[203].addShapeBox(18.5F, 35F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 38
		hipsModel[203].setRotationPoint(20F, -50F, 0F);

		hipsModel[204].addShapeBox(20.5F, 39F, -2F, 4, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, -7F, 2F, 0F); // Box 39
		hipsModel[204].setRotationPoint(20F, -50F, 0F);

		hipsModel[205].addShapeBox(27.5F, 41F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[205].setRotationPoint(20F, -50F, 0F);

		hipsModel[206].addShapeBox(17F, 24F, -4F, 7, 7, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 2F, -1.5F, 0F, 2F); // Box 42
		hipsModel[206].setRotationPoint(20F, -50F, 0F);

		hipsModel[207].addShapeBox(17F, 20F, -6F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -0.5F, 0F, 2F, 0F, 0F, 2F); // Box 43
		hipsModel[207].setRotationPoint(20F, -50F, 0F);

		hipsModel[208].addShapeBox(31.5F, 41F, -2F, 4, 4, 2, 0F,0F, -2F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 44
		hipsModel[208].setRotationPoint(20F, -50F, 0F);

		hipsModel[209].addShapeBox(18F, 16F, -7F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 45
		hipsModel[209].setRotationPoint(20F, -50F, 0F);

		hipsModel[210].addShapeBox(18F, 16F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 46
		hipsModel[210].setRotationPoint(20F, -50F, 0F);

		hipsModel[211].addShapeBox(17F, 16F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 47
		hipsModel[211].setRotationPoint(20F, -50F, 0F);

		hipsModel[212].addShapeBox(16F, 16F, -9F, 1, 2, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1.5F, 0F, -1F, 0F, 0F); // Box 48
		hipsModel[212].setRotationPoint(20F, -50F, 0F);

		hipsModel[213].addShapeBox(17F, 13F, -6F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[213].setRotationPoint(20F, -50F, 0F);

		hipsModel[214].addShapeBox(17F, 13F, -7F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[214].setRotationPoint(20F, -50F, 0F);

		hipsModel[215].addShapeBox(17F, 13F, -9F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[215].setRotationPoint(20F, -50F, 0F);

		hipsModel[216].addShapeBox(13F, 9F, -9F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[216].setRotationPoint(20F, -50F, 0F);

		hipsModel[217].addShapeBox(13F, 3F, -9F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[217].setRotationPoint(20F, -50F, 0F);

		hipsModel[218].addShapeBox(13F, -3F, -9F, 7, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 54
		hipsModel[218].setRotationPoint(20F, -50F, 0F);

		hipsModel[219].addShapeBox(13F, -5F, -9F, 6, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[219].setRotationPoint(20F, -50F, 0F);

		hipsModel[220].addShapeBox(13F, -7F, -9F, 5, 2, 2, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 56
		hipsModel[220].setRotationPoint(20F, -50F, 0F);

		hipsModel[221].addShapeBox(0F, -9F, -11F, 13, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[221].setRotationPoint(20F, -50F, 0F);

		hipsModel[222].addShapeBox(-3F, -9F, -11F, 3, 18, 4, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[222].setRotationPoint(20F, -50F, 0F);

		hipsModel[223].addShapeBox(7F, 9F, -7F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
		hipsModel[223].setRotationPoint(20F, -50F, 0F);

		hipsModel[224].addShapeBox(0F, 9F, -7F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 60
		hipsModel[224].setRotationPoint(20F, -50F, 0F);

		hipsModel[225].addShapeBox(0F, 9F, -11F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 61
		hipsModel[225].setRotationPoint(20F, -50F, 0F);

		hipsModel[226].addShapeBox(7F, 9F, -11F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		hipsModel[226].setRotationPoint(20F, -50F, 0F);

		hipsModel[227].addShapeBox(0F, 3F, -11F, 13, 6, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[227].setRotationPoint(20F, -50F, 0F);

		hipsModel[228].addShapeBox(0F, -3F, -11F, 13, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[228].setRotationPoint(20F, -50F, 0F);

		hipsModel[229].addShapeBox(0F, -7F, -11F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[229].setRotationPoint(20F, -50F, 0F);

		hipsModel[230].addShapeBox(13F, -7F, -10F, 3, 2, 1, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[230].setRotationPoint(20F, -50F, 0F);

		hipsModel[231].addShapeBox(13F, -5F, -10F, 4, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[231].setRotationPoint(20F, -50F, 0F);

		hipsModel[232].addShapeBox(13F, -3F, -10F, 5, 6, 1, 0F,0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[232].setRotationPoint(20F, -50F, 0F);

		hipsModel[233].addShapeBox(13F, 3F, -10F, 6, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 69
		hipsModel[233].setRotationPoint(20F, -50F, 0F);

		hipsModel[234].addShapeBox(13F, 9F, -10F, 7, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[234].setRotationPoint(20F, -50F, 0F);

		hipsModel[235].addShapeBox(17F, 13F, -10F, 3, 3, 1, 0F,4F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[235].setRotationPoint(20F, -50F, 0F);

		hipsModel[236].addShapeBox(-3F, -10F, -7F, 3, 19, 4, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		hipsModel[236].setRotationPoint(20F, -50F, 0F);

		hipsModel[237].addShapeBox(13F, 9F, -7F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[237].setRotationPoint(20F, -50F, 0F);

		hipsModel[238].addShapeBox(13F, 3F, -7F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[238].setRotationPoint(20F, -50F, 0F);

		hipsModel[239].addShapeBox(13F, -3F, -7F, 9, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[239].setRotationPoint(20F, -50F, 0F);

		hipsModel[240].addShapeBox(13F, -7F, -7F, 8, 4, 4, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[240].setRotationPoint(20F, -50F, 0F);

		hipsModel[241].addShapeBox(13F, -9F, -7F, 6, 2, 4, 0F,0F, -1F, 0F, -3F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[241].setRotationPoint(20F, -50F, 0F);

		hipsModel[242].addShapeBox(0F, -10F, -7F, 13, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[242].setRotationPoint(20F, -50F, 0F);

		hipsModel[243].addShapeBox(18.5F, 18F, -9F, 3, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 79
		hipsModel[243].setRotationPoint(20F, -50F, 0F);

		hipsModel[244].addShapeBox(18.5F, 18F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F); // Box 80
		hipsModel[244].setRotationPoint(20F, -50F, 0F);

		hipsModel[245].addShapeBox(18.5F, 18F, -7F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, -.5F, 0F, -3F, -.5F, 0F); // Box 81
		hipsModel[245].setRotationPoint(20F, -50F, 0F);

		hipsModel[246].addShapeBox(22.5F, 22F, -8F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 2F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2F, -2F, 0F); // Box 82
		hipsModel[246].setRotationPoint(20F, -50F, 0F);

		hipsModel[247].addShapeBox(22.5F, 22F, -9F, 2, 2, 1, 0F,1F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 1F, -2.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 2F, -2F, 0F); // Box 83
		hipsModel[247].setRotationPoint(20F, -50F, 0F);

		hipsModel[248].addShapeBox(22.5F, 22F, -7F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, .5F, 0F, 2F, -2F, 0F, 0F, 0F, .5F, 0F, -1F, -.5F, 1F, -2.5F, 0F); // Box 84
		hipsModel[248].setRotationPoint(20F, -50F, 0F);

		hipsModel[249].addShapeBox(24.5F, 22F, -8.5F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[249].setRotationPoint(20F, -50F, 0F);

		hipsModel[250].addShapeBox(24.5F, 22F, -7.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F); // Box 86
		hipsModel[250].setRotationPoint(20F, -50F, 0F);

		hipsModel[251].addShapeBox(8F, -8F, -13F, 2, 18, 6, 0F,5F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[251].setRotationPoint(20F, -50F, 0F);

		hipsModel[252].addShapeBox(3F, -9F, -16F, 2, 19, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		hipsModel[252].setRotationPoint(20F, -50F, 0F);

		hipsModel[253].addShapeBox(0F, -9F, -24F, 2, 19, 8, 0F,7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		hipsModel[253].setRotationPoint(20F, -50F, 0F);

		hipsModel[254].addShapeBox(-7F, -8F, -27F, 2, 18, 3, 0F,3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[254].setRotationPoint(20F, -50F, 0F);

		hipsModel[255].addShapeBox(-10F, -6F, -29F, 2, 16, 2, 0F,1F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, -1F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[255].setRotationPoint(20F, -50F, 0F);

		hipsModel[256].addShapeBox(8F, 10F, -13F, 2, 9, 6, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 92
		hipsModel[256].setRotationPoint(20F, -50F, 0F);

		hipsModel[257].addShapeBox(3F, 10F, -16F, 2, 9, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		hipsModel[257].setRotationPoint(20F, -50F, 0F);

		hipsModel[258].addShapeBox(0F, 10F, -24F, 2, 8, 8, 0F,7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		hipsModel[258].setRotationPoint(20F, -50F, 0F);

		hipsModel[259].addShapeBox(-7F, 10F, -27F, 2, 4, 3, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		hipsModel[259].setRotationPoint(20F, -50F, 0F);

		hipsModel[260].addShapeBox(5F, -6F, -11F, 26, 26, 1, 0F,-10F, -10F, 0.8F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.8F, -10F, -10F, 0.5F, -10F, -10F, -0.9F, -10F, -10F, 0.9F, -10F, -10F, -0.5F); // Box 96
		hipsModel[260].setRotationPoint(20F, -50F, 0F);

		hipsModel[261].addShapeBox(22F, -10F, -17F, 6, 14, 3, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, -1F, 0F); // Box 226
		hipsModel[261].setRotationPoint(-6F, -37F, 0F);

		hipsModel[262].addShapeBox(14F, -6F, -17F, 8, 10, 3, 0F,0F, 3F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 2F, -1F, -1F, -2F, -2F, -1F, 0F, -1F, 0F, 2F, 1F, 0F); // Box 227
		hipsModel[262].setRotationPoint(-6F, -37F, 0F);

		hipsModel[263].addShapeBox(1F, 1F, -16F, 11, 5, 2, 0F,0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 228
		hipsModel[263].setRotationPoint(-6F, -37F, 0F);

		hipsModel[264].addShapeBox(-3F, 1F, -16F, 4, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		hipsModel[264].setRotationPoint(-6F, -37F, 0F);

		hipsModel[265].addShapeBox(-15F, 2F, -18F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 230
		hipsModel[265].setRotationPoint(-6F, -37F, 0F);

		hipsModel[266].addShapeBox(-21F, 2F, -18F, 6, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 231
		hipsModel[266].setRotationPoint(-6F, -37F, 0F);

		hipsModel[267].addShapeBox(-27F, 2F, -18F, 6, 6, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 232
		hipsModel[267].setRotationPoint(-6F, -37F, 0F);

		hipsModel[268].addShapeBox(-34F, 3F, -18F, 7, 5, 4, 0F,-3F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -4F, -3F, -2F, 0F, -2F, -1F, 0F, 1F, 0F, -2F, 0F, 0F); // Box 233
		hipsModel[268].setRotationPoint(-6F, -37F, 0F);

		hipsModel[269].addShapeBox(-35F, -9F, -18F, 5, 14, 4, 0F,-3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -3F, -1F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 234
		hipsModel[269].setRotationPoint(-6F, -37F, 0F);

		hipsModel[270].addShapeBox(-35F, -16F, -18F, 5, 7, 4, 0F,-4F, -2F, 0F, 3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 235
		hipsModel[270].setRotationPoint(-6F, -37F, 0F);

		hipsModel[271].addShapeBox(-35F, -21F, -18F, 5, 5, 4, 0F,-5F, -5F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, 2F, 0F, 3F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		hipsModel[271].setRotationPoint(-6F, -37F, 0F);

		hipsModel[272].addShapeBox(-30F, -21F, -18F, 10, 7, 4, 0F,-3F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		hipsModel[272].setRotationPoint(-6F, -37F, 0F);

		hipsModel[273].addShapeBox(-20F, -21F, -18F, 5, 7, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		hipsModel[273].setRotationPoint(-6F, -37F, 0F);

		hipsModel[274].addShapeBox(1F, -21F, -17F, 10, 7, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		hipsModel[274].setRotationPoint(-6F, -37F, 0F);

		hipsModel[275].addShapeBox(-3F, -21F, -16F, 4, 7, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		hipsModel[275].setRotationPoint(-6F, -37F, 0F);

		hipsModel[276].addShapeBox(-15F, -21F, -18F, 12, 7, 4, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		hipsModel[276].setRotationPoint(-6F, -37F, 0F);

		hipsModel[277].addShapeBox(11F, -21F, -18F, 3, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		hipsModel[277].setRotationPoint(-6F, -37F, 0F);

		hipsModel[278].addShapeBox(14F, -21F, -17F, 8, 7, 3, 0F,0F, 0F, 0F, -2F, -2F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 243
		hipsModel[278].setRotationPoint(-6F, -37F, 0F);

		hipsModel[279].addShapeBox(22F, -21F, -22F, 6, 11, 3, 0F,2F, -2F, -1F, -4F, -5F, -2F, -2F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 244
		hipsModel[279].setRotationPoint(-6F, -37F, 5F);

		hipsModel[280].addShapeBox(14F, -14F, -17F, 8, 5, 3, 0F,0F, 0F, 2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 245
		hipsModel[280].setRotationPoint(-6F, -37F, 0F);

		hipsModel[281].addShapeBox(11F, -14F, -19F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		hipsModel[281].setRotationPoint(-6F, -37F, 0F);

		hipsModel[282].addShapeBox(1F, -14F, -17F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		hipsModel[282].setRotationPoint(-6F, -37F, 0F);

		hipsModel[283].addShapeBox(-3F, -14F, -18F, 4, 5, 4, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		hipsModel[283].setRotationPoint(-6F, -37F, 0F);

		hipsModel[284].addShapeBox(-15F, -14F, -20F, 12, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		hipsModel[284].setRotationPoint(-6F, -37F, 0F);

		hipsModel[285].addShapeBox(-27F, -9F, -18F, 7, 11, 4, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		hipsModel[285].setRotationPoint(-6F, -37F, 0F);

		hipsModel[286].addShapeBox(-27F, -14F, -19F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		hipsModel[286].setRotationPoint(-6F, -37F, 0F);

		hipsModel[287].addShapeBox(-20F, -14F, -25F, 5, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		hipsModel[287].setRotationPoint(-6F, -37F, 5F);

		hipsModel[288].addShapeBox(-20F, -9F, -18F, 5, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		hipsModel[288].setRotationPoint(-6F, -37F, 0F);

		hipsModel[289].addShapeBox(-15F, -9F, -18F, 12, 11, 4, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 254
		hipsModel[289].setRotationPoint(-6F, -37F, 0F);

		hipsModel[290].addShapeBox(-3F, -9F, -17F, 4, 10, 3, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		hipsModel[290].setRotationPoint(-6F, -37F, 0F);

		hipsModel[291].addShapeBox(1F, -9F, -17F, 10, 10, 3, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 1F, 2F, 0F, 0F, 0F, 0F); // Box 256
		hipsModel[291].setRotationPoint(-6F, -37F, 0F);

		hipsModel[292].addShapeBox(11F, -9F, -18F, 3, 10, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -2F, -2F, 2F, -2F, -2F, 2F, 0F, -1F, 2F, 0F); // Box 257
		hipsModel[292].setRotationPoint(-6F, -37F, 0F);

		hipsModel[293].addShapeBox(-25F, -27F, 0F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[293].setRotationPoint(-6F, -37F, 0F);

		hipsModel[294].addShapeBox(-25F, -27F, 5F, 40, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 2
		hipsModel[294].setRotationPoint(-6F, -37F, 0F);

		hipsModel[295].addShapeBox(-25F, -25F, 14F, 40, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 3
		hipsModel[295].setRotationPoint(-6F, -37F, 0F);

		hipsModel[296].addShapeBox(-25F, -23F, 17F, 40, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 4
		hipsModel[296].setRotationPoint(-6F, -37F, 0F);

		hipsModel[297].addShapeBox(-23F, -28F, 0F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[297].setRotationPoint(-6F, -37F, 0F);

		hipsModel[298].addShapeBox(-23F, -28F, 5F, 36, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[298].setRotationPoint(-6F, -37F, 0F);

		hipsModel[299].addShapeBox(-23F, -47F, 19F, 36, 30, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 11
		hipsModel[299].setRotationPoint(-6F, -37F, 0F);

		hipsModel[300].addShapeBox(-31.5F, 2.5F, 21.5F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 64
		hipsModel[300].setRotationPoint(-6F, -37F, 0F);
		hipsModel[300].rotateAngleZ = -0.89011792F;

		hipsModel[301].addShapeBox(7F, 24F, 14.5F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		hipsModel[301].setRotationPoint(-6F, -37F, 0F);
		hipsModel[301].rotateAngleZ = 1.29154365F;

		hipsModel[302].addShapeBox(10F, -27F, 21.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[302].setRotationPoint(-6F, -37F, 0F);

		hipsModel[303].addShapeBox(12.5F, -27.5F, 21.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[303].setRotationPoint(-6F, -37F, 0F);

		hipsModel[304].addShapeBox(12.5F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		hipsModel[304].setRotationPoint(-6F, -37F, 0F);

		hipsModel[305].addShapeBox(12.5F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 73
		hipsModel[305].setRotationPoint(-6F, -37F, 0F);

		hipsModel[306].addShapeBox(8.5F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 75
		hipsModel[306].setRotationPoint(-6F, -37F, 0F);

		hipsModel[307].addShapeBox(8.5F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[307].setRotationPoint(-6F, -37F, 0F);

		hipsModel[308].addShapeBox(8.5F, -27.5F, 21.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[308].setRotationPoint(-6F, -37F, 0F);

		hipsModel[309].addShapeBox(10F, -27.5F, 21.5F, 2, 2, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F); // Box 78
		hipsModel[309].setRotationPoint(-6F, -37F, 0F);

		hipsModel[310].addShapeBox(8F, -23.5F, 19F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 79
		hipsModel[310].setRotationPoint(-6F, -37F, 0F);

		hipsModel[311].addShapeBox(-3F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 81
		hipsModel[311].setRotationPoint(-6F, -37F, 0F);

		hipsModel[312].addShapeBox(-3F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		hipsModel[312].setRotationPoint(-6F, -37F, 0F);

		hipsModel[313].addShapeBox(-3F, -27.5F, 21.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[313].setRotationPoint(-6F, -37F, 0F);

		hipsModel[314].addShapeBox(-5.5F, -27F, 21.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		hipsModel[314].setRotationPoint(-6F, -37F, 0F);

		hipsModel[315].addShapeBox(-7F, -27.5F, 21.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[315].setRotationPoint(-6F, -37F, 0F);

		hipsModel[316].addShapeBox(-7F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[316].setRotationPoint(-6F, -37F, 0F);

		hipsModel[317].addShapeBox(-7F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 87
		hipsModel[317].setRotationPoint(-6F, -37F, 0F);

		hipsModel[318].addShapeBox(-5.5F, -27.5F, 21.5F, 2, 2, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F); // Box 88
		hipsModel[318].setRotationPoint(-6F, -37F, 0F);

		hipsModel[319].addShapeBox(-19.5F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 99
		hipsModel[319].setRotationPoint(-6F, -37F, 0F);

		hipsModel[320].addShapeBox(-19.5F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		hipsModel[320].setRotationPoint(-6F, -37F, 0F);

		hipsModel[321].addShapeBox(-19.5F, -27.5F, 21.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		hipsModel[321].setRotationPoint(-6F, -37F, 0F);

		hipsModel[322].addShapeBox(-22F, -27F, 21.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		hipsModel[322].setRotationPoint(-6F, -37F, 0F);

		hipsModel[323].addShapeBox(-23.5F, -27.5F, 21.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		hipsModel[323].setRotationPoint(-6F, -37F, 0F);

		hipsModel[324].addShapeBox(-23.5F, -25.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		hipsModel[324].setRotationPoint(-6F, -37F, 0F);

		hipsModel[325].addShapeBox(-23.5F, -23.5F, 21.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 105
		hipsModel[325].setRotationPoint(-6F, -37F, 0F);

		hipsModel[326].addShapeBox(-22F, -27.5F, 21.5F, 2, 2, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, .2F, -.2F, -.5F, .2F); // Box 106
		hipsModel[326].setRotationPoint(-6F, -37F, 0F);

		hipsModel[327].addShapeBox(-4F, -28.5F, 14.5F, 6, 26, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 107
		hipsModel[327].setRotationPoint(-6F, -37F, 0F);
		hipsModel[327].rotateAngleX = -0.17453293F;
		hipsModel[327].rotateAngleZ = -0.50614548F;

		hipsModel[328].addShapeBox(0F, -47F, 16F, 4, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 139
		hipsModel[328].setRotationPoint(-6F, -37F, 0F);

		hipsModel[329].addShapeBox(0F, -47.5F, 16F, 4, 1, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Box 140
		hipsModel[329].setRotationPoint(-6F, -37F, 0F);

		hipsModel[330].addShapeBox(-8F, -58.5F, 7.5F, 20, 20, 20, 0F,-8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F, -8.5F, -9F, -8.5F); // Box 141
		hipsModel[330].setRotationPoint(-6F, -37F, 0F);

		hipsModel[331].addShapeBox(-25F, -27F, -5F, 40, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		hipsModel[331].setRotationPoint(-6F, -37F, 0F);

		hipsModel[332].addShapeBox(-25F, -27F, -14F, 40, 2, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		hipsModel[332].setRotationPoint(-6F, -37F, 0F);

		hipsModel[333].addShapeBox(-25F, -25F, -17F, 40, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		hipsModel[333].setRotationPoint(-6F, -37F, 0F);

		hipsModel[334].addShapeBox(-25F, -23F, -19F, 40, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		hipsModel[334].setRotationPoint(-6F, -37F, 0F);

		hipsModel[335].addShapeBox(-25F, -21F, -21F, 40, 15, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		hipsModel[335].setRotationPoint(-6F, -37F, 0F);

		hipsModel[336].addShapeBox(-23F, -28F, -5F, 36, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		hipsModel[336].setRotationPoint(-6F, -37F, 0F);

		hipsModel[337].addShapeBox(-24F, -23.5F, 19F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 189
		hipsModel[337].setRotationPoint(-6F, -37F, 0F);

		hipsModel[338].addShapeBox(-5F, -26.5F, 14.5F, 6, 22, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 191
		hipsModel[338].setRotationPoint(-6F, -37F, 0F);
		hipsModel[338].rotateAngleX = -0.17453293F;
		hipsModel[338].rotateAngleZ = 0.10471976F;

		hipsModel[339].addShapeBox(-7.5F, -23.5F, 19F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 192
		hipsModel[339].setRotationPoint(-6F, -37F, 0F);

		hipsModel[340].addShapeBox(-5.5F, -27.5F, -22.5F, 2, 2, 1, 0F,-0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 203
		hipsModel[340].setRotationPoint(-6F, -37F, 0F);

		hipsModel[341].addShapeBox(10F, -27.5F, -22.5F, 2, 2, 1, 0F,-0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 205
		hipsModel[341].setRotationPoint(-6F, -37F, 0F);

		hipsModel[342].addShapeBox(-22F, -27.5F, -22.5F, 2, 2, 1, 0F,-0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 206
		hipsModel[342].setRotationPoint(-6F, -37F, 0F);

		hipsModel[343].addShapeBox(-24F, -23.5F, -25F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 207
		hipsModel[343].setRotationPoint(-6F, -37F, 0F);

		hipsModel[344].addShapeBox(8F, -23.5F, -25F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 208
		hipsModel[344].setRotationPoint(-6F, -37F, 0F);

		hipsModel[345].addShapeBox(-7.5F, -23.5F, -25F, 6, 2, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 209
		hipsModel[345].setRotationPoint(-6F, -37F, 0F);

		hipsModel[346].addShapeBox(12.5F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 211
		hipsModel[346].setRotationPoint(-6F, -37F, 0F);

		hipsModel[347].addShapeBox(12.5F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		hipsModel[347].setRotationPoint(-6F, -37F, 0F);

		hipsModel[348].addShapeBox(12.5F, -27.5F, -22.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		hipsModel[348].setRotationPoint(-6F, -37F, 0F);

		hipsModel[349].addShapeBox(10F, -27F, -22.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		hipsModel[349].setRotationPoint(-6F, -37F, 0F);

		hipsModel[350].addShapeBox(8.5F, -27.5F, -22.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		hipsModel[350].setRotationPoint(-6F, -37F, 0F);

		hipsModel[351].addShapeBox(8.5F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		hipsModel[351].setRotationPoint(-6F, -37F, 0F);

		hipsModel[352].addShapeBox(8.5F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 217
		hipsModel[352].setRotationPoint(-6F, -37F, 0F);

		hipsModel[353].addShapeBox(-3F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 218
		hipsModel[353].setRotationPoint(-6F, -37F, 0F);

		hipsModel[354].addShapeBox(-3F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		hipsModel[354].setRotationPoint(-6F, -37F, 0F);

		hipsModel[355].addShapeBox(-3F, -27.5F, -22.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		hipsModel[355].setRotationPoint(-6F, -37F, 0F);

		hipsModel[356].addShapeBox(-5.5F, -27F, -22.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		hipsModel[356].setRotationPoint(-6F, -37F, 0F);

		hipsModel[357].addShapeBox(-7F, -27.5F, -22.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		hipsModel[357].setRotationPoint(-6F, -37F, 0F);

		hipsModel[358].addShapeBox(-7F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		hipsModel[358].setRotationPoint(-6F, -37F, 0F);

		hipsModel[359].addShapeBox(-7F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 224
		hipsModel[359].setRotationPoint(-6F, -37F, 0F);

		hipsModel[360].addShapeBox(-19.5F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F); // Box 232
		hipsModel[360].setRotationPoint(-6F, -37F, 0F);

		hipsModel[361].addShapeBox(-19.5F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		hipsModel[361].setRotationPoint(-6F, -37F, 0F);

		hipsModel[362].addShapeBox(-19.5F, -27.5F, -22.5F, 1, 2, 1, 0F,.5F, -1.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		hipsModel[362].setRotationPoint(-6F, -37F, 0F);

		hipsModel[363].addShapeBox(-22F, -27F, -22.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		hipsModel[363].setRotationPoint(-6F, -37F, 0F);

		hipsModel[364].addShapeBox(-23.5F, -27.5F, -22.5F, 1, 2, 1, 0F,-1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		hipsModel[364].setRotationPoint(-6F, -37F, 0F);

		hipsModel[365].addShapeBox(-23.5F, -25.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		hipsModel[365].setRotationPoint(-6F, -37F, 0F);

		hipsModel[366].addShapeBox(-23.5F, -23.5F, -22.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F); // Box 238
		hipsModel[366].setRotationPoint(-6F, -37F, 0F);

		hipsModel[367].addShapeBox(-31.5F, 2.5F, -22.5F, 2, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 272
		hipsModel[367].setRotationPoint(-6F, -37F, 0F);
		hipsModel[367].rotateAngleZ = -0.89011792F;

		hipsModel[368].addShapeBox(7F, 24F, -17.5F, 2, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 278
		hipsModel[368].setRotationPoint(-6F, -37F, 0F);
		hipsModel[368].rotateAngleZ = 1.29154365F;

		hipsModel[369].addShapeBox(11F, -47F, 0F, 2, 19, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		hipsModel[369].setRotationPoint(-6F, -37F, 0F);

		hipsModel[370].addShapeBox(5F, -55F, 19F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 140
		hipsModel[370].setRotationPoint(-6F, -37F, 0F);

		hipsModel[371].addShapeBox(11F, -55F, 9F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		hipsModel[371].setRotationPoint(-6F, -37F, 0F);

		hipsModel[372].addShapeBox(-23F, -28F, -19F, 36, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		hipsModel[372].setRotationPoint(-6F, -37F, 0F);

		hipsModel[373].addShapeBox(-23F, -55F, 19F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 0
		hipsModel[373].setRotationPoint(-6F, -37F, 0F);

		hipsModel[374].addShapeBox(11F, -47F, -19F, 2, 19, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[374].setRotationPoint(-6F, -37F, 0F);

		hipsModel[375].addShapeBox(-23F, -47F, -21F, 36, 30, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[375].setRotationPoint(-6F, -37F, 0F);

		hipsModel[376].addShapeBox(11F, -55F, -19F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[376].setRotationPoint(-6F, -37F, 0F);

		hipsModel[377].addShapeBox(5F, -55F, -21F, 8, 8, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[377].setRotationPoint(-6F, -37F, 0F);

		hipsModel[378].addShapeBox(-23F, -55F, -21F, 8, 8, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[378].setRotationPoint(-6F, -37F, 0F);

		hipsModel[379].addShapeBox(-23F, -47F, 0F, 2, 19, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[379].setRotationPoint(-6F, -37F, 0F);

		hipsModel[380].addShapeBox(-23F, -47F, -19F, 2, 19, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[380].setRotationPoint(-6F, -37F, 0F);

		hipsModel[381].addShapeBox(-23F, -55F, -19F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[381].setRotationPoint(-6F, -37F, 0F);

		hipsModel[382].addShapeBox(-23F, -55F, 9F, 2, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[382].setRotationPoint(-6F, -37F, 0F);

		hipsModel[383].addShapeBox(-5F, -26.5F, -20.5F, 6, 22, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 11
		hipsModel[383].setRotationPoint(-6F, -37F, 0F);
		hipsModel[383].rotateAngleX = 0.17453293F;
		hipsModel[383].rotateAngleZ = 0.10471976F;

		hipsModel[384].addShapeBox(-4F, -28.5F, -20.5F, 6, 26, 6, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 12
		hipsModel[384].setRotationPoint(-6F, -37F, 0F);
		hipsModel[384].rotateAngleX = 0.17453293F;
		hipsModel[384].rotateAngleZ = -0.50614548F;

		hipsModel[385].addShapeBox(-25F, -6F, -21F, 40, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 18
		hipsModel[385].setRotationPoint(-6F, -37F, 0F);

		hipsModel[386].addShapeBox(-12F, -39F, 21F, 14, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 23
		hipsModel[386].setRotationPoint(-6F, -37F, 0F);

		hipsModel[387].addShapeBox(-12F, -42F, 21F, 14, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2.5F, -.5F, 0F, -2.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		hipsModel[387].setRotationPoint(-6F, -37F, 0F);

		hipsModel[388].addShapeBox(-7F, -44F, 21F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2.5F, .5F, 0F, 2.5F, .5F, 0F); // Box 27
		hipsModel[388].setRotationPoint(-6F, -37F, 0F);

		hipsModel[389].addShapeBox(-12F, -35F, 21F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 30
		hipsModel[389].setRotationPoint(-6F, -37F, 0F);

		hipsModel[390].addShapeBox(-7F, -32F, 21F, 4, 2, 2, 0F,3F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 32
		hipsModel[390].setRotationPoint(-6F, -37F, 0F);

		hipsModel[391].addShapeBox(-7F, -44F, -23F, 4, 2, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 33
		hipsModel[391].setRotationPoint(-6F, -37F, 0F);

		hipsModel[392].addShapeBox(-12F, -42F, -23F, 14, 3, 2, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[392].setRotationPoint(-6F, -37F, 0F);

		hipsModel[393].addShapeBox(-12F, -39F, -23F, 14, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[393].setRotationPoint(-6F, -37F, 0F);

		hipsModel[394].addShapeBox(-12F, -35F, -23F, 14, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 36
		hipsModel[394].setRotationPoint(-6F, -37F, 0F);

		hipsModel[395].addShapeBox(-7F, -32F, -23F, 4, 2, 2, 0F,2.5F, 0.5F, 0F, 2.5F, 0.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[395].setRotationPoint(-6F, -37F, 0F);

		hipsModel[396].addShapeBox(13F, -47F, -22F, 1, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[396].setRotationPoint(-6F, -37F, 0F);

		hipsModel[397].addShapeBox(-23F, -47F, 21F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[397].setRotationPoint(-6F, -37F, 0F);

		hipsModel[398].addShapeBox(-24F, -47F, -22F, 1, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[398].setRotationPoint(-6F, -37F, 0F);

		hipsModel[399].addShapeBox(-23F, -47F, -22F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[399].setRotationPoint(-6F, -37F, 0F);

		hipsModel[400].addShapeBox(-23F, -29F, 21F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[400].setRotationPoint(-6F, -37F, 0F);

		hipsModel[401].addShapeBox(13F, -29F, -22F, 1, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[401].setRotationPoint(-6F, -37F, 0F);

		hipsModel[402].addShapeBox(-23F, -29F, -22F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[402].setRotationPoint(-6F, -37F, 0F);

		hipsModel[403].addShapeBox(-24F, -29F, -22F, 1, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		hipsModel[403].setRotationPoint(-6F, -37F, 0F);

		hipsModel[404].addShapeBox(12F, -45F, -22F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[404].setRotationPoint(-6F, -37F, 0F);

		hipsModel[405].addShapeBox(12F, -45F, 20F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[405].setRotationPoint(-6F, -37F, 0F);

		hipsModel[406].addShapeBox(-24F, -45F, 20F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[406].setRotationPoint(-6F, -37F, 0F);

		hipsModel[407].addShapeBox(-24F, -45F, -22F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[407].setRotationPoint(-6F, -37F, 0F);

		hipsModel[408].addShapeBox(-23F, 2F, -22F, 36, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		hipsModel[408].setRotationPoint(-6F, -37F, 0F);

		hipsModel[409].addShapeBox(-32F, -23F, -19F, 7, 2, 2, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 9
		hipsModel[409].setRotationPoint(-6F, -37F, 0F);

		hipsModel[410].addShapeBox(-32F, -25F, -17F, 7, 2, 3, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 10
		hipsModel[410].setRotationPoint(-6F, -37F, 0F);

		hipsModel[411].addShapeBox(-32F, -27F, -14F, 7, 2, 9, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 11
		hipsModel[411].setRotationPoint(-6F, -37F, 0F);

		hipsModel[412].addShapeBox(-32F, -27F, -5F, 7, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12
		hipsModel[412].setRotationPoint(-6F, -37F, 0F);

		hipsModel[413].addShapeBox(-9F, -55F, 19F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 17
		hipsModel[413].setRotationPoint(-6F, -37F, 0F);

		hipsModel[414].addShapeBox(-9F, -55F, -21F, 8, 8, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[414].setRotationPoint(-6F, -37F, 0F);

		hipsModel[415].addShapeBox(-32F, -21F, -21F, 7, 15, 2, 0F,0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[415].setRotationPoint(-6F, -37F, 0F);

		hipsModel[416].addShapeBox(-32F, 1F, -21F, 9, 12, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 21
		hipsModel[416].setRotationPoint(-6F, -37F, 0F);

		hipsModel[417].addShapeBox(-32F, -6F, -21F, 9, 7, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		hipsModel[417].setRotationPoint(-6F, -37F, 0F);

		hipsModel[418].addShapeBox(-38F, -19F, -21F, 6, 13, 2, 0F,0F, -7F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 28
		hipsModel[418].setRotationPoint(-6F, -37F, 0F);

		hipsModel[419].addShapeBox(-38F, -21F, -19F, 6, 2, 2, 0F,0F, -6F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 6F, -3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 4F, 2F); // Box 29
		hipsModel[419].setRotationPoint(-6F, -37F, 0F);

		hipsModel[420].addShapeBox(-38F, -23F, -17F, 6, 2, 3, 0F,0F, -6F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, 6F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 1F); // Box 30
		hipsModel[420].setRotationPoint(-6F, -37F, 0F);

		hipsModel[421].addShapeBox(-38F, -25F, -14F, 6, 2, 9, 0F,0F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 6F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 31
		hipsModel[421].setRotationPoint(-6F, -37F, 0F);

		hipsModel[422].addShapeBox(-38F, -25F, -5F, 6, 2, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 32
		hipsModel[422].setRotationPoint(-6F, -37F, 0F);

		hipsModel[423].addShapeBox(-38F, -6F, -21F, 6, 7, 2, 0F,0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 34
		hipsModel[423].setRotationPoint(-6F, -37F, 0F);

		hipsModel[424].addShapeBox(-38F, 1F, -20F, 6, 12, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 35
		hipsModel[424].setRotationPoint(-6F, -37F, 0F);

		hipsModel[425].addShapeBox(-40F, -21F, -5F, 2, 5, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[425].setRotationPoint(-6F, -37F, 0F);

		hipsModel[426].addShapeBox(-40F, -21F, -13F, 2, 5, 8, 0F,0F, -5.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[426].setRotationPoint(-6F, -37F, 0F);

		hipsModel[427].addShapeBox(-40F, -19F, -15F, 2, 4, 2, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 38
		hipsModel[427].setRotationPoint(-6F, -37F, 0F);

		hipsModel[428].addShapeBox(-40F, -17F, -16F, 2, 2, 1, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[428].setRotationPoint(-6F, -37F, 0F);

		hipsModel[429].addShapeBox(-40F, -15F, -17F, 2, 9, 1, 0F,0F, -4F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 40
		hipsModel[429].setRotationPoint(-6F, -37F, 0F);

		hipsModel[430].addShapeBox(-40F, -6F, -17F, 2, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 44
		hipsModel[430].setRotationPoint(-6F, -37F, 0F);

		hipsModel[431].addShapeBox(-40F, 1F, -17F, 2, 12, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 45
		hipsModel[431].setRotationPoint(-6F, -37F, 0F);

		hipsModel[432].addShapeBox(-41F, -16F, -5F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[432].setRotationPoint(-6F, -37F, 0F);

		hipsModel[433].addShapeBox(-41F, -16F, -13F, 1, 5, 8, 0F,-1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[433].setRotationPoint(-6F, -37F, 0F);

		hipsModel[434].addShapeBox(-41F, -15F, -15F, 1, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[434].setRotationPoint(-6F, -37F, 0F);

		hipsModel[435].addShapeBox(-41F, -11F, -5F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[435].setRotationPoint(-6F, -37F, 0F);

		hipsModel[436].addShapeBox(-41F, -11F, -13F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[436].setRotationPoint(-6F, -37F, 0F);

		hipsModel[437].addShapeBox(-41F, -11F, -15F, 1, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[437].setRotationPoint(-6F, -37F, 0F);

		hipsModel[438].addShapeBox(-41F, -6F, -15F, 1, 7, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[438].setRotationPoint(-6F, -37F, 0F);

		hipsModel[439].addShapeBox(-41F, -6F, -13F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[439].setRotationPoint(-6F, -37F, 0F);

		hipsModel[440].addShapeBox(-41F, -6F, -5F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		hipsModel[440].setRotationPoint(-6F, -37F, 0F);

		hipsModel[441].addShapeBox(-41F, 1F, -15F, 1, 12, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[441].setRotationPoint(-6F, -37F, 0F);

		hipsModel[442].addShapeBox(-41F, 1F, -13F, 1, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		hipsModel[442].setRotationPoint(-6F, -37F, 0F);

		hipsModel[443].addShapeBox(-41F, 1F, -5F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[443].setRotationPoint(-6F, -37F, 0F);

		hipsModel[444].addShapeBox(15F, 1F, -21F, 5, 12, 1, 0F,2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, 0F, 0F); // Box 58
		hipsModel[444].setRotationPoint(-6F, -37F, 0F);

		hipsModel[445].addShapeBox(15F, -6F, -21F, 5, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F); // Box 59
		hipsModel[445].setRotationPoint(-6F, -37F, 0F);

		hipsModel[446].addShapeBox(15F, -21F, -21F, 5, 15, 2, 0F,0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[446].setRotationPoint(-6F, -37F, 0F);

		hipsModel[447].addShapeBox(15F, -23F, -19F, 5, 2, 2, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[447].setRotationPoint(-6F, -37F, 0F);

		hipsModel[448].addShapeBox(15F, -25F, -17F, 5, 2, 3, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[448].setRotationPoint(-6F, -37F, 0F);

		hipsModel[449].addShapeBox(15F, -27F, -14F, 5, 2, 9, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[449].setRotationPoint(-6F, -37F, 0F);

		hipsModel[450].addShapeBox(15F, -27F, -5F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[450].setRotationPoint(-6F, -37F, 0F);

		hipsModel[451].addShapeBox(20F, 1F, -20F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 65
		hipsModel[451].setRotationPoint(-6F, -37F, 0F);

		hipsModel[452].addShapeBox(20F, -6F, -21F, 6, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 66
		hipsModel[452].setRotationPoint(-6F, -37F, 0F);

		hipsModel[453].addShapeBox(20F, -19F, -21F, 6, 13, 2, 0F,0F, -3F, 0F, 0F, -7F, -4F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 67
		hipsModel[453].setRotationPoint(-6F, -37F, 0F);

		hipsModel[454].addShapeBox(20F, -21F, -19F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, -6F, -3F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -3F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 68
		hipsModel[454].setRotationPoint(-6F, -37F, 0F);

		hipsModel[455].addShapeBox(20F, -23F, -17F, 6, 2, 3, 0F,0F, -2F, 0F, 0F, -6F, -2F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -2F, 0F, 4F, 1F, 0F, 0F, 0F); // Box 69
		hipsModel[455].setRotationPoint(-6F, -37F, 0F);

		hipsModel[456].addShapeBox(20F, -25F, -14F, 6, 2, 9, 0F,0F, -2F, 0F, 0F, -6F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -1F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[456].setRotationPoint(-6F, -37F, 0F);

		hipsModel[457].addShapeBox(20F, -25F, -5F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[457].setRotationPoint(-6F, -37F, 0F);

		hipsModel[458].addShapeBox(26F, 1F, -17F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72
		hipsModel[458].setRotationPoint(-6F, -37F, 0F);

		hipsModel[459].addShapeBox(28F, 1F, -15F, 1, 12, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[459].setRotationPoint(-6F, -37F, 0F);

		hipsModel[460].addShapeBox(28F, -1F, -13F, 1, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[460].setRotationPoint(-6F, -37F, 0F);

		hipsModel[461].addShapeBox(28F, -1F, -5F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[461].setRotationPoint(-6F, -37F, 0F);

		hipsModel[462].addShapeBox(28F, -1F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[462].setRotationPoint(-6F, -37F, 0F);

		hipsModel[463].addShapeBox(28F, -1F, 5F, 1, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[463].setRotationPoint(-6F, -37F, 0F);

		hipsModel[464].addShapeBox(28F, 1F, 13F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[464].setRotationPoint(-6F, -37F, 0F);

		hipsModel[465].addShapeBox(26F, 1F, 16F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 79
		hipsModel[465].setRotationPoint(-6F, -37F, 0F);

		hipsModel[466].addShapeBox(20F, 1F, 19F, 6, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 80
		hipsModel[466].setRotationPoint(-6F, -37F, 0F);

		hipsModel[467].addShapeBox(15F, 1F, 20F, 5, 12, 1, 0F,2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, 0F); // Box 81
		hipsModel[467].setRotationPoint(-6F, -37F, 0F);

		hipsModel[468].addShapeBox(20F, -6F, 19F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 82
		hipsModel[468].setRotationPoint(-6F, -37F, 0F);

		hipsModel[469].addShapeBox(15F, -6F, 19F, 5, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F); // Box 83
		hipsModel[469].setRotationPoint(-6F, -37F, 0F);

		hipsModel[470].addShapeBox(20F, -19F, 19F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -7F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.5F); // Box 84
		hipsModel[470].setRotationPoint(-6F, -37F, 0F);

		hipsModel[471].addShapeBox(15F, -21F, 19F, 5, 15, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		hipsModel[471].setRotationPoint(-6F, -37F, 0F);

		hipsModel[472].addShapeBox(-25F, -21F, 19F, 40, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[472].setRotationPoint(-6F, -37F, 0F);

		hipsModel[473].addShapeBox(20F, -25F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[473].setRotationPoint(-6F, -37F, 0F);

		hipsModel[474].addShapeBox(15F, -27F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 88
		hipsModel[474].setRotationPoint(-6F, -37F, 0F);

		hipsModel[475].addShapeBox(20F, -25F, 5F, 6, 2, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -1F, 0F, 2F, 0F); // Box 89
		hipsModel[475].setRotationPoint(-6F, -37F, 0F);

		hipsModel[476].addShapeBox(15F, -27F, 5F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Box 90
		hipsModel[476].setRotationPoint(-6F, -37F, 0F);

		hipsModel[477].addShapeBox(20F, -23F, 14F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -6F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 6F, -2F, 0F, 2F, 0F); // Box 91
		hipsModel[477].setRotationPoint(-6F, -37F, 0F);

		hipsModel[478].addShapeBox(15F, -25F, 14F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Box 92
		hipsModel[478].setRotationPoint(-6F, -37F, 0F);

		hipsModel[479].addShapeBox(15F, -23F, 17F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 93
		hipsModel[479].setRotationPoint(-6F, -37F, 0F);

		hipsModel[480].addShapeBox(20F, -21F, 17F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -6F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 6F, -3F, 0F, 4F, 0F); // Box 94
		hipsModel[480].setRotationPoint(-6F, -37F, 0F);

		hipsModel[481].addShapeBox(-25F, -6F, 19F, 40, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F); // Box 95
		hipsModel[481].setRotationPoint(-6F, -37F, 0F);

		hipsModel[482].addShapeBox(-23F, 2F, 20F, 36, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 96
		hipsModel[482].setRotationPoint(-6F, -37F, 0F);

		hipsModel[483].addShapeBox(-32F, -27F, 0F, 7, 2, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 97
		hipsModel[483].setRotationPoint(-6F, -37F, 0F);

		hipsModel[484].addShapeBox(-38F, -25F, 0F, 6, 2, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 98
		hipsModel[484].setRotationPoint(-6F, -37F, 0F);

		hipsModel[485].addShapeBox(-40F, -21F, 0F, 2, 5, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		hipsModel[485].setRotationPoint(-6F, -37F, 0F);

		hipsModel[486].addShapeBox(-41F, -16F, 1F, 2, 5, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		hipsModel[486].setRotationPoint(-6F, -37F, 0F);

		hipsModel[487].addShapeBox(-41F, -11F, 1F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		hipsModel[487].setRotationPoint(-6F, -37F, 0F);

		hipsModel[488].addShapeBox(-41F, -6F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		hipsModel[488].setRotationPoint(-6F, -37F, 0F);

		hipsModel[489].addShapeBox(-41F, 1F, 0F, 2, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		hipsModel[489].setRotationPoint(-6F, -37F, 0F);

		hipsModel[490].addShapeBox(-41F, 1F, 5F, 1, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		hipsModel[490].setRotationPoint(-6F, -37F, 0F);

		hipsModel[491].addShapeBox(-41F, -6F, 5F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		hipsModel[491].setRotationPoint(-6F, -37F, 0F);

		hipsModel[492].addShapeBox(-41F, -11F, 5F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		hipsModel[492].setRotationPoint(-6F, -37F, 0F);

		hipsModel[493].addShapeBox(-41F, -16F, 5F, 1, 5, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		hipsModel[493].setRotationPoint(-6F, -37F, 0F);

		hipsModel[494].addShapeBox(-40F, -21F, 5F, 2, 5, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 108
		hipsModel[494].setRotationPoint(-6F, -37F, 0F);

		hipsModel[495].addShapeBox(-32F, -27F, 5F, 7, 2, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 109
		hipsModel[495].setRotationPoint(-6F, -37F, 0F);

		hipsModel[496].addShapeBox(-38F, -25F, 5F, 6, 2, 9, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -1F); // Box 110
		hipsModel[496].setRotationPoint(-6F, -37F, 0F);

		hipsModel[497].addShapeBox(-32F, -25F, 14F, 7, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F); // Box 111
		hipsModel[497].setRotationPoint(-6F, -37F, 0F);

		hipsModel[498].addShapeBox(-38F, -23F, 14F, 6, 2, 3, 0F,0F, -4F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -2F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, -2F); // Box 112
		hipsModel[498].setRotationPoint(-6F, -37F, 0F);

		hipsModel[499].addShapeBox(-40F, -19F, 13F, 2, 4, 2, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		hipsModel[499].setRotationPoint(-6F, -37F, 0F);
	}

	private void inithipsModel_2()
	{
		hipsModel[500] = new ModelRendererTurbo(this, 347, 161, textureX, textureY); // Box 114
		hipsModel[501] = new ModelRendererTurbo(this, 347, 172, textureX, textureY); // Box 115
		hipsModel[502] = new ModelRendererTurbo(this, 347, 182, textureX, textureY); // Box 116
		hipsModel[503] = new ModelRendererTurbo(this, 347, 196, textureX, textureY); // Box 117
		hipsModel[504] = new ModelRendererTurbo(this, 259, 161, textureX, textureY); // Box 118
		hipsModel[505] = new ModelRendererTurbo(this, 295, 161, textureX, textureY); // Box 119
		hipsModel[506] = new ModelRendererTurbo(this, 334, 164, textureX, textureY); // Box 120
		hipsModel[507] = new ModelRendererTurbo(this, 332, 171, textureX, textureY); // Box 125
		hipsModel[508] = new ModelRendererTurbo(this, 332, 184, textureX, textureY); // Box 126
		hipsModel[509] = new ModelRendererTurbo(this, 332, 197, textureX, textureY); // Box 127
		hipsModel[510] = new ModelRendererTurbo(this, 262, 170, textureX, textureY); // Box 128
		hipsModel[511] = new ModelRendererTurbo(this, 260, 193, textureX, textureY); // Box 129
		hipsModel[512] = new ModelRendererTurbo(this, 262, 210, textureX, textureY); // Box 130
		hipsModel[513] = new ModelRendererTurbo(this, 295, 208, textureX, textureY); // Box 131
		hipsModel[514] = new ModelRendererTurbo(this, 295, 195, textureX, textureY); // Box 132
		hipsModel[515] = new ModelRendererTurbo(this, 296, 172, textureX, textureY); // Box 133
		hipsModel[516] = new ModelRendererTurbo(this, 64, 331, textureX, textureY); // Box 0
		hipsModel[517] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 12
		hipsModel[518] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 13
		hipsModel[519] = new ModelRendererTurbo(this, 83, 275, textureX, textureY); // Box 14
		hipsModel[520] = new ModelRendererTurbo(this, 62, 318, textureX, textureY); // Box 15
		hipsModel[521] = new ModelRendererTurbo(this, 262, 419, textureX, textureY); // Box 17
		hipsModel[522] = new ModelRendererTurbo(this, 262, 432, textureX, textureY); // Box 18
		hipsModel[523] = new ModelRendererTurbo(this, 262, 426, textureX, textureY); // Box 19
		hipsModel[524] = new ModelRendererTurbo(this, 278, 426, textureX, textureY); // Box 20
		hipsModel[525] = new ModelRendererTurbo(this, 262, 446, textureX, textureY); // Box 21
		hipsModel[526] = new ModelRendererTurbo(this, 241, 445, textureX, textureY); // Box 22
		hipsModel[527] = new ModelRendererTurbo(this, 198, 457, textureX, textureY); // Box 23
		hipsModel[528] = new ModelRendererTurbo(this, 261, 454, textureX, textureY); // Box 24
		hipsModel[529] = new ModelRendererTurbo(this, 167, 382, textureX, textureY); // Box 0
		hipsModel[530] = new ModelRendererTurbo(this, 189, 374, textureX, textureY); // Box 1
		hipsModel[531] = new ModelRendererTurbo(this, 202, 374, textureX, textureY); // Box 2
		hipsModel[532] = new ModelRendererTurbo(this, 216, 374, textureX, textureY); // Box 3
		hipsModel[533] = new ModelRendererTurbo(this, 231, 374, textureX, textureY); // Box 4
		hipsModel[534] = new ModelRendererTurbo(this, 243, 374, textureX, textureY); // Box 5
		hipsModel[535] = new ModelRendererTurbo(this, 243, 360, textureX, textureY); // Box 6
		hipsModel[536] = new ModelRendererTurbo(this, 231, 360, textureX, textureY); // Box 7
		hipsModel[537] = new ModelRendererTurbo(this, 216, 360, textureX, textureY); // Box 8
		hipsModel[538] = new ModelRendererTurbo(this, 202, 360, textureX, textureY); // Box 9
		hipsModel[539] = new ModelRendererTurbo(this, 189, 360, textureX, textureY); // Box 10
		hipsModel[540] = new ModelRendererTurbo(this, 255, 374, textureX, textureY); // Box 11
		hipsModel[541] = new ModelRendererTurbo(this, 255, 360, textureX, textureY); // Box 12
		hipsModel[542] = new ModelRendererTurbo(this, 196, 471, textureX, textureY); // Box 0
		hipsModel[543] = new ModelRendererTurbo(this, 211, 471, textureX, textureY); // Box 3
		hipsModel[544] = new ModelRendererTurbo(this, 211, 479, textureX, textureY); // Box 5
		hipsModel[545] = new ModelRendererTurbo(this, 196, 479, textureX, textureY); // Box 6
		hipsModel[546] = new ModelRendererTurbo(this, 196, 487, textureX, textureY); // Box 11
		hipsModel[547] = new ModelRendererTurbo(this, 211, 487, textureX, textureY); // Box 12
		hipsModel[548] = new ModelRendererTurbo(this, 196, 495, textureX, textureY); // Box 13
		hipsModel[549] = new ModelRendererTurbo(this, 211, 495, textureX, textureY); // Box 14
		hipsModel[550] = new ModelRendererTurbo(this, 198, 457, textureX, textureY); // Box 15
		hipsModel[551] = new ModelRendererTurbo(this, 241, 445, textureX, textureY); // Box 16
		hipsModel[552] = new ModelRendererTurbo(this, 198, 437, textureX, textureY); // Box 17
		hipsModel[553] = new ModelRendererTurbo(this, 237, 430, textureX, textureY); // Box 18
		hipsModel[554] = new ModelRendererTurbo(this, 200, 421, textureX, textureY); // Box 19
		hipsModel[555] = new ModelRendererTurbo(this, 239, 418, textureX, textureY); // Box 20
		hipsModel[556] = new ModelRendererTurbo(this, 198, 406, textureX, textureY); // Box 21
		hipsModel[557] = new ModelRendererTurbo(this, 238, 408, textureX, textureY); // Box 22
		hipsModel[558] = new ModelRendererTurbo(this, 198, 393, textureX, textureY); // Box 23
		hipsModel[559] = new ModelRendererTurbo(this, 235, 397, textureX, textureY); // Box 24
		hipsModel[560] = new ModelRendererTurbo(this, 264, 394, textureX, textureY); // Box 25
		hipsModel[561] = new ModelRendererTurbo(this, 262, 409, textureX, textureY); // Box 26
		hipsModel[562] = new ModelRendererTurbo(this, 265, 400, textureX, textureY); // Box 27
		hipsModel[563] = new ModelRendererTurbo(this, 262, 419, textureX, textureY); // Box 28
		hipsModel[564] = new ModelRendererTurbo(this, 262, 426, textureX, textureY); // Box 29
		hipsModel[565] = new ModelRendererTurbo(this, 278, 426, textureX, textureY); // Box 30
		hipsModel[566] = new ModelRendererTurbo(this, 262, 432, textureX, textureY); // Box 31
		hipsModel[567] = new ModelRendererTurbo(this, 262, 446, textureX, textureY); // Box 32
		hipsModel[568] = new ModelRendererTurbo(this, 261, 454, textureX, textureY); // Box 33
		hipsModel[569] = new ModelRendererTurbo(this, 167, 382, textureX, textureY); // Box 34
		hipsModel[570] = new ModelRendererTurbo(this, 189, 374, textureX, textureY); // Box 35
		hipsModel[571] = new ModelRendererTurbo(this, 202, 374, textureX, textureY); // Box 36
		hipsModel[572] = new ModelRendererTurbo(this, 216, 374, textureX, textureY); // Box 37
		hipsModel[573] = new ModelRendererTurbo(this, 231, 374, textureX, textureY); // Box 38
		hipsModel[574] = new ModelRendererTurbo(this, 243, 374, textureX, textureY); // Box 39
		hipsModel[575] = new ModelRendererTurbo(this, 255, 374, textureX, textureY); // Box 40
		hipsModel[576] = new ModelRendererTurbo(this, 255, 360, textureX, textureY); // Box 41
		hipsModel[577] = new ModelRendererTurbo(this, 243, 360, textureX, textureY); // Box 42
		hipsModel[578] = new ModelRendererTurbo(this, 231, 360, textureX, textureY); // Box 43
		hipsModel[579] = new ModelRendererTurbo(this, 216, 360, textureX, textureY); // Box 44
		hipsModel[580] = new ModelRendererTurbo(this, 202, 360, textureX, textureY); // Box 45
		hipsModel[581] = new ModelRendererTurbo(this, 189, 360, textureX, textureY); // Box 46
		hipsModel[582] = new ModelRendererTurbo(this, 196, 471, textureX, textureY); // Box 47
		hipsModel[583] = new ModelRendererTurbo(this, 211, 471, textureX, textureY); // Box 48
		hipsModel[584] = new ModelRendererTurbo(this, 196, 479, textureX, textureY); // Box 49
		hipsModel[585] = new ModelRendererTurbo(this, 211, 479, textureX, textureY); // Box 50
		hipsModel[586] = new ModelRendererTurbo(this, 196, 487, textureX, textureY); // Box 51
		hipsModel[587] = new ModelRendererTurbo(this, 211, 487, textureX, textureY); // Box 52
		hipsModel[588] = new ModelRendererTurbo(this, 196, 495, textureX, textureY); // Box 53
		hipsModel[589] = new ModelRendererTurbo(this, 211, 495, textureX, textureY); // Box 54

		hipsModel[500].addShapeBox(-41F, -15F, 13F, 1, 4, 2, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 114
		hipsModel[500].setRotationPoint(-6F, -37F, 0F);

		hipsModel[501].addShapeBox(-41F, -11F, 13F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 115
		hipsModel[501].setRotationPoint(-6F, -37F, 0F);

		hipsModel[502].addShapeBox(-41F, -6F, 13F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 116
		hipsModel[502].setRotationPoint(-6F, -37F, 0F);

		hipsModel[503].addShapeBox(-41F, 1F, 13F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 117
		hipsModel[503].setRotationPoint(-6F, -37F, 0F);

		hipsModel[504].addShapeBox(-32F, -23F, 17F, 7, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 118
		hipsModel[504].setRotationPoint(-6F, -37F, 0F);

		hipsModel[505].addShapeBox(-38F, -21F, 17F, 6, 2, 2, 0F,0F, -4F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, -3F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -3F); // Box 119
		hipsModel[505].setRotationPoint(-6F, -37F, 0F);

		hipsModel[506].addShapeBox(-40F, -17F, 15F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 120
		hipsModel[506].setRotationPoint(-6F, -37F, 0F);

		hipsModel[507].addShapeBox(-40F, -15F, 16F, 2, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 125
		hipsModel[507].setRotationPoint(-6F, -37F, 0F);

		hipsModel[508].addShapeBox(-40F, -6F, 16F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 126
		hipsModel[508].setRotationPoint(-6F, -37F, 0F);

		hipsModel[509].addShapeBox(-40F, 1F, 16F, 2, 12, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 127
		hipsModel[509].setRotationPoint(-6F, -37F, 0F);

		hipsModel[510].addShapeBox(-32F, -21F, 19F, 7, 15, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		hipsModel[510].setRotationPoint(-6F, -37F, 0F);

		hipsModel[511].addShapeBox(-32F, -6F, 19F, 9, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 129
		hipsModel[511].setRotationPoint(-6F, -37F, 0F);

		hipsModel[512].addShapeBox(-32F, 1F, 20F, 9, 12, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 130
		hipsModel[512].setRotationPoint(-6F, -37F, 0F);

		hipsModel[513].addShapeBox(-38F, 1F, 19F, 6, 12, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 131
		hipsModel[513].setRotationPoint(-6F, -37F, 0F);

		hipsModel[514].addShapeBox(-38F, -6F, 19F, 6, 7, 2, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 132
		hipsModel[514].setRotationPoint(-6F, -37F, 0F);

		hipsModel[515].addShapeBox(-38F, -19F, 19F, 6, 13, 2, 0F,0F, -4F, 3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Box 133
		hipsModel[515].setRotationPoint(-6F, -37F, 0F);

		hipsModel[516].addShapeBox(13F, 13F, -9F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		hipsModel[516].setRotationPoint(20F, -50F, 0F);

		hipsModel[517].addShapeBox(13F, 9F, 3F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[517].setRotationPoint(20F, -50F, 0F);

		hipsModel[518].addShapeBox(17F, 13F, 3F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[518].setRotationPoint(20F, -50F, 0F);

		hipsModel[519].addShapeBox(17F, 13F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[519].setRotationPoint(20F, -50F, 0F);

		hipsModel[520].addShapeBox(13F, 3F, 9F, 6, 6, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 15
		hipsModel[520].setRotationPoint(20F, -50F, 0F);

		hipsModel[521].addShapeBox(13F, 3F, 9F, 8, 3, 1, 0F,2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.F, 2F, 0F, -3F, 2.4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 2.7F); // Box 17
		hipsModel[521].setRotationPoint(20F, -50F, 0F);

		hipsModel[522].addShapeBox(13F, 8F, 9F, 8, 3, 1, 0F,2F, 0F, -3F, 2.7F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, 2.5F, 2F, 0F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 18
		hipsModel[522].setRotationPoint(20F, -50F, 0F);

		hipsModel[523].addShapeBox(20F, 6F, 9F, 1, 2, 1, 0F,0F, 0F, 0F, 2.4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 2.7F, 0F, 0F, .8F, 0F, 0F, 0F, 0F, .5F); // Box 19
		hipsModel[523].setRotationPoint(20F, -50F, 0F);

		hipsModel[524].addShapeBox(13F, 6F, 9F, 3, 2, 1, 0F,2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1.7F, 0F, 0F, 2.7F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1.65F, 0F, 0F, 2.5F); // Box 20
		hipsModel[524].setRotationPoint(20F, -50F, 0F);

		hipsModel[525].addShapeBox(13F, 11F, 9F, 8, 3, 1, 0F,2F, 0F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 1F); // Box 21
		hipsModel[525].setRotationPoint(20F, -50F, 0F);

		hipsModel[526].addShapeBox(22F, 11F, 7F, 2, 3, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3F, 2.5F, 0F, 1.5F, .5F, 0F, -.5F, 0F, 0F, -1F, 1.5F, 0F); // Box 22
		hipsModel[526].setRotationPoint(20F, -50F, 0F);

		hipsModel[527].addShapeBox(23F, 11F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 4F, 0F, -.2F, 2F, 0F, -.5F, .5F, 0F, -1.2F, 2.5F, 0F); // Box 23
		hipsModel[527].setRotationPoint(20F, -50F, 0F);

		hipsModel[528].addShapeBox(15F, 14F, 9F, 8, 2, 1, 0F,2F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, -1F, -.5F, -2F, 0F, -.5F, 0F, -2F, -1F, 0F, -2F, -1F, 1F); // Box 24
		hipsModel[528].setRotationPoint(20F, -50F, 0F);

		hipsModel[529].addShapeBox(7F, -10F, 0F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[529].setRotationPoint(20F, -50F, 0F);

		hipsModel[530].addShapeBox(7F, -17F, 0F, 3, 8, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[530].setRotationPoint(20F, -50F, 0F);

		hipsModel[531].addShapeBox(7F, -17F, 2F, 3, 8, 3, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		hipsModel[531].setRotationPoint(20F, -50F, 0F);

		hipsModel[532].addShapeBox(7F, -16F, 5F, 3, 7, 3, 0F,-.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		hipsModel[532].setRotationPoint(20F, -50F, 0F);

		hipsModel[533].addShapeBox(7F, -15F, 8F, 3, 6, 2, 0F,-.5F, .7F, 0F, -.5F, .7F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 4
		hipsModel[533].setRotationPoint(20F, -50F, 0F);

		hipsModel[534].addShapeBox(7F, -14F, 10F, 3, 5, 2, 0F,-.5F, .6F, 0F, -.5F, .6F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -5F, 0F, 1F, -5F); // Box 5
		hipsModel[534].setRotationPoint(20F, -50F, 0F);

		hipsModel[535].addShapeBox(7.5F, -20F, 10F, 2, 6, 2, 0F,0F, 1.3F, -2.5F, 0F, 1.3F, -2.5F, 0F, -2F, 4F, 0F, -2F, 4F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F); // Box 6
		hipsModel[535].setRotationPoint(20F, -50F, 0F);

		hipsModel[536].addShapeBox(7.5F, -23F, 8F, 2, 8, 2, 0F,0F, .5F, -1F, 0F, .5F, -1F, 0F, -1.7F, 2.5F, 0F, -1.7F, 2.5F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, .4F, 0F, -.5F, .4F, 0F); // Box 7
		hipsModel[536].setRotationPoint(20F, -50F, 0F);

		hipsModel[537].addShapeBox(7.5F, -25F, 5F, 2, 9, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1.5F, 1F, 0F, -1.5F, 1F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, .3F, 0F, -.5F, .3F, 0F); // Box 8
		hipsModel[537].setRotationPoint(20F, -50F, 0F);

		hipsModel[538].addShapeBox(7.5F, -26F, 2F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F, 0F, -1F, .5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F); // Box 9
		hipsModel[538].setRotationPoint(20F, -50F, 0F);

		hipsModel[539].addShapeBox(7.5F, -26F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 10
		hipsModel[539].setRotationPoint(20F, -50F, 0F);

		hipsModel[540].addShapeBox(7F, -13F, 12F, 3, 5, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -2.2F, 0F, -.5F, -2.2F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 11
		hipsModel[540].setRotationPoint(20F, -50F, 0F);

		hipsModel[541].addShapeBox(7.5F, -19F, 12F, 2, 6, 2, 0F,0F, -1F, -4F, 0F, -1F, -4F, 0F, -6F, 5F, 0F, -6F, 5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2.2F, 0F, -.5F, 2.2F, 0F); // Box 12
		hipsModel[541].setRotationPoint(20F, -50F, 0F);

		hipsModel[542].addShapeBox(19F, 13F, 7F, 4, 3, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, .5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[542].setRotationPoint(20F, -50F, 0F);

		hipsModel[543].addShapeBox(19F, 13F, 9F, 4, 3, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, 2F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 3
		hipsModel[543].setRotationPoint(20F, -50F, 0F);

		hipsModel[544].addShapeBox(19F, 15F, 9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, 0F); // Box 5
		hipsModel[544].setRotationPoint(20F, -50F, 0F);

		hipsModel[545].addShapeBox(19F, 15F, 7F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, .5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[545].setRotationPoint(20F, -50F, 0F);

		hipsModel[546].addShapeBox(19.6F, 17F, 7F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, .5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[546].setRotationPoint(20F, -50F, 0F);

		hipsModel[547].addShapeBox(19.6F, 17F, 9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, 0F); // Box 12
		hipsModel[547].setRotationPoint(20F, -50F, 0F);

		hipsModel[548].addShapeBox(20.2F, 19F, 7F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, .5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[548].setRotationPoint(20F, -50F, 0F);

		hipsModel[549].addShapeBox(20.2F, 19F, 9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, 0F); // Box 14
		hipsModel[549].setRotationPoint(20F, -50F, 0F);

		hipsModel[550].addShapeBox(23F, 11F, -7F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 2.5F, 0F, -0.5F, 0.5F, 0F, -0.2F, 2F, 0F, -1.2F, 4F, 0F); // Box 15
		hipsModel[550].setRotationPoint(20F, -50F, 0F);

		hipsModel[551].addShapeBox(22F, 11F, -9F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -0.5F, 0F, 0F, 1.5F, 0.5F, 0F, -2.3F, 2.5F, 0F); // Box 16
		hipsModel[551].setRotationPoint(20F, -50F, 0F);

		hipsModel[552].addShapeBox(19F, 3F, -7F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[552].setRotationPoint(20F, -50F, 0F);

		hipsModel[553].addShapeBox(17F, 3F, -9F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[553].setRotationPoint(20F, -50F, 0F);

		hipsModel[554].addShapeBox(19F, -3F, -7F, 5, 6, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[554].setRotationPoint(20F, -50F, 0F);

		hipsModel[555].addShapeBox(17F, -3F, -9F, 5, 6, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[555].setRotationPoint(20F, -50F, 0F);

		hipsModel[556].addShapeBox(13F, -8F, -7F, 10, 5, 7, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[556].setRotationPoint(20F, -50F, 0F);

		hipsModel[557].addShapeBox(16F, -6F, -9F, 5, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[557].setRotationPoint(20F, -50F, 0F);

		hipsModel[558].addShapeBox(13F, -10F, -7F, 8, 2, 7, 0F,0F, -1F, 0F, -3F, -2F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 23
		hipsModel[558].setRotationPoint(20F, -50F, 0F);

		hipsModel[559].addShapeBox(13F, -8F, -9F, 7, 2, 2, 0F,0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 2F, -1F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -3F, 0F); // Box 24
		hipsModel[559].setRotationPoint(20F, -50F, 0F);

		hipsModel[560].addShapeBox(13F, -8F, -10F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, -0.5F); // Box 25
		hipsModel[560].setRotationPoint(20F, -50F, 0F);

		hipsModel[561].addShapeBox(13F, -3F, -10F, 7, 6, 1, 0F,0F, 0F, 2F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 3F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -3F); // Box 26
		hipsModel[561].setRotationPoint(20F, -50F, 0F);

		hipsModel[562].addShapeBox(13F, -6F, -10F, 6, 3, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, -0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F); // Box 27
		hipsModel[562].setRotationPoint(20F, -50F, 0F);

		hipsModel[563].addShapeBox(13F, 3F, -10F, 8, 3, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 2.7F, 0.5F, 0F, 0F, 2.4F, 0F, 0F, 2F, 0F, -3F); // Box 28
		hipsModel[563].setRotationPoint(20F, -50F, 0F);

		hipsModel[564].addShapeBox(20F, 6F, -10F, 1, 2, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0F, 2.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.8F, 0F, 0F, 2.7F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[564].setRotationPoint(20F, -50F, 0F);

		hipsModel[565].addShapeBox(13F, 6F, -10F, 3, 2, 1, 0F,0F, 0F, 2.7F, 0F, 0F, 1.7F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 1.65F, 0F, 0F, 0F, 2F, 0F, -3F); // Box 30
		hipsModel[565].setRotationPoint(20F, -50F, 0F);

		hipsModel[566].addShapeBox(13F, 8F, -10F, 8, 3, 1, 0F,0F, 0F, 2.5F, 0.8F, 0F, 0F, 2.7F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F); // Box 31
		hipsModel[566].setRotationPoint(20F, -50F, 0F);

		hipsModel[567].addShapeBox(13F, 11F, -10F, 8, 3, 1, 0F,0F, 0F, 2F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 1F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[567].setRotationPoint(20F, -50F, 0F);

		hipsModel[568].addShapeBox(15F, 14F, -10F, 8, 2, 1, 0F,0F, 0F, 1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 1F, -2F, -1F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -2F); // Box 33
		hipsModel[568].setRotationPoint(20F, -50F, 0F);

		hipsModel[569].addShapeBox(7F, -10F, -7F, 6, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[569].setRotationPoint(20F, -50F, 0F);

		hipsModel[570].addShapeBox(7F, -17F, -2F, 3, 8, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[570].setRotationPoint(20F, -50F, 0F);

		hipsModel[571].addShapeBox(7F, -17F, -5F, 3, 8, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[571].setRotationPoint(20F, -50F, 0F);

		hipsModel[572].addShapeBox(7F, -16F, -8F, 3, 7, 3, 0F,-0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 37
		hipsModel[572].setRotationPoint(20F, -50F, 0F);

		hipsModel[573].addShapeBox(7F, -15F, -10F, 3, 6, 2, 0F,-0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 38
		hipsModel[573].setRotationPoint(20F, -50F, 0F);

		hipsModel[574].addShapeBox(7F, -14F, -12F, 3, 5, 2, 0F,-0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 39
		hipsModel[574].setRotationPoint(20F, -50F, 0F);

		hipsModel[575].addShapeBox(7F, -13F, -14F, 3, 5, 2, 0F,-0.5F, -2.2F, 0F, -0.5F, -2.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 40
		hipsModel[575].setRotationPoint(20F, -50F, 0F);

		hipsModel[576].addShapeBox(7.5F, -19F, -14F, 2, 6, 2, 0F,0F, -6F, 5F, 0F, -6F, 5F, 0F, -1F, -4F, 0F, -1F, -4F, -0.5F, 2.2F, 0F, -0.5F, 2.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 41
		hipsModel[576].setRotationPoint(20F, -50F, 0F);

		hipsModel[577].addShapeBox(7.5F, -20F, -12F, 2, 6, 2, 0F,0F, -2F, 4F, 0F, -2F, 4F, 0F, 1.3F, -2.5F, 0F, 1.3F, -2.5F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F); // Box 42
		hipsModel[577].setRotationPoint(20F, -50F, 0F);

		hipsModel[578].addShapeBox(7.5F, -23F, -10F, 2, 8, 2, 0F,0F, -1.7F, 2.5F, 0F, -1.7F, 2.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F); // Box 43
		hipsModel[578].setRotationPoint(20F, -50F, 0F);

		hipsModel[579].addShapeBox(7.5F, -25F, -8F, 2, 9, 3, 0F,0F, -1.5F, 1F, 0F, -1.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 44
		hipsModel[579].setRotationPoint(20F, -50F, 0F);

		hipsModel[580].addShapeBox(7.5F, -26F, -5F, 2, 9, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 45
		hipsModel[580].setRotationPoint(20F, -50F, 0F);

		hipsModel[581].addShapeBox(7.5F, -26F, -2F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 46
		hipsModel[581].setRotationPoint(20F, -50F, 0F);

		hipsModel[582].addShapeBox(19F, 13F, -9F, 4, 3, 2, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0F); // Box 47
		hipsModel[582].setRotationPoint(20F, -50F, 0F);

		hipsModel[583].addShapeBox(19F, 13F, -11F, 4, 3, 2, 0F,2F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[583].setRotationPoint(20F, -50F, 0F);

		hipsModel[584].addShapeBox(19F, 15F, -9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0F); // Box 49
		hipsModel[584].setRotationPoint(20F, -50F, 0F);

		hipsModel[585].addShapeBox(19F, 15F, -11F, 4, 3, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[585].setRotationPoint(20F, -50F, 0F);

		hipsModel[586].addShapeBox(19.6F, 17F, -9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0F); // Box 51
		hipsModel[586].setRotationPoint(20F, -50F, 0F);

		hipsModel[587].addShapeBox(19.6F, 17F, -11F, 4, 3, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[587].setRotationPoint(20F, -50F, 0F);

		hipsModel[588].addShapeBox(20.2F, 19F, -9F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 0F, 0F, 0F); // Box 53
		hipsModel[588].setRotationPoint(20F, -50F, 0F);

		hipsModel[589].addShapeBox(20.2F, 19F, -11F, 4, 3, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 54
		hipsModel[589].setRotationPoint(20F, -50F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 170, 60, textureX, textureY); // Box 97

		bodyModel[0].addShapeBox(-23F, -5F, -10F, 46, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[0].setRotationPoint(-11F, -43F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 37, 43, textureX, textureY); // Box 224

		rightArmModel[0].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		rightArmModel[0].setRotationPoint(4F, -87F, 6F);
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